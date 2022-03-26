//TODO implementar defesa, evasao, vantagem elemental, novos poderes e quantidade de usos da habilidade.
public class Pokemon {
	protected float vida, defesa, evasao;
	protected boolean vivo;
	protected String nome, tipo;
	protected Habilidades habilidadeUm, habilidadeDois, habilidadeTres, habilidadeQuatro, habilidadeCinco;

	public Pokemon() {
		vivo = true;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void receberDano(float dano, boolean desvantagemElemental) {
		if (desvantagemElemental) {
			dano = dano / 2;
			System.out.println("Não é muito efetivo...");
			System.out.println(nome + " recebeu " + dano + " de dano.");
		} else {
			System.out.println(nome + " recebeu " + dano + " de dano.");
		}
		vida = vida - dano;
		if (vida <= 0) {
			System.out.println(nome + " morreu.");
			vivo = false;
		} else {
			System.out.println("");
		}
	}

	public void usarHabilidadeUm(Pokemon alvo) {
		System.out.println("Eu não faço nada.");
	}

	public void usarHabilidadeDois(Pokemon alvo) {
		System.out.println("Eu não faço nada.");
	}

	public void usarHabilidadeTres(Pokemon alvo) {
		System.out.println("Eu não faço nada.");
	}

	public void usarHabilidadeQuatro(Pokemon alvo) {
		System.out.println("Eu não faço nada.");
	}

	public void usarHabilidadeCinco(Pokemon alvo) {
		System.out.println("Eu não faço nada.");
	}
}
