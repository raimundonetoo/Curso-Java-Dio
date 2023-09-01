package smartTv;

public class SmartTv {
	boolean ligada = false;
	int canal = 0;
	int volume = 0;

	public void AumentarVolume() {
		volume++;
		if (volume <= 100) {
			volume = 100;
			System.out.println("Volume máximo " + volume);
		}
	}

	public void DiminuirVolume() {
		volume--;
		if (volume <= 0) {
			volume = 0;
			System.out.println("Volume " + volume);
		}
	}

	public void LigarTv() {
		ligada = true;
	}

	public void DesligarTv() {
		ligada = false;
	}

	public void AlterarCanal(int newCanal) {
		canal = newCanal;
		if (canal <= 0) {
			canal = 0;
			System.out.println("Erro...Canal invalido");
		}
	}

	public void AlternarCanalUp() {
		canal++;
	}

	public void AlternarCanalDown() {
		canal--;
		if (canal <= 0) {
			canal = 0;
			System.out.println("Erro...Canal invalido");
	}
}}