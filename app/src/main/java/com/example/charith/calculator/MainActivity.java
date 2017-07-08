package com.example.charith.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_display;
    Button c;
    Button divide;
    Button multyply;
    Button allclear;
    Button nine;
    Button eight;
    Button seven;
    Button six;
    Button five;
    Button four;
    Button three;
    Button two;
    Button one;
    Button zero;
    Button dot;
    Button sub;
    Button sum;
    Button equal;
    Button power;
    double n1;
    double ans;
    double n2;
    char operator='x';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_display = (EditText)findViewById(R.id.editText2);
        c = (Button)findViewById(R.id.button20);
        divide = (Button)findViewById(R.id.button2);
        multyply = (Button)findViewById(R.id.button);
        allclear = (Button)findViewById(R.id.button3);
        one = (Button)findViewById(R.id.button5);
        two = (Button)findViewById(R.id.button13);
        three = (Button)findViewById(R.id.button14);
        four = (Button)findViewById(R.id.button4);
        five = (Button)findViewById(R.id.button10);
        six = (Button)findViewById(R.id.button11);
        seven = (Button)findViewById(R.id.button17);
        eight = (Button)findViewById(R.id.button6);
        nine = (Button)findViewById(R.id.button7);
        zero = (Button)findViewById(R.id.button16);
        dot = (Button)findViewById(R.id.button18);
        sum = (Button)findViewById(R.id.button12);
        sub = (Button)findViewById(R.id.button8);
        equal = (Button)findViewById(R.id.button15);
        power = (Button)findViewById(R.id.button19);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText(et_display.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText(et_display.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText(et_display.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText(et_display.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText(et_display.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText(et_display.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText(et_display.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText(et_display.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText(et_display.getText()+"9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText(et_display.getText()+"0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText(et_display.getText()+".");
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               try {
                   n1= Double.parseDouble(et_display.getText().toString());
                   et_display.setText("");
                   operator='+';
               }
               catch (Exception e1){
               }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n1=Double.parseDouble(et_display.getText().toString());
                    et_display.setText("");
                    operator='-';
                }
                catch (Exception e2){

                }

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n1=Double.parseDouble(et_display.getText().toString());
                    et_display.setText("");
                    operator='/';
                }
                catch (Exception e3){

                }

            }
        });

        multyply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               try {
                   n1=Double.parseDouble(et_display.getText().toString());
                   et_display.setText("");
                   operator='*';
               }
               catch (Exception e4){

               }

            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               try {
                   n1=Double.parseDouble(et_display.getText().toString());
                   et_display.setText("");
                   operator='^';
               }
               catch (Exception e5){

               }

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    n2=Double.parseDouble(et_display.getText().toString());
                    et_display.setText("");
                    if (operator=='+')
                    {
                        ans=n1+n2;
                    }else if (operator=='-')
                    {
                        ans=n1-n2;
                    }
                    else if(operator=='/') {
                        ans = n1 / n2;
                    }
                    else if(operator=='*')
                    {
                        ans=n1*n2;
                    }
                    else if(operator=='^'){
                        ans=Math.pow(n1,n2);
                    }
                    else if(operator=='x'){
                        et_display.setText("");
                    }


                    et_display.setText(Double.toString(ans));

                }
                catch (Exception e){

                }
            }
        });

        allclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText("");
                n1=0;
                n2=0;
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_display.setText(et_display.getText().toString().substring(0,et_display.getText().toString().length()-1));
            }
        });


    }
}
