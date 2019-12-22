package com.example.cucisepatuonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PilihJenis extends AppCompatActivity implements View.OnClickListener{

    private TextView txtGetOngkir;

    private Button btnOk;

    public static int hrga_sandal = 15000;
    public static int hrga_sepatu = 20000;
    public static int hrga_boots = 25000;

    private EditText jumlah_sandal;
    private EditText jumlah_sepatu;
    private EditText jumlah_boots;

    public static int total_price_sandal;
    public static int total_price_sepatu;
    public static int total_price_boots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_jenis);

        PilihTempat get_pilihjenis = new PilihTempat();
        txtGetOngkir=(TextView)findViewById(R.id.get_ongkir);
        ((TextView)findViewById(R.id.get_ongkir)).setText("Rp. "+ get_pilihjenis.ongkir);
        ((TextView)findViewById(R.id.get_total)).setText("Rp. "+get_pilihjenis.ongkir);

        jumlah_sandal = (EditText)findViewById(R.id.jmlhsandal);
        jumlah_sandal.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                PilihTempat get_pilihjenis = new PilihTempat();

                if(s.length()==0){
                    TextView myOutputBox = (TextView) findViewById(R.id.jmlhsndl);
                    myOutputBox.setText("0");

                    total_price_sandal = 0;
                }else {
                    TextView myOutputBox = (TextView) findViewById(R.id.jmlhsndl);
                    myOutputBox.setText(s);

                    String value = jumlah_sandal.getText().toString();
                    int qtySandal = Integer.parseInt(value);
                    total_price_sandal = qtySandal * hrga_sandal;
                }
                ((TextView)findViewById(R.id.hrg_sndl)).setText("Rp. "+total_price_sandal);

                int topay = total_price_sandal+total_price_sepatu+total_price_boots+get_pilihjenis.ongkir;
                ((TextView)findViewById(R.id.get_total)).setText("Rp. "+topay);
            }
        });

        jumlah_sepatu = (EditText)findViewById(R.id.jmlhsepatu);
        jumlah_sepatu.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                PilihTempat get_pilihjenis = new PilihTempat();

                if(s.length()==0){
                    TextView myOutputBox = (TextView) findViewById(R.id.jmlhspt);
                    myOutputBox.setText("0");

                    total_price_sepatu = 0;
                }else {
                    TextView myOutputBox = (TextView) findViewById(R.id.jmlhspt);
                    myOutputBox.setText(s);

                    String value = jumlah_sepatu.getText().toString();
                    int qtySepatu = Integer.parseInt(value);
                    total_price_sepatu = qtySepatu * hrga_sepatu;
                }
                ((TextView)findViewById(R.id.hrg_spt)).setText("Rp. "+total_price_sepatu);

                int topay = total_price_sandal+total_price_sepatu+total_price_boots+get_pilihjenis.ongkir;
                ((TextView)findViewById(R.id.get_total)).setText("Rp. "+topay);
            }
        });

        jumlah_boots = (EditText)findViewById(R.id.jmlhboots);
        jumlah_boots.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                PilihTempat get_pilihjenis = new PilihTempat();
                if(s.length()==0){
                    TextView myOutputBox = (TextView) findViewById(R.id.jmlhbot);
                    myOutputBox.setText("0");

                    total_price_boots = 0;
                }else {
                    TextView myOutputBox = (TextView) findViewById(R.id.jmlhbot);
                    myOutputBox.setText(s);

                    String value = jumlah_boots.getText().toString();
                    int qtyBoot = Integer.parseInt(value);
                    total_price_boots = qtyBoot * hrga_boots;
                }
                ((TextView)findViewById(R.id.hrg_boot)).setText("Rp. "+total_price_boots);

                int topay = total_price_sandal+total_price_sepatu+total_price_boots+get_pilihjenis.ongkir;
                ((TextView)findViewById(R.id.get_total)).setText("Rp. "+topay);
            }
        });

        btnOk=(Button)findViewById(R.id.confirm2);
        btnOk.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.confirm2:
                Intent allset = new Intent(PilihJenis.this, confirmed.class);
                startActivity(allset);
                break;
        }
    }
}
