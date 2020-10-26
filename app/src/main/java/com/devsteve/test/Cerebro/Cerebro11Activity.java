package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Cerebro11Activity extends AppCompatActivity {

    private RadioGroup rbgcere21, rbgcere22;
    private RadioButton animodrad, animodrad2, animodrad3, animodrad4, animodrad5;
    private RadioButton animodo1rad1, animodo1rad2, animodo1rad3, animodo1rad4, animodo1rad5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro11);

        rbgcere21 = findViewById(R.id.rbg_Cerebro21);
        animodrad = findViewById(R.id.rdcerebro21_1);
        animodrad2 = findViewById(R.id.rdcerebro21_2);
        animodrad3 = findViewById(R.id.rdcerebro21_3);
        animodrad4 = findViewById(R.id.rdcerebro21_4);
        animodrad5 = findViewById(R.id.rdcerebro21_5);

        rbgcere22 = findViewById(R.id.rbg_Cerebro22);
        animodo1rad1 = findViewById(R.id.rdcerebro22_1);
        animodo1rad2 = findViewById(R.id.rdcerebro22_2);
        animodo1rad3 = findViewById(R.id.rdcerebro22_3);
        animodo1rad4 = findViewById(R.id.rdcerebro22_4);
        animodo1rad5 = findViewById(R.id.rdcerebro22_5);

        rbgcere21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro20_1:
                        if (animodrad.isChecked()){
                            Variables.setCereb21_1(animodrad.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro20_2:
                        if (animodrad2.isChecked()){
                            Variables.setCereb21_2(animodrad2.getText().toString());
                            animodrad.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro20_3:
                        if (animodrad3.isChecked()){
                            Variables.setCereb21_3(animodrad3.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;

                    case R.id.rdcerebro20_4:
                        if (animodrad4.isChecked()){
                            Variables.setCereb21_4(animodrad4.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro20_5:
                        if (animodrad5.isChecked()){
                            Variables.setCereb21_5(animodrad5.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad.setChecked(false);
                        }
                        break;
                }
            }
        });

        rbgcere22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro22_1:
                        Variables.setCereb22_1(animodo1rad1.getText().toString());
                        Intent intent = new Intent(Cerebro11Activity.this, Cerebro12Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro22_2:
                        Variables.setCereb22_2(animodo1rad2.getText().toString());
                        Intent intent1 = new Intent(Cerebro11Activity.this, Cerebro12Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro22_3:
                        Variables.setCereb22_3(animodo1rad3.getText().toString());
                        Intent intent2 = new Intent(Cerebro11Activity.this, Cerebro12Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro22_4:
                        Variables.setCereb22_4(animodo1rad4.getText().toString());
                        Intent intent3 = new Intent(Cerebro11Activity.this, Cerebro12Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro22_5:
                        Variables.setCereb22_5(animodo1rad5.getText().toString());
                        Intent inten = new Intent(Cerebro11Activity.this, Cerebro12Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });
    }
}