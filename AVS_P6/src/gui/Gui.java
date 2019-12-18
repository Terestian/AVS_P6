package gui;

import javax.swing.*;

import kraftwerk.Kraftwerk;

import java.awt.GridLayout;
import java.awt.event.*;
import java.util.*;

public class Gui {
	private static final int N=2;
    

    public static void main (String[] args)
    {
    	createGUI();
    }

    private static void createGUI()
    {
        JFrame frame = new JFrame ("Einsatz eines Worker-Threads");
        frame.setLayout (new GridLayout(N,3));
        /*for(int i=0; i<N; i++){
            addKraftwerk(i, new Kraftwerk("A", "B", "c", 1000), frame);
        }*/
        Kraftwerk kw = new Kraftwerk("A", "B", "c", 1000);
        KraftwerkPanel kwp = new KraftwerkPanel(kw);
        frame.add(kwp);
        frame.setSize (400, 400);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
    }

    /*private static void addKraftwerk(final int i, Kraftwerk kw, JFrame frame){
        
    }*/
}
