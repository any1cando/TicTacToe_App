package com.mirea.kt.android2023.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class ParametersActivity extends AppCompatActivity {

    private EditText editTextFirstPlayer;
    private EditText editTextSecondPlayer;
    private RadioGroup radioGroup;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parameters);

        editTextFirstPlayer = findViewById(R.id.editTextParametersFirstPlayerName);
        editTextSecondPlayer = findViewById(R.id.editTextParametersSecondPlayerName);
        radioGroup = findViewById(R.id.radioGroup);
        button = findViewById(R.id.buttonCreate);

        button.setOnClickListener(x -> {
            Log.i("app_tag", "Start game button was pressed");

            String firstPlayer = editTextFirstPlayer.getText().toString();
            String secondPlayer = editTextSecondPlayer.getText().toString();

            if (firstPlayer.isEmpty()) {
                firstPlayer = "1-й игрок";
            }

            if (secondPlayer.isEmpty()) {
                secondPlayer = "2-й игрок";
            }

            Intent intent;
            RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());

            if (radioButton.getText().equals("3x3")) {
                intent = new Intent(ParametersActivity.this, ClassicGameActivity.class);
            } else {
                intent = new Intent(ParametersActivity.this, FourTimesFourGameActivity.class);
            }

            intent.putExtra("first_player", firstPlayer);
            intent.putExtra("second_player", secondPlayer);
            startActivity(intent);
        });

        Log.i("app_tag", "ParametersActivity was created");
    }
}