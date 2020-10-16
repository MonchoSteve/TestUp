package com.devsteve.test.Vack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.devsteve.test.ActitudNegociadora.ActitudNegociadora5Activity;
import com.devsteve.test.ActitudNegociadora.ActitudNegociadora6Activity;
import com.devsteve.test.R;

public class VackActivity extends AppCompatActivity {

    private TextView continuarVack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vack);

        continuarVack = findViewById(R.id.Tv_ContinuarVack);
        continuarVack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VackActivity.this, Vack1Activity.class);
                startActivity(intent);
            }
        });
    }
}