// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub4_Sub6.java

import java.awt.Frame;

public class Class33_Sub6_Sub4_Sub6 extends Class33_Sub6_Sub4
{
	
	public static Class33_Sub6_Sub4_Sub5 entityToFollow;

	public static void method374(int arg0, byte arg1, int arg2[], int arg3[], int arg4, Class17 arg5[])
	{
		try
		{
			anInt3622++;
			if(~arg4 < ~arg0)
			{
				int j = -1 + arg0;
				int k = arg4 - -1;
				int l = (arg0 + arg4) / 2;
				Class17 class17 = arg5[l];
				arg5[l] = arg5[arg0];
				arg5[arg0] = class17;
				while(~k < ~j) 
				{
					boolean flag = true;
					do
					{
						k--;
						for(int i1 = 0; i1 < 4; i1++)
						{
							int k1;
							int i2;
							if(arg2[i1] == 2)
							{
								i2 = class17.anInt342;
								k1 = arg5[k].anInt342;
							} else
							if(arg2[i1] == 1)
							{
								k1 = arg5[k].anInt345;
								i2 = class17.anInt345;
								if(k1 == -1 && arg3[i1] == 1)
									k1 = 2001;
								if(~i2 == 0 && arg3[i1] == 1)
									i2 = 2001;
							} else
							if(arg2[i1] != 3)
							{
								i2 = class17.anInt352;
								k1 = arg5[k].anInt352;
							} else
							{
								k1 = arg5[k].aBoolean339 ? 1 : 0;
								i2 = class17.aBoolean339 ? 1 : 0;
							}
							if(~i2 == ~k1)
							{
								if(~i1 == -4)
									flag = false;
								continue;
							}
							if((arg3[i1] != 1 || ~k1 >= ~i2) && (arg3[i1] != 0 || i2 <= k1))
								flag = false;
							break;
						}

					} while(flag);
					flag = true;
					do
					{
						j++;
						for(int j1 = 0; j1 < 4; j1++)
						{
							int l1;
							int j2;
							if(arg2[j1] == 2)
							{
								l1 = arg5[j].anInt342;
								j2 = class17.anInt342;
							} else
							if(arg2[j1] == 1)
							{
								l1 = arg5[j].anInt345;
								j2 = class17.anInt345;
								if(~l1 == 0 && arg3[j1] == 1)
									l1 = 2001;
								if(j2 == -1 && ~arg3[j1] == -2)
									j2 = 2001;
							} else
							if(arg2[j1] == 3)
							{
								l1 = arg5[j].aBoolean339 ? 1 : 0;
								j2 = class17.aBoolean339 ? 1 : 0;
							} else
							{
								l1 = arg5[j].anInt352;
								j2 = class17.anInt352;
							}
							if(l1 != j2)
							{
								if((arg3[j1] != 1 || l1 >= j2) && (arg3[j1] != 0 || l1 <= j2))
									flag = false;
								break;
							}
							if(j1 == 3)
								flag = false;
						}

					} while(flag);
					if(~k < ~j)
					{
						Class17 class17_1 = arg5[j];
						arg5[j] = arg5[k];
						arg5[k] = class17_1;
					}
				}
				method374(arg0, (byte)-60, arg2, arg3, k, arg5);
				method374(k + 1, (byte)-125, arg2, arg3, arg4, arg5);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "n.A(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + (arg3 == null ? "null" : "{...}") + ',' + arg4 + ',' + (arg5 == null ? "null" : "{...}") + ')');
		}
	}

	public static Class33_Sub6_Sub7_Sub2 method375(int arg0)
	{
		try
		{
			anInt3597++;
			int i = 47 / ((arg0 - 17) / 42);
			Class33_Sub6_Sub7_Sub2 class33_sub6_sub7_sub2 = new Class33_Sub6_Sub7_Sub2(Class21.anIntArray391, Class33_Sub6_Sub4_Sub5_Sub1.anIntArray3753, Class33_Sub6_Sub5.anIntArray2769, Class75.anIntArray1614, Class33_Sub6_Sub4_Sub1.aByteArrayArray3361);
			Class35.method841(-21572);
			return class33_sub6_sub7_sub2;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "n.E(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub3 method319(int arg0)
	{
		try
		{
			anInt3624++;
			Class33_Sub6_Sub9 class33_sub6_sub9 = Class63.method1083((byte)51, anInt3616);
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = class33_sub6_sub9.method518(anInt3600, false);
			if(arg0 != -6941)
				method378(null, 58, null, null);
			if(class33_sub6_sub4_sub3 == null)
			{
				return null;
			} else
			{
				class33_sub6_sub4_sub3.method347(anInt3618);
				return class33_sub6_sub4_sub3;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "n.B(" + arg0 + ')');
		}
	}

	public void method376(int arg0, byte arg1, int arg2, int arg3, int arg4)
	{
		try
		{
			if(arg1 > -63)
				aClass58_3588 = null;
			if(!aBoolean3612)
			{
				double d = -anInt3615 + arg4;
				double d2 = arg2 - anInt3592;
				double d3 = Math.sqrt(d * d + d2 * d2);
				aDouble3603 = ((double)anInt3619 * d2) / d3 + (double)anInt3592;
				aDouble3582 = (d * (double)anInt3619) / d3 + (double)anInt3615;
				aDouble3594 = anInt3605;
			}
			anInt3602++;
			double d1 = -arg3 + 1 + anInt3575;
			aDouble3608 = ((double)arg2 - aDouble3603) / d1;
			aDouble3613 = (-aDouble3582 + (double)arg4) / d1;
			aDouble3621 = Math.sqrt(aDouble3613 * aDouble3613 + aDouble3608 * aDouble3608);
			if(!aBoolean3612)
				aDouble3617 = -aDouble3621 * Math.tan((double)anInt3585 * 0.02454369D);
			aDouble3576 = ((-(d1 * aDouble3617) + (-aDouble3594 + (double)arg0)) * 2D) / (d1 * d1);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "n.F(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public static void method377(int arg0)
	{
		try
		{
			aFrame3606 = null;
			aClass20_3623 = null;
			aClass58_3610 = null;
			aClass58_3577 = null;
			aClass72_3611 = null;
			aClass16_3574 = null;
			if(arg0 != 2)
			{
				return;
			} else
			{
				aClass58_3584 = null;
				aClass79_3581 = null;
				aClass58_3625 = null;
				anIntArray3596 = null;
				aClass58_3593 = null;
				aClass58_3588 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "n.G(" + arg0 + ')');
		}
	}

	public static void method378(Class30 arg0, int arg1, Class30 arg2, Class30 arg3)
	{
		try
		{
			Class33_Sub6_Sub11.aClass30_2941 = arg3;
			Class33_Sub6_Sub4_Sub1.aClass30_3342 = arg2;
			if(arg1 != 453)
			{
				return;
			} else
			{
				anInt3591++;
				Class16.aClass30_314 = arg0;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "n.C(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public void method379(int arg0, int arg1)
	{
		aDouble3594 += 0.5D * aDouble3576 * (double)arg1 * (double)arg1 + aDouble3617 * (double)arg1;
		aBoolean3612 = true;
		aDouble3582 += (double)arg1 * aDouble3613;
		aDouble3617 += (double)arg1 * aDouble3576;
		aDouble3603 += (double)arg1 * aDouble3608;
		anInt3609++;
		anInt3578 = 0x7ff & 1024 + (int)(325.94900000000001D * Math.atan2(aDouble3613, aDouble3608));
		anInt3618 = 0x7ff & (int)(Math.atan2(aDouble3617, aDouble3621) * 325.94900000000001D);
		if(arg0 < 81)
			anInt3592 = -8;
		if(aClass33_Sub6_Sub14_3601 != null)
			for(anInt3589 += arg1; anInt3589 > aClass33_Sub6_Sub14_3601.anIntArray3031[anInt3600];)
			{
				anInt3589 -= aClass33_Sub6_Sub14_3601.anIntArray3031[anInt3600];
				anInt3600++;
				if(~aClass33_Sub6_Sub14_3601.anIntArray3009.length >= ~anInt3600)
				{
					anInt3600 -= aClass33_Sub6_Sub14_3601.anInt3028;
					if(~anInt3600 > -1 || anInt3600 >= aClass33_Sub6_Sub14_3601.anIntArray3009.length)
						anInt3600 = 0;
				}
			}

	}

	public static void method380(int arg0)
	{
		try
		{
			anInt3587++;
			if(arg0 != 2)
				return;
			int i = Class75.aClass33_Sub6_Sub7_Sub2_1632.method465(Class74.aClass58_1564);
			for(int j = 0; Class14.anInt276 > j; j++)
			{
				int k = Class75.aClass33_Sub6_Sub7_Sub2_1632.method465(Class39.aClass58Array868[j]);
				if(i < k)
					i = k;
			}

			i += 8;
			int l = 15 * Class14.anInt276 + 21;
			if(Class70.anInt1496 == -1)
			{
				if(~Class82.anInt1794 >= -5 || Class48.anInt1055 <= 4 || Class82.anInt1794 >= 516 || Class48.anInt1055 >= 338)
				{
					if(Class82.anInt1794 > 553 && ~Class48.anInt1055 < -206 && Class82.anInt1794 < 743 && ~Class48.anInt1055 > -467)
					{
						Class33_Sub6_Sub4_Sub4.aBoolean3486 = true;
						Class26.anInt550 = i;
						Class33_Sub6.anInt2127 = 1;
						Class33_Sub6_Sub4_Sub5.anInt3537 = Class14.anInt276 * 15 - -22;
						int i2 = Class48.anInt1055 - 205;
						int i1 = (Class82.anInt1794 - 553) + -(i / 2);
						if(~i2 <= -1)
						{
							if(l + i2 > 261)
								i2 = 261 - l;
						} else
						{
							i2 = 0;
						}
						if(~i1 > -1)
							i1 = 0;
						else
						if(~(i + i1) < -191)
							i1 = 190 + -i;
						Class78.anInt1673 = i1;
						Class77_Sub2.anInt2642 = i2;
						return;
					}
					if(~Class82.anInt1794 < -18 && Class48.anInt1055 > 357 && Class82.anInt1794 < 496 && Class48.anInt1055 < 453)
					{
						Class33_Sub6.anInt2127 = 2;
						Class33_Sub6_Sub4_Sub5.anInt3537 = 15 * Class14.anInt276 - -22;
						int j2 = -357 + Class48.anInt1055;
						int j1 = Class82.anInt1794 - 17 - i / 2;
						if(j1 >= 0)
						{
							if(i + j1 > 479)
								j1 = 479 - i;
						} else
						{
							j1 = 0;
						}
						Class33_Sub6_Sub4_Sub4.aBoolean3486 = true;
						Class78.anInt1673 = j1;
						Class26.anInt550 = i;
						if(j2 < 0)
							j2 = 0;
						else
						if(~(l + j2) < -97)
							j2 = -l + 96;
						Class77_Sub2.anInt2642 = j2;
						return;
					}
				} else
				{
					Class33_Sub6_Sub4_Sub5.anInt3537 = 15 * Class14.anInt276 + 22;
					Class33_Sub6.anInt2127 = 0;
					Class33_Sub6_Sub4_Sub4.aBoolean3486 = true;
					int k1 = -(i / 2) + -4 + Class82.anInt1794;
					if(i + k1 > 512)
						k1 = -i + 512;
					if(k1 < 0)
						k1 = 0;
					Class78.anInt1673 = k1;
					int k2 = -4 + Class48.anInt1055;
					if(~(k2 - -l) < -335)
						k2 = -l + 334;
					if(k2 < 0)
						k2 = 0;
					Class26.anInt550 = i;
					Class77_Sub2.anInt2642 = k2;
					return;
				}
			} else
			{
				Class33_Sub6_Sub4_Sub5.anInt3537 = 22 + 15 * Class14.anInt276;
				Class26.anInt550 = i;
				Class33_Sub6_Sub4_Sub4.aBoolean3486 = true;
				Class33_Sub6.anInt2127 = 0;
				int l1 = Class82.anInt1794 - i / 2;
				if(i + l1 > 765)
					l1 = -i + 765;
				if(l1 < 0)
					l1 = 0;
				Class78.anInt1673 = l1;
				int l2 = Class48.anInt1055;
				if(l + l2 > 503)
					l2 = 503 + -l;
				if(~l2 > -1)
					l2 = 0;
				Class77_Sub2.anInt2642 = l2;
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "n.D(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7, int arg8, int arg9, int arg10)
	{
		anInt3589 = 0;
		anInt3600 = 0;
		aBoolean3612 = false;
		try
		{
			anInt3592 = arg3;
			anInt3619 = arg8;
			anInt3605 = arg4;
			anInt3616 = arg0;
			anInt3586 = arg1;
			anInt3607 = arg10;
			anInt3615 = arg2;
			anInt3579 = arg5;
			anInt3599 = arg9;
			anInt3575 = arg6;
			anInt3585 = arg7;
			aBoolean3612 = false;
			int i = Class63.method1083((byte)51, anInt3616).anInt2849;
			if(i != -1)
			{
				aClass33_Sub6_Sub14_3601 = Class33_Sub21.method830(i, -87);
				return;
			} else
			{
				aClass33_Sub6_Sub14_3601 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "n.<init>(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
		}
	}

	public static void method381(byte arg0, int arg1)
	{
		anInt3583++;
		if(~arg1 > -1)
			return;
		int i = Class51.anIntArray1100[arg1];
		int j = Class71.anIntArray1524[arg1];
		int k = Class33_Sub6_Sub4_Sub1.anIntArray3357[arg1];
		if(~k <= -2001)
			k -= 2000;
		int l = Class33_Sub6_Sub9.anIntArray2820[arg1];
		if(Class33_Sub20.anInt2567 != 0 && k != 1001)
		{
			Class33_Sub20.anInt2567 = 0;
			Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
		}
		if(k == 1005)
		{
			Class33_Sub20.anInt2565 = Class82.anInt1794;
			Class12.anInt203++;
			Class33_Sub6_Sub9.anInt2851 = 2;
			Class12.anInt242 = 0;
			Class3.anInt112 = Class48.anInt1055;
			Class46.aClass33_Sub11_Sub1_989.method683(4, -1198);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, l >> 0xb77a782e & 0x7fff);
		}
		if(k == 57)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(11, -1198);
			Class80.anInt1731++;
			Class46.aClass33_Sub11_Sub1_989.method627(4773, i);
			Class46.aClass33_Sub11_Sub1_989.method669(j, -30515);
			Class46.aClass33_Sub11_Sub1_989.method673(-105, l);
			Class21.anInt401 = j;
			Class33_Sub6_Sub4.anInt2742 = 2;
			if(~Class33_Sub6_Sub14.anInt3013 == ~(j >> 0x412d0910))
				Class33_Sub6_Sub4.anInt2742 = 1;
			Class55.anInt1171 = 0;
			if(~(j >> 0x609afd30) == ~Class45.anInt965)
				Class33_Sub6_Sub4.anInt2742 = 3;
			Class66.anInt1421 = i;
		}
		if(k == 32 && ~Class33_Sub18.anInt2514 == 0)
		{
			Class23.method187(j, (byte)84, i);
			Class82.anInt1792 = i;
			Class33_Sub18.anInt2514 = j;
		}
		if(k == 24 || ~k == -1007)
			Class33_Sub10.method612(-8, l, i, j);
		if(~k == -5)
		{
			boolean flag = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 0, 2, 0, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			Class33_Sub6_Sub8.anInt2817++;
			if(!flag)
				flag = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 1, 2, 1, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			Class12.anInt242 = 0;
			Class33_Sub6_Sub9.anInt2851 = 2;
			Class33_Sub20.anInt2565 = Class82.anInt1794;
			Class3.anInt112 = Class48.anInt1055;
			Class46.aClass33_Sub11_Sub1_989.method683(250, -1198);
			Class46.aClass33_Sub11_Sub1_989.method670(Class69.anInt1475 + i, -128);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, l);
			Class46.aClass33_Sub11_Sub1_989.method670(Class33_Sub2.anInt2036 + j, -128);
		}
		if(~k == -30)
		{
			Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[l];
			if(class33_sub6_sub4_sub5_sub2 != null)
			{
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class12.anInt242 = 0;
				Class68.anInt1449++;
				Class3.anInt112 = Class48.anInt1055;
				Class46.aClass33_Sub11_Sub1_989.method683(138, -1198);
				Class46.aClass33_Sub11_Sub1_989.method627(4773, l);
			}
		}
		if(~k == -4)
		{
			Class33.anInt724++;
			Class46.aClass33_Sub11_Sub1_989.method683(87, -1198);
			Class46.aClass33_Sub11_Sub1_989.method669(j, -30515);
			Class33_Sub15 class33_sub15 = Class49.method933(j, -75);
			if(class33_sub15.anIntArrayArray2411 != null && class33_sub15.anIntArrayArray2411[0][0] == 5)
			{
				int j1 = class33_sub15.anIntArrayArray2411[0][1];
				if(class33_sub15.anIntArray2385[0] != Class33_Sub5.anIntArray2120[j1])
				{
					Class33_Sub5.anIntArray2120[j1] = class33_sub15.anIntArray2385[0];
					Class33_Sub12.method687(j1, true);
					Class74.aBoolean1579 = true;
				}
			}
		}
		if(~k == -45)
		{
			Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[l];
			if(class33_sub6_sub4_sub5_sub1 != null)
			{
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class12.anInt242 = 0;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class3.anInt112 = Class48.anInt1055;
				Class46.aClass33_Sub11_Sub1_989.method683(173, -1198);
				Class77_Sub2.anInt2626++;
				Class46.aClass33_Sub11_Sub1_989.method627(4773, l);
			}
		}
		if(k == 17)
		{
			entityToFollow = null;
			Class45.method912(l, i, j, -75);
			Class33_Sub7.anInt2175++;
			Class46.aClass33_Sub11_Sub1_989.method683(53, -1198);
			Class46.aClass33_Sub11_Sub1_989.method673(-119, (0x1fffebab & l) >> 0x3bfd4a2e);
			Class46.aClass33_Sub11_Sub1_989.method670(Class33_Sub2.anInt2036 + j, -128);
			Class46.aClass33_Sub11_Sub1_989.method670(Class69.anInt1475 + i, -128);
		}
		if(~k == -9)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(212, -1198);
			Class46.aClass33_Sub11_Sub1_989.method670(i, -128);
			Class31.anInt693++;
			Class46.aClass33_Sub11_Sub1_989.method627(4773, l);
			Class46.aClass33_Sub11_Sub1_989.method654(0x1bb12a8, j);
			Class55.anInt1171 = 0;
			Class21.anInt401 = j;
			Class66.anInt1421 = i;
			Class33_Sub6_Sub4.anInt2742 = 2;
			if(~(j >> 0xf735ed50) == ~Class33_Sub6_Sub14.anInt3013)
				Class33_Sub6_Sub4.anInt2742 = 1;
			if(~Class45.anInt965 == ~(j >> 0xe8c28490))
				Class33_Sub6_Sub4.anInt2742 = 3;
		}
		if(~k == -28)
		{
			entityToFollow = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[l];
			if(entityToFollow != null) {
				int size = 1;
				if(Class33_Sub6_Sub4_Sub6.entityToFollow instanceof Class33_Sub6_Sub4_Sub5_Sub2) { //NPC.
					Class33_Sub6_Sub4_Sub5_Sub2 npc = (Class33_Sub6_Sub4_Sub5_Sub2) Class33_Sub6_Sub4_Sub6.entityToFollow;
					size = npc.aClass33_Sub6_Sub16_3776.anInt3107;
				}
				int x1 = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0];
				int y1 = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0];
				int x = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub6_Sub4_Sub6.entityToFollow)).anIntArray3554[0];
				int y = ((Class33_Sub6_Sub4_Sub5) (Class33_Sub6_Sub4_Sub6.entityToFollow)).anIntArray3520[0];
				client.Location best = client.getClosestSpot(new client.Location(x1, y1), client.getValidSpots(size, new client.Location(x, y)));
				if(best != null) {
					if(!client.withinRange(x1, y1, best.getX(), best.getY(),  client.fromDistance - 1)) {
						Class33_Sub6_Sub4_Sub4.method350(false, best.getX(), true, 0, (byte)-102, 0, 2, 0, 0, 0, best.getY(), x1, y1);
					}
				}
				//Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (entityToFollow)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (entityToFollow)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class3.anInt112 = Class48.anInt1055;
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class12.anInt242 = 0;
				Class46.aClass33_Sub11_Sub1_989.method683(241, -1198);
				Class46.aClass33_Sub11_Sub1_989.method670(l, -128);
				Class11.anInt187++;
			}
		}
		if(k == 48)
		{
			Class33_Sub21.anInt2584++;
			boolean flag1 = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 0, 2, 0, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			if(!flag1)
				flag1 = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 1, 2, 1, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			Class33_Sub6_Sub9.anInt2851 = 2;
			Class33_Sub20.anInt2565 = Class82.anInt1794;
			Class12.anInt242 = 0;
			Class3.anInt112 = Class48.anInt1055;
			Class46.aClass33_Sub11_Sub1_989.method683(182, -1198);
			Class46.aClass33_Sub11_Sub1_989.method625(Class69.anInt1475 + i, true);
			Class46.aClass33_Sub11_Sub1_989.method673(-101, Class33_Sub20.anInt2576);
			Class46.aClass33_Sub11_Sub1_989.method664(true, Class26.anInt533);
			Class46.aClass33_Sub11_Sub1_989.method625(Class33_Sub2.anInt2036 + j, true);
			Class46.aClass33_Sub11_Sub1_989.method625(l, true);
		}
		if(k == 53 && Class45.method912(l, i, j, -78))
		{
			Class46.aClass33_Sub11_Sub1_989.method683(135, -1198);
			Class46.aClass33_Sub11_Sub1_989.method625((l & 0x1fffc41c) >> 0xfcf0686e, true);
			Class33_Sub2.anInt2022++;
			Class46.aClass33_Sub11_Sub1_989.method625(Class33_Sub20.anInt2576, true);
			Class46.aClass33_Sub11_Sub1_989.method673(-101, Class69.anInt1475 + i);
			Class46.aClass33_Sub11_Sub1_989.method654(0x1bb12a8, Class26.anInt533);
			Class46.aClass33_Sub11_Sub1_989.method625(Class33_Sub2.anInt2036 + j, true);
		}
		if(~k == -51)
		{
			Class33_Sub2.anInt2034++;
			Class46.aClass33_Sub11_Sub1_989.method683(21, -1198);
			Class46.aClass33_Sub11_Sub1_989.method673(-99, l);
			Class46.aClass33_Sub11_Sub1_989.method654(0x1bb12a8, j);
			Class46.aClass33_Sub11_Sub1_989.method625(i, true);
			Class55.anInt1171 = 0;
			Class33_Sub6_Sub4.anInt2742 = 2;
			if(~(j >> 0x3f34a2f0) == ~Class33_Sub6_Sub14.anInt3013)
				Class33_Sub6_Sub4.anInt2742 = 1;
			Class66.anInt1421 = i;
			if(j >> 0xd69b5510 == Class45.anInt965)
				Class33_Sub6_Sub4.anInt2742 = 3;
			Class21.anInt401 = j;
		}
		if(~k == -10)
		{
			Class77_Sub2.method1176(-99, Class81.anInt1744);
			Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
			Class81.anInt1744 = -1;
		}
		if(k == 1007)
		{
			Class33_Sub20.anInt2565 = Class82.anInt1794;
			Class3.anInt112 = Class48.anInt1055;
			Class12.anInt242 = 0;
			Class33_Sub6_Sub9.anInt2851 = 2;
			Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2_2 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[l];
			if(class33_sub6_sub4_sub5_sub2_2 != null)
			{
				Class33_Sub6_Sub16 class33_sub6_sub16 = class33_sub6_sub4_sub5_sub2_2.aClass33_Sub6_Sub16_3776;
				if(class33_sub6_sub16.anIntArray3071 != null)
					class33_sub6_sub16 = class33_sub6_sub16.method586(-105);
				if(class33_sub6_sub16 != null)
				{
					Class46.aClass33_Sub11_Sub1_989.method683(136, -1198);
					Class46.aClass33_Sub11_Sub1_989.method627(4773, class33_sub6_sub16.anInt3118);
					Class41.anInt900++;
				}
			}
		}
		if(~k == -1003)
		{
			Class33_Sub15 class33_sub15_1 = Class49.method933(j, -63);
			if(class33_sub15_1 == null || ~class33_sub15_1.anIntArray2398[i] > 0xfffe795f)
			{
				Class30.anInt665++;
				Class46.aClass33_Sub11_Sub1_989.method683(7, -1198);
				Class46.aClass33_Sub11_Sub1_989.method627(4773, l);
			} else
			{
				Class43.method904(0, 0, Class35.method846((byte)-83, new Class58[] {
					Class37.method859(15591, class33_sub15_1.anIntArray2398[i]), Class33_Sub6_Sub17.aClass58_3122, Class14.method127(l, (byte)90).aClass58_2898
				}), Class33_Sub13_Sub4.aClass58_3261);
			}
			Class21.anInt401 = j;
			Class66.anInt1421 = i;
			Class55.anInt1171 = 0;
			Class33_Sub6_Sub4.anInt2742 = 2;
			if(~Class33_Sub6_Sub14.anInt3013 == ~(j >> 0x2815e670))
				Class33_Sub6_Sub4.anInt2742 = 1;
			if(Class45.anInt965 == j >> 0xd2475830)
				Class33_Sub6_Sub4.anInt2742 = 3;
		}
		if(~k == -38)
		{
			Class15_Sub2.anInt1962++;
			boolean flag2 = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 0, 2, 0, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			if(!flag2)
				flag2 = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 1, 2, 1, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			Class12.anInt242 = 0;
			Class33_Sub6_Sub9.anInt2851 = 2;
			Class3.anInt112 = Class48.anInt1055;
			Class33_Sub20.anInt2565 = Class82.anInt1794;
			Class46.aClass33_Sub11_Sub1_989.method683(254, -1198);
			Class46.aClass33_Sub11_Sub1_989.method625(l, true);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, Class33_Sub2.anInt2036 + j);
			Class46.aClass33_Sub11_Sub1_989.method625(Class69.anInt1475 + i, true);
		}
		if(~k == -44)
		{
			Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2_3 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[l];
			if(class33_sub6_sub4_sub5_sub2_3 != null)
			{
				Class51.anInt1099++;
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_3)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_3)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class3.anInt112 = Class48.anInt1055;
				Class12.anInt242 = 0;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class46.aClass33_Sub11_Sub1_989.method683(81, -1198);
				Class46.aClass33_Sub11_Sub1_989.method625(l, true);
			}
		}
		if(~k == -26)
		{
			Class33_Sub15 class33_sub15_2 = Class49.method933(j, -112);
			boolean flag5 = true;
			if(~class33_sub15_2.anInt2446 < -1)
				flag5 = Class14.method129((byte)126, class33_sub15_2);
			if(flag5)
			{
				Class46.aClass33_Sub11_Sub1_989.method683(87, -1198);
				Class33.anInt724++;
				Class46.aClass33_Sub11_Sub1_989.method669(j, -30515);
			}
		}
		if(~k == -21)
			Class43.method900(true);
		if(k == 26)
		{
			entityToFollow = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[l];
			if(entityToFollow != null)
			{
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (entityToFollow)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (entityToFollow)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class12.anInt242 = 0;
				RuntimeException_Sub1.anInt1821++;
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class3.anInt112 = Class48.anInt1055;
				Class46.aClass33_Sub11_Sub1_989.method683(189, -1198);
				Class46.aClass33_Sub11_Sub1_989.method625(l, true);
			}
		}
		if(k == 34)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(243, -1198);
			Class33_Sub6_Sub12.anInt2976++;
			Class46.aClass33_Sub11_Sub1_989.method670(i, -128);
			Class46.aClass33_Sub11_Sub1_989.method670(l, -128);
			Class46.aClass33_Sub11_Sub1_989.method663(j, 768);
			Class33_Sub6_Sub4.anInt2742 = 2;
			if(Class33_Sub6_Sub14.anInt3013 == j >> 0xf923bfb0)
				Class33_Sub6_Sub4.anInt2742 = 1;
			Class66.anInt1421 = i;
			Class21.anInt401 = j;
			Class55.anInt1171 = 0;
			if(~Class45.anInt965 == ~(j >> 0x99302eb0))
				Class33_Sub6_Sub4.anInt2742 = 3;
		}
		if(~k == -24)
		{
			entityToFollow = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[l];
			if(entityToFollow != null)
			{
				Class54.anInt1150++;
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (entityToFollow)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (entityToFollow)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class3.anInt112 = Class48.anInt1055;
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class12.anInt242 = 0;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class46.aClass33_Sub11_Sub1_989.method683(153, -1198);
				Class46.aClass33_Sub11_Sub1_989.method625(Class33_Sub20.anInt2576, true);
				Class46.aClass33_Sub11_Sub1_989.method627(4773, l);
				Class46.aClass33_Sub11_Sub1_989.method669(Class26.anInt533, -30515);
			}
		}
		if(~k == -3)
		{
			Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1_3 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[l];
			if(class33_sub6_sub4_sub5_sub1_3 != null)
			{
				Class74.anInt1573++;
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1_3)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1_3)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class12.anInt242 = 0;
				Class3.anInt112 = Class48.anInt1055;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class46.aClass33_Sub11_Sub1_989.method683(30, -1198);
				Class46.aClass33_Sub11_Sub1_989.method627(4773, Class80.anInt1728);
				Class46.aClass33_Sub11_Sub1_989.method664(true, Class33_Sub16.anInt2494);
				Class46.aClass33_Sub11_Sub1_989.method625(l, true);
				Class46.aClass33_Sub11_Sub1_989.method627(4773, Class31.anInt699);
			}
		}
		if(~k == -6)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(246, -1198);
			Class70.anInt1492++;
			Class46.aClass33_Sub11_Sub1_989.method663(j, 768);
			Class46.aClass33_Sub11_Sub1_989.method654(0x1bb12a8, Class26.anInt533);
			Class46.aClass33_Sub11_Sub1_989.method670(Class33_Sub20.anInt2576, -128);
			Class46.aClass33_Sub11_Sub1_989.method670(i, -128);
		}
		if(~k == -19)
		{
			Class33_Sub6_Sub3.anInt2726++;
			boolean flag3 = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 0, 2, 0, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			if(!flag3)
				flag3 = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 1, 2, 1, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			Class3.anInt112 = Class48.anInt1055;
			Class12.anInt242 = 0;
			Class33_Sub20.anInt2565 = Class82.anInt1794;
			Class33_Sub6_Sub9.anInt2851 = 2;
			Class46.aClass33_Sub11_Sub1_989.method683(48, -1198);
			Class46.aClass33_Sub11_Sub1_989.method673(-128, Class80.anInt1728);
			Class46.aClass33_Sub11_Sub1_989.method625(Class33_Sub2.anInt2036 + j, true);
			Class46.aClass33_Sub11_Sub1_989.method663(Class33_Sub16.anInt2494, 768);
			Class46.aClass33_Sub11_Sub1_989.method670(i - -Class69.anInt1475, -128);
			Class46.aClass33_Sub11_Sub1_989.method673(-105, l);
			Class46.aClass33_Sub11_Sub1_989.method673(-127, Class31.anInt699);
		}
		if(k == 7)
		{
			Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2_4 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[l];
			if(class33_sub6_sub4_sub5_sub2_4 != null)
			{
				Class44.anInt952++;
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_4)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_4)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class3.anInt112 = Class48.anInt1055;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class12.anInt242 = 0;
				Class46.aClass33_Sub11_Sub1_989.method683(114, -1198);
				Class46.aClass33_Sub11_Sub1_989.method627(4773, l);
			}
		}
		if(k == 51 || ~k == -56)
		{
			Class58 class58 = Class39.aClass58Array868[arg1];
			int k1 = class58.method1046((byte)-117, Class33.aClass58_743);
			if(k1 != -1)
			{
				class58 = class58.method1028(12 + k1, (byte)120).method1026((byte)121);
				Class58 class58_4 = class58.method1053(true).method1065(-125);
				boolean flag8 = false;
				for(int i3 = 0; Class31.anInt697 > i3; i3++)
				{
					Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1_7 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[Class33_Sub3.anIntArray2050[i3]];
					entityToFollow = class33_sub6_sub4_sub5_sub1_7;
					if(class33_sub6_sub4_sub5_sub1_7 == null || class33_sub6_sub4_sub5_sub1_7.aClass58_3755 == null || !class33_sub6_sub4_sub5_sub1_7.aClass58_3755.method1059(-1, class58_4))
						continue;
					Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1_7)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1_7)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
					flag8 = true;
					if(~k == -52)
					{
						Class46.aClass33_Sub11_Sub1_989.method683(173, -1198);
						Class46.aClass33_Sub11_Sub1_989.method627(4773, Class33_Sub3.anIntArray2050[i3]);
						Class77_Sub2.anInt2626++;
					}
					if(k == 55)
					{
						Class46.aClass33_Sub11_Sub1_989.method683(119, -1198);
						Class26.anInt544++;
						Class46.aClass33_Sub11_Sub1_989.method673(-97, Class33_Sub3.anIntArray2050[i3]);
					}
					break;
				}

				if(!flag8)
					Class43.method904(0, 0, Class35.method846((byte)-83, new Class58[] {
						Class13.aClass58_250, class58_4
					}), Class33_Sub13_Sub4.aClass58_3261);
			}
		}
		if(k == 28)
		{
			entityToFollow = null;
			Class45.method912(l, i, j, -96);
			Class46.aClass33_Sub11_Sub1_989.method683(58, -1198);
			Class46.aClass33_Sub11_Sub1_989.method625(l >> 0x6bdb5cae & 0x7fff, true);
			Class80.anInt1726++;
			Class46.aClass33_Sub11_Sub1_989.method673(-123, Class33_Sub2.anInt2036 + j);
			Class46.aClass33_Sub11_Sub1_989.method673(-119, i + Class69.anInt1475);
		}
		if(~k == -17)
		{
			entityToFollow = null;
			Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1_4 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[l];
			if(class33_sub6_sub4_sub5_sub1_4 != null)
			{
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1_4)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub1_4)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class69.anInt1467++;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class3.anInt112 = Class48.anInt1055;
				Class12.anInt242 = 0;
				Class46.aClass33_Sub11_Sub1_989.method683(2, -1198);
				Class46.aClass33_Sub11_Sub1_989.method627(4773, l);
			}
		}
		if(~k == -31)
		{
			entityToFollow = null;
			Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2_5 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[l];
			if(class33_sub6_sub4_sub5_sub2_5 != null)
			{
				Class78.anInt1661++;
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_5)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_5)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class3.anInt112 = Class48.anInt1055;
				Class12.anInt242 = 0;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class46.aClass33_Sub11_Sub1_989.method683(83, -1198);
				Class46.aClass33_Sub11_Sub1_989.method627(4773, l);
			}
		}
		if(~k == -43)
		{
			entityToFollow = null;
			anInt3598++;
			boolean flag4 = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 0, 2, 0, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			if(!flag4)
				flag4 = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 1, 2, 1, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			Class12.anInt242 = 0;
			Class33_Sub20.anInt2565 = Class82.anInt1794;
			Class33_Sub6_Sub9.anInt2851 = 2;
			Class3.anInt112 = Class48.anInt1055;
			Class46.aClass33_Sub11_Sub1_989.method683(238, -1198);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, j + Class33_Sub2.anInt2036);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, Class69.anInt1475 + i);
			Class46.aClass33_Sub11_Sub1_989.method670(l, -128);
		}
		if(~k == -22)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(188, -1198);
			Class46.aClass33_Sub11_Sub1_989.method664(true, j);
			Class33_Sub6_Sub4_Sub2.anInt3368++;
			Class46.aClass33_Sub11_Sub1_989.method670(i, -128);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, Class33_Sub20.anInt2576);
			Class46.aClass33_Sub11_Sub1_989.method673(-99, l);
			Class46.aClass33_Sub11_Sub1_989.method669(Class26.anInt533, -30515);
			Class21.anInt401 = j;
			Class55.anInt1171 = 0;
			Class66.anInt1421 = i;
			Class33_Sub6_Sub4.anInt2742 = 2;
			if(~Class33_Sub6_Sub14.anInt3013 == ~(j >> 0x9de4df0))
				Class33_Sub6_Sub4.anInt2742 = 1;
			if(~Class45.anInt965 == ~(j >> 0xd95e6cb0))
				Class33_Sub6_Sub4.anInt2742 = 3;
		}
		if(~k == -46)
		{
			entityToFollow = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[l];
			if(entityToFollow != null)
			{
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (entityToFollow)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (entityToFollow)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class12.anInt242 = 0;
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class33_Sub6_Sub16.anInt3074++;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class3.anInt112 = Class48.anInt1055;
				Class46.aClass33_Sub11_Sub1_989.method683(24, -1198);
				Class46.aClass33_Sub11_Sub1_989.method625(l, true);
			}
		}
		if(k == 39)
		{
			Class26.anInt541++;
			Class46.aClass33_Sub11_Sub1_989.method683(199, -1198);
			Class46.aClass33_Sub11_Sub1_989.method654(0x1bb12a8, j);
			Class46.aClass33_Sub11_Sub1_989.method673(-117, i);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, l);
			Class55.anInt1171 = 0;
			Class66.anInt1421 = i;
			Class33_Sub6_Sub4.anInt2742 = 2;
			if(j >> 0xda6b5730 == Class33_Sub6_Sub14.anInt3013)
				Class33_Sub6_Sub4.anInt2742 = 1;
			if(Class45.anInt965 == j >> 0x6491deb0)
				Class33_Sub6_Sub4.anInt2742 = 3;
			Class21.anInt401 = j;
		}
		if(k == 1004)
		{
			Class3.anInt112 = Class48.anInt1055;
			Class30.anInt665++;
			Class33_Sub6_Sub9.anInt2851 = 2;
			Class33_Sub20.anInt2565 = Class82.anInt1794;
			Class12.anInt242 = 0;
			Class46.aClass33_Sub11_Sub1_989.method683(7, -1198);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, l);
		}
		if(~k == -37)
		{
			Class33_Sub6_Sub4.anInt2740++;
			Class46.aClass33_Sub11_Sub1_989.method683(56, -1198);
			Class46.aClass33_Sub11_Sub1_989.method669(j, -30515);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, i);
			Class46.aClass33_Sub11_Sub1_989.method670(l, -128);
			Class66.anInt1421 = i;
			Class55.anInt1171 = 0;
			Class21.anInt401 = j;
			Class33_Sub6_Sub4.anInt2742 = 2;
			if(~Class33_Sub6_Sub14.anInt3013 == ~(j >> 0x1e1aaaf0))
				Class33_Sub6_Sub4.anInt2742 = 1;
			if(j >> 0x2b711e50 == Class45.anInt965)
				Class33_Sub6_Sub4.anInt2742 = 3;
		}
		if(k == 15)
		{
			Class58 class58_1 = Class39.aClass58Array868[arg1];
			int l1 = class58_1.method1046((byte)-93, Class33.aClass58_743);
			if(~l1 != 0)
				if(~Class33_Sub6_Sub14.anInt3013 != 0)
				{
					Class43.method904(0, 0, Class68.aClass58_1454, Class33_Sub13_Sub4.aClass58_3261);
					if(Class33_Sub6_Sub4_Sub5.aClass58_3573 != null)
						Class43.method904(0, 0, Class33_Sub6_Sub4_Sub5.aClass58_3573, Class33_Sub13_Sub4.aClass58_3261);
				} else
				{
					Class43.method900(true);
					if(Class39.anInt879 != -1)
					{
						Class33_Sub13_Sub4.aClass58_3294 = class58_1.method1028(l1 - -12, (byte)120).method1026((byte)99);
						Class12.anInt227 = Class33_Sub6_Sub14.anInt3013 = Class39.anInt879;
						Class3.aBoolean117 = false;
					}
				}
		}
		if(k == 19)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(218, -1198);
			Class46.aClass33_Sub11_Sub1_989.method670(l, -128);
			Class33_Sub18.anInt2517++;
			Class46.aClass33_Sub11_Sub1_989.method669(j, -30515);
			Class46.aClass33_Sub11_Sub1_989.method670(i, -128);
			Class33_Sub6_Sub4.anInt2742 = 2;
			Class66.anInt1421 = i;
			Class21.anInt401 = j;
			Class55.anInt1171 = 0;
			if(Class33_Sub6_Sub14.anInt3013 == j >> 0xc91b9190)
				Class33_Sub6_Sub4.anInt2742 = 1;
			if(Class45.anInt965 == j >> 0x4129450)
				Class33_Sub6_Sub4.anInt2742 = 3;
		}
		if(~k == -53)
		{
			Class33_Sub15 class33_sub15_3 = Class39.method879(j, (byte)107, i);
			if(class33_sub15_3 != null)
			{
				Class33_Sub10.method614(-103);
				Class33_Sub6_Sub11.method532(true, Class33.method268((byte)111, Class33_Sub6_Sub5.method403(class33_sub15_3, -5447)), i, j);
				Class74.aBoolean1579 = true;
				anInt3590 = 0;
				aClass58_3610 = Class34.method837((byte)99, class33_sub15_3);
				if(aClass58_3610 == null)
					aClass58_3610 = Class77.aClass58_1642;
				if(!class33_sub15_3.aBoolean2412)
					Class33_Sub18.aClass58_2518 = Class35.method846((byte)-83, new Class58[] {
						Class33_Sub18.aClass58_2524, class33_sub15_3.aClass58_2431, Class33.aClass58_743
					});
				else
					Class33_Sub18.aClass58_2518 = Class35.method846((byte)-83, new Class58[] {
						class33_sub15_3.aClass58_2415, Class33.aClass58_743
					});
				if(Class12.anInt209 == 16 && !class33_sub15_3.aBoolean2412)
				{
					Class26.aBoolean552 = true;
					Class74.aBoolean1579 = true;
					Class30.anInt620 = 3;
				}
			}
			return;
		}
		if(~k == -11 || ~k == -39 || k == 13 || ~k == -23)
		{
			Class58 class58_2 = Class39.aClass58Array868[arg1];
			int i2 = class58_2.method1046((byte)-123, Class33.aClass58_743);
			if(i2 != -1)
			{
				long l2 = class58_2.method1028(12 + i2, (byte)120).method1026((byte)-125).method1062((byte)11);
				if(k == 10)
					Class33_Sub6_Sub10.method521(l2, false);
				if(k == 38)
					Class63.method1081(l2, 119);
				if(~k == -14)
					Applet_Sub1.method21(l2, true);
				if(~k == -23)
					Applet_Sub1.method19(1, l2);
			}
		}
		if(~k == -55)
		{
			Class33_Sub6_Sub4_Sub5.anInt3501++;
			Class46.aClass33_Sub11_Sub1_989.method683(91, -1198);
			Class46.aClass33_Sub11_Sub1_989.method670(l, -128);
			Class46.aClass33_Sub11_Sub1_989.method664(true, j);
			Class46.aClass33_Sub11_Sub1_989.method673(-124, i);
			Class55.anInt1171 = 0;
			Class21.anInt401 = j;
			Class33_Sub6_Sub4.anInt2742 = 2;
			if(Class33_Sub6_Sub14.anInt3013 == j >> 0xa6f240d0)
				Class33_Sub6_Sub4.anInt2742 = 1;
			Class66.anInt1421 = i;
			if(j >> 0xc1ae79d0 == Class45.anInt965)
				Class33_Sub6_Sub4.anInt2742 = 3;
		}
		if(~k == -57)
		{
			entityToFollow = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[l];
			if(entityToFollow != null)
			{
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (entityToFollow)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (entityToFollow)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class12.anInt242 = 0;
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class3.anInt112 = Class48.anInt1055;
				Class26.anInt544++;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class46.aClass33_Sub11_Sub1_989.method683(119, -1198);
				Class46.aClass33_Sub11_Sub1_989.method673(-105, l);
			}
		}
		int i1 = -1 % ((-13 - arg0) / 55);
		if(k == 41)
		{
			Class45.anInt970++;
			Class46.aClass33_Sub11_Sub1_989.method683(23, -1198);
			Class46.aClass33_Sub11_Sub1_989.method625(l, true);
			Class46.aClass33_Sub11_Sub1_989.method654(0x1bb12a8, j);
			Class46.aClass33_Sub11_Sub1_989.method670(Class80.anInt1728, -128);
			Class46.aClass33_Sub11_Sub1_989.method673(-99, i);
			Class46.aClass33_Sub11_Sub1_989.method664(true, Class33_Sub16.anInt2494);
			Class46.aClass33_Sub11_Sub1_989.method625(Class31.anInt699, true);
			Class55.anInt1171 = 0;
			Class66.anInt1421 = i;
			Class33_Sub6_Sub4.anInt2742 = 2;
			if(j >> 0x4bd50810 == Class33_Sub6_Sub14.anInt3013)
				Class33_Sub6_Sub4.anInt2742 = 1;
			if(~Class45.anInt965 == ~(j >> 0x1d2963f0))
				Class33_Sub6_Sub4.anInt2742 = 3;
			Class21.anInt401 = j;
		}
		if(~k == -7)
		{
			Class33_Sub10.method614(-101);
			Class31.anInt699 = i;
			anInt3590 = 1;
			Class80.anInt1728 = l;
			Class33_Sub16.anInt2494 = j;
			Class74.aBoolean1579 = true;
			Class77.aClass58_1649 = Class35.method846((byte)-83, new Class58[] {
				Class27.aClass58_556, Class14.method127(l, (byte)90).aClass58_2898, Class33.aClass58_743
			});
			if(Class77.aClass58_1649 == null)
				Class77.aClass58_1649 = Class57.aClass58_1254;
			return;
		}
		if(~k == -59)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(237, -1198);
			Class46.aClass33_Sub11_Sub1_989.method625(l, true);
			Class46.aClass33_Sub11_Sub1_989.method670(i, -128);
			Class46.aClass33_Sub11_Sub1_989.method669(j, -30515);
			Class66.anInt1421 = i;
			Class55.anInt1171 = 0;
			Class33_Sub11_Sub1.anInt3197++;
			Class33_Sub6_Sub4.anInt2742 = 2;
			if(~(j >> 0x938e6d90) == ~Class33_Sub6_Sub14.anInt3013)
				Class33_Sub6_Sub4.anInt2742 = 1;
			if(~(j >> 0xcf12a110) == ~Class45.anInt965)
				Class33_Sub6_Sub4.anInt2742 = 3;
			Class21.anInt401 = j;
		}
		if(k == 35)
		{
			Class45.method912(l, i, j, -78);
			Class46.aClass33_Sub11_Sub1_989.method683(105, -1198);
			Class40.anInt897++;
			Class46.aClass33_Sub11_Sub1_989.method673(-125, Class33_Sub2.anInt2036 + j);
			Class46.aClass33_Sub11_Sub1_989.method625(i - -Class69.anInt1475, true);
			Class46.aClass33_Sub11_Sub1_989.method673(-98, (l & 0x1fffe7bb) >> 0x25e5d2e);
		}
		if(k == 31)
		{
			Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2_6 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[l];
			if(class33_sub6_sub4_sub5_sub2_6 != null)
			{
				Class57.anInt1257++;
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_6)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2_6)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class12.anInt242 = 0;
				Class3.anInt112 = Class48.anInt1055;
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class46.aClass33_Sub11_Sub1_989.method683(139, -1198);
				Class46.aClass33_Sub11_Sub1_989.method625(l, true);
				Class46.aClass33_Sub11_Sub1_989.method669(Class33_Sub16.anInt2494, -30515);
				Class46.aClass33_Sub11_Sub1_989.method670(Class80.anInt1728, -128);
				Class46.aClass33_Sub11_Sub1_989.method670(Class31.anInt699, -128);
			}
		}
		if(~k == -12)
		{
			Class58 class58_3 = Class39.aClass58Array868[arg1];
			int j2 = class58_3.method1046((byte)-117, Class33.aClass58_743);
			if(j2 != -1)
			{
				long l3 = class58_3.method1028(j2 + 12, (byte)120).method1026((byte)-127).method1062((byte)11);
				int j3 = -1;
				for(int k3 = 0; ~k3 > ~Class33_Sub6_Sub12.anInt2979; k3++)
				{
					if(Class47.aLongArray1032[k3] != l3)
						continue;
					j3 = k3;
					break;
				}

				if(j3 != -1 && ~Class30_Sub1.anIntArray2013[j3] < -1)
				{
					Class33_Sub10.aBoolean2208 = true;
					Class33_Sub13_Sub4.aClass58_3322 = Class33_Sub13_Sub4.aClass58_3261;
					Class37.anInt834 = 3;
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					Class33_Sub20.anInt2567 = 0;
					Class33_Sub6_Sub4_Sub2.aLong3385 = Class47.aLongArray1032[j3];
					Class33_Sub13_Sub4.aClass58_3286 = Class35.method846((byte)-83, new Class58[] {
						Class33_Sub6.aClass58_2130, Class32.aClass58Array711[j3]
					});
				}
			}
		}
		if(~k == -13)
		{
			Class34.anInt1836++;
			Class46.aClass33_Sub11_Sub1_989.method683(96, -1198);
			Class46.aClass33_Sub11_Sub1_989.method663(j, 768);
			Class46.aClass33_Sub11_Sub1_989.method625(l, true);
			Class46.aClass33_Sub11_Sub1_989.method673(-98, i);
			Class66.anInt1421 = i;
			Class55.anInt1171 = 0;
			Class21.anInt401 = j;
			Class33_Sub6_Sub4.anInt2742 = 2;
			if(j >> 0x52c1e250 == Class33_Sub6_Sub14.anInt3013)
				Class33_Sub6_Sub4.anInt2742 = 1;
			if(~(j >> 0x4aa5e950) == ~Class45.anInt965)
				Class33_Sub6_Sub4.anInt2742 = 3;
		}
		if(~k == -1004)
		{
			Class45.method912(l, i, j, -111);
			Class33_Sub6_Sub12.anInt2952++;
			Class46.aClass33_Sub11_Sub1_989.method683(177, -1198);
			Class46.aClass33_Sub11_Sub1_989.method625(Class69.anInt1475 + i, true);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, Class33_Sub2.anInt2036 + j);
			Class46.aClass33_Sub11_Sub1_989.method625(0x7fff & l >> 0xa5f1f0ae, true);
		}
		if(~k == -15 && Class45.method912(l, i, j, -120))
		{
			Class29.anInt595++;
			Class46.aClass33_Sub11_Sub1_989.method683(45, -1198);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, (l & 0x1fffc4e6) >> 0x2d86f02e);
			Class46.aClass33_Sub11_Sub1_989.method670(j - -Class33_Sub2.anInt2036, -128);
			Class46.aClass33_Sub11_Sub1_989.method670(Class80.anInt1728, -128);
			Class46.aClass33_Sub11_Sub1_989.method670(Class31.anInt699, -128);
			Class46.aClass33_Sub11_Sub1_989.method625(i - -Class69.anInt1475, true);
			Class46.aClass33_Sub11_Sub1_989.method663(Class33_Sub16.anInt2494, 768);
		}
		if(~k == -48)
		{
			entityToFollow = null;
			Class45.method912(l, i, j, -115);
			Class46.aClass33_Sub11_Sub1_989.method683(64, -1198);
			Class63.anInt1332++;
			Class46.aClass33_Sub11_Sub1_989.method673(-106, j - -Class33_Sub2.anInt2036);
			Class46.aClass33_Sub11_Sub1_989.method625(i + Class69.anInt1475, true);
			Class46.aClass33_Sub11_Sub1_989.method625((l & 0x1fffc83b) >> 0xf6e8306e, true);
		}
		if(~k == -2)
		{
			entityToFollow = null;
			Class33_Sub6_Sub3.anInt2706++;
			boolean flag6 = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 0, 2, 0, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			if(!flag6)
				flag6 = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 1, 2, 1, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			Class33_Sub6_Sub9.anInt2851 = 2;
			Class3.anInt112 = Class48.anInt1055;
			Class12.anInt242 = 0;
			Class33_Sub20.anInt2565 = Class82.anInt1794;
			Class46.aClass33_Sub11_Sub1_989.method683(146, -1198);
			Class46.aClass33_Sub11_Sub1_989.method625(l, true);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, Class69.anInt1475 + i);
			Class46.aClass33_Sub11_Sub1_989.method670(Class33_Sub2.anInt2036 + j, -128);
		}
		if(k == 33)
			if(Class33_Sub6_Sub4_Sub4.aBoolean3486)
				Class33_Sub2.aClass56_2035.method993(Class77_Sub2.anInt2645, i - 4, j + -4);
			else
				Class33_Sub2.aClass56_2035.method993(Class77_Sub2.anInt2645, -4 + Class82.anInt1794, -4 + Class48.anInt1055);
		if(k == 40)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(87, -1198);
			Class46.aClass33_Sub11_Sub1_989.method669(j, -30515);
			Class33.anInt724++;
			Class33_Sub15 class33_sub15_4 = Class49.method933(j, -120);
			if(class33_sub15_4.anIntArrayArray2411 != null && ~class33_sub15_4.anIntArrayArray2411[0][0] == -6)
			{
				int k2 = class33_sub15_4.anIntArrayArray2411[0][1];
				Class33_Sub5.anIntArray2120[k2] = 1 + -Class33_Sub5.anIntArray2120[k2];
				Class33_Sub12.method687(k2, true);
				Class74.aBoolean1579 = true;
			}
		}
		if(k == 46)
		{
			entityToFollow = null;
			boolean flag7 = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 0, 2, 0, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			if(!flag7)
				flag7 = Class33_Sub6_Sub4_Sub4.method350(false, i, false, 0, (byte)-102, 1, 2, 1, 0, 0, j, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
			Class33_Sub20.anInt2565 = Class82.anInt1794;
			Class12.anInt242 = 0;
			Class33_Sub6_Sub9.anInt2851 = 2;
			Class3.anInt112 = Class48.anInt1055;
			Class33_Sub6.anInt2123++;
			Class46.aClass33_Sub11_Sub1_989.method683(22, -1198);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, Class69.anInt1475 + i);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, l);
			Class46.aClass33_Sub11_Sub1_989.method625(Class33_Sub2.anInt2036 + j, true);
		}
		if(k == 49)
		{
			entityToFollow = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[l];
			if(entityToFollow != null)
			{
				Class48.anInt1052++;
				Class33_Sub6_Sub4_Sub4.method350(false, ((Class33_Sub6_Sub4_Sub5) (entityToFollow)).anIntArray3554[0], false, 0, (byte)-102, 1, 2, 1, 0, 0, ((Class33_Sub6_Sub4_Sub5) (entityToFollow)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				Class33_Sub20.anInt2565 = Class82.anInt1794;
				Class3.anInt112 = Class48.anInt1055;
				Class33_Sub6_Sub9.anInt2851 = 2;
				Class12.anInt242 = 0;
				Class46.aClass33_Sub11_Sub1_989.method683(170, -1198);
				Class46.aClass33_Sub11_Sub1_989.method670(l, -128);
				Class46.aClass33_Sub11_Sub1_989.method673(-110, Class33_Sub20.anInt2576);
				Class46.aClass33_Sub11_Sub1_989.method654(0x1bb12a8, Class26.anInt533);
			}
		}
		if(~anInt3590 != -1)
		{
			Class74.aBoolean1579 = true;
			anInt3590 = 0;
		}
		if(Class33_Sub15.aBoolean2470)
		{
			Class33_Sub10.method614(-103);
			Class74.aBoolean1579 = true;
		}
	}

	public static Class16 aClass16_3574 = new Class16(100);
	public int anInt3575;
	public double aDouble3576;
	public static Class58 aClass58_3577;
	public int anInt3578;
	public int anInt3579;
	public static int anInt3580 = 0;
	public static Class79 aClass79_3581;
	public double aDouble3582;
	public static int anInt3583;
	public static Class58 aClass58_3584;
	public int anInt3585;
	public int anInt3586;
	public static int anInt3587;
	public static Class58 aClass58_3588;
	public int anInt3589;
	public static int anInt3590 = 0;
	public static int anInt3591;
	public int anInt3592;
	public static Class58 aClass58_3593;
	public double aDouble3594;
	public static int anInt3595;
	public static int anIntArray3596[];
	public static int anInt3597;
	public static int anInt3598;
	public int anInt3599;
	public int anInt3600;
	public Class33_Sub6_Sub14 aClass33_Sub6_Sub14_3601;
	public static int anInt3602;
	public double aDouble3603;
	public static int anInt3604;
	public int anInt3605;
	public static Frame aFrame3606;
	public int anInt3607;
	public double aDouble3608;
	public static int anInt3609;
	public static Class58 aClass58_3610 = null;
	public static Class72 aClass72_3611;
	public boolean aBoolean3612;
	public double aDouble3613;
	public static int anInt3614;
	public int anInt3615;
	public int anInt3616;
	public double aDouble3617;
	public int anInt3618;
	public int anInt3619;
	public static int anInt3620 = -1;
	public double aDouble3621;
	public static int anInt3622;
	public static Class20 aClass20_3623;
	public static int anInt3624;
	public static Class58 aClass58_3625 = Class33_Sub6_Sub11.method535(112, "(Y");
	public static int anInt3626 = -1;

	static 
	{
		aClass58_3584 = Class33_Sub6_Sub11.method535(102, "Loading config )2 ");
		aClass58_3588 = aClass58_3584;
		aClass58_3593 = Class33_Sub6_Sub11.method535(112, "System update in: ");
		aClass58_3577 = aClass58_3593;
	}
}
