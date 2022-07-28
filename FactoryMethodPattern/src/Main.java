import Enemy.Enemy;
import Enemy.EnemyFactory;
import static Enemy.EnemyType.DRAGON;

public class Main {
    public static void main(String[] args) {

        EnemyFactory enemyFactory = new EnemyFactory();

        Enemy enemy = enemyFactory.createEnemy(DRAGON);

        enemy.hit();
    }
}