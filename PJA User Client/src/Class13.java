// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class13.java

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.Date;

public class Class13
{

	public static void method118(Object arg0[], Class33_Sub15 arg1, int arg2, int arg3, Class33_Sub15 arg4, int arg5, int arg6)
	{
		try
		{
			anInt257++;
			int i = ((Integer)arg0[0]).intValue();
			Class33_Sub6_Sub10 class33_sub6_sub10 = Class60.method1070(i, (byte)111);
			if(class33_sub6_sub10 == null)
				return;
			Class40.anInt882 = 0;
			int k = 0;
			int ai[] = class33_sub6_sub10.anIntArray2874;
			int j = 0;
			int l = -1;
			if(arg5 != 18859)
				return;
			int ai1[] = class33_sub6_sub10.anIntArray2859;
			int i1 = -1;
			try
			{
				Class33_Sub6_Sub15.anIntArray3063 = new int[class33_sub6_sub10.anInt2871];
				Class33_Sub6_Sub2.aClass58Array2699 = new Class58[class33_sub6_sub10.anInt2870];
				int j1 = 0;
				int k1 = 0;
				for(int l1 = 1; ~arg0.length < ~l1; l1++)
					if(!(arg0[l1] instanceof Integer))
					{
						if(arg0[l1] instanceof Class58)
							Class33_Sub6_Sub2.aClass58Array2699[k1++] = (Class58)arg0[l1];
					} else
					{
						int j2 = ((Integer)arg0[l1]).intValue();
						if(~j2 == 0x7ffffffe)
							j2 = arg3;
						if(j2 == 0x80000002)
							j2 = arg2;
						if(~j2 == 0x7ffffffc)
							j2 = arg1 != null ? arg1.anInt2435 : -1;
						if(j2 == 0x80000004)
							j2 = arg6;
						if(~j2 == 0x7ffffffa)
							j2 = arg1 != null ? arg1.anInt2432 : -1;
						if(~j2 == 0x7ffffff9)
							j2 = arg4 != null ? arg4.anInt2435 : -1;
						if(j2 == 0x80000007)
							j2 = arg4 == null ? -1 : arg4.anInt2432;
						Class33_Sub6_Sub15.anIntArray3063[j1++] = j2;
					}

				int k2 = 0;
				do
				{
					if(++k2 > 0x30d40)
						throw new RuntimeException("slow");
					i1 = ai[++l];
					if(i1 < 100)
					{
						if(i1 == 0)
						{
							Class73.anIntArray1559[j++] = ai1[l];
							continue;
						}
						if(~i1 == -2)
						{
							int l2 = ai1[l];
							Class73.anIntArray1559[j++] = Class33_Sub5.anIntArray2120[l2];
							continue;
						}
						if(i1 == 2)
						{
							int i3 = ai1[l];
							Class33_Sub5.anIntArray2120[i3] = Class73.anIntArray1559[--j];
							continue;
						}
						if(i1 == 3)
						{
							Class77.aClass58Array1651[k++] = class33_sub6_sub10.aClass58Array2879[l];
							continue;
						}
						if(i1 == 6)
						{
							l += ai1[l];
							continue;
						}
						if(~i1 == -8)
						{
							j -= 2;
							if(~Class73.anIntArray1559[j] != ~Class73.anIntArray1559[j + 1])
								l += ai1[l];
							continue;
						}
						if(i1 == 8)
						{
							j -= 2;
							if(Class73.anIntArray1559[j] == Class73.anIntArray1559[j + 1])
								l += ai1[l];
							continue;
						}
						if(i1 == 9)
						{
							j -= 2;
							if(Class73.anIntArray1559[1 + j] > Class73.anIntArray1559[j])
								l += ai1[l];
							continue;
						}
						if(~i1 == -11)
						{
							j -= 2;
							if(~Class73.anIntArray1559[j] < ~Class73.anIntArray1559[j - -1])
								l += ai1[l];
							continue;
						}
						if(~i1 == -22)
						{
							if(~Class40.anInt882 == -1)
								return;
							Class74 class74 = Class26.aClass74Array549[--Class40.anInt882];
							Class33_Sub6_Sub15.anIntArray3063 = class74.anIntArray1563;
							Class33_Sub6_Sub2.aClass58Array2699 = class74.aClass58Array1572;
							class33_sub6_sub10 = class74.aClass33_Sub6_Sub10_1581;
							ai1 = class33_sub6_sub10.anIntArray2859;
							l = class74.anInt1584;
							ai = class33_sub6_sub10.anIntArray2874;
							continue;
						}
						if(~i1 == -26)
						{
							int j3 = ai1[l];
							Class73.anIntArray1559[j++] = Class22.method179((byte)53, j3);
							continue;
						}
						if(~i1 == -28)
						{
							int k3 = ai1[l];
							Applet_Sub1.method14(arg5 + -18930, Class73.anIntArray1559[--j], k3);
							continue;
						}
						if(~i1 == -32)
						{
							j -= 2;
							if(Class73.anIntArray1559[j] <= Class73.anIntArray1559[1 + j])
								l += ai1[l];
							continue;
						}
						if(~i1 == -33)
						{
							j -= 2;
							if(~Class73.anIntArray1559[j] <= ~Class73.anIntArray1559[1 + j])
								l += ai1[l];
							continue;
						}
						if(~i1 == -34)
						{
							Class73.anIntArray1559[j++] = Class33_Sub6_Sub15.anIntArray3063[ai1[l]];
							continue;
						}
						if(i1 == 34)
						{
							Class33_Sub6_Sub15.anIntArray3063[ai1[l]] = Class73.anIntArray1559[--j];
							continue;
						}
						if(~i1 == -36)
						{
							Class77.aClass58Array1651[k++] = Class33_Sub6_Sub2.aClass58Array2699[ai1[l]];
							continue;
						}
						if(~i1 == -37)
						{
							Class33_Sub6_Sub2.aClass58Array2699[ai1[l]] = Class77.aClass58Array1651[--k];
							continue;
						}
						if(~i1 == -38)
						{
							int l3 = ai1[l];
							k -= l3;
							Class58 class58_1 = Class57.method1020(Class77.aClass58Array1651, k, 1, l3);
							Class77.aClass58Array1651[k++] = class58_1;
							continue;
						}
						if(~i1 == -39)
						{
							j--;
							continue;
						}
						if(i1 == 39)
						{
							k--;
							continue;
						}
						if(~i1 == -41)
						{
							int i4 = ai1[l];
							Class33_Sub6_Sub10 class33_sub6_sub10_1 = Class60.method1070(i4, (byte)111);
							int ai2[] = new int[class33_sub6_sub10_1.anInt2871];
							Class58 aclass58[] = new Class58[class33_sub6_sub10_1.anInt2870];
							for(int l30 = 0; l30 < class33_sub6_sub10_1.anInt2866; l30++)
								ai2[l30] = Class73.anIntArray1559[l30 + (-class33_sub6_sub10_1.anInt2866 + j)];

							for(int k32 = 0; ~k32 > ~class33_sub6_sub10_1.anInt2858; k32++)
								aclass58[k32] = Class77.aClass58Array1651[-class33_sub6_sub10_1.anInt2858 + (k + k32)];

							j -= class33_sub6_sub10_1.anInt2866;
							k -= class33_sub6_sub10_1.anInt2858;
							Class74 class74_1 = new Class74();
							class74_1.aClass33_Sub6_Sub10_1581 = class33_sub6_sub10;
							class74_1.aClass58Array1572 = Class33_Sub6_Sub2.aClass58Array2699;
							class33_sub6_sub10 = class33_sub6_sub10_1;
							class74_1.anInt1584 = l;
							l = -1;
							class74_1.anIntArray1563 = Class33_Sub6_Sub15.anIntArray3063;
							Class26.aClass74Array549[Class40.anInt882++] = class74_1;
							ai1 = class33_sub6_sub10.anIntArray2859;
							Class33_Sub6_Sub15.anIntArray3063 = ai2;
							Class33_Sub6_Sub2.aClass58Array2699 = aclass58;
							ai = class33_sub6_sub10.anIntArray2874;
							continue;
						}
						if(~i1 == -43)
						{
							Class73.anIntArray1559[j++] = Class74.anIntArray1569[ai1[l]];
							continue;
						}
						if(i1 == 43)
						{
							Class74.anIntArray1569[ai1[l]] = Class73.anIntArray1559[--j];
							continue;
						}
						if(~i1 == -45)
						{
							int k18 = Class73.anIntArray1559[--j];
							int i5 = 0xffff & ai1[l];
							int j4 = ai1[l] >> 0x1f4410f0;
							if(~k18 > -1 || ~k18 < -5001)
								throw new RuntimeException();
							byte byte0 = -1;
							if(~i5 == -106)
								byte0 = 0;
							Class46.anIntArray1023[j4] = k18;
							for(int i31 = 0; ~k18 < ~i31; i31++)
								Class33.anIntArrayArray720[j4][i31] = byte0;

							continue;
						}
						if(~i1 == -46)
						{
							int k4 = ai1[l];
							int j5 = Class73.anIntArray1559[--j];
							if(~j5 > -1 || Class46.anIntArray1023[k4] <= j5)
								throw new RuntimeException();
							Class73.anIntArray1559[j++] = Class33.anIntArrayArray720[k4][j5];
							continue;
						}
						if(~i1 == -47)
						{
							int l4 = ai1[l];
							j -= 2;
							int k5 = Class73.anIntArray1559[j];
							if(~k5 > -1 || ~Class46.anIntArray1023[l4] >= ~k5)
								throw new RuntimeException();
							Class33.anIntArrayArray720[l4][k5] = Class73.anIntArray1559[j - -1];
							continue;
						}
					}
					boolean flag;
					if(~ai1[l] == -2)
						flag = true;
					else
						flag = false;
					if(~i1 <= -1001)
					{
						if((i1 < 1000 || ~i1 <= -1101) && (i1 < 2000 || ~i1 <= -2101))
						{
							if(i1 >= 1100 && i1 < 1200 || i1 >= 2100 && i1 < 2200)
							{
								Class33_Sub15 class33_sub15;
								if(i1 >= 2000)
								{
									class33_sub15 = Class49.method933(Class73.anIntArray1559[--j], arg5 ^ 0xffffb66d);
									i1 -= 1000;
								} else
								{
									class33_sub15 = flag ? Class45.aClass33_Sub15_981 : RuntimeException_Sub1.aClass33_Sub15_1816;
								}
								Class30_Sub1.method248(false, class33_sub15);
								if(i1 == 1100)
								{
									j -= 2;
									class33_sub15.anInt2413 = Class73.anIntArray1559[j];
									if(~class33_sub15.anInt2413 < ~(-class33_sub15.anInt2462 + class33_sub15.anInt2455))
										class33_sub15.anInt2413 = class33_sub15.anInt2455 + -class33_sub15.anInt2462;
									if(class33_sub15.anInt2413 < 0)
										class33_sub15.anInt2413 = 0;
									class33_sub15.anInt2353 = Class73.anIntArray1559[1 + j];
									if(~(-class33_sub15.anInt2405 + class33_sub15.anInt2433) > ~class33_sub15.anInt2353)
										class33_sub15.anInt2353 = -class33_sub15.anInt2405 + class33_sub15.anInt2433;
									if(~class33_sub15.anInt2353 > -1)
										class33_sub15.anInt2353 = 0;
									continue;
								}
								if(~i1 == -1102)
								{
									class33_sub15.anInt2410 = Class73.anIntArray1559[--j];
									continue;
								}
								if(i1 == 1102)
								{
									class33_sub15.aBoolean2338 = Class73.anIntArray1559[--j] == 1;
									continue;
								}
								if(~i1 == -1104)
								{
									class33_sub15.anInt2439 = Class73.anIntArray1559[--j];
									continue;
								}
								if(i1 == 1104)
								{
									class33_sub15.anInt2395 = Class73.anIntArray1559[--j];
									continue;
								}
								if(~i1 == -1106)
								{
									class33_sub15.anInt2456 = Class73.anIntArray1559[--j];
									continue;
								}
								if(~i1 == -1107)
								{
									class33_sub15.anInt2354 = Class73.anIntArray1559[--j];
									continue;
								}
								if(i1 == 1107)
								{
									class33_sub15.aBoolean2424 = ~Class73.anIntArray1559[--j] == -2;
									continue;
								}
								if(i1 == 1108)
								{
									class33_sub15.anInt2401 = 1;
									class33_sub15.anInt2423 = Class73.anIntArray1559[--j];
									continue;
								}
								if(~i1 == -1110)
								{
									j -= 6;
									class33_sub15.anInt2381 = Class73.anIntArray1559[j];
									class33_sub15.anInt2459 = Class73.anIntArray1559[j - -1];
									class33_sub15.anInt2388 = Class73.anIntArray1559[2 + j];
									class33_sub15.anInt2460 = Class73.anIntArray1559[3 + j];
									class33_sub15.anInt2448 = Class73.anIntArray1559[4 + j];
									class33_sub15.anInt2457 = Class73.anIntArray1559[5 + j];
									continue;
								}
								if(i1 == 1110)
								{
									int l18 = Class73.anIntArray1559[--j];
									if(l18 != class33_sub15.anInt2374)
									{
										class33_sub15.anInt2421 = 0;
										class33_sub15.anInt2374 = l18;
										class33_sub15.anInt2393 = 0;
									}
									continue;
								}
								if(~i1 == -1112)
								{
									class33_sub15.aBoolean2352 = ~Class73.anIntArray1559[--j] == -2;
									continue;
								}
								if(~i1 == -1113)
								{
									class33_sub15.aClass58_2428 = Class77.aClass58Array1651[--k];
									continue;
								}
								if(i1 == 1113)
								{
									class33_sub15.anInt2454 = Class73.anIntArray1559[--j];
									continue;
								}
								if(i1 == 1114)
								{
									j -= 3;
									class33_sub15.anInt2359 = Class73.anIntArray1559[j];
									class33_sub15.anInt2371 = Class73.anIntArray1559[1 + j];
									class33_sub15.anInt2343 = Class73.anIntArray1559[j + 2];
									continue;
								}
								if(i1 == 1115)
								{
									class33_sub15.aBoolean2419 = ~Class73.anIntArray1559[--j] == -2;
									continue;
								}
								if(~i1 == -1117)
								{
									class33_sub15.anInt2425 = Class73.anIntArray1559[--j];
									continue;
								}
								if(~i1 == -1118)
								{
									class33_sub15.anInt2441 = Class73.anIntArray1559[--j];
									continue;
								}
								if(~i1 == -1119)
								{
									class33_sub15.aBoolean2392 = ~Class73.anIntArray1559[--j] == -2;
									continue;
								}
								if(~i1 == -1120)
								{
									class33_sub15.aBoolean2369 = ~Class73.anIntArray1559[--j] == -2;
									continue;
								}
								if(~i1 != -1121)
									break;
								j -= 2;
								class33_sub15.anInt2455 = Class73.anIntArray1559[j];
								class33_sub15.anInt2433 = Class73.anIntArray1559[1 + j];
								continue;
							}
							if(i1 >= 1200 && i1 < 1300 || ~i1 <= -2201 && ~i1 > -2301)
							{
								Class33_Sub15 class33_sub15_1;
								if(~i1 > -2001)
								{
									class33_sub15_1 = flag ? Class45.aClass33_Sub15_981 : RuntimeException_Sub1.aClass33_Sub15_1816;
								} else
								{
									class33_sub15_1 = Class49.method933(Class73.anIntArray1559[--j], -112);
									i1 -= 1000;
								}
								Class30_Sub1.method248(false, class33_sub15_1);
								if(i1 == 1200)
								{
									j -= 2;
									int l28 = Class73.anIntArray1559[j + 1];
									int i19 = Class73.anIntArray1559[j];
									class33_sub15_1.anInt2379 = l28;
									class33_sub15_1.anInt2380 = i19;
									Class33_Sub6_Sub11 class33_sub6_sub11_4 = Class14.method127(i19, (byte)90);
									class33_sub15_1.anInt2388 = class33_sub6_sub11_4.anInt2924;
									class33_sub15_1.anInt2459 = class33_sub6_sub11_4.anInt2943;
									class33_sub15_1.anInt2460 = class33_sub6_sub11_4.anInt2932;
									class33_sub15_1.anInt2457 = class33_sub6_sub11_4.anInt2910;
									class33_sub15_1.anInt2381 = class33_sub6_sub11_4.anInt2933;
									class33_sub15_1.anInt2448 = class33_sub6_sub11_4.anInt2896;
									if(class33_sub15_1.anInt2462 > 0)
										class33_sub15_1.anInt2457 = (class33_sub15_1.anInt2457 * 32) / class33_sub15_1.anInt2462;
									continue;
								}
								if(i1 == 1201)
								{
									class33_sub15_1.anInt2401 = 2;
									class33_sub15_1.anInt2423 = Class73.anIntArray1559[--j];
									continue;
								}
								if(~i1 != -1203)
									break;
								class33_sub15_1.anInt2401 = 3;
								class33_sub15_1.anInt2423 = Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.aClass46_3754.method926(512);
								continue;
							}
							if(~i1 <= -1301 && ~i1 > -1401 || i1 >= 2300 && ~i1 > -2401)
							{
								Class33_Sub15 class33_sub15_2;
								if(~i1 <= -2001)
								{
									class33_sub15_2 = Class49.method933(Class73.anIntArray1559[--j], -124);
									i1 -= 1000;
								} else
								{
									class33_sub15_2 = flag ? Class45.aClass33_Sub15_981 : RuntimeException_Sub1.aClass33_Sub15_1816;
								}
								if(i1 == 1300)
								{
									int j19 = Class73.anIntArray1559[--j] - 1;
									if(~j19 > -1 || j19 > 9)
										k--;
									else
										class33_sub15_2.method796(j19, Class77.aClass58Array1651[--k], true);
									continue;
								}
								if(~i1 == -1302)
								{
									j -= 2;
									int k19 = Class73.anIntArray1559[j];
									int i29 = Class73.anIntArray1559[1 + j];
									class33_sub15_2.aClass33_Sub15_2366 = Class39.method879(k19, (byte)111, i29);
									continue;
								}
								if(~i1 == -1303)
								{
									class33_sub15_2.aBoolean2344 = Class73.anIntArray1559[--j] == 1;
									continue;
								}
								if(~i1 == -1304)
								{
									class33_sub15_2.anInt2391 = Class73.anIntArray1559[--j];
									continue;
								}
								if(~i1 == -1305)
								{
									class33_sub15_2.anInt2447 = Class73.anIntArray1559[--j];
									continue;
								}
								if(~i1 == -1306)
								{
									class33_sub15_2.aClass58_2415 = Class77.aClass58Array1651[--k];
									continue;
								}
								if(~i1 != -1307)
									break;
								class33_sub15_2.aClass58_2378 = Class77.aClass58Array1651[--k];
								continue;
							}
							if(~i1 <= -1401 && i1 < 1500 || i1 >= 2400 && i1 < 2500)
							{
								int ai3[] = null;
								Class33_Sub15 class33_sub15_3;
								if(i1 >= 2000)
								{
									class33_sub15_3 = Class49.method933(Class73.anIntArray1559[--j], arg5 ^ 0xffffb635);
									i1 -= 1000;
								} else
								{
									class33_sub15_3 = flag ? Class45.aClass33_Sub15_981 : RuntimeException_Sub1.aClass33_Sub15_1816;
								}
								Class58 class58_13 = Class77.aClass58Array1651[--k];
								if(~class58_13.method1035(arg5 ^ 0x49b0) < -1 && ~class58_13.method1031(false, -1 + class58_13.method1035(27)) == -90)
								{
									int j31 = Class73.anIntArray1559[--j];
									if(~j31 < -1)
									{
										ai3 = new int[j31];
										while(~j31-- < -1) 
											ai3[j31] = Class73.anIntArray1559[--j];
									}
									class58_13 = class58_13.method1063(0, (byte)119, -1 + class58_13.method1035(27));
								}
								Object aobj[] = new Object[class58_13.method1035(27) + 1];
								for(int l32 = -1 + aobj.length; ~l32 <= -2; l32--)
									if(~class58_13.method1031(false, l32 + -1) != -116)
										aobj[l32] = new Integer(Class73.anIntArray1559[--j]);
									else
										aobj[l32] = Class77.aClass58Array1651[--k];

								int k33 = Class73.anIntArray1559[--j];
								if(~k33 != 0)
									aobj[0] = new Integer(k33);
								else
									aobj = null;
								if(~i1 == -1402)
									class33_sub15_3.anObjectArray2406 = aobj;
								if(i1 == 1405)
									class33_sub15_3.anObjectArray2362 = aobj;
								if(~i1 == -1407)
									class33_sub15_3.anObjectArray2346 = aobj;
								if(~i1 == -1413)
									class33_sub15_3.anObjectArray2361 = aobj;
								if(~i1 == -1403)
									class33_sub15_3.anObjectArray2339 = aobj;
								if(~i1 == -1410)
									class33_sub15_3.anObjectArray2418 = aobj;
								if(~i1 == -1409)
									class33_sub15_3.anObjectArray2451 = aobj;
								if(i1 == 1403)
									class33_sub15_3.anObjectArray2363 = aobj;
								class33_sub15_3.aBoolean2372 = true;
								if(i1 == 1414)
								{
									class33_sub15_3.anIntArray2342 = ai3;
									class33_sub15_3.anObjectArray2469 = aobj;
								}
								if(i1 == 1400)
									class33_sub15_3.anObjectArray2453 = aobj;
								if(i1 == 1410)
									class33_sub15_3.anObjectArray2396 = aobj;
								if(i1 == 1404)
									class33_sub15_3.anObjectArray2365 = aobj;
								if(~i1 == -1416)
								{
									class33_sub15_3.anObjectArray2438 = aobj;
									class33_sub15_3.anIntArray2449 = ai3;
								}
								if(i1 == 1422)
									class33_sub15_3.anObjectArray2402 = aobj;
								if(~i1 == -1408)
								{
									class33_sub15_3.anObjectArray2382 = aobj;
									class33_sub15_3.anIntArray2409 = ai3;
								}
								if(i1 == 1416)
									class33_sub15_3.anObjectArray2444 = aobj;
								if(~i1 == -1418)
									class33_sub15_3.anObjectArray2427 = aobj;
								if(~i1 == -1412)
									class33_sub15_3.anObjectArray2400 = aobj;
								continue;
							}
							if(i1 >= 1600)
							{
								if(i1 >= 1700)
								{
									if(i1 >= 1800)
									{
										if(i1 >= 1900)
										{
											if(~i1 <= -2601)
											{
												if(~i1 <= -2701)
												{
													if(~i1 <= -2801)
													{
														if(~i1 > -2901)
														{
															Class33_Sub15 class33_sub15_4 = Class49.method933(Class73.anIntArray1559[--j], -121);
															if(i1 == 2800)
															{
																Class73.anIntArray1559[j++] = Class33.method268((byte)111, Class33_Sub6_Sub5.method403(class33_sub15_4, -5447));
																continue;
															}
															if(i1 == 2801)
															{
																int l19 = Class73.anIntArray1559[--j];
																if(class33_sub15_4.aClass58Array2467 == null || ~class33_sub15_4.aClass58Array2467.length >= ~l19 || class33_sub15_4.aClass58Array2467[l19] == null)
																	Class77.aClass58Array1651[k++] = Class43.aClass58_925;
																else
																	Class77.aClass58Array1651[k++] = class33_sub15_4.aClass58Array2467[l19];
																continue;
															}
															if(i1 != 2802)
																break;
															if(class33_sub15_4.aClass58_2415 == null)
																Class77.aClass58Array1651[k++] = Class43.aClass58_925;
															else
																Class77.aClass58Array1651[k++] = class33_sub15_4.aClass58_2415;
															continue;
														}
														if(~i1 <= -3201)
														{
															if(~i1 > -3301)
															{
																if(i1 == 3200)
																{
																	j -= 3;
																	Class15_Sub2.method141((byte)-108, Class73.anIntArray1559[j], Class73.anIntArray1559[j + 1], Class73.anIntArray1559[j - -2]);
																	continue;
																}
																if(i1 == 3201)
																{
																	Class19.method164((byte)114, Class73.anIntArray1559[--j]);
																	continue;
																}
																if(~i1 != -3203)
																	break;
																j -= 2;
																Class78.method1184(-1, Class73.anIntArray1559[1 + j], Class73.anIntArray1559[j]);
																continue;
															}
															if(~i1 <= -3401)
															{
																if(~i1 <= -3501)
																{
																	if(i1 >= 3700)
																	{
																		if(i1 >= 4100)
																		{
																			if(i1 < 4200)
																			{
																				if(i1 == 4100)
																				{
																					Class58 class58_2 = Class77.aClass58Array1651[--k];
																					int i20 = Class73.anIntArray1559[--j];
																					Class77.aClass58Array1651[k++] = Class35.method846((byte)-83, new Class58[] {
																						class58_2, Class37.method859(15591, i20)
																					});
																					continue;
																				}
																				if(~i1 == -4102)
																				{
																					k -= 2;
																					Class58 class58_14 = Class77.aClass58Array1651[1 + k];
																					Class58 class58_3 = Class77.aClass58Array1651[k];
																					Class77.aClass58Array1651[k++] = Class35.method846((byte)-83, new Class58[] {
																						class58_3, class58_14
																					});
																					continue;
																				}
																				if(i1 == 4102)
																				{
																					Class58 class58_4 = Class77.aClass58Array1651[--k];
																					int j20 = Class73.anIntArray1559[--j];
																					Class77.aClass58Array1651[k++] = Class35.method846((byte)-83, new Class58[] {
																						class58_4, Class33_Sub6_Sub4_Sub5.method363(true, j20, true)
																					});
																					continue;
																				}
																				if(~i1 == -4104)
																				{
																					Class58 class58_5 = Class77.aClass58Array1651[--k];
																					Class77.aClass58Array1651[k++] = class58_5.method1045(true);
																					continue;
																				}
																				if(i1 == 4104)
																				{
																					int l5 = Class73.anIntArray1559[--j];
																					long l20 = 0xec44e2dc00L + 0x5265c00L * (long)l5;
																					Class33_Sub11.aCalendar2243.setTime(new Date(l20));
																					int k31 = Class33_Sub11.aCalendar2243.get(5);
																					int i33 = Class33_Sub11.aCalendar2243.get(2);
																					int l33 = Class33_Sub11.aCalendar2243.get(1);
																					Class77.aClass58Array1651[k++] = Class35.method846((byte)-83, new Class58[] {
																						Class37.method859(15591, k31), Class66.aClass58_1419, Class33_Sub6_Sub9.aClass58Array2835[i33], Class66.aClass58_1419, Class37.method859(15591, l33)
																					});
																					continue;
																				}
																				if(i1 == 4105)
																				{
																					k -= 2;
																					Class58 class58_15 = Class77.aClass58Array1651[k + 1];
																					Class58 class58_6 = Class77.aClass58Array1651[k];
																					if(Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.aClass46_3754 != null && Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.aClass46_3754.aBoolean1019)
																						Class77.aClass58Array1651[k++] = class58_15;
																					else
																						Class77.aClass58Array1651[k++] = class58_6;
																					continue;
																				}
																				if(~i1 == -4107)
																				{
																					int i6 = Class73.anIntArray1559[--j];
																					Class77.aClass58Array1651[k++] = Class37.method859(arg5 + -3268, i6);
																					continue;
																				}
																				if(~i1 == -4108)
																				{
																					k -= 2;
																					Class73.anIntArray1559[j++] = Class77.aClass58Array1651[k].method1041(Class77.aClass58Array1651[k - -1], Class73.method1150(arg5, 18909));
																					continue;
																				}
																				if(~i1 == -4109)
																				{
																					j -= 2;
																					Class58 class58_7 = Class77.aClass58Array1651[--k];
																					int k20 = Class73.anIntArray1559[j];
																					int j29 = Class73.anIntArray1559[j - -1];
																					byte abyte0[] = Class59.aClass30_Sub1_1271.method238(false, 0, j29);
																					Class33_Sub6_Sub7_Sub2 class33_sub6_sub7_sub2 = new Class33_Sub6_Sub7_Sub2(abyte0);
																					Class73.anIntArray1559[j++] = class33_sub6_sub7_sub2.method450(class58_7, k20);
																					continue;
																				}
																				if(i1 == 4109)
																				{
																					j -= 2;
																					int i21 = Class73.anIntArray1559[j];
																					Class58 class58_8 = Class77.aClass58Array1651[--k];
																					int k29 = Class73.anIntArray1559[j - -1];
																					byte abyte1[] = Class59.aClass30_Sub1_1271.method238(false, 0, k29);
																					Class33_Sub6_Sub7_Sub2 class33_sub6_sub7_sub2_1 = new Class33_Sub6_Sub7_Sub2(abyte1);
																					Class73.anIntArray1559[j++] = class33_sub6_sub7_sub2_1.method462(class58_8, i21);
																					continue;
																				}
																				if(i1 != 4110)
																					break;
																				k -= 2;
																				Class58 class58_16 = Class77.aClass58Array1651[1 + k];
																				Class58 class58_9 = Class77.aClass58Array1651[k];
																				if(Class73.anIntArray1559[--j] != 1)
																					Class77.aClass58Array1651[k++] = class58_16;
																				else
																					Class77.aClass58Array1651[k++] = class58_9;
																				continue;
																			}
																			if(~i1 <= -4301)
																				break;
																			if(i1 == 4200)
																			{
																				int j6 = Class73.anIntArray1559[--j];
																				Class77.aClass58Array1651[k++] = Class14.method127(j6, (byte)90).aClass58_2898;
																				continue;
																			}
																			if(i1 == 4201)
																			{
																				j -= 2;
																				int j21 = Class73.anIntArray1559[j + 1];
																				int k6 = Class73.anIntArray1559[j];
																				Class33_Sub6_Sub11 class33_sub6_sub11_2 = Class14.method127(k6, (byte)90);
																				if(~j21 <= -2 && ~j21 >= -6 && class33_sub6_sub11_2.aClass58Array2917[j21 - 1] != null)
																					Class77.aClass58Array1651[k++] = class33_sub6_sub11_2.aClass58Array2917[j21 - 1];
																				else
																					Class77.aClass58Array1651[k++] = Class43.aClass58_925;
																				continue;
																			}
																			if(~i1 == -4203)
																			{
																				j -= 2;
																				int k21 = Class73.anIntArray1559[j + 1];
																				int l6 = Class73.anIntArray1559[j];
																				Class33_Sub6_Sub11 class33_sub6_sub11_3 = Class14.method127(l6, (byte)90);
																				if(k21 >= 1 && ~k21 >= -6 && class33_sub6_sub11_3.aClass58Array2947[-1 + k21] != null)
																					Class77.aClass58Array1651[k++] = class33_sub6_sub11_3.aClass58Array2947[k21 + -1];
																				else
																					Class77.aClass58Array1651[k++] = Class43.aClass58_925;
																				continue;
																			}
																			if(i1 == 4203)
																			{
																				int i7 = Class73.anIntArray1559[--j];
																				Class73.anIntArray1559[j++] = Class14.method127(i7, (byte)90).anInt2922;
																				continue;
																			}
																			if(~i1 == -4205)
																			{
																				int j7 = Class73.anIntArray1559[--j];
																				Class73.anIntArray1559[j++] = Class14.method127(j7, (byte)90).anInt2944 == 1 ? 1 : 0;
																				continue;
																			}
																			if(i1 == 4205)
																			{
																				int k7 = Class73.anIntArray1559[--j];
																				Class33_Sub6_Sub11 class33_sub6_sub11 = Class14.method127(k7, (byte)90);
																				if(class33_sub6_sub11.anInt2905 == -1 && ~class33_sub6_sub11.anInt2901 <= -1)
																					Class73.anIntArray1559[j++] = class33_sub6_sub11.anInt2901;
																				else
																					Class73.anIntArray1559[j++] = k7;
																				continue;
																			}
																			if(~i1 == -4207)
																			{
																				int l7 = Class73.anIntArray1559[--j];
																				Class33_Sub6_Sub11 class33_sub6_sub11_1 = Class14.method127(l7, (byte)90);
																				if(class33_sub6_sub11_1.anInt2905 < 0 || class33_sub6_sub11_1.anInt2901 < 0)
																					Class73.anIntArray1559[j++] = l7;
																				else
																					Class73.anIntArray1559[j++] = class33_sub6_sub11_1.anInt2901;
																				continue;
																			}
																			if(i1 != 4207)
																				break;
																			int i8 = Class73.anIntArray1559[--j];
																			Class73.anIntArray1559[j++] = Class14.method127(i8, (byte)90).aBoolean2935 ? 1 : 0;
																			continue;
																		}
																		if(i1 == 4000)
																		{
																			j -= 2;
																			int j8 = Class73.anIntArray1559[j];
																			int l21 = Class73.anIntArray1559[1 + j];
																			Class73.anIntArray1559[j++] = l21 + j8;
																			continue;
																		}
																		if(~i1 == -4002)
																		{
																			j -= 2;
																			int i22 = Class73.anIntArray1559[j - -1];
																			int k8 = Class73.anIntArray1559[j];
																			Class73.anIntArray1559[j++] = -i22 + k8;
																			continue;
																		}
																		if(~i1 == -4003)
																		{
																			j -= 2;
																			int l8 = Class73.anIntArray1559[j];
																			int j22 = Class73.anIntArray1559[1 + j];
																			Class73.anIntArray1559[j++] = j22 * l8;
																			continue;
																		}
																		if(~i1 == -4004)
																		{
																			j -= 2;
																			int k22 = Class73.anIntArray1559[j + 1];
																			int i9 = Class73.anIntArray1559[j];
																			Class73.anIntArray1559[j++] = i9 / k22;
																			continue;
																		}
																		if(i1 == 4004)
																		{
																			int j9 = Class73.anIntArray1559[--j];
																			Class73.anIntArray1559[j++] = (int)((double)j9 * Math.random());
																			continue;
																		}
																		if(i1 == 4005)
																		{
																			int k9 = Class73.anIntArray1559[--j];
																			Class73.anIntArray1559[j++] = (int)((double)(1 + k9) * Math.random());
																			continue;
																		}
																		if(~i1 == -4007)
																		{
																			j -= 5;
																			int l22 = Class73.anIntArray1559[1 + j];
																			int l9 = Class73.anIntArray1559[j];
																			int l29 = Class73.anIntArray1559[2 + j];
																			int l31 = Class73.anIntArray1559[j + 3];
																			int j33 = Class73.anIntArray1559[4 + j];
																			Class73.anIntArray1559[j++] = l9 - -(((-l9 + l22) * (-l29 + j33)) / (l31 + -l29));
																			continue;
																		}
																		if(~i1 == -4008)
																		{
																			j -= 2;
																			int i10 = Class73.anIntArray1559[j];
																			int i23 = Class73.anIntArray1559[j + 1];
																			Class73.anIntArray1559[j++] = i10 + (i23 * i10) / 100;
																			continue;
																		}
																		if(~i1 == -4009)
																		{
																			j -= 2;
																			int j23 = Class73.anIntArray1559[1 + j];
																			int j10 = Class73.anIntArray1559[j];
																			Class73.anIntArray1559[j++] = Class33_Sub6_Sub14.method576(j10, 1 << j23);
																			continue;
																		}
																		if(~i1 == -4010)
																		{
																			j -= 2;
																			int k10 = Class73.anIntArray1559[j];
																			int k23 = Class73.anIntArray1559[j - -1];
																			Class73.anIntArray1559[j++] = Class12.method110(k10, -(1 << k23) + -1);
																			continue;
																		}
																		if(i1 == 4010)
																		{
																			j -= 2;
																			int l23 = Class73.anIntArray1559[1 + j];
																			int l10 = Class73.anIntArray1559[j];
																			Class73.anIntArray1559[j++] = ~Class12.method110(1 << l23, l10) != -1 ? 1 : 0;
																			continue;
																		}
																		if(i1 == 4011)
																		{
																			j -= 2;
																			int i24 = Class73.anIntArray1559[j - -1];
																			int i11 = Class73.anIntArray1559[j];
																			Class73.anIntArray1559[j++] = i11 % i24;
																			continue;
																		}
																		if(i1 == 4012)
																		{
																			j -= 2;
																			int j11 = Class73.anIntArray1559[j];
																			int j24 = Class73.anIntArray1559[j - -1];
																			if(j11 == 0)
																				Class73.anIntArray1559[j++] = 0;
																			else
																				Class73.anIntArray1559[j++] = (int)Math.pow(j11, j24);
																			continue;
																		}
																		if(~i1 == -4014)
																		{
																			j -= 2;
																			int k11 = Class73.anIntArray1559[j];
																			int k24 = Class73.anIntArray1559[j + 1];
																			if(k11 != 0)
																			{
																				if(k24 != 0)
																					Class73.anIntArray1559[j++] = (int)Math.pow(k11, 1.0D / (double)k24);
																				else
																					Class73.anIntArray1559[j++] = 0x7fffffff;
																			} else
																			{
																				Class73.anIntArray1559[j++] = 0;
																			}
																			continue;
																		}
																		if(i1 == 4014)
																		{
																			j -= 2;
																			int l11 = Class73.anIntArray1559[j];
																			int l24 = Class73.anIntArray1559[1 + j];
																			Class73.anIntArray1559[j++] = Class12.method110(l11, l24);
																			continue;
																		}
																		if(~i1 != -4016)
																			break;
																		j -= 2;
																		int i12 = Class73.anIntArray1559[j];
																		int i25 = Class73.anIntArray1559[j - -1];
																		Class73.anIntArray1559[j++] = Class33_Sub6_Sub14.method576(i12, i25);
																		continue;
																	}
																	if(i1 == 3600)
																	{
																		if(~Class30.anInt673 == -1)
																			Class73.anIntArray1559[j++] = -2;
																		else
																		if(Class30.anInt673 == 1)
																			Class73.anIntArray1559[j++] = -1;
																		else
																			Class73.anIntArray1559[j++] = Class33_Sub6_Sub12.anInt2979;
																		continue;
																	}
																	if(i1 == 3601)
																	{
																		int j12 = Class73.anIntArray1559[--j];
																		if(Class30.anInt673 != 2 || ~Class33_Sub6_Sub12.anInt2979 >= ~j12)
																			Class77.aClass58Array1651[k++] = Class43.aClass58_925;
																		else
																			Class77.aClass58Array1651[k++] = Class32.aClass58Array711[j12];
																		continue;
																	}
																	if(i1 == 3602)
																	{
																		int k12 = Class73.anIntArray1559[--j];
																		if(~Class30.anInt673 != -3 || ~Class33_Sub6_Sub12.anInt2979 >= ~k12)
																			Class73.anIntArray1559[j++] = 0;
																		else
																			Class73.anIntArray1559[j++] = Class30_Sub1.anIntArray2013[k12];
																		continue;
																	}
																	if(i1 == 3603)
																	{
																		int l12 = Class73.anIntArray1559[--j];
																		if(~Class30.anInt673 != -3 || Class33_Sub6_Sub12.anInt2979 <= l12)
																			Class73.anIntArray1559[j++] = 0;
																		else
																			Class73.anIntArray1559[j++] = Class16.anIntArray315[l12];
																		continue;
																	}
																	if(~i1 == -3605)
																	{
																		Class58 class58_10 = Class77.aClass58Array1651[--k];
																		int j25 = Class73.anIntArray1559[--j];
																		Class35.method842(j25, 23572, class58_10);
																		continue;
																	}
																	if(i1 == 3611)
																	{
																		if(Class33_Sub6_Sub15.aClass58_3060 == null)
																			Class77.aClass58Array1651[k++] = Class43.aClass58_925;
																		else
																			Class77.aClass58Array1651[k++] = Class33_Sub6_Sub15.aClass58_3060;
																		continue;
																	}
																	if(~i1 == -3613)
																	{
																		if(Class33_Sub6_Sub15.aClass58_3060 != null)
																			Class73.anIntArray1559[j++] = Class29.anInt588;
																		else
																			Class73.anIntArray1559[j++] = 0;
																		continue;
																	}
																	if(i1 == 3613)
																	{
																		int i13 = Class73.anIntArray1559[--j];
																		if(Class33_Sub6_Sub15.aClass58_3060 == null || i13 >= Class29.anInt588)
																			Class77.aClass58Array1651[k++] = Class43.aClass58_925;
																		else
																			Class77.aClass58Array1651[k++] = Class45.aClass33_Sub9Array969[i13].aClass58_2190;
																		continue;
																	}
																	if(i1 == 3614)
																	{
																		int j13 = Class73.anIntArray1559[--j];
																		if(Class33_Sub6_Sub15.aClass58_3060 == null || Class29.anInt588 <= j13)
																			Class73.anIntArray1559[j++] = 0;
																		else
																			Class73.anIntArray1559[j++] = Class45.aClass33_Sub9Array969[j13].anInt2189;
																		continue;
																	}
																	if(~i1 != -3616)
																		break;
																	int k13 = Class73.anIntArray1559[--j];
																	if(Class33_Sub6_Sub15.aClass58_3060 == null || ~k13 <= ~Class29.anInt588)
																		Class73.anIntArray1559[j++] = 0;
																	else
																		Class73.anIntArray1559[j++] = Class45.aClass33_Sub9Array969[k13].aByte2188;
																	continue;
																}
																if(~i1 == -3401)
																{
																	j -= 2;
																	int k25 = Class73.anIntArray1559[1 + j];
																	int l13 = Class73.anIntArray1559[j];
																	Class33_Sub6_Sub15 class33_sub6_sub15 = Class15.method133((byte)41, l13);
																	for(int i32 = 0; ~class33_sub6_sub15.anInt3064 < ~i32; i32++)
																	{
																		if(class33_sub6_sub15.anIntArray3051[i32] != k25)
																			continue;
																		Class77.aClass58Array1651[k++] = class33_sub6_sub15.aClass58Array3058[i32];
																		class33_sub6_sub15 = null;
																		break;
																	}

																	if(class33_sub6_sub15 != null)
																		Class77.aClass58Array1651[k++] = class33_sub6_sub15.aClass58_3043;
																	continue;
																}
																if(~i1 != -3409)
																	break;
																j -= 4;
																int i14 = Class73.anIntArray1559[j];
																int i30 = Class73.anIntArray1559[2 + j];
																int l25 = Class73.anIntArray1559[1 + j];
																int j32 = Class73.anIntArray1559[3 + j];
																Class33_Sub6_Sub15 class33_sub6_sub15_1 = Class15.method133((byte)41, i30);
																if(i14 != class33_sub6_sub15_1.anInt3042 || l25 != class33_sub6_sub15_1.anInt3047)
																{
																	if(l25 == 115)
																		Class77.aClass58Array1651[k++] = Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3788;
																	else
																		Class73.anIntArray1559[j++] = 0;
																} else
																{
																	for(int i34 = 0; i34 < class33_sub6_sub15_1.anInt3064; i34++)
																	{
																		if(~j32 != ~class33_sub6_sub15_1.anIntArray3051[i34])
																			continue;
																		if(l25 == 115)
																			Class77.aClass58Array1651[k++] = class33_sub6_sub15_1.aClass58Array3058[i34];
																		else
																			Class73.anIntArray1559[j++] = class33_sub6_sub15_1.anIntArray3055[i34];
																		class33_sub6_sub15_1 = null;
																		break;
																	}

																	if(class33_sub6_sub15_1 != null)
																		if(l25 != 115)
																			Class73.anIntArray1559[j++] = class33_sub6_sub15_1.anInt3044;
																		else
																			Class77.aClass58Array1651[k++] = class33_sub6_sub15_1.aClass58_3043;
																}
																continue;
															}
															if(i1 == 3300)
															{
																Class73.anIntArray1559[j++] = Class33_Sub6_Sub6.anInt2785;
																continue;
															}
															if(~i1 == -3302)
															{
																j -= 2;
																int i26 = Class73.anIntArray1559[j + 1];
																int j14 = Class73.anIntArray1559[j];
																Class73.anIntArray1559[j++] = Class29.method214(j14, i26, (byte)9);
																continue;
															}
															if(~i1 == -3303)
															{
																j -= 2;
																int j26 = Class73.anIntArray1559[j + 1];
																int k14 = Class73.anIntArray1559[j];
																Class73.anIntArray1559[j++] = Class21.method174(k14, j26, 0);
																continue;
															}
															if(~i1 == -3304)
															{
																j -= 2;
																int k26 = Class73.anIntArray1559[1 + j];
																int l14 = Class73.anIntArray1559[j];
																Class73.anIntArray1559[j++] = Class57.method1016((byte)-93, l14, k26);
																continue;
															}
															if(i1 == 3304)
															{
																int i15 = Class73.anIntArray1559[--j];
																Class73.anIntArray1559[j++] = Class33_Sub11.method642(5, i15).anInt2807;
																continue;
															}
															if(~i1 == -3306)
															{
																int j15 = Class73.anIntArray1559[--j];
																Class73.anIntArray1559[j++] = Class39.anIntArray864[j15];
																continue;
															}
															if(~i1 == -3307)
															{
																int k15 = Class73.anIntArray1559[--j];
																Class73.anIntArray1559[j++] = Class33_Sub6_Sub5.anIntArray2755[k15];
																continue;
															}
															if(i1 == 3307)
															{
																int l15 = Class73.anIntArray1559[--j];
																Class73.anIntArray1559[j++] = Class3.anIntArray109[l15];
																continue;
															}
															if(i1 == 3308)
															{
																int i16 = Class77_Sub2.anInt2645;
																int l26 = (((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 >> 0xc440f2e7) + Class69.anInt1475;
																int j30 = Class33_Sub2.anInt2036 + (((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 >> 0x12f13be7);
																Class73.anIntArray1559[j++] = ((i16 << 0xc5f2487c) + (l26 << 0xd3c322e)) - -j30;
																continue;
															}
															if(i1 == 3309)
															{
																int j16 = Class73.anIntArray1559[--j];
																Class73.anIntArray1559[j++] = Class12.method110(j16, 0xfffec73) >> 0x14ce88ce;
																continue;
															}
															if(i1 == 3310)
															{
																int k16 = Class73.anIntArray1559[--j];
																Class73.anIntArray1559[j++] = k16 >> 0x4991621c;
																continue;
															}
															if(i1 == 3311)
															{
																int l16 = Class73.anIntArray1559[--j];
																Class73.anIntArray1559[j++] = Class12.method110(16383, l16);
																continue;
															}
															if(~i1 == -3313)
															{
																Class73.anIntArray1559[j++] = Class77.aBoolean1647 ? 1 : 0;
																continue;
															}
															if(~i1 == -3314)
															{
																j -= 2;
																int i17 = Class73.anIntArray1559[j] - -32768;
																int i27 = Class73.anIntArray1559[j + 1];
																Class73.anIntArray1559[j++] = Class29.method214(i17, i27, (byte)9);
																continue;
															}
															if(~i1 == -3315)
															{
																j -= 2;
																int j27 = Class73.anIntArray1559[1 + j];
																int j17 = Class73.anIntArray1559[j] - -32768;
																Class73.anIntArray1559[j++] = Class21.method174(j17, j27, arg5 + -18859);
																continue;
															}
															if(~i1 == -3316)
															{
																j -= 2;
																int k17 = 32768 + Class73.anIntArray1559[j];
																int k27 = Class73.anIntArray1559[1 + j];
																Class73.anIntArray1559[j++] = Class57.method1016((byte)-93, k17, k27);
																continue;
															}
															if(~i1 == -3321)
															{
																Class73.anIntArray1559[j++] = 0;
																continue;
															}
															if(~i1 == -3322)
															{
																Class73.anIntArray1559[j++] = Class33_Sub4.anInt2079;
																continue;
															}
															if(i1 != 3322)
																break;
															Class73.anIntArray1559[j++] = Class82.anInt1774;
															continue;
														}
														if(~i1 == -3101)
														{
															Class58 class58_11 = Class77.aClass58Array1651[--k];
															Class43.method904(0, 0, class58_11, Class43.aClass58_925);
															continue;
														}
														if(i1 == 3101)
														{
															j -= 2;
															Canvas_Sub1.method45(Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305, Class73.anIntArray1559[1 + j], Class73.anIntArray1559[j], true);
															continue;
														}
														if(~i1 == -3103)
														{
															int l17 = Class73.anIntArray1559[--j];
															if(l17 >= 0 && ~Class14.anIntArray274.length < ~l17 && Class14.anIntArray274[l17] != -1)
															{
																Class74.aBoolean1579 = true;
																Class26.aBoolean552 = true;
																Class30.anInt620 = l17;
															}
															continue;
														}
														if(i1 != 3103)
															break;
														Class43.method900(true);
														continue;
													}
													Class33_Sub15 class33_sub15_5 = Class49.method933(Class73.anIntArray1559[--j], -106);
													if(~i1 == -2701)
													{
														Class73.anIntArray1559[j++] = class33_sub15_5.anInt2380;
														continue;
													}
													if(~i1 != -2702)
														break;
													if(class33_sub15_5.anInt2380 == -1)
														Class73.anIntArray1559[j++] = 0;
													else
														Class73.anIntArray1559[j++] = class33_sub15_5.anInt2379;
													continue;
												}
												Class33_Sub15 class33_sub15_6 = Class49.method933(Class73.anIntArray1559[--j], -119);
												if(~i1 == -2601)
												{
													Class73.anIntArray1559[j++] = class33_sub15_6.anInt2413;
													continue;
												}
												if(i1 == 2601)
												{
													Class73.anIntArray1559[j++] = class33_sub15_6.anInt2353;
													continue;
												}
												if(~i1 == -2603)
												{
													Class77.aClass58Array1651[k++] = class33_sub15_6.aClass58_2428;
													continue;
												}
												if(i1 == 2603)
												{
													Class73.anIntArray1559[j++] = class33_sub15_6.anInt2455;
													continue;
												}
												if(~i1 == -2605)
												{
													Class73.anIntArray1559[j++] = class33_sub15_6.anInt2433;
													continue;
												}
												if(i1 == 2605)
												{
													Class73.anIntArray1559[j++] = class33_sub15_6.anInt2457;
													continue;
												}
												if(i1 == 2606)
												{
													Class73.anIntArray1559[j++] = class33_sub15_6.anInt2388;
													continue;
												}
												if(i1 == 2607)
												{
													Class73.anIntArray1559[j++] = class33_sub15_6.anInt2448;
													continue;
												}
												if(~i1 != -2609)
													break;
												Class73.anIntArray1559[j++] = class33_sub15_6.anInt2460;
												continue;
											}
											Class33_Sub15 class33_sub15_7 = Class49.method933(Class73.anIntArray1559[--j], -79);
											if(~i1 == -2501)
											{
												Class73.anIntArray1559[j++] = class33_sub15_7.anInt2443;
												continue;
											}
											if(~i1 == -2502)
											{
												Class73.anIntArray1559[j++] = class33_sub15_7.anInt2356;
												continue;
											}
											if(i1 == 2502)
											{
												Class73.anIntArray1559[j++] = class33_sub15_7.anInt2462;
												continue;
											}
											if(i1 == 2503)
											{
												Class73.anIntArray1559[j++] = class33_sub15_7.anInt2405;
												continue;
											}
											if(~i1 == -2505)
											{
												Class73.anIntArray1559[j++] = class33_sub15_7.aBoolean2430 ? 1 : 0;
												continue;
											}
											if(i1 != 2505)
												break;
											Class73.anIntArray1559[j++] = class33_sub15_7.anInt2464;
											continue;
										}
										Class33_Sub15 class33_sub15_8 = flag ? Class45.aClass33_Sub15_981 : RuntimeException_Sub1.aClass33_Sub15_1816;
										if(~i1 == -1801)
										{
											Class73.anIntArray1559[j++] = Class33.method268((byte)111, Class33_Sub6_Sub5.method403(class33_sub15_8, arg5 + -24306));
											continue;
										}
										if(~i1 == -1802)
										{
											int l27 = Class73.anIntArray1559[--j];
											if(class33_sub15_8.aClass58Array2467 != null && ~l27 > ~class33_sub15_8.aClass58Array2467.length && class33_sub15_8.aClass58Array2467[l27] != null)
												Class77.aClass58Array1651[k++] = class33_sub15_8.aClass58Array2467[l27];
											else
												Class77.aClass58Array1651[k++] = Class43.aClass58_925;
											continue;
										}
										if(i1 != 1802)
											break;
										if(class33_sub15_8.aClass58_2415 != null)
											Class77.aClass58Array1651[k++] = class33_sub15_8.aClass58_2415;
										else
											Class77.aClass58Array1651[k++] = Class43.aClass58_925;
										continue;
									}
									Class33_Sub15 class33_sub15_9 = flag ? Class45.aClass33_Sub15_981 : RuntimeException_Sub1.aClass33_Sub15_1816;
									if(~i1 == -1701)
									{
										Class73.anIntArray1559[j++] = class33_sub15_9.anInt2380;
										continue;
									}
									if(i1 == 1701)
									{
										if(class33_sub15_9.anInt2380 != -1)
											Class73.anIntArray1559[j++] = class33_sub15_9.anInt2379;
										else
											Class73.anIntArray1559[j++] = 0;
										continue;
									}
									if(~i1 != -1703)
										break;
									Class73.anIntArray1559[j++] = class33_sub15_9.anInt2432;
									continue;
								}
								Class33_Sub15 class33_sub15_10 = flag ? Class45.aClass33_Sub15_981 : RuntimeException_Sub1.aClass33_Sub15_1816;
								if(i1 == 1600)
								{
									Class73.anIntArray1559[j++] = class33_sub15_10.anInt2413;
									continue;
								}
								if(~i1 == -1602)
								{
									Class73.anIntArray1559[j++] = class33_sub15_10.anInt2353;
									continue;
								}
								if(~i1 == -1603)
								{
									Class77.aClass58Array1651[k++] = class33_sub15_10.aClass58_2428;
									continue;
								}
								if(~i1 == -1604)
								{
									Class73.anIntArray1559[j++] = class33_sub15_10.anInt2455;
									continue;
								}
								if(i1 == 1604)
								{
									Class73.anIntArray1559[j++] = class33_sub15_10.anInt2433;
									continue;
								}
								if(i1 == 1605)
								{
									Class73.anIntArray1559[j++] = class33_sub15_10.anInt2457;
									continue;
								}
								if(~i1 == -1607)
								{
									Class73.anIntArray1559[j++] = class33_sub15_10.anInt2388;
									continue;
								}
								if(i1 == 1607)
								{
									Class73.anIntArray1559[j++] = class33_sub15_10.anInt2448;
									continue;
								}
								if(~i1 != -1609)
									break;
								Class73.anIntArray1559[j++] = class33_sub15_10.anInt2460;
								continue;
							}
							Class33_Sub15 class33_sub15_11 = flag ? Class45.aClass33_Sub15_981 : RuntimeException_Sub1.aClass33_Sub15_1816;
							if(~i1 == -1501)
							{
								Class73.anIntArray1559[j++] = class33_sub15_11.anInt2443;
								continue;
							}
							if(~i1 == -1502)
							{
								Class73.anIntArray1559[j++] = class33_sub15_11.anInt2356;
								continue;
							}
							if(i1 == 1502)
							{
								Class73.anIntArray1559[j++] = class33_sub15_11.anInt2462;
								continue;
							}
							if(~i1 == -1504)
							{
								Class73.anIntArray1559[j++] = class33_sub15_11.anInt2405;
								continue;
							}
							if(~i1 == -1505)
							{
								Class73.anIntArray1559[j++] = class33_sub15_11.aBoolean2430 ? 1 : 0;
								continue;
							}
							if(~i1 != -1506)
								break;
							Class73.anIntArray1559[j++] = class33_sub15_11.anInt2464;
							continue;
						}
						Class33_Sub15 class33_sub15_12;
						if(~i1 <= -2001)
						{
							i1 -= 1000;
							class33_sub15_12 = Class49.method933(Class73.anIntArray1559[--j], -123);
						} else
						{
							class33_sub15_12 = flag ? Class45.aClass33_Sub15_981 : RuntimeException_Sub1.aClass33_Sub15_1816;
						}
						Class30_Sub1.method248(false, class33_sub15_12);
						if(~i1 == -1001)
						{
							j -= 2;
							class33_sub15_12.anInt2443 = Class73.anIntArray1559[j];
							class33_sub15_12.anInt2356 = Class73.anIntArray1559[1 + j];
							continue;
						}
						if(~i1 == -1002)
						{
							j -= 2;
							class33_sub15_12.anInt2462 = Class73.anIntArray1559[j];
							class33_sub15_12.anInt2405 = Class73.anIntArray1559[1 + j];
							continue;
						}
						if(i1 != 1003)
							break;
						class33_sub15_12.aBoolean2430 = Class73.anIntArray1559[--j] == 1;
						continue;
					}
					if(i1 == 100)
					{
						j -= 3;
						int i28 = Class73.anIntArray1559[1 + j];
						int i18 = Class73.anIntArray1559[j];
						int k30 = Class73.anIntArray1559[2 + j];
						if(~i28 == -1)
							throw new RuntimeException();
						Class33_Sub15 class33_sub15_17 = Class49.method933(i18, -68);
						if(class33_sub15_17.aClass33_Sub15Array2394 == null)
							class33_sub15_17.aClass33_Sub15Array2394 = new Class33_Sub15[1 + k30];
						if(class33_sub15_17.aClass33_Sub15Array2394.length <= k30)
						{
							Class33_Sub15 aclass33_sub15[] = new Class33_Sub15[1 + k30];
							for(int j34 = 0; ~class33_sub15_17.aClass33_Sub15Array2394.length < ~j34; j34++)
								aclass33_sub15[j34] = class33_sub15_17.aClass33_Sub15Array2394[j34];

							class33_sub15_17.aClass33_Sub15Array2394 = aclass33_sub15;
						}
						if(~k30 < -1 && class33_sub15_17.aClass33_Sub15Array2394[k30 - 1] == null)
							throw new RuntimeException("Gap at:" + (k30 + -1));
						Class33_Sub15 class33_sub15_18 = new Class33_Sub15();
						class33_sub15_18.aBoolean2412 = true;
						class33_sub15_18.anInt2464 = class33_sub15_18.anInt2435 = class33_sub15_17.anInt2435;
						class33_sub15_18.anInt2432 = k30;
						class33_sub15_18.anInt2452 = i28;
						class33_sub15_17.aClass33_Sub15Array2394[k30] = class33_sub15_18;
						if(flag)
							Class45.aClass33_Sub15_981 = class33_sub15_18;
						else
							RuntimeException_Sub1.aClass33_Sub15_1816 = class33_sub15_18;
						Class30_Sub1.method248(false, class33_sub15_17);
						continue;
					}
					if(~i1 == -102)
					{
						Class33_Sub15 class33_sub15_13 = flag ? Class45.aClass33_Sub15_981 : RuntimeException_Sub1.aClass33_Sub15_1816;
						Class33_Sub15 class33_sub15_15 = Class49.method933(class33_sub15_13.anInt2435, -50);
						class33_sub15_15.aClass33_Sub15Array2394[class33_sub15_13.anInt2432] = null;
						Class30_Sub1.method248(false, class33_sub15_15);
						continue;
					}
					if(~i1 == -103)
					{
						Class33_Sub15 class33_sub15_14 = Class49.method933(Class73.anIntArray1559[--j], -116);
						class33_sub15_14.aClass33_Sub15Array2394 = null;
						Class30_Sub1.method248(false, class33_sub15_14);
						continue;
					}
					if(~i1 != -201)
						break;
					j -= 2;
					int j28 = Class73.anIntArray1559[1 + j];
					int j18 = Class73.anIntArray1559[j];
					Class33_Sub15 class33_sub15_16 = Class39.method879(j18, (byte)120, j28);
					if(class33_sub15_16 == null || j28 == -1)
					{
						Class73.anIntArray1559[j++] = 0;
					} else
					{
						Class73.anIntArray1559[j++] = 1;
						if(!flag)
							RuntimeException_Sub1.aClass33_Sub15_1816 = class33_sub15_16;
						else
							Class45.aClass33_Sub15_981 = class33_sub15_16;
					}
				} while(true);
				Class58 class58_12 = Class33_Sub16.method801(30, (byte)126);
				if(class33_sub6_sub10.aClass58_2878 != null)
				{
					class58_12.method1029(Class17.aClass58_347, -12860).method1029(class33_sub6_sub10.aClass58_2878, -12860);
					for(int k28 = Class40.anInt882 - 1; ~k28 <= -1; k28--)
						class58_12.method1029(Class33_Sub9.aClass58_2179, arg5 + -31719).method1029(Class26.aClass74Array549[k28].aClass33_Sub6_Sub10_1581.aClass58_2878, -12860);

					if(Class33_Sub15.anInt2445 != 0)
						Class43.method904(0, 0, Class35.method846((byte)-83, new Class58[] {
							Class59.aClass58_1270, class33_sub6_sub10.aClass58_2878
						}), Class43.aClass58_925);
				}
				Class50.method938((byte)-83, null, "CS2 - nosuchop:" + i1 + new String(class58_12.method1060(127)));
				return;
			}
			catch(Exception exception)
			{
				Class58 class58 = Class33_Sub16.method801(30, (byte)125);
				if(class33_sub6_sub10.aClass58_2878 != null)
				{
					class58.method1029(Class17.aClass58_347, -12860).method1029(class33_sub6_sub10.aClass58_2878, arg5 + -31719);
					for(int i2 = Class40.anInt882 + -1; ~i2 <= -1; i2--)
						class58.method1029(Class33_Sub9.aClass58_2179, -12860).method1029(Class26.aClass74Array549[i2].aClass33_Sub6_Sub10_1581.aClass58_2878, -12860);

					if(Class33_Sub15.anInt2445 != 0)
						Class43.method904(0, 0, Class35.method846((byte)-83, new Class58[] {
							Class59.aClass58_1270, class33_sub6_sub10.aClass58_2878
						}), Class43.aClass58_925);
				}
				Class50.method938((byte)-100, exception, "CS2 - scr:" + ((Class33) (class33_sub6_sub10)).aLong747 + " op:" + i1 + new String(class58.method1060(119)));
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cc.B(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? "null" : "{...}") + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public static boolean method119(int arg0, int arg1, int arg2)
	{
		try
		{
			Class33_Sub6_Sub17 class33_sub6_sub17 = Class33_Sub5.method285((byte)-89, arg1);
			if(arg0 == 11)
				arg0 = 10;
			if(arg2 >= -106)
				return true;
			if(~arg0 <= -6 && ~arg0 >= -9)
				arg0 = 4;
			anInt253++;
			return class33_sub6_sub17.method603((byte)-123, arg0);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cc.E(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method120(Object arg0, int arg1, Class72 arg2)
	{
		try
		{
			anInt270++;
			if(arg2.anEventQueue1544 == null)
				return;
			for(int i = 0; i < 50 && arg2.anEventQueue1544.peekEvent() != null; i++)
				Class33_Sub6_Sub17.method593(0, 1L);

			if(arg0 != null)
				arg2.anEventQueue1544.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			if(arg1 != 50)
			{
				aClass58_248 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cc.F(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method121(byte arg0, Class33_Sub6_Sub4_Sub5 arg1)
	{
		try
		{
			anInt262++;
			if(~arg1.anInt3522 == -1)
				return;
			if(~arg1.anInt3546 != 0 && arg1.anInt3546 < 32768)
			{
				Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[arg1.anInt3546];
				if(class33_sub6_sub4_sub5_sub2 != null)
				{
					int l = -((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3548 + arg1.anInt3548;
					int k1 = arg1.anInt3510 - ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3510;
					if(~l != -1 || ~k1 != -1)
						arg1.anInt3519 = (int)(Math.atan2(l, k1) * 325.94900000000001D) & 0x7ff;
				}
			}
			if(arg1.anInt3546 >= 32768)
			{
				int i = -32768 + arg1.anInt3546;
				if(~i == ~Class33_Sub6_Sub6.anInt2786)
					i = 2047;
				Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[i];
				if(class33_sub6_sub4_sub5_sub1 != null)
				{
					int l1 = arg1.anInt3548 + -((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3548;
					int i2 = -((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3510 + arg1.anInt3510;
					if(~l1 != -1 || ~i2 != -1)
						arg1.anInt3519 = (int)(325.94900000000001D * Math.atan2(l1, i2)) & 0x7ff;
				}
			}
			if((~arg1.anInt3572 != -1 || arg1.anInt3535 != 0) && (arg1.anInt3513 == 0 || arg1.anInt3514 > 0))
			{
				int i1 = arg1.anInt3510 - 64 * (arg1.anInt3535 + (-Class33_Sub2.anInt2036 - Class33_Sub2.anInt2036));
				int j = arg1.anInt3548 - 64 * (-Class69.anInt1475 + (arg1.anInt3572 + -Class69.anInt1475));
				if(j != 0 || ~i1 != -1)
					arg1.anInt3519 = (int)(325.94900000000001D * Math.atan2(j, i1)) & 0x7ff;
				arg1.anInt3535 = 0;
				arg1.anInt3572 = 0;
			}
			int j1 = -108 % ((-7 - arg0) / 40);
			int k = 0x7ff & -arg1.anInt3549 + arg1.anInt3519;
			if(k == 0)
			{
				arg1.anInt3500 = 0;
				return;
			}
			arg1.anInt3500++;
			if(k > 1024)
			{
				arg1.anInt3549 -= arg1.anInt3522;
				boolean flag = true;
				if(~arg1.anInt3522 < ~k || k > 2048 - arg1.anInt3522)
				{
					arg1.anInt3549 = arg1.anInt3519;
					flag = false;
				}
				if(~arg1.anInt3499 == ~arg1.anInt3569 && (~arg1.anInt3500 < -26 || flag))
					if(arg1.anInt3525 == -1)
						arg1.anInt3499 = arg1.anInt3532;
					else
						arg1.anInt3499 = arg1.anInt3525;
			} else
			{
				arg1.anInt3549 += arg1.anInt3522;
				boolean flag1 = true;
				if(arg1.anInt3522 > k || k > -arg1.anInt3522 + 2048)
				{
					flag1 = false;
					arg1.anInt3549 = arg1.anInt3519;
				}
				if(arg1.anInt3499 == arg1.anInt3569 && (~arg1.anInt3500 < -26 || flag1))
					if(~arg1.anInt3496 != 0)
						arg1.anInt3499 = arg1.anInt3496;
					else
						arg1.anInt3499 = arg1.anInt3532;
			}
			arg1.anInt3549 &= 0x7ff;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cc.G(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method122(Class33_Sub6_Sub7_Sub3 arg0, int arg1, int arg2, int arg3)
	{
		try
		{
			if(arg3 != 3603)
				anInt246 = 10;
			anInt267++;
			int i = arg1 * arg1 + arg2 * arg2;
			if(i > 4225 && i < 0x15f90)
			{
				int j = 0x7ff & Class23.anInt430 + Class65.anInt1394;
				int k = Class33_Sub6_Sub7_Sub1.anIntArray3681[j];
				k = (256 * k) / (256 + Class24.anInt504);
				int l = Class33_Sub6_Sub7_Sub1.anIntArray3678[j];
				l = (256 * l) / (256 + Class24.anInt504);
				int j1 = -(arg2 * k) + arg1 * l >> 0x17121230;
				int i1 = arg1 * k - -(arg2 * l) >> 0xc6971990;
				double d = Math.atan2(i1, j1);
				int k1 = (int)(63D * Math.sin(d));
				int l1 = (int)(Math.cos(d) * 57D);
				Class81.aClass33_Sub6_Sub7_Sub3_1746.method473((84 - -k1) + 4, 83 - (l1 + 20), 20, 20, 15, 15, d, 256);
				return;
			} else
			{
				Class77_Sub2.method1177(arg1, false, arg0, arg2);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cc.A(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static void method123(byte arg0)
	{
		try
		{
			aClass58_268 = null;
			aClass58_255 = null;
			anIntArray263 = null;
			aClass58_269 = null;
			aClass58_248 = null;
			aClass58Array245 = null;
			aClass58_249 = null;
			if(arg0 <= 39)
				method120(null, -86, null);
			aClass58_258 = null;
			aClass58_264 = null;
			aClass33_Sub6_Sub7_Sub3_265 = null;
			aClass15_252 = null;
			aClass58_251 = null;
			aClass58_256 = null;
			aClass58_250 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cc.C(" + arg0 + ')');
		}
	}

	public static void method124(int arg0)
	{
		try
		{
			anInt261++;
			Class59.method1067(1);
			Class33_Sub6_Sub16.aBoolean3112 = true;
			Class33_Sub20.method822((byte)-117);
			if(arg0 != -17537)
				aClass58_264 = null;
			if(~Class77_Sub2.anInt2644 != 0)
			{
				boolean flag = Class33_Sub2.method275(1, -19850, Class77_Sub2.anInt2644, 190, 0, 261, 0);
				if(!flag)
					Class74.aBoolean1579 = true;
			} else
			if(~Class14.anIntArray274[Class30.anInt620] != 0)
			{
				boolean flag1 = Class33_Sub2.method275(1, -19850, Class14.anIntArray274[Class30.anInt620], 190, 0, 261, 0);
				if(!flag1)
					Class74.aBoolean1579 = true;
			}
			if(Class33_Sub6_Sub4_Sub4.aBoolean3486 && Class33_Sub6.anInt2127 == 1)
				if(Class75.anInt1617 == 1)
					Class24.method190(false);
				else
					Class33_Sub6_Sub4_Sub5_Sub2.method373(117);
			Class31.method255(false);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "cc.D(" + arg0 + ')');
		}
	}

	public static Class58 aClass58Array245[] = new Class58[5];
	public static int anInt246 = 0x23201b;
	public static boolean aBoolean247 = false;
	public static Class58 aClass58_248 = Class33_Sub6_Sub11.method535(121, "60 Sekunden noch einmal)3)3)3");
	public static Class58 aClass58_249;
	public static Class58 aClass58_250;
	public static Class58 aClass58_251;
	public static Class15 aClass15_252;
	public static int anInt253;
	public static int anInt254 = 0;
	public static Class58 aClass58_255 = Class33_Sub6_Sub11.method535(119, "(U2");
	public static Class58 aClass58_256 = Class33_Sub6_Sub11.method535(110, "Lade Schrifts-=tze )2 ");
	public static int anInt257;
	public static Class58 aClass58_258;
	public static int anInt259 = 0x332d25;
	public static int anInt260 = -1;
	public static int anInt261;
	public static int anInt262;
	public static int anIntArray263[];
	public static Class58 aClass58_264;
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3_265;
	public static int anInt266;
	public static int anInt267;
	public static Class58 aClass58_268 = Class33_Sub6_Sub11.method535(127, "Begeben Sie sich in ein freies Gebiet)1 um");
	public static Class58 aClass58_269;
	public static int anInt270;
	public static boolean aBoolean271;

	static 
	{
		aClass58_264 = Class33_Sub6_Sub11.method535(112, "Moderator option: Mute player for 48 hours: <lt>OFF<gt>");
		aClass58_258 = Class33_Sub6_Sub11.method535(119, "Bad session id)3");
		aClass58_249 = aClass58_264;
		aClass58_251 = aClass58_258;
		aClass58_269 = Class33_Sub6_Sub11.method535(125, "Unable to find ");
		aClass58_250 = aClass58_269;
	}
}
