/**
 * Created by Poulkas.
 **/

package com.poulkas.android_tabhost_example;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ButtonAdd implements View.OnClickListener{
    private TabsManager tabsManager;
    private Button button;

    public ButtonAdd(TabsManager tabsManager, Context context){
        this.tabsManager = tabsManager;
        button = new Button(context);
        button.setOnClickListener(this);
        button.setText("Add New Tab");
    }

    @Override
    public void onClick(View view) {
        TextView text = new TextView(button.getContext());
        text.setText("Tab Number "+(tabsManager.getNumTabs()+1));
        tabsManager.addTab("Tab "+(tabsManager.getNumTabs()+1),
                           "Tab "+(tabsManager.getNumTabs()+1), text);
    }

    public View getButton(){
        return button;
    }
}
