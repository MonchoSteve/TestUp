package com.devsteve.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.devsteve.test.Animodo.AnimodoActivity;

public class RegistroActivity extends AppCompatActivity {

    private Spinner spin_sexo;
    private Spinner spin_edad;
    private Button btn_enviar;
    private EditText nombre,apellido, celular, email, empresa, cargo;
    private String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //----------------EDIT TEXT----------------------
        nombre = findViewById(R.id.Edt_Nombre);
        apellido = findViewById(R.id.Edt_Apellido);
        celular = findViewById(R.id.Edt_Celular);
        email = findViewById(R.id.Edt_Email);
        empresa = findViewById(R.id.Edt_Empresa);
        cargo = findViewById(R.id.Edt_Cargo);
        //----------------------------------------------

        //-----------------BOTON---------------------------
        btn_enviar = findViewById(R.id.Btn_Enviar);
        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistroActivity.this, AnimodoActivity.class);
                startActivity(intent);
            }
        });

    }

}