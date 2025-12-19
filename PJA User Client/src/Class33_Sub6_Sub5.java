// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub5.java

import java.io.IOException;
import java.io.PrintStream;

public class Class33_Sub6_Sub5 extends Class33_Sub6
{

	public void method402(byte arg0, Class33_Sub11 arg1)
	{
		try
		{
			anInt2759++;
			if(arg0 != -65)
				aClass58_2777 = null;
			do
			{
				int i = arg1.method639((byte)123);
				if(~i != -1)
					method409((byte)-86, arg1, i);
				else
					return;
			} while(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ff.F(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static int method403(Class33_Sub15 arg0, int arg1)
	{
		try
		{
			Class33_Sub2 class33_sub2 = (Class33_Sub2)Class33_Sub16.aClass82_2480.method1220(73, ((long)arg0.anInt2435 << 0x65632ca0) - -(long)arg0.anInt2432);
			anInt2763++;
			if(arg1 != -5447)
				method407(-112, 116);
			if(class33_sub2 != null)
				return class33_sub2.anInt2016;
			else
				return arg0.anInt2416;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ff.A(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static void method404(byte arg0)
	{
		try
		{
			aClass58_2780 = null;
			aClass58_2757 = null;
			aClass58_2779 = null;
			aClass58_2760 = null;
			aClass58_2761 = null;
			aClass58_2771 = null;
			aClass16_2766 = null;
			aClass58_2768 = null;
			anIntArray2778 = null;
			if(arg0 >= -21)
				anIntArray2755 = null;
			anIntArray2769 = null;
			anIntArray2755 = null;
			aClass58_2754 = null;
			aClass58_2777 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ff.C(" + arg0 + ')');
		}
	}

	public static boolean method405(int arg0)
	{
		try
		{
			anInt2774++;
			if(Class62.aClass43_1316 == null)
				return false;
			try
			{
				int i = Class62.aClass43_1316.method896(0);
				if(i == 0)
					return false;
				if(Class33_Sub6_Sub2.anInt2694 == -1)
				{
					Class62.aClass43_1316.method894(1, 0, (byte)124, ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).aByteArray2296);
					i--;
					Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.anInt2239 = 0;
					Class33_Sub6_Sub2.anInt2694 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method684(8);
					Class34.anInt1826 = Class19.anIntArray369[Class33_Sub6_Sub2.anInt2694];
				}
				if(Class34.anInt1826 == -1)
				{
					if(~i >= -1)
						return false;
					Class62.aClass43_1316.method894(1, 0, (byte)124, ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).aByteArray2296);
					i--;
					Class34.anInt1826 = 0xff & ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).aByteArray2296[0];
				}
				if(Class34.anInt1826 == -2)
				{
					if(~i >= -2)
						return false;
					Class62.aClass43_1316.method894(2, 0, (byte)127, ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).aByteArray2296);
					Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.anInt2239 = 0;
					i -= 2;
					Class34.anInt1826 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(96);
				}
				if(arg0 <= 60)
					return true;
				if(Class34.anInt1826 > i)
					return false;
				Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.anInt2239 = 0;
				Class62.aClass43_1316.method894(Class34.anInt1826, 0, (byte)124, ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).aByteArray2296);
				Class20.anInt378 = 0;
				Class71.anInt1525 = Class33_Sub2.anInt2024;
				Class33_Sub2.anInt2024 = Class33_Sub6_Sub4_Sub4.anInt3473;
				Class33_Sub6_Sub4_Sub4.anInt3473 = Class33_Sub6_Sub2.anInt2694;
				if(~Class33_Sub6_Sub2.anInt2694 == -252)
				{
					int j = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(43);
					if(~j == 0xffff0000)
						j = -1;
					Class19.method164((byte)-66, j);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 117)
				{
					int k = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method626((byte)-114);
					int k11 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-120);
					if(k11 == 65535)
						k11 = -1;
					Class78.method1184(-1, k, k11);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 155)
				{
					int l = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method667((byte)77);
					int l11 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method636(false);
					Class33_Sub15 class33_sub15_2 = Class49.method933(l11, -92);
					Class33_Sub6_Sub2.anInt2694 = -1;
					if(class33_sub15_2.anInt2374 != l || ~l == 0)
					{
						class33_sub15_2.anInt2421 = 0;
						class33_sub15_2.anInt2374 = l;
						class33_sub15_2.anInt2393 = 0;
					}
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 50)
				{
					RuntimeException_Sub1.method1224(50, Class22.aClass72_416, Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035, Class34.anInt1826);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -22)
				{
					int i1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method623((byte)35);
					Class33_Sub15 class33_sub15 = Class49.method933(i1, -73);
					class33_sub15.anInt2401 = 3;
					class33_sub15.anInt2423 = Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.aClass46_3754.method926(512);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 136)
				{
					Class30.anInt620 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(107);
					Class33_Sub6_Sub2.anInt2694 = -1;
					Class74.aBoolean1579 = true;
					Class26.aBoolean552 = true;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -119)
				{
					int j1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method667((byte)77);
					if(~Class81.anInt1744 != ~j1)
					{
						Class77_Sub2.method1176(-81, Class81.anInt1744);
						Class81.anInt1744 = j1;
					}
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					method408(Class81.anInt1744, 23228);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -180)
				{
					if(~Class45.anInt965 != 0)
					{
						Class77_Sub2.method1176(-110, Class45.anInt965);
						Class45.anInt965 = -1;
					}
					Class33_Sub6_Sub2.anInt2694 = -1;
					Class33_Sub20.anInt2567 = 1;
					Class33_Sub13_Sub4.aClass58_3303 = Class33_Sub13_Sub4.aClass58_3261;
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					Class33_Sub10.aBoolean2208 = false;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -103)
				{
					int k1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
					if(~k1 == 0xffff0000)
						k1 = -1;
					int i12 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(112);
					if(k1 == Class14.anIntArray274[i12])
					{
						Class19.method168((byte)-97, Class14.anIntArray274[i12]);
					} else
					{
						Class77_Sub2.method1176(-90, Class14.anIntArray274[i12]);
						Class14.anIntArray274[i12] = k1;
					}
					Class26.aBoolean552 = true;
					Class74.aBoolean1579 = true;
					method408(Class14.anIntArray274[i12], 23228);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -198)
				{
					if(Class45.anInt965 != -1)
					{
						Class77_Sub2.method1176(-71, Class45.anInt965);
						Class45.anInt965 = -1;
					}
					Class33_Sub20.anInt2567 = 2;
					Class33_Sub10.aBoolean2208 = false;
					Class33_Sub13_Sub4.aClass58_3303 = Class33_Sub13_Sub4.aClass58_3261;
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -193)
				{
					int l1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-104);
					Class33_Sub21.method829(l1, 97);
					if(Class77_Sub2.anInt2644 != -1)
					{
						Class77_Sub2.method1176(-91, Class77_Sub2.anInt2644);
						Class26.aBoolean552 = true;
						Class74.aBoolean1579 = true;
						Class77_Sub2.anInt2644 = -1;
					}
					if(~Class45.anInt965 != 0)
					{
						Class77_Sub2.method1176(-97, Class45.anInt965);
						Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						Class45.anInt965 = -1;
					}
					if(~Class70.anInt1496 != 0)
					{
						Class77_Sub2.method1176(-83, Class70.anInt1496);
						Class70.anInt1496 = -1;
						Class29.method215(30, (byte)-47);
					}
					if(Class33.anInt734 != -1)
					{
						Class77_Sub2.method1176(-92, Class33.anInt734);
						Class33.anInt734 = -1;
					}
					if(~Class33_Sub6_Sub14.anInt3013 != ~l1)
					{
						Class77_Sub2.method1176(-75, Class33_Sub6_Sub14.anInt3013);
						Class33_Sub6_Sub14.anInt3013 = l1;
					} else
					{
						Class19.method168((byte)-109, Class33_Sub6_Sub14.anInt3013);
					}
					Class33_Sub18.anInt2514 = -1;
					if(Class33_Sub20.anInt2567 != 0)
					{
						Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						Class33_Sub20.anInt2567 = 0;
					}
					method408(Class33_Sub6_Sub14.anInt3013, 23228);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 170)
				{
					long l2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method655(-13628);
					Class58 class58_7 = Class33_Sub6_Sub7_Sub2.method451(client.method35(Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035, 1).method1061(-50));
					Class43.method904(6, 0, class58_7, Class33_Sub19.method817(l2, 113).method1065(-127));
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 201)
				{
					int i2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method672(112);
					if(i2 >= 0)
						Class33_Sub21.method829(i2, -70);
					if(~i2 != ~Class27.anInt563)
					{
						Class77_Sub2.method1176(-102, Class27.anInt563);
						Class27.anInt563 = i2;
					}
					method408(Class27.anInt563, 23228);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -68)
				{
					long l3 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method655(-13628);
					long l18 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(50);
					long l26 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method626((byte)-114);
					int i31 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					long l32 = l26 + (l18 << 0x2f9d3960);
					boolean flag9 = false;
					for(int i34 = 0; ~i34 > -101; i34++)
					{
						if(~Class33_Sub6_Sub6.aLongArray2791[i34] != ~l32)
							continue;
						flag9 = true;
						break;
					}

					if(~i31 >= -2)
					{
						for(int j34 = 0; ~Class65.anInt1388 < ~j34; j34++)
						{
							if(Class33_Sub6_Sub16.aLongArray3103[j34] != l3)
								continue;
							flag9 = true;
							break;
						}

					}
					if(!flag9 && Class79.anInt1714 == 0)
					{
						Class33_Sub6_Sub6.aLongArray2791[Class33_Sub6_Sub9.anInt2855] = l32;
						Class33_Sub6_Sub9.anInt2855 = (1 + Class33_Sub6_Sub9.anInt2855) % 100;
						Class58 class58_11 = Class33_Sub6_Sub7_Sub2.method451(client.method35(Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035, 1).method1061(-81));
						if(~i31 == -3 || ~i31 == -4)
							Class43.method904(7, 0, class58_11, Class35.method846((byte)-83, new Class58[] {
								Class33_Sub20.aClass58_2564, Class33_Sub19.method817(l3, 102).method1065(-113)
							}));
						else
						if(~i31 != -2)
							Class43.method904(3, 0, class58_11, Class33_Sub19.method817(l3, 107).method1065(-128));
						else
							Class43.method904(7, 0, class58_11, Class35.method846((byte)-83, new Class58[] {
								Class24.aClass58_513, Class33_Sub19.method817(l3, 94).method1065(-122)
							}));
					}
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 70)
				{
					Class30.anInt673 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class74.aBoolean1579 = true;
					Class33_Sub6_Sub2.anInt2694 = -1;
					Class33_Sub6_Sub15.anInt3059 += 32;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -36)
				{
					Class65.anInt1388 = Class34.anInt1826 / 8;
					for(int j2 = 0; ~j2 > ~Class65.anInt1388; j2++)
						Class33_Sub6_Sub16.aLongArray3103[j2] = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method655(-13628);

					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -227)
				{
					Class60.anInt1284 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
					Class33_Sub3.anInt2042 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					for(int k2 = Class33_Sub3.anInt2042; ~k2 > ~(8 + Class33_Sub3.anInt2042); k2++)
					{
						for(int j12 = Class60.anInt1284; Class60.anInt1284 - -8 > j12; j12++)
							if(Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][k2][j12] != null)
							{
								Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][k2][j12] = null;
								Class32.method260(1, j12, k2);
							}

					}

					for(Class33_Sub5 class33_sub5 = (Class33_Sub5)Class33_Sub6_Sub15.aClass4_3053.method68(18823); class33_sub5 != null; class33_sub5 = (Class33_Sub5)Class33_Sub6_Sub15.aClass4_3053.method66((byte)-128))
						if(~Class33_Sub3.anInt2042 >= ~class33_sub5.anInt2109 && Class33_Sub3.anInt2042 - -8 > class33_sub5.anInt2109 && ~class33_sub5.anInt2098 <= ~Class60.anInt1284 && Class60.anInt1284 - -8 > class33_sub5.anInt2098 && ~class33_sub5.anInt2104 == ~Class77_Sub2.anInt2645)
							class33_sub5.anInt2112 = 0;

					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -28)
				{
					Class62.method1079(true, (byte)16);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 255)
				{
					Class12.anInt226 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128) * 30;
					Class45.anInt971 = Class33_Sub6_Sub6.anInt2785;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 181)
				{
					Class74.aBoolean1579 = true;
					int i3 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(91);
					int k12 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					int k18 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method641(126);
					Class3.anIntArray109[k12] = k18;
					Class39.anIntArray864[k12] = i3;
					anIntArray2755[k12] = 1;
					for(int j23 = 0; j23 < 98; j23++)
						if(~k18 <= ~Class33_Sub6_Sub4_Sub2.anIntArray3381[j23])
							anIntArray2755[k12] = 2 + j23;

					Class15_Sub2.anIntArray1983[Class12.method110(31, Class33_Sub6_Sub16.anInt3089++)] = k12;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 247)
				{
					Class36.aBoolean796 = true;
					Class16.anInt313 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class57.anInt1242 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class33_Sub6_Sub8.anInt2800 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(86);
					Class31.anInt702 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class70.anInt1510 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					if(~Class70.anInt1510 <= -101)
					{
						Class33_Sub6_Sub4_Sub5.anInt3509 = Class16.anInt313 * 128 + 64;
						Class58.anInt1907 = Class57.anInt1242 * 128 - -64;
						Class71.anInt1516 = Class38.method871(Class33_Sub6_Sub4_Sub5.anInt3509, Class77_Sub2.anInt2645, Class58.anInt1907, -125) + -Class33_Sub6_Sub8.anInt2800;
					}
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -204)
				{
					Class3.anInt108 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -178)
				{
					Class33_Sub13_Sub4.aClass58_3310 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method646(-121);
					if(Class45.anInt965 != -1)
					{
						Class77_Sub2.method1176(-109, Class45.anInt965);
						Class45.anInt965 = -1;
					}
					Class33_Sub10.aBoolean2208 = false;
					Class33_Sub20.anInt2567 = 4;
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					Class33_Sub13_Sub4.aClass58_3303 = Class33_Sub13_Sub4.aClass58_3261;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -201)
				{
					Class17.anInt350 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class33.anInt727 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class33_Sub6_Sub12.anInt2974 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class15_Sub2.aBoolean1979 = true;
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 24)
				{
					int j3 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method653(255);
					int l12 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
					if(l12 == 65535)
						l12 = -1;
					int i19 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method653(255);
					int k23 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(108);
					if(k23 == 65535)
						k23 = -1;
					for(int k26 = k23; ~k26 >= ~l12; k26++)
					{
						long l28 = (long)k26 + ((long)j3 << 0xd8ba41a0);
						Class33 class33 = Class33_Sub16.aClass82_2480.method1220(19, l28);
						if(class33 != null)
							class33.method266(-122);
						Class33_Sub16.aClass82_2480.method1218(new Class33_Sub2(i19), (byte)-109, l28);
					}

					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 154)
				{
					for(int k3 = 0; Class33_Sub6_Sub4_Sub5_Sub2.anInt3793 > k3; k3++)
					{
						Class33_Sub6_Sub13 class33_sub6_sub13 = Class33_Sub19.method820(k3, 1);
						if(class33_sub6_sub13 != null && class33_sub6_sub13.anInt3005 == 0)
						{
							Class41.anIntArray914[k3] = 0;
							Class33_Sub5.anIntArray2120[k3] = 0;
						}
					}

					Class74.aBoolean1579 = true;
					Class33_Sub6_Sub15.anInt3059 += 32;
					if(~Class81.anInt1744 != 0)
						Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 174)
				{
					Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method653(255);
					Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-106);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 22)
				{
					int i4 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method636(false);
					Class58 class58_3 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method646(-116);
					Class33_Sub15 class33_sub15_3 = Class49.method933(i4, -105);
					class33_sub15_3.aClass58_2428 = class58_3;
					if(~(i4 >> 0xa20ae470) == ~Class14.anIntArray274[Class30.anInt620])
						Class74.aBoolean1579 = true;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -239)
				{
					Class33_Sub12.anInt2313 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 225)
				{
					int j4 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
					int i13 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method641(-35);
					if(j4 == 65535)
						j4 = -1;
					int j19 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method641(116);
					Class33_Sub15 class33_sub15_10 = Class49.method933(i13, -94);
					if(!class33_sub15_10.aBoolean2412)
					{
						if(~j4 == 0)
						{
							Class33_Sub6_Sub2.anInt2694 = -1;
							class33_sub15_10.anInt2401 = 0;
							return true;
						}
						Class33_Sub6_Sub11 class33_sub6_sub11 = Class14.method127(j4, (byte)90);
						class33_sub15_10.anInt2388 = class33_sub6_sub11.anInt2924;
						class33_sub15_10.anInt2457 = (class33_sub6_sub11.anInt2910 * 100) / j19;
						class33_sub15_10.anInt2460 = class33_sub6_sub11.anInt2932;
						class33_sub15_10.anInt2423 = j4;
						class33_sub15_10.anInt2401 = 4;
					} else
					{
						class33_sub15_10.anInt2380 = j4;
						class33_sub15_10.anInt2379 = j19;
						Class33_Sub6_Sub11 class33_sub6_sub11_1 = Class14.method127(j4, (byte)90);
						class33_sub15_10.anInt2460 = class33_sub6_sub11_1.anInt2932;
						class33_sub15_10.anInt2457 = class33_sub6_sub11_1.anInt2910;
						if(~class33_sub15_10.anInt2462 < -1)
							class33_sub15_10.anInt2457 = (32 * class33_sub15_10.anInt2457) / class33_sub15_10.anInt2462;
						class33_sub15_10.anInt2388 = class33_sub6_sub11_1.anInt2924;
						class33_sub15_10.anInt2448 = class33_sub6_sub11_1.anInt2896;
						class33_sub15_10.anInt2459 = class33_sub6_sub11_1.anInt2943;
						class33_sub15_10.anInt2381 = class33_sub6_sub11_1.anInt2933;
						Class30_Sub1.method248(false, class33_sub15_10);
					}
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 172)
				{
					for(int k4 = 0; Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715.length > k4; k4++)
						if(Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[k4] != null)
							Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[k4].anInt3567 = -1;

					for(int j13 = 0; Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887.length > j13; j13++)
						if(Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[j13] != null)
							Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[j13].anInt3567 = -1;

					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -209)
				{
					int l4 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method653(255);
					Class33_Sub12.aClass6_2316 = Class22.aClass72_416.method1148(l4, true);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -207)
				{
					Class36.aBoolean796 = true;
					Class31.anInt689 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class69.anInt1474 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class19.anInt374 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(30);
					Class33_Sub12.anInt2315 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class14.anInt281 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					if(Class14.anInt281 >= 100)
					{
						int i5 = 64 + Class31.anInt689 * 128;
						int k13 = Class69.anInt1474 * 128 - -64;
						int k19 = Class38.method871(i5, Class77_Sub2.anInt2645, k13, -126) + -Class19.anInt374;
						int i24 = i5 + -Class33_Sub6_Sub4_Sub5.anInt3509;
						int i27 = -Class71.anInt1516 + k19;
						int k28 = k13 - Class58.anInt1907;
						int j31 = (int)Math.sqrt(k28 * k28 + i24 * i24);
						Class33_Sub11.anInt2270 = (int)(Math.atan2(i27, j31) * 325.94900000000001D) & 0x7ff;
						Class14.anInt275 = (int)(-325.94900000000001D * Math.atan2(i24, k28)) & 0x7ff;
						if(Class33_Sub11.anInt2270 < 128)
							Class33_Sub11.anInt2270 = 128;
						if(~Class33_Sub11.anInt2270 < -384)
							Class33_Sub11.anInt2270 = 383;
					}
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -107)
				{
					Class39.anInt879 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 17)
				{
					Class33_Sub6_Sub2.anInt2694 = -1;
					Class44.anInt964 = 0;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -72)
				{
					int j5 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
					int l13 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method623((byte)-99);
					Class41.anIntArray914[j5] = l13;
					if(l13 != Class33_Sub5.anIntArray2120[j5])
					{
						Class33_Sub5.anIntArray2120[j5] = l13;
						Class33_Sub12.method687(j5, true);
						Class74.aBoolean1579 = true;
						if(~Class81.anInt1744 != 0)
							Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					}
					Class20.anIntArray382[Class12.method110(Class33_Sub6_Sub15.anInt3059++, 31)] = j5;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -255)
				{
					Class33_Sub6_Sub4_Sub6.entityToFollow = null;
					Class11.method108(118);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return false;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -189)
				{
					int k5 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-119);
					int i14 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method623((byte)-122);
					Class33_Sub15 class33_sub15_4 = Class49.method933(i14, -93);
					Class33_Sub6_Sub2.anInt2694 = -1;
					class33_sub15_4.anInt2423 = k5;
					class33_sub15_4.anInt2401 = 2;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 8)
				{
					int l5 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
					Class14.method125(507, l5);
					Class11.anIntArray198[Class12.method110(Class42.anInt918++, 31)] = Class12.method110(l5, 32767);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -194)
				{
					Class58 class58 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method646(-124);
					Object aobj[] = new Object[class58.method1035(27) + 1];
					for(int l19 = -1 + class58.method1035(27); ~l19 <= -1; l19--)
						if(class58.method1031(false, l19) != 115)
							aobj[l19 - -1] = new Integer(Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method623((byte)-100));
						else
							aobj[1 + l19] = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method646(-121);

					aobj[0] = new Integer(Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method623((byte)-101));
					Class13.method118(aobj, null, 0, 0, null, 18859, 0);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -8)
				{
					for(int i6 = 0; i6 < Class33_Sub5.anIntArray2120.length; i6++)
						if(~Class33_Sub5.anIntArray2120[i6] != ~Class41.anIntArray914[i6])
						{
							Class33_Sub5.anIntArray2120[i6] = Class41.anIntArray914[i6];
							Class33_Sub12.method687(i6, true);
							Class74.aBoolean1579 = true;
							Class20.anIntArray382[Class12.method110(Class33_Sub6_Sub15.anInt3059++, 31)] = i6;
						}

					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 162)
				{
					Class33_Sub6_Sub15.anInt3059 += 32;
					long l6 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method655(-13628);
					if(l6 == 0L)
					{
						Class45.aClass33_Sub9Array969 = null;
						Class33_Sub6_Sub2.anInt2694 = -1;
						Class29.anInt588 = 0;
						Class33_Sub6_Sub15.aClass58_3060 = null;
						return true;
					}
					Class33_Sub6_Sub15.aClass58_3060 = Class33_Sub19.method817(l6, 92);
					int i20 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					if(~i20 == -256)
					{
						Class33_Sub6_Sub2.anInt2694 = -1;
						return true;
					}
					Class33_Sub9 aclass33_sub9[] = new Class33_Sub9[100];
					Class29.anInt588 = i20;
					for(int j27 = 0; ~j27 > ~Class29.anInt588; j27++)
					{
						aclass33_sub9[j27] = new Class33_Sub9();
						aclass33_sub9[j27].aLong747 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method655(-13628);
						aclass33_sub9[j27].aClass58_2190 = Class33_Sub19.method817(((Class33) (aclass33_sub9[j27])).aLong747, 116);
						aclass33_sub9[j27].anInt2189 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(92);
					}

					boolean flag5 = false;
					for(int i32 = Class29.anInt588; i32 > 0;)
					{
						boolean flag6 = true;
						i32--;
						for(int k32 = 0; ~k32 > ~i32; k32++)
							if(~aclass33_sub9[k32].aClass58_2190.method1043(aclass33_sub9[1 + k32].aClass58_2190, false) < -1)
							{
								Class33_Sub9 class33_sub9_1 = aclass33_sub9[k32];
								flag6 = false;
								aclass33_sub9[k32] = aclass33_sub9[k32 + 1];
								aclass33_sub9[k32 + 1] = class33_sub9_1;
							}

						if(flag6)
							break;
					}

					Class33_Sub6_Sub2.anInt2694 = -1;
					Class45.aClass33_Sub9Array969 = aclass33_sub9;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -190)
				{
					int j6 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
					int j14 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method623((byte)-114);
					Class33_Sub15 class33_sub15_5 = Class49.method933(j14, -122);
					Class33_Sub6_Sub2.anInt2694 = -1;
					if(class33_sub15_5 != null && class33_sub15_5.anInt2452 == 0)
					{
						if(-class33_sub15_5.anInt2405 + class33_sub15_5.anInt2433 < j6)
							j6 = -class33_sub15_5.anInt2405 + class33_sub15_5.anInt2433;
						if(j6 < 0)
							j6 = 0;
						class33_sub15_5.anInt2353 = j6;
					}
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 49)
				{
					Class62.method1079(false, (byte)16);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 81)
				{
					long l7 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method655(-13628);
					byte byte1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method661((byte)-104);
					long l25 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method655(-13628);
					long l29 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(49);
					long l33 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method626((byte)-114);
					int j33 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					long l34 = l33 + (l29 << 0x7861ed20);
					boolean flag10 = false;
					for(int k34 = 0; ~k34 > -101; k34++)
					{
						if(Class33_Sub6_Sub6.aLongArray2791[k34] != l34)
							continue;
						flag10 = true;
						break;
					}

					if(j33 <= 1)
					{
						for(int j35 = 0; ~j35 > ~Class65.anInt1388; j35++)
						{
							if(Class33_Sub6_Sub16.aLongArray3103[j35] != l7)
								continue;
							flag10 = true;
							break;
						}

					}
					if(!flag10 && Class79.anInt1714 == 0)
					{
						Class33_Sub6_Sub6.aLongArray2791[Class33_Sub6_Sub9.anInt2855] = l34;
						Class33_Sub6_Sub9.anInt2855 = (1 + Class33_Sub6_Sub9.anInt2855) % 100;
						Class58 class58_12 = Class33_Sub6_Sub7_Sub2.method451(client.method35(Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035, 1).method1061(-50));
						Class58 class58_13 = Class35.method846((byte)-83, new Class58[] {
							Class33_Sub4.aClass58_2072, Class33_Sub19.method817(l25, 121), Class51.aClass58_1102, Class37.method859(15591, byte1), Class48.aClass58_1061
						});
						if(j33 == 2 || ~j33 == -4)
							Class43.method904(7, 0, class58_12, Class35.method846((byte)-83, new Class58[] {
								class58_13, Class33_Sub20.aClass58_2564, Class33_Sub19.method817(l7, 127).method1065(-90)
							}));
						else
						if(j33 != 1)
							Class43.method904(3, 0, class58_12, Class35.method846((byte)-83, new Class58[] {
								class58_13, Class33_Sub19.method817(l7, 92).method1065(-90)
							}));
						else
							Class43.method904(7, 0, class58_12, Class35.method846((byte)-83, new Class58[] {
								class58_13, Class24.aClass58_513, Class33_Sub19.method817(l7, 103).method1065(-124)
							}));
					}
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -95)
				{
					if(Class30.anInt620 == 12)
						Class74.aBoolean1579 = true;
					Class33_Sub4.anInt2079 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class45.anInt971 = Class33_Sub6_Sub6.anInt2785;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 32)
				{
					int k6 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(110);
					int k14 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(96);
					int j20 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
					Class77_Sub2.anInt2645 = k6 >> 0x14be3ca1;
					Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.method358((byte)18, (1 & k6) == 1, k14, j20);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 60)
				{
					Class68.anInt1441 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					if(Class68.anInt1441 == 1)
						Class59.anInt1275 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(127);
					if(~Class68.anInt1441 <= -3 && Class68.anInt1441 <= 6)
					{
						if(~Class68.anInt1441 == -3)
						{
							Class33_Sub3.anInt2056 = 64;
							Class4.anInt124 = 64;
						}
						if(~Class68.anInt1441 == -4)
						{
							Class33_Sub3.anInt2056 = 64;
							Class4.anInt124 = 0;
						}
						if(Class68.anInt1441 == 4)
						{
							Class4.anInt124 = 128;
							Class33_Sub3.anInt2056 = 64;
						}
						if(Class68.anInt1441 == 5)
						{
							Class4.anInt124 = 64;
							Class33_Sub3.anInt2056 = 0;
						}
						if(Class68.anInt1441 == 6)
						{
							Class4.anInt124 = 64;
							Class33_Sub3.anInt2056 = 128;
						}
						Class68.anInt1441 = 2;
						Class33_Sub21.anInt2617 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(105);
						Class33_Sub13_Sub4.anInt3315 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(40);
						Class33_Sub6_Sub4_Sub2.anInt3384 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					}
					if(Class68.anInt1441 == 10)
						Class77.anInt1652 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(120);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 252)
				{
					int i7 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method672(70);
					int l14 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method667((byte)77);
					int k20 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method653(255);
					Class33_Sub15 class33_sub15_11 = Class49.method933(k20, -78);
					class33_sub15_11.anInt2443 = i7 + class33_sub15_11.anInt2345;
					Class33_Sub6_Sub2.anInt2694 = -1;
					class33_sub15_11.anInt2356 = class33_sub15_11.anInt2429 - -l14;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -245)
				{
					byte byte0 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method657(0);
					int i15 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-98);
					Class41.anIntArray914[i15] = byte0;
					if(~byte0 != ~Class33_Sub5.anIntArray2120[i15])
					{
						Class33_Sub5.anIntArray2120[i15] = byte0;
						Class33_Sub12.method687(i15, true);
						Class74.aBoolean1579 = true;
						if(Class81.anInt1744 != -1)
							Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					}
					Class20.anIntArray382[Class12.method110(31, Class33_Sub6_Sub15.anInt3059++)] = i15;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -149)
				{
					boolean flag = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(83) == 1;
					int j15 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method641(125);
					Class33_Sub15 class33_sub15_6 = Class49.method933(j15, -49);
					Class33_Sub6_Sub2.anInt2694 = -1;
					class33_sub15_6.aBoolean2430 = flag;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -142)
				{
					Class60.anInt1284 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class33_Sub3.anInt2042 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
					while(~Class34.anInt1826 < ~((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239) 
					{
						Class33_Sub6_Sub2.anInt2694 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
						Class14.method130(114);
					}
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 2)
				{
					int j7 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
					Class33_Sub21.method829(j7, -58);
					if(Class45.anInt965 != -1)
					{
						Class77_Sub2.method1176(-67, Class45.anInt965);
						Class45.anInt965 = -1;
						Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					}
					if(Class70.anInt1496 != -1)
					{
						Class77_Sub2.method1176(-120, Class70.anInt1496);
						Class70.anInt1496 = -1;
						Class29.method215(30, (byte)-47);
					}
					if(Class33.anInt734 != -1)
					{
						Class77_Sub2.method1176(-69, Class33.anInt734);
						Class33.anInt734 = -1;
					}
					if(~Class33_Sub6_Sub14.anInt3013 != 0)
					{
						Class77_Sub2.method1176(-128, Class33_Sub6_Sub14.anInt3013);
						Class33_Sub6_Sub14.anInt3013 = -1;
					}
					if(~j7 != ~Class77_Sub2.anInt2644)
					{
						Class77_Sub2.method1176(-102, Class77_Sub2.anInt2644);
						Class77_Sub2.anInt2644 = j7;
					} else
					{
						Class19.method168((byte)-119, Class77_Sub2.anInt2644);
					}
					Class26.aBoolean552 = true;
					Class74.aBoolean1579 = true;
					if(Class33_Sub20.anInt2567 != 0)
					{
						Class33_Sub20.anInt2567 = 0;
						Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					}
					Class33_Sub18.anInt2514 = -1;
					method408(Class77_Sub2.anInt2644, 23228);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -225)
				{
					long l8 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method655(-13628);
					int l20 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(41);
					int j24 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class58 class58_8 = Class33_Sub19.method817(l8, 123).method1065(-122);
					for(int i29 = 0; Class33_Sub6_Sub12.anInt2979 > i29; i29++)
					{
						if(~Class47.aLongArray1032[i29] != ~l8)
							continue;
						if(l20 != Class30_Sub1.anIntArray2013[i29])
						{
							Class30_Sub1.anIntArray2013[i29] = l20;
							Class74.aBoolean1579 = true;
							if(l20 > 0)
								Class43.method904(5, 0, Class35.method846((byte)-83, new Class58[] {
									class58_8, Class43.aClass58_938
								}), Class33_Sub13_Sub4.aClass58_3261);
							if(l20 == 0)
								Class43.method904(5, 0, Class35.method846((byte)-83, new Class58[] {
									class58_8, Class33_Sub15.aClass58_2377
								}), Class33_Sub13_Sub4.aClass58_3261);
						}
						class58_8 = null;
						Class16.anIntArray315[i29] = j24;
						break;
					}

					boolean flag7 = false;
					if(class58_8 != null && ~Class33_Sub6_Sub12.anInt2979 > -201)
					{
						Class47.aLongArray1032[Class33_Sub6_Sub12.anInt2979] = l8;
						Class32.aClass58Array711[Class33_Sub6_Sub12.anInt2979] = class58_8;
						Class30_Sub1.anIntArray2013[Class33_Sub6_Sub12.anInt2979] = l20;
						Class16.anIntArray315[Class33_Sub6_Sub12.anInt2979] = j24;
						Class33_Sub6_Sub12.anInt2979++;
						Class74.aBoolean1579 = true;
						Class33_Sub6_Sub15.anInt3059 += 32;
					}
					for(int j32 = Class33_Sub6_Sub12.anInt2979; ~j32 < -1;)
					{
						boolean flag8 = true;
						j32--;
						for(int i33 = 0; ~j32 < ~i33; i33++)
							if(~Class27.anInt560 != ~Class30_Sub1.anIntArray2013[i33] && Class30_Sub1.anIntArray2013[1 + i33] == Class27.anInt560 || Class30_Sub1.anIntArray2013[i33] == 0 && Class30_Sub1.anIntArray2013[1 + i33] != 0)
							{
								flag8 = false;
								int k33 = Class30_Sub1.anIntArray2013[i33];
								Class30_Sub1.anIntArray2013[i33] = Class30_Sub1.anIntArray2013[1 + i33];
								Class30_Sub1.anIntArray2013[1 + i33] = k33;
								Class58 class58_10 = Class32.aClass58Array711[i33];
								Class32.aClass58Array711[i33] = Class32.aClass58Array711[i33 - -1];
								Class32.aClass58Array711[1 + i33] = class58_10;
								long l35 = Class47.aLongArray1032[i33];
								Class47.aLongArray1032[i33] = Class47.aLongArray1032[1 + i33];
								Class47.aLongArray1032[i33 + 1] = l35;
								int i35 = Class16.anIntArray315[i33];
								Class16.anIntArray315[i33] = Class16.anIntArray315[1 + i33];
								Class16.anIntArray315[i33 + 1] = i35;
								Class74.aBoolean1579 = true;
							}

						if(flag8)
							break;
					}

					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -126)
				{
					int k7 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-114);
					int k15 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method636(false);
					int i21 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(79);
					Class33_Sub15 class33_sub15_12 = Class49.method933(k15, -83);
					class33_sub15_12.anInt2472 = (i21 << 0x6630a870) - -k7;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -152)
				{
					Class58 class58_1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method646(-113);
					int l15 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
					int j21 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					if(j21 >= 1 && ~j21 >= -6)
					{
						if(class58_1.method1059(-1, Class57.aClass58_1254))
							class58_1 = null;
						Class13.aClass58Array245[j21 - 1] = class58_1;
						Class82.aBooleanArray1800[-1 + j21] = l15 == 0;
					}
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -231)
				{
					int i8 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(35);
					int i16 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					int k21 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(96);
					Class15_Sub2.method141((byte)-98, i8, i16, k21);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -132)
				{
					Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method623((byte)-119);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -70)
				{
					int j8 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method641(123);
					Class33_Sub15 class33_sub15_1 = Class49.method933(j8, -49);
					for(int l21 = 0; class33_sub15_1.anIntArray2471.length > l21; l21++)
					{
						class33_sub15_1.anIntArray2471[l21] = -1;
						class33_sub15_1.anIntArray2471[l21] = 0;
					}

					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -160)
				{
					int k8 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-124);
					int j16 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method636(false);
					int i22 = (k8 & 0x7d44) >> 0xf01b240a;
					int k24 = (0x3ff & k8) >> 0x92b314e5;
					int k27 = 0x1f & k8;
					Class33_Sub15 class33_sub15_14 = Class49.method933(j16, -96);
					class33_sub15_14.anInt2410 = (i22 << 0x7e8b5f73) + (k24 << 0xd4f8f14b) + (k27 << 0x613ec3a3);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -88 || Class33_Sub6_Sub2.anInt2694 == 241 || Class33_Sub6_Sub2.anInt2694 == 227 || Class33_Sub6_Sub2.anInt2694 == 111 || Class33_Sub6_Sub2.anInt2694 == 119 || Class33_Sub6_Sub2.anInt2694 == 39 || Class33_Sub6_Sub2.anInt2694 == 48 || Class33_Sub6_Sub2.anInt2694 == 33 || Class33_Sub6_Sub2.anInt2694 == 209 || Class33_Sub6_Sub2.anInt2694 == 64 || Class33_Sub6_Sub2.anInt2694 == 236)
				{
					Class14.method130(119);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -20)
				{
					Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-123);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -81)
				{
					Class21.anInt406 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
					Class33_Sub6_Sub2.anInt2694 = -1;
					if(~Class30.anInt620 == ~Class21.anInt406)
					{
						if(~Class21.anInt406 != -4)
							Class30.anInt620 = 3;
						else
							Class30.anInt620 = 1;
						Class74.aBoolean1579 = true;
					}
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 97)
				{
					Class60.anInt1284 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(36);
					Class33_Sub3.anInt2042 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(119);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -77)
				{
					int i9 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					int k16 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					int j22 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					int i25 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
					Class33.aBooleanArray745[i9] = true;
					Class32.anIntArray712[i9] = k16;
					Class77.anIntArray1645[i9] = j22;
					Class33_Sub6_Sub11.anIntArray2907[i9] = i25;
					Canvas_Sub1.anIntArray62[i9] = 0;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 158)
				{
					Class58 class58_2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method646(-124);
					String string2 = new String(class58_2.aByteArray1894, 0, class58_2.anInt1893);
					if(string2.startsWith("FOLLOWING_HACK")) {
						int distance = 1;
						try {
							string2 = string2.replace("FOLLOWING_HACK: ", "");
							if(string2.contains("STOP")) {
								Class33_Sub6_Sub4_Sub6.entityToFollow = null;
								if(string2.contains("FORCE")) {
									int x1 = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0];
									int y1 = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0];
									Class33_Sub6_Sub4_Sub4.method350(false, x1, false, 0, (byte)-102, 1, 2, 1, 0, 0, y1, x1, y1);
								}
							} else if(string2.contains("N")) {
								Class33_Sub6_Sub4_Sub6.entityToFollow = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[Integer.valueOf(string2.replace("N ", ""))];
							} else if(string2.contains("P")) {
								Class33_Sub6_Sub4_Sub6.entityToFollow = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[Integer.valueOf(string2.replace("P ", ""))];
							} else {
								distance = Integer.valueOf(string2);
							}
						} catch(Exception e) {
							e.printStackTrace();
						}
						client.fromDistance = distance;
						Class33_Sub6_Sub2.anInt2694 = -1;
						return true;
					}
					if(!class58_2.method1047(Class33_Sub20.aClass58_2575, (byte)-8))
					{
						if(!class58_2.method1047(Class73.aClass58_1551, (byte)-8))
						{
							if(!class58_2.method1047(Class42.aClass58_920, (byte)-8))
							{
								Class43.method904(0, 0, class58_2, Class33_Sub13_Sub4.aClass58_3261);
							} else
							{
								Class58 class58_4 = class58_2.method1063(0, (byte)122, class58_2.method1046((byte)-120, Class19.aClass58_372));
								boolean flag2 = false;
								long l22 = class58_4.method1062((byte)11);
								for(int j29 = 0; j29 < Class65.anInt1388; j29++)
								{
									if(Class33_Sub6_Sub16.aLongArray3103[j29] != l22)
										continue;
									flag2 = true;
									break;
								}

								if(!flag2 && Class79.anInt1714 == 0)
								{
									Class58 class58_9 = class58_2.method1063(1 + class58_2.method1046((byte)-67, Class19.aClass58_372), (byte)122, -9 + class58_2.method1035(27));
									Class43.method904(8, 0, class58_9, class58_4);
								}
							}
						} else
						{
							Class58 class58_5 = class58_2.method1063(0, (byte)123, class58_2.method1046((byte)-71, Class19.aClass58_372));
							long l23 = class58_5.method1062((byte)11);
							boolean flag3 = false;
							for(int k29 = 0; k29 < Class65.anInt1388; k29++)
							{
								if(~l23 != ~Class33_Sub6_Sub16.aLongArray3103[k29])
									continue;
								flag3 = true;
								break;
							}

							if(!flag3 && Class79.anInt1714 == 0)
								Class43.method904(8, 0, Class15_Sub2.aClass58_1974, class58_5);
						}
					} else
					{
						boolean flag4 = false;
						Class58 class58_6 = class58_2.method1063(0, (byte)119, class58_2.method1046((byte)-101, Class19.aClass58_372));
						long l24 = class58_6.method1062((byte)11);
						for(int i30 = 0; i30 < Class65.anInt1388; i30++)
						{
							if(Class33_Sub6_Sub16.aLongArray3103[i30] != l24)
								continue;
							flag4 = true;
							break;
						}

						if(!flag4 && Class79.anInt1714 == 0)
							Class43.method904(4, 0, Class19.aClass58_370, class58_6);
					}
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -251)
				{
					int j9 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method653(255);
					int l16 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
					int k22 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
					int j25 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
					Class33_Sub15 class33_sub15_13 = Class49.method933(j9, -93);
					class33_sub15_13.anInt2388 = j25;
					class33_sub15_13.anInt2460 = l16;
					Class33_Sub6_Sub2.anInt2694 = -1;
					class33_sub15_13.anInt2457 = k22;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 79)
				{
					int k9 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
					Class33_Sub21.method829(k9, -88);
					if(~Class77_Sub2.anInt2644 != 0)
					{
						Class77_Sub2.method1176(-75, Class77_Sub2.anInt2644);
						Class26.aBoolean552 = true;
						Class77_Sub2.anInt2644 = -1;
						Class74.aBoolean1579 = true;
					}
					if(~Class70.anInt1496 != 0)
					{
						Class77_Sub2.method1176(-109, Class70.anInt1496);
						Class70.anInt1496 = -1;
						Class29.method215(30, (byte)-47);
					}
					if(~Class33.anInt734 != 0)
					{
						Class77_Sub2.method1176(-95, Class33.anInt734);
						Class33.anInt734 = -1;
					}
					if(Class33_Sub6_Sub14.anInt3013 != -1)
					{
						Class77_Sub2.method1176(-115, Class33_Sub6_Sub14.anInt3013);
						Class33_Sub6_Sub14.anInt3013 = -1;
					}
					if(~k9 == ~Class45.anInt965)
					{
						Class19.method168((byte)-122, Class45.anInt965);
					} else
					{
						Class77_Sub2.method1176(-86, Class45.anInt965);
						Class45.anInt965 = k9;
					}
					Class33_Sub18.anInt2514 = -1;
					method408(Class45.anInt965, 23228);
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -43)
				{
					Class55.method963(-62);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -63)
				{
					int l9 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method641(-109);
					int i17 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(89);
					Class33_Sub15 class33_sub15_7 = Class49.method933(l9, -102);
					class33_sub15_7.anInt2423 = i17;
					Class33_Sub6_Sub2.anInt2694 = -1;
					class33_sub15_7.anInt2401 = 1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 129)
				{
					int i10 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(127);
					int j17 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
					Class33_Sub21.method829(j17, 104);
					if(~i10 != 0)
						Class33_Sub21.method829(i10, 79);
					if(~Class33_Sub6_Sub14.anInt3013 != 0)
					{
						Class77_Sub2.method1176(-118, Class33_Sub6_Sub14.anInt3013);
						Class33_Sub6_Sub14.anInt3013 = -1;
					}
					if(Class77_Sub2.anInt2644 != -1)
					{
						Class77_Sub2.method1176(-71, Class77_Sub2.anInt2644);
						Class77_Sub2.anInt2644 = -1;
					}
					if(~Class45.anInt965 != 0)
					{
						Class77_Sub2.method1176(-120, Class45.anInt965);
						Class45.anInt965 = -1;
					}
					if(Class70.anInt1496 == j17)
					{
						Class19.method168((byte)-88, Class70.anInt1496);
					} else
					{
						Class77_Sub2.method1176(-90, Class70.anInt1496);
						Class70.anInt1496 = j17;
						Class29.method215(35, (byte)-47);
					}
					if(~Class33.anInt734 == ~j17)
					{
						Class19.method168((byte)-128, Class33.anInt734);
					} else
					{
						Class77_Sub2.method1176(-124, Class33.anInt734);
						Class33.anInt734 = i10;
					}
					Class33_Sub18.anInt2514 = -1;
					Class33_Sub20.anInt2567 = 0;
					method408(Class70.anInt1496, 23228);
					method408(Class33.anInt734, 23228);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 38)
				{
					Class74.aBoolean1579 = true;
					int j10 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method623((byte)-114);
					int k17 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(126);
					Class33_Sub15 class33_sub15_8;
					if(j10 >= 0)
						class33_sub15_8 = Class49.method933(j10, -51);
					else
						class33_sub15_8 = null;
					if(~j10 > 0x1116f)
						k17 += 32768;
					while(Class34.anInt1826 > ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239) 
					{
						int k25 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method651(-116);
						int j30 = 0;
						int l27 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(58);
						if(l27 != 0)
						{
							j30 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
							if(j30 == 255)
								j30 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method623((byte)-101);
						}
						if(class33_sub15_8 != null && ~k25 <= -1 && class33_sub15_8.anIntArray2471.length > k25)
						{
							class33_sub15_8.anIntArray2471[k25] = l27;
							class33_sub15_8.anIntArray2398[k25] = j30;
						}
						Class11.method104(0, k25, k17, -1 + l27, j30);
					}
					Class11.anIntArray198[Class12.method110(31, Class42.anInt918++)] = Class12.method110(k17, 32767);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -203)
				{
					Class36.aBoolean796 = false;
					for(int k10 = 0; ~k10 > -6; k10++)
						Class33.aBooleanArray745[k10] = false;

					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 93)
				{
					if(Class77_Sub2.anInt2644 != -1)
					{
						Class77_Sub2.method1176(-102, Class77_Sub2.anInt2644);
						Class74.aBoolean1579 = true;
						Class77_Sub2.anInt2644 = -1;
						Class26.aBoolean552 = true;
					}
					if(~Class45.anInt965 != 0)
					{
						Class77_Sub2.method1176(-99, Class45.anInt965);
						Class45.anInt965 = -1;
						Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					}
					if(~Class70.anInt1496 != 0)
					{
						Class77_Sub2.method1176(-118, Class70.anInt1496);
						Class70.anInt1496 = -1;
						Class29.method215(30, (byte)-47);
					}
					if(Class33.anInt734 != -1)
					{
						Class77_Sub2.method1176(-114, Class33.anInt734);
						Class33.anInt734 = -1;
					}
					if(Class33_Sub6_Sub14.anInt3013 != -1)
					{
						Class77_Sub2.method1176(-65, Class33_Sub6_Sub14.anInt3013);
						Class33_Sub6_Sub14.anInt3013 = -1;
					}
					if(Class33_Sub20.anInt2567 != 0)
					{
						Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						Class33_Sub20.anInt2567 = 0;
					}
					Class33_Sub18.anInt2514 = -1;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -164)
				{
					long l10 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method655(-13628);
					boolean flag1 = false;
					if((l10 & 0x8000000000000000L) != 0L)
						flag1 = true;
					int i23 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(94);
					Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method661((byte)-106);
					if(!flag1)
					{
						if(Class29.anInt588 >= 100)
						{
							Class33_Sub6_Sub2.anInt2694 = -1;
							return true;
						}
						Class33_Sub9 class33_sub9 = new Class33_Sub9();
						class33_sub9.aLong747 = l10;
						class33_sub9.aClass58_2190 = Class33_Sub19.method817(((Class33) (class33_sub9)).aLong747, 116);
						class33_sub9.anInt2189 = i23;
						int k30;
						for(k30 = Class29.anInt588 - 1; k30 >= 0; k30--)
						{
							int k31 = Class45.aClass33_Sub9Array969[k30].aClass58_2190.method1043(class33_sub9.aClass58_2190, false);
							System.out.println("co=" + k31);
							if(~k31 == -1)
							{
								Class33_Sub6_Sub2.anInt2694 = -1;
								return true;
							}
							if(k31 < 0)
								break;
							Class45.aClass33_Sub9Array969[k30 + 1] = Class45.aClass33_Sub9Array969[k30];
						}

						Class45.aClass33_Sub9Array969[1 + k30] = class33_sub9;
						Class29.anInt588++;
					} else
					{
						if(~Class29.anInt588 == -1)
						{
							Class33_Sub6_Sub2.anInt2694 = -1;
							return true;
						}
						l10 &= 0x7fffffffffffffffL;
						int i28 = 0;
						for(i28 = 0; i28 < Class29.anInt588; i28++)
							if(l10 == ((Class33) (Class45.aClass33_Sub9Array969[i28])).aLong747 && ~i23 == ~Class45.aClass33_Sub9Array969[i28].anInt2189)
								break;

						if(~i28 > ~Class29.anInt588)
						{
							for(; Class29.anInt588 - 1 > i28; i28++)
								Class45.aClass33_Sub9Array969[i28] = Class45.aClass33_Sub9Array969[1 + i28];

							Class45.aClass33_Sub9Array969[Class29.anInt588] = null;
							Class29.anInt588--;
						}
					}
					Class33_Sub6_Sub15.anInt3059 += 32;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -181)
				{
					if(Class30.anInt620 == 12)
						Class74.aBoolean1579 = true;
					Class82.anInt1774 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method672(104);
					Class45.anInt971 = Class33_Sub6_Sub6.anInt2785;
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(~Class33_Sub6_Sub2.anInt2694 == -59)
				{
					Class43.method898(false);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 3)
				{
					Class74.aBoolean1579 = true;
					int i11 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method623((byte)103);
					int l17 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(59);
					if(i11 < 0xfffeee90)
						l17 += 32768;
					Class33_Sub15 class33_sub15_9;
					if(~i11 > -1)
						class33_sub15_9 = null;
					else
						class33_sub15_9 = Class49.method933(i11, -76);
					if(class33_sub15_9 != null)
					{
						for(int i26 = 0; ~class33_sub15_9.anIntArray2471.length < ~i26; i26++)
						{
							class33_sub15_9.anIntArray2471[i26] = 0;
							class33_sub15_9.anIntArray2398[i26] = 0;
						}

					}
					Class35.method845(l17, 0);
					int j26 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(88);
					for(int j28 = 0; j28 < j26; j28++)
					{
						int l30 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
						int l31 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
						if(l31 == 255)
							l31 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method623((byte)-126);
						if(class33_sub15_9 != null && class33_sub15_9.anIntArray2471.length > j28)
						{
							class33_sub15_9.anIntArray2471[j28] = l30;
							class33_sub15_9.anIntArray2398[j28] = l31;
						}
						Class11.method104(0, j28, l17, l30 - 1, l31);
					}

					Class11.anIntArray198[Class12.method110(31, Class42.anInt918++)] = Class12.method110(32767, l17);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				if(Class33_Sub6_Sub2.anInt2694 == 171)
				{
					int j11 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
					int i18 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
					if(~Class45.anInt965 != 0)
					{
						Class77_Sub2.method1176(-98, Class45.anInt965);
						Class45.anInt965 = -1;
						Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					}
					if(Class70.anInt1496 != -1)
					{
						Class77_Sub2.method1176(-128, Class70.anInt1496);
						Class70.anInt1496 = -1;
						Class29.method215(30, (byte)-47);
					}
					if(Class33.anInt734 != -1)
					{
						Class77_Sub2.method1176(-75, Class33.anInt734);
						Class33.anInt734 = -1;
					}
					if(j11 != Class33_Sub6_Sub14.anInt3013)
					{
						Class77_Sub2.method1176(-65, Class33_Sub6_Sub14.anInt3013);
						Class33_Sub6_Sub14.anInt3013 = j11;
					} else
					{
						Class19.method168((byte)-110, Class33_Sub6_Sub14.anInt3013);
					}
					if(~i18 == ~Class77_Sub2.anInt2644)
					{
						Class19.method168((byte)-117, Class77_Sub2.anInt2644);
					} else
					{
						Class77_Sub2.method1176(-112, Class77_Sub2.anInt2644);
						Class77_Sub2.anInt2644 = i18;
					}
					Class26.aBoolean552 = true;
					Class74.aBoolean1579 = true;
					if(Class33_Sub20.anInt2567 != 0)
					{
						Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						Class33_Sub20.anInt2567 = 0;
					}
					Class33_Sub18.anInt2514 = -1;
					method408(Class33_Sub6_Sub14.anInt3013, 23228);
					method408(Class77_Sub2.anInt2644, 23228);
					Class33_Sub6_Sub2.anInt2694 = -1;
					return true;
				}
				Class50.method938((byte)-56, null, "T1 - " + Class33_Sub6_Sub2.anInt2694 + "," + Class33_Sub2.anInt2024 + "," + Class71.anInt1525 + " - " + Class34.anInt1826);
				Class11.method108(124);
			}
			catch(IOException _ex)
			{
				Class30.method228(97);
			}
			catch(Exception exception)
			{
				String s = "T2 - " + Class33_Sub6_Sub2.anInt2694 + "," + Class33_Sub2.anInt2024 + "," + Class71.anInt1525 + " - " + Class34.anInt1826 + "," + (Class69.anInt1475 - -((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0]) + "," + (Class33_Sub2.anInt2036 - -((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]) + " - ";
				for(int j18 = 0; ~j18 > ~Class34.anInt1826 && ~j18 > -51; j18++)
					s = s + ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).aByteArray2296[j18] + ",";

				Class50.method938((byte)-49, exception, s);
				Class11.method108(124);
			}
			return true;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ff.G(" + arg0 + ')');
		}
	}

	public static void method406(byte arg0, long arg1)
	{
		try
		{
			if(arg0 > -69)
				aClass58_2754 = null;
			anInt2762++;
			try
			{
				Thread.sleep(arg1);
				return;
			}
			catch(InterruptedException _ex)
			{
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ff.H(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static boolean method407(int arg0, int arg1)
	{
		try
		{
			anInt2753++;
			if(~arg1 > -33)
				return false;
			if(arg0 != -10320)
				method407(123, -42);
			if(~arg1 == -128)
				return false;
			return arg1 < 129 || arg1 > 159;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ff.B(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method408(int arg0, int arg1)
	{
		try
		{
			anInt2776++;
			if(~arg0 == 0)
				return;
			if(!Class33_Sub6_Sub2.method305(arg0, 0x12bcb130))
				return;
			if(arg1 != 23228)
				aClass58_2771 = null;
			Class33_Sub15 aclass33_sub15[] = Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0];
			for(int i = 0; ~aclass33_sub15.length < ~i; i++)
			{
				Class33_Sub15 class33_sub15 = aclass33_sub15[i];
				if(class33_sub15.anObjectArray2440 != null)
					Class13.method118(class33_sub15.anObjectArray2440, class33_sub15, 0, 0, null, arg1 ^ 0x1317, 0);
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ff.I(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method409(byte arg0, Class33_Sub11 arg1, int arg2)
	{
		try
		{
			if(~arg2 == -2)
			{
				anInt2756 = arg1.method666(40);
				anInt2775 = arg1.method639((byte)123);
				anInt2751 = arg1.method639((byte)123);
			}
			if(arg0 != -86)
			{
				return;
			} else
			{
				anInt2764++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ff.E(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ')');
		}
	}

	public static int method410(byte arg0, int arg1, int arg2)
	{
		try
		{
			anInt2765++;
			if(arg2 == -1)
				return 0xbc614e;
			if(arg0 > -94)
				aClass58_2771 = null;
			arg1 = (arg1 * (0x7f & arg2)) / 128;
			if(arg1 >= 2)
			{
				if(arg1 > 126)
					arg1 = 126;
			} else
			{
				arg1 = 2;
			}
			return (arg2 & 0xff80) + arg1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ff.D(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public Class33_Sub6_Sub5()
	{
	}

	public int anInt2751;
	public static volatile boolean aBoolean2752 = true;
	public static int anInt2753;
	public static Class58 aClass58_2754;
	public static int anIntArray2755[] = new int[25];
	public int anInt2756;
	public static Class58 aClass58_2757 = Class33_Sub6_Sub11.method535(101, "Lade Freunde)2Liste)3)3)3");
	public static int anInt2758;
	public static int anInt2759;
	public static Class58 aClass58_2760;
	public static Class58 aClass58_2761;
	public static int anInt2762;
	public static int anInt2763;
	public static int anInt2764;
	public static int anInt2765;
	public static Class16 aClass16_2766 = new Class16(30);
	public static int anInt2767 = 0;
	public static Class58 aClass58_2768;
	public static int anIntArray2769[];
	public static int anInt2770;
	public static Class58 aClass58_2771 = Class33_Sub6_Sub11.method535(119, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");
	public static int anInt2772;
	public static int anInt2773;
	public static int anInt2774;
	public int anInt2775;
	public static int anInt2776;
	public static Class58 aClass58_2777;
	public static int anIntArray2778[];
	public static Class58 aClass58_2779;
	public static Class58 aClass58_2780;

	static 
	{
		aClass58_2754 = Class33_Sub6_Sub11.method535(126, "Loading game screen )2 ");
		aClass58_2761 = aClass58_2754;
		aClass58_2768 = Class33_Sub6_Sub11.method535(121, "You have only just left another world)3");
		aClass58_2760 = aClass58_2768;
		aClass58_2777 = Class33_Sub6_Sub11.method535(115, "red:");
		aClass58_2779 = aClass58_2777;
		aClass58_2780 = aClass58_2777;
	}
}
