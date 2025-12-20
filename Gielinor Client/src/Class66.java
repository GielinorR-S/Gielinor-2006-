// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class66.java

import java.awt.Component;

public class Class66
{

	public static Class33_Sub6_Sub7_Sub4 method1094(Class30 arg0, byte arg1, int arg2)
	{
		try
		{
			anInt1417++;
			if(!Class33_Sub6_Sub3.method311(arg0, (byte)-109, arg2))
				return null;
			if(arg1 >= -34)
				method1096(null, 111);
			return Class33_Sub13_Sub3.method743(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sd.B(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static boolean method1095(int arg0, int arg1)
	{
		try
		{
			anInt1404++;
			if(!Class33_Sub6_Sub2.method305(arg0, 0x12bcb130))
				return false;
			Class33_Sub15 aclass33_sub15[] = Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0];
			if(arg1 != 2047)
				aClass58_1414 = null;
			boolean flag = false;
			for(int i = 0; ~i > ~aclass33_sub15.length; i++)
			{
				Class33_Sub15 class33_sub15 = aclass33_sub15[i];
				if(class33_sub15 != null && class33_sub15.anInt2452 == 6)
				{
					if(~class33_sub15.anInt2374 != 0 || class33_sub15.anInt2367 != -1)
					{
						boolean flag1 = Class16.method153(class33_sub15, 0);
						int k;
						if(flag1)
							k = class33_sub15.anInt2367;
						else
							k = class33_sub15.anInt2374;
						if(k != -1)
						{
							Class33_Sub6_Sub14 class33_sub6_sub14 = Class33_Sub21.method830(k, arg1 ^ 0xfffff853);
							for(class33_sub15.anInt2393 += Class40.anInt895; class33_sub6_sub14.anIntArray3031[class33_sub15.anInt2421] < class33_sub15.anInt2393;)
							{
								class33_sub15.anInt2393 -= class33_sub6_sub14.anIntArray3031[class33_sub15.anInt2421];
								class33_sub15.anInt2421++;
								if(class33_sub6_sub14.anIntArray3009.length <= class33_sub15.anInt2421)
								{
									class33_sub15.anInt2421 -= class33_sub6_sub14.anInt3028;
									if(class33_sub15.anInt2421 < 0 || ~class33_sub6_sub14.anIntArray3009.length >= ~class33_sub15.anInt2421)
										class33_sub15.anInt2421 = 0;
								}
								flag = true;
							}

						}
					}
					if(~class33_sub15.anInt2472 != -1 && !class33_sub15.aBoolean2412)
					{
						flag = true;
						int j = class33_sub15.anInt2472 >> 0xf00e8f10;
						j *= Class40.anInt895;
						int l = (class33_sub15.anInt2472 << 0x8381bcb0) >> 0x67249f30;
						class33_sub15.anInt2388 = 0x7ff & class33_sub15.anInt2388 + j;
						l *= Class40.anInt895;
						class33_sub15.anInt2460 = class33_sub15.anInt2460 + l & 0x7ff;
					}
				}
			}

			return flag;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sd.C(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static int method1096(Class58 arg0, int arg1)
	{
		try
		{
			anInt1424++;
			if(Class75.anInt1617 == 1)
				return 7;
			int i = -29 % (arg1 / 52);
			if(arg0.method1052(Class33_Sub18.aClass58_2532, -115))
				return 1;
			if(arg0.method1052(Class33_Sub6_Sub4_Sub4.aClass58_3476, -87))
				return 1;
			if(arg0.method1052(Class33_Sub18.aClass58_2512, -63))
				return 2;
			if(arg0.method1052(Class30.aClass58_624, -84))
				return 2;
			if(arg0.method1052(Class15.aClass58_299, -74))
				return 3;
			if(arg0.method1052(Class33_Sub6_Sub4_Sub5_Sub1.aClass58_3770, -124))
				return 4;
			if(arg0.method1052(Class33_Sub12.aClass58_2314, -70))
				return 4;
			if(arg0.method1052(Class45.aClass58_973, -91))
				return 5;
			return !arg0.method1052(Class19.aClass58_371, -104) ? 0 : 6;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sd.F(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static void method1097(int arg0, boolean arg1)
	{
		try
		{
			anInt1409++;
			int ai[] = Class13.aClass33_Sub6_Sub7_Sub3_265.anIntArray3722;
			int i = ai.length;
			if(arg1)
				method1096(null, -123);
			for(int j = 0; ~i < ~j; j++)
				ai[j] = 0;

			for(int k = 1; ~k > -104; k++)
			{
				int l = 24628 + (-k + 103) * 512 * 4;
				for(int j1 = 1; ~j1 > -104; j1++)
				{
					if(~(Class35.aByteArrayArrayArray761[arg0][j1][k] & 0x18) == -1)
						Class33_Sub2.aClass56_2035.method1010(ai, l, 512, arg0, j1, k);
					if(arg0 < 3 && ~(Class35.aByteArrayArrayArray761[arg0 - -1][j1][k] & 8) != -1)
						Class33_Sub2.aClass56_2035.method1010(ai, l, 512, arg0 - -1, j1, k);
					l += 4;
				}

			}

			int i1 = (-10 + (int)(Math.random() * 20D) + 238 << 0xd3244cb0) + (((238 + (int)(20D * Math.random())) - 10 << 0x2be41aa8) + -10 + ((int)(Math.random() * 20D) + 238));
			Class13.aClass33_Sub6_Sub7_Sub3_265.method490();
			int k1 = 228 + (int)(Math.random() * 20D) << 0xbb8932b0;
			for(int l1 = 1; l1 < 103; l1++)
			{
				for(int i2 = 1; i2 < 103; i2++)
				{
					if((0x18 & Class35.aByteArrayArrayArray761[arg0][i2][l1]) == 0)
						method1099(i2, l1, -1026, i1, k1, arg0);
					if(arg0 < 3 && ~(8 & Class35.aByteArrayArrayArray761[arg0 - -1][i2][l1]) != -1)
						method1099(i2, l1, -1026, i1, k1, arg0 + 1);
				}

			}

			Class54.anInt1154 = 0;
			for(int j2 = 0; j2 < 104; j2++)
			{
				for(int k2 = 0; k2 < 104; k2++)
				{
					int l2 = Class33_Sub2.aClass56_2035.method971(Class77_Sub2.anInt2645, j2, k2);
					if(l2 != 0)
					{
						l2 = 0x7fff & l2 >> 0x115b688e;
						int i3 = Class33_Sub5.method285((byte)-103, l2).anInt3148;
						if(i3 >= 0)
						{
							int j3 = j2;
							int k3 = k2;
							if(i3 != 22 && i3 != 29 && ~i3 != -35 && ~i3 != -37 && ~i3 != -47 && ~i3 != -48 && i3 != 48)
							{
								int ai1[][] = Class51.aClass70Array1098[Class77_Sub2.anInt2645].anIntArrayArray1499;
								for(int l3 = 0; l3 < 10; l3++)
								{
									int i4 = (int)(4D * Math.random());
									if(i4 == 0 && ~j3 < -1 && j3 > -3 + j2 && (ai1[-1 + j3][k3] & 0x12c0108) == 0)
										j3--;
									if(~i4 == -2 && ~j3 > -104 && j3 < j2 - -3 && ~(ai1[j3 - -1][k3] & 0x12c0180) == -1)
										j3++;
									if(i4 == 2 && k3 > 0 && k2 + -3 < k3 && ~(ai1[j3][k3 + -1] & 0x12c0102) == -1)
										k3--;
									if(i4 == 3 && ~k3 > -104 && k3 < 3 + k2 && ~(ai1[j3][k3 + 1] & 0x12c0120) == -1)
										k3++;
								}

							}
							Class54.aClass33_Sub6_Sub7_Sub3Array1157[Class54.anInt1154] = Class70.aClass33_Sub6_Sub7_Sub3Array1495[i3];
							Class33_Sub6_Sub15.anIntArray3062[Class54.anInt1154] = j3;
							Class33_Sub6_Sub4_Sub5.anIntArray3561[Class54.anInt1154] = k3;
							Class54.anInt1154++;
						}
					}
				}

			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sd.A(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method1098(int arg0)
	{
		try
		{
			aClass58_1426 = null;
			aClass58_1402 = null;
			if(arg0 != 5625)
				aClass58_1402 = null;
			aClass58_1427 = null;
			aClass58_1423 = null;
			anIntArray1422 = null;
			aClass58_1419 = null;
			aClass58_1420 = null;
			aClass58_1430 = null;
			aClass4_1415 = null;
			aClass58_1428 = null;
			aClass58_1407 = null;
			aClass58_1411 = null;
			aClass58_1414 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sd.E(" + arg0 + ')');
		}
	}

	public static void method1099(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		anInt1429++;
		int i = Class33_Sub2.aClass56_2035.method978(arg5, arg0, arg1);
		if(~i != -1)
		{
			int j = Class33_Sub2.aClass56_2035.method980(arg5, arg0, arg1, i);
			int i1 = (0xca & j) >> 0x3181fe26;
			int i2 = arg3;
			int k1 = 0x1f & j;
			int ai[] = Class13.aClass33_Sub6_Sub7_Sub3_265.anIntArray3722;
			int i3 = (24624 - -(arg0 * 4)) + 4 * (-(arg1 * 512) + 52736);
			if(~i < -1)
				i2 = arg4;
			int k3 = (i & 0x1ffff906) >> 0xd3277dce;
			Class33_Sub6_Sub17 class33_sub6_sub17_2 = Class33_Sub5.method285((byte)-98, k3);
			if(class33_sub6_sub17_2.anInt3177 == -1)
			{
				if(~k1 == -1 || k1 == 2)
					if(i1 != 0)
					{
						if(~i1 != -2)
						{
							if(~i1 != -3)
							{
								if(i1 == 3)
								{
									ai[1536 + i3] = i2;
									ai[1536 + (i3 - -1)] = i2;
									ai[1536 + (i3 + 2)] = i2;
									ai[3 + i3 + 1536] = i2;
								}
							} else
							{
								ai[3 + i3] = i2;
								ai[515 + i3] = i2;
								ai[(i3 + 3) - -1024] = i2;
								ai[1536 + (i3 + 3)] = i2;
							}
						} else
						{
							ai[i3] = i2;
							ai[1 + i3] = i2;
							ai[2 + i3] = i2;
							ai[i3 - -3] = i2;
						}
					} else
					{
						ai[i3] = i2;
						ai[512 + i3] = i2;
						ai[i3 + 1024] = i2;
						ai[1536 + i3] = i2;
					}
				if(k1 == 3)
					if(i1 != 0)
					{
						if(~i1 == -2)
							ai[3 + i3] = i2;
						else
						if(~i1 == -3)
							ai[3 + (i3 - -1536)] = i2;
						else
						if(~i1 == -4)
							ai[1536 + i3] = i2;
					} else
					{
						ai[i3] = i2;
					}
				if(k1 == 2)
					if(i1 == 3)
					{
						ai[i3] = i2;
						ai[512 + i3] = i2;
						ai[i3 - -1024] = i2;
						ai[i3 + 1536] = i2;
					} else
					if(i1 == 0)
					{
						ai[i3] = i2;
						ai[i3 + 1] = i2;
						ai[i3 + 2] = i2;
						ai[3 + i3] = i2;
					} else
					if(i1 != 1)
					{
						if(~i1 == -3)
						{
							ai[1536 + i3] = i2;
							ai[1 + (1536 + i3)] = i2;
							ai[2 + i3 + 1536] = i2;
							ai[(3 + i3) - -1536] = i2;
						}
					} else
					{
						ai[i3 + 3] = i2;
						ai[i3 - -3 - -512] = i2;
						ai[1024 + (i3 + 3)] = i2;
						ai[1536 + (3 + i3)] = i2;
					}
			} else
			{
				Class33_Sub6_Sub7_Sub4 class33_sub6_sub7_sub4_2 = Class69.aClass33_Sub6_Sub7_Sub4Array1468[class33_sub6_sub17_2.anInt3177];
				if(class33_sub6_sub7_sub4_2 != null)
				{
					int l4 = (class33_sub6_sub17_2.anInt3165 * 4 + -class33_sub6_sub7_sub4_2.anInt3731) / 2;
					int k4 = (-class33_sub6_sub7_sub4_2.anInt3734 + 4 * class33_sub6_sub17_2.anInt3181) / 2;
					class33_sub6_sub7_sub4_2.method502(k4 + (48 + 4 * arg0), 48 + (-arg1 + (104 - class33_sub6_sub17_2.anInt3165)) * 4 + l4);
				}
			}
		}
		i = Class33_Sub2.aClass56_2035.method1007(arg5, arg0, arg1);
		if(i != 0)
		{
			int k = Class33_Sub2.aClass56_2035.method980(arg5, arg0, arg1, i);
			int l1 = 0x1f & k;
			int j1 = 3 & k >> 0xb2bee046;
			int j2 = i >> 0x8666316e & 0x7fff;
			Class33_Sub6_Sub17 class33_sub6_sub17_1 = Class33_Sub5.method285((byte)-96, j2);
			if(~class33_sub6_sub17_1.anInt3177 == 0)
			{
				if(~l1 == -10)
				{
					int j3 = 0xeeeeee;
					int i4 = 24624 - (-(4 * arg0) - 2048 * (103 + -arg1));
					if(i > 0)
						j3 = 0xee0000;
					int ai1[] = Class13.aClass33_Sub6_Sub7_Sub3_265.anIntArray3722;
					if(~j1 == -1 || j1 == 2)
					{
						ai1[1536 + i4] = j3;
						ai1[1 + i4 + 1024] = j3;
						ai1[2 + (512 + i4)] = j3;
						ai1[3 + i4] = j3;
					} else
					{
						ai1[i4] = j3;
						ai1[(1 + i4) - -512] = j3;
						ai1[i4 - -1026] = j3;
						ai1[3 + i4 + 1536] = j3;
					}
				}
			} else
			{
				Class33_Sub6_Sub7_Sub4 class33_sub6_sub7_sub4_1 = Class69.aClass33_Sub6_Sub7_Sub4Array1468[class33_sub6_sub17_1.anInt3177];
				if(class33_sub6_sub7_sub4_1 != null)
				{
					int l3 = (-class33_sub6_sub7_sub4_1.anInt3734 + class33_sub6_sub17_1.anInt3181 * 4) / 2;
					int j4 = (class33_sub6_sub17_1.anInt3165 * 4 + -class33_sub6_sub7_sub4_1.anInt3731) / 2;
					class33_sub6_sub7_sub4_1.method502(48 - (-(4 * arg0) + -l3), (j4 + 48) - -(4 * (-class33_sub6_sub17_1.anInt3165 + -arg1 + 104)));
				}
			}
		}
		if(arg2 != -1026)
			method1097(64, false);
		i = Class33_Sub2.aClass56_2035.method971(arg5, arg0, arg1);
		if(~i != -1)
		{
			int l = 0x7fff & i >> 0xf338264e;
			Class33_Sub6_Sub17 class33_sub6_sub17 = Class33_Sub5.method285((byte)-101, l);
			if(class33_sub6_sub17.anInt3177 != -1)
			{
				Class33_Sub6_Sub7_Sub4 class33_sub6_sub7_sub4 = Class69.aClass33_Sub6_Sub7_Sub4Array1468[class33_sub6_sub17.anInt3177];
				if(class33_sub6_sub7_sub4 != null)
				{
					int l2 = (class33_sub6_sub17.anInt3165 * 4 + -class33_sub6_sub7_sub4.anInt3731) / 2;
					int k2 = (class33_sub6_sub17.anInt3181 * 4 - class33_sub6_sub7_sub4.anInt3734) / 2;
					class33_sub6_sub7_sub4.method502(4 * arg0 + (48 + k2), l2 + (48 - -((104 - (arg1 - -class33_sub6_sub17.anInt3165)) * 4)));
				}
			}
		}
	}

	public static void method1100(byte arg0)
	{
		try
		{
			anInt1405++;
			try
			{
				if(arg0 < 123)
				{
					return;
				} else
				{
					java.awt.Graphics g = Class33_Sub6_Sub4_Sub1.aCanvas3367.getGraphics();
					Class15_Sub2.aClass15_1980.method131(550, 4, (byte)78, g);
					return;
				}
			}
			catch(Exception _ex)
			{
				Class33_Sub6_Sub4_Sub1.aCanvas3367.repaint();
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sd.D(" + arg0 + ')');
		}
	}

	public Class66()
	{
		anInt1401 = 0;
		anInt1408 = 0;
	}

	public int anInt1401;
	public static Class58 aClass58_1402 = Class33_Sub6_Sub11.method535(109, " zuerst von Ihrer Freunde)2Liste(Q");
	public int anInt1403;
	public static int anInt1404;
	public static int anInt1405;
	public Class33_Sub6_Sub4 aClass33_Sub6_Sub4_1406;
	public static Class58 aClass58_1407;
	public int anInt1408;
	public static int anInt1409;
	public int anInt1410;
	public static Class58 aClass58_1411;
	public static int anInt1412;
	public int anInt1413;
	public static Class58 aClass58_1414 = Class33_Sub6_Sub11.method535(108, "leuchten1:");
	public static Class4 aClass4_1415 = new Class4();
	public Class33_Sub6_Sub4 aClass33_Sub6_Sub4_1416;
	public static int anInt1417;
	public int anInt1418;
	public static Class58 aClass58_1419 = Class33_Sub6_Sub11.method535(109, ")2");
	public static Class58 aClass58_1420 = Class33_Sub6_Sub11.method535(122, "::noclip");
	public static int anInt1421 = 0;
	public static int anIntArray1422[] = new int[4000];
	public static Class58 aClass58_1423 = Class33_Sub6_Sub11.method535(125, "da dieser Computer gegen unsere ");
	public static int anInt1424;
	public int anInt1425;
	public static Class58 aClass58_1426 = Class33_Sub6_Sub11.method535(121, "Classic");
	public static Class58 aClass58_1427 = Class33_Sub6_Sub11.method535(119, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");
	public static Class58 aClass58_1428;
	public static int anInt1429;
	public static Class58 aClass58_1430;
	public static int anInt1431 = 0;

	static 
	{
		aClass58_1411 = Class33_Sub6_Sub11.method535(98, "We suspect someone knows your password)3");
		aClass58_1428 = Class33_Sub6_Sub11.method535(114, "Press (Wchange your password(W on front page)3");
		aClass58_1407 = aClass58_1428;
		aClass58_1430 = aClass58_1411;
	}
}
