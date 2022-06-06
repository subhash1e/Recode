package com.subhash1e.codeagain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.subhash1e.codeagain.bottom_nav.AdvanceFragment
import com.subhash1e.codeagain.bottom_nav.BasicFragment
import com.subhash1e.codeagain.bottom_nav.SourceFragment

class CourseActivity : AppCompatActivity() {
    private val advFrag = AdvanceFragment()
    private val srcFrag = SourceFragment()
    private val basicFrag = BasicFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)
        val course = intent.extras?.get("course") as String?
        val navBottom = findViewById<BottomNavigationView>(R.id.bottomNavigation)


        replaceFragment(basicFrag, course )
        navBottom.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.itBasic -> replaceFragment(basicFrag, course)
                R.id.itAdvance -> replaceFragment(advFrag, course)
                R.id.itSources -> replaceFragment(srcFrag, course)
            }
            true
        }

    }


    private fun replaceFragment(frag: Fragment,course:String?){
        val trans = supportFragmentManager.beginTransaction()
        val bundle = Bundle()
        bundle.putString("course",course)
        frag.arguments  = bundle
        trans.replace(R.id.flFragmentContainer,frag)
        trans.commit()
    }
}