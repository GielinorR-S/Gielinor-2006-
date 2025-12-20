// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class9.java


public class Class9
{

	public static Class33_Sub6_Sub7_Sub3 method84(byte arg0)
	{
		try
		{
			Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3 = new Class33_Sub6_Sub7_Sub3();
			anInt166++;
			class33_sub6_sub7_sub3.anInt3723 = Class33_Sub6_Sub4_Sub5_Sub1.anIntArray3753[0];
			class33_sub6_sub7_sub3.anInt3724 = Class21.anIntArray391[0];
			class33_sub6_sub7_sub3.anInt3728 = Class68.anInt1444;
			class33_sub6_sub7_sub3.anInt3727 = Class33_Sub6_Sub5.anIntArray2769[0];
			int i = class33_sub6_sub7_sub3.anInt3723 * class33_sub6_sub7_sub3.anInt3727;
			class33_sub6_sub7_sub3.anIntArray3722 = new int[i];
			class33_sub6_sub7_sub3.anInt3726 = Class46.anInt1000;
			class33_sub6_sub7_sub3.anInt3725 = Class33_Sub19.anIntArray2553[0];
			byte abyte0[] = Class33_Sub6_Sub4_Sub1.aByteArrayArray3361[0];
			if(arg0 != -32)
				aClass58_172 = null;
			for(int j = 0; ~i < ~j; j++)
				class33_sub6_sub7_sub3.anIntArray3722[j] = Class75.anIntArray1614[Class12.method110(abyte0[j], 255)];

			Class35.method841(-21572);
			return class33_sub6_sub7_sub3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "be.B(" + arg0 + ')');
		}
	}

	public static void method85(byte arg0)
	{
		try
		{
			anInt164++;
			synchronized(Class33_Sub19.aClass81_2535)
			{
				Canvas_Sub1.anInt59 = Class31.anInt691;
				if(~Class33_Sub9.anInt2181 > -1)
				{
					for(int j = 0; ~j > -113; j++)
						Class33_Sub21.aBooleanArray2603[j] = false;

					Class33_Sub9.anInt2181 = Class45.anInt978;
				} else
				{
					while(Class45.anInt978 != Class33_Sub9.anInt2181) 
					{
						int k = Class33_Sub6_Sub6.anIntArray2788[Class45.anInt978];
						Class45.anInt978 = 0x7f & Class45.anInt978 - -1;
						if(k < 0)
							Class33_Sub21.aBooleanArray2603[~k] = false;
						else
							Class33_Sub21.aBooleanArray2603[k] = true;
					}
				}
				Class31.anInt691 = Class71.anInt1526;
			}
			int i = 73 / ((arg0 - 41) / 50);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "be.A(" + arg0 + ')');
		}
	}

	public static void method86(byte arg0)
	{
		try
		{
			aClass58_169 = null;
			aClass58_168 = null;
			aClass58_172 = null;
			aClass16_165 = null;
			if(arg0 <= 26)
			{
				return;
			} else
			{
				aByteArray176 = null;
				aClass58_175 = null;
				aClass58_170 = null;
				aClass58_171 = null;
				aClass58_173 = null;
				aByteArrayArray174 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "be.C(" + arg0 + ')');
		}
	}

	public static int anInt164;
	public static Class16 aClass16_165 = new Class16(20);
	public static int anInt166;
	public static volatile boolean aBoolean167 = false;
	public static Class58 aClass58_168 = Class33_Sub6_Sub11.method535(118, "Lade Texturen )2 ");
	public static Class58 aClass58_169;
	public static Class58 aClass58_170;
	public static Class58 aClass58_171;
	public static Class58 aClass58_172 = Class33_Sub6_Sub11.method535(104, "Mitteilung");
	public static Class58 aClass58_173;
	public static byte aByteArrayArray174[][] = new byte[50][];
	public static Class58 aClass58_175 = Class33_Sub6_Sub11.method535(127, ": ");
	public static byte aByteArray176[] = new byte[520];

	static 
	{
		aClass58_170 = Class33_Sub6_Sub11.method535(121, "Enter name of friend to delete from list");
		aClass58_169 = aClass58_170;
		aClass58_173 = Class33_Sub6_Sub11.method535(113, "Use");
		aClass58_171 = aClass58_173;
	}
}
