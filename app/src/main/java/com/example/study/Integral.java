package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Array;

public class Integral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integral);
    }

    Array integrals = ["a", "x^n", 1/x, e^x, a^x, lnx, sinx, cosx, tanx, cotx, cscx, sec^2(x), secxtanx, csc^2(x), cscxcotx,tan^2(x), 1/(a^2 + x^2), 1/((a^2-x^2)^1/2), 1/(x((x^2-a^2)^1/2))"];
}
