package com.example.abudarda.stonepaperscissor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resul_t extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    String w="You Win";
    String L="You Loose";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resul_t);
        tv3=(TextView)findViewById(R.id.winn);
    }

}
