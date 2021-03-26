package V1;

public class Botao_LigaDesliga {
		  public ventilador ventilador;
		  public boolean estado;

		  public Botao_LigaDesliga() {
			ventilador = new ventilador();
			estado = false;
		  }

		  public void pressionar() {
			if (estado) {
				ventilador.desligar();
				estado = false;
			} else {
				ventilador.ligar();
				estado = true;
			}
		  }
		}
