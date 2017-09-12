/**
 * Created by Poulkas on 9/11/2017.
 */

package com.poulkas.android_tabhost_example;

import android.content.Context;
import android.view.View;
import android.widget.Button;

public class ButtonRemove implements View.OnClickListener{
    private TabsManager tabsManager;
    private Button button;

    public ButtonRemove(TabsManager tabsManager, Context context){
        this.tabsManager = tabsManager;
        button = new Button(context);
        button.setOnClickListener(this);
        button.setText("Remove Current Tab");
        button.setTextAlignment(View.TEXT_ALIGNMENT_GRAVITY);
    }

    @Override
    public void onClick(View view) {
        tabsManager.removeTab();
    }

    public View getButton(){
        return button;
    }
}
