package com.cisimple;

import java.lang.Thread.UncaughtExceptionHandler;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity implements UncaughtExceptionHandler {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("cisimple");
        Thread.currentThread().setUncaughtExceptionHandler(this);
        ImageView imageView = (ImageView) this.findViewById(R.id.logoImage);
        
        try {
        	imageView.setImageResource(R.drawable.logo_large);
        }
        catch(Exception err) {
        	Log.i("", "");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public void uncaughtException(Thread thread, Throwable ex) {
		Log.i("", "");
	}
}
