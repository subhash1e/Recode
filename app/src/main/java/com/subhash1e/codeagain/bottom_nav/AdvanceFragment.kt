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
 * Use the [AdvanceFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AdvanceFragment : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_advance, container, false)
        val aCourseName : TextView = view.findViewById(R.id.tvCourseNameAdv)
        val aContent: TextView = view.findViewById(R.id.tvContentAdv)
        val course = arguments?.get("course").toString()

        val innerLayoutAdvC:View = view.findViewById(R.id.cContentAdv)
        val innerLayoutAdvCpp:View = view.findViewById(R.id.cppContentAdv)
        val innerLayoutAdvKotlin:View = view.findViewById(R.id.kotlinContentAdv)
        val innerLayoutAdvJava:View = view.findViewById(R.id.javaContentAdv)
        val innerLayoutAdvPHP:View = view.findViewById(R.id.phpContentAdv)
        val innerLayoutAdvSQL:View = view.findViewById(R.id.sqlContentAdv)
        val innerLayoutAdvPython:View = view.findViewById(R.id.pythonContentAdv)
        val innerLayoutAdvJavascript:View = view.findViewById(R.id.javascriptContentAdv)

        when(course){
            "C"->{
              //  aCourseName.text = "Advance C"
             //   aContent.text = getString(R.string.cDef)
                innerLayoutAdvC.isVisible = true
            }
            "C++" ->{
                //aCourseName.text = "Advance C++"
                //aContent.text = "C++ content uploading soon"
                innerLayoutAdvCpp.isVisible = true
            }
            "Kotlin" ->{
                //aCourseName.text = "Advance Kotlin"
                //aContent.text = "Kotlin content uploading soon"
                innerLayoutAdvKotlin.isVisible = true
            }
            "Java" ->{
//                aCourseName.text = "Advance Java"
//                aContent.text = "Java content uploading soon"
                innerLayoutAdvJava.isVisible = true
            }
            "SQL" ->{
//                aCourseName.text = "Advance SQL"
//                aContent.text = "SQL content uploading soon"
                innerLayoutAdvSQL.isVisible = true
            }
            "PHP" ->{
//                aCourseName.text = "Advance PHP"
//                aContent.text = "PHP content uploading soon"
                innerLayoutAdvPHP.isVisible = true
            }
            "Python" ->{
//                aCourseName.text = "Advance Python"
//                aContent.text = "Python content uploading soon"
                innerLayoutAdvPython.isVisible = true
            }
            "JavaScript"->{
//                aCourseName.text = "Advance Javascript"
//                aContent.text = "Javascript content uploading soon"
                innerLayoutAdvJavascript.isVisible = true
            }
            else ->{
                aCourseName.text = "Error"
                aContent.text = "Something Wrong"
//                innerLayoutAdvC.isVisible = true
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
         * @return A new instance of fragment AdvanceFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AdvanceFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}