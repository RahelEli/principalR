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
        return view;
    }
}
