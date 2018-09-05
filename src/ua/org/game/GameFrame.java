package ua.org.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class GameFrame extends JComponent implements Runnable {

    private Mover sbMover = new Mover(1, 1);

    int [][] maze = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,1,0,1,0,1,0,0,0,0,3,1},
            {1,0,1,0,0,0,1,0,1,1,1,0,1},
            {1,0,0,0,1,1,1,0,0,0,0,0,1},
            {1,0,1,0,0,0,0,0,1,1,1,0,1},
            {1,0,1,0,1,1,1,0,1,0,0,0,1},
            {1,0,1,0,1,0,0,0,1,1,1,0,1},
            {1,0,1,0,1,1,1,0,1,0,1,0,1}, //x9 * 30 = 270 240
            {1,2,0,0,0,0,0,0,0,0,1,0,1}, //y2 * 30 = 60 30
            {1,1,1,1,1,1,1,1,1,1,1,1,1}
    };


    public GameFrame() {
        sbMover.setMoverStepSizeOnScreen(30);
        setLayout(new FlowLayout());
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                keyPressed2(e);
            }
        });
        Thread t = new Thread(this);
        t.start();

    }

    public void paint(Graphics g) {
        super.paint(g);

        for (int row = 0; row < maze.length; row++){
            for (int col = 0; col < maze[1].length; col++){

                Color color;
                switch (maze[row][col]){
                    case 1 : color = Color.BLACK; break;
//                    case 2 : color = Color.GREEN; break;
//                    case 9 : color = Color.RED; break;
                    default : color = Color.WHITE;
                }

                g.setColor(color);
                g.fillRect(30*col,30*row,30,30);
                g.setColor(color.BLACK);
                g.drawRect(30*col,30*row,30,30);
//                g.setColor(color.ORANGE);
//                g.fillOval(xMaze+30,yMaze+240, 30,30);

//                if (yMaze+maze.length == 0 && xMaze+maze.length != 1
//                        || yMaze+maze.length != 1 && xMaze+maze.length == 0);

//                if (yMaze+maze[row][col] == 0 && xMaze+maze[row][col] != 1
//                        || yMaze+maze[row][col] != 1 && xMaze+maze[row][col] == 0);

//                if (yMaze == 0 && xMaze != 1 || yMaze != 1 && xMaze == 0);

            }

//            int pathX = path.size();
//            int pathY = path.size();
            g.setColor(Color.ORANGE);
            g.fillOval(sbMover.getxOnScreen(),sbMover.getyOnScreen(), 30,30);
        }
    }

    /**
     private void Mover(int row, int col){
     if(maze[xMaze + row][yMaze + col] != 1){
     if(maze[xMaze + row][yMaze + col] == 2 || maze[xMaze + row][yMaze + col] == 4){
     if(maze[xMaze + row*2][yMaze + col*2] == 1 ||
     maze[xMaze + row*2][yMaze + col*2] == 2 ||
     maze[xMaze + row*2][yMaze + col*2] == 4)
     return;
     if(maze[xMaze + row][yMaze + col] == 4){
     maze[xMaze + row][yMaze + col] = 3;
     if(maze[xMaze + row*2][yMaze + col*2] == 3)
     maze[xMaze + row*2][yMaze + col*2] = 4;
     else
     maze[xMaze + row*2][yMaze + col*2] = 2;
     }else{
     maze[xMaze + row][yMaze + col] = 0;
     if(maze[xMaze + row*2][yMaze + col*2] == 3)
     maze[xMaze + row*2][yMaze + col*2] = 4;
     else
     maze[xMaze + row*2][yMaze + col*2] = 2;
     }
     }
     xMaze += row;
     yMaze += col;
     }
     //     time = 0;
     }
     */

    private KeyAdapter controller = new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            keyPressed2(e);
        }
    };

    /////////
    public KeyAdapter getController() {
        return controller;
    }
    /**
     private int go1 = 0;
     private int go2 = 2;
     private int go3 = 3;
     private int gooff = 1;
     */
    private void checkOOB() {

/*        if (yMaze == 0 && xMaze != 1 || yMaze != 1 && xMaze == 0);
        if (yMaze == 0 && xMaze != 1 || yMaze != 1 && xMaze == 0);
        if (yMaze == 0 && xMaze != 1 || yMaze != 1 && xMaze == 0);*/
    }

    /**
     public int getTileX(){
     return xMaze;
     }

     public int getTileY(){
     return yMaze;
     }

     public int getMap(){
     return maze;
     }
     */

    private void keyPressed2(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            sbMover.stepUp();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            sbMover.stepDown();
//            yMaze=yMaze+30;
//            checkOOB();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            sbMover.stepLeft();
//            xMaze=xMaze-30;
//            checkOOB();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            sbMover.stepRight();
//            xMaze=xMaze+30;
//            checkOOB();
        }
        repaint();
    }

    @Override
    public void run() {
        try {
            while (true) {
                repaint();
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
