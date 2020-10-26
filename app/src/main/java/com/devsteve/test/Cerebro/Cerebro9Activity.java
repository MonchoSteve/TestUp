package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Cerebro9Activity extends AppCompatActivity {

    private RadioGroup rbgcere17,rbgcere18;
    private RadioButton animodrad, animodrad2, animodrad3, animodrad4, animodrad5;
    private RadioButton animodo1rad1, animodo1rad2, animodo1rad3, animodo1rad4, animodo1rad5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro9);

        rbgcere17 = findViewById(R.id.rbg_Cerebro17);
        animodrad = findViewById(R.id.rdcerebro17_1);
        animodrad2 = findViewById(R.id.rdcerebro17_2);
        animodrad3 = findViewById(R.id.rdcerebro17_3);
        animodrad4 = findViewById(R.id.rdcerebro17_4);
        animodrad5 = findViewById(R.id.rdcerebro17_5);

        rbgcere18 = findViewById(R.id.rbg_Cerebro18);
        animodo1rad1 = findViewById(R.id.rdcerebro18_1);
        animodo1rad2 = findViewById(R.id.rdcerebro18_2);
        animodo1rad3 = findViewById(R.id.rdcerebro18_3);
        animodo1rad4 = findViewById(R.id.rdcerebro18_4);
        animodo1rad5 = findViewById(R.id.rdcerebro18_5);

        rbgcere17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro17_1:
                        if (animodrad.isChecked()){
                            Variables.setCereb17_1(animodrad.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro17_2:
                        if (animodrad2.isChecked()){
                            Variables.setCereb17_2(animodrad2.getText().toString());
                            animodrad.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro17_3:
                        if (animodrad3.isChecked()){
                            Variables.setCereb17_3(animodrad3.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;

                    case R.id.rdcerebro17_4:
                        if (animodrad4.isChecked()){
                            Variables.setCereb17_4(animodrad4.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro17_5:
                        if (animodrad5.isChecked()){
                            Variables.setCereb17_5(animodrad5.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad.setChecked(false);
                        }
                        break;
                }
            }
        });

        rbgcere18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro18_1:
                        Variables.setCereb18_1(animodo1rad1.getText().toString());
                        Intent intent = new Intent(Cerebro9Activity.this, Cerebro10Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro18_2:
                        Variables.setCereb18_2(animodo1rad2.getText().toString());
                        Intent intent1 = new Intent(Cerebro9Activity.this, Cerebro10Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro18_3:
                        Variables.setCereb18_3(animodo1rad3.getText().toString());
                        Intent intent2 = new Intent(Cerebro9Activity.this, Cerebro10Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro18_4:
                        Variables.setCereb18_4(animodo1rad4.getText().toString());
                        Intent intent3 = new Intent(Cerebro9Activity.this, Cerebro10Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro18_5:
                        Variables.setCereb18_5(animodo1rad5.getText().toString());
                        Intent inten = new Intent(Cerebro9Activity.this, Cerebro10Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });


    }
}