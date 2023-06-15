package com.farid7.ygocards

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.farid7.ygocards.MainActivity.Companion.INTENT_PARCELABLE

class CardDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_detail)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        val cardIntent = intent.getParcelableExtra<CardData>(INTENT_PARCELABLE)

        val cardImage: ImageView = findViewById(R.id.card_image)
        val cardName: TextView = findViewById(R.id.card_name)
        val cardType: TextView = findViewById(R.id.card_type_content)
        val cardSubType: TextView = findViewById(R.id.card_sub_type_content)
        val cardAtkDef: TextView = findViewById(R.id.card_atk_def_content)
        val cardDescription: TextView = findViewById(R.id.card_description_content)
        val btnCardMoreInfo: Button = findViewById(R.id.card_more_info)

        cardImage.setImageResource(cardIntent?.cardImage!!)
        cardName.text = cardIntent.cardName
        cardType.text = cardIntent.cardType
        cardSubType.text = cardIntent.cardSubType
        cardAtkDef.text = cardIntent.cardAtkDef
        cardDescription.text = cardIntent.cardDescription

        fun openCardUrl() {
            val queryUrl = Uri.parse("$SEARCH_PREFIX${cardName.text}")
            startActivity(Intent(Intent.ACTION_VIEW, queryUrl))
        }
        btnCardMoreInfo.setOnClickListener {
            openCardUrl()
        }
        cardImage.setOnClickListener {
            openCardUrl()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        const val SEARCH_PREFIX= "https://www.google.com/search?q=Yugioh+Card+"
    }
}