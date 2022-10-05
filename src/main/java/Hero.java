import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

public class Hero {

    private Position position;

    public Hero(int hx,int hy){
        position=new Position(hx,hy);

    }
    public void setPosition(Position p){
        this.position=p;
    }


    public int getX(){
        return position.getX();
    }

    public int getY(){
        return position.getY();
    }



    public Position moveUp() {
        return new Position(position.getX(), position.getY() - 1);
    }
    public Position moveDown() {
        return new Position(position.getX(), position.getY() + 1);
    }
    public Position moveRight() {
        return new Position(position.getX() +1, position.getY() );
    }
    public Position moveLeft() {
        return new Position(position.getX() - 1, position.getY());
    }
    public void draw(TextGraphics graphics){
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "X");
    }
}
