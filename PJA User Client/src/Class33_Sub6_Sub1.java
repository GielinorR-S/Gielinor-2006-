// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub1.java


public class Class33_Sub6_Sub1 extends Class33_Sub6
{

	public Class33_Sub6_Sub4_Sub7 method293(int arg0)
	{
		try
		{
			int i = 122 % ((arg0 - 39) / 41);
			anInt2663++;
			if(anIntArray2654 == null)
				return null;
			Class33_Sub6_Sub4_Sub7 aclass33_sub6_sub4_sub7[] = new Class33_Sub6_Sub4_Sub7[anIntArray2654.length];
			for(int j = 0; anIntArray2654.length > j; j++)
				aclass33_sub6_sub4_sub7[j] = Class33_Sub6_Sub4_Sub7.method398(Class41.aClass30_905, anIntArray2654[j], 0);

			Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7;
			if(aclass33_sub6_sub4_sub7.length != 1)
				class33_sub6_sub4_sub7 = new Class33_Sub6_Sub4_Sub7(aclass33_sub6_sub4_sub7, aclass33_sub6_sub4_sub7.length);
			else
				class33_sub6_sub4_sub7 = aclass33_sub6_sub4_sub7[0];
			for(int k = 0; k < 6; k++)
			{
				if(~aShortArray2678[k] == -1)
					break;
				class33_sub6_sub4_sub7.method389(aShortArray2678[k], aShortArray2670[k]);
			}

			return class33_sub6_sub4_sub7;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dc.A(" + arg0 + ')');
		}
	}

	public static void method294(int arg0)
	{
		try
		{
			if(Class33_Sub19.aClass81_2535 != null)
				synchronized(Class33_Sub19.aClass81_2535)
				{
					Class33_Sub19.aClass81_2535 = null;
				}
			if(arg0 != 0)
			{
				return;
			} else
			{
				anInt2656++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dc.G(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub7 method295(byte arg0)
	{
		try
		{
			anInt2665++;
			int i = 0;
			Class33_Sub6_Sub4_Sub7 aclass33_sub6_sub4_sub7[] = new Class33_Sub6_Sub4_Sub7[5];
			for(int j = 0; j < 5; j++)
				if(anIntArray2666[j] != -1)
					aclass33_sub6_sub4_sub7[i++] = Class33_Sub6_Sub4_Sub7.method398(Class41.aClass30_905, anIntArray2666[j], 0);

			Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = new Class33_Sub6_Sub4_Sub7(aclass33_sub6_sub4_sub7, i);
			if(arg0 != -75)
				method299(-102);
			for(int k = 0; k < 6; k++)
			{
				if(aShortArray2678[k] == 0)
					break;
				class33_sub6_sub4_sub7.method389(aShortArray2678[k], aShortArray2670[k]);
			}

			return class33_sub6_sub4_sub7;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dc.K(" + arg0 + ')');
		}
	}

	public static void method296(int arg0)
	{
		try
		{
			Class70.aClass16_1491.method147((byte)-54);
			int i = 102 % ((-33 - arg0) / 36);
			Class33_Sub6_Sub4_Sub6.aClass16_3574.method147((byte)-54);
			anInt2680++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dc.E(" + arg0 + ')');
		}
	}

	public boolean method297(int arg0)
	{
		try
		{
			anInt2661++;
			if(anIntArray2654 == null)
				return true;
			boolean flag = true;
			for(int i = arg0; ~anIntArray2654.length < ~i; i++)
				if(!Class41.aClass30_905.method225(anIntArray2654[i], -92, 0))
					flag = false;

			return flag;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dc.H(" + arg0 + ')');
		}
	}

	public boolean method298(byte arg0)
	{
		try
		{
			boolean flag = true;
			anInt2664++;
			if(arg0 < 120)
				return false;
			for(int i = 0; i < 5; i++)
				if(~anIntArray2666[i] != 0 && !Class41.aClass30_905.method225(anIntArray2666[i], -97, 0))
					flag = false;

			return flag;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dc.F(" + arg0 + ')');
		}
	}

	public static void method299(int arg0)
	{
		try
		{
			aClass58_2657 = null;
			anIntArray2669 = null;
			aClass58_2674 = null;
			aClass33_Sub6_Sub7_Sub2_2662 = null;
			aClass58_2653 = null;
			if(arg0 != -1)
				aClass33_Sub6_Sub7_Sub3Array2672 = null;
			aClass58_2667 = null;
			aBooleanArray2671 = null;
			aClass58_2676 = null;
			aClass33_Sub6_Sub7_Sub3Array2672 = null;
			aClass58_2679 = null;
			aClass33_Sub6_Sub7_Sub2_2677 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dc.B(" + arg0 + ')');
		}
	}

	public void method300(Class33_Sub11 arg0, byte arg1, int arg2)
	{
		anInt2675++;
		if(~arg2 == -2)
			anInt2673 = arg0.method639((byte)123);
		else
		if(~arg2 == -3)
		{
			int i = arg0.method639((byte)123);
			anIntArray2654 = new int[i];
			for(int j = 0; j < i; j++)
				anIntArray2654[j] = arg0.method666(111);

		} else
		if(~arg2 != -4)
		{
			if(~arg2 > -41 || arg2 >= 50)
			{
				if(~arg2 > -51 || ~arg2 <= -61)
				{
					if(arg2 >= 60 && ~arg2 > -71)
						anIntArray2666[-60 + arg2] = arg0.method666(99);
				} else
				{
					aShortArray2670[-50 + arg2] = (short)arg0.method666(76);
				}
			} else
			{
				aShortArray2678[-40 + arg2] = (short)arg0.method666(99);
			}
		} else
		{
			aBoolean2655 = true;
		}
		if(arg1 != 88)
			anIntArray2669 = null;
	}

	public static void method301(Class30 arg0, int arg1, Class30 arg2, boolean arg3)
	{
		try
		{
			Class33_Sub6_Sub12.aBoolean2980 = arg3;
			Class73.aClass30_1550 = arg2;
			if(arg1 != 2)
				method299(124);
			anInt2658++;
			Class37.aClass30_835 = arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dc.C(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ')');
		}
	}

	public void method302(boolean arg0, Class33_Sub11 arg1)
	{
		anInt2668++;
		do
		{
			int i = arg1.method639((byte)123);
			if(i == 0)
				break;
			method300(arg1, (byte)88, i);
		} while(true);
		if(!arg0)
			aShortArray2678 = null;
	}

	public static int method303(byte arg0, int arg1)
	{
		try
		{
			arg1 = ((arg1 & 0xaaaaaaab) >>> 0x75fcf681) + (0x55555555 & arg1);
			anInt2660++;
			if(arg0 != 86)
			{
				return -26;
			} else
			{
				arg1 = ((0xcccccccc & arg1) >>> 0x62d9ee02) + (0x33333333 & arg1);
				arg1 = arg1 + (arg1 >>> 0xc2fa9064) & 0xf0f0f0f;
				arg1 += arg1 >>> 0x6a4d7748;
				arg1 += arg1 >>> 0x4cb07c30;
				return 0xff & arg1;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "dc.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub6_Sub1()
	{
		aShortArray2670 = new short[6];
		aBoolean2655 = false;
		anInt2673 = -1;
		aShortArray2678 = new short[6];
	}

	public static Class58 aClass58_2653;
	public int anIntArray2654[];
	public boolean aBoolean2655;
	public static int anInt2656;
	public static Class58 aClass58_2657;
	public static int anInt2658;
	public static int anInt2659 = 0;
	public static int anInt2660;
	public static int anInt2661;
	public static Class33_Sub6_Sub7_Sub2 aClass33_Sub6_Sub7_Sub2_2662;
	public static int anInt2663;
	public static int anInt2664;
	public static int anInt2665;
	public int anIntArray2666[] = {
		-1, -1, -1, -1, -1
	};
	public static Class58 aClass58_2667;
	public static int anInt2668;
	public static int anIntArray2669[] = {
		-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 
		84, -1, 91, -1, -1, -1, 81, 82, 86, -1, 
		-1, -1, -1, -1, -1, -1, -1, 0, -1, -1, 
		-1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 
		99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 
		17, 18, 19, 20, 21, 22, 23, 24, -1, -1, 
		-1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 
		51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 
		41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 
		64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 
		224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 
		229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 
		9, 10, 11, 12, -1, -1, -1, 101, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, 100, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1
	};
	public short aShortArray2670[];
	public static boolean aBooleanArray2671[];
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3Array2672[];
	public int anInt2673;
	public static Class58 aClass58_2674;
	public static int anInt2675;
	public static Class58 aClass58_2676;
	public static Class33_Sub6_Sub7_Sub2 aClass33_Sub6_Sub7_Sub2_2677;
	public short aShortArray2678[];
	public static Class58 aClass58_2679;
	public static int anInt2680;

	static 
	{
		aClass58_2657 = Class33_Sub6_Sub11.method535(123, "Your profile will be transferred in:");
		aClass58_2653 = aClass58_2657;
		aClass58_2667 = Class33_Sub6_Sub11.method535(126, "Login server offline)3");
		aClass58_2674 = Class33_Sub6_Sub11.method535(99, "Add ignore");
		aClass58_2679 = aClass58_2674;
		aClass58_2676 = aClass58_2667;
	}
}
