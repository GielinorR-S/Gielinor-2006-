// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class40.java

import java.applet.AppletContext;

public class Class40
{

	public static Class33_Sub6_Sub6 method884(boolean arg0, byte arg1, Class30 arg2, int arg3, Class30 arg4)
	{
		try
		{
			anInt888++;
			int i = 8 / ((arg1 - 11) / 53);
			boolean flag = true;
			int ai[] = arg4.method237(arg3, true);
			for(int j = 0; ~ai.length < ~j; j++)
			{
				byte abyte0[] = arg4.method220(arg3, ai[j], -25850);
				if(abyte0 == null)
				{
					flag = false;
				} else
				{
					int k = 0xff00 & abyte0[0] << 0x47f0e628 | abyte0[1] & 0xff;
					byte abyte1[];
					if(arg0)
						abyte1 = arg2.method220(0, k, -25850);
					else
						abyte1 = arg2.method220(k, 0, -25850);
					if(abyte1 == null)
						flag = false;
				}
			}

			if(!flag)
				return null;
			try
			{
				return new Class33_Sub6_Sub6(arg4, arg2, arg3, arg0);
			}
			catch(Exception _ex)
			{
				return null;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "m.D(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ',' + (arg4 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method885(Applet_Sub1 arg0, boolean arg1)
	{
		anInt889++;
		if(!arg1)
			anInt884 = -60;
		if(Class69.anInt1464 == 1)
		{
			char c = '\u0118';
			if(Class82.anInt1794 >= c && ~Class82.anInt1794 >= ~(14 + c) && ~Class48.anInt1055 <= -5 && Class48.anInt1055 <= 18)
			{
				Class22.method181(0, 20041, 0);
				return;
			}
			if(~Class82.anInt1794 <= ~(15 + c) && Class82.anInt1794 <= 80 + c && Class48.anInt1055 >= 4 && Class48.anInt1055 <= 18)
			{
				Class22.method181(0, 20041, 1);
				return;
			}
			char c1 = '\u0186';
			if(Class82.anInt1794 >= c1 && 14 + c1 >= Class82.anInt1794 && Class48.anInt1055 >= 4 && ~Class48.anInt1055 >= -19)
			{
				Class22.method181(1, 20041, 0);
				return;
			}
			if(c1 - -15 <= Class82.anInt1794 && Class82.anInt1794 <= 80 + c1 && ~Class48.anInt1055 <= -5 && ~Class48.anInt1055 >= -19)
			{
				Class22.method181(1, 20041, 1);
				return;
			}
			char c2 = '\u01F4';
			if(c2 <= Class82.anInt1794 && Class82.anInt1794 <= 14 + c2 && ~Class48.anInt1055 <= -5 && Class48.anInt1055 <= 18)
			{
				Class22.method181(2, 20041, 0);
				return;
			}
			if(c2 + 15 <= Class82.anInt1794 && ~Class82.anInt1794 >= ~(80 + c2) && ~Class48.anInt1055 <= -5 && Class48.anInt1055 <= 18)
			{
				Class22.method181(2, 20041, 1);
				return;
			}
			char c3 = '\u0262';
			if(~c3 >= ~Class82.anInt1794 && ~(14 + c3) <= ~Class82.anInt1794 && ~Class48.anInt1055 <= -5 && ~Class48.anInt1055 >= -19)
			{
				Class22.method181(3, 20041, 0);
				return;
			}
			if(15 + c3 <= Class82.anInt1794 && ~Class82.anInt1794 >= ~(80 + c3) && ~Class48.anInt1055 <= -5 && Class48.anInt1055 <= 18)
			{
				Class22.method181(3, 20041, 1);
				return;
			}
			if(Class82.anInt1794 >= 708 && Class48.anInt1055 >= 4 && Class82.anInt1794 <= 758 && Class48.anInt1055 <= 20)
			{
				Class33_Sub6_Sub2.aBoolean2683 = false;
				Class33_Sub16.aClass33_Sub6_Sub7_Sub3_2487.method494(0, 0);
				Class36.aClass33_Sub6_Sub7_Sub3_787.method494(382, 0);
				Class33_Sub6_Sub16.aClass33_Sub6_Sub7_Sub4_3116.method502(382 - Class33_Sub6_Sub16.aClass33_Sub6_Sub7_Sub4_3116.anInt3734 / 2, 18);
				return;
			}
			if(~Canvas_Sub1.anInt49 != 0)
			{
				Class17 class17 = Class33_Sub3.aClass17Array2060[Canvas_Sub1.anInt49];
				if((!Class77.aBoolean1647) == (!class17.aBoolean339))
				{
					byte abyte0[] = Class35.method846((byte)-83, new Class58[] {
						class17.aClass58_337, Class4.aClass58_132
					}).method1060(123);
					Class60.aString1289 = new String(abyte0, 0, abyte0.length);
					Class33_Sub6_Sub2.aBoolean2683 = false;
					Class27.anInt560 = class17.anInt352;
					if(Class33_Sub15.anInt2445 != 0)
					{
						Class62.anInt1302 = Class41.anInt915 = 43594;
						Class33_Sub15.anInt2445 = 0;
						Class12.anInt229 = 443;
					}
					Class33_Sub16.aClass33_Sub6_Sub7_Sub3_2487.method494(0, 0);
					Class36.aClass33_Sub6_Sub7_Sub3_787.method494(382, 0);
					Class33_Sub6_Sub16.aClass33_Sub6_Sub7_Sub4_3116.method502(382 - Class33_Sub6_Sub16.aClass33_Sub6_Sub7_Sub4_3116.anInt3734 / 2, 18);
					return;
				}
				Class58 class58 = Class35.method846((byte)-83, new Class58[] {
					Class68.aClass58_1458, class17.aClass58_337, Class4.aClass58_132, Class33_Sub13_Sub4.aClass58_3321, Class33_Sub6_Sub4_Sub5_Sub2.aClass58_3792, Class37.method859(15591, Class33_Sub3.aBoolean2058 ? 1 : 0), Class33_Sub6_Sub10.aClass58_2884, Class37.method859(15591, Class33_Sub2.anInt2023), Class49.aClass58_1064, Class37.method859(15591, Class33_Sub6_Sub3.anInt2707)
				});
				try
				{
					arg0.getAppletContext().showDocument(class58.method1036(24861), "_self");
					return;
				}
				catch(Exception _ex) { }
			}
		}
	}

	public static void method886(byte arg0)
	{
		anIntArray893 = null;
		aClass58_883 = null;
		aClass58_892 = null;
		if(arg0 < 25)
			anInt890 = 77;
	}

	public static void method887(int arg0)
	{
		anInt894++;
		for(int i = 0; Class33_Sub6_Sub13.anInt2992 > i; i++)
		{
			int j = Class27.anIntArray559[i];
			Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[j];
			int k = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			if((0x40 & k) != 0)
			{
				class33_sub6_sub4_sub5_sub2.anInt3564 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
				int l = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method641(120);
				class33_sub6_sub4_sub5_sub2.anInt3524 = Class33_Sub6_Sub6.anInt2785 + (l & 0xffff);
				class33_sub6_sub4_sub5_sub2.anInt3527 = 0;
				if(((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3564 == 65535)
					class33_sub6_sub4_sub5_sub2.anInt3564 = -1;
				class33_sub6_sub4_sub5_sub2.anInt3531 = l >> 0x81799ef0;
				class33_sub6_sub4_sub5_sub2.anInt3511 = 0;
				if(((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3524 > Class33_Sub6_Sub6.anInt2785)
					class33_sub6_sub4_sub5_sub2.anInt3511 = -1;
			}
			if(~(k & 0x80) != -1)
			{
				class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776 = Class46.method922(9, Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(arg0 + 120));
				class33_sub6_sub4_sub5_sub2.anInt3569 = class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.anInt3098;
				class33_sub6_sub4_sub5_sub2.anInt3496 = class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.anInt3085;
				class33_sub6_sub4_sub5_sub2.anInt3506 = class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.anInt3090;
				class33_sub6_sub4_sub5_sub2.anInt3504 = class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.anInt3073;
				class33_sub6_sub4_sub5_sub2.anInt3559 = class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.anInt3107;
				class33_sub6_sub4_sub5_sub2.anInt3541 = class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.anInt3111;
				class33_sub6_sub4_sub5_sub2.anInt3525 = class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.anInt3105;
				class33_sub6_sub4_sub5_sub2.anInt3532 = class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.anInt3106;
				class33_sub6_sub4_sub5_sub2.anInt3522 = class33_sub6_sub4_sub5_sub2.aClass33_Sub6_Sub16_3776.anInt3078;
			}
			if((0x20 & k) != 0)
			{
				class33_sub6_sub4_sub5_sub2.anInt3572 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
				class33_sub6_sub4_sub5_sub2.anInt3535 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(35);
			}
			if((k & 4) != 0)
			{
				int i1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
				int l1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
				class33_sub6_sub4_sub5_sub2.method361(l1, Class33_Sub6_Sub6.anInt2785, (byte)102, i1);
				class33_sub6_sub4_sub5_sub2.anInt3540 = Class33_Sub6_Sub6.anInt2785 + 300;
				class33_sub6_sub4_sub5_sub2.anInt3534 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
				class33_sub6_sub4_sub5_sub2.anInt3495 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(arg0 ^ 0x71);
			}
			if(~(k & 0x10) != -1)
			{
				class33_sub6_sub4_sub5_sub2.anInt3546 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
				if(~((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3546 == 0xffff0000)
					class33_sub6_sub4_sub5_sub2.anInt3546 = -1;
			}
			if(~(8 & k) != -1)
			{
				int j1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(arg0 + 122);
				int i2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(123);
				class33_sub6_sub4_sub5_sub2.method361(i2, Class33_Sub6_Sub6.anInt2785, (byte)102, j1);
				class33_sub6_sub4_sub5_sub2.anInt3540 = 300 + Class33_Sub6_Sub6.anInt2785;
				class33_sub6_sub4_sub5_sub2.anInt3534 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
				class33_sub6_sub4_sub5_sub2.anInt3495 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(117);
			}
			if(~(2 & k) != -1)
			{
				class33_sub6_sub4_sub5_sub2.aClass58_3507 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method646(-110);
				class33_sub6_sub4_sub5_sub2.anInt3551 = 100;
			}
			if(~(k & 1) != -1)
			{
				int k1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-109);
				int j2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
				if(~k1 == 0xffff0000)
					k1 = -1;
				if(k1 != ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3567 || ~k1 == 0)
				{
					if(k1 == -1 || ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3567 == -1 || ~Class33_Sub21.method830(k1, -111).anInt3039 <= ~Class33_Sub21.method830(((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3567, -120).anInt3039)
					{
						class33_sub6_sub4_sub5_sub2.anInt3502 = 0;
						class33_sub6_sub4_sub5_sub2.anInt3505 = ((Class33_Sub6_Sub4_Sub5) (class33_sub6_sub4_sub5_sub2)).anInt3513;
						class33_sub6_sub4_sub5_sub2.anInt3544 = j2;
						class33_sub6_sub4_sub5_sub2.anInt3565 = 0;
						class33_sub6_sub4_sub5_sub2.anInt3567 = k1;
						class33_sub6_sub4_sub5_sub2.anInt3560 = 0;
					}
				} else
				{
					int k2 = Class33_Sub21.method830(k1, arg0 ^ 0xffffff83).anInt3016;
					if(~k2 == -2)
					{
						class33_sub6_sub4_sub5_sub2.anInt3560 = 0;
						class33_sub6_sub4_sub5_sub2.anInt3544 = j2;
						class33_sub6_sub4_sub5_sub2.anInt3565 = 0;
						class33_sub6_sub4_sub5_sub2.anInt3502 = 0;
					}
					if(k2 == 2)
						class33_sub6_sub4_sub5_sub2.anInt3560 = 0;
				}
			}
		}

		if(arg0 != 2)
			aClass58_892 = null;
	}

	public static int method888(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		try
		{
			int i = arg3 + -Class33_Sub6_Sub7_Sub1.anIntArray3678[(arg4 * 1024) / arg2] >> 0x615c6e21;
			anInt896++;
			return (i * arg1 >> 0x55360a50) + (arg0 * (0x10000 + -i) >> 0xa9ca5830);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "m.B(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public Class40()
	{
	}

	public Class40(Class40 arg0)
	{
		try
		{
			anInt886 = arg0.anInt886;
			anInt887 = arg0.anInt887;
			anInt891 = arg0.anInt891;
			anInt898 = arg0.anInt898;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "m.<init>(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt882 = 0;
	public static Class58 aClass58_883;
	public static int anInt884 = 0;
	public static int anInt885;
	public int anInt886;
	public int anInt887;
	public static int anInt888;
	public static int anInt889;
	public static int anInt890 = 0;
	public int anInt891;
	public static Class58 aClass58_892;
	public static int anIntArray893[] = {
		0, 1, 2, 3
	};
	public static int anInt894;
	public static int anInt895 = 0;
	public static int anInt896;
	public static int anInt897;
	public int anInt898;

	static 
	{
		aClass58_892 = Class33_Sub6_Sub11.method535(119, "Error connecting to server)3");
		aClass58_883 = aClass58_892;
	}
}
