import org.code.theater.*;
import org.code.media.*;
public class DataScene extends Scene {

  // 1D array of dog objects
  private Dog[] dogs;   
  
 /** Constructor */
  public DataScene(String[] name, String[] bredfor, int[] maxlife, int[] minlife) {
    dogs = createDog(name, bredfor, maxlife, minlife);
  }

 /** Returns a 1D array of Person objects using the txt files in this project */
  public Dog[] createDog(String[] name, String[] bredfor, int[] maxlife, int[] minlife) {
    Dog[] dogArray = new Dog[name.length];
    for (int i = 0; i < dogArray.length; i++) {
      dogArray[i] = new Dog(name[i], bredfor[i], maxlife[i], minlife[i]);
    }
    return dogArray;
  }

  public void drawScene() {
    for(int i = 0; i< dogs.length; i++){
 Dog d = dogs[i]; 
    
   
    drawBackground(d.getMaxLife());
  
    
    drawImage("dog.jpeg",100,50,200);
   
    
    setTextStyle(Font.MONO,FontStyle.BOLD);
    //Name and bred for information from data set 
    drawText(d.getName(),10,250);
    drawText(d.getBredFor(),10,300);
 // this is a tostring just for the int's max and min life 
    drawText(d.toString(),10,350);
playSound("dog-bark-179915.wav");

   pause(1.0);

   
    
      }
}

public void drawBackground(int lifeSpan){
if (lifeSpan > 15){
  int ranRed = (int) (Math.random() * 256);
  int ranGreen = (int) (Math.random() * 256);
  int ranBlue = (int) (Math.random() * 256);

    Color c = new Color(ranRed,ranGreen,ranBlue);
    clear(c);
}else if (lifeSpan > 13){
  clear("yellow");
}else {
  clear ("red");
}
  
}
  
 }
   
