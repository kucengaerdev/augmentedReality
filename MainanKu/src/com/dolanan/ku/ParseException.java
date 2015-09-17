package com.dolanan.ku;

public class ParseException extends Exception {
	public ParseException(String file,int lineNumber, String msg) {
		super("Parse error in file "+file+"on line "+lineNumber+":"+msg);
	}
}