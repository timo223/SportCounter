package com.example.android.sportcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openKicker(View view){
        Intent i = new Intent(this, KickerActivity.class);
        startActivity(i);
    }

    public void openBasketball(View view) {
        Intent i = new Intent(this, KickerActivity.class);
        startActivity(i);
    }

    public void openChecklist(View view) {
        Intent i = new Intent(this, KickerActivity.class);
        startActivity(i);
    }
}
