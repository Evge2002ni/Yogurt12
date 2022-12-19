package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView Img1_1=(ImageView) findViewById(R.id.imageView);
        ImageView Img1_2=(ImageView) findViewById(R.id.imageView5);
        ImageView Img1_3=(ImageView) findViewById(R.id.imageView6);
        ImageView Img1_4=(ImageView) findViewById(R.id.imageView7);
        ImageView Img1_5=(ImageView) findViewById(R.id.imageView8);
        ImageView Img1_6=(ImageView) findViewById(R.id.imageView9);
        ImageView Img2_1=(ImageView) findViewById(R.id.imageView2);
        ImageView Img2_2=(ImageView) findViewById(R.id.imageView10);
        ImageView Img2_3=(ImageView) findViewById(R.id.imageView11);
        ImageView Img2_4=(ImageView) findViewById(R.id.imageView12);
        ImageView Img2_5=(ImageView) findViewById(R.id.imageView13);
        ImageView Img2_6=(ImageView) findViewById(R.id.imageView14);
        ImageView Img3_1=(ImageView) findViewById(R.id.imageView3);
        ImageView Img3_2=(ImageView) findViewById(R.id.imageView15);
        ImageView Img3_3=(ImageView) findViewById(R.id.imageView16);
        ImageView Img3_4=(ImageView) findViewById(R.id.imageView17);
        ImageView Img3_5=(ImageView) findViewById(R.id.imageView18);
        ImageView Img3_6=(ImageView) findViewById(R.id.imageView19);
        ImageView Img4_1=(ImageView) findViewById(R.id.imageView4);
        ImageView Img4_2=(ImageView) findViewById(R.id.imageView20);
        ImageView Img4_3=(ImageView) findViewById(R.id.imageView21);
        ImageView Img4_4=(ImageView) findViewById(R.id.imageView22);
        ImageView Img4_5=(ImageView) findViewById(R.id.imageView23);
        ImageView Img4_6=(ImageView) findViewById(R.id.imageView24);

        Img1_1.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img1_1.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img1_2.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img1_2.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img1_3.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img1_3.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img1_4.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img1_4.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img1_5.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img1_5.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img1_6.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img1_6.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img2_1.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img2_1.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img2_2.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img2_2.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img2_3.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img2_3.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img2_4.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img2_4.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img2_5.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img2_5.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img2_6.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img2_6.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img3_1.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img3_1.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img3_2.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img3_2.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img3_3.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img3_3.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img3_4.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img3_4.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img3_5.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img3_5.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img3_6.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img3_6.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img4_1.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img4_1.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img4_2.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img4_2.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img4_3.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img4_3.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img4_4.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img4_4.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img4_5.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img4_5.setY(Float.valueOf(String.valueOf(Math.random()*731)));
        Img4_6.setX(Float.valueOf(String.valueOf(Math.random()*411)));
        Img4_6.setY(Float.valueOf(String.valueOf(Math.random()*731)));

Img1_1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Img1_1.setTag(Integer.valueOf((Img1_1.getTag().toString()))-1);
        if(Integer.valueOf(Img1_1.getTag().toString())<0){
            Img1_1.setVisibility(View.INVISIBLE);
        }
        if((Img1_1.getVisibility()==View.INVISIBLE)&&(Img1_2.getVisibility()==View.INVISIBLE)&&(Img1_3.getVisibility()==View.INVISIBLE)&&(Img1_4.getVisibility()==View.INVISIBLE)&&(Img1_5.getVisibility()==View.INVISIBLE)&&(Img1_6.getVisibility()==View.INVISIBLE)){
            Intent intent=new Intent(MainActivity.this,MainActivity3.class);
            startActivity(intent);
        }
    }
});
        Img1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img1_2.setTag(Integer.valueOf((Img1_2.getTag().toString()))-1);
                if(Integer.valueOf(Img1_2.getTag().toString())<0){
                    Img1_2.setVisibility(View.INVISIBLE);
                }
                if((Img1_1.getVisibility()==View.INVISIBLE)&&(Img1_2.getVisibility()==View.INVISIBLE)&&(Img1_3.getVisibility()==View.INVISIBLE)&&(Img1_4.getVisibility()==View.INVISIBLE)&&(Img1_5.getVisibility()==View.INVISIBLE)&&(Img1_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img1_3.setTag(Integer.valueOf((Img1_3.getTag().toString()))-1);
                if(Integer.valueOf(Img1_3.getTag().toString())<0){
                    Img1_3.setVisibility(View.INVISIBLE);
                }
                if((Img1_1.getVisibility()==View.INVISIBLE)&&(Img1_2.getVisibility()==View.INVISIBLE)&&(Img1_3.getVisibility()==View.INVISIBLE)&&(Img1_4.getVisibility()==View.INVISIBLE)&&(Img1_5.getVisibility()==View.INVISIBLE)&&(Img1_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img1_4.setTag(Integer.valueOf((Img1_4.getTag().toString()))-1);
                if(Integer.valueOf(Img1_4.getTag().toString())<0){
                    Img1_4.setVisibility(View.INVISIBLE);
                }
                if((Img1_1.getVisibility()==View.INVISIBLE)&&(Img1_2.getVisibility()==View.INVISIBLE)&&(Img1_3.getVisibility()==View.INVISIBLE)&&(Img1_4.getVisibility()==View.INVISIBLE)&&(Img1_5.getVisibility()==View.INVISIBLE)&&(Img1_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img1_5.setTag(Integer.valueOf((Img1_5.getTag().toString()))-1);
                if(Integer.valueOf(Img1_5.getTag().toString())<0){
                    Img1_5.setVisibility(View.INVISIBLE);
                }
                if((Img1_1.getVisibility()==View.INVISIBLE)&&(Img1_2.getVisibility()==View.INVISIBLE)&&(Img1_3.getVisibility()==View.INVISIBLE)&&(Img1_4.getVisibility()==View.INVISIBLE)&&(Img1_5.getVisibility()==View.INVISIBLE)&&(Img1_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img1_6.setTag(Integer.valueOf((Img1_6.getTag().toString()))-1);
                if(Integer.valueOf(Img1_6.getTag().toString())<0){
                    Img1_6.setVisibility(View.INVISIBLE);
                }
                if((Img1_1.getVisibility()==View.INVISIBLE)&&(Img1_2.getVisibility()==View.INVISIBLE)&&(Img1_3.getVisibility()==View.INVISIBLE)&&(Img1_4.getVisibility()==View.INVISIBLE)&&(Img1_5.getVisibility()==View.INVISIBLE)&&(Img1_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img2_1.setTag(Integer.valueOf((Img2_1.getTag().toString()))-1);
                if(Integer.valueOf(Img2_1.getTag().toString())<0){
                    Img2_1.setVisibility(View.INVISIBLE);
                }
                if((Img2_1.getVisibility()==View.INVISIBLE)&&(Img2_2.getVisibility()==View.INVISIBLE)&&(Img2_3.getVisibility()==View.INVISIBLE)&&(Img2_4.getVisibility()==View.INVISIBLE)&&(Img2_5.getVisibility()==View.INVISIBLE)&&(Img2_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity4.class);
                    startActivity(intent);
                }
            }
        });
        Img2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img2_2.setTag(Integer.valueOf((Img2_2.getTag().toString()))-1);
                if(Integer.valueOf(Img2_2.getTag().toString())<0){
                    Img2_2.setVisibility(View.INVISIBLE);
                }
                if((Img2_1.getVisibility()==View.INVISIBLE)&&(Img2_2.getVisibility()==View.INVISIBLE)&&(Img2_3.getVisibility()==View.INVISIBLE)&&(Img2_4.getVisibility()==View.INVISIBLE)&&(Img2_5.getVisibility()==View.INVISIBLE)&&(Img2_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity4.class);
                    startActivity(intent);
                }
            }
        });
        Img2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img2_3.setTag(Integer.valueOf((Img2_3.getTag().toString()))-1);
                if(Integer.valueOf(Img2_3.getTag().toString())<0){
                    Img2_3.setVisibility(View.INVISIBLE);
                }
                if((Img2_1.getVisibility()==View.INVISIBLE)&&(Img2_2.getVisibility()==View.INVISIBLE)&&(Img2_3.getVisibility()==View.INVISIBLE)&&(Img2_4.getVisibility()==View.INVISIBLE)&&(Img2_5.getVisibility()==View.INVISIBLE)&&(Img2_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity4.class);
                    startActivity(intent);
                }
            }
        });
        Img2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img2_4.setTag(Integer.valueOf((Img2_4.getTag().toString()))-1);
                if(Integer.valueOf(Img2_4.getTag().toString())<0){
                    Img2_4.setVisibility(View.INVISIBLE);
                }
                if((Img2_1.getVisibility()==View.INVISIBLE)&&(Img2_2.getVisibility()==View.INVISIBLE)&&(Img2_3.getVisibility()==View.INVISIBLE)&&(Img2_4.getVisibility()==View.INVISIBLE)&&(Img2_5.getVisibility()==View.INVISIBLE)&&(Img2_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity4.class);
                    startActivity(intent);
                }
            }
        });
        Img2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img2_5.setTag(Integer.valueOf((Img2_5.getTag().toString()))-1);
                if(Integer.valueOf(Img2_5.getTag().toString())<0){
                    Img2_5.setVisibility(View.INVISIBLE);
                }
                if((Img2_1.getVisibility()==View.INVISIBLE)&&(Img2_2.getVisibility()==View.INVISIBLE)&&(Img2_3.getVisibility()==View.INVISIBLE)&&(Img2_4.getVisibility()==View.INVISIBLE)&&(Img2_5.getVisibility()==View.INVISIBLE)&&(Img2_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity4.class);
                    startActivity(intent);
                }
            }
        });
        Img2_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img2_6.setTag(Integer.valueOf((Img2_6.getTag().toString()))-1);
                if(Integer.valueOf(Img2_6.getTag().toString())<0){
                    Img2_6.setVisibility(View.INVISIBLE);
                }
                if((Img2_1.getVisibility()==View.INVISIBLE)&&(Img2_2.getVisibility()==View.INVISIBLE)&&(Img2_3.getVisibility()==View.INVISIBLE)&&(Img2_4.getVisibility()==View.INVISIBLE)&&(Img2_5.getVisibility()==View.INVISIBLE)&&(Img2_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity4.class);
                    startActivity(intent);
                }
            }
        });
        Img3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img3_1.setTag(Integer.valueOf((Img3_1.getTag().toString()))-1);
                if(Integer.valueOf(Img3_1.getTag().toString())<0){
                    Img3_1.setVisibility(View.INVISIBLE);
                }
                if((Img3_1.getVisibility()==View.INVISIBLE)&&(Img3_2.getVisibility()==View.INVISIBLE)&&(Img3_3.getVisibility()==View.INVISIBLE)&&(Img3_4.getVisibility()==View.INVISIBLE)&&(Img3_5.getVisibility()==View.INVISIBLE)&&(Img3_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img3_2.setTag(Integer.valueOf((Img3_2.getTag().toString()))-1);
                if(Integer.valueOf(Img3_2.getTag().toString())<0){
                    Img3_2.setVisibility(View.INVISIBLE);
                }
                if((Img3_1.getVisibility()==View.INVISIBLE)&&(Img3_2.getVisibility()==View.INVISIBLE)&&(Img3_3.getVisibility()==View.INVISIBLE)&&(Img3_4.getVisibility()==View.INVISIBLE)&&(Img3_5.getVisibility()==View.INVISIBLE)&&(Img3_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img3_3.setTag(Integer.valueOf((Img3_3.getTag().toString()))-1);
                if(Integer.valueOf(Img3_3.getTag().toString())<0){
                    Img3_3.setVisibility(View.INVISIBLE);
                }
                if((Img3_1.getVisibility()==View.INVISIBLE)&&(Img3_2.getVisibility()==View.INVISIBLE)&&(Img3_3.getVisibility()==View.INVISIBLE)&&(Img3_4.getVisibility()==View.INVISIBLE)&&(Img3_5.getVisibility()==View.INVISIBLE)&&(Img3_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img3_4.setTag(Integer.valueOf((Img3_4.getTag().toString()))-1);
                if(Integer.valueOf(Img3_4.getTag().toString())<0){
                    Img3_4.setVisibility(View.INVISIBLE);
                }
                if((Img3_1.getVisibility()==View.INVISIBLE)&&(Img3_2.getVisibility()==View.INVISIBLE)&&(Img3_3.getVisibility()==View.INVISIBLE)&&(Img3_4.getVisibility()==View.INVISIBLE)&&(Img3_5.getVisibility()==View.INVISIBLE)&&(Img3_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img3_5.setTag(Integer.valueOf((Img3_5.getTag().toString()))-1);
                if(Integer.valueOf(Img3_5.getTag().toString())<0){
                    Img3_5.setVisibility(View.INVISIBLE);
                }
                if((Img3_1.getVisibility()==View.INVISIBLE)&&(Img3_2.getVisibility()==View.INVISIBLE)&&(Img3_3.getVisibility()==View.INVISIBLE)&&(Img3_4.getVisibility()==View.INVISIBLE)&&(Img3_5.getVisibility()==View.INVISIBLE)&&(Img3_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img3_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img3_6.setTag(Integer.valueOf((Img3_6.getTag().toString()))-1);
                if(Integer.valueOf(Img3_6.getTag().toString())<0){
                    Img3_6.setVisibility(View.INVISIBLE);
                }
                if((Img3_1.getVisibility()==View.INVISIBLE)&&(Img3_2.getVisibility()==View.INVISIBLE)&&(Img3_3.getVisibility()==View.INVISIBLE)&&(Img3_4.getVisibility()==View.INVISIBLE)&&(Img3_5.getVisibility()==View.INVISIBLE)&&(Img3_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img4_1.setTag(Integer.valueOf((Img4_1.getTag().toString()))-1);
                if(Integer.valueOf(Img4_1.getTag().toString())<0){
                    Img4_1.setVisibility(View.INVISIBLE);
                }
                if((Img4_1.getVisibility()==View.INVISIBLE)&&(Img4_2.getVisibility()==View.INVISIBLE)&&(Img4_3.getVisibility()==View.INVISIBLE)&&(Img4_4.getVisibility()==View.INVISIBLE)&&(Img4_5.getVisibility()==View.INVISIBLE)&&(Img4_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img4_2.setTag(Integer.valueOf((Img4_2.getTag().toString()))-1);
                if(Integer.valueOf(Img4_2.getTag().toString())<0){
                    Img4_2.setVisibility(View.INVISIBLE);
                }
                if((Img4_1.getVisibility()==View.INVISIBLE)&&(Img4_2.getVisibility()==View.INVISIBLE)&&(Img4_3.getVisibility()==View.INVISIBLE)&&(Img4_4.getVisibility()==View.INVISIBLE)&&(Img4_5.getVisibility()==View.INVISIBLE)&&(Img4_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img4_3.setTag(Integer.valueOf((Img4_3.getTag().toString()))-1);
                if(Integer.valueOf(Img4_3.getTag().toString())<0){
                    Img4_3.setVisibility(View.INVISIBLE);
                }
                if((Img4_1.getVisibility()==View.INVISIBLE)&&(Img4_2.getVisibility()==View.INVISIBLE)&&(Img4_3.getVisibility()==View.INVISIBLE)&&(Img4_4.getVisibility()==View.INVISIBLE)&&(Img4_5.getVisibility()==View.INVISIBLE)&&(Img4_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img4_4.setTag(Integer.valueOf((Img4_4.getTag().toString()))-1);
                if(Integer.valueOf(Img4_4.getTag().toString())<0){
                    Img4_4.setVisibility(View.INVISIBLE);
                }
                if((Img4_1.getVisibility()==View.INVISIBLE)&&(Img4_2.getVisibility()==View.INVISIBLE)&&(Img4_3.getVisibility()==View.INVISIBLE)&&(Img4_4.getVisibility()==View.INVISIBLE)&&(Img4_5.getVisibility()==View.INVISIBLE)&&(Img4_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img4_5.setTag(Integer.valueOf((Img4_5.getTag().toString()))-1);
                if(Integer.valueOf(Img4_5.getTag().toString())<0){
                    Img4_5.setVisibility(View.INVISIBLE);
                }
                if((Img4_1.getVisibility()==View.INVISIBLE)&&(Img4_2.getVisibility()==View.INVISIBLE)&&(Img4_3.getVisibility()==View.INVISIBLE)&&(Img4_4.getVisibility()==View.INVISIBLE)&&(Img4_5.getVisibility()==View.INVISIBLE)&&(Img4_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
        Img4_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Img4_6.setTag(Integer.valueOf((Img4_6.getTag().toString()))-1);
                if(Integer.valueOf(Img4_6.getTag().toString())<0){
                    Img4_6.setVisibility(View.INVISIBLE);
                }
                if((Img4_1.getVisibility()==View.INVISIBLE)&&(Img4_2.getVisibility()==View.INVISIBLE)&&(Img4_3.getVisibility()==View.INVISIBLE)&&(Img4_4.getVisibility()==View.INVISIBLE)&&(Img4_5.getVisibility()==View.INVISIBLE)&&(Img4_6.getVisibility()==View.INVISIBLE)){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
            }
        });

    }
}
//