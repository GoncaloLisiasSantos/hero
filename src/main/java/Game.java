import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.input.KeyStroke;

import javax.swing.*;
import java.io.IOException;

public class Game {
    private Screen screen;
    private int x = 10;
    private int y = 10;






    public Game() {
        try {
            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            screen = new TerminalScreen(terminal);
            screen.setCursorPosition(null); // we don't need a cursor
            screen.startScreen(); // screens must be started
            screen.doResizeIfNecessary(); // resize screen if necessary
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void draw() throws IOException {
        screen.clear();
        screen.setCharacter(x, y, TextCharacter.fromCharacter('X')[0]);
        screen.refresh();
    }
    


    public void run() throws IOException{
        draw();
        KeyStroke key =  screen.readInput();
    }

    private void processKey(KeyStroke key)throws IOException{
        if (key.getKeyType()==KeyType.ArrowUp){
            y-=1;
        }
        if (key.getKeyType()==KeyType.ArrowDown){
            y+=1;
        }
        if (key.getKeyType()==KeyType.ArrowLeft){
            x-=1;
        }
        if (key.getKeyType()==KeyType.ArrowRight){
            x+=1;
        }
        if(key.getKeyType()==KeyType.Character && key.getCharacter() == 'q'){
            screen.close();
        }
        System.out.println(key);
    }


}

