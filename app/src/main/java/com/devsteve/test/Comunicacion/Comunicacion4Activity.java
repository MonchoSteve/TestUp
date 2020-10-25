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

public class Comunicacion4Activity extends AppCompatActivity {

    private RadioGroup rbg_comunicacion4, rbg_comunicacion5, rbg_comunicacion6, rbg_comunicacion7,
            rbg_comunicaicon8, rbg_comunicacion9, rbg_comunicacion10,rbg_comunicacion11;
    private RadioButton rd_comunicacion4_1, rd_comunicacion4_2, rd_comunicacion4_3, rd_comunicacion5_1, rd_comunicacion5_2
            ,rd_comunicacion5_3, rd_comunicacion6_1, rd_comunicacion6_2, rd_comunicacion6_3, rd_comunicacion7_1, rd_comunicacion7_2,
            rd_comunicacion7_3, rd_comunicacion8_1, rd_comunicacion8_2, rd_comunicacion8_3, rd_comunicacion9_1, rd_comunicacion9_2, rd_comunicacion9_3
            ,rd_comunicacion10_1, rd_comunicacion10_2, rd_comunicacion10_3, rd_comunicacion11_1, rd_comunicacion11_2,
            rd_comunicacion11_3;

    private TextView cambiarbutton7, cambiarbutton8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion4);


        //Datos
        rbg_comunicacion4 = findViewById(R.id.rbg7_C1);
        rd_comunicacion4_1 = findViewById(R.id.rd7_C1_1);
        rd_comunicacion4_2 = findViewById(R.id.rd7_C1_2);
        rd_comunicacion4_3 = findViewById(R.id.rd7_C1_3);
        rbg_comunicacion4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd7_C1_1:
                        if (rd_comunicacion4_1.isChecked() == true){
                            Variables.setCom19(rd_comunicacion4_1.getText().toString());
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

                    case R.id.rd7_C1_2:
                        if (rd_comunicacion4_2.isChecked() == false){
                            Variables.setCom20(rd_comunicacion4_2.getText().toString());
                            rd_comunicacion4_3.setEnabled(false);
                            rd_comunicacion5_2.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion7_2.setEnabled(false);
                        }
                        break;

                    case R.id.rd7_C1_3:
                        Variables.setCom21(rd_comunicacion4_3.getText().toString());
                        break;
                }
            }
        });
        //Desafios
        rbg_comunicacion5 = findViewById(R.id.rbg7_C2);
        rd_comunicacion5_1 = findViewById(R.id.rd7_C2_1);
        rd_comunicacion5_2 = findViewById(R.id.rd7_C2_2);
        rd_comunicacion5_3 = findViewById(R.id.rd7_C2_3);
        rbg_comunicacion5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ip) {

                switch (ip){
                    case R.id.rd7_C2_1:
                        if (rd_comunicacion5_1.isChecked() == true){
                            Variables.setCom19_1(rd_comunicacion5_1.getText().toString());
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

                    case R.id. rd7_C2_2:
                        if (rd_comunicacion5_2.isChecked()){
                            Variables.setCom19_2(rd_comunicacion5_2.getText().toString());
                            rd_comunicacion5_3.setEnabled(false);
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion7_2.setEnabled(false);
                        }
                        break;

                    case R.id.rd7_C2_3:
                        Variables.setCom19_3(rd_comunicacion5_3.getText().toString());
                        break;
                }

            }
        });
        //Testimonios
        rbg_comunicacion6 = findViewById(R.id.rbg7_C3);
        rd_comunicacion6_1 = findViewById(R.id.rd7_C3_1);
        rd_comunicacion6_2 = findViewById(R.id.rd7_C3_2);
        rd_comunicacion6_3 = findViewById(R.id.rd7_C3_3);
        rbg_comunicacion6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ids) {
                switch (ids){
                    case R.id.rd7_C3_1:
                        if (rd_comunicacion6_1.isChecked() == true){
                            Variables.setCom20_1(rd_comunicacion6_1.getText().toString());
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
                    case R.id.rd7_C3_2:
                        if (rd_comunicacion6_2.isChecked()){
                            Variables.setCom20_2(rd_comunicacion6_2.getText().toString());
                            rd_comunicacion6_3.setEnabled(false);
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion5_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd7_C3_3:
                        Variables.setCom20_3(rd_comunicacion6_3.getText().toString());
                        break;
                }
            }
        });
        //Innovacion
        rbg_comunicacion7 = findViewById(R.id.rbg7_C4);
        rd_comunicacion7_1 = findViewById(R.id.rd7_C4_1);
        rd_comunicacion7_2 = findViewById(R.id.rd7_C4_2);
        rd_comunicacion7_3 = findViewById(R.id.rd7_C4_3);
        rbg_comunicacion7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ix) {
                switch (ix){
                    case R.id.rd7_C4_1:
                        if (rd_comunicacion7_1.isChecked()){
                            Variables.setCom21_1(rd_comunicacion7_1.getText().toString());
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
                    case R.id.rd7_C4_2:
                        if (rd_comunicacion7_2.isChecked()){
                            Variables.setCom21_2(rd_comunicacion7_2.getText().toString());
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion5_2.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion7_3.setEnabled(false);
                        }
                        break;
                    case R.id.rd7_C4_3:
                        Variables.setCom21_3(rd_comunicacion7_3.getText().toString());
                        break;
                }
            }
        });
        //--------------Pregunta 8-----------
        //Ingeniero
        rbg_comunicaicon8 = findViewById(R.id.rbg8_C1);
        rd_comunicacion8_1 = findViewById(R.id.rd8_C1_1);
        rd_comunicacion8_2 = findViewById(R.id.rd8_C1_2);
        rd_comunicacion8_3 = findViewById(R.id.rd8_C1_3);
        rbg_comunicaicon8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ifd) {
                switch (ifd){
                    case R.id.rd8_C1_1:
                        if (rd_comunicacion8_1.isChecked() == true){
                            Variables.setCom22(rd_comunicacion8_1.getText().toString());
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
                    case R.id.rd8_C1_2:
                        if (rd_comunicacion8_2.isChecked()){
                            Variables.setCom23(rd_comunicacion8_2.getText().toString());
                            rd_comunicacion8_3.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion10_2.setEnabled(false);
                            rd_comunicacion11_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd8_C1_3:
                        Variables.setCom24(rd_comunicacion8_3.getText().toString());
                        break;
                }
            }
        });
        //Director
        rbg_comunicacion9 = findViewById(R.id.rbg8_C2);
        rd_comunicacion9_1 = findViewById(R.id.rd8_C2_1);
        rd_comunicacion9_2 = findViewById(R.id.rd8_C2_2);
        rd_comunicacion9_3 = findViewById(R.id.rd8_C2_3);
        rbg_comunicacion9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ch) {
                switch (ch){
                    case R.id.rd8_C2_1:
                        if (rd_comunicacion9_1.isChecked() == true){
                            Variables.setCom22_1(rd_comunicacion9_1.getText().toString());
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
                    case R.id.rd8_C2_2:
                        if (rd_comunicacion9_2.isChecked() == true){
                            Variables.setCom22_2(rd_comunicacion9_2.getText().toString());
                            rd_comunicacion9_3.setEnabled(false);
                            rd_comunicacion10_2.setEnabled(false);
                            rd_comunicacion11_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd8_C2_3:
                        Variables.setCom22_3(rd_comunicacion9_3.getText().toString());
                        break;
                }
            }
        });
        //Maestro
        rbg_comunicacion10 = findViewById(R.id.rbg8_C3);
        rd_comunicacion10_1 = findViewById(R.id.rd8_C3_1);
        rd_comunicacion10_2 = findViewById(R.id.rd8_C3_2);
        rd_comunicacion10_3 = findViewById(R.id.rd8_C3_3);
        rbg_comunicacion10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int irl) {
                switch (irl){
                    case R.id.rd8_C3_1:
                        if (rd_comunicacion10_1.isChecked() == true){
                            Variables.setCom23_1(rd_comunicacion10_1.getText().toString());
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
                    case R.id.rd8_C3_2:
                        if (rd_comunicacion10_2.isChecked() == true){
                            Variables.setCom23_2(rd_comunicacion10_2.getText().toString());
                            rd_comunicacion10_3.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion8_2.setEnabled(false);
                            rd_comunicacion11_2.setEnabled(false);
                        }

                    case R.id.rd8_C3_3:
                        Variables.setCom23_3(rd_comunicacion10_3.getText().toString());
                        break;

                }
            }
        });
        //Artista
        rbg_comunicacion11 = findViewById(R.id.rbg8_C4);
        rd_comunicacion11_1 = findViewById(R.id.rd8_C4_1);
        rd_comunicacion11_2 = findViewById(R.id.rd8_C4_2);
        rd_comunicacion11_3 = findViewById(R.id.rd8_C4_3);
        rbg_comunicacion11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int im) {
                switch (im){
                    case R.id.rd8_C4_1:
                        if (rd_comunicacion11_1.isChecked() == true){
                            Variables.setCom24_1(rd_comunicacion11_1.getText().toString());
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
                    case R.id.rd8_C4_2:
                        if (rd_comunicacion11_2.isChecked() == true){
                            Variables.setCom24_2(rd_comunicacion11_2.getText().toString());
                            rd_comunicacion8_2.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion10_2.setEnabled(false);
                        }
                        break;

                    case R.id.rd8_C4_3:
                        if (rd_comunicacion11_3.isChecked()){
                            Variables.setCom24_3(rd_comunicacion11_3.getText().toString());
                            Intent intent = new Intent(Comunicacion4Activity.this, Comunicacion5Activity.class);
                            startActivity(intent);
                        }
                        break;

                }
            }
        });

        //borra opcion Pregunta 7
        cambiarbutton7 = findViewById(R.id.Tv_CambiarComunicacion7);
        cambiarbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton7.isClickable() == true){
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
        //borra opcion Pregunta 8
        cambiarbutton8 = findViewById(R.id.Tv_CambiarComunicacion8);
        cambiarbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton8.isClickable() == true){
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