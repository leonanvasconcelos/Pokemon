
public class JatoDeAgua extends Agua {
	public JatoDeAgua() {
		dano = 12;
	}

	@Override
	public float executar(String elementoAlvo) {
		System.out.println("Jato D'�gua!!!");
		if (vantagemElemental(elementoAlvo)) {
			System.out.println("� extremamente efetivo!");
			return (float) (dano * 1.3);
		}
		return dano;
	}
}
