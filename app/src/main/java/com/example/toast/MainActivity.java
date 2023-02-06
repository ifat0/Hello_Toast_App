package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("SetTextI18n")
    public void inVAL(View view) {
        TextView tv = findViewById(R.id.textView);
                int i= Integer.parseInt(tv.getText().toString());
                i++;
                tv.setText(i+"");
    }
}