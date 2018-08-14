package com.masbie.armol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class Main2Activity extends AppCompatActivity {

    GLSurfaceView mView;
    MyRenderer rend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main2);
        Log.v("main activity", "constructor");
        mView = new GLSurfaceView(this);
        mView.setEGLContextClientVersion(2);
        rend = new MyRenderer(this);
        mView.setRenderer(rend);

        //rend.load(R.raw.monkey1);
        //rend.load(R.raw.cube1);
        //this is a test edit
        setContentView(mView);
    }
}
