package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Animodo3Activity extends AppCompatActivity {

    private RadioGroup rbg6anim,rbg5anim;
    private RadioButton rd5_1, rd5_2, rd5_3, rd5_4, rd5_5, rd5_6, rd6_1, rd6_2, rd6_3, rd6_4, rd6_5, rd6_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo3);

        rd5_1 = findViewById(R.id.rd5_1);
        rd5_2 = findViewById(R.id.rd5_2);
        rd5_3 = findViewById(R.id.rd5_3);
        rd5_4 = findViewById(R.id.rd5_4);
        rd5_5 = findViewById(R.id.rd5_5);
        rd5_6 = findViewById(R.id.rd5_6);
        //-----
        rd6_1 = findViewById(R.id.rd6_1);
        rd6_2 = findViewById(R.id.rd6_2);
        rd6_3 = findViewById(R.id.rd6_3);
        rd6_4 = findViewById(R.id.rd6_4);
        rd6_5 = findViewById(R.id.rd6_5);
        rd6_6 = findViewById(R.id.rd6_6);

        rbg5anim = findViewById(R.id.rbg_Animodo5);
        rbg5anim.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int in) {
                switch(in){
                    case R.id.rd5_1:
                        if (rd5_1.isChecked()){
                            Variables.setRdnum25(rd5_1.getText().toString());
                            rd5_2.setChecked(false);
                            rd5_3.setChecked(false);
                            rd5_4.setChecked(false);
                            rd5_5.setChecked(false);
                            rd5_6.setChecked(false);
                        }
                        break;
                    case R.id.rd5_2:
                        if (rd5_2.isChecked()){
                            Variables.setRdnum26(rd5_2.getText().toString());
                            rd5_1.setChecked(false);
                            rd5_3.setChecked(false);
                            rd5_4.setChecked(false);
                            rd5_5.setChecked(false);
                            rd5_6.setChecked(false);
                        }
                        break;
                    case R.id.rd5_3:
                        if (rd5_3.isChecked()){
                            Variables.setRdnum27(rd5_3.getText().toString());
                            rd5_2.setChecked(false);
                            rd5_1.setChecked(false);
                            rd5_4.setChecked(false);
                            rd5_5.setChecked(false);
                            rd5_6.setChecked(false);
                        }
                        break;
                    case R.id.rd5_4:
                        if (rd5_4.isChecked()){
                            Variables.setRdnum28(rd5_4.getText().toString());
                            rd5_2.setChecked(false);
                            rd5_3.setChecked(false);
                            rd5_1.setChecked(false);
                            rd5_5.setChecked(false);
                            rd5_6.setChecked(false);
                        }
                        break;
                    case R.id.rd5_5:
                        if (rd5_5.isChecked()){
                            Variables.setRdnum29(rd5_5.getText().toString());
                            rd5_2.setChecked(false);
                            rd5_3.setChecked(false);
                            rd5_4.setChecked(false);
                            rd5_1.setChecked(false);
                            rd5_6.setChecked(false);
                        }
                        break;
                    case R.id.rd5_6:
                        if (rd5_6.isChecked()){
                            Variables.setRdnum30(rd5_6.getText().toString());
                            rd5_2.setChecked(false);
                            rd5_3.setChecked(false);
                            rd5_4.setChecked(false);
                            rd5_5.setChecked(false);
                            rd5_1.setChecked(false);
                        }
                        break;
                }

            }
        });

        rbg6anim = findViewById(R.id.rbg_Animodo6);
        rbg6anim.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.rd6_1:
                        Variables.setRdnum31(rd6_1.getText().toString());
                        Intent intent = new Intent(Animodo3Activity.this, Animodo4Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rd6_2:
                        Variables.setRdnum32(rd6_2.getText().toString());
                        Intent inte = new Intent(Animodo3Activity.this, Animodo4Activity.class);
                        startActivity(inte);
                        break;
                    case R.id.rd6_3:
                        Variables.setRdnum33(rd6_3.getText().toString());
                        Intent intet = new Intent(Animodo3Activity.this, Animodo4Activity.class);
                        startActivity(intet);
                        break;
                    case R.id.rd6_4:
                        Variables.setRdnum34(rd6_4.getText().toString());
                        Intent in = new Intent(Animodo3Activity.this, Animodo4Activity.class);
                        startActivity(in);
                        break;
                    case R.id.rd6_5:
                        Variables.setRdnum35(rd6_5.getText().toString());
                        Intent intentm = new Intent(Animodo3Activity.this, Animodo4Activity.class);
                        startActivity(intentm);
                        break;
                    case R.id.rd6_6:
                        Variables.setRdnum36(rd6_6.getText().toString());
                        Intent intem = new Intent(Animodo3Activity.this, Animodo4Activity.class);
                        startActivity(intem);
                        break;
                }
            }
        });
    }
}