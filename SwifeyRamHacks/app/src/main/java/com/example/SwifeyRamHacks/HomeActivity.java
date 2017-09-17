package com.example.SwifeyRamHacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonFoodCamera,buttonCurrentLocation, buttonReceiptCamera, buttonTransactions, buttonSettings, buttonLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonFoodCamera = (Button) findViewById(R.id.buttonFoodCamera);
        buttonCurrentLocation = (Button) findViewById(R.id.buttonCurrentLocation);
        buttonReceiptCamera = (Button) findViewById(R.id.buttonReceiptCamera);
        buttonTransactions = (Button) findViewById(R.id.buttonReceiptCamera);
        buttonSettings = (Button) findViewById(R.id.buttonSettings);
        buttonLogOut = (Button) findViewById(R.id.buttonLogOut);

        buttonFoodCamera.setOnClickListener(this);
        buttonCurrentLocation.setOnClickListener(this);
        buttonReceiptCamera.setOnClickListener(this);
        buttonTransactions.setOnClickListener(this);
        buttonSettings.setOnClickListener(this);
        buttonLogOut.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view==buttonFoodCamera) {
            Toast.makeText(this, "Opening Food Camera", Toast.LENGTH_SHORT).show();

//            startActivity(new Intent(his, foodCamera.class));
        }
        if(view==buttonCurrentLocation) {
//            Toast.makeText(this, "Opening Food Camera", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(this, MapsActivityCurrentPlace.class));
        }

        if(view==buttonReceiptCamera) {
            Toast.makeText(this, "Opening Receipt Camera", Toast.LENGTH_SHORT).show();

//            startActivity(new Intent(his, receiptCamera.class));
        }

        if(view==buttonTransactions) {
            Toast.makeText(this, "Opening Transactions", Toast.LENGTH_SHORT).show();

//            startActivity(new Intent(his, foodCamera.class));
        }

        if(view==buttonSettings) {
//            Toast.makeText(this, "Opening Food Camera", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(this, SettingActivity.class));
        }

        if(view==buttonLogOut) {
              Toast.makeText(this, "Logging Out", Toast.LENGTH_SHORT).show();
              finish();
        }

    }
}
