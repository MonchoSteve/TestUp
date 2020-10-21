package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Animodo5Activity extends AppCompatActivity {

    private RadioGroup rbganim9, rbganim10;
    private RadioButton rd9_1, rd9_2, rd9_3, rd9_4, rd9_5, rd9_6, rd10_1, rd10_2, rd10_3, rd10_4, rd10_5, rd10_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo5);

        rd9_1 = findViewById(R.id.rd9_1);
        rd9_2 = findViewById(R.id.rd9_2);
        rd9_3 = findViewById(R.id.rd9_3);
        rd9_4 = findViewById(R.id.rd9_4);
        rd9_5 = findViewById(R.id.rd9_5);
        rd9_6 = findViewById(R.id.rd9_6);
        //-----
        rd10_1 = findViewById(R.id.rd10_1);
        rd10_2 = findViewById(R.id.rd10_2);
        rd10_3 = findViewById(R.id.rd10_3);
        rd10_4 = findViewById(R.id.rd10_4);
        rd10_5 = findViewById(R.id.rd10_5);
        rd10_6 = findViewById(R.id.rd10_6);

        rbganim9 = findViewById(R.id.rbg_Animodo9);
        rbganim10 = findViewById(R.id.rbg_Animodo10);

        rbganim9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int in) {
                switch(in){
                    case R.id.rd9_1:
                        if (rd9_1.isChecked()){
                            Variables.setRdnum49(rd9_1.getText().toString());
                            rd9_2.setChecked(false);
                            rd9_3.setChecked(false);
                            rd9_4.setChecked(false);
                            rd9_5.setChecked(false);
                            rd9_6.setChecked(false);
                        }
                        break;
                    case R.id.rd9_2:
                        if (rd9_2.isChecked()){
                            Variables.setRdnum50(rd9_2.getText().toString());
                            rd9_1.setChecked(false);
                            rd9_3.setChecked(false);
                            rd9_4.setChecked(false);
                            rd9_5.setChecked(false);
                            rd9_6.setChecked(false);
                        }
                        break;
                    case R.id.rd9_3:
                        if (rd9_3.isChecked()){
                            Variables.setRdnum51(rd9_3.getText().toString());
                            rd9_2.setChecked(false);
                            rd9_1.setChecked(false);
                            rd9_4.setChecked(false);
                            rd9_5.setChecked(false);
                            rd9_6.setChecked(false);
                        }
                        break;
                    case R.id.rd9_4:
                        if (rd9_4.isChecked()){
                            Variables.setRdnum52(rd9_4.getText().toString());
                            rd9_2.setChecked(false);
                            rd9_3.setChecked(false);
                            rd9_1.setChecked(false);
                            rd9_5.setChecked(false);
                            rd9_6.setChecked(false);
                        }
                        break;
                    case R.id.rd9_5:
                        if (rd9_5.isChecked()){
                            Variables.setRdnum53(rd9_5.getText().toString());
                            rd9_2.setChecked(false);
                            rd9_3.setChecked(false);
                            rd9_4.setChecked(false);
                            rd9_1.setChecked(false);
                            rd9_6.setChecked(false);
                        }
                        break;
                    case R.id.rd9_6:
                        if (rd9_6.isChecked()){
                            Variables.setRdnum54(rd9_6.getText().toString());
                            rd9_2.setChecked(false);
                            rd9_3.setChecked(false);
                            rd9_4.setChecked(false);
                            rd9_5.setChecked(false);
                            rd9_1.setChecked(false);
                        }
                        break;
                }

            }
        });

        rbganim10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rd10_1:
                        Variables.setRdnum55(rd10_1.getText().toString());
                        Intent intent = new Intent(Animodo5Activity.this, Animodo6Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rd10_2:
                        Variables.setRdnum56(rd10_2.getText().toString());
                        Intent inte = new Intent(Animodo5Activity.this, Animodo6Activity.class);
                        startActivity(inte);
                        break;
                    case R.id.rd10_3:
                        Variables.setRdnum57(rd10_3.getText().toString());
                        Intent intet = new Intent(Animodo5Activity.this, Animodo6Activity.class);
                        startActivity(intet);
                        break;
                    case R.id.rd10_4:
                        Variables.setRdnum58(rd10_4.getText().toString());
                        Intent in = new Intent(Animodo5Activity.this, Animodo6Activity.class);
                        startActivity(in);
                        break;
                    case R.id.rd10_5:
                        Variables.setRdnum59(rd10_5.getText().toString());
                        Intent intentm = new Intent(Animodo5Activity.this, Animodo6Activity.class);
                        startActivity(intentm);
                        break;
                    case R.id.rd10_6:
                        Variables.setRdnum60(rd10_6.getText().toString());
                        Intent intem = new Intent(Animodo5Activity.this, Animodo6Activity.class);
                        startActivity(intem);
                        break;
                }
            }
        });

    }
}