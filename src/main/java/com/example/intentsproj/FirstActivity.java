package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button btn;
    EditText e1,e2;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.customtost, (ViewGroup)
                findViewById(R.id.custom_toast_layout));


        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("Value1",s1);
                intent.putExtra("Value2",s2);

                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();
            }
        });


    }
}
