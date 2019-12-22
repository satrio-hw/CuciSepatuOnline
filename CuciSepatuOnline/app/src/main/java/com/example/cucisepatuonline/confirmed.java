package com.example.cucisepatuonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class confirmed extends AppCompatActivity implements View.OnClickListener {

    private Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmed);

        btnConfirm=(Button)findViewById(R.id.button);
        btnConfirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent pilihjenissepatu = new Intent(confirmed.this, PilihTempat.class);
                startActivity(pilihjenissepatu);
                break;
        }
    }
}
