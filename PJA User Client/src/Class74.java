// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class74.java


public class Class74
{

	public static void method1156(int arg0)
	{
		try
		{
			aClass30_1577 = null;
			aClass58_1580 = null;
			if(arg0 != -1)
				method1157(22, -77, null, 70, null, true, 118);
			aClass58_1565 = null;
			aClass58_1576 = null;
			aClass58_1570 = null;
			anIntArray1569 = null;
			aClass58_1582 = null;
			aClass58_1571 = null;
			aClass58_1586 = null;
			aClass58_1585 = null;
			aClass58_1564 = null;
			aClass58_1566 = null;
			aClass58_1588 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ub.A(" + arg0 + ')');
		}
	}

	public static void method1157(int arg0, int arg1, Class58 arg2, int arg3, Class58 arg4, boolean arg5, int arg6)
	{
		try
		{
			if(!arg5)
				aClass58_1580 = null;
			anInt1567++;
			if(~Class14.anInt276 > -501)
			{
				if(~arg2.method1035(27) >= -1)
					Class39.aClass58Array868[Class14.anInt276] = arg4;
				else
					Class39.aClass58Array868[Class14.anInt276] = Class35.method846((byte)-83, new Class58[] {
						arg4, Class48.aClass58_1057, arg2
					});
				Class33_Sub6_Sub4_Sub1.anIntArray3357[Class14.anInt276] = arg1;
				Class33_Sub6_Sub9.anIntArray2820[Class14.anInt276] = arg6;
				Class51.anIntArray1100[Class14.anInt276] = arg0;
				Class71.anIntArray1524[Class14.anInt276] = arg3;
				Class14.anInt276++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ub.E(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ',' + (arg4 == null ? "null" : "{...}") + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public static boolean method1158(Class30 arg0, Class30 arg1, Class30 arg2, boolean arg3, Class33_Sub13_Sub4 arg4)
	{
		try
		{
			Class33_Sub7.aClass33_Sub13_Sub4_2164 = arg4;
			if(arg3)
			{
				return false;
			} else
			{
				Class15_Sub2.aClass30_1972 = arg0;
				aClass30_1577 = arg2;
				RuntimeException_Sub1.aClass30_1808 = arg1;
				anInt1578++;
				return true;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ub.B(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ',' + (arg4 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method1159(boolean arg0)
	{
		try
		{
			if(!arg0)
				aClass58_1588 = null;
			anInt1574++;
			Class33_Sub6_Sub4_Sub2.aClass77_3386.method1170((byte)-91);
			for(int i = 0; ~i > -33; i++)
				Class41.aLongArray907[i] = 0L;

			for(int j = 0; ~j > -33; j++)
				Class33_Sub6_Sub4_Sub4.aLongArray3466[j] = 0L;

			Class33_Sub11.anInt2277 = 0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ub.C(" + arg0 + ')');
		}
	}

	public Class74()
	{
		anInt1584 = -1;
	}

	public static int method1160(int arg0)
	{
		try
		{
			anInt1568++;
			if(arg0 != 2000)
				method1160(64);
			int i = 3;
			if(~Class33_Sub11.anInt2270 > -311)
			{
				int j = Class33_Sub6_Sub4_Sub5.anInt3509 >> 0x21f78147;
				int i1 = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 >> 0x79cef347;
				int l = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 >> 0xd75ac6a7;
				int k = Class58.anInt1907 >> 0xf5fe0e27;
				int k1;
				if(k < i1)
					k1 = -k + i1;
				else
					k1 = k + -i1;
				int j1;
				if(l <= j)
					j1 = -l + j;
				else
					j1 = l - j;
				if((Class35.aByteArrayArrayArray761[Class77_Sub2.anInt2645][j][k] & 4) != 0)
					i = Class77_Sub2.anInt2645;
				if(j1 > k1)
				{
					int l1 = (k1 * 0x10000) / j1;
					int j2 = 32768;
					while(j != l) 
					{
						if(~j <= ~l)
						{
							if(l < j)
								j--;
						} else
						{
							j++;
						}
						if(~(4 & Class35.aByteArrayArrayArray761[Class77_Sub2.anInt2645][j][k]) != -1)
							i = Class77_Sub2.anInt2645;
						j2 += l1;
						if(j2 >= 0x10000)
						{
							if(~i1 < ~k)
								k++;
							else
							if(~i1 > ~k)
								k--;
							j2 -= 0x10000;
							if((Class35.aByteArrayArrayArray761[Class77_Sub2.anInt2645][j][k] & 4) != 0)
								i = Class77_Sub2.anInt2645;
						}
					}
				} else
				{
					int k2 = 32768;
					int i2 = (0x10000 * j1) / k1;
					while(~k != ~i1) 
					{
						k2 += i2;
						if(~k > ~i1)
							k++;
						else
						if(~i1 > ~k)
							k--;
						if(~(4 & Class35.aByteArrayArrayArray761[Class77_Sub2.anInt2645][j][k]) != -1)
							i = Class77_Sub2.anInt2645;
						if(~k2 <= 0xfffeffff)
						{
							if(~j <= ~l)
							{
								if(j > l)
									j--;
							} else
							{
								j++;
							}
							k2 -= 0x10000;
							if((Class35.aByteArrayArrayArray761[Class77_Sub2.anInt2645][j][k] & 4) != 0)
								i = Class77_Sub2.anInt2645;
						}
					}
				}
			}
			if(~(Class35.aByteArrayArrayArray761[Class77_Sub2.anInt2645][((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 >> 0xf2701b67][((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 >> 0x8cfedde7] & 4) != -1)
				i = Class77_Sub2.anInt2645;
			return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ub.D(" + arg0 + ')');
		}
	}

	public int anIntArray1563[];
	public static Class58 aClass58_1564;
	public static Class58 aClass58_1565;
	public static Class58 aClass58_1566 = Class33_Sub6_Sub11.method535(107, " )2> <col=00ffff>");
	public static int anInt1567;
	public static int anInt1568;
	public static int anIntArray1569[] = new int[2000];
	public static Class58 aClass58_1570;
	public static Class58 aClass58_1571;
	public Class58 aClass58Array1572[];
	public static int anInt1573;
	public static int anInt1574;
	public static int anInt1575 = 1;
	public static Class58 aClass58_1576;
	public static Class30 aClass30_1577;
	public static int anInt1578;
	public static boolean aBoolean1579 = false;
	public static Class58 aClass58_1580 = Class33_Sub6_Sub11.method535(124, "Musik)2Engine vorbereitet)3");
	public Class33_Sub6_Sub10 aClass33_Sub6_Sub10_1581;
	public static Class58 aClass58_1582 = Class33_Sub6_Sub11.method535(102, "p11_full");
	public static boolean aBoolean1583 = false;
	public int anInt1584;
	public static Class58 aClass58_1585 = Class33_Sub6_Sub11.method535(115, "mapscene");
	public static Class58 aClass58_1586 = Class33_Sub6_Sub11.method535(103, "Wen m-Ochten Sie von der Liste entfernen?");
	public static int anInt1587 = 0;
	public static Class58 aClass58_1588 = Class33_Sub6_Sub11.method535(118, "Versteckt");

	static 
	{
		aClass58_1576 = Class33_Sub6_Sub11.method535(110, "Choose Option");
		aClass58_1565 = Class33_Sub6_Sub11.method535(127, "flash1:");
		aClass58_1571 = aClass58_1565;
		aClass58_1564 = aClass58_1576;
		aClass58_1570 = aClass58_1565;
	}
}
