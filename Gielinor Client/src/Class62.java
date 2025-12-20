// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class62.java

import java.math.BigInteger;

public class Class62
{

	public static void method1078(Class30_Sub1 arg0, int arg1, int arg2, Class12 arg3)
	{
		try
		{
			Class33_Sub20 class33_sub20 = new Class33_Sub20();
			class33_sub20.aLong747 = arg2;
			class33_sub20.aClass30_Sub1_2561 = arg0;
			class33_sub20.aClass12_2557 = arg3;
			anInt1307++;
			class33_sub20.anInt2572 = arg1;
			synchronized(Class33_Sub6_Sub4.aClass4_2739)
			{
				Class33_Sub6_Sub4.aClass4_2739.method63(class33_sub20, (byte)48);
			}
			Class33_Sub6_Sub12.method549(-127);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "s.C(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method1079(boolean arg0, byte arg1)
	{
		anInt1317++;
		Class33_Sub6_Sub8.aBoolean2810 = arg0;
		if(!Class33_Sub6_Sub8.aBoolean2810)
		{
			int i = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
			int k = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
			int i1 = (-((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239 + Class34.anInt1826) / 16;
			Class33_Sub20.anIntArrayArray2578 = new int[i1][4];
			for(int k1 = 0; ~k1 > ~i1; k1++)
			{
				for(int i2 = 0; i2 < 4; i2++)
					Class33_Sub20.anIntArrayArray2578[k1][i2] = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method636(false);

			}

			int j2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
			int l2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
			int j3 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
			Class13.anIntArray263 = new int[i1];
			boolean flag = false;
			if((~(j2 / 8) == -49 || j2 / 8 == 49) && j3 / 8 == 48)
				flag = true;
			Class24.anIntArray501 = new int[i1];
			Class33_Sub16.anIntArray2474 = new int[i1];
			Class33_Sub6_Sub4.aByteArrayArray2747 = new byte[i1][];
			if(~(j2 / 8) == -49 && j3 / 8 == 148)
				flag = true;
			Class33_Sub6_Sub4_Sub5_Sub2.aByteArrayArray3778 = new byte[i1][];
			i1 = 0;
			for(int k4 = (j2 + -6) / 8; (j2 - -6) / 8 >= k4; k4++)
			{
				for(int k5 = (-6 + j3) / 8; (6 + j3) / 8 >= k5; k5++)
				{
					int i6 = k5 + (k4 << 0x58ac18c8);
					if(!flag || k5 != 49 && ~k5 != -150 && k5 != 147 && ~k4 != -51 && (k4 != 49 || ~k5 != -48))
					{
						Class13.anIntArray263[i1] = i6;
						Class33_Sub16.anIntArray2474[i1] = Class69.aClass30_Sub1_1469.method227((byte)14, Class35.method846((byte)-83, new Class58[] {
							client.aClass58_1944, Class37.method859(15591, k4), Class33_Sub15.aClass58_2370, Class37.method859(arg1 + 15575, k5)
						}));
						Class24.anIntArray501[i1] = Class69.aClass30_Sub1_1469.method227((byte)93, Class35.method846((byte)-83, new Class58[] {
							Class47.aClass58_1029, Class37.method859(Class73.method1150(arg1, 15607), k4), Class33_Sub15.aClass58_2370, Class37.method859(15591, k5)
						}));
						i1++;
					}
				}

			}

			Class81.method1209(j2, j3, 90, i, k, l2);
		} else
		{
			int j = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-106);
			int l = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
			int j1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-118);
			int l1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(112);
			int k2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(39);
			Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method682(-1);
			for(int i3 = 0; i3 < 4; i3++)
			{
				for(int k3 = 0; k3 < 13; k3++)
				{
					for(int i4 = 0; i4 < 13; i4++)
					{
						int l4 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-73, 1);
						if(l4 != 1)
							Class79.anIntArrayArrayArray1713[i3][k3][i4] = -1;
						else
							Class79.anIntArrayArrayArray1713[i3][k3][i4] = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-71, 26);
					}

				}

			}

			Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method678(13656);
			int l3 = (Class34.anInt1826 - ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239) / 16;
			Class33_Sub20.anIntArrayArray2578 = new int[l3][4];
			for(int j4 = 0; ~l3 < ~j4; j4++)
			{
				for(int i5 = 0; i5 < 4; i5++)
					Class33_Sub20.anIntArrayArray2578[j4][i5] = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method653(255);

			}

			Class33_Sub6_Sub4.aByteArrayArray2747 = new byte[l3][];
			Class33_Sub16.anIntArray2474 = new int[l3];
			Class33_Sub6_Sub4_Sub5_Sub2.aByteArrayArray3778 = new byte[l3][];
			Class13.anIntArray263 = new int[l3];
			Class24.anIntArray501 = new int[l3];
			l3 = 0;
			for(int j5 = 0; ~j5 > -5; j5++)
			{
				for(int l5 = 0; l5 < 13; l5++)
				{
					for(int j6 = 0; j6 < 13; j6++)
					{
						int k6 = Class79.anIntArrayArrayArray1713[j5][l5][j6];
						if(~k6 != 0)
						{
							int l6 = 0x3ff & k6 >> 0xfa56df4e;
							int i7 = (0x3ffe & k6) >> 0xbcc467a3;
							int j7 = (l6 / 8 << 0x99dfd848) - -(i7 / 8);
							for(int k7 = 0; k7 < l3; k7++)
							{
								if(~Class13.anIntArray263[k7] != ~j7)
									continue;
								j7 = -1;
								break;
							}

							if(j7 != -1)
							{
								int l7 = (j7 & 0xff9c) >> 0x95bda608;
								int i8 = j7 & 0xff;
								Class13.anIntArray263[l3] = j7;
								Class33_Sub16.anIntArray2474[l3] = Class69.aClass30_Sub1_1469.method227((byte)55, Class35.method846((byte)-83, new Class58[] {
									client.aClass58_1944, Class37.method859(15591, l7), Class33_Sub15.aClass58_2370, Class37.method859(15591, i8)
								}));
								Class24.anIntArray501[l3] = Class69.aClass30_Sub1_1469.method227((byte)110, Class35.method846((byte)-83, new Class58[] {
									Class47.aClass58_1029, Class37.method859(arg1 + 15575, l7), Class33_Sub15.aClass58_2370, Class37.method859(15591, i8)
								}));
								l3++;
							}
						}
					}

				}

			}

			Class81.method1209(l, j1, 112, j, k2, l1);
		}
		if(arg1 != 16)
			anInt1311 = -49;
	}

	public static void method1080(int arg0)
	{
		try
		{
			aClass58_1326 = null;
			aBigInteger1325 = null;
			aClass16_1321 = null;
			aClass58_1299 = null;
			aClass58_1327 = null;
			aClass58_1306 = null;
			if(arg0 != 8)
				aClass58_1324 = null;
			aClass58_1323 = null;
			aClass58_1328 = null;
			aClass58_1324 = null;
			aClass43_1316 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "s.B(" + arg0 + ')');
		}
	}

	public Class62()
	{
		anInt1318 = 0;
		anInt1310 = 0;
	}

	public int anInt1297;
	public int anInt1298;
	public static Class58 aClass58_1299 = Class33_Sub6_Sub11.method535(115, " (X");
	public Class33_Sub6_Sub4 aClass33_Sub6_Sub4_1300;
	public int anInt1301;
	public static int anInt1302;
	public int anInt1303;
	public int anInt1304;
	public static int anInt1305;
	public static Class58 aClass58_1306 = Class33_Sub6_Sub11.method535(107, "(U(Y");
	public static int anInt1307;
	public static int anInt1308 = 78;
	public int anInt1309;
	public int anInt1310;
	public static int anInt1311;
	public static int anInt1312 = 0;
	public int anInt1313;
	public int anInt1314;
	public int anInt1315;
	public static Class43 aClass43_1316;
	public static int anInt1317;
	public int anInt1318;
	public int anInt1319;
	public int anInt1320;
	public static Class16 aClass16_1321 = new Class16(64);
	public static boolean aBoolean1322 = false;
	public static Class58 aClass58_1323;
	public static Class58 aClass58_1324;
	public static BigInteger aBigInteger1325 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	public static Class58 aClass58_1326;
	public static Class58 aClass58_1327;
	public static Class58 aClass58_1328 = Class33_Sub6_Sub11.method535(119, "blinken1:");

	static 
	{
		aClass58_1324 = Class33_Sub6_Sub11.method535(127, "level)2");
		aClass58_1327 = aClass58_1324;
		aClass58_1326 = Class33_Sub6_Sub11.method535(114, "Select a world");
		aClass58_1323 = aClass58_1326;
	}
}
