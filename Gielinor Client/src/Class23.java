// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class23.java


public class Class23
{

	public static Class58 method182(int arg0, byte arg1)
	{
		try
		{
			anInt428++;
			Class58 class58 = Class37.method859(15591, arg0);
			for(int i = class58.method1035(27) - 3; i > 0; i -= 3)
				class58 = Class35.method846((byte)-83, new Class58[] {
					class58.method1063(0, (byte)126, i), Class30_Sub1.aClass58_2014, class58.method1028(i, (byte)120)
				});

			if(arg1 >= -108)
				method186(-124, -100);
			if(~class58.method1035(27) < -10)
				return Class35.method846((byte)-83, new Class58[] {
					Class59.aClass58_1263, class58.method1063(0, (byte)120, -8 + class58.method1035(27)), Class58.aClass58_1903, Class62.aClass58_1299, class58, Class33_Sub11_Sub1.aClass58_3210
				});
			if(class58.method1035(27) > 6)
				return Class35.method846((byte)-83, new Class58[] {
					Class37.aClass58_836, class58.method1063(0, (byte)122, -4 + class58.method1035(27)), Class33_Sub4.aClass58_2081, Class62.aClass58_1299, class58, Class33_Sub11_Sub1.aClass58_3210
				});
			else
				return Class35.method846((byte)-83, new Class58[] {
					Class55.aClass58_1173, class58, Class69.aClass58_1478
				});
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "gf.G(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method183(byte arg0, int arg1, int arg2, int arg3, int arg4, Class33_Sub15 arg5, int arg6, int arg7, 
			int arg8)
	{
		if(arg0 <= 121)
			aClass58_466 = null;
		if(!Class33_Sub6_Sub17.aBoolean3175)
			Class14.anInt278 = 0;
		else
			Class14.anInt278 = 32;
		Class33_Sub6_Sub17.aBoolean3175 = false;
		anInt426++;
		if(arg2 > arg4 || ~(arg2 - -16) >= ~arg4 || ~arg1 < ~arg3 || arg3 >= 16 + arg1)
		{
			if(arg4 < arg2 || ~arg4 <= ~(arg2 + 16) || ~arg3 > ~(arg6 + arg1 + -16) || ~arg3 <= ~(arg6 + arg1))
			{
				if(-Class14.anInt278 + arg2 <= arg4 && (16 + arg2) - -Class14.anInt278 > arg4 && arg3 >= arg1 - -16 && arg6 + arg1 + -16 > arg3 && Class60.anInt1277 > 0)
				{
					Class33_Sub6_Sub17.aBoolean3175 = true;
					if(arg7 == 2 || ~arg7 == -4)
						Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
					if(arg7 == 1)
						Class74.aBoolean1579 = true;
					int i = ((arg6 + -32) * arg6) / arg8;
					if(~i > -9)
						i = 8;
					int k = -(i / 2) + ((-arg1 + arg3) - 16);
					int l = arg6 + (-32 - i);
					arg5.anInt2353 = (k * (-arg6 + arg8)) / l;
				}
			} else
			{
				if(~arg7 == -3 || arg7 == 3)
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
				if(~arg7 == -2)
					Class74.aBoolean1579 = true;
				arg5.anInt2353 += Class60.anInt1277 * 4;
			}
		} else
		{
			if(arg7 == 2 || arg7 == 3)
				Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
			arg5.anInt2353 -= Class60.anInt1277 * 4;
			if(~arg7 == -2)
				Class74.aBoolean1579 = true;
		}
		if(~Class33_Sub6_Sub5.anInt2767 != -1)
		{
			int j = arg5.anInt2462;
			if(~arg7 == 0)
				j = 479;
			if(~arg4 <= ~(arg2 - j) && arg3 >= arg1 && ~arg4 > ~(arg2 + 16) && arg6 + arg1 >= arg3)
			{
				if(~arg7 == -3 || arg7 == 3)
					Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
				if(arg7 == 1)
					Class74.aBoolean1579 = true;
				arg5.anInt2353 += Class33_Sub6_Sub5.anInt2767 * 45;
			}
		}
	}

	public static Class58 method184(boolean arg0, byte arg1, int arg2, int arg3)
	{
		try
		{
			if(~arg2 > -2 || arg2 > 36)
				arg2 = 10;
			anInt477++;
			int j = arg3 / arg2;
			int i;
			for(i = 1; ~j != -1; i++)
				j /= arg2;

			int k = i;
			int l = -105 % ((arg1 - -51) / 58);
			if(arg3 < 0 || arg0)
				k++;
			byte abyte0[] = new byte[k];
			if(arg3 < 0)
				abyte0[0] = 45;
			else
			if(arg0)
				abyte0[0] = 43;
			for(int i1 = 0; ~i1 > ~i; i1++)
			{
				int j1 = arg3 % arg2;
				arg3 /= arg2;
				if(~j1 > -1)
					j1 = -j1;
				if(~j1 < -10)
					j1 += 39;
				abyte0[k + (-i1 + -1)] = (byte)(j1 + 48);
			}

			Class58 class58 = new Class58();
			class58.anInt1893 = k;
			class58.aByteArray1894 = abyte0;
			return class58;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "gf.D(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static void method185(int arg0)
	{
		try
		{
			aClass58_455 = null;
			aClass58_470 = null;
			aClass58_443 = null;
			aClass58_463 = null;
			aClass58_453 = null;
			aClass58_473 = null;
			aClass58_458 = null;
			aClass82_429 = null;
			aClass58_478 = null;
			aClass58_456 = null;
			aClass58_433 = null;
			aClass58_440 = null;
			aClass58_467 = null;
			aClass58_468 = null;
			aClass58_480 = null;
			anIntArrayArray472 = null;
			aClass58_464 = null;
			aClass58_461 = null;
			if(arg0 != -30303)
			{
				return;
			} else
			{
				aClass58_448 = null;
				aClass58_452 = null;
				aClass58_490 = null;
				aClass58_489 = null;
				aClass58_442 = null;
				aClass58_471 = null;
				aClass58_484 = null;
				aClass58_435 = null;
				aClass58_451 = null;
				aClass58_466 = null;
				aClass58_436 = null;
				aClass58_439 = null;
				aClass58_482 = null;
				aClass58_445 = null;
				aClass58_449 = null;
				aClass58_481 = null;
				aClass58_434 = null;
				aClass58_457 = null;
				aClass58_475 = null;
				aClass58_469 = null;
				aClass58_487 = null;
				aClass58_486 = null;
				aClass58_437 = null;
				aClass58_491 = null;
				aClass58_450 = null;
				aClass58_474 = null;
				aClass58_447 = null;
				aClass58_444 = null;
				aClass58_431 = null;
				aClass58_479 = null;
				aClass58_459 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "gf.E(" + arg0 + ')');
		}
	}

	public static Class33_Sub6_Sub6 method186(int arg0, int arg1)
	{
		try
		{
			anInt454++;
			Class33_Sub6_Sub6 class33_sub6_sub6 = (Class33_Sub6_Sub6)Class33_Sub6_Sub4_Sub6.aClass16_3574.method144(0, arg1);
			if(arg0 != 16)
				method187(-48, (byte)93, -56);
			if(class33_sub6_sub6 != null)
				return class33_sub6_sub6;
			class33_sub6_sub6 = Class40.method884(false, (byte)-55, Class16.aClass30_314, arg1, Class33_Sub6_Sub4_Sub1.aClass30_3342);
			if(class33_sub6_sub6 != null)
				Class33_Sub6_Sub4_Sub6.aClass16_3574.method145(arg1, (byte)-105, class33_sub6_sub6);
			return class33_sub6_sub6;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "gf.A(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method187(int arg0, byte arg1, int arg2)
	{
		try
		{
			anInt460++;
			Class38.anInt838++;
			Class46.aClass33_Sub11_Sub1_989.method683(107, arg1 + -1282);
			if(arg1 != 84)
				method188(-49, 96, false, 111, -9, 110);
			Class46.aClass33_Sub11_Sub1_989.method664(true, arg0);
			Class46.aClass33_Sub11_Sub1_989.method627(4773, arg2);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "gf.F(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static Class33_Sub6_Sub7_Sub3 method188(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5)
	{
		try
		{
			anInt424++;
			long l = (((long)arg5 << 0x48fa9c10) + (long)arg0 + ((long)arg3 << 0xe6b2fe66)) - -((long)arg1 << 0xee62d628);
			if(!arg2)
			{
				Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3 = (Class33_Sub6_Sub7_Sub3)Class58.aClass16_1900.method144(0, l);
				if(class33_sub6_sub7_sub3 != null)
					return class33_sub6_sub7_sub3;
			}
			if(arg4 < 71)
				return null;
			Class33_Sub6_Sub11 class33_sub6_sub11 = Class14.method127(arg0, (byte)90);
			if(arg5 > 1 && class33_sub6_sub11.anIntArray2928 != null)
			{
				int i = -1;
				for(int j = 0; j < 10; j++)
					if(class33_sub6_sub11.anIntArray2894[j] <= arg5 && class33_sub6_sub11.anIntArray2894[j] != 0)
						i = class33_sub6_sub11.anIntArray2928[j];

				if(~i != 0)
					class33_sub6_sub11 = Class14.method127(i, (byte)90);
			}
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = class33_sub6_sub11.method531(-9570, 1);
			if(class33_sub6_sub4_sub3 == null)
				return null;
			Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3_2 = null;
			if(class33_sub6_sub11.anInt2905 != -1)
			{
				class33_sub6_sub7_sub3_2 = method188(class33_sub6_sub11.anInt2901, 0, true, 1, 102, 10);
				if(class33_sub6_sub7_sub3_2 == null)
					return null;
			}
			int ai[] = Class33_Sub6_Sub7.anIntArray2796;
			int k = Class33_Sub6_Sub7.anInt2797;
			int i1 = Class33_Sub6_Sub7.anInt2795;
			int ai1[] = new int[4];
			Class33_Sub6_Sub7.method413(ai1);
			Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3_1 = new Class33_Sub6_Sub7_Sub3(36, 32);
			Class33_Sub6_Sub7.method428(class33_sub6_sub7_sub3_1.anIntArray3722, 36, 32);
			Class33_Sub6_Sub7.method417();
			Class33_Sub6_Sub7_Sub1.method433();
			Class33_Sub6_Sub7_Sub1.method435(16, 16);
			int j1 = class33_sub6_sub11.anInt2910;
			Class33_Sub6_Sub7_Sub1.aBoolean3676 = false;
			if(!arg2)
			{
				if(arg3 == 2)
					j1 = (int)(1.04D * (double)j1);
			} else
			{
				j1 = (int)(1.5D * (double)j1);
			}
			int l1 = Class33_Sub6_Sub7_Sub1.anIntArray3678[class33_sub6_sub11.anInt2924] * j1 >> 0x6ea862d0;
			int k1 = Class33_Sub6_Sub7_Sub1.anIntArray3681[class33_sub6_sub11.anInt2924] * j1 >> 0xc62b8770;
			class33_sub6_sub4_sub3.method334();
			class33_sub6_sub4_sub3.method345(0, class33_sub6_sub11.anInt2932, class33_sub6_sub11.anInt2896, class33_sub6_sub11.anInt2924, class33_sub6_sub11.anInt2933, k1 - (-(((Class33_Sub6_Sub4) (class33_sub6_sub4_sub3)).anInt2737 / 2) + -class33_sub6_sub11.anInt2943), class33_sub6_sub11.anInt2943 + l1);
			if(~arg3 <= -2)
				class33_sub6_sub7_sub3_1.method493(1);
			if(arg3 >= 2)
				class33_sub6_sub7_sub3_1.method493(0xffffff);
			if(~arg1 != -1)
				class33_sub6_sub7_sub3_1.method480(arg1);
			Class33_Sub6_Sub7.method428(class33_sub6_sub7_sub3_1.anIntArray3722, 36, 32);
			if(~class33_sub6_sub11.anInt2905 != 0)
				class33_sub6_sub7_sub3_2.method478(0, 0);
			if(!arg2 && (class33_sub6_sub11.anInt2944 == 1 || ~arg5 != -2) && arg5 != -1)
				Class33_Sub6_Sub15.aClass33_Sub6_Sub7_Sub2_3057.method464(Class57.method1021(-113, arg5), 0, 9, 0xffff00, 1);
			if(!arg2)
				Class58.aClass16_1900.method145(l, (byte)-128, class33_sub6_sub7_sub3_1);
			Class33_Sub6_Sub7.method428(ai, k, i1);
			Class33_Sub6_Sub7.method419(ai1);
			Class33_Sub6_Sub7_Sub1.method433();
			Class33_Sub6_Sub7_Sub1.aBoolean3676 = true;
			return class33_sub6_sub7_sub3_1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "gf.C(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
		}
	}

	public Class23()
	{
		anInt488 = 0;
		anInt483 = 0;
	}

	public int anInt423;
	public static int anInt424;
	public int anInt425;
	public static int anInt426;
	public static int anInt427;
	public static int anInt428;
	public static Class82 aClass82_429 = new Class82(32);
	public static int anInt430 = 0;
	public static Class58 aClass58_431;
	public static int anInt432;
	public static Class58 aClass58_433;
	public static Class58 aClass58_434;
	public static Class58 aClass58_435;
	public static Class58 aClass58_436;
	public static Class58 aClass58_437;
	public Class33_Sub6_Sub4 aClass33_Sub6_Sub4_438;
	public static Class58 aClass58_439;
	public static Class58 aClass58_440;
	public int anInt441;
	public static Class58 aClass58_442;
	public static Class58 aClass58_443;
	public static Class58 aClass58_444;
	public static Class58 aClass58_445;
	public int anInt446;
	public static Class58 aClass58_447;
	public static Class58 aClass58_448;
	public static Class58 aClass58_449;
	public static Class58 aClass58_450;
	public static Class58 aClass58_451;
	public static Class58 aClass58_452;
	public static Class58 aClass58_453;
	public static int anInt454;
	public static Class58 aClass58_455;
	public static Class58 aClass58_456;
	public static Class58 aClass58_457;
	public static Class58 aClass58_458;
	public static Class58 aClass58_459;
	public static int anInt460;
	public static Class58 aClass58_461;
	public int anInt462;
	public static Class58 aClass58_463;
	public static Class58 aClass58_464;
	public static boolean aBoolean465 = false;
	public static Class58 aClass58_466;
	public static Class58 aClass58_467;
	public static Class58 aClass58_468;
	public static Class58 aClass58_469 = Class33_Sub6_Sub11.method535(118, "<col=40ff00>");
	public static Class58 aClass58_470;
	public static Class58 aClass58_471;
	public static int anIntArrayArray472[][];
	public static Class58 aClass58_473;
	public static Class58 aClass58_474;
	public static Class58 aClass58_475;
	public static long aLong476;
	public static int anInt477;
	public static Class58 aClass58_478;
	public static Class58 aClass58_479;
	public static Class58 aClass58_480;
	public static Class58 aClass58_481;
	public static Class58 aClass58_482;
	public int anInt483;
	public static Class58 aClass58_484;
	public static int anInt485 = 0;
	public static Class58 aClass58_486 = Class33_Sub6_Sub11.method535(106, "Verbindung konnte nicht hergestellt werden)3");
	public static Class58 aClass58_487;
	public int anInt488;
	public static Class58 aClass58_489;
	public static Class58 aClass58_490;
	public static Class58 aClass58_491;

	static 
	{
		aClass58_459 = Class33_Sub6_Sub11.method535(127, "No response from server)3");
		aClass58_452 = Class33_Sub6_Sub11.method535(121, "");
		aClass58_458 = aClass58_452;
		aClass58_445 = aClass58_452;
		aClass58_464 = aClass58_452;
		aClass58_451 = aClass58_452;
		aClass58_455 = aClass58_452;
		aClass58_434 = aClass58_452;
		aClass58_473 = aClass58_452;
		aClass58_466 = aClass58_452;
		aClass58_436 = aClass58_452;
		aClass58_444 = Class33_Sub6_Sub11.method535(120, " more options");
		aClass58_456 = aClass58_452;
		aClass58_468 = aClass58_452;
		aClass58_470 = aClass58_452;
		aClass58_450 = aClass58_452;
		aClass58_442 = aClass58_459;
		aClass58_457 = aClass58_452;
		aClass58_431 = aClass58_452;
		aClass58_433 = aClass58_452;
		aClass58_453 = aClass58_452;
		aClass58_479 = aClass58_452;
		aClass58_435 = aClass58_452;
		aClass58_474 = aClass58_452;
		aClass58_447 = aClass58_452;
		aClass58_478 = aClass58_452;
		aClass58_475 = aClass58_452;
		aClass58_448 = aClass58_452;
		aClass58_443 = aClass58_452;
		aClass58_482 = aClass58_452;
		aClass58_471 = aClass58_452;
		aClass58_487 = Class33_Sub6_Sub11.method535(105, "Examine");
		aClass58_484 = aClass58_452;
		aClass58_437 = aClass58_452;
		aClass58_461 = aClass58_487;
		aClass58_440 = aClass58_452;
		aClass58_489 = aClass58_452;
		aClass58_481 = aClass58_452;
		aClass58_439 = aClass58_452;
		aClass58_463 = aClass58_452;
		aClass58_490 = aClass58_444;
		aClass58_449 = aClass58_452;
		aClass58_491 = aClass58_452;
		aClass58_480 = aClass58_452;
		aClass58_467 = aClass58_452;
	}
}
