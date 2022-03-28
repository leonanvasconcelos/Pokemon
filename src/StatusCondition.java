public abstract class StatusCondition {
  protected StatusAilments status;

  public abstract void applyEffect();

  public void cureEffect(){
    status = StatusAilments.FINE;
  }

}
