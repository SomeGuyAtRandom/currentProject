package la.random.someguy.holamundo.activities;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;

import la.random.someguy.holamundo.R;

public class Splash extends Activity {

    private Thread pause = null;
    private MediaPlayer intoRing;

    private void NavagateToNextPage(){

        int jingle =R.raw.party;
        Context context = Splash.this;

        intoRing = MediaPlayer.create(context, jingle);
        intoRing.start();

        if (pause==null){
            pause = new Thread() {
                public void run() {
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {

                        Context context = Splash.this;
                        Class target = la.random.someguy.holamundo.Main.class;
                        Intent intent = new Intent(context,target);
                        startActivity(intent);
                        finish();


                    }
                }
            };
            pause.start();
            //pause = null;

        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        NavagateToNextPage();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("SplashActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("SplashActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SplashActivity", "onPause");
        intoRing.release();
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SplashActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SplashActivity", "onDestroy");
    }
}
