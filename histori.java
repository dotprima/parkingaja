package com.parkirin.aja;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.parkirin.aja.konekin;



import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;

public class histori extends JFrame {
	public histori() {
	}
	
	
	static DefaultTableModel model;
	DefaultTableModel tableModel;
	static JFrame frame = new JFrame();


	public static void histori() {
		UserInterface ui = new UserInterface ();
		kendaraan X = new kendaraan();	
	    frame.getContentPane().setBackground(Color.WHITE);

	    Object columnNames[] = {"ID", "Plat No", "Tipe Kendaraan","Jam Masuk","Jam Keluar"};
	    frame.getContentPane().setLayout(null);
	    model = new DefaultTableModel(columnNames,0);
	    JTable table = new JTable();
	    table.setBackground(Color.WHITE);
	    table.setModel(model);
	    X.gethistoryTable();

	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(12, 0, 672, 280);
	    frame.getContentPane().add(scrollPane);
	    
	    JButton btnNewButton = new JButton("Kembali");
	    btnNewButton.setBounds(24, 314, 97, 33);
	    btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.GREEN);
	    frame.getContentPane().add(btnNewButton);
	    
	   
	
	    frame.setSize(715, 414);
	    frame.setVisible(true);
	    
	    btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ui.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
	}
}