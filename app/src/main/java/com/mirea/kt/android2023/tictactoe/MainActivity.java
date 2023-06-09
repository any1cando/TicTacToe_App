package com.mirea.kt.android2023.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private EditText editTextLogin;
    private EditText editTextPassword;
    private TextView textViewErrors;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLogin = findViewById(R.id.editTextLogin);
        editTextPassword = findViewById(R.id.editTextPassword);
        textViewErrors = findViewById(R.id.textViewLoginErrors);
        button = findViewById(R.id.buttonLogin);

        button.setOnClickListener(x -> {
            Log.i("app_tag", "Login button was pressed");

            String login = editTextLogin.getText().toString();
            String password = editTextPassword.getText().toString();

            if (login.isEmpty() || password.isEmpty()) {
                textViewErrors.setText("Поля не могут быть пустыми!");
                return;
            }

            String server = "https://android-for-students.ru";
            String serverPath = "/coursework/login.php";
            HashMap<String, String> map = new HashMap<>();
            map.put("lgn", login);
            map.put("pwd", password);
            map.put("g", "RIBO-01-21");
            HTTPRunnable httpRunnable = new HTTPRunnable(server + serverPath, map);
            Thread th = new Thread(httpRunnable);
            th.start();
            try {
                th.join();
            } catch (InterruptedException e) {
                Log.e("app_tag", e.getMessage());
            } finally {
                try {
                    JSONObject jsonObject = new JSONObject(httpRunnable.getResponseBody());
                    int result = jsonObject.getInt("result_code");

                    if (result == 1) {

                        Toast.makeText(this, "Успешно!", Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(MainActivity.this, ParametersActivity.class);
                        startActivity(intent);
                    } else {
                        textViewErrors.setText("Неверный логин или пароль!");
                    }
                } catch (JSONException e) {
                    Log.e("app_tag", e.getMessage());
                }
            }
        });

        Log.i("app_tag", "MainActivity was created");
    }
}