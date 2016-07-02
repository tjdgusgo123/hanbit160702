package com.hanbit.user.myapp130702;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class imageActivity extends Activity implements View.OnClickListener {

    ImageView ivimage;
    Button nextimage, previmage,btHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        nextimage = (Button) findViewById(R.id.nextimage);
        previmage = (Button) findViewById(R.id.previmage);
        btHome = (Button) findViewById(R.id.btHome);
        ivimage = (ImageView) findViewById(R.id.ivimage);

        nextimage.setOnClickListener(this);
        previmage.setOnClickListener(this);
        btHome.setOnClickListener(this);
        previmage.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.nextimage :
                ivimage.setImageResource(R.drawable.untitled);
                previmage.setVisibility(View.VISIBLE);
                nextimage.setVisibility(View.INVISIBLE);
                break;
            case R.id.previmage :
                ivimage.setImageResource(R.drawable.chrysanthemum);
                nextimage.setVisibility(View.VISIBLE);
                previmage.setVisibility(View.INVISIBLE);
                break;
            case R.id.btHome :
                this.startActivity(new Intent(this,MainActivity.class));
                break;

        }
    }
}
