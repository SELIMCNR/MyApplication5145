package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button kaydetButton = (Button) findViewById(R.id.button2);
        final EditText adEditText = (EditText) findViewById(R.id.editText);
        final EditText SoyadEditText = (EditText) findViewById(R.id.editText1);

        kaydetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adText = adEditText.getText().toString();
                String soyadText = SoyadEditText.getText().toString();
                String mesaj = "Merhaba " + adText + " " + soyadText + "!";
                Toast.makeText(MainActivity.this,mesaj,Toast.LENGTH_LONG
                ).show();

            }
        });
    }
}