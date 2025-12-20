// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub20.java


public class Class33_Sub20 extends Class33
{

	public static void method822(byte arg0)
	{
		try
		{
			Class33_Sub6_Sub16.aClass15_3094.method135(8);
			Class36.aClass33_Sub6_Sub7_Sub4_797.method502(0, 0);
			Class33_Sub6_Sub7_Sub1.method433();
			if(arg0 > -110)
				method828(-52, (byte)64, null);
			anInt2569++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rf.C(" + arg0 + ')');
		}
	}

	public static void method823(int arg0, int arg1, Class56 arg2, int arg3, int arg4, Class70 arg5, int arg6, byte arg7, 
			int arg8)
	{
		try
		{
			anInt2571++;
			if(Class33_Sub3.aBoolean2058 && (2 & Class35.aByteArrayArrayArray761[0][arg3][arg1]) == 0)
			{
				if((Class35.aByteArrayArrayArray761[arg8][arg3][arg1] & 0x10) != 0)
					return;
				if(Class57.method1019(arg8, (byte)-98, arg3, arg1) != Class32.anInt709)
					return;
			}
			if(~arg8 > ~Class33_Sub6_Sub4_Sub5_Sub1.anInt3761)
				Class33_Sub6_Sub4_Sub5_Sub1.anInt3761 = arg8;
			int i = Class30.anIntArrayArrayArray645[arg8][arg3][arg1];
			int j = Class30.anIntArrayArrayArray645[arg8][arg3 + 1][arg1];
			int k = Class30.anIntArrayArrayArray645[arg8][arg3 + 1][arg1 - -1];
			int l = Class30.anIntArrayArrayArray645[arg8][arg3][1 + arg1];
			int i1 = j + i + (k - -l) >> 0x24208cc2;
			int j1 = ((arg1 << 0x48a40787) + arg3 + (arg4 << 0x2e1378e)) - 0xc0000000;
			Class33_Sub6_Sub17 class33_sub6_sub17 = Class33_Sub5.method285((byte)-123, arg4);
			int k1 = arg6 + (arg0 << 0x3351fc06);
			if(~class33_sub6_sub17.anInt3143 == -1)
				j1 += 0x80000000;
			if(~class33_sub6_sub17.anInt3134 == -2)
				k1 += 256;
			if(class33_sub6_sub17.method590(-89))
				Class33_Sub6_Sub8.method508(14072, arg3, class33_sub6_sub17, arg8, arg0, arg1);
			if(~arg6 == -23)
			{
				if(Class33_Sub3.aBoolean2058 && class33_sub6_sub17.anInt3143 == 0 && ~class33_sub6_sub17.anInt3159 != -2 && !class33_sub6_sub17.aBoolean3155)
					return;
				Object obj;
				if(~class33_sub6_sub17.anInt3160 == 0 && class33_sub6_sub17.anIntArray3169 == null)
					obj = class33_sub6_sub17.method604(-917, l, arg0, i, k, 22, j);
				else
					obj = new Class33_Sub6_Sub4_Sub2(arg4, 22, arg0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				arg2.method1009(arg8, arg3, arg1, i1, ((Class33_Sub6_Sub4) (obj)), j1, k1);
				if(class33_sub6_sub17.anInt3159 == 1 && arg5 != null)
					arg5.method1121(arg3, 0x40000, arg1);
				return;
			}
			if(~arg6 == -11 || arg6 == 11)
			{
				Object obj1;
				if(~class33_sub6_sub17.anInt3160 != 0 || class33_sub6_sub17.anIntArray3169 != null)
					obj1 = new Class33_Sub6_Sub4_Sub2(arg4, 10, arg0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj1 = class33_sub6_sub17.method604(-917, l, arg0, i, k, 10, j);
				if(obj1 != null)
				{
					int i3;
					int k3;
					if(arg0 == 1 || ~arg0 == -4)
					{
						k3 = class33_sub6_sub17.anInt3181;
						i3 = class33_sub6_sub17.anInt3165;
					} else
					{
						i3 = class33_sub6_sub17.anInt3181;
						k3 = class33_sub6_sub17.anInt3165;
					}
					int l3 = 0;
					if(arg6 == 11)
						l3 += 256;
					if(arg2.method981(arg8, arg3, arg1, i1, i3, k3, ((Class33_Sub6_Sub4) (obj1)), l3, j1, k1) && class33_sub6_sub17.aBoolean3130)
					{
						int i4 = 15;
						if(obj1 instanceof Class33_Sub6_Sub4_Sub3)
						{
							i4 = ((Class33_Sub6_Sub4_Sub3)obj1).method336() / 4;
							if(i4 > 30)
								i4 = 30;
						}
						for(int j4 = 0; i3 >= j4; j4++)
						{
							for(int k4 = 0; ~k4 >= ~k3; k4++)
								if(~i4 < ~Class12.aByteArrayArrayArray239[arg8][j4 + arg3][arg1 - -k4])
									Class12.aByteArrayArrayArray239[arg8][arg3 - -j4][arg1 - -k4] = (byte)i4;

						}

					}
				}
				if(class33_sub6_sub17.anInt3159 != 0 && arg5 != null)
					arg5.method1120(class33_sub6_sub17.anInt3181, (byte)-128, class33_sub6_sub17.aBoolean3184, arg1, arg3, class33_sub6_sub17.anInt3165, arg0);
				return;
			}
			if(~arg6 <= -13)
			{
				Object obj2;
				if(class33_sub6_sub17.anInt3160 == -1 && class33_sub6_sub17.anIntArray3169 == null)
					obj2 = class33_sub6_sub17.method604(-917, l, arg0, i, k, arg6, j);
				else
					obj2 = new Class33_Sub6_Sub4_Sub2(arg4, arg6, arg0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				arg2.method981(arg8, arg3, arg1, i1, 1, 1, ((Class33_Sub6_Sub4) (obj2)), 0, j1, k1);
				if(arg6 >= 12 && ~arg6 >= -18 && arg6 != 13 && ~arg8 < -1)
					Class17.anIntArrayArrayArray351[arg8][arg3][arg1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][arg3][arg1], 2340);
				if(class33_sub6_sub17.anInt3159 != 0 && arg5 != null)
					arg5.method1120(class33_sub6_sub17.anInt3181, (byte)104, class33_sub6_sub17.aBoolean3184, arg1, arg3, class33_sub6_sub17.anInt3165, arg0);
				return;
			}
			if(arg6 == 0)
			{
				Object obj3;
				if(~class33_sub6_sub17.anInt3160 != 0 || class33_sub6_sub17.anIntArray3169 != null)
					obj3 = new Class33_Sub6_Sub4_Sub2(arg4, 0, arg0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj3 = class33_sub6_sub17.method604(-917, l, arg0, i, k, 0, j);
				arg2.method1014(arg8, arg3, arg1, i1, ((Class33_Sub6_Sub4) (obj3)), null, Class11.anIntArray195[arg0], 0, j1, k1);
				if(~arg0 == -1)
				{
					if(class33_sub6_sub17.aBoolean3130)
					{
						Class12.aByteArrayArrayArray239[arg8][arg3][arg1] = 50;
						Class12.aByteArrayArrayArray239[arg8][arg3][arg1 - -1] = 50;
					}
					if(class33_sub6_sub17.aBoolean3188)
						Class17.anIntArrayArrayArray351[arg8][arg3][arg1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][arg3][arg1], 585);
				} else
				if(~arg0 == -2)
				{
					if(class33_sub6_sub17.aBoolean3130)
					{
						Class12.aByteArrayArrayArray239[arg8][arg3][arg1 - -1] = 50;
						Class12.aByteArrayArrayArray239[arg8][1 + arg3][1 + arg1] = 50;
					}
					if(class33_sub6_sub17.aBoolean3188)
						Class17.anIntArrayArrayArray351[arg8][arg3][arg1 + 1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][arg3][arg1 + 1], 1170);
				} else
				if(arg0 != 2)
				{
					if(~arg0 == -4)
					{
						if(class33_sub6_sub17.aBoolean3130)
						{
							Class12.aByteArrayArrayArray239[arg8][arg3][arg1] = 50;
							Class12.aByteArrayArrayArray239[arg8][arg3 - -1][arg1] = 50;
						}
						if(class33_sub6_sub17.aBoolean3188)
							Class17.anIntArrayArrayArray351[arg8][arg3][arg1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][arg3][arg1], 1170);
					}
				} else
				{
					if(class33_sub6_sub17.aBoolean3130)
					{
						Class12.aByteArrayArrayArray239[arg8][arg3 - -1][arg1] = 50;
						Class12.aByteArrayArrayArray239[arg8][1 + arg3][arg1 - -1] = 50;
					}
					if(class33_sub6_sub17.aBoolean3188)
						Class17.anIntArrayArrayArray351[arg8][arg3 - -1][arg1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][arg3 - -1][arg1], 585);
				}
				if(class33_sub6_sub17.anInt3159 != 0 && arg5 != null)
					arg5.method1129(class33_sub6_sub17.aBoolean3184, 2, arg3, arg0, arg1, arg6);
				if(~class33_sub6_sub17.anInt3174 != -17)
					arg2.method977(arg8, arg3, arg1, class33_sub6_sub17.anInt3174);
				return;
			}
			if(~arg6 == -2)
			{
				Object obj4;
				if(class33_sub6_sub17.anInt3160 != -1 || class33_sub6_sub17.anIntArray3169 != null)
					obj4 = new Class33_Sub6_Sub4_Sub2(arg4, 1, arg0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj4 = class33_sub6_sub17.method604(-917, l, arg0, i, k, 1, j);
				arg2.method1014(arg8, arg3, arg1, i1, ((Class33_Sub6_Sub4) (obj4)), null, Class33_Sub10.anIntArray2201[arg0], 0, j1, k1);
				if(class33_sub6_sub17.aBoolean3130)
					if(~arg0 == -1)
						Class12.aByteArrayArrayArray239[arg8][arg3][arg1 + 1] = 50;
					else
					if(arg0 == 1)
						Class12.aByteArrayArrayArray239[arg8][1 + arg3][1 + arg1] = 50;
					else
					if(~arg0 != -3)
					{
						if(~arg0 == -4)
							Class12.aByteArrayArrayArray239[arg8][arg3][arg1] = 50;
					} else
					{
						Class12.aByteArrayArrayArray239[arg8][1 + arg3][arg1] = 50;
					}
				if(~class33_sub6_sub17.anInt3159 != -1 && arg5 != null)
					arg5.method1129(class33_sub6_sub17.aBoolean3184, 2, arg3, arg0, arg1, arg6);
				return;
			}
			if(arg6 == 2)
			{
				int l1 = 3 & 1 + arg0;
				Object obj11;
				Object obj12;
				if(~class33_sub6_sub17.anInt3160 != 0 || class33_sub6_sub17.anIntArray3169 != null)
				{
					obj11 = new Class33_Sub6_Sub4_Sub2(arg4, 2, arg0 + 4, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
					obj12 = new Class33_Sub6_Sub4_Sub2(arg4, 2, l1, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				} else
				{
					obj11 = class33_sub6_sub17.method604(-917, l, 4 - -arg0, i, k, 2, j);
					obj12 = class33_sub6_sub17.method604(-917, l, l1, i, k, 2, j);
				}
				arg2.method1014(arg8, arg3, arg1, i1, ((Class33_Sub6_Sub4) (obj11)), ((Class33_Sub6_Sub4) (obj12)), Class11.anIntArray195[arg0], Class11.anIntArray195[l1], j1, k1);
				if(class33_sub6_sub17.aBoolean3188)
					if(arg0 != 0)
					{
						if(~arg0 == -2)
						{
							Class17.anIntArrayArrayArray351[arg8][arg3][1 + arg1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][arg3][1 + arg1], 1170);
							Class17.anIntArrayArrayArray351[arg8][arg3 + 1][arg1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][arg3 + 1][arg1], 585);
						} else
						if(arg0 != 2)
						{
							if(~arg0 == -4)
							{
								Class17.anIntArrayArrayArray351[arg8][arg3][arg1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][arg3][arg1], 1170);
								Class17.anIntArrayArrayArray351[arg8][arg3][arg1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][arg3][arg1], 585);
							}
						} else
						{
							Class17.anIntArrayArrayArray351[arg8][1 + arg3][arg1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][1 + arg3][arg1], 585);
							Class17.anIntArrayArrayArray351[arg8][arg3][arg1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][arg3][arg1], 1170);
						}
					} else
					{
						Class17.anIntArrayArrayArray351[arg8][arg3][arg1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][arg3][arg1], 585);
						Class17.anIntArrayArrayArray351[arg8][arg3][1 + arg1] = Class33_Sub6_Sub14.method576(Class17.anIntArrayArrayArray351[arg8][arg3][1 + arg1], 1170);
					}
				if(~class33_sub6_sub17.anInt3159 != -1 && arg5 != null)
					arg5.method1129(class33_sub6_sub17.aBoolean3184, 2, arg3, arg0, arg1, arg6);
				if(~class33_sub6_sub17.anInt3174 != -17)
					arg2.method977(arg8, arg3, arg1, class33_sub6_sub17.anInt3174);
				return;
			}
			if(~arg6 == -4)
			{
				Object obj5;
				if(~class33_sub6_sub17.anInt3160 == 0 && class33_sub6_sub17.anIntArray3169 == null)
					obj5 = class33_sub6_sub17.method604(-917, l, arg0, i, k, 3, j);
				else
					obj5 = new Class33_Sub6_Sub4_Sub2(arg4, 3, arg0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				arg2.method1014(arg8, arg3, arg1, i1, ((Class33_Sub6_Sub4) (obj5)), null, Class33_Sub10.anIntArray2201[arg0], 0, j1, k1);
				if(class33_sub6_sub17.aBoolean3130)
					if(arg0 != 0)
					{
						if(arg0 != 1)
						{
							if(~arg0 == -3)
								Class12.aByteArrayArrayArray239[arg8][arg3 - -1][arg1] = 50;
							else
							if(~arg0 == -4)
								Class12.aByteArrayArrayArray239[arg8][arg3][arg1] = 50;
						} else
						{
							Class12.aByteArrayArrayArray239[arg8][1 + arg3][1 + arg1] = 50;
						}
					} else
					{
						Class12.aByteArrayArrayArray239[arg8][arg3][arg1 - -1] = 50;
					}
				if(class33_sub6_sub17.anInt3159 != 0 && arg5 != null)
					arg5.method1129(class33_sub6_sub17.aBoolean3184, 2, arg3, arg0, arg1, arg6);
				return;
			}
			if(arg7 < 58)
				aClass58_2573 = null;
			if(arg6 == 9)
			{
				Object obj6;
				if(~class33_sub6_sub17.anInt3160 == 0 && class33_sub6_sub17.anIntArray3169 == null)
					obj6 = class33_sub6_sub17.method604(-917, l, arg0, i, k, arg6, j);
				else
					obj6 = new Class33_Sub6_Sub4_Sub2(arg4, arg6, arg0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				arg2.method981(arg8, arg3, arg1, i1, 1, 1, ((Class33_Sub6_Sub4) (obj6)), 0, j1, k1);
				if(class33_sub6_sub17.anInt3159 != 0 && arg5 != null)
					arg5.method1120(class33_sub6_sub17.anInt3181, (byte)107, class33_sub6_sub17.aBoolean3184, arg1, arg3, class33_sub6_sub17.anInt3165, arg0);
				return;
			}
			if(class33_sub6_sub17.aBoolean3186)
				if(arg0 != 1)
				{
					if(~arg0 == -3)
					{
						int i2 = l;
						l = j;
						j = i2;
						i2 = k;
						k = i;
						i = i2;
					} else
					if(arg0 == 3)
					{
						int j2 = l;
						l = i;
						i = j;
						j = k;
						k = j2;
					}
				} else
				{
					int k2 = l;
					l = k;
					k = j;
					j = i;
					i = k2;
				}
			if(arg6 == 4)
			{
				Object obj7;
				if(~class33_sub6_sub17.anInt3160 != 0 || class33_sub6_sub17.anIntArray3169 != null)
					obj7 = new Class33_Sub6_Sub4_Sub2(arg4, 4, 0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj7 = class33_sub6_sub17.method604(-917, l, 0, i, k, 4, j);
				arg2.method996(arg8, arg3, arg1, i1, ((Class33_Sub6_Sub4) (obj7)), Class11.anIntArray195[arg0], 512 * arg0, 0, 0, j1, k1);
				return;
			}
			if(~arg6 == -6)
			{
				int l2 = 16;
				int j3 = arg2.method978(arg8, arg3, arg1);
				if(j3 != 0)
					l2 = Class33_Sub5.method285((byte)-127, j3 >> 0x4084898e & 0x7fff).anInt3174;
				Object obj13;
				if(class33_sub6_sub17.anInt3160 == -1 && class33_sub6_sub17.anIntArray3169 == null)
					obj13 = class33_sub6_sub17.method604(-917, l, 0, i, k, 4, j);
				else
					obj13 = new Class33_Sub6_Sub4_Sub2(arg4, 4, 0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				arg2.method996(arg8, arg3, arg1, i1, ((Class33_Sub6_Sub4) (obj13)), Class11.anIntArray195[arg0], 512 * arg0, l2 * Class33_Sub6_Sub2.anIntArray2689[arg0], l2 * Class48.anIntArray1063[arg0], j1, k1);
				return;
			}
			if(~arg6 == -7)
			{
				Object obj8;
				if(~class33_sub6_sub17.anInt3160 != 0 || class33_sub6_sub17.anIntArray3169 != null)
					obj8 = new Class33_Sub6_Sub4_Sub2(arg4, 4, 0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj8 = class33_sub6_sub17.method604(-917, l, 0, i, k, 4, j);
				arg2.method996(arg8, arg3, arg1, i1, ((Class33_Sub6_Sub4) (obj8)), 256, arg0, 0, 0, j1, k1);
				return;
			}
			if(arg6 == 7)
			{
				Object obj9;
				if(class33_sub6_sub17.anInt3160 != -1 || class33_sub6_sub17.anIntArray3169 != null)
					obj9 = new Class33_Sub6_Sub4_Sub2(arg4, 4, 0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj9 = class33_sub6_sub17.method604(-917, l, 0, i, k, 4, j);
				arg2.method996(arg8, arg3, arg1, i1, ((Class33_Sub6_Sub4) (obj9)), 512, arg0, 0, 0, j1, k1);
				return;
			}
			if(arg6 == 8)
			{
				Object obj10;
				if(~class33_sub6_sub17.anInt3160 != 0 || class33_sub6_sub17.anIntArray3169 != null)
					obj10 = new Class33_Sub6_Sub4_Sub2(arg4, 4, 0, i, j, k, l, class33_sub6_sub17.anInt3160, true, null);
				else
					obj10 = class33_sub6_sub17.method604(-917, l, 0, i, k, 4, j);
				arg2.method996(arg8, arg3, arg1, i1, ((Class33_Sub6_Sub4) (obj10)), 768, arg0, 0, 0, j1, k1);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rf.E(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? "null" : "{...}") + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
		}
	}

	public static Class33_Sub10 method824(int arg0, byte arg1, Class30 arg2)
	{
		try
		{
			anInt2560++;
			byte abyte0[] = arg2.method235((byte)26, arg0);
			if(abyte0 == null)
			{
				return null;
			} else
			{
				int i = -114 / ((arg1 - -44) / 43);
				return new Class33_Sub10(abyte0);
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rf.G(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method825(int arg0)
	{
		try
		{
			if(Class63.aClass43_1336 != null)
				Class63.aClass43_1336.method903(1);
			if(arg0 != -1)
				method824(92, (byte)-119, null);
			anInt2580++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rf.F(" + arg0 + ')');
		}
	}

	public static void method826(int arg0)
	{
		try
		{
			anInt2577++;
			if(arg0 != 7962)
				return;
			for(Class33_Sub6_Sub4_Sub4 class33_sub6_sub4_sub4 = (Class33_Sub6_Sub4_Sub4)Class66.aClass4_1415.method68(18823); class33_sub6_sub4_sub4 != null; class33_sub6_sub4_sub4 = (Class33_Sub6_Sub4_Sub4)Class66.aClass4_1415.method66((byte)-127))
				if(~class33_sub6_sub4_sub4.anInt3463 != ~Class77_Sub2.anInt2645 || class33_sub6_sub4_sub4.aBoolean3479)
					class33_sub6_sub4_sub4.method266(-26);
				else
				if(class33_sub6_sub4_sub4.anInt3478 <= Class33_Sub6_Sub6.anInt2785)
				{
					class33_sub6_sub4_sub4.method349(82, Class40.anInt895);
					if(class33_sub6_sub4_sub4.aBoolean3479)
						class33_sub6_sub4_sub4.method266(arg0 ^ 0xffffe0c7);
					else
						Class33_Sub2.aClass56_2035.method1000(class33_sub6_sub4_sub4.anInt3463, class33_sub6_sub4_sub4.anInt3458, class33_sub6_sub4_sub4.anInt3462, class33_sub6_sub4_sub4.anInt3483, 60, class33_sub6_sub4_sub4, 0, -1, false);
				}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rf.B(" + arg0 + ')');
		}
	}

	public Class33_Sub20()
	{
	}

	public static void method827(int arg0)
	{
		try
		{
			anIntArrayArray2578 = null;
			aClass33_Sub6_Sub7_Sub3Array2579 = null;
			aClass58_2558 = null;
			aClass58_2564 = null;
			if(arg0 != 585)
			{
				return;
			} else
			{
				anIntArray2566 = null;
				aClass58_2575 = null;
				aClass58_2573 = null;
				aClass58_2568 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rf.D(" + arg0 + ')');
		}
	}

	public static void method828(int arg0, byte arg1, Class33_Sub6_Sub4_Sub5 arg2)
	{
		try
		{
			anInt2562++;
			if(~arg2.anInt3563 >= ~Class33_Sub6_Sub6.anInt2785)
			{
				if(Class33_Sub6_Sub6.anInt2785 <= arg2.anInt3526)
					Class33_Sub6_Sub4.method316((byte)-30, arg2);
				else
					Class31.method256(arg2, -123);
			} else
			{
				Class38.method870(arg2, -125);
			}
			if(~arg2.anInt3548 > -129 || arg2.anInt3510 < 128 || arg2.anInt3548 >= 13184 || arg2.anInt3510 >= 13184)
			{
				arg2.anInt3526 = 0;
				arg2.anInt3564 = -1;
				arg2.anInt3548 = arg2.anInt3559 * 64 + arg2.anIntArray3554[0] * 128;
				arg2.anInt3563 = 0;
				arg2.anInt3567 = -1;
				arg2.anInt3510 = arg2.anInt3559 * 64 + 128 * arg2.anIntArray3520[0];
				arg2.method367((byte)-116);
			}
			if(Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305 == arg2 && (~arg2.anInt3548 > -1537 || ~arg2.anInt3510 > -1537 || arg2.anInt3548 >= 11776 || arg2.anInt3510 >= 11776))
			{
				arg2.anInt3563 = 0;
				arg2.anInt3567 = -1;
				arg2.anInt3510 = arg2.anIntArray3520[0] * 128 - -(arg2.anInt3559 * 64);
				arg2.anInt3564 = -1;
				arg2.anInt3548 = arg2.anInt3559 * 64 + 128 * arg2.anIntArray3554[0];
				arg2.anInt3526 = 0;
				arg2.method367((byte)-103);
			}
			int i = -71 % ((-20 - arg1) / 49);
			Class13.method121((byte)70, arg2);
			Class80.method1205(arg2, (byte)109);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "rf.A(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public Class12 aClass12_2557;
	public static Class58 aClass58_2558;
	public static volatile int anInt2559 = -1;
	public static int anInt2560;
	public Class30_Sub1 aClass30_Sub1_2561;
	public static int anInt2562;
	public static int anInt2563 = 20;
	public static Class58 aClass58_2564 = Class33_Sub6_Sub11.method535(100, "@cr2@");
	public static int anInt2565 = 0;
	public static int anIntArray2566[] = new int[50];
	public static int anInt2567 = 0;
	public static Class58 aClass58_2568 = Class33_Sub6_Sub11.method535(115, "Neuer Benutzer");
	public static int anInt2569;
	public byte aByteArray2570[];
	public static int anInt2571;
	public int anInt2572;
	public static Class58 aClass58_2573;
	public static volatile int anInt2574 = 0;
	public static Class58 aClass58_2575 = Class33_Sub6_Sub11.method535(112, ":tradereq:");
	public static int anInt2576 = -1;
	public static int anInt2577;
	public static int anIntArrayArray2578[][];
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3Array2579[];
	public static int anInt2580;

	static 
	{
		aClass58_2558 = Class33_Sub6_Sub11.method535(113, "Connecting to server)3)3)3");
		aClass58_2573 = aClass58_2558;
	}
}
