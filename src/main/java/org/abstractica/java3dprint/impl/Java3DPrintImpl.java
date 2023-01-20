package org.abstractica.java3dprint.impl;

import org.abstractica.java3dprint.Java3DPrint;
import org.abstractica.java3dprint.PrinterProfile;
import org.abstractica.javacsg.JavaCSGBase;
import org.abstractica.javacsg.impl.JavaCSGImpl;

public class Java3DPrintImpl extends JavaCSGImpl implements Java3DPrint
{
	private final PrinterProfile profile;

	public Java3DPrintImpl(JavaCSGBase base, PrinterProfile profile)
	{
		super(base);
		this.profile = profile;
	}


	@Override
	public double holeTightXY()
	{
		return profile.holeTightXY();
	}

	@Override
	public double holeTightZ()
	{
		return profile.holeTightZ();
	}

	@Override
	public double holeLooseXY()
	{
		return profile.holeLooseXY();
	}

	@Override
	public double holeLooseZ()
	{
		return profile.holeLooseZ();
	}

	@Override
	public double solidTightXY()
	{
		return profile.solidTightXY();
	}

	@Override
	public double solidTightZ()
	{
		return profile.solidTightZ();
	}

	@Override
	public double solidLooseXY()
	{
		return profile.solidLooseXY();
	}

	@Override
	public double solidLooseZ()
	{
		return profile.solidLooseZ();
	}
}
