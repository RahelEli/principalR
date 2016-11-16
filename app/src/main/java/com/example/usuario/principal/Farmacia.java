package com.example.usuario.principal;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        return view;
    }
}
