package com.example.ui_android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AndroidActivity01 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity01_android);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.android_activity01, menu);
        return true;
    }
    
}
