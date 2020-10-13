package com.devsteve.test.Cerebro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.devsteve.test.R;

public class CerebroActivity extends AppCompatActivity {

    private TextView cerebro_continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerebro);

        cerebro_continuar = findViewById(R.id.Tv_ContinuarCerebro);
        cerebro_continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CerebroActivity.this, Cerebro1Activity.class);
                startActivity(intent);
            }
        });
    }
}