package com.farid7.ygocards

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(private val data: List<CardData>, private val listener: (CardData) -> Unit) :
    RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    class CardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val cardImage = view.findViewById<ImageView>(R.id.card_image)
        private val cardName = view.findViewById<TextView>(R.id.card_name)
        private val cardDescription = view.findViewById<TextView>(R.id.card_description)

        fun bindView(data: CardData, listener: (CardData) -> Unit) {
            cardImage.setImageResource(data.cardImage)
            cardName.text = data.cardName
            cardDescription.text = data.cardDescription
            itemView.setOnClickListener {
                listener(data)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            CardViewHolder = CardViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.card_list, parent, false))

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindView(data[position], listener) }

    override fun getItemCount(): Int = data.size
}