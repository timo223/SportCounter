package com.example.android.sportcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BasketballActivity extends AppCompatActivity {
    int resultA=0;
    int resultB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);
    }

    public void aClick3(View view){
        resultA=resultA+3;
        changeA(resultA);

    }

    public void aClick2(View view){
        resultA=resultA+2;
        changeA(resultA);

    }
    public void aClickFree(View view){
        resultA=resultA+1;
        changeA(resultA);

    }

    public void bClick3(View view){
        resultB=resultB+3;
        changeB(resultB);

    }

    public void bClick2(View view){
        resultB=resultB+2;
        changeB(resultB);

    }
    public void bClickFree(View view){
        resultB=resultB+1;
        changeB(resultB);

    }

    public void reset(View view){
        resultA=0;
        resultB=0;
        changeA(resultA);
        changeB(resultB);
    }

    private void changeB(int number){
        TextView resultA = (TextView) findViewById(R.id.result_b);
        resultA.setText("" +number);
    }

    private void changeA(int number){
        TextView resultA = (TextView) findViewById(R.id.result_a);
        resultA.setText("" +number);
    }
}
