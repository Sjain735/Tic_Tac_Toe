package com.example.sahiljain.game_tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main_Menu extends AppCompatActivity implements View.OnClickListener{

    TextView text_easy;
    TextView text_medium;
    TextView text_hard;
    ImageView img_settings;
    ImageView img_help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        text_easy = (TextView) findViewById(R.id.main_text_easy);
        text_medium = (TextView) findViewById(R.id.main_text_medium);
        text_hard = (TextView) findViewById(R.id.main_text_hard);

        img_settings = (ImageView) findViewById(R.id.main_settings);
        img_help = (ImageView) findViewById(R.id.main_help);


        if(text_easy!=null) {
            text_easy.setOnClickListener(this);
        }

        if(text_medium!=null) {
            text_medium.setOnClickListener(this);
        }

        if(text_hard!=null) {
            text_hard.setOnClickListener(this);
        }

        if(img_settings!=null){
            img_settings.setOnClickListener(this);
        }

        if (img_help!=null){
            img_help.setOnClickListener(this);
        }


    }//onCreate


    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.main_text_easy){
            Intent intent = new Intent(getApplicationContext(),Game_Screen.class);
            intent.putExtra("Level","EASY");
            startActivity(intent);
        }

        if (v.getId()==R.id.main_text_medium){
            Intent intent = new Intent(getApplicationContext(),Game_Screen.class);
            intent.putExtra("Level","MEDIUM");
            startActivity(intent);
        }

        if(v.getId()==R.id.main_text_hard){
            Intent intent = new Intent(getApplicationContext(),Game_Screen.class);
            intent.putExtra("Level","HARD");
            startActivity(intent);
        }

        if(v.getId()==R.id.main_settings){
            //Popup for sound settings and a reset option
        }

        if(v.getId()==R.id.main_help){
            //Popup for rules
        }

    }//onClick

}//Class Main Menu
