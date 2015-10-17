package com.bootcamp.saba.nosmoking;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.button5)
        {
            finish();
            overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_right);

            //EditText et = (EditText)findViewById(R.id.editText);
            //String value  = et.getText().toString();
            // Insert data to return to MainActivity
            //Intent result = new Intent();
            //result.putExtra("value", value);
            //setResult(RESULT_OK, result);
            //finish();
        }
    }

}
