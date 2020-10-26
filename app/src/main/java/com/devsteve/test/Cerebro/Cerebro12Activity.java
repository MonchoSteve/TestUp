package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.devsteve.test.Comunicacion.ComunicacionActivity;
import com.devsteve.test.Negociador.NegociadorActivity;
import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Cerebro12Activity extends AppCompatActivity {

    private RadioGroup rbgcere23;
    private Button enviarCerebro;
    private RadioButton animodrad, animodrad2, animodrad3, animodrad4, animodrad5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro12);

        rbgcere23 = findViewById(R.id.rbg_Cerebro23);
        animodrad = findViewById(R.id.rdcerebro23_1);
        animodrad2 = findViewById(R.id.rdcerebro23_2);
        animodrad3 = findViewById(R.id.rdcerebro23_3);
        animodrad4 = findViewById(R.id.rdcerebro23_4);
        animodrad5 = findViewById(R.id.rdcerebro23_5);

        rbgcere23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro23_1:
                        if (animodrad.isChecked()){
                            Variables.setCereb23_1(animodrad.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro23_2:
                        if (animodrad2.isChecked()){
                            Variables.setCereb23_2(animodrad2.getText().toString());
                            animodrad.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro23_3:
                        if (animodrad3.isChecked()){
                            Variables.setCereb23_3(animodrad3.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro23_4:
                        if (animodrad4.isChecked()){
                            Variables.setCereb23_4(animodrad4.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro23_5:
                        if (animodrad5.isChecked()){
                            Variables.setCereb23_5(animodrad5.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad.setChecked(false);
                        }
                        break;
                }
            }
        });

        //Boton enviar cerebro
        enviarCerebro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String cereb1 = Variables.getCereb1();
                String cereb2 = Variables.getCereb2();
                String cereb3 = Variables.getCereb3();
                String cereb4 = Variables.getCereb4();
                String cereb5 = Variables.getCereb5();
                //-------PREGUNTA 2-----------------
                String cereb6 = Variables.getCereb6();
                String cereb7 = Variables.getCereb7();
                String cereb8 = Variables.getCereb8();
                String cereb9 = Variables.getCereb9();
                String cereb10 = Variables.getCereb10();
                //-----------PREGUNTA 3----------
                String cereb11 = Variables.getCereb1_1();
                String cereb12 = Variables.getCereb1_2();
                String cereb13 = Variables.getCereb1_3();
                String cereb14 = Variables.getCereb2_1();
                String cereb15 = Variables.getCereb2_2();
                //-------PREGUNTA 4-----------------
                String cereb16 = Variables.getCereb2_3();
                String cereb17 = Variables.getCereb3_1();
                String cereb18 = Variables.getCereb3_2();
                String cereb19 = Variables.getCereb3_3();
                String cereb20 = Variables.getCereb4_1();
                //------------PREGUNTA 5-------------
                String cereb21 = Variables.getCereb4_2();
                String cereb22 = Variables.getCereb4_3();
                String cereb23 = Variables.getCereb5_1();
                String cereb24 = Variables.getCereb5_2();
                String cereb25 = Variables.getCereb5_3();
                //-------PREGUNTA 6-----------------
                String cereb26 = Variables.getCereb6_1();
                String cereb27 = Variables.getCereb6_2();
                String cereb28 = Variables.getCereb6_3();
                String cereb29 = Variables.getCereb6_4();
                String cereb30 = Variables.getCereb6_5();
                //------------PREGUNTA 7-------------
                String cereb31 = Variables.getCereb7_1();
                String cereb32 = Variables.getCereb7_2();
                String cereb33 = Variables.getCereb7_3();
                String cereb34 = Variables.getCereb7_4();
                String cereb35 = Variables.getCereb7_5();
                //-------PREGUNTA 8-----------------
                String cereb36 = Variables.getCereb8_1();
                String cereb37 = Variables.getCereb8_2();
                String cereb38 = Variables.getCereb8_3();
                String cereb39 = Variables.getCereb8_4();
                String cereb40 = Variables.getCereb8_5();
                //------------PREGUNTA 9-------------
                String cereb41 = Variables.getCereb9_1();
                String cereb42 = Variables.getCereb9_2();
                String cereb43 = Variables.getCereb9_3();
                String cereb44 = Variables.getCereb9_4();
                String cereb45 = Variables.getCereb9_5();
                //-------PREGUNTA 10-----------------
                String cereb46 = Variables.getCereb10_1();
                String cereb47 = Variables.getCereb10_2();
                String cereb48 = Variables.getCereb10_3();
                String cereb49 = Variables.getCereb10_4();
                String cereb50 = Variables.getCereb10_5();
                //------------PREGUNTA 11-------------
                String cereb51 = Variables.getCereb11_1();
                String cereb52 = Variables.getCereb11_2();
                String cereb53 = Variables.getCereb11_3();
                String cereb54 = Variables.getCereb11_4();
                String cereb55 = Variables.getCereb11_5();
                //-------PREGUNTA 12-----------------
                String cereb56 = Variables.getCereb12_1();
                String cereb57 = Variables.getCereb12_2();
                String cereb58 = Variables.getCereb12_3();
                String cereb59 = Variables.getCereb12_4();
                String cereb60 = Variables.getCereb12_5();
                //------------PREGUNTA 13-------------
                String cereb61 = Variables.getCereb13_1();
                String cereb62 = Variables.getCereb13_2();
                String cereb63 = Variables.getCereb13_3();
                String cereb64 = Variables.getCereb13_4();
                String cereb65 = Variables.getCereb13_5();
                //-------PREGUNTA 14-----------------
                String cereb66 = Variables.getCereb14_1();
                String cereb67 = Variables.getCereb14_2();
                String cereb68 = Variables.getCereb14_3();
                String cereb69 = Variables.getCereb14_4();
                String cereb70 = Variables.getCereb14_5();
                //------------PREGUNTA 15-------------
                String cereb71 = Variables.getCereb15_1();
                String cereb72 = Variables.getCereb15_2();
                String cereb73 = Variables.getCereb15_3();
                String cereb74 = Variables.getCereb15_4();
                String cereb75 = Variables.getCereb15_5();
                //-------PREGUNTA 16-----------------
                String cereb76 = Variables.getCereb16_1();
                String cereb77 = Variables.getCereb16_2();
                String cereb78 = Variables.getCereb16_3();
                String cereb79 = Variables.getCereb16_4();
                String cereb80 = Variables.getCereb16_5();
                //-----------PREGUNTA 17--------------------
                String cereb81 = Variables.getCereb17_1();
                String cereb82 = Variables.getCereb17_2();
                String cereb83 = Variables.getCereb17_3();
                String cereb84 = Variables.getCereb17_4();
                String cereb85 = Variables.getCereb17_5();
                //-------PREGUNTA 18-----------------
                String cereb86 = Variables.getCereb18_1();
                String cereb87 = Variables.getCereb18_2();
                String cereb88 = Variables.getCereb18_3();
                String cereb89 = Variables.getCereb18_4();
                String cereb90 = Variables.getCereb18_5();
                //-----------PREGUNTA 19--------------------
                String cereb91 = Variables.getCereb19_1();
                String cereb92 = Variables.getCereb19_2();
                String cereb93 = Variables.getCereb19_3();
                String cereb94 = Variables.getCereb19_4();
                String cereb95 = Variables.getCereb19_5();
                //-------PREGUNTA 20-----------------
                String cereb96 = Variables.getCereb20_1();
                String cereb97 = Variables.getCereb20_2();
                String cereb98 = Variables.getCereb20_3();
                String cereb99 = Variables.getCereb20_4();
                String cereb100 = Variables.getCereb20_5();
                //-----------PREGUNTA 21--------------------
                String cereb101 = Variables.getCereb21_1();
                String cereb102 = Variables.getCereb21_2();
                String cereb103 = Variables.getCereb21_3();
                String cereb104 = Variables.getCereb21_4();
                String cereb105 = Variables.getCereb21_5();
                //-------PREGUNTA 22-----------------
                String cereb106 = Variables.getCereb22_1();
                String cereb107 = Variables.getCereb22_2();
                String cereb108 = Variables.getCereb22_3();
                String cereb109 = Variables.getCereb22_4();
                String cereb110 = Variables.getCereb22_5();
                //-------PREGUNTA 23-----------------
                String cereb111 = Variables.getCereb23_1();
                String cereb112 = Variables.getCereb23_2();
                String cereb113 = Variables.getCereb23_3();
                String cereb114 = Variables.getCereb23_4();
                String cereb115 = Variables.getCereb23_5();

                if (cereb1.isEmpty() && cereb2.isEmpty() && cereb3.isEmpty() && cereb4.isEmpty() && cereb5.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 1", Toast.LENGTH_SHORT).show();
                }else if (cereb6.isEmpty() && cereb7.isEmpty() && cereb8.isEmpty() && cereb9.isEmpty() && cereb10.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 2", Toast.LENGTH_SHORT).show();
                }else if (cereb11.isEmpty() && cereb12.isEmpty() && cereb13.isEmpty() && cereb14.isEmpty() && cereb15.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 3", Toast.LENGTH_SHORT).show();
                }else if (cereb16.isEmpty() && cereb17.isEmpty() && cereb18.isEmpty() && cereb19.isEmpty() && cereb20.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 4", Toast.LENGTH_SHORT).show();
                }else if (cereb21.isEmpty() && cereb22.isEmpty() && cereb23.isEmpty() && cereb24.isEmpty() && cereb25.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 5", Toast.LENGTH_SHORT).show();
                }else if (cereb26.isEmpty() && cereb27.isEmpty() && cereb28.isEmpty() && cereb29.isEmpty() && cereb30.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 6", Toast.LENGTH_SHORT).show();
                }else if (cereb31.isEmpty() && cereb32.isEmpty() && cereb33.isEmpty() && cereb34.isEmpty() && cereb35.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 7", Toast.LENGTH_SHORT).show();
                }else if (cereb36.isEmpty() && cereb37.isEmpty() && cereb38.isEmpty() && cereb39.isEmpty() && cereb40.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 8", Toast.LENGTH_SHORT).show();
                }else if (cereb41.isEmpty() && cereb42.isEmpty() && cereb43.isEmpty() && cereb44.isEmpty() && cereb45.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 9", Toast.LENGTH_SHORT).show();
                }else if (cereb46.isEmpty() && cereb47.isEmpty() && cereb48.isEmpty() && cereb49.isEmpty() && cereb50.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 10", Toast.LENGTH_SHORT).show();
                }else if (cereb51.isEmpty() && cereb52.isEmpty() && cereb53.isEmpty() && cereb54.isEmpty() && cereb55.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 11", Toast.LENGTH_SHORT).show();
                }else if (cereb56.isEmpty() && cereb57.isEmpty() && cereb58.isEmpty() && cereb59.isEmpty() && cereb60.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 12", Toast.LENGTH_SHORT).show();
                }else if (cereb61.isEmpty() && cereb62.isEmpty() && cereb63.isEmpty() && cereb64.isEmpty() && cereb65.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 13", Toast.LENGTH_SHORT).show();
                }else if (cereb66.isEmpty() && cereb67.isEmpty() && cereb68.isEmpty() && cereb69.isEmpty() && cereb70.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 14", Toast.LENGTH_SHORT).show();
                }else if (cereb71.isEmpty() && cereb72.isEmpty() && cereb73.isEmpty() && cereb74.isEmpty() && cereb75.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 15", Toast.LENGTH_SHORT).show();
                }else if (cereb76.isEmpty() && cereb77.isEmpty() && cereb78.isEmpty() && cereb79.isEmpty() && cereb80.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 16", Toast.LENGTH_SHORT).show();
                }else if (cereb81.isEmpty() && cereb82.isEmpty() && cereb83.isEmpty() && cereb84.isEmpty() && cereb85.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 17", Toast.LENGTH_SHORT).show();
                }else if (cereb86.isEmpty() && cereb87.isEmpty() && cereb88.isEmpty() && cereb89.isEmpty() && cereb90.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 18", Toast.LENGTH_SHORT).show();
                }else if (cereb91.isEmpty() && cereb92.isEmpty() && cereb93.isEmpty() && cereb94.isEmpty() && cereb95.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 19", Toast.LENGTH_SHORT).show();
                }else if (cereb96.isEmpty() && cereb97.isEmpty() && cereb98.isEmpty() && cereb99.isEmpty() && cereb100.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 20", Toast.LENGTH_SHORT).show();
                }else if (cereb101.isEmpty() && cereb102.isEmpty() && cereb103.isEmpty() && cereb104.isEmpty() && cereb105.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 21", Toast.LENGTH_SHORT).show();
                }else if (cereb106.isEmpty() && cereb107.isEmpty() && cereb108.isEmpty() && cereb109.isEmpty() && cereb110.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 22", Toast.LENGTH_SHORT).show();
                }else if (cereb111.isEmpty() && cereb112.isEmpty() && cereb113.isEmpty() && cereb114.isEmpty() && cereb115.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio 23", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(Cerebro12Activity.this, NegociadorActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}