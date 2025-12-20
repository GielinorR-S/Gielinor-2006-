// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub21.java


public class Class33_Sub21 extends Class33
{

	public static void method829(int arg0, int arg1)
	{
		try
		{
			anInt2592++;
			if(!Class33_Sub6_Sub2.method305(arg0, 0x12bcb130))
				return;
			Class33_Sub15 aclass33_sub15[] = Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0];
			int i = -31 % ((5 - arg1) / 63);
			for(int j = 0; aclass33_sub15.length > j; j++)
			{
				Class33_Sub15 class33_sub15 = aclass33_sub15[j];
				if(class33_sub15 != null)
				{
					class33_sub15.anInt2393 = 0;
					class33_sub15.anInt2421 = 0;
				}
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "se.A(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static Class33_Sub6_Sub14 method830(int arg0, int arg1)
	{
		try
		{
			if(arg1 > -72)
				anInt2588 = -43;
			anInt2581++;
			Class33_Sub6_Sub14 class33_sub6_sub14 = (Class33_Sub6_Sub14)Class70.aClass16_1491.method144(0, arg0);
			if(class33_sub6_sub14 != null)
				return class33_sub6_sub14;
			byte abyte0[] = Class33_Sub6_Sub11.aClass30_2941.method238(false, arg0, 12);
			class33_sub6_sub14 = new Class33_Sub6_Sub14();
			if(abyte0 != null)
				class33_sub6_sub14.method571(true, new Class33_Sub11(abyte0));
			class33_sub6_sub14.method565((byte)110);
			Class70.aClass16_1491.method145(arg0, (byte)-128, class33_sub6_sub14);
			return class33_sub6_sub14;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "se.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static Class58 method831(int arg0, int arg1)
	{
		try
		{
			anInt2599++;
			int i = 41 % ((11 - arg0) / 37);
			if(~arg1 > 0xc4653600)
				return Class37.method859(15591, arg1);
			else
				return Class11.aClass58_201;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "se.B(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub21(int arg0, int arg1, int arg2)
	{
		anInt2600 = 0;
		anIntArray2591 = new int[5];
		aClass62Array2604 = new Class62[5];
		try
		{
			anInt2607 = arg2;
			anInt2613 = anInt2596 = arg0;
			anInt2605 = arg1;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "se.<init>(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method832(int arg0)
	{
		try
		{
			int j = 122 / ((arg0 - -14) / 63);
			for(int i = -1; i < Class31.anInt697; i++)
			{
				int k;
				if(~i == 0)
					k = 2047;
				else
					k = Class33_Sub3.anIntArray2050[i];
				Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[k];
				if(class33_sub6_sub4_sub5_sub1 != null && ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3551 > 0)
				{
					class33_sub6_sub4_sub5_sub1.anInt3551--;
					if(~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3551 == -1)
						class33_sub6_sub4_sub5_sub1.aClass58_3507 = null;
				}
			}

			for(int l = 0; Class33_Sub6_Sub1.anInt2659 > l; l++)
			{
				int i1 = Class80.anIntArray1730[l];
				Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[i1];
				if(class33_sub6_sub4_sub5_sub2 != null && ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3551 > 0)
				{
					class33_sub6_sub4_sub5_sub2.anInt3551--;
					if(~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3551 == -1)
						class33_sub6_sub4_sub5_sub2.aClass58_3507 = null;
				}
			}

			anInt2585++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "se.E(" + arg0 + ')');
		}
	}

	public static void method833(byte arg0)
	{
		try
		{
			if(arg0 != -115)
			{
				return;
			} else
			{
				aClass82_2586 = null;
				aBooleanArray2603 = null;
				aClass58_2587 = null;
				aClass58_2615 = null;
				aClass58_2583 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "se.C(" + arg0 + ')');
		}
	}

	public static int anInt2581;
	public static int anInt2582;
	public static Class58 aClass58_2583;
	public static int anInt2584;
	public static int anInt2585;
	public static Class82 aClass82_2586;
	public static Class58 aClass58_2587;
	public static int anInt2588 = 0;
	public Class55 aClass55_2589;
	public Class48 aClass48_2590;
	public int anIntArray2591[];
	public static int anInt2592;
	public Class23 aClass23_2593;
	public int anInt2594;
	public static int anInt2595 = 0;
	public int anInt2596;
	public Class33_Sub21 aClass33_Sub21_2597;
	public Class31 aClass31_2598;
	public static int anInt2599;
	public int anInt2600;
	public int anInt2601;
	public int anInt2602;
	public static boolean aBooleanArray2603[] = new boolean[112];
	public Class62 aClass62Array2604[];
	public int anInt2605;
	public boolean aBoolean2606;
	public int anInt2607;
	public Class66 aClass66_2608;
	public boolean aBoolean2609;
	public int anInt2610;
	public Class1 aClass1_2611;
	public boolean aBoolean2612;
	public int anInt2613;
	public int anInt2614;
	public static Class58 aClass58_2615 = Class33_Sub6_Sub11.method535(116, "mapfunction");
	public int anInt2616;
	public static int anInt2617 = 0;

	static 
	{
		aClass58_2587 = Class33_Sub6_Sub11.method535(109, "Enter name of player to delete from list");
		aClass58_2583 = aClass58_2587;
	}
}
