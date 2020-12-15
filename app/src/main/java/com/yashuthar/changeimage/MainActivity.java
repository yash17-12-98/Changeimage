package com.yashuthar.changeimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void newLook(View view){

            ImageView image = (ImageView) findViewById(R.id.myimageView);
            image.setImageResource(R.drawable.harsh);
            Log.i("Test", "button clicked");


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
}