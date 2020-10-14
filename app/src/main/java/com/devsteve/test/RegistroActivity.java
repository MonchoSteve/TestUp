package com.devsteve.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.devsteve.test.Animodo.AnimodoActivity;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

public class RegistroActivity extends AppCompatActivity {

    private Spinner spin_sexo;
    private Spinner spin_edad;
    private Button btn_enviar;
    private EditText nombre,apellido, celular, email, empresa, cargo;
    private TextInputLayout inpnombre, inpapellido, inpcelular, inpemail, inpempresa, inpcargo;
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
        //----------------TextInputLayout-------------------
        inpnombre = findViewById(R.id.InpNombre);
        inpapellido = findViewById(R.id.InpApellido);
        inpcelular = findViewById(R.id.InpCelular);
        inpemail = findViewById(R.id.InpEmail);
        inpempresa = findViewById(R.id.InpEmpresa);
        inpcargo = findViewById(R.id.InpCargo);
        //-----------------BOTON---------------------------
        btn_enviar = findViewById(R.id.Btn_Enviar);
        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validacion();

            }
        });

    }

    public void Validacion(){
        String nameVal = nombre.getText().toString().trim();
        String apellidoVal = apellido.getText().toString().trim();
        String celularVal = celular.getText().toString().trim();
        String empresaVal = empresa.getText().toString().trim();
        String cargoVal = cargo.getText().toString().trim();
        boolean em = false, cel = false;

        //Validacion Nombre
        if (nameVal.isEmpty()){
            nombre.setError("El campo no puede estar vacio");
        }else {
            nombre.setError(null);
        }
        //Validacion Apelido
        if (apellidoVal.isEmpty()){
            apellido.setError("El campó no puede estar vacio");
        }else {
            apellido.setError(null);
        }
        //Validacion Celular
        if (celularVal.isEmpty() || celularVal.length() == 10 == false){
            celular.setError("Maximo 10 digitos");
            cel = false;
        }else {
            celular.setError(null);
            cel = true;
        }
        //Validacion Email
        if (Patterns.EMAIL_ADDRESS.matcher(email.getText().toString().trim()).matches() == false){
            email.setError("Correo Invalido");
            em = false;
        }else {
            email.setError(null);
            em = true;
        }
        //Validacion Empresa
        if (empresaVal.isEmpty()){
            empresa.setError("El campó no puede estar vacio");
        }else {
            empresa.setError(null);
        }
        //Validacion Cargo
        if (cargoVal.isEmpty()){
            cargo.setError("El campó no puede estar vacio");
        }else {
            cargo.setError(null);
        }

        if (em == true && cel == true){

            Intent intent = new Intent(RegistroActivity.this,AnimodoActivity.class);
            startActivity(intent);
            finish();
        }

    }


}