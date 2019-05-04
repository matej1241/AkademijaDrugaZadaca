package playableClasses

import persistance.WeaponRepository

class Warrior: BaseClass() {

    init {
        health = 300
        energyResource = 100
        baseDmg = 30
        equipWeapon(WeaponRepository.getWeapon(1))
    }

    override fun castSpell(): Int {
        if (energyResource <= 0){
            return 0
        }
        return bladeStorm()
    }

    private fun bladeStorm(): Int {
        energyResource -= 50
        return (40..70).shuffled().first()
    }
}
