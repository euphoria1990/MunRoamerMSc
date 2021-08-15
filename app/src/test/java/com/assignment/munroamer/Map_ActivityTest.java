package com.assignment.munroamer;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.GoogleMap;

import junit.framework.TestCase;

public class Map_ActivityTest extends TestCase {

    /**
     * A class that represents some unit tests for Map_Activity class
     *
     * @author Kirsty Carmichael
     * @version 0.1 (13.08.21)
     */
    private GoogleMap mMap = null;
    private GoogleApiClient client = null;



    public void testBuildGoogleApiClient() {
        client.isConnected();
        assertEquals(true, true);
    }

}