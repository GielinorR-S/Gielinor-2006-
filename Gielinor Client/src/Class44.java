// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class44.java

import java.awt.Component;

public class Class44
{

	public static void method906(int arg0, byte arg1, int arg2, Class33_Sub11 arg3, int arg4, int arg5, int arg6, int arg7)
	{
		try
		{
			if(arg1 <= 124)
				anInt964 = 118;
			if(~arg6 <= -1 && ~arg6 > -105 && arg5 >= 0 && arg5 < 104)
			{
				Class35.aByteArrayArrayArray761[arg4][arg6][arg5] = 0;
				do
				{
					int i = arg3.method639((byte)123);
					if(i == 0)
					{
						if(arg4 == 0)
							Class30.anIntArrayArrayArray645[0][arg6][arg5] = -Class33_Sub3.method280(79, arg2 + (0x87cce - -arg5), arg7 + (0xe3b7b + arg6)) * 8;
						else
							Class30.anIntArrayArrayArray645[arg4][arg6][arg5] = Class30.anIntArrayArrayArray645[-1 + arg4][arg6][arg5] + -240;
						break;
					}
					if(~i == -2)
					{
						int k = arg3.method639((byte)123);
						if(~k == -2)
							k = 0;
						if(~arg4 != -1)
							Class30.anIntArrayArrayArray645[arg4][arg6][arg5] = -(8 * k) + Class30.anIntArrayArrayArray645[-1 + arg4][arg6][arg5];
						else
							Class30.anIntArrayArrayArray645[0][arg6][arg5] = 8 * -k;
						break;
					}
					if(i <= 49)
					{
						Class78.aByteArrayArrayArray1676[arg4][arg6][arg5] = arg3.method661((byte)-108);
						RuntimeException_Sub1.aByteArrayArrayArray1812[arg4][arg6][arg5] = (byte)((i + -2) / 4);
						Class33_Sub9.aByteArrayArrayArray2180[arg4][arg6][arg5] = (byte)Class12.method110(3, -2 + (i + arg0));
					} else
					if(~i >= -82)
						Class35.aByteArrayArrayArray761[arg4][arg6][arg5] = (byte)(-49 + i);
					else
						Canvas_Sub1.aByteArrayArrayArray57[arg4][arg6][arg5] = (byte)(-81 + i);
				} while(true);
			} else
			{
				do
				{
					int j = arg3.method639((byte)123);
					if(j == 0)
						break;
					if(~j == -2)
					{
						arg3.method639((byte)123);
						break;
					}
					if(~j >= -50)
						arg3.method639((byte)123);
				} while(true);
			}
			anInt951++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nd.D(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
		}
	}

	public static void method907(Class33_Sub6_Sub7_Sub2 arg0, int arg1, Class33_Sub6_Sub7_Sub2 arg2)
	{
		try
		{
			if(arg1 < 74)
				anInt964 = -30;
			anInt953++;
			if(Class33_Sub6_Sub2.aBoolean2683)
			{
				Class77_Sub2.method1178(arg2, 23, arg0);
				return;
			}
			if(Class23.anInt485 == 0 || ~Class23.anInt485 == -6)
			{
				byte byte0 = 20;
				int i1 = -byte0 + 253;
				arg0.method459(Class26.aClass58_539, 382, 245 + -byte0, 0xffffff, -1);
				Class33_Sub6_Sub7.method415(230, i1, 304, 34, 0x8c1111);
				Class33_Sub6_Sub7.method415(231, i1 - -1, 302, 32, 0);
				Class33_Sub6_Sub7.method424(232, i1 + 2, 3 * Class45.anInt976, 30, 0x8c1111);
				Class33_Sub6_Sub7.method424(232 + Class45.anInt976 * 3, i1 - -2, 300 + -(3 * Class45.anInt976), 30, 0);
				arg0.method459(Class63.aClass58_1339, 382, 276 + -byte0, 0xffffff, -1);
			}
			if(~Class23.anInt485 == -21)
			{
				Class33_Sub18.aClass33_Sub6_Sub7_Sub4_2523.method502(382 - Class33_Sub18.aClass33_Sub6_Sub7_Sub4_2523.anInt3734 / 2, -(Class33_Sub18.aClass33_Sub6_Sub7_Sub4_2523.anInt3731 / 2) + 271);
				int i = 211;
				arg0.method459(Class63.aClass58_1343, 382, i, 0xffff00, 0);
				i += 15;
				arg0.method459(Class63.aClass58_1334, 382, i, 0xffff00, 0);
				i += 15;
				arg0.method459(Class63.aClass58_1356, 382, i, 0xffff00, 0);
				i += 15;
				i += 10;
				arg0.method464(Class35.method846((byte)-83, new Class58[] {
					Class77.aClass58_1644, Class33_Sub6_Sub7_Sub2.method451(Class63.aClass58_1350)
				}), 272, i, 0xffffff, 0);
				i += 15;
				arg0.method464(Class35.method846((byte)-83, new Class58[] {
					Class16.aClass58_312, Class63.aClass58_1341.method1033(false)
				}), 274, i, 0xffffff, 0);
				i += 15;
			}
			if(Class23.anInt485 == 10)
			{
				Class33_Sub18.aClass33_Sub6_Sub7_Sub4_2523.method502(202, 171);
				if(~Class31.anInt696 == -1)
				{
					int j = 251;
					arg0.method459(Class36.aClass58_792, 382, j, 0xffff00, 0);
					j += 30;
					char c = '\u012E';
					char c4 = '\u0123';
					Class43.aClass33_Sub6_Sub7_Sub4_931.method502(-73 + c, -20 + c4);
					arg0.method453(Class60.aClass58_1291, -73 + c, c4 + -20, 144, 40, 0xffffff, 0, 1, 1, 0);
					c = '\u01CE';
					Class43.aClass33_Sub6_Sub7_Sub4_931.method502(c - 73, -20 + c4);
					arg0.method453(Class33_Sub6_Sub11.aClass58_2927, c - 73, -20 + c4, 144, 40, 0xffffff, 0, 1, 1, 0);
				} else
				if(~Class31.anInt696 != -3)
				{
					if(~Class31.anInt696 == -4)
					{
						arg0.method459(Class46.aClass58_1018, 382, 211, 0xffff00, 0);
						int k = 236;
						arg0.method459(Class33_Sub15.aClass58_2347, 382, k, 0xffffff, 0);
						k += 15;
						char c1 = '\u017E';
						arg0.method459(Class33_Sub18.aClass58_2527, 382, k, 0xffffff, 0);
						char c5 = '\u0141';
						k += 15;
						arg0.method459(Class33_Sub10.aClass58_2226, 382, k, 0xffffff, 0);
						k += 15;
						arg0.method459(Class33_Sub10.aClass58_2228, 382, k, 0xffffff, 0);
						Class43.aClass33_Sub6_Sub7_Sub4_931.method502(c1 - 73, -20 + c5);
						k += 15;
						arg0.method459(Class82.aClass58_1787, c1, 5 + c5, 0xffffff, 0);
					}
				} else
				{
					int l = 211;
					arg0.method459(Class63.aClass58_1343, 382, l, 0xffff00, 0);
					char c6 = '\u0141';
					l += 15;
					char c2 = '\u012E';
					arg0.method459(Class63.aClass58_1334, 382, l, 0xffff00, 0);
					l += 15;
					arg0.method459(Class63.aClass58_1356, 382, l, 0xffff00, 0);
					l += 15;
					l += 10;
					arg0.method464(Class35.method846((byte)-83, new Class58[] {
						Class77.aClass58_1644, Class33_Sub6_Sub7_Sub2.method451(Class63.aClass58_1350), (~(Class33_Sub6_Sub6.anInt2785 % 40) > -21) & (~Class31.anInt701 == -1) ? Class73.aClass58_1546 : Class63.aClass58_1346
					}), 272, l, 0xffffff, 0);
					l += 15;
					arg0.method464(Class35.method846((byte)-83, new Class58[] {
						Class16.aClass58_312, Class63.aClass58_1341.method1033(false), (Class33_Sub6_Sub6.anInt2785 % 40 < 20) & (Class31.anInt701 == 1) ? Class73.aClass58_1546 : Class63.aClass58_1346
					}), 274, l, 0xffffff, 0);
					Class43.aClass33_Sub6_Sub7_Sub4_931.method502(c2 - 73, -20 + c6);
					arg0.method459(Class60.aClass58_1293, c2, c6 - -5, 0xffffff, 0);
					c2 = '\u01CE';
					l += 15;
					Class43.aClass33_Sub6_Sub7_Sub4_931.method502(-73 + c2, c6 - 20);
					arg0.method459(Class82.aClass58_1787, c2, c6 - -5, 0xffffff, 0);
				}
			}
			if(~Class14.anInt287 < -1)
			{
				Class33_Sub18.method812(Class14.anInt287, (byte)-115);
				Class14.anInt287 = 0;
			}
			Class33_Sub11.method621((byte)22);
			Class69.aClass33_Sub6_Sub7_Sub4Array1476[Class33_Sub15.aBoolean2375 ? 1 : 0].method502(725, 463);
			if(~Class23.anInt485 < -6 && Class33_Sub2.anInt2023 != 2 && ~Class75.anInt1617 == -1)
				if(Class60.aClass33_Sub6_Sub7_Sub4_1278 == null)
				{
					Class60.aClass33_Sub6_Sub7_Sub4_1278 = Class32.method258(Class63.aClass58_1346, -4236, Class34.aClass58_1840, Class33_Sub6_Sub16.aClass30_Sub1_3092);
				} else
				{
					char c3 = '\u01CF';
					byte byte3 = 35;
					byte byte2 = 100;
					byte byte1 = 5;
					Class60.aClass33_Sub6_Sub7_Sub4_1278.method502(byte1, c3);
					arg0.method459(Class35.method846((byte)-83, new Class58[] {
						Class33_Sub6_Sub13.aClass58_3001, Class3.aClass58_120, Class37.method859(15591, Class27.anInt560)
					}), byte2 / 2 + byte1, -2 + (c3 - -(byte3 / 2)), 0xffffff, 0);
					if(Class33_Sub6_Sub10.aClass36_2881 == null)
						arg2.method459(Class33_Sub11.aClass58_2260, byte2 / 2 + byte1, byte3 / 2 + (c3 - -12), 0xffffff, 0);
					else
						arg2.method459(Class33_Sub6_Sub4_Sub5_Sub1.aClass58_3768, byte1 + byte2 / 2, c3 + byte3 / 2 + 12, 0xffffff, 0);
				}
			try
			{
				java.awt.Graphics g = Class33_Sub6_Sub4_Sub1.aCanvas3367.getGraphics();
				Canvas_Sub1.aClass15_64.method131(0, 0, (byte)78, g);
				return;
			}
			catch(Exception _ex)
			{
				Class33_Sub6_Sub4_Sub1.aCanvas3367.repaint();
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nd.C(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static boolean method908(int arg0, int arg1, byte arg2)
	{
		try
		{
			anInt955++;
			if(arg2 != -112)
				aClass58_957 = null;
			return (arg1 >> arg0 + 1 & 1) != 0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nd.B(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method909(int arg0)
	{
		try
		{
			if(arg0 != 0xffffff)
				aClass16_954 = null;
			aClass58_958 = null;
			aClass58_959 = null;
			aClass16_954 = null;
			aClass58_957 = null;
			aClass58_956 = null;
			aClass16_960 = null;
			aClass58_963 = null;
			aClass58Array962 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nd.A(" + arg0 + ')');
		}
	}

	public static int anInt951;
	public static int anInt952;
	public static int anInt953;
	public static Class16 aClass16_954 = new Class16(64);
	public static int anInt955;
	public static Class58 aClass58_956 = Class33_Sub6_Sub11.method535(114, ": ");
	public static Class58 aClass58_957;
	public static Class58 aClass58_958;
	public static Class58 aClass58_959;
	public static Class16 aClass16_960 = new Class16(64);
	public static int anInt961;
	public static Class58 aClass58Array962[] = new Class58[20];
	public static Class58 aClass58_963;
	public static int anInt964 = 0;

	static 
	{
		aClass58_958 = Class33_Sub6_Sub11.method535(119, "FULL");
		aClass58_957 = aClass58_958;
		aClass58_959 = Class33_Sub6_Sub11.method535(109, "Sorry invited players only)3");
		aClass58_963 = aClass58_959;
	}
}
