package com.example.felix.palindromechecker;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    EditText myEdit;
    TextView myTextView;
    String inputText;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myButton = (Button)findViewById(R.id.button2);
        myEdit = (EditText)findViewById(R.id.editText2);
        myTextView = (TextView)findViewById(R.id.textView2);

        myButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view){
                        inputText = myEdit.getText().toString();
                        
                        if(isPalindrome(inputText)){
                            myTextView.setText("Is Palindrome");
                        }else{
                            myTextView.setText("Is No Palindrome");
                        }
                    }
                }

        );




    }
    public static boolean isPalindrome(String str)	{
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
