package com.asn8.shopinga.data.repositories

import com.asn8.shopinga.data.db.ShoppingDatabase
import com.asn8.shopinga.data.db.enities.ShoppingItem

class ShoppingRepository(private val db: ShoppingDatabase) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)
    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)
    fun getAllShoppingItems() = db.getShoppingDao().getAllshoppingItems()
}