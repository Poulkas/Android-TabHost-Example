/**
 * Created by Poulkas.
 **/

package com.poulkas.android_tabhost_example;

import android.view.View;

public interface TabsManager {
    void addTab(String tag, String indicator, View view);
    void removeTab();
    int getNumTabs();
}
