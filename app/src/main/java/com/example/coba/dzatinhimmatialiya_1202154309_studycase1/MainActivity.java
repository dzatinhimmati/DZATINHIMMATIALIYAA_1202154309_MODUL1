package com.example.coba.dzatinhimmatialiya_1202154309_studycase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edJml, edMkn;
    Button btupnormal, bteatbuss, btkembali;
    TextView txtmenu, txtjumlah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edJml = (EditText) findViewById(R.id.editTextJml);
        edMkn = (EditText) findViewById(R.id.editTextMkn);
        btupnormal = (Button) findViewById(R.id.buttonupnormal);
        bteatbuss = (Button) findViewById(R.id.buttoneatbuss);



        btupnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salin = new Intent(MainActivity.this,MainActivity2.class);
                String tempat = btupnormal.getText().toString();
                salin.putExtra("menu", edMkn.getText().toString());
                salin.putExtra("tempat", tempat);
                salin.putExtra("jumlah", edJml.getText().toString());
                startActivity(salin);

            }
        });
        bteatbuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salin = new Intent(MainActivity.this,MainActivity2.class);
                String tempat = bteatbuss.getText().toString();
                salin.putExtra("menu", edMkn.getText().toString());
                salin.putExtra("tempat", tempat);
                salin.putExtra("jumlah", edJml.getText().toString());
                startActivity(salin);


            }
        });

    }

}
