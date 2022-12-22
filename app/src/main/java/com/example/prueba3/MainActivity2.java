package com.example.prueba3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private EditText eUserRegister, ePassRegister,eRespuestaRegister;
    private Spinner spnPreguntaSecreta;
    private Button btnRegistrar;
    private ArrayList <registrarUsuario> Registro; //cliente - los clientes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        eventos();
    }


    public void pantallalogin(View v) {
        Intent pantallalogin = new Intent(this, MainActivity.class);
        startActivity(pantallalogin);
    }




    private void grabarUsuario(){
        String user, password,pregunta,respuesta;
        user = eUserRegister.getText().toString();
        password = ePassRegister.getText().toString();
        pregunta = spnPreguntaSecreta.getSelectedItem().toString();
        respuesta = eRespuestaRegister.getText().toString();

        registrarUsuario register = new registrarUsuario(user, password,pregunta,respuesta);
        Registro.add(register);

        registrarEnBD(register);
    }

    public void registrarEnBD(registrarUsuario register){
        AdministradorBD adbd = new AdministradorBD(this, "BDAplicacion", null,1);

        try (SQLiteDatabase miBD = adbd.getWritableDatabase()) {



            miBD.close();
        }catch (Exception ex){
            Log.e("TAG_", ex.toString());
        }
    }


    //Referencias

    private void referencias (){
        eUserRegister = findViewById(R.id.eUserRegister);
        ePassRegister = findViewById(R.id.ePassRegister);
        spnPreguntaSecreta = findViewById(R.id.spnPreguntaSecreta);
        eRespuestaRegister = findViewById(R.id.eRespuestaRegister);
        btnRegistrar = findViewById(R.id.btnRegistrar);
    }

    private void eventos(){
        btnRegistrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                grabarUsuario();
            }
        });
    }
}