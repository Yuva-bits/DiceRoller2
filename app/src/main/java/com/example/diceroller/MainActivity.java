package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRoll = findViewById(R.id.roll);
        mRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll();
            }
        });
    }

    private void roll() {
        int rollno = (int)(Math.random() * 6 + 1);
        TextView mresult = findViewById(R.id.result);
        ImageView diceImage = findViewById(R.id.dice_image);

        switch(rollno){
            case 1:
                mresult.setText("One");
                diceImage.setImageResource(R.drawable.dice1);
                Toast.makeText(this, "one", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                mresult.setText("Two");
                diceImage.setImageResource(R.drawable.dice2);
                Toast.makeText(this, "Two", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                mresult.setText("Three");
                diceImage.setImageResource(R.drawable.dice3);
                Toast.makeText(this, "Three", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                mresult.setText("Four");
                diceImage.setImageResource(R.drawable.dice4);
                Toast.makeText(this, "Four", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                mresult.setText("Five");
                diceImage.setImageResource(R.drawable.dice5);
                Toast.makeText(this, "Five", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                mresult.setText("Six");
                diceImage.setImageResource(R.drawable.dice6);
                Toast.makeText(this, "Six", Toast.LENGTH_SHORT).show();
                break;
            default:
                mresult.setText("Empty Dice");
                diceImage.setImageResource(R.drawable.empty_dice);
                Toast.makeText(this, "Empty Dice", Toast.LENGTH_SHORT).show();
        }
    }
}