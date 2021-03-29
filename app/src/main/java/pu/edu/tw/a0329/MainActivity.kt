package pu.edu.tw.a0329

import android.content.Context
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.view.MotionEvent
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity(),View.OnTouchListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img.setOnTouchListener(this)
    }

    override fun onTouch( v: View?,event: MotionEvent?): Boolean {
        if (event?.action == MotionEvent.ACTION_DOWN) {
            img.setImageResource(R.drawable.dogdog)}
        if (event?.action == MotionEvent.ACTION_UP) {
            img.setImageResource(R.drawable.dog) }
        else if (event?.action == MotionEvent.ACTION_MOVE) {
            img.setImageResource(R.drawable.dogdogdog)}
        return true
    }
}

