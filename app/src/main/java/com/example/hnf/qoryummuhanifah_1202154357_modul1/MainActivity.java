package com.example.hnf.qoryummuhanifah_1202154357_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText makann, jumlahh;
    String Restoran,Menu;
    int Porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makann = (EditText) findViewById(R.id.makan);
        jumlahh = (EditText) findViewById(R.id.jumlah);
    }

    public void ABNORMAL(View view) {
        Intent intent = new Intent(this,MainSecond.class);
        Restoran = "Abnormal";
        Menu = makann.getText().toString();
        Porsi = Integer.parseInt(jumlahh.getText().toString());
        int Harga = 30000*Porsi;
        Log.d("harga makan","Rp."+Harga);
        intent.putExtra("Restoran",Restoran);//ngepos ke second activity
        intent.putExtra("Menu", Menu);
        intent.putExtra("Porsi",Porsi);
        intent.putExtra("Harga",Harga);
        startActivity(intent);
    }

    public void EATBUS(View view) {
        Intent intent = new Intent(this,MainSecond.class);
        String Restoran = "Eatbus";
        String Menu = makann.getText().toString();
        Porsi = Integer.parseInt(jumlahh.getText().toString());
        int Harga = 50000*Porsi;
        intent.putExtra("Restoran",Restoran);//ngepos ke second activity
        intent.putExtra("Menu", Menu);
        intent.putExtra("Porsi",Porsi);
        intent.putExtra("Harga",Harga);
        startActivity(intent);
    }
}
