package com.example.smartreport;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.qrcode:
                Intent intQrcode = new Intent(this, Qrcode.class);
                startActivity(intQrcode);
                break;
            case R.id.add:
                Intent intAdddata = new Intent(this, Adddata.class);
                startActivity(intAdddata);
                break;
            case R.id.follow:
                Intent intFollow = new Intent(this, Follow.class);
                startActivity(intFollow);
                break;
            case R.id.point:
               // android.support.v7.app.AlertDialog.Builder builder = new AlertDialog.Builder(this);
               // builder.setMessage("ให้กำลังใจกับทีมผู้พัฒนา");

                final Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.custom_messbox);
               // dialog.setTitle("ให้กำลังใจทีมพัฒนา");
                dialog.show();


               // AlertDialog alertDialog = builder.create();
               // alertDialog.show();
                break;
        }
    }
}
