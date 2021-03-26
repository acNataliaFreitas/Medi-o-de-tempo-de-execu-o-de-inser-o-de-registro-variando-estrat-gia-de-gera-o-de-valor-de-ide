package V3;

public class ArCondicionado implements DispositivoEletrico {

	@Override
	public void ligar() {
		System.out.println("ligando ar condicionado");
	}

	@Override
	public void desligar() {
		System.out.println("desligando ar condicionado");
		
	}

}