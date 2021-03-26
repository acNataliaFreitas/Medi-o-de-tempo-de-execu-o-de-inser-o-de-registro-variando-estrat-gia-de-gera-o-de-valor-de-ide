package V3;

public class BotaoLigaDesliga {
	DispositivoEletrico dispositivo;
	boolean estado;

	public BotaoLigaDesliga(DispositivoEletrico dispositivo) {
		this.dispositivo = dispositivo;
		estado = false;
	}

	public void pressionar() {
		if (estado) {
			dispositivo.desligar();
			estado = false;
		} else {
			dispositivo.ligar();
			estado = true;
		}
	}

	public DispositivoEletrico getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(DispositivoEletrico dispositivo) {
		this.dispositivo = dispositivo;
	}

}
