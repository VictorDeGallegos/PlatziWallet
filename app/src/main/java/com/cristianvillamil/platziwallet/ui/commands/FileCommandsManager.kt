package com.cristianvillamil.platziwallet.ui.commands

class FileCommandsManager {
  private val commands = HashMap<String, FileCommand>()
  fun putCommand(commandName: String, fileCommand: FileCommand) {
    commands.put(commandName, fileCommand)

  }

  fun getCommand(commandName: String): FileCommand {
    if (!commands.containsKey(commandName))
      throw IllegalArgumentException("Command $commandName not found")
    else
      return commands[commandName]!!
  }
}