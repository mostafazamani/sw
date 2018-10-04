package com.ba.swift;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class testtow extends AppCompatActivity {

    Button btnc1,btnc2,btnc3,btnuc1,btnuc2,btnuc3;
    TextView textView;
    int rang=0;
    int rn;
    int x=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testtow);

        textView = (TextView) findViewById(R.id.textView2);

        btnc1 = (Button) findViewById(R.id.btnc1);
        btnc2 = (Button) findViewById(R.id.btnc2);
        btnc3 = (Button) findViewById(R.id.btnc3);
        btnuc1 = (Button) findViewById(R.id.btnuc1);
        btnuc2 = (Button) findViewById(R.id.btnuc2);
        btnuc3 = (Button) findViewById(R.id.btnuc3);

        btnc1.setVisibility(View.INVISIBLE);
        btnc2.setVisibility(View.INVISIBLE);
        btnc3.setVisibility(View.INVISIBLE);
        btnuc1.setVisibility(View.INVISIBLE);
        btnuc2.setVisibility(View.INVISIBLE);
        btnuc3.setVisibility(View.INVISIBLE);

        textView.setText(String.valueOf(rang));


        btnc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang+=1;
                textView.setText(String.valueOf(rang));
            }
        });
        btnc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang+=1;
                textView.setText(String.valueOf(rang));
            }
        });
        btnc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang+=1;
                textView.setText(String.valueOf(rang));
            }
        });
        btnuc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang-=1;
                textView.setText(String.valueOf(rang));
            }
        });
        btnuc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang-=1;
                textView.setText(String.valueOf(rang));
            }
        });
        btnuc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang-=1;
                textView.setText(String.valueOf(rang));
            }
        });

        SharedPreferences sp = getSharedPreferences("value", Activity.MODE_PRIVATE);
        int range = sp.getInt("range",-1);
        Toast.makeText(this, String.valueOf(range), Toast.LENGTH_SHORT).show();



        Random random = new Random();

        for (int i = 1; i <= 10; i++) {

            rn = random.nextInt(10);

            if (rn == 0) {

            } else if (rn == 1) {
                forbtnc1(x);

            } else if (rn == 2) {
              forbtnuc1(x);
            } else if (rn == 3) {
               forbtnc2(x);
            } else if (rn == 4) {
                forbtnuc2(x);
            } else if (rn == 5) {
                forbtnuc3(x);
            }else if (rn == 6){
                forbtnc3(x);
            }else if (rn == 7){
                forbtnc1(x);
                forbtnuc3(x);
            }else if (rn == 8){
                forbtnc1(x);
                forbtnc3(x);
            }else if (rn == 9){
                forbtnc2(x);
                forbtnuc1(x);
            }else if (rn == 10){
                forbtnc3(x);
                forbtnuc1(x);
            }
            x += 2700;

        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                dialogthree dialog = new dialogthree();
                dialog.show(getSupportFragmentManager(), "next");
                dialog.setCancelable(false);

                result(String.valueOf(rang));
            }
        },29000);


    }



    public void forbtnc1(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnc1.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnc1.setVisibility(View.INVISIBLE);
            }
        }, y + 700);

    }
    public void forbtnc2(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnc2.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnc2.setVisibility(View.INVISIBLE);
            }
        }, y + 700);

    }
    public void forbtnc3(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnc3.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnc3.setVisibility(View.INVISIBLE);
            }
        }, y + 700);

    }
    public void forbtnuc1(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnuc1.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnuc1.setVisibility(View.INVISIBLE);
            }
        }, y + 700);

    }
    public void forbtnuc2(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnuc2.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnuc2.setVisibility(View.INVISIBLE);
            }
        }, y + 700);

    }
    public void forbtnuc3(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnuc3.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btnuc3.setVisibility(View.INVISIBLE);
            }
        }, y + 700);

    }
    public void result(String r){
        Toast.makeText(this, ""+r , Toast.LENGTH_SHORT).show();
    }


}
