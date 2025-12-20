// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub4_Sub1.java

import java.awt.Canvas;
import java.io.PrintStream;

public class Class33_Sub6_Sub4_Sub1 extends Class33_Sub6_Sub4
{

	public static void method320(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		try
		{
			int i = 98 / ((arg0 - 71) / 44);
			for(Class33_Sub4 class33_sub4 = (Class33_Sub4)Class31.aClass4_684.method68(18823); class33_sub4 != null; class33_sub4 = (Class33_Sub4)Class31.aClass4_684.method66((byte)-127))
				if(class33_sub4.anInt2085 != -1 || class33_sub4.anIntArray2087 != null)
				{
					int j = 0;
					if(arg2 > class33_sub4.anInt2062)
						j += arg2 - class33_sub4.anInt2062;
					else
					if(~arg2 > ~class33_sub4.anInt2071)
						j += class33_sub4.anInt2071 + -arg2;
					if(class33_sub4.anInt2084 < arg1)
						j += -class33_sub4.anInt2084 + arg1;
					else
					if(~arg1 > ~class33_sub4.anInt2063)
						j += class33_sub4.anInt2063 - arg1;
					if(j - 64 > class33_sub4.anInt2078 || ~Class14.anInt272 == -1 || ~arg4 != ~class33_sub4.anInt2076)
					{
						if(class33_sub4.aClass33_Sub13_Sub1_2074 != null)
						{
							Class78.aClass33_Sub13_Sub2_1670.method738(class33_sub4.aClass33_Sub13_Sub1_2074);
							class33_sub4.aClass33_Sub13_Sub1_2074 = null;
						}
						if(class33_sub4.aClass33_Sub13_Sub1_2064 != null)
						{
							Class78.aClass33_Sub13_Sub2_1670.method738(class33_sub4.aClass33_Sub13_Sub1_2064);
							class33_sub4.aClass33_Sub13_Sub1_2064 = null;
						}
					} else
					{
						if((j -= 64) < 0)
							j = 0;
						int k = (Class14.anInt272 * (class33_sub4.anInt2078 + -j)) / class33_sub4.anInt2078;
						if(class33_sub4.aClass33_Sub13_Sub1_2074 != null)
							class33_sub4.aClass33_Sub13_Sub1_2074.method705(k);
						else
						if(~class33_sub4.anInt2085 <= -1)
						{
							Class61 class61 = Class61.method1077(Class16.aClass30_Sub1_321, class33_sub4.anInt2085, 0);
							if(class61 != null)
							{
								Class33_Sub8_Sub1 class33_sub8_sub1 = class61.method1075().method607(Class33_Sub11_Sub1.aClass54_3215);
								Class33_Sub13_Sub1 class33_sub13_sub1 = Class33_Sub13_Sub1.method703(class33_sub8_sub1, 100, k);
								class33_sub13_sub1.method696(-1);
								Class78.aClass33_Sub13_Sub2_1670.method742(class33_sub13_sub1);
								class33_sub4.aClass33_Sub13_Sub1_2074 = class33_sub13_sub1;
							}
						}
						if(class33_sub4.aClass33_Sub13_Sub1_2064 == null)
						{
							if(class33_sub4.anIntArray2087 != null && ~(class33_sub4.anInt2090 -= arg3) >= -1)
							{
								int l = (int)((double)class33_sub4.anIntArray2087.length * Math.random());
								Class61 class61_1 = Class61.method1077(Class16.aClass30_Sub1_321, class33_sub4.anIntArray2087[l], 0);
								if(class61_1 != null)
								{
									Class33_Sub8_Sub1 class33_sub8_sub1_1 = class61_1.method1075().method607(Class33_Sub11_Sub1.aClass54_3215);
									Class33_Sub13_Sub1 class33_sub13_sub1_1 = Class33_Sub13_Sub1.method703(class33_sub8_sub1_1, 100, k);
									class33_sub13_sub1_1.method696(0);
									Class78.aClass33_Sub13_Sub2_1670.method742(class33_sub13_sub1_1);
									class33_sub4.aClass33_Sub13_Sub1_2064 = class33_sub13_sub1_1;
									class33_sub4.anInt2090 = (int)(Math.random() * (double)(-class33_sub4.anInt2092 + class33_sub4.anInt2075)) + class33_sub4.anInt2092;
								}
							}
						} else
						{
							class33_sub4.aClass33_Sub13_Sub1_2064.method705(k);
							if(!class33_sub4.aClass33_Sub13_Sub1_2064.method261(85))
								class33_sub4.aClass33_Sub13_Sub1_2064 = null;
						}
					}
				}

			anInt3339++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ab.A(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub3 method319(int arg0)
	{
		try
		{
			anInt3358++;
			if(arg0 != -6941)
				method320(36, 90, 39, 25, -41);
			return Class14.method127(anInt3363, (byte)90).method531(arg0 + -2629, anInt3364);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ab.B(" + arg0 + ')');
		}
	}

	public static void method321(int arg0)
	{
		try
		{
			aClass58_3350 = null;
			aClass58_3359 = null;
			anIntArray3357 = null;
			aClass58_3366 = null;
			aClass58_3343 = null;
			aClass58_3365 = null;
			aCanvas3367 = null;
			aByteArrayArray3361 = null;
			aClass58_3356 = null;
			aClass58_3337 = null;
			aClass58_3348 = null;
			aClass33_Sub11Array3346 = null;
			aClass58_3349 = null;
			aClass58_3360 = null;
			aClass58_3354 = null;
			aClass58_3355 = null;
			aClass58_3341 = null;
			aClass58_3362 = null;
			aClass58_3340 = null;
			if(arg0 >= -6)
				method321(10);
			aClass58_3344 = null;
			aClass58_3353 = null;
			aClass30_3342 = null;
			aClass58_3351 = null;
			aClass58_3347 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ab.D(" + arg0 + ')');
		}
	}

	public static void method322(boolean arg0)
	{
		try
		{
			if(arg0)
				aClass58_3347 = null;
			anInt3352++;
			System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
			System.exit(1);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ab.C(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub1()
	{
	}

	public static Class58 aClass58_3337;
	public static int anInt3338;
	public static int anInt3339;
	public static Class58 aClass58_3340;
	public static Class58 aClass58_3341;
	public static Class30 aClass30_3342;
	public static Class58 aClass58_3343;
	public static Class58 aClass58_3344;
	public static boolean aBoolean3345 = false;
	public static Class33_Sub11 aClass33_Sub11Array3346[] = new Class33_Sub11[2048];
	public static Class58 aClass58_3347;
	public static Class58 aClass58_3348;
	public static Class58 aClass58_3349;
	public static Class58 aClass58_3350;
	public static Class58 aClass58_3351;
	public static int anInt3352;
	public static Class58 aClass58_3353;
	public static Class58 aClass58_3354 = Class33_Sub6_Sub11.method535(107, "Wen m-Ochten Sie entfernen?");
	public static Class58 aClass58_3355;
	public static Class58 aClass58_3356;
	public static int anIntArray3357[] = new int[500];
	public static int anInt3358;
	public static Class58 aClass58_3359;
	public static Class58 aClass58_3360;
	public static byte aByteArrayArray3361[][];
	public static Class58 aClass58_3362;
	public int anInt3363;
	public int anInt3364;
	public static Class58 aClass58_3365;
	public static Class58 aClass58_3366;
	public static Canvas aCanvas3367;

	static 
	{
		aClass58_3348 = Class33_Sub6_Sub11.method535(120, "Private chat");
		aClass58_3356 = Class33_Sub6_Sub11.method535(121, "Please try using a different world)3");
		aClass58_3344 = Class33_Sub6_Sub11.method535(111, "Please enter your password)3");
		aClass58_3351 = aClass58_3356;
		aClass58_3359 = aClass58_3344;
		aClass58_3353 = Class33_Sub6_Sub11.method535(98, "Please wait)3)3)3");
		aClass58_3350 = aClass58_3356;
		aClass58_3343 = aClass58_3356;
		aClass58_3355 = aClass58_3356;
		aClass58_3337 = aClass58_3356;
		aClass58_3349 = aClass58_3353;
		aClass58_3341 = aClass58_3356;
		aClass58_3366 = Class33_Sub6_Sub11.method535(103, "Enter name of player to add to list");
		aClass58_3347 = aClass58_3348;
		aClass58_3365 = aClass58_3353;
		aClass58_3360 = Class33_Sub6_Sub11.method535(108, "Location");
		aClass58_3340 = aClass58_3360;
		aClass58_3362 = aClass58_3366;
	}
}
