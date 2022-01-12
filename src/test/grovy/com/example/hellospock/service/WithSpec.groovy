package com.example.hellospock.service

import spock.lang.Specification


class WithSpec extends Specification {

    def c = {throw new NullPointerException()}

    def c2 = {text -> print text}

    def "test"() {
        when:
        c2.call("hello")

        then:
        notThrown(NullPointerException)
    }


}
