package com.example.appnoticia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
    }

    public void proximatela(View view){
        Intent intent = new Intent(this, tela4.class);
        startActivity(intent);
    }

    public void telaanterior(View view){
        Intent intent = new Intent(this, tela2.class);
        startActivity(intent);
    }
}