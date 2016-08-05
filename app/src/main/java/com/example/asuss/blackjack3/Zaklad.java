package com.example.asuss.blackjack3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Zaklad extends AppCompatActivity {

    public static final String extra_kasa = "";
    public static final String extra_zaklad = "";
    int zaklad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_zaklad);
        Intent intent = getIntent();
        String kasa = intent.getStringExtra(extra_kasa);
        Bundle extras = intent.getExtras();
        String x = extras.getString(extra_zaklad);
        TextView ile = (TextView) findViewById(R.id.za_ile);
        ile.setText(kasa);
    }

    public void podwojenie(View v){
        TextView ile = (TextView) findViewById(R.id.za_ile);
        zaklad = zaklad + zaklad;
        String zakladS = Integer.toString(zaklad);
        ile.setText(zakladS);
    }
}
