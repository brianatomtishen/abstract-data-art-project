import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Read data from text files and convert them into arrays
    String[] namesArray = FileReader.toStringArray("names.txt");
    String[] bredforArray = FileReader.toStringArray("bredfor.txt");
    int[] maxlifeArray = FileReader.toIntArray("maxlife.txt");
    int[] minlifeArray = FileReader.toIntArray("minlife.txt"); 
    
    // Instantiate a DataScene object to play in the Theater
    DataScene scene = new DataScene(namesArray, bredforArray, maxlifeArray, minlifeArray);
      
    // Display the information about dogs
    scene.drawScene();

    Theater.playScenes(scene);
  }
}
