
public class Agua extends Habilidades {
	public Agua() {
		elemento = "agua";
	}

	@Override
	public boolean vantagemElemental(String elementoAlvo) {
		if (elementoAlvo == "fogo") {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean desvantagemElemental(String elementoAlvo) {
		if (elementoAlvo == "grama") {
			return true;
		} else {
			return false;
		}
	}
}
