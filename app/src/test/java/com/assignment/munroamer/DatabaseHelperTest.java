package com.assignment.munroamer;

import junit.framework.TestCase;

public class DatabaseHelperTest extends TestCase {

    private DatabaseHelper db = null;

    public void testDataBaseCreate() {

        db.getDatabaseName();
        assertEquals(db.getDatabaseName(), "myBag");
    }

    public void testEmailChk() {
        db.emailChk("kc@email.com");
        assertEquals("kc@email.com", "kc@email.com");
    }

    public void testEmlPassCheck() {
        db.emlPassCheck("kc@email.com", "1234");
       assertEquals("kc@email.com", "kc@email.com");
       assertEquals("1234", "1234");
    }
}