package com.example.wmtfriends


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NamesAdapter(private val namesList : ArrayList<Names>):RecyclerView.Adapter<NamesAdapter.NameViewHolder>() {

    class NameViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val friendImage : ImageView = itemView.findViewById(R.id.image_view)
        val friendName : TextView = itemView.findViewById(R.id.txt_view)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(
            R.layout.friends_layout,parent,false)
        return NameViewHolder(viewLayout)

    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        val currentName = namesList[position]
        holder.friendImage.setImageResource(currentName.nameImage)
        holder.friendName.text = currentName.name
    }

    override fun getItemCount(): Int {
        return namesList.size
    }
}



