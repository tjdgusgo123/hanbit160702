package com.hanbit.user.myapp130702;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    Button btCalc,btCalender,btimageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //생성
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalc= (Button) findViewById(R.id.btCalc);
        btCalender= (Button) findViewById(R.id.btCalender);
        btimageview= (Button) findViewById(R.id.btimageview);
        btCalc.setOnClickListener(this);
        btCalender.setOnClickListener(this);
        btimageview.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) //동작
    {
        switch (v.getId()) //화면이동
        {
            case R.id.btCalc : //v= btCalc 인경우
                this.startActivity(new Intent(this,CalcActivity.class)); //시작
                break;

            case R.id.btCalender :
                this.startActivity(new Intent(this,calenderactvty.class));
                break;

            case R.id.btimageview :
                this.startActivity(new Intent(this,imageActivity.class));
                break;
        }

    }
}
