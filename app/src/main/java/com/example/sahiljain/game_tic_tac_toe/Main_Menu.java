package com.example.sahiljain.game_tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main_Menu extends AppCompatActivity implements View.OnClickListener{

    TextView text_one_pl;
    TextView text_two_pl;
    TextView text_stats;

    ImageView img_settings;
    ImageView img_help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        text_one_pl = (TextView) findViewById(R.id.main_text_one_pl);
        text_two_pl = (TextView) findViewById(R.id.main_text_two_pl);
        text_stats = (TextView) findViewById(R.id.main_text_stats);

        img_settings = (ImageView) findViewById(R.id.main_settings);
        img_help = (ImageView) findViewById(R.id.main_help);


        if(text_one_pl!=null) {
            text_one_pl.setOnClickListener(this);
        }

        if(text_two_pl!=null) {
            text_two_pl.setOnClickListener(this);
        }

        if(text_stats!=null) {
            text_stats.setOnClickListener(this);
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

        if(v.getId()==R.id.main_text_one_pl){
            Intent intent = new Intent(getApplicationContext(),Game_Screen.class);
           // intent.putExtra("Level","EASY");
            startActivity(intent);
        }

        if (v.getId()==R.id.main_text_two_pl){
            Intent intent = new Intent(getApplicationContext(),Game_Screen_two_player.class);
           // intent.putExtra("Level","MEDIUM");
            startActivity(intent);
        }

        if(v.getId()==R.id.main_text_stats){
          //Make that Activity
        }


        if(v.getId()==R.id.main_settings){
            //Popup for sound settings and a reset option
        }

        if(v.getId()==R.id.main_help){
            //Popup for rules
        }

    }//onClick

}//Class Main Menu
