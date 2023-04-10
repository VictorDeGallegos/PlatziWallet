package com.cristianvillamil.platziwallet.ui

class TransferFacade {
  val analyticsManager: AnalyticsManager = AnalyticsManager()
  val securityManager = SecurityManager()
  val transferManager: TransferManager = TransferManager()

  fun transfer() {
    val token = securityManager.getToken()
    analyticsManager.registerTranfer(securityManager.getToken())
    transferManager.transfer(token)
  }
}