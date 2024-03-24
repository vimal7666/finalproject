package com.logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;
import com.mysql.jdbc.ResultSetMetaData;
import db.dbservice;

@javax.jws.WebService(targetNamespace = "http://logic.com/", serviceName = "FileUploadService", portName = "FileUploadPort", wsdlLocation = "WEB-INF/wsdl/FileUploadService.wsdl")
public class FileUploadDelegate {

	com.logic.FileUpload fileUpload = new com.logic.FileUpload();

	public String upload(String encContent, String serContent, String fileName,
			String userName) {
		return fileUpload.upload(encContent, serContent, fileName, userName);
	}

}