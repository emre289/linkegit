package com.emre.linkegit

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.data.*
import kotlinx.android.synthetic.main.activity_haftalik.*

class Haftalik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_haftalik)
        setPieChar()
    }
    fun setPieChar(){
        val xvalue = ArrayList<String>()

        xvalue.add("18-Pt")
        xvalue.add("19-Sa")
        xvalue.add("20-Ça")
        xvalue.add("21-Pe")
        xvalue.add("22-Cu")
        xvalue.add("23-Ct")
        xvalue.add("23-Pz")

        val barentries= ArrayList<BarEntry>()
        barentries.add(BarEntry(63f,0))
        barentries.add(BarEntry(32f,1))
        barentries.add(BarEntry(43f,2))
        barentries.add(BarEntry(62f,3))
        barentries.add(BarEntry(76f,4))
        barentries.add(BarEntry(98f,5))
        barentries.add(BarEntry(58f,6))


        val bardataset= BarDataSet(barentries,"OCAK")
        bardataset.color=resources.getColor(R.color.black)
        val data = BarData(xvalue,bardataset)
        barChart.data=data

        barChart.setBackgroundColor(resources.getColor(R.color.white))
        barChart.animateXY(3000,3000)
    }




}