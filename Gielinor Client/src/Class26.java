// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class26.java

import java.awt.Image;

public class Class26
{

	public Class33_Sub8_Sub1 method201(int arg0, int arg1[], int arg2, int arg3)
	{
		try
		{
			anInt540++;
			if(arg0 != 15)
				aClass58_553 = null;
			int i = (arg3 >>> 0x56a46cac | arg3 << 0x84b938e4 & 0xfff8) ^ arg2;
			i |= arg3 << 0xbc2c8f90;
			long l = i;
			Class33_Sub8_Sub1 class33_sub8_sub1 = (Class33_Sub8_Sub1)aClass82_537.method1220(121, l);
			if(class33_sub8_sub1 != null)
				return class33_sub8_sub1;
			if(arg1 != null && arg1[0] <= 0)
				return null;
			Class61 class61 = Class61.method1077(aClass30_543, arg3, arg2);
			if(class61 == null)
				return null;
			class33_sub8_sub1 = class61.method1075();
			aClass82_537.method1218(class33_sub8_sub1, (byte)-97, l);
			if(arg1 != null)
				arg1[0] -= class33_sub8_sub1.aByteArray3194.length;
			return class33_sub8_sub1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hf.F(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static void method202(int arg0)
	{
		try
		{
			aClass58_553 = null;
			aClass58_534 = null;
			aClass58_538 = null;
			aClass74Array549 = null;
			if(arg0 != 120)
				aClass58_553 = null;
			aClass58_547 = null;
			aClass58_539 = null;
			aClass58_536 = null;
			anImage546 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hf.H(" + arg0 + ')');
		}
	}

	public Class33_Sub8_Sub1 method203(int arg0[], byte arg1, int arg2)
	{
		try
		{
			anInt531++;
			if(arg1 != 51)
				return null;
			if(~aClass30_532.method217(-111) == -2)
				return method207(arg0, true, arg2, 0);
			if(aClass30_532.method218(arg2, false) == 1)
				return method207(arg0, true, 0, arg2);
			else
				throw new RuntimeException();
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hf.A(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method204(byte arg0)
	{
		anInt548++;
		if(arg0 < 40)
			return;
		if(~Class69.anInt1464 == -2)
		{
			if(Class82.anInt1794 >= 6 && Class82.anInt1794 <= 106 && ~Class48.anInt1055 <= -468 && Class48.anInt1055 <= 499)
			{
				Class17.anInt350 = (Class17.anInt350 + 1) % 4;
				Class33_Sub6_Sub15.anInt3048++;
				Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
				Class15_Sub2.aBoolean1979 = true;
				Class46.aClass33_Sub11_Sub1_989.method683(120, -1198);
				Class46.aClass33_Sub11_Sub1_989.method640(Class17.anInt350, -11124);
				Class46.aClass33_Sub11_Sub1_989.method640(Class33.anInt727, -11124);
				Class46.aClass33_Sub11_Sub1_989.method640(Class33_Sub6_Sub12.anInt2974, -11124);
			}
			if(~Class82.anInt1794 <= -136 && ~Class82.anInt1794 >= -236 && Class48.anInt1055 >= 467 && ~Class48.anInt1055 >= -500)
			{
				Class33_Sub6_Sub15.anInt3048++;
				Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
				Class15_Sub2.aBoolean1979 = true;
				Class33.anInt727 = (Class33.anInt727 - -1) % 3;
				Class46.aClass33_Sub11_Sub1_989.method683(120, -1198);
				Class46.aClass33_Sub11_Sub1_989.method640(Class17.anInt350, -11124);
				Class46.aClass33_Sub11_Sub1_989.method640(Class33.anInt727, -11124);
				Class46.aClass33_Sub11_Sub1_989.method640(Class33_Sub6_Sub12.anInt2974, -11124);
			}
			if(Class82.anInt1794 >= 273 && Class82.anInt1794 <= 373 && ~Class48.anInt1055 <= -468 && ~Class48.anInt1055 >= -500)
			{
				Class33_Sub6_Sub15.anInt3048++;
				Class15_Sub2.aBoolean1979 = true;
				Class33_Sub6_Sub12.anInt2974 = (Class33_Sub6_Sub12.anInt2974 + 1) % 3;
				Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
				Class46.aClass33_Sub11_Sub1_989.method683(120, -1198);
				Class46.aClass33_Sub11_Sub1_989.method640(Class17.anInt350, -11124);
				Class46.aClass33_Sub11_Sub1_989.method640(Class33.anInt727, -11124);
				Class46.aClass33_Sub11_Sub1_989.method640(Class33_Sub6_Sub12.anInt2974, -11124);
			}
			if(~Class82.anInt1794 <= -413 && ~Class82.anInt1794 >= -513 && Class48.anInt1055 >= 467 && ~Class48.anInt1055 >= -500)
				if(Class33_Sub6_Sub14.anInt3013 != -1)
				{
					Class43.method904(0, 0, Class68.aClass58_1454, Class33_Sub13_Sub4.aClass58_3261);
					if(Class33_Sub6_Sub4_Sub5.aClass58_3573 != null)
					{
						Class43.method904(0, 0, Class33_Sub6_Sub4_Sub5.aClass58_3573, Class33_Sub13_Sub4.aClass58_3261);
						return;
					}
				} else
				{
					Class43.method900(true);
					if(Class39.anInt879 != -1)
					{
						Class3.aBoolean117 = false;
						Class33_Sub13_Sub4.aClass58_3294 = Class33_Sub13_Sub4.aClass58_3261;
						Class12.anInt227 = Class33_Sub6_Sub14.anInt3013 = Class39.anInt879;
					}
				}
		}
	}

	public Class33_Sub8_Sub1 method205(int arg0, int arg1, int arg2[])
	{
		try
		{
			anInt542++;
			if(~aClass30_543.method217(-100) == -2)
				return method201(arg1 ^ 0xf, arg2, arg0, 0);
			if(~aClass30_543.method218(arg0, false) == -2)
				return method201(arg1 ^ 0xf, arg2, 0, arg0);
			if(arg1 != 0)
				method208((byte)-99);
			throw new RuntimeException();
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hf.D(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static Class49 method206(int arg0)
	{
		try
		{
			anInt551++;
			try
			{
				if(arg0 < 37)
					method202(-97);
				return (Class49)Class.forName("Class49_Sub1").newInstance();
			}
			catch(Throwable _ex)
			{
				return null;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hf.E(" + arg0 + ')');
		}
	}

	public Class33_Sub8_Sub1 method207(int arg0[], boolean arg1, int arg2, int arg3)
	{
		try
		{
			anInt535++;
			int i = ((0x40000fff & arg3) << 0xda9d1e44 | arg3 >>> 0xc1ddcacc) ^ arg2;
			if(!arg1)
				aClass58_538 = null;
			i |= arg3 << 0xdd5e93d0;
			long l = (long)i ^ 0x100000000L;
			Class33_Sub8_Sub1 class33_sub8_sub1 = (Class33_Sub8_Sub1)aClass82_537.method1220(14, l);
			if(class33_sub8_sub1 != null)
				return class33_sub8_sub1;
			if(arg0 != null && arg0[0] <= 0)
				return null;
			Class52 class52 = Class52.method949(aClass30_532, arg3, arg2);
			if(class52 == null)
				return null;
			class33_sub8_sub1 = class52.method952();
			aClass82_537.method1218(class33_sub8_sub1, (byte)-84, l);
			if(arg0 != null)
				arg0[0] -= class33_sub8_sub1.aByteArray3194.length;
			return class33_sub8_sub1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hf.B(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static void method208(byte arg0)
	{
		try
		{
			Class33_Sub21.anInt2595 = 0;
			if(arg0 >= -61)
				method206(-30);
			anInt545++;
			for(int i = -1; ~(Class33_Sub6_Sub1.anInt2659 + Class31.anInt697) < ~i; i++)
			{
				Object obj;
				if(i == -1)
					obj = Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305;
				else
				if(i < Class31.anInt697)
					obj = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[Class33_Sub3.anIntArray2050[i]];
				else
					obj = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[Class80.anIntArray1730[-Class31.anInt697 + i]];
				if(obj == null || !((Class33_Sub6_Sub4_Sub5) (obj)).method366(true))
					continue;
				if(obj instanceof Class33_Sub6_Sub4_Sub5_Sub2)
				{
					Class33_Sub6_Sub16 class33_sub6_sub16 = ((Class33_Sub6_Sub4_Sub5_Sub2)obj).aClass33_Sub6_Sub16_3776;
					if(class33_sub6_sub16.anIntArray3071 != null)
						class33_sub6_sub16 = class33_sub6_sub16.method586(-42);
					if(class33_sub6_sub16 == null)
						continue;
				}
				if(Class31.anInt697 <= i)
				{
					Class33_Sub6_Sub16 class33_sub6_sub16_1 = ((Class33_Sub6_Sub4_Sub5_Sub2)obj).aClass33_Sub6_Sub16_3776;
					if(class33_sub6_sub16_1.anIntArray3071 != null)
						class33_sub6_sub16_1 = class33_sub6_sub16_1.method586(-49);
					if(class33_sub6_sub16_1.anInt3075 >= 0 && ~Class33_Sub6_Sub3.aClass33_Sub6_Sub7_Sub3Array2730.length < ~class33_sub6_sub16_1.anInt3075)
					{
						Class70.method1131(((Class33_Sub6_Sub4_Sub5) (obj)), 15 + ((Class33_Sub6_Sub4_Sub5) (obj)).anInt3512, 21395);
						if(Class37.anInt808 > -1)
							Class33_Sub6_Sub3.aClass33_Sub6_Sub7_Sub3Array2730[class33_sub6_sub16_1.anInt3075].method478(Class37.anInt808 + -12, -30 + Class33_Sub7.anInt2162);
					}
					if(~Class68.anInt1441 == -2 && Class59.anInt1275 == Class80.anIntArray1730[i - Class31.anInt697] && ~(Class33_Sub6_Sub6.anInt2785 % 20) > -11)
					{
						Class70.method1131(((Class33_Sub6_Sub4_Sub5) (obj)), 15 + ((Class33_Sub6_Sub4_Sub5) (obj)).anInt3512, 21395);
						if(Class37.anInt808 > -1)
							Class58.aClass33_Sub6_Sub7_Sub3Array1904[0].method478(-12 + Class37.anInt808, Class33_Sub7.anInt2162 - 28);
					}
				} else
				{
					Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1 = (Class33_Sub6_Sub4_Sub5_Sub1)obj;
					int k = 30;
					if(~class33_sub6_sub4_sub5_sub1.anInt3745 != 0 || class33_sub6_sub4_sub5_sub1.anInt3766 != -1)
					{
						Class70.method1131(((Class33_Sub6_Sub4_Sub5) (obj)), ((Class33_Sub6_Sub4_Sub5) (obj)).anInt3512 + 15, 21395);
						if(Class37.anInt808 > -1)
						{
							if(class33_sub6_sub4_sub5_sub1.anInt3745 != -1)
							{
								Class32.aClass33_Sub6_Sub7_Sub3Array707[class33_sub6_sub4_sub5_sub1.anInt3745].method478(-12 + Class37.anInt808, -k + Class33_Sub7.anInt2162);
								k += 25;
							}
							if(class33_sub6_sub4_sub5_sub1.anInt3766 != -1)
							{
								Class33_Sub6_Sub3.aClass33_Sub6_Sub7_Sub3Array2730[class33_sub6_sub4_sub5_sub1.anInt3766].method478(-12 + Class37.anInt808, -k + Class33_Sub7.anInt2162);
								k += 25;
							}
						}
					}
					if(i >= 0 && Class68.anInt1441 == 10 && ~Class33_Sub3.anIntArray2050[i] == ~Class77.anInt1652)
					{
						Class70.method1131(((Class33_Sub6_Sub4_Sub5) (obj)), 15 + ((Class33_Sub6_Sub4_Sub5) (obj)).anInt3512, 21395);
						if(~Class37.anInt808 < 0)
							Class58.aClass33_Sub6_Sub7_Sub3Array1904[1].method478(Class37.anInt808 - 12, Class33_Sub7.anInt2162 - k);
					}
				}
				if(((Class33_Sub6_Sub4_Sub5) (obj)).aClass58_3507 != null && (i >= Class31.anInt697 || ~Class17.anInt350 == -1 || Class17.anInt350 == 3 || ~Class17.anInt350 == -2 && Class33_Sub6_Sub4_Sub4.method356(true, ((Class33_Sub6_Sub4_Sub5_Sub1)obj).aClass58_3755)))
				{
					Class70.method1131(((Class33_Sub6_Sub4_Sub5) (obj)), ((Class33_Sub6_Sub4_Sub5) (obj)).anInt3512, 21395);
					if(Class37.anInt808 > -1 && Class33_Sub21.anInt2595 < Class46.anInt1009)
					{
						Class46.anIntArray1012[Class33_Sub21.anInt2595] = Class75.aClass33_Sub6_Sub7_Sub2_1632.method465(((Class33_Sub6_Sub4_Sub5) (obj)).aClass58_3507) / 2;
						Class46.anIntArray1015[Class33_Sub21.anInt2595] = Class75.aClass33_Sub6_Sub7_Sub2_1632.anInt3719;
						Class46.anIntArray990[Class33_Sub21.anInt2595] = Class37.anInt808;
						Class46.anIntArray1004[Class33_Sub21.anInt2595] = Class33_Sub7.anInt2162;
						Class46.anIntArray1008[Class33_Sub21.anInt2595] = ((Class33_Sub6_Sub4_Sub5) (obj)).anInt3562;
						Class46.anIntArray998[Class33_Sub21.anInt2595] = ((Class33_Sub6_Sub4_Sub5) (obj)).anInt3515;
						Class46.anIntArray996[Class33_Sub21.anInt2595] = ((Class33_Sub6_Sub4_Sub5) (obj)).anInt3551;
						Class46.aClass58Array1020[Class33_Sub21.anInt2595] = ((Class33_Sub6_Sub4_Sub5) (obj)).aClass58_3507;
						Class33_Sub21.anInt2595++;
					}
				}
				if(((Class33_Sub6_Sub4_Sub5) (obj)).anInt3540 > Class33_Sub6_Sub6.anInt2785)
				{
					Class70.method1131(((Class33_Sub6_Sub4_Sub5) (obj)), ((Class33_Sub6_Sub4_Sub5) (obj)).anInt3512 + 15, 21395);
					if(~Class37.anInt808 < 0)
					{
						int l = (((Class33_Sub6_Sub4_Sub5) (obj)).anInt3534 * 30) / ((Class33_Sub6_Sub4_Sub5) (obj)).anInt3495;
						if(l > 30)
							l = 30;
						Class33_Sub6_Sub7.method424(Class37.anInt808 + -15, -3 + Class33_Sub7.anInt2162, l, 5, 65280);
						Class33_Sub6_Sub7.method424(-15 + (Class37.anInt808 - -l), -3 + Class33_Sub7.anInt2162, -l + 30, 5, 0xff0000);
					}
				}
				for(int i1 = 0; ~i1 > -5; i1++)
					if(~Class33_Sub6_Sub6.anInt2785 > ~((Class33_Sub6_Sub4_Sub5) (obj)).anIntArray3530[i1])
					{
						Class70.method1131(((Class33_Sub6_Sub4_Sub5) (obj)), ((Class33_Sub6_Sub4_Sub5) (obj)).anInt3512 / 2, 21395);
						if(~Class37.anInt808 < 0)
						{
							if(i1 == 1)
								Class33_Sub7.anInt2162 -= 20;
							if(i1 == 2)
							{
								Class33_Sub7.anInt2162 -= 10;
								Class37.anInt808 -= 15;
							}
							if(~i1 == -4)
							{
								Class33_Sub7.anInt2162 -= 10;
								Class37.anInt808 += 15;
							}
							Class33_Sub3.aClass33_Sub6_Sub7_Sub3Array2049[((Class33_Sub6_Sub4_Sub5) (obj)).anIntArray3523[i1]].method478(Class37.anInt808 - 12, Class33_Sub7.anInt2162 - 12);
							Class33_Sub6_Sub1.aClass33_Sub6_Sub7_Sub2_2662.method459(Class37.method859(15591, ((Class33_Sub6_Sub4_Sub5) (obj)).anIntArray3503[i1]), Class37.anInt808 - 1, Class33_Sub7.anInt2162 - -3, 0xffffff, 0);
						}
					}

			}

			for(int j = 0; j < Class33_Sub21.anInt2595; j++)
			{
				int j1 = Class46.anIntArray990[j];
				int i2 = Class46.anIntArray1015[j];
				int k1 = Class46.anIntArray1004[j];
				int l1 = Class46.anIntArray1012[j];
				boolean flag = true;
				while(flag) 
				{
					flag = false;
					for(int j2 = 0; j2 < j; j2++)
						if(~(2 + k1) < ~(Class46.anIntArray1004[j2] + -Class46.anIntArray1015[j2]) && ~(2 + Class46.anIntArray1004[j2]) < ~(k1 + -i2) && -l1 + j1 < Class46.anIntArray1012[j2] + Class46.anIntArray990[j2] && ~(l1 + j1) < ~(Class46.anIntArray990[j2] - Class46.anIntArray1012[j2]) && -Class46.anIntArray1015[j2] + Class46.anIntArray1004[j2] < k1)
						{
							flag = true;
							k1 = Class46.anIntArray1004[j2] - Class46.anIntArray1015[j2];
						}

				}
				Class37.anInt808 = Class46.anIntArray990[j];
				Class33_Sub7.anInt2162 = Class46.anIntArray1004[j] = k1;
				Class58 class58 = Class46.aClass58Array1020[j];
				if(Class34.anInt1855 == 0)
				{
					int k2 = 0xffff00;
					if(~Class46.anIntArray1008[j] > -7)
						k2 = Class12.anIntArray237[Class46.anIntArray1008[j]];
					if(~Class46.anIntArray1008[j] == -7)
						k2 = Class82.anInt1789 % 20 >= 10 ? 0xffff00 : 0xff0000;
					if(Class46.anIntArray1008[j] == 7)
						k2 = ~(Class82.anInt1789 % 20) <= -11 ? 65535 : 255;
					if(Class46.anIntArray1008[j] == 8)
						k2 = Class82.anInt1789 % 20 >= 10 ? 0x80ff80 : 45056;
					if(~Class46.anIntArray1008[j] == -10)
					{
						int l2 = -Class46.anIntArray996[j] + 150;
						if(l2 < 50)
							k2 = 0xff0000 - -(1280 * l2);
						else
						if(~l2 <= -101)
						{
							if(~l2 > -151)
								k2 = (l2 - 100) * 5 + 65280;
						} else
						{
							k2 = 0xffff00 - (0xff060000 + 0x50000 * l2);
						}
					}
					if(~Class46.anIntArray1008[j] == -11)
					{
						int i3 = 150 - Class46.anIntArray996[j];
						if(~i3 > -51)
							k2 = 0xff0000 + i3 * 5;
						else
						if(i3 < 100)
							k2 = -(i3 * 0x50000) + 0x1f900ff;
						else
						if(~i3 > -151)
							k2 = (-(5 * (i3 - 100)) + 0xfe0c00ff) - -(i3 * 0x50000);
					}
					if(~Class46.anIntArray1008[j] == -12)
					{
						int j3 = -Class46.anIntArray996[j] + 150;
						if(~j3 > -51)
							k2 = -(j3 * 0x50005) + 0xffffff;
						else
						if(~j3 > -101)
							k2 = 65280 + (j3 * 0x50005 + 0xff05ff06);
						else
						if(j3 < 150)
							k2 = -((-100 + j3) * 0x50000) + 0xffffff;
					}
					if(Class46.anIntArray998[j] == 0)
						Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(class58, Class37.anInt808, Class33_Sub7.anInt2162, k2, 0);
					if(~Class46.anIntArray998[j] == -2)
						Class75.aClass33_Sub6_Sub7_Sub2_1632.method458(class58, Class37.anInt808, Class33_Sub7.anInt2162, k2, 0, Class82.anInt1789);
					if(Class46.anIntArray998[j] == 2)
						Class75.aClass33_Sub6_Sub7_Sub2_1632.method448(class58, Class37.anInt808, Class33_Sub7.anInt2162, k2, 0, Class82.anInt1789);
					if(Class46.anIntArray998[j] == 3)
						Class75.aClass33_Sub6_Sub7_Sub2_1632.method466(class58, Class37.anInt808, Class33_Sub7.anInt2162, k2, 0, Class82.anInt1789, 150 + -Class46.anIntArray996[j]);
					if(~Class46.anIntArray998[j] == -5)
					{
						int k3 = Class75.aClass33_Sub6_Sub7_Sub2_1632.method465(class58);
						int i4 = ((150 - Class46.anIntArray996[j]) * (k3 - -100)) / 150;
						Class33_Sub6_Sub7.method422(-50 + Class37.anInt808, 0, Class37.anInt808 - -50, 334);
						Class75.aClass33_Sub6_Sub7_Sub2_1632.method464(class58, -i4 + Class37.anInt808 + 50, Class33_Sub7.anInt2162, k2, 0);
						Class33_Sub6_Sub7.method427();
					}
					if(~Class46.anIntArray998[j] == -6)
					{
						int l3 = -Class46.anIntArray996[j] + 150;
						int j4 = 0;
						if(l3 < 25)
							j4 = l3 - 25;
						else
						if(~l3 < -126)
							j4 = -125 + l3;
						Class33_Sub6_Sub7.method422(0, -1 + (Class33_Sub7.anInt2162 + -Class75.aClass33_Sub6_Sub7_Sub2_1632.anInt3719), 512, 5 + Class33_Sub7.anInt2162);
						Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(class58, Class37.anInt808, j4 + Class33_Sub7.anInt2162, k2, 0);
						Class33_Sub6_Sub7.method427();
					}
				} else
				{
					Class75.aClass33_Sub6_Sub7_Sub2_1632.method459(class58, Class37.anInt808, Class33_Sub7.anInt2162, 0xffff00, 0);
				}
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hf.G(" + arg0 + ')');
		}
	}

	public Class26(Class30 arg0, Class30 arg1)
	{
		aClass82_537 = new Class82(256);
		try
		{
			aClass30_532 = arg1;
			aClass30_543 = arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hf.<init>(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt531;
	public Class30 aClass30_532;
	public static int anInt533;
	public static Class58 aClass58_534;
	public static int anInt535;
	public static Class58 aClass58_536 = Class33_Sub6_Sub11.method535(125, "Regelversto-8 melden");
	public Class82 aClass82_537;
	public static Class58 aClass58_538 = Class33_Sub6_Sub11.method535(116, "sl_stars");
	public static Class58 aClass58_539;
	public static int anInt540;
	public static int anInt541;
	public static int anInt542;
	public Class30 aClass30_543;
	public static int anInt544;
	public static int anInt545;
	public static Image anImage546;
	public static Class58 aClass58_547 = Class33_Sub6_Sub11.method535(126, " steht bereits auf Ihrer Ignorieren)2Liste(Q");
	public static int anInt548;
	public static Class74 aClass74Array549[] = new Class74[50];
	public static int anInt550;
	public static int anInt551;
	public static boolean aBoolean552 = false;
	public static Class58 aClass58_553 = Class33_Sub6_Sub11.method535(110, "<col=ffffff> )4 ");

	static 
	{
		aClass58_534 = Class33_Sub6_Sub11.method535(113, "RuneScape is loading )2 please wait)3)3)3");
		aClass58_539 = aClass58_534;
	}
}
