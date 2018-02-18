package com.damaris.mappingapp;

/**
 * Created by dlrla on 18/02/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class MapChooseActivity extends AppCompatActivity
{

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_choose);
        Button regular = (Button)findViewById(R.id.btnRegular);
        regular.setOnClickListener((View.OnClickListener) this);
        Button hikebikemap = (Button)findViewById(R.id.btnHikeBikeMap);
        hikebikemap.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v)
    {
        Intent intent = new Intent();
        Bundle bundle=new Bundle();
        boolean hikebikemap=false;
        if (v.getId()==R.id.btnHikeBikeMap)
        {
            hikebikemap=true;
        }
        bundle.putBoolean("com.example.hikebikemap",hikebikemap);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();
    }
}
