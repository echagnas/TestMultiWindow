package com.echagnas.testmultiwindow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by emmanuel on 23/10/16.
 */

public class SecondActivity extends AppCompatActivity {

    //@BindView(R.id.titleview)
    TextView titleView;

    //@BindView(R.id.buttonview)
    Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ButterKnife.bind(this);

        titleView = (TextView)findViewById(R.id.titleview);
        buttonView = (Button)findViewById(R.id.buttonview);

        titleView.setText(R.string.title_second_activity);
        buttonView.setText(R.string.button_second_activity);

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "PAUSE SECOND", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "RESUME SECOND", Toast.LENGTH_SHORT).show();
    }

    /*@OnClick(R.id.buttonview)
    public void onClickButton(){
        finish();
    }*/
}
