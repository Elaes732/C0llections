package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("AnotherOftest");
        ArrayList<Cat> cats=new ArrayList<>();
        print(cats);
    }

    private void print(ArrayList<Cat> cats){
        for (int i=0;i<cats.size();i++){
            System.out.println("Cats name :" + cats.get(i).getName());
        }
    }
}
