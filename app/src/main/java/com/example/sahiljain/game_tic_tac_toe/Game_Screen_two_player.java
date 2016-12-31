package com.example.sahiljain.game_tic_tac_toe;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Game_Screen_two_player extends AppCompatActivity implements View.OnClickListener{

    TextView text_P_1;
    TextView text_p_2;
    ImageView image_1, image_2, image_3, image_4, image_5, image_6, image_7, image_8, image_9;
    int p_1_icon = 1;
    int win[][] = new int[9][4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen_two_player);

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


        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View prompt_view = layoutInflater.inflate(R.layout.layout_alert_dialog,null);

        final AlertDialog ald = new AlertDialog.Builder(this).create();

        Button btnAdd1 = (Button) prompt_view.findViewById(R.id.ad_button_1);
        Button btnAdd2 = (Button) prompt_view.findViewById(R.id.ad_button_2);

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p_1_icon = 1;
                ald.cancel();
            }
        });
        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p_1_icon=2;
                ald.cancel();
            }
        });

        ald.setView(prompt_view);
        ald.show();

        win_init();

    }//onCreate


    @Override
    public void onClick(View v) {

        if(p_1_icon ==1){
            p_1_icon = 2;
            switch (v.getId()){
                case R.id.game_sign_1 : image_1.setImageResource(R.drawable.icon_circle); image_1.setClickable(false); break;
                case R.id.game_sign_2 : image_2.setImageResource(R.drawable.icon_circle); image_2.setClickable(false); break;
                case R.id.game_sign_3 : image_3.setImageResource(R.drawable.icon_circle); image_3.setClickable(false); break;
                case R.id.game_sign_4 : image_4.setImageResource(R.drawable.icon_circle); image_4.setClickable(false); break;
                case R.id.game_sign_5 : image_5.setImageResource(R.drawable.icon_circle); image_5.setClickable(false); break;
                case R.id.game_sign_6 : image_6.setImageResource(R.drawable.icon_circle); image_6.setClickable(false); break;
                case R.id.game_sign_7 : image_7.setImageResource(R.drawable.icon_circle); image_7.setClickable(false); break;
                case R.id.game_sign_8 : image_8.setImageResource(R.drawable.icon_circle); image_8.setClickable(false); break;
                case R.id.game_sign_9 : image_9.setImageResource(R.drawable.icon_circle); image_9.setClickable(false); break;
            }//switch - circle
        }//if
        else if (p_1_icon == 2){
            p_1_icon = 1;
            switch (v.getId()){
                case R.id.game_sign_1 : image_1.setImageResource(R.drawable.icon_cross); image_1.setClickable(false); break;
                case R.id.game_sign_2 : image_2.setImageResource(R.drawable.icon_cross); image_2.setClickable(false); break;
                case R.id.game_sign_3 : image_3.setImageResource(R.drawable.icon_cross); image_3.setClickable(false); break;
                case R.id.game_sign_4 : image_4.setImageResource(R.drawable.icon_cross); image_4.setClickable(false); break;
                case R.id.game_sign_5 : image_5.setImageResource(R.drawable.icon_cross); image_5.setClickable(false); break;
                case R.id.game_sign_6 : image_6.setImageResource(R.drawable.icon_cross); image_6.setClickable(false); break;
                case R.id.game_sign_7 : image_7.setImageResource(R.drawable.icon_cross); image_7.setClickable(false); break;
                case R.id.game_sign_8 : image_8.setImageResource(R.drawable.icon_cross); image_8.setClickable(false); break;
                case R.id.game_sign_9 : image_9.setImageResource(R.drawable.icon_cross); image_9.setClickable(false); break;
            }//switch - cross
        }//else if

    }//onClick

    public void win_init(){ //Fn to initialise the 2-D array win with all possible winning conditions

        win[0][0] = 1;
        win[0][1] = 2;
        win[0][2] = 3;

        win[1][0] = 4;
        win[1][1] = 5;
        win[1][2] = 6;

        win[2][0] = 7;
        win[2][1] = 8;
        win[2][2] = 9;

        win[3][0] = 1;
        win[3][1] = 4;
        win[3][2] = 7;

        win[4][0] = 2;
        win[4][1] = 5;
        win[4][2] = 8;

        win[5][0] = 3;
        win[5][1] = 6;
        win[5][2] = 9;

        win[6][0] = 1;
        win[6][1] = 5;
        win[6][2] = 9;

        win[7][0] = 3;
        win[7][1] = 5;
        win[7][2] = 7;

    }//win_init()

}//Class
