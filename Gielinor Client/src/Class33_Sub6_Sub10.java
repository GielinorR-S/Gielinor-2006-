// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub10.java


public class Class33_Sub6_Sub10 extends Class33_Sub6
{

	public static byte[] method519(byte arg0[], int arg1)
	{
		try
		{
			anInt2867++;
			int i = arg0.length;
			byte abyte0[] = new byte[i];
			Class53.method955(arg0, arg1, abyte0, 0, i);
			return abyte0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jc.E(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static Class33_Sub6_Sub7_Sub2 method520(Class58 arg0, int arg1, Class58 arg2, Class30 arg3)
	{
		try
		{
			if(arg1 != 99)
			{
				return null;
			} else
			{
				int i = arg3.method227((byte)82, arg2);
				int j = arg3.method229(true, i, arg0);
				anInt2862++;
				return Class33_Sub13_Sub4.method749(arg3, i, j, (byte)-48);
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jc.G(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method521(long arg0, boolean arg1)
	{
		try
		{
			anInt2876++;
			if(arg0 == 0L)
				return;
			if(Class33_Sub6_Sub12.anInt2979 >= 100 && Class12.anInt218 != 1 || ~Class33_Sub6_Sub12.anInt2979 <= -201)
			{
				Class43.method904(0, 0, Class49.aClass58_1079, Class33_Sub13_Sub4.aClass58_3261);
				return;
			}
			Class58 class58 = Class33_Sub19.method817(arg0, 126).method1065(-124);
			for(int i = 0; Class33_Sub6_Sub12.anInt2979 > i; i++)
				if(arg0 == Class47.aLongArray1032[i])
				{
					Class43.method904(0, 0, Class35.method846((byte)-83, new Class58[] {
						class58, Class33_Sub9.aClass58_2199
					}), Class33_Sub13_Sub4.aClass58_3261);
					return;
				}

			for(int j = 0; j < Class65.anInt1388; j++)
				if(~arg0 == ~Class33_Sub6_Sub16.aLongArray3103[j])
				{
					Class43.method904(0, 0, Class35.method846((byte)-83, new Class58[] {
						Class33_Sub12.aClass58_2311, class58, Class46.aClass58_1014
					}), Class33_Sub13_Sub4.aClass58_3261);
					return;
				}

			if(arg1)
				aClass58_2885 = null;
			if(class58.method1038(Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.aClass58_3755, 113))
			{
				return;
			} else
			{
				Class32.aClass58Array711[Class33_Sub6_Sub12.anInt2979] = class58;
				Class47.aLongArray1032[Class33_Sub6_Sub12.anInt2979] = arg0;
				Class30_Sub1.anIntArray2013[Class33_Sub6_Sub12.anInt2979] = 0;
				Class33_Sub6_Sub5.anInt2758++;
				Class16.anIntArray315[Class33_Sub6_Sub12.anInt2979] = 0;
				Class33_Sub6_Sub12.anInt2979++;
				Class33_Sub6_Sub15.anInt3059 += 32;
				Class74.aBoolean1579 = true;
				Class46.aClass33_Sub11_Sub1_989.method683(118, -1198);
				Class46.aClass33_Sub11_Sub1_989.method675(arg0, (byte)120);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jc.F(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method522(byte arg0)
	{
		anInt2868++;
		Class54.aClass16_1146.method147((byte)-54);
		Class82.aClass16_1798.method147((byte)-54);
		if(arg0 <= 94)
			method520(null, 80, null, null);
	}

	public static void method523(boolean arg0)
	{
		try
		{
			aClass36_2881 = null;
			aClass58_2865 = null;
			anObject2864 = null;
			aClass58_2882 = null;
			aClass58_2884 = null;
			aClass58_2885 = null;
			aClass58_2883 = null;
			aClass58_2873 = null;
			if(arg0)
				aClass58_2873 = null;
			aClass58_2880 = null;
			aClass58_2860 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jc.H(" + arg0 + ')');
		}
	}

	public static int method524(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt2857++;
			if(arg2 > -46)
				return 61;
			long l = arg1 + (arg0 << 0x3bc6e190);
			if(Class15_Sub2.aClass33_Sub6_Sub2_1977 == null || l != ((Class33) (Class15_Sub2.aClass33_Sub6_Sub2_1977)).aLong747)
				return 0;
			else
				return 1 - -((99 * Class77.aClass33_Sub11_1653.anInt2239) / (Class77.aClass33_Sub11_1653.aByteArray2296.length + -Class15_Sub2.aClass33_Sub6_Sub2_1977.aByte2685));
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jc.D(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static boolean method525(int arg0, int arg1)
	{
		try
		{
			anInt2875++;
			if(arg0 != 17417)
				aClass36_2881 = null;
			return (1 & arg1 >> 0xe3614774) != 0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jc.C(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static Class33_Sub6_Sub7_Sub4[] method526(boolean arg0, Class30 arg1, Class58 arg2, Class58 arg3)
	{
		try
		{
			anInt2863++;
			int i = arg1.method227((byte)61, arg2);
			int j = arg1.method229(arg0, i, arg3);
			return Class33_Sub18.method810(j, arg1, i, 0);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jc.A(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public Class33_Sub6_Sub10()
	{
	}

	public static int anInt2857;
	public int anInt2858;
	public int anIntArray2859[];
	public static Class58 aClass58_2860 = Class33_Sub6_Sub11.method535(120, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <lt>AN<gt>");
	public static int anInt2861 = 0;
	public static int anInt2862;
	public static int anInt2863;
	public static Object anObject2864 = new Object();
	public static Class58 aClass58_2865;
	public int anInt2866;
	public static int anInt2867;
	public static int anInt2868;
	public static int anInt2869 = 0;
	public int anInt2870;
	public int anInt2871;
	public static int anInt2872 = 128;
	public static Class58 aClass58_2873 = Class33_Sub6_Sub11.method535(108, "T");
	public int anIntArray2874[];
	public static int anInt2875;
	public static int anInt2876;
	public static int anInt2877 = -1;
	public Class58 aClass58_2878;
	public Class58 aClass58Array2879[];
	public static Class58 aClass58_2880;
	public static Class36 aClass36_2881;
	public static Class58 aClass58_2882;
	public static Class58 aClass58_2883;
	public static Class58 aClass58_2884 = Class33_Sub6_Sub11.method535(112, ")1p");
	public static Class58 aClass58_2885;

	static 
	{
		aClass58_2880 = Class33_Sub6_Sub11.method535(115, "Loading wordpack )2 ");
		aClass58_2865 = aClass58_2880;
		aClass58_2882 = Class33_Sub6_Sub11.method535(104, "white:");
		aClass58_2883 = aClass58_2882;
		aClass58_2885 = aClass58_2882;
	}
}
