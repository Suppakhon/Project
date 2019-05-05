package com.example.smartreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Qrcode extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back1:
                Intent intMenu = new Intent(this, Menu.class);
                startActivity(intMenu);
                break;
        }
    }
}
