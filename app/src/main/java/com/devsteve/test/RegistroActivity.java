package com.devsteve.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
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

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.devsteve.test.Animodo.AnimodoActivity;
import com.google.android.material.textfield.TextInputLayout;

import java.util.HashMap;
import java.util.Map;
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
        //-----------------SPINER--------------------------
        spin_sexo = findViewById(R.id.Spin_Sexo);
        spin_edad = findViewById(R.id.Spin_Edad);
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
        final String nameVal = nombre.getText().toString().trim();
        final String apellidoVal = apellido.getText().toString().trim();
        final String celularVal = celular.getText().toString().trim();
        final String emailVal = email.getText().toString().trim();
        final String empresaVal = empresa.getText().toString().trim();
        final String cargoVal = cargo.getText().toString().trim();
        final String sexoVal = spin_sexo.toString().trim();
        final String edadval = spin_edad.toString().trim();
        boolean em = false, cel = false;

        final ProgressDialog progressDialog = new ProgressDialog(this);

        //Validacion Nombre
        if (nameVal.isEmpty()){
            nombre.setError("Complete los Campos");
        }else {
            nombre.setError(null);
        }
            if (apellidoVal.isEmpty()){
            apellido.setError("Complete los Campos");
        }else{
            apellido.setError(null);
        }
            if (celularVal.isEmpty() || celularVal.length() == 10 == false){
            celular.setError("Maximo 10 digitos");
            cel = false;
        }else {
            celular.setError(null);
            cel = true;
        }
        if (Patterns.EMAIL_ADDRESS.matcher(email.getText().toString().trim()).matches() == false){
            email.setError("Correo Invalido");
            em = false;
        }else{
            email.setError(null);
            em = true;
        }
            if (empresaVal.isEmpty()){
            empresa.setError("Complete los Campos");
        }else {
                empresa.setError(null);
            }
            if (cargoVal.isEmpty()){
            cargo.setError("Complete los Campos");
        }else {
                empresa.setError(null);
            }

        if (em == true && cel == true){

            Intent intent = new Intent(RegistroActivity.this,AnimodoActivity.class);
            startActivity(intent);
            finish();
        }


            /*
            progressDialog.show();
            StringRequest request = new StringRequest(Request.Method.POST, "", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    if (response.equalsIgnoreCase("Usuario Registrado")) {
                        Toast.makeText(RegistroActivity.this, "Usuario Ingresado", Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                    } else {
                        Toast.makeText(RegistroActivity.this, response, Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(RegistroActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }
            }){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String>params = new HashMap<String, String>();

                    params.put("nombre",nameVal);
                    params.put("Apellido",apellidoVal);
                    params.put("Celular",celularVal);
                    params.put("email",emailVal);
                    params.put("empresa",empresaVal);
                    params.put("cargo",cargoVal);
                    params.put("sexo",sexoVal);
                    params.put("edad",edadval);
                    return super.getParams();
                }
            };

            RequestQueue requestQueue = Volley.newRequestQueue(RegistroActivity.this);
            requestQueue.add(request);*/


    }


}