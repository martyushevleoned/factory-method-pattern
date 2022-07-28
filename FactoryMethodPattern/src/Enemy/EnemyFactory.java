package Enemy;

public class EnemyFactory {
    public Enemy createEnemy(EnemyType type){
        Enemy enemy = null;

        switch (type) {
            case DRAGON -> enemy = new Dragon();
            case ORC -> enemy = new Orc();
            case WITCH -> enemy = new Witch();
        }

        return enemy;
    }
}
