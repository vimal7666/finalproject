package com.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Vector;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import db.dbservice;

@javax.jws.WebService(targetNamespace = "http://logic.com/", serviceName = "SearchqueryService", portName = "SearchqueryPort", wsdlLocation = "WEB-INF/wsdl/SearchqueryService.wsdl")
public class SearchqueryDelegate {

	com.logic.Searchquery searchquery = new com.logic.Searchquery();

	public String genQuery(String searchQuery, String keyword, String userName,
			String ownname) {
		return searchquery.genQuery(searchQuery, keyword, userName, ownname);
	}

	public String genQueryView(String fileName, String type, String userName) {
		return searchquery.genQueryView(fileName, type, userName);
	}

	public int[] bubble_srt(int[] a, int n) {
		return searchquery.bubble_srt(a, n);
	}

}