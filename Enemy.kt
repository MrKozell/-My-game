import kotlin.random.Random
class Enemy {
    public var hp = Random.nextInt(100,201)
    public var damage = 0
    fun atackplayer(){
        damage = Random.nextInt(1,50)
        player.takeDmg(damage)

    }
    fun takeDmg(dmg: Int){
        hp = hp-dmg

    }

}