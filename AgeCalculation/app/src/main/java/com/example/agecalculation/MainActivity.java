package com.example.agecalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

     EditText edtYear;
     TextView txtAge;
     Button btnResult;
     int finalResult , birthYear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtYear=(EditText)findViewById(R.id.editText);
        txtAge = (TextView)findViewById(R.id.textView3);
        btnResult=(Button)findViewById(R.id.btnAge);


        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                birthYear = Integer.parseInt(edtYear.getText().toString());
                finalResult= 2020-birthYear;
                txtAge.setText(" "+finalResult);
            }
        });

    }
}
