package com.epsidon.mobileworkshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView textView;
    private Button button;
    private Button captureImageButton;
    private Button captureGps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);
        captureImageButton = (Button)findViewById(R.id.startCameraActivityButton);
        captureGps = (Button)findViewById(R.id.startGpsActivity);
    }

    @Override
    protected void onResume(){
        super.onResume();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("here you go");
            }
        });

        captureImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cameraActivity = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(cameraActivity);
            }
        });

        captureGps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gpsActivity = new Intent(MainActivity.this, GpsActivity.class);
                startActivity(gpsActivity);
            }
        });
    }


 }
