public class PokemonStats {
  private Integer[] stats;
  private float evasiveness;
  private float accuracy;
  
  public PokemonStats(Integer[] stats) {
    this.stats = stats;
    initializeInBattleStats();
  }

  public void initializeInBattleStats(){
    evasiveness = 1f;
    accuracy = 1f;
  }

  public Integer getStat(Stats statItem) {
    return stats[statItem.ordinal()];
  }
  
}
