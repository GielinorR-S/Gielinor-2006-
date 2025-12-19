// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class57.java

import java.awt.*;
import java.util.zip.Inflater;

public class Class57
{

	public static int method1016(byte arg0, int arg1, int arg2)
	{
		try
		{
			anInt1245++;
			if(arg0 != -93)
				aClass58_1247 = null;
			Class33_Sub12 class33_sub12 = (Class33_Sub12)client.aClass82_1943.method1220(35, arg1);
			if(class33_sub12 == null)
				return 0;
			if(~arg2 == 0)
				return 0;
			int i = 0;
			for(int j = 0; ~class33_sub12.anIntArray2305.length < ~j; j++)
				if(arg2 == class33_sub12.anIntArray2310[j])
					i += class33_sub12.anIntArray2305[j];

			return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qc.G(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public Class57()
	{
		this(-1, 0xf4240, 0xf4240);
	}

	public static void method1017(boolean arg0)
	{
		try
		{
			aClass58_1237 = null;
			aClass58_1253 = null;
			aClass58_1254 = null;
			aClass58_1240 = null;
			aClass58_1250 = null;
			if(arg0)
				method1023(66, 65, -90, 106);
			aClass58_1251 = null;
			aClass58_1246 = null;
			aClass58_1247 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qc.I(" + arg0 + ')');
		}
	}

	public void method1018(Class33_Sub11 arg0, boolean arg1, byte arg2[])
	{
		try
		{
			anInt1249++;
			if(arg0.aByteArray2296[arg0.anInt2239] != 31 || arg0.aByteArray2296[1 + arg0.anInt2239] != -117)
				throw new RuntimeException("Invalid GZIP header!");
			if(anInflater1238 == null)
				anInflater1238 = new Inflater(true);
			try
			{
				anInflater1238.setInput(arg0.aByteArray2296, arg0.anInt2239 - -10, arg0.aByteArray2296.length + -10 + (-arg0.anInt2239 - 8));
				anInflater1238.inflate(arg2);
				if(arg1)
					method1018(null, true, null);
			}
			catch(Exception _ex)
			{
				anInflater1238.reset();
				throw new RuntimeException("Invalid GZIP compressed data!");
			}
			anInflater1238.reset();
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qc.D(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public static int method1019(int arg0, byte arg1, int arg2, int arg3)
	{
		try
		{
			anInt1243++;
			int i = -109 / ((arg1 - -31) / 51);
			if((Class35.aByteArrayArrayArray761[arg0][arg2][arg3] & 8) != 0)
				return 0;
			if(arg0 > 0 && (2 & Class35.aByteArrayArrayArray761[1][arg2][arg3]) != 0)
				return -1 + arg0;
			else
				return arg0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qc.E(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static Class58 method1020(Class58 arg0[], int arg1, int arg2, int arg3)
	{
		try
		{
			anInt1244++;
			int i = 0;
			for(int j = 0; j < arg3; j++)
			{
				if(arg0[j + arg1] == null)
					arg0[arg1 + j] = Applet_Sub1.aClass58_37;
				i += arg0[j + arg1].anInt1893;
			}

			if(arg2 != 1)
				aClass58_1251 = null;
			byte abyte0[] = new byte[i];
			int k = 0;
			for(int l = 0; ~l > ~arg3; l++)
			{
				Class58 class58 = arg0[arg1 + l];
				Class53.method955(class58.aByteArray1894, 0, abyte0, k, class58.anInt1893);
				k += class58.anInt1893;
			}

			Class58 class58_1 = new Class58();
			class58_1.anInt1893 = i;
			class58_1.aByteArray1894 = abyte0;
			return class58_1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qc.B(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static Class58 method1021(int arg0, int arg1)
	{
		try
		{
			anInt1239++;
			if(~arg1 > 0xfffe795f)
				return Class35.method846((byte)-83, new Class58[] {
					Class79.aClass58_1718, Class37.method859(15591, arg1), Class33_Sub6_Sub14.aClass58_3038
				});
			if(arg0 > -88)
				return null;
			if(~arg1 > 0xff67697f)
				return Class35.method846((byte)-83, new Class58[] {
					Class33_Sub13_Sub3.aClass58_3247, Class37.method859(15591, arg1 / 1000), Class33_Sub4.aClass58_2065, Class33_Sub6_Sub14.aClass58_3038
				});
			else
				return Class35.method846((byte)-83, new Class58[] {
					Class33_Sub4.aClass58_2068, Class37.method859(15591, arg1 / 0xf4240), Class58.aClass58_1908, Class33_Sub6_Sub14.aClass58_3038
				});
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qc.H(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static Class30_Sub1 method1022(boolean arg0, int arg1, boolean arg2, boolean arg3, boolean arg4)
	{
		try
		{
			anInt1241++;
			Class12 class12 = null;
			if(Class33.aClass37_742 != null)
				class12 = new Class12(arg1, Class33.aClass37_742, Class70.aClass37Array1502[arg1], 0xf4240);
			if(arg0)
				return null;
			else
				return new Class30_Sub1(class12, Class11.aClass12_196, arg1, arg2, arg3, arg4);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qc.C(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public static void method1023(int arg0, int arg1, int arg2, int arg3)
	{
		anInt1256++;
		int i = 0;
		if(arg0 > -31)
			method1020(null, 74, 95, 7);
		for(; i < 8; i++)
		{
			for(int j = 0; ~j > -9; j++)
				Class30.anIntArrayArrayArray645[arg3][arg2 - -i][j + arg1] = 0;

		}

		if(arg2 > 0)
		{
			for(int k = 1; ~k > -9; k++)
				Class30.anIntArrayArrayArray645[arg3][arg2][k + arg1] = Class30.anIntArrayArrayArray645[arg3][arg2 - 1][arg1 + k];

		}
		if(~arg1 < -1)
		{
			for(int l = 1; l < 8; l++)
				Class30.anIntArrayArrayArray645[arg3][arg2 + l][arg1] = Class30.anIntArrayArrayArray645[arg3][l + arg2][arg1 - 1];

		}
		if(~arg2 >= -1 || Class30.anIntArrayArrayArray645[arg3][arg2 - 1][arg1] == 0)
		{
			if(arg1 <= 0 || ~Class30.anIntArrayArrayArray645[arg3][arg2][-1 + arg1] == -1)
			{
				if(~arg2 < -1 && arg1 > 0 && ~Class30.anIntArrayArrayArray645[arg3][-1 + arg2][-1 + arg1] != -1)
				{
					Class30.anIntArrayArrayArray645[arg3][arg2][arg1] = Class30.anIntArrayArrayArray645[arg3][arg2 - 1][-1 + arg1];
					return;
				}
			} else
			{
				Class30.anIntArrayArrayArray645[arg3][arg2][arg1] = Class30.anIntArrayArrayArray645[arg3][arg2][-1 + arg1];
				return;
			}
		} else
		{
			Class30.anIntArrayArrayArray645[arg3][arg2][arg1] = Class30.anIntArrayArrayArray645[arg3][arg2 + -1][arg1];
		}
	}

	public static void method1024(Color arg0, int arg1, int arg2, Class58 arg3)
	{
		try
		{
			try
			{
				Graphics g = Class33_Sub6_Sub4_Sub1.aCanvas3367.getGraphics();
				if(Class33_Sub10.aFont2222 == null)
				{
					Class33_Sub10.aFont2222 = new Font("Helvetica", 1, 13);
					Class33_Sub9.aFontMetrics2177 = Class33_Sub6_Sub4_Sub1.aCanvas3367.getFontMetrics(Class33_Sub10.aFont2222);
				}
				if(Class33_Sub6_Sub5.aBoolean2752)
				{
					Class33_Sub6_Sub5.aBoolean2752 = false;
					g.setColor(Color.black);
					g.fillRect(0, 0, Class33_Sub13_Sub4.anInt3258, Class15.anInt307);
				}
				if(arg0 == null)
					arg0 = new Color(140, 17, 17);
				try
				{
					if(Class26.anImage546 == null)
						Class26.anImage546 = Class33_Sub6_Sub4_Sub1.aCanvas3367.createImage(304, 34);
					Graphics g1 = Class26.anImage546.getGraphics();
					g1.setColor(arg0);
					g1.drawRect(0, 0, 303, 33);
					g1.fillRect(2, 2, arg2 * 3, 30);
					if(arg1 != -11736)
						method1023(-7, 35, 80, 8);
					g1.setColor(Color.black);
					g1.drawRect(1, 1, 301, 31);
					g1.fillRect(2 - -(3 * arg2), 2, -(3 * arg2) + 300, 30);
					g1.setFont(Class33_Sub10.aFont2222);
					g1.setColor(Color.white);
					arg3.method1064(-90, (-arg3.method1056(Class33_Sub9.aFontMetrics2177, true) + 304) / 2, 22, g1);
					g.drawImage(Class26.anImage546, Class33_Sub13_Sub4.anInt3258 / 2 - 152, -18 + Class15.anInt307 / 2, null);
				}
				catch(Exception _ex)
				{
					int i = Class33_Sub13_Sub4.anInt3258 / 2 + -152;
					int j = Class15.anInt307 / 2 - 18;
					g.setColor(arg0);
					g.drawRect(i, j, 303, 33);
					g.fillRect(i - -2, j - -2, 3 * arg2, 30);
					g.setColor(Color.black);
					g.drawRect(i + 1, 1 + j, 301, 31);
					g.fillRect(i - (-2 - arg2 * 3), 2 + j, 300 - 3 * arg2, 30);
					g.setFont(Class33_Sub10.aFont2222);
					g.setColor(Color.white);
					arg3.method1064(-118, (304 - arg3.method1056(Class33_Sub9.aFontMetrics2177, true)) / 2 + i, 22 + j, g);
				}
			}
			catch(Exception _ex)
			{
				Class33_Sub6_Sub4_Sub1.aCanvas3367.repaint();
			}
			anInt1248++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qc.F(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public Class57(int arg0, int arg1, int arg2)
	{
	}

	public static Class58 aClass58_1237;
	public Inflater anInflater1238;
	public static int anInt1239;
	public static Class58 aClass58_1240 = Class33_Sub6_Sub11.method535(99, "::fpson");
	public static int anInt1241;
	public static int anInt1242;
	public static int anInt1243;
	public static int anInt1244;
	public static int anInt1245;
	public static Class58 aClass58_1246;
	public static Class58 aClass58_1247 = Class33_Sub6_Sub11.method535(101, "m-Ochte sich mit Ihnen duellieren)3");
	public static int anInt1248;
	public static int anInt1249;
	public static Class58 aClass58_1250;
	public static Class58 aClass58_1251;
	public static int anInt1252 = 0;
	public static Class58 aClass58_1253 = Class33_Sub6_Sub11.method535(109, "backbase2");
	public static Class58 aClass58_1254 = Class33_Sub6_Sub11.method535(98, "null");
	public static int anInt1255;
	public static int anInt1256;
	public static int anInt1257;

	static 
	{
		aClass58_1251 = Class33_Sub6_Sub11.method535(125, "Please wait 5 minutes before trying again)3");
		aClass58_1237 = aClass58_1251;
		aClass58_1246 = Class33_Sub6_Sub11.method535(109, "Enter your username (V password)3");
		aClass58_1250 = aClass58_1246;
	}
}
