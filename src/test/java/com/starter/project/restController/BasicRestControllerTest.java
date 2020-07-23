package com.starter.project.restController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BasicRestControllerTest {

    @InjectMocks
    private BasicRestController basicRestController;

    @Test
    public void testGetMsg() {
        String mockMsg = "Hello world";
        ReflectionTestUtils.setField(basicRestController,"msg",mockMsg);
        String actualResponse = basicRestController.getMsg();
        assertNotNull(actualResponse);
        assertEquals(mockMsg,actualResponse);
    }

    @Test
    public void testPostMsg() {
        String actualResponse = basicRestController.postMsg("hi");
        assertNotNull(actualResponse);
        assertEquals("Successfully saved",actualResponse);
    }

    @Test
    public void testPutMsg() {
        String actualResponse = basicRestController.putMsg("hi");
        assertNotNull(actualResponse);
        assertEquals("Successfully updated",actualResponse);
    }

    @Test
    public void testDeleteMsg() {
        String mockMsg = "Hello world";
        ReflectionTestUtils.setField(basicRestController,"msg",mockMsg);
        String actualResponse = basicRestController.deleteMsg();
        assertEquals("Delete Successful",actualResponse);
        assertNull(ReflectionTestUtils.getField(basicRestController,"msg"));

    }

}
