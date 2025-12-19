// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class22.java

import java.awt.Component;

public class Class22
{

	public static void method175(boolean arg0)
	{
		anInt408++;
		Class69.aClass16_1472.method147((byte)-54);
		if(arg0)
			method181(-72, -44, 39);
	}

	public static void method176(boolean arg0)
	{
		aClass72_416 = null;
		aClass58_414 = null;
		aClass58_417 = null;
		aClass58_418 = null;
		aClass16_410 = null;
		aClass30_413 = null;
		aClass58_420 = null;
		if(!arg0)
			aClass58_418 = null;
	}

	public static void method177(int arg0, Component arg1)
	{
		try
		{
			anInt421++;
			arg1.removeMouseListener(Class33_Sub6_Sub4_Sub2.aClass24_3388);
			arg1.removeMouseMotionListener(Class33_Sub6_Sub4_Sub2.aClass24_3388);
			arg1.removeFocusListener(Class33_Sub6_Sub4_Sub2.aClass24_3388);
			Class33_Sub3.anInt2052 = arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ga.B(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method178(boolean arg0)
	{
		try
		{
			synchronized(Class33_Sub6_Sub10.anObject2864)
			{
				if(!arg0)
					method179((byte)125, 25);
				if(~Class33_Sub19.anInt2542 != -1)
				{
					Class33_Sub19.anInt2542 = 1;
					try
					{
						Class33_Sub6_Sub10.anObject2864.wait();
					}
					catch(InterruptedException _ex) { }
				}
			}
			anInt409++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ga.A(" + arg0 + ')');
		}
	}

	public static int method179(byte arg0, int arg1)
	{
		try
		{
			anInt412++;
			Class33_Sub6_Sub5 class33_sub6_sub5 = Class30_Sub1.method249(arg1, (byte)-30);
			if(arg0 < 12)
			{
				return -32;
			} else
			{
				int k = class33_sub6_sub5.anInt2751;
				int j = class33_sub6_sub5.anInt2775;
				int i = class33_sub6_sub5.anInt2756;
				int l = Class33_Sub6_Sub4_Sub5.anIntArray3555[k - j];
				return l & Class33_Sub5.anIntArray2120[i] >> j;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ga.E(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7)
	{
		try
		{
			anInt415++;
			if(!Class33_Sub6_Sub2.method305(arg4, arg7 + 0x12bcb130))
			{
				return;
			} else
			{
				Class71.method1134(arg3, arg7, -1, arg2, arg1, arg5, (byte)-62, arg0, arg6, Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg4], 0);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ga.D(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
		}
	}

	public static void method181(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt407++;
			int ai[] = new int[4];
			ai[0] = arg0;
			int ai1[] = new int[4];
			if(arg1 != 20041)
				aBoolean419 = true;
			int i = 1;
			ai1[0] = arg2;
			for(int j = 0; ~j > -5; j++)
				if(Class40.anIntArray893[j] != arg0)
				{
					ai[i] = Class40.anIntArray893[j];
					ai1[i] = Class81.anIntArray1742[j];
					i++;
				}

			Class81.anIntArray1742 = ai1;
			Class40.anIntArray893 = ai;
			Class33_Sub6_Sub4_Sub6.method374(0, (byte)123, Class40.anIntArray893, Class81.anIntArray1742, -1 + Class33_Sub3.aClass17Array2060.length, Class33_Sub3.aClass17Array2060);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ga.F(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static int anInt407;
	public static int anInt408;
	public static int anInt409;
	public static Class16 aClass16_410 = new Class16(30);
	public static int anInt411;
	public static int anInt412;
	public static Class30 aClass30_413;
	public static Class58 aClass58_414 = Class33_Sub6_Sub11.method535(112, "Passwort: ");
	public static int anInt415;
	public static Class72 aClass72_416;
	public static Class58 aClass58_417 = Class33_Sub6_Sub11.method535(114, "(U");
	public static Class58 aClass58_418 = Class33_Sub6_Sub11.method535(105, "Bitte benutzen Sie eine andere Welt)3");
	public static boolean aBoolean419;
	public static Class58 aClass58_420 = Class33_Sub6_Sub11.method535(120, "0(U");
	public static int anInt421;
	public static int anInt422 = 0;

}
