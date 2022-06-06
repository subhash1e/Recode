package com.subhash1e.codeagain.bottom_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.isVisible
import com.subhash1e.codeagain.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SourceFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SourceFragment : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_source, container, false)
        val courseName : TextView = view.findViewById(R.id.tvCourseName)
        val eContent: TextView = view.findViewById(R.id.tvContent)
        val course = arguments?.get("course").toString()

        val innerLayoutC:View = view.findViewById(R.id.cSources)
        val innerLayoutCpp:View = view.findViewById(R.id.cppSources)
        val innerLayoutKotlin:View = view.findViewById(R.id.kotlinSources)
        val innerLayoutJava:View = view.findViewById(R.id.javaSources)
        val innerLayoutPHP:View = view.findViewById(R.id.phpSources)
        val innerLayoutSQL:View = view.findViewById(R.id.sqlSources)
        val innerLayoutPython:View = view.findViewById(R.id.pythonSources)
        val innerLayoutJavascript:View = view.findViewById(R.id.javascriptSources)



        when(course){
            "C"->{
                courseName.text = "C"
//                eContent.text = getString(R.string.cDef)
                innerLayoutC.isVisible = true
            }
            "C++" ->{
                courseName.text = "C++"
//                eContent.text = "C++ content uploading soon"
                innerLayoutCpp.isVisible = true
            }
            "Kotlin" ->{
                courseName.text = "Kotlin"
//                eContent.text = "Kotlin content uploading soon"
                innerLayoutKotlin.isVisible = true
            }
            "Java" ->{
                courseName.text = "Java"
//                eContent.text = "Java content uploading soon"
                innerLayoutJava.isVisible = true
            }
            "SQL" ->{
                courseName.text = "SQL"
//                eContent.text = "SQL content uploading soon"
                innerLayoutSQL.isVisible = true
            }
            "PHP" ->{
                courseName.text = "PHP"
//                eContent.text = "PHP content uploading soon"
                innerLayoutPHP.isVisible = true
            }
            "Python" ->{
                courseName.text = "Python"
//                eContent.text = "Python content uploading soon"
                innerLayoutPython.isVisible = true
            }
            "JavaScript" ->{
                courseName.text = "Javascript"
//                eContent.text = "Python content uploading soon"
                innerLayoutJavascript.isVisible = true
            }
            else ->{
                courseName.text = course
//                eContent.text = "PHP content uploading soon"
            }

        }
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SourceFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SourceFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}