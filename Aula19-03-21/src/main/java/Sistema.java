
import V3.ArCondicionado;
import V3.BotaoLigaDesliga;
import V3.LampadaV3;
import V3.Ventilador;

public class Sistema {
	public static  void main (String[] args) {
		V3.BotaoLigaDesliga botaoLigaDesliga = new V3.BotaoLigaDesliga(new LampadaV3());
		 
		botaoLigaDesliga.pressionar();
		botaoLigaDesliga.pressionar();
		
		BotaoLigaDesliga botaoLigaDesliga2 = new BotaoLigaDesliga(new ArCondicionado());
		botaoLigaDesliga.pressionar();
		botaoLigaDesliga.pressionar();
		
		botaoLigaDesliga.setDispositivo(new Ventilador());
		botaoLigaDesliga.pressionar();
		botaoLigaDesliga.pressionar();
	}
}
