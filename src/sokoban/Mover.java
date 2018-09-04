package sokoban;

import java.util.List;

public class Mover {

  public int xMaze; // x position for the Maze matrix
  public int yMaze; // y position for the Maze matrix

  public Mover(int x, int y){
    //set initial x,y for Mover in the Maze
    xMaze = x;
    yMaze = y;

  }
public void printMyPosition(){
  System.out.println("x: " + xMaze + " y: " + yMaze);
}

  //methods for all directions

  public boolean stepLeft(){
    //it should be wall and maze border check here
    xMaze--;
    printMyPosition();
    return true; // should return true if step was successful
  }

  public boolean stepRight(){
      //it should be wall and maze border check here
      xMaze++;
      printMyPosition();
      return true; // should return true if step was successful
    }

  public boolean stepUp(){
        //it should be wall and maze border check here
        yMaze--;
        printMyPosition();
        return true; // should return true if step was successful
      }

  public boolean stepDown(){
          //it should be wall and maze border check here
          yMaze++;
          printMyPosition();
          return true; // should return true if step was successful
        }
//    private int x;
//    private int y;

//    private int StartPlayr;

    public static boolean searchPath(int[][] maze, int x, int y
            , List<Integer> path) {

        if (maze[y][x] == 9) {
            path.add(x);
            path.add(y);
        }

        if (maze[y][x] == 0) {
            maze[y][x] = 2;
        }
/*
        int dx = -1;
        int dy = 0;
        if (searchPath(maze, x + dx, y + dy, path)) {
            path.add(x);
            path.add(y);
            return true;
        }

        dx = 1;
        dy = 0;
        if (searchPath(maze, x + dx, y + dy, path)) {
            path.add(x);
            path.add(y);
            return true;
        }

        dx = 0;
        dy = -1;
        if (searchPath(maze, x + dx, y + dy, path)) {
            path.add(x);
            path.add(y);
            return true;
        }

        dx = 0;
        dy = 1;
        if (searchPath(maze, x + dx, y + dy, path)) {
            path.add(x);
            path.add(y);
            return true;
        }
        */

        return false;
    }

/*    public Mover(int xOnScreen, int yOnScreen) {
        GameFrame gameFrame = new GameFrame();
        gameFrame.maze.length(){}

        this.x = xOnScreen;
        this.y = yOnScreen;
*/



//        return y == 0 && x != 1 || y != 1 && x == 0;


//        GameFrame

//         (this=t_true)
//         (this=f_false;
/**
        boolean t_true=true;
        int x = 0;
        while (t_true){
            x+=1;
            if(x>10)
                t_true=false;
        }
*/

/*
        if (x > x++);
        if (x < x--);
        if (y > y++);
        if (y < y--);

        x == 0;
        y == 0,1,2,3;
*/

}

/*
     0 == true
     1 == false
     2 == true
     3 == true
*/
