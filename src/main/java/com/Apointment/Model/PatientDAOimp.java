package com.Apointment.Model;

import com.Apointment.Entity.PatientSettingData;
import com.Apointment.Utill.DBConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class PatientDAOimp {
	static Connection con=null;
	
	public PatientDAOimp()
	{
		con=(Connection) DBConnection.openConnection();
		
	}
	public void patientProfile(PatientSettingData psd)
	{
		try {
		
		String DML="insert into patientProfileSetting values(?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps=(PreparedStatement) con.prepareStatement(DML);
		
		ps.setString(1,psd.getFirstName());
		ps.setString(2,psd.getLastName());
		ps.setString(3,psd.getBloodGroup());
		ps.setString(1,psd.getDateOfBirth());

		ps.executeUpdate();
				
		}catch(Exception e) {System.out.println(e);}		
		
		
	}

}
