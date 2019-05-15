package com.parkirin.aja;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class kendaraan {
	public static String nopol,masuk,jenis,out;
	
	public static int masukint,keluarint,hasilint,waktu;
	
	// Konversi string jadi integer 
	public static void konversi () {
		masukint = Integer.parseInt(masuk);
		keluarint = Integer.parseInt(out);
		
		waktu = (keluarint-masukint);
		hasilint = (keluarint-masukint)*2000;
		
	}
	
	// Menampilkan data yang keluar
	public static void getdatakeluar() {
		UserInterface ui = new UserInterface();
		try {
			String a;
			String sql = "select * from " + konekin.tabel_parkir + " where id ='"+ui.tmp+"'";
			Connection konek = konekin.getKoneksi();
			Statement siapin = konek.createStatement();
			ResultSet hasil = siapin.executeQuery(sql);
			while(hasil.next()) { // memanggil data 
				Object keluar[] = new Object[6]; // id
				 //bikin data objek, dia array, jumlahnya 4, dinamai 'data'. nanti buat nampung hasil select dari mysql
				//yuk, ambil datanya dari mysql
				keluar[0] = hasil.getInt(1); //ini baris id, dia auto-increment ya..
				keluar[1] = hasil.getString(2); //ini nopol
				keluar[2] = hasil.getString(3); //ini tipe
				keluar[3] = hasil.getString(4); //jam_masuk
				keluar[4] = hasil.getString(5); //
				keluar[5] = hasil.getString(6); 
				nopol = (String) keluar[1];
				masuk = (String) keluar[3];
				jenis = (String) keluar[2];
				out = (String) keluar[5];
			}
		}catch (Exception ex) {
		
		}
	}
	
	// Menampilkan semua data yang di database ke table
	public static void getDataTable() {
		UserInterface ui = new UserInterface();
		ui.model.getDataVector().removeAllElements();
		ui.model.fireTableDataChanged();
		try {
			String sql = "select * from " + konekin.tabel_parkir + " where keluar = 'tdk'"; 
			Connection konek = konekin.getKoneksi();
			Statement siapin = konek.createStatement();
			ResultSet hasil = siapin.executeQuery(sql);

			while(hasil.next()) { // memanggil data 
				Object data[] = new Object[4]; // id
				 //bikin data objek, dia array, jumlahnya 4, dinamai 'data'. nanti buat nampung hasil select dari mysql
				data[0] = hasil.getInt(1); //ini baris id, dia auto-increment ya..
				data[1] = hasil.getString(2); //ini nopol
				data[2] = hasil.getString(3); //ini tipe
				data[3] = hasil.getString(4); //jam_masuk
				ui.model.addRow(data);
			}
			hasil.close();
			siapin.close();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}
	
	
	public static void gethistoryTable() {
		histori x = new histori();
		x.model.getDataVector().removeAllElements();
		x.model.fireTableDataChanged();
		try {
			String sql = "select * from " + konekin.tabel_parkir + " where keluar = 'ya'"; 
			Connection konek = konekin.getKoneksi();
			Statement siapin = konek.createStatement();
			ResultSet hasil = siapin.executeQuery(sql);

			while(hasil.next()) { // memanggil data 
				Object data[] = new Object[6]; // id
				 //bikin data objek, dia array, jumlahnya 4, dinamai 'data'. nanti buat nampung hasil select dari mysql
				data[0] = hasil.getInt(1); //ini baris id, dia auto-increment ya..
				data[1] = hasil.getString(2); //ini nopol
				data[2] = hasil.getString(3); //ini tipe
				data[3] = hasil.getString(4);
				data[4] = hasil.getString(6);
				x.model.addRow(data);
			}
			hasil.close();
			siapin.close();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}
	}
	
	
	// jumlah data yang ada di database
	public static int getJmlData() {
		UserInterface ui = new UserInterface();
		try {
			String sql = "select count(*) as jumlahnya from " + konekin.tabel_parkir + " where keluar = 'tdk'";
			Connection konek = konekin.getKoneksi();
			Statement siapin = konek.createStatement();
			ResultSet hasil = siapin.executeQuery(sql);
			while(hasil.next()) {
				ui.jmlData = hasil.getInt("jumlahnya");
			}
			return  ui.jmlData;

		} catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex); 
		}
		return ui.TotalTempat;
	}
}
