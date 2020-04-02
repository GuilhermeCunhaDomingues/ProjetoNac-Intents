package com.example.projetonac_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onNetshoes (View view1){
        Intent intent1 = new Intent(this,Intent1.class);
        startActivity(intent1);
    }

    public void onAmericanas (View view2){
        Intent americanas = new Intent(this,americanas.class);
        startActivity(americanas);
    }

    public void onMagalu (View view3){
        Intent magalu = new Intent(this,maga.class);
        startActivity(magalu);
    }

    public void onSubmarino (View view4){
        Intent subb = new Intent(this,subb.class);
        startActivity(subb);
    }

    public void onMercadoLivre (View view5){
        Intent ml = new Intent(this,mercadolivre.class);
        startActivity(ml);
    }

    public void onWebmotors (View view6){
        Intent wm = new Intent(this,webmotors.class);
        startActivity(wm);
    }


















    public void onSobre (View view7){
        Intent intentx = new Intent(this,sobre.class);
        startActivity(intentx);
    }

}
