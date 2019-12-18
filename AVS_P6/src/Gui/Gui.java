package Gui;

public class Gui {
	private static final int N=5;
    private static SwingWorker[] worker= new SwingWorker[N];

    public static void main (String[] args)
    {
        createGUI();
    }

    private static void createGUI()
    {
        JFrame frame = new JFrame ("Einsatz eines Worker-Threads");
        frame.setLayout (new GridLayout(N,3));
        for(int i=0; i<N; i++){
            addWorker(i, frame);
        }
        frame.setSize (400, 100);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
    }

    private static void addWorker(final int i, JFrame frame){
        final JLabel label = new JLabel ("0");
        JButton start = new JButton ("Start " + (i+1));
        start.addActionListener (new ActionListener()
            {
                public void actionPerformed (ActionEvent action)
                {
                    worker[i] = new WorkerThread (label);
                    worker[i].execute();
                }
            });
        JButton stop = new JButton ("Stopp "+(i+1));
        stop.addActionListener (new ActionListener()
            {
                public void actionPerformed (ActionEvent action)
                {
                    worker[i].cancel (true);
                }
            });
        frame.add (start);
        frame.add (stop);
        frame.add (label);
    }
}
