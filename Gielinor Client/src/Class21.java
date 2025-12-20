// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class21.java


public class Class21
{

	public static void method172(int arg0, Class30 arg1)
	{
		anInt398++;
		Class33_Sub6_Sub4_Sub5_Sub1.aClass30_3743 = arg1;
		if(arg0 != 0)
			method172(53, null);
	}

	public static void method173(int arg0)
	{
		aClass58_403 = null;
		anIntArray399 = null;
		aClass58_397 = null;
		anIntArray391 = null;
		aClass58_390 = null;
		aClass58_404 = null;
		aClass58_405 = null;
		anIntArray394 = null;
		aClass58_392 = null;
		aClass58_393 = null;
		if(arg0 != 0)
			method173(-41);
	}

	public static int method174(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt395++;
			if(arg2 != 0)
				aClass58_405 = null;
			Class33_Sub12 class33_sub12 = (Class33_Sub12)client.aClass82_1943.method1220(arg2 + 43, arg0);
			if(class33_sub12 == null)
				return 0;
			if(~arg1 > -1 || ~arg1 <= ~class33_sub12.anIntArray2305.length)
				return 0;
			else
				return class33_sub12.anIntArray2305[arg1];
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "fe.B(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static Class58 aClass58_390;
	public static int anIntArray391[];
	public static Class58 aClass58_392 = Class33_Sub6_Sub11.method535(105, "titlebox");
	public static Class58 aClass58_393;
	public static int anIntArray394[];
	public static int anInt395;
	public static int anInt396;
	public static Class58 aClass58_397;
	public static int anInt398;
	public static int anIntArray399[] = new int[50];
	public static int anInt400 = 1;
	public static int anInt401 = 0;
	public static int anInt402 = 0;
	public static Class58 aClass58_403 = Class33_Sub6_Sub11.method535(106, "logo");
	public static Class58 aClass58_404 = Class33_Sub6_Sub11.method535(111, "<col=ffff00>*V");
	public static Class58 aClass58_405;
	public static int anInt406 = -1;

	static 
	{
		aClass58_390 = Class33_Sub6_Sub11.method535(109, "Your account is already logged in)3");
		aClass58_405 = aClass58_390;
		aClass58_393 = Class33_Sub6_Sub11.method535(111, "Checking for updates )2 ");
		aClass58_397 = aClass58_393;
	}
}
