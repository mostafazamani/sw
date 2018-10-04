package com.ba.swift;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class testone extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;
    int rang = 0;
    int send;
    int rn;
    int x = 2000;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testone);

        textView = (TextView) findViewById(R.id.textView);

        btn1 = (Button) findViewById(R.id.btnplus1);
        btn2 = (Button) findViewById(R.id.btnplus2);
        btn3 = (Button) findViewById(R.id.btnplus3);
        btn4 = (Button) findViewById(R.id.btnplus4);
        btn5 = (Button) findViewById(R.id.btnplus5);
        btn6 = (Button) findViewById(R.id.btnplus6);
        btn7 = (Button) findViewById(R.id.btnplus7);
        btn8 = (Button) findViewById(R.id.btnplus8);
        btn9 = (Button) findViewById(R.id.btnplus9);
        btn10 = (Button) findViewById(R.id.btnplus10);
        btn11 = (Button) findViewById(R.id.btnplus11);
        btn12 = (Button) findViewById(R.id.btnplus12);


        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btn6.setVisibility(View.INVISIBLE);
        btn7.setVisibility(View.INVISIBLE);
        btn8.setVisibility(View.INVISIBLE);
        btn9.setVisibility(View.INVISIBLE);
        btn10.setVisibility(View.INVISIBLE);
        btn11.setVisibility(View.INVISIBLE);
        btn12.setVisibility(View.INVISIBLE);


        textView.setText(String.valueOf(rang));
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang += 1;
                textView.setText(String.valueOf(rang));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang += 1;
                textView.setText(String.valueOf(rang));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang += 1;
                textView.setText(String.valueOf(rang));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang += 1;
                textView.setText(String.valueOf(rang));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang += 1;
                textView.setText(String.valueOf(rang));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang += 1;
                textView.setText(String.valueOf(rang));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang += 1;
                textView.setText(String.valueOf(rang));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang += 1;
                textView.setText(String.valueOf(rang));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang += 1;
                textView.setText(String.valueOf(rang));
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang += 1;
                textView.setText(String.valueOf(rang));
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang += 1;
                textView.setText(String.valueOf(rang));
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rang += 1;
                textView.setText(String.valueOf(rang));
            }
        });


        Random random = new Random();

        for (int i = 1; i <= 10; i++) {

            rn = random.nextInt(6);

            if (rn == 0) {
                forbtn1(x);
                forbtn2(x);
            } else if (rn == 1) {
                forbtn3(x);
                forbtn4(x);
            } else if (rn == 2) {
                forbtn5(x);
                forbtn6(x);
            } else if (rn == 3) {
                forbtn7(x);
                forbtn8(x);
            } else if (rn == 4) {
                forbtn9(x);
                forbtn10(x);
            } else if (rn == 5) {
                forbtn11(x);
                forbtn12(x);
            }
            x += 3000;

        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                send = rang;

                dialogtow dialog = new dialogtow();
                dialog.show(getSupportFragmentManager(), "next");
                dialog.setCancelable(false);

                SharedPreferences sp = getSharedPreferences("value", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("range",rang);
                editor.commit();


            }
        }, 31000);

    }


    public void forbtn1(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setVisibility(View.INVISIBLE);
            }
        }, y + 1000);

    }

    public void forbtn2(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn2.setVisibility(View.VISIBLE);

            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn2.setVisibility(View.INVISIBLE);

            }
        }, y + 1000);

    }

    public void forbtn3(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn3.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn3.setVisibility(View.INVISIBLE);
            }
        }, y + 1000);

    }

    public void forbtn4(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn4.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn4.setVisibility(View.INVISIBLE);
            }
        }, y + 1000);

    }

    public void forbtn5(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn5.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn5.setVisibility(View.INVISIBLE);
            }
        }, y + 1000);

    }

    public void forbtn6(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn6.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn6.setVisibility(View.INVISIBLE);
            }
        }, y + 1000);

    }

    public void forbtn7(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn7.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn7.setVisibility(View.INVISIBLE);
            }
        }, y + 1000);

    }

    public void forbtn8(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn8.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn8.setVisibility(View.INVISIBLE);
            }
        }, y + 1000);

    }

    public void forbtn9(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn9.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn9.setVisibility(View.INVISIBLE);
            }
        }, y + 1000);

    }

    public void forbtn10(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn10.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn10.setVisibility(View.INVISIBLE);
            }
        }, y + 1000);

    }

    public void forbtn11(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn11.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn11.setVisibility(View.INVISIBLE);
            }
        }, y + 1000);

    }

    public void forbtn12(int y) {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn12.setVisibility(View.VISIBLE);
            }
        }, y);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn12.setVisibility(View.INVISIBLE);
            }
        }, y + 1000);

    }

    public int result() {
        return rang;
    }
}
