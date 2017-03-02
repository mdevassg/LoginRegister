package com.example.malakagunawardena.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        final TextView amount1 = (TextView) findViewById(R.id.amount1);
        final TextView amount2 = (TextView) findViewById(R.id.amount2);
        final TextView category1 = (TextView) findViewById(R.id.category1);
        final TextView category2 = (TextView) findViewById(R.id.category2);
        final Button bLogin = (Button) findViewById(R.id.recalculate);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recalculateIntent = new Intent(CategoryActivity.this, RecalculateActivity.class);
                CategoryActivity.this.startActivity(recalculateIntent);

            }});

    }
}
