package com.devsteve.test.Comunicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.devsteve.test.R;

public class ComunicacionActivity extends AppCompatActivity {

    private TextView continuarcomuni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion);

        continuarcomuni = findViewById(R.id.Tv_ContinuarComuni);
        continuarcomuni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ComunicacionActivity.this,Comunicacion1Activity.class);
                startActivity(intent);
            }
        });
    }
}