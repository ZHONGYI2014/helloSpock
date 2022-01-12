package com.example.hellospock.service

import spock.lang.Specification

class EmptyStackSpec extends Specification{

    def stack = new Stack()
    def elem = "push me"

    def "test"() {

        when:
        // 执行方法
        stack.push(elem)

        then:
        // 验证结果
        !stack.empty()
        stack.size() == 1
        stack.peek() == elem
    }



}
