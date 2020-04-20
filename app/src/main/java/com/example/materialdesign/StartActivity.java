package com.example.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StartActivity  extends AppCompatActivity {

    private int pageNum = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public synchronized void onClick(View view){
        /*if(view.getId() == R.id.start_button_first){
            if(pageNum == 0){
                transformPageNext();
                pageNum = 1;
            }else{
                Intent intent = new Intent(this, TabbedActivity.class);
                startActivity(intent);
                finish();
            }
        }else{
            transformPagePrevious();
            pageNum = 0;
        }*/
        Intent intent = new Intent(this, TabbedActivity.class);
        startActivity(intent);
        finish();
    }

    public void transformPageNext(){

    }
    public void transformPagePrevious(){

    }
}
