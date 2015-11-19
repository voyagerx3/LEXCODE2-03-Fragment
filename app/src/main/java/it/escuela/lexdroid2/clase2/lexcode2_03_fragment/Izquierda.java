package it.escuela.lexdroid2.clase2.lexcode2_03_fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by marcos on 15/11/2015.
 */
public class Izquierda extends Fragment {
    View rootView;
    Button buscar;
    EditText nombre;
    Enviar ENVIAR;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        rootView = inflater.inflate(R.layout.izquierda, container, false);

        nombre = (EditText) rootView.findViewById(R.id.nombre);
        buscar = (Button) rootView.findViewById(R.id.buscar);

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje;
                mensaje = nombre.getText().toString();
                //utilizamos la interfaz
                ENVIAR.enviarTexto(mensaje);
            }
        });


        return rootView;
    }
        // ciclo vida fragment .
    public void onAttach(Activity activity){
        super.onAttach(activity);

        try{
            ENVIAR = (Enviar) activity;
        }
        catch (ClassCastException e ){
            throw new ClassCastException("necesitas el msg");
        }


    }



}
