// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub4.java


public abstract class Class33_Sub6_Sub4 extends Class33_Sub6
{

	public static void method315(int arg0)
	{
		try
		{
			aClass4_2739 = null;
			aClass58_2744 = null;
			if(arg0 != -1)
				method316((byte)-8, null);
			aClass58_2749 = null;
			aClass58_2738 = null;
			aClass58_2748 = null;
			aClass58_2750 = null;
			aClass58_2743 = null;
			aClass58_2746 = null;
			aClass58_2733 = null;
			aByteArrayArray2747 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ee.BA(" + arg0 + ')');
		}
	}

	public static void method316(byte arg0, Class33_Sub6_Sub4_Sub5 arg1)
	{
		try
		{
			if(Class33_Sub6_Sub6.anInt2785 == arg1.anInt3526 || arg1.anInt3567 == -1 || ~arg1.anInt3544 != -1 || 1 + arg1.anInt3565 > Class33_Sub21.method830(arg1.anInt3567, -99).anIntArray3031[arg1.anInt3502])
			{
				int i1 = 64 * arg1.anInt3559 + arg1.anInt3550 * 128;
				int l = arg1.anInt3559 * 64 + arg1.anInt3553 * 128;
				int i = arg1.anInt3526 + -arg1.anInt3563;
				int j1 = 128 * arg1.anInt3536 - -(arg1.anInt3559 * 64);
				int k = -arg1.anInt3563 + Class33_Sub6_Sub6.anInt2785;
				arg1.anInt3548 = (j1 * k + (-k + i) * l) / i;
				int k1 = 64 * arg1.anInt3559 + arg1.anInt3556 * 128;
				arg1.anInt3510 = (k * k1 + i1 * (i + -k)) / i;
			}
			anInt2731++;
			if(~arg1.anInt3571 == -1)
				arg1.anInt3519 = 1024;
			int j = -72 / ((72 - arg0) / 52);
			if(~arg1.anInt3571 == -2)
				arg1.anInt3519 = 1536;
			if(arg1.anInt3571 == 2)
				arg1.anInt3519 = 0;
			arg1.anInt3514 = 0;
			if(~arg1.anInt3571 == -4)
				arg1.anInt3519 = 512;
			arg1.anInt3549 = arg1.anInt3519;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ee.W(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7, int arg8)
	{
		anInt2741++;
		Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = method319(-6941);
		if(class33_sub6_sub4_sub3 != null)
		{
			anInt2737 = ((Class33_Sub6_Sub4) (class33_sub6_sub4_sub3)).anInt2737;
			class33_sub6_sub4_sub3.method317(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	public static Class58[] method318(int arg0, Class58 arg1[])
	{
		try
		{
			Class58 aclass58[] = new Class58[arg0];
			for(int i = 0; i < 5; i++)
			{
				aclass58[i] = Class35.method846((byte)-83, new Class58[] {
					Class37.method859(Class73.method1150(arg0, 15586), i), Class9.aClass58_175
				});
				if(arg1 != null && arg1[i] != null)
					aclass58[i] = Class35.method846((byte)-83, new Class58[] {
						aclass58[i], arg1[i]
					});
			}

			anInt2736++;
			return aclass58;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ee.AA(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub3 method319(int arg0)
	{
		try
		{
			anInt2732++;
			if(arg0 != -6941)
				aClass58_2746 = null;
			return null;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ee.B(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub4()
	{
		anInt2737 = 1000;
	}

	public static int anInt2731;
	public static int anInt2732;
	public static Class58 aClass58_2733;
	public static long aLong2734 = 0L;
	public static int anInt2735;
	public static int anInt2736;
	public int anInt2737;
	public static Class58 aClass58_2738 = Class33_Sub6_Sub11.method535(102, "Ung-Ultiges Anmelde)2Paket)3");
	public static Class4 aClass4_2739 = new Class4();
	public static int anInt2740;
	public static int anInt2741;
	public static int anInt2742 = 0;
	public static Class58 aClass58_2743 = Class33_Sub6_Sub11.method535(114, "Bitte starten Sie eine Mitgliedschaft");
	public static Class58 aClass58_2744;
	public static byte aByte2745 = 0;
	public static Class58 aClass58_2746 = Class33_Sub6_Sub11.method535(117, "Lade Ignorieren)2Liste)3)3)3");
	public static byte aByteArrayArray2747[][];
	public static Class58 aClass58_2748;
	public static Class58 aClass58_2749;
	public static Class58 aClass58_2750;

	static 
	{
		aClass58_2733 = Class33_Sub6_Sub11.method535(124, "Loading fonts )2 ");
		aClass58_2744 = aClass58_2733;
		aClass58_2748 = Class33_Sub6_Sub11.method535(125, "flash3:");
		aClass58_2749 = aClass58_2748;
		aClass58_2750 = aClass58_2748;
	}
}
