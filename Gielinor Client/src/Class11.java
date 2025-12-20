// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class11.java


public class Class11
{

	public int method103(byte arg0, int arg1)
	{
		try
		{
			int i = -2 + anIntArray191.length;
			if(arg0 != 20)
				method108(-125);
			anInt193++;
			int j = arg1 << 0xb6d91581 & i;
			do
			{
				int k = anIntArray191[j];
				if(arg1 == k)
					return anIntArray191[1 + j];
				if(~k == 0)
					return -1;
				j = i & 2 + j;
			} while(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "c.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method104(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		try
		{
			anInt190++;
			Class33_Sub12 class33_sub12 = (Class33_Sub12)client.aClass82_1943.method1220(109, arg2);
			if(arg0 != 0)
				return;
			if(class33_sub12 == null)
			{
				class33_sub12 = new Class33_Sub12();
				client.aClass82_1943.method1218(class33_sub12, (byte)38, arg2);
			}
			if(~class33_sub12.anIntArray2310.length >= ~arg1)
			{
				int ai[] = new int[1 + arg1];
				int ai1[] = new int[arg1 - -1];
				for(int i = 0; i < class33_sub12.anIntArray2310.length; i++)
				{
					ai[i] = class33_sub12.anIntArray2310[i];
					ai1[i] = class33_sub12.anIntArray2305[i];
				}

				for(int j = class33_sub12.anIntArray2310.length; ~arg1 < ~j; j++)
				{
					ai[j] = -1;
					ai1[j] = 0;
				}

				class33_sub12.anIntArray2305 = ai1;
				class33_sub12.anIntArray2310 = ai;
			}
			class33_sub12.anIntArray2310[arg1] = arg3;
			class33_sub12.anIntArray2305[arg1] = arg4;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "c.C(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public static void method105(int arg0)
	{
		if(arg0 != 29247)
			return;
		anInt194++;
		if(Class59.anInt1276 != -1)
		{
			Class33_Sub15 class33_sub15 = Class39.method879(Class59.anInt1276, (byte)119, Class33_Sub6_Sub3.anInt2729);
			if(class33_sub15 == null)
			{
				Class59.anInt1276 = -1;
				Class33_Sub6_Sub3.anInt2729 = -1;
				return;
			}
			Class33_Sub15 class33_sub15_1 = Class49.method931(class33_sub15, arg0 + -29138);
			if(class33_sub15_1 == null)
			{
				Class59.anInt1276 = -1;
				Class33_Sub6_Sub3.anInt2729 = -1;
				return;
			}
			Class47.anInt1040++;
			int j = Class13.anInt254;
			int i = Applet_Sub1.anInt41;
			if(Class19.anInt375 == 0)
			{
				i -= 4;
				j -= 4;
			}
			if(Class19.anInt375 == 1)
			{
				i -= 553;
				j -= 205;
			}
			if(~Class19.anInt375 == -3)
			{
				i -= 17;
				j -= 357;
			}
			j -= Class31.anInt695;
			i -= Class32.anInt710;
			int ai[] = Class38.method874(true, class33_sub15_1);
			Class33_Sub15 class33_sub15_2 = Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[class33_sub15.anInt2435 >> 0x32be0e30][class33_sub15.anInt2464 & 0xffff];
			if(~ai[1] < ~j)
				j = ai[1];
			if(i < ai[0])
				i = ai[0];
			if(ai[1] + class33_sub15_1.anInt2405 < class33_sub15.anInt2405 + j)
				j = (class33_sub15_1.anInt2405 + ai[1]) - class33_sub15.anInt2405;
			if(~(i + class33_sub15.anInt2462) < ~(ai[0] + class33_sub15_1.anInt2462))
				i = ai[0] + (class33_sub15_1.anInt2462 + -class33_sub15.anInt2462);
			int k = class33_sub15_1.anInt2413 + (i + -ai[0]);
			int l = -ai[1] + (j + class33_sub15_1.anInt2353);
			int ai1[] = Class38.method874(true, class33_sub15_2);
			int i1 = i - ai1[0] - -class33_sub15_2.anInt2413;
			int j1 = -ai1[1] + j + class33_sub15_2.anInt2353;
			int l1 = j1 + -class33_sub15.anInt2356;
			int k1 = -class33_sub15.anInt2443 + i1;
			if(~class33_sub15.anInt2391 > ~k1 || ~-class33_sub15.anInt2391 < ~k1 || l1 > class33_sub15.anInt2391 || ~l1 > ~-class33_sub15.anInt2391 || Class14.aBoolean285)
			{
				if(~class33_sub15.anInt2447 > ~Class47.anInt1040 || Class14.aBoolean285)
				{
					Class14.aBoolean285 = true;
				} else
				{
					k -= k1;
					i1 -= k1;
					j1 -= l1;
					l -= l1;
					k1 = 0;
					l1 = 0;
				}
			} else
			{
				l -= l1;
				i1 -= k1;
				k -= k1;
				j1 -= l1;
				l1 = 0;
				k1 = 0;
			}
			if(class33_sub15.anObjectArray2362 != null && Class14.aBoolean285)
				Class13.method118(class33_sub15.anObjectArray2362, class33_sub15, l, k, null, 18859, 0);
			if(~Class81.anInt1758 == -1)
			{
				if(!Class14.aBoolean285)
				{
					if(~Class33_Sub9.anInt2186 != -2 && !Class51.method943(-1 + Class14.anInt276, 123) || ~Class14.anInt276 >= -3)
					{
						if(Class14.anInt276 > 0)
							Class33_Sub6_Sub4_Sub6.method381((byte)-78, -1 + Class14.anInt276);
					} else
					{
						Class33_Sub6_Sub4_Sub6.method380(2);
					}
				} else
				{
					Class33_Sub15 class33_sub15_3 = Class70.method1118((-class33_sub15_1.anInt2413 + k) - -Class32.anInt710, class33_sub15, -class33_sub15_1.anInt2353 + (l - -Class31.anInt695), (byte)-2, class33_sub15_1);
					if(class33_sub15.anObjectArray2396 != null)
						Class13.method118(class33_sub15.anObjectArray2396, class33_sub15, l, k, class33_sub15_3, arg0 + -10388, 0);
					if(class33_sub15_3 != null && Class4.method64(class33_sub15, 25157) != null)
					{
						Class51.anInt1106++;
						Class46.aClass33_Sub11_Sub1_989.method683(160, -1198);
						Class46.aClass33_Sub11_Sub1_989.method673(-119, class33_sub15_3.anInt2432);
						Class46.aClass33_Sub11_Sub1_989.method625(class33_sub15.anInt2432, true);
						Class46.aClass33_Sub11_Sub1_989.method654(0x1bb12a8, class33_sub15.anInt2435);
						Class46.aClass33_Sub11_Sub1_989.method654(0x1bb12a8, class33_sub15_3.anInt2435);
					}
				}
				Class33_Sub6_Sub3.anInt2729 = -1;
				Class59.anInt1276 = -1;
			}
		}
	}

	public static void method106(int arg0)
	{
		try
		{
			aClass58_199 = null;
			aClass58_200 = null;
			anIntArray198 = null;
			aClass58_197 = null;
			aClass58_201 = null;
			if(arg0 != -17873)
				method106(-31);
			anIntArray195 = null;
			aClass12_196 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "c.E(" + arg0 + ')');
		}
	}

	public static void method107(Class33_Sub6_Sub7_Sub4 arg0, int arg1)
	{
		anInt192++;
		int i = 256;
		for(int j = 0; Class34.anIntArray1827.length > j; j++)
			Class34.anIntArray1827[j] = 0;

		for(int k = 0; ~k > -5001; k++)
		{
			int l = (int)(128D * Math.random() * (double)i);
			Class34.anIntArray1827[l] = (int)(Math.random() * 256D);
		}

		if(arg1 != -1)
			aClass58_201 = null;
		for(int i1 = 0; ~i1 > -21; i1++)
		{
			for(int j1 = 1; ~(-1 + i) < ~j1; j1++)
			{
				for(int l1 = 1; l1 < 127; l1++)
				{
					int j2 = l1 + (j1 << 0x458c77c7);
					Class33_Sub6_Sub16.anIntArray3067[j2] = (Class34.anIntArray1827[-128 + j2] + Class34.anIntArray1827[j2 + 1] + Class34.anIntArray1827[j2 - 1] + Class34.anIntArray1827[128 + j2]) / 4;
				}

			}

			int ai[] = Class34.anIntArray1827;
			Class34.anIntArray1827 = Class33_Sub6_Sub16.anIntArray3067;
			Class33_Sub6_Sub16.anIntArray3067 = ai;
		}

		if(arg0 != null)
		{
			int k1 = 0;
			for(int i2 = 0; ~i2 > ~arg0.anInt3731; i2++)
			{
				for(int k2 = 0; ~k2 > ~arg0.anInt3734; k2++)
					if(~arg0.aByteArray3732[k1++] != -1)
					{
						int l2 = (k2 - -16) + arg0.anInt3733;
						int i3 = 16 + (i2 - -arg0.anInt3736);
						int j3 = l2 - -(i3 << 0x98944647);
						Class34.anIntArray1827[j3] = 0;
					}

			}

		}
	}

	public Class11(int arg0[])
	{
		try
		{
			int i;
			for(i = 1; arg0.length - -(arg0.length >> 0x80845fa1) >= i; i <<= 1);
			anIntArray191 = new int[i - -i];
			for(int j = 0; ~j > ~(i + i); j++)
				anIntArray191[j] = -1;

			for(int k = 0; ~k > ~arg0.length; k++)
			{
				int l;
				for(l = -1 + i & arg0[k]; anIntArray191[(1 + l) - -l] != -1; l = i - 1 & l - -1);
				anIntArray191[l + l] = arg0[k];
				anIntArray191[1 + l + l] = k;
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "c.<init>(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method108(int arg0)
	{
		try
		{
			anInt188++;
			if(Class62.aClass43_1316 != null)
			{
				Class62.aClass43_1316.method903(1);
				Class62.aClass43_1316 = null;
			}
			Class33_Sub6_Sub13.method553(-128);
			Class33_Sub2.aClass56_2035.method995();
			for(int i = 0; i < 4; i++)
				Class51.aClass70Array1098[i].method1127(18580);

			System.gc();
			Class31.method257(-27742, 2);
			Class33_Sub6_Sub10.anInt2877 = -1;
			Class20.aBoolean381 = false;
			Class33.method262(-95);
			if(arg0 <= 116)
				method108(45);
			Class29.method215(10, (byte)-47);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "c.F(" + arg0 + ')');
		}
	}

	public static int anInt186 = 0;
	public static int anInt187;
	public static int anInt188;
	public static volatile int anInt189 = 0;
	public static int anInt190;
	public int anIntArray191[];
	public static int anInt192;
	public static int anInt193;
	public static int anInt194;
	public static int anIntArray195[] = {
		1, 2, 4, 8
	};
	public static Class12 aClass12_196;
	public static Class58 aClass58_197 = Class33_Sub6_Sub11.method535(105, "chatback");
	public static int anIntArray198[] = new int[32];
	public static Class58 aClass58_199 = Class33_Sub6_Sub11.method535(116, "Ihr Spielkonto wird bereits benutzt)3");
	public static Class58 aClass58_200 = Class33_Sub6_Sub11.method535(108, "sl_flags");
	public static Class58 aClass58_201 = Class33_Sub6_Sub11.method535(103, "(Z");
	public static int anInt202 = 0;

}
