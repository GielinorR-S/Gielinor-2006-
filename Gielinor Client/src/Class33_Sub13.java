// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub13.java


public abstract class Class33_Sub13 extends Class33
{

	public abstract void method689(int ai[], int i, int j);

	public int method690()
	{
		return 255;
	}

	public abstract Class33_Sub13 method691();

	public abstract Class33_Sub13 method692();

	public void method693(int arg0[], int arg1, int arg2)
	{
		if(aBoolean2330)
		{
			method689(arg0, arg1, arg2);
			return;
		} else
		{
			method694(arg2);
			return;
		}
	}

	public abstract void method694(int i);

	public Class33_Sub13()
	{
		aBoolean2330 = true;
	}

	public abstract int method695();

	public volatile boolean aBoolean2330;
	public int anInt2331;
	public Class33_Sub13 aClass33_Sub13_2332;
	public Class33_Sub8 aClass33_Sub8_2333;
}
