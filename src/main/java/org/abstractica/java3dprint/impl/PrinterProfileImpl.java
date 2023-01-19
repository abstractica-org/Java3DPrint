package org.abstractica.java3dprint.impl;

import org.abstractica.java3dprint.PrinterProfile;

public class PrinterProfileImpl implements PrinterProfile
{
	private final double holeTightXY;
	private final double holeTightZ;
	private final double holeLooseXY;
	private final double holeLooseZ;
	private final double solidTightXY;
	private final double solidTightZ;
	private final double solidLooseXY;
	private final double solidLooseZ;

	public PrinterProfileImpl(double holeTightXY,
	                          double holeTightZ,
	                          double holeLooseXY,
	                          double holeLooseZ,
	                          double solidTightXY,
	                          double solidTightZ,
	                          double solidLooseXY,
	                          double solidLooseZ)
	{
		this.holeTightXY = holeTightXY;
		this.holeTightZ = holeTightZ;
		this.holeLooseXY = holeLooseXY;
		this.holeLooseZ = holeLooseZ;
		this.solidTightXY = solidTightXY;
		this.solidTightZ = solidTightZ;
		this.solidLooseXY = solidLooseXY;
		this.solidLooseZ = solidLooseZ;
	}

	@Override
	public double holeTightXY()
	{
		return holeTightXY;
	}

	@Override
	public double holeTightZ()
	{
		return holeTightZ;
	}

	@Override
	public double holeLooseXY()
	{
		return holeLooseXY;
	}

	@Override
	public double holeLooseZ()
	{
		return holeLooseZ;
	}

	@Override
	public double solidTightXY()
	{
		return solidTightXY;
	}

	@Override
	public double solidTightZ()
	{
		return solidTightZ;
	}

	@Override
	public double solidLooseXY()
	{
		return solidLooseXY;
	}

	@Override
	public double solidLooseZ()
	{
		return solidLooseZ;
	}
}
