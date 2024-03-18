package com.example.sherlock;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.sherlock.databinding.ActivitySecondBinding;

public class Second extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public final static String THIEF = "com.example.sherlock.THIEF";

    public void onRadioClick(View v) {
        Intent answerIntent = new Intent();
        int id = v.getId();
        if (id == R.id.radioDog) {
            answerIntent.putExtra(THIEF, "Собака");
        } else if (id == R.id.radioCrow) {
            answerIntent.putExtra(THIEF, "Ворона");
        } else {
            answerIntent.putExtra(THIEF, "Корова");
        }

        setResult(RESULT_OK, answerIntent);
        finish();
    }
}
