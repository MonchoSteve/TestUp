package com.devsteve.test.ActitudNegociadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.devsteve.test.R;

public class ActitudNegociadoraActivity extends AppCompatActivity {

    private TextView continuarActNego;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actitud_negociadora);

        continuarActNego = findViewById(R.id.Tv_ContinuarActNego);
        continuarActNego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActitudNegociadoraActivity.this, ActitudNegociadora1Activity.class);
                startActivity(intent);
            }
        });

    }
}