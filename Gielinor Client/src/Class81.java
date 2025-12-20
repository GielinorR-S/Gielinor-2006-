// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class81.java

import java.awt.Component;
import java.awt.event.*;

public class Class81
	implements KeyListener, FocusListener
{

	public static void method1208(Class12 arg0, int arg1, Class30_Sub1 arg2, byte arg3)
	{
		try
		{
			byte abyte0[] = null;
			anInt1765++;
			synchronized(Class33_Sub6_Sub4.aClass4_2739)
			{
				for(Class33_Sub20 class33_sub20 = (Class33_Sub20)Class33_Sub6_Sub4.aClass4_2739.method68(18823); class33_sub20 != null; class33_sub20 = (Class33_Sub20)Class33_Sub6_Sub4.aClass4_2739.method66((byte)-126))
				{
					if(((Class33) (class33_sub20)).aLong747 != (long)arg1 || arg0 != class33_sub20.aClass12_2557 || class33_sub20.anInt2572 != 0)
						continue;
					abyte0 = class33_sub20.aByteArray2570;
					break;
				}

			}
			if(abyte0 != null)
			{
				arg2.method241(arg0, true, true, abyte0, arg1);
				return;
			} else
			{
				int i = -78 % ((3 - arg3) / 60);
				byte abyte1[] = arg0.method109((byte)-119, arg1);
				arg2.method241(arg0, true, true, abyte1, arg1);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wc.G(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ')');
		}
	}

	public static void method1209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		try
		{
			anInt1764++;
			if(arg0 == Class33_Sub6_Sub4_Sub1.anInt3338 && ~arg1 == ~Class44.anInt961 && (Class32.anInt709 == arg5 || !Class33_Sub3.aBoolean2058))
				return;
			Class33_Sub6_Sub4_Sub1.anInt3338 = arg0;
			Class32.anInt709 = arg5;
			Class44.anInt961 = arg1;
			if(!Class33_Sub3.aBoolean2058)
				Class32.anInt709 = 0;
			Class29.method215(25, (byte)-47);
			Class33_Sub11_Sub1.method677(Class36.aClass58_779, false, null, 3);
			int j = Class33_Sub2.anInt2036;
			Class33_Sub2.anInt2036 = 8 * (arg1 + -6);
			int l = Class33_Sub2.anInt2036 - j;
			int i = Class69.anInt1475;
			j = Class33_Sub2.anInt2036;
			Class69.anInt1475 = -48 + 8 * arg0;
			int k = -i + Class69.anInt1475;
			i = Class69.anInt1475;
			for(int i1 = 0; ~i1 > -32769; i1++)
			{
				Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[i1];
				if(class33_sub6_sub4_sub5_sub2 != null)
				{
					for(int k1 = 0; ~k1 > -11; k1++)
					{
						((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anIntArray3554[k1] -= k;
						((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anIntArray3520[k1] -= l;
					}

					class33_sub6_sub4_sub5_sub2.anInt3548 -= 128 * k;
					class33_sub6_sub4_sub5_sub2.anInt3510 -= 128 * l;
				}
			}

			if(arg2 < 20)
				aLong1769 = -123L;
			for(int j1 = 0; ~j1 > -2049; j1++)
			{
				Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[j1];
				if(class33_sub6_sub4_sub5_sub1 != null)
				{
					for(int l1 = 0; l1 < 10; l1++)
					{
						((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anIntArray3554[l1] -= k;
						((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anIntArray3520[l1] -= l;
					}

					class33_sub6_sub4_sub5_sub1.anInt3510 -= 128 * l;
					class33_sub6_sub4_sub5_sub1.anInt3548 -= 128 * k;
				}
			}

			Class77_Sub2.anInt2645 = arg5;
			Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.method358((byte)18, false, arg3, arg4);
			byte byte0 = 0;
			byte byte1 = 104;
			byte byte2 = 1;
			byte byte3 = 0;
			byte byte5 = 1;
			byte byte4 = 104;
			if(~k > -1)
			{
				byte0 = 103;
				byte2 = -1;
				byte1 = -1;
			}
			if(~l > -1)
			{
				byte3 = 103;
				byte5 = -1;
				byte4 = -1;
			}
			for(int i2 = byte0; byte1 != i2; i2 += byte2)
			{
				for(int j2 = byte3; j2 != byte4; j2 += byte5)
				{
					int k2 = i2 - -k;
					int l2 = j2 + l;
					for(int i3 = 0; ~i3 > -5; i3++)
						if(~k2 <= -1 && l2 >= 0 && ~k2 > -105 && ~l2 > -105)
							Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[i3][i2][j2] = Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[i3][k2][l2];
						else
							Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[i3][i2][j2] = null;

				}

			}

			for(Class33_Sub5 class33_sub5 = (Class33_Sub5)Class33_Sub6_Sub15.aClass4_3053.method68(18823); class33_sub5 != null; class33_sub5 = (Class33_Sub5)Class33_Sub6_Sub15.aClass4_3053.method66((byte)-128))
			{
				class33_sub5.anInt2109 -= k;
				class33_sub5.anInt2098 -= l;
				if(~class33_sub5.anInt2109 > -1 || ~class33_sub5.anInt2098 > -1 || ~class33_sub5.anInt2109 <= -105 || ~class33_sub5.anInt2098 <= -105)
					class33_sub5.method266(-114);
			}

			Class34.anInt1839 = 0;
			Canvas_Sub1.anInt65 = -1;
			if(~Class44.anInt964 != -1)
			{
				Class44.anInt964 -= k;
				Class20.anInt387 -= l;
			}
			Class36.aBoolean796 = false;
			Class66.aClass4_1415.method67(121);
			Class69.aClass4_1463.method67(116);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wc.C(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
		}
	}

	public void keyTyped(KeyEvent arg0)
	{
		try
		{
			int i = Class33_Sub6_Sub15.method577(arg0, 89);
			if(~i <= -1)
			{
				int j = 0x7f & Class71.anInt1526 + 1;
				if(~j != ~Canvas_Sub1.anInt59)
				{
					Class33_Sub5.anIntArray2116[Class71.anInt1526] = -1;
					Class33_Sub11_Sub1.anIntArray3199[Class71.anInt1526] = i;
					Class71.anInt1526 = j;
				}
			}
			anInt1756++;
			arg0.consume();
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wc.keyTyped(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method1210(int arg0, int arg1, int arg2, int arg3, Class33_Sub15 arg4[], int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, byte arg11)
	{
		try
		{
			if(arg11 != 1)
				return;
			anInt1747++;
			if(~arg3 < ~arg1 || ~arg10 < ~arg0 || arg2 <= arg1 || ~arg6 >= ~arg0)
				return;
			for(int i = 0; ~i > ~arg4.length; i++)
			{
				Class33_Sub15 class33_sub15 = arg4[i];
				if(class33_sub15 == null || arg9 != class33_sub15.anInt2464 || class33_sub15.aBoolean2412 && Class71.method1139((byte)93, class33_sub15))
					continue;
				int j = (class33_sub15.anInt2443 - -arg3) + -arg7;
				int k = (class33_sub15.anInt2356 + arg10) - arg8;
				if(class33_sub15.anInt2452 == 8 && arg1 >= j && ~k >= ~arg0 && ~arg1 > ~(j - -class33_sub15.anInt2462) && ~arg0 > ~(class33_sub15.anInt2405 + k))
					Class33_Sub6_Sub16.anInt3077 = i;
				if((~class33_sub15.anInt2434 <= -1 || class33_sub15.anInt2463 != 0) && ~arg1 <= ~j && k <= arg0 && j - -class33_sub15.anInt2462 > arg1 && arg0 < class33_sub15.anInt2405 + k)
					if(class33_sub15.anInt2434 < 0)
						Class41.anInt901 = i;
					else
						Class41.anInt901 = class33_sub15.anInt2434;
				if(~class33_sub15.anInt2452 == -1)
				{
					if(!class33_sub15.aBoolean2412 && Class71.method1139((byte)67, class33_sub15) && !Class39.method882(97, i, arg5))
						continue;
					method1210(arg0, arg1, j + class33_sub15.anInt2462, j, arg4, arg5, k + class33_sub15.anInt2405, class33_sub15.anInt2413, class33_sub15.anInt2353, class33_sub15.anInt2435, k, (byte)1);
					if(class33_sub15.aClass33_Sub15Array2394 != null)
						method1210(arg0, arg1, j + class33_sub15.anInt2462, j, class33_sub15.aClass33_Sub15Array2394, arg5, class33_sub15.anInt2405 + k, class33_sub15.anInt2413, class33_sub15.anInt2353, class33_sub15.anInt2435, k, (byte)1);
					if(~class33_sub15.anInt2433 < ~class33_sub15.anInt2405 && !class33_sub15.aBoolean2412)
						Class23.method183((byte)125, k, j + class33_sub15.anInt2462, arg0, arg1, class33_sub15, class33_sub15.anInt2405, arg5, class33_sub15.anInt2433);
					if(!class33_sub15.aBoolean2412)
						continue;
				}
				if(class33_sub15.anInt2404 == 1 && arg1 >= j && ~arg0 <= ~k && ~arg1 > ~(j - -class33_sub15.anInt2462) && arg0 < k + class33_sub15.anInt2405)
				{
					boolean flag = false;
					if(~class33_sub15.anInt2446 != -1)
						flag = Class69.method1115(30, class33_sub15);
					if(!flag)
					{
						Class74.method1157(0, 25, Class33_Sub13_Sub4.aClass58_3261, class33_sub15.anInt2435, class33_sub15.aClass58_2458, true, 0);
						Class33_Sub6_Sub4.anInt2735++;
					}
				}
				if(~class33_sub15.anInt2404 == -3 && !Class33_Sub15.aBoolean2470 && j <= arg1 && ~k >= ~arg0 && arg1 < j + class33_sub15.anInt2462 && arg0 < k + class33_sub15.anInt2405)
				{
					Class58 class58 = Class34.method837((byte)41, class33_sub15);
					if(class58 != null)
					{
						Class33_Sub6_Sub4_Sub5_Sub1.anInt3739++;
						Class74.method1157(-1, 52, Class35.method846((byte)-83, new Class58[] {
							Class33_Sub18.aClass58_2524, class33_sub15.aClass58_2431
						}), class33_sub15.anInt2435, class58, true, 0);
					}
				}
				if(class33_sub15.anInt2404 == 3 && ~arg1 <= ~j && arg0 >= k && class33_sub15.anInt2462 + j > arg1 && ~arg0 > ~(k + class33_sub15.anInt2405))
				{
					Class33_Sub2.anInt2039++;
					byte byte0;
					if(~arg5 == -4)
						byte0 = 9;
					else
						byte0 = 20;
					Class74.method1157(0, byte0, Class33_Sub13_Sub4.aClass58_3261, class33_sub15.anInt2435, Class33_Sub18.aClass58_2529, true, 0);
				}
				if(~class33_sub15.anInt2404 == -5 && arg1 >= j && ~k >= ~arg0 && class33_sub15.anInt2462 + j > arg1 && arg0 < class33_sub15.anInt2405 + k)
				{
					Class74.method1157(0, 40, Class33_Sub13_Sub4.aClass58_3261, class33_sub15.anInt2435, class33_sub15.aClass58_2458, true, 0);
					Class27.anInt564++;
				}
				if(class33_sub15.anInt2404 == 5 && arg1 >= j && arg0 >= k && ~(j - -class33_sub15.anInt2462) < ~arg1 && class33_sub15.anInt2405 + k > arg0)
				{
					Class74.method1157(0, 3, Class33_Sub13_Sub4.aClass58_3261, class33_sub15.anInt2435, class33_sub15.aClass58_2458, true, 0);
					Class37.anInt824++;
				}
				if(class33_sub15.anInt2404 == 6 && Class33_Sub18.anInt2514 == -1 && j <= arg1 && ~k >= ~arg0 && j - -class33_sub15.anInt2462 > arg1 && k - -class33_sub15.anInt2405 > arg0)
				{
					Class74.method1157(-1, 32, Class33_Sub13_Sub4.aClass58_3261, class33_sub15.anInt2435, class33_sub15.aClass58_2458, true, 0);
					Class33_Sub5.anInt2099++;
				}
				if(~class33_sub15.anInt2452 == -3)
				{
					int l = 0;
					for(int j1 = 0; j1 < class33_sub15.anInt2405; j1++)
					{
						for(int k1 = 0; class33_sub15.anInt2462 > k1; k1++)
						{
							int j2 = k + (class33_sub15.anInt2399 + 32) * j1;
							int i2 = (class33_sub15.anInt2390 + 32) * k1 + j;
							if(~l > -21)
							{
								i2 += class33_sub15.anIntArray2351[l];
								j2 += class33_sub15.anIntArray2414[l];
							}
							if(~arg1 <= ~i2 && ~arg0 <= ~j2 && ~arg1 > ~(i2 + 32) && 32 + j2 > arg0)
							{
								Class22.anInt422 = l;
								Class41.anInt916 = class33_sub15.anInt2435;
								if(~class33_sub15.anIntArray2471[l] < -1)
								{
									Class33_Sub6_Sub11 class33_sub6_sub11 = Class14.method127(class33_sub15.anIntArray2471[l] - 1, (byte)90);
									if(Class33_Sub6_Sub4_Sub6.anInt3590 == 1 && Class33_Sub19.method819(Class33_Sub6_Sub5.method403(class33_sub15, -5447), 1))
									{
										if(Class33_Sub16.anInt2494 != class33_sub15.anInt2435 || Class31.anInt699 != l)
										{
											Class74.method1157(l, 41, Class35.method846((byte)-83, new Class58[] {
												Class77.aClass58_1649, Class42.aClass58_919, class33_sub6_sub11.aClass58_2898
											}), class33_sub15.anInt2435, Class9.aClass58_171, true, class33_sub6_sub11.anInt2900);
											Class33_Sub10.anInt2217++;
										}
									} else
									if(!Class33_Sub15.aBoolean2470 || !Class33_Sub19.method819(Class33_Sub6_Sub5.method403(class33_sub15, -5447), 1))
									{
										Class33_Sub6_Sub16.anInt3086++;
										Class58 aclass58[] = class33_sub6_sub11.aClass58Array2947;
										if(Class33_Sub13_Sub4.aBoolean3293)
											aclass58 = Class33_Sub6_Sub4.method318(5, aclass58);
										if(Class33_Sub19.method819(Class33_Sub6_Sub5.method403(class33_sub15, -5447), 1))
										{
											for(int k2 = 4; k2 >= 3; k2--)
												if(aclass58 == null || aclass58[k2] == null)
												{
													if(~k2 == -5)
													{
														Class74.method1157(l, 58, Class35.method846((byte)-83, new Class58[] {
															Class27.aClass58_556, class33_sub6_sub11.aClass58_2898
														}), class33_sub15.anInt2435, Class46.aClass58_1011, true, class33_sub6_sub11.anInt2900);
														Class33_Sub6_Sub5.anInt2773++;
													}
												} else
												{
													Class33_Sub6.anInt2121++;
													byte byte1;
													if(k2 == 3)
														byte1 = 57;
													else
														byte1 = 58;
													Class74.method1157(l, byte1, Class35.method846((byte)-83, new Class58[] {
														Class27.aClass58_556, class33_sub6_sub11.aClass58_2898
													}), class33_sub15.anInt2435, aclass58[k2], true, class33_sub6_sub11.anInt2900);
												}

										}
										if(Class33_Sub6_Sub3.method309(Class33_Sub6_Sub5.method403(class33_sub15, -5447), (byte)-125))
										{
											Class74.method1157(l, 6, Class35.method846((byte)-83, new Class58[] {
												Class27.aClass58_556, class33_sub6_sub11.aClass58_2898
											}), class33_sub15.anInt2435, Class9.aClass58_171, true, class33_sub6_sub11.anInt2900);
											Class33.anInt749++;
										}
										if(Class33_Sub19.method819(Class33_Sub6_Sub5.method403(class33_sub15, arg11 + -5448), arg11) && aclass58 != null)
										{
											for(int l2 = 2; l2 >= 0; l2--)
												if(aclass58[l2] != null)
												{
													Class50.anInt1084++;
													byte byte2 = 0;
													if(l2 == 0)
														byte2 = 50;
													if(l2 == 1)
														byte2 = 39;
													if(l2 == 2)
														byte2 = 54;
													Class74.method1157(l, byte2, Class35.method846((byte)-83, new Class58[] {
														Class27.aClass58_556, class33_sub6_sub11.aClass58_2898
													}), class33_sub15.anInt2435, aclass58[l2], true, class33_sub6_sub11.anInt2900);
												}

										}
										aclass58 = class33_sub15.aClass58Array2336;
										if(Class33_Sub13_Sub4.aBoolean3293)
											aclass58 = Class33_Sub6_Sub4.method318(5, aclass58);
										if(aclass58 != null)
										{
											for(int i3 = 4; ~i3 <= -1; i3--)
												if(aclass58[i3] != null)
												{
													Class33_Sub6_Sub16.anInt3080++;
													byte byte3 = 0;
													if(~i3 == -1)
														byte3 = 36;
													if(~i3 == -2)
														byte3 = 12;
													if(i3 == 2)
														byte3 = 19;
													if(~i3 == -4)
														byte3 = 8;
													if(~i3 == -5)
														byte3 = 34;
													Class74.method1157(l, byte3, Class35.method846((byte)-83, new Class58[] {
														Class27.aClass58_556, class33_sub6_sub11.aClass58_2898
													}), class33_sub15.anInt2435, aclass58[i3], true, class33_sub6_sub11.anInt2900);
												}

										}
										Class74.method1157(l, 1002, Class35.method846((byte)-83, new Class58[] {
											Class27.aClass58_556, class33_sub6_sub11.aClass58_2898
										}), class33_sub15.anInt2435, Class23.aClass58_461, true, class33_sub6_sub11.anInt2900);
									} else
									if((Class12.anInt209 & 0x10) == 16)
									{
										Class33_Sub6_Sub4_Sub6.anInt3595++;
										Class74.method1157(l, 21, Class35.method846((byte)-83, new Class58[] {
											Class33_Sub18.aClass58_2518, Class42.aClass58_919, class33_sub6_sub11.aClass58_2898
										}), class33_sub15.anInt2435, Class33_Sub6_Sub4_Sub6.aClass58_3610, true, class33_sub6_sub11.anInt2900);
									}
								}
							}
							l++;
						}

					}

				}
				if(class33_sub15.aBoolean2412)
					if(Class33_Sub15.aBoolean2470)
					{
						if(Class33_Sub16.method799(-117, Class33_Sub6_Sub5.method403(class33_sub15, arg11 ^ 0xffffeab8)) && ~(Class12.anInt209 & 0x20) == -33 && arg1 >= j && arg0 >= k && ~(j + class33_sub15.anInt2462) < ~arg1 && class33_sub15.anInt2405 + k > arg0)
						{
							Class39.anInt874++;
							Class74.method1157(class33_sub15.anInt2432, 5, Class35.method846((byte)-83, new Class58[] {
								Class33_Sub18.aClass58_2518, Class4.aClass58_122, class33_sub15.aClass58_2415
							}), class33_sub15.anInt2435, Class33_Sub6_Sub4_Sub6.aClass58_3610, true, 0);
						}
					} else
					if(j <= arg1 && ~arg0 <= ~k && ~(class33_sub15.anInt2462 + j) < ~arg1 && ~arg0 > ~(class33_sub15.anInt2405 + k))
					{
						for(int i1 = 9; ~i1 <= -6; i1--)
						{
							Class58 class58_1 = Class33_Sub16.method803(i1, class33_sub15, (byte)85);
							if(class58_1 != null)
							{
								Class74.method1157(class33_sub15.anInt2432, 1006, class33_sub15.aClass58_2415, class33_sub15.anInt2435, class58_1, true, i1 + 1);
								Class21.anInt396++;
							}
						}

						Class58 class58_2 = Class34.method837((byte)49, class33_sub15);
						if(class58_2 != null)
						{
							Class74.method1157(class33_sub15.anInt2432, 52, class33_sub15.aClass58_2415, class33_sub15.anInt2435, class58_2, true, 0);
							Class33_Sub6_Sub4_Sub5_Sub1.anInt3739++;
						}
						for(int l1 = 4; l1 >= 0; l1--)
						{
							Class58 class58_3 = Class33_Sub16.method803(l1, class33_sub15, (byte)110);
							if(class58_3 != null)
							{
								Class21.anInt396++;
								Class74.method1157(class33_sub15.anInt2432, 24, class33_sub15.aClass58_2415, class33_sub15.anInt2435, class58_3, true, l1 - -1);
							}
						}

						if(Class4.method60(Class33_Sub6_Sub5.method403(class33_sub15, arg11 ^ 0xffffeab8), (byte)-35))
						{
							Class74.method1157(class33_sub15.anInt2432, 32, Class33_Sub13_Sub4.aClass58_3261, class33_sub15.anInt2435, Class33_Sub2.aClass58_2021, true, 0);
							Class33_Sub5.anInt2099++;
						}
					}
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wc.E(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? "null" : "{...}") + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
		}
	}

	public static void method1211(int arg0, Class33_Sub6_Sub16 arg1, int arg2, byte arg3, int arg4)
	{
		try
		{
			anInt1753++;
			if(~Class14.anInt276 <= -401)
				return;
			if(arg1.anIntArray3071 != null)
				arg1 = arg1.method586(81);
			if(arg1 == null)
				return;
			if(arg3 > -14)
				method1213((byte)-59);
			if(!arg1.aBoolean3070)
				return;
			Class58 class58 = arg1.aClass58_3113;
			if(arg1.anInt3091 != 0)
				class58 = Class35.method846((byte)-83, new Class58[] {
					class58, Class33_Sub10.method619((byte)66, Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.anInt3738, arg1.anInt3091), Class62.aClass58_1299, Class62.aClass58_1327, Class37.method859(15591, arg1.anInt3091), Class33_Sub6_Sub4_Sub6.aClass58_3625
				});
			if(Class33_Sub6_Sub4_Sub6.anInt3590 != 1)
			{
				if(!Class33_Sub15.aBoolean2470)
				{
					Class78.anInt1668++;
					Class58 aclass58[] = arg1.aClass58Array3101;
					if(Class33_Sub13_Sub4.aBoolean3293)
						aclass58 = Class33_Sub6_Sub4.method318(5, aclass58);
					if(aclass58 != null)
					{
						for(int i = 4; ~i <= -1; i--)
							if(aclass58[i] != null && !aclass58[i].method1059(-1, Class33_Sub6_Sub8.aClass58_2803))
							{
								Class33_Sub21.anInt2582++;
								byte byte0 = 0;
								if(~i == -1)
									byte0 = 43;
								if(i == 1)
									byte0 = 27;
								if(~i == -3)
									byte0 = 29;
								if(i == 3)
									byte0 = 7;
								if(i == 4)
									byte0 = 30;
								Class74.method1157(arg0, byte0, Class35.method846((byte)-83, new Class58[] {
									Class33_Sub15.aClass58_2468, class58
								}), arg4, aclass58[i], true, arg2);
							}

					}
					if(aclass58 != null)
					{
						for(int j = 4; j >= 0; j--)
							if(aclass58[j] != null && aclass58[j].method1059(-1, Class33_Sub6_Sub8.aClass58_2803))
							{
								Class12.anInt210++;
								char c = '\0';
								if(Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.anInt3738 < arg1.anInt3091)
									c = '\u07D0';
								int k = 0;
								if(~j == -1)
									k = 43 - -c;
								if(~j == -2)
									k = c + 27;
								if(~j == -3)
									k = c + 29;
								if(~j == -4)
									k = 7 - -c;
								if(j == 4)
									k = c + 30;
								Class74.method1157(arg0, k, Class35.method846((byte)-83, new Class58[] {
									Class33_Sub15.aClass58_2468, class58
								}), arg4, aclass58[j], true, arg2);
							}

					}
					Class74.method1157(arg0, 1007, Class35.method846((byte)-83, new Class58[] {
						Class33_Sub15.aClass58_2468, class58
					}), arg4, Class23.aClass58_461, true, arg2);
					return;
				}
				if(~(2 & Class12.anInt209) == -3)
				{
					Class74.method1157(arg0, 49, Class35.method846((byte)-83, new Class58[] {
						Class33_Sub18.aClass58_2518, Class30.aClass58_667, class58
					}), arg4, Class33_Sub6_Sub4_Sub6.aClass58_3610, true, arg2);
					Class32.anInt708++;
					return;
				}
			} else
			{
				Class74.method1157(arg0, 31, Class35.method846((byte)-83, new Class58[] {
					Class77.aClass58_1649, Class30.aClass58_667, class58
				}), arg4, Class9.aClass58_171, true, arg2);
				Class33_Sub2.anInt2037++;
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wc.B(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public synchronized void focusLost(FocusEvent arg0)
	{
		anInt1762++;
		if(Class33_Sub19.aClass81_2535 != null)
			Class33_Sub9.anInt2181 = -1;
	}

	public void focusGained(FocusEvent arg0)
	{
		try
		{
			anInt1749++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wc.focusGained(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public synchronized void keyReleased(KeyEvent arg0)
	{
		try
		{
			anInt1770++;
			if(Class33_Sub19.aClass81_2535 != null)
			{
				Class11.anInt189 = 0;
				int i = arg0.getKeyCode();
				if(i >= 0 && ~i > ~Class33_Sub6_Sub1.anIntArray2669.length)
					i = Class33_Sub6_Sub1.anIntArray2669[i] & 0xffffff7f;
				else
					i = -1;
				if(~Class33_Sub9.anInt2181 <= -1 && i >= 0)
				{
					Class33_Sub6_Sub6.anIntArray2788[Class33_Sub9.anInt2181] = ~i;
					Class33_Sub9.anInt2181 = 0x7f & 1 + Class33_Sub9.anInt2181;
					if(~Class45.anInt978 == ~Class33_Sub9.anInt2181)
						Class33_Sub9.anInt2181 = -1;
				}
			}
			arg0.consume();
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wc.keyReleased(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method1212(boolean arg0)
	{
		try
		{
			aClass33_Sub6_Sub7_Sub4Array1759 = null;
			aClass58_1751 = null;
			aClass58_1745 = null;
			aClass58_1754 = null;
			aClass58_1743 = null;
			aClass58_1771 = null;
			aClass58_1761 = null;
			if(!arg0)
				method1211(25, null, 96, (byte)95, 108);
			aClass58_1768 = null;
			aClass58_1748 = null;
			anIntArray1742 = null;
			aClass58_1766 = null;
			aClass33_Sub6_Sub7_Sub3_1746 = null;
			aClass58_1755 = null;
			aClass58_1767 = null;
			aClass58_1752 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wc.D(" + arg0 + ')');
		}
	}

	public static void method1213(byte arg0)
	{
		anInt1760++;
		try
		{
			java.awt.Graphics g = Class33_Sub6_Sub4_Sub1.aCanvas3367.getGraphics();
			Class17.aClass15_338.method131(4, 4, (byte)78, g);
		}
		catch(Exception _ex)
		{
			Class33_Sub6_Sub4_Sub1.aCanvas3367.repaint();
		}
		if(arg0 > -110)
			method1210(-1, -31, -82, 123, null, 71, 80, -117, 37, 3, 9, (byte)34);
	}

	public Class81()
	{
	}

	public static Object method1214(byte arg0[], boolean arg1, byte arg2)
	{
		try
		{
			anInt1757++;
			if(arg0 == null)
				return null;
			if(~arg0.length < -137 && !Class77_Sub2.aBoolean2639)
				try
				{
					Class50 class50 = (Class50)Class.forName("Class50_Sub1").newInstance();
					class50.method939(64, arg0);
					return class50;
				}
				catch(Throwable _ex)
				{
					Class77_Sub2.aBoolean2639 = true;
				}
			int i = -28 / ((arg2 - 26) / 36);
			if(arg1)
				return Class33_Sub6_Sub10.method519(arg0, 0);
			else
				return arg0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wc.A(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public synchronized void keyPressed(KeyEvent arg0)
	{
		try
		{
			anInt1763++;
			if(Class33_Sub19.aClass81_2535 != null)
			{
				Class11.anInt189 = 0;
				int i = arg0.getKeyCode();
				if(~i > -1 || i >= Class33_Sub6_Sub1.anIntArray2669.length)
				{
					i = -1;
				} else
				{
					i = Class33_Sub6_Sub1.anIntArray2669[i];
					if((0x80 & i) != 0)
						i = -1;
				}
				if(Class33_Sub9.anInt2181 >= 0 && ~i <= -1)
				{
					Class33_Sub6_Sub6.anIntArray2788[Class33_Sub9.anInt2181] = i;
					Class33_Sub9.anInt2181 = 0x7f & 1 + Class33_Sub9.anInt2181;
					if(~Class45.anInt978 == ~Class33_Sub9.anInt2181)
						Class33_Sub9.anInt2181 = -1;
				}
				if(~i <= -1)
				{
					int j = Class71.anInt1526 + 1 & 0x7f;
					if(~j != ~Canvas_Sub1.anInt59)
					{
						Class33_Sub5.anIntArray2116[Class71.anInt1526] = i;
						Class33_Sub11_Sub1.anIntArray3199[Class71.anInt1526] = -1;
						Class71.anInt1526 = j;
					}
				}
			}
			arg0.consume();
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wc.keyPressed(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt1741;
	public static int anIntArray1742[] = {
		1, 1, 1, 1
	};
	public static Class58 aClass58_1743;
	public static int anInt1744 = -1;
	public static Class58 aClass58_1745 = Class33_Sub6_Sub11.method535(116, "(U4");
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3_1746;
	public static int anInt1747;
	public static Class58 aClass58_1748 = Class33_Sub6_Sub11.method535(115, "System)2Update in: ");
	public static int anInt1749;
	public static volatile int anInt1750 = -1;
	public static Class58 aClass58_1751 = Class33_Sub6_Sub11.method535(125, "Diese Welt ist voll)3");
	public static Class58 aClass58_1752;
	public static int anInt1753;
	public static Class58 aClass58_1754 = Class33_Sub6_Sub11.method535(110, ":0");
	public static Class58 aClass58_1755;
	public static int anInt1756;
	public static int anInt1757;
	public static int anInt1758 = 0;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4Array1759[];
	public static int anInt1760;
	public static Class58 aClass58_1761 = Class33_Sub6_Sub11.method535(115, "Spieler");
	public static int anInt1762;
	public static int anInt1763;
	public static int anInt1764;
	public static int anInt1765;
	public static Class58 aClass58_1766;
	public static Class58 aClass58_1767 = Class33_Sub6_Sub11.method535(122, "Regeln versto-8en hat)3");
	public static Class58 aClass58_1768 = Class33_Sub6_Sub11.method535(113, "<)4col> x");
	public static long aLong1769 = 0L;
	public static int anInt1770;
	public static Class58 aClass58_1771;

	static 
	{
		aClass58_1743 = Class33_Sub6_Sub11.method535(108, "No reply from loginserver)3");
		aClass58_1752 = Class33_Sub6_Sub11.method535(99, "glow1:");
		aClass58_1755 = aClass58_1752;
		aClass58_1771 = aClass58_1743;
		aClass58_1766 = aClass58_1752;
	}
}
