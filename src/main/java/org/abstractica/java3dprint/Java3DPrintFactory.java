package org.abstractica.java3dprint;

import org.abstractica.java3dprint.impl.Java3DPrintImpl;
import org.abstractica.java3dprint.impl.PrinterProfileImpl;
import org.abstractica.javacsg.JavaCSGBase;
import org.abstractica.javacsg.impl.javaopenscad.JavaCSGBaseOpenSCADImpl;

public class Java3DPrintFactory
{
	public static Java3DPrint create(JavaCSGBase base, PrinterProfile profile)
	{
		return new Java3DPrintImpl(base, profile);
	}

	public static Java3DPrint create(PrinterProfile profile)
	{
		JavaCSGBase base = new JavaCSGBaseOpenSCADImpl(true);
		return new Java3DPrintImpl(base, profile);
	}

	public static Java3DPrint createDefault()
	{
		JavaCSGBase base = new JavaCSGBaseOpenSCADImpl(true);
		PrinterProfile profile = new PrinterProfileImpl(
				0.1,
				0.1,
				0.2,
				0.2,
				-0.1,
				0.0,
				-0.2,
				-0.1);
		return new Java3DPrintImpl(base, profile);
	}
}

