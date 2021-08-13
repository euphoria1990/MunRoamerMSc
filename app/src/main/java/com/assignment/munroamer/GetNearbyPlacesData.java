package com.assignment.munroamer;

import android.os.AsyncTask;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
/**
 * A class that represents the "Get Nearby places" fucntionality for MunRoamer
 *
 * This class uses the Download URL class and Data Parser class to display nearby places for the user
 *
 * @author Kirsty Carmichael
 * @version 0.1 (13.08.21)
 */
public class GetNearbyPlacesData extends AsyncTask<Object, String, String> {



    String googlePlacesData;
    GoogleMap mMap;
    String url;

    /**
     * A method to download and read the Url using the GoogleMap objects and the Url objects
     * @param objects the Object objects
     * @return googlePlacesData
     */
    @Override
    protected String doInBackground(Object... objects) {

        mMap = (GoogleMap) objects[0];
        url = (String)objects[1];

        DownloadUrl downloadUrl = new DownloadUrl();
        try {
            googlePlacesData = downloadUrl.readUrl(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return googlePlacesData;
    }

    /**
     * A method to parse the nearby places data once executed
     * @param s the String
     */
    @Override
    protected void onPostExecute(String s) {
        List<HashMap<String, String>> nearbyPlaceList = null;
        DataParser parser = new DataParser();
        nearbyPlaceList = parser.parse(s);
        showNearbyPlaces(nearbyPlaceList);
    }

    /**
     * A method to show all the places from the list
     * @param nearbyPlaceList the list of nearby places
     */
    private void showNearbyPlaces(List<HashMap<String, String>> nearbyPlaceList)
    {
        for (int i=0;i<nearbyPlaceList.size();i++)
        {
            MarkerOptions markerOptions = new MarkerOptions();
            HashMap<String, String> googlePlace = nearbyPlaceList.get(i);

            //fetch place name and vicinity
            String placeName = googlePlace.get("place_name");
            String vicinity = googlePlace.get("vicinity");
            double lat = Double.parseDouble(googlePlace.get("lat"));
            double lng = Double.parseDouble(googlePlace.get("lng"));

            LatLng latLng = new LatLng(lat, lng);

            //Set position and title for marker options
            markerOptions.position(latLng);
            markerOptions.title(placeName + " : " + vicinity);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));

            mMap.addMarker(markerOptions);
            //move the camera to that location
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(8));
        }
    }
}
