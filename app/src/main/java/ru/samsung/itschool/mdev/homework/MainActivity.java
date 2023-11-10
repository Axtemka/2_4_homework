package ru.samsung.itschool.mdev.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ru.samsung.itschool.mdev.homework.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public EditText objectA, objectB, objectC;
    public TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.activity_main);

        binding.run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double a = Double.parseDouble(String.valueOf(binding.a.getText()));
                double b = Double.parseDouble(String.valueOf(binding.b.getText()));
                double c = Double.parseDouble(String.valueOf(binding.c.getText()));

                double d = b*b - 4 * a * c;
                if (a == 0.0 && b == 0.0 && c == 0.0) binding.res.setText("any");
                if (d < 0) binding.res.setText("none");
                if (d == 0.0){
                    double x = (-b )/ (2 * a);
                    binding.res.setText(String.valueOf(x));
                }
                if (d > 0){
                    double x1 = (-b + Math.sqrt(d)) / (2 * a);
                    double x2 = (-b - Math.sqrt(d)) / (2 * a);
                    binding.res.setText(x1 + " " + x2);
                }
            }
        });
    }
}