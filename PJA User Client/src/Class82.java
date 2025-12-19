// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class82.java

import java.io.IOException;

public class Class82
{

	public Class33 method1215(byte arg0)
	{
		try
		{
			if(arg0 != -79)
				aClass58_1804 = null;
			anInt1772++;
			if(anInt1797 > 0 && aClass33_1793 != aClass33Array1777[anInt1797 + -1])
			{
				Class33 class33 = aClass33_1793;
				aClass33_1793 = class33.aClass33_735;
				return class33;
			}
			while(~anInt1797 > ~anInt1780) 
			{
				Class33 class33_1 = aClass33Array1777[anInt1797++].aClass33_735;
				if(class33_1 != aClass33Array1777[anInt1797 - 1])
				{
					aClass33_1793 = class33_1.aClass33_735;
					return class33_1;
				}
			}
			return null;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wd.A(" + arg0 + ')');
		}
	}

	public static void method1216(byte arg0)
	{
		try
		{
			aClass33_Sub6_Sub7_Sub4_1802 = null;
			aClass16_1791 = null;
			anIntArray1786 = null;
			aClass58_1790 = null;
			aClass58_1801 = null;
			aClass58_1796 = null;
			anIntArray1795 = null;
			aClass58_1804 = null;
			aClass33_Sub6_Sub7_Sub4_1782 = null;
			aClass16_1798 = null;
			aClass58_1787 = null;
			int i = -63 / ((arg0 - 42) / 46);
			aBooleanArray1800 = null;
			aByteArrayArray1778 = null;
			aClass58_1799 = null;
			aClass58_1803 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wd.F(" + arg0 + ')');
		}
	}

	public static void method1217(int arg0, boolean arg1)
	{
		anInt1781++;
		Class59.method1067(1);
		Class33_Sub4.anInt2066++;
		if(~Class33_Sub4.anInt2066 > -51 && !arg1)
			return;
		Class33_Sub4.anInt2066 = arg0;
		if(!Class36.aBoolean802 && Class62.aClass43_1316 != null)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(183, arg0 ^ 0xfffffb52);
			Class33_Sub6_Sub17.anInt3153++;
			try
			{
				Class62.aClass43_1316.method901((byte)42, ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).aByteArray2296, ((Class33_Sub11) (Class46.aClass33_Sub11_Sub1_989)).anInt2239, 0);
				Class46.aClass33_Sub11_Sub1_989.anInt2239 = 0;
				return;
			}
			catch(IOException _ex)
			{
				Class36.aBoolean802 = true;
			}
		}
	}

	public void method1218(Class33 arg0, byte arg1, long arg2)
	{
		try
		{
			anInt1779++;
			if(arg0.aClass33_739 != null)
				arg0.method266(-72);
			Class33 class33 = aClass33Array1777[(int)(arg2 & (long)(-1 + anInt1780))];
			arg0.aClass33_735 = class33;
			arg0.aClass33_739 = class33.aClass33_739;
			int i = 16 / ((-25 - arg1) / 55);
			arg0.aClass33_739.aClass33_735 = arg0;
			arg0.aClass33_735.aClass33_739 = arg0;
			arg0.aLong747 = arg2;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wd.B(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public Class33 method1219(boolean arg0)
	{
		try
		{
			anInt1773++;
			if(arg0)
				method1215((byte)-88);
			if(aClass33_1775 == null)
				return null;
			for(Class33 class33 = aClass33Array1777[(int)(aLong1776 & (long)(-1 + anInt1780))]; aClass33_1775 != class33; aClass33_1775 = aClass33_1775.aClass33_735)
				if(aClass33_1775.aLong747 == aLong1776)
				{
					Class33 class33_1 = aClass33_1775;
					aClass33_1775 = aClass33_1775.aClass33_735;
					return class33_1;
				}

			aClass33_1775 = null;
			return null;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wd.E(" + arg0 + ')');
		}
	}

	public Class33 method1220(int arg0, long arg1)
	{
		try
		{
			aLong1776 = arg1;
			anInt1785++;
			Class33 class33 = aClass33Array1777[(int)(arg1 & (long)(-1 + anInt1780))];
			if(arg0 <= 4)
				anInt1789 = -105;
			for(aClass33_1775 = class33.aClass33_735; aClass33_1775 != class33; aClass33_1775 = aClass33_1775.aClass33_735)
				if(aClass33_1775.aLong747 == arg1)
				{
					Class33 class33_1 = aClass33_1775;
					aClass33_1775 = aClass33_1775.aClass33_735;
					return class33_1;
				}

			aClass33_1775 = null;
			return null;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wd.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33 method1221(int arg0)
	{
		try
		{
			anInt1797 = arg0;
			anInt1788++;
			return method1215((byte)-79);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wd.G(" + arg0 + ')');
		}
	}

	public Class82(int arg0)
	{
		anInt1797 = 0;
		try
		{
			aClass33Array1777 = new Class33[arg0];
			anInt1780 = arg0;
			for(int i = 0; ~i > ~arg0; i++)
			{
				Class33 class33 = aClass33Array1777[i] = new Class33();
				class33.aClass33_735 = class33;
				class33.aClass33_739 = class33;
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wd.<init>(" + arg0 + ')');
		}
	}

	public static int anInt1772;
	public static int anInt1773;
	public static int anInt1774 = 0;
	public Class33 aClass33_1775;
	public long aLong1776;
	public Class33 aClass33Array1777[];
	public static byte aByteArrayArray1778[][] = new byte[1000][];
	public static int anInt1779;
	public int anInt1780;
	public static int anInt1781;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_1782;
	public static int anInt1783;
	public static int anInt1784 = 0;
	public static int anInt1785;
	public static int anIntArray1786[];
	public static Class58 aClass58_1787;
	public static int anInt1788;
	public static int anInt1789 = 0;
	public static Class58 aClass58_1790;
	public static Class16 aClass16_1791 = new Class16(64);
	public static int anInt1792 = -1;
	public Class33 aClass33_1793;
	public static int anInt1794 = 0;
	public static int anIntArray1795[];
	public static Class58 aClass58_1796 = Class33_Sub6_Sub11.method535(109, "Ung-Ultige Session)2ID)3");
	public int anInt1797;
	public static Class16 aClass16_1798 = new Class16(30);
	public static Class58 aClass58_1799 = Class33_Sub6_Sub11.method535(123, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");
	public static boolean aBooleanArray1800[] = new boolean[5];
	public static Class58 aClass58_1801 = Class33_Sub6_Sub11.method535(125, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_1802;
	public static Class58 aClass58_1803 = Class33_Sub6_Sub11.method535(104, "gr-Un:");
	public static Class58 aClass58_1804 = Class33_Sub6_Sub11.method535(98, "Untersuchen");

	static 
	{
		aClass58_1790 = Class33_Sub6_Sub11.method535(117, "Cancel");
		aClass58_1787 = aClass58_1790;
		anIntArray1795 = new int[256];
		for(int j = 0; j < 256; j++)
		{
			int i = j;
			for(int k = 0; ~k > -9; k++)
				if((1 & i) == 1)
					i = 0xedb88320 ^ i >>> 0xed1c67c1;
				else
					i >>>= 1;

			anIntArray1795[j] = i;
		}

	}
}
