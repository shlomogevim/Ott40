package com.example.ott40

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.fixedRateTimer

class MainActivity : AppCompatActivity() {

    private lateinit var avd: AnimatedVectorDrawable
    private lateinit var avd1: AnimatedVectorDrawable
    private lateinit var avd2: AnimatedVectorDrawable
    private lateinit var avd3: AnimatedVectorDrawable
    private lateinit var avd4: AnimatedVectorDrawable
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prepareImageview(0)



    }

    fun click_AllLetter(view: View) {
        prepare_avd()
        prepareImageview(1)

        fixedRateTimer("timer", false, 0, 2000) {
            counter++
            operate_Animation(counter)
              Log.d("clima","counter=$counter")
            if (counter >= 5) cancel()
        }


    }
private fun prepareImageview(ind:Int){
    if (ind==0){
        imageView1.visibility=View.INVISIBLE
        imageView2.visibility=View.INVISIBLE
        imageView3.visibility=View.INVISIBLE
        imageView4.visibility=View.INVISIBLE
    }else{
        imageView1.visibility=View.VISIBLE
       imageView2.visibility=View.VISIBLE
        imageView3.visibility=View.VISIBLE
        imageView4.visibility=View.VISIBLE
    }
}

    private fun prepare_avd() {

        imageView1.setImageResource(R.drawable.alleff)
        avd1 = imageView1.drawable as AnimatedVectorDrawable
        imageView2.setImageResource(R.drawable.bet)
        avd2 = imageView2.drawable as AnimatedVectorDrawable
        imageView3.setImageResource(R.drawable.gimel)
        avd3 = imageView3.drawable as AnimatedVectorDrawable
        imageView4.setImageResource(R.drawable.dalet)
        avd4 = imageView4.drawable as AnimatedVectorDrawable
    }


    private fun operate_Animation(counter: Int) {
        Log.d("clima", "counter=$counter")
       // avd = AnimatedVectorDrawable()
        when (counter) {
            1 -> avd1.start()

            2 -> avd2.start()


            3 -> avd3.start()

            4 -> avd4.start()



        }


    }

    fun click_Alef(view: View) {

        //  imageView1.visibility=View.VISIBLE


        imageView1.setImageResource(R.drawable.alleff)
        avd = imageView1.drawable as AnimatedVectorDrawable
        avd.start()
    }

    fun click_Bet(view: View) {
        imageView2.setImageResource(R.drawable.bet)
        avd = imageView2.drawable as AnimatedVectorDrawable
        avd.start()
    }

    fun click_Gimel(view: View) {
        imageView3.setImageResource(R.drawable.gimel)
        avd = imageView3.drawable as AnimatedVectorDrawable
        avd.start()

    }

    fun click_Dalet(view: View) {
        imageView4.setImageResource(R.drawable.dalet)
        avd = imageView4.drawable as AnimatedVectorDrawable
        avd.start()
    }



}

