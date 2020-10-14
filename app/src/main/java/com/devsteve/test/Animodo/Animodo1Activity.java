package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.devsteve.test.R;

public class Animodo1Activity extends AppCompatActivity{

    private RadioGroup animodorbg, rbganimodo2;
    private RadioButton animodo1rad1, animodo1rad2, animodo1rad3, animodo1rad4, animodo1rad5, animodo1rad6;
    private String radiotext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo1);

        animodorbg = findViewById(R.id.rbg1_animodo);
        rbganimodo2 = findViewById(R.id.rbg_Animodo2);

        animodo1rad1 = findViewById(R.id.rd_anim1);
        radiotext1 = animodo1rad1.getText().toString();
        animodo1rad2 = findViewById(R.id.rd_anim2);
        animodo1rad3 = findViewById(R.id.rd_anim3);
        animodo1rad4 = findViewById(R.id.rd_anim4);
        animodo1rad5 = findViewById(R.id.rd_anim5);
        animodo1rad6 = findViewById(R.id.rd_anim6);

        animodorbg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd_anim1:



                        break;

                    case R.id.rd_anim2:

                        break;

                    case R.id.rd_anim3:

                        break;

                    case R.id.rd_anim4:

                        break;

                    case R.id.rd_anim5:

                        break;

                    case R.id.rd_anim6:

                        break;
                }

            }
        });

        rbganimodo2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                switch (checked){
                    case R.id.rd_animodo1:
                        Intent intent = new Intent(Animodo1Activity.this,Animodo2Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rd_animodo2:
                        Intent inte = new Intent(Animodo1Activity.this,Animodo2Activity.class);
                        startActivity(inte);
                        break;
                    case R.id.rd_animodo3:
                        Intent intent1 = new Intent(Animodo1Activity.this,Animodo2Activity.class);
                        startActivity(intent1);
                        break;
                    case R.id.rd_animodo4:
                        Intent intent2 = new Intent(Animodo1Activity.this,Animodo2Activity.class);
                        startActivity(intent2);
                        break;
                    case R.id.rd_animodo5:
                        Intent intent3 = new Intent(Animodo1Activity.this,Animodo2Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rd_animodo6:
                        Intent intent4 = new Intent(Animodo1Activity.this,Animodo2Activity.class);
                        startActivity(intent4);
                        break;
                }
            }
        });



    }

}