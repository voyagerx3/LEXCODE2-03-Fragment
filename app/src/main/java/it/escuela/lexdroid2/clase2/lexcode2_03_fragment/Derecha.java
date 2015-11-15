package it.escuela.lexdroid2.clase2.lexcode2_03_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by marcos on 15/11/2015.
 */
public class Derecha extends Fragment{

   View rootView;
    TextView txt;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        rootView = inflater.inflate(R.layout.izquierda,container,false);

        txt = (TextView) rootView.findViewById(R.id.txt);

        return rootView;
    }

}
