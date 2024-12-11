import org.code.theater.*;
import org.code.media.*;

public class Buildings{
private int rank;
private int height;
private String name;
private String city;

  //constructor
   public Buildings(int rank, int height, String name, String city){
    this.rank = rank;
    this.height = height;
    this.name = name;
    this.city = city;
  }

  /** Accessor Method for rank */
  public int getRank(){
    return rank;
  }
    /** Accessor Method for height */
  public int getHeight(){
    return height;
  }
    /** Accessor Method for name */
  public String getName(){
    return name;
  }

     /** Accessor Method for city */
  public String getCity(){
    return city;
  }

    //to string displaying rank
  public String toStringRank(){
    return "Rank: "+ rank; 
  }
  //to string displaying name
  public String toStringName(){
    return "Name: " + name;
  }
  //to string displaying height
  public String toStringHeight(){
    return "Height: " + height;
  }
  //to string displaying city 
  public String toStringCity(){
    return "City: " + city;
  }


  
  
  }
  

