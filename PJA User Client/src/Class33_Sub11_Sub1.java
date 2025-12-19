// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub11_Sub1.java


public class Class33_Sub11_Sub1 extends Class33_Sub11
{

	public static void method676(int arg0)
	{
		try
		{
			Class48.aClass16_1048.method147((byte)-54);
			int i = 23 / ((arg0 - 30) / 40);
			anInt3203++;
			Class33_Sub9.aClass16_2196.method147((byte)-54);
			Class9.aClass16_165.method147((byte)-54);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ra.HC(" + arg0 + ')');
		}
	}

	public static void method677(Class58 arg0, boolean arg1, Class58 arg2, int arg3)
	{
		try
		{
			anInt3202++;
			if(Class33_Sub6_Sub5.aBoolean2752)
			{
				Class59.method1067(1);
				Class33_Sub6_Sub5.aBoolean2752 = false;
				Class33_Sub6_Sub9.method517(14);
				Class49.method932(true);
				Class31.method255(false);
				Class66.method1100((byte)124);
				Class37.method869(Class33_Sub6_Sub12.anInt2974, Class17.anInt350, (byte)-73, Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677, Class33.anInt727);
				Class4.method59((byte)-81, -1, ~Class77_Sub2.anInt2644 == 0, Class30.anInt620, Class14.anIntArray274);
				Class3.aBoolean113 = true;
				Class33_Sub6_Sub16.aBoolean3112 = true;
				Class62.aBoolean1322 = true;
			}
			int i = 151;
			Class31.method252(64);
			i -= arg3;
			Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677.method459(arg0, 256, i + -1, 0xffffff, 0);
			if(arg2 != null)
			{
				i += 15;
				if(arg1)
				{
					int j = Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677.method465(arg2) + 4;
					Class33_Sub6_Sub7.method424(-(j / 2) + 257, i + -11, j, 11, 0);
				}
				Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677.method459(arg2, 256, -1 + i, 0xffffff, 0);
			}
			Class81.method1213((byte)-128);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ra.CC(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ')');
		}
	}

	public void method678(int arg0)
	{
		anInt3209++;
		super.anInt2239 = (7 + anInt3198) / 8;
		if(arg0 != 13656)
			aClass54_3215 = null;
	}

	public int method679(int arg0, int arg1)
	{
		try
		{
			if(arg0 != 8)
				method685(-124, -121);
			anInt3201++;
			return 8 * arg1 + -anInt3198;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ra.FC(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method680(byte arg0)
	{
		try
		{
			if(arg0 != 99)
			{
				return;
			} else
			{
				aClass54_3215 = null;
				anIntArray3199 = null;
				aClass58_3210 = null;
				aClass79_3212 = null;
				aClass58Array3211 = null;
				aClass58_3204 = null;
				aClass58_3200 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ra.VB(" + arg0 + ')');
		}
	}

	public void method681(int arg0[], int arg1)
	{
		anInt3205++;
		aClass65_3208 = new Class65(arg0);
		if(arg1 != -20186)
			method684(60);
	}

	public void method682(int arg0)
	{
		try
		{
			anInt3198 = 8 * super.anInt2239;
			if(arg0 != -1)
				method681(null, -107);
			anInt3206++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ra.WB(" + arg0 + ')');
		}
	}

	public void method683(int arg0, int arg1)
	{
		super.aByteArray2296[super.anInt2239++] = (byte)(aClass65_3208.method1089(true) + arg0);
		anInt3207++;
		if(arg1 != -1198)
			method684(17);
	}

	public int method684(int arg0)
	{
		try
		{
			if(arg0 != 8)
				aClass54_3215 = null;
			anInt3216++;
			return 0xff & super.aByteArray2296[super.anInt2239++] + -aClass65_3208.method1089(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ra.GC(" + arg0 + ')');
		}
	}

	public int method685(int arg0, int arg1)
	{
		try
		{
			int i = anInt3198 >> 0x22875783;
			if(arg0 > -37)
				aClass79_3212 = null;
			anInt3214++;
			int k = 0;
			int j = -(anInt3198 & 7) + 8;
			anInt3198 += arg1;
			for(; ~j > ~arg1; j = 8)
			{
				k += (Class49.anIntArray1074[j] & super.aByteArray2296[i++]) << arg1 + -j;
				arg1 -= j;
			}

			if(arg1 != j)
				k += super.aByteArray2296[i] >> j + -arg1 & Class49.anIntArray1074[arg1];
			else
				k += Class49.anIntArray1074[j] & super.aByteArray2296[i];
			return k;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ra.DC(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub11_Sub1(int arg0)
	{
		super(arg0);
	}

	public static int anInt3197;
	public int anInt3198;
	public static int anIntArray3199[] = new int[128];
	public static Class58 aClass58_3200 = Class33_Sub6_Sub11.method535(111, "Update)2Liste geladen)3");
	public static int anInt3201;
	public static int anInt3202;
	public static int anInt3203;
	public static Class58 aClass58_3204 = Class33_Sub6_Sub11.method535(109, "Unerwartete Antwort vom Anmelde)2Server)3");
	public static int anInt3205;
	public static int anInt3206;
	public static int anInt3207;
	public Class65 aClass65_3208;
	public static int anInt3209;
	public static Class58 aClass58_3210 = Class33_Sub6_Sub11.method535(127, "(Y<)4col>");
	public static Class58 aClass58Array3211[] = new Class58[100];
	public static Class79 aClass79_3212;
	public static int anInt3213;
	public static int anInt3214;
	public static Class54 aClass54_3215;
	public static int anInt3216;

}
