// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class63.java


public class Class63
{

	public static void method1081(long arg0, int arg1)
	{
		try
		{
			anInt1353++;
			if(arg0 == 0L)
				return;
			if(Class65.anInt1388 >= 100)
			{
				Class43.method904(0, 0, Class41.aClass58_913, Class33_Sub13_Sub4.aClass58_3261);
				return;
			}
			Class58 class58 = Class33_Sub19.method817(arg0, 92).method1065(-90);
			for(int i = 0; Class65.anInt1388 > i; i++)
				if(Class33_Sub6_Sub16.aLongArray3103[i] == arg0)
				{
					Class43.method904(0, 0, Class35.method846((byte)-83, new Class58[] {
						class58, Class58.aClass58_1921
					}), Class33_Sub13_Sub4.aClass58_3261);
					return;
				}

			if(arg1 <= 115)
				return;
			for(int j = 0; ~j > ~Class33_Sub6_Sub12.anInt2979; j++)
				if(arg0 == Class47.aLongArray1032[j])
				{
					Class43.method904(0, 0, Class35.method846((byte)-83, new Class58[] {
						Class33_Sub12.aClass58_2323, class58, Class31.aClass58_704
					}), Class33_Sub13_Sub4.aClass58_3261);
					return;
				}

			if(class58.method1038(Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.aClass58_3755, 60))
			{
				return;
			} else
			{
				Class60.anInt1286++;
				Class33_Sub6_Sub16.aLongArray3103[Class65.anInt1388++] = arg0;
				Class74.aBoolean1579 = true;
				Class46.aClass33_Sub11_Sub1_989.method683(39, -1198);
				Class46.aClass33_Sub11_Sub1_989.method675(arg0, (byte)114);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sa.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method1082(boolean arg0)
	{
		try
		{
			aClass58_1342 = null;
			aClass58_1354 = null;
			aClass58_1339 = null;
			aClass58_1352 = null;
			aClass58_1333 = null;
			aClass58_1329 = null;
			aBooleanArray1337 = null;
			aClass58_1343 = null;
			aClass58_1356 = null;
			aClass33_Sub6_Sub4_Sub7Array1335 = null;
			aClass33_Sub6_Sub7_Sub4_1355 = null;
			aClass43_1336 = null;
			aClass58_1346 = null;
			aClass58_1334 = null;
			aClass58_1331 = null;
			aClass58_1347 = null;
			aClass58_1357 = null;
			aClass58_1330 = null;
			aClass58_1341 = null;
			aClass58_1350 = null;
			if(arg0)
				method1083((byte)111, 21);
			aClass58_1338 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sa.B(" + arg0 + ')');
		}
	}

	public static Class33_Sub6_Sub9 method1083(byte arg0, int arg1)
	{
		try
		{
			anInt1349++;
			Class33_Sub6_Sub9 class33_sub6_sub9 = (Class33_Sub6_Sub9)Class54.aClass16_1146.method144(arg0 + -51, arg1);
			if(arg0 != 51)
				method1083((byte)-64, -102);
			if(class33_sub6_sub9 != null)
				return class33_sub6_sub9;
			byte abyte0[] = Canvas_Sub1.aClass30_48.method238(false, arg1, 13);
			class33_sub6_sub9 = new Class33_Sub6_Sub9();
			class33_sub6_sub9.anInt2822 = arg1;
			if(abyte0 != null)
				class33_sub6_sub9.method516(new Class33_Sub11(abyte0), (byte)106);
			Class54.aClass16_1146.method145(arg1, (byte)-112, class33_sub6_sub9);
			return class33_sub6_sub9;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sa.A(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method1084(int arg0)
	{
		try
		{
			anInt1340++;
			if(arg0 != -27752)
				method1082(false);
			Class33_Sub6_Sub17.aClass16_3140.method147((byte)-54);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "sa.C(" + arg0 + ')');
		}
	}

	public static Class58 aClass58_1329;
	public static Class58 aClass58_1330;
	public static Class58 aClass58_1331 = Class33_Sub6_Sub11.method535(106, "Einloggen");
	public static int anInt1332;
	public static Class58 aClass58_1333;
	public static Class58 aClass58_1334;
	public static Class33_Sub6_Sub4_Sub7 aClass33_Sub6_Sub4_Sub7Array1335[] = new Class33_Sub6_Sub4_Sub7[4];
	public static Class43 aClass43_1336;
	public static boolean aBooleanArray1337[] = {
		true, true, true, true, true, true, true, true, true, true, 
		true, true, true, true, true, true, true, true, true, true, 
		true, true, true, false, false
	};
	public static Class58 aClass58_1338;
	public static Class58 aClass58_1339;
	public static int anInt1340;
	public static Class58 aClass58_1341;
	public static Class58 aClass58_1342;
	public static Class58 aClass58_1343;
	public static long aLong1344 = 0L;
	public static int anInt1345;
	public static Class58 aClass58_1346;
	public static Class58 aClass58_1347;
	public static int anInt1348 = 0;
	public static int anInt1349;
	public static Class58 aClass58_1350;
	public static int anInt1351 = 0;
	public static Class58 aClass58_1352;
	public static int anInt1353;
	public static Class58 aClass58_1354 = Class33_Sub6_Sub11.method535(120, "Menge eingeben:");
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_1355;
	public static Class58 aClass58_1356;
	public static Class58 aClass58_1357 = Class33_Sub6_Sub11.method535(119, "p12_full");

	static 
	{
		aClass58_1342 = Class33_Sub6_Sub11.method535(125, "Enter amount:");
		aClass58_1329 = aClass58_1342;
		aClass58_1347 = Class33_Sub6_Sub11.method535(119, "Please wait )2 attempting to reestablish");
		aClass58_1338 = aClass58_1347;
		aClass58_1346 = Class33_Sub6_Sub11.method535(122, "");
		aClass58_1350 = aClass58_1346;
		aClass58_1334 = aClass58_1346;
		aClass58_1341 = aClass58_1346;
		aClass58_1343 = aClass58_1346;
		aClass58_1356 = aClass58_1346;
		aClass58_1339 = aClass58_1346;
		aClass58_1352 = Class33_Sub6_Sub11.method535(100, "glow3:");
		aClass58_1330 = aClass58_1352;
		aClass58_1333 = aClass58_1352;
	}
}
