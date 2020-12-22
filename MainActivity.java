package com.example.memorygame;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

//import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "Main_Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button[] b = new Button[12];
        b[0] = (Button) findViewById(R.id.button);
        b[1] = (Button) findViewById(R.id.button2);
        b[2] = (Button) findViewById(R.id.button3);
        b[3] = (Button) findViewById(R.id.button4);
        b[4] = (Button) findViewById(R.id.button5);
        b[5] = (Button) findViewById(R.id.button6);
        b[6] = (Button) findViewById(R.id.button7);
        b[7] = (Button) findViewById(R.id.button8);
        b[8] = (Button) findViewById(R.id.button9);
        b[9] = (Button) findViewById(R.id.button10);
        b[10] = (Button) findViewById(R.id.button11);
        b[11] = (Button) findViewById(R.id.button12);
        final int[] textNumberButton = new int[12];
        final String[] textStringButton = new String[12];
        final Button[] butOnClick = new Button[2];
        int n = 0;
        int c;
        int a;
        int d;
        final int[] open = new int[2];
        final int[] press = {0};
        for (int i = 0; i < 12; i += 2) {
            n++;
            textNumberButton[i] = n;
            textNumberButton[i + 1] = n;
        }
        for (int i = 0; i < 100; i++) {
            a = (int) Math.floor(Math.random() * 11 + 1);
            d = (int) Math.floor(Math.random() * 11 + 1);
            c = textNumberButton[a];
            textNumberButton[a] = textNumberButton[d];
            textNumberButton[d] = c;
        }
        for (int i = 0; i < textStringButton.length; i++) {
            textStringButton[i] = String.valueOf(textNumberButton[i]);
            Log.d(LOG_TAG, textStringButton[i]);
        }
        boolean isPlay = true;
        //while (isPlay) {
        int i = 0;
        final int[] onp = {0};

        for (i = 0; i < b.length; i++) {
            final int finalI = i;
            final Button cl = b[i];
            final Button cl2 = b[i];
            Log.d(LOG_TAG, i + ", " + i + "," + "67");
            if (press[0] == 0) {
                cl.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cl.setText(textStringButton[finalI]);
                        Log.d(LOG_TAG, press[0] + ", " + cl + "77");
                        butOnClick[press[0]] = cl;
                        Log.d(LOG_TAG, open[0] + ", " + open[1] + ", " + butOnClick[0] + ", " + butOnClick[1] + ", " + cl + ", 79");
                        open[press[0]] = textNumberButton[finalI];

                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if(open[0] != open[1] && press[0] == 1){
                            Log.d(LOG_TAG, open[0] + ", " + open[1] + ", " + butOnClick[0] + ", " + butOnClick[1] + ", " + cl + ", 82");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        press[0]++;
                        Log.d(LOG_TAG, open[0] + ", " + press[0] + "," + "80");
                    }
                });
                Log.d(LOG_TAG,"96");
            }
            Log.d(LOG_TAG,"96");
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d(LOG_TAG,"98");
        //}
    }

//    public void enter(){
//        Log.d(LOG_TAG,"132");
//        b[0].setText("");
//        b[1].setText("");
//    }

    public void sText(Button cl, Button cl2, int[] open, int[] press){
        Log.d(LOG_TAG, open[0] + ", " + press[0] + "," + "104");
//        cl.setText("");
//        cl2.setText("");
    }
}