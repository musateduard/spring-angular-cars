package com.carparts.backend;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class BackendApplicationTests {

    @BeforeAll
    public static void startBrowser() {

        System.out.println("starting browser");

        return;}

    @Test
    public void contextLoads() {

        assertEquals(1, 1);

        try {
            TimeUnit.SECONDS.sleep(2);}

        catch (InterruptedException error) {
            System.err.println(error.toString());}

        return;}

    @Test
    public void test1() {

        try {
            TimeUnit.SECONDS.sleep(2);}

        catch (InterruptedException error) {
            System.err.println(error.toString());}

        assertEquals(1, 1);

        return;}

    @AfterAll
    public static void quitBrowser() {

        System.out.println("closing browser");

        return;}
}
