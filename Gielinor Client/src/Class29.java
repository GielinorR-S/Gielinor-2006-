// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class29.java


public class Class29
{

	public static void method212(int arg0)
	{
		try
		{
			aClass58_585 = null;
			aClass58_590 = null;
			aClass58_587 = null;
			aClass58_607 = null;
			aClass58_594 = null;
			aClass58_597 = null;
			aClass58_606 = null;
			if(arg0 != 4280)
			{
				return;
			} else
			{
				aClass58_598 = null;
				aClass58_611 = null;
				aClass58_599 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "j.B(" + arg0 + ')');
		}
	}

	public static void method213(int arg0)
	{
		try
		{
			if(arg0 != 23868)
				return;
			anInt601++;
			for(Class33_Sub5 class33_sub5 = (Class33_Sub5)Class33_Sub6_Sub15.aClass4_3053.method68(arg0 ^ 0x14bb); class33_sub5 != null; class33_sub5 = (Class33_Sub5)Class33_Sub6_Sub15.aClass4_3053.method66((byte)-128))
				if(~class33_sub5.anInt2112 == 0)
				{
					class33_sub5.anInt2096 = 0;
					Class68.method1110(arg0 + -23869, class33_sub5);
				} else
				{
					class33_sub5.method266(-89);
				}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "j.A(" + arg0 + ')');
		}
	}

	public static int method214(int arg0, int arg1, byte arg2)
	{
		try
		{
			if(arg2 != 9)
				return 17;
			anInt580++;
			Class33_Sub12 class33_sub12 = (Class33_Sub12)client.aClass82_1943.method1220(arg2 + 113, arg0);
			if(class33_sub12 == null)
				return -1;
			if(arg1 < 0 || arg1 >= class33_sub12.anIntArray2310.length)
				return -1;
			else
				return class33_sub12.anIntArray2310[arg1];
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "j.C(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method215(int arg0, byte arg1)
	{
		try
		{
			anInt603++;
			if(arg1 != -47)
				method215(34, (byte)-90);
			if(~arg0 == ~Class23.anInt485)
				return;
			if(Class23.anInt485 == 0)
				RuntimeException_Sub1.method1228((byte)123);
			if(~arg0 == -21 || ~arg0 == -41)
			{
				Class33_Sub7.anInt2160 = 0;
				Class33_Sub6_Sub6.anInt2784 = 0;
				Class77_Sub2.anInt2640 = 0;
			}
			if(~arg0 != -21 && ~arg0 != -41 && Class33_Sub6_Sub8.aClass43_2814 != null)
			{
				Class33_Sub6_Sub8.aClass43_2814.method903(1);
				Class33_Sub6_Sub8.aClass43_2814 = null;
			}
			if(Class23.anInt485 == 25 || ~Class23.anInt485 == -41)
			{
				Class31.method252(69);
				Class33_Sub6_Sub7.method417();
			}
			if(Class23.anInt485 == 25)
			{
				Class33_Sub6_Sub14.anInt3040 = 0;
				Class33_Sub6_Sub13.anInt3004 = 1;
				Class33_Sub6_Sub2.anInt2697 = 0;
				Class55.anInt1172 = 0;
				Class33_Sub13_Sub3.anInt3245 = 1;
			}
			if(arg0 == 0 || ~arg0 == -36)
			{
				Class45.method911(1282);
				Class79.method1195(2);
				if(Class33_Sub7.aClass15_2146 == null)
					Class33_Sub7.aClass15_2146 = Class33_Sub6_Sub8.method512((byte)-120, Class33_Sub6_Sub4_Sub1.aCanvas3367, 765, 503);
			}
			if(~arg0 == -6 || arg0 == 10 || arg0 == 20)
			{
				Class33_Sub7.aClass15_2146 = null;
				Class45.method911(1282);
				Class58.method1030(Class33_Sub6_Sub4_Sub1.aCanvas3367, arg1 ^ 0xffffffb8, Class33_Sub6_Sub16.aClass30_Sub1_3092, Class33_Sub12.aClass30_Sub1_2322);
			}
			if(arg0 == 25 || arg0 == 30 || ~arg0 == -41)
			{
				Class33_Sub7.aClass15_2146 = null;
				Class79.method1195(2);
				Class33_Sub9.method609(-81, Class33_Sub6_Sub16.aClass30_Sub1_3092, Class33_Sub6_Sub4_Sub1.aCanvas3367);
			}
			Class23.anInt485 = arg0;
			Class33_Sub6_Sub5.aBoolean2752 = true;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "j.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class29()
	{
	}

	public int anInt579;
	public static int anInt580;
	public int anInt581;
	public int anInt582;
	public int anInt583;
	public int anInt584;
	public static Class58 aClass58_585;
	public int anInt586;
	public static Class58 aClass58_587;
	public static int anInt588;
	public int anInt589;
	public static Class58 aClass58_590;
	public int anInt591;
	public int anInt592;
	public int anInt593;
	public static Class58 aClass58_594;
	public static int anInt595;
	public int anInt596;
	public static Class58 aClass58_597;
	public static Class58 aClass58_598 = Class33_Sub6_Sub11.method535(103, "Von:");
	public static Class58 aClass58_599 = Class33_Sub6_Sub11.method535(101, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");
	public int anInt600;
	public static int anInt601;
	public int anInt602;
	public static int anInt603;
	public int anInt604;
	public int anInt605;
	public static Class58 aClass58_606;
	public static Class58 aClass58_607 = Class33_Sub6_Sub11.method535(124, "backvmid2");
	public int anInt608;
	public int anInt609;
	public int anInt610;
	public static Class58 aClass58_611 = Class33_Sub6_Sub11.method535(118, "backhmid2");

	static 
	{
		aClass58_585 = Class33_Sub6_Sub11.method535(126, "Loaded input handler");
		aClass58_587 = Class33_Sub6_Sub11.method535(111, "Unexpected loginserver response)3");
		aClass58_597 = Class33_Sub6_Sub11.method535(125, "Click to continue");
		aClass58_590 = aClass58_597;
		aClass58_594 = aClass58_585;
		aClass58_606 = aClass58_587;
	}
}
