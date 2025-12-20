// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class73.java

import java.io.IOException;

public class Class73
{

	public static int method1150(int arg0, int arg1)
	{
		try
		{
			return arg0 ^ arg1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ua.C(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method1151(byte arg0)
	{
		try
		{
			anInt1556++;
			if(arg0 != 101)
			{
				return;
			} else
			{
				Class24.aClass15_509.method135(8);
				Class63.aClass33_Sub6_Sub7_Sub4_1355.method502(0, 0);
				Class33_Sub6_Sub7_Sub1.method433();
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ua.A(" + arg0 + ')');
		}
	}

	public static synchronized byte[] method1152(int arg0, int arg1)
	{
		try
		{
			anInt1555++;
			if(arg1 > -41)
				aClass58_1549 = null;
			if(arg0 == 100 && ~Class14.anInt280 < -1)
			{
				byte abyte0[] = Class82.aByteArrayArray1778[--Class14.anInt280];
				Class82.aByteArrayArray1778[Class14.anInt280] = null;
				return abyte0;
			}
			if(~arg0 == -5001 && ~Class33_Sub6_Sub4_Sub6.anInt3580 < -1)
			{
				byte abyte1[] = Class33_Sub12.aByteArrayArray2325[--Class33_Sub6_Sub4_Sub6.anInt3580];
				Class33_Sub12.aByteArrayArray2325[Class33_Sub6_Sub4_Sub6.anInt3580] = null;
				return abyte1;
			}
			if(arg0 == 30000 && ~Class33_Sub2.anInt2031 < -1)
			{
				byte abyte2[] = Class9.aByteArrayArray174[--Class33_Sub2.anInt2031];
				Class9.aByteArrayArray174[Class33_Sub2.anInt2031] = null;
				return abyte2;
			} else
			{
				return new byte[arg0];
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ua.B(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method1153(boolean arg0, int arg1)
	{
		try
		{
			anInt1562++;
			if(Class63.aClass43_1336 == null)
				return;
			if(arg1 < 65)
				method1154(-81);
			try
			{
				Class33_Sub11 class33_sub11 = new Class33_Sub11(4);
				class33_sub11.method640(arg0 ? 2 : 3, -11124);
				class33_sub11.method637(0, 990);
				Class63.aClass43_1336.method901((byte)42, class33_sub11.aByteArray2296, 4, 0);
				return;
			}
			catch(IOException _ex) { }
			try
			{
				Class63.aClass43_1336.method903(1);
			}
			catch(Exception _ex) { }
			Class63.aClass43_1336 = null;
			Class66.anInt1431++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ua.F(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method1154(int arg0)
	{
		try
		{
			anIntArray1559 = null;
			anIntArray1557 = null;
			aClass58_1547 = null;
			aClass58_1558 = null;
			aClass58_1561 = null;
			aClass30_Sub1_1554 = null;
			aClass58_1551 = null;
			if(arg0 != 4)
				method1155((byte)119);
			aClass58_1546 = null;
			aClass30_1550 = null;
			aClass58_1553 = null;
			aClass58_1549 = null;
			aClass58_1552 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ua.D(" + arg0 + ')');
		}
	}

	public static void method1155(byte arg0)
	{
		try
		{
			anInt1560++;
			Class59.method1067(1);
			Class33_Sub6_Sub4_Sub5.method365((byte)-60);
			if(~Class33_Sub12.anInt2313 == -3 || ~Class33_Sub12.anInt2313 == -6)
			{
				byte abyte0[] = Class58.aClass33_Sub6_Sub7_Sub4_1920.aByteArray3732;
				int ai[] = Class33_Sub6_Sub7.anIntArray2796;
				int k2 = abyte0.length;
				for(int i5 = 0; i5 < k2; i5++)
					if(~abyte0[i5] == -1)
						ai[i5] = 0;

				if(Class33_Sub12.anInt2313 < 3)
					Class37.aClass33_Sub6_Sub7_Sub3_832.method474(0, 0, 33, 33, 25, 25, Class65.anInt1394, 256, Class15_Sub2.anIntArray1982, Class65.anIntArray1384);
				Class66.method1100((byte)125);
				return;
			}
			int j = 48 - -(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 / 32);
			int i = Class65.anInt1394 - -Class23.anInt430 & 0x7ff;
			int l2 = 464 - ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 / 32;
			Class13.aClass33_Sub6_Sub7_Sub3_265.method474(25, 5, 146, 151, j, l2, i, 256 - -Class24.anInt504, Class33_Sub2.anIntArray2019, Class33_Sub6_Sub5.anIntArray2778);
			for(int j5 = 0; ~Class54.anInt1154 < ~j5; j5++)
			{
				int k = (-(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 / 32) + 4 * Class33_Sub6_Sub15.anIntArray3062[j5]) - -2;
				int i3 = (-(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 / 32) + Class33_Sub6_Sub4_Sub5.anIntArray3561[j5] * 4) - -2;
				Class77_Sub2.method1177(i3, false, Class54.aClass33_Sub6_Sub7_Sub3Array1157[j5], k);
			}

			for(int k5 = 0; ~k5 > -105; k5++)
			{
				for(int l5 = 0; l5 < 104; l5++)
				{
					Class4 class4 = Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][k5][l5];
					if(class4 != null)
					{
						int j3 = 4 * l5 + 2 + -(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 / 32);
						int l = 4 * k5 - (-2 + ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 / 32);
						Class77_Sub2.method1177(j3, false, Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub3Array2672[0], l);
					}
				}

			}

			for(int i6 = 0; i6 < Class33_Sub6_Sub1.anInt2659; i6++)
			{
				Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[Class80.anIntArray1730[i6]];
				if(class33_sub6_sub4_sub5_sub2 != null && class33_sub6_sub4_sub5_sub2.method366(true))
				{
					Class33_Sub6_Sub16 class33_sub6_sub16 = class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776;
					if(class33_sub6_sub16 != null && class33_sub6_sub16.anIntArray3071 != null)
						class33_sub6_sub16 = class33_sub6_sub16.method586(122);
					if(class33_sub6_sub16 != null && class33_sub6_sub16.aBoolean3083 && class33_sub6_sub16.aBoolean3070)
					{
						int k3 = -(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 / 32) + ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3510 / 32;
						int i1 = -(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 / 32) + ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3548 / 32;
						Class77_Sub2.method1177(k3, false, Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub3Array2672[1], i1);
					}
				}
			}

			if(arg0 > -118)
				aClass58_1561 = null;
			for(int j6 = 0; ~Class31.anInt697 < ~j6; j6++)
			{
				Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[Class33_Sub3.anIntArray2050[j6]];
				if(class33_sub6_sub4_sub5_sub1 != null && class33_sub6_sub4_sub5_sub1.method366(true))
				{
					int l3 = -(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 / 32) + ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3510 / 32;
					boolean flag = false;
					int j1 = -(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 / 32) + ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3548 / 32;
					long l6 = class33_sub6_sub4_sub5_sub1.aClass58_3755.method1062((byte)11);
					for(int j7 = 0; ~Class33_Sub6_Sub12.anInt2979 < ~j7; j7++)
					{
						if(l6 != Class47.aLongArray1032[j7] || Class30_Sub1.anIntArray2013[j7] == 0)
							continue;
						flag = true;
						break;
					}

					boolean flag1 = false;
					if(~Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.anInt3764 != -1 && class33_sub6_sub4_sub5_sub1.anInt3764 != 0 && Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.anInt3764 == class33_sub6_sub4_sub5_sub1.anInt3764)
						flag1 = true;
					if(flag)
						Class77_Sub2.method1177(l3, false, Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub3Array2672[3], j1);
					else
					if(flag1)
						Class77_Sub2.method1177(l3, false, Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub3Array2672[4], j1);
					else
						Class77_Sub2.method1177(l3, false, Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub3Array2672[2], j1);
				}
			}

			if(Class68.anInt1441 != 0 && ~(Class33_Sub6_Sub6.anInt2785 % 20) > -11)
			{
				if(~Class68.anInt1441 == -2 && ~Class59.anInt1275 <= -1 && ~Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887.length < ~Class59.anInt1275)
				{
					Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2_1 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[Class59.anInt1275];
					if(class33_sub6_sub4_sub5_sub2_1 != null)
					{
						int i4 = -(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 / 32) + ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_1)).anInt3510 / 32;
						int k1 = -(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 / 32) + ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_1)).anInt3548 / 32;
						Class13.method122(Class75.aClass33_Sub6_Sub7_Sub3Array1623[1], i4, k1, 3603);
					}
				}
				if(~Class68.anInt1441 == -3)
				{
					int j4 = 2 + ((Class33_Sub13_Sub4.anInt3315 - Class33_Sub2.anInt2036) * 4 + -(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 / 32));
					int l1 = 2 + (4 * (Class33_Sub21.anInt2617 + -Class69.anInt1475) + -(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 / 32));
					Class13.method122(Class75.aClass33_Sub6_Sub7_Sub3Array1623[1], j4, l1, 3603);
				}
				if(~Class68.anInt1441 == -11 && ~Class77.anInt1652 <= -1 && Class77.anInt1652 < Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715.length)
				{
					Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1_1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[Class77.anInt1652];
					if(class33_sub6_sub4_sub5_sub1_1 != null)
					{
						int i2 = ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1_1)).anInt3548 / 32 + -(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 / 32);
						int k4 = ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1_1)).anInt3510 / 32 - ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 / 32;
						Class13.method122(Class75.aClass33_Sub6_Sub7_Sub3Array1623[1], k4, i2, 3603);
					}
				}
			}
			if(Class44.anInt964 != 0)
			{
				int j2 = -(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 / 32) + (Class44.anInt964 * 4 - -2);
				int l4 = 4 * Class20.anInt387 - -2 - ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 / 32;
				Class77_Sub2.method1177(l4, false, Class75.aClass33_Sub6_Sub7_Sub3Array1623[0], j2);
			}
			Class33_Sub6_Sub7.method424(97, 78, 3, 3, 0xffffff);
			if(~Class33_Sub12.anInt2313 > -4)
			{
				Class37.aClass33_Sub6_Sub7_Sub3_832.method474(0, 0, 33, 33, 25, 25, Class65.anInt1394, 256, Class15_Sub2.anIntArray1982, Class65.anIntArray1384);
			} else
			{
				int ai1[] = Class33_Sub6_Sub7.anIntArray2796;
				byte abyte1[] = Class58.aClass33_Sub6_Sub7_Sub4_1920.aByteArray3732;
				for(int k6 = 0; ~k6 >= -34; k6++)
				{
					int i7 = Class58.aClass33_Sub6_Sub7_Sub4_1920.anInt3734 * k6;
					for(int k7 = 0; ~k7 >= -34; k7++)
						if(abyte1[k7 + i7] == 0)
							ai1[k7 + i7] = 0;

				}

			}
			Class66.method1100((byte)127);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ua.E(" + arg0 + ')');
		}
	}

	public static Class58 aClass58_1546 = Class33_Sub6_Sub11.method535(114, "<col=ffff00>*V");
	public static Class58 aClass58_1547 = Class33_Sub6_Sub11.method535(121, "W-=hlen Sie eine Option");
	public static int anInt1548;
	public static Class58 aClass58_1549 = Class33_Sub6_Sub11.method535(102, " Sekunde(Xn(Y -Ubertragen)3");
	public static Class30 aClass30_1550;
	public static Class58 aClass58_1551 = Class33_Sub6_Sub11.method535(120, ":duelreq:");
	public static Class58 aClass58_1552 = Class33_Sub6_Sub11.method535(121, "Benutzeroberfl-=che geladen)3");
	public static Class58 aClass58_1553;
	public static Class30_Sub1 aClass30_Sub1_1554;
	public static int anInt1555;
	public static int anInt1556;
	public static int anIntArray1557[] = {
		8, 11, 4, 6, 9, 7, 10
	};
	public static Class58 aClass58_1558;
	public static int anIntArray1559[] = new int[1000];
	public static int anInt1560;
	public static Class58 aClass58_1561 = Class33_Sub6_Sub11.method535(107, "::clientdrop");
	public static int anInt1562;

	static 
	{
		aClass58_1553 = Class33_Sub6_Sub11.method535(123, "Loading sprites )2 ");
		aClass58_1558 = aClass58_1553;
	}
}
