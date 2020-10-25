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

public class Comunicacion3Activity extends AppCompatActivity {

    private RadioGroup rbgcomuni, rbgcomuni1, rbgcomuni2, rbgcomuni3;
    private RadioGroup rbg1comuni, rbg1comuni2, rbg1comuni3, rbg2comuni;
    private RadioButton rd1comuni, rd2comuni, rd3comuni,rdcomuni7, rdcomuni8, rdcomuni9,
            rdcomunica1, rdcomunica2, rdcomunica3, rdcomunica4, rdcomunica5, rdcomunica6
            ,rdcomunica7, rdcomunica8, rdcomunica9;
    private RadioButton rdcomuni1, rdcomuni2, rdcomuni3, rdcomuni4, rdcomuni5, rdcomuni6,
            rdcom1, rdcom2, rdcom3;

    private TextView cambiarbutton5, cambiarbutton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion3);

        //Hechos
        rbgcomuni = findViewById(R.id.rbg_Comunicacion1_);
        rd1comuni = findViewById(R.id.rd1_comunicacion1_1);
        rd2comuni = findViewById(R.id.rd1_comunicacion1_2);
        rd3comuni = findViewById(R.id.rd1_comunicacion1_3);
        rbgcomuni.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rd1_comunicacion1_1:
                        if (rd1comuni.isChecked() == true) {
                            Variables.setCom13(rd1comuni.getText().toString());
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

                    case R.id.rd1_comunicacion1_2:
                        if (rd2comuni.isChecked()) {
                            Variables.setCom14(rd2comuni.getText().toString());
                            rd3comuni.setEnabled(false);
                            rdcomuni2.setEnabled(false);
                            rdcomuni5.setEnabled(false);
                            rdcomuni8.setEnabled(false);
                        }

                        break;
                    case R.id.rd1_comunicacion1_3:
                        Variables.setCom15(rd3comuni.getText().toString());
                        break;

                }
            }
        });
        //Resultados
        rbgcomuni1 = findViewById(R.id.rbg_Comunicacion2_);
        rdcomuni1 = findViewById(R.id.rd2_comunicacion2_1);
        rdcomuni2 = findViewById(R.id.rd2_comunicacion2_2);
        rdcomuni3 = findViewById(R.id.rd2_Comunicacion2_3);
        rbgcomuni1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ix) {
                switch (ix) {
                    case R.id.rd2_comunicacion2_1:
                        if (rdcomuni1.isChecked()) {
                            Variables.setCom13_1(rdcomuni1.getText().toString());
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
                    case R.id.rd2_comunicacion2_2:

                        if (rdcomuni2.isChecked()) {
                            Variables.setCom13_2(rdcomuni2.getText().toString());
                            rd2comuni.setEnabled(false);
                            rdcomuni5.setEnabled(false);
                            rdcomuni8.setEnabled(false);
                            rdcomuni3.setEnabled(false);
                        }
                        break;

                    case R.id.rd2_Comunicacion2_3:
                        Variables.setCom13_3(rdcomuni3.getText().toString());
                        break;

                }

            }
        });
        //Personas
        rbgcomuni2 = findViewById(R.id.rbg_Comunicacion3_);
        rdcomuni4 = findViewById(R.id.rd3_comunicacion3_1);
        rdcomuni5 = findViewById(R.id.rd3_comunicacion3_2);
        rdcomuni6 = findViewById(R.id.rd3_comunicacion3_3);
        rbgcomuni2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ir) {
                switch (ir) {
                    case R.id.rd3_comunicacion3_1:
                        if (rdcomuni4.isChecked()) {
                            Variables.setCom14_1(rdcomuni4.getText().toString());
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
                    case R.id.rd3_comunicacion3_2:
                        if (rdcomuni5.isChecked()) {
                            Variables.setCom14_2(rdcomuni5.getText().toString());
                            rd2comuni.setEnabled(false);
                            rdcomuni2.setEnabled(false);
                            rdcomuni8.setEnabled(false);
                            rdcomuni6.setEnabled(false);
                        }
                        break;

                    case R.id.rd3_comunicacion3_3:
                        Variables.setCom14_3(rdcomuni6.getText().toString());
                        break;
                }

            }
        });
        //Ideas
        rbgcomuni3 = findViewById(R.id.rbg_Comunicacion4_);
        rdcomuni7 = findViewById(R.id.rd4_comunicacion4_1);
        rdcomuni8 = findViewById(R.id.rd4_comunicacion4_2);
        rdcomuni9 = findViewById(R.id.rd4_comunicacion4_3);
        rbgcomuni3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ie) {
                switch (ie) {
                    case R.id.rd4_comunicacion4_1:
                        if (rdcomuni7.isChecked()) {
                            Variables.setCom15_1(rdcomuni7.getText().toString());
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
                    case R.id.rd4_comunicacion4_2:
                        if (rdcomuni8.isChecked()) {
                            Variables.setCom15_2(rdcomuni8.getText().toString());
                            rd2comuni.setEnabled(false);
                            rdcomuni2.setEnabled(false);
                            rdcomuni5.setEnabled(false);
                            rdcomuni9.setEnabled(false);
                        }
                        break;

                    case R.id.rd4_comunicacion4_3:
                        Variables.setCom15_3(rdcomuni9.getText().toString());
                        break;


                }
            }
        });

        //----------Pregunta numero 6-----------
        //Exactitud
        rbg1comuni = findViewById(R.id.rbg_Comunicacion5_);
        rdcomunica1 = findViewById(R.id.rd5_Comunicacion5_1);
        rdcomunica2 = findViewById(R.id.rd5_Comunicacion5_2);
        rdcomunica3 = findViewById(R.id.rd5_Comunicacion5_3);
        rbg1comuni.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int inv) {
                switch (inv){
                    case R.id.rd5_Comunicacion5_1:
                        if (rdcomunica1.isChecked() == true) {
                            Variables.setCom16(rdcomunica1.getText().toString());
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
                    case R.id.rd5_Comunicacion5_2:
                        if (rdcomunica2.isChecked() == true) {
                            Variables.setCom17(rdcomunica2.getText().toString());
                            rdcom2.setEnabled(false);
                            rdcomunica5.setEnabled(false);
                            rdcomunica8.setEnabled(false);
                            rdcomunica3.setEnabled(false);
                        }
                        break;
                    case R.id.rd5_Comunicacion5_3:
                        Variables.setCom18(rdcomunica3.getText().toString());
                        break;
                }
            }
        });
        //Impacto
        rbg1comuni2 = findViewById(R.id.rbg_Comunicacion6_);
        rdcomunica4 = findViewById(R.id.rd6_Comunicacion6_1);
        rdcomunica5 = findViewById(R.id.rd6_Comunicacion6_2);
        rdcomunica6 = findViewById(R.id.rd6_Comunicacion6_3);
        rbg1comuni2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int inchek) {
                switch (inchek){
                    case R.id.rd6_Comunicacion6_1:
                        if (rdcomunica4.isChecked() == true){
                            Variables.setCom16_1(rdcomunica4.getText().toString());
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
                    case R.id.rd6_Comunicacion6_2:
                        if (rdcomunica5.isChecked()){
                            Variables.setCom16_2(rdcomunica5.getText().toString());
                            rdcomunica8.setEnabled(false);
                            rdcom2.setEnabled(false);
                            rdcomunica6.setEnabled(false);
                            rdcomunica2.setEnabled(false);
                        }
                        break;
                    case R.id.rd6_Comunicacion6_3:
                        Variables.setCom16_3(rdcomunica6.getText().toString());
                        break;
                }
            }
        });
        //Contribucion
        rbg1comuni3 = findViewById(R.id.rbg_Comunicacion7_);
        rdcomunica7 = findViewById(R.id.rd7_comunicacion7_1);
        rdcomunica8 = findViewById(R.id.rd7_comunicacion7_2);
        rdcomunica9 = findViewById(R.id.rd7_comunicacion7_3);
        rbg1comuni3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int inch) {
                switch(inch){
                    case R.id.rd7_comunicacion7_1:
                        if (rdcomunica7.isChecked()){
                            Variables.setCom17_1(rdcomunica7.getText().toString());
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
                    case R.id.rd7_comunicacion7_2:
                        if (rdcomunica8.isChecked()){
                            Variables.setCom17_2(rdcomunica8.getText().toString());
                            rdcomunica5.setEnabled(false);
                            rdcomunica2.setEnabled(false);
                            rdcom2.setEnabled(false);
                            rdcomunica9.setEnabled(false);
                        }

                        break;
                    case R.id.rd7_comunicacion7_3:
                        Variables.setCom17_3(rdcomunica9.getText().toString());
                        break;
                }
            }
        });
        //Creatividad
        rbg2comuni = findViewById(R.id.rbg_Comunicacion8_);
        rdcom1 = findViewById(R.id.rd8_comunicacion8_1);
        rdcom2 = findViewById(R.id.rd8_comunicacion8_2);
        rdcom3 = findViewById(R.id.rd8_comunicacion8_3);
        rbg2comuni.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int inc) {
                switch (inc){
                    case R.id.rd8_comunicacion8_1:
                        if (rdcom1.isChecked()){
                            Variables.setCom18_1(rdcom1.getText().toString());
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
                    case R.id.rd8_comunicacion8_2:
                        if (rdcom2.isChecked()){
                            Variables.setCom18_2(rdcom2.getText().toString());
                            rdcomunica5.setEnabled(false);
                            rdcomunica8.setEnabled(false);
                            rdcomunica2.setEnabled(false);
                            rdcom3.setEnabled(false);
                        }
                        break;
                    case R.id.rd8_comunicacion8_3:
                        if (rdcom3.isChecked() || rdcomunica9.isChecked() || rdcomunica6.isChecked()){
                            Variables.setCom18_3(rdcom3.getText().toString());
                            Intent intent = new Intent(Comunicacion3Activity.this, Comunicacion4Activity.class);
                            startActivity(intent);
                        }
                        break;
                }
            }
        });

        //borra opcion Pregunta 1
        cambiarbutton5 = findViewById(R.id.Tv_CambiarComunicacion5);
        cambiarbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton5.isClickable() == true){
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
        cambiarbutton6 = findViewById(R.id.Tv_CambiarComunicacion6);
        cambiarbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton6.isClickable() == true){
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