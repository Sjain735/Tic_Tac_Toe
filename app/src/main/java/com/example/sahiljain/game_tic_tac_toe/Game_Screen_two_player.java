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
    int p_icon = 1; //Represents the turn of player 1 or 2
    int p1_icon = 0; //to check the winning condition
    int rc[][] = new int[4][4];

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
                p_icon = 1;
                p1_icon = 0;
                ald.cancel();
            }
        });
        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p_icon = 2;
                p1_icon = 1;
                ald.cancel();
            }
        });

        ald.setView(prompt_view);
        ald.show();

        rc_init();

    }//onCreate()


    @Override
    public void onClick(View v) {

        if(p_icon ==1){
            p_icon = 2;
            switch (v.getId()){
                case R.id.game_sign_1 : image_1.setImageResource(R.drawable.icon_circle);
                                        image_1.setClickable(false);
                                        rc[0][0] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        break;

                case R.id.game_sign_2 : image_2.setImageResource(R.drawable.icon_circle);
                                        image_2.setClickable(false);
                                        rc[0][1] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        break;

                case R.id.game_sign_3 : image_3.setImageResource(R.drawable.icon_circle);
                                        image_3.setClickable(false);
                                        rc[0][2] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        break;

                case R.id.game_sign_4 : image_4.setImageResource(R.drawable.icon_circle);
                                        image_4.setClickable(false);
                                        rc[1][0] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        break;

                case R.id.game_sign_5 : image_5.setImageResource(R.drawable.icon_circle);
                                        image_5.setClickable(false);
                                        rc[1][1] = 0;
                                        if (check_win_circle())
                                        dec_win(0);
                                        break;

                case R.id.game_sign_6 : image_6.setImageResource(R.drawable.icon_circle);
                                        image_6.setClickable(false);
                                        rc[1][2] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        break;

                case R.id.game_sign_7 : image_7.setImageResource(R.drawable.icon_circle);
                                        image_7.setClickable(false);
                                        rc[2][0] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        break;

                case R.id.game_sign_8 : image_8.setImageResource(R.drawable.icon_circle);
                                        image_8.setClickable(false);
                                        rc[2][1] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        break;

                case R.id.game_sign_9 : image_9.setImageResource(R.drawable.icon_circle);
                                        image_9.setClickable(false);
                                        rc[2][2] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        break;

            }//switch - circle
        }//if

        else if (p_icon == 2){
            p_icon = 1;
            switch (v.getId()){
                case R.id.game_sign_1 : image_1.setImageResource(R.drawable.icon_cross);
                                        image_1.setClickable(false);
                                        rc[0][0] = 1;
                                        if (check_win_cross())
                                            dec_win(1);
                                        break;

                case R.id.game_sign_2 : image_2.setImageResource(R.drawable.icon_cross);
                                        image_2.setClickable(false);
                                        rc[0][1] = 1;
                                        if (check_win_cross())
                                            dec_win(1);
                                        break;

                case R.id.game_sign_3 : image_3.setImageResource(R.drawable.icon_cross);
                                        image_3.setClickable(false);
                                        rc[0][2] = 1;
                                        if (check_win_cross())
                                            dec_win(1);
                                        break;

                case R.id.game_sign_4 : image_4.setImageResource(R.drawable.icon_cross);
                                        image_4.setClickable(false);
                                        rc[1][0] = 1;
                                        if (check_win_cross())
                                            dec_win(1);
                                        break;

                case R.id.game_sign_5 : image_5.setImageResource(R.drawable.icon_cross);
                                        image_5.setClickable(false);
                                        rc[1][1] = 1;
                                        if (check_win_cross())
                                            dec_win(1);
                                        break;

                case R.id.game_sign_6 : image_6.setImageResource(R.drawable.icon_cross);
                                        image_6.setClickable(false);
                                        rc[1][2] = 1;
                                        if (check_win_cross())
                                            dec_win(1);
                                        break;

                case R.id.game_sign_7 : image_7.setImageResource(R.drawable.icon_cross);
                                        image_7.setClickable(false);
                                        rc[2][0] = 1;
                                        if (check_win_cross())
                                            dec_win(1);
                                        break;

                case R.id.game_sign_8 : image_8.setImageResource(R.drawable.icon_cross);
                                        image_8.setClickable(false);
                                        rc[2][1] = 1;
                                        if (check_win_cross())
                                            dec_win(1);
                                        break;

                case R.id.game_sign_9 : image_9.setImageResource(R.drawable.icon_cross);
                                        image_9.setClickable(false);
                                        rc[2][2] = 1;
                                        if (check_win_cross())
                                            dec_win(1);
                                        break;

            }//switch - cross
        }//else if

    }//onClick()

    public void rc_init(){
        int i,j;

        for (i=0; i<3;i++){
            for (j=0; j<3; j++) {
                rc[i][j] = 5;
            }
        }

    }//rc_init()

    public boolean check_win_cross(){

        if (rc[0][0]==1){
            if (rc[0][1]==1) {
                if (rc[0][2] == 1)
                    return true;
            }

            if (rc[1][0]==1) {
                if (rc[2][0] == 1)
                    return true;
            }

            if (rc[1][1]==1) {
                if (rc[2][2] == 1)
                    return true;
            }
        }//if positin 1

        else if(rc[0][1]==1){
            if(rc[1][1]==1)
                if(rc[2][1]==1)
                    return true;
        }//if position 2

        else if(rc[0][2]==1){
            if (rc[1][1]==1) {
                if (rc[2][0] == 1)
                    return true;
            }

            if (rc[1][2]==1) {
                if (rc[2][2] == 1)
                    return true;
            }
        }//if position 3

        else if(rc[1][0]==1){
            if (rc[1][1]==1)
                if(rc[1][2]==1)
                    return true;
        }//if position 4

        else if (rc[2][0]==1){
            if(rc[2][1]==1)
                if(rc[2][2]==1)
                    return true;
        }//if position 7

        return false;
    }//check win cross()

    public boolean check_win_circle(){

        if (rc[0][0]==0){
            if (rc[0][1]==0) {
                if (rc[0][2] == 0)
                    return true;
            }

            if (rc[1][0]==0) {
                if (rc[2][0] == 0)
                    return true;
            }

            if (rc[1][1]==0) {
                if (rc[2][2] == 0)
                    return true;
            }
        }//if positin 1

        else if(rc[0][1]==0){
            if(rc[1][1]==0)
                if(rc[2][1]==0)
                    return true;
        }//if position 2

        else if(rc[0][2]==0){
            if (rc[1][1]==0) {
                if (rc[2][0] == 0)
                    return true;
            }

            if (rc[1][2]==0) {
                if (rc[2][2]==0)
                    return true;
            }
        }//if position 3

        else if(rc[1][0]==0){
            if (rc[1][1]==0)
                if(rc[1][2]==0)
                    return true;
        }//if position 4

        else if (rc[2][0]==0){
            if(rc[2][1]==0)
                if(rc[2][2]==0)
                    return true;
        }//if position 7

        return false;
    }//check win cross()

    public void dec_win(int a){

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View promptView = layoutInflater.inflate(R.layout.layout_alert_win, null);

        final AlertDialog alertD = new AlertDialog.Builder(this).create();

        TextView win_t = (TextView) promptView.findViewById(R.id.win_text);

        if (a==p1_icon) {
            win_t.setText("Player 1 Wins!");
        }
        else {
            win_t.setText("Player 2 Wins!");
        }

        Button btnAdd1 = (Button) promptView.findViewById(R.id.win_bt_1);

        Button btnAdd2 = (Button) promptView.findViewById(R.id.win_bt_2);

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              //Refresh this activity.....Maybe use "onResume()".
            }
        });

        btnAdd2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        alertD.setView(promptView);
        alertD.show();

    }//dec_win()

}//Class