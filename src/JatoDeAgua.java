
public class JatoDeAgua extends Agua {
	public JatoDeAgua() {
		dano = 12;
	}

	@Override
	public int executar() {
		System.out.println("Jato D'Água!!!");
		return dano;
	}
}
