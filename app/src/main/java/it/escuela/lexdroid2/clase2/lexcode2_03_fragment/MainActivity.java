package it.escuela.lexdroid2.clase2.lexcode2_03_fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements InterAccion {
    AdminSQLiteOpenHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb= new AdminSQLiteOpenHelper(this,"dbcontacts.db",null,1);
    }

    @Override
    public void enviarAccion(String accion, String firstname, String lastname, String phone)
    {
        Derecha derecha = (Derecha) getFragmentManager().findFragmentById(R.id.derecha);
        //Obtner enviarTexto
        derecha.interAccion(accion,firstname,lastname,phone);
    };
}
