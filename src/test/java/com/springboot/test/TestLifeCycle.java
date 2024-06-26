package com.springboot.test;

import org.junit.jupiter.api.*;

public class TestLifeCycle {

    @BeforeAll //
    static void beforeAll() {
        System.out.println("## Before All Annotation 호출 ##");
        System.out.println();
    }

    @AfterAll
    static void afterAll() {
        System.out.println("## After All Annotation ##");
        System.out.println();
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("## Before Each Annotation ##");
        System.out.println();
    }

    @AfterEach
    void afterEach() {
        System.out.println("## After Each Annotation ##");
        System.out.println();
    }

    @Test
    void test1() {
        System.out.println("## test1 시작 ##");
        System.out.println();
    }

    @Test
    void test2() {
        System.out.println("## test2 시작 ##");
        System.out.println();
    }

    @Test
    @Disabled
    void test3() {
        System.out.println("## test3 시작 ##");
        System.out.println();
    }
}
