package com.example.mycanvastranslatetest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.GRAY);

        Paint mPaint = new Paint();
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(0, 0, 300, 300, mPaint);

        // 第一次平移
        canvas.translate(200, 200);

        mPaint.setColor(Color.BLUE);
        canvas.drawRect(0, 0, 300, 300, mPaint);

        // 第二次平移
        canvas.translate(200, 200);

        mPaint.setColor(Color.RED);
        canvas.drawRect(0, 0, 300, 300, mPaint);

    }
}
