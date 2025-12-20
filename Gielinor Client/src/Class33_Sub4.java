// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub4.java


public class Class33_Sub4 extends Class33
{

	public static void method281(int arg0, byte arg1)
	{
		try
		{
			if(arg1 <= 69)
				aLong2082 = 93L;
			if(Class62.anInt1312 == 0)
				Class33_Sub7.aClass33_Sub13_Sub4_2164.method765(-2, arg0);
			else
				Class62.anInt1311 = arg0;
			anInt2073++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "d.B(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method282(byte arg0)
	{
		try
		{
			aClass58_2081 = null;
			aClass58_2072 = null;
			aClass58_2065 = null;
			aClass58_2077 = null;
			aClass58_2067 = null;
			aClass30_2069 = null;
			if(arg0 >= -20)
				method281(110, (byte)22);
			aClass58_2086 = null;
			aClass58_2091 = null;
			aClass58_2068 = null;
			aClass58_2080 = null;
			aClass58_2089 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "d.C(" + arg0 + ')');
		}
	}

	public void method283(int arg0)
	{
		if(arg0 != 0)
			anInt2062 = -110;
		anInt2083++;
		int i = anInt2085;
		Class33_Sub6_Sub17 class33_sub6_sub17 = aClass33_Sub6_Sub17_2070.method591(-16431);
		if(class33_sub6_sub17 != null)
		{
			anInt2085 = class33_sub6_sub17.anInt3127;
			anInt2078 = class33_sub6_sub17.anInt3142 * 128;
			anInt2092 = class33_sub6_sub17.anInt3145;
			anInt2075 = class33_sub6_sub17.anInt3126;
			anIntArray2087 = class33_sub6_sub17.anIntArray3150;
		} else
		{
			anInt2085 = -1;
			anInt2075 = 0;
			anInt2092 = 0;
			anIntArray2087 = null;
			anInt2078 = 0;
		}
		if(~i != ~anInt2085 && aClass33_Sub13_Sub1_2074 != null)
		{
			Class78.aClass33_Sub13_Sub2_1670.method738(aClass33_Sub13_Sub1_2074);
			aClass33_Sub13_Sub1_2074 = null;
		}
	}

	public static boolean method284(int arg0, int arg1)
	{
		try
		{
			anInt2088++;
			if(arg1 > -3)
				aClass58_2067 = null;
			return (1 & arg0 >> 0xc86872fc) != 0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "d.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub4()
	{
	}

	public int anInt2062;
	public int anInt2063;
	public Class33_Sub13_Sub1 aClass33_Sub13_Sub1_2064;
	public static Class58 aClass58_2065;
	public static int anInt2066 = 0;
	public static Class58 aClass58_2067 = Class33_Sub6_Sub11.method535(117, "blinken2:");
	public static Class58 aClass58_2068 = Class33_Sub6_Sub11.method535(120, "<col=00ff80>");
	public static Class30 aClass30_2069;
	public Class33_Sub6_Sub17 aClass33_Sub6_Sub17_2070;
	public int anInt2071;
	public static Class58 aClass58_2072 = Class33_Sub6_Sub11.method535(103, "::");
	public static int anInt2073;
	public Class33_Sub13_Sub1 aClass33_Sub13_Sub1_2074;
	public int anInt2075;
	public int anInt2076;
	public static Class58 aClass58_2077;
	public int anInt2078;
	public static int anInt2079 = 0;
	public static Class58 aClass58_2080;
	public static Class58 aClass58_2081;
	public static long aLong2082 = 0L;
	public static int anInt2083;
	public int anInt2084;
	public int anInt2085;
	public static Class58 aClass58_2086 = Class33_Sub6_Sub11.method535(102, "Privater Chat");
	public int anIntArray2087[];
	public static int anInt2088;
	public static Class58 aClass58_2089;
	public int anInt2090;
	public static Class58 aClass58_2091 = Class33_Sub6_Sub11.method535(120, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");
	public int anInt2092;

	static 
	{
		aClass58_2080 = Class33_Sub6_Sub11.method535(115, "Prepared visibility map");
		aClass58_2077 = Class33_Sub6_Sub11.method535(104, "K");
		aClass58_2065 = aClass58_2077;
		aClass58_2089 = aClass58_2080;
		aClass58_2081 = aClass58_2077;
	}
}
