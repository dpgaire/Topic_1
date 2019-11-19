package com.mr.topic_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText etfirst,etsecond;
    RadioButton rdoAdd,rdoSub;
    Button btnCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirst=findViewById(R.id.etfirst);
        etsecond=findViewById(R.id.etsecond);
        rdoAdd=findViewById(R.id.rdoAdd);
        rdoSub=findViewById(R.id.rdoSub);
        btnCalculate=findViewById(R.id.btnCalculate);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first,second,result;

                first=Integer.parseInt(etfirst.getText().toString());
                second=Integer.parseInt(etsecond.getText().toString());

                if(rdoAdd.isChecked()){
                    Calculation calculation=new Calculation( first,second);
                    result=calculation.Add();
                    Toast.makeText(MainActivity.this, "The results"+result, Toast.LENGTH_LONG).show();

                }
               else if(rdoSub.isChecked()){
                   Calculation calculation=new Calculation(first,second);
                   result=calculation.Sub();
                    Toast.makeText(MainActivity.this, "The results is:"+result, Toast.LENGTH_LONG).show();

                }


            }
        });

    }
}
