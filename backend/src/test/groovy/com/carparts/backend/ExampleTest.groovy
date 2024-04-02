package com.carparts.backend

import spock.lang.Specification


class ExampleTest extends Specification {

    void setup() {
        println("running setup")
        return}

    void exampleSpec() {

        given:
        String something = "something"

        when:
        String test2 = "some string"

        then:
        something != test2

        return}

    void cleanup() {
        println("performing cleanup")
        return}
}
