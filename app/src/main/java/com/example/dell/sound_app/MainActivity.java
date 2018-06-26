package com.example.dell.sound_app;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 3;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
        private int mASoundId;
         private int mBSoundId;
            private int mCSoundId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: Create a new SoundPool
        mSoundPool= new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);
        // TODO: Load and get the IDs to identify the sounds
mASoundId=mSoundPool.load(getApplicationContext(),R.raw.a,1);
mBSoundId=mSoundPool.load(getApplicationContext(),R.raw.b,1);
mCSoundId=mSoundPool.load(getApplicationContext(),R.raw.c,1);





    }
    public void playa (View view)
    {
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playb (View view)
    {
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playc (View view)
    {
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
}
