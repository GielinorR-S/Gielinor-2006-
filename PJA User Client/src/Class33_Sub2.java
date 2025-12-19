// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub2.java


public class Class33_Sub2 extends Class33
{

	public static void method274(int arg0)
	{
		try
		{
			aClass58_2033 = null;
			aClass15_2028 = null;
			if(arg0 != -1)
			{
				return;
			} else
			{
				aClass35_2030 = null;
				aClass58_2026 = null;
				aClass58_2029 = null;
				aClass56_2035 = null;
				anIntArray2019 = null;
				aClass58_2017 = null;
				aClass58_2021 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cd.A(" + arg0 + ')');
		}
	}

	public Class33_Sub2()
	{
	}

	public static boolean method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		try
		{
			anInt2038++;
			if(!Class33_Sub6_Sub2.method305(arg2, 0x12bcb130))
				return false;
			Class20.aClass33_Sub15Array386 = null;
			boolean flag = Class15_Sub2.method137(arg3, arg5, true, -1, arg6, Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg2], 0, 0, arg0, arg4);
			if(arg1 != -19850)
				anInt2024 = -22;
			if(Class20.aClass33_Sub15Array386 != null)
				Class15_Sub2.method137(arg3, arg5, true, 0xabcdabcd, arg6, Class20.aClass33_Sub15Array386, Class27.anInt565, Class49.anInt1077, arg0, arg4);
			return flag;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cd.C(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public static void method276(byte arg0, int arg1, Class30_Sub1 arg2)
	{
		try
		{
			int i = -70 % ((53 - arg0) / 61);
			anInt2025++;
			if(Class33_Sub11.aClass33_Sub11_2264 != null)
			{
				Class33_Sub11.aClass33_Sub11_2264.anInt2239 = 5 + arg1 * 8;
				int j = Class33_Sub11.aClass33_Sub11_2264.method623((byte)26);
				int k = Class33_Sub11.aClass33_Sub11_2264.method623((byte)-109);
				arg2.method251(-116, k, j);
				return;
			} else
			{
				Class33_Sub6_Sub4_Sub4.method351(255, true, 0, (byte)0, 18058, null, 255);
				Class33_Sub11.aClass30_Sub1Array2237[arg1] = arg2;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cd.D(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method277(int arg0)
	{
		try
		{
			anInt2027++;
			if(arg0 != 0)
			{
				return;
			} else
			{
				Class30.aClass4_613 = new Class4();
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cd.B(" + arg0 + ')');
		}
	}

	public Class33_Sub2(int arg0)
	{
		try
		{
			anInt2016 = arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cd.<init>(" + arg0 + ')');
		}
	}

	public int anInt2016;
	public static Class58 aClass58_2017;
	public static int anInt2018 = -1;
	public static int anIntArray2019[];
	public static int anInt2020;
	public static Class58 aClass58_2021;
	public static int anInt2022;
	public static int anInt2023 = 0;
	public static int anInt2024 = 0;
	public static int anInt2025;
	public static Class58 aClass58_2026;
	public static int anInt2027;
	public static Class15 aClass15_2028;
	public static Class58 aClass58_2029;
	public static Class35 aClass35_2030;
	public static int anInt2031 = 0;
	public static int anInt2032;
	public static Class58 aClass58_2033 = Class33_Sub6_Sub11.method535(114, "::gc");
	public static int anInt2034;
	public static Class56 aClass56_2035;
	public static int anInt2036;
	public static int anInt2037;
	public static int anInt2038;
	public static int anInt2039;

	static 
	{
		aClass58_2029 = Class33_Sub6_Sub11.method535(118, "Continue");
		aClass58_2017 = Class33_Sub6_Sub11.method535(118, "Loaded fonts");
		aClass58_2026 = aClass58_2017;
		aClass58_2021 = aClass58_2029;
	}
}
