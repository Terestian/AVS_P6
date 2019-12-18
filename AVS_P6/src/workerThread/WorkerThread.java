package workerThread;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class WorkerThread extends SwingWorker<Integer, Integer>{
	private JLabel label;
    public WorkerThread (JLabel label)
    {
    	this.label = label;
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
            publish (++counter);
        }
        return counter;
    }
    // Wird vom Event-Dispatch-Thread aufgerufen.
    protected void process (List<Integer> zwischenergebnisse)
    {
        // Für jedes einzelne Zwischenergebnis aus der Liste.
        for (Integer zwischenergebnis : zwischenergebnisse)
        {
            label.setText (zwischenergebnis.toString());
            
        }
    }
}
