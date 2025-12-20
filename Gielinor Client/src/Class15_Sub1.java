// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class15_Sub1.java

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.*;
import java.util.Hashtable;

public class Class15_Sub1 extends Class15
{

	public void method136(int arg0, Component arg1, int arg2, int arg3)
	{
		int i = 23 / ((arg0 - -13) / 35);
		anInt301 = arg3;
		anIntArray289 = new int[1 + arg3 * arg2];
		anInt295 = arg2;
		DataBufferInt databufferint = new DataBufferInt(anIntArray289, anIntArray289.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 0xff0000, 65280, 255);
		java.awt.image.WritableRaster writableraster = Raster.createWritableRaster(directcolormodel.createCompatibleSampleModel(anInt295, anInt301), databufferint, null);
		anImage305 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
		aComponent1951 = arg1;
		method135(8);
	}

	public void method131(int arg0, int arg1, byte arg2, Graphics arg3)
	{
		if(arg2 != 78)
			aComponent1951 = (Component)null;
		arg3.drawImage(anImage305, arg0, arg1, aComponent1951);
	}

	public Class15_Sub1()
	{
	}

	public Component aComponent1951;
}
