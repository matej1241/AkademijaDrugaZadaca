package playableClasses

import model.Weapon

abstract class BaseClass {

    var health: Int = 0
    var energyResource: Int = 0
    var baseDmg: Int = 0
    lateinit var equippedWeapon: Weapon

    fun equipWeapon(weapon:Weapon){
        equippedWeapon = weapon
    }

    fun dealDmg(): Int{
        val weaponDmg = (equippedWeapon.weaponMinDmg..equippedWeapon.weaponMaxDmg).shuffled().first()
        return weaponDmg + baseDmg
    }

    abstract fun castSpell(): Int
}