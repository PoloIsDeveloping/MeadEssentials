package com.example.dino.meadessentials;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class HexagonButton extends View {

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
        //TODO
    }

}
