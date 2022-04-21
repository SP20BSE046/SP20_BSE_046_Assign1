package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private Actionfragment actionfragment;
    private MessageFragment messageFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        actionfragment=Actionfragment.newInstance();
        messageFragment=MessageFragment.newInstance();
        fragmentTransaction.replace(R.id.LeftFL,actionfragment);
        fragmentTransaction.replace(R.id.RightFL, messageFragment);
        fragmentTransaction.commit();
    }
}