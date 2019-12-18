package kraftwerk;

import java.lang.Math;


public class Kraftwerk
{
	private double gesamtLeistung, nennleistung, leistung;
	private String name, standort, kraftwerktype;

	public Kraftwerk(String name, String standort, String kraftwerktype, double nennleistung){
		
		this.name = name; 
		this.standort = standort;
		this.kraftwerktype = kraftwerktype;
		this.nennleistung = nennleistung;
		leistung = 0;
	
	}

	
	
	/**
	* abstrakte Methode energieErzeugt 
	* @return  erzeugte Energie pro Zeiteinheit in MWh
	*/
	
	public double energieErzeugt(){
		return gesamtLeistung;
	}
	
	/**
	* Methode getNennleistungOn
	* @return Nennleistung in MW, 0 falls ausgeschaltet
	*/
	
	public double getNennleistungOn(){
		return nennleistung;
	}
	
	/**
	 * Methode to get KW name
	 * @return name of kw
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Getter for powerplant type
	 * @return type 
	 */
	public String getType() {
		return kraftwerktype;
	}
	
	/**
	* Methode getLeistungNext
	* @return Leistung in MW, 0 falls ausgeschaltet
	*/
	
	public double getLeistung(){
		return leistung;
	}
	
	/**
	 * Methode getStandort
	 * @return Standort des Kraftwerks
	 */
	
	public String getStandort() {
		return standort;
	}
	
}