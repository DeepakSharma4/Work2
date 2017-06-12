package com.example.hp.work2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements communcation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void funone(String y) {
        FragmentManager fm = getSupportFragmentManager();
        frag2 ff = (frag2) fm.findFragmentById(R.id.fragmentwo);

        ff.fun2nd(y); //messgsnd is A FUNC NAME
    }

    @Override
    public void fun3rd(String z) {
        FragmentManager fm = getSupportFragmentManager();
        frag1 ff = (frag1) fm.findFragmentById(R.id.fragmentOne);

        ff.fun4(z); //messgsnd is A FUNC NAME
    }
}
