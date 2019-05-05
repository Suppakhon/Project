package com.example.smartreport;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
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
            case R.id.exit:
                AlertDialog.Builder builder = new AlertDialog.Builder(Menu.this);
                builder.setTitle(R.string.app_name);
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setMessage("Do you want to exit?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                moveTaskToBack(true);
                                android.os.Process.killProcess(android.os.Process.myPid());
                                System.exit(0);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
                break;
        }
    }
}
