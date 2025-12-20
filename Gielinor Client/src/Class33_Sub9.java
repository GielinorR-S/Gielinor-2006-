// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub9.java

import java.awt.Component;
import java.awt.FontMetrics;

public class Class33_Sub9 extends Class33
{

	public static void method608(Class70 arg0[], int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, 
			int arg8, byte arg9[])
	{
		try
		{
			anInt2182++;
			for(int i = 0; ~i > -9; i++)
			{
				for(int j = 0; j < 8; j++)
					if(i + arg3 > 0 && ~(arg3 + i) > -104 && ~(arg4 - -j) < -1 && ~(arg4 + j) > -104)
						arg0[arg5].anIntArrayArray1499[arg3 - -i][j + arg4] = Class12.method110(arg0[arg5].anIntArrayArray1499[arg3 - -i][j + arg4], 0xfeffffff);

			}

			if(!arg6)
				aClass58_2198 = null;
			Class33_Sub11 class33_sub11 = new Class33_Sub11(arg9);
			for(int k = 0; k < 4; k++)
			{
				for(int l = 0; ~l > -65; l++)
				{
					for(int i1 = 0; i1 < 64; i1++)
						if(~arg7 != ~k || l < arg1 || 8 + arg1 <= l || ~arg2 < ~i1 || 8 + arg2 <= i1)
							Class44.method906(0, (byte)126, 0, class33_sub11, 0, -1, -1, 0);
						else
							Class44.method906(arg8, (byte)125, 0, class33_sub11, arg5, arg4 - -Class33_Sub10.method613(7 & l, i1 & 7, arg6, arg8), arg3 + Class33.method269(arg8, i1 & 7, (byte)54, 7 & l), 0);

				}

			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "gb.B(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method609(int arg0, Class30 arg1, Component arg2)
	{
		try
		{
			anInt2194++;
			if(Class13.aBoolean247)
				return;
			Class36.aClass33_Sub6_Sub7_Sub4_797 = Class32.method258(Class33_Sub6_Sub4_Sub2.aClass58_3392, -4236, Class12.aClass58_219, arg1);
			Class63.aClass33_Sub6_Sub7_Sub4_1355 = Class32.method258(Class33_Sub6_Sub4_Sub2.aClass58_3392, -4236, Class11.aClass58_197, arg1);
			Class58.aClass33_Sub6_Sub7_Sub4_1920 = Class32.method258(Class33_Sub6_Sub4_Sub2.aClass58_3392, -4236, client.aClass58_1947, arg1);
			Class33_Sub11.aClass33_Sub6_Sub7_Sub4_2247 = Class32.method258(Class33_Sub6_Sub4_Sub2.aClass58_3392, -4236, Class33_Sub6_Sub2.aClass58_2687, arg1);
			Class46.aClass33_Sub6_Sub7_Sub4_988 = Class32.method258(Class33_Sub6_Sub4_Sub2.aClass58_3392, -4236, Class57.aClass58_1253, arg1);
			Class82.aClass33_Sub6_Sub7_Sub4_1802 = Class32.method258(Class33_Sub6_Sub4_Sub2.aClass58_3392, -4236, client.aClass58_1942, arg1);
			Class24.aClass15_509 = Class33_Sub6_Sub8.method512((byte)73, arg2, 479, 96);
			Class63.aClass33_Sub6_Sub7_Sub4_1355.method502(0, 0);
			Class15_Sub2.aClass15_1980 = Class33_Sub6_Sub8.method512((byte)-117, arg2, 172, 156);
			Class33_Sub6_Sub7.method417();
			Class58.aClass33_Sub6_Sub7_Sub4_1920.method502(0, 0);
			Class33_Sub6_Sub16.aClass15_3094 = Class33_Sub6_Sub8.method512((byte)39, arg2, 190, 261);
			Class36.aClass33_Sub6_Sub7_Sub4_797.method502(0, 0);
			Class17.aClass15_338 = Class33_Sub6_Sub8.method512((byte)-114, arg2, 512, 334);
			Class33_Sub6_Sub7.method417();
			Class36.aClass15_786 = Class33_Sub6_Sub8.method512((byte)36, arg2, 496, 50);
			Class33.aClass15_744 = Class33_Sub6_Sub8.method512((byte)76, arg2, 269, 37);
			Class33_Sub2.aClass15_2028 = Class33_Sub6_Sub8.method512((byte)-114, arg2, 249, 45);
			Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3 = Class33_Sub6_Sub14.method574(Class58.aClass58_1916, arg1, Class33_Sub6_Sub4_Sub2.aClass58_3392, (byte)123);
			Class33_Sub6_Sub17.aClass15_3124 = Class33_Sub6_Sub8.method512((byte)11, arg2, class33_sub6_sub7_sub3.anInt3723, class33_sub6_sub7_sub3.anInt3727);
			class33_sub6_sub7_sub3.method494(0, 0);
			class33_sub6_sub7_sub3 = Class33_Sub6_Sub14.method574(Class4.aClass58_143, arg1, Class33_Sub6_Sub4_Sub2.aClass58_3392, (byte)123);
			Class33_Sub6_Sub13.aClass15_2991 = Class33_Sub6_Sub8.method512((byte)-28, arg2, class33_sub6_sub7_sub3.anInt3723, class33_sub6_sub7_sub3.anInt3727);
			class33_sub6_sub7_sub3.method494(0, 0);
			class33_sub6_sub7_sub3 = Class33_Sub6_Sub14.method574(Class42.aClass58_921, arg1, Class33_Sub6_Sub4_Sub2.aClass58_3392, (byte)123);
			Class33_Sub11.aClass15_2241 = Class33_Sub6_Sub8.method512((byte)-117, arg2, class33_sub6_sub7_sub3.anInt3723, class33_sub6_sub7_sub3.anInt3727);
			class33_sub6_sub7_sub3.method494(0, 0);
			class33_sub6_sub7_sub3 = Class33_Sub6_Sub14.method574(Class33_Sub6_Sub4_Sub5_Sub1.aClass58_3763, arg1, Class33_Sub6_Sub4_Sub2.aClass58_3392, (byte)123);
			Class17.aClass15_346 = Class33_Sub6_Sub8.method512((byte)7, arg2, class33_sub6_sub7_sub3.anInt3723, class33_sub6_sub7_sub3.anInt3727);
			class33_sub6_sub7_sub3.method494(0, 0);
			class33_sub6_sub7_sub3 = Class33_Sub6_Sub14.method574(Canvas_Sub1.aClass58_51, arg1, Class33_Sub6_Sub4_Sub2.aClass58_3392, (byte)123);
			Class3.aClass15_116 = Class33_Sub6_Sub8.method512((byte)22, arg2, class33_sub6_sub7_sub3.anInt3723, class33_sub6_sub7_sub3.anInt3727);
			class33_sub6_sub7_sub3.method494(0, 0);
			class33_sub6_sub7_sub3 = Class33_Sub6_Sub14.method574(Class38.aClass58_846, arg1, Class33_Sub6_Sub4_Sub2.aClass58_3392, (byte)123);
			Canvas_Sub1.aClass15_66 = Class33_Sub6_Sub8.method512((byte)-124, arg2, class33_sub6_sub7_sub3.anInt3723, class33_sub6_sub7_sub3.anInt3727);
			class33_sub6_sub7_sub3.method494(0, 0);
			class33_sub6_sub7_sub3 = Class33_Sub6_Sub14.method574(Class29.aClass58_607, arg1, Class33_Sub6_Sub4_Sub2.aClass58_3392, (byte)123);
			Class41.aClass15_899 = Class33_Sub6_Sub8.method512((byte)70, arg2, class33_sub6_sub7_sub3.anInt3723, class33_sub6_sub7_sub3.anInt3727);
			class33_sub6_sub7_sub3.method494(0, 0);
			class33_sub6_sub7_sub3 = Class33_Sub6_Sub14.method574(Class33_Sub18.aClass58_2510, arg1, Class33_Sub6_Sub4_Sub2.aClass58_3392, (byte)123);
			Class33_Sub6_Sub12.aClass15_2959 = Class33_Sub6_Sub8.method512((byte)49, arg2, class33_sub6_sub7_sub3.anInt3723, class33_sub6_sub7_sub3.anInt3727);
			class33_sub6_sub7_sub3.method494(0, 0);
			class33_sub6_sub7_sub3 = Class33_Sub6_Sub14.method574(Class29.aClass58_611, arg1, Class33_Sub6_Sub4_Sub2.aClass58_3392, (byte)123);
			Class13.aClass15_252 = Class33_Sub6_Sub8.method512((byte)30, arg2, class33_sub6_sub7_sub3.anInt3723, class33_sub6_sub7_sub3.anInt3727);
			class33_sub6_sub7_sub3.method494(0, 0);
			Class33_Sub15.aClass33_Sub6_Sub7_Sub4_2355 = Class32.method258(Class33_Sub6_Sub4_Sub2.aClass58_3392, -4236, Class36.aClass58_789, arg1);
			Class82.aClass33_Sub6_Sub7_Sub4_1782 = Class32.method258(Class33_Sub6_Sub4_Sub2.aClass58_3392, -4236, aClass58_2183, arg1);
			Class15_Sub2.aClass33_Sub6_Sub7_Sub4_1984 = Class32.method258(Class33_Sub6_Sub4_Sub2.aClass58_3392, -4236, Class20.aClass58_380, arg1);
			Class37.aClass33_Sub6_Sub7_Sub4_812 = Class33_Sub15.aClass33_Sub6_Sub7_Sub4_2355.method503();
			Class37.aClass33_Sub6_Sub7_Sub4_812.method500();
			Class65.aClass33_Sub6_Sub7_Sub4_1399 = Class82.aClass33_Sub6_Sub7_Sub4_1782.method503();
			Class65.aClass33_Sub6_Sub7_Sub4_1399.method500();
			Class24.aClass33_Sub6_Sub7_Sub4_516 = Class33_Sub15.aClass33_Sub6_Sub7_Sub4_2355.method503();
			Class24.aClass33_Sub6_Sub7_Sub4_516.method504();
			Class59.aClass33_Sub6_Sub7_Sub4_1272 = Class82.aClass33_Sub6_Sub7_Sub4_1782.method503();
			Class59.aClass33_Sub6_Sub7_Sub4_1272.method504();
			Class30.aClass33_Sub6_Sub7_Sub4_658 = Class15_Sub2.aClass33_Sub6_Sub7_Sub4_1984.method503();
			if(arg0 > -39)
				method609(16, null, null);
			Class30.aClass33_Sub6_Sub7_Sub4_658.method504();
			Class69.aClass33_Sub6_Sub7_Sub4_1479 = Class33_Sub15.aClass33_Sub6_Sub7_Sub4_2355.method503();
			Class69.aClass33_Sub6_Sub7_Sub4_1479.method500();
			Class69.aClass33_Sub6_Sub7_Sub4_1479.method504();
			Class77_Sub2.aClass33_Sub6_Sub7_Sub4_2623 = Class82.aClass33_Sub6_Sub7_Sub4_1782.method503();
			Class77_Sub2.aClass33_Sub6_Sub7_Sub4_2623.method500();
			Class77_Sub2.aClass33_Sub6_Sub7_Sub4_2623.method504();
			Class33_Sub6_Sub15.aClass33_Sub6_Sub7_Sub4Array3052 = Class33_Sub6_Sub10.method526(true, arg1, Class12.aClass58_236, Class33_Sub6_Sub4_Sub2.aClass58_3392);
			Class15_Sub2.anIntArray1982 = new int[33];
			Class33_Sub2.anIntArray2019 = new int[151];
			Class65.anIntArray1384 = new int[33];
			Class33_Sub6_Sub5.anIntArray2778 = new int[151];
			for(int i = 0; i < 33; i++)
			{
				int j = 999;
				int l = 0;
				for(int j1 = 0; ~j1 > -35; j1++)
				{
					if(~Class58.aClass33_Sub6_Sub7_Sub4_1920.aByteArray3732[j1 - -(i * Class58.aClass33_Sub6_Sub7_Sub4_1920.anInt3734)] == -1)
					{
						if(j == 999)
							j = j1;
						continue;
					}
					if(j == 999)
						continue;
					l = j1;
					break;
				}

				Class15_Sub2.anIntArray1982[i] = j;
				Class65.anIntArray1384[i] = l + -j;
			}

			for(int k = 5; ~k > -157; k++)
			{
				int i1 = 999;
				int k1 = 0;
				for(int l1 = 25; l1 < 172; l1++)
				{
					if(Class58.aClass33_Sub6_Sub7_Sub4_1920.aByteArray3732[k * Class58.aClass33_Sub6_Sub7_Sub4_1920.anInt3734 + l1] == 0 && (~l1 < -35 || ~k < -35))
					{
						if(i1 == 999)
							i1 = l1;
						continue;
					}
					if(i1 == 999)
						continue;
					k1 = l1;
					break;
				}

				Class33_Sub2.anIntArray2019[k - 5] = i1 + -25;
				Class33_Sub6_Sub5.anIntArray2778[-5 + k] = -i1 + k1;
			}

			Class13.aBoolean247 = true;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "gb.C(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method610(int arg0)
	{
		try
		{
			anInt2185++;
			int i = -21 / ((arg0 - -44) / 59);
			Class58.aClass16_1900.method147((byte)-54);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "gb.D(" + arg0 + ')');
		}
	}

	public Class33_Sub9()
	{
	}

	public static void method611(int arg0)
	{
		try
		{
			anIntArrayArray2184 = null;
			aByteArrayArrayArray2180 = null;
			aClass16_2196 = null;
			aClass58_2198 = null;
			aClass58_2197 = null;
			aClass58_2191 = null;
			aClass58_2183 = null;
			aClass58_2192 = null;
			if(arg0 != -28853)
				anIntArrayArray2184 = null;
			aClass58_2187 = null;
			aClass58_2179 = null;
			aClass58_2199 = null;
			aFontMetrics2177 = null;
			aClass58_2193 = null;
			aClass58_2178 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "gb.A(" + arg0 + ')');
		}
	}

	public static FontMetrics aFontMetrics2177;
	public static Class58 aClass58_2178;
	public static Class58 aClass58_2179 = Class33_Sub6_Sub11.method535(100, "(U0a )2 via: ");
	public static byte aByteArrayArrayArray2180[][][];
	public static int anInt2181 = 0;
	public static int anInt2182;
	public static Class58 aClass58_2183 = Class33_Sub6_Sub11.method535(114, "redstone2");
	public static int anIntArrayArray2184[][] = new int[104][104];
	public static int anInt2185;
	public static int anInt2186 = 0;
	public static Class58 aClass58_2187;
	public byte aByte2188;
	public int anInt2189;
	public Class58 aClass58_2190;
	public static Class58 aClass58_2191;
	public static Class58 aClass58_2192;
	public static Class58 aClass58_2193;
	public static int anInt2194;
	public static int anInt2195 = 0;
	public static Class16 aClass16_2196 = new Class16(50);
	public static Class58 aClass58_2197;
	public static Class58 aClass58_2198;
	public static Class58 aClass58_2199;

	static 
	{
		aClass58_2193 = Class33_Sub6_Sub11.method535(109, "Loaded update list");
		aClass58_2192 = Class33_Sub6_Sub11.method535(125, "Members object");
		aClass58_2187 = aClass58_2193;
		aClass58_2191 = Class33_Sub6_Sub11.method535(125, "Account locked as we suspect it has been stolen)3");
		aClass58_2197 = aClass58_2192;
		aClass58_2178 = aClass58_2191;
		aClass58_2198 = Class33_Sub6_Sub11.method535(101, " is already on your friend list");
		aClass58_2199 = aClass58_2198;
	}
}
