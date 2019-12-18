package gui;

import javax.swing.*;

import kraftwerk.Kraftwerk;

import java.awt.GridLayout;
import java.awt.event.*;
import java.util.*;

public class Gui {
	private static final int N=5;
	private static Kraftwerk kw;
	private static KraftwerkPanel kwp;

    public static void main (String[] args)
    {
    	createGUI();
    }

    private static void createGUI()
    {
        JFrame frame = new JFrame ("Einsatz eines Worker-Threads");
        frame.setLayout (new GridLayout(N,3));
        
        for (int i = 0; i < N; i++) {
        	kwp = new KraftwerkPanel();
        	Kraftwerk kw = new Kraftwerk("HAW " + i, "Hamburg", "AKW", 1000.0, kwp);
            frame.add(kwp);
		}
        frame.setSize (400, 700);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
    }

}
