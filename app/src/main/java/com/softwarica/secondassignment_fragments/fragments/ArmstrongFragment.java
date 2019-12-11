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
public class ArmstrongFragment extends Fragment implements View.OnClickListener{

    private Button btnArmstrong;
    private EditText etArmstrongNumber;
    private TextView tvResult;


    public ArmstrongFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong, container, false);

        etArmstrongNumber = view.findViewById(R.id.etArmstrongNumber);
        tvResult = view.findViewById(R.id.tvResult);
        btnArmstrong = view.findViewById(R.id.btnArmstrong);

        btnArmstrong.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int c=0,a,temp;
        int number = Integer.parseInt(etArmstrongNumber.getText().toString());

        temp=number;
        while (number>0)
        {
            a = number % 10;
            number = number / 10;
            c = c +(a*a*a);
        }

        if (temp==c)

            tvResult.setText("The Number is Armstrong.");

        else

            tvResult.setText("The Number is not Armstrong.");

    }
}
