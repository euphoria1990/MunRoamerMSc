package com.assignment.munroamer;

import junit.framework.TestCase;

public class BagDatabaseHelperTest extends TestCase {

    private BagDatabaseHelper db = null;

    public void testAddData() {
        db.addData("12/12/2020", "Ben Nevis", "fun times");
        assertEquals("12/12/20, Ben Nevis, fun times", "12/12/20, Ben Nevis, fun times");
    }

    public void testGetListContents() {
        db.getListContents();
        assertEquals("12/12/20", "12/12/20");
    }
}