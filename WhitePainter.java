import org.code.neighborhood.*;

public class WhitePainter extends PainterPlus {

  /*
  *paints background of the grid white using if statements and while loops,
  also determing what direction the painter is facing to see what the next move is
  */
  
  public void paintBackground(String color){
    setPaint(16*16);
  while(hasPaint()){
      while(canMove()){
      paint(color);
      move();
      }

      if(isFacingEast()){
        turnRight();
        paint(color);
        if (canMove()) {
          move();
        }
        // paint(color);
        turnRight();
      } else {
        turnLeft();
        paint(color);
        if (canMove()) {
          move();
        }
        // paint(color);
        turnLeft();
      } 
    }

    
  }
  
}
