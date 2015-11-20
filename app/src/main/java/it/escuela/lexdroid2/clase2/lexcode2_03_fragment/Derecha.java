package it.escuela.lexdroid2.clase2.lexcode2_03_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by marcos on 15/11/2015.
 **/
public class Derecha extends Fragment{

    View rootView;
    TextView txt_firstname,txt_lastname,txt_phone;
    

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        rootView = inflater.inflate(R.layout.derecha,container,false);

        txt_firstname = (TextView) rootView.findViewById(R.id.txt_firstname);
        txt_lastname = (TextView) rootView.findViewById(R.id.txt_lastname);
        txt_phone = (TextView) rootView.findViewById(R.id.txt_phone);
        return rootView;
    }
//Obtener enviarTexto
   public void enviarTexto(String mensaje){
        Log.d("obtener", mensaje);
        txt_firstname.setText(mensaje);
    }
    public void interAccion(String accion, String firstname, String lastname, String phone){
        Log.d("obtener", lastname);
        txt_firstname.setText(firstname);
        txt_lastname.setText(lastname);
        txt_phone.setText(phone);
    }

}
