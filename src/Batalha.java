
public class Batalha {
	public static void main(String args[]) {
		Pokemon pokemon1 = new Bulbassauro();
		Pokemon pokemon2 = new Squirtle();

		while (pokemon1.isVivo() && pokemon2.isVivo()) {
			pokemon1.usarHabilidadeUm(pokemon2);
			if (pokemon2.isVivo()) {
				pokemon2.usarHabilidadeUm(pokemon1);
			}
		}
	}
}
