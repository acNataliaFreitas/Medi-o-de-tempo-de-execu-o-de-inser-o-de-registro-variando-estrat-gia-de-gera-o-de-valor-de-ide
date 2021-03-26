package V2;

public class ArCondicionado implements DispositivoEletrico {

	@Override
	public void ligar() {
		System.out.println("Ligando Ar Condicionado");
	}

	@Override
	public void desligar() {
		System.out.println("Desligando Ar Condicionado");
		
	}
	

}
