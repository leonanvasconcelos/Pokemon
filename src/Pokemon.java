//TODO implementar defesa, evasao, vantagem elemental, novos poderes e quantidade de usos da habilidade.
public class Pokemon {
	protected int vida;
	protected boolean vivo;
	protected String nome;
	protected Habilidades habilidadeUm, habilidadeDois, habilidadeTres, habilidadeQuatro, habilidadeCinco;

	public Pokemon() {
		vivo = true;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void receberDano(int dano) {
		if (vida > 0) {
			vida = vida - dano;
			System.out.println(nome + " recebeu " + dano + " de dano.");
		} else {
			System.out.println("O Pok�mon " + nome + " recebeu " + dano + " de dano e morreu.");
			vivo = false;
		}
	}

	public void usarHabilidadeUm(Pokemon alvo) {
		System.out.println("Eu n�o fa�o nada.");
	}

	public void usarHabilidadeDois(Pokemon alvo) {
		System.out.println("Eu n�o fa�o nada.");
	}

	public void usarHabilidadeTres(Pokemon alvo) {
		System.out.println("Eu n�o fa�o nada.");
	}

	public void usarHabilidadeQuatro(Pokemon alvo) {
		System.out.println("Eu n�o fa�o nada.");
	}

	public void usarHabilidadeCinco(Pokemon alvo) {
		System.out.println("Eu n�o fa�o nada.");
	}
}
