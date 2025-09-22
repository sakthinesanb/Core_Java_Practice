package org.javabasics;

public class DataTypesAndVariables {
	int defaultValInt;
	byte defaultValByte;
	short defaultValShort;
	long defaultValLong;
	float defaultValFloat;
	double defaultValDouble;
	char defaultValChar;
	boolean defaultValBoolean;
	String defaultValString;
	
	private void defaultValOfDatatypes() {
		System.out.println("\nDefault Value of datatypes:\n1.Premitive Datatypes:\n"
				+"Int: "+defaultValInt
				+"\nByte: "+defaultValByte
				+"\nShort: "+defaultValShort
				+"\nLong: "+defaultValLong
				+"\nFloat: "+defaultValFloat
				+"\nDouble: "+defaultValDouble
				+"\nChar: "+defaultValChar
				+"\nBoolean: "+defaultValBoolean
				+"\n2.Non Premitive Datatypes:\n"
				+"String: "+defaultValString
				);

	}
public static void main(String[] args) {
	String title="Datatypes and variables:";
	System.out.println(title);
	DataTypesAndVariables obj=new DataTypesAndVariables();
	obj.defaultValOfDatatypes();
}
}
