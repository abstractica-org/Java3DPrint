package org.abstractica.java3dprint;

public interface PrinterProfile
{
	double holeTightXY();
	double holeTightZ();
	double holeLooseXY();
	double holeLooseZ();
	double solidTightXY();
	double solidTightZ();
	double solidLooseXY();
	double solidLooseZ();
}
