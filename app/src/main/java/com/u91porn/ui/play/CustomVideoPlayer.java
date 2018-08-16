package com.u91porn.ui.play;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Toast;

import cn.jzvd.JZVideoPlayerStandard;

public class CustomVideoPlayer extends JZVideoPlayerStandard{


    public CustomVideoPlayer(Context context) {
        super(context);
    }

    public CustomVideoPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setProgressAndText(int progress, int position, int duration) {
        super.setProgressAndText(progress, position, duration);
        int time = position/1000;
        if(time>120){
////            JZMediaManager.instance().mediaPlayer.pause();
            releaseAllVideos();
            Toast.makeText(getContext().getApplicationContext(),"要充值了",Toast.LENGTH_LONG).show();
        }
    }
}
