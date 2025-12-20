// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class48.java


public class Class48
{

	public static Class77 method928(byte arg0)
	{
		try
		{
			anInt1059++;
			if(arg0 != -62)
				aClass58_1057 = null;
			try
			{
				return (Class77)Class.forName("Class77_Sub1").newInstance();
			}
			catch(Throwable _ex)
			{
				return new Class77_Sub2();
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "oe.A(" + arg0 + ')');
		}
	}

	public static void method929(int arg0)
	{
		try
		{
			aClass58_1056 = null;
			if(arg0 != 0)
				method929(-118);
			aClass58_1058 = null;
			anIntArray1063 = null;
			aClass58_1061 = null;
			aClass16_1048 = null;
			aClass58_1062 = null;
			aClass58_1057 = null;
			aClass58_1060 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "oe.B(" + arg0 + ')');
		}
	}

	public Class48()
	{
	}

	public int anInt1047;
	public static Class16 aClass16_1048 = new Class16(200);
	public int anInt1049;
	public Class33_Sub6_Sub4 aClass33_Sub6_Sub4_1050;
	public int anInt1051;
	public static int anInt1052;
	public int anInt1053;
	public int anInt1054;
	public static int anInt1055 = 0;
	public static Class58 aClass58_1056;
	public static Class58 aClass58_1057;
	public static Class58 aClass58_1058 = Class33_Sub6_Sub11.method535(115, "Art");
	public static int anInt1059;
	public static Class58 aClass58_1060;
	public static Class58 aClass58_1061 = Class33_Sub6_Sub11.method535(121, "(Y ");
	public static Class58 aClass58_1062;
	public static int anIntArray1063[] = {
		0, -1, 0, 1
	};

	static 
	{
		aClass58_1056 = Class33_Sub6_Sub11.method535(116, " ");
		aClass58_1062 = Class33_Sub6_Sub11.method535(102, "Service unavailable)3");
		aClass58_1057 = aClass58_1056;
		aClass58_1060 = aClass58_1062;
	}
}
