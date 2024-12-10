/**
 * Represents a Person with a name and age
 */
public class Dog {

  private String name;     // name of dog
  private String bredFor;  // reason dog is bred for
  private int maxLife;     // max age in years
  private int minLife;     // min age in years

  /** Constructor */
  public Dog(String name, String bredFor, int maxLife, int minLife) {
    this.name = name;
    this.bredFor = bredFor;
    this.maxLife = maxLife;
    this.minLife = minLife;
  }

  /** Accessor Method for name */
  public String getName() {
    return name;
  }
  
  /** Accessor Method for min and max age */
  public int getMaxLife() {
    return maxLife;
  }

  public int getMinLife() {
    return minLife;
  }

  /** Accessor Method for reason bred for */
  public String getBredFor() {
    return bredFor;
  }
  
  /** toString Method override */
  public String toString() {
    return "MIN LIFE: " + minLife +"\n"+ " MAX LIFE " + maxLife ;
  }
  
}
