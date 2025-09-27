import org.code.neighborhood.*;

public class StemPainter extends PainterPlus{

   /*
  *moves painter that paints the stem to the bottom middle of the screen
  */
  public void moveToBottomMiddle(){
    for(int i =0; i < 8; i++){
      move();
    }
    turnRight();
    moveFast();
    turnAround();
  }

   /*
  *moves painter upward while painting a color to make the stem structure
  */
  public void paintStem(String color){
    setPaint(8);
    for(int i = 0; i < 8; i++){
      paint(color);
       move();
    }
  }
  
}
