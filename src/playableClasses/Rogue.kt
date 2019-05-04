package playableClasses

import persistance.WeaponRepository

class Rogue: BaseClass() {

    init {
        health = 200
        energyResource = 100
        baseDmg = 50
        equipWeapon(WeaponRepository.getWeapon(2))
    }

    override fun castSpell(): Int {
        if (energyResource <= 0){
            return 0
        }
        return shadowStep()
    }

    private fun shadowStep(): Int {
        energyResource -= 20
        return (20..50).shuffled().first()
    }
}