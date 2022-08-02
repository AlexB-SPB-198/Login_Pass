package com.example.login_pass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText gmail , password;
    private TextView welcome , enter, forgot ;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gmail = findViewById(R.id.editText2);
        password = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        welcome = findViewById(R.id.welcome);
        enter= findViewById(R.id.enter);
        forgot= findViewById(R.id.forgot);

        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (gmail.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this , R.color.gray));
                }else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this , R.color.orange));
                }
            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (password.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this , R.color.gray));
                }else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this , R.color.orange));
                }
            }
        });

        button.setOnClickListener(view -> {
            if (gmail.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                welcome.setVisibility(View.GONE);
                gmail.setVisibility(View.GONE);
                password.setVisibility(View.GONE);
                enter.setVisibility(View.GONE);
                forgot.setVisibility(View.GONE);

                Toast.makeText(MainActivity.this , "Правильно" , Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this , "Неверная почта или пороль" , Toast.LENGTH_SHORT).show();
            }
        });
    }
}