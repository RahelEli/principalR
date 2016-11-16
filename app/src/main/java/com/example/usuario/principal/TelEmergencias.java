package com.example.usuario.principal;


/**
 * Created by USUARIO on 14/11/2016.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TelEmergencias extends Fragment {



    public static TelEmergencias getInstance (){
        TelEmergencias fragment4 = new TelEmergencias();
        return  fragment4;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tel_emergency_fragment,container,false);
        return view;
    }
}
