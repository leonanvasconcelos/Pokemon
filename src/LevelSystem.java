public class LevelSystem {
  private Integer currentLevel;
  private Integer xpPoints;
  private Integer xpToNextLevel;
  private final Integer maxLevel = 100;
  //TODO: create class for constants containing all numeric values regarding the leveling system

  public LevelSystem() {
    this.currentLevel = 5;
    this.xpPoints = 0;
    //TODO: set value of xpToNextLevel according to reference class
  }

  public LevelSystem(Integer initialLevel){
    this.currentLevel = initialLevel;
    this.xpPoints = 0;
    //TODO: set value of xpToNextLevel according to reference class
  }

  public Integer getCurrentLevel(){
    return this.currentLevel;  
  }

  public void levelUp(){
    this.currentLevel++;
    //TODO: set value of xpToNextLevel according to reference class
  }

  public void gainXP(Integer expPoints){
    xpPoints += expPoints;
    while (xpPoints > xpToNextLevel) {
      xpPoints -= xpToNextLevel;
      levelUp();
    }
  }
}
