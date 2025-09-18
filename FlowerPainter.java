import org.code.neighborhood.*;

public class FlowerPainter extends PainterPlus{

  public void moveToStem(){
    turnRight();
    for(int i = 0; i < 7; i++){
      move();
    }
    turnLeft();
    for(int i = 0; i < 8; i++){
      move();
    }
    turnLeft();
  }

  public void paintFlower(String color){
    setPaint(50);
    turnLeft();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnAround();
    for(int i = 0; i<3; i++){
      move();
    }
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
  
    turnLeft();
    move();
    paint(color);
    turnLeft();

    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    
    turnRight();
    move();
    paint(color);
    turnRight();

    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);

     turnLeft();
    move();
    paint(color);
    turnLeft();

    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);

     turnRight();
    move();
    paint(color);
    turnRight();

    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);

         turnLeft();
    move();
    paint(color);
    turnLeft();

    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);

    turnAround();

    for(int i = 0; i < 3; i++){
      move();
    }
    
    turnRight();   
}

  public void makeCenter(String color){
    for(int i = 0; i < 3; i++){
      move();
    }
    
    turnRight();

    paint(color);
    
  }
  
}