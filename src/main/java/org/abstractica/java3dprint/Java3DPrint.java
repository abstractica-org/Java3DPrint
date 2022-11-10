package org.abstractica.java3dprint;

import org.abstractica.javacsg.JavaCSG;

public interface Java3DPrint extends JavaCSG
{
	Adjust holeTight();
	Adjust holeLoose();
	Adjust solidTight();
	Adjust solidLoose();
}
