package com.allhanouf96.ealdekh;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class ShopActivity extends AppCompatActivity {
     ViewFlipper imgbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);



   imgbanner=findViewById(R.id.imgBanner);

        int sliders[]={
              R.drawable.banner1, R.drawable.banner2, R.drawable.banner3


        };
         for(int slide:sliders){
             bannerFliper(slide);
         }

    }

    public void bannerFliper(int image){
        ImageView imageView=new ImageView(this);
        imageView.setImageResource(image);
        imgbanner.addView(imageView);
        imgbanner.setFlipInterval(6000);
        imgbanner.setAutoStart(true);
        imgbanner.setInAnimation(this, android.R.anim.fade_in);
        imgbanner.setOutAnimation(this, android.R.anim.fade_out);
    }



}
