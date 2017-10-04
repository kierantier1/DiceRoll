package com.example.kieran.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class RollDice extends AppCompatActivity {
    Button bRoll;
    ImageView imgDice1;
    ImageView imgDice2;
    int nImgName;   //Code for file names

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_dice);
        bRoll = (Button) findViewById(R.id.bRoll);
        imgDice1 = (ImageView) findViewById(R.id.imgDice1);
        imgDice2 = (ImageView) findViewById(R.id.imgDice2);

        bRoll.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view){
               DiceRoll();
               imgDice1.setImageResource(nImgName);
               DiceRoll();
               imgDice2.setImageResource(nImgName);
           }
        });
    }
    public void DiceRoll(){
        int nNumImg = 6;
        Random Rand = new Random();
        int nRand = Rand.nextInt(nNumImg)+1;
        String sImgName = "d" + nRand;
        int nImgName = getResources().getIdentifier(sImgName, "drawable", getPackageName());
    }
}
