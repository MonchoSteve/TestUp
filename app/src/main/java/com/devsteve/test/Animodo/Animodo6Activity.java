package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Animodo6Activity extends AppCompatActivity {

    private RadioGroup rbganim11, rbganim12;
    private RadioButton rd11_1, rd11_2, rd11_3, rd11_4, rd11_5, rd11_6, rd12_1, rd12_2, rd12_3, rd12_4, rd12_5, rd12_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo6);

        rd11_1 = findViewById(R.id.rd11_1);
        rd11_2 = findViewById(R.id.rd11_2);
        rd11_3 = findViewById(R.id.rd11_3);
        rd11_4 = findViewById(R.id.rd11_4);
        rd11_5 = findViewById(R.id.rd11_5);
        rd11_6 = findViewById(R.id.rd11_6);
        //-----
        rd12_1 = findViewById(R.id.rd12_1);
        rd12_2 = findViewById(R.id.rd12_2);
        rd12_3 = findViewById(R.id.rd12_3);
        rd12_4 = findViewById(R.id.rd12_4);
        rd12_5 = findViewById(R.id.rd12_5);
        rd12_6 = findViewById(R.id.rd12_6);

        rbganim11 = findViewById(R.id.rbg_Animodo11);
        rbganim12 = findViewById(R.id.rbg_Animodo12);

        rbganim11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int in) {
                switch(in){
                    case R.id.rd11_1:

                        if (rd11_1.isChecked()){
                            Variables.setRdnum61(rd11_1.getText().toString());
                            rd11_2.setChecked(false);
                            rd11_3.setChecked(false);
                            rd11_4.setChecked(false);
                            rd11_5.setChecked(false);
                            rd11_6.setChecked(false);
                        }

                        break;
                    case R.id.rd11_2:
                        if (rd11_2.isChecked()){
                            Variables.setRdnum62(rd11_2.getText().toString());
                            rd11_1.setChecked(false);
                            rd11_3.setChecked(false);
                            rd11_4.setChecked(false);
                            rd11_5.setChecked(false);
                            rd11_6.setChecked(false);
                        }
                        break;
                    case R.id.rd11_3:
                        if (rd11_3.isChecked()){
                            Variables.setRdnum63(rd11_3.getText().toString());
                            rd11_2.setChecked(false);
                            rd11_1.setChecked(false);
                            rd11_4.setChecked(false);
                            rd11_5.setChecked(false);
                            rd11_6.setChecked(false);
                        }
                        break;
                    case R.id.rd11_4:
                        if (rd11_4.isChecked()){
                            Variables.setRdnum64(rd11_4.getText().toString());
                            rd11_2.setChecked(false);
                            rd11_3.setChecked(false);
                            rd11_1.setChecked(false);
                            rd11_5.setChecked(false);
                            rd11_6.setChecked(false);
                        }
                        break;
                    case R.id.rd11_5:
                        if (rd11_5.isChecked()){
                            Variables.setRdnum65(rd11_5.getText().toString());
                            rd11_2.setChecked(false);
                            rd11_3.setChecked(false);
                            rd11_4.setChecked(false);
                            rd11_1.setChecked(false);
                            rd11_6.setChecked(false);
                        }
                        break;
                    case R.id.rd11_6:
                        if (rd11_6.isChecked()){
                            Variables.setRdnum66(rd11_6.getText().toString());
                            rd11_2.setChecked(false);
                            rd11_3.setChecked(false);
                            rd11_4.setChecked(false);
                            rd11_5.setChecked(false);
                            rd11_1.setChecked(false);
                        }
                        break;
                }
            }
        });

        rbganim12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rd12_1:
                        Variables.setRdnum67(rd12_1.getText().toString());
                        Intent intent = new Intent(Animodo6Activity.this, Animodo7Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rd12_2:
                        Variables.setRdnum68(rd12_2.getText().toString());
                        Intent inte = new Intent(Animodo6Activity.this, Animodo7Activity.class);
                        startActivity(inte);
                        break;
                    case R.id.rd12_3:
                        Variables.setRdnum69(rd12_3.getText().toString());
                        Intent intet = new Intent(Animodo6Activity.this, Animodo7Activity.class);
                        startActivity(intet);
                        break;
                    case R.id.rd12_4:
                        Variables.setRdnum70(rd12_4.getText().toString());
                        Intent in = new Intent(Animodo6Activity.this, Animodo7Activity.class);
                        startActivity(in);
                        break;
                    case R.id.rd12_5:
                        Variables.setRdnum71(rd12_5.getText().toString());
                        Intent intentm = new Intent(Animodo6Activity.this, Animodo7Activity.class);
                        startActivity(intentm);
                        break;
                    case R.id.rd12_6:
                        Variables.setRdnum72(rd12_6.getText().toString());
                        Intent intem = new Intent(Animodo6Activity.this, Animodo7Activity.class);
                        startActivity(intem);
                        break;
                }
            }
        });

    }
}