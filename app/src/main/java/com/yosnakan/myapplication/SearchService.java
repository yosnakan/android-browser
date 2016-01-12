package com.yosnakan.myapplication;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by yosnakan on 2016/01/04.
 */
public class SearchService extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private WindowManager mWindowManager;
    @Override
    public void onCreate(){
        super.onCreate();

        mWindowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        WindowManager.LayoutParams mparams = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_SYSTEM_ALERT,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT);
        LinearLayout searchLayout = new LinearLayout(this);

        TextView textView = new TextView(this);
        textView.setText("Hello World!!");
        searchLayout.addView(textView);

        Button button1 = new Button(this);
        button1.setText("検索");
        searchLayout.addView(button1);

        mWindowManager.addView(searchLayout, mparams);
    }
}
