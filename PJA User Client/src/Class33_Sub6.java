// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6.java


public class Class33_Sub6 extends Class33
{

	public void method289(int arg0)
	{
		try
		{
			anInt2128++;
			if(aClass33_Sub6_2125 == null)
				return;
			aClass33_Sub6_2125.aClass33_Sub6_2129 = aClass33_Sub6_2129;
			if(arg0 > -105)
				method289(19);
			aClass33_Sub6_2129.aClass33_Sub6_2125 = aClass33_Sub6_2125;
			aClass33_Sub6_2129 = null;
			aClass33_Sub6_2125 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "db.EA(" + arg0 + ')');
		}
	}

	public static Class58 method290(int arg0, int arg1, byte arg2[], int arg3)
	{
		try
		{
			anInt2131++;
			Class58 class58 = new Class58();
			class58.aByteArray1894 = new byte[arg3];
			class58.anInt1893 = 0;
			if(arg1 != 64)
				method290(99, 75, null, 51);
			for(int i = arg0; i < arg0 + arg3; i++)
				if(arg2[i] != 0)
					class58.aByteArray1894[class58.anInt1893++] = arg2[i];

			return class58;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "db.HA(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ')');
		}
	}

	public static void method291(int arg0)
	{
		try
		{
			anInt2132++;
			Class44.aClass16_960.method147((byte)-54);
			if(arg0 >= -48)
				method292(98);
			Class50.aClass16_1086.method147((byte)-54);
			Class58.aClass16_1900.method147((byte)-54);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "db.FA(" + arg0 + ')');
		}
	}

	public static void method292(int arg0)
	{
		try
		{
			if(arg0 != 32331)
			{
				return;
			} else
			{
				aClass58_2124 = null;
				aClass58_2130 = null;
				aClass16_2122 = null;
				aClass58_2133 = null;
				aClass58_2135 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "db.GA(" + arg0 + ')');
		}
	}

	public Class33_Sub6()
	{
	}

	public static int anInt2121;
	public static Class16 aClass16_2122 = new Class16(64);
	public static int anInt2123;
	public static Class58 aClass58_2124;
	public Class33_Sub6 aClass33_Sub6_2125;
	public static int anInt2126;
	public static int anInt2127;
	public static int anInt2128;
	public Class33_Sub6 aClass33_Sub6_2129;
	public static Class58 aClass58_2130;
	public static int anInt2131;
	public static int anInt2132;
	public static Class58 aClass58_2133 = Class33_Sub6_Sub11.method535(118, "Der Server wird gerade aktualisiert)3");
	public static int anInt2134 = 0;
	public static Class58 aClass58_2135 = Class33_Sub6_Sub11.method535(109, "bevor Sie den Vorgang wiederholen)3");

	static 
	{
		aClass58_2124 = Class33_Sub6_Sub11.method535(124, "Enter message to send to ");
		aClass58_2130 = aClass58_2124;
	}
}
