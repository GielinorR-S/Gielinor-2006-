// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class27.java


public class Class27
{

	public static int method209(int arg0, int arg1, byte arg2)
	{
		try
		{
			anInt555++;
			if(arg2 < 110)
			{
				return -61;
			} else
			{
				int i = Class33_Sub11.method631((byte)-9, arg0 - 1, -1 + arg1) + Class33_Sub11.method631((byte)91, -1 + arg0, arg1 + 1) + Class33_Sub11.method631((byte)-25, 1 + arg0, arg1 + -1) + Class33_Sub11.method631((byte)118, 1 + arg0, 1 + arg1);
				int j = (Class33_Sub11.method631((byte)117, arg0, arg1 - 1) + Class33_Sub11.method631((byte)125, arg0, arg1 - -1)) - (-Class33_Sub11.method631((byte)116, arg0 - 1, arg1) + -Class33_Sub11.method631((byte)91, 1 + arg0, arg1));
				int k = Class33_Sub11.method631((byte)-7, arg0, arg1);
				return i / 16 + (j / 8 - -(k / 4));
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "i.A(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method210(int arg0)
	{
		try
		{
			aClass58_554 = null;
			if(arg0 >= -51)
				method209(-51, -25, (byte)-76);
			aClass58_558 = null;
			aClass33_Sub11_562 = null;
			aClass58_556 = null;
			aClass58_567 = null;
			aClass58_566 = null;
			aClass58_561 = null;
			anIntArray559 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "i.B(" + arg0 + ')');
		}
	}

	public static Class58 aClass58_554 = Class33_Sub6_Sub11.method535(119, "Suche nach Updates )2 ");
	public static int anInt555;
	public static Class58 aClass58_556 = Class33_Sub6_Sub11.method535(101, "<col=ff9040>");
	public static int anInt557;
	public static Class58 aClass58_558 = Class33_Sub6_Sub11.method535(103, "sl_back");
	public static int anIntArray559[] = new int[2048];
	public static int anInt560 = 1;
	public static Class58 aClass58_561 = Class33_Sub6_Sub11.method535(124, "Hidden)2");
	public static Class33_Sub11 aClass33_Sub11_562 = new Class33_Sub11(new byte[5000]);
	public static int anInt563 = -1;
	public static int anInt564;
	public static int anInt565;
	public static Class58 aClass58_566;
	public static Class58 aClass58_567;

	static 
	{
		aClass58_567 = Class33_Sub6_Sub11.method535(113, "Ok");
		aClass58_566 = aClass58_567;
	}
}
