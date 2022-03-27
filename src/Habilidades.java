
public class Habilidades {
	protected float dano;
	protected String elemento;
	
	public boolean vantagemElemental(String elementoAlvo) {
		return true;
	}
	
	public boolean desvantagemElemental(String elementoAlvo) {
		return true;
	}

	public float executar(String elementoAlvo) {
		System.out.println("Eu não faço nada");
		return dano;
	}
}
