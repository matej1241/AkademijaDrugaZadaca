package model

class Weapon (
    val id: Int,
    val weaponName: String,
    val weaponType: WeaponType,
    val weaponMinDmg: Int,
    val weaponMaxDmg: Int,
    val weaponExtraDmg: Int = 0
    )