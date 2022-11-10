package org.abstractica.java3dprint.impl;

import org.abstractica.java3dprint.Adjust;
import org.abstractica.java3dprint.Java3DPrint;
import org.abstractica.javacsg.impl.JavaCSGImpl;

public class Java3DPrintImpl extends JavaCSGImpl implements Java3DPrint
{
	private final Adjust holeTight;
	private final Adjust holeLoose;
	private final Adjust solidTight;
	private final Adjust solidLoose;

	public Java3DPrintImpl(String moduleDirectoryName,
	                       boolean binarySTL,
	                       Adjust holeTight,
	                       Adjust holeLoose,
	                       Adjust solidTight,
	                       Adjust solidLoose)
	{
		super(moduleDirectoryName, binarySTL);
		this.holeTight = holeTight;
		this.holeLoose = holeLoose;
		this.solidTight = solidTight;
		this.solidLoose = solidLoose;
	}

	public Java3DPrintImpl
			(
				String moduleDirectoryName,
				boolean binarySTL,
				double holeTightXYAdj,
				double holeTightZAdj,
				double holeLooseXYAdj,
				double holeLooseZAdj,
				double solidTightXYAdj,
				double solidTightZAdj,
				double solidLooseXYAdj,
				double solidLooseZAdj
			)
	{
		this(   moduleDirectoryName, binarySTL,
				new AdjustImpl(holeTightXYAdj, holeTightZAdj),
				new AdjustImpl(holeLooseXYAdj, holeLooseZAdj),
				new AdjustImpl(solidLooseXYAdj, solidLooseZAdj),
				new AdjustImpl(solidLooseXYAdj, solidLooseZAdj));
	}



	public Java3DPrintImpl(String moduleDirectoryName,
	                       boolean binarySTL)
	{
		this( moduleDirectoryName, binarySTL,
				0.1,
				0.1,
				0.2,
				0.2,
				-0.1,
				-0.1,
				-0.2,
				-0.2);
	}

	public Java3DPrintImpl()
	{
		this( null, false,
				0.1,
				0.1,
				0.2,
				0.2,
				-0.1,
				-0.1,
				-0.2,
				-0.2);
	}


	@Override
	public Adjust holeTight()
	{
		return holeTight;
	}

	@Override
	public Adjust holeLoose()
	{
		return holeLoose;
	}

	@Override
	public Adjust solidTight()
	{
		return solidTight;
	}

	@Override
	public Adjust solidLoose()
	{
		return solidLoose;
	}
}
