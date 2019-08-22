package me.tatarka.androidquiznos;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import me.tatarka.quiznos.Build;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.welcome);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.QUIZNOS) {
            textView.setText("Welcome to Android Quiznos!");
        } else {
            textView.setText("Welcome to Android Classic™");
        }
    }
}
