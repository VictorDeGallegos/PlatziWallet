package com.cristianvillamil.platziwallet

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.cristianvillamil.platziwallet.ui.commands.FileCommandsManager
import com.cristianvillamil.platziwallet.ui.commands.SaveCommand

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val navView: BottomNavigationView = findViewById(R.id.nav_view)

    val navController = findNavController(R.id.nav_host_fragment)
    navView.setupWithNavController(navController)

    val commandsManager = FileCommandsManager()
//        comando de guardar
    commandsManager.putCommand("SaveCommand", SaveCommand())
//        comando de leer
    commandsManager.putCommand("ReadCommand", SaveCommand())
//        ejecutar comando de guardar
    commandsManager.getCommand("SaveCommand").execute(this, "PlatziWallet", "hola", "mundo")
//        ejecutar comando de leer
    commandsManager.getCommand("ReadCommand").execute(this, "platziwallet.txt")
  }
}
