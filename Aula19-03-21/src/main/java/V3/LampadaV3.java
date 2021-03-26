package V3;

public class LampadaV3 implements DispositivoEletrico {
	
	public LampadaV3() {
		System.out.println("Criando objeto Lampada");
	}

	public void ligar() {
		System.out.println("lâmpada acesa");
	}

	public void desligar() {
		System.out.println("lâmpada apagada");
	}
}
