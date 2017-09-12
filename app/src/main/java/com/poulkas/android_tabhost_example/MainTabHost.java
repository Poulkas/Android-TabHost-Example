/**
 * Created by Poulkas.
 **/

package com.poulkas.android_tabhost_example;

import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

public class MainTabHost implements TabsManager{
    private TabHost tabHost;
    private int counterTabs;
    private ArrayList<TabHost.TabSpec> listTabs;

    public MainTabHost(TabHost tabHost){
        this.tabHost = tabHost;
        this.tabHost.setup();
        listTabs = new ArrayList<>();
        counterTabs = 0;
    }

    public void addTab(String tag, String indicator, final View view){
        TabHost.TabSpec newSpec = tabHost.newTabSpec(tag).
                setIndicator(indicator).
                setContent(new TabHost.TabContentFactory() {
                    @Override
                    public View createTabContent(String tag) {
                        return view;
                    }
                });
        listTabs.add(newSpec);
        tabHost.addTab(newSpec);
        counterTabs++;
    }

    public void removeTab(){
        int tabToDelete = tabHost.getCurrentTab();
        tabHost.setCurrentTab(0);
        tabHost.clearAllTabs();
        listTabs.remove(tabToDelete);
        for(TabHost.TabSpec spec : listTabs)
            tabHost.addTab(spec);
    }

    public int getNumTabs(){
        return counterTabs;
    }
}
