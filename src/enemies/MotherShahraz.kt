package enemies

object MotherShahraz: BaseEnemy {
    var health: Int = 200
    val baseMinDmg: Int = 20
    val baseMaxDmg: Int = 40

    override fun dealDmg(): Int {
        return (baseMinDmg..baseMaxDmg).shuffled().first()
    }

    override fun castSpell(): Int {
        return agonizingFlames()
    }

    private fun agonizingFlames(): Int {
        return (10..30).shuffled().first()
    }
}