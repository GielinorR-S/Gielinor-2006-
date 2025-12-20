// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub3.java


public class Class33_Sub6_Sub3 extends Class33_Sub6
{

	public static void method308(boolean arg0)
	{
		try
		{
			aClass43_2716 = null;
			if(!arg0)
				method311(null, (byte)71, -114);
			aClass58_2725 = null;
			aClass58_2727 = null;
			aClass58_2719 = null;
			aClass58_2721 = null;
			aClass58_2713 = null;
			aClass58_2724 = null;
			aClass30_Sub1_2715 = null;
			aClass33_Sub6_Sub7_Sub3Array2730 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "e.D(" + arg0 + ')');
		}
	}

	public static boolean method309(int arg0, byte arg1)
	{
		try
		{
			anInt2704++;
			if(arg1 > -123)
				anInt2728 = 105;
			return (1 & arg0 >> 0x33fc5d9f) != 0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "e.F(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method310(Class33_Sub11 arg0, int arg1, int arg2)
	{
		try
		{
			if(arg2 != -1)
				anInt2728 = -97;
			do
			{
				int i = arg0.method639((byte)123);
				if(~i != -1)
				{
					method313(arg1, i, true, arg0);
				} else
				{
					anInt2710++;
					return;
				}
			} while(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "e.A(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static boolean method311(Class30 arg0, byte arg1, int arg2)
	{
		try
		{
			anInt2722++;
			byte abyte0[] = arg0.method235((byte)26, arg2);
			if(abyte0 == null)
				return false;
			if(arg1 >= -97)
				anInt2729 = 63;
			Class33_Sub5.method288(abyte0, (byte)-75);
			return true;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "e.C(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method312(int arg0)
	{
		anInt2720++;
		method314(255, anInt2717);
		if(arg0 != -18174)
			method312(50);
	}

	public void method313(int arg0, int arg1, boolean arg2, Class33_Sub11 arg3)
	{
		anInt2705++;
		if(!arg2)
			method311(null, (byte)1, 10);
		if(~arg1 == -2)
			anInt2717 = arg3.method626((byte)-114);
	}

	public void method314(int arg0, int arg1)
	{
		try
		{
			anInt2723++;
			double d = (double)(0xff & arg1 >> 0x3cf9b0b0) / 256D;
			double d1 = (double)((arg1 & 0xff0c) >> 0x98e5b08) / 256D;
			double d2 = (double)(arg1 & arg0) / 256D;
			double d3 = d;
			double d4 = d;
			if(d4 < d1)
				d4 = d1;
			if(d3 > d1)
				d3 = d1;
			if(d4 < d2)
				d4 = d2;
			double d6 = 0.0D;
			if(d3 > d2)
				d3 = d2;
			double d5 = 0.0D;
			double d7 = (d4 + d3) / 2D;
			anInt2718 = (int)(d7 * 256D);
			if(d3 != d4)
			{
				if(d == d4)
					d5 = (d1 - d2) / (-d3 + d4);
				else
				if(d4 == d1)
					d5 = 2D + (d2 - d) / (d4 - d3);
				else
				if(d2 == d4)
					d5 = 4D + (-d1 + d) / (d4 - d3);
				if(d7 < 0.5D)
					d6 = (-d3 + d4) / (d4 + d3);
				if(d7 >= 0.5D)
					d6 = (-d3 + d4) / ((-d4 + 2D) - d3);
			}
			d5 /= 6D;
			if(~anInt2718 > -1)
				anInt2718 = 0;
			else
			if(anInt2718 > 255)
				anInt2718 = 255;
			anInt2708 = (int)(256D * d6);
			if(d7 <= 0.5D)
				anInt2712 = (int)(512D * (d7 * d6));
			else
				anInt2712 = (int)(512D * ((-d7 + 1.0D) * d6));
			if(anInt2712 < 1)
				anInt2712 = 1;
			anInt2714 = (int)(d5 * (double)anInt2712);
			if(~anInt2708 <= -1)
			{
				if(~anInt2708 < -256)
				{
					anInt2708 = 255;
					return;
				}
			} else
			{
				anInt2708 = 0;
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "e.E(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub6_Sub3()
	{
		anInt2717 = 0;
	}

	public static int anInt2703;
	public static int anInt2704;
	public static int anInt2705;
	public static int anInt2706;
	public static int anInt2707 = 1;
	public int anInt2708;
	public static int anInt2709;
	public static int anInt2710;
	public static int anInt2711 = 0;
	public int anInt2712;
	public static Class58 aClass58_2713;
	public int anInt2714;
	public static Class30_Sub1 aClass30_Sub1_2715;
	public static Class43 aClass43_2716;
	public int anInt2717;
	public int anInt2718;
	public static Class58 aClass58_2719 = Class33_Sub6_Sub11.method535(116, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");
	public static int anInt2720;
	public static Class58 aClass58_2721;
	public static int anInt2722;
	public static int anInt2723;
	public static Class58 aClass58_2724;
	public static Class58 aClass58_2725;
	public static int anInt2726;
	public static Class58 aClass58_2727;
	public static int anInt2728 = 0;
	public static int anInt2729 = -1;
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3Array2730[];

	static 
	{
		aClass58_2725 = Class33_Sub6_Sub11.method535(119, "cyan:");
		aClass58_2724 = aClass58_2725;
		aClass58_2721 = aClass58_2725;
		aClass58_2727 = Class33_Sub6_Sub11.method535(106, "Select");
		aClass58_2713 = aClass58_2727;
	}
}
