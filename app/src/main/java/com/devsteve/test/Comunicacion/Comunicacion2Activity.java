package com.devsteve.test.Comunicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Comunicacion2Activity extends AppCompatActivity {


    private RadioGroup rbgcomuni, rbgcomuni1, rbgcomuni2, rbgcomuni3;
    private RadioGroup rbg1comuni, rbg1comuni2, rbg1comuni3, rbg2comuni;
    private RadioButton rd1comuni, rd2comuni, rd3comuni,rdcomuni7, rdcomuni8, rdcomuni9,
            rdcomunica1, rdcomunica2, rdcomunica3, rdcomunica4, rdcomunica5, rdcomunica6
            ,rdcomunica7, rdcomunica8, rdcomunica9;
    private RadioButton rdcomuni1, rdcomuni2, rdcomuni3, rdcomuni4, rdcomuni5, rdcomuni6,
            rdcom1, rdcom2, rdcom3;

    private TextView cambiarbutton3, cambiarbutton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion2);


        //Hechos
        rbgcomuni = findViewById(R.id.rbg_Comunicacion4);
        rd1comuni = findViewById(R.id.rd_comunicacion4_1);
        rd2comuni = findViewById(R.id.rd_comunicacion4_2);
        rd3comuni = findViewById(R.id.rd_comunicacion4_3);
        rbgcomuni.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rd_comunicacion4_1:
                        if (rd1comuni.isChecked() == true) {
                            Variables.setCom7(rd1comuni.getText().toString());
                            rdcomuni1.setEnabled(false);
                            rd2comuni.setEnabled(false);
                            rd3comuni.setEnabled(false);
                            rdcomuni4.setEnabled(false);
                            rdcomuni7.setEnabled(false);
                        }if (rd1comuni.isChecked() == true){
                        rdcomuni2.setEnabled(true);
                        rdcomuni5.setEnabled(true);
                        rdcomuni8.setEnabled(true);
                    }

                        break;

                    case R.id.rd_comunicacion4_2:
                        if (rd2comuni.isChecked()) {
                            Variables.setCom8(rd2comuni.getText().toString());
                            rd3comuni.setEnabled(false);
                            rdcomuni2.setEnabled(false);
                            rdcomuni5.setEnabled(false);
                            rdcomuni8.setEnabled(false);
                        }

                        break;
                    case R.id.rd_comunicacion4_3:
                        Variables.setCom9(rd3comuni.getText().toString());
                        break;

                }
            }
        });
        //Resultados
        rbgcomuni1 = findViewById(R.id.rbg_Comunicacion5);
        rdcomuni1 = findViewById(R.id.rd_comunicacion5_1);
        rdcomuni2 = findViewById(R.id.rd_comunicacion5_2);
        rdcomuni3 = findViewById(R.id.rd_comunicacion5_3);
        rbgcomuni1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ix) {
                switch (ix) {
                    case R.id.rd_comunicacion5_1:
                        if (rdcomuni1.isChecked()) {
                            Variables.setCom7_1(rdcomuni1.getText().toString());
                            rd1comuni.setEnabled(false);
                            rdcomuni2.setEnabled(false);
                            rdcomuni3.setEnabled(false);
                            rdcomuni4.setEnabled(false);
                            rdcomuni7.setEnabled(false);
                        }if(rdcomuni1.isChecked() == true){
                        rd2comuni.setEnabled(true);
                        rdcomuni5.setEnabled(true);
                        rdcomuni8.setEnabled(true);
                    }
                        break;
                    case R.id.rd_comunicacion5_2:

                        if (rdcomuni2.isChecked()) {
                            Variables.setCom7_2(rdcomuni2.getText().toString());
                            rd2comuni.setEnabled(false);
                            rdcomuni5.setEnabled(false);
                            rdcomuni8.setEnabled(false);
                            rdcomuni3.setEnabled(false);
                        }
                        break;

                    case R.id.rd_comunicacion5_3:
                        Variables.setCom7_3(rdcomuni3.getText().toString());
                        break;

                }

            }
        });
        //Personas
        rbgcomuni2 = findViewById(R.id.rbg_Comunicacion6);
        rdcomuni4 = findViewById(R.id.rd_comunicacion6_1);
        rdcomuni5 = findViewById(R.id.rd_comunicacion6_2);
        rdcomuni6 = findViewById(R.id.rd_comunicacion6_3);
        rbgcomuni2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ir) {
                switch (ir) {
                    case R.id.rd_comunicacion6_1:
                        if (rdcomuni4.isChecked()) {
                            Variables.setCom8_1(rdcomuni4.getText().toString());
                            rd1comuni.setEnabled(false);
                            rdcomuni5.setEnabled(false);
                            rdcomuni6.setEnabled(false);
                            rdcomuni1.setEnabled(false);
                            rdcomuni7.setEnabled(false);
                        }
                        if(rdcomuni4.isChecked() == true){
                            rd2comuni.setEnabled(true);
                            rdcomuni2.setEnabled(true);
                            rdcomuni8.setEnabled(true);
                        }
                        break;
                    case R.id.rd_comunicacion6_2:
                        if (rdcomuni5.isChecked()) {
                            Variables.setCom8_2(rdcomuni5.getText().toString());
                            rd2comuni.setEnabled(false);
                            rdcomuni2.setEnabled(false);
                            rdcomuni8.setEnabled(false);
                            rdcomuni6.setEnabled(false);
                        }
                        break;

                    case R.id.rd_comunicacion6_3:
                        Variables.setCom8_3(rdcomuni6.getText().toString());
                        break;
                }

            }
        });
        //Ideas
        rbgcomuni3 = findViewById(R.id.rbg_Comunicacion7);
        rdcomuni7 = findViewById(R.id.rd_comunicacion7_1);
        rdcomuni8 = findViewById(R.id.rd_comunicacion7_2);
        rdcomuni9 = findViewById(R.id.rd_comunicacion7_3);
        rbgcomuni3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ie) {
                switch (ie) {
                    case R.id.rd_comunicacion7_1:
                        if (rdcomuni7.isChecked()) {
                            Variables.setCom9_1(rdcomuni7.getText().toString());
                            rd1comuni.setEnabled(false);
                            rdcomuni1.setEnabled(false);
                            rdcomuni4.setEnabled(false);
                            rdcomuni8.setEnabled(false);
                            rdcomuni9.setEnabled(false);
                        }
                        if (rdcomuni7.isChecked() == true){
                            rd2comuni.setEnabled(true);
                            rdcomuni2.setEnabled(true);
                            rdcomuni5.setEnabled(true);
                        }
                        break;
                    case R.id.rd_comunicacion7_2:
                        if (rdcomuni8.isChecked()) {
                            Variables.setCom9_2(rdcomuni8.getText().toString());
                            rd2comuni.setEnabled(false);
                            rdcomuni2.setEnabled(false);
                            rdcomuni5.setEnabled(false);
                            rdcomuni9.setEnabled(false);
                        }
                        break;

                    case R.id.rd_comunicacion7_3:
                        Variables.setCom9_3(rdcomuni9.getText().toString());
                        break;


                }
            }
        });

        //----------Pregunta numero 4-----------
        //Exactitud
        rbg1comuni = findViewById(R.id.rbg_Comunicacion8);
        rdcomunica1 = findViewById(R.id.rd_comunicacion8_1);
        rdcomunica2 = findViewById(R.id.rd_comunicacion8_2);
        rdcomunica3 = findViewById(R.id.rd_comunicacion8_3);
        rbg1comuni.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int inv) {
                switch (inv){
                    case R.id.rd_comunicacion8_1:
                        if (rdcomunica1.isChecked() == true) {
                            Variables.setCom10(rdcomunica1.getText().toString());
                            rdcomunica2.setEnabled(false);
                            rdcomunica3.setEnabled(false);
                            rdcomunica4.setEnabled(false);
                            rdcomunica7.setEnabled(false);
                            rdcom1.setEnabled(false);
                        }if (rdcomunica1.isChecked() == true){
                        rdcomunica5.setEnabled(true);
                        rdcomunica8.setEnabled(true);
                        rdcom2.setEnabled(true);

                    }

                        break;
                    case R.id.rd_comunicacion8_2:
                        if (rdcomunica2.isChecked() == true) {
                            Variables.setCom11(rdcomunica2.getText().toString());
                            rdcom2.setEnabled(false);
                            rdcomunica5.setEnabled(false);
                            rdcomunica8.setEnabled(false);
                            rdcomunica3.setEnabled(false);
                        }
                        break;
                    case R.id.rd_comunicacion8_3:
                        Variables.setCom12(rdcomunica3.getText().toString());
                        break;
                }
            }
        });
        //Impacto
        rbg1comuni2 = findViewById(R.id.rbg_Comunicacion9);
        rdcomunica4 = findViewById(R.id.rd_comunicacion9_1);
        rdcomunica5 = findViewById(R.id.rd_comunicacion9_2);
        rdcomunica6 = findViewById(R.id.rd_comunicacion9_3);
        rbg1comuni2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int inchek) {
                switch (inchek){
                    case R.id.rd_comunicacion9_1:
                        if (rdcomunica4.isChecked() == true){
                            Variables.setCom10_1(rdcomunica4.getText().toString());
                            rdcomunica1.setEnabled(false);
                            rdcomunica5.setEnabled(false);
                            rdcomunica6.setEnabled(false);
                            rdcomunica7.setEnabled(false);
                            rdcom1.setEnabled(false);
                        }if (rdcomunica4.isChecked() == true){
                        rdcomunica8.setEnabled(true);
                        rdcom2.setEnabled(true);
                    }
                        break;
                    case R.id.rd_comunicacion9_2:
                        if (rdcomunica5.isChecked()){
                            Variables.setCom10_2(rdcomunica5.getText().toString());
                            rdcomunica8.setEnabled(false);
                            rdcom2.setEnabled(false);
                            rdcomunica6.setEnabled(false);
                            rdcomunica2.setEnabled(false);
                        }
                        break;
                    case R.id.rd_comunicacion9_3:
                        Variables.setCom10_3(rdcomunica6.getText().toString());
                        break;
                }
            }
        });
        //Contribucion
        rbg1comuni3 = findViewById(R.id.rbg_Comunicacion10);
        rdcomunica7 = findViewById(R.id.rd_comunicacion10_1);
        rdcomunica8 = findViewById(R.id.rd_comunicacion10_2);
        rdcomunica9 = findViewById(R.id.rd_comunicacion10_3);
        rbg1comuni3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int inch) {
                switch(inch){
                    case R.id.rd_comunicacion10_1:
                        if (rdcomunica7.isChecked()){
                            Variables.setCom11_1(rdcomunica7.getText().toString());
                            rdcomunica8.setEnabled(false);
                            rdcomunica9.setEnabled(false);
                            rdcomunica1.setEnabled(false);
                            rdcomunica4.setEnabled(false);
                            rdcom1.setEnabled(false);
                        }if (rdcomunica7.isChecked() ==true){
                        rdcomunica5.setEnabled(true);
                        rdcomunica2.setEnabled(true);
                        rdcom2.setEnabled(true);
                    }
                        break;
                    case R.id.rd_comunicacion10_2:
                        if (rdcomunica8.isChecked()){
                            Variables.setCom11_2(rdcomunica8.getText().toString());
                            rdcomunica5.setEnabled(false);
                            rdcomunica2.setEnabled(false);
                            rdcom2.setEnabled(false);
                            rdcomunica9.setEnabled(false);
                        }

                        break;
                    case R.id.rd_comunicacion10_3:
                        Variables.setCom11_3(rdcomunica9.getText().toString());
                        break;
                }
            }
        });
        //Creatividad
        rbg2comuni = findViewById(R.id.rbg_Comunicacion11);
        rdcom1 = findViewById(R.id.rd_comunicacion11_1);
        rdcom2 = findViewById(R.id.rd_comunicacion11_2);
        rdcom3 = findViewById(R.id.rd_comunicacion11_3);
        rbg2comuni.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int inc) {
                switch (inc){
                    case R.id.rd_comunicacion11_1:
                        if (rdcom1.isChecked()){
                            Variables.setCom12_1(rdcom1.getText().toString());
                            rdcomunica7.setEnabled(false);
                            rdcomunica1.setEnabled(false);
                            rdcomunica4.setEnabled(false);
                            rdcom2.setEnabled(false);
                            rdcom3.setEnabled(false);
                        }if (rdcom1.isChecked() == true){
                        rdcomunica5.setEnabled(true);
                        rdcomunica8.setEnabled(true);
                        rdcomunica2.setEnabled(true);
                    }
                        break;
                    case R.id.rd_comunicacion11_2:
                        if (rdcom2.isChecked()){
                            Variables.setCom12_2(rdcom2.getText().toString());
                            rdcomunica5.setEnabled(false);
                            rdcomunica8.setEnabled(false);
                            rdcomunica2.setEnabled(false);
                            rdcom3.setEnabled(false);
                        }
                        break;
                    case R.id.rd_comunicacion11_3:
                        if (rdcom3.isChecked() || rdcomunica9.isChecked() || rdcomunica6.isChecked()){
                            Variables.setCom12_3(rdcom3.getText().toString());
                            Intent intent = new Intent(Comunicacion2Activity.this, Comunicacion3Activity.class);
                            startActivity(intent);
                        }
                        break;
                }
            }
        });

        //borra opcion Pregunta 1
        cambiarbutton3 = findViewById(R.id.Tv_CambiarComunicacion3);
        cambiarbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton3.isClickable() == true){
                    rbgcomuni.clearCheck();
                    rd1comuni.setEnabled(true);
                    rd2comuni.setEnabled(true);
                    rd3comuni.setEnabled(true);
                    rbgcomuni1.clearCheck();
                    rdcomuni1.setEnabled(true);
                    rdcomuni2.setEnabled(true);
                    rdcomuni3.setEnabled(true);
                    rbgcomuni2.clearCheck();
                    rdcomuni4.setEnabled(true);
                    rdcomuni5.setEnabled(true);
                    rdcomuni6.setEnabled(true);
                    rbgcomuni3.clearCheck();
                    rdcomuni7.setEnabled(true);
                    rdcomuni8.setEnabled(true);
                    rdcomuni9.setEnabled(true);
                }

            }
        });
        //borra opcion Pregunta 2
        cambiarbutton4 = findViewById(R.id.Tv_CambiarComunicacion4);
        cambiarbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton4.isClickable() == true){
                    rbg1comuni.clearCheck();
                    rdcomunica1.setEnabled(true);
                    rdcomunica2.setEnabled(true);
                    rdcomunica3.setEnabled(true);
                    rbg1comuni2.clearCheck();
                    rdcomunica4.setEnabled(true);
                    rdcomunica5.setEnabled(true);
                    rdcomunica6.setEnabled(true);
                    rbg1comuni3.clearCheck();
                    rdcomunica7.setEnabled(true);
                    rdcomunica8.setEnabled(true);
                    rdcomunica9.setEnabled(true);
                    rbg2comuni.clearCheck();
                    rdcom1.setEnabled(true);
                    rdcom2.setEnabled(true);
                    rdcom3.setEnabled(true);
                }
            }
        });
    }

    }