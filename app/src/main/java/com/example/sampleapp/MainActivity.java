package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int result;
    static int getRandomNumber(int max,int min){
        return(int)((Math.random()*(max-min))+min);
    }
    public void makeToast(String str){
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
    }

public void addListenerOnButton() {
    Button button = (Button) findViewById(R.id.button);


    button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            int userGuessing;
            EditText editText=(EditText)findViewById(R.id.editText);
            userGuessing = Integer.parseInt(editText.getText().toString());
            if (userGuessing > result) {
                makeToast("Think of higher number,Try Again!!");
            } else if (userGuessing > result) {
                makeToast("Think of lower number,Try Again!!");
            } else {
                makeToast("Congratulations,You got the number!!");
            }
        }
    });
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int min=1;
        int max=100;
        result=getRandomNumber(min,max);
        addListenerOnButton();
    }
}
