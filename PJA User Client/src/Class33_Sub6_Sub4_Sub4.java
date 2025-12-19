// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub4_Sub4.java


public class Class33_Sub6_Sub4_Sub4 extends Class33_Sub6_Sub4
{

	public void method349(int arg0, int arg1)
	{
		anInt3461++;
		if(aBoolean3479)
			return;
		for(anInt3492 += arg1; anInt3492 > aClass33_Sub6_Sub14_3475.anIntArray3031[anInt3470];)
		{
			anInt3492 -= aClass33_Sub6_Sub14_3475.anIntArray3031[anInt3470];
			anInt3470++;
			if(~anInt3470 <= ~aClass33_Sub6_Sub14_3475.anIntArray3009.length)
			{
				aBoolean3479 = true;
				break;
			}
		}

		if(arg0 < 72)
			method351(-80, false, 79, (byte)35, 100, null, 66);
	}

	public static boolean method350(boolean rangeCheck, int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, int arg11)
	{
		try
		{
			for(int i = 0; i < 104; i++)
			{
				for(int j = 0; j < 104; j++)
				{
					RuntimeException_Sub1.anIntArrayArray1820[i][j] = 0;
					Class33_Sub9.anIntArrayArray2184[i][j] = 0x5f5e0ff;
				}

			}

			RuntimeException_Sub1.anIntArrayArray1820[arg10][arg11] = 99;
			Class33_Sub9.anIntArrayArray2184[arg10][arg11] = 0;
			if(arg3 != -102)
				aClass58_3481 = null;
			int k = arg10;
			anInt3467++;
			int l = arg11;
			int i1 = 0;
			Class66.anIntArray1422[i1] = arg10;
			int j1 = 0;
			boolean flag = false;
			Class38.anIntArray851[i1++] = arg11;
			int k1 = Class66.anIntArray1422.length;
			int ai[][] = Class51.aClass70Array1098[Class77_Sub2.anInt2645].anIntArrayArray1499;
			while(i1 != j1) {
				if(rangeCheck) {
					if(client.withinRange(arg0, arg9, arg10, arg11, client.fromDistance - 1)) {
						flag = true;
						break;
					}
				}
				l = Class38.anIntArray851[j1];
				k = Class66.anIntArray1422[j1];
				j1 = (1 + j1) % k1;
				if(arg0 == k && ~arg9 == ~l)
				{
					flag = true;
					break;
				}
				if(~arg2 != -1)
					if(arg2 >= 5 && ~arg2 != -11 || !Class51.aClass70Array1098[Class77_Sub2.anInt2645].method1128(arg0, true, k, arg9, l, -1 + arg2, arg7))
					{
						if(~arg2 > -11 && Class51.aClass70Array1098[Class77_Sub2.anInt2645].method1123(arg9, arg7, (byte)108, l, k, arg0, arg2 - 1))
						{
							flag = true;
							break;
						}
					} else
					{
						flag = true;
						break;
					}
				if(~arg6 != -1 && arg4 != 0 && Class51.aClass70Array1098[Class77_Sub2.anInt2645].method1125(arg8, arg6, k, -1, arg4, l, arg0, arg9))
				{
					flag = true;
					break;
				}
				int i2 = 1 + Class33_Sub9.anIntArrayArray2184[k][l];
				if(k > 0 && RuntimeException_Sub1.anIntArrayArray1820[-1 + k][l] == 0 && (0x12c0108 & ai[k + -1][l]) == 0)
				{
					Class66.anIntArray1422[i1] = k + -1;
					Class38.anIntArray851[i1] = l;
					i1 = (i1 - -1) % k1;
					RuntimeException_Sub1.anIntArrayArray1820[-1 + k][l] = 2;
					Class33_Sub9.anIntArrayArray2184[k + -1][l] = i2;
				}
				if(k < 103 && RuntimeException_Sub1.anIntArrayArray1820[k - -1][l] == 0 && (0x12c0180 & ai[k + 1][l]) == 0)
				{
					Class66.anIntArray1422[i1] = 1 + k;
					Class38.anIntArray851[i1] = l;
					RuntimeException_Sub1.anIntArrayArray1820[k + 1][l] = 8;
					i1 = (i1 + 1) % k1;
					Class33_Sub9.anIntArrayArray2184[k + 1][l] = i2;
				}
				if(~l < -1 && ~RuntimeException_Sub1.anIntArrayArray1820[k][l - 1] == -1 && ~(ai[k][l + -1] & 0x12c0102) == -1)
				{
					Class66.anIntArray1422[i1] = k;
					Class38.anIntArray851[i1] = -1 + l;
					i1 = (1 + i1) % k1;
					RuntimeException_Sub1.anIntArrayArray1820[k][l + -1] = 1;
					Class33_Sub9.anIntArrayArray2184[k][l - 1] = i2;
				}
				if(l < 103 && RuntimeException_Sub1.anIntArrayArray1820[k][1 + l] == 0 && ~(ai[k][1 + l] & 0x12c0120) == -1)
				{
					Class66.anIntArray1422[i1] = k;
					Class38.anIntArray851[i1] = l + 1;
					i1 = (i1 - -1) % k1;
					RuntimeException_Sub1.anIntArrayArray1820[k][l - -1] = 4;
					Class33_Sub9.anIntArrayArray2184[k][l - -1] = i2;
				}
				if(~k < -1 && ~l < -1 && RuntimeException_Sub1.anIntArrayArray1820[-1 + k][-1 + l] == 0 && (0x12c010e & ai[-1 + k][l - 1]) == 0 && (0x12c0108 & ai[k + -1][l]) == 0 && (0x12c0102 & ai[k][-1 + l]) == 0)
				{
					Class66.anIntArray1422[i1] = k + -1;
					Class38.anIntArray851[i1] = -1 + l;
					i1 = (1 + i1) % k1;
					RuntimeException_Sub1.anIntArrayArray1820[-1 + k][l - 1] = 3;
					Class33_Sub9.anIntArrayArray2184[k + -1][-1 + l] = i2;
				}
				if(k < 103 && l > 0 && ~RuntimeException_Sub1.anIntArrayArray1820[k + 1][-1 + l] == -1 && ~(ai[1 + k][l + -1] & 0x12c0183) == -1 && (0x12c0180 & ai[1 + k][l]) == 0 && ~(ai[k][l - 1] & 0x12c0102) == -1)
				{
					Class66.anIntArray1422[i1] = k + 1;
					Class38.anIntArray851[i1] = l + -1;
					i1 = (1 + i1) % k1;
					RuntimeException_Sub1.anIntArrayArray1820[k - -1][-1 + l] = 9;
					Class33_Sub9.anIntArrayArray2184[k - -1][-1 + l] = i2;
				}
				if(k > 0 && ~l > -104 && RuntimeException_Sub1.anIntArrayArray1820[k - 1][1 + l] == 0 && (ai[-1 + k][1 + l] & 0x12c0138) == 0 && (ai[k + -1][l] & 0x12c0108) == 0 && ~(ai[k][l - -1] & 0x12c0120) == -1)
				{
					Class66.anIntArray1422[i1] = -1 + k;
					Class38.anIntArray851[i1] = l + 1;
					RuntimeException_Sub1.anIntArrayArray1820[-1 + k][1 + l] = 6;
					Class33_Sub9.anIntArrayArray2184[k - 1][1 + l] = i2;
					i1 = (1 + i1) % k1;
				}
				if(k < 103 && l < 103 && RuntimeException_Sub1.anIntArrayArray1820[1 + k][l + 1] == 0 && (0x12c01e0 & ai[k - -1][1 + l]) == 0 && ~(ai[1 + k][l] & 0x12c0180) == -1 && (ai[k][l + 1] & 0x12c0120) == 0)
				{
					Class66.anIntArray1422[i1] = 1 + k;
					Class38.anIntArray851[i1] = 1 + l;
					RuntimeException_Sub1.anIntArrayArray1820[k - -1][l - -1] = 12;
					Class33_Sub9.anIntArrayArray2184[k - -1][1 + l] = i2;
					i1 = (1 + i1) % k1;
				}
			}
			Class59.anInt1264 = 0;
			if(!flag)
				if(arg1)
				{
					int j2 = 1000;
					byte byte0 = 10;
					int l2 = 100;
					for(int k3 = -byte0 + arg0; k3 <= arg0 + byte0; k3++)
					{
						for(int i4 = arg9 + -byte0; ~i4 >= ~(byte0 + arg9); i4++)
							if(k3 >= 0 && i4 >= 0 && k3 < 104 && ~i4 > -105 && ~Class33_Sub9.anIntArrayArray2184[k3][i4] > -101)
							{
								int k4 = 0;
								if(k3 < arg0)
									k4 = arg0 - k3;
								else
								if(~k3 < ~(arg0 + (arg6 + -1)))
									k4 = (1 - arg0) + (-arg6 + k3);
								int l4 = 0;
								if(i4 < arg9)
									l4 = arg9 - i4;
								else
								if(i4 > arg9 + (arg4 + -1))
									l4 = (-arg9 - arg4 - -1) + i4;
								int i5 = l4 * l4 + k4 * k4;
								if(~j2 < ~i5 || ~j2 == ~i5 && ~l2 < ~Class33_Sub9.anIntArrayArray2184[k3][i4])
								{
									k = k3;
									l2 = Class33_Sub9.anIntArrayArray2184[k3][i4];
									l = i4;
									j2 = i5;
								}
							}

					}

					if(~j2 == -1001)
						return false;
					if(arg10 == k && l == arg11)
						return false;
					Class59.anInt1264 = 1;
				} else
				{
					return false;
				}
			j1 = 0;
			Class66.anIntArray1422[j1] = k;
			Class38.anIntArray851[j1++] = l;
			int i3;
			for(int k2 = i3 = RuntimeException_Sub1.anIntArrayArray1820[k][l]; k != arg10 || arg11 != l; k2 = RuntimeException_Sub1.anIntArrayArray1820[k][l])
			{
				if(~i3 != ~k2)
				{
					Class66.anIntArray1422[j1] = k;
					i3 = k2;
					Class38.anIntArray851[j1++] = l;
				}
				if((1 & k2) == 0)
				{
					if((4 & k2) != 0)
						l--;
				} else
				{
					l++;
				}
				if(~(2 & k2) == -1)
				{
					if(~(8 & k2) != -1)
						k--;
				} else
				{
					k++;
				}
			}

			if(~j1 < -1)
			{
				int l1 = j1;
				if(~l1 < -26)
					l1 = 25;
				j1--;
				int j3 = Class66.anIntArray1422[j1];
				int l3 = Class38.anIntArray851[j1];
				if(~arg5 == -1)
				{
					Class33_Sub6_Sub4_Sub6.entityToFollow = null;
					Class33_Sub11_Sub1.anInt3213++;
					Class46.aClass33_Sub11_Sub1_989.method683(25, -1198);
					Class46.aClass33_Sub11_Sub1_989.method640(3 + (l1 + l1), arg3 + -11022);
				}
				if(~arg5 == -2)
				{
					Class33_Sub6_Sub4_Sub6.entityToFollow = null;
					Class55.anInt1162++;
					Class46.aClass33_Sub11_Sub1_989.method683(191, -1198);
					Class46.aClass33_Sub11_Sub1_989.method640(14 + (l1 - (-l1 - 3)), -11124);
				}
				if(arg5 == 2)
				{
					anInt3468++;
					Class46.aClass33_Sub11_Sub1_989.method683(186, -1198);
					Class46.aClass33_Sub11_Sub1_989.method640(3 + (l1 + l1), -11124);
				}
				Class46.aClass33_Sub11_Sub1_989.method670(j3 - -Class69.anInt1475, -128);
				Class46.aClass33_Sub11_Sub1_989.method640(Class33_Sub21.aBooleanArray2603[82] ? 1 : 0, arg3 ^ 0x2b16);
				if(Class33_Sub6_Sub4_Sub6.entityToFollow == null) {
					Class44.anInt964 = Class66.anIntArray1422[0];
					Class20.anInt387 = Class38.anIntArray851[0];
				}
				for(int j4 = 1; l1 > j4; j4++)
				{
					j1--;
					Class46.aClass33_Sub11_Sub1_989.method652(Class66.anIntArray1422[j1] + -j3, -4);
					Class46.aClass33_Sub11_Sub1_989.method622(123, -l3 + Class38.anIntArray851[j1]);
				}

				Class46.aClass33_Sub11_Sub1_989.method625(l3 + Class33_Sub2.anInt2036, true);
				return true;
			}
			return arg5 != 1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "le.F(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub3 method319(int arg0)
	{
		try
		{
			Class33_Sub6_Sub9 class33_sub6_sub9 = Class63.method1083((byte)51, anInt3488);
			anInt3471++;
			if(arg0 != -6941)
				return null;
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3;
			if(!aBoolean3479)
				class33_sub6_sub4_sub3 = class33_sub6_sub9.method518(anInt3470, false);
			else
				class33_sub6_sub4_sub3 = class33_sub6_sub9.method518(-1, false);
			if(class33_sub6_sub4_sub3 == null)
				return null;
			else
				return class33_sub6_sub4_sub3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "le.B(" + arg0 + ')');
		}
	}

	public static void method351(int arg0, boolean arg1, int arg2, byte arg3, int arg4, Class30_Sub1 arg5, int arg6)
	{
		try
		{
			anInt3459++;
			long l = arg0 + (arg6 << 0x8769ae90);
			Class33_Sub6_Sub2 class33_sub6_sub2 = (Class33_Sub6_Sub2)Class34.aClass82_1838.method1220(107, l);
			if(class33_sub6_sub2 != null)
				return;
			class33_sub6_sub2 = (Class33_Sub6_Sub2)Class23.aClass82_429.method1220(arg4 ^ 0x46e5, l);
			if(class33_sub6_sub2 != null)
				return;
			class33_sub6_sub2 = (Class33_Sub6_Sub2)Class33_Sub12.aClass82_2324.method1220(11, l);
			if(class33_sub6_sub2 != null)
			{
				if(arg1)
				{
					class33_sub6_sub2.method289(arg4 ^ 0xffffb901);
					Class34.aClass82_1838.method1218(class33_sub6_sub2, (byte)-121, l);
					Class33_Sub7.anInt2143++;
					Class33_Sub6_Sub4_Sub5_Sub2.anInt3779--;
				}
				return;
			}
			if(!arg1)
			{
				class33_sub6_sub2 = (Class33_Sub6_Sub2)Class19.aClass82_361.method1220(73, l);
				if(class33_sub6_sub2 != null)
					return;
			}
			class33_sub6_sub2 = new Class33_Sub6_Sub2();
			if(arg4 != 18058)
				return;
			class33_sub6_sub2.anInt2684 = arg2;
			class33_sub6_sub2.aByte2685 = arg3;
			class33_sub6_sub2.aClass30_Sub1_2688 = arg5;
			if(arg1)
			{
				Class34.aClass82_1838.method1218(class33_sub6_sub2, (byte)-121, l);
				Class33_Sub7.anInt2143++;
				return;
			} else
			{
				Class80.aClass39_1727.method881(true, class33_sub6_sub2);
				Class33_Sub12.aClass82_2324.method1218(class33_sub6_sub2, (byte)97, l);
				Class33_Sub6_Sub4_Sub5_Sub2.anInt3779++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "le.I(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? "null" : "{...}") + ',' + arg6 + ')');
		}
	}

	public static void method352(int arg0)
	{
		aClass58_3484 = null;
		aClass58_3469 = null;
		aClass58_3457 = null;
		aClass58_3477 = null;
		aClass58_3480 = null;
		aLongArray3466 = null;
		aClass58_3464 = null;
		aClass58_3481 = null;
		aClass58_3485 = null;
		aClass58_3476 = null;
		aClass58_3482 = null;
		aClass58_3474 = null;
		aClass58_3490 = null;
		if(arg0 != 0)
			aClass58_3469 = null;
	}

	public static void method353(int arg0)
	{
		try
		{
			Class44.aClass16_954.method147((byte)-54);
			Class33_Sub6_Sub4_Sub5_Sub2.aClass16_3780.method147((byte)-54);
			anInt3460++;
			Class22.aClass16_410.method147((byte)-54);
			Class33_Sub6_Sub5.aClass16_2766.method147((byte)-54);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "le.J(" + arg0 + ')');
		}
	}

	public static int method354(int arg0, Class30 arg1, Class30 arg2)
	{
		try
		{
			int i = 0;
			if(arg0 < 73)
				return 21;
			anInt3465++;
			if(arg1.method232(Class63.aClass58_1346, -31245, Class46.aClass58_1026))
				i++;
			if(arg2.method232(Class63.aClass58_1346, -31245, Class21.aClass58_403))
				i++;
			if(arg2.method232(Class63.aClass58_1346, -31245, Class21.aClass58_392))
				i++;
			if(arg2.method232(Class63.aClass58_1346, -31245, Class33_Sub3.aClass58_2051))
				i++;
			if(arg2.method232(Class63.aClass58_1346, -31245, Class36.aClass58_791))
				i++;
			if(arg2.method232(Class63.aClass58_1346, -31245, Class33_Sub7.aClass58_2136))
				i++;
			arg2.method232(Class63.aClass58_1346, -31245, Class27.aClass58_558);
			arg2.method232(Class63.aClass58_1346, -31245, Class11.aClass58_200);
			arg2.method232(Class63.aClass58_1346, -31245, Applet_Sub1.aClass58_17);
			arg2.method232(Class63.aClass58_1346, -31245, Class26.aClass58_538);
			arg2.method232(Class63.aClass58_1346, -31245, Class34.aClass58_1840);
			return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "le.D(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method355(int arg0, int arg1, byte arg2, int arg3, int arg4)
	{
		try
		{
			if(arg2 < 70)
				aClass58_3482 = null;
			for(int i = arg4; ~(arg3 + arg4) <= ~i; i++)
			{
				for(int j = arg0; ~(arg1 + arg0) <= ~j; j++)
					if(j >= 0 && j < 104 && ~i <= -1 && ~i > -105)
					{
						Class12.aByteArrayArrayArray239[0][j][i] = 127;
						if(j == arg0 && ~j < -1)
							Class30.anIntArrayArrayArray645[0][j][i] = Class30.anIntArrayArrayArray645[0][-1 + j][i];
						if(~j == ~(arg1 + arg0) && ~j > -104)
							Class30.anIntArrayArrayArray645[0][j][i] = Class30.anIntArrayArrayArray645[0][1 + j][i];
						if(~i == ~arg4 && ~i < -1)
							Class30.anIntArrayArrayArray645[0][j][i] = Class30.anIntArrayArrayArray645[0][j][-1 + i];
						if(~i == ~(arg4 - -arg3) && ~i > -104)
							Class30.anIntArrayArrayArray645[0][j][i] = Class30.anIntArrayArrayArray645[0][j][1 + i];
					}

			}

			anInt3493++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "le.H(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public static boolean method356(boolean arg0, Class58 arg1)
	{
		try
		{
			anInt3491++;
			if(arg1 == null)
				return false;
			for(int i = 0; ~Class33_Sub6_Sub12.anInt2979 < ~i; i++)
				if(arg1.method1059(-1, Class32.aClass58Array711[i]))
					return true;

			return arg1.method1059(-1, Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.aClass58_3755);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "le.G(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method357(int arg0)
	{
		anInt3487++;
		Class33_Sub3.aBoolean2058 = false;
		Class56.aBoolean1188 = false;
		if(arg0 < 112)
			aClass58_3469 = null;
	}

	public Class33_Sub6_Sub4_Sub4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		anInt3470 = 0;
		aBoolean3479 = false;
		anInt3492 = 0;
		try
		{
			anInt3483 = arg4;
			anInt3488 = arg0;
			anInt3458 = arg2;
			anInt3463 = arg1;
			anInt3478 = arg5 + arg6;
			anInt3462 = arg3;
			int i = Class63.method1083((byte)51, anInt3488).anInt2849;
			if(~i == 0)
			{
				aBoolean3479 = true;
				return;
			} else
			{
				aBoolean3479 = false;
				aClass33_Sub6_Sub14_3475 = Class33_Sub21.method830(i, -81);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "le.<init>(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public static Class58 aClass58_3457;
	public int anInt3458;
	public static int anInt3459;
	public static int anInt3460;
	public static int anInt3461;
	public int anInt3462;
	public int anInt3463;
	public static Class58 aClass58_3464;
	public static int anInt3465;
	public static long aLongArray3466[] = new long[32];
	public static int anInt3467;
	public static int anInt3468;
	public static Class58 aClass58_3469;
	public int anInt3470;
	public static int anInt3471;
	public static int anInt3472;
	public static int anInt3473 = 0;
	public static Class58 aClass58_3474;
	public Class33_Sub6_Sub14 aClass33_Sub6_Sub14_3475;
	public static Class58 aClass58_3476 = Class33_Sub6_Sub11.method535(120, "jolt");
	public static Class58 aClass58_3477 = Class33_Sub6_Sub11.method535(105, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");
	public int anInt3478;
	public boolean aBoolean3479;
	public static Class58 aClass58_3480 = Class33_Sub6_Sub11.method535(122, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");
	public static Class58 aClass58_3481 = Class33_Sub6_Sub11.method535(98, "mapmarker");
	public static Class58 aClass58_3482;
	public int anInt3483;
	public static Class58 aClass58_3484;
	public static Class58 aClass58_3485;
	public static boolean aBoolean3486 = false;
	public static int anInt3487;
	public int anInt3488;
	public static int anInt3489 = 0x4d4233;
	public static Class58 aClass58_3490;
	public static int anInt3491;
	public int anInt3492;
	public static int anInt3493;

	static 
	{
		aClass58_3464 = Class33_Sub6_Sub11.method535(120, "green:");
		aClass58_3457 = aClass58_3464;
		aClass58_3484 = Class33_Sub6_Sub11.method535(113, "flash2:");
		aClass58_3482 = aClass58_3484;
		aClass58_3469 = Class33_Sub6_Sub11.method535(111, "Please check your message)2centre for details)3");
		aClass58_3490 = aClass58_3484;
		aClass58_3485 = aClass58_3469;
		aClass58_3474 = aClass58_3464;
	}
}
