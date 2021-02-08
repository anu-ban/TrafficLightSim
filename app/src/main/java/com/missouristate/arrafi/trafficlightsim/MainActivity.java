package com.missouristate.arrafi.trafficlightsim;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Animation Drawable
    AnimationDrawable trafficLightAni;
    private ImageView iv;
    private ImageView idImageRed;
    private ImageView idImageYello;
    private ImageView idImageGreen;
    private ImageView idImageRed2;
    private ImageView idImageYello_red;
    private Button btnClick;
    private TextView lightOutView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        iv = findViewById(R.id.iView);

        trafficLightAni = (AnimationDrawable) iv.getDrawable();








    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        idImageRed = findViewById(R.id.red);
        idImageYello = findViewById(R.id.yellow);
        idImageYello_red = findViewById(R.id.red_yellow);
        idImageGreen = findViewById(R.id.rreen);
        idImageRed2 = findViewById(R.id.red2);






    }


    public void onClickTraffiLight(View view) {
        btnClick = findViewById(R.id.btnClick);
        trafficLightAni.selectDrawable(0);
        btnClick.setBackgroundColor(Color.RED);
        btnClick.setText("Stop");
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    trafficLightAni.selectDrawable(1);
                    btnClick.setBackgroundColor(Color.YELLOW);
                    btnClick.setText("Wait");
                    btnClick.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                trafficLightAni.selectDrawable(2);
                                btnClick.setBackgroundColor(Color.GREEN);
                                btnClick.setText("Go");
                            }
                        });
                    }
                });
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trafficLightAni.stop();
            }
        });

            }

    }

