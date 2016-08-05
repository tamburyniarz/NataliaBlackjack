package com.example.asuss.blackjack3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Glowna extends AppCompatActivity {

    Button button;
    ImageView imageView;


    int kaasa=0;
    int budzet = 10000;
    Context context;

    public void addListenerButton(){
        imageView = (ImageView) findViewById(R.id.jew);

        button = (Button) findViewById(R.id.btnChangeImage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "WYIBERZ KWOTE DO ZAKLADU", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.jew2);
                System.out.println("Click");
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glowna);
        TextView budzetT = (TextView) findViewById(R.id.budzet);
        String budzetS = Integer.toString(budzet);
        budzetT.setText(budzetS);
        addListenerButton();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_glowna, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void obstaw(View v){
        TextView text = (TextView) findViewById(R.id.kasa);
        if(text.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "WYIBERZ KWOTE DO ZAKLADU", Toast.LENGTH_SHORT).show();
            return;
        }
        context = getApplicationContext();
        String kasa = Integer.toString(kaasa);
        Intent intent = new Intent(context, Zaklad.class);
        intent.putExtra(Zaklad.extra_zaklad, 20);
        intent.putExtra(Zaklad.extra_kasa, kasa);
        //intent.putExtra(Zaklad.extra_zaklad, kaasa);
        startActivity(intent);
        budzet = budzet - kaasa;
        String budzetS = Integer.toString(budzet);
        TextView budzetT = (TextView) findViewById(R.id.budzet);
        budzetT.setText(budzetS);
        text.setText("");
        kaasa=0;
    }

    int budzet_temp = budzet;
   public void jeden(View v){
       TextView text = (TextView) findViewById(R.id.kasa);
        kaasa = kaasa+1;
        String kasa = Integer.toString(kaasa);
        text.setText(kasa);
       budzet_temp = budzet_temp - 1;
       String budzetS = Integer.toString(budzet_temp);
       TextView budzetT = (TextView) findViewById(R.id.budzet);
       budzetT.setText(budzetS);
    }

    public void piec(View v){
        TextView text = (TextView) findViewById(R.id.kasa);
        kaasa = kaasa +5;
        String kasa = Integer.toString(kaasa);
        text.setText(kasa);
        budzet_temp = budzet_temp - 5;
        String budzetS = Integer.toString(budzet_temp);
        TextView budzetT = (TextView) findViewById(R.id.budzet);
        budzetT.setText(budzetS);
    }
}
