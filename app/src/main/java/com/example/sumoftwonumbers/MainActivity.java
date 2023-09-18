package com.example.sumoftwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    Button button3;
    TextView textView;
    TextView multTable1;
    TextView multTable2;
    EditText number1;
    EditText number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.displayText);
        multTable1=findViewById(R.id.multTable1);
        multTable2=findViewById(R.id.multTable2);
        button=findViewById(R.id.button);
        button2= findViewById(R.id.mult);
        button3=findViewById(R.id.button3);
        number1=findViewById(R.id.n1);
        number2=findViewById(R.id.n2);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String s1=number1.getText().toString();
//                String s2=number2.getText().toString();
//                int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
//                textView.setText("The Sum is : "+sum);
//            }
//        });

    }
    //We can use this function to calculate sum and add its reference in the button.
    public void calculateSum(View view)
    {
        String s1=number1.getText().toString();
        String s2=number2.getText().toString();
        int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
        textView.setText("The Sum is : "+sum);
        Toast.makeText(this, "Thank you for using my app", Toast.LENGTH_SHORT).show();
        //We can use toast anywhere in this code i.e., for startup of app use toast inside the onCreate method. This will give a toast on startup of the app
        //and if we give toast inside onCLick i.e., the methods calculateSum and calculateMult it will give toast after clicking the buttons sum and multiplication
    }
    public void calculateMult(View view)
    {
        String s1=number1.getText().toString();
        String s2=number2.getText().toString();
        int mult=Integer.parseInt(s1)*Integer.parseInt(s2);
        textView.setText("The Multiplication is : "+mult);
        Toast.makeText(this, "Thank you for using my app", Toast.LENGTH_SHORT).show();
    }

    public void displayTable(View view)
    {
        String s1=number1.getText().toString();
        String s2=number2.getText().toString();
        int mult1=Integer.parseInt(s1);
        String ans1="";
        String str1="";
        for (int i=1;i<=10;i++)
        {
            str1=mult1+"*"+i+"="+mult1*i+"\n";
            ans1=ans1+str1;
        }
        multTable1.setText(ans1);

        int mult2=Integer.parseInt(s2);
        String ans2="";
        String str2="";
        for (int i=1;i<=10;i++)
        {
            str2=mult2+"*"+i+"="+mult2*i+"\n";
            ans2=ans2+str2;
        }
        multTable2.setText(ans2);
    }
}