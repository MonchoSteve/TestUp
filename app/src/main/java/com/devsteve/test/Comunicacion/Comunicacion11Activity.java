package com.devsteve.test.Comunicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.devsteve.test.Cerebro.CerebroActivity;
import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Comunicacion11Activity extends AppCompatActivity {

    private RadioGroup rbg_comunicacion4, rbg_comunicacion5, rbg_comunicacion6, rbg_comunicacion7,
            rbg_comunicaicon8, rbg_comunicacion9, rbg_comunicacion10,rbg_comunicacion11;
    private RadioButton rd_comunicacion4_1, rd_comunicacion4_2, rd_comunicacion4_3, rd_comunicacion5_1, rd_comunicacion5_2
            ,rd_comunicacion5_3, rd_comunicacion6_1, rd_comunicacion6_2, rd_comunicacion6_3, rd_comunicacion7_1, rd_comunicacion7_2,
            rd_comunicacion7_3, rd_comunicacion8_1, rd_comunicacion8_2, rd_comunicacion8_3, rd_comunicacion9_1, rd_comunicacion9_2, rd_comunicacion9_3
            ,rd_comunicacion10_1, rd_comunicacion10_2, rd_comunicacion10_3, rd_comunicacion11_1, rd_comunicacion11_2,
            rd_comunicacion11_3;

    private TextView cambiarbutton15, cambiarbutton16;
    private Button continuarComunicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion11);

        //Datos
        rbg_comunicacion4 = findViewById(R.id.rbg21_C1);
        rd_comunicacion4_1 = findViewById(R.id.rd21_C1_1);
        rd_comunicacion4_2 = findViewById(R.id.rd21_C1_2);
        rd_comunicacion4_3 = findViewById(R.id.rd21_C1_3);
        rbg_comunicacion4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd21_C1_1:
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

                    case R.id.rd21_C1_2:
                        if (rd_comunicacion4_2.isChecked() == false){
                            rd_comunicacion4_3.setEnabled(false);
                            rd_comunicacion5_2.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion7_2.setEnabled(false);
                        }
                        break;

                    case R.id.rd21_C1_3:

                        break;
                }
            }
        });
        //Desafios
        rbg_comunicacion5 = findViewById(R.id.rbg21_C2);
        rd_comunicacion5_1 = findViewById(R.id.rd21_C2_1);
        rd_comunicacion5_2 = findViewById(R.id.rd21_C2_2);
        rd_comunicacion5_3 = findViewById(R.id.rd21_C2_3);
        rbg_comunicacion5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ip) {

                switch (ip){
                    case R.id.rd21_C2_1:
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

                    case R.id.rd21_C2_2:
                        if (rd_comunicacion5_2.isChecked()){
                            rd_comunicacion5_3.setEnabled(false);
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion7_2.setEnabled(false);
                        }
                        break;

                    case R.id.rd21_C2_3:
                        break;
                }

            }
        });
        //Testimonios
        rbg_comunicacion6 = findViewById(R.id.rbg21_C3);
        rd_comunicacion6_1 = findViewById(R.id.rd21_C3_1);
        rd_comunicacion6_2 = findViewById(R.id.rd21_C3_2);
        rd_comunicacion6_3 = findViewById(R.id.rd21_C3_3);
        rbg_comunicacion6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ids) {
                switch (ids){
                    case R.id.rd21_C3_1:
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
                    case R.id.rd21_C3_2:
                        if (rd_comunicacion6_2.isChecked()){
                            rd_comunicacion6_3.setEnabled(false);
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion5_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd21_C3_3:
                        break;
                }
            }
        });
        //Innovacion
        rbg_comunicacion7 = findViewById(R.id.rbg21_C4);
        rd_comunicacion7_1 = findViewById(R.id.rd21_C4_1);
        rd_comunicacion7_2 = findViewById(R.id.rd21_C4_2);
        rd_comunicacion7_3 = findViewById(R.id.rd21_C4_3);
        rbg_comunicacion7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ix) {
                switch (ix){
                    case R.id.rd21_C4_1:
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
                    case R.id.rd21_C4_2:
                        if (rd_comunicacion7_2.isChecked()){
                            rd_comunicacion4_2.setEnabled(false);
                            rd_comunicacion5_2.setEnabled(false);
                            rd_comunicacion6_2.setEnabled(false);
                            rd_comunicacion7_3.setEnabled(false);
                        }
                        break;
                    case R.id.rd21_C4_3:
                        break;
                }
            }
        });
        //--------------Pregunta22-----------
        //Ingeniero
        rbg_comunicaicon8 = findViewById(R.id.rbg22_C1);
        rd_comunicacion8_1 = findViewById(R.id.rd22_C1_1);
        rd_comunicacion8_2 = findViewById(R.id.rd22_C1_2);
        rd_comunicacion8_3 = findViewById(R.id.rd22_C1_3);
        rbg_comunicaicon8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ifd) {
                switch (ifd){
                    case R.id.rd22_C1_1:
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
                    case R.id.rd22_C1_2:
                        if (rd_comunicacion8_2.isChecked()){
                            rd_comunicacion8_3.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion10_2.setEnabled(false);
                            rd_comunicacion11_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd22_C1_3:
                        break;
                }
            }
        });
        //Director
        rbg_comunicacion9 = findViewById(R.id.rbg22_C2);
        rd_comunicacion9_1 = findViewById(R.id.rd22_C2_1);
        rd_comunicacion9_2 = findViewById(R.id.rd22_C2_2);
        rd_comunicacion9_3 = findViewById(R.id.rd22_C2_3);
        rbg_comunicacion9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ch) {
                switch (ch){
                    case R.id.rd22_C2_1:
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
                    case R.id.rd22_C2_2:
                        if (rd_comunicacion9_2.isChecked() == true){
                            rd_comunicacion9_3.setEnabled(false);
                            rd_comunicacion10_2.setEnabled(false);
                            rd_comunicacion11_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd22_C2_3:
                        break;
                }
            }
        });
        //Maestro
        rbg_comunicacion10 = findViewById(R.id.rbg22_C3);
        rd_comunicacion10_1 = findViewById(R.id.rd22_C3_1);
        rd_comunicacion10_2 = findViewById(R.id.rd22_C3_2);
        rd_comunicacion10_3 = findViewById(R.id.rd22_C3_3);
        rbg_comunicacion10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int irl) {
                switch (irl){
                    case R.id.rd22_C3_1:
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
                    case R.id.rd22_C3_2:
                        if (rd_comunicacion10_2.isChecked() == true){
                            rd_comunicacion10_3.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion8_2.setEnabled(false);
                            rd_comunicacion11_2.setEnabled(false);
                        }
                        break;
                    case R.id.rd22_C3_3:
                        break;

                }
            }
        });
        //Artista
        rbg_comunicacion11 = findViewById(R.id.rbg22_C4);
        rd_comunicacion11_1 = findViewById(R.id.rd22_C4_1);
        rd_comunicacion11_2 = findViewById(R.id.rd22_C4_2);
        rd_comunicacion11_3 = findViewById(R.id.rd22_C4_3);
        rbg_comunicacion11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int im) {
                switch (im){
                    case R.id.rd22_C4_1:
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
                    case R.id.rd22_C4_2:
                        if (rd_comunicacion11_2.isChecked() == true){
                            rd_comunicacion8_2.setEnabled(false);
                            rd_comunicacion9_2.setEnabled(false);
                            rd_comunicacion10_2.setEnabled(false);
                        }
                        break;

                    case R.id.rd22_C4_3:
                        if (rd_comunicacion11_3.isChecked()){
                        }
                        break;

                }
            }
        });

        //borra opcion Pregunta 17
        cambiarbutton15 = findViewById(R.id.Tv_CambiarComunicacion21);
        cambiarbutton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton15.isClickable() == true){
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
        //borra opcion Pregunta 18
        cambiarbutton16 = findViewById(R.id.Tv_CambiarComunicacion22);
        cambiarbutton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cambiarbutton16.isClickable() == true){
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

        ///Boton de enviar
        continuarComunicacion = findViewById(R.id.Btn_EnviarComunicacion);
        continuarComunicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Validar();
            }
        });

    }

    private void Validar() {
        /////Pregunta 1
        String comu1 = Variables.getCom1();
        String comu2 = Variables.getCom2();
        String comu3 = Variables.getCom3();
        String comu1_1 = Variables.getCom1_1();
        String comu1_2 = Variables.getCom1_2();
        String comu1_3 = Variables.getCom1_3();
        String comu2_1 = Variables.getCom2_1();
        String comu2_2 = Variables.getCom2_2();
        String comu2_3 = Variables.getCom2_3();
        String comu3_1 = Variables.getCom3_1();
        String comu3_2 = Variables.getCom3_2();
        String comu3_3 = Variables.getCom3_3();
       ////Pregunta 2
        String comu4 = Variables.getCom4();
        String comu5 = Variables.getCom5();
        String comu6 = Variables.getCom6();
        String comu4_1 = Variables.getCom4_1();
        String comu4_2 = Variables.getCom4_2();
        String comu4_3 = Variables.getCom4_3();
        String comu5_1 = Variables.getCom5_1();
        String comu5_2 = Variables.getCom5_2();
        String comu5_3 = Variables.getCom5_3();
        String comu6_1 = Variables.getCom6_1();
        String comu6_2 = Variables.getCom6_2();
        String comu6_3 = Variables.getCom6_3();
        ////-------------Pregunta 3----------------
        String comu7 = Variables.getCom7();
        String comu8 = Variables.getCom8();
        String comu9 = Variables.getCom9();
        String comu7_1 = Variables.getCom7_1();
        String comu7_2 = Variables.getCom7_2();
        String comu7_3 = Variables.getCom7_3();
        String comu8_1 = Variables.getCom8_1();
        String comu8_2 = Variables.getCom8_2();
        String comu8_3 = Variables.getCom8_3();
        String comu9_1 = Variables.getCom9_1();
        String comu9_2 = Variables.getCom9_2();
        String comu9_3 = Variables.getCom9_3();
        //-------Pregunta 4------------------------------
        String comu10 = Variables.getCom10();
        String comu11 = Variables.getCom11();
        String comu12 = Variables.getCom12();
        String comu10_1 = Variables.getCom10_1();
        String comu10_2 = Variables.getCom10_2();
        String comu10_3 = Variables.getCom10_3();
        String comu11_1 = Variables.getCom11_1();
        String comu11_2 = Variables.getCom11_2();
        String comu11_3 = Variables.getCom11_3();
        String comu12_1 = Variables.getCom12_1();
        String comu12_2 = Variables.getCom12_2();
        String comu12_3 = Variables.getCom12_3();
        //---------------Pregunta 5-------------------
        String comu13 = Variables.getCom13();
        String comu14 = Variables.getCom14();
        String comu15 = Variables.getCom15();
        String comu13_1 = Variables.getCom13_1();
        String comu13_2 = Variables.getCom13_2();
        String comu13_3 = Variables.getCom13_3();
        String comu14_1 = Variables.getCom14_1();
        String comu14_2 = Variables.getCom14_2();
        String comu14_3 = Variables.getCom14_3();
        String comu15_1 = Variables.getCom15_1();
        String comu15_2 = Variables.getCom15_2();
        String comu15_3 = Variables.getCom15_3();
        ///--------------Pregunta 6------------------
        String comu16 = Variables.getCom16();
        String comu17 = Variables.getCom17();
        String comu18 = Variables.getCom18();
        String comu16_1 = Variables.getCom16_1();
        String comu16_2 = Variables.getCom16_2();
        String comu16_3 = Variables.getCom16_3();
        String comu17_1 = Variables.getCom17_1();
        String comu17_2 = Variables.getCom17_2();
        String comu17_3 = Variables.getCom17_3();
        String comu18_1 = Variables.getCom18_1();
        String comu18_2 = Variables.getCom18_2();
        String comu18_3 = Variables.getCom18_3();
        //----------------Pregunta 7----------------
        String comu19 = Variables.getCom19();
        String comu20 = Variables.getCom20();
        String comu21 = Variables.getCom21();
        String comu19_1 = Variables.getCom19_1();
        String comu19_2 = Variables.getCom19_2();
        String comu19_3 = Variables.getCom19_3();
        String comu20_1 = Variables.getCom20_1();
        String comu20_2 = Variables.getCom20_2();
        String comu20_3 = Variables.getCom20_3();
        String comu21_1 = Variables.getCom21_1();
        String comu21_2 = Variables.getCom21_2();
        String comu21_3 = Variables.getCom21_3();
        //*-------------Pregunta 8---------------
        String comu22 = Variables.getCom22();
        String comu23 = Variables.getCom23();
        String comu24 = Variables.getCom24();
        String comu22_1 = Variables.getCom22_1();
        String comu22_2 = Variables.getCom22_2();
        String comu22_3 = Variables.getCom22_3();
        String comu23_1 = Variables.getCom23_1();
        String comu23_2 = Variables.getCom23_2();
        String comu23_3 = Variables.getCom23_3();
        String comu24_1 = Variables.getCom24_1();
        String comu24_2 = Variables.getCom24_2();
        String comu24_3 = Variables.getCom24_3();
        //----------PREGUNTA 9--------------------
        String comu25 = Variables.getCom25();
        String comu26 = Variables.getCom26();
        String comu27 = Variables.getCom26();
        String comu25_1 = Variables.getCom25_1();
        String comu25_2 = Variables.getCom25_2();
        String comu25_3 = Variables.getCom25_3();
        String comu26_1 = Variables.getCom26_1();
        String comu26_2 = Variables.getCom26_2();
        String comu26_3 = Variables.getCom26_3();
        String comu27_1 = Variables.getCom27_1();
        String comu27_2 = Variables.getCom27_2();
        String comu27_3 = Variables.getCom27_3();
        //-----------------PREGUNTA 10-----------------
        String comu28 = Variables.getCom28();
        String comu29 = Variables.getCom29();
        String comu30 = Variables.getCom30();
        String comu28_1 = Variables.getCom28_1();
        String comu28_2 = Variables.getCom28_2();
        String comu28_3 = Variables.getCom28_3();
        String comu29_1 = Variables.getCom29_1();
        String comu29_2 = Variables.getCom29_2();
        String comu29_3 = Variables.getCom29_3();
        String comu30_1 = Variables.getCom30_1();
        String comu30_2 = Variables.getCom30_2();
        String comu30_3 = Variables.getCom30_3();
        //----------------PREGUNTA 11--------------
        String comu31 = Variables.getCom31();
        String comu32 = Variables.getCom32();
        String comu33 = Variables.getCom33();
        String comu31_1 = Variables.getCom31_1();
        String comu31_2 = Variables.getCom32_2();
        String comu31_3 = Variables.getCom33_3();
        String comu32_1 = Variables.getCom32_1();
        String comu32_2 = Variables.getCom32_2();
        String comu32_3 = Variables.getCom32_3();
        String comu33_1 = Variables.getCom33_1();
        String comu33_2 = Variables.getCom33_2();
        String comu33_3 = Variables.getCom33_3();
        //-----------------PREGUNTA 12-------------
        String comu34 = Variables.getCom34();
        String comu35 = Variables.getCom35();
        String comu36 = Variables.getCom36();
        String comu34_1 = Variables.getCom34_1();
        String comu34_2 = Variables.getCom34_2();
        String comu34_3 = Variables.getCom34_3();
        String comu35_1 = Variables.getCom35_1();
        String comu35_2 = Variables.getCom35_2();
        String comu35_3 = Variables.getCom35_3();
        String comu36_1 = Variables.getCom36_1();
        String comu36_2 = Variables.getCom36_2();
        String comu36_3 = Variables.getCom36_3();
        //------------PREGUNTA 13---------------------
        String comu37 = Variables.getCom37();
        String comu38 = Variables.getCom38();
        String comu39 = Variables.getCom39();
        String comu37_1 = Variables.getCom37_1();
        String comu37_2 = Variables.getCom37_2();
        String comu37_3 = Variables.getCom37_3();
        String comu38_1 = Variables.getCom38_1();
        String comu38_2 = Variables.getCom38_2();
        String comu38_3 = Variables.getCom38_3();
        String comu39_1 = Variables.getCom39_1();
        String comu39_2 = Variables.getCom39_2();
        String comu39_3 = Variables.getCom39_3();
        /////////////-POREGUNTA 14---------------
        String comu40 = Variables.getCom40();
        String comu41 = Variables.getCom41();
        String comu42 = Variables.getCom42();
        String comu40_1 = Variables.getCom40_1();
        String comu40_2 = Variables.getCom40_2();
        String comu40_3 = Variables.getCom40_3();
        String comu41_1 = Variables.getCom41_1();
        String comu41_2 = Variables.getCom41_2();
        String comu41_3 = Variables.getCom41_3();
        String comu42_1 = Variables.getCom42_1();
        String comu42_2 = Variables.getCom42_2();
        String comu42_3 = Variables.getCom42_3();
        //-----------PREGUNTA 15-----------------
        String comu43 = Variables.getCom43();
        String comu44 = Variables.getCom44();
        String comu45 = Variables.getCom45();
        String comu43_1 = Variables.getCom43_1();
        String comu43_2 = Variables.getCom43_2();
        String comu43_3 = Variables.getCom43_3();
        String comu44_1 = Variables.getCom43_1();
        String comu44_2 = Variables.getCom44_2();
        String comu44_3 = Variables.getCom44_3();
        String comu45_1 = Variables.getCom45_1();
        String comu45_2 = Variables.getCom45_2();
        String comu45_3 = Variables.getCom45_3();
        //-------------------PREGUNTA 16---------------
        String comu46 = Variables.getCom46();
        String comu47 = Variables.getCom47();
        String comu48 = Variables.getCom48();
        String comu46_1 = Variables.getCom46_1();
        String comu46_2 = Variables.getCom46_2();
        String comu46_3 = Variables.getCom46_3();
        String comu47_1 = Variables.getCom47_1();
        String comu47_2 = Variables.getCom47_2();
        String comu47_3 = Variables.getCom47_3();
        String comu48_1 = Variables.getCom48_1();
        String comu48_2 = Variables.getCom48_2();
        String comu48_3 = Variables.getCom48_3();
        /////----------PREGUNTA 17-----------------
        String comu49 = Variables.getCom49();
        String comu50 = Variables.getCom50();
        String comu51 = Variables.getCom51();
        String comu49_1 = Variables.getCom49_1();
        String comu49_2 = Variables.getCom49_2();
        String comu49_3 = Variables.getCom49_3();
        String comu50_1 = Variables.getCom50_1();
        String comu50_2 = Variables.getCom50_2();
        String comu50_3 = Variables.getCom50_3();
        String comu51_1 = Variables.getCom51_1();
        String comu51_2 = Variables.getCom51_2();
        String comu51_3 = Variables.getCom51_3();
        ///------------PREGUNTA 18----------------
        String comu52 = Variables.getCom52();
        String comu53 = Variables.getCom53();
        String comu54 = Variables.getCom54();
        String comu52_1 = Variables.getCom52_1();
        String comu52_2 = Variables.getCom52_2();
        String comu52_3 = Variables.getCom52_3();
        String comu53_1 = Variables.getCom53_1();
        String comu53_2 = Variables.getCom53_2();
        String comu53_3 = Variables.getCom53_3();
        String comu54_1 = Variables.getCom54_1();
        String comu54_2 = Variables.getCom54_2();
        String comu54_3 = Variables.getCom54_3();
        //-----------PREGUNTA 19-------------------
        String comu55 = Variables.getCom55();
        String comu56 = Variables.getCom56();
        String comu57 = Variables.getCom57();
        String comu55_1 = Variables.getCom55_1();
        String comu55_2 = Variables.getCom55_2();
        String comu55_3 = Variables.getCom55_3();
        String comu56_1 = Variables.getCom56_1();
        String comu56_2 = Variables.getCom56_2();
        String comu56_3 = Variables.getCom56_3();
        String comu57_1 = Variables.getCom57_1();
        String comu57_2 = Variables.getCom57_2();
        String comu57_3 = Variables.getCom57_3();

        if (comu1.isEmpty()==true && comu2.isEmpty() && comu3.isEmpty() == true && comu1_1.isEmpty() && comu1_2.isEmpty() && comu1_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios", Toast.LENGTH_SHORT).show();

        }else  if (comu2_1.isEmpty() == true && comu2_2.isEmpty() && comu2_3.isEmpty() && comu3_1.isEmpty()== true && comu3_2.isEmpty() && comu3_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios", Toast.LENGTH_SHORT).show();

        }else if (comu4.isEmpty()==true && comu5.isEmpty() && comu6.isEmpty() == true && comu4_1.isEmpty() && comu4_2.isEmpty() && comu4_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 2", Toast.LENGTH_SHORT).show();

        }else if (comu5_1.isEmpty() == true && comu5_2.isEmpty() && comu5_3.isEmpty() && comu6_1.isEmpty()== true && comu6_2.isEmpty() && comu6_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 2", Toast.LENGTH_SHORT).show();

        }else if (comu7.isEmpty()==true && comu8.isEmpty() && comu9.isEmpty() == true && comu7_1.isEmpty() && comu7_2.isEmpty() && comu7_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 3", Toast.LENGTH_SHORT).show();

        }else if (comu8_1.isEmpty() == true && comu8_2.isEmpty() && comu8_3.isEmpty() && comu9_1.isEmpty()== true && comu9_2.isEmpty() && comu9_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 3", Toast.LENGTH_SHORT).show();

        }else if (comu10.isEmpty()==true && comu11.isEmpty() && comu12.isEmpty() == true && comu10_1.isEmpty() && comu10_2.isEmpty() && comu10_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 4", Toast.LENGTH_SHORT).show();

        }else if (comu11_1.isEmpty() == true && comu11_2.isEmpty() && comu11_3.isEmpty() && comu12_1.isEmpty()== true && comu12_2.isEmpty() && comu12_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 4", Toast.LENGTH_SHORT).show();

        }else if (comu13.isEmpty() && comu14.isEmpty() && comu15.isEmpty() == true && comu13_1.isEmpty() && comu13_2.isEmpty() && comu13_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 5", Toast.LENGTH_SHORT).show();

        }else if (comu14_1.isEmpty() && comu14_2.isEmpty() && comu14_3.isEmpty() && comu15_1.isEmpty()== true && comu15_2.isEmpty() && comu15_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 5", Toast.LENGTH_SHORT).show();

        }else if (!comu16.isEmpty()==true && comu17.isEmpty() && comu18.isEmpty() == true && comu16_1.isEmpty() && comu16_2.isEmpty() && comu16_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 6", Toast.LENGTH_SHORT).show();

        }else if (comu17_1.isEmpty() == true && comu17_2.isEmpty() && comu17_3.isEmpty() && comu18_1.isEmpty()== true && comu18_2.isEmpty() && comu18_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 6", Toast.LENGTH_SHORT).show();

        }else if (comu19.isEmpty()==true && comu20.isEmpty() && comu21.isEmpty() == true && comu19_1.isEmpty() && comu19_2.isEmpty() && comu19_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 7", Toast.LENGTH_SHORT).show();

        }else if (comu20_1.isEmpty() == true && comu20_2.isEmpty() && comu20_3.isEmpty() && comu21_1.isEmpty()== true && comu21_2.isEmpty() && comu21_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 7", Toast.LENGTH_SHORT).show();

        }else if (comu22.isEmpty()==true && comu23.isEmpty() && comu24.isEmpty() == true && comu22_1.isEmpty() && comu22_2.isEmpty() && comu22_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 8", Toast.LENGTH_SHORT).show();

        }else if (comu23_1.isEmpty() == true && comu23_2.isEmpty() && comu23_3.isEmpty() && comu24_1.isEmpty()== true && comu24_2.isEmpty() && comu24_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 8", Toast.LENGTH_SHORT).show();

        }else if (comu25.isEmpty()==true && comu26.isEmpty() && comu27.isEmpty() == true && comu25_1.isEmpty() && comu25_2.isEmpty() && comu25_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 9", Toast.LENGTH_SHORT).show();

        }else if (comu26_1.isEmpty() == true && comu26_2.isEmpty() && comu26_3.isEmpty() && comu27_1.isEmpty()== true && comu27_2.isEmpty() && comu27_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 9", Toast.LENGTH_SHORT).show();

        }else if (comu28.isEmpty()==true && comu29.isEmpty() && comu30.isEmpty() == true && comu28_1.isEmpty() && comu28_2.isEmpty() && comu28_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 10", Toast.LENGTH_SHORT).show();

        }else if (comu29_1.isEmpty() == true && comu29_2.isEmpty() && comu29_3.isEmpty() && comu30_1.isEmpty()== true && comu30_2.isEmpty() && comu30_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 10", Toast.LENGTH_SHORT).show();

        }else if (comu31.isEmpty()==true && comu32.isEmpty() && comu33.isEmpty() == true && comu31_1.isEmpty() && comu31_2.isEmpty() && comu31_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 11", Toast.LENGTH_SHORT).show();

        }else if (comu32_1.isEmpty() == true && comu32_2.isEmpty() && comu32_3.isEmpty() && comu33_1.isEmpty()== true && comu33_2.isEmpty() && comu33_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 11", Toast.LENGTH_SHORT).show();

        }else if (comu34.isEmpty()==true && comu35.isEmpty() && comu36.isEmpty() == true && comu34_1.isEmpty() && comu34_2.isEmpty() && comu34_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 12", Toast.LENGTH_SHORT).show();

        }else if (comu35_1.isEmpty() == true && comu35_2.isEmpty() && comu35_3.isEmpty() && comu36_1.isEmpty()== true && comu36_2.isEmpty() && comu36_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 12", Toast.LENGTH_SHORT).show();

        }else if (comu37.isEmpty()==true && comu38.isEmpty() && comu39.isEmpty() == true && comu37_1.isEmpty() && comu37_2.isEmpty() && comu37_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 13", Toast.LENGTH_SHORT).show();

        }else if (comu38_1.isEmpty() == true && comu38_2.isEmpty() && comu38_3.isEmpty() && comu39_1.isEmpty()== true && comu39_2.isEmpty() && comu39_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 13", Toast.LENGTH_SHORT).show();

        }else if (comu40.isEmpty()==true && comu41.isEmpty() && comu42.isEmpty() == true && comu40_1.isEmpty() && comu40_2.isEmpty() && comu40_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 14", Toast.LENGTH_SHORT).show();

        }else if (comu41_1.isEmpty() == true && comu41_2.isEmpty() && comu41_3.isEmpty() && comu42_1.isEmpty()== true && comu42_2.isEmpty() && comu42_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 14", Toast.LENGTH_SHORT).show();

        }else if (comu43.isEmpty()==true && comu44.isEmpty() && comu45.isEmpty() == true && comu43_1.isEmpty() && comu43_2.isEmpty() && comu43_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 15", Toast.LENGTH_SHORT).show();

        }else if (comu44_1.isEmpty() == true && comu44_2.isEmpty() && comu44_3.isEmpty() && comu45_1.isEmpty()== true && comu45_2.isEmpty() && comu45_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 15", Toast.LENGTH_SHORT).show();

        }else if (comu46.isEmpty()==true && comu47.isEmpty() && comu48.isEmpty() == true && comu46_1.isEmpty() && comu46_2.isEmpty() && comu46_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 16", Toast.LENGTH_SHORT).show();

        }else if (comu47_1.isEmpty() == true && comu47_2.isEmpty() && comu47_3.isEmpty() && comu48_1.isEmpty()== true && comu48_2.isEmpty() && comu48_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 16", Toast.LENGTH_SHORT).show();

        }else if (comu49.isEmpty() && comu50.isEmpty() && comu51.isEmpty() && comu49_1.isEmpty() && comu49_2.isEmpty() && comu49_3.isEmpty()){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 17", Toast.LENGTH_SHORT).show();

        }else if (comu50_1.isEmpty() && comu50_2.isEmpty() && comu50_3.isEmpty() && comu51_1.isEmpty() && comu51_2.isEmpty() && comu51_3.isEmpty()){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 17", Toast.LENGTH_SHORT).show();

        }else if (comu52.isEmpty()==true && comu53.isEmpty() && comu54.isEmpty() == true && comu52_1.isEmpty() && comu52_2.isEmpty() && comu52_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 18", Toast.LENGTH_SHORT).show();

        }else if (comu53_1.isEmpty() == true && comu53_2.isEmpty() && comu53_3.isEmpty() && comu54_1.isEmpty()== true && comu54_2.isEmpty() && comu54_3.isEmpty()== true){
            Toast.makeText(this, "Test Colores de la Comunicacion, No deje campos vacios Pregunta 18", Toast.LENGTH_SHORT).show();

        }else {
            Intent intent = new Intent(Comunicacion11Activity.this, CerebroActivity.class);
            startActivity(intent);
        }
    }
}