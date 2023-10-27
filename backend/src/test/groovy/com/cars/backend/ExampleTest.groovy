package com.cars.backend

import spock.lang.Specification
import org.openqa.selenium.chrome.ChromeDriver;


class ExampleTest extends Specification {

    ChromeDriver browser

    void setup() {
        browser = new ChromeDriver()
        return}

    void exampleSpec() {

        given:
        String something = "something"

        when:
        browser.get("https://browserleaks.com/ip")
        String title = browser.getTitle()

        then:
        something != title

        return}

    void cleanup() {
        browser.quit()
        return}
}
