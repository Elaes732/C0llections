package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("AnotherOftest");
    }
    private void print(HashMap<Integer, Cat> cats) {
        for (int i=0; i < cats.size(); i++){
            System.out.println("Cat name:" + cats.get(i).getName());
        }
    }
}
