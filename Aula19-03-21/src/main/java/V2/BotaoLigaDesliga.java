package V2;

public class BotaoLigaDesliga {
	DispositivoEletrico dispositivo;
	  boolean estado;

	  public BotaoLigaDesliga() {
			dispositivo = new ArCondicionado();
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
	}

