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
    TextView txt_firstname;
    

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        rootView = inflater.inflate(R.layout.derecha,container,false);

        txt_firstname = (TextView) rootView.findViewById(R.id.txt_firstname);

        return rootView;
    }

    public void Obtener(String mensaje){
        txt_firstname.setText(mensaje);
    }

}
