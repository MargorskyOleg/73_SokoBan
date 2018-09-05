package ua.org.game;

import java.util.List;

public class Mover {

    private int xMaze; // x position for the Maze matrix
    private int yMaze; // y position for the Maze matrix

    private int moverStepSizeOnScreen; // step size for the Mover on screen

    private int xOnScreen; // x on the screen
    private int yOnScreen; // y on the screen

    public int getxOnScreen(){
        this.xOnScreen = xMaze * moverStepSizeOnScreen;
        return this.xOnScreen;
    }

    public int getyOnScreen(){
        this.yOnScreen = yMaze * moverStepSizeOnScreen;
        return this.yOnScreen;
    }


    private int gameAreaWidth;
    private int gameAreaHeight;


    public void setMoverStepSizeOnScreen(int moverStepSizeOnScreen) {
        this.moverStepSizeOnScreen = moverStepSizeOnScreen;
    }

    public void setGameArea(int width, int height){ //not used yet, but should be used for automatically calculate step size on the screen
        this.gameAreaWidth = width;
        this.gameAreaHeight = height;
    }

    public Mover(int x, int y) {
        //set initial x,y for Mover in the Maze
        xMaze = x;
        yMaze = y;

    }

    public void printMyPosition() {
        System.out.println("x: " + xMaze + " y: " + yMaze);
    }

    //methods for all directions

    public boolean stepLeft() {
        //it should be wall and maze border check here
        xMaze--;
        printMyPosition();
        return true; // should return true if step was successful
    }

    public boolean stepRight() {
        //it should be wall and maze border check here
        xMaze++;
        printMyPosition();
        return true; // should return true if step was successful
    }

    public boolean stepUp() {
        //it should be wall and maze border check here
        yMaze--;
        printMyPosition();
        return true; // should return true if step was successful
    }

    public boolean stepDown() {
        //it should be wall and maze border check here
        yMaze++;
        printMyPosition();
        return true; // should return true if step was successful
    }
}
