package com.devsteve.test.Comunicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Comunicacion1Activity extends AppCompatActivity {

    private RadioGroup rbgcomuni, rbgcomuni1;
    private RadioButton rdcomuni1, rdcomuni2, rdcomuni3, rdcomuni4, rdcomuni5, rdcomuni6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion1);

        rbgcomuni = findViewById(R.id.rbg_Comunicacion);
        rbgcomuni1 = findViewById(R.id.rbg_Comunicacion1);

        rdcomuni1 = findViewById(R.id.rdcomunicacion_1);
        rdcomuni2 = findViewById(R.id.rdcomunicacion_2);
        rdcomuni3 = findViewById(R.id.rdcomunicacion_3);
        rdcomuni4 = findViewById(R.id.rdcomunicacion1_1);
        rdcomuni5 = findViewById(R.id.rdcomunicacion1_2);
        rdcomuni6 = findViewById(R.id.rdcomunicacion1_3);


        rbgcomuni.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcomunicacion_1:
                        if (rdcomuni1.isChecked()){
                            rdcomuni2.setEnabled(false);
                            rdcomuni3.setEnabled(false);
                            rdcomuni4.setEnabled(false);
                        }
                        break;
                }
            }
        });

    }
}