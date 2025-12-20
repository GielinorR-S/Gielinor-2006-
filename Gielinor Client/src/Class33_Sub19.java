// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub19.java


public class Class33_Sub19 extends Class33
{

	public static void method814(byte arg0)
	{
		Class79.anInt1714 = 0;
		int j = (((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 >> 0xe2a7bf07) + Class33_Sub2.anInt2036;
		int k = 120 / ((24 - arg0) / 52);
		anInt2548++;
		int i = Class69.anInt1475 + (((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 >> 0x30447887);
		if(~i <= -3054 && ~i >= -3157 && j >= 3056 && ~j >= -3137)
			Class79.anInt1714 = 1;
		if(i >= 3072 && ~i >= -3119 && ~j <= -9493 && ~j >= -9536)
			Class79.anInt1714 = 1;
		if(Class79.anInt1714 == 1 && i >= 3139 && ~i >= -3200 && j >= 3008 && ~j >= -3063)
			Class79.anInt1714 = 0;
	}

	public static void method815(boolean arg0, int arg1)
	{
		try
		{
			anInt2541++;
			if(arg1 != 64)
				anInt2547 = 115;
			for(int i = 0; Class33_Sub6_Sub1.anInt2659 > i; i++)
			{
				Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[Class80.anIntArray1730[i]];
				int j = 0x20000000 + (Class80.anIntArray1730[i] << 0x32ef18ae);
				if(class33_sub6_sub4_sub5_sub2 == null || !class33_sub6_sub4_sub5_sub2.method366(true) || class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.aBoolean3102 == (!arg0) || !class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.method589(arg1 ^ 0x7a))
					continue;
				int k = ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3548 >> 0x16ec3f87;
				int l = ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3510 >> 0x11ee9747;
				if(k < 0 || ~k <= -105 || l < 0 || l >= 104)
					continue;
				if(((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3559 == 1 && ~(((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3548 & 0x7f) == -65 && ~(0x7f & ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3510) == -65)
				{
					if(Class47.anIntArrayArray1037[k][l] == Class82.anInt1789)
						continue;
					Class47.anIntArrayArray1037[k][l] = Class82.anInt1789;
				}
				if(!class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.aBoolean3070)
					j += 0x80000000;
				Class33_Sub2.aClass56_2035.method1000(Class77_Sub2.anInt2645, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3548, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3510, Class38.method871(64 * (((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3559 - 1) + ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3548, Class77_Sub2.anInt2645, -64 + (64 * ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3559 + ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3510), arg1 + -11), -4 + ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3559 * 64, class33_sub6_sub4_sub5_sub2, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3549, j, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).aBoolean3518);
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qe.B(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method816(int arg0)
	{
		try
		{
			if(arg0 >= -2)
				anInt2552 = 34;
			aClass33_Sub6_Sub7_Sub3_2556 = null;
			anIntArray2553 = null;
			aClass81_2535 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qe.D(" + arg0 + ')');
		}
	}

	public static Class58 method817(long arg0, int arg1)
	{
		try
		{
			anInt2546++;
			if(arg0 <= 0L || ~arg0 <= 0xa4a4a8075675a22eL)
				return null;
			if(~(arg0 % 37L) == -1L)
				return null;
			long l = arg0;
			int i;
			for(i = 0; l != 0L; i++)
				l /= 37L;

			byte abyte0[] = new byte[i];
			while(arg0 != 0L) 
			{
				long l1 = arg0;
				arg0 /= 37L;
				abyte0[--i] = Class33.aByteArray740[(int)(-(37L * arg0) + l1)];
			}
			if(arg1 < 91)
			{
				return null;
			} else
			{
				Class58 class58 = new Class58();
				class58.aByteArray1894 = abyte0;
				class58.anInt1893 = abyte0.length;
				return class58;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qe.A(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method818(byte arg0)
	{
		anInt2551++;
		try
		{
			if(Class33_Sub6_Sub10.aClass36_2881 == null)
			{
				Class33_Sub6_Sub10.aClass36_2881 = new Class36(Class22.aClass72_416, Class35.method846((byte)-83, new Class58[] {
					Class33_Sub6_Sub12.aClass58_2981, Class33_Sub13_Sub4.aClass58_3321, Class33_Sub6_Sub13.aClass58_2995
				}).method1036(arg0 ^ 0x6173));
			} else
			{
				byte abyte0[] = Class33_Sub6_Sub10.aClass36_2881.method852(-75);
				if(abyte0 != null)
				{
					Class33_Sub11 class33_sub11 = new Class33_Sub11(abyte0);
					Class33_Sub13_Sub3.anInt3253 = class33_sub11.method666(69);
					Class33_Sub3.aClass17Array2060 = new Class17[Class33_Sub13_Sub3.anInt3253];
					for(int i = 0; ~Class33_Sub13_Sub3.anInt3253 < ~i; i++)
					{
						Class17 class17 = Class33_Sub3.aClass17Array2060[i] = new Class17();
						int j = class33_sub11.method666(arg0 ^ 0x57);
						class17.aBoolean339 = (j & 0x8000) != 0;
						class17.anInt352 = 0x7fff & j;
						class17.aClass58_337 = class33_sub11.method646(-126);
						class17.anInt345 = class33_sub11.method672(71);
						class17.anInt342 = i;
						class17.anInt335 = Class66.method1096(class17.aClass58_337, 89);
					}

					Class33_Sub6_Sub4_Sub6.method374(0, (byte)-116, Class40.anIntArray893, Class81.anIntArray1742, -1 + Class33_Sub3.aClass17Array2060.length, Class33_Sub3.aClass17Array2060);
					Class33_Sub6_Sub10.aClass36_2881 = null;
					Class33_Sub6_Sub2.aBoolean2683 = true;
				}
			}
		}
		catch(Exception _ex)
		{
			Class33_Sub6_Sub10.aClass36_2881 = null;
		}
		if(arg0 != 110)
			anInt2547 = 24;
	}

	public static boolean method819(int arg0, int arg1)
	{
		try
		{
			anInt2540++;
			if(arg1 != 1)
				return false;
			return ~(arg0 >> 0x9a3363de & 1) != -1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qe.G(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static Class33_Sub6_Sub13 method820(int arg0, int arg1)
	{
		try
		{
			Class33_Sub6_Sub13 class33_sub6_sub13 = (Class33_Sub6_Sub13)Class33_Sub6_Sub17.aClass16_3140.method144(0, arg0);
			anInt2543++;
			if(class33_sub6_sub13 != null)
				return class33_sub6_sub13;
			byte abyte0[] = Class15.aClass30_288.method238(false, arg0, 16);
			class33_sub6_sub13 = new Class33_Sub6_Sub13();
			if(abyte0 != null)
				class33_sub6_sub13.method557(arg1 + 15874, new Class33_Sub11(abyte0));
			Class33_Sub6_Sub17.aClass16_3140.method145(arg0, (byte)-119, class33_sub6_sub13);
			if(arg1 != 1)
				method816(-108);
			return class33_sub6_sub13;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qe.H(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static boolean method821(int arg0, int arg1, boolean arg2)
	{
		try
		{
			anInt2544++;
			if(!arg2)
				return false;
			if(arg0 == 0 && ~arg1 == ~anInt2552)
				return true;
			if(~arg0 == -2 && arg1 == Class33_Sub6_Sub4_Sub6.anInt3626)
				return true;
			return (arg0 == 2 || ~arg0 == -4) && ~arg1 == ~Class51.anInt1092;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qe.F(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public Class33_Sub19()
	{
	}

	public int anIntArray2534[];
	public static Class81 aClass81_2535 = new Class81();
	public Class6 aClass6Array2536[];
	public int anInt2537;
	public byte aByteArrayArrayArray2538[][][];
	public Class6 aClass6Array2539[];
	public static int anInt2540;
	public static int anInt2541;
	public static int anInt2542 = 0;
	public static int anInt2543;
	public static int anInt2544;
	public int anIntArray2545[];
	public static int anInt2546;
	public static int anInt2547 = 0;
	public static int anInt2548;
	public int anIntArray2549[];
	public int anInt2550;
	public static int anInt2551;
	public static int anInt2552 = -1;
	public static int anIntArray2553[];
	public static boolean aBoolean2554 = false;
	public static int anInt2555 = 2;
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3_2556;

}
