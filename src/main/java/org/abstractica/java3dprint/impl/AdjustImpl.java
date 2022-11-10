package org.abstractica.java3dprint.impl;

import org.abstractica.java3dprint.Adjust;

public class AdjustImpl implements Adjust
{
	private final double xy;
	private final double z;

	public AdjustImpl(double xy, double z)
	{
		this.xy = xy;
		this.z = z;
	}

	@Override
	public double xy()
	{
		return xy;
	}

	@Override
	public double z()
	{
		return z;
	}
}
