package com.wangban.yzbbanban.test_ticwear;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;

import java.util.*;

import com.youth.banner.Banner;

public class MainActivity extends Activity {

    private Banner banner;
    private List<Integer> imgs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                banner= (Banner) findViewById(R.id.banner);
                imgs.add(R.mipmap.be1);
                imgs.add(R.mipmap.be2);
                imgs.add(R.mipmap.be3);
                imgs.add(R.mipmap.be4);
                imgs.add(R.mipmap.be5);
                imgs.add(R.mipmap.be6);
                imgs.add(R.mipmap.be7);
                imgs.add(R.mipmap.be8);
                imgs.add(R.mipmap.be9);
                imgs.add(R.mipmap.be10);
                imgs.add(R.mipmap.be11);
                imgs.add(R.mipmap.be12);
                imgs.add(R.mipmap.be13);
                imgs.add(R.mipmap.be14);
                imgs.add(R.mipmap.be15);
                imgs.add(R.mipmap.be16);
                imgs.add(R.mipmap.be17);
                banner.setImages(imgs);

            }
        });
    }
}
