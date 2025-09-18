import org.code.neighborhood.*;

public class StemPainter extends PainterPlus{

  public void moveToBottomMiddle(){
    for(int i =0; i < 8; i++){
      move();
    }
    turnRight();
    moveFast();
    turnAround();
  }

  public void paintStem(String color){
    setPaint(8);
    for(int i = 0; i < 8; i++){
      paint(color);
       move();
    }
  }
  
}