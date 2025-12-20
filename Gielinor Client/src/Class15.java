// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class15.java

import java.awt.*;

public abstract class Class15
{

	public abstract void method131(int i, int j, byte byte0, Graphics g);

	public static void method132(int arg0)
	{
		try
		{
			if(arg0 < 101)
			{
				return;
			} else
			{
				aClass58_304 = null;
				aClass58_299 = null;
				aClass58_290 = null;
				aClass58_294 = null;
				aClass58_293 = null;
				aClass30_288 = null;
				aClass58_298 = null;
				aClass58_302 = null;
				aClass58_292 = null;
				aClass58_303 = null;
				aClass58_291 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "df.E(" + arg0 + ')');
		}
	}

	public static Class33_Sub6_Sub15 method133(byte arg0, int arg1)
	{
		try
		{
			anInt296++;
			Class33_Sub6_Sub15 class33_sub6_sub15 = (Class33_Sub6_Sub15)Class62.aClass16_1321.method144(arg0 ^ 0x29, arg1);
			if(class33_sub6_sub15 != null)
				return class33_sub6_sub15;
			if(arg0 != 41)
				return null;
			byte abyte0[] = Class47.aClass30_1031.method238(false, arg1, 8);
			class33_sub6_sub15 = new Class33_Sub6_Sub15();
			if(abyte0 != null)
				class33_sub6_sub15.method578(-28322, new Class33_Sub11(abyte0));
			Class62.aClass16_1321.method145(arg1, (byte)-109, class33_sub6_sub15);
			return class33_sub6_sub15;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "df.B(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static int method134(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt306++;
			if(arg1 != 11890)
				aClass58_292 = null;
			if(~arg0 < ~arg2)
			{
				int i = arg2;
				arg2 = arg0;
				arg0 = i;
			}
			int j;
			for(; ~arg0 != -1; arg0 = j)
			{
				j = arg2 % arg0;
				arg2 = arg0;
			}

			return arg2;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "df.A(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method135(int arg0)
	{
		try
		{
			Class33_Sub6_Sub7.method428(anIntArray289, anInt295, anInt301);
			anInt297++;
			if(arg0 != 8)
			{
				aClass58_298 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "df.C(" + arg0 + ')');
		}
	}

	public Class15()
	{
	}

	public abstract void method136(int i, Component component, int j, int k);

	public static Class30 aClass30_288;
	public int anIntArray289[];
	public static Class58 aClass58_290 = Class33_Sub6_Sub11.method535(102, "Schlie-8en");
	public static Class58 aClass58_291;
	public static Class58 aClass58_292 = Class33_Sub6_Sub11.method535(100, "Ihre Nachricht an: ");
	public static Class58 aClass58_293 = Class33_Sub6_Sub11.method535(119, "");
	public static Class58 aClass58_294 = Class33_Sub6_Sub11.method535(102, "sich mit einer anderen Welt zu verbinden)3");
	public int anInt295;
	public static int anInt296;
	public static int anInt297;
	public static Class58 aClass58_298 = Class33_Sub6_Sub11.method535(126, "Ein kostenloses Spielkonto erstellen)3");
	public static Class58 aClass58_299 = Class33_Sub6_Sub11.method535(121, "au");
	public static int anInt300;
	public int anInt301;
	public static Class58 aClass58_302 = Class33_Sub6_Sub11.method535(101, "Lade Sprites )2 ");
	public static Class58 aClass58_303 = Class33_Sub6_Sub11.method535(116, ")3");
	public static Class58 aClass58_304;
	public Image anImage305;
	public static int anInt306;
	public static int anInt307;

	static 
	{
		aClass58_291 = Class33_Sub6_Sub11.method535(124, "Login limit exceeded)3");
		aClass58_304 = aClass58_291;
	}
}
