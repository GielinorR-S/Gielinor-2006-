// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub5.java

import java.io.UnsupportedEncodingException;

public class Class33_Sub5 extends Class33
{

	public static Class33_Sub6_Sub17 method285(byte arg0, int arg1)
	{
		try
		{
			anInt2103++;
			Class33_Sub6_Sub17 class33_sub6_sub17 = (Class33_Sub6_Sub17)Class44.aClass16_954.method144(0, arg1);
			if(class33_sub6_sub17 != null)
				return class33_sub6_sub17;
			if(arg0 > -47)
				return null;
			byte abyte0[] = Class73.aClass30_1550.method238(false, arg1, 6);
			class33_sub6_sub17 = new Class33_Sub6_Sub17();
			class33_sub6_sub17.anInt3123 = arg1;
			if(abyte0 != null)
				class33_sub6_sub17.method592(new Class33_Sub11(abyte0), 115);
			class33_sub6_sub17.method602(60);
			if(class33_sub6_sub17.aBoolean3164)
			{
				class33_sub6_sub17.anInt3159 = 0;
				class33_sub6_sub17.aBoolean3184 = false;
			}
			Class44.aClass16_954.method145(arg1, (byte)-105, class33_sub6_sub17);
			return class33_sub6_sub17;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "da.B(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static Class58 method286(int arg0, Class58 arg1, Class33_Sub15 arg2)
	{
		try
		{
			if(arg0 != 12074)
				return null;
			if(arg1.method1046((byte)-93, Class22.aClass58_417) != -1)
			{
				do
				{
					int i = arg1.method1046((byte)-126, Class68.aClass58_1452);
					if(i == -1)
						break;
					arg1 = Class35.method846((byte)-83, new Class58[] {
						arg1.method1063(0, (byte)123, i), Class33_Sub21.method831(-93, Applet_Sub1.method27(0, 0, arg2)), arg1.method1028(2 + i, (byte)120)
					});
				} while(true);
				do
				{
					int j = arg1.method1046((byte)-85, Class13.aClass58_255);
					if(~j == 0)
						break;
					arg1 = Class35.method846((byte)-83, new Class58[] {
						arg1.method1063(0, (byte)121, j), Class33_Sub21.method831(arg0 ^ 0xffffd0ce, Applet_Sub1.method27(arg0 ^ 0x2f2a, 1, arg2)), arg1.method1028(2 + j, (byte)120)
					});
				} while(true);
				do
				{
					int k = arg1.method1046((byte)-81, Class45.aClass58_967);
					if(k == -1)
						break;
					arg1 = Class35.method846((byte)-83, new Class58[] {
						arg1.method1063(0, (byte)121, k), Class33_Sub21.method831(arg0 ^ 0xffffd0ac, Applet_Sub1.method27(arg0 ^ 0x2f2a, 2, arg2)), arg1.method1028(k + 2, (byte)120)
					});
				} while(true);
				do
				{
					int l = arg1.method1046((byte)-110, Class81.aClass58_1745);
					if(~l == 0)
						break;
					arg1 = Class35.method846((byte)-83, new Class58[] {
						arg1.method1063(0, (byte)125, l), Class33_Sub21.method831(-113, Applet_Sub1.method27(0, 3, arg2)), arg1.method1028(l - -2, (byte)120)
					});
				} while(true);
				do
				{
					int i1 = arg1.method1046((byte)-100, Class33_Sub3.aClass58_2055);
					if(i1 == -1)
						break;
					arg1 = Class35.method846((byte)-83, new Class58[] {
						arg1.method1063(0, (byte)119, i1), Class33_Sub21.method831(-46, Applet_Sub1.method27(0, 4, arg2)), arg1.method1028(2 + i1, (byte)120)
					});
				} while(true);
				do
				{
					int j1 = arg1.method1046((byte)-71, Class33_Sub11.aClass58_2272);
					if(~j1 == 0)
						break;
					Class58 class58 = Class33_Sub13_Sub4.aClass58_3261;
					if(Class33_Sub12.aClass6_2316 != null)
					{
						class58 = Class36.method853(255, Class33_Sub12.aClass6_2316.anInt148);
						try
						{
							if(Class33_Sub12.aClass6_2316.anObject149 != null)
							{
								byte abyte0[] = ((String)Class33_Sub12.aClass6_2316.anObject149).getBytes("ISO-8859-1");
								class58 = Class33_Sub6.method290(0, arg0 ^ 0x2f6a, abyte0, abyte0.length);
							}
						}
						catch(UnsupportedEncodingException _ex) { }
					}
					arg1 = Class35.method846((byte)-83, new Class58[] {
						arg1.method1063(0, (byte)119, j1), class58, arg1.method1028(4 + j1, (byte)120)
					});
				} while(true);
			}
			anInt2095++;
			return arg1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "da.D(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method287(int arg0)
	{
		try
		{
			anIntArray2120 = null;
			aClass58_2108 = null;
			if(arg0 != -7)
			{
				return;
			} else
			{
				aClass58_2117 = null;
				aClass58_2101 = null;
				aClass58_2107 = null;
				aClass58_2111 = null;
				anIntArray2118 = null;
				aClass58_2106 = null;
				anIntArray2116 = null;
				aClass58_2102 = null;
				aClass58_2114 = null;
				aClass58_2100 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "da.A(" + arg0 + ')');
		}
	}

	public static void method288(byte arg0[], byte arg1)
	{
		try
		{
			anInt2094++;
			Class33_Sub11 class33_sub11 = new Class33_Sub11(arg0);
			class33_sub11.anInt2239 = arg0.length - 2;
			Class77_Sub2.anInt2641 = class33_sub11.method666(107);
			Class21.anIntArray391 = new int[Class77_Sub2.anInt2641];
			Class33_Sub6_Sub5.anIntArray2769 = new int[Class77_Sub2.anInt2641];
			Class33_Sub19.anIntArray2553 = new int[Class77_Sub2.anInt2641];
			Class33_Sub6_Sub4_Sub1.aByteArrayArray3361 = new byte[Class77_Sub2.anInt2641][];
			Class33_Sub6_Sub4_Sub5_Sub1.anIntArray3753 = new int[Class77_Sub2.anInt2641];
			class33_sub11.anInt2239 = -(Class77_Sub2.anInt2641 * 8) + (arg0.length - 7);
			Class68.anInt1444 = class33_sub11.method666(100);
			Class46.anInt1000 = class33_sub11.method666(42);
			int i = 1 + (class33_sub11.method639((byte)123) & 0xff);
			for(int j = 0; ~j > ~Class77_Sub2.anInt2641; j++)
				Class33_Sub19.anIntArray2553[j] = class33_sub11.method666(122);

			if(arg1 >= -59)
				return;
			for(int k = 0; ~k > ~Class77_Sub2.anInt2641; k++)
				Class21.anIntArray391[k] = class33_sub11.method666(114);

			for(int l = 0; ~l > ~Class77_Sub2.anInt2641; l++)
				Class33_Sub6_Sub4_Sub5_Sub1.anIntArray3753[l] = class33_sub11.method666(111);

			for(int i1 = 0; Class77_Sub2.anInt2641 > i1; i1++)
				Class33_Sub6_Sub5.anIntArray2769[i1] = class33_sub11.method666(65);

			class33_sub11.anInt2239 = -(8 * Class77_Sub2.anInt2641) + arg0.length + (-7 + -(3 * (-1 + i)));
			Class75.anIntArray1614 = new int[i];
			for(int j1 = 1; ~j1 > ~i; j1++)
			{
				Class75.anIntArray1614[j1] = class33_sub11.method626((byte)-114);
				if(~Class75.anIntArray1614[j1] == -1)
					Class75.anIntArray1614[j1] = 1;
			}

			class33_sub11.anInt2239 = 0;
			for(int k1 = 0; ~Class77_Sub2.anInt2641 < ~k1; k1++)
			{
				int l1 = Class33_Sub6_Sub4_Sub5_Sub1.anIntArray3753[k1];
				int i2 = Class33_Sub6_Sub5.anIntArray2769[k1];
				int j2 = i2 * l1;
				byte abyte0[] = new byte[j2];
				Class33_Sub6_Sub4_Sub1.aByteArrayArray3361[k1] = abyte0;
				int k2 = class33_sub11.method639((byte)123);
				if(k2 != 0)
				{
					if(k2 == 1)
					{
						for(int l2 = 0; ~l1 < ~l2; l2++)
						{
							for(int j3 = 0; ~j3 > ~i2; j3++)
								abyte0[l2 - -(l1 * j3)] = class33_sub11.method661((byte)-111);

						}

					}
				} else
				{
					for(int i3 = 0; j2 > i3; i3++)
						abyte0[i3] = class33_sub11.method661((byte)-113);

				}
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "da.C(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public Class33_Sub5()
	{
		anInt2096 = 0;
		anInt2112 = -1;
	}

	public int anInt2093;
	public static int anInt2094;
	public static int anInt2095;
	public int anInt2096;
	public int anInt2097;
	public int anInt2098;
	public static int anInt2099;
	public static Class58 aClass58_2100 = Class33_Sub6_Sub11.method535(123, ":  ");
	public static Class58 aClass58_2101;
	public static Class58 aClass58_2102;
	public static int anInt2103;
	public int anInt2104;
	public int anInt2105;
	public static Class58 aClass58_2106;
	public static Class58 aClass58_2107;
	public static Class58 aClass58_2108;
	public int anInt2109;
	public int anInt2110;
	public static Class58 aClass58_2111;
	public int anInt2112;
	public int anInt2113;
	public static Class58 aClass58_2114 = Class33_Sub6_Sub11.method535(113, "Name eingeben:");
	public int anInt2115;
	public static int anIntArray2116[] = new int[128];
	public static Class58 aClass58_2117 = Class33_Sub6_Sub11.method535(117, "Gegenstand f-Ur Mitglieder");
	public static int anIntArray2118[];
	public int anInt2119;
	public static int anIntArray2120[] = new int[2000];

	static 
	{
		aClass58_2107 = Class33_Sub6_Sub11.method535(126, "Friends");
		aClass58_2101 = Class33_Sub6_Sub11.method535(112, "Please subscribe)1 or use a different world)3");
		aClass58_2102 = aClass58_2101;
		aClass58_2106 = Class33_Sub6_Sub11.method535(125, "Connecting to update server");
		aClass58_2111 = aClass58_2107;
		aClass58_2108 = aClass58_2106;
	}
}
