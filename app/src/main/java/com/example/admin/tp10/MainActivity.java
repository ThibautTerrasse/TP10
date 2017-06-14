package com.example.admin.tp10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Stack<Integer> stack;

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

    TextView champDeSaisi;
    TextView champPile1;
    TextView champPile2;
    TextView champPile3;
    TextView champPile4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stack = new Stack<Integer>();

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

        champDeSaisi = (TextView) findViewById(R.id.NombreSaisi);
        champPile1 = (TextView) findViewById(R.id.Pile1);
        champPile2 = (TextView) findViewById(R.id.Pile2);
        champPile3 = (TextView) findViewById(R.id.Pile3);
        champPile4 = (TextView) findViewById(R.id.Pile3);

        //Ajout des Listener
        bouton1.setOnClickListener(this);
        bouton2.setOnClickListener(this);
        bouton3.setOnClickListener(this);
        bouton4.setOnClickListener(this);
        bouton5.setOnClickListener(this);
        bouton6.setOnClickListener(this);
        bouton7.setOnClickListener(this);
        bouton8.setOnClickListener(this);
        bouton9.setOnClickListener(this);
        boutonEnter.setOnClickListener(this);
        boutonClear.setOnClickListener(this);
        boutonPop.setOnClickListener(this);
        boutonSwap.setOnClickListener(this);
        boutonPlus.setOnClickListener(this);
        boutonMoins.setOnClickListener(this);
        boutonDiviser.setOnClickListener(this);
    }
        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case  R.id.touche1 :
                    chiffreClick(bouton1.getText().toString());;
                    break;

                case R.id.touche2:
                    chiffreClick(bouton2.getText().toString());
                    break;
                case R.id.touche3:
                    chiffreClick(bouton3.getText().toString());
                    break;
                case R.id.touche4:
                    chiffreClick(bouton4.getText().toString());
                    break;
                case R.id.touche5:
                    chiffreClick(bouton5.getText().toString());
                    break;
                case R.id.touche6:
                    chiffreClick(bouton6.getText().toString());
                    break;
                case R.id.touche7:
                    chiffreClick(bouton7.getText().toString());
                    break;
                case R.id.touche8:
                    chiffreClick(bouton8.getText().toString());
                    break;
                case R.id.touche9:
                    chiffreClick(bouton9.getText().toString());
                    break;
                case R.id.toucheEnter:
                        entrer();
                        break;

                case R.id.toucheClear:
                    pileClear();
                    stack.clear();
                    break;
                case R.id.touchePop:
                    pop();
                    break;
                case R.id.toucheSwap:
                    swap();
                    break;
                case R.id.touchePlus:
                        additionner();

                    break;
                case R.id.toucheMoins:
                    soustraire();
                    break;
                case R.id.toucheDiviser:

                    break;

            }
        }

    public void chiffreClick(String str) {
                str = champDeSaisi.getText() + str;
                champDeSaisi.setText(str);
    }

    public void refreshPile(Stack<Integer> pile) {
        if (pile.size() >= 1) {
            champPile1.setText(pile.get(pile.size() - 1).toString());
        }
        if (pile.size() >= 2) {
            champPile2.setText(pile.get(pile.size() - 2).toString());
        }
        if (pile.size() >= 3) {
            champPile3.setText(pile.get(pile.size() - 3).toString());
        }
        if (pile.size() >= 4) {
            champPile4.setText(pile.get(pile.size() - 4).toString());
        }
    }
        public void pileClear(){
       champDeSaisi.setText("");
        champPile1.setText("");
        champPile2.setText("");
        champPile3.setText("");
        champPile4.setText("");
    }

        public void pop(){
        if(!stack.empty()){
             stack.pop();
            pileClear();
            refreshPile(stack);
        }

    }

    public void swap(){
        int num1,num2;
        num1 = stack.peek();
        stack.pop();
        num2 = stack.peek();
        stack.pop();
        stack.push(num1);
        stack.push(num2);
        pileClear();
        refreshPile(stack);
    }
    public void entrer() {
        if (!champDeSaisi.getText().toString().equals("")) {
            int valeur = Integer.valueOf(champDeSaisi.getText().toString());
            stack.push(valeur);
            refreshPile(stack);
            champDeSaisi.setText("");
        }
    }
    public void additionner(){
        entrer();
        int nombreAddition, num1,num2;
        num1 = stack.peek();
        stack.pop();
        num2 = stack.peek();
        stack.pop();
        nombreAddition = num1+num2;
        stack.push(nombreAddition);
        pileClear();
        refreshPile(stack);
    }
    public void soustraire(){
        entrer();
        int nombreSoustraire, num1,num2;
        num1 = stack.peek();
        stack.pop();
        num2 = stack.peek();
        stack.pop();
        nombreSoustraire = num1-num2;
        stack.push(nombreSoustraire);
        pileClear();
        refreshPile(stack);
    }



}


