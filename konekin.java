package com.parkirin.aja;

import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class konekin {
	private static Connection koneksi;
	

	public static String tabel_parkir = "parkir";    //tabel parkir kendaraan



	public static Connection getKoneksi() {
		if(koneksi == null) {
			try {
				DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
				koneksi = DriverManager.getConnection("jdbc:mysql://localhost/parkiran","root",""); // lokasi database
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex); // Exception Error
			}
		}
		return koneksi; 
	}



}