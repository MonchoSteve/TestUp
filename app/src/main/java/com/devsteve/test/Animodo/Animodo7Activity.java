package com.devsteve.test.Animodo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.devsteve.test.Comunicacion.ComunicacionActivity;
import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Animodo7Activity extends AppCompatActivity {

    private RadioGroup rbganim13,rbganim14, rbganimodo2;
    private RadioButton rd13_1, rd13_2, rd13_3, rd13_4, rd13_5, rd13_6, rd14_1, rd14_2, rd14_3, rd14_4, rd14_5, rd14_6;
    private Button enviarAnimodo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo7);

        enviarAnimodo = findViewById(R.id.Btn_EnviarAnimodo);

        rd13_1 = findViewById(R.id.rd13_1);
        rd13_2 = findViewById(R.id.rd13_2);
        rd13_3 = findViewById(R.id.rd13_3);
        rd13_4 = findViewById(R.id.rd13_4);
        rd13_5 = findViewById(R.id.rd13_5);
        rd13_6 = findViewById(R.id.rd13_6);
        //-----
        rd14_1 = findViewById(R.id.rd14_1);
        rd14_2 = findViewById(R.id.rd14_2);
        rd14_3 = findViewById(R.id.rd14_3);
        rd14_4 = findViewById(R.id.rd14_4);
        rd14_5 = findViewById(R.id.rd14_5);
        rd14_6 = findViewById(R.id.rd14_6);

        rbganim13 = findViewById(R.id.rbg_Animodo13);
        rbganim14 = findViewById(R.id.rbg_Animodo14);

        rbganimodo2 = findViewById(R.id.rbg1_animodo);

        rbganim13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int in) {
                switch(in){
                    case R.id.rd13_1:
                        if (rd13_1.isChecked()){
                            rd13_2.setChecked(false);
                            rd13_3.setChecked(false);
                            rd13_4.setChecked(false);
                            rd13_5.setChecked(false);
                            rd13_6.setChecked(false);
                        }
                        break;
                    case R.id.rd13_2:
                        if (rd13_2.isChecked()){
                            rd13_1.setChecked(false);
                            rd13_3.setChecked(false);
                            rd13_4.setChecked(false);
                            rd13_5.setChecked(false);
                            rd13_6.setChecked(false);
                        }
                        break;
                    case R.id.rd13_3:
                        if (rd13_3.isChecked()){
                            rd13_2.setChecked(false);
                            rd13_1.setChecked(false);
                            rd13_4.setChecked(false);
                            rd13_5.setChecked(false);
                            rd13_6.setChecked(false);
                        }
                        break;
                    case R.id.rd13_4:
                        if (rd13_4.isChecked()){
                            rd13_2.setChecked(false);
                            rd13_3.setChecked(false);
                            rd13_1.setChecked(false);
                            rd13_5.setChecked(false);
                            rd13_6.setChecked(false);
                        }
                        break;
                    case R.id.rd13_5:
                        if (rd13_5.isChecked()){
                            rd13_2.setChecked(false);
                            rd13_3.setChecked(false);
                            rd13_4.setChecked(false);
                            rd13_1.setChecked(false);
                            rd13_6.setChecked(false);
                        }
                        break;
                    case R.id.rd13_6:
                        if (rd13_6.isChecked()){
                            rd13_2.setChecked(false);
                            rd13_3.setChecked(false);
                            rd13_4.setChecked(false);
                            rd13_5.setChecked(false);
                            rd13_1.setChecked(false);
                        }
                        break;
                }
            }
        });

        rbganim14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rd14_1:
                        if (rd14_1.isChecked()){
                            rd14_2.setChecked(false);
                            rd14_3.setChecked(false);
                            rd14_4.setChecked(false);
                            rd14_5.setChecked(false);
                            rd14_6.setChecked(false);
                        }
                        break;
                    case R.id.rd14_2:
                        if (rd14_2.isChecked()){
                            rd14_1.setChecked(false);
                            rd14_3.setChecked(false);
                            rd14_4.setChecked(false);
                            rd14_5.setChecked(false);
                            rd14_6.setChecked(false);
                        }
                        break;
                    case R.id.rd14_3:
                        if (rd14_3.isChecked()){
                            rd14_2.setChecked(false);
                            rd14_1.setChecked(false);
                            rd14_4.setChecked(false);
                            rd14_5.setChecked(false);
                            rd14_6.setChecked(false);
                        }
                        break;
                    case R.id.rd14_4:
                        if (rd14_4.isChecked()){
                            rd14_2.setChecked(false);
                            rd14_3.setChecked(false);
                            rd14_1.setChecked(false);
                            rd14_5.setChecked(false);
                            rd14_6.setChecked(false);
                        }
                        break;
                    case R.id.rd14_5:
                        if (rd14_5.isChecked()){
                            rd14_2.setChecked(false);
                            rd14_3.setChecked(false);
                            rd14_4.setChecked(false);
                            rd14_1.setChecked(false);
                            rd14_6.setChecked(false);
                        }
                        break;
                    case R.id.rd14_6:
                        if (rd14_6.isChecked()){
                            rd14_2.setChecked(false);
                            rd14_3.setChecked(false);
                            rd14_4.setChecked(false);
                            rd14_5.setChecked(false);
                            rd14_1.setChecked(false);
                        }
                        break;
                }
            }
        });

        //Enviar encuesta 1
        enviarAnimodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ///////Pregunta 1///////////
                String a = Variables.getRdnum1().toString();
                String b = Variables.getRdnum2().toString();
                String c = Variables.getRdnum3().toString();
                String d = Variables.getRdnum4().toString();
                String e = Variables.getRdnum5().toString();
                String f = Variables.getRdnum6().toString();
                ///////Pregunta 2///////////
                String g = Variables.getRdnum7().toString();
                String h = Variables.getRdnum8().toString();
                String i = Variables.getRdnum9().toString();
                String j = Variables.getRdnum10().toString();
                String k = Variables.getRdnum11().toString();
                String l = Variables.getRdnum12().toString();
                ///////Pregunta 3///////////
                String p3_1 = Variables.getRdnum13().toString();
                String p3_2 = Variables.getRdnum14().toString();
                String p3_3 = Variables.getRdnum15().toString();
                String p3_4 = Variables.getRdnum16().toString();
                String p3_5 = Variables.getRdnum17().toString();
                String p3_6 = Variables.getRdnum18().toString();
                ///////Pregunta 4///////////
                String p4_1 = Variables.getRdnum19().toString();
                String p4_2 = Variables.getRdnum20().toString();
                String p4_3 = Variables.getRdnum21().toString();
                String p4_4 = Variables.getRdnum22().toString();
                String p4_5 = Variables.getRdnum23().toString();
                String p4_6 = Variables.getRdnum24().toString();
                ///////Pregunta 5///////////
                String p5_1 = Variables.getRdnum25().toString();
                String p5_2 = Variables.getRdnum26().toString();
                String p5_3 = Variables.getRdnum27().toString();
                String p5_4 = Variables.getRdnum28().toString();
                String p5_5 = Variables.getRdnum29().toString();
                String p5_6 = Variables.getRdnum30().toString();
                ////////PREGUNTA 6/////////////
                String p6_1 = Variables.getRdnum31().toString();
                String p6_2 = Variables.getRdnum32().toString();
                String p6_3 = Variables.getRdnum33().toString();
                String p6_4 = Variables.getRdnum34().toString();
                String p6_5 = Variables.getRdnum35().toString();
                String p6_6 = Variables.getRdnum36().toString();
                ///////Pregunta 7/////////////////////
                String p7_1 = Variables.getRdnum37().toString();
                String p7_2 = Variables.getRdnum38().toString();
                String p7_3 = Variables.getRdnum39().toString();
                String p7_4 = Variables.getRdnum40().toString();
                String p7_5 = Variables.getRdnum41().toString();
                String p7_6 = Variables.getRdnum42().toString();
                ////////////////////Pregunta 8////////////////////
                String p8_1 = Variables.getRdnum43().toString();
                String p8_2 = Variables.getRdnum44().toString();
                String p8_3 = Variables.getRdnum45().toString();
                String p8_4 = Variables.getRdnum46().toString();
                String p8_5 = Variables.getRdnum47().toString();
                String p8_6 = Variables.getRdnum48().toString();
                ///////Pregunta 9/////////////////////
                String p9_1 = Variables.getRdnum49().toString();
                String p9_2 = Variables.getRdnum50().toString();
                String p9_3 = Variables.getRdnum51().toString();
                String p9_4 = Variables.getRdnum52().toString();
                String p9_5 = Variables.getRdnum53().toString();
                String p9_6 = Variables.getRdnum54().toString();
                /////////////////Pregunta 10////////////////////
                String p10_1 = Variables.getRdnum55().toString();
                String p10_2 = Variables.getRdnum56().toString();
                String p10_3 = Variables.getRdnum57().toString();
                String p10_4 = Variables.getRdnum58().toString();
                String p10_5 = Variables.getRdnum59().toString();
                String p10_6 = Variables.getRdnum60().toString();
                ///////Pregunta 11/////////////////////
                String p11_1 = Variables.getRdnum61().toString();
                String p11_2 = Variables.getRdnum62().toString();
                String p11_3 = Variables.getRdnum63().toString();
                String p11_4 = Variables.getRdnum64().toString();
                String p11_5 = Variables.getRdnum65().toString();
                String p11_6 = Variables.getRdnum66().toString();
                /////////////////Pregunta 12////////////////////
                String p12_1 = Variables.getRdnum67().toString();
                String p12_2 = Variables.getRdnum68().toString();
                String p12_3 = Variables.getRdnum69().toString();
                String p12_4 = Variables.getRdnum70().toString();
                String p12_5 = Variables.getRdnum71().toString();
                String p12_6 = Variables.getRdnum72().toString();


                if (a.isEmpty() && b.isEmpty() && c.isEmpty() && d.isEmpty() && e.isEmpty() && f.isEmpty() == true){
                    Toast.makeText(Animodo7Activity.this, "Por Favor Llene el Campo de la Pregunta 1", Toast.LENGTH_SHORT).show();

                }else if (g.isEmpty() && h.isEmpty() && i.isEmpty() && j.isEmpty() && k.isEmpty() && l.isEmpty()) {
                    Toast.makeText(Animodo7Activity.this, "Por favor llene el campo de la pregunta 2", Toast.LENGTH_SHORT).show();

                }else if (p3_1.isEmpty() && p3_2.isEmpty() && p3_3.isEmpty() && p3_4.isEmpty() && p3_5.isEmpty() && p3_6.isEmpty()== true){
                    Toast.makeText(Animodo7Activity.this, "Por Favor llene el campo de la pregunta 3", Toast.LENGTH_SHORT).show();

                }else if (p4_1.isEmpty() && p4_2.isEmpty() && p4_3.isEmpty() && p4_4.isEmpty() && p4_5.isEmpty() && p4_6.isEmpty()) {
                    Toast.makeText(Animodo7Activity.this, "Por Favor llene el campo de la pregunta 4", Toast.LENGTH_SHORT).show();

                }else if (p5_1.isEmpty() && p5_2.isEmpty() && p5_3.isEmpty() && p5_4.isEmpty() && p5_5.isEmpty() && p5_6.isEmpty() == true){
                    Toast.makeText(Animodo7Activity.this, "Por Favor llene el campo de la pregunta 5", Toast.LENGTH_SHORT).show();
                }else if (p6_1.isEmpty() && p6_2.isEmpty() && p6_3.isEmpty() && p6_4.isEmpty() && p6_5.isEmpty() && p6_6.isEmpty()){
                    Toast.makeText(Animodo7Activity.this, "Por Favor llene el campo de la pregunta 6", Toast.LENGTH_SHORT).show();
                }else if (p7_1.isEmpty() && p7_2.isEmpty() && p7_3.isEmpty() && p7_4.isEmpty() && p7_5.isEmpty() && p7_6.isEmpty() == true){
                    Toast.makeText(Animodo7Activity.this, "Por Favor llene el campo de la pregunta 7", Toast.LENGTH_SHORT).show();
                }else if (p8_1.isEmpty() && p8_2.isEmpty() && p8_3.isEmpty() && p8_4.isEmpty() && p8_5.isEmpty() && p8_6.isEmpty()){
                    Toast.makeText(Animodo7Activity.this, "Por Favor llene el campo de la pregunta 8", Toast.LENGTH_SHORT).show();
                }else if (p9_1.isEmpty() && p9_2.isEmpty() && p9_3.isEmpty() && p9_4.isEmpty() && p9_5.isEmpty() && p9_6.isEmpty() == true){
                    Toast.makeText(Animodo7Activity.this, "Por Favor llene el campo de la pregunta 9", Toast.LENGTH_SHORT).show();
                }else if (p10_1.isEmpty() && p10_2.isEmpty() && p10_3.isEmpty() && p10_4.isEmpty() && p10_5.isEmpty() && p10_6.isEmpty()){
                    Toast.makeText(Animodo7Activity.this, "Por Favor llene el campo de la pregunta 10", Toast.LENGTH_SHORT).show();
                }else if (p11_1.isEmpty() && p11_2.isEmpty() && p11_3.isEmpty() && p11_4.isEmpty() && p11_5.isEmpty() && p11_6.isEmpty() == true){
                    Toast.makeText(Animodo7Activity.this, "Por Favor llene el campo de la pregunta 11", Toast.LENGTH_SHORT).show();
                }else if (p12_1.isEmpty() && p12_2.isEmpty() && p12_3.isEmpty() && p12_4.isEmpty() && p12_5.isEmpty() && p12_6.isEmpty()){
                    Toast.makeText(Animodo7Activity.this, "Por Favor llene el campo de la pregunta 12", Toast.LENGTH_SHORT).show();
                }else if (rd13_1.getText().toString().isEmpty() && rd13_2.getText().toString().isEmpty() && rd13_3.getText().toString().isEmpty() &&
                        rd13_4.getText().toString().isEmpty() && rd13_5.getText().toString().isEmpty() && rd13_6.getText().toString().isEmpty() == true){
                    Toast.makeText(Animodo7Activity.this, "Por Favor llene el campo vacio de la pregunta 13", Toast.LENGTH_SHORT).show();
                }else if (rd14_1.getText().toString().isEmpty() && rd14_2.getText().toString().isEmpty() && rd14_3.getText().toString().isEmpty() &&
                        rd14_4.getText().toString().isEmpty() && rd14_5.getText().toString().isEmpty() && rd14_6.getText().toString().isEmpty() == true){
                    Toast.makeText(Animodo7Activity.this, "Por Favor llene el campo vacio de la pregunta 14", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Animodo7Activity.this, "Entramos Todo bien", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Animodo7Activity.this, ComunicacionActivity.class);
                    startActivity(intent);
                }

            }
        });


    }
}