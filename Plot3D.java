import java.lang.Math;

public class Plot3D {

  public void play() {
    showIntro();
    startGame();
  }
  
  private void showIntro() {
    System.out.println(" ".repeat(31) + "3D PLOT");
    System.out.println(" ".repeat(14) + "CREATIVE COMPUTING  MORRISTOWN, NEW JERSEY");
    System.out.println("\n\n\n");
  }


  private void startGame() {
    float row = 0;
    int column = 0;
    int limit = 0;
    int plotVal = 0;
    int root = 0;

    String lineContent = "";

    for (row = -30; row <= 30; row += 1.5) {

      limit = 0;

      root = 5 * (int) Math.floor((Math.sqrt(900 - row * row) / 5));

      for (column = root; column >= -root; column += -5) {

        plotVal = 25 + (int) Math.floor(func(Math.sqrt(row * row + column * column)) - 0.7 * column);

        if (plotVal > limit) {

          limit = plotVal;

          while (lineContent.length() < (plotVal-1)) {
            lineContent += " ";
          }

          lineContent += "*";

        }

      } 

      System.out.println(lineContent);

      lineContent = "";

    } 

  }  



  public double func(double inputVal) {
    return (30 * Math.exp(-inputVal * inputVal / 100));
  }


  public static void main(String[] args) {
    Plot3D plot = new Plot3D();
    plot.play();
  } 

}  
