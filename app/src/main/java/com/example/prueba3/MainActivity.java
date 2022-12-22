package com.example.prueba3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText eUser, ePass;
    private Button btnLogin, btnRegister, btnOlvide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void grabarUsuario(){
        String user, password, pregunta, respuesta;
        user = eUser.getText().toString();
        password = ePass.getText().toString();

    }

//REFERENCIAS

    private void referencias(){
        eUser = findViewById(R.id.eUser);
        ePass = findViewById(R.id.ePass);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
        btnOlvide = findViewById(R.id.btnOlvide);
    }
    public void pantallaregistrar(View v) {
        Intent pantallaregistrar = new Intent(this, MainActivity2.class);
        startActivity(pantallaregistrar);
    }


    //private void events(){
    //    btnRegister.setOnClickListener(new View.OnClickListener(){
    //        @Override
    //        }
    //                                }
    //    );
    }
//}