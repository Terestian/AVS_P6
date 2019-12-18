package workerThread;
import java.util.List;
import java.lang.Math;
import javax.swing.SwingWorker;

import gui.KraftwerkPanel;
import kraftwerk.Kraftwerk;

public class WorkerCurrentPower extends SwingWorker<Integer, Integer>{
	private KraftwerkPanel kwp;
	private Kraftwerk kw; 
    public WorkerCurrentPower (KraftwerkPanel kwp, Kraftwerk kw)
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
