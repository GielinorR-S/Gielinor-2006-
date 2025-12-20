// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub13_Sub4.java


public class Class33_Sub13_Sub4 extends Class33_Sub13
{

	public synchronized boolean method748(int arg0, Class26 arg1, Class33_Sub14 arg2, int arg3, Class30 arg4)
	{
		try
		{
			int i = -58 / ((61 - arg3) / 59);
			arg2.method783();
			anInt3277++;
			boolean flag = true;
			int ai[] = null;
			if(arg0 > 0)
				ai = (new int[] {
					arg0
				});
			for(Class33_Sub18 class33_sub18 = (Class33_Sub18)arg2.aClass82_2334.method1221(0); class33_sub18 != null; class33_sub18 = (Class33_Sub18)arg2.aClass82_2334.method1215((byte)-79))
			{
				int j = (int)((Class33) (class33_sub18)).aLong747;
				Class33_Sub10 class33_sub10 = (Class33_Sub10)aClass82_3296.method1220(65, j);
				if(class33_sub10 == null)
				{
					class33_sub10 = Class33_Sub20.method824(j, (byte)83, arg4);
					if(class33_sub10 == null)
					{
						flag = false;
						continue;
					}
					aClass82_3296.method1218(class33_sub10, (byte)-107, j);
				}
				if(!class33_sub10.method615(class33_sub18.aByteArray2519, arg1, (byte)51, ai))
					flag = false;
			}

			if(flag)
				arg2.method784();
			return flag;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.Q(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ',' + (arg4 == null ? "null" : "{...}") + ')');
		}
	}

	public static Class33_Sub6_Sub7_Sub2 method749(Class30 arg0, int arg1, int arg2, byte arg3)
	{
		try
		{
			if(arg3 > -4)
				method756((byte)-127);
			anInt3283++;
			if(!Canvas_Sub1.method42(12127, arg2, arg1, arg0))
				return null;
			else
				return Class33_Sub6_Sub4_Sub6.method375(-62);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.MA(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public void method750(int arg0, int arg1)
	{
		if((4 & anIntArray3325[arg1]) != 0)
		{
			for(Class33_Sub7 class33_sub7 = (Class33_Sub7)aClass33_Sub13_Sub3_3331.aClass4_3252.method68(18823); class33_sub7 != null; class33_sub7 = (Class33_Sub7)aClass33_Sub13_Sub3_3331.aClass4_3252.method66((byte)-126))
				if(~arg1 == ~class33_sub7.anInt2157)
					class33_sub7.anInt2172 = 0;

		}
		anInt3292++;
		if(arg0 != -2)
			anInt3328 = 112;
	}

	public void method751(int arg0, int arg1)
	{
		anInt3327++;
		int i = arg1 & 0xf0;
		if(~i == -129)
		{
			int j = arg1 & 0xf;
			int i2 = 0x7f & arg1 >> 0x8cbbbe08;
			int l3 = (0x7f79e1 & arg1) >> 0x9c5c9930;
			method776(j, 66, i2, l3);
			return;
		}
		if(i == 144)
		{
			int k = 0xf & arg1;
			int j2 = 0x7f & arg1 >> 0xfc190ec8;
			int i4 = (arg1 & 0x7fc0f3) >> 0xfb2951b0;
			if(i4 > 0)
			{
				method766(arg0 + -124, j2, i4, k);
				return;
			} else
			{
				method776(k, 94, j2, 64);
				return;
			}
		}
		if(~i == -161)
		{
			int l = arg1 & 0xf;
			int k2 = arg1 >> 0xe4869308 & 0x7f;
			int j4 = (arg1 & 0x7f7c26) >> 0x1ee35430;
			method758(j4, (byte)-93, l, k2);
			return;
		}
		if(i == 176)
		{
			int i1 = arg1 & 0xf;
			int k4 = (0x7f6a71 & arg1) >> 0x5954e230;
			int l2 = (arg1 & 0x7fb5) >> 0x503b7628;
			if(l2 == 0)
				anIntArray3320[i1] = Class12.method110(0xffe03fff, anIntArray3320[i1]) + (k4 << 0x819a088e);
			if(~l2 == -33)
				anIntArray3320[i1] = (k4 << 0x15938ca7) + Class12.method110(-16257, anIntArray3320[i1]);
			if(l2 == 1)
				anIntArray3314[i1] = (k4 << 0xf3c47e7) + Class12.method110(anIntArray3314[i1], -16257);
			if(~l2 == -34)
				anIntArray3314[i1] = k4 + Class12.method110(-128, anIntArray3314[i1]);
			if(~l2 == -6)
				anIntArray3263[i1] = Class12.method110(-16257, anIntArray3263[i1]) - -(k4 << 0xb97af0a7);
			if(l2 == 37)
				anIntArray3263[i1] = Class12.method110(-128, anIntArray3263[i1]) - -k4;
			if(~l2 == -8)
				anIntArray3307[i1] = (k4 << 0xab307ac7) + Class12.method110(anIntArray3307[i1], -16257);
			if(~l2 == -40)
				anIntArray3307[i1] = k4 + Class12.method110(-128, anIntArray3307[i1]);
			if(l2 == 10)
				anIntArray3259[i1] = (k4 << 0xa1f1a3c7) + Class12.method110(-16257, anIntArray3259[i1]);
			if(l2 == 42)
				anIntArray3259[i1] = k4 + Class12.method110(-128, anIntArray3259[i1]);
			if(~l2 == -12)
				anIntArray3255[i1] = (k4 << 0xc4715f47) + Class12.method110(-16257, anIntArray3255[i1]);
			if(~l2 == -44)
				anIntArray3255[i1] = Class12.method110(anIntArray3255[i1], -128) - -k4;
			if(~l2 == -65)
				if(k4 >= 64)
					anIntArray3325[i1] = Class33_Sub6_Sub14.method576(anIntArray3325[i1], 1);
				else
					anIntArray3325[i1] = Class12.method110(anIntArray3325[i1], -2);
			if(~l2 == -66)
				if(~k4 > -65)
				{
					method760(i1, 0);
					anIntArray3325[i1] = Class12.method110(anIntArray3325[i1], -3);
				} else
				{
					anIntArray3325[i1] = Class33_Sub6_Sub14.method576(anIntArray3325[i1], 2);
				}
			if(~l2 == -100)
				anIntArray3272[i1] = (k4 << 0x1c5e5207) + Class12.method110(anIntArray3272[i1], 127);
			if(~l2 == -99)
				anIntArray3272[i1] = k4 + Class12.method110(anIntArray3272[i1], 16256);
			if(~l2 == -102)
				anIntArray3272[i1] = (k4 << 0xa25d5547) + Class12.method110(127, anIntArray3272[i1]) + 16384;
			if(l2 == 100)
				anIntArray3272[i1] = k4 + 16384 + Class12.method110(16256, anIntArray3272[i1]);
			if(l2 == 120)
				method778(i1, -72);
			if(l2 == 121)
				method767(i1, 15);
			if(~l2 == -124)
				method773(i1, arg0 ^ 0x69);
			if(l2 == 6)
			{
				int l4 = anIntArray3272[i1];
				if(l4 == 16384)
					anIntArray3287[i1] = (k4 << 0xf7fe7747) + Class12.method110(-16257, anIntArray3287[i1]);
			}
			if(l2 == 38)
			{
				int i5 = anIntArray3272[i1];
				if(~i5 == -16385)
					anIntArray3287[i1] = Class12.method110(anIntArray3287[i1], -128) + k4;
			}
			if(~l2 == -17)
				anIntArray3285[i1] = (k4 << 0x250d5467) + Class12.method110(-16257, anIntArray3285[i1]);
			if(l2 == 48)
				anIntArray3285[i1] = k4 + Class12.method110(-128, anIntArray3285[i1]);
			if(~l2 == -82)
				if(~k4 <= -65)
				{
					anIntArray3325[i1] = Class33_Sub6_Sub14.method576(anIntArray3325[i1], 4);
				} else
				{
					method750(-2, i1);
					anIntArray3325[i1] = Class12.method110(anIntArray3325[i1], -5);
				}
			if(~l2 == -18)
				method780(false, i1, (k4 << 0x4cae4867) + (0xffffc07f & anIntArray3265[i1]));
			if(l2 == 49)
				method780(false, i1, (0xffffff80 & anIntArray3265[i1]) - -k4);
			return;
		}
		if(i == 192)
		{
			int j1 = arg1 & 0xf;
			int i3 = arg1 >> 0xbb16b128 & 0x7f;
			method779(i3 + anIntArray3320[j1], true, j1);
			return;
		}
		if(i == 208)
		{
			int j3 = (arg1 & 0x7fe3) >> 0x39e5b848;
			int k1 = 0xf & arg1;
			method759(-66, j3, k1);
			return;
		}
		if(~i == -225)
		{
			int l1 = arg1 & 0xf;
			int k3 = ((arg1 & 0x7f01cf) >> 0xc97c4fc9) + (arg1 >> 0x8676d48 & 0x7f);
			method764(true, k3, l1);
			return;
		}
		i = arg1 & 0xff;
		if(arg0 != 0)
			return;
		if(i == 255)
			method755(84);
	}

	public static void method752(boolean arg0, Class30 arg1)
	{
		try
		{
			if(arg0)
				method749(null, -89, -37, (byte)-6);
			anInt3324++;
			Class32.aClass30_714 = arg1;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.R(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public boolean method753(int arg0, int arg1[], Class33_Sub7 arg2, byte arg3, int arg4)
	{
		try
		{
			arg2.anInt2159 = Class39.anInt863 / 100;
			anInt3280++;
			if(~arg2.anInt2139 <= -1 && (arg2.aClass33_Sub13_Sub1_2142 == null || arg2.aClass33_Sub13_Sub1_2142.method701()))
			{
				arg2.method605((byte)41);
				arg2.method266(-38);
				if(~arg2.anInt2169 < -1 && arg2 == aClass33_Sub7ArrayArray3302[arg2.anInt2157][arg2.anInt2169])
					aClass33_Sub7ArrayArray3302[arg2.anInt2157][arg2.anInt2169] = null;
				return true;
			}
			int i = arg2.anInt2149;
			if(arg3 != -19)
				aClass10_3318 = null;
			boolean flag = false;
			if(~i < -1)
			{
				i -= (int)(0.5D + Math.pow(2D, 0.0004921259842519685D * (double)anIntArray3263[arg2.anInt2157]) * 16D);
				if(i < 0)
					i = 0;
				arg2.anInt2149 = i;
			}
			arg2.aClass33_Sub13_Sub1_2142.method715(method763(arg2, (byte)51));
			arg2.anInt2138++;
			double d = (double)((arg2.anInt2149 * arg2.anInt2144 >> 0xeea324c) + (arg2.anInt2154 + -60 << 0x60b36468)) * 5.0862630208333331E-006D;
			Class68 class68 = arg2.aClass68_2140;
			arg2.anInt2165 += class68.anInt1459;
			if(class68.anInt1446 > 0)
				if(class68.anInt1447 <= 0)
					arg2.anInt2163 += 128;
				else
					arg2.anInt2163 += (int)(Math.pow(2D, (double)class68.anInt1447 * d) * 128D + 0.5D);
			if(class68.aByteArray1461 != null)
			{
				if(class68.anInt1440 <= 0)
					arg2.anInt2174 += 128;
				else
					arg2.anInt2174 += (int)(0.5D + 128D * Math.pow(2D, d * (double)class68.anInt1440));
				for(; arg2.anInt2150 < -2 + class68.aByteArray1461.length && arg2.anInt2174 > (0xff00 & class68.aByteArray1461[2 + arg2.anInt2150] << 0x5fd145e8); arg2.anInt2150 += 2);
				if(arg2.anInt2150 == -2 + class68.aByteArray1461.length && class68.aByteArray1461[1 + arg2.anInt2150] == 0)
					flag = true;
			}
			if(arg2.anInt2139 >= 0 && class68.aByteArray1443 != null && (anIntArray3325[arg2.anInt2157] & 1) == 0 && (~arg2.anInt2169 > -1 || aClass33_Sub7ArrayArray3302[arg2.anInt2157][arg2.anInt2169] != arg2))
			{
				if(class68.anInt1462 > 0)
					arg2.anInt2139 += (int)(Math.pow(2D, (double)class68.anInt1462 * d) * 128D + 0.5D);
				else
					arg2.anInt2139 += 128;
				for(; arg2.anInt2137 < -2 + class68.aByteArray1443.length && ~arg2.anInt2139 < ~((class68.aByteArray1443[2 + arg2.anInt2137] & 0xff) << 0x52226888); arg2.anInt2137 += 2);
				if(class68.aByteArray1443.length + -2 == arg2.anInt2137)
					flag = true;
			}
			if(flag)
			{
				arg2.aClass33_Sub13_Sub1_2142.method709(arg2.anInt2159);
				if(arg1 == null)
					arg2.aClass33_Sub13_Sub1_2142.method694(arg0);
				else
					arg2.aClass33_Sub13_Sub1_2142.method689(arg1, arg4, arg0);
				if(arg2.aClass33_Sub13_Sub1_2142.method714())
					aClass33_Sub13_Sub3_3331.aClass33_Sub13_Sub2_3254.method742(arg2.aClass33_Sub13_Sub1_2142);
				arg2.method605((byte)41);
				if(arg2.anInt2139 >= 0)
				{
					arg2.method266(arg3 ^ 0xa);
					if(~arg2.anInt2169 < -1 && aClass33_Sub7ArrayArray3302[arg2.anInt2157][arg2.anInt2169] == arg2)
						aClass33_Sub7ArrayArray3302[arg2.anInt2157][arg2.anInt2169] = null;
				}
				return true;
			} else
			{
				arg2.aClass33_Sub13_Sub1_2142.method734(arg2.anInt2159, method768(arg2, 100), method774(arg2, 123));
				return false;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.L(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public synchronized void method754(Class33_Sub14 arg0, int arg1, boolean arg2)
	{
		try
		{
			method781(arg1 + 16);
			if(arg1 != -1)
				return;
			aClass10_3318.method96(arg0.aByteArray2335);
			aLong3335 = 0L;
			anInt3291++;
			aBoolean3332 = arg2;
			int i = aClass10_3318.method95();
			for(int j = 0; j < i; j++)
			{
				aClass10_3318.method98(j);
				aClass10_3318.method91(j);
				aClass10_3318.method94(j);
			}

			anInt3328 = aClass10_3318.method90();
			anInt3333 = aClass10_3318.anIntArray179[anInt3328];
			aLong3334 = aClass10_3318.method97(anInt3333);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.PA(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method755(int arg0)
	{
		try
		{
			anInt3308++;
			method778(-1, 27);
			method767(-1, 15);
			int j = 68 / ((arg0 - -3) / 38);
			for(int i = 0; ~i > -17; i++)
				anIntArray3317[i] = anIntArray3289[i];

			for(int k = 0; k < 16; k++)
				anIntArray3320[k] = Class12.method110(anIntArray3289[k], -128);

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.HA(" + arg0 + ')');
		}
	}

	public static void method756(byte arg0)
	{
		try
		{
			aClass33_Sub15ArrayArray3336 = null;
			aClass58_3316 = null;
			aClass58_3276 = null;
			aClass58_3294 = null;
			aClass58_3261 = null;
			aClass58_3322 = null;
			aClass58_3286 = null;
			aClass58_3321 = null;
			aClass58_3303 = null;
			aClass58_3310 = null;
			if(arg0 < 11)
				anInt3258 = 122;
			aClass33_Sub6_Sub4_Sub5_Sub1_3305 = null;
			aClass58_3319 = null;
			aClass30_3267 = null;
			aClass58_3275 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.B(" + arg0 + ')');
		}
	}

	public static void method757(Class30 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5)
	{
		try
		{
			Class22.aBoolean419 = arg3;
			anInt3284++;
			Class55.anInt1161 = arg2;
			Class62.anInt1312 = 1;
			Class33_Sub12.anInt2321 = 10000;
			Class38.aClass30_852 = arg0;
			if(arg1 > -91)
			{
				return;
			} else
			{
				Class62.anInt1311 = arg4;
				Class33_Sub15.anInt2357 = arg5;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.S(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
		}
	}

	public void method758(int arg0, byte arg1, int arg2, int arg3)
	{
		anInt3306++;
		if(arg1 != -93)
			anIntArray3307 = null;
	}

	public void method759(int arg0, int arg1, int arg2)
	{
		anInt3264++;
		if(arg0 > -59)
			aClass33_Sub15ArrayArray3336 = null;
	}

	public void method760(int arg0, int arg1)
	{
		anInt3297++;
		if(arg1 != (anIntArray3325[arg0] & 2))
		{
			for(Class33_Sub7 class33_sub7 = (Class33_Sub7)aClass33_Sub13_Sub3_3331.aClass4_3252.method68(18823); class33_sub7 != null; class33_sub7 = (Class33_Sub7)aClass33_Sub13_Sub3_3331.aClass4_3252.method66((byte)-128))
				if(~arg0 == ~class33_sub7.anInt2157 && aClass33_Sub7ArrayArray3282[arg0][class33_sub7.anInt2154] == null && class33_sub7.anInt2139 < 0)
					class33_sub7.anInt2139 = 0;

		}
	}

	public synchronized Class33_Sub13 method692()
	{
		try
		{
			anInt3271++;
			return null;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.DA(" + ')');
		}
	}

	public synchronized void method761(byte arg0)
	{
		try
		{
			anInt3300++;
			for(Class33_Sub10 class33_sub10 = (Class33_Sub10)aClass82_3296.method1221(0); class33_sub10 != null; class33_sub10 = (Class33_Sub10)aClass82_3296.method1215((byte)-79))
				class33_sub10.method266(-63);

			int i = -125 % ((23 - arg0) / 35);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.F(" + arg0 + ')');
		}
	}

	public synchronized void method762(int arg0, int arg1, int arg2)
	{
		try
		{
			if(arg2 != -5574)
				method762(-90, 43, 99);
			method769(arg0, arg1, -16257);
			anInt3270++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.OA(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public int method763(Class33_Sub7 arg0, byte arg1)
	{
		try
		{
			anInt3269++;
			int i = (arg0.anInt2149 * arg0.anInt2144 >> 0xf8fbc0c) + arg0.anInt2145;
			i += anIntArray3287[arg0.anInt2157] * (anIntArray3313[arg0.anInt2157] - 8192) >> 0x1a651a0c;
			if(arg1 != 51)
				method770(13);
			Class68 class68 = arg0.aClass68_2140;
			if(~class68.anInt1459 < -1 && (class68.anInt1445 > 0 || anIntArray3314[arg0.anInt2157] > 0))
			{
				int l = class68.anInt1457 << 0x928799c1;
				int j = class68.anInt1445 << 0xdb184a02;
				if(~l < ~arg0.anInt2138)
					j = (j * arg0.anInt2138) / l;
				j += anIntArray3314[arg0.anInt2157] >> 0xbb402887;
				double d = Math.sin(0.012271846303085129D * (double)(0x1ff & arg0.anInt2165));
				i += (int)(d * (double)j);
			}
			int k = (int)(0.5D + ((double)(arg0.aClass33_Sub8_Sub1_2141.anInt3195 * 256) * Math.pow(2D, 0.00032552083333333332D * (double)i)) / (double)Class39.anInt863);
			if(~k > -2)
				return 1;
			else
				return k;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.I(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public void method764(boolean arg0, int arg1, int arg2)
	{
		anInt3257++;
		anIntArray3313[arg2] = arg1;
		if(!arg0)
			method692();
	}

	public synchronized void method765(int arg0, int arg1)
	{
		anInt3256++;
		anInt3304 = arg1;
		if(arg0 != -2)
			aClass58_3303 = null;
	}

	public void method766(int arg0, int arg1, int arg2, int arg3)
	{
		try
		{
			anInt3278++;
			method776(arg3, 82, arg1, 64);
			if(~(anIntArray3325[arg3] & 2) != -1)
			{
				for(Class33_Sub7 class33_sub7 = (Class33_Sub7)aClass33_Sub13_Sub3_3331.aClass4_3252.method70(-120); class33_sub7 != null; class33_sub7 = (Class33_Sub7)aClass33_Sub13_Sub3_3331.aClass4_3252.method55(0))
					if(~arg3 == ~class33_sub7.anInt2157 && ~class33_sub7.anInt2139 > -1)
					{
						aClass33_Sub7ArrayArray3282[arg3][class33_sub7.anInt2154] = null;
						aClass33_Sub7ArrayArray3282[arg3][arg1] = class33_sub7;
						int i = (class33_sub7.anInt2149 * class33_sub7.anInt2144 >> 0x435eb0c) + class33_sub7.anInt2145;
						class33_sub7.anInt2145 += -class33_sub7.anInt2154 + arg1 << 0x7d1e908;
						class33_sub7.anInt2149 = 4096;
						class33_sub7.anInt2154 = arg1;
						class33_sub7.anInt2144 = -class33_sub7.anInt2145 + i;
						return;
					}

			}
			Class33_Sub10 class33_sub10 = (Class33_Sub10)aClass82_3296.method1220(115, anIntArray3317[arg3]);
			if(class33_sub10 == null)
				return;
			Class33_Sub8_Sub1 class33_sub8_sub1 = class33_sub10.aClass33_Sub8_Sub1Array2205[arg1];
			if(class33_sub8_sub1 == null)
				return;
			Class33_Sub7 class33_sub7_1 = new Class33_Sub7();
			class33_sub7_1.aClass33_Sub8_Sub1_2141 = class33_sub8_sub1;
			class33_sub7_1.aClass33_Sub10_2155 = class33_sub10;
			class33_sub7_1.anInt2157 = arg3;
			class33_sub7_1.aClass68_2140 = class33_sub10.aClass68Array2216[arg1];
			class33_sub7_1.anInt2169 = class33_sub10.aByteArray2206[arg1];
			class33_sub7_1.anInt2154 = arg1;
			class33_sub7_1.anInt2168 = 1024 + arg2 * arg2 * (class33_sub10.anInt2211 * class33_sub10.aByteArray2218[arg1]) >> 0x6f0288eb;
			class33_sub7_1.anInt2156 = class33_sub10.aByteArray2221[arg1] & 0xff;
			if(arg0 >= -112)
				return;
			class33_sub7_1.anInt2145 = (arg1 << 0x2bdcf9a8) - (class33_sub10.aShortArray2212[arg1] & 0x7fff);
			class33_sub7_1.anInt2174 = 0;
			class33_sub7_1.anInt2150 = 0;
			class33_sub7_1.anInt2139 = -1;
			class33_sub7_1.anInt2137 = 0;
			class33_sub7_1.anInt2163 = 0;
			if(~anIntArray3285[arg3] == -1)
			{
				class33_sub7_1.aClass33_Sub13_Sub1_2142 = Class33_Sub13_Sub1.method718(class33_sub8_sub1, method763(class33_sub7_1, (byte)51), method768(class33_sub7_1, 93), method774(class33_sub7_1, 124));
			} else
			{
				class33_sub7_1.aClass33_Sub13_Sub1_2142 = Class33_Sub13_Sub1.method718(class33_sub8_sub1, method763(class33_sub7_1, (byte)51), 0, method774(class33_sub7_1, 119));
				method775(class33_sub7_1, class33_sub10.aShortArray2212[arg1] < 0, true);
			}
			if(~class33_sub10.aShortArray2212[arg1] > -1)
				class33_sub7_1.aClass33_Sub13_Sub1_2142.method696(-1);
			if(~class33_sub7_1.anInt2169 <= -1)
			{
				Class33_Sub7 class33_sub7_2 = aClass33_Sub7ArrayArray3302[arg3][class33_sub7_1.anInt2169];
				if(class33_sub7_2 != null && class33_sub7_2.anInt2139 < 0)
				{
					aClass33_Sub7ArrayArray3282[arg3][class33_sub7_2.anInt2154] = null;
					class33_sub7_2.anInt2139 = 0;
				}
				aClass33_Sub7ArrayArray3302[arg3][class33_sub7_1.anInt2169] = class33_sub7_1;
			}
			aClass33_Sub13_Sub3_3331.aClass4_3252.method63(class33_sub7_1, (byte)43);
			aClass33_Sub7ArrayArray3282[arg3][arg1] = class33_sub7_1;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.M(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public void method767(int arg0, int arg1)
	{
		try
		{
			anInt3288++;
			if(~arg0 > -1)
			{
				for(arg0 = 0; ~arg0 > -17; arg0++)
					method767(arg0, 15);

				return;
			}
			anIntArray3307[arg0] = 12800;
			anIntArray3259[arg0] = 8192;
			anIntArray3255[arg0] = 16383;
			anIntArray3313[arg0] = 8192;
			anIntArray3314[arg0] = 0;
			anIntArray3263[arg0] = 8192;
			method760(arg0, arg1 + -15);
			if(arg1 != 15)
			{
				return;
			} else
			{
				method750(-2, arg0);
				anIntArray3325[arg0] = 0;
				anIntArray3272[arg0] = 32767;
				anIntArray3287[arg0] = 256;
				anIntArray3285[arg0] = 0;
				method780(false, arg0, 8192);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.IA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public synchronized Class33_Sub13 method691()
	{
		try
		{
			anInt3290++;
			return aClass33_Sub13_Sub3_3331;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.NA(" + ')');
		}
	}

	public synchronized int method695()
	{
		try
		{
			anInt3262++;
			return 0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.P(" + ')');
		}
	}

	public int method768(Class33_Sub7 arg0, int arg1)
	{
		try
		{
			Class68 class68 = arg0.aClass68_2140;
			anInt3323++;
			int i = anIntArray3307[arg0.anInt2157] * anIntArray3255[arg0.anInt2157] + 4096 >> 0x6001ebed;
			i = 16384 + i * i >> 0x3d07ee4f;
			if(arg1 < 88)
				method781(-73);
			i = i * arg0.anInt2168 + 16384 >> 0xaf1b1e0f;
			i = 128 + anInt3304 * i >> 0x7e59ef08;
			if(class68.anInt1446 > 0)
				i = (int)((double)i * Math.pow(0.5D, (double)class68.anInt1446 * (1.953125E-005D * (double)arg0.anInt2163)) + 0.5D);
			if(class68.aByteArray1461 != null)
			{
				int j = arg0.anInt2174;
				int l = class68.aByteArray1461[1 + arg0.anInt2150];
				if(class68.aByteArray1461.length - 2 > arg0.anInt2150)
				{
					int j1 = (class68.aByteArray1461[arg0.anInt2150] & 0xff) << 0xe420d908;
					int l1 = class68.aByteArray1461[arg0.anInt2150 - -2] << 0xe6cb4c08 & 0xff00;
					l += ((class68.aByteArray1461[3 + arg0.anInt2150] + -l) * (-j1 + j)) / (l1 + -j1);
				}
				i = i * l + 32 >> 0xdcf1cde6;
			}
			if(arg0.anInt2139 > 0 && class68.aByteArray1443 != null)
			{
				int k = arg0.anInt2139;
				int i1 = class68.aByteArray1443[1 + arg0.anInt2137];
				if(-2 + class68.aByteArray1443.length > arg0.anInt2137)
				{
					int k1 = (class68.aByteArray1443[arg0.anInt2137] & 0xff) << 0x34f8b248;
					int i2 = (0xff & class68.aByteArray1443[arg0.anInt2137 - -2]) << 0x4191fd88;
					i1 += ((k - k1) * (-i1 + class68.aByteArray1443[3 + arg0.anInt2137])) / (i2 + -k1);
				}
				i = 32 + i * i1 >> 0x5d3b9586;
			}
			return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.FA(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public void method769(int arg0, int arg1, int arg2)
	{
		try
		{
			anIntArray3289[arg0] = arg1;
			anInt3260++;
			anIntArray3320[arg0] = Class12.method110(-128, arg1);
			if(arg2 != -16257)
				method778(103, -20);
			method779(arg1, true, arg0);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.CA(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public int method770(int arg0)
	{
		try
		{
			if(arg0 >= -97)
				method776(108, -94, 52, 88);
			anInt3326++;
			return anInt3304;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.C(" + arg0 + ')');
		}
	}

	public synchronized boolean method771(int arg0)
	{
		try
		{
			anInt3329++;
			if(arg0 != 0x7f79e1)
				aClass33_Sub6_Sub4_Sub5_Sub1_3305 = null;
			return aClass10_3318.method99();
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.E(" + arg0 + ')');
		}
	}

	public boolean method772(byte arg0, Class33_Sub7 arg1)
	{
		try
		{
			anInt3273++;
			if(arg0 != 88)
				aClass33_Sub7ArrayArray3302 = null;
			if(arg1.aClass33_Sub13_Sub1_2142 == null)
			{
				if(~arg1.anInt2139 <= -1)
				{
					arg1.method266(-103);
					if(~arg1.anInt2169 < -1 && aClass33_Sub7ArrayArray3302[arg1.anInt2157][arg1.anInt2169] == arg1)
						aClass33_Sub7ArrayArray3302[arg1.anInt2157][arg1.anInt2169] = null;
				}
				return true;
			} else
			{
				return false;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.V(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public void method773(int arg0, int arg1)
	{
		try
		{
			anInt3312++;
			if(arg1 < 101)
				return;
			for(Class33_Sub7 class33_sub7 = (Class33_Sub7)aClass33_Sub13_Sub3_3331.aClass4_3252.method68(18823); class33_sub7 != null; class33_sub7 = (Class33_Sub7)aClass33_Sub13_Sub3_3331.aClass4_3252.method66((byte)-127))
				if((arg0 < 0 || ~class33_sub7.anInt2157 == ~arg0) && ~class33_sub7.anInt2139 > -1)
				{
					aClass33_Sub7ArrayArray3282[class33_sub7.anInt2157][class33_sub7.anInt2154] = null;
					class33_sub7.anInt2139 = 0;
				}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.KA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method774(Class33_Sub7 arg0, int arg1)
	{
		try
		{
			int i = anIntArray3259[arg0.anInt2157];
			if(arg1 < 118)
				return -15;
			anInt3330++;
			if(~i > -8193)
				return arg0.anInt2156 * i + 32 >> 0xa83c8446;
			else
				return -((-arg0.anInt2156 + 128) * (-i + 16384) + 32 >> 0xc3a0c926) + 16384;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.D(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public void method775(Class33_Sub7 arg0, boolean arg1, boolean arg2)
	{
		try
		{
			int i = arg0.aClass33_Sub8_Sub1_2141.aByteArray3194.length;
			int j;
			if(!arg1 || !arg0.aClass33_Sub8_Sub1_2141.aBoolean3192)
			{
				j = (int)((long)i * (long)anIntArray3285[arg0.anInt2157] >> 0x9a0d1206);
			} else
			{
				int k = -arg0.aClass33_Sub8_Sub1_2141.anInt3196 + i + i;
				i <<= 8;
				j = (int)((long)k * (long)anIntArray3285[arg0.anInt2157] >> 0xe16c6ec6);
				if(j >= i)
				{
					j = -j + (-1 + i) + i;
					arg0.aClass33_Sub13_Sub1_2142.method698(true);
				}
			}
			if(!arg2)
			{
				return;
			} else
			{
				anInt3279++;
				arg0.aClass33_Sub13_Sub1_2142.method732(j);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.EA(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method776(int arg0, int arg1, int arg2, int arg3)
	{
		try
		{
			anInt3309++;
			Class33_Sub7 class33_sub7 = aClass33_Sub7ArrayArray3282[arg0][arg2];
			if(class33_sub7 == null)
				return;
			aClass33_Sub7ArrayArray3282[arg0][arg2] = null;
			if(arg1 <= 55)
				method691();
			if(~(2 & anIntArray3325[arg0]) != -1)
			{
				for(Class33_Sub7 class33_sub7_1 = (Class33_Sub7)aClass33_Sub13_Sub3_3331.aClass4_3252.method68(18823); class33_sub7_1 != null; class33_sub7_1 = (Class33_Sub7)aClass33_Sub13_Sub3_3331.aClass4_3252.method66((byte)-127))
					if(class33_sub7.anInt2157 == class33_sub7_1.anInt2157 && class33_sub7_1.anInt2139 < 0 && class33_sub7 != class33_sub7_1)
					{
						class33_sub7.anInt2139 = 0;
						return;
					}

				return;
			} else
			{
				class33_sub7.anInt2139 = 0;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.G(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public synchronized void method777(byte arg0)
	{
		try
		{
			anInt3295++;
			Class33_Sub10 class33_sub10 = (Class33_Sub10)aClass82_3296.method1221(0);
			if(arg0 != -78)
				method780(false, 95, -17);
			for(; class33_sub10 != null; class33_sub10 = (Class33_Sub10)aClass82_3296.method1215((byte)-79))
				class33_sub10.method618((byte)33);

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.AA(" + arg0 + ')');
		}
	}

	public synchronized void method694(int arg0)
	{
		try
		{
			anInt3268++;
			if(aClass10_3318.method99())
			{
				int i = (aClass10_3318.anInt183 * 0xf4240) / Class39.anInt863;
				do
				{
					long l = (long)i * (long)arg0 + aLong3335;
					if(~(-l + aLong3334) <= -1L)
					{
						aLong3335 = l;
						break;
					}
					int j = (int)(((-aLong3335 + aLong3334) - (-(long)i - -1L)) / (long)i);
					arg0 -= j;
					aLong3335 += (long)i * (long)j;
					aClass33_Sub13_Sub3_3331.method694(j);
					method782(32739);
				} while(aClass10_3318.method99());
			}
			aClass33_Sub13_Sub3_3331.method694(arg0);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.H(" + arg0 + ')');
		}
	}

	public void method778(int arg0, int arg1)
	{
		try
		{
			anInt3299++;
			Class33_Sub7 class33_sub7 = (Class33_Sub7)aClass33_Sub13_Sub3_3331.aClass4_3252.method68(18823);
			int i = 111 % ((-21 - arg1) / 34);
			for(; class33_sub7 != null; class33_sub7 = (Class33_Sub7)aClass33_Sub13_Sub3_3331.aClass4_3252.method66((byte)-126))
				if(~arg0 > -1 || ~arg0 == ~class33_sub7.anInt2157)
				{
					if(class33_sub7.aClass33_Sub13_Sub1_2142 != null)
					{
						class33_sub7.aClass33_Sub13_Sub1_2142.method709(Class39.anInt863 / 100);
						if(class33_sub7.aClass33_Sub13_Sub1_2142.method714())
							aClass33_Sub13_Sub3_3331.aClass33_Sub13_Sub2_3254.method742(class33_sub7.aClass33_Sub13_Sub1_2142);
						class33_sub7.method605((byte)41);
					}
					if(class33_sub7.anInt2139 < 0)
						aClass33_Sub7ArrayArray3282[class33_sub7.anInt2157][class33_sub7.anInt2154] = null;
					class33_sub7.method266(-54);
				}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.T(" + arg0 + ',' + arg1 + ')');
		}
	}

	public synchronized void method689(int arg0[], int arg1, int arg2)
	{
		try
		{
			anInt3266++;
			if(aClass10_3318.method99())
			{
				int i = (0xf4240 * aClass10_3318.anInt183) / Class39.anInt863;
				do
				{
					long l = (long)arg2 * (long)i + aLong3335;
					if(aLong3334 + -l >= 0L)
					{
						aLong3335 = l;
						break;
					}
					int j = (int)(((long)i + (-aLong3335 + (aLong3334 - 1L))) / (long)i);
					aLong3335 += (long)i * (long)j;
					arg2 -= j;
					aClass33_Sub13_Sub3_3331.method689(arg0, arg1, j);
					method782(32739);
					arg1 += j;
				} while(aClass10_3318.method99());
			}
			aClass33_Sub13_Sub3_3331.method689(arg0, arg1, arg2);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.J(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method779(int arg0, boolean arg1, int arg2)
	{
		anInt3311++;
		if(~anIntArray3317[arg2] != ~arg0)
		{
			anIntArray3317[arg2] = arg0;
			for(int i = 0; ~i > -129; i++)
				aClass33_Sub7ArrayArray3302[arg2][i] = null;

		}
		if(!arg1)
			aLong3334 = 55L;
	}

	public void method780(boolean arg0, int arg1, int arg2)
	{
		try
		{
			anInt3298++;
			if(arg0)
			{
				return;
			} else
			{
				anIntArray3265[arg1] = arg2;
				anIntArray3274[arg1] = (int)(0.5D + Math.pow(2D, (double)arg2 * 0.00054931640625D) * 2097152D);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.W(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public synchronized void method781(int arg0)
	{
		try
		{
			aClass10_3318.method93();
			anInt3281++;
			if(arg0 != 15)
				method748(-47, null, null, 66, null);
			method755(77);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.N(" + arg0 + ')');
		}
	}

	public void method782(int arg0)
	{
		try
		{
			int i = anInt3328;
			if(arg0 != 32739)
				anIntArray3285 = null;
			anInt3301++;
			int j = anInt3333;
			long l;
			for(l = aLong3334; j == anInt3333; l = aClass10_3318.method97(j))
			{
				while(~aClass10_3318.anIntArray179[i] == ~j) 
				{
					aClass10_3318.method98(i);
					int k = aClass10_3318.method89(i);
					if(k == 1)
					{
						aClass10_3318.method87();
						aClass10_3318.method94(i);
						if(aClass10_3318.method92())
							if(aBoolean3332 && ~j != -1)
							{
								aClass10_3318.method100(l);
							} else
							{
								method755(arg0 ^ 0x7fa1);
								aClass10_3318.method93();
								return;
							}
						break;
					}
					if((k & 0x80) != 0)
						method751(arg0 ^ 0x7fe3, k);
					aClass10_3318.method91(i);
					aClass10_3318.method94(i);
				}
				i = aClass10_3318.method90();
				j = aClass10_3318.anIntArray179[i];
			}

			aLong3334 = l;
			anInt3328 = i;
			anInt3333 = j;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.U(" + arg0 + ')');
		}
	}

	public Class33_Sub13_Sub4()
	{
		anIntArray3272 = new int[16];
		anIntArray3259 = new int[16];
		anIntArray3274 = new int[16];
		anIntArray3285 = new int[16];
		anIntArray3265 = new int[16];
		anIntArray3307 = new int[16];
		anIntArray3255 = new int[16];
		anIntArray3263 = new int[16];
		anIntArray3287 = new int[16];
		aClass33_Sub7ArrayArray3282 = new Class33_Sub7[16][128];
		aClass33_Sub7ArrayArray3302 = new Class33_Sub7[16][128];
		anIntArray3320 = new int[16];
		anIntArray3317 = new int[16];
		anIntArray3325 = new int[16];
		anInt3304 = 256;
		anIntArray3313 = new int[16];
		anIntArray3314 = new int[16];
		anIntArray3289 = new int[16];
		aClass10_3318 = new Class10();
		aClass33_Sub13_Sub3_3331 = new Class33_Sub13_Sub3(this);
		try
		{
			aClass82_3296 = new Class82(128);
			method755(-122);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ud.<init>(" + ')');
		}
	}

	public int anIntArray3255[];
	public static int anInt3256;
	public static int anInt3257;
	public static int anInt3258;
	public int anIntArray3259[];
	public static int anInt3260;
	public static Class58 aClass58_3261;
	public static int anInt3262;
	public int anIntArray3263[];
	public static int anInt3264;
	public int anIntArray3265[];
	public static int anInt3266;
	public static Class30 aClass30_3267;
	public static int anInt3268;
	public static int anInt3269;
	public static int anInt3270;
	public static int anInt3271;
	public int anIntArray3272[];
	public static int anInt3273;
	public int anIntArray3274[];
	public static Class58 aClass58_3275;
	public static Class58 aClass58_3276 = Class33_Sub6_Sub11.method535(107, "<col=00ffff>");
	public static int anInt3277;
	public static int anInt3278;
	public static int anInt3279;
	public static int anInt3280;
	public static int anInt3281;
	public Class33_Sub7 aClass33_Sub7ArrayArray3282[][];
	public static int anInt3283;
	public static int anInt3284;
	public int anIntArray3285[];
	public static Class58 aClass58_3286;
	public int anIntArray3287[];
	public static int anInt3288;
	public int anIntArray3289[];
	public static int anInt3290;
	public static int anInt3291;
	public static int anInt3292;
	public static boolean aBoolean3293 = false;
	public static Class58 aClass58_3294;
	public static int anInt3295;
	public Class82 aClass82_3296;
	public static int anInt3297;
	public static int anInt3298;
	public static int anInt3299;
	public static int anInt3300;
	public static int anInt3301;
	public Class33_Sub7 aClass33_Sub7ArrayArray3302[][];
	public static Class58 aClass58_3303;
	public int anInt3304;
	public static Class33_Sub6_Sub4_Sub5_Sub1 aClass33_Sub6_Sub4_Sub5_Sub1_3305;
	public static int anInt3306;
	public int anIntArray3307[];
	public static int anInt3308;
	public static int anInt3309;
	public static Class58 aClass58_3310;
	public static int anInt3311;
	public static int anInt3312;
	public int anIntArray3313[];
	public int anIntArray3314[];
	public static int anInt3315 = 0;
	public static Class58 aClass58_3316;
	public int anIntArray3317[];
	public Class10 aClass10_3318;
	public static Class58 aClass58_3319 = Class33_Sub6_Sub11.method535(106, ")4lang)4de");
	public int anIntArray3320[];
	public static Class58 aClass58_3321;
	public static Class58 aClass58_3322;
	public static int anInt3323;
	public static int anInt3324;
	public int anIntArray3325[];
	public static int anInt3326;
	public static int anInt3327;
	public int anInt3328;
	public static int anInt3329;
	public static int anInt3330;
	public Class33_Sub13_Sub3 aClass33_Sub13_Sub3_3331;
	public boolean aBoolean3332;
	public int anInt3333;
	public long aLong3334;
	public long aLong3335;
	public static Class33_Sub15 aClass33_Sub15ArrayArray3336[][];

	static 
	{
		aClass58_3261 = Class33_Sub6_Sub11.method535(108, "");
		aClass58_3286 = aClass58_3261;
		aClass58_3303 = aClass58_3261;
		aClass58_3294 = aClass58_3261;
		aClass58_3316 = aClass58_3261;
		aClass58_3310 = aClass58_3261;
		aClass58_3275 = aClass58_3261;
		aClass58_3322 = aClass58_3261;
		aClass58_3321 = aClass58_3261;
	}
}
