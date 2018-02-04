package com.example.nabila.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Deklarasi variabel;
    EditText etMenu, etPorsi;
    Button btEatbus, btAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMenu = (EditText) findViewById(R.id.makanan);
        etPorsi = (EditText) findViewById(R.id.porsi);
        btEatbus = (Button) findViewById(R.id.eatbus);
        btAbnormal = (Button) findViewById(R.id.abnornal);

        btEatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,Main2Activity.class);
                String tempat = btEatbus.getText().toString();
                pindah.putExtra("menu", etMenu.getText().toString());
                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", etPorsi.getText().toString());
                startActivity(pindah);
            }
        });

        btAbnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,Main2Activity.class);
                String tempat = btAbnormal.getText().toString();
                pindah.putExtra("menu", etMenu.getText().toString());
                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", etPorsi.getText().toString());
                startActivity(pindah);
            }
        });
    }
}
