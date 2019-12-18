package kraftwerk;

public class Kraftwerk
{
	private int gesamtLeistung, nennleistung, leistung;
	private String name, standort, kraftwerktype;

	public Kraftwerk(String name, String standort, String kraftwerktype, int nennleistung){
		
		this.name = name; 
		this.standort = standort;
		this.kraftwerktype = kraftwerktype;
		this.nennleistung = nennleistung;
		leistung = 0;
	
	}
	
	public int energieErzeugt(){
		return gesamtLeistung;
	}
	
	/**
	* Methode getNennleistungOn
	* @return Nennleistung in MW, 0 falls ausgeschaltet
	*/
	
	public int getNennleistungOn(){
		return nennleistung;
	}
	
	public void setLeistung(int leistung) {
		this.leistung = leistung;
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
	
	public int getLeistung(){
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