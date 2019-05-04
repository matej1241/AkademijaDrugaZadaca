package enemies

object HighWarlordNajentus: BaseEnemy {
    var health: Int = 150
    val baseMinDmg: Int = 10
    val baseMaxDmg: Int = 30

    override fun dealDmg(): Int {
        return (baseMinDmg..baseMaxDmg).shuffled().first()
    }

    override fun castSpell(): Int {
        return needleSpine()
    }

    private fun needleSpine(): Int {
        return (5..40).shuffled().first()
    }
}