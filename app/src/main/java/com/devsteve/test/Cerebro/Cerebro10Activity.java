package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.Comunicacion.Comunicacion1Activity;
import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Cerebro10Activity extends AppCompatActivity {

    private RadioGroup rbgcere19,rbgcere20;
    private RadioButton animodrad, animodrad2, animodrad3, animodrad4, animodrad5;
    private RadioButton animodo1rad1, animodo1rad2, animodo1rad3, animodo1rad4, animodo1rad5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro10);


        rbgcere19 = findViewById(R.id.rbg_Cerebro19);
        animodrad = findViewById(R.id.rdcerebro19_1);
        animodrad2 = findViewById(R.id.rdcerebro19_2);
        animodrad3 = findViewById(R.id.rdcerebro19_3);
        animodrad4 = findViewById(R.id.rdcerebro19_4);
        animodrad5 = findViewById(R.id.rdcerebro19_5);

        rbgcere20 = findViewById(R.id.rbg_Cerebro20);
        animodo1rad1 = findViewById(R.id.rdcerebro20_1);
        animodo1rad2 = findViewById(R.id.rdcerebro20_2);
        animodo1rad3 = findViewById(R.id.rdcerebro20_3);
        animodo1rad4 = findViewById(R.id.rdcerebro20_4);
        animodo1rad5 = findViewById(R.id.rdcerebro20_5);

        rbgcere19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro19_1:
                        if (animodrad.isChecked()){
                            Variables.setCereb19_1(animodrad.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro19_2:
                        if (animodrad2.isChecked()){
                            Variables.setCereb19_2(animodrad2.getText().toString());
                            animodrad.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro19_3:
                        if (animodrad3.isChecked()){
                            Variables.setCereb19_3(animodrad3.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;

                    case R.id.rdcerebro19_4:
                        if (animodrad4.isChecked()){
                            Variables.setCereb19_4(animodrad4.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad5.setChecked(false);
                        }
                        break;
                    case R.id.rdcerebro19_5:
                        if (animodrad5.isChecked()){
                            Variables.setCereb19_5(animodrad5.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad.setChecked(false);
                        }
                        break;
                }
            }
        });

        rbgcere20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro20_1:
                        Variables.setCereb20_1(animodo1rad1.getText().toString());
                        Intent intent = new Intent(Cerebro10Activity.this, Cerebro11Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro20_2:
                        Variables.setCereb20_2(animodo1rad2.getText().toString());
                        Intent intent1 = new Intent(Cerebro10Activity.this, Cerebro11Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro20_3:
                        Variables.setCereb20_3(animodo1rad3.getText().toString());
                        Intent intent2 = new Intent(Cerebro10Activity.this, Cerebro11Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro20_4:
                        Variables.setCereb20_4(animodo1rad4.getText().toString());
                        Intent intent3 = new Intent(Cerebro10Activity.this, Cerebro11Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro20_5:
                        Variables.setCereb20_5(animodo1rad5.getText().toString());
                        Intent inten = new Intent(Cerebro10Activity.this, Cerebro11Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });

    }
}