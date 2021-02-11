package com.siddharth.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int n;

    public void guess(View view){
        EditText value = (EditText) findViewById(R.id.input);
        int i = Integer.parseInt(value.getText().toString());
        if(i<n) {
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
        }
        else if(i>n)
        {
            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            Random random = new Random();
            n = random.nextInt(20) + 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
         n = random.nextInt(20) + 1;
    }
}