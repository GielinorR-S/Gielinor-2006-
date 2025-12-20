// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class2.java


public class Class2
{

	public int method47(int arg0)
	{
		if(anInt107 >= anInt105)
		{
			anInt103 = anIntArray98[anInt106++] << 15;
			if(anInt106 >= anInt99)
				anInt106 = anInt99 - 1;
			anInt105 = (int)(((double)anIntArray101[anInt106] / 65536D) * (double)arg0);
			if(anInt105 > anInt107)
				anInt104 = ((anIntArray98[anInt106] << 15) - anInt103) / (anInt105 - anInt107);
		}
		anInt103 += anInt104;
		anInt107++;
		return anInt103 - anInt104 >> 15;
	}

	public void method48(Class33_Sub11 arg0)
	{
		anInt100 = arg0.method639((byte)123);
		anInt97 = arg0.method623((byte)59);
		anInt102 = arg0.method623((byte)86);
		method50(arg0);
	}

	public void method49()
	{
		anInt105 = 0;
		anInt106 = 0;
		anInt104 = 0;
		anInt103 = 0;
		anInt107 = 0;
	}

	public void method50(Class33_Sub11 arg0)
	{
		anInt99 = arg0.method639((byte)123);
		anIntArray101 = new int[anInt99];
		anIntArray98 = new int[anInt99];
		for(int i = 0; i < anInt99; i++)
		{
			anIntArray101[i] = arg0.method666(53);
			anIntArray98[i] = arg0.method666(57);
		}

	}

	public Class2()
	{
		anInt99 = 2;
		anIntArray101 = new int[2];
		anIntArray98 = new int[2];
		anIntArray101[0] = 0;
		anIntArray101[1] = 65535;
		anIntArray98[0] = 0;
		anIntArray98[1] = 65535;
	}

	public int anInt97;
	public int anIntArray98[];
	public int anInt99;
	public int anInt100;
	public int anIntArray101[];
	public int anInt102;
	public int anInt103;
	public int anInt104;
	public int anInt105;
	public int anInt106;
	public int anInt107;
}
