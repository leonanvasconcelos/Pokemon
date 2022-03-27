
public class Eletrica extends Habilidades {

	public Eletrica() {
		elemento = "eletrico";
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
		if (elementoAlvo == "pedra") {
			return true;
		} else {
			return false;
		}
	}

}
