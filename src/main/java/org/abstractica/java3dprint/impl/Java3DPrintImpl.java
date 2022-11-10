package org.abstractica.java3dprint.impl;

import org.abstractica.java3dprint.Java3DPrint;
import org.abstractica.javacsg.impl.JavaCSGImpl;

public class Java3DPrintImpl extends JavaCSGImpl implements Java3DPrint
{
	private final double holeTightXYAdj;
	private final double holeLooseXYAdj;
	private final double holeTightRoundHorizontalAdj;
	private final double holeLooseRoundHorizontalAdj;
	private final double solidTightXYAdj;
	private final double solidLooseXYAdj;
	private final double solidTightZAdj;
	private final double solidLooseZAdj;

	public Java3DPrintImpl
			(
				double holeTightXYAdj,
				double holeLooseXYAdj,
				double holeTightRoundHorizontalAdj,
				double holeLooseRoundHorizontalAdj,
				double solidTightXYAdj,
				double solidLooseXYAdj,
				double solidTightZAdj,
				double solidLooseZAdj
			)
	{
		this.holeTightXYAdj = holeTightXYAdj;
		this.holeLooseXYAdj = holeLooseXYAdj;
		this.holeTightRoundHorizontalAdj = holeTightRoundHorizontalAdj;
		this.holeLooseRoundHorizontalAdj = holeLooseRoundHorizontalAdj;
		this.solidTightXYAdj = solidTightXYAdj;
		this.solidLooseXYAdj = solidLooseXYAdj;
		this.solidTightZAdj = solidTightZAdj;
		this.solidLooseZAdj = solidLooseZAdj;
	}

	public Java3DPrintImpl()
	{
		holeTightXYAdj = 0.1;
		holeLooseXYAdj = 0.2;
		holeTightRoundHorizontalAdj = 0.1;
		holeLooseRoundHorizontalAdj = 0.2;
		solidTightXYAdj = -0.1;
		solidLooseXYAdj = -0.2;
		solidTightZAdj = -0.1;
		solidLooseZAdj = -0.2;
	}

	@Override
	public double holeTightXYAdj()
	{
		return holeTightXYAdj;
	}

	@Override
	public double holeLooseXYAdj()
	{
		return holeLooseXYAdj;
	}

	@Override
	public double holeTightRoundHorizontalAdj()
	{
		return holeTightRoundHorizontalAdj;
	}

	@Override
	public double holeLooseRoundHorizontalAdj()
	{
		return holeLooseRoundHorizontalAdj;
	}

	@Override
	public double solidTightXYAdj()
	{
		return solidTightXYAdj;
	}

	@Override
	public double solidLooseXYAdj()
	{
		return solidLooseXYAdj;
	}

	@Override
	public double solidTightZAdj()
	{
		return solidTightXYAdj;
	}

	@Override
	public double solidLooseZAdj()
	{
		return solidLooseZAdj;
	}
}
