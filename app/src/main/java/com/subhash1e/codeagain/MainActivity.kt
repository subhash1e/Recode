package com.subhash1e.codeagain

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock.sleep
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.navigation.NavigationView
import org.w3c.dom.Text
import java.net.URI
import java.time.Clock
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var rndNo =  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        Clock.systemUTC().millis().toInt()
    } else {
        Random(999).toString().toInt()
    }

    val quoteList = arrayListOf<String>("“First, solve the problem. Then, write the code.” – John Johnson",
        " “Experience is the name everyone gives to their mistakes.” – Oscar Wilde",
        "“ In order to be irreplaceable, one must always be different” – Coco Chanel",
        " “Java is to JavaScript what car is to Carpet.” – Chris Heilmann",
        " “Knowledge is power.” – Francis Bacon",
        " “Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.” – Dan Salomon",
        " “Perfection is achieved not when there is nothing more to add, but rather when there is nothing more to take away.” – Antoine de Saint-Exupery",
        "“Ruby is rubbish! PHP is phpantastic!” – Nikita Popov",
        " “ Code is like humor. When you have to explain it, it’s bad.” – Cory House",
        "“Fix the cause, not the symptom.” – Steve Maguire",
        "“Optimism is an occupational hazard of programming: feedback is the treatment. “ Kent Beck",
        "“When to use iterative development? You should use iterative development only on projects that you want to succeed.” – Martin Fowler",
        " “Simplicity is the soul of efficiency.” – Austin Freeman",
        "“Before software can be reusable it first has to be usable.” – Ralph Johnson",
        " “Make it work, make it right, make it fast.” – Kent Beck")


    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //-----------------------------------------------------------
        //this is our dashboard activity
        //random quote on banner
        //cards for languages

        //c
        //c++
        //python
        //java
        //kotlin
        //javascript
        //sql
        //php
        //----------------------------------------------------------

        val courses = arrayListOf<String>("C","C++","Python","Kotlin","Java","JavaScript","PHP","SQL")
        //-------------------------------------------------------------------------------------

        var index = rndNo
        if(index<0)index*=-1
        index %= quoteList.size
        val tvQuote = findViewById<TextView>(R.id.tvQuote)
        tvQuote.text = quoteList[index]
        //---------------------------------------------------------------------
        val rvCourse = findViewById<RecyclerView>(R.id.rvCourses)
        rvCourse.adapter = CourseAdapter(courses.toMutableList())
        rvCourse.layoutManager = StaggeredGridLayoutManager(2,1)
        //---------------------------------
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navView = findViewById<NavigationView>(R.id.sideNav)
        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)




    }
























    override fun onPause() {
        super.onPause()
        sleep(500)
        rndNo =  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Clock.systemUTC().millis().toInt()
        } else {
            Random(999).toString().toInt()
        }
        var index = rndNo
        if(index<0)index*=-1
        index %= quoteList.size
        val tvQuote = findViewById<TextView>(R.id.tvQuote)
        tvQuote.text = quoteList[index]

    }

}
