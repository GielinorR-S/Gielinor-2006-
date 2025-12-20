// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class30_Sub1.java

import java.util.zip.CRC32;

public class Class30_Sub1 extends Class30
{

	public void method219(int arg0, byte arg1)
	{
		try
		{
			if(arg1 >= -70)
			{
				return;
			} else
			{
				Class33_Sub6_Sub17.method594(anInt1993, arg0, 0x7c1ca9b0);
				anInt1989++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ha.G(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method241(Class12 arg0, boolean arg1, boolean arg2, byte arg3[], int arg4)
	{
		try
		{
			anInt2004++;
			if(arg0 == aClass12_1999)
			{
				if(aBoolean2000)
					throw new RuntimeException();
				if(arg3 == null)
				{
					Class33_Sub6_Sub4_Sub4.method351(anInt1993, true, anInt2009, (byte)0, 18058, this, 255);
					return;
				}
				Class33_Sub6_Sub2.aCRC32_2691.reset();
				Class33_Sub6_Sub2.aCRC32_2691.update(arg3, 0, arg3.length);
				int i = (int)Class33_Sub6_Sub2.aCRC32_2691.getValue();
				if(anInt2009 != i || super.anInt663 != anInt1991)
				{
					Class33_Sub6_Sub4_Sub4.method351(anInt1993, true, anInt2009, (byte)0, 18058, this, 255);
					return;
				}
				method224(arg3, !arg1);
				method243((byte)-122);
			} else
			{
				if(!arg2 && arg4 == anInt1997)
					aBoolean2000 = true;
				if(arg3 == null || arg3.length <= 2)
				{
					aBooleanArray1988[arg4] = false;
					if(aBoolean1986 || arg2)
						Class33_Sub6_Sub4_Sub4.method351(arg4, arg2, super.anIntArray636[arg4], (byte)2, 18058, this, anInt1993);
					return;
				}
				Class33_Sub6_Sub2.aCRC32_2691.reset();
				Class33_Sub6_Sub2.aCRC32_2691.update(arg3, 0, -2 + arg3.length);
				int j = (int)Class33_Sub6_Sub2.aCRC32_2691.getValue();
				int k = (0xff & arg3[arg3.length - 1]) + ((arg3[arg3.length - 2] & 0xff) << 0xe6e093c8);
				if(j != super.anIntArray636[arg4] || k != super.anIntArray616[arg4])
				{
					aBooleanArray1988[arg4] = false;
					if(aBoolean1986 || arg2)
						Class33_Sub6_Sub4_Sub4.method351(arg4, arg2, super.anIntArray636[arg4], (byte)2, 18058, this, anInt1993);
					return;
				}
				aBooleanArray1988[arg4] = true;
				if(arg2)
					super.anObjectArray664[arg4] = Class81.method1214(arg3, false, (byte)-67);
			}
			if(!arg1)
			{
				aBooleanArray1988 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ha.M(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ',' + arg4 + ')');
		}
	}

	public Class30_Sub1(Class12 arg0, Class12 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5)
	{
		super(arg3, arg4);
		aBoolean1986 = false;
		anInt1997 = -1;
		aBoolean2000 = false;
		try
		{
			aClass12_1999 = arg1;
			aBoolean1986 = arg5;
			aClass12_2007 = arg0;
			anInt1993 = arg2;
			Class33_Sub2.method276((byte)-23, anInt1993, this);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ha.<init>(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
		}
	}

	public int method242(boolean arg0)
	{
		try
		{
			int i = 0;
			anInt2005++;
			int j = 0;
			if(arg0)
				aClass58_2010 = null;
			for(int k = 0; ~k > ~super.anObjectArray664.length; k++)
				if(~super.anIntArray623[k] < -1)
				{
					j += method244((byte)60, k);
					i += 100;
				}

			if(~i == -1)
			{
				return 100;
			} else
			{
				int l = (j * 100) / i;
				return l;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ha.H(" + arg0 + ')');
		}
	}

	public void method243(byte arg0)
	{
		aBooleanArray1988 = new boolean[super.anObjectArray664.length];
		anInt2003++;
		for(int i = 0; ~aBooleanArray1988.length < ~i; i++)
			aBooleanArray1988[i] = false;

		if(arg0 > -117)
			method249(67, (byte)111);
		if(aClass12_2007 == null)
		{
			aBoolean2000 = true;
			return;
		}
		anInt1997 = -1;
		for(int j = 0; ~aBooleanArray1988.length < ~j; j++)
			if(super.anIntArray623[j] > 0)
			{
				Class62.method1078(this, 1, j, aClass12_2007);
				anInt1997 = j;
			}

		if(anInt1997 == -1)
			aBoolean2000 = true;
	}

	public int method244(byte arg0, int arg1)
	{
		try
		{
			anInt1987++;
			if(super.anObjectArray664[arg1] != null)
				return 100;
			if(aBooleanArray1988[arg1])
			{
				return 100;
			} else
			{
				int i = -127 % ((-59 - arg0) / 56);
				return Class33_Sub6_Sub10.method524(anInt1993, arg1, -122);
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ha.J(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method245(int arg0)
	{
		try
		{
			anInt2011++;
			if(~Class33_Sub9.anInt2195 == -1)
				return;
			Class33_Sub6_Sub7_Sub2 class33_sub6_sub7_sub2 = Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677;
			int i = 0;
			if(Class12.anInt226 != 0)
				i = 1;
			int j = 0;
			if(arg0 < 111)
				method247(125);
			for(; ~j > -101; j++)
				if(Class33_Sub6_Sub17.aClass58Array3172[j] != null)
				{
					int k = Class33.anIntArray738[j];
					Class58 class58 = Class33_Sub11_Sub1.aClass58Array3211[j];
					byte byte0 = 0;
					if(class58 != null && class58.method1052(Class24.aClass58_513, -123))
					{
						byte0 = 1;
						class58 = class58.method1028(5, (byte)120);
					}
					if(class58 != null && class58.method1052(Class33_Sub20.aClass58_2564, -73))
					{
						byte0 = 2;
						class58 = class58.method1028(5, (byte)120);
					}
					if((~k == -4 || k == 7) && (~k == -8 || Class33.anInt727 == 0 || ~Class33.anInt727 == -2 && Class33_Sub6_Sub4_Sub4.method356(true, class58)))
					{
						int l = 329 + -(13 * i);
						i++;
						int k1 = 4;
						class33_sub6_sub7_sub2.method464(Class33_Sub10.aClass58_2214, k1, -1 + l, 65535, 0);
						k1 += class33_sub6_sub7_sub2.method465(Class33_Sub10.aClass58_2214);
						k1 += class33_sub6_sub7_sub2.method467(32);
						if(byte0 == 1)
						{
							Class58.aClass33_Sub6_Sub7_Sub4Array1919[0].method502(k1, l - 12);
							k1 += 14;
						}
						if(byte0 == 2)
						{
							Class58.aClass33_Sub6_Sub7_Sub4Array1919[1].method502(k1, l - 12);
							k1 += 14;
						}
						class33_sub6_sub7_sub2.method464(Class35.method846((byte)-83, new Class58[] {
							class58, Class9.aClass58_175, Class33_Sub6_Sub17.aClass58Array3172[j]
						}), k1, l - 1, 65535, 0);
						if(~i <= -6)
							return;
					}
					if(~k == -6 && Class33.anInt727 < 2)
					{
						int i1 = 329 - 13 * i;
						class33_sub6_sub7_sub2.method464(Class33_Sub6_Sub17.aClass58Array3172[j], 4, -1 + i1, 65535, 0);
						if(~++i <= -6)
							return;
					}
					if(~k == -7 && Class33.anInt727 < 2)
					{
						int j1 = 329 + -(i * 13);
						class33_sub6_sub7_sub2.method464(Class35.method846((byte)-83, new Class58[] {
							Class80.aClass58_1739, Class33_Sub7.aClass58_2173, class58, Class9.aClass58_175, Class33_Sub6_Sub17.aClass58Array3172[j]
						}), 4, -1 + j1, 65535, 0);
						if(++i >= 5)
							return;
					}
				}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ha.K(" + arg0 + ')');
		}
	}

	public int method246(int arg0)
	{
		try
		{
			anInt1998++;
			if(aBoolean2000)
				return 100;
			if(super.anObjectArray664 != null)
				return 99;
			if(arg0 >= -52)
				return -11;
			int i = Class33_Sub6_Sub10.method524(255, anInt1993, -63);
			if(~i <= -101)
				i = 99;
			return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ha.A(" + arg0 + ')');
		}
	}

	public void method222(int arg0, byte arg1)
	{
		try
		{
			anInt2008++;
			if(arg1 != 91)
				aClass16_1995 = null;
			if(aClass12_2007 != null && aBooleanArray1988 != null && aBooleanArray1988[arg0])
			{
				Class81.method1208(aClass12_2007, arg0, this, (byte)-80);
				return;
			} else
			{
				Class33_Sub6_Sub4_Sub4.method351(arg0, true, super.anIntArray636[arg0], (byte)2, 18058, this, anInt1993);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ha.F(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method247(int arg0)
	{
		try
		{
			aClass16_1995 = null;
			aClass58_2014 = null;
			aClass58_2006 = null;
			aClass58_2012 = null;
			anIntArray2013 = null;
			if(arg0 != -15075)
				method245(-14);
			aClass58_1996 = null;
			aClass30_Sub1_1990 = null;
			aClass58_2010 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ha.D(" + arg0 + ')');
		}
	}

	public static void method248(boolean arg0, Class33_Sub15 arg1)
	{
		try
		{
			anInt1994++;
			int i = arg1.anInt2435 >> 0x2d03ae90;
			if(arg0)
				return;
			if(~i == ~Class45.anInt965 || i == Class81.anInt1744)
				Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
			if(~Class77_Sub2.anInt2644 == ~i || i == Class14.anIntArray274[Class30.anInt620])
				Class74.aBoolean1579 = true;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ha.C(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static Class33_Sub6_Sub5 method249(int arg0, byte arg1)
	{
		try
		{
			anInt2002++;
			Class33_Sub6_Sub5 class33_sub6_sub5 = (Class33_Sub6_Sub5)Class69.aClass16_1472.method144(0, arg0);
			if(class33_sub6_sub5 != null)
				return class33_sub6_sub5;
			byte abyte0[] = Class51.aClass30_1093.method238(false, arg0, 14);
			class33_sub6_sub5 = new Class33_Sub6_Sub5();
			if(abyte0 != null)
				class33_sub6_sub5.method402((byte)-65, new Class33_Sub11(abyte0));
			Class69.aClass16_1472.method145(arg0, (byte)-107, class33_sub6_sub5);
			if(arg1 > -26)
				return null;
			else
				return class33_sub6_sub5;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ha.E(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method250(boolean arg0, byte arg1[], boolean arg2, int arg3, int arg4)
	{
		if(arg4 < 12)
			method243((byte)125);
		anInt1992++;
		if(arg0)
		{
			if(aBoolean2000)
				throw new RuntimeException();
			if(aClass12_1999 != null)
				Applet_Sub1.method16(0, arg1, aClass12_1999, anInt1993);
			method224(arg1, false);
			method243((byte)-121);
			return;
		}
		arg1[arg1.length + -2] = (byte)(super.anIntArray616[arg3] >> 0x929c28);
		arg1[arg1.length - 1] = (byte)super.anIntArray616[arg3];
		if(aClass12_2007 != null)
		{
			Applet_Sub1.method16(0, arg1, aClass12_2007, arg3);
			aBooleanArray1988[arg3] = true;
		}
		if(arg2)
			super.anObjectArray664[arg3] = Class81.method1214(arg1, false, (byte)118);
	}

	public void method251(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt2001++;
			anInt1991 = arg1;
			if(arg0 > -79)
				method251(-116, 116, 49);
			anInt2009 = arg2;
			if(aClass12_1999 != null)
			{
				Class81.method1208(aClass12_1999, anInt1993, this, (byte)-92);
				return;
			} else
			{
				Class33_Sub6_Sub4_Sub4.method351(anInt1993, true, anInt2009, (byte)0, 18058, this, 255);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ha.B(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public boolean aBoolean1986;
	public static int anInt1987;
	public volatile boolean aBooleanArray1988[];
	public static int anInt1989;
	public static Class30_Sub1 aClass30_Sub1_1990;
	public int anInt1991;
	public static int anInt1992;
	public int anInt1993;
	public static int anInt1994;
	public static Class16 aClass16_1995 = new Class16(50);
	public static Class58 aClass58_1996;
	public int anInt1997;
	public static int anInt1998;
	public Class12 aClass12_1999;
	public volatile boolean aBoolean2000;
	public static int anInt2001;
	public static int anInt2002;
	public static int anInt2003;
	public static int anInt2004;
	public static int anInt2005;
	public static Class58 aClass58_2006;
	public Class12 aClass12_2007;
	public static int anInt2008;
	public int anInt2009;
	public static Class58 aClass58_2010 = Class33_Sub6_Sub11.method535(117, " steht bereits auf Ihrer Freunde)2Liste(Q");
	public static int anInt2011;
	public static Class58 aClass58_2012 = Class33_Sub6_Sub11.method535(112, "<col=ff7000>");
	public static int anIntArray2013[] = new int[200];
	public static Class58 aClass58_2014 = Class33_Sub6_Sub11.method535(122, ")1");

	static 
	{
		aClass58_1996 = Class33_Sub6_Sub11.method535(102, "Your account has been disabled)3");
		aClass58_2006 = aClass58_1996;
	}
}
