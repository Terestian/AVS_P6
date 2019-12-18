package gui;

import javax.swing.JPanel;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.rmi.RemoteException;
import javax.swing.border.EtchedBorder;

import kraftwerk.Kraftwerk;

public class KraftwerkPanel extends JPanel {

	private JLabel lblName;
	private JLabel lblStandort;
	private JLabel lblKraftwerkType; 
	private JLabel lblLeistung;
	private JLabel lblErzEnergie; 
	private JLabel lblNennleistung;
	/**
	 * Create the panel.
	 * @throws RemoteException 
	 */
	public KraftwerkPanel() {

		setBorder(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[] {0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel blblName = new JLabel("Name:");
		GridBagConstraints gbc_blblName = new GridBagConstraints();
		gbc_blblName.anchor = GridBagConstraints.NORTHWEST;
		gbc_blblName.insets = new Insets(0, 0, 5, 5);
		gbc_blblName.gridx = 0;
		gbc_blblName.gridy = 0;
		add(blblName, gbc_blblName);
		
		lblName = new JLabel();
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 0;
		add(lblName, gbc_lblName);
		
		JLabel blblStandort = new JLabel("Standort:");
		GridBagConstraints gbc_blblStandort = new GridBagConstraints();
		gbc_blblStandort.anchor = GridBagConstraints.NORTHWEST;
		gbc_blblStandort.insets = new Insets(0, 0, 5, 5);
		gbc_blblStandort.gridx = 0;
		gbc_blblStandort.gridy = 1;
		add(blblStandort, gbc_blblStandort);
		
		lblStandort = new JLabel();
		GridBagConstraints gbc_lblStandort = new GridBagConstraints();
		gbc_lblStandort.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblStandort.insets = new Insets(0, 0, 5, 5);
		gbc_lblStandort.gridx = 1;
		gbc_lblStandort.gridy = 1;
		add(lblStandort, gbc_lblStandort);
		
		JLabel blblKraftwerkType = new JLabel("Kraftwerktyp:");
		GridBagConstraints gbc_blblKraftwerkType = new GridBagConstraints();
		gbc_blblKraftwerkType.anchor = GridBagConstraints.NORTHWEST;
		gbc_blblKraftwerkType.insets = new Insets(0, 0, 5, 5);
		gbc_blblKraftwerkType.gridx = 0;
		gbc_blblKraftwerkType.gridy = 2;
		add(blblKraftwerkType, gbc_blblKraftwerkType);
		
		lblKraftwerkType = new JLabel();
		GridBagConstraints gbc_lblKraftwerkType = new GridBagConstraints();
		gbc_lblKraftwerkType.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblKraftwerkType.insets = new Insets(0, 0, 5, 5);
		gbc_lblKraftwerkType.gridx = 1;
		gbc_lblKraftwerkType.gridy = 2;
		add(lblKraftwerkType, gbc_lblKraftwerkType);
		
		
		JLabel blblMomentanleistung = new JLabel("Momentanleistung:");
		GridBagConstraints gbc_blblMomentanleistung = new GridBagConstraints();
		gbc_blblMomentanleistung.insets = new Insets(0, 0, 5, 5);
		gbc_blblMomentanleistung.anchor = GridBagConstraints.NORTHWEST;
		gbc_blblMomentanleistung.gridx = 0;
		gbc_blblMomentanleistung.gridy = 3;
		add(blblMomentanleistung, gbc_blblMomentanleistung);
		
		lblLeistung = new JLabel();
		GridBagConstraints gbc_lblLeistung = new GridBagConstraints();
		gbc_lblLeistung.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblLeistung.insets = new Insets(0, 0, 5, 5);
		gbc_lblLeistung.gridx = 1;
		gbc_lblLeistung.gridy = 3;
		add(lblLeistung, gbc_lblLeistung);
		
		JLabel blblKw1 = new JLabel("kW");
		GridBagConstraints gbc_blblKw1 = new GridBagConstraints();
		gbc_blblKw1.insets = new Insets(0, 0, 5, 0);
		gbc_blblKw1.anchor = GridBagConstraints.NORTHWEST;
		gbc_blblKw1.gridx = 2;
		gbc_blblKw1.gridy = 3;
		add(blblKw1, gbc_blblKw1);
		
		JLabel blblComleistung = new JLabel("Erzeugte Energie:");
		GridBagConstraints gbc_blblComleistung = new GridBagConstraints();
		gbc_blblComleistung.insets = new Insets(0, 0, 5, 5);
		gbc_blblComleistung.anchor = GridBagConstraints.NORTHWEST;
		gbc_blblComleistung.gridx = 0;
		gbc_blblComleistung.gridy = 4;
		add(blblComleistung, gbc_blblComleistung);
		
		lblErzEnergie = new JLabel();
		GridBagConstraints gbc_lblErzEnergie = new GridBagConstraints();
		gbc_lblErzEnergie.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblErzEnergie.insets = new Insets(0, 0, 5, 5);
		gbc_lblErzEnergie.gridx = 1;
		gbc_lblErzEnergie.gridy = 4;
		add(lblErzEnergie, gbc_lblErzEnergie);
		
		JLabel blblKw2 = new JLabel("kWh");
		GridBagConstraints gbc_blblKw2 = new GridBagConstraints();
		gbc_blblKw2.anchor = GridBagConstraints.NORTHWEST;
		gbc_blblKw2.insets = new Insets(0, 0, 5, 0);
		gbc_blblKw2.gridx = 2;
		gbc_blblKw2.gridy = 4;
		add(blblKw2, gbc_blblKw2);
		
		
		JLabel blblNennleistung = new JLabel("Nennleistung:");
		GridBagConstraints gbc_blblNennleistung = new GridBagConstraints();
		gbc_blblNennleistung.anchor = GridBagConstraints.NORTHWEST;
		gbc_blblNennleistung.insets = new Insets(0, 0, 5, 5);
		gbc_blblNennleistung.gridx = 0;
		gbc_blblNennleistung.gridy = 5;
		add(blblNennleistung, gbc_blblNennleistung);
		
		lblNennleistung = new JLabel();
		GridBagConstraints gbc_lblNennleistung = new GridBagConstraints();
		gbc_lblNennleistung.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNennleistung.insets = new Insets(0, 0, 5, 5);
		gbc_lblNennleistung.gridx = 1;
		gbc_lblNennleistung.gridy = 5;
		add(lblNennleistung, gbc_lblNennleistung);
		
		JLabel blblKw3 = new JLabel("kW");
		GridBagConstraints gbc_blblKw3 = new GridBagConstraints();
		gbc_blblKw3.insets = new Insets(0, 0, 5, 0);
		gbc_blblKw3.anchor = GridBagConstraints.NORTHWEST;
		gbc_blblKw3.gridx = 2;
		gbc_blblKw3.gridy = 5;
		add(blblKw3, gbc_blblKw3);

	}
	
	public void setName(String name)
	{
		lblName.setText(name);
	}
	
	public void setStandort(String standort)
	{
		lblStandort.setText(standort);
	}
	
	public void setKraftwerkType(String kraftwerktype)
	{
		lblKraftwerkType.setText(kraftwerktype);
	}
	
	public void setLeistung(String leistung)
	{
		lblLeistung.setText(leistung);
	}
	
	public void setEnergieErzeugt(String erzEnergie)
	{
		lblErzEnergie.setText(erzEnergie);
	}
	
	public void setNennleistung(String nennleistung)
	{
		lblNennleistung.setText(nennleistung);
	}
	
}
