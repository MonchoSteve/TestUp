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
import com.devsteve.test.Variables;

import static java.lang.System.exit;

public class Animodo1Activity extends AppCompatActivity{

    private RadioGroup animodorbg, rbganimodo2;
    private RadioButton animodrad, animodrad2, animodrad3, animodrad4, animodrad5, animodrad6;
    private RadioButton animodo1rad1, animodo1rad2, animodo1rad3, animodo1rad4, animodo1rad5, animodo1rad6;
    private String radiotext1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo1);

        animodorbg = findViewById(R.id.rbg1_animodo);
        animodrad = findViewById(R.id.rd_anim1);
        animodrad2 = findViewById(R.id.rd_anim2);
        animodrad3 = findViewById(R.id.rd_anim3);
        animodrad4 = findViewById(R.id.rd_anim4);
        animodrad5 = findViewById(R.id.rd_anim5);
        animodrad6 = findViewById(R.id.rd_anim6);

        //---------------Pregunta 2------------------
        rbganimodo2 = findViewById(R.id.rbg_Animodo2);
        animodo1rad1 = (RadioButton) findViewById(R.id.rd_animodo1);
        animodo1rad2 = (RadioButton) findViewById(R.id.rd_animodo2);
        animodo1rad3 = (RadioButton) findViewById(R.id.rd_animodo3);
        animodo1rad4 = (RadioButton) findViewById(R.id.rd_animodo4);
        animodo1rad5 = (RadioButton) findViewById(R.id.rd_animodo5);
        animodo1rad6 = (RadioButton) findViewById(R.id.rd_animodo6);

        animodorbg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rd_anim1:
                        if (animodrad.isChecked()){
                            Variables.setRdnum1(animodrad.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                            animodrad6.setChecked(false);
                        }
                        break;

                    case R.id.rd_anim2:
                        if (animodrad2.isChecked()){
                            Variables.setRdnum2(animodrad2.getText().toString());
                            animodrad.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                            animodrad6.setChecked(false);
                        }
                        break;

                    case R.id.rd_anim3:

                        if (animodrad3.isChecked()){
                            Variables.setRdnum3(animodrad3.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                            animodrad6.setChecked(false);
                        }

                        break;

                    case R.id.rd_anim4:

                        if (animodrad4.isChecked()){
                            Variables.setRdnum4(animodrad4.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad5.setChecked(false);
                            animodrad6.setChecked(false);
                        }
                        break;

                    case R.id.rd_anim5:

                        if (animodrad5.isChecked()){
                            Variables.setRdnum5(animodrad5.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad.setChecked(false);
                            animodrad6.setChecked(false);
                        }

                        break;

                    case R.id.rd_anim6:

                        if (animodrad6.isChecked()){
                            Variables.setRdnum6(animodrad6.getText().toString());
                            animodrad2.setChecked(false);
                            animodrad3.setChecked(false);
                            animodrad4.setChecked(false);
                            animodrad5.setChecked(false);
                            animodrad.setChecked(false);
                        }
                        break;

                }

            }
        });

        rbganimodo2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                switch (checked){
                    case R.id.rd_animodo1:

                        if (animodo1rad1.isChecked()){
                            Variables.setRdnum7(animodo1rad1.getText().toString());
                            Intent intel = new Intent(Animodo1Activity.this, Animodo2Activity.class);
                            startActivity(intel);
                        }

                        break;
                    case R.id.rd_animodo2:
                        if (animodo1rad2.isChecked()){
                            Variables.setRdnum8(animodrad2.getText().toString());
                            Intent inte = new Intent(Animodo1Activity.this,Animodo2Activity.class);
                            startActivity(inte);
                        }

                        break;
                    case R.id.rd_animodo3:
                        if (animodo1rad3.isChecked()){
                            Variables.setRdnum9(animodo1rad3.getText().toString());
                            Intent intent1 = new Intent(Animodo1Activity.this,Animodo2Activity.class);
                            startActivity(intent1);
                        }
                        break;
                    case R.id.rd_animodo4:

                        if (animodo1rad4.isChecked()){
                            Variables.setRdnum10(animodo1rad4.getText().toString());
                            Intent intent2 = new Intent(Animodo1Activity.this,Animodo2Activity.class);
                            startActivity(intent2);
                        }

                        break;
                    case R.id.rd_animodo5:
                        if (animodo1rad5.isChecked()){
                            Variables.setRdnum11(animodo1rad6.getText().toString());
                            Intent intent3 = new Intent(Animodo1Activity.this,Animodo2Activity.class);
                            startActivity(intent3);
                        }

                        break;
                    case R.id.rd_animodo6:

                        if (animodo1rad6.isChecked()){
                            Variables.setRdnum12(animodo1rad6.getText().toString());
                            Intent intent = new Intent(Animodo1Activity.this,Animodo2Activity.class);
                            startActivity(intent);
                        }

                        break;
                }

            }
        });

    }


}