
public class Batalha {
	public static void main(String args[]) {
		Pokemon pokemon1 = new Pikachu();
		Pokemon pokemon2 = new Squirtle();
		
		System.out.println(pokemon1.tipo);

		while (pokemon1.isVivo() && pokemon2.isVivo()) {
			pokemon1.usarHabilidadeUm(pokemon2);
			if (pokemon2.isVivo()) {
				pokemon2.usarHabilidadeUm(pokemon1);
			}
		}
	}
}
