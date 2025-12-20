// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class46.java


public class Class46
{

	public void method915(boolean arg0, int arg1, boolean arg2)
	{
		try
		{
			anInt1007++;
			if(~arg1 == -2 && aBoolean1019)
				return;
			if(arg2)
				return;
			int i = anIntArray1003[Class73.anIntArray1557[arg1]];
			if(~i == -1)
				return;
			i -= 256;
			Class33_Sub6_Sub1 class33_sub6_sub1;
			do
			{
				if(arg0)
				{
					i++;
					if(~Class19.anInt377 >= ~i)
						i = 0;
				} else
				if(--i < 0)
					i = -1 + Class19.anInt377;
				class33_sub6_sub1 = client.method34(i, (byte)-119);
			} while(class33_sub6_sub1 == null || class33_sub6_sub1.aBoolean2655 || ~(arg1 + (aBoolean1019 ? 7 : 0)) != ~class33_sub6_sub1.anInt2673);
			anIntArray1003[Class73.anIntArray1557[arg1]] = 256 + i;
			method925(256);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ob.C(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method916(byte arg0, Class33_Sub11 arg1)
	{
		try
		{
			anInt1005++;
			arg1.method640(aBoolean1019 ? 1 : 0, arg0 + -11098);
			int i = 0;
			if(arg0 != -26)
				return;
			for(; ~i > -8; i++)
			{
				int j = anIntArray1003[Class73.anIntArray1557[i]];
				if(j != 0)
					arg1.method640(-256 + j, -11124);
				else
					arg1.method640(-1, -11124);
			}

			for(int k = 0; ~k > -6; k++)
				arg1.method640(anIntArray1017[k], arg0 + -11098);

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ob.H(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public void method917(int arg0, boolean arg1, int arg2)
	{
		try
		{
			anInt992++;
			int i = anIntArray1017[arg0];
			if(arg2 != -2273)
				aLong1006 = 60L;
			if(!arg1)
			{
				if(~--i > -1)
					i = -1 + Class38.aShortArrayArray843[arg0].length;
			} else
			if(~++i <= ~Class38.aShortArrayArray843[arg0].length)
				i = 0;
			anIntArray1017[arg0] = i;
			method925(256);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ob.L(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method918(int arg0, boolean arg1)
	{
		try
		{
			anInt1024++;
			if((!aBoolean1019) == (!arg1))
			{
				return;
			} else
			{
				method919(arg1, anIntArray1017, null, arg0, (byte)106);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ob.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method919(boolean arg0, int arg1[], int arg2[], int arg3, byte arg4)
	{
		try
		{
			anInt1010++;
			if(arg2 == null)
			{
				arg2 = new int[12];
				for(int i = 0; i < 7; i++)
				{
					for(int k = 0; k < Class19.anInt377; k++)
					{
						Class33_Sub6_Sub1 class33_sub6_sub1 = client.method34(k, (byte)37);
						if(class33_sub6_sub1 == null || class33_sub6_sub1.aBoolean2655 || (arg0 ? 7 : 0) + i != class33_sub6_sub1.anInt2673)
							continue;
						arg2[Class73.anIntArray1557[i]] = k + 256;
						break;
					}

				}

			}
			aBoolean1019 = arg0;
			anIntArray1003 = arg2;
			anInt1016 = arg3;
			anIntArray1017 = arg1;
			int j = -121 % ((arg4 - 63) / 39);
			method925(256);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ob.G(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public static boolean method920(int arg0)
	{
		try
		{
			anInt995++;
			if(~Class62.anInt1312 != -1)
				return true;
			if(arg0 != 8)
				return false;
			else
				return Class33_Sub7.aClass33_Sub13_Sub4_2164.method771(arg0 ^ 0x7f79e9);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ob.K(" + arg0 + ')');
		}
	}

	public static void method921(int arg0)
	{
		anIntArray1012 = null;
		anIntArray1008 = null;
		anIntArray996 = null;
		aClass58_1002 = null;
		aClass58_1001 = null;
		aClass58_1026 = null;
		aClass58_1011 = null;
		aClass33_Sub6_Sub7_Sub4_988 = null;
		aClass33_Sub11_Sub1_989 = null;
		aClass58_1013 = null;
		aClass58Array1020 = null;
		anIntArray998 = null;
		aClass58_997 = null;
		anIntArray990 = null;
		anIntArray1004 = null;
		aClass58_1018 = null;
		anIntArray1023 = null;
		aClass58_1021 = null;
		aClass58_1014 = null;
		anIntArray1015 = null;
		if(arg0 != 512)
			aClass58_1026 = null;
	}

	public static Class33_Sub6_Sub16 method922(int arg0, int arg1)
	{
		try
		{
			anInt993++;
			Class33_Sub6_Sub16 class33_sub6_sub16 = (Class33_Sub6_Sub16)Class82.aClass16_1791.method144(0, arg1);
			if(class33_sub6_sub16 != null)
				return class33_sub6_sub16;
			byte abyte0[] = Class33_Sub4.aClass30_2069.method238(false, arg1, arg0);
			class33_sub6_sub16 = new Class33_Sub6_Sub16();
			class33_sub6_sub16.anInt3118 = arg1;
			if(abyte0 != null)
				class33_sub6_sub16.method588(new Class33_Sub11(abyte0), (byte)-108);
			class33_sub6_sub16.method585(true);
			Class82.aClass16_1791.method145(arg1, (byte)-119, class33_sub6_sub16);
			return class33_sub6_sub16;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ob.E(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub3 method923(int arg0, Class33_Sub6_Sub14 arg1, int arg2, Class33_Sub6_Sub14 arg3, byte arg4)
	{
		try
		{
			if(arg4 != 1)
				method919(false, null, null, -104, (byte)-88);
			anInt994++;
			if(anInt1016 != -1)
				return method922(9, anInt1016).method584(arg1, arg3, arg4 + -1, arg2, arg0);
			long l = aLong987;
			int ai[] = anIntArray1003;
			if(arg1 != null && (~arg1.anInt3037 <= -1 || arg1.anInt3030 >= 0))
			{
				ai = new int[12];
				for(int i = 0; ~i > -13; i++)
					ai[i] = anIntArray1003[i];

				if(~arg1.anInt3037 <= -1)
				{
					l += arg1.anInt3037 - anIntArray1003[5] << 0xec2a8568;
					ai[5] = arg1.anInt3037;
				}
				if(arg1.anInt3030 >= 0)
				{
					l += -anIntArray1003[3] + arg1.anInt3030 << 0x4dae9b70;
					ai[3] = arg1.anInt3030;
				}
			}
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = (Class33_Sub6_Sub4_Sub3)Applet_Sub1.aClass16_11.method144(0, l);
			if(class33_sub6_sub4_sub3 == null)
			{
				boolean flag = false;
				for(int j = 0; j < 12; j++)
				{
					int k = ai[j];
					if(k >= 256 && ~k > -513 && !client.method34(k - 256, (byte)17).method297(arg4 + -1))
						flag = true;
					if(k >= 512 && !Class14.method127(k + -512, (byte)90).method534(false, aBoolean1019))
						flag = true;
				}

				if(flag)
				{
					if(aLong1006 != -1L)
						class33_sub6_sub4_sub3 = (Class33_Sub6_Sub4_Sub3)Applet_Sub1.aClass16_11.method144(0, aLong1006);
					if(class33_sub6_sub4_sub3 == null)
						return null;
				}
				if(class33_sub6_sub4_sub3 == null)
				{
					int i1 = 0;
					Class33_Sub6_Sub4_Sub7 aclass33_sub6_sub4_sub7[] = new Class33_Sub6_Sub4_Sub7[12];
					for(int j1 = 0; ~j1 > -13; j1++)
					{
						int k1 = ai[j1];
						if(k1 >= 256 && ~k1 > -513)
						{
							Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_1 = client.method34(k1 + -256, (byte)-120).method293(114);
							if(class33_sub6_sub4_sub7_1 != null)
								aclass33_sub6_sub4_sub7[i1++] = class33_sub6_sub4_sub7_1;
						}
						if(k1 >= 512)
						{
							Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_2 = Class14.method127(-512 + k1, (byte)90).method541(aBoolean1019, true);
							if(class33_sub6_sub4_sub7_2 != null)
								aclass33_sub6_sub4_sub7[i1++] = class33_sub6_sub4_sub7_2;
						}
					}

					Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = new Class33_Sub6_Sub4_Sub7(aclass33_sub6_sub4_sub7, i1);
					for(int l1 = 0; l1 < 5; l1++)
						if(anIntArray1017[l1] != 0)
						{
							class33_sub6_sub4_sub7.method389(Class38.aShortArrayArray843[l1][0], Class38.aShortArrayArray843[l1][anIntArray1017[l1]]);
							if(l1 == 1)
								class33_sub6_sub4_sub7.method389(Class4.aShortArray133[0], Class4.aShortArray133[anIntArray1017[l1]]);
						}

					class33_sub6_sub4_sub3 = class33_sub6_sub4_sub7.method385(64, 850, -30, -50, -30);
					Applet_Sub1.aClass16_11.method145(l, (byte)-102, class33_sub6_sub4_sub3);
					aLong1006 = l;
				}
			}
			if(arg1 == null && arg3 == null)
				return class33_sub6_sub4_sub3;
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3_1;
			if(arg1 != null && arg3 != null)
				class33_sub6_sub4_sub3_1 = arg1.method575(arg3, arg2, class33_sub6_sub4_sub3, 23214, arg0);
			else
			if(arg1 != null)
				class33_sub6_sub4_sub3_1 = arg1.method569(class33_sub6_sub4_sub3, arg0, (byte)-17);
			else
				class33_sub6_sub4_sub3_1 = arg3.method569(class33_sub6_sub4_sub3, arg2, (byte)-17);
			return class33_sub6_sub4_sub3_1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ob.A(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ',' + arg4 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub7 method924(byte arg0)
	{
		try
		{
			if(arg0 <= 78)
				method925(-89);
			anInt991++;
			if(anInt1016 != -1)
				return method922(9, anInt1016).method582((byte)103);
			boolean flag = false;
			for(int i = 0; i < 12; i++)
			{
				int j = anIntArray1003[i];
				if(~j <= -257 && j < 512 && !client.method34(j - 256, (byte)99).method298((byte)123))
					flag = true;
				if(~j <= -513 && !Class14.method127(j - 512, (byte)90).method538(aBoolean1019, -1))
					flag = true;
			}

			if(flag)
				return null;
			Class33_Sub6_Sub4_Sub7 aclass33_sub6_sub4_sub7[] = new Class33_Sub6_Sub4_Sub7[12];
			int k = 0;
			for(int l = 0; ~l > -13; l++)
			{
				int i1 = anIntArray1003[l];
				if(i1 >= 256 && ~i1 > -513)
				{
					Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_1 = client.method34(i1 - 256, (byte)28).method295((byte)-75);
					if(class33_sub6_sub4_sub7_1 != null)
						aclass33_sub6_sub4_sub7[k++] = class33_sub6_sub4_sub7_1;
				}
				if(i1 >= 512)
				{
					Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_2 = Class14.method127(-512 + i1, (byte)90).method528(aBoolean1019, 115);
					if(class33_sub6_sub4_sub7_2 != null)
						aclass33_sub6_sub4_sub7[k++] = class33_sub6_sub4_sub7_2;
				}
			}

			Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = new Class33_Sub6_Sub4_Sub7(aclass33_sub6_sub4_sub7, k);
			for(int j1 = 0; ~j1 > -6; j1++)
				if(anIntArray1017[j1] != 0)
				{
					class33_sub6_sub4_sub7.method389(Class38.aShortArrayArray843[j1][0], Class38.aShortArrayArray843[j1][anIntArray1017[j1]]);
					if(j1 == 1)
						class33_sub6_sub4_sub7.method389(Class4.aShortArray133[0], Class4.aShortArray133[anIntArray1017[j1]]);
				}

			return class33_sub6_sub4_sub7;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ob.I(" + arg0 + ')');
		}
	}

	public Class46()
	{
	}

	public void method925(int arg0)
	{
		anInt999++;
		long l = aLong987;
		aLong987 = 0L;
		int i = anIntArray1003[5];
		int j = anIntArray1003[9];
		anIntArray1003[5] = j;
		anIntArray1003[9] = i;
		for(int k = 0; ~k > -13; k++)
		{
			aLong987 <<= 4;
			if(anIntArray1003[k] >= 256)
				aLong987 += -256 + anIntArray1003[k];
		}

		if(~anIntArray1003[0] <= -257)
			aLong987 += anIntArray1003[0] + -256 >> 0x2a7a2864;
		if(~anIntArray1003[1] <= -257)
			aLong987 += anIntArray1003[1] - 256 >> 0x94e1a088;
		for(int i1 = 0; i1 < 5; i1++)
		{
			aLong987 <<= 3;
			aLong987 += anIntArray1017[i1];
		}

		aLong987 <<= 1;
		anIntArray1003[5] = i;
		aLong987 += aBoolean1019 ? 1 : 0;
		anIntArray1003[9] = j;
		if(arg0 != 256)
			aClass58_1026 = null;
		if(l != 0L && ~l != ~aLong987)
			Applet_Sub1.aClass16_11.method150(false, l);
	}

	public int method926(int arg0)
	{
		try
		{
			anInt1022++;
			if(arg0 != 512)
				return -83;
			if(~anInt1016 != 0)
				return method922(9, anInt1016).anInt3118 + 0x12345678;
			else
				return anIntArray1003[1] + (anIntArray1003[0] << 0xf7aaf5cf) + (anIntArray1017[4] << 0x823b3d14) + ((anIntArray1017[0] << 0xfc84eed9) + ((anIntArray1003[8] << 0x6278484a) + (anIntArray1003[11] << 0x23afd025)));
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ob.B(" + arg0 + ')');
		}
	}

	public long aLong987;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_988;
	public static Class33_Sub11_Sub1 aClass33_Sub11_Sub1_989 = new Class33_Sub11_Sub1(5000);
	public static int anIntArray990[];
	public static int anInt991;
	public static int anInt992;
	public static int anInt993;
	public static int anInt994;
	public static int anInt995;
	public static int anIntArray996[];
	public static Class58 aClass58_997;
	public static int anIntArray998[];
	public static int anInt999;
	public static int anInt1000;
	public static Class58 aClass58_1001 = Class33_Sub6_Sub11.method535(119, "<col=ff3000>");
	public static Class58 aClass58_1002 = Class33_Sub6_Sub11.method535(113, "An:");
	public int anIntArray1003[];
	public static int anIntArray1004[];
	public static int anInt1005;
	public long aLong1006;
	public static int anInt1007;
	public static int anIntArray1008[];
	public static int anInt1009;
	public static int anInt1010;
	public static Class58 aClass58_1011;
	public static int anIntArray1012[];
	public static Class58 aClass58_1013;
	public static Class58 aClass58_1014;
	public static int anIntArray1015[];
	public int anInt1016;
	public int anIntArray1017[];
	public static Class58 aClass58_1018;
	public boolean aBoolean1019;
	public static Class58 aClass58Array1020[];
	public static Class58 aClass58_1021;
	public static int anInt1022;
	public static int anIntArray1023[] = new int[5];
	public static int anInt1024;
	public static int anInt1025 = 0;
	public static Class58 aClass58_1026 = Class33_Sub6_Sub11.method535(110, "title)3jpg");

	static 
	{
		aClass58_997 = Class33_Sub6_Sub11.method535(117, "Create a free account");
		anInt1009 = 50;
		anIntArray1012 = new int[anInt1009];
		anIntArray1004 = new int[anInt1009];
		anIntArray998 = new int[anInt1009];
		anIntArray996 = new int[anInt1009];
		anIntArray990 = new int[anInt1009];
		aClass58_1013 = Class33_Sub6_Sub11.method535(120, "Drop");
		anIntArray1015 = new int[anInt1009];
		aClass58Array1020 = new Class58[anInt1009];
		aClass58_1011 = aClass58_1013;
		aClass58_1021 = Class33_Sub6_Sub11.method535(103, " from your ignore list first");
		aClass58_1014 = aClass58_1021;
		aClass58_1018 = aClass58_997;
		anIntArray1008 = new int[anInt1009];
	}
}
