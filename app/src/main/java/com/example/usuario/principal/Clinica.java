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
public class Clinica extends Fragment{
    public Clinica (){}

    public static Clinica getInstace(){
        Clinica fragment1 = new Clinica();
        return fragment1;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_clinicas,container,false);

        String[] cosasPorHacer = new String[] { "Odontologica Mongalo",
                "Olimpo A.central","Inmaculada Concepcion","Oftamologico Altamira", "Clinica Valle",
                "Clinica Imagen", "ProFamilia", "ProActive Dental", "New Life smile", "Optilaser"};


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
                Toast.makeText(getActivity(), "Col Los Robles Hotel Colón 2 1/2c al S #23 . Tel:22707970" + 0,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Puente El Edén 1c Abajo , 1 1/2 al Sur.Frente al Parque María . Tel:22498339 " + 1,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "C.C. Linda Vista Módulo E-8 . Tel:22686070" + 2,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "C Ppal de Altamira #453 Fte a Ferret Roberto Morales . Tel:22782736" + 3,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Avenida Principal de Altamira. Esquina Opuesta al Banpro . Tel:22789208" + 4,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Pista Jean Paul Genie Banco Procredit 1c Arriba 20vrs al Sur B-2 . Tel:22770030" + 5,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Plaza El Sol Gasolinera UNO 1c al S 1/2c Abajo . Tel:22701531 Ext. 107" + 6,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Repto San Juan Igl Santa Martha 75vrs al E . Tel:22706580" + 7,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Semáfaros 7 Sur 1c al Sur 30vrs al Oeste . Tel:22714238" + 8,
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getActivity(), "Rot El Periodista 150m al S Ofiplaza El Retiro Suite No.7 . Tel:22785392" + 9,
                        Toast.LENGTH_LONG).show();

            }
        });


        return view;
    }
}
