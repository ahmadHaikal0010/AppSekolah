package com.haikal.appsekolah.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.haikal.appsekolah.R
import com.haikal.appsekolah.model.ModelSekolah

class AdapterSekolah(
    val listItem : List<ModelSekolah>
): RecyclerView.Adapter<AdapterSekolah.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val namaSekolah : TextView = itemView.findViewById(R.id.namaSekolah)
        val gambarSekolah : ImageView = itemView.findViewById(R.id.gambarSekolah)
        val nomorTelepon : TextView = itemView.findViewById(R.id.nomorTelepon)
        val cardSekolah : CardView = itemView.findViewById(R.id.cardSekolah)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_sekolah, parent, false)

        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = listItem[position]

        holder.namaSekolah.text = currentItem.namaSekolah
        holder.gambarSekolah.setImageResource(currentItem.gambarSekolah)
        holder.nomorTelepon.text = currentItem.nomorTelepon
        holder.cardSekolah.setOnClickListener() {

        }
    }

}