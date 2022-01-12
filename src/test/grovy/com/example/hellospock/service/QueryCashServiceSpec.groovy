package com.example.hellospock.service

import com.example.hellospock.dao.QueryCashDao
import com.example.hellospock.entity.User
import spock.lang.Specification
import spock.lang.Unroll

class QueryCashServiceSpec extends Specification {

    def dao = Mock(QueryCashDao)
    def obj = new QueryCashService(queryCashDao:dao)

    def "queryCash"() {

        def v = {index ->
            def obj
            if (0 == index) {
                obj = {
                    new User(name: "LiNing", phone: "156231745")
                }
            }

            if (1 == index) {
                obj = {
                    throw new NullPointerException()
                }
            }
            return obj
        }

        given:
        dao.selectById(_) >> v.call(arg)

        when:
        def result = obj.queryCashDao(1)

        then:
        thrown(Exception)

        where:
        arg | name
        1 | "LiNing"
    }

    def createClosure(int i) {
        def obj
        if (0 == i) {
            obj = {
               new User(name: "LiNing", phone: "156231745")
            }
        }

        if (1 == i) {
            obj = {
                throw new NullPointerException()
            }
        }
        return obj
    }



    @Unroll
    def "hello spock"() {
        expect:
        name.size() == length

        where:
        name    | length
        "spock" | 5
        "kirk"  | 4
    }

}
