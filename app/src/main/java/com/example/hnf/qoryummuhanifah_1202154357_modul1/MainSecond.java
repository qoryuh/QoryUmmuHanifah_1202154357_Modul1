package com.example.hnf.qoryummuhanifah_1202154357_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainSecond extends AppCompatActivity {
 TextView Namaresto, Namamakanan, Isiporsi, Totalharga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);
        Namaresto = (TextView) findViewById(R.id.namaresto);
        Namamakanan = (TextView) findViewById(R.id.namamakan);
        Isiporsi = (TextView) findViewById(R.id.isiporsi);
        Totalharga = (TextView) findViewById(R.id.totalharga);

        Intent intent = getIntent();

        String resto = intent.getStringExtra("Restoran");
        String makanan = intent.getStringExtra("Menu");
        int porsi = intent.getIntExtra("Porsi",0);
        int harga = intent.getIntExtra("Harga",0);

        Namaresto.setText(resto);
        Namamakanan.setText(makanan);
        Isiporsi.setText(""+porsi);
        Totalharga.setText(""+harga);

        if(harga > 65000){
            Toast toast = Toast.makeText(this,"Jangan disini makan malamnya, uang kamu tidak cukup",Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this,"Disini aja makan malamnya",Toast.LENGTH_LONG);
            toast.show();
        }

    }
}
