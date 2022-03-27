
public class Fogo extends Habilidades {
	public Fogo() {
		elemento = "fogo";
	}
	
	@Override
	public boolean vantagemElemental(String elementoAlvo) {
		if (elementoAlvo == "grama") {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean desvantagemElemental(String elementoAlvo) {
		if (elementoAlvo == "agua") {
			return true;
		} else {
			return false;
		}
	}
}
