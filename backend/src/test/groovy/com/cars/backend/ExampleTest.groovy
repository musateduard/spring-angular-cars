package com.cars.backend

import spock.lang.Specification


class ExampleTest extends Specification {

    void exampleSpec() {

        given:
        int someNumber = 3
        String myString = "this is a string"
        int anotherNumber = 1

        when:
        someNumber == 3

        then:
        someNumber != anotherNumber

        return
    }
}
