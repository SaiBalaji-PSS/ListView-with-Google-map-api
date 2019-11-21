package com.example.listview;

import androidx.fragment.app.FragmentActivity;

import android.location.Location;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

       mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);


        // Add a marker in Sydney and move the camera
        LatLng uk = new LatLng( 51.5033, -0.1002);
        mMap.addMarker(new MarkerOptions().position(uk).title("Ubuntu was developed here"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(uk));
        LatLng india = new LatLng(20, 78);
        mMap.addMarker(new MarkerOptions().position(india).title("Boss Linux was developed here"));
        LatLng us = new LatLng(47, -122);
        mMap.addMarker(new MarkerOptions().position(us).title("Windows 7,8.1,10 was developed here"));

        LatLng usa = new LatLng(37.331845, -122.029690);
        mMap.addMarker(new MarkerOptions().position(usa).title("Mac OS Catalina was developed here"));

    }
}
