/**
 * Created by Poulkas on 9/11/2017.
 */

package com.poulkas.android_tabhost_example;

import android.view.View;

public interface TabsManager {
    void addTab(String tag, String indicator, View view);
    void removeTab();
    int getNumTabs();
}
