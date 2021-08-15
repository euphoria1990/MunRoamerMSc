package com.assignment.munroamer;

import junit.framework.TestCase;

public class NewBagEntryTest extends TestCase {
    /**
     * A class that represents some unit tests for NewBagEntry class
     *
     * @author Kirsty Carmichael
     * @version 0.1 (13.08.21)
     */
    BagDatabaseHelper myBagDb= null;

    public void testAddData() {
        myBagDb.addData("12/12/20", "Ben Nevis", "fun times!");
        assertTrue(true);
    }
}