package com.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnZero, btnOne, btnTwo, btnThree,
            btnFour, btnFive, btnSix, btnSeven,
            btnEight, btnNine, btnDecimal, btnPercent,
            btnAdd, btnSubtract, btnMultiply, btnEqualto;

    TextView tvResult;

    float Number1, Number2;

    boolean Add = false,
            Subtract = false,
            Multiply = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnEqualto = findViewById(R.id.btnEqualto);
        btnPercent = findViewById(R.id.btnPercent);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        tvResult = findViewById(R.id.tvResult);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "0");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "0");
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText() == null) {
                    tvResult.setText("");
                } else {
                    Number1 = Float.parseFloat(tvResult.getText() + "");
                    Add = true;
                    Subtract = false;
                    Multiply = false;
                    tvResult.setText(null);
                }
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText() == null) {
                    tvResult.setText("");
                } else {
                    Number1 = Float.parseFloat(tvResult.getText() + "");
                    Subtract = true;
                    Add = false;
                    Multiply = false;
                    tvResult.setText(null);
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText() == null) {
                    tvResult.setText("");
                } else {
                    Number1 = Float.parseFloat(tvResult.getText() + "");
                    Multiply = true;
                    Add = false;
                    Subtract = false;
                    tvResult.setText(null);
                }
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult == null) {
                    tvResult.setText("");
                } else {
                    Number1 = Float.parseFloat(tvResult.getText() + "");
                    Calculator calc = new Calculator(Number1, 0);
                    String result = calc.Percent() + "";
                    tvResult.setText(result);
                }
            }
        });

        btnEqualto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number2 = Float.parseFloat(tvResult.getText() + "");
                Calculator calculator = new Calculator(Number1, Number2);
                if (Add == true) {
                    String Result = Float.toString(calculator.Add());
                    tvResult.setText(Result);
                    Add = false;
                }
                if (Subtract == true) {
                    String Result = Float.toString(calculator.Subtract());
                    tvResult.setText(Result);
                    Subtract = false;
                }
                if (Multiply == true) {
                    String Result = Float.toString(calculator.Multiply());
                    tvResult.setText(Result);
                    Multiply = false;
                }
            }
        });


    }
}
