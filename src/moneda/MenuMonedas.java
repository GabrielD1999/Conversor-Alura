package moneda;
import javax.swing.JOptionPane;

public class MenuMonedas {
	
	ConvertirColonMonedas monedas = new ConvertirColonMonedas();
	ConvertirMonedasColon colones = new ConvertirMonedasColon();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De colones a Dólar", "De colones a Euro", "De colones a Libras","De colones a Yen","De colones a Won Coreano","De Dólar a colones", "De Euro a colones", "De Libras a colones","De Yen a colones","De Won Coreano a colones"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De colones a Dólar":
        	monedas.ConvertirColonesADolares(Minput);
        	break;
        case "De colones a Euro":
        	monedas.ConvertirColonesAEuros(Minput);
        	break;
        case "De colones a Libras":
        	monedas.ConvertirColonesALibras(Minput);
        	break;
        case "De colones a Yen":
        	monedas.ConvertirColonesAYen(Minput);
        	break;
        case "De colones a Won Coreano":
        	monedas.ConvertirColonesAWon(Minput);
        	break;    	    	                          
        case "De Dólar a colones":
        	colones.ConvertirDolaresAColones(Minput);
        	break;
        case "De Euro a colones":
        	colones.ConvertirEurosAColones(Minput);
        	break;
        case "De Libras a colones":
        	colones.ConvertirLibrasAColones(Minput);
        	break;
        case "De Yen a colones":
        	colones.ConvertirYenAColones(Minput);
        	break;
        case "De Won Coreano a colones":
            colones.ConvertirWonAColones(Minput);
            break;
        }      
    }
}
