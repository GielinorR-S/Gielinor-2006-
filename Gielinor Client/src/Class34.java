// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class34.java


public class Class34
	implements Interface1
{

	public void method834(int arg0, double arg1)
	{
		try
		{
			anInt1830++;
			aDouble1848 = arg1;
			int i = -128 % ((arg0 - -81) / 36);
			method835((byte)3);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kb.F(" + arg0 + ',' + arg1 + ')');
		}
	}

	public boolean method4(int arg0, int arg1)
	{
		try
		{
			anInt1837++;
			int i = -76 % ((34 - arg1) / 45);
			return ~anInt1843 == -65;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kb.B(" + arg0 + ',' + arg1 + ')');
		}
	}

	public boolean method2(int arg0, byte arg1)
	{
		try
		{
			anInt1831++;
			if(arg1 != 93)
				method835((byte)112);
			return aClass33_Sub17Array1842[arg0].aBoolean2503;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kb.C(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method835(byte arg0)
	{
		anInt1833++;
		for(int i = 0; ~aClass33_Sub17Array1842.length < ~i; i++)
			if(aClass33_Sub17Array1842[i] != null)
				aClass33_Sub17Array1842[i].method809();

		aClass4_1841 = new Class4();
		anInt1845 = anInt1847;
		if(arg0 != 3)
			method834(50, -1.6492331380164291D);
	}

	public int[] method3(boolean arg0, int arg1)
	{
		try
		{
			anInt1835++;
			Class33_Sub17 class33_sub17 = aClass33_Sub17Array1842[arg1];
			if(arg0)
				method838(86);
			if(class33_sub17 != null)
			{
				if(class33_sub17.anIntArray2497 != null)
				{
					aClass4_1841.method61(class33_sub17, 0);
					class33_sub17.aBoolean2506 = true;
					return class33_sub17.anIntArray2497;
				}
				boolean flag = class33_sub17.method807(aDouble1848, anInt1843, aClass30_1846);
				if(flag)
				{
					if(~anInt1845 != -1)
					{
						anInt1845--;
					} else
					{
						Class33_Sub17 class33_sub17_1 = (Class33_Sub17)aClass4_1841.method57(53);
						class33_sub17_1.method809();
					}
					aClass4_1841.method61(class33_sub17, 0);
					class33_sub17.aBoolean2506 = true;
					return class33_sub17.anIntArray2497;
				}
			}
			return null;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kb.I(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method836(int arg0, int arg1)
	{
		try
		{
			for(int i = arg0; ~aClass33_Sub17Array1842.length < ~i; i++)
			{
				Class33_Sub17 class33_sub17 = aClass33_Sub17Array1842[i];
				if(class33_sub17 != null && class33_sub17.anInt2498 != 0 && class33_sub17.aBoolean2506)
				{
					class33_sub17.method806(arg1);
					class33_sub17.aBoolean2506 = false;
				}
			}

			anInt1824++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kb.H(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method1(int arg0, byte arg1)
	{
		try
		{
			anInt1822++;
			int i = -92 % ((73 - arg1) / 37);
			if(aClass33_Sub17Array1842[arg0] != null)
				return aClass33_Sub17Array1842[arg0].anInt2496;
			else
				return 0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kb.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static Class58 method837(byte arg0, Class33_Sub15 arg1)
	{
		try
		{
			anInt1832++;
			if(~Class33.method268((byte)111, Class33_Sub6_Sub5.method403(arg1, -5447)) == -1)
				return null;
			if(arg0 <= 22)
				return null;
			if(arg1.aClass58_2378 == null || arg1.aClass58_2378.method1026((byte)49).method1035(27) == 0)
			{
				if(Class74.aBoolean1583)
					return Class45.aClass58_974;
				else
					return null;
			} else
			{
				return arg1.aClass58_2378;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kb.A(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method838(int arg0)
	{
		aClass58_1825 = null;
		aClass58_1829 = null;
		aClass58_1854 = null;
		aClass58_1851 = null;
		aClass82_1838 = null;
		aClass58_1840 = null;
		aClass33_Sub6_Sub7_Sub4Array1834 = null;
		aClass58_1853 = null;
		aClass58_1828 = null;
		anIntArray1827 = null;
		aClass58_1852 = null;
		aClass58_1823 = null;
		aClass58Array1849 = null;
		if(arg0 <= 88)
			method837((byte)-54, null);
	}

	public Class34(Class30 arg0, Class30 arg1, int arg2, double arg3, int arg4)
	{
		aClass4_1841 = new Class4();
		anInt1843 = 128;
		aDouble1848 = 1.0D;
		anInt1845 = 0;
		try
		{
			anInt1843 = arg4;
			aDouble1848 = arg3;
			anInt1847 = arg2;
			aClass30_1846 = arg1;
			anInt1845 = anInt1847;
			int ai[] = arg0.method237(0, true);
			int i = ai.length;
			aClass33_Sub17Array1842 = new Class33_Sub17[arg0.method218(0, false)];
			for(int j = 0; ~i < ~j; j++)
			{
				Class33_Sub11 class33_sub11 = new Class33_Sub11(arg0.method238(false, ai[j], 0));
				aClass33_Sub17Array1842[ai[j]] = new Class33_Sub17(class33_sub11);
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kb.<init>(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public static int anInt1822;
	public static Class58 aClass58_1823;
	public static int anInt1824;
	public static Class58 aClass58_1825;
	public static int anInt1826 = 0;
	public static int anIntArray1827[];
	public static Class58 aClass58_1828;
	public static Class58 aClass58_1829;
	public static int anInt1830;
	public static int anInt1831;
	public static int anInt1832;
	public static int anInt1833;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4Array1834[];
	public static int anInt1835;
	public static int anInt1836;
	public static int anInt1837;
	public static Class82 aClass82_1838 = new Class82(4096);
	public static int anInt1839 = 0;
	public static Class58 aClass58_1840 = Class33_Sub6_Sub11.method535(99, "sl_button");
	public Class4 aClass4_1841;
	public Class33_Sub17 aClass33_Sub17Array1842[];
	public int anInt1843;
	public static int anInt1844;
	public int anInt1845;
	public Class30 aClass30_1846;
	public int anInt1847;
	public double aDouble1848;
	public static Class58 aClass58Array1849[] = new Class58[100];
	public static int anInt1850 = 127;
	public static Class58 aClass58_1851 = Class33_Sub6_Sub11.method535(125, "null");
	public static Class58 aClass58_1852 = Class33_Sub6_Sub11.method535(119, "Wen m-Ochten Sie der Liste hinzuf-Ugen?");
	public static Class58 aClass58_1853 = Class33_Sub6_Sub11.method535(104, "Bitte geben Sie Ihren Benutzenamen ein)3");
	public static Class58 aClass58_1854 = Class33_Sub6_Sub11.method535(101, "bevor Sie die (WRegelversto-8 melden(W Option benutzen");
	public static int anInt1855 = 0;

	static 
	{
		aClass58_1825 = Class33_Sub6_Sub11.method535(105, "This world is full)3");
		aClass58_1828 = aClass58_1825;
		aClass58_1829 = Class33_Sub6_Sub11.method535(102, "RuneScape has been updated(Q");
		aClass58_1823 = aClass58_1829;
	}
}
