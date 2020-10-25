package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Cerebro1Activity extends AppCompatActivity {

    private RadioGroup rbgcere1, rbgcere2;
    private RadioButton animodrad, animodrad2, animodrad3, animodrad4, animodrad5, animodrad6;
    private RadioButton animodo1rad1, animodo1rad2, animodo1rad3, animodo1rad4, animodo1rad5, animodo1rad6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro1);

        rbgcere1 = findViewById(R.id.rbg_Cerebro);
        rbgcere2 = findViewById(R.id.rbg_Cerebro2);

        animodrad = findViewById(R.id.rdcerebro_1);
        animodrad2 = findViewById(R.id.rdcerebro_2);
        animodrad3 = findViewById(R.id.rdcerebro_3);
        animodrad4 = findViewById(R.id.rdcerebro_4);
        animodrad5 = findViewById(R.id.rdcerebro_5);
        //---------------Pregunta 2------------------
        animodo1rad1 = (RadioButton) findViewById(R.id.rdcerebro2_1);
        animodo1rad2 = (RadioButton) findViewById(R.id.rdcerebro2_2);
        animodo1rad3 = (RadioButton) findViewById(R.id.rdcerebro2_3);
        animodo1rad4 = (RadioButton) findViewById(R.id.rdcerebro2_4);
        animodo1rad5 = (RadioButton) findViewById(R.id.rdcerebro2_5);

        rbgcere1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch(is){
                    case R.id.rdcerebro_1:
                        if (animodrad.isChecked()){
                            Variables.setCereb1(animodrad.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                            animodrad6.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro_2:
                        if (animodrad2.isChecked()){
                            Variables.setCereb2(animodrad2.getText().toString());
                            animodrad.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                            animodrad6.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro_3:
                        if (animodrad3.isChecked()){
                            Variables.setCereb3(animodrad3.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                            animodrad6.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro_4:
                        if (animodrad4.isChecked()){
                            Variables.setCereb4(animodrad4.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad5.setChecked(false);
                            animodrad6.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro_5:
                        if (animodrad5.isChecked()){
                            Variables.setCereb5(animodrad5.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad6.setChecked(false);
                        }
                        break;
                }
            }
        });

        rbgcere2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro2_1:
                        Variables.setCereb6(animodo1rad1.getText().toString());
                        Intent intent = new Intent(Cerebro1Activity.this, Cerebro2Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro2_2:
                        Variables.setCereb4(animodo1rad2.getText().toString());
                        Intent intent1 = new Intent(Cerebro1Activity.this, Cerebro2Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro2_3:
                        Intent intent2 = new Intent(Cerebro1Activity.this, Cerebro2Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro2_4:
                        Intent intent3 = new Intent(Cerebro1Activity.this, Cerebro2Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro2_5:
                        Intent inten = new Intent(Cerebro1Activity.this, Cerebro2Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });
    }
}