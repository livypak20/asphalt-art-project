import org.code.neighborhood.*;

public class WhitePainter extends PainterPlus {

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