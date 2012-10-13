/**
 * @author deben beginner!!
 *
 * Ogni brano con autore, titolo, formato;
 *
 *
 */

public class BranoDigitale {

	String autore;
	String titolo;
	String formato;
	
	public BranoDigitale(String autore, String titolo) {
		this.autore = autore;
		this.titolo = titolo;
		this.formato = null;
	}
	
	public BranoDigitale(String autore, String titolo, String formato){
		this.autore = autore;
		this.titolo = titolo;
		this.formato = formato;
	}
	
	public String getAutore(){
		return this.autore;
	}
	
	public String getTitolo(){
		return this.titolo;
	}
	
	public String getFormato(){
		return this.formato;
	}
	
	public void setFormato(String nuovoFormato){
		this.formato = nuovoFormato;
	}

	public void stampaBrano(){
		System.out.println("Titolo: "+this.titolo
				+ " Autore: "+ this.autore
				+ " Formato: " + this.formato);
	}
	
}








