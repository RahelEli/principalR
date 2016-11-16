package com.example.usuario.principal;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        return view;
    }
}
