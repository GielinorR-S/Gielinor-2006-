// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RuntimeException_Sub1.java

import java.io.IOException;

public class RuntimeException_Sub1 extends RuntimeException
{

	public static void method1222(Class43 arg0, byte arg1, boolean arg2)
	{
		try
		{
			anInt1810++;
			if(Class63.aClass43_1336 != null)
			{
				try
				{
					Class63.aClass43_1336.method903(1);
				}
				catch(Exception _ex) { }
				Class63.aClass43_1336 = null;
			}
			Class63.aClass43_1336 = arg0;
			Class73.method1153(arg2, 103);
			Canvas_Sub1.anInt58 = 0;
			Class77_Sub2.aClass33_Sub11_2637.anInt2239 = 0;
			Class15_Sub2.aClass33_Sub6_Sub2_1977 = null;
			Class77.aClass33_Sub11_1653 = null;
			do
			{
				Class33_Sub6_Sub2 class33_sub6_sub2 = (Class33_Sub6_Sub2)Class23.aClass82_429.method1221(0);
				if(class33_sub6_sub2 == null)
					break;
				Class34.aClass82_1838.method1218(class33_sub6_sub2, (byte)-120, ((Class33) (class33_sub6_sub2)).aLong747);
				Class33_Sub7.anInt2143++;
				Class58.anInt1922--;
			} while(true);
			do
			{
				Class33_Sub6_Sub2 class33_sub6_sub2_1 = (Class33_Sub6_Sub2)Class19.aClass82_361.method1221(arg1 + 94);
				if(class33_sub6_sub2_1 == null)
					break;
				Class80.aClass39_1727.method878(arg1 + 207, class33_sub6_sub2_1);
				Class33_Sub12.aClass82_2324.method1218(class33_sub6_sub2_1, (byte)103, ((Class33) (class33_sub6_sub2_1)).aLong747);
				Class33_Sub6_Sub4_Sub5_Sub2.anInt3779++;
				Class33_Sub6_Sub4_Sub5_Sub2.anInt3786--;
			} while(true);
			if(arg1 != -94)
				return;
			if(Class33_Sub6_Sub4.aByte2745 != 0)
				try
				{
					Class33_Sub11 class33_sub11 = new Class33_Sub11(4);
					class33_sub11.method640(4, arg1 ^ 0x2b2e);
					class33_sub11.method640(Class33_Sub6_Sub4.aByte2745, -11124);
					class33_sub11.method625(0, true);
					Class63.aClass43_1336.method901((byte)42, class33_sub11.aByteArray2296, 4, 0);
				}
				catch(IOException _ex)
				{
					try
					{
						Class63.aClass43_1336.method903(arg1 ^ 0xffffffa3);
					}
					catch(Exception _ex2) { }
					Class63.aClass43_1336 = null;
					Class66.anInt1431++;
				}
			Class63.anInt1351 = 0;
			Class23.aLong476 = Class60.method1073(false);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rc.A(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method1223(byte arg0)
	{
		anIntArrayArray1820 = null;
		aClass33_Sub15_1816 = null;
		aClass30_1808 = null;
		aClass33_Sub11_Sub1_1809 = null;
		aByteArrayArrayArray1812 = null;
		aClass58_1815 = null;
		aClass58_1814 = null;
		if(arg0 <= 36)
			aClass33_Sub15_1816 = null;
	}

	public static void method1224(int arg0, Class72 arg1, Class33_Sub11 arg2, int arg3)
	{
		try
		{
			anInt1818++;
			Class33_Sub19 class33_sub19 = new Class33_Sub19();
			class33_sub19.anInt2550 = arg2.method639((byte)123);
			class33_sub19.anInt2537 = arg2.method623((byte)45);
			class33_sub19.aClass6Array2539 = new Class6[class33_sub19.anInt2550];
			class33_sub19.anIntArray2545 = new int[class33_sub19.anInt2550];
			class33_sub19.anIntArray2549 = new int[class33_sub19.anInt2550];
			class33_sub19.aByteArrayArrayArray2538 = new byte[class33_sub19.anInt2550][][];
			class33_sub19.aClass6Array2536 = new Class6[class33_sub19.anInt2550];
			class33_sub19.anIntArray2534 = new int[class33_sub19.anInt2550];
			for(int i = 0; i < class33_sub19.anInt2550; i++)
				try
				{
					int j = arg2.method639((byte)123);
					if(j == 0 || ~j == -2 || ~j == -3)
					{
						String s = new String(arg2.method646(-120).method1060(125));
						String s2 = new String(arg2.method646(arg0 + -158).method1060(125));
						int k = 0;
						if(j == 1)
							k = arg2.method623((byte)-112);
						class33_sub19.anIntArray2549[i] = j;
						class33_sub19.anIntArray2534[i] = k;
						class33_sub19.aClass6Array2536[i] = arg1.method1143(Class73.method1150(arg0, 50), s2, Class35.method839(s, (byte)36));
					} else
					if(j == 3 || ~j == -5)
					{
						String s1 = new String(arg2.method646(-110).method1060(120));
						String s3 = new String(arg2.method646(-116).method1060(126));
						int l = arg2.method639((byte)123);
						String as[] = new String[l];
						for(int i1 = 0; ~i1 > ~l; i1++)
							as[i1] = new String(arg2.method646(-115).method1060(121));

						byte abyte0[][] = new byte[l][];
						if(~j == -4)
						{
							for(int j1 = 0; j1 < l; j1++)
							{
								int k1 = arg2.method623((byte)103);
								abyte0[j1] = new byte[k1];
								arg2.method644(0, abyte0[j1], 15162, k1);
							}

						}
						Class aclass[] = new Class[l];
						class33_sub19.anIntArray2549[i] = j;
						for(int l1 = 0; ~l < ~l1; l1++)
							aclass[l1] = Class35.method839(as[l1], (byte)123);

						class33_sub19.aClass6Array2539[i] = arg1.method1147(aclass, s3, 21417, Class35.method839(s1, (byte)99));
						class33_sub19.aByteArrayArrayArray2538[i] = abyte0;
					}
				}
				catch(ClassNotFoundException _ex)
				{
					class33_sub19.anIntArray2545[i] = -1;
				}
				catch(SecurityException _ex)
				{
					class33_sub19.anIntArray2545[i] = -2;
				}
				catch(NullPointerException _ex)
				{
					class33_sub19.anIntArray2545[i] = -3;
				}
				catch(Exception _ex)
				{
					class33_sub19.anIntArray2545[i] = -4;
				}
				catch(Throwable _ex)
				{
					class33_sub19.anIntArray2545[i] = -5;
				}

			if(arg0 != 50)
				method1223((byte)-11);
			Class30.aClass4_613.method63(class33_sub19, (byte)44);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rc.B(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ')');
		}
	}

	public static void method1225(int arg0)
	{
		anInt1813++;
		if(~Class59.anInt1273 == arg0)
		{
			Class33_Sub2.aClass56_2035 = new Class56(4, 104, 104, Class30.anIntArrayArrayArray645);
			for(int i = 0; i < 4; i++)
				Class51.aClass70Array1098[i] = new Class70(104, 104);

			Class13.aClass33_Sub6_Sub7_Sub3_265 = new Class33_Sub6_Sub7_Sub3(512, 512);
			Class59.anInt1273 = 20;
			Class45.anInt976 = 5;
			Class63.aClass58_1339 = Class33_Sub16.aClass58_2489;
			return;
		}
		if(Class59.anInt1273 == 20)
		{
			int ai[] = new int[9];
			for(int k1 = 0; k1 < 9; k1++)
			{
				int k2 = 128 + 32 * k1 + 15;
				int i3 = 3 * k2 + 600;
				int k3 = Class33_Sub6_Sub7_Sub1.anIntArray3681[k2];
				ai[k1] = k3 * i3 >> 0x278a8df0;
			}

			Class56.method975(ai, 500, 800, 512, 334);
			Class45.anInt976 = 10;
			Class63.aClass58_1339 = Class33_Sub4.aClass58_2089;
			Class59.anInt1273 = 30;
			return;
		}
		if(Class59.anInt1273 == 30)
		{
			Class39.aClass30_Sub1_871 = Class57.method1022(false, 0, false, true, true);
			Class33_Sub16.aClass30_Sub1_2478 = Class57.method1022(false, 1, false, true, true);
			Class59.aClass30_Sub1_1266 = Class57.method1022(false, 2, true, false, true);
			Class30.aClass30_Sub1_674 = Class57.method1022(false, 3, false, true, true);
			Class16.aClass30_Sub1_321 = Class57.method1022(false, 4, false, true, true);
			Class69.aClass30_Sub1_1469 = Class57.method1022(false, 5, true, true, true);
			Class30_Sub1.aClass30_Sub1_1990 = Class57.method1022(false, 6, true, true, false);
			Canvas_Sub1.aClass30_Sub1_54 = Class57.method1022(false, 7, false, true, true);
			Class33_Sub6_Sub16.aClass30_Sub1_3092 = Class57.method1022(false, 8, false, true, true);
			Class33_Sub6_Sub3.aClass30_Sub1_2715 = Class57.method1022(false, 9, false, true, true);
			Class33_Sub12.aClass30_Sub1_2322 = Class57.method1022(false, 10, false, true, true);
			client.aClass30_Sub1_1940 = Class57.method1022(false, 11, false, true, true);
			Class73.aClass30_Sub1_1554 = Class57.method1022(false, 12, false, true, true);
			Class59.aClass30_Sub1_1271 = Class57.method1022(false, 13, true, false, true);
			Class38.aClass30_Sub1_848 = Class57.method1022(false, 14, false, true, false);
			Class58.aClass30_Sub1_1911 = Class57.method1022(false, 15, false, true, true);
			Class45.anInt976 = 20;
			Class63.aClass58_1339 = Class33_Sub5.aClass58_2108;
			Class59.anInt1273 = 40;
			return;
		}
		if(~Class59.anInt1273 == -41)
		{
			int j = 0;
			j += (4 * Class39.aClass30_Sub1_871.method246(arg0 + -93)) / 100;
			j += (Class33_Sub16.aClass30_Sub1_2478.method246(-117) * 4) / 100;
			j += (2 * Class59.aClass30_Sub1_1266.method246(-101)) / 100;
			j += (Class30.aClass30_Sub1_674.method246(-97) * 2) / 100;
			j += (6 * Class16.aClass30_Sub1_321.method246(-69)) / 100;
			j += (4 * Class69.aClass30_Sub1_1469.method246(-125)) / 100;
			j += (Class30_Sub1.aClass30_Sub1_1990.method246(-73) * 2) / 100;
			j += (60 * Canvas_Sub1.aClass30_Sub1_54.method246(-91)) / 100;
			j += (2 * Class33_Sub6_Sub16.aClass30_Sub1_3092.method246(arg0 + -52)) / 100;
			j += (2 * Class33_Sub6_Sub3.aClass30_Sub1_2715.method246(-77)) / 100;
			j += (2 * Class33_Sub12.aClass30_Sub1_2322.method246(arg0 ^ 0x70)) / 100;
			j += (2 * client.aClass30_Sub1_1940.method246(arg0 ^ 0x58)) / 100;
			j += (2 * Class73.aClass30_Sub1_1554.method246(-89)) / 100;
			j += (2 * Class59.aClass30_Sub1_1271.method246(-72)) / 100;
			j += (Class38.aClass30_Sub1_848.method246(-73) * 2) / 100;
			j += (Class58.aClass30_Sub1_1911.method246(-89) * 2) / 100;
			if(~j != -101)
			{
				if(~j != -1)
					Class63.aClass58_1339 = Class35.method846((byte)-83, new Class58[] {
						Class21.aClass58_397, Class37.method859(15591, j), Class22.aClass58_417
					});
				Class45.anInt976 = 30;
				return;
			} else
			{
				Class63.aClass58_1339 = Class33_Sub9.aClass58_2187;
				Class45.anInt976 = 30;
				Class59.anInt1273 = 45;
				return;
			}
		}
		if(Class59.anInt1273 == 45)
		{
			Class33_Sub6_Sub13.method559(22050, -110, 2, !Class33_Sub3.aBoolean2058);
			Class33_Sub13_Sub4 class33_sub13_sub4 = new Class33_Sub13_Sub4();
			class33_sub13_sub4.method762(9, 128, -5574);
			Class33_Sub11_Sub1.aClass79_3212 = Class15_Sub2.method138(0, 22050, Class33_Sub6_Sub4_Sub1.aCanvas3367, Class22.aClass72_416, arg0 + 89);
			Class33_Sub11_Sub1.aClass79_3212.method1197(class33_sub13_sub4, false);
			Class74.method1158(Class38.aClass30_Sub1_848, Class58.aClass30_Sub1_1911, Class16.aClass30_Sub1_321, false, class33_sub13_sub4);
			Class33_Sub6_Sub4_Sub6.aClass79_3581 = Class15_Sub2.method138(1, 2048, Class33_Sub6_Sub4_Sub1.aCanvas3367, Class22.aClass72_416, 100);
			Class78.aClass33_Sub13_Sub2_1670 = new Class33_Sub13_Sub2();
			Class33_Sub6_Sub4_Sub6.aClass79_3581.method1197(Class78.aClass33_Sub13_Sub2_1670, false);
			Class33_Sub11_Sub1.aClass54_3215 = new Class54(22050, Class39.anInt863);
			Class63.aClass58_1339 = Class33_Sub3.aClass58_2040;
			Class59.anInt1273 = 50;
			Class45.anInt976 = 35;
			return;
		}
		if(Class59.anInt1273 == 50)
		{
			int k = 0;
			if(Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2662 != null)
				k++;
			else
				Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2662 = Class33_Sub6_Sub10.method520(Class33_Sub13_Sub4.aClass58_3261, arg0 + 100, Class74.aClass58_1582, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			if(Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677 == null)
				Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677 = Class33_Sub6_Sub10.method520(Class33_Sub13_Sub4.aClass58_3261, arg0 ^ 0xffffff9c, Class63.aClass58_1357, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			else
				k++;
			if(Class75.aClass33_Sub6_Sub7_Sub2_1632 != null)
				k++;
			else
				Class75.aClass33_Sub6_Sub7_Sub2_1632 = Class33_Sub6_Sub10.method520(Class33_Sub13_Sub4.aClass58_3261, arg0 ^ 0xffffff9c, Class4.aClass58_123, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			if(~k > -4)
			{
				Class63.aClass58_1339 = Class35.method846((byte)-83, new Class58[] {
					Class33_Sub6_Sub4.aClass58_2744, Class37.method859(15591, (100 * k) / 3), Class22.aClass58_417
				});
				Class45.anInt976 = 40;
				return;
			} else
			{
				Class63.aClass58_1339 = Class33_Sub2.aClass58_2026;
				Class59.anInt1273 = 60;
				Class45.anInt976 = 40;
				return;
			}
		}
		if(Class59.anInt1273 == 60)
		{
			int l = Class33_Sub6_Sub4_Sub4.method354(107, Class33_Sub12.aClass30_Sub1_2322, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			int l1 = Class33_Sub15.method797(true);
			if(~l > ~l1)
			{
				Class63.aClass58_1339 = Class35.method846((byte)-83, new Class58[] {
					Class39.aClass58_873, Class37.method859(arg0 ^ 0xffffc318, (l * 100) / l1), Class22.aClass58_417
				});
				Class45.anInt976 = 50;
				return;
			} else
			{
				Class45.anInt976 = 50;
				Class63.aClass58_1339 = Class33_Sub6_Sub9.aClass58_2838;
				Class29.method215(5, (byte)-47);
				Class59.anInt1273 = 70;
				return;
			}
		}
		if(~Class59.anInt1273 == -71)
			if(!Class59.aClass30_Sub1_1266.method223((byte)-126))
			{
				Class63.aClass58_1339 = Class35.method846((byte)-83, new Class58[] {
					Class33_Sub6_Sub4_Sub6.aClass58_3588, Class37.method859(15591, Class59.aClass30_Sub1_1266.method242(false)), Class22.aClass58_417
				});
				Class45.anInt976 = 60;
				return;
			} else
			{
				Class41.method892(Class59.aClass30_Sub1_1266, 0xbf0f2707);
				Class21.method172(~arg0, Class59.aClass30_Sub1_1266);
				Class69.method1113(Canvas_Sub1.aClass30_Sub1_54, arg0 ^ 0x68, Class59.aClass30_Sub1_1266);
				Class33_Sub6_Sub1.method301(Canvas_Sub1.aClass30_Sub1_54, 2, Class59.aClass30_Sub1_1266, Class33_Sub3.aBoolean2058);
				Class33_Sub6_Sub14.method564((byte)-108, Canvas_Sub1.aClass30_Sub1_54, Class59.aClass30_Sub1_1266);
				Class33_Sub6_Sub2.method306(Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2662, (byte)96, Class77.aBoolean1647, Canvas_Sub1.aClass30_Sub1_54, Class59.aClass30_Sub1_1266);
				Class33_Sub6_Sub4_Sub6.method378(Class33_Sub16.aClass30_Sub1_2478, arg0 ^ 0xfffffe3a, Class39.aClass30_Sub1_871, Class59.aClass30_Sub1_1266);
				Class43.method895(Class59.aClass30_Sub1_1266, Canvas_Sub1.aClass30_Sub1_54, true);
				Class16.method148(1792, Class59.aClass30_Sub1_1266);
				Class54.method962((byte)-128, Class59.aClass30_Sub1_1266);
				Class33_Sub6_Sub12.method547(Canvas_Sub1.aClass30_Sub1_54, (byte)-59, Class33_Sub6_Sub16.aClass30_Sub1_3092, Class30.aClass30_Sub1_674);
				Class33_Sub13_Sub4.method752(false, Class59.aClass30_Sub1_1266);
				Class75.method1161(true, Class59.aClass30_Sub1_1266);
				Class45.anInt976 = 60;
				Class59.anInt1273 = 80;
				Class63.aClass58_1339 = Class33_Sub6_Sub14.aClass58_3033;
				return;
			}
		if(Class59.anInt1273 == 80)
		{
			int i1 = 0;
			if(Class37.aClass33_Sub6_Sub7_Sub3_832 == null)
				Class37.aClass33_Sub6_Sub7_Sub3_832 = Class33_Sub6_Sub14.method574(Class33_Sub6_Sub11.aClass58_2945, Class33_Sub6_Sub16.aClass30_Sub1_3092, Class33_Sub13_Sub4.aClass58_3261, (byte)123);
			else
				i1++;
			if(Class81.aClass33_Sub6_Sub7_Sub3_1746 != null)
				i1++;
			else
				Class81.aClass33_Sub6_Sub7_Sub3_1746 = Class33_Sub6_Sub14.method574(Class33_Sub11.aClass58_2299, Class33_Sub6_Sub16.aClass30_Sub1_3092, Class33_Sub13_Sub4.aClass58_3261, (byte)123);
			if(Class69.aClass33_Sub6_Sub7_Sub4Array1468 == null)
				Class69.aClass33_Sub6_Sub7_Sub4Array1468 = Class33_Sub6_Sub10.method526(true, Class33_Sub6_Sub16.aClass30_Sub1_3092, Class74.aClass58_1585, Class33_Sub13_Sub4.aClass58_3261);
			else
				i1++;
			if(Class70.aClass33_Sub6_Sub7_Sub3Array1495 == null)
				Class70.aClass33_Sub6_Sub7_Sub3Array1495 = Class33_Sub13_Sub3.method744(-79, Class33_Sub13_Sub4.aClass58_3261, Class33_Sub21.aClass58_2615, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			else
				i1++;
			if(Class33_Sub3.aClass33_Sub6_Sub7_Sub3Array2049 == null)
				Class33_Sub3.aClass33_Sub6_Sub7_Sub3Array2049 = Class33_Sub13_Sub3.method744(arg0 + -76, Class33_Sub13_Sub4.aClass58_3261, Class54.aClass58_1156, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			else
				i1++;
			if(Class32.aClass33_Sub6_Sub7_Sub3Array707 == null)
				Class32.aClass33_Sub6_Sub7_Sub3Array707 = Class33_Sub13_Sub3.method744(-51, Class33_Sub13_Sub4.aClass58_3261, Class42.aClass58_922, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			else
				i1++;
			if(Class33_Sub6_Sub3.aClass33_Sub6_Sub7_Sub3Array2730 == null)
				Class33_Sub6_Sub3.aClass33_Sub6_Sub7_Sub3Array2730 = Class33_Sub13_Sub3.method744(-102, Class33_Sub13_Sub4.aClass58_3261, Class33_Sub6_Sub16.aClass58_3119, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			else
				i1++;
			if(Class58.aClass33_Sub6_Sub7_Sub3Array1904 != null)
				i1++;
			else
				Class58.aClass33_Sub6_Sub7_Sub3Array1904 = Class33_Sub13_Sub3.method744(-74, Class33_Sub13_Sub4.aClass58_3261, Class33_Sub6_Sub17.aClass58_3128, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			if(Class33_Sub19.aClass33_Sub6_Sub7_Sub3_2556 == null)
				Class33_Sub19.aClass33_Sub6_Sub7_Sub3_2556 = Class33_Sub6_Sub14.method574(Class32.aClass58_716, Class33_Sub6_Sub16.aClass30_Sub1_3092, Class33_Sub13_Sub4.aClass58_3261, (byte)123);
			else
				i1++;
			if(Class75.aClass33_Sub6_Sub7_Sub3Array1623 != null)
				i1++;
			else
				Class75.aClass33_Sub6_Sub7_Sub3Array1623 = Class33_Sub13_Sub3.method744(-126, Class33_Sub13_Sub4.aClass58_3261, Class33_Sub6_Sub4_Sub4.aClass58_3481, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			if(Class33_Sub20.aClass33_Sub6_Sub7_Sub3Array2579 != null)
				i1++;
			else
				Class33_Sub20.aClass33_Sub6_Sub7_Sub3Array2579 = Class33_Sub13_Sub3.method744(-106, Class33_Sub13_Sub4.aClass58_3261, Class33_Sub6_Sub2.aClass58_2700, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			if(Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub3Array2672 != null)
				i1++;
			else
				Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub3Array2672 = Class33_Sub13_Sub3.method744(-125, Class33_Sub13_Sub4.aClass58_3261, Class33_Sub12.aClass58_2319, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			if(Class50.aClass33_Sub6_Sub7_Sub4Array1090 != null)
				i1++;
			else
				Class50.aClass33_Sub6_Sub7_Sub4Array1090 = Class33_Sub6_Sub10.method526(true, Class33_Sub6_Sub16.aClass30_Sub1_3092, Class58.aClass58_1912, Class33_Sub13_Sub4.aClass58_3261);
			if(Class58.aClass33_Sub6_Sub7_Sub4Array1919 != null)
				i1++;
			else
				Class58.aClass33_Sub6_Sub7_Sub4Array1919 = Class33_Sub6_Sub10.method526(true, Class33_Sub6_Sub16.aClass30_Sub1_3092, Class17.aClass58_343, Class33_Sub13_Sub4.aClass58_3261);
			if(~i1 > -15)
			{
				Class63.aClass58_1339 = Class35.method846((byte)-83, new Class58[] {
					Class73.aClass58_1558, Class37.method859(15591, (i1 * 100) / 14), Class22.aClass58_417
				});
				Class45.anInt976 = 70;
				return;
			}
			Class81.aClass33_Sub6_Sub7_Sub3_1746.method471();
			int l2 = -10 + (int)(21D * Math.random());
			int l3 = -20 + (int)(41D * Math.random());
			int j3 = (int)(Math.random() * 21D) + -10;
			int i2 = -10 + (int)(Math.random() * 21D);
			for(int i4 = 0; ~Class70.aClass33_Sub6_Sub7_Sub3Array1495.length < ~i4; i4++)
				Class70.aClass33_Sub6_Sub7_Sub3Array1495[i4].method475(l3 + i2, l2 + l3, l3 + j3);

			Class69.aClass33_Sub6_Sub7_Sub4Array1468[0].method498(i2 + l3, l3 + l2, j3 - -l3);
			Class59.anInt1273 = 85;
			Class45.anInt976 = 70;
			Class63.aClass58_1339 = Class33_Sub3.aClass58_2041;
			return;
		}
		if(~Class59.anInt1273 == -86)
		{
			int j1 = Class75.method1162(Class33_Sub6_Sub16.aClass30_Sub1_3092, 27530);
			int j2 = Class77_Sub2.method1174(480);
			if(~j1 > ~j2)
			{
				Class63.aClass58_1339 = Class35.method846((byte)-83, new Class58[] {
					Class33_Sub6_Sub5.aClass58_2761, Class37.method859(15591, (j1 * 100) / j2), Class22.aClass58_417
				});
				Class45.anInt976 = 80;
				return;
			} else
			{
				Class45.anInt976 = 80;
				Class63.aClass58_1339 = Class78.aClass58_1663;
				Class59.anInt1273 = 90;
				return;
			}
		}
		if(~Class59.anInt1273 == -91)
			if(!Class33_Sub6_Sub3.aClass30_Sub1_2715.method223((byte)-127))
			{
				Class63.aClass58_1339 = Class35.method846((byte)-83, new Class58[] {
					Class51.aClass58_1097, Class37.method859(arg0 ^ 0xffffc318, Class33_Sub6_Sub3.aClass30_Sub1_2715.method242(false)), Class22.aClass58_417
				});
				Class45.anInt976 = 90;
				return;
			} else
			{
				Class34 class34 = new Class34(Class33_Sub6_Sub3.aClass30_Sub1_2715, Class33_Sub6_Sub16.aClass30_Sub1_3092, 20, 0.80000000000000004D, Class33_Sub3.aBoolean2058 ? 64 : 128);
				Class33_Sub6_Sub7_Sub1.method442(class34);
				Class33_Sub6_Sub7_Sub1.method431(0.80000000000000004D);
				Class59.anInt1273 = 110;
				Class45.anInt976 = 90;
				Class63.aClass58_1339 = Class59.aClass58_1265;
				return;
			}
		if(Class59.anInt1273 == 110)
		{
			Class33_Sub6_Sub2.aClass78_2701 = new Class78();
			Class22.aClass72_416.method1142(Class33_Sub6_Sub2.aClass78_2701, -23553, 10);
			Class45.anInt976 = 94;
			Class59.anInt1273 = 120;
			Class63.aClass58_1339 = Class29.aClass58_594;
			return;
		}
		if(Class59.anInt1273 == 120)
			if(!Class33_Sub12.aClass30_Sub1_2322.method232(Class33_Sub13_Sub4.aClass58_3261, arg0 ^ 0x7a0c, Class59.aClass58_1267))
			{
				Class63.aClass58_1339 = Class35.method846((byte)-83, new Class58[] {
					Class33_Sub6_Sub10.aClass58_2865, Class22.aClass58_420
				});
				Class45.anInt976 = 96;
				return;
			} else
			{
				Class20 class20 = new Class20(Class33_Sub12.aClass30_Sub1_2322.method221(5, Class33_Sub13_Sub4.aClass58_3261, Class59.aClass58_1267));
				Class37.method858((byte)-38, class20);
				Class63.aClass58_1339 = Class30.aClass58_642;
				Class45.anInt976 = 96;
				Class59.anInt1273 = 130;
				return;
			}
		if(~Class59.anInt1273 == -131)
		{
			if(!Class30.aClass30_Sub1_674.method223((byte)-128))
			{
				Class63.aClass58_1339 = Class35.method846((byte)-83, new Class58[] {
					Class33_Sub6_Sub16.aClass58_3115, Class37.method859(arg0 + 15592, (4 * Class30.aClass30_Sub1_674.method242(false)) / 5), Class22.aClass58_417
				});
				Class45.anInt976 = 100;
				return;
			}
			if(!Class73.aClass30_Sub1_1554.method223((byte)-128))
			{
				Class63.aClass58_1339 = Class35.method846((byte)-83, new Class58[] {
					Class33_Sub6_Sub16.aClass58_3115, Class37.method859(15591, 80 - -(Class73.aClass30_Sub1_1554.method242(false) / 6)), Class22.aClass58_417
				});
				Class45.anInt976 = 100;
				return;
			}
			if(!Class59.aClass30_Sub1_1271.method223((byte)-126))
			{
				Class63.aClass58_1339 = Class35.method846((byte)-83, new Class58[] {
					Class33_Sub6_Sub16.aClass58_3115, Class37.method859(15591, 96 - -(Class59.aClass30_Sub1_1271.method242(false) / 20)), Class22.aClass58_417
				});
				Class45.anInt976 = 100;
				return;
			} else
			{
				Class63.aClass58_1339 = Class33_Sub7.aClass58_2170;
				Class45.anInt976 = 100;
				Class59.anInt1273 = 140;
				return;
			}
		}
		if(Class59.anInt1273 == 140)
			Class29.method215(10, (byte)-47);
	}

	public static void method1226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9)
	{
		try
		{
			anInt1805++;
			if(arg3 < 50)
				method1224(-74, null, null, 61);
			Class33_Sub5 class33_sub5 = null;
			for(Class33_Sub5 class33_sub5_1 = (Class33_Sub5)Class33_Sub6_Sub15.aClass4_3053.method68(18823); class33_sub5_1 != null; class33_sub5_1 = (Class33_Sub5)Class33_Sub6_Sub15.aClass4_3053.method66((byte)-127))
			{
				if(~class33_sub5_1.anInt2104 != ~arg7 || arg8 != class33_sub5_1.anInt2109 || class33_sub5_1.anInt2098 != arg6 || class33_sub5_1.anInt2093 != arg5)
					continue;
				class33_sub5 = class33_sub5_1;
				break;
			}

			if(class33_sub5 == null)
			{
				class33_sub5 = new Class33_Sub5();
				class33_sub5.anInt2093 = arg5;
				class33_sub5.anInt2098 = arg6;
				class33_sub5.anInt2104 = arg7;
				class33_sub5.anInt2109 = arg8;
				Class68.method1110(-1, class33_sub5);
				Class33_Sub6_Sub15.aClass4_3053.method63(class33_sub5, (byte)83);
			}
			class33_sub5.anInt2119 = arg4;
			class33_sub5.anInt2115 = arg9;
			class33_sub5.anInt2112 = arg2;
			class33_sub5.anInt2097 = arg0;
			class33_sub5.anInt2096 = arg1;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rc.F(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
		}
	}

	public static Class33_Sub6_Sub7_Sub3 method1227(int arg0, int arg1, int arg2, Class30 arg3)
	{
		try
		{
			anInt1806++;
			if(arg2 != 9)
				aClass33_Sub15_1816 = null;
			if(!Canvas_Sub1.method42(12127, arg1, arg0, arg3))
				return null;
			else
				return Class9.method84((byte)-32);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rc.E(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method1228(byte arg0)
	{
		try
		{
			Class26.anImage546 = null;
			anInt1811++;
			Class33_Sub9.aFontMetrics2177 = null;
			if(arg0 <= 101)
				aClass33_Sub11_Sub1_1809 = null;
			Class33_Sub10.aFont2222 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rc.C(" + arg0 + ')');
		}
	}

	public RuntimeException_Sub1(Throwable arg0, String arg1)
	{
		try
		{
			aString1817 = arg1;
			aThrowable1807 = arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public static int anInt1805;
	public static int anInt1806;
	public Throwable aThrowable1807;
	public static Class30 aClass30_1808;
	public static Class33_Sub11_Sub1 aClass33_Sub11_Sub1_1809 = new Class33_Sub11_Sub1(5000);
	public static int anInt1810;
	public static int anInt1811;
	public static byte aByteArrayArrayArray1812[][][];
	public static int anInt1813;
	public static Class58 aClass58_1814 = Class33_Sub6_Sub11.method535(103, "Registrierter Benutzer");
	public static Class58 aClass58_1815 = Class33_Sub6_Sub11.method535(121, "Spiel)2Fenster geladen)3");
	public static Class33_Sub15 aClass33_Sub15_1816;
	public String aString1817;
	public static int anInt1818;
	public static int anInt1819 = 0;
	public static int anIntArrayArray1820[][] = new int[104][104];
	public static int anInt1821;

}
