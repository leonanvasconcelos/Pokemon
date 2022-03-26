
public class Grama extends Habilidades {
	public Grama() {
		elemento = "grama";
	}

	@Override
	public boolean vantagemElemental(String elementoAlvo) {
		if (elementoAlvo == "agua") {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean desvantagemElemental(String elementoAlvo) {
		if (elementoAlvo == "fogo") {
			return true;
		} else {
			return false;
		}
	}
}
