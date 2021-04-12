 package com.bien.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.BreakIterator;

 public class MainActivity extends AppCompatActivity {

    public void onLogin(View view){
        Log.i("info", "login handler");

        EditText username = (EditText) findViewById(R.id.usernamePlainText);

        EditText password = (EditText) findViewById(R.id.myTextPassword);

       Toast.makeText(MainActivity.this, "sfsafasfsafasd", Toast.LENGTH_LONG).show();

        Log.i("Username", password.getText().toString());
        Log.i("Username", username.getText().toString());
    }

    public void onChangeImage(View view) {
        ImageView newImage = (ImageView) findViewById(R.id.aiImage);

        newImage.setImageResource(R.drawable.ml);
        Log.i("info", "change image success!!");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}