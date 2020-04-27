package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private ImageView image_view;
    private Random random=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.change);
        image_view=findViewById(R.id.imageView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dice_roll();
            }
        });
    }
    private void dice_roll(){
        int rand_num=random.nextInt(6)+1;
        Toast toast;
        switch(rand_num){
            case 1:
                image_view.setImageResource(R.drawable.dice1);
                toast=Toast.makeText(this,"1", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.show();
                break;
            case 2:
                image_view.setImageResource(R.drawable.dice2);
                toast = Toast.makeText(this, "2", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.show();
                break;
            case 3:
                image_view.setImageResource(R.drawable.dice3);
                toast=Toast.makeText(this,"3", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.show();
                break;
            case 4:
                image_view.setImageResource(R.drawable.dice4);
                toast=Toast.makeText(this,"4", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.show();
                break;
            case 5:
                image_view.setImageResource(R.drawable.dice5);
                toast=Toast.makeText(this,"5", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.show();
                break;
            case 6:
                image_view.setImageResource(R.drawable.dice6);
                toast=Toast.makeText(this,"6", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.show();
                break;
        }
    }
}
