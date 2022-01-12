package com.example.hellospock.service

import spock.lang.Specification
import spock.lang.Unroll

class SpckSpec extends Specification {

    @Unroll
    def "HashMap accepts null key"() {
        given:
        def map = new HashMap()

        when:
        map.put(null, "elem")

        then:
        notThrown(NullPointerException)
    }

    @Unroll
    def "testExpectBlock"() {
        when:
        def x = Math.max(1,2)

        then:
        x == 2
    }

    @Unroll
    def "testExpectBlock2"() {
    expect:
        Math.max(1,2) == 2
    }

    @Unroll
    def "computing the maximun of two numbers"() {
        expect:
        Math.max(a,b) == c

        where:
        a << [5,3]
        b << [1,9]
        c << [5,9]
    }

}
