package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.airbnb.lottie.LottieAnimationView;

public class animation extends AppCompatActivity implements View.OnClickListener {
    private Animation scaleAnimation;
    private ScaleAnimation mScaleAnimation;
    private Button mAlphaBtn;
    private Button mScaleBtn;
    private Button mCombine;
    private ImageView mImage;
    private SeekBar seekbar = null;
    private LottieAnimationView lot = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        Animation loadAnimation;
        mAlphaBtn = findViewById(R.id.btn_alpha);
        mScaleBtn = findViewById(R.id.btn_scale);
        mCombine = findViewById(R.id.btn_combine);
        mImage = findViewById(R.id.image);
        lot = findViewById(R.id.animation_view);
        loadAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        mImage.startAnimation(loadAnimation);
        mAlphaBtn.setOnClickListener(this);
        mScaleBtn.setOnClickListener(this);
        mCombine.setOnClickListener(this);
        seekbar = (SeekBar) findViewById(R.id.seekbar);
        seekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener());

    }
    public void onClick(View v) {
        Animation loadAnimation;
        switch (v.getId()) {
            case R.id.btn_alpha:
                loadAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha);
                mImage.startAnimation(loadAnimation);
                break;
            case R.id.btn_scale:
                loadAnimation = AnimationUtils.loadAnimation(this, R.anim.scale);
                mImage.startAnimation(loadAnimation);
                break;
            case R.id.btn_combine:
                loadAnimation = AnimationUtils.loadAnimation(this, R.anim.combine);
                mImage.startAnimation(loadAnimation);
                break;
            default:
                break;
        }
    }
    private class OnSeekBarChangeListener implements
            SeekBar.OnSeekBarChangeListener {

        // 触发操作，拖动
        public void onProgressChanged(SeekBar seekBar, int progress,
                                      boolean fromUser) {
          float n = progress;
          lot.setProgress(n/100);
        }
        // 表示进度条刚开始拖动，开始拖动时候触发的操作
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        // 停止拖动时候
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

}
