package com.cristianvillamil.platziwallet.ui

class TransferProxy {
  val MAX_TRANSFER_AMOUNT = 1000000
  val MIN_TRANSFER_AMOUNT = 100

  fun checkTransfer(amount: Double): String {
    return when {
      amount > MAX_TRANSFER_AMOUNT -> {
        "El monto máximo es $MAX_TRANSFER_AMOUNT"
      }
      amount < MIN_TRANSFER_AMOUNT -> {
        "El monto mínimo es $MIN_TRANSFER_AMOUNT"
      }
      else -> {
        doTransfer(amount)
        "Transferencia exitosa"
      }
    }
  }

  private fun doTransfer(amount: Double) {
  }
}