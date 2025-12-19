// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub12.java


public class Class33_Sub6_Sub12 extends Class33_Sub6
{

	public void method544(int arg0)
	{
		try
		{
			anInt2962++;
			if(arg0 != 4)
				return;
			if(~anInt2958 != 0)
			{
				method551(anInt2958, arg0 ^ 0xffffff04);
				anInt2949 = anInt2965;
				anInt2966 = anInt2978;
				anInt2950 = anInt2960;
			}
			method551(anInt2954, -256);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kf.I(" + arg0 + ')');
		}
	}

	public static void method545(byte arg0)
	{
		try
		{
			anInt2977++;
			if(~Class33_Sub6_Sub4_Sub6.anInt3590 == -1 && !Class33_Sub15.aBoolean2470)
			{
				Class70.anInt1498++;
				Class74.method1157(Applet_Sub1.anInt41, 33, Class33_Sub13_Sub4.aClass58_3261, Class13.anInt254, Class80.aClass58_1733, true, 0);
			}
			int i = -1;
			int j = 0;
			if(arg0 > -31)
				method545((byte)17);
			for(; j < Class33_Sub6_Sub4_Sub3.anInt3445; j++)
			{
				int k = Class33_Sub6_Sub4_Sub3.anIntArray3439[j];
				int l = k & 0x7f;
				int i1 = 0x7f & k >> 0x8f12a0e7;
				int j1 = 3 & k >> 0x95819c3d;
				int k1 = (0x1ffff904 & k) >> 0xb5cdca4e;
				if(i == k)
					continue;
				i = k;
				if(j1 == 2 && Class33_Sub2.aClass56_2035.method980(Class77_Sub2.anInt2645, l, i1, k) >= 0)
				{
					Class33_Sub6_Sub17 class33_sub6_sub17 = Class33_Sub5.method285((byte)-105, k1);
					if(class33_sub6_sub17.anIntArray3169 != null)
						class33_sub6_sub17 = class33_sub6_sub17.method591(-16431);
					if(class33_sub6_sub17 == null)
						continue;
					if(Class33_Sub6_Sub4_Sub6.anInt3590 != 1)
					{
						if(Class33_Sub15.aBoolean2470)
						{
							if((4 & Class12.anInt209) == 4)
							{
								Class74.method1157(l, 53, Class35.method846((byte)-83, new Class58[] {
									Class33_Sub18.aClass58_2518, Class74.aClass58_1566, class33_sub6_sub17.aClass58_3187
								}), i1, Class33_Sub6_Sub4_Sub6.aClass58_3610, true, k);
								Class41.anInt912++;
							}
						} else
						{
							Class58 aclass58[] = class33_sub6_sub17.aClass58Array3133;
							Class17.anInt336++;
							if(Class33_Sub13_Sub4.aBoolean3293)
								aclass58 = Class33_Sub6_Sub4.method318(5, aclass58);
							if(aclass58 != null)
							{
								for(int j2 = 4; j2 >= 0; j2--)
									if(aclass58[j2] != null)
									{
										Class33_Sub16.anInt2491++;
										char c = '\0';
										if(j2 == 0)
											c = '/';
										if(~j2 == -2)
											c = '\021';
										if(~j2 == -3)
											c = '\034';
										if(j2 == 3)
											c = '#';
										if(j2 == 4)
											c = '\u03EB';
										Class74.method1157(l, c, Class35.method846((byte)-83, new Class58[] {
											Class33_Sub13_Sub4.aClass58_3276, class33_sub6_sub17.aClass58_3187
										}), i1, aclass58[j2], true, k);
									}

							}
							Class74.method1157(l, 1005, Class35.method846((byte)-83, new Class58[] {
								Class33_Sub13_Sub4.aClass58_3276, class33_sub6_sub17.aClass58_3187
							}), i1, Class23.aClass58_461, true, class33_sub6_sub17.anInt3123 << 0xe540e94e);
						}
					} else
					{
						Class74.method1157(l, 14, Class35.method846((byte)-83, new Class58[] {
							Class77.aClass58_1649, Class74.aClass58_1566, class33_sub6_sub17.aClass58_3187
						}), i1, Class9.aClass58_171, true, k);
						Class33_Sub6.anInt2126++;
					}
				}
				if(~j1 == -2)
				{
					Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[k1];
					if(~class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.anInt3107 == -2 && (((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3548 & 0x7f) == 64 && ~(0x7f & ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3510) == -65)
					{
						for(int l1 = 0; l1 < Class33_Sub6_Sub1.anInt2659; l1++)
						{
							Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2_1 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[Class80.anIntArray1730[l1]];
							if(class33_sub6_sub4_sub5_sub2_1 != null && class33_sub6_sub4_sub5_sub2 != class33_sub6_sub4_sub5_sub2_1 && ~class33_sub6_sub4_sub5_sub2_1.aClass33_Sub6_Sub16_3776.anInt3107 == -2 && ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_1)).anInt3548 == ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3548 && ~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3510 == ~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_1)).anInt3510)
								Class81.method1211(l, class33_sub6_sub4_sub5_sub2_1.aClass33_Sub6_Sub16_3776, Class80.anIntArray1730[l1], (byte)-75, i1);
						}

						for(int k2 = 0; ~k2 > ~Class31.anInt697; k2++)
						{
							Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1_1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[Class33_Sub3.anIntArray2050[k2]];
							if(class33_sub6_sub4_sub5_sub1_1 != null && ~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1_1)).anInt3548 == ~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3548 && ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1_1)).anInt3510 == ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3510)
								Class75.method1164(i1, l, class33_sub6_sub4_sub5_sub1_1, Class33_Sub3.anIntArray2050[k2], (byte)-43);
						}

					}
					Class81.method1211(l, class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776, k1, (byte)-43, i1);
				}
				if(~j1 == -1)
				{
					Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[k1];
					if(~(0x7f & ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3548) == -65 && (((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3510 & 0x7f) == 64)
					{
						for(int i2 = 0; ~i2 > ~Class33_Sub6_Sub1.anInt2659; i2++)
						{
							Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2_2 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[Class80.anIntArray1730[i2]];
							if(class33_sub6_sub4_sub5_sub2_2 != null && ~class33_sub6_sub4_sub5_sub2_2.aClass33_Sub6_Sub16_3776.anInt3107 == -2 && ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3548 == ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_2)).anInt3548 && ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_2)).anInt3510 == ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3510)
								Class81.method1211(l, class33_sub6_sub4_sub5_sub2_2.aClass33_Sub6_Sub16_3776, Class80.anIntArray1730[i2], (byte)-87, i1);
						}

						for(int l2 = 0; l2 < Class31.anInt697; l2++)
						{
							Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1_2 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[Class33_Sub3.anIntArray2050[l2]];
							if(class33_sub6_sub4_sub5_sub1_2 != null && class33_sub6_sub4_sub5_sub1_2 != class33_sub6_sub4_sub5_sub1 && ~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1_2)).anInt3548 == ~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3548 && ~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anInt3510 == ~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1_2)).anInt3510)
								Class75.method1164(i1, l, class33_sub6_sub4_sub5_sub1_2, Class33_Sub3.anIntArray2050[l2], (byte)-70);
						}

					}
					Class75.method1164(i1, l, class33_sub6_sub4_sub5_sub1, k1, (byte)-124);
				}
				if(~j1 == -4)
				{
					Class4 class4 = Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][l][i1];
					if(class4 != null)
					{
						for(Class33_Sub6_Sub4_Sub1 class33_sub6_sub4_sub1 = (Class33_Sub6_Sub4_Sub1)class4.method70(-68); class33_sub6_sub4_sub1 != null; class33_sub6_sub4_sub1 = (Class33_Sub6_Sub4_Sub1)class4.method55(0))
						{
							Class33_Sub6_Sub11 class33_sub6_sub11 = Class14.method127(class33_sub6_sub4_sub1.anInt3363, (byte)90);
							if(~Class33_Sub6_Sub4_Sub6.anInt3590 != -2)
							{
								if(!Class33_Sub15.aBoolean2470)
								{
									anInt2967++;
									Class58 aclass58_1[] = class33_sub6_sub11.aClass58Array2917;
									if(Class33_Sub13_Sub4.aBoolean3293)
										aclass58_1 = Class33_Sub6_Sub4.method318(5, aclass58_1);
									for(int i3 = 4; i3 >= 0; i3--)
										if(aclass58_1 == null || aclass58_1[i3] == null)
										{
											if(i3 == 2)
											{
												Class33_Sub15.anInt2358++;
												Class74.method1157(l, 42, Class35.method846((byte)-83, new Class58[] {
													Class27.aClass58_556, class33_sub6_sub11.aClass58_2898
												}), i1, Class12.aClass58_234, true, class33_sub6_sub4_sub1.anInt3363);
											}
										} else
										{
											Class45.anInt983++;
											byte byte0 = 0;
											if(i3 == 0)
												byte0 = 1;
											if(i3 == 1)
												byte0 = 37;
											if(i3 == 2)
												byte0 = 42;
											if(~i3 == -4)
												byte0 = 46;
											if(~i3 == -5)
												byte0 = 4;
											Class74.method1157(l, byte0, Class35.method846((byte)-83, new Class58[] {
												Class27.aClass58_556, class33_sub6_sub11.aClass58_2898
											}), i1, aclass58_1[i3], true, class33_sub6_sub4_sub1.anInt3363);
										}

									Class74.method1157(l, 1004, Class35.method846((byte)-83, new Class58[] {
										Class27.aClass58_556, class33_sub6_sub11.aClass58_2898
									}), i1, Class23.aClass58_461, true, class33_sub6_sub4_sub1.anInt3363);
								} else
								if(~(Class12.anInt209 & 1) == -2)
								{
									Class74.method1157(l, 48, Class35.method846((byte)-83, new Class58[] {
										Class33_Sub18.aClass58_2518, Class42.aClass58_919, class33_sub6_sub11.aClass58_2898
									}), i1, Class33_Sub6_Sub4_Sub6.aClass58_3610, true, class33_sub6_sub4_sub1.anInt3363);
									Class33_Sub6_Sub4_Sub6.anInt3614++;
								}
							} else
							{
								Class74.method1157(l, 18, Class35.method846((byte)-83, new Class58[] {
									Class77.aClass58_1649, Class42.aClass58_919, class33_sub6_sub11.aClass58_2898
								}), i1, Class9.aClass58_171, true, class33_sub6_sub4_sub1.anInt3363);
								Class33_Sub2.anInt2020++;
							}
						}

					}
				}
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kf.E(" + arg0 + ')');
		}
	}

	public static void method546(int arg0)
	{
		try
		{
			anInt2961++;
			Class33_Sub6_Sub14.aClass16_3025.method147((byte)-54);
			int i = 52 % ((arg0 - 71) / 41);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kf.F(" + arg0 + ')');
		}
	}

	public static void method547(Class30 arg0, byte arg1, Class30 arg2, Class30 arg3)
	{
		try
		{
			if(arg1 != -59)
				anInt2979 = -70;
			anInt2973++;
			Class33_Sub12.aClass30_2327 = arg0;
			Class37.aClass30_833 = arg2;
			Class33_Sub11.aClass30_2257 = arg3;
			Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336 = new Class33_Sub15[Class33_Sub11.aClass30_2257.method217(-94)][];
			Class33_Sub6_Sub1.aBooleanArray2671 = new boolean[Class33_Sub11.aClass30_2257.method217(-103)];
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kf.A(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public void method548(Class33_Sub11 arg0, int arg1, int arg2)
	{
		try
		{
			while(true) 
			{
				int i = arg0.method639((byte)123);
				if(~i == -1)
					break;
				method550(arg2 + 11578, i, arg1, arg0);
			}
			if(arg2 != -11595)
				aClass58_2955 = null;
			anInt2971++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kf.D(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method549(int arg0)
	{
		try
		{
			synchronized(Class33_Sub6_Sub10.anObject2864)
			{
				if(~Class33_Sub19.anInt2542 == -1)
					Class22.aClass72_416.method1142(new Class41(), -23553, 5);
				if(arg0 >= -95)
					aClass33_Sub14_2963 = null;
				Class33_Sub19.anInt2542 = 600;
			}
			anInt2968++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kf.H(" + arg0 + ')');
		}
	}

	public void method550(int arg0, int arg1, int arg2, Class33_Sub11 arg3)
	{
		try
		{
			if(arg1 == 1)
				anInt2954 = arg3.method626((byte)-114);
			else
			if(~arg1 != -3)
			{
				if(~arg1 == -6)
					aBoolean2972 = false;
				else
				if(arg1 == 7)
					anInt2958 = arg3.method626((byte)-114);
			} else
			{
				anInt2970 = arg3.method639((byte)123);
			}
			anInt2956++;
			int i = -35 % ((80 - arg0) / 42);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kf.G(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public void method551(int arg0, int arg1)
	{
		try
		{
			anInt2969++;
			double d = (double)(0xff & arg0 >> 0xf870f4f0) / 256D;
			double d2 = (double)(0xff & arg0) / 256D;
			double d1 = (double)((0xffc8 & arg0) >> 0x26a41ea8) / 256D;
			double d3 = d;
			if(d1 < d3)
				d3 = d1;
			double d4 = d;
			double d5 = 0.0D;
			if(arg1 != -256)
				return;
			if(d3 > d2)
				d3 = d2;
			double d6 = 0.0D;
			if(d4 < d1)
				d4 = d1;
			if(d4 < d2)
				d4 = d2;
			double d7 = (d3 + d4) / 2D;
			if(d4 != d3)
			{
				if(d == d4)
					d5 = (d1 - d2) / (-d3 + d4);
				else
				if(d1 != d4)
				{
					if(d2 == d4)
						d5 = (-d1 + d) / (d4 - d3) + 4D;
				} else
				{
					d5 = 2D + (-d + d2) / (-d3 + d4);
				}
				if(d7 < 0.5D)
					d6 = (d4 - d3) / (d3 + d4);
				if(d7 >= 0.5D)
					d6 = (d4 - d3) / (-d3 + (2D - d4));
			}
			d5 /= 6D;
			anInt2978 = (int)(d5 * 256D);
			anInt2965 = (int)(256D * d6);
			if(anInt2965 < 0)
				anInt2965 = 0;
			else
			if(~anInt2965 < -256)
				anInt2965 = 255;
			anInt2960 = (int)(256D * d7);
			if(~anInt2960 <= -1)
			{
				if(~anInt2960 < -256)
				{
					anInt2960 = 255;
					return;
				}
			} else
			{
				anInt2960 = 0;
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kf.C(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method552(int arg0)
	{
		try
		{
			aClass33_Sub14_2963 = null;
			aClass16_2957 = null;
			aClass58_2982 = null;
			aClass58_2975 = null;
			aClass58_2955 = null;
			aClass58_2964 = null;
			if(arg0 != 0)
				method549(-72);
			aClass58_2981 = null;
			aClass58_2953 = null;
			aClass15_2959 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "kf.B(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub12()
	{
		anInt2954 = 0;
		anInt2958 = -1;
		anInt2970 = -1;
		aBoolean2972 = true;
	}

	public int anInt2949;
	public int anInt2950;
	public static boolean aBoolean2951 = false;
	public static int anInt2952;
	public static Class58 aClass58_2953;
	public int anInt2954;
	public static Class58 aClass58_2955;
	public static int anInt2956;
	public static Class16 aClass16_2957 = new Class16(64);
	public int anInt2958;
	public static Class15 aClass15_2959;
	public int anInt2960;
	public static int anInt2961;
	public static int anInt2962;
	public static Class33_Sub14 aClass33_Sub14_2963;
	public static Class58 aClass58_2964 = Class33_Sub6_Sub11.method535(118, "null");
	public int anInt2965;
	public int anInt2966;
	public static int anInt2967;
	public static int anInt2968;
	public static int anInt2969;
	public int anInt2970;
	public static int anInt2971;
	public boolean aBoolean2972;
	public static int anInt2973;
	public static int anInt2974 = 0;
	public static Class58 aClass58_2975 = Class33_Sub6_Sub11.method535(125, "Ausw-=hlen");
	public static int anInt2976;
	public static int anInt2977;
	public int anInt2978;
	public static int anInt2979 = 0;
	public static boolean aBoolean2980 = false;
	public static Class58 aClass58_2981 = Class33_Sub6_Sub11.method535(123, "http:)4)4www)3runescape)3com");
	public static Class58 aClass58_2982 = Class33_Sub6_Sub11.method535(116, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

	static 
	{
		aClass58_2953 = Class33_Sub6_Sub11.method535(124, "Classic");
		aClass58_2955 = aClass58_2953;
	}
}
