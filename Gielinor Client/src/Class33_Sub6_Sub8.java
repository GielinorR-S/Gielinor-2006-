// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub8.java

import java.awt.Component;

public class Class33_Sub6_Sub8 extends Class33_Sub6
{

	public static void method505(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6)
	{
		try
		{
			int j = 0x7ff & 2048 - arg6;
			anInt2805++;
			if(!arg3)
				method507((byte)-90);
			int l = 0;
			int i1 = arg4;
			int k = 0;
			int i = 2048 - arg5 & 0x7ff;
			if(~i != -1)
			{
				int l1 = Class33_Sub6_Sub7_Sub1.anIntArray3678[i];
				int j1 = Class33_Sub6_Sub7_Sub1.anIntArray3681[i];
				int j2 = -(i1 * j1) + l1 * l >> 0x3c198810;
				i1 = i1 * l1 + l * j1 >> 0x8c7d4f70;
				l = j2;
			}
			if(~j != -1)
			{
				int i2 = Class33_Sub6_Sub7_Sub1.anIntArray3678[j];
				int k1 = Class33_Sub6_Sub7_Sub1.anIntArray3681[j];
				int k2 = i1 * k1 + k * i2 >> 0x9d5fa9d0;
				i1 = i2 * i1 - k1 * k >> 0xe58eb670;
				k = k2;
			}
			Class71.anInt1516 = -l + arg1;
			Class58.anInt1907 = arg2 + -i1;
			Class14.anInt275 = arg6;
			Class33_Sub6_Sub4_Sub5.anInt3509 = -k + arg0;
			Class33_Sub11.anInt2270 = arg5;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hc.H(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public static void method506(Class58 arg0, byte arg1)
	{
		try
		{
			anInt2808++;
			if(arg0 == null || ~arg0.method1035(27) == -1)
			{
				Class33_Sub6_Sub4_Sub5_Sub1.anInt3744 = 0;
				return;
			}
			Class58 class58 = arg0;
			Class58 aclass58[] = new Class58[100];
			int i = 0;
			if(arg1 < 17)
				method505(114, 127, 29, true, -38, -118, 58);
			do
			{
				int j = class58.method1040(0, 32);
				if(~j == 0)
					break;
				Class58 class58_1 = class58.method1063(0, (byte)122, j).method1026((byte)6);
				if(class58_1.method1035(27) > 0)
					aclass58[i++] = class58_1.method1045(true);
				class58 = class58.method1028(1 + j, (byte)120);
			} while(true);
			class58 = class58.method1026((byte)-128);
			if(~class58.method1035(27) < -1)
				aclass58[i++] = class58.method1045(true);
			Class33_Sub6_Sub4_Sub5_Sub1.anInt3744 = 0;
label0:
			for(int k = 0; ~k > ~Class23.anInt432; k++)
			{
				Class33_Sub6_Sub11 class33_sub6_sub11 = Class14.method127(k, (byte)90);
				if(class33_sub6_sub11.anInt2905 != -1 || class33_sub6_sub11.aClass58_2898 == null)
					continue;
				Class58 class58_2 = class33_sub6_sub11.aClass58_2898.method1045(true);
				for(int l = 0; l < i; l++)
					if(~class58_2.method1046((byte)-98, aclass58[l]) == 0)
						continue label0;

				Class34.aClass58Array1849[Class33_Sub6_Sub4_Sub5_Sub1.anInt3744] = class58_2;
				Class35.anIntArray760[Class33_Sub6_Sub4_Sub5_Sub1.anInt3744] = k;
				Class33_Sub6_Sub4_Sub5_Sub1.anInt3744++;
				if(Class33_Sub6_Sub4_Sub5_Sub1.anInt3744 >= Class34.aClass58Array1849.length)
					return;
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hc.E(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static void method507(byte arg0)
	{
		anInt2806++;
		if(Class33_Sub3.aBoolean2058 && ~Class77_Sub2.anInt2645 != ~Class32.anInt709)
		{
			Class81.method1209(Class33_Sub6_Sub4_Sub1.anInt3338, Class44.anInt961, 97, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], Class77_Sub2.anInt2645);
			return;
		}
		if(arg0 <= 49)
			return;
		if(Class77_Sub2.anInt2645 != Canvas_Sub1.anInt65)
		{
			Canvas_Sub1.anInt65 = Class77_Sub2.anInt2645;
			Class66.method1097(Class77_Sub2.anInt2645, false);
		}
	}

	public static void method508(int arg0, int arg1, Class33_Sub6_Sub17 arg2, int arg3, int arg4, int arg5)
	{
		anInt2811++;
		Class33_Sub4 class33_sub4 = new Class33_Sub4();
		class33_sub4.anIntArray2087 = arg2.anIntArray3150;
		class33_sub4.anInt2078 = arg2.anInt3142 * 128;
		class33_sub4.anInt2085 = arg2.anInt3127;
		class33_sub4.anInt2075 = arg2.anInt3126;
		class33_sub4.anInt2071 = arg1 * 128;
		class33_sub4.anInt2076 = arg3;
		class33_sub4.anInt2092 = arg2.anInt3145;
		if(arg0 != 14072)
			aClass30_2809 = null;
		class33_sub4.anInt2063 = 128 * arg5;
		int j = arg2.anInt3165;
		int i = arg2.anInt3181;
		if(~arg4 == -2 || ~arg4 == -4)
		{
			i = arg2.anInt3165;
			j = arg2.anInt3181;
		}
		class33_sub4.anInt2084 = 128 * (arg5 - -j);
		class33_sub4.anInt2062 = 128 * (arg1 - -i);
		if(arg2.anIntArray3169 != null)
		{
			class33_sub4.aClass33_Sub6_Sub17_2070 = arg2;
			class33_sub4.method283(0);
		}
		Class31.aClass4_684.method63(class33_sub4, (byte)33);
		if(class33_sub4.anIntArray2087 != null)
			class33_sub4.anInt2090 = class33_sub4.anInt2092 - -(int)(Math.random() * (double)(-class33_sub4.anInt2092 + class33_sub4.anInt2075));
	}

	public void method509(Class33_Sub11 arg0, int arg1)
	{
		try
		{
			if(arg1 != 32)
				return;
			anInt2801++;
			do
			{
				int i = arg0.method639((byte)123);
				if(i != 0)
					method511(i, -55, arg0);
				else
					return;
			} while(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hc.C(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static void method510(int arg0)
	{
		try
		{
			aClass43_2814 = null;
			aClass30_2809 = null;
			if(arg0 < 16)
				aClass58_2803 = null;
			aClass58_2816 = null;
			aClass58_2804 = null;
			aClass58_2802 = null;
			aClass58_2813 = null;
			aClass58_2803 = null;
			aClass58_2818 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hc.G(" + arg0 + ')');
		}
	}

	public void method511(int arg0, int arg1, Class33_Sub11 arg2)
	{
		try
		{
			if(arg0 == 2)
				anInt2807 = arg2.method666(115);
			int i = 90 / ((arg1 - -19) / 34);
			anInt2812++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hc.F(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static Class15 method512(byte arg0, Component arg1, int arg2, int arg3)
	{
		try
		{
			anInt2815++;
			Class15_Sub2 class15_sub2;
			try
			{
				Class class1 = Class.forName("Class15_Sub1");
				Class15 class15 = (Class15)class1.newInstance();
				int i = 44 % ((arg0 - -71) / 40);
				class15.method136(-60, arg1, arg2, arg3);
				return class15;
			}
			catch(Throwable _ex)
			{
				class15_sub2 = new Class15_Sub2();
			}
			class15_sub2.method136(87, arg1, arg2, arg3);
			return class15_sub2;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "hc.A(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public Class33_Sub6_Sub8()
	{
		anInt2807 = 0;
	}

	public static int anInt2800;
	public static int anInt2801;
	public static Class58 aClass58_2802;
	public static Class58 aClass58_2803;
	public static Class58 aClass58_2804;
	public static int anInt2805;
	public static int anInt2806;
	public int anInt2807;
	public static int anInt2808;
	public static Class30 aClass30_2809;
	public static boolean aBoolean2810 = false;
	public static int anInt2811;
	public static int anInt2812;
	public static Class58 aClass58_2813;
	public static Class43 aClass43_2814;
	public static int anInt2815;
	public static Class58 aClass58_2816 = Class33_Sub6_Sub11.method535(125, "Verbinde mit Server)3)3)3");
	public static int anInt2817;
	public static Class58 aClass58_2818 = Class33_Sub6_Sub11.method535(119, "Hierhin gehen");

	static 
	{
		aClass58_2802 = Class33_Sub6_Sub11.method535(123, "Attack");
		aClass58_2803 = aClass58_2802;
		aClass58_2813 = Class33_Sub6_Sub11.method535(124, "Please reload this page)3");
		aClass58_2804 = aClass58_2813;
	}
}
