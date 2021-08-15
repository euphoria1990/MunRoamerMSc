package com.assignment.munroamer;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.GoogleMap;

import junit.framework.TestCase;

public class Map_ActivityTest extends TestCase {
    private GoogleMap mMap = null;
    private GoogleApiClient client = null;



    public void testBuildGoogleApiClient() {
        client.isConnected();
        assertEquals(true, true);
    }

}