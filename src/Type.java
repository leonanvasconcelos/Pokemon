public abstract class Type {
  //TODO: change name to DamageCalculator or something

  private static final Float EFFECTIVE = 2f;
  private static final Float REGULAR = 1f;
  private static final Float WEAK = 0.5f;
  private static final Float INEFFECTIVE = 0f;
  private static final Float[][] typeEffectivenessChart = {
    //NORMAL
    {REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, WEAK, REGULAR, INEFFECTIVE, WEAK, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR},
    //FIGHT
    {EFFECTIVE, REGULAR, WEAK, WEAK, REGULAR, EFFECTIVE, WEAK, INEFFECTIVE, EFFECTIVE, REGULAR ,REGULAR, REGULAR, REGULAR, WEAK, EFFECTIVE, REGULAR, EFFECTIVE, WEAK},
    //FLYING
    {REGULAR, EFFECTIVE, REGULAR, REGULAR, REGULAR, WEAK, EFFECTIVE, REGULAR, WEAK, REGULAR ,REGULAR, EFFECTIVE, WEAK, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR},
    //POISON	
    {REGULAR, REGULAR, REGULAR, WEAK, WEAK, WEAK, REGULAR, WEAK, INEFFECTIVE, REGULAR ,REGULAR, EFFECTIVE, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, EFFECTIVE},
    //GROUND	
    {REGULAR, REGULAR, INEFFECTIVE, EFFECTIVE, REGULAR, EFFECTIVE, WEAK, REGULAR, EFFECTIVE, EFFECTIVE ,REGULAR, WEAK, EFFECTIVE, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR},
    //ROCK	
    {REGULAR, WEAK, EFFECTIVE, REGULAR, WEAK, REGULAR, EFFECTIVE, REGULAR, WEAK, EFFECTIVE ,REGULAR, REGULAR, REGULAR, REGULAR, EFFECTIVE, REGULAR, REGULAR, REGULAR},
    //BUG	
    {REGULAR, WEAK, WEAK, WEAK, REGULAR, REGULAR, REGULAR, WEAK, WEAK, WEAK ,REGULAR, EFFECTIVE, REGULAR, EFFECTIVE, REGULAR, REGULAR, EFFECTIVE, WEAK},
    //GHOST	
    {INEFFECTIVE, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, EFFECTIVE, REGULAR, REGULAR ,REGULAR, REGULAR, REGULAR, EFFECTIVE, REGULAR, REGULAR, WEAK, REGULAR},
    //STEEL	
    {REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, EFFECTIVE, REGULAR, REGULAR, WEAK, WEAK ,WEAK, REGULAR, WEAK, REGULAR, EFFECTIVE, REGULAR, REGULAR, EFFECTIVE},
    //FIRE	
    {REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, WEAK, EFFECTIVE, REGULAR, EFFECTIVE, WEAK ,WEAK, EFFECTIVE, REGULAR, REGULAR, EFFECTIVE, WEAK, REGULAR, REGULAR},
    //WATER	
    {REGULAR, REGULAR, REGULAR, REGULAR, EFFECTIVE, EFFECTIVE, REGULAR, REGULAR, REGULAR, EFFECTIVE ,WEAK, WEAK, REGULAR, REGULAR, REGULAR, WEAK, REGULAR, REGULAR},
    //GRASS	
    {REGULAR, REGULAR, WEAK, WEAK, EFFECTIVE, EFFECTIVE, WEAK, REGULAR, WEAK, WEAK ,EFFECTIVE, WEAK, REGULAR, REGULAR, REGULAR, WEAK, REGULAR, REGULAR},
    //ELECTRIC	
    {REGULAR, REGULAR, EFFECTIVE, REGULAR, INEFFECTIVE, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR ,EFFECTIVE, WEAK, WEAK, REGULAR, REGULAR, WEAK, REGULAR, REGULAR},
    //PSYCHIC	
    {REGULAR, EFFECTIVE, REGULAR, EFFECTIVE, REGULAR, REGULAR, REGULAR, REGULAR, WEAK, REGULAR ,REGULAR, REGULAR, REGULAR, WEAK, REGULAR, REGULAR, INEFFECTIVE, REGULAR},
    //ICE	
    {REGULAR, REGULAR, EFFECTIVE, REGULAR, EFFECTIVE, REGULAR, REGULAR, REGULAR, WEAK, WEAK ,WEAK, EFFECTIVE, REGULAR, REGULAR, WEAK, EFFECTIVE, REGULAR, REGULAR},
    //DRAGON	
    {REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, WEAK, REGULAR ,REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, EFFECTIVE, REGULAR, INEFFECTIVE},
    //DARK	
    {REGULAR, WEAK, REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, EFFECTIVE, REGULAR, REGULAR ,REGULAR, REGULAR, REGULAR, EFFECTIVE, REGULAR, REGULAR, WEAK, WEAK},
    //FAIRY	
    {REGULAR, EFFECTIVE, REGULAR, WEAK, REGULAR, REGULAR, REGULAR, REGULAR, WEAK, WEAK ,REGULAR, REGULAR, REGULAR, REGULAR, REGULAR, EFFECTIVE, EFFECTIVE, REGULAR}
  };

  public static Float getDamageMultiplier(Types moveType, Pokemon pokemon) {
    Float result = 1f;
    for (Types type : pokemon.getTypes()) {
      result *= typeEffectivenessChart[moveType.ordinal()][type.ordinal()];
    }
    return result;
  }
}
