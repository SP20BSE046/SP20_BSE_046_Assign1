package com.example.assignment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class InputDataFragment extends Fragment {
    Button store;
    EditText num1;
    EditText num2;
    EditText num3;
    public InputDataFragment() {
        // Required empty public constructor
    }


    public static InputDataFragment newInstance() {
        InputDataFragment fragment = new InputDataFragment();

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
        View view=inflater.inflate(R.layout.fragment_input_data, container, false);
        store=view.findViewById(R.id.storebtn);
        num1=view.findViewById(R.id.numtv1);
        num2=view.findViewById(R.id.numtv2);
        num3=view.findViewById(R.id.numtv3);
        return view;
    }
}