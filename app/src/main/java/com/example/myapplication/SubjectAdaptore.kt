package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class SubjectAdaptore :RecyclerView.Adapter<SubjectAdaptore.SubjectHolder>() {
    val subjects = listOf<String>("Numbers", "Counts", "Shapes")
    val descriptions = listOf<String>("Let's learn the numbers", "How many is this?", "Do you know this shape?")
    class SubjectHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        val tv_numbers = itemView.findViewById<TextView>(R.id.tv_numbers)
        val tv_numbers2 = itemView.findViewById<TextView>(R.id.tv_numbers2)
    }

    //buat masukin item ke recycler view activity main 2
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SubjectAdaptore.SubjectHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return SubjectHolder(view)
    }

    override fun onBindViewHolder(holder: SubjectAdaptore.SubjectHolder, position: Int) {
        //memasukkan data ke dalam item
        holder.tv_numbers.text = subjects[position]
        holder.tv_numbers2.text = descriptions[position]
    }

    override fun getItemCount(): Int {
        return subjects.size
    }
}