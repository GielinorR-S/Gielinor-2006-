// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class17.java

import java.awt.Component;
import java.math.BigInteger;

public class Class17
{

	public static void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6[], Class56 arg7, 
			int arg8, Class70 arg9[], int arg10)
	{
		try
		{
			anInt344++;
			int i = -1;
			if(arg5 != 0)
				method156(null, (byte)-45);
			Class33_Sub11 class33_sub11 = new Class33_Sub11(arg6);
			do
			{
				int j = class33_sub11.method651(-74);
				if(j == 0)
					break;
				i += j;
				int k = 0;
				do
				{
					int l = class33_sub11.method651(79);
					if(l == 0)
						break;
					k += -1 + l;
					int i1 = k & 0x3f;
					int j1 = (0xfd4 & k) >> 0xd1499f46;
					int k1 = k >> 0xe05d5f2c;
					int l1 = class33_sub11.method639((byte)123);
					int i2 = l1 >> 0x5bed5be2;
					int j2 = l1 & 3;
					if(arg10 == k1 && j1 >= arg3 && j1 < 8 + arg3 && i1 >= arg4 && ~(8 + arg4) < ~i1)
					{
						Class33_Sub6_Sub17 class33_sub6_sub17 = Class33_Sub5.method285((byte)-106, i);
						int k2 = arg1 + Class71.method1136(class33_sub6_sub17.anInt3181, 7 & j1, class33_sub6_sub17.anInt3165, i1 & 7, arg2, -90, j2);
						int l2 = Class75.method1166(arg2, j1 & 7, class33_sub6_sub17.anInt3165, true, i1 & 7, class33_sub6_sub17.anInt3181, j2) + arg8;
						if(k2 > 0 && l2 > 0 && ~k2 > -104 && l2 < 103)
						{
							int i3 = arg0;
							if(~(2 & Class35.aByteArrayArrayArray761[1][k2][l2]) == -3)
								i3--;
							Class70 class70 = null;
							if(~i3 <= -1)
								class70 = arg9[i3];
							Class33_Sub20.method823(3 & j2 - -arg2, l2, arg7, k2, i, class70, i2, (byte)73, arg0);
						}
					}
				} while(true);
			} while(true);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ec.A(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? "null" : "{...}") + ',' + (arg7 == null ? "null" : "{...}") + ',' + arg8 + ',' + (arg9 == null ? "null" : "{...}") + ',' + arg10 + ')');
		}
	}

	public static void method155(byte arg0)
	{
		try
		{
			aClass58_340 = null;
			aClass58_348 = null;
			aClass58_347 = null;
			aClass15_346 = null;
			aClass58_349 = null;
			if(arg0 > -100)
			{
				return;
			} else
			{
				aClass58_343 = null;
				aClass15_338 = null;
				anIntArrayArrayArray351 = null;
				aBigInteger334 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ec.C(" + arg0 + ')');
		}
	}

	public static void method156(Component arg0, byte arg1)
	{
		try
		{
			arg0.addMouseListener(Class33_Sub6_Sub4_Sub2.aClass24_3388);
			if(arg1 <= 68)
			{
				return;
			} else
			{
				anInt341++;
				arg0.addMouseMotionListener(Class33_Sub6_Sub4_Sub2.aClass24_3388);
				arg0.addFocusListener(Class33_Sub6_Sub4_Sub2.aClass24_3388);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ec.B(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public Class17()
	{
	}

	public static BigInteger aBigInteger334 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	public int anInt335;
	public static int anInt336;
	public Class58 aClass58_337;
	public static Class15 aClass15_338;
	public boolean aBoolean339;
	public static Class58 aClass58_340 = Class33_Sub6_Sub11.method535(124, "Bitte laden Sie die Seite neu)3");
	public static int anInt341;
	public int anInt342;
	public static Class58 aClass58_343 = Class33_Sub6_Sub11.method535(105, "mod_icons");
	public static int anInt344;
	public int anInt345;
	public static Class15 aClass15_346;
	public static Class58 aClass58_347 = Class33_Sub6_Sub11.method535(125, "(U0a )2 in: ");
	public static Class58 aClass58_348;
	public static Class58 aClass58_349;
	public static int anInt350 = 0;
	public static int anIntArrayArrayArray351[][][];
	public int anInt352;

	static 
	{
		aClass58_349 = Class33_Sub6_Sub11.method535(125, "Hidden");
		aClass58_348 = aClass58_349;
	}
}
