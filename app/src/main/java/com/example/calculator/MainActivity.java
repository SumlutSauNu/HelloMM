package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addBtn= (Button) findViewById(R.id.button);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1=(EditText) findViewById(R.id.FristNumber);
                EditText num2=(EditText) findViewById(R.id.SecondNumber);
                TextView res=(TextView) findViewById(R.id.Result);

                int n1= Integer.parseInt(num1.getText().toString());
                int n2= Integer.parseInt(num2.getText().toString());
                int sum = n1 + n2;
                res.setText(sum+"");
            }
        });
    }
}
