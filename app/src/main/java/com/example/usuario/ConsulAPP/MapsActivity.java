package com.example.usuario.ConsulAPP;

//import android.*;
import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.usuario.principal.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    public void onSearch(View view)
    {
        /*Button btn = (Button) view.findViewById(R.id.BtnBuscar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MapsActivity.class);
                startActivityForResult(intent, 0);
            }
        });*/

        EditText location_tf = (EditText) findViewById(R.id.editext);
        String location = location_tf.getText().toString();

        if(location != null || location.equals("")){
            Geocoder geocoder = new Geocoder(this);
            List<android.location.Address> addressList = null;

            try{
                addressList = geocoder.getFromLocationName(location, 1);
            }catch(IOException e)
            {
                e.printStackTrace();
            }

            android.location.Address address = addressList.get(0);
            //LatLng farmanciamedco = new LatLng(12.134588, -86.280788);
            LatLng latLng = new LatLng(address.getLatitude() , address.getLongitude());
            mMap.addMarker(new MarkerOptions().position(latLng).title("Marker"));
            mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));



            // Add a marker in Sydney and move the camera
            LatLng FarmaciaMedco = new LatLng(12.139081, -86.232199);
            mMap.addMarker(new MarkerOptions().position(FarmaciaMedco).title("Marker in Farmacia Medco"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(FarmaciaMedco,20));
            if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED){
                return;
            }
            mMap.setMyLocationEnabled(true);


        }
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

        // Add a marker in Sydney and move the camera
        LatLng Nicaragua = new LatLng(13.172914, -85.248375);
        mMap.addMarker(new MarkerOptions().position(Nicaragua).title("Marker in Nicaragua"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Nicaragua,18));
       if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
           != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
           != PackageManager.PERMISSION_GRANTED){
           return;
       }
        mMap.setMyLocationEnabled(true);

       }

}
