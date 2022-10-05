import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;


/*
public class Arena {
        private int width;
        private int height;
        private Hero hero;

        public Arena(int width, int height) {
            this.width = width;
            this.height = height;
            this.hero = new Hero(10, 10);
            Position position= new Position(width/2, height/2);
            hero= new Hero (position.getX(), position.getY());
        }

        public void draw(Screen screen) throws IOException {
          hero.draw(screen);

        }
    public void processKey(KeyStroke key) throws IOException {
        System.out.println(key);
        if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'w')
            moveHero(hero.moveUp());
        if (key.getKeyType() == KeyType.Character && key.getCharacter() == 's')
            moveHero(hero.moveDown());
        if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'd')
            moveHero(hero.moveRight());
        if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'a')
            moveHero(hero.moveLeft());
    }

        public void moveHero(Position position) {
            if (canHeroMove(position))
                hero.setPosition(position);
        }

    private boolean canHeroMove(Position position) {
        if (position.getX() < 0) return false;
        if (position.getY() < 0) return false;
        if (position.getX() > width - 1) return false;
        if (position.getY() > height - 1) return false;

        return true;
    }

        /*private boolean canHeroMove(Position position) {
            return (position.getX()>=0 && position.getX()<width && position.getY()>=0 && position.getY()<height);
        }
    }*/
public class Arena {
    private final int width;
    private final int height;
    private final Hero hero;

    public Arena(int width, int height) {
        this.width = width;
        this.height = height;
        this.hero = new Hero(10, 10);
    }

    public void draw(Screen screen) {
        hero.draw(screen);

    }

    public void processKey(KeyStroke key) {
        System.out.println(key);
        switch (key.getKeyType()) {
            case ArrowUp -> moveHero(hero.moveUp());
            case ArrowDown -> moveHero(hero.moveDown());
            case ArrowRight -> moveHero(hero.moveRight());
            case ArrowLeft -> moveHero(hero.moveLeft());


        }
    }

    public void moveHero(Position position) {
        if (canHeroMove(position)) {
            hero.setPosition(position);
        }
    }



    private boolean canHeroMove(Position position) {
       if(position.getX()<width && position.getY()<height){

           return true;
       }
       return false;
    }
}

