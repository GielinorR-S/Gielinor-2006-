// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class49.java

import java.awt.Component;

public abstract class Class49
{

	public static int method930(int arg0, int arg1, int arg2, int arg3)
	{
		try
		{
			if(arg3 != 1899)
				method932(false);
			anInt1081++;
			int i = 256 - arg1;
			return (i * (0xff00ff & arg0) - -((arg2 & 0xff00ff) * arg1) & 0xff00ff00) + ((arg0 & 0xff00) * i - -((arg2 & 0xff00) * arg1) & 0xff0000) >> 0x811070c8;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "p.G(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static Class33_Sub15 method931(Class33_Sub15 arg0, int arg1)
	{
		try
		{
			if(arg1 <= 102)
				return null;
			anInt1066++;
			Class33_Sub15 class33_sub15 = Class4.method64(arg0, 25157);
			if(class33_sub15 == null)
				class33_sub15 = arg0.aClass33_Sub15_2366;
			return class33_sub15;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "p.D(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static void method932(boolean arg0)
	{
		try
		{
			anInt1072++;
			try
			{
				if(!arg0)
					method933(28, 76);
				java.awt.Graphics g = Class33_Sub6_Sub4_Sub1.aCanvas3367.getGraphics();
				Class24.aClass15_509.method131(17, 357, (byte)78, g);
				return;
			}
			catch(Exception _ex)
			{
				Class33_Sub6_Sub4_Sub1.aCanvas3367.repaint();
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "p.F(" + arg0 + ')');
		}
	}

	public static Class33_Sub15 method933(int arg0, int arg1)
	{
		try
		{
			int i = arg0 >> 0xc9b74cf0;
			anInt1082++;
			int j = 0xffff & arg0;
			if(arg1 >= -47)
				return null;
			if(Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[i] == null || Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[i][j] == null)
			{
				boolean flag = Class33_Sub6_Sub2.method305(i, 0x12bcb130);
				if(!flag)
					return null;
			}
			return Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[i][j];
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "p.H(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method934(byte arg0)
	{
		try
		{
			aClass58_1069 = null;
			aClass58_1079 = null;
			aClass58_1075 = null;
			aClass58_1064 = null;
			if(arg0 != -62)
				aClass58_1067 = null;
			aClass58_1080 = null;
			aClass58_1067 = null;
			aClass58_1065 = null;
			aClass58_1076 = null;
			aClass58_1071 = null;
			anIntArray1074 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "p.E(" + arg0 + ')');
		}
	}

	public Class49()
	{
	}

	public abstract void method935(byte byte0, Component component);

	public abstract void method936(Component component, int i);

	public abstract int method937(byte byte0);

	public static Class58 aClass58_1064 = Class33_Sub6_Sub11.method535(109, ")1j");
	public static Class58 aClass58_1065;
	public static int anInt1066;
	public static Class58 aClass58_1067;
	public static int anInt1068;
	public static Class58 aClass58_1069;
	public static long aLong1070;
	public static Class58 aClass58_1071;
	public static int anInt1072;
	public static int anInt1073;
	public static int anIntArray1074[] = {
		0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 
		1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff, 
		0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff, 
		0x3fffffff, 0x7fffffff, -1
	};
	public static Class58 aClass58_1075 = Class33_Sub6_Sub11.method535(109, "Keine Antwort vom Anmelde)2Server)3");
	public static Class58 aClass58_1076 = Class33_Sub6_Sub11.method535(114, "Icons redrawn");
	public static int anInt1077;
	public static int anInt1078 = 1;
	public static Class58 aClass58_1079;
	public static Class58 aClass58_1080;
	public static int anInt1081;
	public static int anInt1082;

	static 
	{
		aClass58_1069 = Class33_Sub6_Sub11.method535(119, "Connection lost");
		aClass58_1080 = Class33_Sub6_Sub11.method535(102, "Report abuse");
		aClass58_1067 = aClass58_1069;
		aClass58_1065 = Class33_Sub6_Sub11.method535(127, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members");
		aClass58_1071 = aClass58_1080;
		aClass58_1079 = aClass58_1065;
	}
}
