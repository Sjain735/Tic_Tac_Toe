package com.example.sahiljain.game_tic_tac_toe;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class Game_Screen extends AppCompatActivity implements View.OnClickListener{

    TextView text_level;
    TextView text_current;
    TextView text_longest;
    ImageView image_1, image_2, image_3, image_4, image_5, image_6, image_7, image_8, image_9;

    int [] moves = {1,2,3,4,5,6,7,8,9}; int n = 9;

    int player_icon = 111, comp_icon = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
/*
        Intent i = getIntent();
        String level = i.getStringExtra("Level");       */

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


        image_1.setOnClickListener(this);
        image_2.setOnClickListener(this);
        image_3.setOnClickListener(this);
        image_4.setOnClickListener(this);
        image_5.setOnClickListener(this);
        image_6.setOnClickListener(this);
        image_7.setOnClickListener(this);
        image_8.setOnClickListener(this);
        image_9.setOnClickListener(this);

 //       text_level.setText("LEVEL : " + level);
/*
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose:");
        builder.setPositiveButton("Cross", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                player_icon = 111; comp_icon = 0;
                dialog.cancel();
            }
        }).create();

        builder.setNegativeButton("Circle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                player_icon = 0; comp_icon = 111;
                finish();
            }
        }).create();

        builder.setCancelable(false);
        Dialog dialog = builder.show();
*/

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View prompt_view = layoutInflater.inflate(R.layout.layout_alert_dialog,null);

        final AlertDialog ald = new AlertDialog.Builder(this).create();

        Button btnAdd1 = (Button) prompt_view.findViewById(R.id.ad_button_1);
        Button btnAdd2 = (Button) prompt_view.findViewById(R.id.ad_button_2);

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player_icon = 0; comp_icon = 111;
                ald.cancel();
            }
        });
        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player_icon = 111; comp_icon = 0;
                ald.cancel();
            }
        });

        ald.setView(prompt_view);
        ald.show();

    }//onCreate


    public void comp_turn_easy (){ //A function to make computer's move in the game - Level Easy
        Random r = new Random();
        int i = r.nextInt(n);

        if(comp_icon==0){
            switch (moves[i]){
                case 1 : image_1.setImageResource(R.drawable.icon_circle); break;
                case 2 : image_2.setImageResource(R.drawable.icon_circle); break;
                case 3 : image_3.setImageResource(R.drawable.icon_circle); break;
                case 4 : image_4.setImageResource(R.drawable.icon_circle); break;
                case 5 : image_5.setImageResource(R.drawable.icon_circle); break;
                case 6 : image_6.setImageResource(R.drawable.icon_circle); break;
                case 7 : image_7.setImageResource(R.drawable.icon_circle); break;
                case 8 : image_8.setImageResource(R.drawable.icon_circle); break;
                case 9 : image_9.setImageResource(R.drawable.icon_circle); break;
            }//switch - circle
        }//if
        else if (comp_icon == 111){
            switch (moves[i]){
                case 1 : image_1.setImageResource(R.drawable.icon_cross); break;
                case 2 : image_2.setImageResource(R.drawable.icon_cross); break;
                case 3 : image_3.setImageResource(R.drawable.icon_cross); break;
                case 4 : image_4.setImageResource(R.drawable.icon_cross); break;
                case 5 : image_5.setImageResource(R.drawable.icon_cross); break;
                case 6 : image_6.setImageResource(R.drawable.icon_cross); break;
                case 7 : image_7.setImageResource(R.drawable.icon_cross); break;
                case 8 : image_8.setImageResource(R.drawable.icon_cross); break;
                case 9 : image_9.setImageResource(R.drawable.icon_cross); break;
            }//switch - cross
        }//else if

    }//comp_turn_easy

    public void array_deletion (int [] a, int pos){ //Deletion Fn

        for (int i=pos-1;i<n-1;i++){
            a[i]=a[i+1];
        }//for
        n--;

    }//del function


    @Override
    public void onClick(View v) {
/*
        if (player_icon == 111){
            switch (v.getId()){
                case R.id.game_sign_1 : image_1.setImageResource(R.drawable.icon_cross); break;
                case R.id.game_sign_2 : image_2.setImageResource(R.drawable.icon_cross); break;
                case R.id.game_sign_3 : image_3.setImageResource(R.drawable.icon_cross); break;
                case R.id.game_sign_4 : image_4.setImageResource(R.drawable.icon_cross); break;
                case R.id.game_sign_5 : image_5.setImageResource(R.drawable.icon_cross); break;
                case R.id.game_sign_6 : image_6.setImageResource(R.drawable.icon_cross); break;
                case R.id.game_sign_7 : image_7.setImageResource(R.drawable.icon_cross); break;
                case R.id.game_sign_8 : image_8.setImageResource(R.drawable.icon_cross); break;
                case R.id.game_sign_9 : image_9.setImageResource(R.drawable.icon_cross); break;
            }//switch - cross
        }//if
        else if (player_icon == 0){
            switch (v.getId()){
                case R.id.game_sign_1 : image_1.setImageResource(R.drawable.icon_circle); break;
                case R.id.game_sign_2 : image_2.setImageResource(R.drawable.icon_circle); break;
                case R.id.game_sign_3 : image_3.setImageResource(R.drawable.icon_circle); break;
                case R.id.game_sign_4 : image_4.setImageResource(R.drawable.icon_circle); break;
                case R.id.game_sign_5 : image_5.setImageResource(R.drawable.icon_circle); break;
                case R.id.game_sign_6 : image_6.setImageResource(R.drawable.icon_circle); break;
                case R.id.game_sign_7 : image_7.setImageResource(R.drawable.icon_circle); break;
                case R.id.game_sign_8 : image_8.setImageResource(R.drawable.icon_circle); break;
                case R.id.game_sign_9 : image_9.setImageResource(R.drawable.icon_circle); break;
            }//switch - circle
        }//else if
*/

        if (v.getId()==R.id.game_sign_1){
            if (player_icon==111){
                image_1.setImageResource(R.drawable.icon_cross);
            }
            else if(player_icon==0){
                image_1.setImageResource(R.drawable.icon_circle);
            }
        }//Image_1

        if (v.getId()==R.id.game_sign_2){
            if (player_icon==111){
                image_2.setImageResource(R.drawable.icon_cross);
            }
            else if(player_icon==0){
                image_2.setImageResource(R.drawable.icon_circle);
            }
        }//Image_2

        if (v.getId()==R.id.game_sign_3){
            if (player_icon==111){
                image_3.setImageResource(R.drawable.icon_cross);
            }
            else if(player_icon==0){
                image_3.setImageResource(R.drawable.icon_circle);
            }
        }//Image_3

        if (v.getId()==R.id.game_sign_4){
            if (player_icon==111){
                image_4.setImageResource(R.drawable.icon_cross);
            }
            else if(player_icon==0){
                image_4.setImageResource(R.drawable.icon_circle);
            }

        }//Image_4
        if (v.getId()==R.id.game_sign_5){
            if (player_icon==111){
                image_5.setImageResource(R.drawable.icon_cross);
            }
            else if(player_icon==0){
                image_5.setImageResource(R.drawable.icon_circle);
            }

        }//Image_5

        if (v.getId()==R.id.game_sign_6){
            if (player_icon==111){
                image_6.setImageResource(R.drawable.icon_cross);
            }
            else if(player_icon==0){
                image_6.setImageResource(R.drawable.icon_circle);
            }

        }//Image_6

        if (v.getId()==R.id.game_sign_7){
            if (player_icon==111){
                image_7.setImageResource(R.drawable.icon_cross);
            }
            else if(player_icon==0){
                image_7.setImageResource(R.drawable.icon_circle);
            }
        }//Image_7

        if (v.getId()==R.id.game_sign_8){
            if (player_icon==111){
                image_8.setImageResource(R.drawable.icon_cross);
            }
            else if(player_icon==0){
                image_8.setImageResource(R.drawable.icon_circle);
            }
        }//Image_8

        if (v.getId()==R.id.game_sign_9){
            if (player_icon==111){
                image_9.setImageResource(R.drawable.icon_cross);
            }
            else if(player_icon==0){
                image_9.setImageResource(R.drawable.icon_circle);
            }
        }//Image_9

    }//onClick

}//Class Game Screen
