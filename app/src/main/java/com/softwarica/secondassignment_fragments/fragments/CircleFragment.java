package com.softwarica.secondassignment_fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.softwarica.secondassignment_fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CircleFragment extends Fragment implements View.OnClickListener{

    private Button btnCircle;
    private EditText etRadius;
    private TextView tvResult;


    public CircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_circle, container, false);

        etRadius = view.findViewById(R.id.etRadius);
        tvResult = view.findViewById(R.id.tvResult);
        btnCircle = view.findViewById(R.id.btnCircle);

        btnCircle.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        float radius = Float.parseFloat(etRadius.getText().toString());
        float area = 3.14f * radius * radius;

        tvResult.setText("Area of Circle :" + area);

    }
}
