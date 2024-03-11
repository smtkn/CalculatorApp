package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView logText, calculationText;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8 , button9;
    Button buttonC, buttonAC, buttonDot, buttonEqual, buttonPlus, buttonMinus, buttonMulti, buttonDiv, buttonMod, buttonPlusMinus;
    float number1, number2, calculationResult;
    boolean plus, minus, div, mod, multi, isNewCalculation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logText = findViewById(R.id.logText);
        calculationText = findViewById(R.id.calculationText);

        logText.setText(null);
        calculationText.setText(null);

        calculationResult = 0;
        plus = false;
        minus = false;
        div = false;
        multi = false;
        mod = false;
        isNewCalculation = true;

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonC = findViewById(R.id.buttonC);
        buttonAC = findViewById(R.id.buttonAC);
        buttonDot = findViewById(R.id.buttonDot);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMulti = findViewById(R.id.buttonMulti);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMod = findViewById(R.id.buttonMod);
        buttonPlusMinus = findViewById(R.id.buttonPlusMinus);

        buttonPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!calculationText.getText().toString().isEmpty()) {
                    float currentValue = Float.parseFloat(calculationText.getText().toString());
                    calculationText.setText(String.valueOf(-currentValue));
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(calculationText.getText()+"0");
                logText.setText(calculationText.getText());
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(calculationText.getText()+"1");
                logText.setText(calculationText.getText());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(calculationText.getText()+"2");
                logText.setText(calculationText.getText());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(calculationText.getText()+"3");
                logText.setText(calculationText.getText());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(calculationText.getText()+"4");
                logText.setText(calculationText.getText());
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(calculationText.getText()+"5");
                logText.setText(calculationText.getText());
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(calculationText.getText()+"6");
                logText.setText(calculationText.getText());
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(calculationText.getText()+"7");
                logText.setText(calculationText.getText());
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(calculationText.getText()+"8");
                logText.setText(calculationText.getText());
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(calculationText.getText()+"9");
                logText.setText(calculationText.getText());
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(null);
                logText.setText(null);
                number1 = 0;
                number2 = 0;
                calculationResult = 0;
                plus = false;
                minus = false;
                div = false;
                multi = false;
                mod = false;
                isNewCalculation = false; // Yeniden başlatılan hesaplamaları durdur
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(calculationText.getText()+".");
                logText.setText(calculationText.getText());
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!calculationText.getText().toString().isEmpty()) { // Değer girilmiş mi kontrolü
                    if (isNewCalculation) {
                        buttonEqual.performClick();
                    }

                    number1 = Float.parseFloat(calculationText.getText().toString());
                    plus = true;
                    logText.setText(number1 + " + ");
                    calculationText.setText(null);
                    isNewCalculation = true;
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!calculationText.getText().toString().isEmpty()) {
                    if (isNewCalculation) {
                        buttonEqual.performClick();
                    }

                    number1 = Float.parseFloat(calculationText.getText().toString());
                    minus = true;
                    logText.setText(number1 + " - ");
                    calculationText.setText(null);
                    isNewCalculation = true;
                }
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!calculationText.getText().toString().isEmpty()) {
                    if (isNewCalculation) {
                        buttonEqual.performClick();
                    }

                    number1 = Float.parseFloat(calculationText.getText().toString());
                    multi = true;
                    logText.setText(number1 + " x ");
                    calculationText.setText(null);
                    isNewCalculation = true;
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!calculationText.getText().toString().isEmpty()) {
                    if (isNewCalculation) {
                        buttonEqual.performClick();
                    }

                    number1 = Float.parseFloat(calculationText.getText().toString());
                    div = true;
                    logText.setText(number1 + " / ");
                    calculationText.setText(null);
                    isNewCalculation = true;
                }
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!calculationText.getText().toString().isEmpty()) {
                    if (isNewCalculation) {
                        buttonEqual.performClick();
                    }

                    number1 = Float.parseFloat(calculationText.getText().toString());
                    mod = true;
                    logText.setText(number1 + " % ");
                    calculationText.setText(null);
                    isNewCalculation = true;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationText.setText(null);
                isNewCalculation = false;
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!calculationText.getText().toString().isEmpty()) {
                    number2 = Float.parseFloat(calculationText.getText().toString());

                    if (plus) {
                        calculationResult = number1 + number2;
                        calculationText.setText(calculationResult + "");
                        logText.setText(number1 + " + " + number2);
                        plus = false;
                    } else if (minus) {
                        calculationText.setText(number1 - number2 + "");
                        logText.setText(number1 + " - " + number2);
                        minus = false;
                    } else if (multi) {
                        calculationText.setText(number1 * number2 + "");
                        logText.setText(number1 + " x " + number2);
                        multi = false;
                    } else if (div) {
                        if ((int) number2 == 0) {
                            calculationText.setText("ERROR");
                            logText.setText(null);
                            div = false;
                        } else {
                            calculationText.setText(number1 / number2 + "");
                            logText.setText(number1 + " / " + number2);
                            div = false;
                        }
                    } else if (mod) {
                        calculationText.setText(number1 % number2 + "");
                        logText.setText(number1 + " % " + number2);
                        mod = false;
                    }

                    number1 = calculationResult;
                    number2 = 0;
                    isNewCalculation = false;
                }
            }
        });

    }
}