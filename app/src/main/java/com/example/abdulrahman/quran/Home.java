package com.example.abdulrahman.quran;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void butstop(View view) {

        try {
            MediaPlayer player=MediaPlayer.create(Home.this,R.raw.ma);
            player.prepare();
            player.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void butstart(View view) {
     // player.stop();
    }
}
