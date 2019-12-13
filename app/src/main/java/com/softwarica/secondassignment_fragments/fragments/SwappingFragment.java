package com.softwarica.secondassignment_fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
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
public class SwappingFragment extends Fragment implements View.OnClickListener{

    private Button btnSwapping;
    private EditText etFirst, etSecond;
    private TextView tvResult;


    public SwappingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swapping, container, false);

        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        tvResult = view.findViewById(R.id.tvResult);
        btnSwapping = view.findViewById(R.id.btnSwapping);

        btnSwapping.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etFirst.getText())) {
            etFirst.setError("Please input any number.");
            return;
        } else if (TextUtils.isEmpty(etSecond.getText())) {
            etSecond.setError("Please input number");
            return;
        }
        int first = Integer.parseInt(etFirst.getText().toString());
        int second = Integer.parseInt(etSecond.getText().toString());

        first = first + second;
        second = first - second;
        first = first - second;

        tvResult.setText("After Swapping" + " first = " + first + ", second = " + second);
    }
}
