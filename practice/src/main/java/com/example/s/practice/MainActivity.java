package com.example.s.practice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;


public class MainActivity extends Activity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "button is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.edit_text);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button2:

                        String inputText = editText.getText().toString();
                        Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;
                }
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        imageView = (ImageView) findViewById(R.id.image_view);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button3:
                        imageView.setImageResource(R.drawable.a8);
                        break;
                    default:
                        break;
                }
            }
        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button4:
                      /*if (progressBar.getVisibility() == View.GONE) {
                            progressBar.setVisibility(View.VISIBLE);
                        } else {
                            progressBar.setVisibility(View.GONE);
                        }*/
                        int progress = progressBar.getProgress();
                        progress = progress + 10;
                        progressBar.setProgress(progress);
                        break;
                    default:
                        break;
                }

            }

        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });


    }



}
