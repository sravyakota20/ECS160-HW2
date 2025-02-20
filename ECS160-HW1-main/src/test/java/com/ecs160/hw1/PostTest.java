package com.ecs160.hw1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PostTest {
    private Post post;

    @BeforeEach
    void setUp() {
        Record record = new Record("Test content");
        post = new Post(5, record);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testPostCreation() {
        assertEquals(5, post.getNumberOfWords());
        assertEquals("Test content", post.getRecord().getText());
    }
}
