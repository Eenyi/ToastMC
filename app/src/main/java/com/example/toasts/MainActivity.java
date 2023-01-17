package com.example.toasts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.alertBtn);
        LayoutInflater lf = getLayoutInflater();
        View layout = lf.inflate(R.layout.custimtoast, (ViewGroup) findViewById(R.id.t));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder altBuilder = new AlertDialog.Builder(MainActivity.this);
                altBuilder.setMessage("Yo what up!");
                altBuilder.setTitle("Greetings");
                altBuilder.setView(layout);
                altBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        LayoutInflater lf = getLayoutInflater();
                        View layout = lf.inflate(R.layout.custimtoast, (ViewGroup) findViewById(R.id.t));
                        Toast t = new Toast(MainActivity.this);
                        t.setView(layout);
                        t.show();
                    }
                });
                altBuilder.show();
            }
        });
    }




}