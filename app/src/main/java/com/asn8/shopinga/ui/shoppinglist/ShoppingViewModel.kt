package com.asn8.shopinga.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.asn8.shopinga.data.db.enities.ShoppingItem
import com.asn8.shopinga.data.repositories.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(private val repository : ShoppingRepository): ViewModel() {
    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch { repository.upsert(item) }
    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch { repository.delete(item) }
    fun getAllShoppingItems() = repository.getAllShoppingItems()
}