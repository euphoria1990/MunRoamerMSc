package com.assignment.munroamer;

import junit.framework.TestCase;

public class NewBagEntryTest extends TestCase {
    BagDatabaseHelper myBagDb= null;

    public void testAddData() {
        myBagDb.addData("12/12/20", "Ben Nevis", "fun times!");
        assertTrue(true);
    }
}