package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.devsteve.test.Comunicacion.ComunicacionActivity;
import com.devsteve.test.R;

public class Cerebro12Activity extends AppCompatActivity {

    private RadioGroup rbgcere23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro12);

        rbgcere23 = findViewById(R.id.rbg_Cerebro23);

        rbgcere23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rdcerebro23_1:
                        Intent intent = new Intent(Cerebro12Activity.this, ComunicacionActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.rdcerebro23_2:
                        Intent intent1 = new Intent(Cerebro12Activity.this, ComunicacionActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.rdcerebro23_3:
                        Intent intent2 = new Intent(Cerebro12Activity.this, ComunicacionActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.rdcerebro23_4:
                        Intent intent3 = new Intent(Cerebro12Activity.this, ComunicacionActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rdcerebro23_5:
                        Intent inten = new Intent(Cerebro12Activity.this, ComunicacionActivity.class);
                        startActivity(inten);
                        break;
                }
            }
        });

    }
}