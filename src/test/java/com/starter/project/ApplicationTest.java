package com.starter.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {


    @Test
    public void testApplication() {
        assertEquals("5", "5");
    }

}