import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

   WhitePainter olivia = new WhitePainter();
  StemPainter stem = new StemPainter();
    FlowerPainter petal = new FlowerPainter();

    stem.moveToBottomMiddle();
    olivia.paintBackground("white");
    stem.paintStem("green");
    petal.moveToStem();
    petal.paintFlower("red");
    petal.makeCenter("yellow");
    
  }
}