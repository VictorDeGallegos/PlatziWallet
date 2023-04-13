package com.cristianvillamil.platziwallet.ui.transfer.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TransferDAO {
  @Query("SELECT * FROM transfer")
  fun getAll(): List<TransferEntity>

  @Query("SELECT * FROM transfer WHERE user_name LIKE :userName")
  fun findTransferByUserName(userName: String): List<TransferEntity>

  @Insert
  fun saveTransfer(transfer: TransferEntity)

  @Delete
  fun deleteTransfer(transfer: TransferEntity)
}