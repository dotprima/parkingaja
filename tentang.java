package com.parkirin.aja;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tentang extends JFrame {
	static JFrame frame = new JFrame();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setTitle("About US");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tentang() {
		UserInterface ui = new UserInterface ();
		ui.frame.setVisible(false);
		setBounds(100, 100, 403, 323);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nama : Prima Nugraha");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(34, 13, 201, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNim = new JLabel("NIM : 3411171131");
		lblNim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNim.setBounds(71, 49, 201, 38);
		contentPane.add(lblNim);
		
		JButton btnNewButton = new JButton("Menu Utama");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ui.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 219, 116, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNamaNovianto = new JLabel("Nama : Novianto Heri D");
		lblNamaNovianto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNamaNovianto.setBounds(34, 87, 201, 38);
		contentPane.add(lblNamaNovianto);
		
		JLabel lblNim_1 = new JLabel("NIM : 3411171128");
		lblNim_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNim_1.setBounds(71, 118, 201, 38);
		contentPane.add(lblNim_1);
		
		JLabel lblNamaAhmad = new JLabel("Nama : Ahmad Solihin");
		lblNamaAhmad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNamaAhmad.setBounds(34, 149, 201, 38);
		contentPane.add(lblNamaAhmad);
		
		JLabel lblNim_2 = new JLabel("NIM : 3411171126");
		lblNim_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNim_2.setBounds(71, 184, 201, 38);
		contentPane.add(lblNim_2);
	}
}
