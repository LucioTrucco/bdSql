package com.example.linearlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText et1,et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.etCorreo);
        et2 = (EditText)findViewById(R.id.etPassword);
    }


    public void irRegistro(View view){
        Intent reg = new Intent(this,activityRegistro.class);
        startActivity(reg);
    }

}
