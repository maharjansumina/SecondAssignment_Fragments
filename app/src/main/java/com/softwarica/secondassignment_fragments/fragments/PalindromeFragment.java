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
public class PalindromeFragment extends Fragment implements View.OnClickListener{

    private Button btnPalindrome;
    private EditText etPalindrome;


    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);

        etPalindrome = view.findViewById(R.id.etPalindrome);
        btnPalindrome = view.findViewById(R.id.btnPalindrome);

        btnPalindrome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int r,sum=0,temp;
        int number = Integer.parseInt(etPalindrome.getText().toString());

        temp=number;
        while(number>0){
            r=number%10;  //getting remainder
            sum=(sum*10)+r;
            number=number/10;
        }
        if(temp==sum)

            Toast.makeText(getActivity(),"The number is Palindrome.", Toast.LENGTH_SHORT).show();

        else
            Toast.makeText(getActivity(),"The number is not Palindrome.",Toast.LENGTH_SHORT).show();

    }
}
