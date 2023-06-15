package com.farid7.ygocards

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.farid7.ygocards.MainActivity.Companion.INTENT_PARCELABLE

// Fragment Despia
class CardFragmentDespia : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_card_despia, container, false)
        .apply {
        findViewById<RecyclerView>(R.id.recyclerView).apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = CardAdapter(listCardDespia) { card ->
                val intent = Intent(requireContext(), CardDetail::class.java)
                intent.putExtra(INTENT_PARCELABLE, card)
                startActivity(intent)
            }
        }
    }
}