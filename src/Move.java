public abstract class Move {
  private enum DamageCategory {
    PHYSICAL, SPECIAL, STATUS
  }
  protected String name;
  protected Types type;
  protected DamageCategory damageCategory;
  protected Integer power;
  protected Float accuracy;
  protected int powerPoints;

  public abstract void attack(Pokemon pokemon);
}
