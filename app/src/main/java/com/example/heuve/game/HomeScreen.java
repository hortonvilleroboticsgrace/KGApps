package com.example.heuve.game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    public static Button play;
    public static TextView TITLE, playSomeGames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        play = (Button)findViewById(R.id.play);
        TITLE = (TextView)findViewById(R.id.Title);
        playSomeGames = (TextView)findViewById(R.id.PlaySomeGames);

        View.OnClickListener c = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.game_list);
            }
        };

        play.setOnClickListener(c);
    }

    //I have it set up right now to basically do this
    //      HomeScreen (Click play) --> GameList (Choose a Game from here) --> Play the Game

    //Also, how the heck are we going to get games into here? Reprogram them? Ima do some digging

    //TODO: Get a way to get some sick games into this machine
    //TODO: Get a way to have graphics on buttons/background??

    //I have no idea if any of this works... I'm one of those Apple people XD

}
