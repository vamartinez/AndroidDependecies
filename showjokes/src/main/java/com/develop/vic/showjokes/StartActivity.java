package com.develop.vic.showjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.JokerJavaGenerator;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        JokerJavaGenerator myJokerJavaGenerator = new JokerJavaGenerator();
        Toast.makeText(this, intent.getExtras().getString("JOKE"), Toast.LENGTH_SHORT).show();
        finish();
    }
}
