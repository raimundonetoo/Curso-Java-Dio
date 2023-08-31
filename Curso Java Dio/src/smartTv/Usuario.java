package smartTv;

public class Usuario {

	public static void main(String[] args) {
		SmartTv SmartTv = new SmartTv();

		System.out.println("A tv está ligada ? " + (SmartTv.ligada ? "Sim" : "Não"));
		System.out.println("O Canal Atual é "+ SmartTv.canal);
		System.out.println("O volume atual da Tv é " + SmartTv.volume);
	}

}
