// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class59.java

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class59
{

	public static void method1067(int arg0)
	{
		try
		{
			if(arg0 != 1)
				method1068(29);
			if(Class33_Sub6_Sub4_Sub6.aClass79_3581 != null)
				Class33_Sub6_Sub4_Sub6.aClass79_3581.method1200(false);
			if(Class33_Sub11_Sub1.aClass79_3212 != null)
				Class33_Sub11_Sub1.aClass79_3212.method1200(false);
			anInt1268++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rb.B(" + arg0 + ')');
		}
	}

	public static void method1068(int arg0)
	{
		try
		{
			aClass30_Sub1_1271 = null;
			aClass58_1274 = null;
			aClass58_1263 = null;
			aClass58_1270 = null;
			aClass33_Sub6_Sub7_Sub4_1272 = null;
			aClass58_1262 = null;
			aClass58_1265 = null;
			aClass30_Sub1_1266 = null;
			aClass58_1267 = null;
			aClass58_1258 = null;
			aClass58_1260 = null;
			anIntArray1269 = null;
			if(arg0 != 3)
				method1068(-107);
			aClass58_1259 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rb.C(" + arg0 + ')');
		}
	}
	
	public static void method1069(boolean arg0) {
		if(Class12.anInt226 > 1)
			Class12.anInt226--;
		anInt1261++;
		if(~Class21.anInt402 < -1)
			Class21.anInt402--;
		if(Class36.aBoolean802)
		{
			Class36.aBoolean802 = false;
			Class30.method228(109);
			return;
		}
		for(int i = 0; i < 100; i++)
			if(!Class33_Sub6_Sub5.method405(83))
				break;

		if(Class23.anInt485 != 30 && ~Class23.anInt485 != -36)
			return;
		if(Class33_Sub18.aBoolean2508 && Class23.anInt485 == 30)
		{
			Class81.anInt1758 = 0;
			Class69.anInt1464 = 0;
			while(Class39.method877((byte)114)) ;
			for(int j = 0; j < Class33_Sub21.aBooleanArray2603.length; j++)
				Class33_Sub21.aBooleanArray2603[j] = false;

		}
		Class33_Sub6_Sub4_Sub5_Sub1.method370(67, Class46.aClass33_Sub11_Sub1_989, !arg0);
		synchronized(Class33_Sub6_Sub2.aClass78_2701.anObject1666)
		{
			if(Class33_Sub6_Sub12.aBoolean2951)
			{
				if(~Class69.anInt1464 != -1 || ~Class33_Sub6_Sub2.aClass78_2701.anInt1681 <= -41)
				{
					Class46.aClass33_Sub11_Sub1_989.method683(203, -1198);
					int i3 = 0;
					Class46.aClass33_Sub11_Sub1_989.method640(0, -11124);
					int k1 = ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).anInt2239;
					for(int j4 = 0; j4 < Class33_Sub6_Sub2.aClass78_2701.anInt1681; j4++)
					{
						if(-k1 + ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).anInt2239 >= 240)
							break;
						i3++;
						int j5 = Class33_Sub6_Sub2.aClass78_2701.anIntArray1679[j4];
						int i6 = Class33_Sub6_Sub2.aClass78_2701.anIntArray1680[j4];
						if(~i6 > -1)
							i6 = 0;
						else
						if(~i6 < -765)
							i6 = 764;
						if(j5 >= 0)
						{
							if(j5 > 502)
								j5 = 502;
						} else
						{
							j5 = 0;
						}
						int k6 = 765 * j5 + i6;
						if(~Class33_Sub6_Sub2.aClass78_2701.anIntArray1679[j4] == 0 && ~Class33_Sub6_Sub2.aClass78_2701.anIntArray1680[j4] == 0)
						{
							k6 = 0x7ffff;
							i6 = -1;
							j5 = -1;
						}
						if(i6 == Class16.anInt319 && j5 == Class33_Sub6_Sub10.anInt2869)
						{
							if(Class19.anInt359 < 2047)
								Class19.anInt359++;
						} else
						{
							int i7 = j5 + -Class33_Sub6_Sub10.anInt2869;
							int l6 = -Class16.anInt319 + i6;
							Class33_Sub6_Sub10.anInt2869 = j5;
							Class16.anInt319 = i6;
							if(~Class19.anInt359 > -9 && l6 >= -32 && l6 <= 31 && i7 >= -32 && ~i7 >= -32)
							{
								i7 += 32;
								l6 += 32;
								Class46.aClass33_Sub11_Sub1_989.method625(i7 + ((Class19.anInt359 << 0x1ad320ec) + (l6 << 0xd7663a66)), true);
								Class19.anInt359 = 0;
							} else
							if(Class19.anInt359 < 8)
							{
								Class46.aClass33_Sub11_Sub1_989.method637((0x800000 - -(Class19.anInt359 << 0x3b395c73)) + k6, 990);
								Class19.anInt359 = 0;
							} else
							{
								Class46.aClass33_Sub11_Sub1_989.method669(k6 + ((Class19.anInt359 << 0xf9409e73) + 0xc0000000), -30515);
								Class19.anInt359 = 0;
							}
						}
					}

					Class46.aClass33_Sub11_Sub1_989.method638(-1, -k1 + ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).anInt2239);
					Class33_Sub6_Sub4_Sub4.anInt3472++;
					if(~i3 > ~Class33_Sub6_Sub2.aClass78_2701.anInt1681)
					{
						Class33_Sub6_Sub2.aClass78_2701.anInt1681 -= i3;
						for(int k5 = 0; ~k5 > ~Class33_Sub6_Sub2.aClass78_2701.anInt1681; k5++)
						{
							Class33_Sub6_Sub2.aClass78_2701.anIntArray1680[k5] = Class33_Sub6_Sub2.aClass78_2701.anIntArray1680[k5 - -i3];
							Class33_Sub6_Sub2.aClass78_2701.anIntArray1679[k5] = Class33_Sub6_Sub2.aClass78_2701.anIntArray1679[i3 + k5];
						}

					} else
					{
						Class33_Sub6_Sub2.aClass78_2701.anInt1681 = 0;
					}
				}
			} else
			{
				Class33_Sub6_Sub2.aClass78_2701.anInt1681 = 0;
			}
		}
		if(Class69.anInt1464 != 0)
		{
			Class73.anInt1548++;
			long l = (-Class81.aLong1769 + Class33_Sub6_Sub4.aLong2734) / 50L;
			Class81.aLong1769 = Class33_Sub6_Sub4.aLong2734;
			int l1 = Class48.anInt1055;
			int l5 = 0;
			if(l > 4095L)
				l = 4095L;
			if(Class69.anInt1464 == 2)
				l5 = 1;
			int j3 = Class82.anInt1794;
			int j6 = (int)l;
			Class46.aClass33_Sub11_Sub1_989.method683(127, -1198);
			if(~l1 > -1)
				l1 = 0;
			else
			if(~l1 < -503)
				l1 = 502;
			if(j3 < 0)
				j3 = 0;
			else
			if(j3 > 764)
				j3 = 764;
			int k4 = l1 * 765 + j3;
			Class46.aClass33_Sub11_Sub1_989.method654(0x1bb12a8, (k4 + (j6 << 0x8d2c5474)) - -(l5 << 0xbe8d77b3));
		}
		if(Class33_Sub21.aBooleanArray2603[96] || Class33_Sub21.aBooleanArray2603[97] || Class33_Sub21.aBooleanArray2603[98] || Class33_Sub21.aBooleanArray2603[99])
			Class33_Sub19.aBoolean2554 = true;
		if(Class82.anInt1784 > 0)
			Class82.anInt1784--;
		if(Class33_Sub19.aBoolean2554 && Class82.anInt1784 <= 0)
		{
			Class82.anInt1784 = 20;
			Class33_Sub19.aBoolean2554 = false;
			Class65.anInt1383++;
			Class46.aClass33_Sub11_Sub1_989.method683(162, -1198);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, Class65.anInt1394);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, Class33_Sub6_Sub10.anInt2872);
		}
		if((Class13.aBoolean271) && (!Class69.aBoolean1480))
		{
			Class69.aBoolean1480 = true;
			Class49.anInt1068++;
			Class46.aClass33_Sub11_Sub1_989.method683(101, -1198);
			Class46.aClass33_Sub11_Sub1_989.method640(1, -11124);
		}
		if(arg0 != (!Class13.aBoolean271) && Class69.aBoolean1480)
		{
			Class69.aBoolean1480 = false;
			Class49.anInt1068++;
			Class46.aClass33_Sub11_Sub1_989.method683(101, -1198);
			Class46.aClass33_Sub11_Sub1_989.method640(0, -11124);
		}
		Class33_Sub6_Sub8.method507((byte)108);
		if(~Class23.anInt485 != -31 && ~Class23.anInt485 != -36)
			return;
		Class19.method165(-2);
		Class33_Sub6_Sub14.method572(-116);
		Class20.anInt378++;
		if(Class20.anInt378 > 750)
		{
			Class30.method228(62);
			return;
		}
		Class77.method1171(2047);
		Class68.method1108((byte)-88);
		Class33_Sub21.method832(-105);
		if(~Class33_Sub6_Sub4.anInt2742 != -1)
		{
			Class55.anInt1171++;
			if(Class55.anInt1171 >= 15)
			{
				if(~Class33_Sub6_Sub4.anInt2742 == -3)
					Class74.aBoolean1579 = true;
				if(~Class33_Sub6_Sub4.anInt2742 == -4)
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
				Class33_Sub6_Sub4.anInt2742 = 0;
			}
		}
		Class40.anInt895++;
		if(~Class33_Sub6_Sub9.anInt2851 != -1)
		{
			Class12.anInt242 += 20;
			if(~Class12.anInt242 <= -401)
				Class33_Sub6_Sub9.anInt2851 = 0;
		}
		if(RuntimeException_Sub1.anInt1819 != 0)
		{
			if(Class51.anInt1101 + 5 < Applet_Sub1.anInt41 || ~Applet_Sub1.anInt41 > ~(Class51.anInt1101 + -5) || ~(5 + Class12.anInt233) > ~Class13.anInt254 || ~(Class12.anInt233 + -5) < ~Class13.anInt254)
				Class54.aBoolean1148 = true;
			Class33_Sub6_Sub10.anInt2861++;
			if(Class81.anInt1758 == 0)
			{
				if(RuntimeException_Sub1.anInt1819 == 3)
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
				if(~RuntimeException_Sub1.anInt1819 == -3)
					Class74.aBoolean1579 = true;
				RuntimeException_Sub1.anInt1819 = 0;
				if(Class54.aBoolean1148 && ~Class33_Sub6_Sub10.anInt2861 <= -6)
				{
					Class41.anInt916 = -1;
					Class70.method1132((byte)18);
					if(~Class40.anInt884 == ~Class41.anInt916 && ~Class22.anInt422 != ~Class40.anInt890)
					{
						Class38.anInt842++;
						int k = 0;
						Class33_Sub15 class33_sub15 = Class49.method933(Class40.anInt884, -87);
						if(Class33_Sub21.anInt2588 == 1 && class33_sub15.anInt2446 == 206)
							k = 1;
						if(~class33_sub15.anIntArray2471[Class22.anInt422] >= -1)
							k = 0;
						if(Class71.method1138(Class33_Sub6_Sub5.method403(class33_sub15, -5447), 19138))
						{
							int i2 = Class40.anInt890;
							int k3 = Class22.anInt422;
							class33_sub15.anIntArray2471[k3] = class33_sub15.anIntArray2471[i2];
							class33_sub15.anIntArray2398[k3] = class33_sub15.anIntArray2398[i2];
							class33_sub15.anIntArray2471[i2] = -1;
							class33_sub15.anIntArray2398[i2] = 0;
						} else
						if(k == 1)
						{
							int j2 = Class40.anInt890;
							for(int l3 = Class22.anInt422; l3 != j2;)
								if(~l3 <= ~j2)
								{
									if(l3 > j2)
									{
										class33_sub15.method791(0, 1 + j2, j2);
										j2++;
									}
								} else
								{
									class33_sub15.method791(0, j2 + -1, j2);
									j2--;
								}

						} else
						{
							class33_sub15.method791(0, Class22.anInt422, Class40.anInt890);
						}
						Class46.aClass33_Sub11_Sub1_989.method683(55, -1198);
						Class46.aClass33_Sub11_Sub1_989.method670(Class22.anInt422, -128);
						Class46.aClass33_Sub11_Sub1_989.method664(!arg0, Class40.anInt884);
						Class46.aClass33_Sub11_Sub1_989.method652(k, -4);
						Class46.aClass33_Sub11_Sub1_989.method625(Class40.anInt890, true);
					}
				} else
				if(~Class33_Sub9.anInt2186 != -2 && !Class51.method943(-1 + Class14.anInt276, 94) || Class14.anInt276 <= 2)
				{
					if(Class14.anInt276 > 0)
						Class33_Sub6_Sub4_Sub6.method381((byte)-102, Class14.anInt276 + -1);
				} else
				{
					Class33_Sub6_Sub4_Sub6.method380(2);
				}
				Class55.anInt1171 = 10;
				Class69.anInt1464 = 0;
			}
		}
		byte byte0 = 34;
		if(Class70.anInt1496 != -1)
		{
			Class22.method180(3, 0, 503, 0, Class70.anInt1496, 765, byte0, 0);
			if(~Class33.anInt734 != 0)
				Class22.method180(3, 0, 503, 0, Class33.anInt734, 765, byte0, 0);
		} else
		{
			if(Class33_Sub6_Sub14.anInt3013 != -1)
				Class22.method180(0, 4, 338, 4, Class33_Sub6_Sub14.anInt3013, 516, byte0, 0);
			else
			if(~Class27.anInt563 != 0)
				Class22.method180(0, 4, 338, 4, Class27.anInt563, 516, byte0, 0);
			if(~Class77_Sub2.anInt2644 != 0)
				Class22.method180(1, 205, 466, 553, Class77_Sub2.anInt2644, 743, byte0, 0);
			else
			if(~Class14.anIntArray274[Class30.anInt620] != 0)
				Class22.method180(1, 205, 466, 553, Class14.anIntArray274[Class30.anInt620], 743, byte0, 0);
			if(Class45.anInt965 == -1)
			{
				if(Class81.anInt1744 != -1)
					Class22.method180(2, 357, 453, 17, Class81.anInt1744, 496, byte0, 0);
			} else
			{
				Class22.method180(2, 357, 453, 17, Class45.anInt965, 496, byte0, 0);
			}
		}
		if(Class70.anInt1496 != -1)
		{
			Class22.method180(3, 0, 503, 0, Class70.anInt1496, 765, ~byte0, 0);
			if(~Class33.anInt734 != 0)
				Class22.method180(3, 0, 503, 0, Class33.anInt734, 765, ~byte0, 0);
		} else
		{
			if(~Class33_Sub6_Sub14.anInt3013 != 0)
				Class22.method180(0, 4, 338, 4, Class33_Sub6_Sub14.anInt3013, 516, ~byte0, 0);
			else
			if(~Class27.anInt563 != 0)
				Class22.method180(0, 4, 338, 4, Class27.anInt563, 516, ~byte0, 0);
			if(~Class77_Sub2.anInt2644 != 0)
				Class22.method180(1, 205, 466, 553, Class77_Sub2.anInt2644, 743, ~byte0, 0);
			else
			if(Class14.anIntArray274[Class30.anInt620] != -1)
				Class22.method180(1, 205, 466, 553, Class14.anIntArray274[Class30.anInt620], 743, ~byte0, 0);
			if(~Class45.anInt965 == 0)
			{
				if(~Class81.anInt1744 != 0)
					Class22.method180(2, 357, 453, 17, Class81.anInt1744, 496, ~byte0, 0);
			} else
			{
				Class22.method180(2, 357, 453, 17, Class45.anInt965, 496, ~byte0, 0);
			}
		}
		Class11.method105(29247);
		if(~Class56.anInt1207 != 0)
		{
			int i1 = Class56.anInt1207;
			int k2 = Class56.anInt1214;
			boolean flag = Class33_Sub6_Sub4_Sub4.method350(false, i1, true, 0, (byte)-102, 0, 0, 0, 0, 0, k2, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			Class56.anInt1207 = -1;
			if(flag)
			{
				Class3.anInt112 = Class48.anInt1055;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class12.anInt242 = 0;
				Class33_Sub6_Sub9.anInt2851 = 1;
			}
		}
		if(~Class69.anInt1464 == -2 && Class79.aClass58_1700 != null)
		{
			Class69.anInt1464 = 0;
			Class79.aClass58_1700 = null;
			Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
		}
		Class60.method1071(-86);
		if(~Class70.anInt1496 == 0)
		{
			Class33_Sub6_Sub15.method579((byte)23);
			Canvas_Sub1.method43(123);
			Class26.method204((byte)115);
		}
		if(Class51.anInt1092 != -1 || ~Class33_Sub6_Sub4_Sub6.anInt3626 != 0 || ~Class33_Sub19.anInt2552 != 0)
		{
			if(Class4.anInt130 > Class51.anInt1096)
			{
				Class51.anInt1096++;
				if(~Class4.anInt130 == ~Class51.anInt1096)
				{
					if(~Class51.anInt1092 != 0)
						Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					if(~Class33_Sub6_Sub4_Sub6.anInt3626 != 0)
						Class74.aBoolean1579 = true;
				}
			}
		} else
		if(Class51.anInt1096 > 0)
			Class51.anInt1096--;
		if(Class81.anInt1758 == 1 || Class69.anInt1464 == 1)
			Class60.anInt1277++;
		Class33_Sub3.method279((byte)-83);
		if(Class36.aBoolean796)
			Class33.method265(true);
		for(int j1 = 0; j1 < 5; j1++)
			Canvas_Sub1.anIntArray62[j1]++;

		Class30.method233((byte)119);
		int l2 = Class41.method891(20131);
		int i4 = Applet_Sub1.method31(-27);
		if(~l2 < -4501 && i4 > 4500)
		{
			Class15.anInt300++;
			Class21.anInt402 = 250;
			Class33_Sub6_Sub4_Sub5_Sub1.method369(23672, 4000);
			Class46.aClass33_Sub11_Sub1_989.method683(68, -1198);
		}
		Class33_Sub4.anInt2066++;
		Class33_Sub6_Sub6.anInt2783++;
		Class33_Sub18.anInt2516++;
		if(~Class33_Sub18.anInt2516 < -501)
		{
			int l4 = (int)(Math.random() * 8D);
			if((4 & l4) == 4)
				Class33_Sub6.anInt2134 += Class74.anInt1575;
			if((l4 & 1) == 1)
				Class80.anInt1736 += Class77_Sub2.anInt2643;
			if((l4 & 2) == 2)
				Class78.anInt1659 += Canvas_Sub1.anInt52;
			Class33_Sub18.anInt2516 = 0;
		}
		if(Class33_Sub6_Sub6.anInt2783 > 500)
		{
			int i5 = (int)(8D * Math.random());
			Class33_Sub6_Sub6.anInt2783 = 0;
			if((i5 & 2) == 2)
				Class24.anInt504 += Class49.anInt1078;
			if((1 & i5) == 1)
				Class23.anInt430 += Class33_Sub19.anInt2555;
		}
		if(Class23.anInt430 < -60)
			Class33_Sub19.anInt2555 = 2;
		if(~Class33_Sub6.anInt2134 > 39)
			Class74.anInt1575 = 1;
		if(Class80.anInt1736 < -50)
			Class77_Sub2.anInt2643 = 2;
		if(Class23.anInt430 > 60)
			Class33_Sub19.anInt2555 = -2;
		if(Class33_Sub6.anInt2134 > 40)
			Class74.anInt1575 = -1;
		if(Class24.anInt504 < -20)
			Class49.anInt1078 = 1;
		if(~Class78.anInt1659 > 54)
			Canvas_Sub1.anInt52 = 2;
		if(~Class78.anInt1659 < -56)
			Canvas_Sub1.anInt52 = -2;
		if(~Class24.anInt504 < -11)
			Class49.anInt1078 = -1;
		if(~Class80.anInt1736 < -51)
			Class77_Sub2.anInt2643 = -2;
		if(~Class33_Sub4.anInt2066 < -51)
		{
			Class33_Sub6_Sub17.anInt3153++;
			Class46.aClass33_Sub11_Sub1_989.method683(183, -1198);
		}
		try
		{
			if(Class62.aClass43_1316 != null && ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).anInt2239 > 0)
			{
				Class62.aClass43_1316.method901((byte)42, ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).aByteArray2296, ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).anInt2239, 0);
				Class46.aClass33_Sub11_Sub1_989.anInt2239 = 0;
				Class33_Sub4.anInt2066 = 0;
				return;
			}
		}
		catch(IOException _ex)
		{
			Class30.method228(98);
		}
	}

	public static Class58 aClass58_1258;
	public static Class58 aClass58_1259 = Class33_Sub6_Sub11.method535(107, "null");
	public static Class58 aClass58_1260 = Class33_Sub6_Sub11.method535(101, "und die Schaltfl-=che (WSpielkonto erstellen(W am");
	public static int anInt1261;
	public static Class58 aClass58_1262;
	public static Class58 aClass58_1263 = Class33_Sub6_Sub11.method535(119, " <col=00ff80>");
	public static int anInt1264 = 0;
	public static Class58 aClass58_1265;
	public static Class30_Sub1 aClass30_Sub1_1266;
	public static Class58 aClass58_1267 = Class33_Sub6_Sub11.method535(113, "huffman");
	public static int anInt1268;
	public static int anIntArray1269[];
	public static Class58 aClass58_1270 = Class33_Sub6_Sub11.method535(115, "Script error in: ");
	public static Class30_Sub1 aClass30_Sub1_1271;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_1272;
	public static int anInt1273 = 0;
	public static Class58 aClass58_1274;
	public static int anInt1275 = 0;
	public static int anInt1276 = -1;

	static 
	{
		aClass58_1258 = Class33_Sub6_Sub11.method535(124, "Add friend");
		aClass58_1274 = aClass58_1258;
		aClass58_1262 = Class33_Sub6_Sub11.method535(118, "Loaded textures");
		aClass58_1265 = aClass58_1262;
	}
}
