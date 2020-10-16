package com.devsteve.test.Comunicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.devsteve.test.R;

public class Comunicacion3Activity extends AppCompatActivity {

    private RadioGroup rbg_comunicacion4, rbg_comunicacion5, rbg_comunicacion6, rbg_comunicacion7,
            rbg_comunicaicon8, rbg_comunicacion9, rbg_comunicacion10,rbg_comunicacion11;
    private RadioButton rd_comunicacion4_1, rd_comunicacion4_2, rd_comunicacion4_3, rd_comunicacion5_1, rd_comunicacion5_2
            ,rd_comunicacion5_3, rd_comunicacion6_1, rd_comunicacion6_2, rd_comunicacion6_3, rd_comunicacion7_1, rd_comunicacion7_2,
            rd_comunicacion7_3, rd_comunicacion8_1, rd_comunicacion8_2, rd_comunicacion8_3, rd_comunicacion9_1, rd_comunicacion9_2, rd_comunicacion9_3
            ,rd_comunicacion10_1, rd_comunicacion10_2, rd_comunicacion10_3, rd_comunicacion11_1, rd_comunicacion11_2,
            rd_comunicacion11_3;

    private TextView cambiarbutton5, cambiarbutton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion3);

        //Analizar
        rbg_comunicacion4 = findViewById(R.id.rbg_Comunicacion1_);
        rd_comunicacion4_1 = findViewById(R.id.rd1_comunicacion1_1);
        rd_comunicacion4_2 = findViewById(R.id.rd1_comunicacion1_2);
        rd_comunicacion4_3 = findViewById(R.id.rd1_comunicacion1_3);
        rbg_comunicacion4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd1_comunicacion1_1:
                        if (rd_comunicacion4_1.isChecked() == true){
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

                    case R.id.rd1_comunicacion1_2:
                        if (rd_comunicacion4_2.isChecked() == false){
                            rd_comunicacion4_3.setEnabled(false);
                            rd_comunicacion5_2.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion7_2.setEnabled(false);
                        }
                        break;

                    case R.id.rd1_comunicacion1_3:

                        break;
                }
            }
        });
        //Desafios
        rbg_comunicacion5 = findViewById(R.id.rbg_Comunicacion2_);
        rd_comunicacion5_1 = findViewById(R.id.rd2_comunicacion2_1);
        rd_comunicacion5_2 = findViewById(R.id.rd2_comunicacion2_2);
        rd_comunicacion5_3 = findViewById(R.id.rd2_Comunicacion2_3);
        rbg_comunicacion5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ip) {

                switch (ip){
                    case R.id.rd2_comunicacion2_1:
                        if (rd_comunicacion5_1.isChecked() == true){
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

                    case R.id. rd2_comunicacion2_2:
                        if (rd_comunicacion5_2.isChecked()){
                            rd_comunicacion5_3.setEnabled(false);
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion7_2.setEnabled(false);
                        }
                        break;

                    case R.id. rd2_Comunicacion2_3:
                        break;
                }

            }
        });
        //Testimonios
        rbg_comunicacion6 = findViewById(R.id.rbg_Comunicacion3_);
        rd_comunicacion6_1 = findViewById(R.id.rd3_comunicacion3_1);
        rd_comunicacion6_2 = findViewById(R.id.rd3_comunicacion3_2);
        rd_comunicacion6_3 = findViewById(R.id.rd3_comunicacion3_3);
        rbg_comunicacion6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ids) {
                switch (ids){
                    case R.id.rd3_comunicacion3_1:
                        if (rd_comunicacion6_1.isChecked() == true){
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
                    case R.id.rd3_comunicacion3_2:
                        if (rd_comunicacion6_2.isChecked()){
                            rd_comunicacion6_3.setEnabled(false);
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion5_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd3_comunicacion3_3:
                        break;
                }
            }
        });
        //Innovacion
        rbg_comunicacion7 = findViewById(R.id.rbg_Comunicacion4_);
        rd_comunicacion7_1 = findViewById(R.id.rd4_comunicacion4_1);
        rd_comunicacion7_2 = findViewById(R.id.rd4_comunicacion4_2);
        rd_comunicacion7_3 = findViewById(R.id.rd4_comunicacion4_3);
        rbg_comunicacion7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ix) {
                switch (ix){
                    case R.id.rd4_comunicacion4_1:
                        if (rd_comunicacion7_1.isChecked()){
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
                    case R.id.rd4_comunicacion4_2:
                        if (rd_comunicacion7_2.isChecked()){
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion5_2.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion7_3.setEnabled(false);
                        }
                        break;
                    case R.id.rd4_comunicacion4_3:
                        break;
                }
            }
        });
        //--------------Pregunta6-----------
        //Ingeniero
        rbg_comunicaicon8 = findViewById(R.id.rbg_Comunicacion5_);
        rd_comunicacion8_1 = findViewById(R.id.rd5_Comunicacion5_1);
        rd_comunicacion8_2 = findViewById(R.id.rd5_Comunicacion5_2);
        rd_comunicacion8_3 = findViewById(R.id.rd5_Comunicacion5_3);
        rbg_comunicaicon8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ifd) {
                switch (ifd){
                    case R.id.rd5_Comunicacion5_1:
                        if (rd_comunicacion8_1.isChecked() == true){
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
                    case R.id.rd5_Comunicacion5_2:
                        if (rd_comunicacion8_2.isChecked()){
                            rd_comunicacion8_3.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion10_2.setEnabled(false);
                            rd_comunicacion11_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd5_Comunicacion5_3:
                        break;
                }
            }
        });
        //Director
        rbg_comunicacion9 = findViewById(R.id.rbg_Comunicacion6_);
        rd_comunicacion9_1 = findViewById(R.id.rd6_Comunicacion6_1);
        rd_comunicacion9_2 = findViewById(R.id.rd6_Comunicacion6_2);
        rd_comunicacion9_3 = findViewById(R.id.rd6_Comunicacion6_3);
        rbg_comunicacion9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ch) {
                switch (ch){
                    case R.id.rd6_Comunicacion6_1:
                        if (rd_comunicacion9_1.isChecked() == true){
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
                    case R.id.rd6_Comunicacion6_2:
                        if (rd_comunicacion9_2.isChecked() == true){
                            rd_comunicacion9_3.setEnabled(false);
                            rd_comunicacion10_2.setEnabled(false);
                            rd_comunicacion11_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd6_Comunicacion6_3:
                        break;
                }
            }
        });
        //Maestro
        rbg_comunicacion10 = findViewById(R.id.rbg_Comunicacion7_);
        rd_comunicacion10_1 = findViewById(R.id.rd7_comunicacion7_1);
        rd_comunicacion10_2 = findViewById(R.id.rd7_comunicacion7_2);
        rd_comunicacion10_3 = findViewById(R.id.rd7_comunicacion7_3);
        rbg_comunicacion10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int irl) {
                switch (irl){
                    case R.id.rd7_comunicacion7_1:
                        if (rd_comunicacion10_1.isChecked() == true){
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
                    case R.id.rd7_comunicacion7_2:
                        if (rd_comunicacion10_2.isChecked() == true){
                            rd_comunicacion10_3.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion8_2.setEnabled(false);
                            rd_comunicacion11_2.setEnabled(false);
                        }

                }
            }
        });
        //Artista
        rbg_comunicacion11 = findViewById(R.id.rbg_Comunicacion8_);
        rd_comunicacion11_1 = findViewById(R.id.rd8_comunicacion8_1);
        rd_comunicacion11_2 = findViewById(R.id.rd8_comunicacion8_2);
        rd_comunicacion11_3 = findViewById(R.id.rd8_comunicacion8_3);
        rbg_comunicacion11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int im) {
                switch (im){
                    case R.id.rd8_comunicacion8_1:
                        if (rd_comunicacion11_1.isChecked() == true){
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
                    case R.id.rd8_comunicacion8_2:
                        if (rd_comunicacion11_2.isChecked() == true){
                            rd_comunicacion8_2.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion10_2.setEnabled(false);
                        }
                        break;

                    case R.id.rd8_comunicacion8_3:
                        if (rd_comunicacion11_3.isChecked()){
                            Intent intent = new Intent(Comunicacion3Activity.this, Comunicacion4Activity.class);
                            startActivity(intent);
                        }
                        break;

                }
            }
        });

        //borra opcion Pregunta 5
        cambiarbutton5 = findViewById(R.id.Tv_CambiarComunicacion5);
        cambiarbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton5.isClickable() == true){
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
        //borra opcion Pregunta 6
        cambiarbutton6 = findViewById(R.id.Tv_CambiarComunicacion6);
        cambiarbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton6.isClickable() == true){
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