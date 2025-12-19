// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class32.java


public class Class32
{

	public static Class33_Sub6_Sub7_Sub4 method258(Class58 arg0, int arg1, Class58 arg2, Class30 arg3)
	{
		try
		{
			anInt717++;
			int i = arg3.method227((byte)8, arg2);
			int j = arg3.method229(true, i, arg0);
			if(arg1 != -4236)
				method259((byte)-94);
			return client.method40(i, arg3, j, false);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "je.C(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method259(byte arg0)
	{
		try
		{
			anIntArray712 = null;
			aClass58_705 = null;
			aClass58_713 = null;
			aClass58_715 = null;
			aClass30_714 = null;
			if(arg0 != 15)
				method259((byte)127);
			aClass58_716 = null;
			aClass33_Sub6_Sub7_Sub3Array707 = null;
			aClass58Array711 = null;
			aClass58_719 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "je.B(" + arg0 + ')');
		}
	}

	public static void method260(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt718++;
			if(arg0 != 1)
				anInt709 = -98;
			Class4 class4 = Class33_Sub6_Sub6.aClass4ArrayArrayArray2787[Class77_Sub2.anInt2645][arg2][arg1];
			if(class4 == null)
			{
				Class33_Sub2.aClass56_2035.method1004(Class77_Sub2.anInt2645, arg2, arg1);
				return;
			}
			int i = 0xfa0a1f01;
			Object obj = null;
			for(Class33_Sub6_Sub4_Sub1 class33_sub6_sub4_sub1 = (Class33_Sub6_Sub4_Sub1)class4.method68(18823); class33_sub6_sub4_sub1 != null; class33_sub6_sub4_sub1 = (Class33_Sub6_Sub4_Sub1)class4.method66((byte)-126))
			{
				Class33_Sub6_Sub11 class33_sub6_sub11 = Class14.method127(class33_sub6_sub4_sub1.anInt3363, (byte)90);
				int j = class33_sub6_sub11.anInt2922;
				if(class33_sub6_sub11.anInt2944 == 1)
					j *= 1 + class33_sub6_sub4_sub1.anInt3364;
				if(~j < ~i)
				{
					i = j;
					obj = class33_sub6_sub4_sub1;
				}
			}

			if(obj == null)
			{
				Class33_Sub2.aClass56_2035.method1004(Class77_Sub2.anInt2645, arg2, arg1);
				return;
			}
			class4.method61(((Class33) (obj)), 0);
			Class33_Sub6_Sub4_Sub1 class33_sub6_sub4_sub1_1 = (Class33_Sub6_Sub4_Sub1)class4.method68(18823);
			Object obj2 = null;
			Object obj1 = null;
			for(; class33_sub6_sub4_sub1_1 != null; class33_sub6_sub4_sub1_1 = (Class33_Sub6_Sub4_Sub1)class4.method66((byte)-127))
				if(((Class33_Sub6_Sub4_Sub1) (obj)).anInt3363 != class33_sub6_sub4_sub1_1.anInt3363)
				{
					if(obj1 == null)
						obj1 = class33_sub6_sub4_sub1_1;
					if(class33_sub6_sub4_sub1_1.anInt3363 != ((Class33_Sub6_Sub4_Sub1) (obj1)).anInt3363 && obj2 == null)
						obj2 = class33_sub6_sub4_sub1_1;
				}

			int k = 0x60000000 + (arg1 << 0xc0826507) + arg2;
			Class33_Sub2.aClass56_2035.method1006(Class77_Sub2.anInt2645, arg2, arg1, Class38.method871(arg2 * 128 + 64, Class77_Sub2.anInt2645, 64 + arg1 * 128, arg0 + -14), ((Class33_Sub6_Sub4) (obj)), k, ((Class33_Sub6_Sub4) (obj1)), ((Class33_Sub6_Sub4) (obj2)));
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "je.A(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static Class58 aClass58_705 = Class33_Sub6_Sub11.method535(121, "Entfernen");
	public static int anInt706 = 0;
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3Array707[];
	public static int anInt708;
	public static int anInt709 = 0;
	public static int anInt710 = 0;
	public static Class58 aClass58Array711[] = new Class58[200];
	public static int anIntArray712[] = new int[5];
	public static Class58 aClass58_713 = Class33_Sub6_Sub11.method535(99, "Handel)4Duell");
	public static Class30 aClass30_714;
	public static Class58 aClass58_715 = Class33_Sub6_Sub11.method535(101, "Wen m-Ochten Sie hinzuf-Ugen?");
	public static Class58 aClass58_716 = Class33_Sub6_Sub11.method535(102, "overlay_multiway");
	public static int anInt717;
	public static int anInt718;
	public static Class58 aClass58_719 = Class33_Sub6_Sub11.method535(104, "Mem:");

}
