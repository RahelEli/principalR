package com.example.usuario.principal;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;



/**
 * Created by USUARIO on 15/11/2016.
 */
public class Farmacia extends Fragment {
    public Farmacia (){}

    public static Farmacia getInstace(){
        Farmacia fragment = new Farmacia();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_farmacias, container,false);

        //Button buscar = (Button) findViewById(R.id.buscar);
        //Button infoFarma = (Button) findViewById(R.id.infoFarma);



        // A. Creamos el arreglo de Strings para llenar la lista
        String[] cosasLocas = new String[] { "Estralla Roja",
                "Farma Value","Guadalupana","SCARBRU",
                "Altagracia"};

        // B. Creamos un nuevo ArrayAdapter con nuestra lista de cosasPorHacer
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, cosasLocas);

        // C. Seleccionamos la lista de nuestro layout
        ListView lisFarma = (ListView) view.findViewById(R.id.lisFarma);

        // D. Asignamos el adaptador a nuestra lista
        lisFarma.setAdapter(arrayAdapter);

        lisFarma.setAdapter(arrayAdapter);

        lisFarma.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Veracruz Plaza El Progreso - Módulo No.1" + 0,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Rotonda El Güegüense 30mts al Oeste" + 1,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Linda Vista Fte a Gasol Puma" + 2,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "De donde fué El Cine Rap 2c al Este 75vrs al Sur " + 3,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Bo Altagracia Semáf Racachaca 1/2c S" + 4,
                        Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
