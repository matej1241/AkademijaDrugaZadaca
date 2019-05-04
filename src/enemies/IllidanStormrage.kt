package enemies

object IllidanStormrage: BaseEnemy{

    var health: Int = 300
    val baseMinDmg: Int = 20
    val baseMaxDmg: Int = 50

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