package kraftwerk;

import java.util.List;

import javax.swing.SwingWorker;

import gui.KraftwerkPanel;

public class Kraftwerk extends SwingWorker<Integer, double[]>
{
	private KraftwerkPanel kwp;
	private double gesamtLeistung, nennleistung, leistung = 0.0;
	private String name, standort, kraftwerktype;
	private double values[] = new double[2];

	public Kraftwerk(String name, String standort, String kraftwerktype, double nennleistung, KraftwerkPanel kwp){
		
		this.name = name; 
		this.standort = standort;
		this.kraftwerktype = kraftwerktype;
		this.nennleistung = nennleistung;
		this.kwp = kwp;
		this.execute();
		kwp.setName(this.name);
		kwp.setStandort(this.standort);
		kwp.setKraftwerkType(this.kraftwerktype);
		kwp.setNennleistung(this.nennleistung+"");
	}
	
	public double getEnergieErzeugt(){
		return gesamtLeistung;
	}
	
	/**
	* Methode getNennleistungOn
	* @return Nennleistung in MW, 0 falls ausgeschaltet
	*/
	
	public double getNennleistungOn(){
		return nennleistung;
	}
	
	public void setLeistung(Double leistung) {
		this.leistung = (Math.round(leistung * 100) / 100) ;
		gesamtLeistung += this.leistung;
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
            setLeistung((((10 - Math.random()) / 10) * nennleistung));
            values[0] = getLeistung();
            values[1] = getEnergieErzeugt();
            publish (values);
        }
        return counter;
    }

	
    // Wird vom Event-Dispatch-Thread aufgerufen.
    protected void process (List<double[]> powerData)
    {
        // Für jedes einzelne Zwischenergebnis aus der Liste.
    	for (double[] pd : powerData) {
    		kwp.setLeistung(pd[0]+"");
    		kwp.setEnergieErzeugt(pd[1]+"");
		}
    }
	
}