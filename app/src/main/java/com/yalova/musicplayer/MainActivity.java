package com.yalova.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    Button playBtn ;
    SeekBar seekBar;
    ImageView musicPhoto;
    MediaPlayer mp;
    ImageButton music1Btn;
    int time;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playBtn=(Button) findViewById(R.id.playBtn);
        seekBar=(SeekBar) findViewById(R.id.seekBar);
        musicPhoto=(ImageView) findViewById(R.id.musicPhoto);
        music1Btn=(ImageButton) findViewById(R.id.music1Btn);



        mp= MediaPlayer.create(this,R.raw.sarki3);
       // musicName.setText(musicList.get(0));
        mp.setLooping(true);
        mp.seekTo(0);
        mp.setVolume(0.5f, 0.5f);
        time = mp.getDuration();
        seekBar.setMax(time);

    }

    public void playBtnClick(View view) {
        if (!mp.isPlaying()){
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);
        }
        else{
            mp.pause();
            playBtn.setBackgroundResource(R.drawable.play);
        }
    }


    public void music1BtnClick(View view) {
        if (mp.isPlaying()){
            mp.pause();
            mp= MediaPlayer.create(this,R.raw.sarki1);
            // musicName.setText(musicList.get(0));
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            time = mp.getDuration();
            seekBar.setMax(time);
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);

        }
        else{
            mp= MediaPlayer.create(this,R.raw.sarki1);
            // musicName.setText(musicList.get(0));
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            time = mp.getDuration();
            seekBar.setMax(time);
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);

        }
    }

    public void music2BtnClick(View view) {
        if (mp.isPlaying()){
            mp.pause();
            mp= MediaPlayer.create(this,R.raw.sarki2);
            // musicName.setText(musicList.get(0));
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            time = mp.getDuration();
            seekBar.setMax(time);
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);

        }
        else{
            mp= MediaPlayer.create(this,R.raw.sarki2);
            // musicName.setText(musicList.get(0));
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            time = mp.getDuration();
            seekBar.setMax(time);
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);

        }
    }

    public void music3BtnClick(View view) {
        if (mp.isPlaying()){
            mp.pause();
            mp= MediaPlayer.create(this,R.raw.sarki3);
            // musicName.setText(musicList.get(0));
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            time = mp.getDuration();
            seekBar.setMax(time);
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);

        }
        else{
            mp= MediaPlayer.create(this,R.raw.sarki3);
            // musicName.setText(musicList.get(0));
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            time = mp.getDuration();
            seekBar.setMax(time);
            mp.start();
            playBtn.setBackgroundResource(R.drawable.stop);

        }

    }
}