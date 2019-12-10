package com.softwarica.secondassignment_fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.softwarica.secondassignment_fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterestFragment extends Fragment implements View.OnClickListener{

    private Button btnSimple;
    private EditText etPrincipal, etRate, etTime;


    public SimpleInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);

        etPrincipal = view.findViewById(R.id.etPrincipal);
        etRate = view.findViewById(R.id.etRate);
        etTime = view.findViewById(R.id.etTime);
        btnSimple = view.findViewById(R.id.btnSimple);

        btnSimple.setOnClickListener(this);
        return  view;
    }

    @Override
    public void onClick(View v) {
        float principal = Integer.parseInt(etPrincipal.getText().toString());
        float rate = Integer.parseInt(etRate.getText().toString());
        float time = Integer.parseInt(etTime.getText().toString());
        float simpleinterest = ((principal * rate * time) / 100 );

        Toast.makeText(getActivity(),"Simple Interest:" + simpleinterest, Toast.LENGTH_SHORT).show();

    }
}
