package com.example.testappled;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button2, button3, button1, button6, button4, button5, button7, button8, button9, buttonSum, buttonTotal;
    StringBuilder buffer = new StringBuilder();
    StringBuilder bufferNumOne = new StringBuilder();
    StringBuilder bufferNumTwo = new StringBuilder();
    String sum = "+";
    Integer numOne;
    Integer numTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.calculator_text);
        buttonTotal = (Button) findViewById(R.id.button_total);
        buttonTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equally();
            }
        });

        buttonSum = (Button) findViewById(R.id.button_addition);
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum();
            }
        });
        button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glueLines(1);
            }
        });
        button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glueLines(2);
            }
        });
        button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glueLines(3);
            }
        });
        button4 = (Button) findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glueLines(4);
            }
        });
        button5 = (Button) findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glueLines(5);
            }
        });
        button6 = (Button) findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glueLines(6);
            }
        });
        button7 = (Button) findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glueLines(7);
            }
        });
        button8 = (Button) findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glueLines(8);
            }
        });
        button9 = (Button) findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glueLines(9);
            }
        });

    }


    public void glueLines(int num) {
        if (!bufferNumOne.toString().isEmpty()) {
            buffer.append(num);
            textView.setText(numOne + sum + buffer.toString());
        } else {
            buffer.append(num);
            textView.setText(buffer.toString());
        }
    }

    public void sum() {
        numOne = Integer.parseInt(String.valueOf(buffer));
        bufferNumOne = buffer;
        buffer.setLength(0);
        textView.setText(numOne + sum);
    }

    public void equally() {
        numTwo = Integer.parseInt(String.valueOf(buffer));
        Integer sumNumber = numOne + numTwo;
        textView.setText(numOne+numTwo);
    }

}