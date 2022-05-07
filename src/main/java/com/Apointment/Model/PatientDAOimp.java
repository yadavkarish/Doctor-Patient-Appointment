package com.Apointment.Model;

import java.sql.ResultSet;


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


public PatientSettingData patientProfileGetData() {

String DQL ="select * from patientProfileSetting ";

PatientSettingData psd = new PatientSettingData();
try {

PreparedStatement ps=(PreparedStatement) con.prepareStatement(DQL);
// ps.setString(1, DQL);
ResultSet rs = ps.executeQuery();

if(rs.next()) {

psd.setFirstName(rs.getString("firstName"));
psd.setLastName(rs.getString("lastName"));
psd.setBloodGroup(rs.getString("bloodGroup"));
psd.setDateOfBirth(rs.getString("dateOfBirth"));
psd.setEmailId(rs.getString("emailId"));
psd.setMobile(rs.getString("mobile"));
psd.setAddress(rs.getString("address"));
psd.setCity(rs.getString("city"));
psd.setState(rs.getString("state"));
psd.setZipCode(rs.getString("zipCode"));
psd.setCountry(rs.getString("country"));

}else {

System.out.println("data is empty");

}


}catch(Exception e) {
e.printStackTrace();

}


return psd;
}

public int patientProfileInsData(PatientSettingData psd)
{
String DML="insert into patientProfileSetting values(?,?,?,?,?,?,?,?,?,?,?)";
try {



PreparedStatement ps=(PreparedStatement) con.prepareStatement(DML);

ps.setString(1,psd.getFirstName());
ps.setString(2,psd.getLastName());
ps.setString(3,psd.getBloodGroup());
ps.setString(4,psd.getDateOfBirth());
ps.setString(5,psd.getEmailId());
ps.setString(6,psd.getMobile());
ps.setString(7,psd.getAddress());
ps.setString(8,psd.getCity());
ps.setString(9,psd.getState());
ps.setString(10,psd.getZipCode());
ps.setString(11,psd.getCountry());

ps.executeUpdate();

}catch(Exception e) {

e.printStackTrace();
return 0;

}

return 1;
}


  public int patientProfileUpdateData(PatientSettingData psd) {
 String DML="UPDATE patientProfileSetting SET firstName=?,lastName=?,bloodGroup=?,dateOfBirth=?,emailId=?,mobile=?,address=?,city=?,state=?,zipCode=?,country=? WHERE mobile=?";
 
 try {
 
 PreparedStatement ps=(PreparedStatement) con.prepareStatement(DML);
 
 ps.setString(1,psd.getFirstName());
 ps.setString(2,psd.getLastName());
 ps.setString(3,psd.getBloodGroup());
 ps.setString(4,psd.getDateOfBirth());
 ps.setString(5,psd.getEmailId());
 ps.setString(6,psd.getMobile());
 ps.setString(7,psd.getAddress());
 ps.setString(8,psd.getCity());
 ps.setString(9,psd.getState());
 ps.setString(10,psd.getZipCode());
 ps.setString(11,psd.getCountry());
 ps.setString(12,psd.getMobile());
 
 ps.executeUpdate();
 
 }catch(Exception e) {
 
 e.printStackTrace(); return 0;
 
 }
 
 return 1;
 
}
 
 




}