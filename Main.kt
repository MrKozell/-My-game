import java.security.Principal
import kotlin.random.Random

val player = Player()
val enemy = Enemy()
var skill = 0
fun main() {

    while (enemy.hp > 0 || player.playersHp > 0) {
        useAbility()
        println("Монстр напал на вас и нанес ${enemy.damage} урона")
        checkHP()
        println("Player's HP: ${player.playersHp}")
        println("Enemy's HP: ${enemy.hp}")
        println("\n Использовать:" + "\n1. Fireball" + "\n2. Heal" + "\n3. Chance to dodge")
        skill = readln().toInt()
    }
}
fun checkHP()
{
    if(player.playersHp <= 0)
    {
        println("Победа монстра!")
        System.exit(1)
    }
    if(enemy.hp <= 0)
    {
        println("Победа игрока!")
        System.exit(1)
    }

}
fun useAbility(){
    when (skill) {
        3 -> player.dodge()
        2 -> player.heal(Random.nextInt(15, 30))
        1 -> player.fireball(Random.nextInt(20, 40))
    }
}