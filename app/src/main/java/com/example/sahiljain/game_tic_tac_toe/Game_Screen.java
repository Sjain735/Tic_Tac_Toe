package com.example.sahiljain.game_tic_tac_toe;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class Game_Screen extends AppCompatActivity implements View.OnClickListener{

    TextView text_level;
    TextView text_current;
    TextView text_longest;
    ImageView image_1, image_2, image_3, image_4, image_5, image_6, image_7, image_8, image_9;
    int rc [][] = new int[4][4];

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

        rc_init();

    }//onCreate()


    public void comp_turn_easy (){ //A function to make computer's move in the game - Level Easy
        if (n>0) {
            Random r = new Random();
            int i = r.nextInt(n);

            comp_move(moves[i]);

            array_deletion(moves,moves[i]);

        }//if n>0
    }//comp_turn_easy()

    public void comp_move(int m){

        if(comp_icon==0){
            switch (m){
                case 1 : image_1.setImageResource(R.drawable.icon_circle);
                    image_1.setClickable(false);
                    rc[0][0]=0;
                    if (check_win_circle())
                        dec_win(0);
                    break;

                case 2 : image_2.setImageResource(R.drawable.icon_circle);
                    image_2.setClickable(false);
                    rc[0][1]=0;
                    if (check_win_circle())
                        dec_win(0);
                    break;

                case 3 : image_3.setImageResource(R.drawable.icon_circle);
                    image_3.setClickable(false);
                    rc[0][2]=0;
                    if (check_win_circle())
                        dec_win(0);
                    break;

                case 4 : image_4.setImageResource(R.drawable.icon_circle);
                    image_4.setClickable(false);
                    rc[1][0]=0;
                    if (check_win_circle())
                        dec_win(0);
                    break;

                case 5 : image_5.setImageResource(R.drawable.icon_circle);
                    image_5.setClickable(false);
                    rc[1][1]=0;
                    if (check_win_circle())
                        dec_win(0);
                    break;

                case 6 : image_6.setImageResource(R.drawable.icon_circle);
                    image_6.setClickable(false);
                    rc[1][2]=0;
                    if (check_win_circle())
                        dec_win(0);
                    break;

                case 7 : image_7.setImageResource(R.drawable.icon_circle);
                    image_7.setClickable(false);
                    rc[2][0]=0;
                    if (check_win_circle())
                        dec_win(0);
                    break;

                case 8 : image_8.setImageResource(R.drawable.icon_circle);
                    image_8.setClickable(false);
                    rc[2][1]=0;
                    if (check_win_circle())
                        dec_win(0);
                    break;

                case 9 : image_9.setImageResource(R.drawable.icon_circle);
                    image_9.setClickable(false);
                    rc[2][2]=0;
                    if (check_win_circle())
                        dec_win(0);
                    break;

            }//switch - circle
        }//if

        else if (comp_icon == 111){
            switch (m){
                case 1 : image_1.setImageResource(R.drawable.icon_cross);
                    image_1.setClickable(false);
                    rc[0][0] = 1;
                    if (check_win_cross())
                        dec_win(111);
                    break;

                case 2 : image_2.setImageResource(R.drawable.icon_cross);
                    image_2.setClickable(false);
                    rc[0][1] = 1;
                    if (check_win_cross())
                        dec_win(111);
                    break;

                case 3 : image_3.setImageResource(R.drawable.icon_cross);
                    image_3.setClickable(false);
                    rc[0][2] = 1;
                    if (check_win_cross())
                        dec_win(111);
                    break;

                case 4 : image_4.setImageResource(R.drawable.icon_cross);
                    image_4.setClickable(false);
                    rc[1][0] = 1;
                    if (check_win_cross())
                        dec_win(111);
                    break;

                case 5 : image_5.setImageResource(R.drawable.icon_cross);
                    image_5.setClickable(false);
                    rc[1][1] = 1;
                    if (check_win_cross())
                        dec_win(111);
                    break;

                case 6 : image_6.setImageResource(R.drawable.icon_cross);
                    image_6.setClickable(false);
                    rc[1][2] = 1;
                    if (check_win_cross())
                        dec_win(111);
                    break;

                case 7 : image_7.setImageResource(R.drawable.icon_cross);
                    image_7.setClickable(false);
                    rc[2][0] = 1;
                    if (check_win_cross())
                        dec_win(111);
                    break;

                case 8 : image_8.setImageResource(R.drawable.icon_cross);
                    image_8.setClickable(false);
                    rc[2][1] = 1;
                    if (check_win_cross())
                        dec_win(111);
                    break;

                case 9 : image_9.setImageResource(R.drawable.icon_cross);
                    image_9.setClickable(false);
                    rc[2][2] = 1;
                    if (check_win_cross())
                        dec_win(111);
                    break;

            }//switch - cross
        }//else if

    }//comp_move()

    public void array_deletion (int [] a, int num){ //Deletion Fn
       if (n>0) {
           Log.d("Array", String.valueOf(a[0]));
           Log.d("Array", String.valueOf(a[1]));
           Log.d("Array", String.valueOf(a[2]));
           Log.d("Array", String.valueOf(a[3]));
           Log.d("Array", String.valueOf(a[4]));
           Log.d("Array", String.valueOf(a[5]));
           Log.d("Array", String.valueOf(a[6]));
           Log.d("Array", String.valueOf(a[7]));
           Log.d("Array", String.valueOf(a[8]));
           Log.d("N", String.valueOf(n));

           int i, pos = 0;

           for (i = 0; i < n; i++) {
               if (a[i] == num) {
                   pos = i;
                   break;
               }
           }

           Log.d("Pos", String.valueOf(pos));

           for (i = pos; i < n - 1; i++) {
               a[i] = a[i + 1];
           }//for
           n--;

           Log.d("Array", String.valueOf(a[0]));
           Log.d("Array", String.valueOf(a[1]));
           Log.d("Array", String.valueOf(a[2]));
           Log.d("Array", String.valueOf(a[3]));
           Log.d("Array", String.valueOf(a[4]));
           Log.d("Array", String.valueOf(a[5]));
           Log.d("Array", String.valueOf(a[6]));
           Log.d("Array", String.valueOf(a[7]));
           Log.d("Array", String.valueOf(a[8]));
           Log.d("N", String.valueOf(n));
       }//if n>0
    }//del function


    @Override
    public void onClick(View v) {

        if (player_icon == 111){
            switch (v.getId()){
                case R.id.game_sign_1 : image_1.setImageResource(R.drawable.icon_cross);
                                        image_1.setClickable(false);
                                        array_deletion(moves,1);
                                        rc[0][0] = 1;
                                        if (check_win_cross())
                                            dec_win(111);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_2 : image_2.setImageResource(R.drawable.icon_cross);
                                        image_2.setClickable(false);
                                        array_deletion(moves,2);
                                        rc[0][1] = 1;
                                        if (check_win_cross())
                                            dec_win(111);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_3 : image_3.setImageResource(R.drawable.icon_cross);
                                        image_3.setClickable(false);
                                        array_deletion(moves,3);
                                        rc[0][2] = 1;
                                        if (check_win_cross())
                                            dec_win(111);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_4 : image_4.setImageResource(R.drawable.icon_cross);
                                        image_4.setClickable(false);
                                        array_deletion(moves,4);
                                        rc[1][0] = 1;
                                        if (check_win_cross())
                                            dec_win(111);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_5 : image_5.setImageResource(R.drawable.icon_cross);
                                        image_5.setClickable(false);
                                        array_deletion(moves,5);
                                        rc[1][1] = 1;
                                        if (check_win_cross())
                                            dec_win(111);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_6 : image_6.setImageResource(R.drawable.icon_cross);
                                        image_6.setClickable(false);
                                        array_deletion(moves,6);
                                        rc[1][2] = 1;
                                        if (check_win_cross())
                                            dec_win(111);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_7 : image_7.setImageResource(R.drawable.icon_cross);
                                        image_7.setClickable(false);
                                        array_deletion(moves,7);
                                        rc[2][0] = 1;
                                        if (check_win_cross())
                                            dec_win(111);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_8 : image_8.setImageResource(R.drawable.icon_cross);
                                        image_8.setClickable(false);
                                        array_deletion(moves,8);
                                        rc[2][1] = 1;
                                        if (check_win_cross())
                                            dec_win(111);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_9 : image_9.setImageResource(R.drawable.icon_cross);
                                        image_9.setClickable(false);
                                        array_deletion(moves,9);
                                        rc[2][2] = 1;
                                        if (check_win_cross())
                                            dec_win(111);
                                        comp_turn_easy();
                                        break;
            }//switch - cross
        }//if
        else if (player_icon == 0){
            switch (v.getId()){
                case R.id.game_sign_1 : image_1.setImageResource(R.drawable.icon_circle);
                                        image_1.setClickable(false);
                                        array_deletion(moves,1);
                                        rc[0][0] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_2 : image_2.setImageResource(R.drawable.icon_circle);
                                        image_2.setClickable(false);
                                        array_deletion(moves,2);
                                        rc[0][1] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_3 : image_3.setImageResource(R.drawable.icon_circle);
                                        image_3.setClickable(false);
                                        array_deletion(moves,3);
                                        rc[0][2] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_4 : image_4.setImageResource(R.drawable.icon_circle);
                                        image_4.setClickable(false);
                                        array_deletion(moves,4);
                                        rc[1][0] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_5 : image_5.setImageResource(R.drawable.icon_circle);
                                        image_5.setClickable(false);
                                        array_deletion(moves,5);
                                        rc[1][1] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_6 : image_6.setImageResource(R.drawable.icon_circle);
                                        image_6.setClickable(false);
                                        array_deletion(moves,6);
                                        rc[1][2] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_7 : image_7.setImageResource(R.drawable.icon_circle);
                                        image_7.setClickable(false);
                                        array_deletion(moves,7);
                                        rc[2][0] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_8 : image_8.setImageResource(R.drawable.icon_circle);
                                        image_8.setClickable(false);
                                        array_deletion(moves,8);
                                        rc[2][1] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        comp_turn_easy();
                                        break;

                case R.id.game_sign_9 : image_9.setImageResource(R.drawable.icon_circle);
                                        image_9.setClickable(false);
                                        array_deletion(moves,9);
                                        rc[2][2] = 0;
                                        if (check_win_circle())
                                            dec_win(0);
                                        comp_turn_easy();
                                        break;

            }//switch - circle
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

        if (a==player_icon) {
            win_t.setText("You Win!");
        }
        else {
            win_t.setText("Computer Wins!");
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

}//Class Game Screen