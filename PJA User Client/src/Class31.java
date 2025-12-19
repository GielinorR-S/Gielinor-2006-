// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class31.java

import java.awt.Component;

public class Class31
{

	public static void method252(int arg0)
	{
		try
		{
			Class17.aClass15_338.method135(8);
			Class33_Sub6_Sub7_Sub1.method433();
			if(arg0 <= 31)
				method255(false);
			anInt687++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jd.F(" + arg0 + ')');
		}
	}

	public static int method253(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt680++;
			if(arg0 >= -37)
				aClass6_703 = null;
			int i = 0;
			for(; arg1 > 0; arg1--)
			{
				i = i << 0xa81ebe61 | arg2 & 1;
				arg2 >>>= 1;
			}

			return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jd.C(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method254(int arg0)
	{
		try
		{
			aClass6_703 = null;
			aClass58_698 = null;
			aClass58_700 = null;
			aClass58_692 = null;
			aClass58_704 = null;
			if(arg0 < 110)
				anInt695 = -53;
			aClass4_684 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jd.B(" + arg0 + ')');
		}
	}

	public static void method255(boolean arg0)
	{
		anInt686++;
		try
		{
			java.awt.Graphics g = Class33_Sub6_Sub4_Sub1.aCanvas3367.getGraphics();
			Class33_Sub6_Sub16.aClass15_3094.method131(553, 205, (byte)78, g);
			if(arg0)
			{
				aClass58_698 = null;
				return;
			}
		}
		catch(Exception _ex)
		{
			Class33_Sub6_Sub4_Sub1.aCanvas3367.repaint();
		}
	}

	public static void method256(Class33_Sub6_Sub4_Sub5 arg0, int arg1)
	{
		arg0.anInt3499 = arg0.anInt3569;
		anInt681++;
		if(~arg0.anInt3513 == -1)
		{
			arg0.anInt3514 = 0;
			return;
		}
		if(~arg0.anInt3567 != 0 && arg0.anInt3544 == 0)
		{
			Class33_Sub6_Sub14 class33_sub6_sub14 = Class33_Sub21.method830(arg0.anInt3567, -104);
			if(~arg0.anInt3505 < -1 && class33_sub6_sub14.anInt3026 == 0)
			{
				arg0.anInt3514++;
				return;
			}
			if(arg0.anInt3505 <= 0 && ~class33_sub6_sub14.anInt3012 == -1)
			{
				arg0.anInt3514++;
				return;
			}
		}
		int i = arg0.anInt3548;
		int j = arg0.anInt3510;
		int k = 64 * arg0.anInt3559 + 128 * arg0.anIntArray3554[arg0.anInt3513 - 1];
		int l = arg0.anIntArray3520[arg0.anInt3513 + -1] * 128 + 64 * arg0.anInt3559;
		if(k - i > 256 || ~(-i + k) > 255 || l - j > 256 || ~(-j + l) > 255)
		{
			arg0.anInt3510 = l;
			arg0.anInt3548 = k;
			return;
		}
		if(i < k)
		{
			if(~l < ~j)
				arg0.anInt3519 = 1280;
			else
			if(~l > ~j)
				arg0.anInt3519 = 1792;
			else
				arg0.anInt3519 = 1536;
		} else
		if(i <= k)
		{
			if(j < l)
				arg0.anInt3519 = 1024;
			else
			if(~l > ~j)
				arg0.anInt3519 = 0;
		} else
		if(~j <= ~l)
		{
			if(~j < ~l)
				arg0.anInt3519 = 256;
			else
				arg0.anInt3519 = 512;
		} else
		{
			arg0.anInt3519 = 768;
		}
		int i1 = arg0.anInt3519 - arg0.anInt3549 & 0x7ff;
		if(arg1 >= -73)
			anInt691 = -121;
		if(i1 > 1024)
			i1 -= 2048;
		int j1 = arg0.anInt3541;
		if(i1 >= -256 && i1 <= 256)
			j1 = arg0.anInt3532;
		else
		if(~i1 > -257 || i1 >= 768)
		{
			if(i1 >= -768 && i1 <= -256)
				j1 = arg0.anInt3506;
		} else
		{
			j1 = arg0.anInt3504;
		}
		if(j1 == -1)
			j1 = arg0.anInt3532;
		int k1 = 4;
		arg0.anInt3499 = j1;
		boolean flag = true;
		if(arg0 instanceof Class33_Sub6_Sub4_Sub5_Sub2)
			flag = ((Class33_Sub6_Sub4_Sub5_Sub2)arg0).aClass33_Sub6_Sub16_3776.aBoolean3114;
		if(!flag)
		{
			if(arg0.anInt3513 > 1)
				k1 = 6;
			if(arg0.anInt3513 > 2)
				k1 = 8;
			if(~arg0.anInt3514 < -1 && ~arg0.anInt3513 < -2)
			{
				k1 = 8;
				arg0.anInt3514--;
			}
		} else
		{
			if(arg0.anInt3549 != arg0.anInt3519 && ~arg0.anInt3546 == 0 && arg0.anInt3522 != 0)
				k1 = 2;
			if(~arg0.anInt3513 < -3)
				k1 = 6;
			if(arg0.anInt3513 > 3)
				k1 = 8;
			if(~arg0.anInt3514 < -1 && ~arg0.anInt3513 < -2)
			{
				k1 = 8;
				arg0.anInt3514--;
			}
		}
		if(arg0.aBooleanArray3516[-1 + arg0.anInt3513])
			k1 <<= 1;
		if(i < k)
		{
			arg0.anInt3548 += k1;
			if(~arg0.anInt3548 < ~k)
				arg0.anInt3548 = k;
		} else
		if(~i < ~k)
		{
			arg0.anInt3548 -= k1;
			if(k > arg0.anInt3548)
				arg0.anInt3548 = k;
		}
		if(k1 >= 8 && arg0.anInt3532 == arg0.anInt3499 && ~arg0.anInt3545 != 0)
			arg0.anInt3499 = arg0.anInt3545;
		if(~l < ~j)
		{
			arg0.anInt3510 += k1;
			if(l < arg0.anInt3510)
				arg0.anInt3510 = l;
		} else
		if(j > l)
		{
			arg0.anInt3510 -= k1;
			if(l > arg0.anInt3510)
				arg0.anInt3510 = l;
		}
		if(arg0.anInt3548 == k && l == arg0.anInt3510)
		{
			arg0.anInt3513--;
			if(~arg0.anInt3505 < -1)
				arg0.anInt3505--;
		}
	}

	public static void method257(int arg0, int arg1)
	{
		try
		{
			Class62.anInt1311 = 0;
			Class33_Sub12.anInt2321 = arg1;
			Class38.aClass30_852 = null;
			if(arg0 != -27742)
				aClass6_703 = null;
			Class33_Sub15.anInt2357 = -1;
			Class62.anInt1312 = 1;
			Class22.aBoolean419 = false;
			Class55.anInt1161 = -1;
			anInt678++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jd.A(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6)
	{
		aBoolean679 = true;
		try
		{
			anInt694 = arg5;
			anInt690 = arg2;
			aBoolean679 = arg6;
			anInt682 = arg0;
			anInt683 = arg3;
			anInt685 = arg4;
			anInt688 = arg1;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jd.<init>(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public static int anInt678;
	public boolean aBoolean679;
	public static int anInt680;
	public static int anInt681;
	public int anInt682;
	public int anInt683;
	public static Class4 aClass4_684 = new Class4();
	public int anInt685;
	public static int anInt686;
	public static int anInt687;
	public int anInt688;
	public static int anInt689;
	public int anInt690;
	public static int anInt691 = 0;
	public static Class58 aClass58_692 = Class33_Sub6_Sub11.method535(98, "Sprites geladen)3");
	public static int anInt693;
	public int anInt694;
	public static int anInt695 = 0;
	public static int anInt696 = 0;
	public static int anInt697 = 0;
	public static Class58 aClass58_698 = Class33_Sub6_Sub11.method535(110, "Fps:");
	public static int anInt699;
	public static Class58 aClass58_700;
	public static int anInt701 = 0;
	public static int anInt702;
	public static Class6 aClass6_703;
	public static Class58 aClass58_704;

	static 
	{
		aClass58_700 = Class33_Sub6_Sub11.method535(99, " from your friend list first");
		aClass58_704 = aClass58_700;
	}
}
