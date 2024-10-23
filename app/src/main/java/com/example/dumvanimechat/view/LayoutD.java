package com.example.dumvanimechat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class LayoutD extends ImageView {
    public LayoutD(Context context) {
        super(context);
    }

    public LayoutD(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LayoutD(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public LayoutD(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int a = widthMeasureSpec;
        int b = (int) (a*1.5f);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(a,b);
    }
}
