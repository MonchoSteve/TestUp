package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.devsteve.test.R;

public class Animodo2Activity extends AppCompatActivity {

    private RadioGroup rbanim, rbanim2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo2);

        rbanim = findViewById(R.id.rbg_Animodo4);
        rbanim2 = findViewById(R.id.rbg_Animodo3);
        rbanim2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch(is){
                    case R.id.rd3_1:
                        break;
                    case R.id.rd3_2:
                        break;
                    case R.id.rd3_3:
                        break;
                    case R.id.rd3_4:
                        break;
                    case R.id.rd3_5:
                        break;
                    case R.id.rd3_6:
                        break;
                }
            }
        });
        rbanim.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd4_1:
                        Intent intent = new Intent(Animodo2Activity.this,Animodo3Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rd4_2:
                        Intent intent1 = new Intent(Animodo2Activity.this, Animodo3Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rd4_3:
                        Intent intent2 = new Intent(Animodo2Activity.this, Animodo3Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rd4_4:
                        Intent intent3 = new Intent(Animodo2Activity.this, Animodo3Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rd4_5:
                        Intent inten = new Intent(Animodo2Activity.this, Animodo3Activity.class);
                        startActivity(inten);
                        break;
                    case R.id.rd4_6:
                        Intent inte = new Intent(Animodo2Activity.this, Animodo3Activity.class);
                        startActivity(inte);
                        break;
                }
            }
        });
    }
}