package main;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
    // screen settings
    final int originalTileSize = 16; //16x16 tile range, standard for 2d retro games
    final int scale = 3;

    final int tileSize = originalTileSize * scale; //48*48 tiles
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; //768 pixels
    final int screenHeight = tileSize * maxScreenRow; //576 pixels

    Thread gameThread;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);

    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();

    }
    @Override
    public void run() {
        while(gameThread != null){
            //System.out.println("The game loop is running!");

            //1 UPDATE: update information such as character positions


            //2 DRAW: draw the screen with the updated information
        }
    }
    public void update(){

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
