// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub16.java

import java.io.*;

public class Class33_Sub16 extends Class33
{

	public static boolean method799(int arg0, int arg1)
	{
		try
		{
			anInt2477++;
			if(arg0 >= -111)
				method801(-30, (byte)-23);
			return (0x3f018a & arg1) >> 0x6e44f135 != 0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "oc.B(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method800(byte arg0)
	{
		anInt2479++;
		Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method682(-1);
		int j = -46 / ((72 - arg0) / 32);
		int i = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-88, 1);
		if(i == 0)
			return;
		int k = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-120, 2);
		if(~k == -1)
		{
			Class27.anIntArray559[Class33_Sub6_Sub13.anInt2992++] = 2047;
			return;
		}
		if(~k == -2)
		{
			int l = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-40, 3);
			Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.method359((byte)127, false, l);
			int k1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-92, 1);
			if(~k1 == -2)
				Class27.anIntArray559[Class33_Sub6_Sub13.anInt2992++] = 2047;
			return;
		}
		if(k == 2)
		{
			int i1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-59, 3);
			Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.method359((byte)127, true, i1);
			int l1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-96, 3);
			Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.method359((byte)-89, true, l1);
			int j2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-108, 1);
			if(j2 == 1)
				Class27.anIntArray559[Class33_Sub6_Sub13.anInt2992++] = 2047;
			return;
		}
		if(~k == -4)
		{
			int j1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-113, 1);
			Class77_Sub2.anInt2645 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-57, 2);
			int i2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-68, 7);
			int k2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-118, 7);
			int l2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-88, 1);
			if(l2 == 1)
				Class27.anIntArray559[Class33_Sub6_Sub13.anInt2992++] = 2047;
			Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.method358((byte)18, ~j1 == -2, i2, k2);
		}
	}

	public static Class58 method801(int arg0, byte arg1)
	{
		try
		{
			Class58 class58 = new Class58();
			if(arg1 < 122)
				method802((byte)-28);
			class58.aByteArray1894 = new byte[arg0];
			anInt2482++;
			class58.anInt1893 = 0;
			return class58;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "oc.E(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method802(byte arg0)
	{
		try
		{
			aClass58_2490 = null;
			if(arg0 > -101)
				aClass58_2489 = null;
			anIntArray2474 = null;
			aClass58_2495 = null;
			aClass82_2480 = null;
			aClass30_Sub1_2478 = null;
			aClass58_2492 = null;
			aClass58_2488 = null;
			aClass33_Sub6_Sub7_Sub3_2487 = null;
			aClass58_2489 = null;
			aClass58_2493 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "oc.D(" + arg0 + ')');
		}
	}

	public static Class58 method803(int arg0, Class33_Sub15 arg1, byte arg2)
	{
		try
		{
			anInt2475++;
			if(!Class44.method908(arg0, Class33_Sub6_Sub5.method403(arg1, -5447), (byte)-112) && arg1.anObjectArray2418 == null)
				return null;
			if(arg2 <= 2)
				method801(-71, (byte)114);
			if(arg1.aClass58Array2467 == null || arg1.aClass58Array2467.length <= arg0 || arg1.aClass58Array2467[arg0] == null || arg1.aClass58Array2467[arg0].method1026((byte)-120).method1035(27) == 0)
			{
				if(Class74.aBoolean1583)
					return Class35.method846((byte)-83, new Class58[] {
						Class27.aClass58_561, Class37.method859(15591, arg0)
					});
				else
					return null;
			} else
			{
				return arg1.aClass58Array2467[arg0];
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "oc.A(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ')');
		}
	}

	public static void method804(Class33_Sub15 arg0, int arg1)
	{
		anInt2481++;
		int i = arg0.anInt2446;
		if(~i <= -2 && ~i >= -101 || i >= 701 && i <= 800)
		{
			if(~Class30.anInt673 == -1)
			{
				if(~i == -2)
				{
					arg0.anInt2404 = 0;
					arg0.aClass58_2428 = Class38.aClass58_841;
					return;
				}
				if(i == 2)
				{
					arg0.aClass58_2428 = Class33_Sub6_Sub4_Sub1.aClass58_3365;
					arg0.anInt2404 = 0;
					return;
				}
			}
			if(~Class30.anInt673 == -2)
			{
				if(~i == -2)
				{
					arg0.anInt2404 = 0;
					arg0.aClass58_2428 = Class47.aClass58_1045;
					return;
				}
				if(i == 2)
				{
					arg0.aClass58_2428 = Class33_Sub6_Sub4_Sub1.aClass58_3349;
					arg0.anInt2404 = 0;
					return;
				}
				if(i == 3)
				{
					arg0.anInt2404 = 0;
					arg0.aClass58_2428 = Class23.aClass58_445;
					return;
				}
			}
			if(~i < -701)
				i -= 601;
			else
				i--;
			int j = Class33_Sub6_Sub12.anInt2979;
			if(~Class30.anInt673 != -3)
				j = 0;
			if(~j >= ~i)
			{
				arg0.anInt2404 = 0;
				arg0.aClass58_2428 = Class33_Sub13_Sub4.aClass58_3261;
				return;
			} else
			{
				arg0.aClass58_2428 = Class32.aClass58Array711[i];
				arg0.anInt2404 = 1;
				return;
			}
		}
		if(~i <= -102 && i <= 200 || ~i <= -802 && i <= 900)
		{
			if(~i < -801)
				i -= 701;
			else
				i -= 101;
			int k = Class33_Sub6_Sub12.anInt2979;
			if(~Class30.anInt673 != -3)
				k = 0;
			if(~i <= ~k)
			{
				arg0.anInt2404 = 0;
				arg0.aClass58_2428 = Class33_Sub13_Sub4.aClass58_3261;
				return;
			}
			if(~Class30_Sub1.anIntArray2013[i] != -1)
			{
				if(~Class30_Sub1.anIntArray2013[i] <= -5001)
				{
					if(Class30_Sub1.anIntArray2013[i] == Class27.anInt560)
						arg0.aClass58_2428 = Class35.method846((byte)-83, new Class58[] {
							Class33_Sub18.aClass58_2524, Class33_Sub6_Sub12.aClass58_2955, Class37.method859(15591, -5000 + Class30_Sub1.anIntArray2013[i])
						});
					else
						arg0.aClass58_2428 = Class35.method846((byte)-83, new Class58[] {
							Class33_Sub15.aClass58_2468, Class33_Sub6_Sub12.aClass58_2955, Class37.method859(15591, -5000 + Class30_Sub1.anIntArray2013[i])
						});
				} else
				if(~Class27.anInt560 != ~Class30_Sub1.anIntArray2013[i])
					arg0.aClass58_2428 = Class35.method846((byte)-83, new Class58[] {
						Class33_Sub15.aClass58_2468, Class33_Sub6_Sub13.aClass58_3001, Class37.method859(15591, Class30_Sub1.anIntArray2013[i])
					});
				else
					arg0.aClass58_2428 = Class35.method846((byte)-83, new Class58[] {
						Class33_Sub18.aClass58_2524, Class33_Sub6_Sub13.aClass58_3001, Class37.method859(15591, Class30_Sub1.anIntArray2013[i])
					});
			} else
			{
				arg0.aClass58_2428 = Class35.method846((byte)-83, new Class58[] {
					Class38.aClass58_845, Class33_Sub12.aClass58_2309
				});
			}
			arg0.anInt2404 = 1;
			return;
		}
		if(i == 203)
		{
			int l = Class33_Sub6_Sub12.anInt2979;
			if(Class30.anInt673 != 2)
				l = 0;
			arg0.anInt2433 = 15 * l - -20;
			if(~arg0.anInt2433 >= ~arg0.anInt2405)
				arg0.anInt2433 = arg0.anInt2405 + 1;
			return;
		}
		if(arg1 != 1)
			anIntArray2474 = null;
		if(i >= 401 && ~i >= -501)
		{
			if((i -= 401) == 0 && ~Class30.anInt673 == -1)
			{
				arg0.aClass58_2428 = Class24.aClass58_515;
				arg0.anInt2404 = 0;
				return;
			}
			if(i == 1 && ~Class30.anInt673 == -1)
			{
				arg0.aClass58_2428 = Class33_Sub6_Sub4_Sub1.aClass58_3365;
				arg0.anInt2404 = 0;
				return;
			}
			int i1 = Class65.anInt1388;
			if(~Class30.anInt673 == -1)
				i1 = 0;
			if(i >= i1)
			{
				arg0.anInt2404 = 0;
				arg0.aClass58_2428 = Class33_Sub13_Sub4.aClass58_3261;
				return;
			} else
			{
				arg0.aClass58_2428 = Class33_Sub19.method817(Class33_Sub6_Sub16.aLongArray3103[i], 126).method1065(-91);
				arg0.anInt2404 = 1;
				return;
			}
		}
		if(~i == -504)
		{
			arg0.anInt2433 = 20 + Class65.anInt1388 * 15;
			if(~arg0.anInt2433 >= ~arg0.anInt2405)
				arg0.anInt2433 = 1 + arg0.anInt2405;
			return;
		}
		if(~i == -325)
		{
			if(~Class13.anInt260 == 0)
			{
				Class13.anInt260 = arg0.anInt2456;
				Class33_Sub2.anInt2018 = arg0.anInt2383;
			}
			if(Class37.aClass46_809.aBoolean1019)
			{
				arg0.anInt2456 = Class13.anInt260;
				return;
			} else
			{
				arg0.anInt2456 = Class33_Sub2.anInt2018;
				return;
			}
		}
		if(i == 325)
		{
			if(~Class13.anInt260 == 0)
			{
				Class33_Sub2.anInt2018 = arg0.anInt2383;
				Class13.anInt260 = arg0.anInt2456;
			}
			if(Class37.aClass46_809.aBoolean1019)
			{
				arg0.anInt2456 = Class33_Sub2.anInt2018;
				return;
			} else
			{
				arg0.anInt2456 = Class13.anInt260;
				return;
			}
		}
		if(i == 327)
		{
			arg0.anInt2388 = 150;
			arg0.anInt2460 = 0x7ff & (int)(256D * Math.sin((double)Class33_Sub6_Sub6.anInt2785 / 40D));
			arg0.anInt2401 = 5;
			arg0.anInt2423 = 0;
			return;
		}
		if(~i == -329)
		{
			arg0.anInt2388 = 150;
			arg0.anInt2460 = 0x7ff & (int)(256D * Math.sin((double)Class33_Sub6_Sub6.anInt2785 / 40D));
			arg0.anInt2401 = 5;
			arg0.anInt2423 = 1;
			return;
		}
		if(~i == -601)
		{
			arg0.aClass58_2428 = Class35.method846((byte)-83, new Class58[] {
				Class33_Sub13_Sub4.aClass58_3294, Class21.aClass58_404
			});
			return;
		}
		if(i == 620)
		{
			if(~Class33_Sub19.anInt2547 > -2)
			{
				arg0.aClass58_2428 = Class33_Sub13_Sub4.aClass58_3261;
				return;
			}
			if(Class3.aBoolean117)
			{
				arg0.aClass58_2428 = Class55.aClass58_1164;
				arg0.anInt2410 = 0xff0000;
				return;
			}
			arg0.anInt2410 = 0xffffff;
			arg0.aClass58_2428 = Class13.aClass58_249;
		}
	}

	public static String method805(boolean arg0, Throwable arg1)
		throws IOException
	{
		try
		{
			anInt2485++;
			String s;
			if(!(arg1 instanceof RuntimeException_Sub1))
			{
				s = "";
			} else
			{
				RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1)arg1;
				arg1 = runtimeexception_sub1.aThrowable1807;
				s = runtimeexception_sub1.aString1817 + " | ";
			}
			StringWriter stringwriter = new StringWriter();
			if(!arg0)
				aClass58_2495 = null;
			PrintWriter printwriter = new PrintWriter(stringwriter);
			arg1.printStackTrace(printwriter);
			printwriter.close();
			String s1 = stringwriter.toString();
			BufferedReader bufferedreader = new BufferedReader(new StringReader(s1));
			String s2 = bufferedreader.readLine();
			do
			{
				String s3 = bufferedreader.readLine();
				if(s3 == null)
					break;
				int i = s3.indexOf('(');
				int j = s3.indexOf(')', i + 1);
				if(i >= 0 && j >= 0)
				{
					String s4 = s3.substring(1 + i, j);
					int k = s4.indexOf(".java:");
					if(~k <= -1)
					{
						s4 = s4.substring(0, k) + s4.substring(5 + k);
						s = s + s4 + ' ';
						continue;
					}
					s3 = s3.substring(0, i);
				}
				s3 = s3.trim();
				s3 = s3.substring(1 + s3.lastIndexOf(' '));
				s3 = s3.substring(1 + s3.lastIndexOf('\t'));
				s = s + s3 + ' ';
			} while(true);
			s = s + "| " + s2;
			return s;
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public Class33_Sub16(int arg0, byte arg1[])
	{
		try
		{
			anInt2476 = arg0;
			Class33_Sub11 class33_sub11 = new Class33_Sub11(arg1);
			anInt2484 = class33_sub11.method639((byte)123);
			anIntArrayArray2473 = new int[anInt2484][];
			anIntArray2483 = new int[anInt2484];
			for(int i = 0; ~i > ~anInt2484; i++)
				anIntArray2483[i] = class33_sub11.method639((byte)123);

			for(int j = 0; ~j > ~anInt2484; j++)
				anIntArrayArray2473[j] = new int[class33_sub11.method639((byte)123)];

			for(int k = 0; k < anInt2484; k++)
			{
				for(int l = 0; l < anIntArrayArray2473[k].length; l++)
					anIntArrayArray2473[k][l] = class33_sub11.method639((byte)123);

			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "oc.<init>(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public int anIntArrayArray2473[][];
	public static int anIntArray2474[];
	public static int anInt2475;
	public int anInt2476;
	public static int anInt2477;
	public static Class30_Sub1 aClass30_Sub1_2478;
	public static int anInt2479;
	public static Class82 aClass82_2480 = new Class82(512);
	public static int anInt2481;
	public static int anInt2482;
	public int anIntArray2483[];
	public int anInt2484;
	public static int anInt2485;
	public static int anInt2486;
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3_2487;
	public static Class58 aClass58_2488;
	public static Class58 aClass58_2489;
	public static Class58 aClass58_2490 = Class33_Sub6_Sub11.method535(125, "Nehmen");
	public static int anInt2491;
	public static Class58 aClass58_2492 = Class33_Sub6_Sub11.method535(103, "Texturen geladen)3");
	public static Class58 aClass58_2493;
	public static int anInt2494;
	public static Class58 aClass58_2495;

	static 
	{
		aClass58_2488 = Class33_Sub6_Sub11.method535(104, "Starting game engine)3)3)3");
		aClass58_2489 = aClass58_2488;
		aClass58_2493 = Class33_Sub6_Sub11.method535(124, "Please try again)3");
		aClass58_2495 = aClass58_2493;
	}
}
