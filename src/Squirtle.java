
public class Squirtle extends Pokemon {
	public Squirtle() {
		vida = 75;
		nome = "Squirtle";
		habilidadeUm = new JatoDeAgua();
	}

	public void usarHabilidadeUm(Pokemon alvo) {
		System.out.print(nome + ": ");
		alvo.receberDano(habilidadeUm.executar());
	}
}