import java.util.List;

public abstract class Pokemon {
	protected StatusCondition currentStatusCondition;
	protected PokemonStats stats;
	protected List<Move> moves;
	protected List<Types> type;
	protected Integer level;

	public Pokemon(){
		clearStatus();
		initializeStats();
		initializeMoves();
		defineType();
		initializeLevel();
	}

  protected void initializeLevel() {
		this.level = 5;
	}
	
	protected abstract void defineType();

	protected abstract void initializeMoves();

	protected abstract void initializeStats();

	protected void clearStatus() {
	}

	public List<Types> getTypes() {
    return type;
  }
}
