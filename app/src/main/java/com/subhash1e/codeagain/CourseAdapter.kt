package com.subhash1e.codeagain

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.subhash1e.codeagain.MainActivity
import java.util.zip.Inflater

class CourseAdapter(private var list: MutableList<String>):RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {
    class CourseViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        return CourseViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_course,parent,false))
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = list[position]
        val context = holder.itemView.context
        holder.itemView.apply {
            findViewById<TextView>(R.id.tvCourse).text = course

        }
        holder.itemView.setOnClickListener {

        val intent = Intent(context,CourseActivity::class.java)
        intent.putExtra("course",course)
        startActivity(context,intent,null)

            }
        }

    override fun getItemCount(): Int {
        return list.size
    }

}