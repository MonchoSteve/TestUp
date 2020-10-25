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

public class Comunicacion6Activity extends AppCompatActivity {

    private RadioGroup rbg_comunicacion4, rbg_comunicacion5, rbg_comunicacion6, rbg_comunicacion7,
            rbg_comunicaicon8, rbg_comunicacion9, rbg_comunicacion10,rbg_comunicacion11;
    private RadioButton rd_comunicacion4_1, rd_comunicacion4_2, rd_comunicacion4_3, rd_comunicacion5_1, rd_comunicacion5_2
            ,rd_comunicacion5_3, rd_comunicacion6_1, rd_comunicacion6_2, rd_comunicacion6_3, rd_comunicacion7_1, rd_comunicacion7_2,
            rd_comunicacion7_3, rd_comunicacion8_1, rd_comunicacion8_2, rd_comunicacion8_3, rd_comunicacion9_1, rd_comunicacion9_2, rd_comunicacion9_3
            ,rd_comunicacion10_1, rd_comunicacion10_2, rd_comunicacion10_3, rd_comunicacion11_1, rd_comunicacion11_2,
            rd_comunicacion11_3;

    private TextView cambiarbutton11, cambiarbutton12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion6);

        //Datos
        rbg_comunicacion4 = findViewById(R.id.rbg11_C1);
        rd_comunicacion4_1 = findViewById(R.id.rd11_C1_1);
        rd_comunicacion4_2 = findViewById(R.id.rd11_C1_2);
        rd_comunicacion4_3 = findViewById(R.id.rd11_C1_3);
        rbg_comunicacion4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd11_C1_1:
                        if (rd_comunicacion4_1.isChecked() == true){
                            Variables.setCom31(rd_comunicacion4_1.getText().toString());
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion4_3.setEnabled(false);
                            rd_comunicacion5_1.setEnabled(false);
                            rd_comunicacion6_1.setEnabled(false);
                            rd_comunicacion7_1.setEnabled(false);

                        }if (rd_comunicacion4_1.isChecked() == true){
                        rd_comunicacion5_2.setEnabled(true);
                        rd_comunicacion6_2.setEnabled(true);
                        rd_comunicacion7_2.setEnabled(true);
                    }
                        break;

                    case R.id.rd11_C1_2:
                        if (rd_comunicacion4_2.isChecked() == false){
                            Variables.setCom32(rd_comunicacion4_2.getText().toString());
                            rd_comunicacion4_3.setEnabled(false);
                            rd_comunicacion5_2.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion7_2.setEnabled(false);
                        }
                        break;

                    case R.id.rd11_C1_3:
                        Variables.setCom33(rd_comunicacion4_3.getText().toString());
                        break;
                }
            }
        });
        //Desafios
        rbg_comunicacion5 = findViewById(R.id.rbg11_C2);
        rd_comunicacion5_1 = findViewById(R.id.rd11_C2_1);
        rd_comunicacion5_2 = findViewById(R.id.rd11_C2_2);
        rd_comunicacion5_3 = findViewById(R.id.rd11_C2_3);
        rbg_comunicacion5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ip) {

                switch (ip){
                    case R.id.rd11_C2_1:
                        if (rd_comunicacion5_1.isChecked() == true){
                            Variables.setCom31_1(rd_comunicacion5_1.getText().toString());
                            rd_comunicacion5_2.setEnabled(false);
                            rd_comunicacion5_3.setEnabled(false);
                            rd_comunicacion4_1.setEnabled(false);
                            rd_comunicacion6_1.setEnabled(false);
                            rd_comunicacion7_1.setEnabled(false);
                        }if (rd_comunicacion5_1.isChecked()){
                        rd_comunicacion4_2.setEnabled(true);
                        rd_comunicacion6_2.setEnabled(true);
                        rd_comunicacion7_2.setEnabled(true);
                    }
                        break;

                    case R.id. rd11_C2_2:
                        if (rd_comunicacion5_2.isChecked()){
                            Variables.setCom31_2(rd_comunicacion5_2.getText().toString());
                            rd_comunicacion5_3.setEnabled(false);
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion7_2.setEnabled(false);
                        }
                        break;

                    case R.id.rd11_C2_3:
                        Variables.setCom31_3(rd_comunicacion5_3.getText().toString());
                        break;
                }

            }
        });
        //Testimonios
        rbg_comunicacion6 = findViewById(R.id.rbg11_C3);
        rd_comunicacion6_1 = findViewById(R.id.rd11_C3_1);
        rd_comunicacion6_2 = findViewById(R.id.rd11_C3_2);
        rd_comunicacion6_3 = findViewById(R.id.rd11_C3_3);
        rbg_comunicacion6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ids) {
                switch (ids){
                    case R.id.rd11_C3_1:
                        if (rd_comunicacion6_1.isChecked() == true){
                            Variables.setCom32_1(rd_comunicacion6_1.getText().toString());
                            rd_comunicacion4_1.setEnabled(false);
                            rd_comunicacion5_1.setEnabled(false);
                            rd_comunicacion7_1.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion6_3.setEnabled(false);
                        }if (rd_comunicacion6_1.isChecked()){
                        rd_comunicacion4_2.setEnabled(true);
                        rd_comunicacion5_2.setEnabled(true);
                        rd_comunicacion7_2.setEnabled(true);
                    }
                        break;
                    case R.id.rd11_C3_2:
                        if (rd_comunicacion6_2.isChecked()){
                            Variables.setCom32_2(rd_comunicacion6_2.getText().toString());
                            rd_comunicacion6_3.setEnabled(false);
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion5_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd11_C3_3:
                        Variables.setCom32_3(rd_comunicacion6_3.getText().toString());
                        break;
                }
            }
        });
        //Innovacion
        rbg_comunicacion7 = findViewById(R.id.rbg11_C4);
        rd_comunicacion7_1 = findViewById(R.id.rd11_C4_1);
        rd_comunicacion7_2 = findViewById(R.id.rd11_C4_2);
        rd_comunicacion7_3 = findViewById(R.id.rd11_C4_3);
        rbg_comunicacion7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ix) {
                switch (ix){
                    case R.id.rd11_C4_1:
                        if (rd_comunicacion7_1.isChecked()){
                            Variables.setCom33_1(rd_comunicacion7_1.getText().toString());
                            rd_comunicacion7_2.setEnabled(false);
                            rd_comunicacion7_3.setEnabled(false);
                            rd_comunicacion4_1.setEnabled(false);
                            rd_comunicacion5_1.setEnabled(false);
                            rd_comunicacion6_1.setEnabled(false);

                        }if (rd_comunicacion7_1.isChecked()){
                        rd_comunicacion4_2.setEnabled(true);
                        rd_comunicacion5_2.setEnabled(true);
                        rd_comunicacion6_2.setEnabled(true);
                    }
                        break;
                    case R.id.rd11_C4_2:
                        if (rd_comunicacion7_2.isChecked()){
                            Variables.setCom33_2(rd_comunicacion7_2.getText().toString());
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion5_2.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion7_3.setEnabled(false);
                        }
                        break;
                    case R.id.rd11_C4_3:
                        Variables.setCom33_3(rd_comunicacion7_3.getText().toString());
                        break;
                }
            }
        });
        //--------------Pregunta8-----------
        //Ingeniero
        rbg_comunicaicon8 = findViewById(R.id.rbg12_C1);
        rd_comunicacion8_1 = findViewById(R.id.rd12_C1_1);
        rd_comunicacion8_2 = findViewById(R.id.rd12_C1_2);
        rd_comunicacion8_3 = findViewById(R.id.rd12_C1_3);
        rbg_comunicaicon8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ifd) {
                switch (ifd){
                    case R.id.rd12_C1_1:
                        if (rd_comunicacion8_1.isChecked() == true){
                            Variables.setCom34(rd_comunicacion8_1.getText().toString());
                            rd_comunicacion8_2.setEnabled(false);
                            rd_comunicacion8_3.setEnabled(false);
                            rd_comunicacion9_1.setEnabled(false);
                            rd_comunicacion10_1.setEnabled(false);
                            rd_comunicacion11_1.setEnabled(false);
                        }if (rd_comunicacion8_1.isChecked() == true){
                        rd_comunicacion9_2.setEnabled(true);
                        rd_comunicacion10_2.setEnabled(true);
                        rd_comunicacion11_2.setEnabled(true);
                    }
                        break;
                    case R.id.rd12_C1_2:
                        if (rd_comunicacion8_2.isChecked()){
                            Variables.setCom35(rd_comunicacion8_2.getText().toString());
                            rd_comunicacion8_3.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion10_2.setEnabled(false);
                            rd_comunicacion11_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd12_C1_3:
                        Variables.setCom36(rd_comunicacion8_3.getText().toString());
                        break;
                }
            }
        });
        //Director
        rbg_comunicacion9 = findViewById(R.id.rbg12_C2);
        rd_comunicacion9_1 = findViewById(R.id.rd12_C2_1);
        rd_comunicacion9_2 = findViewById(R.id.rd12_C2_2);
        rd_comunicacion9_3 = findViewById(R.id.rd12_C2_3);
        rbg_comunicacion9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ch) {
                switch (ch){
                    case R.id.rd12_C2_1:
                        if (rd_comunicacion9_1.isChecked() == true){
                            Variables.setCom34_1(rd_comunicacion9_1.getText().toString());
                            rd_comunicacion8_1.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion9_3.setEnabled(false);
                            rd_comunicacion10_1.setEnabled(false);
                            rd_comunicacion11_1.setEnabled(false);
                        }if (rd_comunicacion9_1.isChecked() == true){
                        rd_comunicacion8_2.setEnabled(true);
                        rd_comunicacion10_2.setEnabled(true);
                        rd_comunicacion11_2.setEnabled(true);
                    }
                        break;
                    case R.id.rd12_C2_2:
                        if (rd_comunicacion9_2.isChecked() == true){
                            Variables.setCom34_2(rd_comunicacion9_2.getText().toString());
                            rd_comunicacion9_3.setEnabled(false);
                            rd_comunicacion10_2.setEnabled(false);
                            rd_comunicacion11_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd12_C2_3:
                        Variables.setCom34_3(rd_comunicacion9_3.getText().toString());
                        break;
                }
            }
        });
        //Maestro
        rbg_comunicacion10 = findViewById(R.id.rbg12_C3);
        rd_comunicacion10_1 = findViewById(R.id.rd12_C3_1);
        rd_comunicacion10_2 = findViewById(R.id.rd12_C3_2);
        rd_comunicacion10_3 = findViewById(R.id.rd12_C3_3);
        rbg_comunicacion10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int irl) {
                switch (irl){
                    case R.id.rd12_C3_1:
                        if (rd_comunicacion10_1.isChecked() == true){
                            Variables.setCom35_1(rd_comunicacion10_1.getText().toString());
                            rd_comunicacion10_2.setEnabled(false);
                            rd_comunicacion10_3.setEnabled(false);
                            rd_comunicacion9_1.setEnabled(false);
                            rd_comunicacion8_1.setEnabled(false);
                            rd_comunicacion11_1.setEnabled(false);
                        }if (rd_comunicacion10_1.isChecked() == true){
                        rd_comunicacion8_2.setEnabled(true);
                        rd_comunicacion9_2.setEnabled(true);
                        rd_comunicacion11_2.setEnabled(true);
                    }
                        break;
                    case R.id.rd12_C3_2:
                        if (rd_comunicacion10_2.isChecked() == true){
                            Variables.setCom35_2(rd_comunicacion10_2.getText().toString());
                            rd_comunicacion10_3.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion8_2.setEnabled(false);
                            rd_comunicacion11_2.setEnabled(false);
                        }

                    case R.id.rd12_C3_3:
                        Variables.setCom35_3(rd_comunicacion10_3.getText().toString());
                        break;

                }
            }
        });
        //Artista
        rbg_comunicacion11 = findViewById(R.id.rbg12_C4);
        rd_comunicacion11_1 = findViewById(R.id.rd12_C4_1);
        rd_comunicacion11_2 = findViewById(R.id.rd12_C4_2);
        rd_comunicacion11_3 = findViewById(R.id.rd12_C4_3);
        rbg_comunicacion11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int im) {
                switch (im){
                    case R.id.rd12_C4_1:
                        if (rd_comunicacion11_1.isChecked() == true){
                            Variables.setCom36_1(rd_comunicacion11_1.getText().toString());
                            rd_comunicacion10_2.setEnabled(false);
                            rd_comunicacion10_3.setEnabled(false);
                            rd_comunicacion9_1.setEnabled(false);
                            rd_comunicacion8_1.setEnabled(false);
                            rd_comunicacion11_1.setEnabled(false);
                        }if (rd_comunicacion11_1.isChecked() == true){
                        rd_comunicacion8_2.setEnabled(true);
                        rd_comunicacion9_2.setEnabled(true);
                        rd_comunicacion11_2.setEnabled(true);
                    }
                        break;
                    case R.id.rd12_C4_2:
                        if (rd_comunicacion11_2.isChecked() == true){
                            Variables.setCom36_2(rd_comunicacion11_2.getText().toString());
                            rd_comunicacion8_2.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion10_2.setEnabled(false);
                        }
                        break;

                    case R.id.rd12_C4_3:
                        if (rd_comunicacion11_3.isChecked()){
                            Variables.setCom36_3(rd_comunicacion11_3.getText().toString());
                            Intent intent = new Intent(Comunicacion6Activity.this, Comunicacion7Activity.class);
                            startActivity(intent);
                        }
                        break;

                }
            }
        });

        //borra opcion Pregunta 9
        cambiarbutton11 = findViewById(R.id.Tv_CambiarComunicacion11);
        cambiarbutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton11.isClickable() == true){
                    rbg_comunicacion4.clearCheck();
                    rd_comunicacion4_1.setEnabled(true);
                    rd_comunicacion4_2.setEnabled(true);
                    rd_comunicacion4_3.setEnabled(true);
                    rbg_comunicacion5.clearCheck();
                    rd_comunicacion5_1.setEnabled(true);
                    rd_comunicacion5_2.setEnabled(true);
                    rd_comunicacion5_3.setEnabled(true);
                    rbg_comunicacion6.clearCheck();
                    rd_comunicacion6_1.setEnabled(true);
                    rd_comunicacion6_2.setEnabled(true);
                    rd_comunicacion6_3.setEnabled(true);
                    rbg_comunicacion7.clearCheck();
                    rd_comunicacion7_1.setEnabled(true);
                    rd_comunicacion7_2.setEnabled(true);
                    rd_comunicacion7_3.setEnabled(true);
                }

            }
        });
        //borra opcion Pregunta 10
        cambiarbutton12 = findViewById(R.id.Tv_CambiarComunicacion12);
        cambiarbutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton12.isClickable() == true){
                    rbg_comunicaicon8.clearCheck();
                    rd_comunicacion8_1.setEnabled(true);
                    rd_comunicacion8_2.setEnabled(true);
                    rd_comunicacion8_3.setEnabled(true);
                    rbg_comunicacion9.clearCheck();
                    rd_comunicacion9_1.setEnabled(true);
                    rd_comunicacion9_2.setEnabled(true);
                    rd_comunicacion9_3.setEnabled(true);
                    rbg_comunicacion10.clearCheck();
                    rd_comunicacion10_1.setEnabled(true);
                    rd_comunicacion10_2.setEnabled(true);
                    rd_comunicacion10_3.setEnabled(true);
                    rbg_comunicacion11.clearCheck();
                    rd_comunicacion11_1.setEnabled(true);
                    rd_comunicacion11_2.setEnabled(true);
                    rd_comunicacion11_3.setEnabled(true);
                }
            }
        });

    }
}