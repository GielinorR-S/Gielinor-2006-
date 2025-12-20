// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class8.java


public class Class8
{

	public Class8()
	{
		Class52.method947(16);
		anInt160 = Class52.method945() == 0 ? 1 : Class52.method947(4) + 1;
		if(Class52.method945() != 0)
			Class52.method947(8);
		Class52.method947(2);
		if(anInt160 > 1)
			anInt162 = Class52.method947(4);
		anIntArray161 = new int[anInt160];
		anIntArray163 = new int[anInt160];
		for(int i = 0; i < anInt160; i++)
		{
			Class52.method947(8);
			anIntArray161[i] = Class52.method947(8);
			anIntArray163[i] = Class52.method947(8);
		}

	}

	public int anInt160;
	public int anIntArray161[];
	public int anInt162;
	public int anIntArray163[];
}
