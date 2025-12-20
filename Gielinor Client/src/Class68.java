// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class68.java


public class Class68
{

	public static void method1107(int arg0, int arg1)
	{
		try
		{
			anInt1460++;
			if(~arg0 == 0)
				return;
			if(!Class33_Sub6_Sub1.aBooleanArray2671[arg0])
				return;
			Class33_Sub11.aClass30_2257.method216(arg0, (byte)-94);
			if(Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0] == null)
				return;
			boolean flag = true;
			for(int i = 0; Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0].length > i; i++)
				if(Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0][i] != null)
					if(Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0][i].anInt2452 != 2)
						Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0][i] = null;
					else
						flag = false;

			if(flag)
				Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg0] = null;
			if(arg1 != 0x1fffee61)
				method1109((byte)27);
			Class33_Sub6_Sub1.aBooleanArray2671[arg0] = false;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ta.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method1108(byte arg0)
	{
		try
		{
			for(int i = 0; i < Class33_Sub6_Sub1.anInt2659; i++)
			{
				int j = Class80.anIntArray1730[i];
				Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[j];
				if(class33_sub6_sub4_sub5_sub2 != null)
					Class33_Sub20.method828(class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.anInt3107, (byte)47, class33_sub6_sub4_sub5_sub2);
			}

			if(arg0 != -88)
				aClass58_1451 = null;
			anInt1442++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ta.A(" + arg0 + ')');
		}
	}

	public static void method1109(byte arg0)
	{
		try
		{
			aClass58_1458 = null;
			aClass58_1455 = null;
			aClass58_1452 = null;
			if(arg0 != -69)
				method1108((byte)55);
			aClass58_1454 = null;
			anIntArray1448 = null;
			aClass58_1451 = null;
			aClass58_1456 = null;
			aClass58_1450 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ta.C(" + arg0 + ')');
		}
	}

	public static void method1110(int arg0, Class33_Sub5 arg1)
	{
		try
		{
			int j = -1;
			int i = 0;
			anInt1453++;
			if(arg1.anInt2093 == 0)
				i = Class33_Sub2.aClass56_2035.method978(arg1.anInt2104, arg1.anInt2109, arg1.anInt2098);
			int k = 0;
			int l = 0;
			if(~arg1.anInt2093 == -2)
				i = Class33_Sub2.aClass56_2035.method988(arg1.anInt2104, arg1.anInt2109, arg1.anInt2098);
			if(arg1.anInt2093 == 2)
				i = Class33_Sub2.aClass56_2035.method1007(arg1.anInt2104, arg1.anInt2109, arg1.anInt2098);
			if(arg1.anInt2093 == 3)
				i = Class33_Sub2.aClass56_2035.method971(arg1.anInt2104, arg1.anInt2109, arg1.anInt2098);
			if(arg0 != ~i)
			{
				j = (0x1fffee61 & i) >> 0x92de5dee;
				int i1 = Class33_Sub2.aClass56_2035.method980(arg1.anInt2104, arg1.anInt2109, arg1.anInt2098, i);
				l = (i1 & 0xd3) >> 0xf2deef66;
				k = i1 & 0x1f;
			}
			arg1.anInt2113 = l;
			arg1.anInt2105 = k;
			arg1.anInt2110 = j;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ta.B(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public Class68()
	{
	}

	public int anInt1440;
	public static int anInt1441 = 0;
	public static int anInt1442;
	public byte aByteArray1443[];
	public static int anInt1444;
	public int anInt1445;
	public int anInt1446;
	public int anInt1447;
	public static int anIntArray1448[];
	public static int anInt1449;
	public static Class58 aClass58_1450 = Class33_Sub6_Sub11.method535(100, "Ihr Charakter)2Profil wird in:");
	public static Class58 aClass58_1451;
	public static Class58 aClass58_1452 = Class33_Sub6_Sub11.method535(106, "(U1");
	public static int anInt1453;
	public static Class58 aClass58_1454;
	public static Class58 aClass58_1455;
	public static Class58 aClass58_1456;
	public int anInt1457;
	public static Class58 aClass58_1458 = Class33_Sub6_Sub11.method535(98, "http:)4)4");
	public int anInt1459;
	public static int anInt1460;
	public byte aByteArray1461[];
	public int anInt1462;

	static 
	{
		aClass58_1456 = Class33_Sub6_Sub11.method535(112, "Please close the interface you have open before using (Wreport abuse(W");
		aClass58_1455 = Class33_Sub6_Sub11.method535(108, "Press (Wrecover a locked account(W on front page)3");
		aClass58_1454 = aClass58_1456;
		aClass58_1451 = aClass58_1455;
	}
}
