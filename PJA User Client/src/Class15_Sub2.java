// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class15_Sub2.java

import java.awt.*;
import java.awt.image.*;

public class Class15_Sub2 extends Class15
	implements ImageProducer, ImageObserver
{

	public static boolean method137(int arg0, int arg1, boolean arg2, int arg3, int arg4, Class33_Sub15 arg5[], int arg6, int arg7, 
			int arg8, int arg9)
	{
		try
		{
			anInt1965++;
			Class33_Sub6_Sub7.method422(arg9, arg4, arg0, arg1);
			boolean flag = arg2;
			for(int i = 0; ~arg5.length < ~i; i++)
			{
				Class33_Sub15 class33_sub15 = arg5[i];
				if(class33_sub15 == null || ~arg3 != ~class33_sub15.anInt2464 && (~arg3 != 0x54325432 || Class59.anInt1276 != class33_sub15.anInt2435 || ~Class33_Sub6_Sub3.anInt2729 != ~class33_sub15.anInt2432))
					continue;
				if(~class33_sub15.anInt2446 < -1)
					Class33_Sub16.method804(class33_sub15, 1);
				int k = class33_sub15.anInt2356 + (arg4 - arg6);
				int l = class33_sub15.anInt2439;
				int j = -arg7 + (arg9 + class33_sub15.anInt2443);
				if(class33_sub15.anInt2435 == Class59.anInt1276 && class33_sub15.anInt2432 == Class33_Sub6_Sub3.anInt2729)
				{
					if(~arg3 != 0x54325432 && !class33_sub15.aBoolean2344)
					{
						Class27.anInt565 = -arg4 + arg6;
						Class49.anInt1077 = -arg9 + arg7;
						Class20.aClass33_Sub15Array386 = arg5;
						continue;
					}
					Class33_Sub15 class33_sub15_1 = Class49.method931(class33_sub15, 108);
					if(class33_sub15_1 != null)
					{
						int i2 = Applet_Sub1.anInt41;
						int i4 = Class13.anInt254;
						if(Class19.anInt375 == 0)
						{
							i4 -= 4;
							i2 -= 4;
						}
						if(~Class19.anInt375 == -2)
						{
							i2 -= 553;
							i4 -= 205;
						}
						if(~Class19.anInt375 == -3)
						{
							i2 -= 17;
							i4 -= 357;
						}
						i4 -= Class31.anInt695;
						i2 -= Class32.anInt710;
						int ai[] = Class38.method874(arg2, class33_sub15_1);
						if(i2 < ai[0])
							i2 = ai[0];
						if(i4 < ai[1])
							i4 = ai[1];
						if(ai[1] - -class33_sub15_1.anInt2405 < class33_sub15.anInt2405 + i4)
							i4 = -class33_sub15.anInt2405 + class33_sub15_1.anInt2405 + ai[1];
						if(class33_sub15.anInt2462 + i2 > class33_sub15_1.anInt2462 + ai[0])
							i2 = class33_sub15_1.anInt2462 + (ai[0] - class33_sub15.anInt2462);
						Class33_Sub15 class33_sub15_2 = Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[class33_sub15.anInt2435 >> 0xc5f88dd0][class33_sub15.anInt2464 & 0xffff];
						int ai2[] = Class38.method874(true, class33_sub15_2);
						if(!class33_sub15.aBoolean2344)
							l = 128;
						int l10 = i4 + (-ai2[1] + class33_sub15_2.anInt2353);
						int i9 = class33_sub15_2.anInt2413 + (-ai2[0] + i2);
						int j12 = i9 - class33_sub15.anInt2443;
						int j13 = l10 - class33_sub15.anInt2356;
						if(class33_sub15.anInt2391 >= j12 && -class33_sub15.anInt2391 <= j12 && ~j13 >= ~class33_sub15.anInt2391 && ~j13 <= ~-class33_sub15.anInt2391 && !Class14.aBoolean285)
						{
							j12 = 0;
							j13 = 0;
						} else
						if(Class47.anInt1040 <= class33_sub15.anInt2447 && !Class14.aBoolean285)
						{
							j12 = 0;
							j13 = 0;
						}
						k += j13;
						j += j12;
					} else
					{
						Class33_Sub6_Sub3.anInt2729 = -1;
						Class59.anInt1276 = -1;
					}
				}
				if(class33_sub15.aBoolean2412 && (Class33_Sub6_Sub7.anInt2799 < j || k > Class33_Sub6_Sub7.anInt2793 || Class33_Sub6_Sub7.anInt2798 > class33_sub15.anInt2462 + j || ~Class33_Sub6_Sub7.anInt2794 < ~(class33_sub15.anInt2405 + k)) || class33_sub15.aBoolean2412 && Class71.method1139((byte)107, class33_sub15))
					continue;
				if(class33_sub15.anInt2452 == 0)
				{
					if(!class33_sub15.aBoolean2412 && Class71.method1139((byte)68, class33_sub15) && !Class39.method882(87, i, arg8))
						continue;
					if(!class33_sub15.aBoolean2412)
					{
						if(class33_sub15.anInt2353 > -class33_sub15.anInt2405 + class33_sub15.anInt2433)
							class33_sub15.anInt2353 = -class33_sub15.anInt2405 + class33_sub15.anInt2433;
						if(class33_sub15.anInt2353 < 0)
							class33_sub15.anInt2353 = 0;
					}
					flag &= method137(j + class33_sub15.anInt2462, class33_sub15.anInt2405 + k, true, class33_sub15.anInt2435, k, arg5, class33_sub15.anInt2353, class33_sub15.anInt2413, arg8, j);
					if(class33_sub15.aClass33_Sub15Array2394 != null)
						flag &= method137(class33_sub15.anInt2462 + j, class33_sub15.anInt2405 + k, true, class33_sub15.anInt2435, k, class33_sub15.aClass33_Sub15Array2394, class33_sub15.anInt2353, class33_sub15.anInt2413, arg8, j);
					Class33_Sub6_Sub7.method422(arg9, arg4, arg0, arg1);
					if(~class33_sub15.anInt2405 > ~class33_sub15.anInt2433 && !class33_sub15.aBoolean2412)
						Class33_Sub6_Sub13.method561(class33_sub15.anInt2405, j - -class33_sub15.anInt2462, class33_sub15.anInt2353, (byte)75, k, class33_sub15.anInt2433);
				}
				if(~class33_sub15.anInt2452 == -2)
					continue;
				if(class33_sub15.anInt2452 == 2)
				{
					int i1 = 0;
					for(int j2 = 0; class33_sub15.anInt2405 > j2; j2++)
					{
						for(int j4 = 0; class33_sub15.anInt2462 > j4; j4++)
						{
							int j5 = j - -((class33_sub15.anInt2390 + 32) * j4);
							int k6 = (class33_sub15.anInt2399 + 32) * j2 + k;
							if(~i1 > -21)
							{
								k6 += class33_sub15.anIntArray2414[i1];
								j5 += class33_sub15.anIntArray2351[i1];
							}
							if(~class33_sub15.anIntArray2471[i1] < -1)
							{
								boolean flag2 = false;
								boolean flag3 = false;
								int i11 = -1 + class33_sub15.anIntArray2471[i1];
								if(j5 > -32 + Class33_Sub6_Sub7.anInt2798 && Class33_Sub6_Sub7.anInt2799 > j5 && Class33_Sub6_Sub7.anInt2794 + -32 < k6 && k6 < Class33_Sub6_Sub7.anInt2793 || RuntimeException_Sub1.anInt1819 != 0 && Class40.anInt890 == i1)
								{
									Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3_3;
									if(~Class33_Sub6_Sub4_Sub6.anInt3590 == -2 && ~i1 == ~Class31.anInt699 && class33_sub15.anInt2435 == Class33_Sub16.anInt2494)
										class33_sub6_sub7_sub3_3 = Class23.method188(i11, 0, false, 2, 97, class33_sub15.anIntArray2398[i1]);
									else
										class33_sub6_sub7_sub3_3 = Class23.method188(i11, 0x302020, false, 1, 125, class33_sub15.anIntArray2398[i1]);
									if(class33_sub6_sub7_sub3_3 == null)
										flag = false;
									else
									if(RuntimeException_Sub1.anInt1819 == 0 || i1 != Class40.anInt890 || class33_sub15.anInt2435 != Class40.anInt884)
									{
										if(~Class33_Sub6_Sub4.anInt2742 == -1 || i1 != Class66.anInt1421 || class33_sub15.anInt2435 != Class21.anInt401)
											class33_sub6_sub7_sub3_3.method478(j5, k6);
										else
											class33_sub6_sub7_sub3_3.method497(j5, k6, 128);
									} else
									{
										int j9 = -Class12.anInt233 + Class13.anInt254;
										int k7 = Applet_Sub1.anInt41 + -Class51.anInt1101;
										if(j9 < 5 && j9 > -5)
											j9 = 0;
										if(k7 < 5 && k7 > -5)
											k7 = 0;
										if(Class33_Sub6_Sub10.anInt2861 < 5)
										{
											j9 = 0;
											k7 = 0;
										}
										class33_sub6_sub7_sub3_3.method497(j5 + k7, k6 - -j9, 128);
										if(arg3 != -1)
										{
											Class33_Sub15 class33_sub15_3 = arg5[0xffff & arg3];
											if(j9 + k6 < Class33_Sub6_Sub7.anInt2794 && class33_sub15_3.anInt2353 > 0)
											{
												int i14 = ((Class33_Sub6_Sub7.anInt2794 - (k6 + j9)) * Class40.anInt895) / 3;
												if(~(10 * Class40.anInt895) > ~i14)
													i14 = Class40.anInt895 * 10;
												if(i14 > class33_sub15_3.anInt2353)
													i14 = class33_sub15_3.anInt2353;
												class33_sub15_3.anInt2353 -= i14;
												Class12.anInt233 += i14;
											}
											if(~(32 + (k6 + j9)) < ~Class33_Sub6_Sub7.anInt2793 && class33_sub15_3.anInt2353 < -class33_sub15_3.anInt2405 + class33_sub15_3.anInt2433)
											{
												int j14 = ((32 + (j9 + (k6 + -Class33_Sub6_Sub7.anInt2793))) * Class40.anInt895) / 3;
												if(~j14 < ~(10 * Class40.anInt895))
													j14 = Class40.anInt895 * 10;
												if((class33_sub15_3.anInt2433 + -class33_sub15_3.anInt2405) - class33_sub15_3.anInt2353 < j14)
													j14 = -class33_sub15_3.anInt2405 + class33_sub15_3.anInt2433 + -class33_sub15_3.anInt2353;
												class33_sub15_3.anInt2353 += j14;
												Class12.anInt233 -= j14;
											}
										}
									}
								}
							} else
							if(class33_sub15.anIntArray2408 != null && i1 < 20)
							{
								Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3_2 = class33_sub15.method788(i1, (byte)-112);
								if(class33_sub6_sub7_sub3_2 != null)
									class33_sub6_sub7_sub3_2.method478(j5, k6);
								else
								if(Class33_Sub6_Sub9.aBoolean2850)
									flag = false;
							}
							i1++;
						}

					}

					continue;
				}
				if(class33_sub15.anInt2452 == 3)
				{
					int j1;
					if(!Class16.method153(class33_sub15, 0))
					{
						j1 = class33_sub15.anInt2410;
						if(Class39.method882(40, i, arg8) && ~class33_sub15.anInt2463 != -1)
							j1 = class33_sub15.anInt2463;
					} else
					{
						j1 = class33_sub15.anInt2397;
						if(Class39.method882(91, i, arg8) && class33_sub15.anInt2348 != 0)
							j1 = class33_sub15.anInt2348;
					}
					if(l != 0)
					{
						if(!class33_sub15.aBoolean2338)
							Class33_Sub6_Sub7.method420(j, k, class33_sub15.anInt2462, class33_sub15.anInt2405, j1, -(l & 0xff) + 256);
						else
							Class33_Sub6_Sub7.method425(j, k, class33_sub15.anInt2462, class33_sub15.anInt2405, j1, 256 - (0xff & l));
					} else
					if(class33_sub15.aBoolean2338)
						Class33_Sub6_Sub7.method424(j, k, class33_sub15.anInt2462, class33_sub15.anInt2405, j1);
					else
						Class33_Sub6_Sub7.method415(j, k, class33_sub15.anInt2462, class33_sub15.anInt2405, j1);
					continue;
				}
				if(~class33_sub15.anInt2452 == -5)
				{
					Class33_Sub6_Sub7_Sub2 class33_sub6_sub7_sub2 = class33_sub15.method789(0);
					if(class33_sub6_sub7_sub2 == null)
					{
						if(Class33_Sub6_Sub9.aBoolean2850)
							flag = false;
					} else
					{
						Class58 class58 = class33_sub15.aClass58_2428;
						int k2;
						if(!Class16.method153(class33_sub15, 0))
						{
							k2 = class33_sub15.anInt2410;
							if(Class39.method882(74, i, arg8) && ~class33_sub15.anInt2463 != -1)
								k2 = class33_sub15.anInt2463;
						} else
						{
							k2 = class33_sub15.anInt2397;
							if(Class39.method882(127, i, arg8) && ~class33_sub15.anInt2348 != -1)
								k2 = class33_sub15.anInt2348;
							if(~class33_sub15.aClass58_2376.method1035(27) < -1)
								class58 = class33_sub15.aClass58_2376;
						}
						if(class33_sub15.aBoolean2412 && ~class33_sub15.anInt2380 != 0)
						{
							Class33_Sub6_Sub11 class33_sub6_sub11 = Class14.method127(class33_sub15.anInt2380, (byte)90);
							class58 = class33_sub6_sub11.aClass58_2898;
							if(class58 == null)
								class58 = Class57.aClass58_1254;
							if((~class33_sub6_sub11.anInt2944 == -2 || class33_sub15.anInt2379 != 1) && class33_sub15.anInt2379 != -1)
								class58 = Class35.method846((byte)-83, new Class58[] {
									Class27.aClass58_556, class58, Class81.aClass58_1768, Class23.method182(class33_sub15.anInt2379, (byte)-125)
								});
						}
						if(~class33_sub15.anInt2435 == ~Class33_Sub18.anInt2514 && class33_sub15.anInt2432 == Class82.anInt1792)
						{
							k2 = class33_sub15.anInt2410;
							class58 = Class33_Sub6_Sub4_Sub1.aClass58_3365;
						}
						if(Class33_Sub6_Sub7.anInt2797 == 479)
						{
							if(~k2 == 0xff0000ff)
								k2 = 255;
							if(k2 == 49152)
								k2 = 0xffffff;
						}
						class58 = Class33_Sub5.method286(12074, class58, class33_sub15);
						class33_sub6_sub7_sub2.method453(class58, j, k, class33_sub15.anInt2462, class33_sub15.anInt2405, k2, class33_sub15.aBoolean2419 ? 0 : -1, class33_sub15.anInt2359, class33_sub15.anInt2371, class33_sub15.anInt2343);
					}
					continue;
				}
				if(class33_sub15.anInt2452 == 5)
				{
					if(class33_sub15.aBoolean2412)
					{
						Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3;
						if(~class33_sub15.anInt2380 != 0)
							class33_sub6_sub7_sub3 = Class23.method188(class33_sub15.anInt2380, class33_sub15.anInt2441, false, class33_sub15.anInt2425, 92, class33_sub15.anInt2379);
						else
							class33_sub6_sub7_sub3 = class33_sub15.method795(false, -6524);
						if(class33_sub6_sub7_sub3 == null)
						{
							if(Class33_Sub6_Sub9.aBoolean2850)
								flag = false;
						} else
						{
							int l2 = class33_sub6_sub7_sub3.anInt3728;
							int k4 = class33_sub6_sub7_sub3.anInt3726;
							if(!class33_sub15.aBoolean2424)
							{
								int k5 = (class33_sub15.anInt2462 * 4096) / l2;
								if(~class33_sub15.anInt2354 != -1)
									class33_sub6_sub7_sub3.method488(j - -(class33_sub15.anInt2462 / 2), k - -(class33_sub15.anInt2405 / 2), class33_sub15.anInt2354, k5);
								else
								if(~l == -1)
								{
									if(~l2 == ~class33_sub15.anInt2462 && ~class33_sub15.anInt2405 == ~k4)
										class33_sub6_sub7_sub3.method478(j, k);
									else
										class33_sub6_sub7_sub3.method496(j, k, class33_sub15.anInt2462, class33_sub15.anInt2405);
								} else
								{
									class33_sub6_sub7_sub3.method479(j, k, class33_sub15.anInt2462, class33_sub15.anInt2405, 256 + -(l & 0xff));
								}
							} else
							{
								int l7 = k;
								int ai1[] = new int[4];
								int l6 = j;
								Class33_Sub6_Sub7.method413(ai1);
								int j11 = class33_sub15.anInt2405 + k;
								if(j11 > ai1[3])
									j11 = ai1[3];
								if(~l6 > ~ai1[0])
									l6 = ai1[0];
								if(l7 < ai1[1])
									l7 = ai1[1];
								int k9 = j - -class33_sub15.anInt2462;
								if(ai1[2] < k9)
									k9 = ai1[2];
								Class33_Sub6_Sub7.method422(l6, l7, k9, j11);
								int k12 = (-1 - (-l2 - class33_sub15.anInt2462)) / l2;
								int k13 = (class33_sub15.anInt2405 - (1 + -k4)) / k4;
								for(int k14 = 0; k12 > k14; k14++)
								{
									for(int i15 = 0; ~i15 > ~k13; i15++)
										if(~class33_sub15.anInt2354 == -1)
										{
											if(l != 0)
												class33_sub6_sub7_sub3.method497(j - -(k14 * l2), i15 * k4 + k, 256 - (0xff & l));
											else
												class33_sub6_sub7_sub3.method478(j - -(l2 * k14), k + k4 * i15);
										} else
										{
											class33_sub6_sub7_sub3.method488(l2 / 2 + l2 * k14 + j, (k - -(i15 * k4)) + k4 / 2, class33_sub15.anInt2354, 4096);
										}

								}

								Class33_Sub6_Sub7.method419(ai1);
							}
						}
					} else
					{
						Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3_1 = class33_sub15.method795(Class16.method153(class33_sub15, 0), -6524);
						if(class33_sub6_sub7_sub3_1 != null)
							class33_sub6_sub7_sub3_1.method478(j, k);
						else
						if(Class33_Sub6_Sub9.aBoolean2850)
							flag = false;
					}
					continue;
				}
				if(~class33_sub15.anInt2452 == -7)
				{
					boolean flag1 = Class16.method153(class33_sub15, 0);
					Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = null;
					int l5 = 0;
					int i3;
					if(flag1)
						i3 = class33_sub15.anInt2367;
					else
						i3 = class33_sub15.anInt2374;
					if(~class33_sub15.anInt2380 != 0)
					{
						Class33_Sub6_Sub11 class33_sub6_sub11_1 = Class14.method127(class33_sub15.anInt2380, (byte)90);
						if(class33_sub6_sub11_1 != null)
						{
							class33_sub6_sub11_1 = class33_sub6_sub11_1.method533(class33_sub15.anInt2379, -1);
							class33_sub6_sub4_sub3 = class33_sub6_sub11_1.method531(-9570, 1);
							if(class33_sub6_sub4_sub3 != null)
							{
								class33_sub6_sub4_sub3.method334();
								l5 = ((Class33_Sub6_Sub4) (class33_sub6_sub4_sub3)).anInt2737 / 2;
							} else
							{
								flag = false;
							}
						}
					} else
					if(class33_sub15.anInt2401 == 5)
					{
						if(~class33_sub15.anInt2423 == -1)
							class33_sub6_sub4_sub3 = Class37.aClass46_809.method923(-1, null, -1, null, (byte)1);
						else
							class33_sub6_sub4_sub3 = Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.method319(-6941);
					} else
					if(i3 != -1)
					{
						Class33_Sub6_Sub14 class33_sub6_sub14 = Class33_Sub21.method830(i3, -114);
						class33_sub6_sub4_sub3 = class33_sub15.method794(flag1, class33_sub6_sub14, class33_sub15.anInt2421, 120, Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.aClass46_3754);
						if(class33_sub6_sub4_sub3 == null && Class33_Sub6_Sub9.aBoolean2850)
							flag = false;
					} else
					{
						class33_sub6_sub4_sub3 = class33_sub15.method794(flag1, null, -1, 115, Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.aClass46_3754);
						if(class33_sub6_sub4_sub3 == null && Class33_Sub6_Sub9.aBoolean2850)
							flag = false;
					}
					Class33_Sub6_Sub7_Sub1.method435(class33_sub15.anInt2462 / 2 + j, class33_sub15.anInt2405 / 2 + k);
					int i7 = Class33_Sub6_Sub7_Sub1.anIntArray3681[class33_sub15.anInt2388] * class33_sub15.anInt2457 >> 0x92c34150;
					int i8 = Class33_Sub6_Sub7_Sub1.anIntArray3678[class33_sub15.anInt2388] * class33_sub15.anInt2457 >> 0xbfc0c010;
					if(class33_sub6_sub4_sub3 != null)
						if(class33_sub15.aBoolean2412)
						{
							class33_sub6_sub4_sub3.method334();
							if(class33_sub15.aBoolean2352)
								class33_sub6_sub4_sub3.method326(0, class33_sub15.anInt2460, class33_sub15.anInt2448, class33_sub15.anInt2388, class33_sub15.anInt2381, (l5 + i7) - -class33_sub15.anInt2459, class33_sub15.anInt2459 + i8, class33_sub15.anInt2457);
							else
								class33_sub6_sub4_sub3.method345(0, class33_sub15.anInt2460, class33_sub15.anInt2448, class33_sub15.anInt2388, class33_sub15.anInt2381, class33_sub15.anInt2459 + l5 + i7, i8 + class33_sub15.anInt2459);
						} else
						{
							class33_sub6_sub4_sub3.method345(0, class33_sub15.anInt2460, 0, class33_sub15.anInt2388, 0, i7, i8);
						}
					Class33_Sub6_Sub7_Sub1.method430();
					continue;
				}
				if(~class33_sub15.anInt2452 == -8)
				{
					Class33_Sub6_Sub7_Sub2 class33_sub6_sub7_sub2_1 = class33_sub15.method789(0);
					if(class33_sub6_sub7_sub2_1 == null)
					{
						if(Class33_Sub6_Sub9.aBoolean2850)
							flag = false;
						continue;
					}
					int j3 = 0;
					for(int l4 = 0; l4 < class33_sub15.anInt2405; l4++)
					{
						for(int i6 = 0; ~class33_sub15.anInt2462 < ~i6; i6++)
						{
							if(~class33_sub15.anIntArray2471[j3] < -1)
							{
								Class33_Sub6_Sub11 class33_sub6_sub11_2 = Class14.method127(-1 + class33_sub15.anIntArray2471[j3], (byte)90);
								Class58 class58_4 = class33_sub6_sub11_2.aClass58_2898;
								if(class58_4 == null)
									class58_4 = Class57.aClass58_1254;
								if(~class33_sub6_sub11_2.anInt2944 == -2 || class33_sub15.anIntArray2398[j3] != 1)
									class58_4 = Class35.method846((byte)-83, new Class58[] {
										Class27.aClass58_556, class58_4, Class81.aClass58_1768, Class23.method182(class33_sub15.anIntArray2398[j3], (byte)-119)
									});
								int l9 = i6 * (class33_sub15.anInt2390 + 115) + j;
								int k11 = (class33_sub15.anInt2399 + 12) * l4 + k;
								if(class33_sub15.anInt2359 != 0)
								{
									if(~class33_sub15.anInt2359 == -2)
										class33_sub6_sub7_sub2_1.method459(class58_4, l9 + class33_sub15.anInt2462 / 2, k11, class33_sub15.anInt2410, class33_sub15.aBoolean2419 ? 0 : -1);
									else
										class33_sub6_sub7_sub2_1.method449(class58_4, -1 + class33_sub15.anInt2462 + l9, k11, class33_sub15.anInt2410, class33_sub15.aBoolean2419 ? 0 : -1);
								} else
								{
									class33_sub6_sub7_sub2_1.method464(class58_4, l9, k11, class33_sub15.anInt2410, class33_sub15.aBoolean2419 ? 0 : -1);
								}
							}
							j3++;
						}

					}

				}
				if(~class33_sub15.anInt2452 == -9 && Class33_Sub19.method821(arg8, i, arg2) && Class51.anInt1096 == Class4.anInt130)
				{
					Class58 class58_1 = class33_sub15.aClass58_2428;
					int k3 = 0;
					int k1 = 0;
					Class33_Sub6_Sub7_Sub2 class33_sub6_sub7_sub2_2 = Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2677;
					for(class58_1 = Class33_Sub5.method286(12074, class58_1, class33_sub15); ~class58_1.method1035(27) < -1;)
					{
						int j8 = class58_1.method1046((byte)-112, Class33_Sub7.aClass58_2166);
						Class58 class58_2;
						if(j8 != -1)
						{
							class58_2 = class58_1.method1063(0, (byte)127, j8);
							class58_1 = class58_1.method1028(j8 - -4, (byte)120);
						} else
						{
							class58_2 = class58_1;
							class58_1 = Class33_Sub13_Sub4.aClass58_3261;
						}
						int i10 = class33_sub6_sub7_sub2_2.method465(class58_2);
						k3 += 1 + class33_sub6_sub7_sub2_2.anInt3719;
						if(k1 < i10)
							k1 = i10;
					}

					k1 += 6;
					k3 += 7;
					int k8 = -5 + j + (class33_sub15.anInt2462 + -k1);
					if(k8 < 5 + j)
						k8 = 5 + j;
					if(k8 - -k1 > arg0)
						k8 = arg0 - k1;
					int j10 = k + (class33_sub15.anInt2405 + 5);
					if(arg1 < k3 + j10)
						j10 = arg1 + -k3;
					Class33_Sub6_Sub7.method424(k8, j10, k1, k3, 0xffffa0);
					Class33_Sub6_Sub7.method415(k8, j10, k1, k3, 0);
					int l11 = (j10 - -class33_sub6_sub7_sub2_2.anInt3719) + 2;
					class58_1 = class33_sub15.aClass58_2428;
					for(class58_1 = Class33_Sub5.method286(12074, class58_1, class33_sub15); class58_1.method1035(27) > 0;)
					{
						int l12 = class58_1.method1046((byte)-74, Class33_Sub7.aClass58_2166);
						Class58 class58_3;
						if(~l12 != 0)
						{
							class58_3 = class58_1.method1063(0, (byte)121, l12);
							class58_1 = class58_1.method1028(4 + l12, (byte)120);
						} else
						{
							class58_3 = class58_1;
							class58_1 = Class33_Sub13_Sub4.aClass58_3261;
						}
						class33_sub6_sub7_sub2_2.method464(class58_3, 3 + k8, l11, 0, -1);
						l11 += 1 + class33_sub6_sub7_sub2_2.anInt3719;
					}

				}
				if(~class33_sub15.anInt2452 == -10)
					if(class33_sub15.anInt2395 != 1)
					{
						int l3 = ~class33_sub15.anInt2405 <= -1 ? class33_sub15.anInt2405 : -class33_sub15.anInt2405;
						int l1 = class33_sub15.anInt2462 < 0 ? -class33_sub15.anInt2462 : class33_sub15.anInt2462;
						int i5 = l1;
						if(~i5 > ~l3)
							i5 = l3;
						if(~i5 != -1)
						{
							int j6 = (class33_sub15.anInt2462 << 0xa73aa690) / i5;
							int j7 = (class33_sub15.anInt2405 << 0x2640b0f0) / i5;
							if(~j6 > ~j7)
								j7 = -j7;
							else
								j6 = -j6;
							int k10 = class33_sub15.anInt2395 * j7 - -1 >> 0xb2a01ab1;
							int l8 = class33_sub15.anInt2395 * j7 >> 0x69450d31;
							int i12 = class33_sub15.anInt2395 * j6 >> 0x65356b11;
							int i13 = class33_sub15.anInt2395 * j6 - -1 >> 0x707a88b1;
							int l14 = j + -k10;
							int l13 = l8 + j;
							int j15 = -k10 + class33_sub15.anInt2462 + j;
							int k15 = l8 + (j - -class33_sub15.anInt2462);
							int l15 = k - -i12;
							int j16 = (k + class33_sub15.anInt2405) - i13;
							int i16 = k - i13;
							int k16 = i12 + (class33_sub15.anInt2405 + k);
							Class33_Sub6_Sub7_Sub1.method441(l13, l14, j15);
							Class33_Sub6_Sub7_Sub1.method436(l15, i16, j16, l13, l14, j15, class33_sub15.anInt2410);
							Class33_Sub6_Sub7_Sub1.method441(l13, j15, k15);
							Class33_Sub6_Sub7_Sub1.method436(l15, j16, k16, l13, j15, k15, class33_sub15.anInt2410);
						}
					} else
					{
						Class33_Sub6_Sub7.method418(j, k, j - -class33_sub15.anInt2462, class33_sub15.anInt2405 + k, class33_sub15.anInt2410);
					}
			}

			return flag;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "of.M(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? "null" : "{...}") + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
		}
	}

	public void startProduction(ImageConsumer arg0)
	{
		try
		{
			anInt1966++;
			addConsumer(arg0);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "of.startProduction(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0)
	{
		try
		{
			anInt1968++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "of.requestTopDownLeftRightResend(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static Class79 method138(int arg0, int arg1, Component arg2, Class72 arg3, int arg4)
	{
		try
		{
			anInt1964++;
			if(Class39.anInt863 == 0)
				throw new IllegalStateException();
			if(arg0 < 0 || ~arg0 <= -3)
				throw new IllegalArgumentException();
			if(~arg1 > -257)
				arg1 = 256;
			try
			{
				Class79 class79 = (Class79)Class.forName("Class79_Sub1").newInstance();
				class79.anIntArray1687 = new int[256 * (Class39.aBoolean857 ? 2 : 1)];
				class79.anInt1721 = arg1;
				class79.method1186(arg2);
				class79.anInt1723 = 1024 + (arg1 & 0xfffffc00);
				if(class79.anInt1723 > 16384)
					class79.anInt1723 = 16384;
				class79.method1192(class79.anInt1723);
				if(~Class30.anInt654 < -1 && Class33_Sub2.aClass35_2030 == null)
				{
					Class33_Sub2.aClass35_2030 = new Class35();
					Class33_Sub2.aClass35_2030.aClass72_758 = arg3;
					arg3.method1142(Class33_Sub2.aClass35_2030, -23553, Class30.anInt654);
				}
				if(Class33_Sub2.aClass35_2030 != null)
				{
					if(Class33_Sub2.aClass35_2030.aClass79Array754[arg0] != null)
						throw new IllegalArgumentException();
					Class33_Sub2.aClass35_2030.aClass79Array754[arg0] = class79;
				}
				return class79;
			}
			catch(Throwable _ex) { }
			try
			{
				if(arg4 <= 66)
					method142(-1);
				Class79_Sub2 class79_sub2 = new Class79_Sub2(arg3, arg0);
				class79_sub2.anInt1721 = arg1;
				class79_sub2.anIntArray1687 = new int[(Class39.aBoolean857 ? 2 : 1) * 256];
				class79_sub2.method1186(arg2);
				class79_sub2.anInt1723 = 16384;
				class79_sub2.method1192(((Class79) (class79_sub2)).anInt1723);
				if(~Class30.anInt654 < -1 && Class33_Sub2.aClass35_2030 == null)
				{
					Class33_Sub2.aClass35_2030 = new Class35();
					Class33_Sub2.aClass35_2030.aClass72_758 = arg3;
					arg3.method1142(Class33_Sub2.aClass35_2030, -23553, Class30.anInt654);
				}
				if(Class33_Sub2.aClass35_2030 != null)
				{
					if(Class33_Sub2.aClass35_2030.aClass79Array754[arg0] != null)
						throw new IllegalArgumentException();
					Class33_Sub2.aClass35_2030.aClass79Array754[arg0] = class79_sub2;
				}
				return class79_sub2;
			}
			catch(Throwable _ex)
			{
				return new Class79();
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "of.H(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + (arg3 == null ? "null" : "{...}") + ',' + arg4 + ')');
		}
	}

	public static void method139(boolean arg0)
	{
		try
		{
			aClass58_1976 = null;
			aClass58_1978 = null;
			aClass58_1985 = null;
			aClass58_1970 = null;
			anIntArray1982 = null;
			anIntArray1983 = null;
			aClass58_1974 = null;
			aClass15_1980 = null;
			aClass58_1981 = null;
			aClass16_1954 = null;
			aClass33_Sub15_1973 = null;
			aClass58_1975 = null;
			aClass33_Sub6_Sub2_1977 = null;
			aClass58_1961 = null;
			if(!arg0)
				method142(111);
			aClass33_Sub6_Sub7_Sub4_1984 = null;
			aClass30_1972 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "of.I(" + arg0 + ')');
		}
	}

	public static boolean method140(int arg0, int arg1)
	{
		try
		{
			anInt1960++;
			if(arg1 >= 97 && arg1 <= 122)
				return true;
			if(arg0 != -16687)
				return false;
			if(arg1 >= 65 && arg1 <= 90)
				return true;
			return arg1 >= 48 && ~arg1 >= -58;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "of.L(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method141(byte arg0, int arg1, int arg2, int arg3)
	{
		anInt1957++;
		if(Class34.anInt1850 != 0 && arg2 != 0 && ~Class34.anInt1839 > -51)
		{
			Class21.anIntArray399[Class34.anInt1839] = arg1;
			Class80.anIntArray1725[Class34.anInt1839] = arg2;
			Class45.anIntArray966[Class34.anInt1839] = arg3;
			Class33_Sub18.aClass61Array2515[Class34.anInt1839] = null;
			Class33_Sub20.anIntArray2566[Class34.anInt1839] = 0;
			Class34.anInt1839++;
		}
		if(arg0 > -48)
			aClass58_1975 = null;
	}

	public void method131(int arg0, int arg1, byte arg2, Graphics arg3)
	{
		anInt1958++;
		method143(116);
		arg3.drawImage(super.anImage305, arg0, arg1, this);
		if(arg2 != 78)
			method142(33);
	}

	public static void method142(int arg0)
	{
		anInt1967++;
		if(Class49.anInt1073 == 104)
		{
			int i;
			if(~Class33_Sub6_Sub4_Sub2.anInt3394 == 0)
				i = Class77.anInt1646;
			else
				i = Class33_Sub6_Sub4_Sub2.anInt3394;
			if(Class77.anInt1646 != Class33_Sub6_Sub4_Sub2.anInt3394)
			{
				if(~--i > -1)
					i = 19;
				if(Class44.aClass58Array962[i] != null)
				{
					Class33_Sub13_Sub4.aClass58_3316 = Class44.aClass58Array962[i];
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					Class33_Sub6_Sub4_Sub2.anInt3394 = i;
				}
			}
		}
		if(~Class49.anInt1073 == -106 && ~Class33_Sub6_Sub4_Sub2.anInt3394 != 0)
		{
			Class33_Sub6_Sub4_Sub2.anInt3394++;
			if(Class33_Sub6_Sub4_Sub2.anInt3394 >= 20)
				Class33_Sub6_Sub4_Sub2.anInt3394 = 0;
			if(Class33_Sub6_Sub4_Sub2.anInt3394 == Class77.anInt1646)
			{
				Class33_Sub13_Sub4.aClass58_3316 = Class33_Sub13_Sub4.aClass58_3261;
				Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
				Class33_Sub6_Sub4_Sub2.anInt3394 = -1;
			} else
			if(Class44.aClass58Array962[Class33_Sub6_Sub4_Sub2.anInt3394] != null)
			{
				Class33_Sub13_Sub4.aClass58_3316 = Class44.aClass58Array962[Class33_Sub6_Sub4_Sub2.anInt3394];
				Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
			}
		}
		if(arg0 != 19)
			method142(44);
	}

	public synchronized void addConsumer(ImageConsumer arg0)
	{
		try
		{
			anImageConsumer1955 = arg0;
			anInt1956++;
			arg0.setDimensions(super.anInt295, super.anInt301);
			arg0.setProperties(null);
			arg0.setColorModel(aColorModel1971);
			arg0.setHints(14);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "of.addConsumer(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public synchronized void method143(int arg0)
	{
		try
		{
			anInt1952++;
			if(anImageConsumer1955 == null)
				return;
			if(arg0 < 8)
				isConsumer(null);
			anImageConsumer1955.setPixels(0, 0, super.anInt295, super.anInt301, aColorModel1971, super.anIntArray289, 0, super.anInt295);
			anImageConsumer1955.imageComplete(2);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "of.G(" + arg0 + ')');
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		try
		{
			anInt1953++;
			return true;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "of.imageUpdate(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
		}
	}

	public synchronized boolean isConsumer(ImageConsumer arg0)
	{
		try
		{
			anInt1963++;
			return arg0 == anImageConsumer1955;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "of.isConsumer(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public void method136(int arg0, Component arg1, int arg2, int arg3)
	{
		try
		{
			super.anIntArray289 = new int[arg3 * arg2 + 1];
			super.anInt301 = arg3;
			super.anInt295 = arg2;
			aColorModel1971 = new DirectColorModel(32, 0xff0000, 65280, 255);
			int i = -11 / ((-13 - arg0) / 35);
			super.anImage305 = arg1.createImage(this);
			method143(56);
			arg1.prepareImage(super.anImage305, this);
			method143(82);
			arg1.prepareImage(super.anImage305, this);
			anInt1959++;
			method143(32);
			arg1.prepareImage(super.anImage305, this);
			method135(8);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "of.D(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public synchronized void removeConsumer(ImageConsumer arg0)
	{
		try
		{
			if(anImageConsumer1955 == arg0)
				anImageConsumer1955 = null;
			anInt1969++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "of.removeConsumer(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public Class15_Sub2()
	{
	}

	public static int anInt1952;
	public static int anInt1953;
	public static Class16 aClass16_1954 = new Class16(64);
	public ImageConsumer anImageConsumer1955;
	public static int anInt1956;
	public static int anInt1957;
	public static int anInt1958;
	public static int anInt1959;
	public static int anInt1960;
	public static Class58 aClass58_1961 = Class33_Sub6_Sub11.method535(111, "Anmelde)2Zeitlimit -Uberschritten)3");
	public static int anInt1962;
	public static int anInt1963;
	public static int anInt1964;
	public static int anInt1965;
	public static int anInt1966;
	public static int anInt1967;
	public static int anInt1968;
	public static int anInt1969;
	public static Class58 aClass58_1970 = Class33_Sub6_Sub11.method535(112, "Das ist eine Mitglieder)2Welt(Q");
	public ColorModel aColorModel1971;
	public static Class30 aClass30_1972;
	public static Class33_Sub15 aClass33_Sub15_1973;
	public static Class58 aClass58_1974;
	public static Class58 aClass58_1975;
	public static Class58 aClass58_1976;
	public static Class33_Sub6_Sub2 aClass33_Sub6_Sub2_1977;
	public static Class58 aClass58_1978;
	public static boolean aBoolean1979 = false;
	public static Class15 aClass15_1980;
	public static Class58 aClass58_1981 = Class33_Sub6_Sub11.method535(117, " )2>");
	public static int anIntArray1982[];
	public static int anIntArray1983[] = new int[32];
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_1984;
	public static Class58 aClass58_1985;

	static 
	{
		aClass58_1975 = Class33_Sub6_Sub11.method535(104, "Unable to connect)3");
		aClass58_1978 = aClass58_1975;
		aClass58_1976 = aClass58_1975;
		aClass58_1985 = Class33_Sub6_Sub11.method535(100, "wishes to duel with you)3");
		aClass58_1974 = aClass58_1985;
	}
}
