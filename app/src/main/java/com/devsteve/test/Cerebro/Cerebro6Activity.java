package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Cerebro6Activity extends AppCompatActivity {

    private RadioGroup rbgcere11, rbgcere12;
    private RadioButton animodrad, animodrad2, animodrad3, animodrad4, animodrad5;
    private RadioButton animodo1rad1, animodo1rad2, animodo1rad3, animodo1rad4, animodo1rad5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro6);

        rbgcere11 = findViewById(R.id.rbg_Cerebro11);
        animodrad = findViewById(R.id.rdcerebro11_1);
        animodrad2 = findViewById(R.id.rdcerebro11_2);
        animodrad3 = findViewById(R.id.rdcerebro11_3);
        animodrad4 = findViewById(R.id.rdcerebro11_4);
        animodrad5 = findViewById(R.id.rdcerebro11_5);

        rbgcere12 = findViewById(R.id.rbg_Cerebro12);
        animodo1rad1 = findViewById(R.id.rdcerebro12_1);
        animodo1rad2 = findViewById(R.id.rdcerebro12_2);
        animodo1rad3 = findViewById(R.id.rdcerebro12_3);
        animodo1rad4 = findViewById(R.id.rdcerebro12_4);
        animodo1rad5 = findViewById(R.id.rdcerebro12_5);

        rbgcere11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro11_1:
                        if (animodrad.isChecked()){
                            Variables.setCereb11_1(animodrad.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro11_2:
                        if (animodrad2.isChecked()){
                            Variables.setCereb11_2(animodrad2.getText().toString());
                            animodrad.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro11_3:
                        if (animodrad3.isChecked()){
                            Variables.setCereb11_3(animodrad3.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;

                    case R.id.rdcerebro11_4:
                        if (animodrad4.isChecked()){
                            Variables.setCereb11_4(animodrad4.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro11_5:
                        if (animodrad5.isChecked()){
                            Variables.setCereb11_5(animodrad5.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad.setChecked(false);
                        }
                        break;
                }
            }
        });

        rbgcere12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro12_1:
                        Variables.setCereb12_1(animodo1rad1.getText().toString());
                        Intent intent = new Intent(Cerebro6Activity.this, Cerebro7Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro12_2:
                        Variables.setCereb12_2(animodo1rad2.getText().toString());
                        Intent intent1 = new Intent(Cerebro6Activity.this, Cerebro7Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro12_3:
                        Variables.setCereb12_3(animodo1rad3.getText().toString());
                        Intent intent2 = new Intent(Cerebro6Activity.this, Cerebro7Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro12_4:
                        Variables.setCereb12_4(animodo1rad4.getText().toString());
                        Intent intent3 = new Intent(Cerebro6Activity.this, Cerebro7Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro12_5:
                        Variables.setCereb12_5(animodo1rad5.getText().toString());
                        Intent inten = new Intent(Cerebro6Activity.this, Cerebro7Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });
    }
}