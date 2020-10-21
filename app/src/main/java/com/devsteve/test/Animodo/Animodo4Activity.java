package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Animodo4Activity extends AppCompatActivity {

    private RadioGroup rbgAnim7,rbganim8;
    private RadioButton rd7_1, rd7_2, rd7_3, rd7_4, rd7_5, rd7_6, rd8_1, rd8_2, rd8_3, rd8_4, rd8_5, rd8_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo4);

        rd7_1 = findViewById(R.id.rd7_1);
        rd7_2 = findViewById(R.id.rd7_2);
        rd7_3 = findViewById(R.id.rd7_3);
        rd7_4 = findViewById(R.id.rd7_4);
        rd7_5 = findViewById(R.id.rd7_5);
        rd7_6 = findViewById(R.id.rd7_6);
        //-----
        rd8_1 = findViewById(R.id.rd8_1);
        rd8_2 = findViewById(R.id.rd8_2);
        rd8_3 = findViewById(R.id.rd8_3);
        rd8_4 = findViewById(R.id.rd8_4);
        rd8_5 = findViewById(R.id.rd8_5);
        rd8_6 = findViewById(R.id.rd8_6);

        rbgAnim7 = findViewById(R.id.rbg_Animodo7);
        rbganim8 = findViewById(R.id.rbg_Animodo8);
        rbgAnim7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int in) {
                switch(in){
                    case R.id.rd7_1:
                        if (rd7_1.isChecked()){
                            Variables.setRdnum37(rd7_1.getText().toString());
                            rd7_2.setChecked(false);
                            rd7_3.setChecked(false);
                            rd7_4.setChecked(false);
                            rd7_5.setChecked(false);
                            rd7_6.setChecked(false);
                        }
                        break;
                    case R.id.rd7_2:

                        if (rd7_2.isChecked()){
                            Variables.setRdnum38(rd7_2.getText().toString());
                            rd7_1.setChecked(false);
                            rd7_3.setChecked(false);
                            rd7_4.setChecked(false);
                            rd7_5.setChecked(false);
                            rd7_6.setChecked(false);
                        }
                        break;
                    case R.id.rd7_3:

                        if (rd7_3.isChecked()){
                            Variables.setRdnum39(rd7_3.getText().toString());
                            rd7_2.setChecked(false);
                            rd7_1.setChecked(false);
                            rd7_4.setChecked(false);
                            rd7_5.setChecked(false);
                            rd7_6.setChecked(false);
                        }
                        break;
                    case R.id.rd7_4:

                        if (rd7_4.isChecked()){
                            Variables.setRdnum40(rd7_4.getText().toString());
                            rd7_2.setChecked(false);
                            rd7_3.setChecked(false);
                            rd7_1.setChecked(false);
                            rd7_5.setChecked(false);
                            rd7_6.setChecked(false);
                        }
                        break;
                    case R.id.rd7_5:

                        if (rd7_5.isChecked()){
                            Variables.setRdnum41(rd7_5.getText().toString());
                            rd7_2.setChecked(false);
                            rd7_3.setChecked(false);
                            rd7_4.setChecked(false);
                            rd7_1.setChecked(false);
                            rd7_6.setChecked(false);
                        }
                        break;
                    case R.id.rd7_6:

                        if (rd7_6.isChecked()){
                            Variables.setRdnum42(rd7_6.getText().toString());
                            rd7_2.setChecked(false);
                            rd7_3.setChecked(false);
                            rd7_4.setChecked(false);
                            rd7_5.setChecked(false);
                            rd7_1.setChecked(false);
                        }
                        break;
                }

            }
        });

        rbganim8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rd8_1:
                        Variables.setRdnum43(rd8_1.getText().toString());
                        Intent intent = new Intent(Animodo4Activity.this, Animodo5Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rd8_2:
                        Variables.setRdnum44(rd8_2.getText().toString());
                        Intent inte = new Intent(Animodo4Activity.this, Animodo5Activity.class);
                        startActivity(inte);
                        break;
                    case R.id.rd8_3:
                        Variables.setRdnum45(rd8_3.getText().toString());
                        Intent intet = new Intent(Animodo4Activity.this, Animodo5Activity.class);
                        startActivity(intet);
                        break;
                    case R.id.rd8_4:
                        Variables.setRdnum46(rd8_4.getText().toString());
                        Intent in = new Intent(Animodo4Activity.this, Animodo5Activity.class);
                        startActivity(in);
                        break;
                    case R.id.rd8_5:
                        Variables.setRdnum47(rd8_5.getText().toString());
                        Intent intentm = new Intent(Animodo4Activity.this, Animodo5Activity.class);
                        startActivity(intentm);
                        break;
                    case R.id.rd8_6:
                        Variables.setRdnum48(rd8_6.getText().toString());
                        Intent intem = new Intent(Animodo4Activity.this, Animodo5Activity.class);
                        startActivity(intem);
                        break;
                }
            }
        });

    }
}