package com.devsteve.test.Animodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.devsteve.test.R;

public class AnimodoActivity extends AppCompatActivity {

    private TextView btn_contian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animodo);

        btn_contian = findViewById(R.id.Tv_AnimodoContinuar);
        btn_contian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AnimodoActivity.this, Animodo1Activity.class);
                startActivity(intent);
            }
        });
    }
}