// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub4_Sub5.java


public abstract class Class33_Sub6_Sub4_Sub5 extends Class33_Sub6_Sub4
{

	public void method358(byte arg0, boolean arg1, int arg2, int arg3)
	{
		try
		{
			anInt3517++;
			if(~anInt3567 != 0 && Class33_Sub21.method830(anInt3567, -80).anInt3012 == 1)
				anInt3567 = -1;
			if(!arg1)
			{
				int i = -anIntArray3554[0] + arg3;
				int j = arg2 - anIntArray3520[0];
				if(i >= -8 && i <= 8 && ~j <= 7 && j <= 8)
				{
					if(~anInt3513 > -10)
						anInt3513++;
					for(int k = anInt3513; ~k < -1; k--)
					{
						anIntArray3554[k] = anIntArray3554[-1 + k];
						anIntArray3520[k] = anIntArray3520[-1 + k];
						aBooleanArray3516[k] = aBooleanArray3516[k + -1];
					}

					anIntArray3554[0] = arg3;
					anIntArray3520[0] = arg2;
					aBooleanArray3516[0] = false;
					return;
				}
			}
			anInt3513 = 0;
			anInt3514 = 0;
			anIntArray3554[0] = arg3;
			anIntArray3520[0] = arg2;
			anInt3510 = anInt3559 * 64 + 128 * anIntArray3520[0];
			if(arg0 != 18)
			{
				return;
			} else
			{
				anInt3505 = 0;
				anInt3548 = 64 * anInt3559 + 128 * anIntArray3554[0];
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "md.K(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public void method359(byte arg0, boolean arg1, int arg2)
	{
		try
		{
			anInt3528++;
			int i = anIntArray3554[0];
			int j = anIntArray3520[0];
			if(arg2 == 0)
			{
				j++;
				i--;
			}
			if(~arg2 == -2)
				j++;
			if(~anInt3567 != 0 && Class33_Sub21.method830(anInt3567, -94).anInt3012 == 1)
				anInt3567 = -1;
			int k = -72 / ((19 - arg0) / 49);
			if(anInt3513 < 9)
				anInt3513++;
			for(int l = anInt3513; ~l < -1; l--)
			{
				anIntArray3554[l] = anIntArray3554[-1 + l];
				anIntArray3520[l] = anIntArray3520[l + -1];
				aBooleanArray3516[l] = aBooleanArray3516[l + -1];
			}

			if(arg2 == 2)
			{
				i++;
				j++;
			}
			if(arg2 == 3)
				i--;
			if(arg2 == 4)
				i++;
			aBooleanArray3516[0] = arg1;
			if(arg2 == 5)
			{
				j--;
				i--;
			}
			if(~arg2 == -7)
				j--;
			if(arg2 == 7)
			{
				i++;
				j--;
			}
			anIntArray3554[0] = i;
			anIntArray3520[0] = j;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "md.M(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method360(int arg0, int arg1, int arg2, byte arg3)
	{
		try
		{
			anInt3529++;
			if(arg0 < 128 || ~arg2 > -129 || ~arg0 < -13057 || arg2 > 13056)
			{
				Class33_Sub7.anInt2162 = -1;
				Class37.anInt808 = -1;
				return;
			}
			int j = -109 % ((63 - arg3) / 32);
			int i = -arg1 + Class38.method871(arg0, Class77_Sub2.anInt2645, arg2, -42);
			arg0 -= anInt3509;
			arg2 -= Class58.anInt1907;
			int k = Class33_Sub6_Sub7_Sub1.anIntArray3681[Class33_Sub11.anInt2270];
			int l = Class33_Sub6_Sub7_Sub1.anIntArray3678[Class33_Sub11.anInt2270];
			int i1 = Class33_Sub6_Sub7_Sub1.anIntArray3681[Class14.anInt275];
			i -= Class71.anInt1516;
			int j1 = Class33_Sub6_Sub7_Sub1.anIntArray3678[Class14.anInt275];
			int k1 = arg0 * j1 + i1 * arg2 >> 0xb7af6190;
			arg2 = -(arg0 * i1) + j1 * arg2 >> 0xf75a4bd0;
			arg0 = k1;
			k1 = -(k * arg2) + l * i >> 0x9ea03f0;
			arg2 = l * arg2 + k * i >> 0x95cace70;
			i = k1;
			if(~arg2 <= -51)
			{
				Class33_Sub7.anInt2162 = (i << 0x3cccff09) / arg2 + 167;
				Class37.anInt808 = 256 + (arg0 << 0xa373cdc9) / arg2;
				return;
			} else
			{
				Class33_Sub7.anInt2162 = -1;
				Class37.anInt808 = -1;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "md.F(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public void method361(int arg0, int arg1, byte arg2, int arg3)
	{
		try
		{
			anInt3557++;
			if(arg2 != 102)
				method360(109, 121, -13, (byte)-50);
			for(int i = 0; i < 4; i++)
				if(arg1 >= anIntArray3530[i])
				{
					anIntArray3503[i] = arg3;
					anIntArray3523[i] = arg0;
					anIntArray3530[i] = arg1 + 70;
					return;
				}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "md.G(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static void method362(byte arg0)
	{
		try
		{
			anIntArray3555 = null;
			aClass58_3573 = null;
			aClass58_3566 = null;
			aClass58_3508 = null;
			aClass58_3547 = null;
			if(arg0 < 22)
				anIntArray3555 = null;
			anIntArray3561 = null;
			aClass58_3497 = null;
			aClass58_3568 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "md.J(" + arg0 + ')');
		}
	}

	public static Class58 method363(boolean arg0, int arg1, boolean arg2)
	{
		try
		{
			if(!arg0)
				aClass58_3566 = null;
			anInt3539++;
			return Class23.method184(arg2, (byte)-111, 10, arg1);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "md.E(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static int method364(int arg0, boolean arg1)
	{
		try
		{
			anInt3494++;
			if(arg1)
				method362((byte)-79);
			return (arg0 & 0xfc9dc) >> 0x92cc6e91;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "md.H(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method365(byte arg0)
	{
		try
		{
			int i = -30 % ((arg0 - -15) / 45);
			anInt3521++;
			Class15_Sub2.aClass15_1980.method135(8);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "md.L(" + arg0 + ')');
		}
	}

	public boolean method366(boolean arg0)
	{
		try
		{
			if(!arg0)
				method363(false, -117, false);
			anInt3533++;
			return false;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "md.C(" + arg0 + ')');
		}
	}

	public void method367(byte arg0)
	{
		try
		{
			anInt3513 = 0;
			if(arg0 > -98)
			{
				return;
			} else
			{
				anInt3505 = 0;
				anInt3570++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "md.I(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub4_Sub5()
	{
		aBooleanArray3516 = new boolean[10];
		aClass58_3507 = null;
		anInt3522 = 32;
		anInt3506 = -1;
		anInt3502 = 0;
		anInt3500 = 0;
		anIntArray3503 = new int[4];
		anInt3527 = 0;
		anIntArray3530 = new int[4];
		anInt3532 = -1;
		anInt3512 = 200;
		anInt3541 = -1;
		anInt3540 = -1000;
		anInt3513 = 0;
		anInt3515 = 0;
		anIntArray3523 = new int[4];
		anInt3514 = 0;
		anInt3498 = 0;
		anInt3496 = -1;
		anInt3551 = 100;
		anInt3538 = 0;
		anInt3505 = 0;
		anInt3544 = 0;
		anInt3546 = -1;
		anInt3559 = 1;
		anInt3545 = -1;
		anIntArray3554 = new int[10];
		aBoolean3518 = false;
		anInt3565 = 0;
		anInt3499 = -1;
		anInt3564 = -1;
		anInt3558 = 0;
		anInt3562 = 0;
		anInt3560 = 0;
		anInt3511 = 0;
		anInt3569 = -1;
		anInt3535 = 0;
		anInt3504 = -1;
		anInt3525 = -1;
		anInt3572 = 0;
		anIntArray3520 = new int[10];
		anInt3567 = -1;
	}

	public static int anInt3494;
	public int anInt3495;
	public int anInt3496;
	public static Class58 aClass58_3497 = Class33_Sub6_Sub11.method535(124, "Name des Gegenstands eingeben:");
	public int anInt3498;
	public int anInt3499;
	public int anInt3500;
	public static int anInt3501;
	public int anInt3502;
	public int anIntArray3503[];
	public int anInt3504;
	public int anInt3505;
	public int anInt3506;
	public Class58 aClass58_3507;
	public static Class58 aClass58_3508 = Class33_Sub6_Sub11.method535(124, "Benutzername: ");
	public static int anInt3509;
	public int anInt3510;
	public int anInt3511;
	public int anInt3512;
	public int anInt3513;
	public int anInt3514;
	public int anInt3515;
	public boolean aBooleanArray3516[];
	public static int anInt3517;
	public boolean aBoolean3518;
	public int anInt3519;
	public int anIntArray3520[];
	public static int anInt3521;
	public int anInt3522;
	public int anIntArray3523[];
	public int anInt3524;
	public int anInt3525;
	public int anInt3526;
	public int anInt3527;
	public static int anInt3528;
	public static int anInt3529;
	public int anIntArray3530[];
	public int anInt3531;
	public int anInt3532;
	public static int anInt3533;
	public int anInt3534;
	public int anInt3535;
	public int anInt3536;
	public static int anInt3537;
	public int anInt3538;
	public static int anInt3539;
	public int anInt3540;
	public int anInt3541;
	public static long aLong3542;
	public static boolean aBoolean3543 = false;
	public int anInt3544;
	public int anInt3545;
	public int anInt3546;
	public static Class58 aClass58_3547;
	public int anInt3548;
	public int anInt3549;
	public int anInt3550;
	public int anInt3551;
	public static volatile boolean aBoolean3552 = true;
	public int anInt3553;
	public int anIntArray3554[];
	public static int anIntArray3555[];
	public int anInt3556;
	public static int anInt3557;
	public int anInt3558;
	public int anInt3559;
	public int anInt3560;
	public static int anIntArray3561[] = new int[1000];
	public int anInt3562;
	public int anInt3563;
	public int anInt3564;
	public int anInt3565;
	public static Class58 aClass58_3566 = Class33_Sub6_Sub11.method535(115, "Abbrechen");
	public int anInt3567;
	public static Class58 aClass58_3568;
	public int anInt3569;
	public static int anInt3570;
	public int anInt3571;
	public int anInt3572;
	public static Class58 aClass58_3573 = null;

	static 
	{
		anIntArray3555 = new int[32];
		aClass58_3547 = Class33_Sub6_Sub11.method535(98, "Please enter your username)3");
		aClass58_3568 = aClass58_3547;
		int i = 2;
		for(int j = 0; ~j > -33; j++)
		{
			anIntArray3555[j] = -1 + i;
			i += i;
		}

	}
}
