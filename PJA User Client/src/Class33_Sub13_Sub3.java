// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub13_Sub3.java


public class Class33_Sub13_Sub3 extends Class33_Sub13
{

	public int method695()
	{
		try
		{
			anInt3250++;
			return 0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ge.P(" + ')');
		}
	}

	public static Class33_Sub6_Sub7_Sub4 method743(boolean arg0)
	{
		try
		{
			anInt3251++;
			Class33_Sub6_Sub7_Sub4 class33_sub6_sub7_sub4 = new Class33_Sub6_Sub7_Sub4();
			class33_sub6_sub7_sub4.aByteArray3732 = Class33_Sub6_Sub4_Sub1.aByteArrayArray3361[0];
			class33_sub6_sub7_sub4.anInt3731 = Class33_Sub6_Sub5.anIntArray2769[0];
			if(!arg0)
				method744(50, null, null, null);
			class33_sub6_sub7_sub4.anInt3735 = Class46.anInt1000;
			class33_sub6_sub7_sub4.anInt3729 = Class68.anInt1444;
			class33_sub6_sub7_sub4.anInt3734 = Class33_Sub6_Sub4_Sub5_Sub1.anIntArray3753[0];
			class33_sub6_sub7_sub4.anIntArray3730 = Class75.anIntArray1614;
			class33_sub6_sub7_sub4.anInt3736 = Class21.anIntArray391[0];
			class33_sub6_sub7_sub4.anInt3733 = Class33_Sub19.anIntArray2553[0];
			Class35.method841(-21572);
			return class33_sub6_sub7_sub4;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ge.B(" + arg0 + ')');
		}
	}

	public static Class33_Sub6_Sub7_Sub3[] method744(int arg0, Class58 arg1, Class58 arg2, Class30 arg3)
	{
		try
		{
			if(arg0 >= -44)
				method743(true);
			anInt3243++;
			int i = arg3.method227((byte)28, arg2);
			int j = arg3.method229(true, i, arg1);
			return Class78.method1182(j, arg3, i, -17461);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ge.C(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public void method745(int arg0, Class33_Sub7 arg1, int arg2, int arg3, int arg4, int arg5[])
	{
		try
		{
			anInt3237++;
			if((4 & aClass33_Sub13_Sub4_3238.anIntArray3325[arg1.anInt2157]) != 0 && ~arg1.anInt2139 > -1)
			{
				int i = aClass33_Sub13_Sub4_3238.anIntArray3274[arg1.anInt2157] / Class39.anInt863;
				do
				{
					int j = (0xfffff + (i + -arg1.anInt2172)) / i;
					if(~arg0 > ~j)
						break;
					arg0 -= j;
					int l = 0x40000 / i;
					arg1.aClass33_Sub13_Sub1_2142.method689(arg5, arg3, j);
					Class33_Sub13_Sub1 class33_sub13_sub1 = arg1.aClass33_Sub13_Sub1_2142;
					arg3 += j;
					arg1.anInt2172 += 0xfff00000 + j * i;
					int k = Class39.anInt863 / 100;
					if(~k < ~l)
						k = l;
					if(aClass33_Sub13_Sub4_3238.anIntArray3285[arg1.anInt2157] != 0)
					{
						arg1.aClass33_Sub13_Sub1_2142 = Class33_Sub13_Sub1.method718(arg1.aClass33_Sub8_Sub1_2141, class33_sub13_sub1.method717(), 0, class33_sub13_sub1.method700());
						aClass33_Sub13_Sub4_3238.method775(arg1, ~arg1.aClass33_Sub10_2155.aShortArray2212[arg1.anInt2154] > -1, true);
						arg1.aClass33_Sub13_Sub1_2142.method728(k, class33_sub13_sub1.method726());
					} else
					{
						arg1.aClass33_Sub13_Sub1_2142 = Class33_Sub13_Sub1.method718(arg1.aClass33_Sub8_Sub1_2141, class33_sub13_sub1.method717(), class33_sub13_sub1.method726(), class33_sub13_sub1.method700());
					}
					if(~arg1.aClass33_Sub10_2155.aShortArray2212[arg1.anInt2154] > -1)
						arg1.aClass33_Sub13_Sub1_2142.method696(-1);
					class33_sub13_sub1.method709(k);
					class33_sub13_sub1.method689(arg5, arg3, arg2 - arg3);
					if(class33_sub13_sub1.method714())
						aClass33_Sub13_Sub2_3254.method742(class33_sub13_sub1);
				} while(true);
				arg1.anInt2172 += arg0 * i;
			}
			arg1.aClass33_Sub13_Sub1_2142.method689(arg5, arg3, arg0);
			if(arg4 != 0xfffff)
			{
				method691();
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ge.E(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? "null" : "{...}") + ')');
		}
	}

	public Class33_Sub13 method692()
	{
		try
		{
			anInt3239++;
			Class33_Sub7 class33_sub7;
			do
			{
				class33_sub7 = (Class33_Sub7)aClass4_3252.method66((byte)-126);
				if(class33_sub7 == null)
					return null;
			} while(class33_sub7.aClass33_Sub13_Sub1_2142 == null);
			return class33_sub7.aClass33_Sub13_Sub1_2142;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ge.DA(" + ')');
		}
	}

	public void method694(int arg0)
	{
		try
		{
			anInt3248++;
			aClass33_Sub13_Sub2_3254.method694(arg0);
label0:
			for(Class33_Sub7 class33_sub7 = (Class33_Sub7)aClass4_3252.method68(18823); class33_sub7 != null; class33_sub7 = (Class33_Sub7)aClass4_3252.method66((byte)-127))
			{
				if(aClass33_Sub13_Sub4_3238.method772((byte)88, class33_sub7))
					continue;
				int i;
				for(i = arg0; i > class33_sub7.anInt2159;)
				{
					method747(class33_sub7, class33_sub7.anInt2159, -110);
					i -= class33_sub7.anInt2159;
					if(aClass33_Sub13_Sub4_3238.method753(i, null, class33_sub7, (byte)-19, 0))
						continue label0;
				}

				method747(class33_sub7, i, -122);
				class33_sub7.anInt2159 -= i;
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ge.H(" + arg0 + ')');
		}
	}

	public static void method746(int arg0)
	{
		aClass30_3240 = null;
		aClass58_3241 = null;
		aClass58_3249 = null;
		aClass58_3247 = null;
		if(arg0 != -1)
			method746(91);
	}

	public void method747(Class33_Sub7 arg0, int arg1, int arg2)
	{
		if((aClass33_Sub13_Sub4_3238.anIntArray3325[arg0.anInt2157] & 4) != 0 && arg0.anInt2139 < 0)
		{
			int i = aClass33_Sub13_Sub4_3238.anIntArray3274[arg0.anInt2157] / Class39.anInt863;
			int j = (-arg0.anInt2172 + (i + 0xfffff)) / i;
			arg0.anInt2172 = 0xfffff & arg0.anInt2172 + i * arg1;
			if(~arg1 <= ~j)
			{
				if(~aClass33_Sub13_Sub4_3238.anIntArray3285[arg0.anInt2157] != -1)
				{
					arg0.aClass33_Sub13_Sub1_2142 = Class33_Sub13_Sub1.method718(arg0.aClass33_Sub8_Sub1_2141, arg0.aClass33_Sub13_Sub1_2142.method717(), 0, arg0.aClass33_Sub13_Sub1_2142.method700());
					aClass33_Sub13_Sub4_3238.method775(arg0, ~arg0.aClass33_Sub10_2155.aShortArray2212[arg0.anInt2154] > -1, true);
				} else
				{
					arg0.aClass33_Sub13_Sub1_2142 = Class33_Sub13_Sub1.method718(arg0.aClass33_Sub8_Sub1_2141, arg0.aClass33_Sub13_Sub1_2142.method717(), arg0.aClass33_Sub13_Sub1_2142.method726(), arg0.aClass33_Sub13_Sub1_2142.method700());
				}
				if(arg0.aClass33_Sub10_2155.aShortArray2212[arg0.anInt2154] < 0)
					arg0.aClass33_Sub13_Sub1_2142.method696(-1);
				arg1 = arg0.anInt2172 / i;
			}
		}
		anInt3236++;
		arg0.aClass33_Sub13_Sub1_2142.method694(arg1);
		if(arg2 >= -104)
			method692();
	}

	public Class33_Sub13 method691()
	{
		try
		{
			anInt3242++;
			Class33_Sub7 class33_sub7 = (Class33_Sub7)aClass4_3252.method68(18823);
			if(class33_sub7 == null)
				return null;
			if(class33_sub7.aClass33_Sub13_Sub1_2142 != null)
				return class33_sub7.aClass33_Sub13_Sub1_2142;
			else
				return method692();
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ge.NA(" + ')');
		}
	}

	public void method689(int arg0[], int arg1, int arg2)
	{
		try
		{
			aClass33_Sub13_Sub2_3254.method689(arg0, arg1, arg2);
			anInt3246++;
label0:
			for(Class33_Sub7 class33_sub7 = (Class33_Sub7)aClass4_3252.method68(18823); class33_sub7 != null; class33_sub7 = (Class33_Sub7)aClass4_3252.method66((byte)-128))
			{
				if(aClass33_Sub13_Sub4_3238.method772((byte)88, class33_sub7))
					continue;
				int i = arg1;
				int j;
				for(j = arg2; ~class33_sub7.anInt2159 > ~j;)
				{
					method745(class33_sub7.anInt2159, class33_sub7, j + i, i, 0xfffff, arg0);
					i += class33_sub7.anInt2159;
					j -= class33_sub7.anInt2159;
					if(aClass33_Sub13_Sub4_3238.method753(j, arg0, class33_sub7, (byte)-19, i))
						continue label0;
				}

				method745(j, class33_sub7, i + j, i, 0xfffff, arg0);
				class33_sub7.anInt2159 -= j;
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ge.J(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public Class33_Sub13_Sub3(Class33_Sub13_Sub4 arg0)
	{
		aClass4_3252 = new Class4();
		aClass33_Sub13_Sub2_3254 = new Class33_Sub13_Sub2();
		try
		{
			aClass33_Sub13_Sub4_3238 = arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ge.<init>(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt3236;
	public static int anInt3237;
	public Class33_Sub13_Sub4 aClass33_Sub13_Sub4_3238;
	public static int anInt3239;
	public static Class30 aClass30_3240;
	public static Class58 aClass58_3241 = Class33_Sub6_Sub11.method535(118, "Fertigkeit)2");
	public static int anInt3242;
	public static int anInt3243;
	public static int anInt3244 = -1;
	public static int anInt3245 = 1;
	public static int anInt3246;
	public static Class58 aClass58_3247 = Class33_Sub6_Sub11.method535(115, "<col=ffffff>");
	public static int anInt3248;
	public static Class58 aClass58_3249 = Class33_Sub6_Sub11.method535(123, "<col=ffb000>");
	public static int anInt3250;
	public static int anInt3251;
	public Class4 aClass4_3252;
	public static int anInt3253 = 0;
	public Class33_Sub13_Sub2 aClass33_Sub13_Sub2_3254;

}
