package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.devsteve.test.R;
import com.devsteve.test.Variables;

public class Animodo2Activity extends AppCompatActivity {

    private RadioGroup rbanim, rbanim2;
    private RadioButton rd3_1, rd3_2, rd3_3, rd3_4, rd3_5, rd3_6, rd4_1, rd4_2, rd4_3, rd4_4, rd4_5, rd4_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo2);

        rbanim = findViewById(R.id.rbg_Animodo4);
        rd4_1 = findViewById(R.id.rd4_1);
        rd4_2 = findViewById(R.id.rd4_2);
        rd4_3 = findViewById(R.id.rd4_3);
        rd4_4 = findViewById(R.id.rd4_4);
        rd4_5 = findViewById(R.id.rd4_5);
        rd4_6 = findViewById(R.id.rd4_6);
        //-----
        rbanim2 = findViewById(R.id.rbg_Animodo3);
        rd3_1 = findViewById(R.id.rd3_1);
        rd3_2 = findViewById(R.id.rd3_2);
        rd3_3 = findViewById(R.id.rd3_3);
        rd3_4 = findViewById(R.id.rd3_4);
        rd3_5 = findViewById(R.id.rd3_5);
        rd3_6 = findViewById(R.id.rd3_6);

        rbanim2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int is) {
                switch(is){
                    case R.id.rd3_1:
                        if (rd3_1.isChecked()){
                            Variables.setRdnum13(rd3_1.getText().toString());
                            rd3_2.setChecked(false);
                            rd3_3.setChecked(false);
                            rd3_4.setChecked(false);
                            rd3_5.setChecked(false);
                            rd3_6.setChecked(false);
                        }
                        break;
                    case R.id.rd3_2:
                        if (rd3_2.isChecked()){
                            Variables.setRdnum14(rd3_2.getText().toString());
                            rd3_1.setChecked(false);
                            rd3_3.setChecked(false);
                            rd3_4.setChecked(false);
                            rd3_5.setChecked(false);
                            rd3_6.setChecked(false);
                        }
                        break;
                    case R.id.rd3_3:
                        if (rd3_3.isChecked()){
                            Variables.setRdnum15(rd3_3.getText().toString());
                            rd3_2.setChecked(false);
                            rd3_1.setChecked(false);
                            rd3_4.setChecked(false);
                            rd3_5.setChecked(false);
                            rd3_6.setChecked(false);
                        }
                        break;
                    case R.id.rd3_4:
                        if (rd3_4.isChecked()){
                            Variables.setRdnum16(rd3_4.getText().toString());
                            rd3_2.setChecked(false);
                            rd3_3.setChecked(false);
                            rd3_1.setChecked(false);
                            rd3_5.setChecked(false);
                            rd3_6.setChecked(false);
                        }
                        break;
                    case R.id.rd3_5:
                        if (rd3_5.isChecked()){
                            Variables.setRdnum17(rd3_5.getText().toString());
                            rd3_2.setChecked(false);
                            rd3_3.setChecked(false);
                            rd3_4.setChecked(false);
                            rd3_1.setChecked(false);
                            rd3_6.setChecked(false);
                        }
                        break;
                    case R.id.rd3_6:
                        if (rd3_6.isChecked()){
                            Variables.setRdnum18(rd3_6.getText().toString());
                            rd3_2.setChecked(false);
                            rd3_3.setChecked(false);
                            rd3_4.setChecked(false);
                            rd3_5.setChecked(false);
                            rd3_1.setChecked(false);
                        }
                        break;
                }
            }
        });
        rbanim.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd4_1:
                        Variables.setRdnum19(rd4_1.getText().toString());
                        Intent intent = new Intent(Animodo2Activity.this,Animodo3Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.rd4_2:
                        Variables.setRdnum20(rd4_2.getText().toString());
                        Intent intent1 = new Intent(Animodo2Activity.this, Animodo3Activity.class);
                        startActivity(intent1);
                        break;

                    case R.id.rd4_3:
                        Variables.setRdnum21(rd4_3.getText().toString());
                        Intent intent2 = new Intent(Animodo2Activity.this, Animodo3Activity.class);
                        startActivity(intent2);
                        break;

                    case R.id.rd4_4:
                        Variables.setRdnum22(rd4_4.getText().toString());
                        Intent intent3 = new Intent(Animodo2Activity.this, Animodo3Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.rd4_5:
                        Variables.setRdnum23(rd4_5.getText().toString());
                        Intent inten = new Intent(Animodo2Activity.this, Animodo3Activity.class);
                        startActivity(inten);
                        break;
                    case R.id.rd4_6:
                        Variables.setRdnum24(rd4_6.getText().toString());
                        Intent inte = new Intent(Animodo2Activity.this, Animodo3Activity.class);
                        startActivity(inte);
                        break;
                }
            }
        });
    }
}