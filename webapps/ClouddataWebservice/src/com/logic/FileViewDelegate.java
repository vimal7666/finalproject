package com.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;
import algorithm.BaseEncryption;

@javax.jws.WebService(targetNamespace = "http://logic.com/", serviceName = "FileViewService", portName = "FileViewPort", wsdlLocation = "WEB-INF/wsdl/FileViewService.wsdl")
public class FileViewDelegate {

	com.logic.FileView fileView = new com.logic.FileView();

	public String fileview(Vector blocksVec, String fnam, String chstype) {
		return fileView.fileview(blocksVec, fnam, chstype);
	}

}