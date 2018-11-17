package com.example.dino.meadessentials;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class HexagonButton extends View {

    private Paint paintHexagon = new Paint();

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

    }

    @Override
    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawLine(0,0,getWidth(), getHeight(), this.paintHexagon);
    }

}
