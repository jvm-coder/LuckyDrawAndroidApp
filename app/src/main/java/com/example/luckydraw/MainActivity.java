package com.example.luckydraw;

import java.util.*;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private EditText et;
    ArrayList<Editable> ar = new ArrayList<android.text.Editable>();
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.winner);
        et = (EditText) findViewById(R.id.names);
    }

    public void lucky(View view) {
        tv.setText("WINNER-->\n\t\t\t\t\t\t"+ar.get(rand.nextInt(ar.size())));
        tv.setVisibility(view.VISIBLE);
    }

    public void addNames(View view) {
        ar.add(et.getText());
        et.setText("");
    }

    public void reset(View view) {
        ar.clear();
    }
}