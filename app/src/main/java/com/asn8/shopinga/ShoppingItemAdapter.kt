package com.asn8.shopinga

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asn8.shopinga.data.db.enities.ShoppingItem
import com.asn8.shopinga.ui.shoppinglist.ShoppingViewModel
import com.asn8.shopinga.R

class ShoppingItemAdapter(var item : List<ShoppingItem>,private val viewModel: ShoppingViewModel)
    :RecyclerView.Adapter<ShoppingItemAdapter.ShoppingViewHolder>() {
    inner class ShoppingViewHolder(item :View):RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shopping_item,parent,false)
        return ShoppingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) {
       val curShoppingItem = item[position]
        

    }
}