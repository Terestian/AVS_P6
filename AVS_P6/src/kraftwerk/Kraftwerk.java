package kraftwerk;

import java.util.List;

import javax.swing.SwingWorker;

import gui.KraftwerkPanel;

public class Kraftwerk extends SwingWorker<Integer, Double[]>
{
	private KraftwerkPanel kwp;
	private Double gesamtLeistung, nennleistung, leistung;
	private String name, standort, kraftwerktype;

	public Kraftwerk(String name, String standort, String kraftwerktype, Double nennleistung){
		
		this.name = name; 
		this.standort = standort;
		this.kraftwerktype = kraftwerktype;
		this.nennleistung = nennleistung;
       
		leistung = 0.0;
		this.execute();
	}
	
	public Double getEnergieErzeugt(){
		return gesamtLeistung;
	}
	
	/**
	* Methode getNennleistungOn
	* @return Nennleistung in MW, 0 falls ausgeschaltet
	*/
	
	public Double getNennleistungOn(){
		return nennleistung;
	}
	
	public void setLeistung(Double leistung) {
		this.leistung = leistung;
		gesamtLeistung = leistung + gesamtLeistung;
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
	
	public Double getLeistung(){
		return leistung;
	}
	
	/**
	 * Methode getStandort
	 * @return Standort des Kraftwerks
	 */
	
	public String getStandort() {
		return standort;
	}
	
    @Override
    public Integer doInBackground()
    {
        int counter = 0;
        while (counter < 100 && !isCancelled())
        {
            // Zeitintensive Aufgabe simulieren
            try
            {
                Thread.sleep (100);
            }
            catch (InterruptedException ex)
            {
            	
            }
            Double values[] = new Double[2];
            // Zwischenergebnis bereitstellen.
            setLeistung((((10 - Math.random()) / 10) * nennleistung));
            values[0] = getLeistung();
            values[1] = getEnergieErzeugt();
            publish (values);
        }
        return counter;
    }

	
    // Wird vom Event-Dispatch-Thread aufgerufen.
    protected void process (List<Double[]> currentPower)
    {
        // Für jedes einzelne Zwischenergebnis aus der Liste.
    	for (Double[] cp : currentPower) {
    		kwp.setLeistung(cp[0].toString());
		}
    }
	
}