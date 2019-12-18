package kraftwerk;

import java.util.List;

import javax.swing.SwingWorker;

import gui.KraftwerkPanel;

public class Kraftwerk extends SwingWorker<Integer, Integer>
{
	private KraftwerkPanel kwp;
	private Kraftwerk kw; 
	private int gesamtLeistung, nennleistung, leistung;
	private String name, standort, kraftwerktype;

	public Kraftwerk(String name, String standort, String kraftwerktype, int nennleistung){
		
		this.name = name; 
		this.standort = standort;
		this.kraftwerktype = kraftwerktype;
		this.nennleistung = nennleistung;
        this.execute();
		leistung = 0;
	
	}
	
	public int getEnergieErzeugt(){
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
            // Zwischenergebnis bereitstellen.
            kw.setLeistung( (int) (((10 - Math.random()) / 10) * kw.getNennleistungOn()));
            publish (kw.getLeistung());
        }
        return counter;
    }

	
    // Wird vom Event-Dispatch-Thread aufgerufen.
    protected void process (List<Integer> currentPower)
    {
        // Für jedes einzelne Zwischenergebnis aus der Liste.
    	for (Integer cp : currentPower) {
    		kwp.setLeistung(cp.toString());
		}
    }
	
}