import org.code.theater.*;

public class DataScene extends Scene {
  private Buildings[] Building; // 1D Array of Buildings Objects
  private String soundFile1;
    /** Constructor */
  //sound files displayed in video
    public DataScene(String soundFile1) {
    this.soundFile1 = soundFile1;
    Building = createBuilding();
  }

  public Buildings[] createBuilding() {
    int[] rankArray = FileReader.toIntArray("rank.txt");
    int[] heightArray = FileReader.toIntArray("height.txt");
    String[] nameArray = FileReader.toStringArray("name.txt");
    String[] cityArray = FileReader.toStringArray("city.txt");
   
  
   Buildings[] BuildingArray = new Buildings[rankArray.length];
    for (int i = 0; i < BuildingArray.length; i++) {
      BuildingArray[i] = new Buildings(rankArray[i], heightArray[i], nameArray[i], cityArray[i]);
    }

    return BuildingArray;
  }

  /**
   * Top-level method to draw the animation
   */
  public void drawScene() {
    //displays buildings
   for(int i = 0; i < Building.length; i++){
     pause(0.5);
     clear("white");
     
      if (i==0) {
        drawImage ("BurjKhalifa.png", 300, 100, 150);
        text(Building[i]);
      }else if (i==1){
        drawImage ("bulind_03.png", 300, 100, 100);
        text(Building[i]);
      }else if (i==2){
        drawImage ("abraj-al-bait-clock-tower-clipart.png", 200, 240, 220);
        text(Building[i]);
      }else if (i==3){
        drawImage ("pngtree-ping-an-international-financial-center-png-image_7166166.png", 200, 180, 200);
        text(Building[i]);
      }else if (i==4){
        drawImage ("pngtree-lotte-world-tower-graphic-element-illustration-png-image_11605584.png", 200, 100, 200);
        text(Building[i]);
      }
       
  }
}

  public void text(Buildings b) {
    //plays wav. files 
    playSound(soundFile1);
    pause(0.5);
    //displays text for all the data sets
    drawText(b.toStringRank(), 20, 50);
    drawText(b.toStringName(), 20, 100);
    drawText(b.toStringCity(), 20, 150);
    drawText(b.toStringHeight(), 20, 200);
  }
}

  
