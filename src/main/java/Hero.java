import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    private int x;
    private int y;

    public Hero(int xx, int yy){
        x=xx;
        y=yy;
    }

    public void setX(int xx){ x = xx; }
    public void setY(int yy){ y = yy; }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void moveUp(){
        setY(getY()-1);
    }
    public void moveDown(){
        setY(getY()+1);
    }
    public void moveRight(){
        setX(getX()+1);
    }
    public void moveLeft(){
        setX(getX()-1);
    }
    public void draw(Screen screen){
        screen.setCharacter(x, y, TextCharacter.fromCharacter('X')[0]);
    }
}
