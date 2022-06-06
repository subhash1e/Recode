package com.subhash1e.codeagain.bottom_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ActivityChooserView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import com.subhash1e.codeagain.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BasicFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BasicFragment : Fragment(){
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_basic, container, false)
        val courseName :TextView= view.findViewById(R.id.tvCourseName)
        val eContent:TextView = view.findViewById(R.id.tvContent)
        val innerLayoutC:View = view.findViewById(R.id.cContent)
        val innerLayoutCpp:View = view.findViewById(R.id.cppContent)
        val innerLayoutKotlin:View = view.findViewById(R.id.kotlinContent)
        val innerLayoutJava:View = view.findViewById(R.id.javaContent)
        val innerLayoutPHP:View = view.findViewById(R.id.phpContent)
        val innerLayoutSQL:View = view.findViewById(R.id.sqlContent)
        val innerLayoutPython:View = view.findViewById(R.id.pythonContent)
        val innerLayoutJavascript:View = view.findViewById(R.id.javascriptContent)


        val course = arguments?.get("course").toString()

        when(course){
            "C"->{
              //  courseName.text = "Basic C"
               // eContent.text = getString(R.string.cDef)
                innerLayoutC.isVisible = true
            }
            "C++" ->{
              //  courseName.text = "Basic C++"
               // eContent.text = "C++ content uploading soon"
                innerLayoutCpp.isVisible = true
            }
            "Kotlin" ->{
              //  courseName.text = "Basic Kotlin"
               // eContent.text = "Kotlin content uploading soon"
                innerLayoutKotlin.isVisible = true
            }
            "Java" ->{
               // courseName.text = "Basic Java"
                //eContent.text = "Java content uploading soon"
                innerLayoutJava.isVisible = true
            }
            "SQL" ->{
                //courseName.text = "Basic SQL"
               // eContent.text = "SQL content uploading soon"
                innerLayoutSQL.isVisible = true
            }
            "PHP" ->{
               // courseName.text = "Basic PHP"
                //eContent.text = "PHP content uploading soon"
                innerLayoutPHP.isVisible = true
            }
            "Python" ->{
                //courseName.text = "Basic Python"
               // eContent.text = "Python content uploading soon"
                innerLayoutPython.isVisible = true
            }
            "JavaScript" ->{
                //courseName.text = "Basic Python"
               // eContent.text = "Python content uploading soon"
                innerLayoutJavascript.isVisible = true
            }
            else ->{
                courseName.text = "Error"
                eContent.text = "Something is wrong"
            }

        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BasicFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BasicFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}