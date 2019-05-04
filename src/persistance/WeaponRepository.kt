package persistance

import model.Weapon
import model.WeaponType

object WeaponRepository {

    lateinit var selectedWeapon: Weapon

    private val weaponRepository: MutableList<Weapon> =
        mutableListOf(
            Weapon(1,
                "Thunderfury, Blessed Blade of the Windseeker",
                WeaponType.TWO_HANDED_SWORD,
                16,
                28,
                33
                ),
            Weapon(2,
                "Shard of Azzinoth",
                 WeaponType.DAGGER,
                15,
                26,
                10
            ),
            Weapon(3,
                "Zhar'doom, Greatstaff of the Devourer",
                 WeaponType.STAFF,
                23,
                32,
                5
            )
        )

    fun getWeapon(weaponId: Int): Weapon{
        for(weapon in weaponRepository){
            if(weapon.id == weaponId){
                selectedWeapon = weapon
            }
        }
        return selectedWeapon
    }
}