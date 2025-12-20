// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class77_Sub2.java

import java.awt.Component;

public class Class77_Sub2 extends Class77
{

	public void method1168(int arg0)
	{
		try
		{
			anInt2632++;
			anInt2629 = 0;
			anInt2634 = 1;
			anInt2621 = 256;
			aLong2630 = Class60.method1073(false);
			if(arg0 > -64)
				anInt2642 = -94;
			for(int i = 0; ~i > -11; i++)
				aLongArray2635[i] = aLong2630;

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "uc.D(" + arg0 + ')');
		}
	}

	public static int method1174(int arg0)
	{
		try
		{
			anInt2633++;
			if(arg0 != 480)
				method1179((byte)-64);
			return 19;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "uc.H(" + arg0 + ')');
		}
	}

	public static void method1175(boolean arg0)
	{
		anInt2628++;
		if(!arg0)
			aBoolean2639 = true;
		try
		{
			if(Class62.anInt1312 == 1)
			{
				int i = Class33_Sub7.aClass33_Sub13_Sub4_2164.method770(-122);
				if(~i < -1 && Class33_Sub7.aClass33_Sub13_Sub4_2164.method771(0x7f79e1))
				{
					i -= Class33_Sub12.anInt2321;
					if(~i > -1)
						i = 0;
					Class33_Sub7.aClass33_Sub13_Sub4_2164.method765(-2, i);
					return;
				}
				Class33_Sub7.aClass33_Sub13_Sub4_2164.method781(15);
				Class33_Sub7.aClass33_Sub13_Sub4_2164.method761((byte)-25);
				Class33_Sub6_Sub15.aClass26_3054 = null;
				if(Class38.aClass30_852 == null)
					Class62.anInt1312 = 0;
				else
					Class62.anInt1312 = 2;
				Class33_Sub6_Sub12.aClass33_Sub14_2963 = null;
				return;
			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
			Class33_Sub7.aClass33_Sub13_Sub4_2164.method781(15);
			Class62.anInt1312 = 0;
			Class38.aClass30_852 = null;
			Class33_Sub6_Sub12.aClass33_Sub14_2963 = null;
			Class33_Sub6_Sub15.aClass26_3054 = null;
		}
	}

	public static void method1176(int arg0, int arg1)
	{
		try
		{
			Class68.method1107(arg1, 0x1fffee61);
			if(arg0 >= -64)
			{
				return;
			} else
			{
				anInt2638++;
				Class19.method168((byte)-98, arg1);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "uc.I(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method1177(int arg0, boolean arg1, Class33_Sub6_Sub7_Sub3 arg2, int arg3)
	{
		try
		{
			anInt2627++;
			if(arg2 == null)
				return;
			int i = Class23.anInt430 + Class65.anInt1394 & 0x7ff;
			int j = arg3 * arg3 - -(arg0 * arg0);
			if(j > 6400)
				return;
			int k = Class33_Sub6_Sub7_Sub1.anIntArray3681[i];
			int l = Class33_Sub6_Sub7_Sub1.anIntArray3678[i];
			l = (l * 256) / (256 + Class24.anInt504);
			k = (k * 256) / (256 + Class24.anInt504);
			if(arg1)
				aClass58_2625 = null;
			int i1 = l * arg3 + arg0 * k >> 0x86e96a10;
			int j1 = -(arg3 * k) + l * arg0 >> 0x9ef16a90;
			if(j <= 2500)
			{
				arg2.method478(-(arg2.anInt3728 / 2) + (94 + i1) + 4, -4 + -(arg2.anInt3726 / 2) + (-j1 + 83));
				return;
			} else
			{
				arg2.method481(Class58.aClass33_Sub6_Sub7_Sub4_1920, -(arg2.anInt3728 / 2) + i1 + 94 + 4, (83 - (j1 - -(arg2.anInt3726 / 2))) + -4);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "uc.E(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ')');
		}
	}

	public static void method1178(Class33_Sub6_Sub7_Sub2 arg0, int arg1, Class33_Sub6_Sub7_Sub2 arg2)
	{
		try
		{
			if(Class65.aClass33_Sub6_Sub7_Sub3Array1387 == null)
				Class65.aClass33_Sub6_Sub7_Sub3Array1387 = Class33_Sub13_Sub3.method744(-96, Class63.aClass58_1346, Class27.aClass58_558, Class33_Sub6_Sub16.aClass30_Sub1_3092);
			if(Class12.aClass33_Sub6_Sub7_Sub4Array232 == null)
				Class12.aClass33_Sub6_Sub7_Sub4Array232 = Class33_Sub6_Sub10.method526(true, Class33_Sub6_Sub16.aClass30_Sub1_3092, Class11.aClass58_200, Class63.aClass58_1346);
			if(Class34.aClass33_Sub6_Sub7_Sub4Array1834 == null)
				Class34.aClass33_Sub6_Sub7_Sub4Array1834 = Class33_Sub6_Sub10.method526(true, Class33_Sub6_Sub16.aClass30_Sub1_3092, Applet_Sub1.aClass58_17, Class63.aClass58_1346);
			if(Class81.aClass33_Sub6_Sub7_Sub4Array1759 == null)
				Class81.aClass33_Sub6_Sub7_Sub4Array1759 = Class33_Sub6_Sub10.method526(true, Class33_Sub6_Sub16.aClass30_Sub1_3092, Class26.aClass58_538, Class63.aClass58_1346);
			anInt2624++;
			Class33_Sub6_Sub7.method424(0, 23, 765, 480, 0);
			Class33_Sub6_Sub7.method426(0, 0, 125, 23, 0xbd9839, 0x8b6608);
			Class33_Sub6_Sub7.method426(125, 0, 640, arg1, 0x4f4f4f, 0x292929);
			arg2.method459(Class62.aClass58_1323, 62, 15, 0, -1);
			if(Class81.aClass33_Sub6_Sub7_Sub4Array1759 != null)
			{
				Class81.aClass33_Sub6_Sub7_Sub4Array1759[1].method502(140, 1);
				arg0.method464(Class35.aClass58_764, 152, 10, 0xffffff, -1);
				Class81.aClass33_Sub6_Sub7_Sub4Array1759[0].method502(140, 12);
				arg0.method464(Class33_Sub3.aClass58_2043, 152, 21, 0xffffff, -1);
			}
			if(Class34.aClass33_Sub6_Sub7_Sub4Array1834 != null)
			{
				char c1 = '\u0186';
				char c2 = '\u01F4';
				char c = '\u0118';
				if(Class40.anIntArray893[0] == 0 && ~Class81.anIntArray1742[0] == -1)
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[2].method502(c, 4);
				else
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[0].method502(c, 4);
				if(~Class40.anIntArray893[0] == -1 && Class81.anIntArray1742[0] == 1)
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[3].method502(15 + c, 4);
				else
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[1].method502(c + 15, 4);
				char c3 = '\u0262';
				arg2.method464(Class33_Sub6_Sub13.aClass58_2990, c - -32, 17, 0xffffff, -1);
				if(~Class40.anIntArray893[0] == -2 && ~Class81.anIntArray1742[0] == -1)
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[2].method502(c1, 4);
				else
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[0].method502(c1, 4);
				if(~Class40.anIntArray893[0] != -2 || Class81.anIntArray1742[0] != 1)
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[1].method502(c1 + 15, 4);
				else
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[3].method502(c1 - -15, 4);
				arg2.method464(Class12.aClass58_211, c1 + 32, 17, 0xffffff, -1);
				if(Class40.anIntArray893[0] == 2 && Class81.anIntArray1742[0] == 0)
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[2].method502(c2, 4);
				else
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[0].method502(c2, 4);
				if(~Class40.anIntArray893[0] == -3 && Class81.anIntArray1742[0] == 1)
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[3].method502(c2 + 15, 4);
				else
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[1].method502(c2 + 15, 4);
				arg2.method464(Class33_Sub6_Sub4_Sub1.aClass58_3340, c2 + 32, 17, 0xffffff, -1);
				if(~Class40.anIntArray893[0] != -4 || ~Class81.anIntArray1742[0] != -1)
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[0].method502(c3, 4);
				else
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[2].method502(c3, 4);
				if(~Class40.anIntArray893[0] == -4 && ~Class81.anIntArray1742[0] == -2)
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[3].method502(15 + c3, 4);
				else
					Class34.aClass33_Sub6_Sub7_Sub4Array1834[1].method502(15 + c3, 4);
				arg2.method464(Class33_Sub6_Sub4_Sub5_Sub1.aClass58_3759, c3 - -32, 17, 0xffffff, -1);
			}
			Class33_Sub6_Sub7.method424(708, 4, 50, 16, 0);
			arg0.method459(Class82.aClass58_1787, 733, 16, 0xffffff, -1);
			Canvas_Sub1.anInt49 = -1;
			if(Class65.aClass33_Sub6_Sub7_Sub3Array1387 != null)
			{
				byte byte0 = 88;
				byte byte1 = 19;
				int i = 765 / (1 + byte0);
				int j = 480 / (1 + byte1);
				int k;
				int l;
				do
				{
					l = i;
					if(Class33_Sub13_Sub3.anInt3253 <= (-1 + i) * j)
						i--;
					k = j;
					if(~Class33_Sub13_Sub3.anInt3253 >= ~((-1 + j) * i))
						j--;
					if(Class33_Sub13_Sub3.anInt3253 <= i * (j - 1))
						j--;
				} while(~j != ~k || l != i);
				k = (-(byte0 * i) + 765) / (1 + i);
				if(k > 5)
					k = 5;
				l = (-(byte1 * j) + 480) / (j + 1);
				if(~l < -6)
					l = 5;
				int i1 = (765 + -(byte0 * i) + -((-1 + i) * k)) / 2;
				int i2 = 0;
				int l1 = i1;
				int j1 = (480 - byte1 * j - (j - 1) * l) / 2;
				int k1 = j1 + 23;
				for(int j2 = 0; j2 < Class33_Sub13_Sub3.anInt3253; j2++)
				{
					Class17 class17 = Class33_Sub3.aClass17Array2060[j2];
					boolean flag = true;
					Class58 class58 = Class37.method859(15591, class17.anInt345);
					if(~class17.anInt345 != 0)
					{
						if(~class17.anInt345 < -1981)
						{
							class58 = Class44.aClass58_957;
							flag = false;
						}
					} else
					{
						flag = false;
						class58 = Class65.aClass58_1397;
					}
					if(~l1 < ~Applet_Sub1.anInt41 || ~k1 < ~Class13.anInt254 || ~(byte0 + l1) >= ~Applet_Sub1.anInt41 || ~Class13.anInt254 <= ~(k1 - -byte1) || !flag)
					{
						Class65.aClass33_Sub6_Sub7_Sub3Array1387[class17.aBoolean339 ? 1 : 0].method494(l1, k1);
					} else
					{
						Canvas_Sub1.anInt49 = j2;
						Class65.aClass33_Sub6_Sub7_Sub3Array1387[class17.aBoolean339 ? 1 : 0].method486(l1, k1, 128, 0xffffff);
					}
					if(Class12.aClass33_Sub6_Sub7_Sub4Array232 != null)
						Class12.aClass33_Sub6_Sub7_Sub4Array232[class17.anInt335 + (class17.aBoolean339 ? 8 : 0)].method502(l1 - -29, k1);
					arg2.method459(Class37.method859(15591, class17.anInt352), l1 + 15, (k1 - -(byte1 / 2)) + 5, 0, -1);
					arg0.method459(class58, l1 + 60, 5 + (byte1 / 2 + k1), 0xfffffff, -1);
					k1 += byte1 + l;
					if(~j >= ~++i2)
					{
						k1 = 23 - -j1;
						i2 = 0;
						l1 += byte0 + k;
					}
				}

			}
			try
			{
				java.awt.Graphics g = Class33_Sub6_Sub4_Sub1.aCanvas3367.getGraphics();
				Canvas_Sub1.aClass15_64.method131(0, 0, (byte)78, g);
				return;
			}
			catch(Exception _ex)
			{
				Class33_Sub6_Sub4_Sub1.aCanvas3367.repaint();
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "uc.G(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method1179(byte arg0)
	{
		try
		{
			aClass58_2625 = null;
			int i = 36 % ((-43 - arg0) / 63);
			aClass33_Sub11_2637 = null;
			aClass33_Sub6_Sub7_Sub4_2623 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "uc.A(" + arg0 + ')');
		}
	}

	public void method1170(byte arg0)
	{
		try
		{
			anInt2622++;
			if(arg0 > -39)
				method1177(-109, true, null, -47);
			for(int i = 0; i < 10; i++)
				aLongArray2635[i] = 0L;

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "uc.C(" + arg0 + ')');
		}
	}

	public int method1172(int arg0, int arg1, int arg2)
	{
		try
		{
			int i = anInt2621;
			anInt2636++;
			anInt2621 = 300;
			int j = anInt2634;
			anInt2634 = 1;
			aLong2630 = Class60.method1073(false);
			if(aLongArray2635[anInt2631] == 0L)
			{
				anInt2621 = i;
				anInt2634 = j;
			} else
			if(~aLongArray2635[anInt2631] > ~aLong2630)
				anInt2621 = (int)((long)(2560 * arg1) / (-aLongArray2635[anInt2631] + aLong2630));
			if(anInt2621 < 25)
				anInt2621 = 25;
			if(~anInt2621 < -257)
			{
				anInt2621 = 256;
				anInt2634 = (int)((long)arg1 - (-aLongArray2635[anInt2631] + aLong2630) / 10L);
			}
			if(anInt2634 > arg1)
				anInt2634 = arg1;
			if(arg0 != 0x69abdc08)
				aClass33_Sub11_2637 = null;
			aLongArray2635[anInt2631] = aLong2630;
			anInt2631 = (1 + anInt2631) % 10;
			if(anInt2634 > 1)
			{
				for(int k = 0; k < 10; k++)
					if(~aLongArray2635[k] != -1L)
						aLongArray2635[k] = (long)anInt2634 + aLongArray2635[k];

			}
			if(~arg2 < ~anInt2634)
				anInt2634 = arg2;
			int l = 0;
			Class33_Sub6_Sub17.method593(0, anInt2634);
			for(; anInt2629 < 256; anInt2629 += anInt2621)
				l++;

			anInt2629 &= 0xff;
			return l;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "uc.B(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public Class77_Sub2()
	{
		aLongArray2635 = new long[10];
		try
		{
			method1168(-93);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "uc.<init>(" + ')');
		}
	}

	public int anInt2621;
	public static int anInt2622;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_2623;
	public static int anInt2624;
	public static Class58 aClass58_2625 = Class33_Sub6_Sub11.method535(104, "rot:");
	public static int anInt2626;
	public static int anInt2627;
	public static int anInt2628;
	public int anInt2629;
	public long aLong2630;
	public int anInt2631;
	public static int anInt2632;
	public static int anInt2633;
	public int anInt2634;
	public long aLongArray2635[];
	public static int anInt2636;
	public static Class33_Sub11 aClass33_Sub11_2637 = new Class33_Sub11(8);
	public static int anInt2638;
	public static boolean aBoolean2639 = false;
	public static int anInt2640 = 0;
	public static int anInt2641;
	public static int anInt2642;
	public static int anInt2643 = 2;
	public static int anInt2644 = -1;
	public static int anInt2645;

}
