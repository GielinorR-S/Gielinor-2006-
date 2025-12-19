// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub9.java

import java.awt.Component;

public class Class33_Sub6_Sub9 extends Class33_Sub6
{

	public static void method513(int arg0)
	{
		try
		{
			if(arg0 < 59)
				aClass58_2834 = null;
			anInt2830++;
			Class59.method1067(1);
			Class3.aBoolean113 = true;
			Class73.method1151((byte)101);
			if(Class33_Sub10.aBoolean2208)
			{
				Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(Class33_Sub13_Sub4.aClass58_3286, 239, 40, 0, -1);
				Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(Class35.method846((byte)-83, new Class58[] {
					Class33_Sub6_Sub7_Sub2.method451(Class33_Sub13_Sub4.aClass58_3322), Class11.aClass58_201
				}), 239, 60, 128, -1);
			} else
			if(~Class33_Sub20.anInt2567 != -2)
			{
				if(Class33_Sub20.anInt2567 == 2)
				{
					Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(Class58.aClass58_1914, 239, 40, 0, -1);
					Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(Class35.method846((byte)-83, new Class58[] {
						Class33_Sub6_Sub7_Sub2.method451(Class33_Sub13_Sub4.aClass58_3303), Class11.aClass58_201
					}), 239, 60, 128, -1);
				} else
				if(~Class33_Sub20.anInt2567 != -4)
				{
					if(Class33_Sub20.anInt2567 == 4)
					{
						Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(Class33_Sub13_Sub4.aClass58_3310, 239, 40, 0, -1);
						Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(Class35.method846((byte)-83, new Class58[] {
							Class33_Sub6_Sub7_Sub2.method451(Class33_Sub13_Sub4.aClass58_3303), Class11.aClass58_201
						}), 239, 60, 128, -1);
					} else
					if(Class79.aClass58_1700 == null)
					{
						if(Class45.anInt965 != -1)
						{
							boolean flag = Class33_Sub2.method275(2, -19850, Class45.anInt965, 479, 0, 96, 0);
							if(!flag)
								Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						} else
						if(~Class81.anInt1744 != 0)
						{
							boolean flag1 = Class33_Sub2.method275(3, -19850, Class81.anInt1744, 479, 0, 96, 0);
							if(!flag1)
								Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
						} else
						{
							Class33_Sub6_Sub7_Sub2 class33_sub6_sub7_sub2 = Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677;
							Class33_Sub6_Sub7.method422(0, 0, 463, 77);
							int i = 0;
							for(int k = 0; ~k > -101; k++)
								if(Class33_Sub6_Sub17.aClass58Array3172[k] != null)
								{
									int i1 = Class33.anIntArray738[k];
									int j1 = Canvas_Sub1.anInt61 + (-(14 * i) + 70);
									Class58 class58_1 = Class33_Sub11_Sub1.aClass58Array3211[k];
									byte byte0 = 0;
									if(class58_1 != null && class58_1.method1052(Class24.aClass58_513, -79))
									{
										class58_1 = class58_1.method1028(5, (byte)120);
										byte0 = 1;
									}
									if(class58_1 != null && class58_1.method1052(Class33_Sub20.aClass58_2564, -95))
									{
										class58_1 = class58_1.method1028(5, (byte)120);
										byte0 = 2;
									}
									if(i1 == 0)
									{
										i++;
										if(~j1 < -1 && j1 < 110)
											class33_sub6_sub7_sub2.method464(Class33_Sub6_Sub17.aClass58Array3172[k], 4, j1, 0, -1);
									}
									if((~i1 == -2 || i1 == 2) && (i1 == 1 || Class17.anInt350 == 0 || ~Class17.anInt350 == -2 && Class33_Sub6_Sub4_Sub4.method356(true, class58_1)))
									{
										if(j1 > 0 && ~j1 > -111)
										{
											int k1 = 4;
											if(byte0 == 1)
											{
												Class58.aClass33_Sub6_Sub7_Sub4Array1919[0].method502(k1, j1 - 12);
												k1 += 14;
											}
											if(byte0 == 2)
											{
												Class58.aClass33_Sub6_Sub7_Sub4Array1919[1].method502(k1, j1 - 12);
												k1 += 14;
											}
											class33_sub6_sub7_sub2.method464(Class35.method846((byte)-83, new Class58[] {
												class58_1, Class19.aClass58_372
											}), k1, j1, 0, -1);
											k1 += 8 + class33_sub6_sub7_sub2.method465(class58_1);
											class33_sub6_sub7_sub2.method464(Class33_Sub6_Sub17.aClass58Array3172[k], k1, j1, 255, -1);
										}
										i++;
									}
									if((i1 == 3 || ~i1 == -8) && Class33_Sub9.anInt2195 == 0 && (i1 == 7 || ~Class33.anInt727 == -1 || ~Class33.anInt727 == -2 && Class33_Sub6_Sub4_Sub4.method356(true, class58_1)))
									{
										if(j1 > 0 && ~j1 > -111)
										{
											int l1 = 4;
											class33_sub6_sub7_sub2.method464(Class33_Sub10.aClass58_2214, l1, j1, 0, -1);
											l1 += class33_sub6_sub7_sub2.method465(Class33_Sub10.aClass58_2214);
											l1 += class33_sub6_sub7_sub2.method467(32);
											if(byte0 == 1)
											{
												Class58.aClass33_Sub6_Sub7_Sub4Array1919[0].method502(l1, j1 + -12);
												l1 += 14;
											}
											if(byte0 == 2)
											{
												Class58.aClass33_Sub6_Sub7_Sub4Array1919[1].method502(l1, -12 + j1);
												l1 += 14;
											}
											class33_sub6_sub7_sub2.method464(Class35.method846((byte)-83, new Class58[] {
												class58_1, Class19.aClass58_372
											}), l1, j1, 0, -1);
											l1 += class33_sub6_sub7_sub2.method465(class58_1) - -8;
											class33_sub6_sub7_sub2.method464(Class33_Sub6_Sub17.aClass58Array3172[k], l1, j1, 0x800000, -1);
										}
										i++;
									}
									if(i1 == 4 && (Class33_Sub6_Sub12.anInt2974 == 0 || ~Class33_Sub6_Sub12.anInt2974 == -2 && Class33_Sub6_Sub4_Sub4.method356(true, class58_1)))
									{
										i++;
										if(~j1 < -1 && ~j1 > -111)
											class33_sub6_sub7_sub2.method464(Class35.method846((byte)-83, new Class58[] {
												class58_1, Class33_Sub7.aClass58_2173, Class33_Sub6_Sub17.aClass58Array3172[k]
											}), 4, j1, 0x800080, -1);
									}
									if(~i1 == -6 && Class33_Sub9.anInt2195 == 0 && Class33.anInt727 < 2)
									{
										if(j1 > 0 && ~j1 > -111)
											class33_sub6_sub7_sub2.method464(Class33_Sub6_Sub17.aClass58Array3172[k], 4, j1, 0x800000, -1);
										i++;
									}
									if(i1 == 6 && ~Class33_Sub9.anInt2195 == -1 && Class33.anInt727 < 2)
									{
										if(~j1 < -1 && ~j1 > -111)
										{
											class33_sub6_sub7_sub2.method464(Class35.method846((byte)-83, new Class58[] {
												Class80.aClass58_1739, Class33_Sub7.aClass58_2173, class58_1, Class19.aClass58_372
											}), 4, j1, 0, -1);
											class33_sub6_sub7_sub2.method464(Class33_Sub6_Sub17.aClass58Array3172[k], 12 - -class33_sub6_sub7_sub2.method465(Class35.method846((byte)-83, new Class58[] {
												Class80.aClass58_1739, Class33_Sub7.aClass58_2173, class58_1
											})), j1, 0x800000, -1);
										}
										i++;
									}
									if(i1 == 8 && (Class33_Sub6_Sub12.anInt2974 == 0 || Class33_Sub6_Sub12.anInt2974 == 1 && Class33_Sub6_Sub4_Sub4.method356(true, class58_1)))
									{
										i++;
										if(j1 > 0 && j1 < 110)
											class33_sub6_sub7_sub2.method464(Class35.method846((byte)-83, new Class58[] {
												class58_1, Class33_Sub7.aClass58_2173, Class33_Sub6_Sub17.aClass58Array3172[k]
											}), 4, j1, 0x7e3200, -1);
									}
								}

							Class33_Sub6_Sub7.method427();
							Class62.anInt1308 = 7 + 14 * i;
							if(Class62.anInt1308 < 78)
								Class62.anInt1308 = 78;
							Class33_Sub6_Sub13.method561(77, 463, Class62.anInt1308 + (-Canvas_Sub1.anInt61 - 77), (byte)113, 0, Class62.anInt1308);
							Class58 class58;
							if(Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305 == null || Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.aClass58_3755 == null)
								class58 = Class63.aClass58_1350;
							else
								class58 = Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.aClass58_3755;
							class33_sub6_sub7_sub2.method464(Class35.method846((byte)-83, new Class58[] {
								class58, Class19.aClass58_372
							}), 4, 90, 0, -1);
							class33_sub6_sub7_sub2.method464(Class35.method846((byte)-83, new Class58[] {
								Class33_Sub6_Sub7_Sub2.method451(Class33_Sub13_Sub4.aClass58_3316), Class11.aClass58_201
							}), 6 - -class33_sub6_sub7_sub2.method465(Class35.method846((byte)-83, new Class58[] {
								class58, Class9.aClass58_175
							})), 90, 255, -1);
							Class33_Sub6_Sub7.method416(0, 77, 479, 0);
						}
					} else
					{
						Class75.aClass33_Sub6_Sub7_Sub2_1632.method453(Class79.aClass58_1700, 10, 20, 459, 40, 0, -1, 1, 1, 0);
						Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(Class29.aClass58_590, 239, 80, 128, -1);
					}
				} else
				{
					if(Class33_Sub13_Sub4.aClass58_3275 != Class33_Sub13_Sub4.aClass58_3303)
					{
						Class33_Sub6_Sub8.method506(Class33_Sub13_Sub4.aClass58_3303, (byte)125);
						Class33_Sub13_Sub4.aClass58_3275 = Class33_Sub13_Sub4.aClass58_3303;
					}
					Class33_Sub6_Sub7_Sub2 class33_sub6_sub7_sub2_1 = Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677;
					Class33_Sub6_Sub7.method422(0, 0, 463, 77);
					for(int j = 0; j < Class33_Sub6_Sub4_Sub5_Sub1.anInt3744; j++)
					{
						int l = j * 14 + 18 + -Canvas_Sub1.anInt56;
						if(~l < -1 && l < 110)
							class33_sub6_sub7_sub2_1.method459(Class34.aClass58Array1849[j], 239, l, 0, -1);
					}

					Class33_Sub6_Sub7.method427();
					if(~Class33_Sub6_Sub4_Sub5_Sub1.anInt3744 < -6)
						Class33_Sub6_Sub13.method561(77, 463, Canvas_Sub1.anInt56, (byte)67, 0, Class33_Sub6_Sub4_Sub5_Sub1.anInt3744 * 14 + 7);
					if(Class33_Sub13_Sub4.aClass58_3303.method1035(27) != 0)
					{
						if(~Class33_Sub6_Sub4_Sub5_Sub1.anInt3744 == -1)
							Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(Class47.aClass58_1044, 239, 40, 0, -1);
					} else
					{
						Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3787, 239, 40, 255, -1);
					}
					class33_sub6_sub7_sub2_1.method459(Class35.method846((byte)-83, new Class58[] {
						Class33_Sub6_Sub7_Sub2.method451(Class33_Sub13_Sub4.aClass58_3303), Class11.aClass58_201
					}), 239, 90, 0, -1);
					Class33_Sub6_Sub7.method416(0, 77, 479, 0);
				}
			} else
			{
				Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(Class63.aClass58_1329, 239, 40, 0, -1);
				Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(Class35.method846((byte)-83, new Class58[] {
					Class33_Sub6_Sub7_Sub2.method451(Class33_Sub13_Sub4.aClass58_3303), Class11.aClass58_201
				}), 239, 60, 128, -1);
			}
			if(Class33_Sub6_Sub4_Sub4.aBoolean3486 && ~Class33_Sub6.anInt2127 == -3)
				Class33_Sub6_Sub4_Sub5_Sub2.method373(112);
			Class49.method932(true);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "id.C(" + arg0 + ')');
		}
	}

	public void method514(int arg0, Class33_Sub11 arg1, int arg2)
	{
		if(arg0 == 1)
			anInt2848 = arg1.method666(38);
		else
		if(~arg0 != -3)
		{
			if(arg0 != 4)
			{
				if(~arg0 == -6)
					anInt2854 = arg1.method666(32);
				else
				if(arg0 == 6)
					anInt2843 = arg1.method666(arg2 + 39);
				else
				if(arg0 != 7)
				{
					if(~arg0 == -9)
						anInt2842 = arg1.method639((byte)123);
					else
					if(~arg0 <= -41 && ~arg0 > -51)
						aShortArray2826[-40 + arg0] = (short)arg1.method666(110);
					else
					if(~arg0 <= -51 && arg0 < 60)
						aShortArray2831[arg0 - 50] = (short)arg1.method666(95);
				} else
				{
					anInt2825 = arg1.method639((byte)123);
				}
			} else
			{
				anInt2853 = arg1.method666(52);
			}
		} else
		{
			anInt2849 = arg1.method666(68);
		}
		anInt2856++;
		if(arg2 != 0)
			aClass58_2833 = null;
	}

	public static void method515(int arg0)
	{
		try
		{
			aClass58_2836 = null;
			aClass58_2846 = null;
			aClass58_2839 = null;
			anIntArray2820 = null;
			aClass58_2823 = null;
			aClass58_2824 = null;
			aClass58_2840 = null;
			aClass58_2847 = null;
			aClass58_2832 = null;
			aClass58_2829 = null;
			aClass58_2838 = null;
			aClass58Array2835 = null;
			aClass58_2833 = null;
			if(arg0 > -1)
				method515(-120);
			aClass58_2827 = null;
			aClass58_2845 = null;
			aClass58_2841 = null;
			aClass58_2834 = null;
			aClass58_2828 = null;
			aClass58_2837 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "id.A(" + arg0 + ')');
		}
	}

	public void method516(Class33_Sub11 arg0, byte arg1)
	{
		try
		{
			if(arg1 < 41)
				method518(-47, true);
			anInt2819++;
			do
			{
				int i = arg0.method639((byte)123);
				if(i != 0)
					method514(i, arg0, 0);
				else
					return;
			} while(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "id.F(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static void method517(int arg0)
	{
		try
		{
			anInt2852++;
			try
			{
				if(arg0 != 14)
					anInt2855 = 107;
				java.awt.Graphics g = Class33_Sub6_Sub4_Sub1.aCanvas3367.getGraphics();
				Class33_Sub6_Sub17.aClass15_3124.method131(0, 4, (byte)78, g);
				Class33_Sub6_Sub13.aClass15_2991.method131(0, 357, (byte)78, g);
				Class33_Sub11.aClass15_2241.method131(722, 4, (byte)78, g);
				Class17.aClass15_346.method131(743, 205, (byte)78, g);
				Class3.aClass15_116.method131(0, 0, (byte)78, g);
				Canvas_Sub1.aClass15_66.method131(516, 4, (byte)78, g);
				Class41.aClass15_899.method131(516, 205, (byte)78, g);
				Class33_Sub6_Sub12.aClass15_2959.method131(496, 357, (byte)78, g);
				Class13.aClass15_252.method131(0, 338, (byte)78, g);
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
			throw Class33.method263(runtimeexception, "id.B(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub3 method518(int arg0, boolean arg1)
	{
		try
		{
			anInt2821++;
			if(arg1)
				anInt2855 = 3;
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = (Class33_Sub6_Sub4_Sub3)Class82.aClass16_1798.method144(0, anInt2822);
			if(class33_sub6_sub4_sub3 == null)
			{
				Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = Class33_Sub6_Sub4_Sub7.method398(Class33_Sub11.aClass30_2259, anInt2848, 0);
				if(class33_sub6_sub4_sub7 == null)
					return null;
				for(int i = 0; i < 6; i++)
					if(aShortArray2826[0] != 0)
						class33_sub6_sub4_sub7.method389(aShortArray2826[i], aShortArray2831[i]);

				class33_sub6_sub4_sub3 = class33_sub6_sub4_sub7.method385(anInt2825 + 64, anInt2842 + 850, -30, -50, -30);
				Class82.aClass16_1798.method145(anInt2822, (byte)-125, class33_sub6_sub4_sub3);
			}
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3_1;
			if(~anInt2849 == 0 || arg0 == -1)
				class33_sub6_sub4_sub3_1 = class33_sub6_sub4_sub3.method335(true);
			else
				class33_sub6_sub4_sub3_1 = Class33_Sub21.method830(anInt2849, -82).method563(true, arg0, class33_sub6_sub4_sub3);
			if(~anInt2853 != -129 || anInt2854 != 128)
				class33_sub6_sub4_sub3_1.method338(anInt2853, anInt2854, anInt2853);
			if(~anInt2843 != -1)
			{
				if(~anInt2843 == -91)
					class33_sub6_sub4_sub3_1.method339();
				if(anInt2843 == 180)
				{
					class33_sub6_sub4_sub3_1.method339();
					class33_sub6_sub4_sub3_1.method339();
				}
				if(~anInt2843 == -271)
				{
					class33_sub6_sub4_sub3_1.method339();
					class33_sub6_sub4_sub3_1.method339();
					class33_sub6_sub4_sub3_1.method339();
				}
			}
			return class33_sub6_sub4_sub3_1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "id.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub6_Sub9()
	{
		aShortArray2831 = new short[6];
		anInt2849 = -1;
		anInt2842 = 0;
		anInt2853 = 128;
		anInt2825 = 0;
		anInt2854 = 128;
		aShortArray2826 = new short[6];
		anInt2843 = 0;
	}

	public static int anInt2819;
	public static int anIntArray2820[] = new int[500];
	public static int anInt2821;
	public int anInt2822;
	public static Class58 aClass58_2823;
	public static Class58 aClass58_2824;
	public int anInt2825;
	public short aShortArray2826[];
	public static Class58 aClass58_2827;
	public static Class58 aClass58_2828;
	public static Class58 aClass58_2829 = Class33_Sub6_Sub11.method535(125, "Unerwartete Antwort vom Anmelde)2Server");
	public static int anInt2830;
	public short aShortArray2831[];
	public static Class58 aClass58_2832;
	public static Class58 aClass58_2833;
	public static Class58 aClass58_2834;
	public static Class58 aClass58Array2835[];
	public static Class58 aClass58_2836;
	public static Class58 aClass58_2837;
	public static Class58 aClass58_2838;
	public static Class58 aClass58_2839;
	public static Class58 aClass58_2840;
	public static Class58 aClass58_2841;
	public int anInt2842;
	public int anInt2843;
	public static int anInt2844;
	public static Class58 aClass58_2845;
	public static Class58 aClass58_2846;
	public static Class58 aClass58_2847;
	public int anInt2848;
	public int anInt2849;
	public static boolean aBoolean2850 = false;
	public static int anInt2851 = 0;
	public static int anInt2852;
	public int anInt2853;
	public int anInt2854;
	public static int anInt2855 = 0;
	public static int anInt2856;

	static 
	{
		aClass58_2823 = Class33_Sub6_Sub11.method535(124, "Loaded title screen");
		aClass58_2832 = Class33_Sub6_Sub11.method535(98, "Nov");
		aClass58_2828 = Class33_Sub6_Sub11.method535(121, "Dec");
		aClass58_2836 = Class33_Sub6_Sub11.method535(115, "Apr");
		aClass58_2838 = aClass58_2823;
		aClass58_2827 = Class33_Sub6_Sub11.method535(105, "Jul");
		aClass58_2833 = Class33_Sub6_Sub11.method535(106, "Mar");
		aClass58_2847 = Class33_Sub6_Sub11.method535(113, "Jun");
		aClass58_2839 = Class33_Sub6_Sub11.method535(115, "Invalid loginserver requested)3");
		aClass58_2834 = Class33_Sub6_Sub11.method535(113, "Feb");
		aClass58_2824 = aClass58_2839;
		aClass58_2845 = Class33_Sub6_Sub11.method535(126, "May");
		aClass58_2840 = Class33_Sub6_Sub11.method535(119, "Jan");
		aClass58_2846 = Class33_Sub6_Sub11.method535(113, "Aug");
		aClass58_2837 = Class33_Sub6_Sub11.method535(117, "Oct");
		aClass58_2841 = Class33_Sub6_Sub11.method535(114, "Sep");
		aClass58Array2835 = (new Class58[] {
			aClass58_2840, aClass58_2834, aClass58_2833, aClass58_2836, aClass58_2845, aClass58_2847, aClass58_2827, aClass58_2846, aClass58_2841, aClass58_2837, 
			aClass58_2832, aClass58_2828
		});
	}
}
