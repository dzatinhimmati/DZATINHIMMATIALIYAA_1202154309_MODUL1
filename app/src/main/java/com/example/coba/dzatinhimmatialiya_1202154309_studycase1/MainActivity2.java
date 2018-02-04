package com.example.coba.dzatinhimmatialiya_1202154309_studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;



public class MainActivity2 extends AppCompatActivity {
    int uang = 65000;
    int harga;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eatbuss);
        TextView menumkn = (TextView) findViewById(R.id.menu);
        TextView jml = (TextView) findViewById(R.id.jumlah);
        TextView tempatmkn = (TextView) findViewById(R.id.tempat);
        TextView hargaa = (TextView) findViewById(R.id.harga);

        Intent i = getIntent();

        String Menumkn = i.getStringExtra("menu");
        String Lokasi = i.getStringExtra("tempat");
        String jumlah = i.getStringExtra("jumlah");

        menumkn.setText(Menumkn);
        jml.setText(jumlah);
        tempatmkn.setText(Lokasi);

        switch (Lokasi) {
            case "eatbuss":
                harga = 50000;
                break;
            case "upnormal":
                harga = 30000;
                break;

        }

        total = parseInt(jumlah) * harga;
        String hargaTotal = Integer.toString(total);
        if (uang < total) {
            hargaa.setText("Rp" + hargaTotal);
            Toast.makeText(this, "Uang tidak cukup", Toast.LENGTH_SHORT).show();
        } else {
            hargaa.setText("Rp" + hargaTotal);
            Toast.makeText(this, "Uang cukup", Toast.LENGTH_SHORT).show();
    }
    }
}