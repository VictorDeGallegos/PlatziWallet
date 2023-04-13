package com.cristianvillamil.platziwallet.ui.transfer.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TransferEntity::class], version = 1)
abstract class ApplicationDataBase : RoomDatabase() {
  abstract fun getDAO(): TransferDAO

  companion object {
    private var instance: ApplicationDataBase? = null

    fun getAppDatabase(context: Context): ApplicationDataBase? {
      if (instance == null) {
        instance = Room.databaseBuilder(
          context.applicationContext,
          ApplicationDataBase::class.java,
          "platzi_wallet_db"
        ).allowMainThreadQueries().build()
      }
      return instance!!
    }


    fun destroyInstance() {
      instance = null
    }
  }
}