package com.example.cucisepatuonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PilihTempat extends AppCompatActivity implements View.OnClickListener {

    private Button btnToko5;
    private Button btnToko6;
    private Button btnToko7;
    private Button btnToko8;
    private Button btnToko9;
    private Button btnToko10;
    private Button btnToko11;
    private Button btnToko12;
    private Button btnToko13;
    private Button btnToko14;

    private Button btnconfirm;
    private TextView txtharga_view;

    public static int ongkir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihtempat);

        btnToko5=(Button)findViewById(R.id.button5);
        btnToko5.setOnClickListener(this);


        btnToko6=(Button)findViewById(R.id.button6);
        btnToko6.setOnClickListener(this);

        btnToko7=(Button)findViewById(R.id.button7);
        btnToko7.setOnClickListener(this);

        btnToko8=(Button)findViewById(R.id.button8);
        btnToko8.setOnClickListener(this);

        btnToko9=(Button)findViewById(R.id.button9);
        btnToko9.setOnClickListener(this);

        btnToko10=(Button)findViewById(R.id.button10);
        btnToko10.setOnClickListener(this);

        btnToko11=(Button)findViewById(R.id.button11);
        btnToko11.setOnClickListener(this);

        btnToko12=(Button)findViewById(R.id.button12);
        btnToko12.setOnClickListener(this);

        btnToko13=(Button)findViewById(R.id.button13);
        btnToko13.setOnClickListener(this);

        btnToko14=(Button)findViewById(R.id.button14);
        btnToko14.setOnClickListener(this);

        txtharga_view=(TextView)findViewById(R.id.harga_view);

        btnconfirm=(Button)findViewById(R.id.confirm);
        btnconfirm.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button5:
                ongkir=25000;
                ((TextView)findViewById(R.id.harga_view)).setText("Rp. "+ongkir);
                break;

            case R.id.button6:
                ongkir=75000;
                ((TextView)findViewById(R.id.harga_view)).setText("Rp. "+ongkir);
                break;

            case R.id.button7:
                ongkir=35000;
                ((TextView)findViewById(R.id.harga_view)).setText("Rp. "+ongkir);
                break;

            case R.id.button8:
                ongkir=56000;
                ((TextView)findViewById(R.id.harga_view)).setText("Rp. "+ongkir);
                break;

            case R.id.button9:
                ongkir=15000;
                ((TextView)findViewById(R.id.harga_view)).setText("Rp. "+ongkir);
                break;

            case R.id.button10:
                ongkir=40000;
                ((TextView)findViewById(R.id.harga_view)).setText("Rp. "+ongkir);
                break;

            case R.id.button11:
                ongkir=47000;
                ((TextView)findViewById(R.id.harga_view)).setText("Rp. "+ongkir);
                break;

            case R.id.button12:
                ongkir=42000;
                ((TextView)findViewById(R.id.harga_view)).setText("Rp. "+ongkir);
                break;

            case R.id.button13:
                ongkir=36000;
                ((TextView)findViewById(R.id.harga_view)).setText("Rp. "+ongkir);
                break;

            case R.id.button14:
                ongkir=30000;
                ((TextView)findViewById(R.id.harga_view)).setText("Rp. "+ongkir);
                break;

            case R.id.confirm:
                Intent pilihjenissepatu = new Intent(PilihTempat.this, PilihJenis.class);
                startActivity(pilihjenissepatu);
                break;
        }
    }
}
