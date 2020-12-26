package cn.itcast.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;

import java.util.Timer;

public class MusicServer extends Service {
    private MediaPlayer player;
    private Timer timer;
    public MusicServer(){}
    @Override
    public IBinder onBind(Intent intent) {return new MusicControl();}
    public void onCreate(){
        super.onCreate();
        player = new MediaPlayer();

    }

    public void onDestroy(){

    }
    public void addTimer(){

    }
    class MusicControl extends Binder{
       MusicService getService(){return MusicService.this;}
    }
    public void play(){

    }
}
