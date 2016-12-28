package com.example.sahiljain.game_tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Game_Screen_two_player extends AppCompatActivity implements View.OnClickListener{

    TextView text_P_1;
    TextView text_p_2;
    ImageView image_1, image_2, image_3, image_4, image_5, image_6, image_7, image_8, image_9;
    int p_move = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen_two_player);
/*
        Intent i = getIntent();
        String icon = i.getStringExtra("Icon");

        if(icon.equalsIgnoreCase("Circle")){
            p_move=2;
        }
        if (icon.equalsIgnoreCase("Cross")){
            p_move=1;
        }
*/

        text_P_1 = (TextView) findViewById(R.id.game_text_p_1);
        text_p_2 = (TextView) findViewById(R.id.game_text_p_2);

        image_1 = (ImageView) findViewById(R.id.game_sign_1);
        image_2 = (ImageView) findViewById(R.id.game_sign_2);
        image_3 = (ImageView) findViewById(R.id.game_sign_3);
        image_4 = (ImageView) findViewById(R.id.game_sign_4);
        image_5 = (ImageView) findViewById(R.id.game_sign_5);
        image_6 = (ImageView) findViewById(R.id.game_sign_6);
        image_7 = (ImageView) findViewById(R.id.game_sign_7);
        image_8 = (ImageView) findViewById(R.id.game_sign_8);
        image_9 = (ImageView) findViewById(R.id.game_sign_9);

        image_1.setOnClickListener(this);
        image_2.setOnClickListener(this);
        image_3.setOnClickListener(this);
        image_4.setOnClickListener(this);
        image_5.setOnClickListener(this);
        image_6.setOnClickListener(this);
        image_7.setOnClickListener(this);
        image_8.setOnClickListener(this);
        image_9.setOnClickListener(this);

    }//onCreate


    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.game_sign_1){
            if (p_move == 1)
            {
                image_1.setImageResource(R.drawable.icon_cross);
                p_move=2;
            }
            else if (p_move == 2){
               image_1.setImageResource(R.drawable.icon_circle);
                p_move=1;
            }
        }

        if (v.getId()==R.id.game_sign_2){
            if (p_move == 1)
            {
                image_2.setImageResource(R.drawable.icon_cross);
                p_move=2;
            }
            else if (p_move == 2){
                image_2.setImageResource(R.drawable.icon_circle);
                p_move=1;
            }
        }

        if (v.getId()==R.id.game_sign_3){
            if (p_move == 1)
            {
                image_3.setImageResource(R.drawable.icon_cross);
                p_move=2;
            }
            else if (p_move == 2){
                image_3.setImageResource(R.drawable.icon_circle);
                p_move=1;
            }
        }

        if (v.getId()==R.id.game_sign_4){
            if (p_move == 1)
            {
                image_4.setImageResource(R.drawable.icon_cross);
                p_move=2;
            }
            else if (p_move == 2){
                image_4.setImageResource(R.drawable.icon_circle);
                p_move=1;
            }
        }

        if (v.getId()==R.id.game_sign_5){
            if (p_move == 1)
            {
                image_5.setImageResource(R.drawable.icon_cross);
                p_move=2;
            }
            else if (p_move == 2){
                image_5.setImageResource(R.drawable.icon_circle);
                p_move=1;
            }
        }
        if (v.getId()==R.id.game_sign_6){
            if (p_move == 1)
            {
                image_6.setImageResource(R.drawable.icon_cross);
                p_move=2;
            }
            else if (p_move == 2){
                image_6.setImageResource(R.drawable.icon_circle);
                p_move=1;
            }
        }
        if (v.getId()==R.id.game_sign_7){
            if (p_move == 1)
            {
                image_7.setImageResource(R.drawable.icon_cross);
                p_move=2;
            }
            else if (p_move == 2){
                image_7.setImageResource(R.drawable.icon_circle);
                p_move=1;
            }
        }

        if (v.getId()==R.id.game_sign_8){
            if (p_move == 1)
            {
                image_8.setImageResource(R.drawable.icon_cross);
                p_move=2;
            }
            else if (p_move == 2){
                image_8.setImageResource(R.drawable.icon_circle);
                p_move=1;
            }
        }

        if (v.getId()==R.id.game_sign_9){
            if (p_move == 1)
            {
                image_9.setImageResource(R.drawable.icon_cross);
                p_move=2;
            }
            else if (p_move == 2){
                image_9.setImageResource(R.drawable.icon_circle);
                p_move=1;
            }
        }

    }//onClick

}//Class
