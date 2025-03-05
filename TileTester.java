/*
 * Activity 3.8.1
 */
import java.util.Arrays;

public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

  public static void main(String[] args)
  {
    Tile[][] gameboard = new Tile[3][4];  // Create 2D array with 3 rows and 4 columns
    
    int index = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        gameboard[i][j] = new Tile(tileValues[index]); // Assign tile values
        index++;
      }
    }

    // Print gameboard rows
    System.out.println(Arrays.toString(gameboard[0]));
    System.out.println(Arrays.toString(gameboard[1]));
    System.out.println(Arrays.toString(gameboard[2]));
  }
}
