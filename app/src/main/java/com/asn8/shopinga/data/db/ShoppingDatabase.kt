package com.asn8.shopinga.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.asn8.shopinga.data.db.enities.ShoppingItem

@Database(
    entities = [ShoppingItem::class], version = 1
)
abstract class ShoppingDatabase:RoomDatabase() {
    abstract fun getShoppingDao(): ShoppingDao

    companion object{          //it is like a static(Java) but in kotlin
        @Volatile
        private var instance : ShoppingDatabase? = null
        private val LOCK = Any()
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: createDatabase(context).also { instance = it }            // It is a complex function do remember that
        }

        private fun createDatabase(context: Context)=
            Room.databaseBuilder(context.applicationContext, ShoppingDatabase ::class.java,"ShoppingDB.db").build()
    }
}