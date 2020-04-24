package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView image_view;
    private Random random=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_view=findViewById(R.id.imageView);
        image_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dice_roll();
            }
        });
    }
    private void dice_roll(){
        int rand_num=random.nextInt(6)+1;
        switch(rand_num){
            case 1:
                image_view.setImageResource(R.drawable.dice1);
                break;
            case 2:
                image_view.setImageResource(R.drawable.dice2);
                break;
            case 3:
                image_view.setImageResource(R.drawable.dice3);
                break;
            case 4:
                image_view.setImageResource(R.drawable.dice4);
                break;
            case 5:
                image_view.setImageResource(R.drawable.dice5);
                break;
            case 6:
                image_view.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
