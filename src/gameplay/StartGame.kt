package gameplay

import enemies.HighWarlordNajentus
import enemies.IllidanStormrage
import enemies.MotherShahraz
import playableClasses.Warrior
import playableClasses.BaseClass
import playableClasses.Mage
import playableClasses.Rogue

fun main() {
    lateinit var player: BaseClass
    var choice = 0
    print("Enter number to chose a class:\n" +
            "1. Warrior\n" +
            "2. Rogue\n" +
            "3. Mage\n"
    )
    while (choice > 3 || choice < 1){
        choice = readLine()!!.toInt()
        when(choice){
            1 -> player = Warrior()
            2 -> player = Rogue()
            3 -> player = Mage()
            else -> println("Wrong input")
        }
    }

    println("\nWild boss appears\nHigh Warlord Naj'entus")
    while (HighWarlordNajentus.health > 0){
        choice = 0
        if (player.health <= 0){
            println("You died")
            break
        }
        println("Current health: ${player.health}")
        println("Current energy: ${player.energyResource}")
        println("Enemy health: ${HighWarlordNajentus.health}")
        println("\nEnter number to chose your action:\n1. Use base attack\n2. Cast spell")

        while (choice > 2 || choice < 1){
            choice = readLine()!!.toInt()
            when(choice){
                1 -> HighWarlordNajentus.health -= player.dealDmg()
                2 -> HighWarlordNajentus.health -= player.castSpell()
                else -> println("Wrong input")
            }
        }
        player.health -= HighWarlordNajentus.dealDmg()
        if (HighWarlordNajentus.health <= HighWarlordNajentus.health/4)
            HighWarlordNajentus.castSpell()
    }

    println("\nEnemy defeated!\n")
    println("\nWild boss appears\nMother Sharaz")
    while (MotherShahraz.health > 0){
        choice = 0
        if (player.health <= 0){
            println("You died")
            break
        }
        println("Current health: ${player.health}")
        println("Current energy: ${player.energyResource}")
        println("Enemy health: ${MotherShahraz.health}")
        println("\nEnter number to chose your action:\n1. Use base attack\n2. Cast spell")

        while (choice > 2 || choice < 1){
            choice = readLine()!!.toInt()
            when(choice){
                1 -> MotherShahraz.health -= player.dealDmg()
                2 -> MotherShahraz.health -= player.castSpell()
                else -> println("Wrong input")
            }
        }
        player.health -= MotherShahraz.dealDmg()
        if (MotherShahraz.health <= MotherShahraz.health/4)
            MotherShahraz.castSpell()
    }

    println("\nEnemy defeated!\n")
    println("\nWild boss appears\nIllidan Stormrage")
    while (IllidanStormrage.health > 0){
        choice = 0
        if (player.health <= 0){
            println("You died")
            break
        }
        println("Current health: ${player.health}")
        println("Current energy: ${player.energyResource}")
        println("Enemy health: ${IllidanStormrage.health}")
        println("\nEnter number to chose your action:\n1. Use base attack\n2. Cast spell")

        while (choice > 2 || choice < 1){
            choice = readLine()!!.toInt()
            when(choice){
                1 -> IllidanStormrage.health -= player.dealDmg()
                2 -> IllidanStormrage.health -= player.castSpell()
                else -> println("Wrong input")
            }
        }
        player.health -= IllidanStormrage.dealDmg()
        if (IllidanStormrage.health <= IllidanStormrage.health/4)
            IllidanStormrage.castSpell()
    }
}