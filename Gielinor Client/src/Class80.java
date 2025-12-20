// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class80.java

import java.awt.Component;

public class Class80
{

	public static byte[] method1204(int arg0, boolean arg1, Object arg2)
	{
		try
		{
			if(arg0 != -12653)
				return null;
			anInt1729++;
			if(arg2 == null)
				return null;
			if(arg2 instanceof byte[])
			{
				byte abyte0[] = (byte[])arg2;
				if(!arg1)
					return abyte0;
				else
					return Class33_Sub6_Sub10.method519(abyte0, 0);
			}
			if(arg2 instanceof Class50)
			{
				Class50 class50 = (Class50)arg2;
				return class50.method940((byte)-127);
			} else
			{
				throw new IllegalArgumentException();
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wa.A(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method1205(Class33_Sub6_Sub4_Sub5 arg0, byte arg1)
	{
		anInt1734++;
		arg0.aBoolean3518 = false;
		if(~arg0.anInt3499 != 0)
		{
			Class33_Sub6_Sub14 class33_sub6_sub14 = Class33_Sub21.method830(arg0.anInt3499, -127);
			if(class33_sub6_sub14 == null || class33_sub6_sub14.anIntArray3009 == null)
			{
				arg0.anInt3499 = -1;
			} else
			{
				arg0.anInt3538++;
				if(~arg0.anInt3498 > ~class33_sub6_sub14.anIntArray3009.length && ~arg0.anInt3538 < ~class33_sub6_sub14.anIntArray3031[arg0.anInt3498])
				{
					arg0.anInt3538 = 1;
					arg0.anInt3498++;
					Class77.method1173(class33_sub6_sub14, false, arg0.anInt3498, arg0.anInt3548, arg0.anInt3510);
				}
				if(~arg0.anInt3498 <= ~class33_sub6_sub14.anIntArray3009.length)
				{
					arg0.anInt3538 = 0;
					arg0.anInt3498 = 0;
					Class77.method1173(class33_sub6_sub14, false, arg0.anInt3498, arg0.anInt3548, arg0.anInt3510);
				}
			}
		}
		if(arg1 <= 54)
			method1204(-76, false, null);
		if(arg0.anInt3564 != -1 && Class33_Sub6_Sub6.anInt2785 >= arg0.anInt3524)
		{
			if(~arg0.anInt3511 > -1)
				arg0.anInt3511 = 0;
			int i = Class63.method1083((byte)51, arg0.anInt3564).anInt2849;
			if(i != -1)
			{
				Class33_Sub6_Sub14 class33_sub6_sub14_3 = Class33_Sub21.method830(i, -79);
				if(class33_sub6_sub14_3 == null || class33_sub6_sub14_3.anIntArray3009 == null)
				{
					arg0.anInt3564 = -1;
				} else
				{
					arg0.anInt3527++;
					if(arg0.anInt3511 < class33_sub6_sub14_3.anIntArray3009.length && ~arg0.anInt3527 < ~class33_sub6_sub14_3.anIntArray3031[arg0.anInt3511])
					{
						arg0.anInt3527 = 1;
						arg0.anInt3511++;
						Class77.method1173(class33_sub6_sub14_3, false, arg0.anInt3511, arg0.anInt3548, arg0.anInt3510);
					}
					if(~class33_sub6_sub14_3.anIntArray3009.length >= ~arg0.anInt3511 && (arg0.anInt3511 < 0 || arg0.anInt3511 >= class33_sub6_sub14_3.anIntArray3009.length))
						arg0.anInt3564 = -1;
				}
			} else
			{
				arg0.anInt3564 = -1;
			}
		}
		if(~arg0.anInt3567 != 0 && ~arg0.anInt3544 >= -2)
		{
			Class33_Sub6_Sub14 class33_sub6_sub14_1 = Class33_Sub21.method830(arg0.anInt3567, -118);
			if(~class33_sub6_sub14_1.anInt3026 == -2 && arg0.anInt3505 > 0 && ~Class33_Sub6_Sub6.anInt2785 <= ~arg0.anInt3563 && Class33_Sub6_Sub6.anInt2785 > arg0.anInt3526)
			{
				arg0.anInt3544 = 1;
				return;
			}
		}
		if(arg0.anInt3567 != -1 && arg0.anInt3544 == 0)
		{
			Class33_Sub6_Sub14 class33_sub6_sub14_2 = Class33_Sub21.method830(arg0.anInt3567, -77);
			if(class33_sub6_sub14_2 != null && class33_sub6_sub14_2.anIntArray3009 != null)
			{
				arg0.anInt3565++;
				if(~class33_sub6_sub14_2.anIntArray3009.length < ~arg0.anInt3502 && class33_sub6_sub14_2.anIntArray3031[arg0.anInt3502] < arg0.anInt3565)
				{
					arg0.anInt3565 = 1;
					arg0.anInt3502++;
					Class77.method1173(class33_sub6_sub14_2, false, arg0.anInt3502, arg0.anInt3548, arg0.anInt3510);
				}
				if(~arg0.anInt3502 <= ~class33_sub6_sub14_2.anIntArray3009.length)
				{
					arg0.anInt3560++;
					arg0.anInt3502 -= class33_sub6_sub14_2.anInt3028;
					if(~class33_sub6_sub14_2.anInt3036 < ~arg0.anInt3560)
					{
						if(~arg0.anInt3502 > -1 || ~arg0.anInt3502 <= ~class33_sub6_sub14_2.anIntArray3009.length)
							arg0.anInt3567 = -1;
						else
							Class77.method1173(class33_sub6_sub14_2, false, arg0.anInt3502, arg0.anInt3548, arg0.anInt3510);
					} else
					{
						arg0.anInt3567 = -1;
					}
				}
				arg0.aBoolean3518 = class33_sub6_sub14_2.aBoolean3011;
			} else
			{
				arg0.anInt3567 = -1;
			}
		}
		if(~arg0.anInt3544 < -1)
			arg0.anInt3544--;
	}

	public static void method1206(int arg0)
	{
		try
		{
			aClass58_1738 = null;
			aClass58_1735 = null;
			anIntArray1730 = null;
			aClass58_1739 = null;
			aClass39_1727 = null;
			if(arg0 != -2)
				method1207(null, 73);
			aClass58_1737 = null;
			aClass58_1740 = null;
			aClass58_1733 = null;
			anIntArray1725 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wa.B(" + arg0 + ')');
		}
	}

	public static void method1207(Component arg0, int arg1)
	{
		try
		{
			anInt1732++;
			arg0.removeKeyListener(Class33_Sub19.aClass81_2535);
			arg0.removeFocusListener(Class33_Sub19.aClass81_2535);
			Class33_Sub9.anInt2181 = arg1;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "wa.D(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static int anIntArray1725[] = new int[50];
	public static int anInt1726;
	public static Class39 aClass39_1727 = new Class39();
	public static int anInt1728;
	public static int anInt1729;
	public static int anIntArray1730[] = new int[32768];
	public static int anInt1731;
	public static int anInt1732;
	public static Class58 aClass58_1733;
	public static int anInt1734;
	public static Class58 aClass58_1735;
	public static int anInt1736 = 0;
	public static Class58 aClass58_1737;
	public static Class58 aClass58_1738;
	public static Class58 aClass58_1739;
	public static Class58 aClass58_1740;

	static 
	{
		aClass58_1735 = Class33_Sub6_Sub11.method535(102, "Walk here");
		aClass58_1733 = aClass58_1735;
		aClass58_1737 = Class33_Sub6_Sub11.method535(102, "Accept challenge");
		aClass58_1738 = Class33_Sub6_Sub11.method535(100, "To");
		aClass58_1740 = aClass58_1737;
		aClass58_1739 = aClass58_1738;
	}
}
