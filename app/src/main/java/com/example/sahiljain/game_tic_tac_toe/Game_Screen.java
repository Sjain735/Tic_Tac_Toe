package com.example.sahiljain.game_tic_tac_toe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Game_Screen extends AppCompatActivity implements View.OnClickListener{

    TextView text_level;
    TextView text_current;
    TextView text_longest;
    ImageView image_1, image_2, image_3, image_4, image_5, image_6, image_7, image_8, image_9;

    int player_icon, comp_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        Intent i = getIntent();
        String level = i.getStringExtra("Level");

        text_level = (TextView) findViewById(R.id.game_text_level);
        text_current = (TextView) findViewById(R.id.game_text_current);
        text_longest = (TextView) findViewById(R.id.game_text_longest);

        image_1 = (ImageView) findViewById(R.id.game_sign_1);
        image_2 = (ImageView) findViewById(R.id.game_sign_2);
        image_3 = (ImageView) findViewById(R.id.game_sign_3);
        image_4 = (ImageView) findViewById(R.id.game_sign_4);
        image_5 = (ImageView) findViewById(R.id.game_sign_5);
        image_6 = (ImageView) findViewById(R.id.game_sign_6);
        image_7 = (ImageView) findViewById(R.id.game_sign_7);
        image_8 = (ImageView) findViewById(R.id.game_sign_8);
        image_9 = (ImageView) findViewById(R.id.game_sign_9);

        player_icon = 111; comp_icon = 0;

        image_1.setOnClickListener(this);
        image_2.setOnClickListener(this);
        image_3.setOnClickListener(this);
        image_4.setOnClickListener(this);
        image_5.setOnClickListener(this);
        image_6.setOnClickListener(this);
        image_7.setOnClickListener(this);
        image_8.setOnClickListener(this);
        image_9.setOnClickListener(this);

        text_level.setText("LEVEL : " + level);
/*
        new AlertDialog.Builder(getApplicationContext())
                .setTitle("Icon_Selection")
                .setMessage("Choose an Icon:")
                .setPositiveButton("Cross", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                        player_icon = 111;
                        comp_icon = 0;
                    }
                })
                .setNegativeButton("Zero", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                        player_icon = 0;
                        comp_icon = 111;
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
*/

//--------------------------------------------------------------------------------------------------
        if(level.equalsIgnoreCase("Easy")){

        }//Level = Easy

//--------------------------------------------------------------------------------------------------
        if (level.equalsIgnoreCase("Medium")){

        }//Level = Medium

//--------------------------------------------------------------------------------------------------
        if (level.equalsIgnoreCase("Hard")){

        }//Level = Hard

//--------------------------------------------------------------------------------------------------
    }//onCreate

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.game_sign_1){
            if (player_icon==111){
                image_1.setImageResource(R.drawable.icon_cross);
            }
            if(player_icon==0){
                image_1.setImageResource(R.drawable.icon_circle);
            }
        }//Image_1

        if (v.getId()==R.id.game_sign_2){
            if (player_icon==111){
                image_2.setImageResource(R.drawable.icon_cross);
            }
            if(player_icon==0){
                image_2.setImageResource(R.drawable.icon_circle);
            }
        }//Image_2

        if (v.getId()==R.id.game_sign_3){
            if (player_icon==111){
                image_3.setImageResource(R.drawable.icon_cross);
            }
            if(player_icon==0){
                image_3.setImageResource(R.drawable.icon_circle);
            }
        }//Image_3

        if (v.getId()==R.id.game_sign_4){
            if (player_icon==111){
                image_4.setImageResource(R.drawable.icon_cross);
            }
            if(player_icon==0){
                image_4.setImageResource(R.drawable.icon_circle);
            }

        }//Image_4
        if (v.getId()==R.id.game_sign_5){
            if (player_icon==111){
                image_5.setImageResource(R.drawable.icon_cross);
            }
            if(player_icon==0){
                image_5.setImageResource(R.drawable.icon_circle);
            }

        }//Image_5

        if (v.getId()==R.id.game_sign_6){
            if (player_icon==111){
                image_6.setImageResource(R.drawable.icon_cross);
            }
            if(player_icon==0){
                image_6.setImageResource(R.drawable.icon_circle);
            }

        }//Image_6

        if (v.getId()==R.id.game_sign_7){
            if (player_icon==111){
                image_7.setImageResource(R.drawable.icon_cross);
            }
            if(player_icon==0){
                image_7.setImageResource(R.drawable.icon_circle);
            }
        }//Image_7

        if (v.getId()==R.id.game_sign_8){
            if (player_icon==111){
                image_8.setImageResource(R.drawable.icon_cross);
            }
            if(player_icon==0){
                image_8.setImageResource(R.drawable.icon_circle);
            }
        }//Image_8

        if (v.getId()==R.id.game_sign_9){
            if (player_icon==111){
                image_9.setImageResource(R.drawable.icon_cross);
            }
            if(player_icon==0){
                image_9.setImageResource(R.drawable.icon_circle);
            }
        }//Image_9

    }//onClick

}//Class Game Screen
