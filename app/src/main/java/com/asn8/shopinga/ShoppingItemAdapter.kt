package com.asn8.shopinga

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asn8.shopinga.data.db.enities.ShoppingItem
import com.asn8.shopinga.ui.shoppinglist.ShoppingViewModel

class ShoppingItemAdapter(var item : List<ShoppingItem>,private val viewModel: ShoppingViewModel)
    :RecyclerView.Adapter<ShoppingItemAdapter.ShoppingViewHolder>() {
    inner class ShoppingViewHolder(item :View):RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}