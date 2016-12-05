package com.example.usuario.ConsulAPP;


/**
 * Created by USUARIO on 14/11/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.usuario.principal.R;


public class TelEmergencias extends Fragment {

/*
    private TextView get_place;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tel_emergency_fragment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
*/


    public static TelEmergencias getInstance (){
        TelEmergencias fragment4 = new TelEmergencias();
        return  fragment4;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tel_emergency_fragment,container,false);

        Button btn = (Button) view.findViewById(R.id.buscar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MapsActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        // A. Creamos el arreglo de Strings para llenar la lista
        String[] cosasPorHacer = new String[] { "Policia",
                "Cruz Roja","Bomberos","DISNORTE-DISSUR", "Ineter - Sismología y Vulcanología",
        "Enacal- Acueductos y Alcantarillados", "Energia Electrica", "Ambulancias"};


        // B. Creamos un nuevo ArrayAdapter con nuestra lista de cosasPorHacer
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, cosasPorHacer);

        // C. Seleccionamos la lista de nuestro layout
        ListView lisTelefonos = (ListView) view.findViewById(R.id.lisTelefonos);

        // D. Asignamos el adaptador a nuestra lista
        lisTelefonos.setAdapter(arrayAdapter);

        lisTelefonos.setAdapter(arrayAdapter);

        lisTelefonos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "118 / 126" + 0,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "128" + 1,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "115 / 120 " + 2,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "2248-6841" + 3,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), " 2249-2761" + 4,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "127" + 5,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "125" + 6,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "2265-2081 , 2244-3180 - (505) 2265-0685" + 7,
                        Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }



}
