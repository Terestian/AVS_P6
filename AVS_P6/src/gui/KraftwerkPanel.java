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

	private JLabel lblLeistung;
	private Kraftwerk kw;
	/**
	 * Create the panel.
	 * @throws RemoteException 
	 */
	public KraftwerkPanel(Kraftwerk kw) {
		this.kw = kw;
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
		
		JLabel lblName = new JLabel(this.kw.getName());
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
		
		JLabel lblStandort = new JLabel(this.kw.getStandort());
		GridBagConstraints gbc_lblStandort = new GridBagConstraints();
		gbc_lblStandort.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblStandort.insets = new Insets(0, 0, 5, 5);
		gbc_lblStandort.gridx = 1;
		gbc_lblStandort.gridy = 1;
		add(lblStandort, gbc_lblStandort);
		
		JLabel blblMomentanleistung = new JLabel("Momentanleistung:");
		GridBagConstraints gbc_blblMomentanleistung = new GridBagConstraints();
		gbc_blblMomentanleistung.insets = new Insets(0, 0, 5, 5);
		gbc_blblMomentanleistung.anchor = GridBagConstraints.NORTHWEST;
		gbc_blblMomentanleistung.gridx = 0;
		gbc_blblMomentanleistung.gridy = 2;
		add(blblMomentanleistung, gbc_blblMomentanleistung);
		
		lblLeistung = new JLabel(this.kw.getLeistung()+"");
		GridBagConstraints gbc_lblLeistung = new GridBagConstraints();
		gbc_lblLeistung.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblLeistung.insets = new Insets(0, 0, 5, 5);
		gbc_lblLeistung.gridx = 1;
		gbc_lblLeistung.gridy = 2;
		add(lblLeistung, gbc_lblLeistung);
		
		JLabel blblKw1 = new JLabel("kW");
		GridBagConstraints gbc_blblKw1 = new GridBagConstraints();
		gbc_blblKw1.insets = new Insets(0, 0, 5, 0);
		gbc_blblKw1.gridx = 2;
		gbc_blblKw1.gridy = 2;
		add(blblKw1, gbc_blblKw1);
		
		JLabel blblNennleistung = new JLabel("Nennleistung:");
		GridBagConstraints gbc_blblNennleistung = new GridBagConstraints();
		gbc_blblNennleistung.anchor = GridBagConstraints.NORTHWEST;
		gbc_blblNennleistung.insets = new Insets(0, 0, 5, 5);
		gbc_blblNennleistung.gridx = 0;
		gbc_blblNennleistung.gridy = 3;
		add(blblNennleistung, gbc_blblNennleistung);
		
		JLabel lblNennleistung = new JLabel(this.kw.getNennleistungOn()+"");
		GridBagConstraints gbc_lblNennleistung = new GridBagConstraints();
		gbc_lblNennleistung.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNennleistung.insets = new Insets(0, 0, 5, 5);
		gbc_lblNennleistung.gridx = 1;
		gbc_lblNennleistung.gridy = 3;
		add(lblNennleistung, gbc_lblNennleistung);
		
		JLabel blblKw2 = new JLabel("kW");
		GridBagConstraints gbc_blblKw2 = new GridBagConstraints();
		gbc_blblKw2.insets = new Insets(0, 0, 5, 0);
		gbc_blblKw2.gridx = 2;
		gbc_blblKw2.gridy = 3;
		add(blblKw2, gbc_blblKw2);
		
		JLabel lblDELETEME = new JLabel(" ");
		GridBagConstraints gbc_lblDELETEME = new GridBagConstraints();
		gbc_lblDELETEME.insets = new Insets(0, 0, 0, 5);
		gbc_lblDELETEME.gridx = 0;
		gbc_lblDELETEME.gridy = 4;
		add(lblDELETEME, gbc_lblDELETEME);
	}
	
	public void setLeistung(String leistung)
	{
		lblLeistung.setText(leistung);
	}
	
}
