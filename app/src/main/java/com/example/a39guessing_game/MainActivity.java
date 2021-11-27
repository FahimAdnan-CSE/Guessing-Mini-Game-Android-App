package com.example.a39guessing_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          editText =(EditText) findViewById(R.id.edittext);
          button =(Button) findViewById(R.id.buttonid);
          textView =(TextView) findViewById(R.id.textview);


          button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

               //Log.d("key","1st");
                String s =    editText.getText().toString();
                 // Log.d("key","2nd");


                  if(s.isEmpty())
                  {
                   erromesages();
                  }
                  else
                  {

                      int num= Integer.parseInt(s);
                      // Log.d("key","3rd");

                      if(num>5)
                      {
                          erromesages();
                      }
                      else
                      {
                          Random random =new Random();

                          int r= random.nextInt(5)+1;


                          if(num==r)
                          {
                              //editText.setText("You have Won");

                              textView.setText("You have Won and the random number was:"+r);
                          }
                          else
                          {
                              // editText.setText("You have Loss");
                              textView.setText("You have Loss and the random number was:"+r);
                          }
                      }



                  }






              }
          });






    }

    void erromesages() // this method will be show in edite text box that if you input invalid input
    {

        editText.setError("Enter a valid input");
        editText.requestFocus(); //editetext focus in cuourse
        return; //edittex return from this place


    }



}

