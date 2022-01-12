package com.example.hellospock.service

import spock.lang.Specification

class EmptyStackSpecA extends Specification{
    def stack = new Stack()

    def setup() {

        assert stack.empty()
    }

    def "test"() {

        when:
        // 执行方法
        stack.pop()

        then:
        // then模块下只能是条件表达式
        //thrown(EmptyStackException) //抛出异常类型
       // stack.empty //是否为空

        def e = thrown(EmptyStackException)
        e.cause == null
    }



}
