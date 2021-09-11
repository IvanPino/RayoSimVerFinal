package com.example.rayosimverfinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
//7:31 Duda con User dentro del array
class MyAdapter(private val userList : ArrayList<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_item,
        parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = userList[position]

        holder.posicionamiento.text = currentitem.posicionamiento
        holder.kv.text = currentitem.kv
        holder.mas.text = currentitem.mas
    }

    override fun getItemCount(): Int {

        return userList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val posicionamiento : TextView =itemView.findViewById(R.id.posicionamiento)
        val kv : TextView =itemView.findViewById(R.id.kv)
        val mas : TextView =itemView.findViewById(R.id.mas)

    }


}