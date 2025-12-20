// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class14.java


public class Class14
{

	public static void method125(int arg0, int arg1)
	{
		try
		{
			if(arg0 != 507)
				return;
			Class33_Sub12 class33_sub12 = (Class33_Sub12)client.aClass82_1943.method1220(82, arg1);
			anInt282++;
			if(class33_sub12 == null)
			{
				return;
			} else
			{
				class33_sub12.method266(-54);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "de.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method126(int arg0)
	{
		anInt284++;
		Class30_Sub1.method245(arg0 ^ 0x17f9);
		if(~Class33_Sub6_Sub9.anInt2851 == -2)
			Class33_Sub20.aClass33_Sub6_Sub7_Sub3Array2579[Class12.anInt242 / 100].method478(-4 + (-8 + Class33_Sub20.anInt2565), (-4 + Class3.anInt112) - 8);
		if(~Class33_Sub6_Sub9.anInt2851 == -3)
			Class33_Sub20.aClass33_Sub6_Sub7_Sub3Array2579[Class12.anInt242 / 100 + 4].method478(-8 + Class33_Sub20.anInt2565 + -4, Class3.anInt112 + -12);
		if(~Class27.anInt563 != 0)
		{
			Class66.method1095(Class27.anInt563, 2047);
			Class33_Sub2.method275(4, arg0 ^ 0xffffa5f5, Class27.anInt563, 512, 0, 334, 0);
		}
		if(~Class33_Sub6_Sub14.anInt3013 != 0)
		{
			Class66.method1095(Class33_Sub6_Sub14.anInt3013, 2047);
			Class33_Sub2.method275(0, arg0 + -25869, Class33_Sub6_Sub14.anInt3013, 512, 0, 334, 0);
		}
		Class33_Sub19.method814((byte)84);
		if(!Class33_Sub6_Sub4_Sub4.aBoolean3486)
		{
			Class70.method1132((byte)18);
			Class33_Sub10.method616((byte)-125);
		} else
		if(Class33_Sub6.anInt2127 == 0)
			Class33_Sub6_Sub4_Sub5_Sub2.method373(-104);
		if(Class3.anInt108 == 1)
			Class33_Sub19.aClass33_Sub6_Sub7_Sub3_2556.method478(472, 296);
		if(Class33_Sub6_Sub4_Sub1.aBoolean3345)
		{
			char c = '\u01FB';
			int j = 20;
			Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677.method449(Class35.method846((byte)-83, new Class58[] {
				Class31.aClass58_698, Class37.method859(arg0 ^ 0x2b64, Class11.anInt202)
			}), c, j, 0xffff00, -1);
			j += 15;
			Runtime runtime = Runtime.getRuntime();
			int l = (int)((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
			int i1 = 0xffff00;
			if(l > 32768 && Class33_Sub3.aBoolean2058)
				i1 = 0xff0000;
			if(~l < 0xfffeffff && !Class33_Sub3.aBoolean2058)
				i1 = 0xff0000;
			Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677.method449(Class35.method846((byte)-83, new Class58[] {
				Class32.aClass58_719, Class37.method859(15591, l), Class16.aClass58_323
			}), c, j, i1, -1);
			j += 15;
			if(Class33_Sub6_Sub16.aBoolean3112)
			{
				Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677.method449(Class33_Sub6_Sub11.aClass58_2946, c, j, 0xff0000, -1);
				Class33_Sub6_Sub16.aBoolean3112 = false;
				j += 15;
			}
			if(Class3.aBoolean113)
			{
				Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677.method449(Class35.aClass58_752, c, j, 0xff0000, -1);
				Class3.aBoolean113 = false;
				j += 15;
			}
			if(Class62.aBoolean1322)
			{
				Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677.method449(Class49.aClass58_1076, c, j, 0xff0000, -1);
				j += 15;
				Class62.aBoolean1322 = false;
			}
		}
		if(arg0 != 6019)
			anInt281 = -79;
		if(~Class12.anInt226 != -1)
		{
			int i = Class12.anInt226 / 50;
			int k = i / 60;
			i %= 60;
			if(i >= 10)
			{
				Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677.method464(Class35.method846((byte)-83, new Class58[] {
					Class33_Sub6_Sub4_Sub6.aClass58_3577, Class37.method859(15591, k), Class19.aClass58_372, Class37.method859(15591, i)
				}), 4, 329, 0xffff00, -1);
				return;
			}
			Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677.method464(Class35.method846((byte)-83, new Class58[] {
				Class33_Sub6_Sub4_Sub6.aClass58_3577, Class37.method859(15591, k), Class81.aClass58_1754, Class37.method859(15591, i)
			}), 4, 329, 0xffff00, -1);
		}
	}

	public static Class33_Sub6_Sub11 method127(int arg0, byte arg1)
	{
		try
		{
			Class33_Sub6_Sub11 class33_sub6_sub11 = (Class33_Sub6_Sub11)Class44.aClass16_960.method144(0, arg0);
			anInt279++;
			if(class33_sub6_sub11 != null)
				return class33_sub6_sub11;
			byte abyte0[] = Class22.aClass30_413.method238(false, arg0, 10);
			class33_sub6_sub11 = new Class33_Sub6_Sub11();
			class33_sub6_sub11.anInt2900 = arg0;
			if(abyte0 != null)
				class33_sub6_sub11.method530((byte)-76, new Class33_Sub11(abyte0));
			class33_sub6_sub11.method539((byte)-57);
			if(~class33_sub6_sub11.anInt2905 != 0)
				class33_sub6_sub11.method527(method127(class33_sub6_sub11.anInt2905, (byte)90), method127(class33_sub6_sub11.anInt2901, (byte)90), -106);
			if(arg1 != 90)
				return null;
			if(!Class35.aBoolean759 && class33_sub6_sub11.aBoolean2935)
			{
				class33_sub6_sub11.aClass58Array2947 = null;
				class33_sub6_sub11.aClass58_2898 = Class33_Sub9.aClass58_2197;
				class33_sub6_sub11.aClass58Array2917 = null;
				class33_sub6_sub11.anInt2913 = 0;
			}
			Class44.aClass16_960.method145(arg0, (byte)-119, class33_sub6_sub11);
			return class33_sub6_sub11;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "de.B(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method128(int arg0)
	{
		try
		{
			anIntArray274 = null;
			if(arg0 != -19549)
			{
				return;
			} else
			{
				aClass58_286 = null;
				aClass58_273 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "de.E(" + arg0 + ')');
		}
	}

	public static boolean method129(byte arg0, Class33_Sub15 arg1)
	{
		try
		{
			anInt283++;
			int i = arg1.anInt2446;
			if(Class30.anInt673 == 2)
			{
				if(~i == -202)
				{
					Class33_Sub13_Sub4.aClass58_3322 = Class33_Sub13_Sub4.aClass58_3261;
					Class33_Sub20.anInt2567 = 0;
					Class33_Sub13_Sub4.aClass58_3286 = Class33_Sub6_Sub17.aClass58_3132;
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					Class37.anInt834 = 1;
					Class33_Sub10.aBoolean2208 = true;
				}
				if(i == 202)
				{
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					Class33_Sub13_Sub4.aClass58_3286 = Class9.aClass58_169;
					Class33_Sub20.anInt2567 = 0;
					Class37.anInt834 = 2;
					Class33_Sub13_Sub4.aClass58_3322 = Class33_Sub13_Sub4.aClass58_3261;
					Class33_Sub10.aBoolean2208 = true;
				}
			}
			if(arg0 != 126)
				return false;
			if(~i == -206)
			{
				Class21.anInt402 = 250;
				return true;
			}
			if(i == 501)
			{
				Class33_Sub10.aBoolean2208 = true;
				Class37.anInt834 = 4;
				Class33_Sub20.anInt2567 = 0;
				Class33_Sub13_Sub4.aClass58_3286 = Class33_Sub6_Sub4_Sub1.aClass58_3362;
				Class33_Sub13_Sub4.aClass58_3322 = Class33_Sub13_Sub4.aClass58_3261;
				Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
			}
			if(i == 502)
			{
				Class33_Sub10.aBoolean2208 = true;
				Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
				Class33_Sub13_Sub4.aClass58_3322 = Class33_Sub13_Sub4.aClass58_3261;
				Class33_Sub13_Sub4.aClass58_3286 = Class33_Sub21.aClass58_2583;
				Class37.anInt834 = 5;
				Class33_Sub20.anInt2567 = 0;
			}
			if(i >= 300 && ~i >= -314)
			{
				int j = (-300 + i) / 2;
				int l = 1 & i;
				Class37.aClass46_809.method915(l == 1, j, false);
			}
			if(i >= 314 && i <= 323)
			{
				int k = (i - 314) / 2;
				int i1 = 1 & i;
				Class37.aClass46_809.method917(k, i1 == 1, arg0 + -2399);
			}
			if(i == 324)
				Class37.aClass46_809.method918(-1, false);
			if(i == 325)
				Class37.aClass46_809.method918(-1, true);
			if(~i == -327)
			{
				Applet_Sub1.anInt36++;
				Class46.aClass33_Sub11_Sub1_989.method683(168, -1198);
				Class37.aClass46_809.method916((byte)-26, Class46.aClass33_Sub11_Sub1_989);
				return true;
			}
			if(i == 620)
				Class3.aBoolean117 = !Class3.aBoolean117;
			if(~i <= -602 && i <= 613)
			{
				Class43.method900(true);
				if(~Class33_Sub13_Sub4.aClass58_3294.method1035(arg0 + -99) < -1)
				{
					Class46.aClass33_Sub11_Sub1_989.method683(84, arg0 ^ 0xfffffb2c);
					Class46.aClass33_Sub11_Sub1_989.method675(Class33_Sub13_Sub4.aClass58_3294.method1062((byte)11), (byte)107);
					Class34.anInt1844++;
					Class46.aClass33_Sub11_Sub1_989.method640(-601 + i, arg0 + -11250);
					Class46.aClass33_Sub11_Sub1_989.method640(Class3.aBoolean117 ? 1 : 0, arg0 ^ 0xffffd4f2);
				}
			}
			return false;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "de.F(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method130(int arg0)
	{
		if(arg0 < 109)
			method126(-26);
		if(Class33_Sub6_Sub2.anInt2694 == 227)
		{
			byte byte0 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method657(0);
			byte byte1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method624((byte)-24);
			int i5 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
			int l7 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
			int k10 = l7 >> 0x94413862;
			int i13 = 3 & l7;
			int j15 = Class47.anIntArray1038[k10];
			byte byte2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method624((byte)-24);
			int l17 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(68);
			int l18 = (l17 >> 0xa7e36ee4 & 7) + Class33_Sub3.anInt2042;
			int k19 = (l17 & 7) + Class60.anInt1284;
			int j20 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(112);
			int i21 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
			int k21 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-107);
			byte byte3 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method661((byte)-113);
			Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1;
			if(k21 != Class33_Sub6_Sub6.anInt2786)
				class33_sub6_sub4_sub5_sub1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[k21];
			else
				class33_sub6_sub4_sub5_sub1 = Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305;
			if(class33_sub6_sub4_sub5_sub1 != null)
			{
				Class33_Sub6_Sub17 class33_sub6_sub17 = Class33_Sub5.method285((byte)-58, i21);
				int i22 = Class30.anIntArrayArrayArray645[Class77_Sub2.anInt2645][l18][k19];
				int j22 = Class30.anIntArrayArrayArray645[Class77_Sub2.anInt2645][1 + l18][k19];
				int k22 = Class30.anIntArrayArrayArray645[Class77_Sub2.anInt2645][l18 + 1][k19 - -1];
				int l22 = Class30.anIntArrayArrayArray645[Class77_Sub2.anInt2645][l18][k19 - -1];
				Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = class33_sub6_sub17.method596((byte)-81, k22, i13, i22, l22, k10, j22);
				if(class33_sub6_sub4_sub3 != null)
				{
					RuntimeException_Sub1.method1226(0, i5 + 1, 1 + j20, 120, -1, j15, k19, Class77_Sub2.anInt2645, l18, 0);
					class33_sub6_sub4_sub5_sub1.aClass33_Sub6_Sub4_Sub3_3756 = class33_sub6_sub4_sub3;
					if(~byte0 > ~byte2)
					{
						byte byte4 = byte2;
						byte2 = byte0;
						byte0 = byte4;
					}
					int i23 = class33_sub6_sub17.anInt3181;
					class33_sub6_sub4_sub5_sub1.anInt3742 = j20 - -Class33_Sub6_Sub6.anInt2785;
					if(~byte1 < ~byte3)
					{
						byte byte5 = byte1;
						byte1 = byte3;
						byte3 = byte5;
					}
					class33_sub6_sub4_sub5_sub1.anInt3740 = Class33_Sub6_Sub6.anInt2785 + i5;
					int j23 = class33_sub6_sub17.anInt3165;
					if(~i13 == -2 || i13 == 3)
					{
						j23 = class33_sub6_sub17.anInt3181;
						i23 = class33_sub6_sub17.anInt3165;
					}
					class33_sub6_sub4_sub5_sub1.anInt3751 = 128 * l18 + i23 * 64;
					class33_sub6_sub4_sub5_sub1.anInt3741 = 128 * k19 - -(j23 * 64);
					class33_sub6_sub4_sub5_sub1.anInt3746 = Class38.method871(class33_sub6_sub4_sub5_sub1.anInt3751, Class77_Sub2.anInt2645, class33_sub6_sub4_sub5_sub1.anInt3741, 80);
					class33_sub6_sub4_sub5_sub1.anInt3748 = byte2 + l18;
					class33_sub6_sub4_sub5_sub1.anInt3737 = byte3 + k19;
					class33_sub6_sub4_sub5_sub1.anInt3765 = byte0 + l18;
					class33_sub6_sub4_sub5_sub1.anInt3772 = k19 - -byte1;
				}
			}
		}
		anInt277++;
		if(~Class33_Sub6_Sub2.anInt2694 == -49)
		{
			int i = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int k2 = Class33_Sub3.anInt2042 - -((0x73 & i) >> 0x8fdce824);
			int j5 = (i & 7) + Class60.anInt1284;
			int i8 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
			if(~k2 <= -1 && ~j5 <= -1 && ~k2 > -105 && j5 < 104)
			{
				Class4 class4 = Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][k2][j5];
				if(class4 != null)
				{
					for(Class33_Sub6_Sub4_Sub1 class33_sub6_sub4_sub1 = (Class33_Sub6_Sub4_Sub1)class4.method68(18823); class33_sub6_sub4_sub1 != null; class33_sub6_sub4_sub1 = (Class33_Sub6_Sub4_Sub1)class4.method66((byte)-126))
					{
						if((i8 & 0x7fff) != class33_sub6_sub4_sub1.anInt3363)
							continue;
						class33_sub6_sub4_sub1.method266(-106);
						break;
					}

					if(class4.method68(18823) == null)
						Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][k2][j5] = null;
					Class32.method260(1, j5, k2);
				}
			}
			return;
		}
		if(Class33_Sub6_Sub2.anInt2694 == 119)
		{
			int j = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int k5 = Class60.anInt1284 + (7 & j);
			int l2 = (j >> 0x75d03ae4 & 7) + Class33_Sub3.anInt2042;
			int j8 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(107);
			int l10 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int j13 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(44);
			if(~l2 <= -1 && k5 >= 0 && ~l2 > -105 && k5 < 104)
			{
				k5 = 128 * k5 + 64;
				l2 = 128 * l2 + 64;
				Class33_Sub6_Sub4_Sub4 class33_sub6_sub4_sub4 = new Class33_Sub6_Sub4_Sub4(j8, Class77_Sub2.anInt2645, l2, k5, -l10 + Class38.method871(l2, Class77_Sub2.anInt2645, k5, -128), j13, Class33_Sub6_Sub6.anInt2785);
				Class66.aClass4_1415.method63(class33_sub6_sub4_sub4, (byte)114);
			}
			return;
		}
		if(Class33_Sub6_Sub2.anInt2694 == 39)
		{
			int k = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int l5 = (k & 7) + Class60.anInt1284;
			int i3 = Class33_Sub3.anInt2042 + (7 & k >> 0xfb09c964);
			int k8 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method661((byte)-106) + i3;
			int i11 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method661((byte)-100) + l5;
			int k13 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method672(113);
			int k15 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(49);
			int l16 = 4 * Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int i18 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123) * 4;
			int i19 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(113);
			int l19 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(115);
			int k20 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int j21 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			if(i3 >= 0 && ~l5 <= -1 && i3 < 104 && ~l5 > -105 && k8 >= 0 && ~i11 <= -1 && ~k8 > -105 && ~i11 > -105 && k15 != 65535)
			{
				l5 = 64 + l5 * 128;
				i11 = 128 * i11 - -64;
				k8 = 64 + 128 * k8;
				i3 = i3 * 128 - -64;
				Class33_Sub6_Sub4_Sub6 class33_sub6_sub4_sub6 = new Class33_Sub6_Sub4_Sub6(k15, Class77_Sub2.anInt2645, i3, l5, Class38.method871(i3, Class77_Sub2.anInt2645, l5, 24) + -l16, i19 + Class33_Sub6_Sub6.anInt2785, l19 - -Class33_Sub6_Sub6.anInt2785, k20, j21, k13, i18);
				class33_sub6_sub4_sub6.method376(-i18 + Class38.method871(k8, Class77_Sub2.anInt2645, i11, -125), (byte)-88, i11, i19 + Class33_Sub6_Sub6.anInt2785, k8);
				Class69.aClass4_1463.method63(class33_sub6_sub4_sub6, (byte)46);
			}
			return;
		}
		if(~Class33_Sub6_Sub2.anInt2694 == -112)
		{
			int l = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
			int j3 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-122);
			int i6 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
			int l8 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
			int j11 = ((l8 & 0x74) >> 0x8446e924) + Class33_Sub3.anInt2042;
			int l13 = (l8 & 7) + Class60.anInt1284;
			if(j11 >= 0 && l13 >= 0 && j11 < 104 && l13 < 104 && ~j3 != ~Class33_Sub6_Sub6.anInt2786)
			{
				Class33_Sub6_Sub4_Sub1 class33_sub6_sub4_sub1_2 = new Class33_Sub6_Sub4_Sub1();
				class33_sub6_sub4_sub1_2.anInt3363 = l;
				class33_sub6_sub4_sub1_2.anInt3364 = i6;
				if(Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][j11][l13] == null)
					Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][j11][l13] = new Class4();
				Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][j11][l13].method63(class33_sub6_sub4_sub1_2, (byte)126);
				Class32.method260(1, l13, j11);
			}
			return;
		}
		if(Class33_Sub6_Sub2.anInt2694 == 87)
		{
			int i1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int k3 = Class33_Sub3.anInt2042 - -(7 & i1 >> 0x8eb7d464);
			int j6 = (7 & i1) + Class60.anInt1284;
			int i9 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(118);
			int k11 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int i14 = (0xfe & k11) >> 0xd322eee4;
			int i17 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int l15 = k11 & 7;
			if(k3 >= 0 && j6 >= 0 && k3 < 104 && ~j6 > -105)
			{
				int j18 = 1 + i14;
				if(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0] >= k3 - j18 && ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0] <= j18 + k3 && -j18 + j6 <= ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0] && j18 + j6 >= ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0] && ~anInt272 != -1 && ~l15 < -1 && ~Class34.anInt1839 > -51)
				{
					Class21.anIntArray399[Class34.anInt1839] = i9;
					Class80.anIntArray1725[Class34.anInt1839] = l15;
					Class45.anIntArray966[Class34.anInt1839] = i17;
					Class33_Sub18.aClass61Array2515[Class34.anInt1839] = null;
					Class33_Sub20.anIntArray2566[Class34.anInt1839] = i14 + ((k3 << 0xea635d10) + (j6 << 0x4265c088));
					Class34.anInt1839++;
				}
			}
		}
		if(~Class33_Sub6_Sub2.anInt2694 == -210)
		{
			int j1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(80);
			int l3 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int k6 = Class33_Sub3.anInt2042 - -((0x7e & l3) >> 0xac11c984);
			int j9 = Class60.anInt1284 - -(l3 & 7);
			int l11 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(33);
			int j14 = l11 >> 0xa3b21682;
			int i16 = l11 & 3;
			int j17 = Class47.anIntArray1038[j14];
			if(~k6 <= -1 && ~j9 <= -1 && k6 < 103 && j9 < 103)
			{
				int j19 = Class30.anIntArrayArrayArray645[Class77_Sub2.anInt2645][k6 + 1][j9];
				int k18 = Class30.anIntArrayArrayArray645[Class77_Sub2.anInt2645][k6][j9];
				int i20 = Class30.anIntArrayArrayArray645[Class77_Sub2.anInt2645][k6 + 1][1 + j9];
				int l20 = Class30.anIntArrayArrayArray645[Class77_Sub2.anInt2645][k6][1 + j9];
				if(~j17 == -1)
				{
					Class66 class66 = Class33_Sub2.aClass56_2035.method1011(Class77_Sub2.anInt2645, k6, j9);
					if(class66 != null)
					{
						int l21 = (class66.anInt1408 & 0x1fffc5ec) >> 0x89d9cc0e;
						if(~j14 != -3)
						{
							class66.aClass33_Sub6_Sub4_1416 = new Class33_Sub6_Sub4_Sub2(l21, j14, i16, k18, j19, i20, l20, j1, false, class66.aClass33_Sub6_Sub4_1416);
						} else
						{
							class66.aClass33_Sub6_Sub4_1416 = new Class33_Sub6_Sub4_Sub2(l21, 2, 4 - -i16, k18, j19, i20, l20, j1, false, class66.aClass33_Sub6_Sub4_1416);
							class66.aClass33_Sub6_Sub4_1406 = new Class33_Sub6_Sub4_Sub2(l21, 2, i16 - -1 & 3, k18, j19, i20, l20, j1, false, class66.aClass33_Sub6_Sub4_1406);
						}
					}
				}
				if(j17 == 1)
				{
					Class23 class23 = Class33_Sub2.aClass56_2035.method985(Class77_Sub2.anInt2645, k6, j9);
					if(class23 != null)
						class23.aClass33_Sub6_Sub4_438 = new Class33_Sub6_Sub4_Sub2(class23.anInt483 >> 0xb09797ee & 0x7fff, 4, 0, k18, j19, i20, l20, j1, false, class23.aClass33_Sub6_Sub4_438);
				}
				if(j17 == 2)
				{
					Class62 class62 = Class33_Sub2.aClass56_2035.method991(Class77_Sub2.anInt2645, k6, j9);
					if(~j14 == -12)
						j14 = 10;
					if(class62 != null)
						class62.aClass33_Sub6_Sub4_1300 = new Class33_Sub6_Sub4_Sub2((0x1fffc784 & class62.anInt1318) >> 0x1e812fee, j14, i16, k18, j19, i20, l20, j1, false, class62.aClass33_Sub6_Sub4_1300);
				}
				if(j17 == 3)
				{
					Class48 class48 = Class33_Sub2.aClass56_2035.method986(Class77_Sub2.anInt2645, k6, j9);
					if(class48 != null)
						class48.aClass33_Sub6_Sub4_1050 = new Class33_Sub6_Sub4_Sub2((0x1fffc90b & class48.anInt1051) >> 0x20fb6d6e, 22, i16, k18, j19, i20, l20, j1, false, class48.aClass33_Sub6_Sub4_1050);
				}
			}
			return;
		}
		if(Class33_Sub6_Sub2.anInt2694 == 236)
		{
			int k1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
			int i4 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(80);
			int l6 = Class33_Sub3.anInt2042 + (7 & i4 >> 0xf0cc57c4);
			int k9 = Class60.anInt1284 - -(i4 & 7);
			int i12 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(101);
			int k14 = i12 >> 0x1eba7262;
			int j16 = i12 & 3;
			int k17 = Class47.anIntArray1038[k14];
			if(~l6 <= -1 && ~k9 <= -1 && ~l6 > -105 && k9 < 104)
				RuntimeException_Sub1.method1226(k14, 0, -1, 126, k1, k17, k9, Class77_Sub2.anInt2645, l6, j16);
			return;
		}
		if(Class33_Sub6_Sub2.anInt2694 == 64)
		{
			int l1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(92);
			int j4 = l1 >> 0x20532402;
			int i7 = l1 & 3;
			int l9 = Class47.anIntArray1038[j4];
			int j12 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int l14 = Class33_Sub3.anInt2042 - -(7 & j12 >> 0x7d5726a4);
			int k16 = (7 & j12) + Class60.anInt1284;
			if(~l14 <= -1 && ~k16 <= -1 && l14 < 104 && k16 < 104)
				RuntimeException_Sub1.method1226(j4, 0, -1, 92, -1, l9, k16, Class77_Sub2.anInt2645, l14, i7);
			return;
		}
		if(~Class33_Sub6_Sub2.anInt2694 == -34)
		{
			int i2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
			int k4 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
			int j7 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int k12 = Class60.anInt1284 + (j7 & 7);
			int i10 = (7 & j7 >> 0x1cc1eac4) + Class33_Sub3.anInt2042;
			if(~i10 <= -1 && k12 >= 0 && i10 < 104 && k12 < 104)
			{
				Class33_Sub6_Sub4_Sub1 class33_sub6_sub4_sub1_1 = new Class33_Sub6_Sub4_Sub1();
				class33_sub6_sub4_sub1_1.anInt3363 = k4;
				class33_sub6_sub4_sub1_1.anInt3364 = i2;
				if(Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][i10][k12] == null)
					Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][i10][k12] = new Class4();
				Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][i10][k12].method63(class33_sub6_sub4_sub1_1, (byte)62);
				Class32.method260(1, k12, i10);
			}
			return;
		}
		if(~Class33_Sub6_Sub2.anInt2694 == -242)
		{
			int j2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int l4 = Class33_Sub3.anInt2042 - -((0x7f & j2) >> 0x855227c4);
			int k7 = (j2 & 7) + Class60.anInt1284;
			int j10 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(123);
			int l12 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(84);
			int i15 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(124);
			if(~l4 <= -1 && ~k7 <= -1 && ~l4 > -105 && ~k7 > -105)
			{
				Class4 class4_1 = Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][l4][k7];
				if(class4_1 != null)
				{
					for(Class33_Sub6_Sub4_Sub1 class33_sub6_sub4_sub1_3 = (Class33_Sub6_Sub4_Sub1)class4_1.method68(18823); class33_sub6_sub4_sub1_3 != null; class33_sub6_sub4_sub1_3 = (Class33_Sub6_Sub4_Sub1)class4_1.method66((byte)-127))
					{
						if(~(j10 & 0x7fff) != ~class33_sub6_sub4_sub1_3.anInt3363 || l12 != class33_sub6_sub4_sub1_3.anInt3364)
							continue;
						class33_sub6_sub4_sub1_3.anInt3364 = i15;
						break;
					}

					Class32.method260(1, k7, l4);
				}
			}
		}
	}

	public static int anInt272 = 127;
	public static Class58 aClass58_273 = Class33_Sub6_Sub11.method535(104, "Weiter");
	public static int anIntArray274[] = {
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1
	};
	public static int anInt275;
	public static int anInt276 = 0;
	public static int anInt277;
	public static int anInt278 = 0;
	public static int anInt279;
	public static int anInt280 = 0;
	public static int anInt281;
	public static int anInt282;
	public static int anInt283;
	public static int anInt284;
	public static boolean aBoolean285 = false;
	public static Class58 aClass58_286 = Class33_Sub6_Sub11.method535(124, "Ung-Ultiger Benutzername");
	public static int anInt287 = 0;

}
