package com.example.usuario.principal;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

public class ListHospitales extends Fragment {

    public ListHospitales (){}

    public static ListHospitales getInstace(){
        ListHospitales fragment3 = new ListHospitales();
        return fragment3;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_hospitales_fragment,container,false);
        // A. Creamos el arreglo de Strings para llenar la lista
        String[] cosasPorHacer = new String[] { "Hospital Bautista",
                "Bertha Calderon","Vivian Pellas","Alemán Nicaraguense", "Antonio Lenin Fonseca",
                "Carlos R. Huembes", "Manolo Morales", "Militar", "Monte España", "Salud Integral"};


        // B. Creamos un nuevo ArrayAdapter con nuestra lista de cosasPorHacer
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, cosasPorHacer);

        // C. Seleccionamos la lista de nuestro layout
        ListView lisHosp = (ListView) view.findViewById(R.id.lisHosp);

        // D. Asignamos el adaptador a nuestra lista
        lisHosp.setAdapter(arrayAdapter);

        lisHosp.setAdapter(arrayAdapter);

        lisHosp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Bo. Largaespada; contiguo al RUCFA. Tel:2279-7070" + 0,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Centro Comercial Zumen 1C Al Oeste. Tel:22601787 " + 1,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Km 9 3/4 Carretera a Masaya 250 mts. al Oeste. Tel:2276-2142" + 2,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Carretera Norte; de la Siemens 1 1/2 c. al Sur. Tel:2249-3368" + 3,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "En construccion. Tel 2268-5284 o 2264-0412" + 4,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Frente al Parque de las Piedrecitas. Tel:2265-1722 o 2265-2144" + 5,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "\tCostado Oeste Mercado Roberto Huembes. Tel:2277-0990" + 6,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "En Mantenimiento. Tel:2222-2763" + 7,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "En Mantenimiento. Tel:2278-3920" + 8,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "En Mantenimiento. Tel:2266-1707" + 9,
                        Toast.LENGTH_LONG).show();

            }
        });


        return view;
    }
}
