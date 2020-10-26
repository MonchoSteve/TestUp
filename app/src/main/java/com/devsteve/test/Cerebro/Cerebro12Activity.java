package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.devsteve.test.Comunicacion.ComunicacionActivity;
import com.devsteve.test.Negociador.NegociadorActivity;
import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Cerebro12Activity extends AppCompatActivity {

    private RadioGroup rbgcere23;
    private Button enviarComunicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro12);

        rbgcere23 = findViewById(R.id.rbg_Cerebro23);

        rbgcere23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro23_1:
                        break;
                    case R.id.rdcerebro23_2:

                        break;
                    case R.id.rdcerebro23_3:

                        break;
                    case R.id.rdcerebro23_4:

                        break;
                    case R.id.rdcerebro23_5:

                        break;
                }
            }
        });

        //Boton enviar cerebro
        enviarComunicacion.setOnClickListener(new View.OnClickListener() {
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

                if (cereb1.isEmpty() && cereb2.isEmpty() && cereb3.isEmpty() && cereb4.isEmpty() && cereb5.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio", Toast.LENGTH_SHORT).show();
                }else if (cereb6.isEmpty() && cereb7.isEmpty() && cereb8.isEmpty() && cereb9.isEmpty() && cereb10.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio", Toast.LENGTH_SHORT).show();
                }else if (cereb11.isEmpty() && cereb12.isEmpty() && cereb13.isEmpty() && cereb14.isEmpty() && cereb15.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio", Toast.LENGTH_SHORT).show();
                }else if (cereb16.isEmpty() && cereb17.isEmpty() && cereb18.isEmpty() && cereb19.isEmpty() && cereb20.isEmpty() == true){
                    Toast.makeText(Cerebro12Activity.this, "No deje campo vacio", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(Cerebro12Activity.this, NegociadorActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}