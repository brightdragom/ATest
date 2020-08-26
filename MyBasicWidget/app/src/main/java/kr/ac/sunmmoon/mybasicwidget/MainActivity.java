package kr.ac.sunmmoon.mybasicwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton radioButton, radioButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton = (RadioButton) findViewById(R.id.radioButton);
        boolean checked = radioButton.isChecked();
    }
}