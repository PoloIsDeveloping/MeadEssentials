package com.example.dino.meadessentials;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class HexagonButton extends View {

    private Paint paintHexagon = new Paint();
    private Path pathHexagon = new Path();

    public HexagonButton (Context context) {
        super(context);
        init(null, 0);
    }

    public HexagonButton (Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public HexagonButton (Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle)
    {
        this.paintHexagon.setColor(Color.RED);
        this.paintHexagon.setAntiAlias(true);
        this.paintHexagon.setStyle(Paint.Style.STROKE);

    }

    @Override
    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawPath(this.pathHexagon,this.paintHexagon);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent)
    {
        float touchX = motionEvent.getX();
        float touchY = motionEvent.getY();

        try {
            switch (motionEvent.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    this.pathHexagon.moveTo(touchX, touchY);
                    break;
                case MotionEvent.ACTION_UP:
                    break;
                case MotionEvent.ACTION_MOVE:
                    this.pathHexagon.lineTo(touchX, touchY);
                    break;
            }
        } catch (Exception e)
        {
            return false;
        }

        invalidate();
        return true;
    }
}
