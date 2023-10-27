package com.cars.backend;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class BackendApplicationTests {

    private static ChromeDriver browser;

    @BeforeAll
    public static void startBrowser() {

        System.out.println("starting browser");
        browser = new ChromeDriver();

        return;}

    @AfterAll
    public static void quitBrowser() {

        System.out.println("closing browser");
        browser.quit();

        return;}

    @Test
    public void contextLoads() {

        assertEquals(1, 1);

        browser.get("https://google.com");

        // try {
        //     Thread.sleep(1000 * 2);}

        // catch (InterruptedException error) {
        //     System.err.println(error);}

        return;}
}
