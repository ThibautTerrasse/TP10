package com.example.admin.tp10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button bouton1;
    Button bouton2;
    Button bouton3;
    Button bouton4;
    Button bouton5;
    Button bouton6;
    Button bouton7;
    Button bouton8;
    Button bouton9;
    Button boutonPlus;
    Button boutonMoins;
    Button boutonDiviser;
    Button boutonClear;
    Button boutonPop;
    Button boutonSwap;
    Button boutonEnter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bouton1 = (Button) findViewById(R.id.touche1);
        bouton2 = (Button) findViewById(R.id.touche2);
        bouton3 = (Button) findViewById(R.id.touche3);
        bouton4 = (Button) findViewById(R.id.touche4);
        bouton5 = (Button) findViewById(R.id.touche5);
        bouton6 = (Button) findViewById(R.id.touche6);
        bouton7 = (Button) findViewById(R.id.touche7);
        bouton8 = (Button) findViewById(R.id.touche8);
        bouton9 = (Button) findViewById(R.id.touche9);
        boutonPlus = (Button) findViewById(R.id.touchePlus);
        boutonMoins = (Button) findViewById(R.id.toucheMoins);
        boutonDiviser = (Button) findViewById(R.id.toucheDiviser);
        boutonClear = (Button) findViewById(R.id.toucheClear);
        boutonPop = (Button) findViewById(R.id.touchePop);
        boutonSwap = (Button) findViewById(R.id.toucheSwap);
        boutonEnter = (Button) findViewById(R.id.toucheEnter);
    }
}
