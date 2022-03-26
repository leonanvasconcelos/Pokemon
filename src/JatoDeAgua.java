
public class JatoDeAgua extends Agua {
	public JatoDeAgua() {
		dano = 12;
	}

	@Override
	public float executar(String elementoAlvo) {
		System.out.println("Jato D'Água!!!");
		return dano;
	}
}
