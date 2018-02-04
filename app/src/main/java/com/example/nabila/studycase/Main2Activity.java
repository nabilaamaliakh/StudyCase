package com.example.nabila.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class Main2Activity extends AppCompatActivity {
    int uangOsas = 65000;
    int biaya, total, hargaTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studycase);

        TextView Lokasi = (TextView)findViewById(R.id.lokasi);
        TextView Menu = (TextView)findViewById(R.id.makanan);
        TextView Porsi = (TextView)findViewById(R.id.jumlah);
        TextView Hasil = (TextView)findViewById(R.id.harga);

        Intent i = getIntent();

        String makanan = i.getStringExtra("makanan");
        String lokasi = i.getStringExtra("tempat");
        String porsi = i.getStringExtra("porsi");

        Lokasi.setText(lokasi);
        Menu.setText(makanan);
        Porsi.setText(porsi);

        switch (lokasi){
            case "Eatbus":
                biaya = 50000;
                break;
            case "Abnormal":
                biaya = 30000;
                break;
        }
        total = parseInt(porsi) * biaya;
        String hargaTotal = Integer.toString(total);
        if(uangOsas < total){
            Hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
        }else{
            Hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_SHORT).show();
        }
    }
}
