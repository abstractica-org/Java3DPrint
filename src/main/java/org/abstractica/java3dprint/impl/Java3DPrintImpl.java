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

	public Java3DPrintImpl
			(
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
		this.holeTight = new AdjustImpl(holeTightXYAdj, holeTightZAdj);
		this.holeLoose = new AdjustImpl(holeLooseXYAdj, holeLooseZAdj);
		this.solidTight = new AdjustImpl(solidTightXYAdj, solidTightZAdj);
		this.solidLoose = new AdjustImpl(solidLooseXYAdj, solidLooseZAdj);
	}

	public Java3DPrintImpl()
	{
		this(   0.1,
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
