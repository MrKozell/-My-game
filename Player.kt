import kotlin.random.Random
class Player {
    public var playersHp = 100
    public var playersDmg = 1
    fun fireball(strength: Int)
    {
        enemy.takeDmg(strength)
        println("Вы нанесли  $strength")
        enemy.atackplayer()
    }
    fun takeDmg(dmg: Int)
    {
        playersHp = playersHp-dmg
    }
    fun heal(heal: Int)
    {
        if (playersHp < 100) {
            playersHp = playersHp + heal
            println("Вы исцелили себя на $heal")
        } else {
            println("У вас уже максимальное здоровье")
        }
        if (playersHp > 100)
        {
            playersHp = 100
        }
        enemy.atackplayer()
    }
    fun dodge()
    {
        var dodgeDmg = Random.nextInt(5,11)
        var chance = Random.nextInt(1,3)
        if (chance == 1)
        {
            println("Вы попытались увернуться. Удачно" + "\nНанесенный урон: ${dodgeDmg}")
            enemy.takeDmg(dodgeDmg)
        }
        else
        {
            println("Вы попытались увернуться. Неудачно" )
            enemy.atackplayer()
            println("Монстр напал на вас и нанес ${enemy.damage} урона, теперь у вас ${player.playersHp}")
        }
    }
}