package com.ba.swift;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.provider.CalendarContract;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class testthree extends AppCompatActivity {

    ImageView imageView;
    Button btncolor1, btncolor2, btncolor3, btncolor4, btncolor5, btncolor6, btncolor7, btncolor8, btncolor9;
    int pos1 = 0;
    int pos2 = 0;
    int pos3 = 0;
    int pos4 = 0;
    int pos5 = 0;
    int pos6 = 0;
    int pos7 = 0;
    int pos8 = 0;
    int pos9 = 0;

    int time[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g ,
            R.drawable.h , R.drawable.k , R.drawable.m , R.drawable.n , R.drawable.o , R.drawable.p , R.drawable.q ,
            R.drawable.r , R.drawable.s};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testthree);

        imageView = (ImageView) findViewById(R.id.imageView);

        btncolor1 = (Button) findViewById(R.id.btncolor1);
        btncolor2 = (Button) findViewById(R.id.btncolor2);
        btncolor3 = (Button) findViewById(R.id.btncolor3);
        btncolor4 = (Button) findViewById(R.id.btncolor4);
        btncolor5 = (Button) findViewById(R.id.btncolor5);
        btncolor6 = (Button) findViewById(R.id.btncolor6);
        btncolor7 = (Button) findViewById(R.id.btncolor7);
        btncolor8 = (Button) findViewById(R.id.btncolor8);
        btncolor9 = (Button) findViewById(R.id.btncolor9);

        imageView.setImageResource(time[0]);
        timeviwe();

        btncolor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pos1 == 0) {
                    btncolor1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
                    pos1 = 1;
                } else if (pos1 == 1) {
                    btncolor1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
                    pos1 = 2;
                } else if (pos1 == 2) {
                    btncolor1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    pos1 = 0;
                }

            }
        });
        btncolor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pos2 == 0) {
                    btncolor2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
                    pos2 = 1;
                } else if (pos2 == 1) {
                    btncolor2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
                    pos2 = 2;
                } else if (pos2 == 2) {
                    btncolor2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    pos2 = 0;
                }

            }
        });
        btncolor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pos3 == 0) {
                    btncolor3.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
                    pos3 = 1;
                } else if (pos3 == 1) {
                    btncolor3.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
                    pos3 = 2;
                } else if (pos3 == 2) {
                    btncolor3.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    pos3 = 0;
                }

            }
        });
        btncolor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pos4 == 0) {
                    btncolor4.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
                    pos4 = 1;
                } else if (pos4 == 1) {
                    btncolor4.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
                    pos4 = 2;
                } else if (pos4 == 2) {
                    btncolor4.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    pos4 = 0;
                }

            }
        });
        btncolor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pos5 == 0) {
                    btncolor5.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
                    pos5 = 1;
                } else if (pos5 == 1) {
                    btncolor5.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
                    pos5 = 2;
                } else if (pos5 == 2) {
                    btncolor5.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    pos5 = 0;
                }

            }
        });
        btncolor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pos6 == 0) {
                    btncolor6.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
                    pos6 = 1;
                } else if (pos6 == 1) {
                    btncolor6.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
                    pos6 = 2;
                } else if (pos6 == 2) {
                    btncolor6.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    pos6 = 0;
                }

            }
        });
        btncolor7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pos7 == 0) {
                    btncolor7.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
                    pos7 = 1;
                } else if (pos7 == 1) {
                    btncolor7.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
                    pos7 = 2;
                } else if (pos7 == 2) {
                    btncolor7.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    pos7 = 0;
                }

            }
        });
        btncolor8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pos8 == 0) {
                    btncolor8.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
                    pos8 = 1;
                } else if (pos8 == 1) {
                    btncolor8.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
                    pos8 = 2;
                } else if (pos8 == 2) {
                    btncolor8.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    pos8 = 0;
                }

            }
        });
        btncolor9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pos9 == 0) {
                    btncolor9.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
                    pos9 = 1;
                } else if (pos9 == 1) {
                    btncolor9.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
                    pos9 = 2;
                } else if (pos9 == 2) {
                    btncolor9.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    pos9 = 0;
                }

            }
        });

        winorlose();


    }


    public void winorlose() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                dialogfour dialog = new dialogfour();
                dialog.show(getSupportFragmentManager(), "next");
                dialog.setCancelable(false);

                if (pos1 == 0 && pos2 == 0 && pos3 == 0
                        && pos4 == 1 && pos5 == 1 && pos6 == 1
                        && pos7 == 2 && pos8 == 2 && pos9 == 2) {
                    Toast.makeText(testthree.this, "its true", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(testthree.this, "its false", Toast.LENGTH_SHORT).show();
                }


            }
        }, 15000);


    }

    public void timeviwe() {
        Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[1]);
            }
        }, 1000);

        Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[2]);
            }
        }, 2000);

        Handler handler3 = new Handler();
        handler3.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[3]);
            }
        }, 3000);

        Handler handler4 = new Handler();
        handler4.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[4]);
            }
        }, 4000);

        Handler handler5 = new Handler();
        handler5.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[5]);
            }
        }, 5000);

        Handler handler6 = new Handler();
        handler6.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[6]);
            }
        }, 6000);

        Handler handler7 = new Handler();
        handler7.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[7]);
            }
        }, 7000);

        Handler handler8 = new Handler();
        handler8.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[8]);
            }
        }, 8000);

        Handler handler9 = new Handler();
        handler9.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[9]);
            }
        }, 9000);

        Handler handler10 = new Handler();
        handler10.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[10]);
            }
        }, 10000);

        Handler handler11 = new Handler();
        handler11.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[11]);
            }
        }, 11000);

        Handler handler12 = new Handler();
        handler12.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[12]);
            }
        }, 12000);

        Handler handler13 = new Handler();
        handler13.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[13]);
            }
        }, 13000);

        Handler handler14 = new Handler();
        handler14.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[14]);
            }
        }, 14000);

        Handler handler15 = new Handler();
        handler15.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setImageResource(time[15]);
            }
        }, 15000);

    }

}
