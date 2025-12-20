// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class60.java


public class Class60
{

	public static Class33_Sub6_Sub10 method1070(int arg0, byte arg1)
	{
		try
		{
			anInt1282++;
			Class33_Sub6_Sub10 class33_sub6_sub10 = (Class33_Sub6_Sub10)Class54.aClass16_1147.method144(0, arg0);
			if(class33_sub6_sub10 != null)
				return class33_sub6_sub10;
			if(arg1 < 97)
				return null;
			byte abyte0[] = Class73.aClass30_Sub1_1554.method238(false, 0, arg0);
			if(abyte0 == null)
				return null;
			class33_sub6_sub10 = new Class33_Sub6_Sub10();
			Class33_Sub11 class33_sub11 = new Class33_Sub11(abyte0);
			class33_sub11.anInt2239 = -12 + class33_sub11.aByteArray2296.length;
			int j = 0;
			int i = class33_sub11.method623((byte)-112);
			class33_sub6_sub10.anInt2871 = class33_sub11.method666(33);
			class33_sub6_sub10.anInt2870 = class33_sub11.method666(109);
			class33_sub6_sub10.anInt2866 = class33_sub11.method666(96);
			class33_sub6_sub10.anInt2858 = class33_sub11.method666(85);
			class33_sub11.anInt2239 = 0;
			class33_sub6_sub10.aClass58_2878 = class33_sub11.method648(104);
			class33_sub6_sub10.aClass58Array2879 = new Class58[i];
			class33_sub6_sub10.anIntArray2859 = new int[i];
			class33_sub6_sub10.anIntArray2874 = new int[i];
			while(class33_sub11.aByteArray2296.length - 12 > class33_sub11.anInt2239) 
			{
				int k = class33_sub11.method666(87);
				if(~k != -4)
				{
					if(~k <= -101 || ~k == -22 || ~k == -39 || k == 39)
						class33_sub6_sub10.anIntArray2859[j] = class33_sub11.method639((byte)123);
					else
						class33_sub6_sub10.anIntArray2859[j] = class33_sub11.method623((byte)94);
				} else
				{
					class33_sub6_sub10.aClass58Array2879[j] = class33_sub11.method646(-110);
				}
				class33_sub6_sub10.anIntArray2874[j++] = k;
			}
			Class54.aClass16_1147.method145(arg0, (byte)-125, class33_sub6_sub10);
			return class33_sub6_sub10;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rd.B(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method1071(int arg0)
	{
		anInt1290++;
		if(~RuntimeException_Sub1.anInt1819 != -1)
			return;
		if(arg0 >= -78)
			method1072(false);
		if(Class59.anInt1276 != -1)
			return;
		int i = Class69.anInt1464;
		if(Class33_Sub15.aBoolean2470 && Class82.anInt1794 >= 516 && ~Class48.anInt1055 <= -161 && ~Class82.anInt1794 >= -766 && ~Class48.anInt1055 >= -206)
			i = 0;
		if(Class33_Sub6_Sub4_Sub4.aBoolean3486)
		{
			if(~i != -2)
			{
				int j = Applet_Sub1.anInt41;
				int i1 = Class13.anInt254;
				if(Class33_Sub6.anInt2127 == 0)
				{
					j -= 4;
					i1 -= 4;
				}
				if(Class33_Sub6.anInt2127 == 1)
				{
					j -= 553;
					i1 -= 205;
				}
				if(Class33_Sub6.anInt2127 == 2)
				{
					j -= 17;
					i1 -= 357;
				}
				if(~j > ~(Class78.anInt1673 - 10) || j > Class78.anInt1673 - (-Class26.anInt550 + -10) || i1 < Class77_Sub2.anInt2642 + -10 || i1 > (Class77_Sub2.anInt2642 - -Class33_Sub6_Sub4_Sub5.anInt3537) + 10)
				{
					if(~Class33_Sub6.anInt2127 == -2)
						Class74.aBoolean1579 = true;
					Class33_Sub6_Sub4_Sub4.aBoolean3486 = false;
					if(~Class33_Sub6.anInt2127 == -3)
						Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
				}
			}
			if(~i == -2)
			{
				int k = Class78.anInt1673;
				int l1 = Class26.anInt550;
				int j1 = Class77_Sub2.anInt2642;
				int k2 = Class48.anInt1055;
				int j2 = Class82.anInt1794;
				int l2 = -1;
				if(~Class33_Sub6.anInt2127 == -1)
				{
					j2 -= 4;
					k2 -= 4;
				}
				if(~Class33_Sub6.anInt2127 == -2)
				{
					j2 -= 553;
					k2 -= 205;
				}
				if(Class33_Sub6.anInt2127 == 2)
				{
					k2 -= 357;
					j2 -= 17;
				}
				for(int i3 = 0; ~Class14.anInt276 < ~i3; i3++)
				{
					int j3 = 15 * ((-1 + Class14.anInt276) - i3) + (j1 + 31);
					if(~j2 < ~k && k - -l1 > j2 && k2 > -13 + j3 && k2 < 3 + j3)
						l2 = i3;
				}

				if(~l2 != 0)
					Class33_Sub6_Sub4_Sub6.method381((byte)-101, l2);
				Class33_Sub6_Sub4_Sub4.aBoolean3486 = false;
				if(Class33_Sub6.anInt2127 == 1)
					Class74.aBoolean1579 = true;
				if(~Class33_Sub6.anInt2127 == -3)
				{
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					return;
				}
			}
		} else
		{
			if(i == 1 && ~Class14.anInt276 < -1)
			{
				int l = Class33_Sub6_Sub4_Sub1.anIntArray3357[Class14.anInt276 - 1];
				if(~l == -37 || ~l == -13 || l == 19 || ~l == -9 || l == 34 || l == 50 || l == 39 || ~l == -55 || l == 57 || l == 58 || l == 6 || l == 1002)
				{
					int k1 = Class51.anIntArray1100[-1 + Class14.anInt276];
					int i2 = Class71.anIntArray1524[-1 + Class14.anInt276];
					Class33_Sub15 class33_sub15 = Class49.method933(i2, -63);
					if(Class33_Sub4.method284(Class33_Sub6_Sub5.method403(class33_sub15, -5447), -10) || Class71.method1138(Class33_Sub6_Sub5.method403(class33_sub15, -5447), 19138))
					{
						Class40.anInt884 = i2;
						Class40.anInt890 = k1;
						Class33_Sub6_Sub10.anInt2861 = 0;
						RuntimeException_Sub1.anInt1819 = 2;
						Class54.aBoolean1148 = false;
						Class12.anInt233 = Class48.anInt1055;
						if(i2 >> 0x128b6010 == Class33_Sub6_Sub14.anInt3013)
							RuntimeException_Sub1.anInt1819 = 1;
						if(~(i2 >> 0xdda3d310) == ~Class45.anInt965)
							RuntimeException_Sub1.anInt1819 = 3;
						Class51.anInt1101 = Class82.anInt1794;
						return;
					}
				}
			}
			if(~i == -2 && (Class33_Sub9.anInt2186 == 1 || Class51.method943(Class14.anInt276 + -1, 82)) && Class14.anInt276 > 2)
				i = 2;
			if(i == 1 && ~Class14.anInt276 < -1)
				Class33_Sub6_Sub4_Sub6.method381((byte)-90, Class14.anInt276 - 1);
			if(i == 2 && Class14.anInt276 > 0)
				Class33_Sub6_Sub4_Sub6.method380(2);
		}
	}

	public static void method1072(boolean arg0)
	{
		try
		{
			aClass58_1283 = null;
			aClass58_1292 = null;
			aClass58_1288 = null;
			aClass58_1279 = null;
			aString1289 = null;
			aClass58_1293 = null;
			aClass58_1280 = null;
			if(arg0)
			{
				return;
			} else
			{
				aClass58_1285 = null;
				aClass33_Sub6_Sub7_Sub4_1278 = null;
				aClass58_1291 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rd.A(" + arg0 + ')');
		}
	}

	public static synchronized long method1073(boolean arg0)
	{
		try
		{
			if(arg0)
				aClass58_1283 = null;
			anInt1281++;
			long l = System.currentTimeMillis();
			if(l < Class33_Sub6_Sub4_Sub5.aLong3542)
				Class30.aLong670 += Class33_Sub6_Sub4_Sub5.aLong3542 + -l;
			Class33_Sub6_Sub4_Sub5.aLong3542 = l;
			return Class30.aLong670 + l;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rd.D(" + arg0 + ')');
		}
	}

	public static int anInt1277 = 0;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_1278;
	public static Class58 aClass58_1279;
	public static Class58 aClass58_1280;
	public static int anInt1281;
	public static int anInt1282;
	public static Class58 aClass58_1283;
	public static int anInt1284;
	public static Class58 aClass58_1285;
	public static int anInt1286;
	public static int anInt1287;
	public static Class58 aClass58_1288;
	public static String aString1289;
	public static int anInt1290;
	public static Class58 aClass58_1291;
	public static Class58 aClass58_1292;
	public static Class58 aClass58_1293;

	static 
	{
		aClass58_1280 = Class33_Sub6_Sub11.method535(117, "skill)2");
		aClass58_1285 = Class33_Sub6_Sub11.method535(118, "You are standing in a members)2only area)3");
		aClass58_1279 = aClass58_1285;
		aClass58_1283 = Class33_Sub6_Sub11.method535(117, "New User");
		aClass58_1288 = Class33_Sub6_Sub11.method535(123, "Login");
		aClass58_1291 = aClass58_1283;
		aClass58_1293 = aClass58_1288;
		aClass58_1292 = aClass58_1280;
	}
}
