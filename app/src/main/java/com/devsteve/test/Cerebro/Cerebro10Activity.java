package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.Comunicacion.Comunicacion1Activity;
import com.devsteve.test.R;

public class Cerebro10Activity extends AppCompatActivity {

    private RadioGroup rbgcere19,rbgcere20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro10);


        rbgcere19 = findViewById(R.id.rbg_Cerebro19);
        rbgcere20 = findViewById(R.id.rbg_Cerebro20);

        rbgcere19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch (is){
                    case R.id.rdcerebro19_1:
                        break;
                    case R.id.rdcerebro19_2:
                        break;
                    case R.id.rdcerebro19_3:
                        break;

                    case R.id.rdcerebro19_4:
                        break;
                    case R.id.rdcerebro19_5:
                        break;
                }
            }
        });

        rbgcere20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro20_1:
                        Intent intent = new Intent(Cerebro10Activity.this, Cerebro11Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro20_2:
                        Intent intent1 = new Intent(Cerebro10Activity.this, Cerebro11Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rdcerebro20_3:
                        Intent intent2 = new Intent(Cerebro10Activity.this, Cerebro11Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rdcerebro20_4:
                        Intent intent3 = new Intent(Cerebro10Activity.this, Cerebro11Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro20_5:
                        Intent inten = new Intent(Cerebro10Activity.this, Cerebro11Activity.class);
                        startActivity(inten);
                        break;
                }
            }
        });

    }
}