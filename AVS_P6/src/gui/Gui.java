package gui;

import javax.swing.*;

import kraftwerk.Kraftwerk;
import workerThread.WorkerThread;

import java.awt.GridLayout;
import java.awt.event.*;
import java.util.*;

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
            addWorker(i, new Kraftwerk("A", "B", "c", 1000), frame);
        }
        frame.setSize (400, 100);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
    }

    private static void addWorker(final int i, Kraftwerk kw, JFrame frame){
        KraftwerkPanel kwp = new KraftwerkPanel(kw);
        worker[i] = new WorkerThread(kwp, kw);
        worker[i].execute();
        frame.add (kwp);
    }
}
