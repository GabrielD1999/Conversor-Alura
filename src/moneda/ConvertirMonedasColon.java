package moneda;
import javax.swing.JOptionPane;

public class ConvertirMonedasColon {
	
	/*El colón salvadoreño dejo de existir en el año 2001 debido a la
	  dolarización en El Salvador, su valor en aquel entonces era
	  $1 (1 dolar estadounidense = 8.75 colones salvadoreños
	  se tomo en cuenta este dato para la conversion.  */

	public void ConvertirDolaresAColones(double valor) {
		double monedaDolar = valor * 8.75;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Colones Salvadoreños");
	}
	
	public void ConvertirEurosAColones(double valor) {
		double monedaEuro = valor * 9.70;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Colones Salvadoreños");
	}
	
	public void ConvertirLibrasAColones(double valor) {
		double monedaLibra = valor * 11.32;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Colones Salvadoreños");
	}
	
	public void ConvertirYenAColones(double valor) {
		double monedaYen = valor * 0.062;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Colones Salvadoreños");
	}
	
	public void ConvertirWonAColones(double valor) {
		double monedaWon = valor * 0.0069;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Colones Salvadoreños");
	}
}
