package com.poulkas.android_tabhost_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    private MainTabHost tabHost;
    private LinearLayout buttonPanel;
    private ButtonAdd buttonAdd;
    private ButtonRemove buttonRemove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = new MainTabHost((TabHost)findViewById(R.id.MainTabHost));
        buttonPanel = (LinearLayout)findViewById(R.id.ButtonPanel);
        buttonAdd = new ButtonAdd(tabHost, this);
        buttonRemove = new ButtonRemove(tabHost, this);

        buttonPanel.addView(buttonAdd.getButton(),
                new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT, 1));
        buttonPanel.addView(buttonRemove.getButton(),
                new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT, 0.16f));
    }
}
