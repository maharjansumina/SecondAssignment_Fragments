package com.softwarica.secondassignment_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.softwarica.secondassignment_fragments.fragments.ArmstrongFragment;
import com.softwarica.secondassignment_fragments.fragments.AutomorphicFragment;
import com.softwarica.secondassignment_fragments.fragments.CircleFragment;
import com.softwarica.secondassignment_fragments.fragments.PalindromeFragment;
import com.softwarica.secondassignment_fragments.fragments.SimpleInterestFragment;
import com.softwarica.secondassignment_fragments.fragments.SwappingFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCircle, btnPalindrome, btnSwapping, btnSimple,
            btnAutomorphic, btnArmstrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCircle = findViewById(R.id.btnCircle);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSwapping = findViewById(R.id.btnSwapping);
        btnSimple = findViewById(R.id.btnSimple);
        btnAutomorphic = findViewById(R.id.btnAutomorphic);
        btnArmstrong = findViewById(R.id.btnArmstrong);

        btnCircle.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnSwapping.setOnClickListener(this);
        btnSimple.setOnClickListener(this);
        btnAutomorphic.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnCircle:
                CircleFragment circleFragment = new CircleFragment();
                fragmentTransaction.replace(R.id.FragmentContainer,circleFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnPalindrome:
                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.FragmentContainer, palindromeFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnSwapping:
                SwappingFragment swappingFragment = new SwappingFragment();
                fragmentTransaction.replace(R.id.FragmentContainer, swappingFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnSimple:
                SimpleInterestFragment simpleInterestFragment = new SimpleInterestFragment();
                fragmentTransaction.replace(R.id.FragmentContainer, simpleInterestFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnArmstrong:
                ArmstrongFragment armstrongFragment = new ArmstrongFragment();
                fragmentTransaction.replace(R.id.FragmentContainer, armstrongFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnAutomorphic:
                AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                fragmentTransaction.replace(R.id.FragmentContainer, automorphicFragment);
                fragmentTransaction.commit();
                break;
        }

    }
}
