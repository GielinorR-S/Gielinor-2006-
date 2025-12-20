// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub18.java


public class Class33_Sub18 extends Class33
{

	public static Class33_Sub6_Sub7_Sub4[] method810(int arg0, Class30 arg1, int arg2, int arg3)
	{
		try
		{
			anInt2521++;
			if(!Canvas_Sub1.method42(arg3 + 12127, arg0, arg2, arg1))
				return null;
			if(arg3 != 0)
				anInt2513 = 32;
			return Class4.method69(-20378);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qd.A(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static int method811(int arg0, int arg1, int arg2, byte arg3[])
	{
		try
		{
			anInt2526++;
			int i = -1;
			for(int j = arg0; arg1 > j; j++)
				i = Class82.anIntArray1795[(arg3[j] ^ i) & 0xff] ^ i >>> 0xc09a5ae8;

			i = ~i;
			if(arg2 != 0xc09a5ae8)
				return -96;
			else
				return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qd.B(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method812(int arg0, byte arg1)
	{
		client.anInt1948 += arg0 * 128;
		char c = '\u0100';
		anInt2511++;
		if(~client.anInt1948 < ~Class34.anIntArray1827.length)
		{
			client.anInt1948 -= Class34.anIntArray1827.length;
			int i = (int)(Math.random() * 12D);
			Class11.method107(Class33_Sub6_Sub15.aClass33_Sub6_Sub7_Sub4Array3065[i], -1);
		}
		if(arg1 != -115)
			aClass58_2524 = null;
		int j = 0;
		int k = 128 * arg0;
		int l = 128 * (-arg0 + c);
		for(int i1 = 0; l > i1; i1++)
		{
			int j1 = Class70.anIntArray1488[k + j] - (Class34.anIntArray1827[j + client.anInt1948 & -1 + Class34.anIntArray1827.length] * arg0) / 6;
			if(j1 < 0)
				j1 = 0;
			Class70.anIntArray1488[j++] = j1;
		}

		for(int k1 = -arg0 + c; ~c < ~k1; k1++)
		{
			int l1 = k1 * 128;
			for(int k2 = 0; ~k2 > -129; k2++)
			{
				int i3 = (int)(100D * Math.random());
				if(i3 >= 50 || k2 <= 10 || k2 >= 118)
					Class70.anIntArray1488[k2 - -l1] = 0;
				else
					Class70.anIntArray1488[k2 - -l1] = 255;
			}

		}

		if(~Class39.anInt858 < -1)
			Class39.anInt858 -= 4 * arg0;
		if(~Class33_Sub6_Sub4_Sub2.anInt3369 < -1)
			Class33_Sub6_Sub4_Sub2.anInt3369 -= 4 * arg0;
		if(~Class39.anInt858 == -1 && Class33_Sub6_Sub4_Sub2.anInt3369 == 0)
		{
			int i2 = (int)((double)(2000 / arg0) * Math.random());
			if(~i2 == -1)
				Class39.anInt858 = 1024;
			if(i2 == 1)
				Class33_Sub6_Sub4_Sub2.anInt3369 = 1024;
		}
		for(int j2 = 0; ~j2 > ~(-arg0 + c); j2++)
			Class54.anIntArray1159[j2] = Class54.anIntArray1159[j2 + arg0];

		for(int l2 = -arg0 + c; ~c < ~l2; l2++)
		{
			Class54.anIntArray1159[l2] = (int)(Math.sin((double)Class33_Sub6_Sub3.anInt2728 / 14D) * 16D + Math.sin((double)Class33_Sub6_Sub3.anInt2728 / 15D) * 14D + Math.sin((double)Class33_Sub6_Sub3.anInt2728 / 16D) * 12D);
			Class33_Sub6_Sub3.anInt2728++;
		}

		Class50.anInt1089 += arg0;
		int j3 = (arg0 + (1 & Class33_Sub6_Sub6.anInt2785)) / 2;
		if(~j3 < -1)
		{
			for(int k3 = 0; Class50.anInt1089 * 100 > k3; k3++)
			{
				int l3 = (int)(Math.random() * 124D) - -2;
				int j4 = 128 + (int)(Math.random() * 128D);
				Class70.anIntArray1488[(j4 << 0x96613567) + l3] = 192;
			}

			Class50.anInt1089 = 0;
			for(int i4 = 0; i4 < c; i4++)
			{
				int i5 = 128 * i4;
				int k4 = 0;
				for(int k5 = -j3; k5 < 128; k5++)
				{
					if(k5 + j3 < 128)
						k4 += Class70.anIntArray1488[j3 + i5 + k5];
					if(~(-j3 + (-1 + k5)) <= -1)
						k4 -= Class70.anIntArray1488[(k5 - -i5) + (-j3 - 1)];
					if(~k5 <= -1)
						Class33_Sub6_Sub4_Sub6.anIntArray3596[i5 + k5] = k4 / (1 + 2 * j3);
				}

			}

			for(int l4 = 0; ~l4 > -129; l4++)
			{
				int j5 = 0;
				for(int l5 = -j3; ~c < ~l5; l5++)
				{
					int i6 = l5 * 128;
					if(~c < ~(l5 - -j3))
						j5 += Class33_Sub6_Sub4_Sub6.anIntArray3596[128 * j3 + (i6 + l4)];
					if(~(l5 - (j3 + 1)) <= -1)
						j5 -= Class33_Sub6_Sub4_Sub6.anIntArray3596[(i6 + l4) - 128 * (1 + j3)];
					if(~l5 <= -1)
						Class70.anIntArray1488[l4 - -i6] = j5 / (2 * j3 - -1);
				}

			}

		}
	}

	public static void method813(int arg0)
	{
		aClass58_2509 = null;
		aClass33_Sub6_Sub7_Sub4_2523 = null;
		aClass61Array2515 = null;
		aClass58_2510 = null;
		aClass58_2529 = null;
		aClass58_2518 = null;
		aClass58_2522 = null;
		aClass58_2532 = null;
		aClass58_2533 = null;
		aClass58_2528 = null;
		aClass58_2530 = null;
		aClass58_2527 = null;
		aClass58_2524 = null;
		aClass58_2520 = null;
		aClass58_2512 = null;
		aClass58_2531 = null;
		if(arg0 != -19310)
			method813(-103);
	}

	public Class33_Sub18(byte arg0[])
	{
		try
		{
			aByteArray2519 = arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qd.<init>(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt2507;
	public static boolean aBoolean2508 = true;
	public static Class58 aClass58_2509 = Class33_Sub6_Sub11.method535(105, "m-Ochte mit Ihnen handeln)3");
	public static Class58 aClass58_2510 = Class33_Sub6_Sub11.method535(111, "backvmid3");
	public static int anInt2511;
	public static Class58 aClass58_2512 = Class33_Sub6_Sub11.method535(103, "nav");
	public static volatile int anInt2513 = 0;
	public static int anInt2514 = -1;
	public static Class61 aClass61Array2515[] = new Class61[50];
	public static int anInt2516 = 0;
	public static int anInt2517;
	public static Class58 aClass58_2518 = null;
	public byte aByteArray2519[];
	public static Class58 aClass58_2520;
	public static int anInt2521;
	public static Class58 aClass58_2522 = Class33_Sub6_Sub11.method535(122, "leuchten3:");
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_2523;
	public static Class58 aClass58_2524 = Class33_Sub6_Sub11.method535(121, "<col=00ff00>");
	public static int anInt2525 = 0;
	public static int anInt2526;
	public static Class58 aClass58_2527;
	public static Class58 aClass58_2528;
	public static Class58 aClass58_2529;
	public static Class58 aClass58_2530;
	public static Class58 aClass58_2531;
	public static Class58 aClass58_2532 = Class33_Sub6_Sub11.method535(122, "mn");
	public static Class58 aClass58_2533;

	static 
	{
		aClass58_2520 = Class33_Sub6_Sub11.method535(102, "go back to the main RuneScape webpage");
		aClass58_2527 = aClass58_2520;
		aClass58_2530 = Class33_Sub6_Sub11.method535(111, "Close");
		aClass58_2529 = aClass58_2530;
		aClass58_2528 = Class33_Sub6_Sub11.method535(109, "Please use a different world)3");
		aClass58_2531 = aClass58_2528;
		aClass58_2533 = aClass58_2528;
	}
}
