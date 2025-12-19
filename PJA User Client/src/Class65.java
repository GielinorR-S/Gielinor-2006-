// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class65.java


public class Class65
{

	public int method1089(boolean arg0)
	{
		try
		{
			if(!arg0)
				method1093(73);
			if(anInt1395-- == 0)
			{
				method1091(2);
				anInt1395 = 255;
			}
			anInt1385++;
			return 0;//anIntArray1400[anInt1395];
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sc.C(" + arg0 + ')');
		}
	}

	public static void method1090(int arg0)
	{
		anInt1391++;
		if(~Class72.aString1532.toLowerCase().indexOf("microsoft") == 0)
		{
			Class33_Sub6_Sub1.anIntArray2669[93] = 43;
			Class33_Sub6_Sub1.anIntArray2669[61] = 27;
			Class33_Sub6_Sub1.anIntArray2669[92] = 74;
			Class33_Sub6_Sub1.anIntArray2669[59] = 57;
			Class33_Sub6_Sub1.anIntArray2669[45] = 26;
			if(Class72.aMethod1529 == null)
			{
				Class33_Sub6_Sub1.anIntArray2669[222] = 59;
				Class33_Sub6_Sub1.anIntArray2669[192] = 58;
			} else
			{
				Class33_Sub6_Sub1.anIntArray2669[222] = 58;
				Class33_Sub6_Sub1.anIntArray2669[192] = 28;
				Class33_Sub6_Sub1.anIntArray2669[520] = 59;
			}
			Class33_Sub6_Sub1.anIntArray2669[47] = 73;
			Class33_Sub6_Sub1.anIntArray2669[44] = 71;
			Class33_Sub6_Sub1.anIntArray2669[46] = 72;
			Class33_Sub6_Sub1.anIntArray2669[91] = 42;
		} else
		{
			Class33_Sub6_Sub1.anIntArray2669[192] = 58;
			Class33_Sub6_Sub1.anIntArray2669[191] = 73;
			Class33_Sub6_Sub1.anIntArray2669[220] = 74;
			Class33_Sub6_Sub1.anIntArray2669[189] = 26;
			Class33_Sub6_Sub1.anIntArray2669[190] = 72;
			Class33_Sub6_Sub1.anIntArray2669[222] = 59;
			Class33_Sub6_Sub1.anIntArray2669[186] = 57;
			Class33_Sub6_Sub1.anIntArray2669[223] = 28;
			Class33_Sub6_Sub1.anIntArray2669[221] = 43;
			Class33_Sub6_Sub1.anIntArray2669[188] = 71;
			Class33_Sub6_Sub1.anIntArray2669[187] = 27;
			Class33_Sub6_Sub1.anIntArray2669[219] = 42;
		}
		if(arg0 != 0xf99ff6c8)
			method1090(-75);
	}

	public void method1091(int arg0)
	{
		try
		{
			anInt1396++;
			if(arg0 != 2)
				aClass33_Sub6_Sub7_Sub4_1399 = null;
			anInt1389 += ++anInt1398;
			for(int i = 0; ~i > -257; i++)
			{
				int j = anIntArray1390[i];
				if(~(i & 2) != -1)
				{
					if(~(1 & i) != -1)
						anInt1392 ^= anInt1392 >>> 0xd5a7b230;
					else
						anInt1392 ^= anInt1392 << 0x8353ea2;
				} else
				if(~(i & 1) == -1)
					anInt1392 ^= anInt1392 << 0x2980442d;
				else
					anInt1392 ^= anInt1392 >>> 0xd06c07a6;
				anInt1392 += anIntArray1390[0xff & 128 + i];
				int k;
				anIntArray1390[i] = k = anInt1389 + anIntArray1390[Class12.method110(j, 1020) >> 0xabaf5802] + anInt1392;
				anIntArray1400[i] = anInt1389 = j + anIntArray1390[Class12.method110(k >> 0xf99ff6c8 >> 0x1ead022, 255)];
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sc.D(" + arg0 + ')');
		}
	}

	public static void method1092(int arg0)
	{
		try
		{
			aClass58_1386 = null;
			aClass58_1397 = null;
			anIntArray1384 = null;
			aClass33_Sub6_Sub7_Sub3Array1387 = null;
			if(arg0 != -5)
				method1090(46);
			aClass33_Sub6_Sub7_Sub4_1399 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sc.B(" + arg0 + ')');
		}
	}

	public void method1093(int arg0)
	{
		try
		{
			anInt1393++;
			int i1;
			int j1;
			int k1;
			int l1;
			int i2;
			int j2;
			int k2;
			int l = i1 = j1 = k1 = l1 = i2 = j2 = k2 = 0x9e3779b9;
			for(int i = 0; i < 4; i++)
			{
				l ^= i1 << 0x297c48cb;
				i1 += j1;
				i1 ^= j1 >>> 0x791a1162;
				l1 += i1;
				k1 += l;
				j1 += k1;
				j1 ^= k1 << 0x457b9d88;
				k1 += l1;
				k1 ^= l1 >>> 0xcdd1ed90;
				j2 += k1;
				i2 += j1;
				l1 += i2;
				l1 ^= i2 << 0x4d23184a;
				k2 += l1;
				i2 += j2;
				i2 ^= j2 >>> 0x62cc9ec4;
				l += i2;
				j2 += k2;
				j2 ^= k2 << 0x9a9809c8;
				k2 += l;
				k2 ^= l >>> 0x1c01aae9;
				i1 += j2;
				j1 += k2;
				l += i1;
			}

			for(int j = 0; j < 256; j += 8)
			{
				i1 += anIntArray1400[j + 1];
				k2 += anIntArray1400[j + 7];
				k1 += anIntArray1400[3 + j];
				i2 += anIntArray1400[j - -5];
				l1 += anIntArray1400[j + 4];
				j2 += anIntArray1400[j + 6];
				l += anIntArray1400[j];
				l ^= i1 << 0xba88934b;
				k1 += l;
				j1 += anIntArray1400[j - -2];
				i1 += j1;
				i1 ^= j1 >>> 0x6c3f442;
				l1 += i1;
				j1 += k1;
				j1 ^= k1 << 0xcc9e8da8;
				i2 += j1;
				k1 += l1;
				k1 ^= l1 >>> 0x7d947930;
				l1 += i2;
				j2 += k1;
				l1 ^= i2 << 0x824be9ca;
				k2 += l1;
				i2 += j2;
				i2 ^= j2 >>> 0xde362624;
				l += i2;
				j2 += k2;
				j2 ^= k2 << 0x679b9a48;
				k2 += l;
				i1 += j2;
				k2 ^= l >>> 0x13597d49;
				l += i1;
				j1 += k2;
				anIntArray1390[j] = l;
				anIntArray1390[j - -1] = i1;
				anIntArray1390[j - -2] = j1;
				anIntArray1390[3 + j] = k1;
				anIntArray1390[j - -4] = l1;
				anIntArray1390[5 + j] = i2;
				anIntArray1390[j + 6] = j2;
				anIntArray1390[j + 7] = k2;
			}

			for(int k = 0; ~k > -257; k += 8)
			{
				i1 += anIntArray1390[1 + k];
				j1 += anIntArray1390[k + 2];
				k1 += anIntArray1390[k + 3];
				j2 += anIntArray1390[6 + k];
				l += anIntArray1390[k];
				l ^= i1 << 0xc627698b;
				k1 += l;
				i1 += j1;
				k2 += anIntArray1390[k - -7];
				l1 += anIntArray1390[4 + k];
				i1 ^= j1 >>> 0x12dafaa2;
				i2 += anIntArray1390[5 + k];
				j1 += k1;
				j1 ^= k1 << 0x3cb98a8;
				l1 += i1;
				i2 += j1;
				k1 += l1;
				k1 ^= l1 >>> 0x44025390;
				l1 += i2;
				l1 ^= i2 << 0x2418fcaa;
				j2 += k1;
				k2 += l1;
				i2 += j2;
				i2 ^= j2 >>> 0x13659c84;
				j2 += k2;
				l += i2;
				j2 ^= k2 << 0x32f082e8;
				k2 += l;
				i1 += j2;
				k2 ^= l >>> 0xda6aa789;
				l += i1;
				j1 += k2;
				anIntArray1390[k] = l;
				anIntArray1390[k - -1] = i1;
				anIntArray1390[2 + k] = j1;
				anIntArray1390[3 + k] = k1;
				anIntArray1390[k + 4] = l1;
				anIntArray1390[k - -5] = i2;
				anIntArray1390[6 + k] = j2;
				anIntArray1390[7 + k] = k2;
			}

			if(arg0 != 0x9a9809c8)
			{
				return;
			} else
			{
				method1091(2);
				anInt1395 = 256;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sc.E(" + arg0 + ')');
		}
	}

	public Class65(int arg0[])
	{
		try
		{
			anIntArray1390 = new int[256];
			anIntArray1400 = new int[256];
			for(int i = 0; ~arg0.length < ~i; i++)
				anIntArray1400[i] = arg0[i];

			method1093(0x9a9809c8);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sc.<init>(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt1383;
	public static int anIntArray1384[];
	public static int anInt1385;
	public static Class58 aClass58_1386;
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3Array1387[];
	public static int anInt1388 = 0;
	public int anInt1389;
	public int anIntArray1390[];
	public static int anInt1391;
	public int anInt1392;
	public static int anInt1393;
	public static int anInt1394 = 0;
	public int anInt1395;
	public static int anInt1396;
	public static Class58 aClass58_1397;
	public int anInt1398;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_1399;
	public int anIntArray1400[];

	static 
	{
		aClass58_1386 = Class33_Sub6_Sub11.method535(122, "OFF");
		aClass58_1397 = aClass58_1386;
	}
}
