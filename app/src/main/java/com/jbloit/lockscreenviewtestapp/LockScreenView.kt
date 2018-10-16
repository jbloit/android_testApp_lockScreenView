package com.jbloit.lockscreenviewtestapp

import android.content.Context
import android.graphics.*
import android.os.Handler
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.ViewConfiguration
import kotlin.math.sqrt

class LockScreenView : View{
    //DEBUG
    var performRedraw = true

    //region PROPERTIES

    private val TAG = "LOCKSCREEN_VIEW"
    private val paint = Paint()
    private var size = 0

    //region LIFECYCLE
    constructor(context: Context) : super(context) {
        init(null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init(attrs, defStyle)
    }

    private fun init(attrs: AttributeSet?, defStyle: Int) {

        paint.isAntiAlias = true


        // Update TextPaint and text measurements from attributes
    }
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        size = measuredHeight

    }

    //endregion

    //region EVENTS
    override fun onDraw(canvas: Canvas) {

        //debug
//        drawCount -= 1
        super.onDraw(canvas)

        paint.style = Paint.Style.FILL
        canvas.drawCircle(width/2f, height/2f, 100f, paint)
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {

        val x = event?.x
        val y = event?.y

        when (event?.action){
            MotionEvent.ACTION_DOWN -> {
//                Log.d(TAG, "ACTION DOWN")
                if (x!= null && y!=null) {

                }
            }

            MotionEvent.ACTION_UP -> {

            }

            MotionEvent.ACTION_MOVE -> {

            }
        }

        return true
    }
}


