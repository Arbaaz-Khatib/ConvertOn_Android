package com.example.fahad.converton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity1 extends AppCompatActivity {

    Button length;
    Button temp;
    Button volume;
    Button weight;
    Button power;
    Button area;
    Button fuel;
    Button data;
    Button currency;
    Button cooking;
    Button energy;
    Button time;
    Button dts;
    Button angle;
    Button velocity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        length = (Button) findViewById(R.id.Length);
        volume = (Button) findViewById(R.id.Volume);
        power = (Button) findViewById(R.id.Power);
        weight = (Button) findViewById(R.id.Weight);
        currency = (Button) findViewById(R.id.Currency);
        fuel = (Button) findViewById(R.id.Fuel);
        temp = (Button) findViewById(R.id.Temperature);
        angle = (Button) findViewById(R.id.Angle);
        velocity = (Button) findViewById(R.id.Velocity);
        cooking = (Button) findViewById(R.id.Cooking);
        dts = (Button) findViewById(R.id.DTS);
        energy = (Button) findViewById(R.id.Energy);
        area = (Button) findViewById(R.id.Area);
        data = (Button) findViewById(R.id.Data);
        time = (Button) findViewById(R.id.Time);

        final Animation animAlpha = AnimationUtils.loadAnimation(this,
                R.anim.alpha);


        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, length.class);
                startActivity(loadActivity);
            }
        });

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, volume.class);
                startActivity(loadActivity);
            }
        });

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, weight.class);
                startActivity(loadActivity);
            }
        });

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, temp.class);
                startActivity(loadActivity);
            }
        });

        velocity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, velocity.class);
                startActivity(loadActivity);
            }
        });

        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, area.class);
                startActivity(loadActivity);
            }
        });

        energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, energy.class);
                startActivity(loadActivity);
            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, power.class);
                startActivity(loadActivity);
            }
        });

        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, currency.class);
                startActivity(loadActivity);
            }
        });

        fuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, fuel.class);
                startActivity(loadActivity);
            }
        });

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, data.class);
                startActivity(loadActivity);
            }
        });

        dts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, dts.class);
                startActivity(loadActivity);
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, time.class);
                startActivity(loadActivity);
            }
        });

        cooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, cooking.class);
                startActivity(loadActivity);
            }
        });

        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                v.startAnimation(animAlpha);
                Intent loadActivity = new Intent(MainActivity1.this, angle.class);
                startActivity(loadActivity);
            }
        });
    }
}
