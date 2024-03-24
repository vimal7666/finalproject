package com.logic;

import java.io.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.servlet.ServletContext;
import com.mysql.jdbc.ResultSetMetaData;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import db.dbconnection;
import db.dbservice;

@javax.jws.WebService(targetNamespace = "http://logic.com/", serviceName = "RegisterService", portName = "RegisterPort", wsdlLocation = "WEB-INF/wsdl/RegisterService.wsdl")
public class RegisterDelegate {

	com.logic.Register register = new com.logic.Register();

	public String register(String userName, String password, String conpass,
			String mail, String addres, String phon, String gname) {
		return register.register(userName, password, conpass, mail, addres,
				phon, gname);
	}

	public String Userregister(String userName, String password,
			String conpass, String mail, String addres, String phon, String grp) {
		return register.Userregister(userName, password, conpass, mail, addres,
				phon, grp);
	}

	public String login(String username, String password) {
		return register.login(username, password);
	}

	public String ownerlogin(String username, String password) {
		return register.ownerlogin(username, password);
	}

}