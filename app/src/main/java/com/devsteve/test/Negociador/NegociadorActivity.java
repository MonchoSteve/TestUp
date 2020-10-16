package com.devsteve.test.Negociador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.devsteve.test.R;

public class NegociadorActivity extends AppCompatActivity {

    private TextView continuarnegocio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negociador);

        continuarnegocio = findViewById(R.id.Tv_ContinuarNegociador);
        continuarnegocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NegociadorActivity.this, Negociador1Activity.class);
                startActivity(intent);
            }
        });
    }
}