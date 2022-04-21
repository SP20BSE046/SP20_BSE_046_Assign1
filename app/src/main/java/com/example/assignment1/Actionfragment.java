package com.example.assignment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Actionfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Actionfragment extends Fragment {
    Button input;
    Button calc;

    public Actionfragment() {
        // Required empty public constructor
    }


    public static Actionfragment newInstance() {
        Actionfragment fragment = new Actionfragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_actionfragment, container, false);
        input=view.findViewById(R.id.inputbtn);
        calc=view.findViewById(R.id.Calcbtn);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}