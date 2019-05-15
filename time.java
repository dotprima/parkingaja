package com.parkirin.aja;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class time extends JLabel implements ActionListener {
     private SimpleDateFormat format;
  	 private Timer timer;
     private Date date;
     
     //Realtime tanggal & waktu
     public time() {
         timer = new Timer(1000, this);
         format = new SimpleDateFormat("dd MMMM yyyy, HH:m:ss");
         date = new Date();
         timer.start();
     }
	
     public void actionPerformed(ActionEvent e) {
 		date.setTime(System.currentTimeMillis());
         this.setText(format.format(date));
 	}
     
     // Jam input ke database
	 public static  String getJam() {
			Date tgl = new Date();
			SimpleDateFormat formatnya = new SimpleDateFormat("HH"); 
			String tanggalnya = formatnya.format(tgl);

			//yuk, modif
			String tggl = tanggalnya ;
			String jms  = tggl ;
			return jms; 
		}


	
}

