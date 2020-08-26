package kr.ac.sunmmoon.myframelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView, imageView2;
    int index = 0;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
    }

    public void onButton1Clicked(View v){
        index += 1;

        if (index > 1)  index = 0;

        if(index == 1) {
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            toast = Toast.makeText(this.getApplicationContext(),
                    "Change Image!!\n1->2",Toast.LENGTH_SHORT);
            toast.show();
        }else if(index == 0){
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            toast = Toast.makeText(this.getApplicationContext(),
                    "Change Image!!\n2->1",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}