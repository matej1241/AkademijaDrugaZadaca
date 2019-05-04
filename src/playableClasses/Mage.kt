package playableClasses

import persistance.WeaponRepository

class Mage: BaseClass() {

    init {
        health = 250
        energyResource = 200
        baseDmg = 25
        equipWeapon(WeaponRepository.getWeapon(3))
    }

    override fun castSpell(): Int {
        if (energyResource <= 0){
            return 0
        }
        return frostBolt()
    }

    private fun frostBolt(): Int {
        energyResource -= 25
        return (40..100).shuffled().first()
    }
}