package com.emre.linkegit

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import kotlinx.android.synthetic.main.activity_aylik.*

class Aylik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aylik)
        setPieChart()

    }
    fun setPieChart()
    {

        // xvalues

        val xvalues = ArrayList<String >()
        xvalues.add("OCAK")
        xvalues.add("ŞUBAT")
        xvalues.add("MART")
        xvalues.add("NİSAN")
        xvalues.add("MAYIS")
        xvalues.add("HAZİRAN")
        xvalues.add("TEMMUZ")
        xvalues.add("AĞUSTOS")
        xvalues.add("EYLÜL")
        xvalues.add("EKİM")
        xvalues.add("KASIM")
        xvalues.add("ARALIK")


        // yvalues
        val yvalues =ArrayList<Float>()
        yvalues.add(22.5f)
        yvalues.add(38.4f)
        yvalues.add(8.25f)
        yvalues.add(10.21f)
        yvalues.add(6.74f)
        yvalues.add(22.5f)
        yvalues.add(38.4f)
        yvalues.add(8.25f)
        yvalues.add(10.21f)
        yvalues.add(6.74f)
        yvalues.add(6.74f)


        val piechartentry =ArrayList<Entry>()
        for ((i,item) in yvalues.withIndex())
        {
            piechartentry.add(Entry(item,i))


        }


        //colar

        val colors=ArrayList<Int>()
        colors.add(Color.RED)
        colors.add(Color.GREEN)
        colors.add(Color.BLUE)
        colors.add(Color.MAGENTA)
        colors.add(Color.YELLOW)
        colors.add(Color.GRAY)
        colors.add(Color.DKGRAY)
        colors.add(Color.BLACK)
        colors.add(Color.WHITE)
        colors.add(Color.CYAN)
        colors.add(Color.TRANSPARENT)



        // fill the chart
        val piedataset = PieDataSet(piechartentry," GRAFİK")

        piedataset.colors=colors
        piedataset.sliceSpace=3f
        val data = PieData( xvalues,piedataset)
        piechart.data = data
        piechart.holeRadius = 5f

        piechart.setBackgroundColor(resources.getColor(R.color.purple_200))

        piechart.setDescription("AKILLI SERA SİSTEMİ")
        piechart.animateY(3000)

        val legend: Legend =piechart.legend
        legend.position= Legend.LegendPosition.LEFT_OF_CHART
        legend.textColor=resources.getColor(R.color.white)


    }
}