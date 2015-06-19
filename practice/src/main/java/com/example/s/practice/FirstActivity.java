package com.example.s.practice;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class FirstActivity extends Activity {
    private Button deleteButton;
    private Button waitButton;
    private Button nextButton;
    private Button listButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        deleteButton = (Button) findViewById(R.id.delete);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.delete:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(FirstActivity.this);
                        dialog.setTitle("This is a dialog");
                        dialog.setMessage("Something importent!");
                        dialog.setCancelable(false);
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        dialog.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        waitButton = (Button) findViewById(R.id.wait);
        waitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.wait:
                        ProgressDialog progressdialog = new ProgressDialog(FirstActivity.this);
                        progressdialog.setTitle("This is ProgressDialog ");
                        progressdialog.setMessage("Loading...");
                        progressdialog.setCancelable(true);
                        progressdialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
        nextButton = (Button) findViewById(R.id.next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.next:
                        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                        startActivity(intent);
                }
            }
        });

        listButton = (Button) findViewById(R.id.list);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.list:
                        Intent intent = new Intent(FirstActivity.this, ListviewActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
    }




}
