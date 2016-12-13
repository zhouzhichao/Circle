package com.example.zs.circle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private float progress=0;
    private Circleround circleround;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleround= (Circleround) findViewById(R.id.cir);
        new Thread(new Runnable() {

            @Override
            public void run() {
                while(progress <= 100){


                    System.out.println(progress);

                    circleround.setProgress(progress);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            //progressmid.setText(progress+"");
                        }
                    });
                    progress=progress+2;

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }
}
