package org.abstractica.java3dprint;

import org.abstractica.javacsg.JavaCSG;

public interface Java3DPrint extends JavaCSG
{
	double holeTightXYAdj();
	double holeLooseXYAdj();
	double holeTightRoundHorizontalAdj();
	double holeLooseRoundHorizontalAdj();
	double solidTightXYAdj();
	double solidLooseXYAdj();
	double solidTightZAdj();
	double solidLooseZAdj();
}
