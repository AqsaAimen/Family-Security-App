package com.example.familysecurityapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

 class MemberAdapter(private val  listMember: List<MemberModel>) : RecyclerView.Adapter<MemberAdapter.ViewHolder>(){
     class ViewHolder(private val item:View) : RecyclerView.ViewHolder(item) {
         val image=item.findViewById<ImageView>(R.id.image)
         val name=item.findViewById<TextView>(R.id.text)
         val address=item.findViewById<TextView>(R.id.text2)
         val battery=item.findViewById<TextView>(R.id.battery)
         val distance=item.findViewById<TextView>(R.id.distance)

     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val inflater=LayoutInflater.from(parent.context)
         val item=inflater.inflate(R.layout.item_member,parent,false)
         return ViewHolder(item)
     }

     override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=listMember[position]
         holder.name.text=item.name
         holder.address.text=item.address
         holder.battery.text= item.battery.toString()
         holder.distance.text=item.distance.toString()
     }

     override fun getItemCount(): Int {
         return listMember.size
     }

 }