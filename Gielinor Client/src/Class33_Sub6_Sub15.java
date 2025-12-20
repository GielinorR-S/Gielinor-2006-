// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub15.java

import java.awt.event.KeyEvent;

public class Class33_Sub6_Sub15 extends Class33_Sub6
{

	public static int method577(KeyEvent arg0, int arg1)
	{
		try
		{
			anInt3045++;
			if(arg1 < 37)
				return -99;
			char c = arg0.getKeyChar();
			if(c == '\u20AC')
				return 128;
			if(c <= 0 || ~c <= -257)
				c = '\uFFFF';
			return c;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "o.B(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public void method578(int arg0, Class33_Sub11 arg1)
	{
		try
		{
			if(arg0 != -28322)
				method579((byte)-93);
			do
			{
				int i = arg1.method639((byte)123);
				if(i != 0)
				{
					method580(99, arg1, i);
				} else
				{
					anInt3049++;
					return;
				}
			} while(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "o.E(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method579(byte arg0)
	{
		anInt3046++;
		if(arg0 != 23)
			method577(null, 78);
		if(~Class33_Sub12.anInt2313 != -1 && ~Class33_Sub12.anInt2313 != -4)
			return;
		if(~Class69.anInt1464 == -2)
		{
			int j = -4 + (Class48.anInt1055 + -5);
			int i = -575 + Class82.anInt1794;
			if(i >= 0 && ~j <= -1 && ~i > -147 && j < 151)
			{
				i -= 73;
				j -= 75;
				int k = 0x7ff & Class23.anInt430 + Class65.anInt1394;
				int l = Class33_Sub6_Sub7_Sub1.anIntArray3681[k];
				l = l * (Class24.anInt504 + 256) >> 0xab54b1a8;
				int i1 = Class33_Sub6_Sub7_Sub1.anIntArray3678[k];
				i1 = i1 * (256 + Class24.anInt504) >> 0xf35f8a8;
				int k1 = -(i * l) + i1 * j >> 0xfcb19eeb;
				int j1 = i * i1 + j * l >> 0x88a1018b;
				int i2 = -k1 + ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 >> 0x74e7d447;
				int l1 = j1 + ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 >> 0xd9230787;
				boolean flag = Class33_Sub6_Sub4_Sub4.method350(false, l1, true, 0, (byte)-102, 0, 1, 0, 0, 0, i2, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3554[0], ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anIntArray3520[0]);
				if(flag)
				{
					Class46.aClass33_Sub11_Sub1_989.method640(i, -11124);
					Class46.aClass33_Sub11_Sub1_989.method640(j, -11124);
					Class46.aClass33_Sub11_Sub1_989.method625(Class65.anInt1394, true);
					Class46.aClass33_Sub11_Sub1_989.method640(57, -11124);
					Class46.aClass33_Sub11_Sub1_989.method640(Class23.anInt430, -11124);
					Class46.aClass33_Sub11_Sub1_989.method640(Class24.anInt504, -11124);
					Class46.aClass33_Sub11_Sub1_989.method640(89, -11124);
					Class46.aClass33_Sub11_Sub1_989.method625(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548, true);
					Class46.aClass33_Sub11_Sub1_989.method625(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510, true);
					Class46.aClass33_Sub11_Sub1_989.method640(Class59.anInt1264, -11124);
					Class46.aClass33_Sub11_Sub1_989.method640(63, -11124);
				}
			}
		}
	}

	public void method580(int arg0, Class33_Sub11 arg1, int arg2)
	{
		try
		{
			if(arg2 != 1)
			{
				if(arg2 == 2)
					anInt3047 = arg1.method639((byte)123);
				else
				if(arg2 != 3)
				{
					if(~arg2 == -5)
						anInt3044 = arg1.method623((byte)87);
					else
					if(arg2 == 5)
					{
						anInt3064 = arg1.method666(108);
						aClass58Array3058 = new Class58[anInt3064];
						anIntArray3051 = new int[anInt3064];
						for(int i = 0; anInt3064 > i; i++)
						{
							anIntArray3051[i] = arg1.method623((byte)-106);
							aClass58Array3058[i] = arg1.method646(-117);
						}

					} else
					if(~arg2 == -7)
					{
						anInt3064 = arg1.method666(122);
						anIntArray3051 = new int[anInt3064];
						anIntArray3055 = new int[anInt3064];
						for(int j = 0; anInt3064 > j; j++)
						{
							anIntArray3051[j] = arg1.method623((byte)35);
							anIntArray3055[j] = arg1.method623((byte)72);
						}

					}
				} else
				{
					aClass58_3043 = arg1.method646(-121);
				}
			} else
			{
				anInt3042 = arg1.method639((byte)123);
			}
			if(arg0 <= 86)
				method580(20, null, -106);
			anInt3050++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "o.D(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ')');
		}
	}

	public static void method581(boolean arg0)
	{
		try
		{
			aClass58_3056 = null;
			aClass33_Sub6_Sub7_Sub2_3057 = null;
			if(!arg0)
				method581(false);
			anIntArray3063 = null;
			anIntArray3062 = null;
			aClass33_Sub6_Sub7_Sub4Array3065 = null;
			aClass58_3066 = null;
			aClass33_Sub6_Sub7_Sub4Array3052 = null;
			aClass26_3054 = null;
			aClass58_3061 = null;
			aClass58_3060 = null;
			aClass4_3053 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "o.C(" + arg0 + ')');
		}
	}

	public Class33_Sub6_Sub15()
	{
		aClass58_3043 = Applet_Sub1.aClass58_23;
		anInt3064 = 0;
	}

	public int anInt3042;
	public Class58 aClass58_3043;
	public int anInt3044;
	public static int anInt3045;
	public static int anInt3046;
	public int anInt3047;
	public static int anInt3048;
	public static int anInt3049;
	public static int anInt3050;
	public int anIntArray3051[];
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4Array3052[];
	public static Class4 aClass4_3053 = new Class4();
	public static Class26 aClass26_3054;
	public int anIntArray3055[];
	public static Class58 aClass58_3056 = Class33_Sub6_Sub11.method535(122, "Sichtbare Karte vorbereitet)3");
	public static Class33_Sub6_Sub7_Sub2 aClass33_Sub6_Sub7_Sub2_3057;
	public Class58 aClass58Array3058[];
	public static int anInt3059 = 0;
	public static Class58 aClass58_3060 = null;
	public static Class58 aClass58_3061 = Class33_Sub6_Sub11.method535(117, "Stufe)2");
	public static int anIntArray3062[] = new int[1000];
	public static int anIntArray3063[];
	public int anInt3064;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4Array3065[];
	public static Class58 aClass58_3066 = Class33_Sub6_Sub11.method535(99, "W-=hlen Sie eine Welt");

}
