// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub3.java


public class Class33_Sub3 extends Class33
{

	public Class33_Sub3()
	{
	}

	public static void method278(byte arg0)
	{
		try
		{
			aClass58_2040 = null;
			aClass58_2051 = null;
			aClass58_2043 = null;
			aClass58_2053 = null;
			anIntArray2050 = null;
			aClass58_2054 = null;
			aClass17Array2060 = null;
			aClass58_2057 = null;
			aClass58_2055 = null;
			if(arg0 >= -112)
				anInt2052 = 63;
			aClass58_2041 = null;
			aClass33_Sub6_Sub7_Sub3Array2049 = null;
			aClass58_2061 = null;
			aClass58_2047 = null;
			aClass58_2048 = null;
			anIntArray2059 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ce.B(" + arg0 + ')');
		}
	}

	public static void method279(byte arg0)
	{
		anInt2044++;
		if(Class33_Sub21.aBooleanArray2603[98])
			Class33_Sub6_Sub4_Sub5_Sub2.anInt3797 += (12 - Class33_Sub6_Sub4_Sub5_Sub2.anInt3797) / 2;
		else
		if(!Class33_Sub21.aBooleanArray2603[99])
			Class33_Sub6_Sub4_Sub5_Sub2.anInt3797 /= 2;
		else
			Class33_Sub6_Sub4_Sub5_Sub2.anInt3797 += (-12 - Class33_Sub6_Sub4_Sub5_Sub2.anInt3797) / 2;
		Class33_Sub6_Sub10.anInt2872 += Class33_Sub6_Sub4_Sub5_Sub2.anInt3797 / 2;
		if(Class33_Sub21.aBooleanArray2603[96])
			Class78.anInt1672 += (-24 - Class78.anInt1672) / 2;
		else
		if(Class33_Sub21.aBooleanArray2603[97])
			Class78.anInt1672 += (-Class78.anInt1672 + 24) / 2;
		else
			Class78.anInt1672 /= 2;
		int i = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 - -Class80.anInt1736;
		if(Class33_Sub6_Sub10.anInt2872 < 128)
			Class33_Sub6_Sub10.anInt2872 = 128;
		Class65.anInt1394 = 0x7ff & Class78.anInt1672 / 2 + Class65.anInt1394;
		if(arg0 >= -23)
			aClass58_2043 = null;
		int j = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 - -Class78.anInt1659;
		if(Class33_Sub6_Sub3.anInt2709 - i < -500 || ~(-i + Class33_Sub6_Sub3.anInt2709) < -501 || ~(-j + Class33.anInt733) > 499 || Class33.anInt733 - j > 500)
		{
			Class33.anInt733 = j;
			Class33_Sub6_Sub3.anInt2709 = i;
		}
		if(~i != ~Class33_Sub6_Sub3.anInt2709)
			Class33_Sub6_Sub3.anInt2709 += (-Class33_Sub6_Sub3.anInt2709 + i) / 16;
		int k = Class33_Sub6_Sub3.anInt2709 >> 0x9a67d767;
		int j1 = 0;
		if(Class33_Sub6_Sub10.anInt2872 > 383)
			Class33_Sub6_Sub10.anInt2872 = 383;
		if(~Class33.anInt733 != ~j)
			Class33.anInt733 += (j + -Class33.anInt733) / 16;
		int l = Class33.anInt733 >> 0xcb8ae27;
		int i1 = Class38.method871(Class33_Sub6_Sub3.anInt2709, Class77_Sub2.anInt2645, Class33.anInt733, -126);
		if(k > 3 && l > 3 && ~k > -101 && l < 100)
		{
			for(int k1 = -4 + k; k1 <= k - -4; k1++)
			{
				for(int i2 = l + -4; ~i2 >= ~(4 + l); i2++)
				{
					int j2 = Class77_Sub2.anInt2645;
					if(~j2 > -4 && (Class35.aByteArrayArrayArray761[1][k1][i2] & 2) == 2)
						j2++;
					int k2 = -Class30.anIntArrayArrayArray645[j2][k1][i2] + i1;
					if(~k2 < ~j1)
						j1 = k2;
				}

			}

		}
		int l1 = j1 * 192;
		if(~l1 < 0xfffe80ff)
			l1 = 0x17f00;
		if(~l1 > -32769)
			l1 = 32768;
		if(Class70.anInt1513 < l1)
		{
			Class70.anInt1513 += (-Class70.anInt1513 + l1) / 24;
			return;
		}
		if(~Class70.anInt1513 < ~l1)
			Class70.anInt1513 += (l1 + -Class70.anInt1513) / 80;
	}

	public static int method280(int arg0, int arg1, int arg2)
	{
		try
		{
			if(arg0 < 47)
				return -23;
			int i = Class37.method856(4, -118, 0x16713 + arg1, arg2 - -45365) + -128 + (-128 + Class37.method856(2, -101, 37821 + arg1, arg2 - -10294) >> 0x66b5bec1) + (Class37.method856(1, -108, arg1, arg2) - 128 >> 0xe39a3a02);
			i = 35 + (int)(0.29999999999999999D * (double)i);
			anInt2046++;
			if(~i > -11)
				i = 10;
			else
			if(i > 60)
				i = 60;
			return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ce.A(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static Class58 aClass58_2040;
	public static Class58 aClass58_2041;
	public static int anInt2042;
	public static Class58 aClass58_2043;
	public static int anInt2044;
	public Class58 aClass58_2045;
	public static int anInt2046;
	public static Class58 aClass58_2047;
	public static Class58 aClass58_2048 = Class33_Sub6_Sub11.method535(120, " zuerst von Ihrer Ignorieren)2Liste(Q");
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3Array2049[];
	public static int anIntArray2050[] = new int[2048];
	public static Class58 aClass58_2051 = Class33_Sub6_Sub11.method535(104, "titlebutton");
	public static volatile int anInt2052 = 0;
	public static Class58 aClass58_2053;
	public static Class58 aClass58_2054 = Class33_Sub6_Sub11.method535(99, "Mitglieder)2Welt");
	public static Class58 aClass58_2055 = Class33_Sub6_Sub11.method535(115, "(U5");
	public static int anInt2056 = 0;
	public static Class58 aClass58_2057 = Class33_Sub6_Sub11.method535(120, ",Zffentlicher Chat");
	public static boolean aBoolean2058 = false;
	public static int anIntArray2059[];
	public static Class17 aClass17Array2060[];
	public static Class58 aClass58_2061;

	static 
	{
		aClass58_2053 = Class33_Sub6_Sub11.method535(121, "Prepared sound engine");
		aClass58_2047 = Class33_Sub6_Sub11.method535(120, "Loaded sprites");
		aClass58_2040 = aClass58_2053;
		aClass58_2041 = aClass58_2047;
		aClass58_2061 = Class33_Sub6_Sub11.method535(123, "Free world");
		aClass58_2043 = aClass58_2061;
	}
}
