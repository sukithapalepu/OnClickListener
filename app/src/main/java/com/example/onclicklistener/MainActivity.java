package com.example.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button one, two, three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating views and now onClick
        one = (Button)findViewById(R.id.button1);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);

        //set the view with onClicklistener

        one.setOnClickListener(new click());
        two.setOnClickListener(new click());
        three.setOnClickListener(new click());
    }
    public class click implements View.OnClickListener
    {
//ctrl +o
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.button1:
                    Toast.makeText(getApplicationContext(), "Button one", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button2:
                    Toast.makeText(getApplicationContext(), "Button two", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button3:
                    Toast.makeText(getApplicationContext(), "Button three", Toast.LENGTH_LONG).show();
                    break;
                    default:
            }
        }
    }
}
