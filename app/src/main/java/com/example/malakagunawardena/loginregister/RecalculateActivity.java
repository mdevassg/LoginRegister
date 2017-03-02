package com.example.malakagunawardena.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class RecalculateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recalculate);

        Spinner mySpinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);
        final TextView amount1 = (TextView) findViewById(R.id.amount1);
        final TextView amount2 = (TextView) findViewById(R.id.amount2);
        final EditText diff1   = (EditText) findViewById(R.id.diff1);
        final EditText diff2   = (EditText) findViewById(R.id.diff2);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(RecalculateActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner1.setAdapter(myAdapter);
        mySpinner2.setAdapter(myAdapter);




    }

}
