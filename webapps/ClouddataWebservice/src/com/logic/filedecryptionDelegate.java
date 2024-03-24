package com.logic;

import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.util.StringTokenizer;
import algorithm.DeRSA;
import algorithm.enRSA;
import com.mysql.jdbc.PreparedStatement;
import com.sun.org.apache.xml.internal.security.encryption.EncryptedData;
import db.dbservice;

@javax.jws.WebService(targetNamespace = "http://logic.com/", serviceName = "filedecryptionService", portName = "filedecryptionPort", wsdlLocation = "WEB-INF/wsdl/filedecryptionService.wsdl")
public class filedecryptionDelegate {

	com.logic.filedecryption filedecryption = new com.logic.filedecryption();

	public String filequery(String filename, String userName, String ownername) {
		return filedecryption.filequery(filename, userName, ownername);
	}

}