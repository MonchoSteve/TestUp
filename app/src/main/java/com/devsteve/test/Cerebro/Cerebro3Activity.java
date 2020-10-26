package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Cerebro3Activity extends AppCompatActivity {

    private RadioGroup rbgcere5, rbgcere6;
    private RadioButton animodrad, animodrad2, animodrad3, animodrad4, animodrad5;
    private RadioButton animodo1rad1, animodo1rad2, animodo1rad3, animodo1rad4, animodo1rad5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro3);

        rbgcere5 = findViewById(R.id.rbg_Cerebro5);
        animodrad = findViewById(R.id.rdcerebro5_1);
        animodrad2 = findViewById(R.id.rdcerebro5_2);
        animodrad3 = findViewById(R.id.rdcerebro5_3);
        animodrad4 = findViewById(R.id.rdcerebro5_4);
        animodrad5 = findViewById(R.id.rdcerebro5_5);
        rbgcere5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro5_1:
                        if (animodrad.isChecked()){
                            Variables.setCereb4_2(animodrad.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro5_2:
                        if (animodrad2.isChecked()){
                            Variables.setCereb4_3(animodrad2.getText().toString());
                            animodrad.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro5_3:
                        if (animodrad3.isChecked()){
                            Variables.setCereb5_1(animodrad3.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;

                    case R.id.rdcerebro5_4:
                        if (animodrad4.isChecked()){
                            Variables.setCereb5_2(animodrad4.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro5_5:
                        if (animodrad5.isChecked()){
                            Variables.setCereb5_3(animodrad5.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad.setChecked(false);
                        }
                        break;
                }
            }
        });

        //---------------Pregunta 6------------------
        rbgcere6 = findViewById(R.id.rbg_Cerebro6);
        animodo1rad1 = findViewById(R.id.rdcerebro6_1);
        animodo1rad2 = findViewById(R.id.rdcerebro6_2);
        animodo1rad3 = findViewById(R.id.rdcerebro6_3);
        animodo1rad4 = findViewById(R.id.rd_cerebro6_4);
        animodo1rad5 = findViewById(R.id.rdcerebro6_5);
        rbgcere6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro6_1:
                        Variables.setCereb6_1(animodo1rad1.getText().toString());
                        Intent intent = new Intent(Cerebro3Activity.this, Cerebro4Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro6_2:
                        Variables.setCereb6_2(animodo1rad2.getText().toString());
                        Intent intent1 = new Intent(Cerebro3Activity.this, Cerebro4Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro6_3:
                        Variables.setCereb6_3(animodo1rad3.getText().toString());
                        Intent intent2 = new Intent(Cerebro3Activity.this, Cerebro4Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rd_cerebro6_4:
                        Variables.setCereb6_4(animodo1rad4.getText().toString());
                        Intent intent3 = new Intent(Cerebro3Activity.this, Cerebro4Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro6_5:
                        Variables.setCereb6_5(animodo1rad5.getText().toString());
                        Intent inten = new Intent(Cerebro3Activity.this, Cerebro4Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });

    }
}