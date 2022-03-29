import java.util.List;

public abstract class Pokemon {
	protected StatusCondition currentStatusCondition;
	protected PokemonStats stats;
	protected List<Move> moves;
	protected List<Types> type;
	protected LevelSystem level;

	public Pokemon(){
		clearStatus();
		initializeStats();
		initializeMoves();
		defineType();
		initializeLevel();
	}

  protected void initializeLevel() {
		this.level = new LevelSystem(5);
	}
	
	protected abstract void defineType();

	protected abstract void initializeMoves();

	protected abstract void initializeStats();

	protected void clearStatus() {
		this.currentStatusCondition = new Fine();;
	}

	public List<Types> getTypes() {
    return type;
  }

	public abstract void evolve(Pokemon evolution);
	
}
