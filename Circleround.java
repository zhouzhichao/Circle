package com.example.zs.circle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by zs on 2016/12/8.
 */

public class Circleround extends View {
    private Paint paint;
    private int buttomColor;
    private float progress=80;
    private Canvas canvas;
    public Circleround(Context context) {
        super(context);
    }

    public Circleround(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Circleround(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        /*TypedArray mTypedArray = context.obtainStyledAttributes(attrs,
                R.styleable.RoundProgressBar);*/

        //paint = new Paint();
        //buttomColor=mTypedArray.getColor(R.styleable.RoundProgressBar_buttomColor, Color.parseColor("#80fffff0"));

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint=new Paint();
        paint.setColor(Color.parseColor("#00000000"));
        canvas.drawCircle(500, 200, 200, paint);

        //canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR);


        paint.setColor(Color.parseColor("#801E90FF"));
        RectF oval = new RectF(300, 0, 700, 400);
        canvas.drawArc(oval,(progress/100)*360-90,(100-progress)/100*360,true,paint);
        Log.e("==ss==","progress="+progress);
        Log.e("==ss==","(progress/100)*360-90="+((progress/100)*360-90)+"(100-progress)/100*360="+(100-progress)/100*360);
        Log.e("==ss==","progress/100="+progress/100);
        Log.e("==ss==","(progress/100)*360="+(progress/100)*360);
        Log.e("==ss==","(progress/100)*360-90="+((progress/100)*360-90));

        //canvas.drawArc(oval,198,72,true,paint);

    }
    public synchronized void setProgress(float progress){

        this.progress=progress;
        postInvalidate();
    }

}
