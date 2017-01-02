package com.example.kamelot.comiccollection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Explorar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explorar);

        ApiCalls call = new ApiCalls();
                call.execute();

    }
}
