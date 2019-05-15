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

public class UserInterface {
	
	
	private static JTextField nopol;
	private static JTextField jammasuk;
	private static JTextField jamkeluar;
	private static JTextField id;
	static DefaultTableModel model;
	static int TotalTempat = 100;
	static int jmlData = 0;
	static int tmppp = 0;
	DefaultTableModel tableModel;
	public static String tmp;
	private JTextField txtCari;
	static JComboBox comboBox;
	private static JLabel totaltempat, totalpakai, lblTersedia, tersedia , nopolinfo , masukinfo , jenisinfo,keluarinfo,hargainfo,waktuinfo;
	private static time waktu;
	static JFrame frame = new JFrame();
	private static int getStrToInt(String n) {
        return Integer.parseInt(n);
    }
	
	public static void main(String args[]) throws SQLException {
	// membuat objek	
	histori x = new histori();
	kendaraan X = new kendaraan();
	time Y = new time();
	tentang t = new tentang();
	t.frame.setVisible(false);
    frame.setTitle("ParkirAja");
    
    
    
    frame.getContentPane().setBackground(Color.WHITE);

    Object columnNames[] = {"ID", "Plat No", "Tipe Kendaraan","Jam Masuk"};
    frame.getContentPane().setLayout(null);
    model = new DefaultTableModel(columnNames,0);
    JTable table = new JTable();
    table.setModel(model);
    X.getDataTable();
    

    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setBounds(9, 300, 543, 222);
    frame.getContentPane().add(scrollPane);
    
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(SystemColor.textHighlight);
    panel.setBounds(8, 0, 753, 74);
    frame.getContentPane().add(panel);
    
    JLabel lblNewLabel = new JLabel("Parkir AJA");
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
    lblNewLabel.setBounds(292, 13, 167, 33);
    panel.add(lblNewLabel);
    
    JPanel panel_1 = new JPanel();
    panel_1.setLayout(null);
    panel_1.setBackground(Color.GREEN);
    panel_1.setBounds(8, 130, 313, 158);
    frame.getContentPane().add(panel_1);
    
    JLabel label_1 = new JLabel("No Kendaraan");
    label_1.setForeground(Color.BLACK);
    label_1.setBounds(12, 25, 80, 16);
    panel_1.add(label_1);
    
    nopol = new JTextField();
    nopol.setColumns(10);
    nopol.setBounds(112, 25, 161, 28);
    panel_1.add(nopol);
    
    JLabel label_2 = new JLabel("Tipe Kendaraan");
    label_2.setForeground(Color.BLACK);
    label_2.setBounds(12, 67, 95, 28);
    panel_1.add(label_2);
    
    JButton simpan = new JButton("Simpan");
    
   	simpan.setForeground(Color.BLACK);
    simpan.setBackground(Color.WHITE);
    simpan.setBounds(12, 108, 95, 28);
    panel_1.add(simpan);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setForeground(Color.BLACK);
    comboBox.setBackground(Color.WHITE);
    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Motor", "Mobil"}));
    comboBox.setBounds(112, 70, 161, 25);
    panel_1.add(comboBox);
    
    JPanel panel_2 = new JPanel();
    panel_2.setForeground(Color.GREEN);
    panel_2.setLayout(null);
    panel_2.setBackground(Color.GREEN);
    panel_2.setBounds(330, 79, 222, 210);
    frame.getContentPane().add(panel_2);
    
    JButton hapus = new JButton("Keluar");
    
    hapus.setForeground(Color.WHITE);
    hapus.setBackground(Color.RED);
    hapus.setBounds(35, 163, 95, 28);
    panel_2.add(hapus);
    
    jamkeluar = new JTextField();
    jamkeluar.setColumns(10);
    jamkeluar.setBounds(81, 97, 110, 25);
    panel_2.add(jamkeluar);
    
    JLabel label_4 = new JLabel("Jam Keluar");
    label_4.setBounds(12, 97, 69, 25);
    panel_2.add(label_4);
    
    JLabel label_5 = new JLabel("ID");
    label_5.setBounds(12, 59, 69, 25);
    panel_2.add(label_5);
    
    id = new JTextField();
    id.setColumns(10);
    id.setBounds(81, 59, 110, 25);
    panel_2.add(id);
    
    JPanel panel_3 = new JPanel();
    panel_3.setLayout(null);
    panel_3.setBackground(new Color(153, 153, 255));
    panel_3.setBounds(560, 80, 201, 210);
    frame.getContentPane().add(panel_3);
    
    JLabel label_6 = new JLabel("Sekedar Info");
    label_6.setForeground(Color.WHITE);
    label_6.setBounds(48, 13, 95, 15);
    panel_3.add(label_6);
    
    JLabel totaltempat = new JLabel("");
    totaltempat.setForeground(Color.WHITE);
    totaltempat.setFont(new Font("Tahoma", Font.PLAIN, 13));
    totaltempat.setBounds(12, 41, 165, 32);
    panel_3.add(totaltempat);
    
    totalpakai = new JLabel("");
    totalpakai.setForeground(Color.WHITE);
    totalpakai.setFont(new Font("Tahoma", Font.PLAIN, 13));
    totalpakai.setBounds(12, 86, 169, 28);
    panel_3.add(totalpakai);
    
    JLabel tersedia = new JLabel("");
    tersedia.setForeground(Color.WHITE);
    tersedia.setFont(new Font("Tahoma", Font.PLAIN, 13));
    tersedia.setBounds(12, 135, 169, 28);
    panel_3.add(tersedia);
    
    JPanel panel_4 = new JPanel();
    panel_4.setBackground(Color.RED);
    panel_4.setLayout(null);
    panel_4.setBounds(561, 300, 201, 220);
    frame.getContentPane().add(panel_4);
    
    JLabel label_10 = new JLabel("2 RIBU / JAM");
    label_10.setForeground(Color.WHITE);
    label_10.setBounds(54, 0, 95, 28);
    panel_4.add(label_10);
    
    JLabel nopolinfo = new JLabel("");
    nopolinfo.setForeground(Color.WHITE);
    nopolinfo.setBounds(12, 30, 177, 28);
    panel_4.add(nopolinfo);
    
    JLabel masukinfo = new JLabel("");
    masukinfo.setForeground(Color.WHITE);
    masukinfo.setBounds(12, 90, 177, 28);
    panel_4.add(masukinfo);
    
    JLabel keluarinfo = new JLabel("");
    keluarinfo.setForeground(Color.WHITE);
    keluarinfo.setBounds(12, 120, 177, 28);
    panel_4.add(keluarinfo);
    
    JLabel jenisinfo = new JLabel("");
    jenisinfo.setForeground(Color.WHITE);
    jenisinfo.setBounds(12, 60, 177, 28);
    panel_4.add(jenisinfo);
    
    JLabel hargainfo = new JLabel("");
    hargainfo.setForeground(Color.WHITE);
    hargainfo.setBounds(12, 180, 177, 28);
    panel_4.add(hargainfo);
    
    JLabel waktuinfo = new JLabel("");
    waktuinfo.setForeground(Color.WHITE);
    waktuinfo.setBounds(12, 150, 177, 28);
    panel_4.add(waktuinfo);
    
    JPanel panel_6 = new JPanel();
    panel_6.setBackground(Color.WHITE);
    panel_6.setBounds(0, 0, 201, 220);
    panel_4.add(panel_6);
    panel_6.setVisible(false);
    
    
    
    JPanel panel_5 = new JPanel();
    panel_5.setBackground(new Color(153, 153, 255));
    panel_5.setBounds(9, 79, 314, 44);
    frame.getContentPane().add(panel_5);
    panel_5.setLayout(null);
    time waktu = new time();
    waktu.setFont(new Font("Tahoma", Font.PLAIN, 14));
    waktu.setBounds(12, 0, 207, 44);
    panel_5.add(waktu);
    
    JButton exit = new JButton("EXIT");
    exit.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		System.exit(0);
    	}
    });
    exit.setForeground(new Color(255, 255, 255));
    exit.setBackground(new Color(255, 0, 0));
    exit.setBounds(560, 524, 201, 28);
    frame.getContentPane().add(exit);
    
    JButton about = new JButton("ABOUT US");
    about.setBackground(Color.WHITE);
    about.setForeground(Color.BLACK);
    about.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		t.setTitle("About us");
			t.setVisible(true);
			frame.setVisible(false);	
    	}
    });
    about.setBounds(393, 524, 159, 28);
    frame.getContentPane().add(about);
    
    JButton history = new JButton("History");
    history.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		x.histori();
    		x.frame.setTitle("history");
    		x.frame.setVisible(true);
    		frame.setVisible(false);
    	}
    });
    history.setForeground(Color.BLACK);
    history.setBackground(Color.WHITE);
    history.setBounds(162, 526, 159, 28);
    frame.getContentPane().add(history);
    frame.setSize(788, 609);
    frame.setVisible(true);

    simpan.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			// input comboBox
			String tipenya = "";
			if(comboBox.getSelectedIndex() == 0)      tipenya = "MOTOR";
			else if(comboBox.getSelectedIndex() == 1) tipenya = "MOBIL";

			// Memasukan Data
			try {
				if(X.getJmlData() < TotalTempat) {
					Connection konek = konekin.getKoneksi(); //konek ke mysql
					 //perintah sql buat insert datanya 1 - 5
					String sql = "insert into " + konekin.tabel_parkir + "(nopol, tipe, Jam_masuk, keluar, Jam_keluar) values(?, ?, ?, ? , ?)";
					PreparedStatement siapin = konek.prepareStatement(sql); //siapin perintahnya
					siapin.setString(1, nopol.getText().toUpperCase()); 
					siapin.setString(2, tipenya); 
					siapin.setString(3, Y.getJam());
					siapin.setString(4, "tdk");
					siapin.setString(5, "-");
					if(nopol.getText().equals("")) {
			            JOptionPane.showMessageDialog(null,"Nama Tidak Boleh Kosong","Kesalahan",JOptionPane.ERROR_MESSAGE); 
			        }else {
			        siapin.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!"); //Pesan berhasil 
					nopol.setText("");
			        }
					
				} else {
					JOptionPane.showMessageDialog(null, "Parkiran sudah penuh!","Kesalahan",JOptionPane.ERROR_MESSAGE); //Pesan gagal
				}
				totaltempat.setText("Total tempat: " + TotalTempat);
				totalpakai.setText("Tempat Terpakai: " + X.getJmlData());
				tersedia.setText("Tempat tersedia: " + (TotalTempat - X.getJmlData()));
			} catch (Exception ex) { 
				JOptionPane.showMessageDialog(null, "Data gagal ditambahkan!"); ///Pesan gagal
				JOptionPane.showMessageDialog(null, ex); 
			}
			finally { 
				X.getDataTable(); 
				X.getJmlData();
			}
		}
	});
    
    
    
    
   hapus.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		try {
    			ResultSet rs;
    			Connection konek = konekin.getKoneksi(); // Konek database
    			String sql = "update " + konekin.tabel_parkir + " set keluar= ?, jam_keluar= ? where id= ?";
    			String idnomor = "SELECT * FROM parkir WHERE id ='"+id.getText()+"'";
    			
    			
    			// mengetahui adakah id terdapat di database
				PreparedStatement siapin = konek.prepareStatement(idnomor);
				rs = siapin.executeQuery(idnomor);
				tmp = id.getText();
				
				// jika data kosong
				if(id.getText().equals("")) {
		            JOptionPane.showMessageDialog(null,"ID Tidak Boleh Kosong","Kesalahan",JOptionPane.ERROR_MESSAGE);
		            panel_6.setVisible(true);
		        }else if (jamkeluar.getText().equals("")) {
		        	JOptionPane.showMessageDialog(null,"Jam Tidak Boleh Kosong","Kesalahan",JOptionPane.ERROR_MESSAGE);
		        	panel_6.setVisible(true);
		        	tmppp =  1;
		        }else {
		        	panel_6.setVisible(false);
		        	
		        	// apakah id terdapat di database
					if(rs.next()){
		                if(id.getText().equals(rs.getString("id"))){
		                	JOptionPane.showMessageDialog(null, "Kendaraan Berhasil Keluar");
		                }
					 }else{
		                    JOptionPane.showMessageDialog(null, "Data Tidak Ada","Kesalahan",JOptionPane.ERROR_MESSAGE);
		                }
					
			
					// data keluar
					PreparedStatement siapin1 = konek.prepareStatement(sql);
					siapin1.setString(1, "ya");
					siapin1.setString(2, jamkeluar.getText());
					siapin1.setString(3, id.getText());
					siapin1.executeUpdate();	
		        }
				
				
				
				
	        } catch (Exception ex) {
	        	JOptionPane.showMessageDialog(null, "Kendaraan gagal keluar!","Kesalahan",JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, ex);
	    }
			finally {
				X.getdatakeluar();
				X.getDataTable();
				X.getJmlData();
				
				//Menampilkan info kendaraan
				nopolinfo.setText("No Kendaraan  :  "+X.nopol);
				masukinfo.setText("Jam Masuk  :  "+X.masuk);
				jenisinfo.setText("Jenis Kendaraan  :  "+X.jenis);
				keluarinfo.setText("Jam Keluar  :  "+X.out);
				X.konversi();
				hargainfo.setText("Total Harga  :  "+X.hasilint);
				
				// Jumlah Kendaraan
				waktuinfo.setText("Total Waktu  :  "+X.waktu+" Jam");
				totaltempat.setText("Total tempat: " + TotalTempat);
				totalpakai.setText("Tempat Terpakai: " + X.getJmlData());
				tersedia.setText("Tempat tersedia: " + (TotalTempat - X.getJmlData()));
				}
			}
		});
	}
}