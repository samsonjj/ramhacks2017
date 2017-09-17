package com.example.nick.ramhacksgeofiree;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RamHacksGeoFiree extends AppCompatActivity {
    public Button swiper,swipes;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ram_hacks_geo_firee);
    }
    swiper = (Button) findViewById(R.id.swiper);
    swipes = (Button) findViewById(R.id.swipes);


    swiper.SetOnClickListener(new View.OnContextClickListener()){
        public void onClick(View v){
            Intent intent= new Intent(MainActivity.this, DriverLoginActivity.class);
            startActivity(intent);
            finish();
            return;
        }
    }

    @Override
    public View findViewById(@IdRes int id) {
        return super.findViewById(id);
    }
}
