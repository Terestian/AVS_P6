package workerThread;
import java.util.List;
import java.lang.Math;
import javax.swing.SwingWorker;

import gui.KraftwerkPanel;
import kraftwerk.Kraftwerk;

public class WorkerComPower extends SwingWorker<Integer, Integer>{
	private KraftwerkPanel kwp;
	private Kraftwerk kw; 
    public WorkerComPower (KraftwerkPanel kwp, Kraftwerk kw)
    {
    	this.kwp = kwp;
    	this.kw = kw;  
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
            publish (kw.getEnergieErzeugt());
        }
        return counter;
    }
    // Wird vom Event-Dispatch-Thread aufgerufen.
    protected void process (List<Integer> energieErzeugt)
    {
        // Für jedes einzelne Zwischenergebnis aus der Liste.
    	for (Integer ee : energieErzeugt) {
    		kwp.setEnergieErzeugt(ee.toString());
		}
    }
}
