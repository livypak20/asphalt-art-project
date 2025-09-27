import org.code.neighborhood.*;

public class PainterPlus extends Painter {


  /*
  *turns painter right
  */
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }

   /*
  *moves painter while they are able to move
  */
  public void moveFast(){
    while(canMove()){
      move();
    }
  }

    /*
  *makes painter paint until their bucket is completely empty
  */
  public void paintToEmpty(String color){
    while(hasPaint()){
      paint(color);
      move();
    }
  }


   /*
  *paints a donut while using an input that is the color of the paint
  */

  public void paintDonut(String color){
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
  }


   /*
  *turns painter around from the direction it was facing
  */
  public void turnAround(){
    turnLeft();
    turnLeft();
  }
}
