package com.yalova.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button playBtn ;
    SeekBar seekBar ;
    SeekBar seekBar2;
    ImageView musicPhoto;
    MediaPlayer mp;
    ImageButton music1Btn;
    TextView name;
    int time;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playBtn=(Button) findViewById(R.id.playBtn);
        musicPhoto=(ImageView) findViewById(R.id.musicPhoto);
        music1Btn=(ImageButton) findViewById(R.id.music1Btn);
        name=(TextView) findViewById(R.id.name);

        seekBar=(SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(time);
        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        if (fromUser) {
                            mp.seekTo(progress);
                            seekBar.setProgress(progress);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                }
        );

        seekBar2=(SeekBar)findViewById(R.id.seekBar2);
        seekBar2.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        float volumeNum = progress / 100f;
                        mp.setVolume(volumeNum, volumeNum);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                }
        );



        mp= MediaPlayer.create(this,R.raw.sarki3);
       // musicName.setText(musicList.get(0));
        mp.setLooping(true);
        mp.seekTo(0);
        mp.setVolume(0.5f, 0.5f);
        time = mp.getDuration();
        seekBar.setMax(time);
        name.setText("Tuğkan- Bu Kalp Seni Unutur Mu?");

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
            name.setText("Athena- Senden Benden Bizden");
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
            name.setText("Athena- Senden Benden Bizden");
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
            name.setText("Tom Odell- Another Love");
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
            name.setText("Tom Odell- Another Love");
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
            name.setText("Tuğkan- Bu Kalp Seni Unutur Mu?");
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
            name.setText("Tuğkan- Bu Kalp Seni Unutur Mu?");
            playBtn.setBackgroundResource(R.drawable.stop);

        }

    }
}