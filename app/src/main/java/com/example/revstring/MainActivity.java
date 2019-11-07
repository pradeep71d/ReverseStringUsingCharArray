package com.example.revstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s1="this";
        char[]ch=s1.toCharArray();
        int j=ch.length;
        for (int i=j;i>0;i--){
            System.out.print(ch[i-1]);//i=1,2,3,4
        }
    }
}

