package com.example.topza.mvcstructure.util;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by nuuneoi on 11/16/2014.
 */
public class ScreenUtils {

    private static ScreenUtils instance;
    private Point size;

    public static ScreenUtils getInstance() {
        if (instance == null)
            instance = new ScreenUtils();
        return instance;
    }

    private Context mContext;

    private ScreenUtils() {
        mContext = Contextor.getInstance().getContext();
        getScreenSize();
    }

    private void getScreenSize() {
        WindowManager wm = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        size = new Point();
        display.getSize(size);
    }

    public int getScreenWidth(){
        return size.x;
    }

    public int getScreenHeight() {
        return size.y;
    }
}
