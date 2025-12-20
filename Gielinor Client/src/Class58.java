// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class58.java

import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class Class58
	implements Interface2
{

	public boolean method1025(int arg0)
	{
		try
		{
			if(arg0 != 30350)
			{
				return true;
			} else
			{
				anInt1858++;
				return method1034(10, (byte)103);
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.P(" + arg0 + ')');
		}
	}

	public Class58 method1026(byte arg0)
	{
		try
		{
			anInt1892++;
			int i;
			for(i = 0; anInt1893 > i && (~aByteArray1894[i] <= -1 && ~aByteArray1894[i] >= -33 || (0xff & aByteArray1894[i]) == 160); i++);
			int j = anInt1893;
			int k = 1 % ((arg0 - -59) / 60);
			for(; ~j < ~i && (aByteArray1894[j + -1] >= 0 && aByteArray1894[j - 1] <= 32 || (0xff & aByteArray1894[j + -1]) == 160); j--);
			if(~i == -1 && anInt1893 == j)
				return this;
			Class58 class58 = new Class58();
			class58.anInt1893 = j - i;
			class58.aByteArray1894 = new byte[class58.anInt1893];
			for(int l = 0; class58.anInt1893 > l; l++)
				class58.aByteArray1894[l] = aByteArray1894[i + l];

			return class58;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.W(" + arg0 + ')');
		}
	}

	public Class58 method1027(byte arg0, int arg1)
	{
		try
		{
			anInt1870++;
			if(~arg1 >= -1 || ~arg1 < -256)
				throw new IllegalArgumentException("invalid char:" + arg1);
			if(!aBoolean1896)
				throw new IllegalArgumentException();
			anInt1872 = 0;
			if(arg0 != -32)
				hashCode();
			if(~aByteArray1894.length == ~anInt1893)
			{
				int i;
				for(i = 1; ~i >= ~anInt1893; i += i);
				byte abyte0[] = new byte[i];
				Class53.method955(aByteArray1894, 0, abyte0, 0, anInt1893);
				aByteArray1894 = abyte0;
			}
			aByteArray1894[anInt1893++] = (byte)arg1;
			return this;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.Q(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class58 method1028(int arg0, byte arg1)
	{
		try
		{
			anInt1860++;
			if(arg1 != 120)
				method1045(false);
			return method1063(arg0, (byte)123, anInt1893);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.IA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class58 method1029(Class58 arg0, int arg1)
	{
		try
		{
			if(arg1 != -12860)
				method1063(112, (byte)-112, -100);
			anInt1866++;
			if(!aBoolean1896)
				throw new IllegalArgumentException();
			anInt1872 = 0;
			if(~aByteArray1894.length > ~(anInt1893 - -arg0.anInt1893))
			{
				int i;
				for(i = 1; i < anInt1893 + arg0.anInt1893; i += i);
				byte abyte0[] = new byte[i];
				Class53.method955(aByteArray1894, 0, abyte0, 0, anInt1893);
				aByteArray1894 = abyte0;
			}
			Class53.method955(arg0.aByteArray1894, 0, aByteArray1894, anInt1893, arg0.anInt1893);
			anInt1893 += arg0.anInt1893;
			return this;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.AA(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static void method1030(Component arg0, int arg1, Class30 arg2, Class30 arg3)
	{
		try
		{
			anInt1901++;
			if(Canvas_Sub1.aBoolean74)
				return;
			Canvas_Sub1.aClass15_64 = Class33_Sub6_Sub8.method512((byte)-112, arg0, 765, 503);
			Canvas_Sub1.aClass15_64.method135(8);
			Class33_Sub6_Sub7.method417();
			byte abyte0[] = arg3.method221(5, Class63.aClass58_1346, Class46.aClass58_1026);
			Class33_Sub16.aClass33_Sub6_Sub7_Sub3_2487 = new Class33_Sub6_Sub7_Sub3(abyte0, arg0);
			Class36.aClass33_Sub6_Sub7_Sub3_787 = Class33_Sub16.aClass33_Sub6_Sub7_Sub3_2487.method484();
			Class33_Sub6_Sub16.aClass33_Sub6_Sub7_Sub4_3116 = Class32.method258(Class63.aClass58_1346, -4236, Class21.aClass58_403, arg2);
			Class33_Sub18.aClass33_Sub6_Sub7_Sub4_2523 = Class32.method258(Class63.aClass58_1346, -4236, Class21.aClass58_392, arg2);
			Class43.aClass33_Sub6_Sub7_Sub4_931 = Class32.method258(Class63.aClass58_1346, -4236, Class33_Sub3.aClass58_2051, arg2);
			Class33_Sub6_Sub15.aClass33_Sub6_Sub7_Sub4Array3065 = Class33_Sub6_Sub10.method526(true, arg2, Class36.aClass58_791, Class63.aClass58_1346);
			Class69.aClass33_Sub6_Sub7_Sub4Array1476 = Class33_Sub6_Sub10.method526(true, arg2, Class33_Sub7.aClass58_2136, Class63.aClass58_1346);
			Class59.anIntArray1269 = new int[256];
			for(int i = 0; i < 64; i++)
				Class59.anIntArray1269[i] = 0x40000 * i;

			for(int j = 0; ~j > -65; j++)
				Class59.anIntArray1269[64 + j] = 0xff0000 + 1024 * j;

			for(int k = 0; k < 64; k++)
				Class59.anIntArray1269[k + 128] = k * 4 + 0xffff00;

			for(int l = 0; l < 64; l++)
				Class59.anIntArray1269[l - -192] = 0xffffff;

			Class33_Sub6_Sub16.anIntArray3093 = new int[256];
			for(int i1 = 0; i1 < 64; i1++)
				Class33_Sub6_Sub16.anIntArray3093[i1] = 1024 * i1;

			for(int j1 = 0; ~j1 > -65; j1++)
				Class33_Sub6_Sub16.anIntArray3093[j1 - -64] = 65280 - -(4 * j1);

			for(int k1 = 0; ~k1 > -65; k1++)
				Class33_Sub6_Sub16.anIntArray3093[k1 + 128] = 65535 + 0x40000 * k1;

			for(int l1 = 0; l1 < 64; l1++)
				Class33_Sub6_Sub16.anIntArray3093[l1 - -192] = 0xffffff;

			Class82.anIntArray1786 = new int[256];
			for(int i2 = 0; ~i2 > -65; i2++)
				Class82.anIntArray1786[i2] = 4 * i2;

			for(int j2 = 0; j2 < 64; j2++)
				Class82.anIntArray1786[j2 - -64] = 255 + j2 * 0x40000;

			for(int k2 = 0; k2 < 64; k2++)
				Class82.anIntArray1786[128 + k2] = 0xff00ff + k2 * 1024;

			if(arg1 < 6)
				aClass58_1906 = null;
			for(int l2 = 0; ~l2 > -65; l2++)
				Class82.anIntArray1786[l2 + 192] = 0xffffff;

			Class38.anIntArray837 = new int[256];
			Class34.anIntArray1827 = new int[32768];
			Class33_Sub6_Sub16.anIntArray3067 = new int[32768];
			Class11.method107(null, -1);
			Class33_Sub6_Sub4_Sub6.anIntArray3596 = new int[32768];
			Class33_Sub6_Sub2.aBoolean2683 = false;
			Class63.aClass58_1350 = Class63.aClass58_1346;
			Class31.anInt696 = 0;
			Class63.aClass58_1341 = Class63.aClass58_1346;
			Class70.anIntArray1488 = new int[32768];
			if(~Class33_Sub6_Sub6.anInt2790 == -1)
				Class33_Sub15.aBoolean2375 = true;
			else
				Class33_Sub15.aBoolean2375 = false;
			if(Class33_Sub15.aBoolean2375)
				Class31.method257(-27742, 2);
			else
				Class33_Sub6_Sub14.method567(Class30_Sub1.aClass30_Sub1_1990, 255, false, Class54.aClass58_1158, Class63.aClass58_1346, 2, false);
			Class73.method1153(false, 68);
			Class33_Sub6_Sub5.aBoolean2752 = true;
			Canvas_Sub1.aBoolean74 = true;
			Class33_Sub16.aClass33_Sub6_Sub7_Sub3_2487.method494(0, 0);
			Class36.aClass33_Sub6_Sub7_Sub3_787.method494(382, 0);
			Class33_Sub6_Sub16.aClass33_Sub6_Sub7_Sub4_3116.method502(382 - Class33_Sub6_Sub16.aClass33_Sub6_Sub7_Sub4_3116.anInt3734 / 2, 18);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.RA(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public int method1031(boolean arg0, int arg1)
	{
		try
		{
			anInt1895++;
			if(arg0)
				return -6;
			else
				return 0xff & aByteArray1894[arg1];
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.N(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method1032(int arg0)
	{
		try
		{
			anInt1867++;
			if(arg0 < 105)
				method1035(-90);
			return method1044(10, (byte)-99);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.O(" + arg0 + ')');
		}
	}

	public String toString()
	{
		try
		{
			anInt1888++;
			throw new RuntimeException();
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.toString(" + ')');
		}
	}

	public Class58 method1033(boolean arg0)
	{
		try
		{
			anInt1881++;
			Class58 class58 = new Class58();
			class58.anInt1893 = anInt1893;
			class58.aByteArray1894 = new byte[anInt1893];
			for(int i = 0; anInt1893 > i; i++)
				class58.aByteArray1894[i] = 42;

			if(arg0)
				anInt1872 = -91;
			return class58;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.CA(" + arg0 + ')');
		}
	}

	public boolean method1034(int arg0, byte arg1)
	{
		try
		{
			anInt1861++;
			boolean flag = false;
			boolean flag1 = false;
			if(~arg0 > -2 || arg0 > 36)
				arg0 = 10;
			int i = 0;
			if(arg1 != 103)
				aBoolean1896 = false;
			for(int j = 0; ~j > ~anInt1893; j++)
			{
				int k = aByteArray1894[j] & 0xff;
				if(j == 0)
				{
					if(k == 45)
					{
						flag = true;
						continue;
					}
					if(k == 43)
						continue;
				}
				if(~k <= -49 && ~k >= -58)
					k -= 48;
				else
				if(k < 65 || ~k < -91)
				{
					if(k >= 97 && ~k >= -123)
						k -= 87;
					else
						return false;
				} else
				{
					k -= 55;
				}
				if(arg0 <= k)
					return false;
				if(flag)
					k = -k;
				int l = arg0 * i - -k;
				if(l / arg0 != i)
					return false;
				i = l;
				flag1 = true;
			}

			return flag1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.M(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method1035(int arg0)
	{
		try
		{
			if(arg0 != 27)
				aBoolean1896 = true;
			anInt1875++;
			return anInt1893;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.H(" + arg0 + ')');
		}
	}

	public URL method1036(int arg0)
		throws MalformedURLException
	{
		try
		{
			if(arg0 != 24861)
				aClass58_1914 = null;
			anInt1889++;
			return new URL(new String(aByteArray1894, 0, anInt1893));
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.DA(" + arg0 + ')');
		}
	}

	public static void method1037(boolean arg0)
	{
		try
		{
			aClass58_1914 = null;
			aClass33_Sub6_Sub7_Sub4Array1919 = null;
			aClass16_1900 = null;
			aClass33_Sub6_Sub7_Sub4_1920 = null;
			aClass58_1918 = null;
			aClass58_1905 = null;
			aClass58_1909 = null;
			aClass58_1917 = null;
			aClass58_1912 = null;
			aClass58_1910 = null;
			aClass58_1916 = null;
			aClass58_1915 = null;
			aClass58_1903 = null;
			aClass58_1906 = null;
			if(arg0)
			{
				return;
			} else
			{
				aClass58_1921 = null;
				aClass33_Sub6_Sub7_Sub3Array1904 = null;
				aClass58_1908 = null;
				aClass30_Sub1_1911 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.BA(" + arg0 + ')');
		}
	}

	public int hashCode()
	{
		try
		{
			anInt1885++;
			return method1054(true);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.hashCode(" + ')');
		}
	}

	public boolean method1038(Class58 arg0, int arg1)
	{
		try
		{
			anInt1864++;
			int i = -21 / ((arg1 - -11) / 53);
			if(arg0 == null)
				return false;
			if(arg0.anInt1893 != anInt1893)
				return false;
			if(!aBoolean1896 || !arg0.aBoolean1896)
			{
				if(~anInt1872 == -1)
				{
					anInt1872 = method1054(true);
					if(~anInt1872 == -1)
						anInt1872 = 1;
				}
				if(~arg0.anInt1872 == -1)
				{
					arg0.anInt1872 = arg0.method1054(true);
					if(~arg0.anInt1872 == -1)
						arg0.anInt1872 = 1;
				}
				if(anInt1872 != arg0.anInt1872)
					return false;
			}
			for(int j = 0; j < anInt1893; j++)
				if(~arg0.aByteArray1894[j] != ~aByteArray1894[j])
					return false;

			return true;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.PA(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public Class58 method1039(int arg0, byte arg1)
	{
		try
		{
			anInt1880++;
			int i = -70 % ((-70 - arg1) / 42);
			if(~arg0 >= -1 || ~arg0 < -256)
			{
				throw new IllegalArgumentException("invalid char");
			} else
			{
				Class58 class58 = new Class58();
				class58.aByteArray1894 = new byte[1 + anInt1893];
				class58.anInt1893 = 1 + anInt1893;
				Class53.method955(aByteArray1894, 0, class58.aByteArray1894, 0, anInt1893);
				class58.aByteArray1894[anInt1893] = (byte)arg0;
				return class58;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.JA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method1040(int arg0, int arg1)
	{
		try
		{
			anInt1887++;
			if(arg0 != 0)
				aClass58_1905 = null;
			return method1049(0, arg1, -75);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.NA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method1041(Class58 arg0, int arg1)
	{
		try
		{
			int i;
			if(anInt1893 <= arg0.anInt1893)
				i = anInt1893;
			else
				i = arg0.anInt1893;
			anInt1899++;
			if(arg1 <= 105)
				method1057(12);
			for(int j = 0; i > j; j++)
			{
				if(~Class33_Sub6_Sub13.anIntArray3006[0xff & aByteArray1894[j]] > ~Class33_Sub6_Sub13.anIntArray3006[0xff & arg0.aByteArray1894[j]])
					return -1;
				if(Class33_Sub6_Sub13.anIntArray3006[aByteArray1894[j] & 0xff] > Class33_Sub6_Sub13.anIntArray3006[0xff & arg0.aByteArray1894[j]])
					return 1;
			}

			if(~anInt1893 > ~arg0.anInt1893)
				return -1;
			return anInt1893 <= arg0.anInt1893 ? 0 : 1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.S(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public long method1042(int arg0)
	{
		try
		{
			long l = 0L;
			anInt1859++;
			for(int i = 0; i < anInt1893; i++)
				l = (long)(aByteArray1894[i] & 0xff) + ((l << 0xd645fa05) + -l);

			int j = 60 / ((arg0 - 49) / 41);
			return l;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.I(" + arg0 + ')');
		}
	}

	public int method1043(Class58 arg0, boolean arg1)
	{
		try
		{
			anInt1882++;
			int i;
			if(~arg0.anInt1893 <= ~anInt1893)
				i = anInt1893;
			else
				i = arg0.anInt1893;
			for(int j = 0; j < i; j++)
			{
				if(~(aByteArray1894[j] & 0xff) > ~(0xff & arg0.aByteArray1894[j]))
					return -1;
				if((0xff & aByteArray1894[j]) > (0xff & arg0.aByteArray1894[j]))
					return 1;
			}

			if(arg1)
				aClass58_1905 = null;
			if(arg0.anInt1893 > anInt1893)
				return -1;
			return arg0.anInt1893 >= anInt1893 ? 0 : 1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.J(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public int method1044(int arg0, byte arg1)
	{
		try
		{
			if(arg0 < 1 || ~arg0 < -37)
				arg0 = 10;
			boolean flag1 = false;
			boolean flag = false;
			anInt1913++;
			int i = 0;
			int j = 0;
			if(arg1 != -99)
				aClass58_1921 = null;
			for(; j < anInt1893; j++)
			{
				int k = 0xff & aByteArray1894[j];
				if(~j == -1)
				{
					if(k == 45)
					{
						flag = true;
						continue;
					}
					if(k == 43)
						continue;
				}
				if(~k > -49 || k > 57)
				{
					if(~k > -66 || k > 90)
					{
						if(k >= 97 && ~k >= -123)
							k -= 87;
						else
							throw new NumberFormatException();
					} else
					{
						k -= 55;
					}
				} else
				{
					k -= 48;
				}
				if(arg0 <= k)
					throw new NumberFormatException();
				if(flag)
					k = -k;
				int l = k + i * arg0;
				if(~i != ~(l / arg0))
					throw new NumberFormatException();
				i = l;
				flag1 = true;
			}

			if(!flag1)
				throw new NumberFormatException();
			else
				return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.K(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class58 method1045(boolean arg0)
	{
		try
		{
			anInt1902++;
			if(!arg0)
				method1030(null, -6, null, null);
			Class58 class58 = new Class58();
			class58.anInt1893 = anInt1893;
			class58.aByteArray1894 = new byte[anInt1893];
			for(int i = 0; ~i > ~anInt1893; i++)
			{
				byte byte0 = aByteArray1894[i];
				if(~byte0 <= -66 && ~byte0 >= -91 || byte0 >= -64 && byte0 <= -34 && byte0 != -41)
					byte0 += 32;
				class58.aByteArray1894[i] = byte0;
			}

			return class58;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.EA(" + arg0 + ')');
		}
	}

	public boolean equals(Object arg0)
	{
		try
		{
			anInt1878++;
			if(arg0 instanceof Class58)
				return method1038((Class58)arg0, -94);
			else
				throw new IllegalArgumentException();
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.equals(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public int method1046(byte arg0, Class58 arg1)
	{
		try
		{
			if(arg0 > -58)
			{
				return -107;
			} else
			{
				anInt1876++;
				return method1051(true, arg1, 0);
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.D(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public boolean method1047(Class58 arg0, byte arg1)
	{
		try
		{
			anInt1856++;
			if(arg0.anInt1893 > anInt1893)
				return false;
			int i = anInt1893 - arg0.anInt1893;
			for(int j = 0; ~arg0.anInt1893 < ~j; j++)
				if(aByteArray1894[j - -i] != arg0.aByteArray1894[j])
					return false;

			return arg1 == -8 ? true : true;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.U(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public Class58 method1048(int arg0)
	{
		try
		{
			anInt1891++;
			if(arg0 != 57)
				aClass58_1905 = null;
			if(!aBoolean1896)
				throw new IllegalArgumentException();
			anInt1872 = 0;
			if(anInt1893 != aByteArray1894.length)
			{
				byte abyte0[] = new byte[anInt1893];
				Class53.method955(aByteArray1894, 0, abyte0, 0, anInt1893);
				aByteArray1894 = abyte0;
			}
			return this;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.T(" + arg0 + ')');
		}
	}

	public int method1049(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt1869++;
			if(arg2 > -50)
				method1041(null, -102);
			byte byte0 = (byte)arg1;
			for(int i = arg0; anInt1893 > i; i++)
				if(byte0 == aByteArray1894[i])
					return i;

			return -1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.B(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static void method1050(Applet_Sub1 arg0, int arg1)
	{
		anInt1890++;
		if(Class33_Sub6_Sub2.aBoolean2683)
		{
			Class40.method885(arg0, true);
			return;
		}
		if(~Class69.anInt1464 == -2 && ~Class82.anInt1794 <= -716 && Class48.anInt1055 >= 453)
		{
			Class33_Sub15.aBoolean2375 = !Class33_Sub15.aBoolean2375;
			if(Class33_Sub15.aBoolean2375)
				Class78.method1185(3);
			else
				Class12.method117(Class54.aClass58_1158, Class63.aClass58_1346, false, 10500, Class30_Sub1.aClass30_Sub1_1990, 255);
		}
		if(Class23.anInt485 == 5)
			return;
		Class14.anInt287++;
		if(~Class23.anInt485 != -11)
			return;
		if(~Class33_Sub2.anInt2023 != -3 && Class75.anInt1617 == 0)
		{
			if(Class69.anInt1464 == 1)
			{
				char c = '\u01CF';
				byte byte1 = 100;
				byte byte2 = 35;
				byte byte0 = 5;
				if(byte0 <= Class82.anInt1794 && ~Class82.anInt1794 >= ~(byte0 + byte1) && c <= Class48.anInt1055 && ~Class48.anInt1055 >= ~(c + byte2))
				{
					Class33_Sub19.method818((byte)110);
					return;
				}
			}
			if(Class33_Sub6_Sub10.aClass36_2881 != null)
				Class33_Sub19.method818((byte)110);
		}
		int i = Class69.anInt1464;
		int j = Class82.anInt1794;
		int k = Class48.anInt1055;
		int l = -64 / ((38 - arg1) / 40);
		if(Class31.anInt696 == 0)
		{
			char c3 = '\u0123';
			char c1 = '\u012E';
			if(~i == -2 && ~(c1 - 75) >= ~j && c1 - -75 >= j && ~k <= ~(c3 + -20) && c3 + 20 >= k)
			{
				Class31.anInt701 = 0;
				Class31.anInt696 = 3;
			}
			c1 = '\u01CE';
			if(~i == -2 && j >= c1 - 75 && ~j >= ~(c1 - -75) && k >= c3 - 20 && k <= 20 + c3)
			{
				Class63.aClass58_1356 = Class23.aClass58_453;
				Class63.aClass58_1334 = Class57.aClass58_1250;
				Class31.anInt701 = 0;
				Class31.anInt696 = 2;
				Class63.aClass58_1343 = Class23.aClass58_435;
				return;
			}
		} else
		{
			if(~Class31.anInt696 == -3)
			{
				int i1 = 231;
				i1 += 30;
				if(i == 1 && ~k <= ~(i1 - 15) && k < i1)
					Class31.anInt701 = 0;
				i1 += 15;
				if(i == 1 && ~k <= ~(-15 + i1) && ~k > ~i1)
					Class31.anInt701 = 1;
				char c6 = '\u0141';
				i1 += 15;
				char c4 = '\u012E';
				if(~i == -2 && j >= -75 + c4 && ~j >= ~(c4 + 75) && ~k <= ~(-20 + c6) && ~(20 + c6) <= ~k)
				{
					Class63.aClass58_1350 = Class63.aClass58_1350.method1053(true).method1065(-119);
					if(~Class63.aClass58_1350.method1035(27) == -1)
					{
						Class19.method166(Class23.aClass58_471, false, Class23.aClass58_479, Class33_Sub6_Sub4_Sub5.aClass58_3568);
						return;
					}
					if(~Class63.aClass58_1341.method1035(27) == -1)
					{
						Class19.method166(Class23.aClass58_439, false, Class23.aClass58_478, Class33_Sub6_Sub4_Sub1.aClass58_3359);
						return;
					} else
					{
						Class19.method166(Class23.aClass58_434, false, Class23.aClass58_463, Class33_Sub20.aClass58_2573);
						Class29.method215(20, (byte)-47);
						return;
					}
				}
				c4 = '\u01CE';
				if(i == 1 && ~j <= ~(-75 + c4) && j <= c4 - -75 && k >= c6 - 20 && k <= c6 + 20)
				{
					Class63.aClass58_1341 = Class63.aClass58_1346;
					Class63.aClass58_1350 = Class63.aClass58_1346;
					Class31.anInt696 = 0;
				}
				while(Class39.method877((byte)107)) 
				{
					boolean flag = false;
					for(int j1 = 0; ~j1 > ~Class51.aClass58_1107.method1035(27); j1++)
					{
						if(~Class41.anInt906 != ~Class51.aClass58_1107.method1031(false, j1))
							continue;
						flag = true;
						break;
					}

					if(~Class31.anInt701 != -1)
					{
						if(Class31.anInt701 == 1)
						{
							if(~Class49.anInt1073 == -86 && ~Class63.aClass58_1341.method1035(27) < -1)
								Class63.aClass58_1341 = Class63.aClass58_1341.method1063(0, (byte)126, Class63.aClass58_1341.method1035(27) + -1);
							if(Class49.anInt1073 == 84 || Class49.anInt1073 == 80)
								Class31.anInt701 = 0;
							if(flag && Class63.aClass58_1341.method1035(27) < 20)
								Class63.aClass58_1341 = Class63.aClass58_1341.method1039(Class41.anInt906, (byte)-122);
						}
					} else
					{
						if(~Class49.anInt1073 == -86 && ~Class63.aClass58_1350.method1035(27) < -1)
							Class63.aClass58_1350 = Class63.aClass58_1350.method1063(0, (byte)120, -1 + Class63.aClass58_1350.method1035(27));
						if(Class49.anInt1073 == 84 || ~Class49.anInt1073 == -81)
							Class31.anInt701 = 1;
						if(flag && Class63.aClass58_1350.method1035(27) < 12)
							Class63.aClass58_1350 = Class63.aClass58_1350.method1039(Class41.anInt906, (byte)66);
					}
				}
				return;
			}
			if(~Class31.anInt696 == -4)
			{
				char c2 = '\u017E';
				char c5 = '\u0141';
				if(i == 1 && j >= c2 + -75 && j <= c2 - -75 && c5 - 20 <= k && 20 + c5 >= k)
					Class31.anInt696 = 0;
			}
		}
	}

	public int method1051(boolean arg0, Class58 arg1, int arg2)
	{
		try
		{
			anInt1883++;
			int ai[] = new int[arg1.anInt1893];
			int ai1[] = new int[256];
			int ai2[] = new int[arg1.anInt1893];
			for(int i = 0; ~i > ~ai1.length; i++)
				ai1[i] = arg1.anInt1893;

			for(int j = 1; arg1.anInt1893 >= j; j++)
			{
				ai[j + -1] = -j + (arg1.anInt1893 << 0xd4ddc281);
				ai1[Class12.method110(255, arg1.aByteArray1894[-1 + j])] = -j + arg1.anInt1893;
			}

			int k = arg1.anInt1893 - -1;
			for(int l = arg1.anInt1893; l > 0; l--)
			{
				ai2[-1 + l] = k;
				for(; k <= arg1.anInt1893 && arg1.aByteArray1894[l - 1] != arg1.aByteArray1894[k - 1]; k = ai2[k + -1])
					if(~ai[k + -1] <= ~(-l + arg1.anInt1893))
						ai[k - 1] = arg1.anInt1893 + -l;

				k--;
			}

			if(!arg0)
				method1051(false, null, 90);
			int i1 = k;
			int j1 = 1;
			k = -i1 + 1 + arg1.anInt1893;
			int k1 = 0;
			for(int l1 = 1; ~k <= ~l1;)
			{
				ai2[l1 - 1] = k1;
				for(; k1 >= 1 && ~arg1.aByteArray1894[-1 + k1] != ~arg1.aByteArray1894[l1 - 1]; k1 = ai2[-1 + k1]);
				l1++;
				k1++;
			}

			while(i1 < arg1.anInt1893) 
			{
				for(int i2 = j1; ~i2 >= ~i1; i2++)
					if(~ai[-1 + i2] <= ~(i1 + (arg1.anInt1893 + -i2)))
						ai[i2 + -1] = i1 + (arg1.anInt1893 - i2);

				j1 = 1 + i1;
				i1 -= -k - -ai2[-1 + k];
				k = ai2[-1 + k];
			}
			int k2;
			for(int j2 = -1 + (arg2 - -arg1.anInt1893); anInt1893 > j2; j2 += Math.max(ai1[aByteArray1894[j2] & 0xff], ai[k2]))
			{
				for(k2 = arg1.anInt1893 + -1; ~k2 <= -1 && ~aByteArray1894[j2] == ~arg1.aByteArray1894[k2]; k2--)
					j2--;

				if(k2 == -1)
					return j2 - -1;
			}

			return -1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.GA(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ')');
		}
	}

	public boolean method1052(Class58 arg0, int arg1)
	{
		try
		{
			anInt1857++;
			if(arg1 >= -60)
				method1058(-2, (byte)-2);
			if(~anInt1893 > ~arg0.anInt1893)
				return false;
			for(int i = 0; arg0.anInt1893 > i; i++)
				if(arg0.aByteArray1894[i] != aByteArray1894[i])
					return false;

			return true;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.R(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public Class58 method1053(boolean arg0)
	{
		try
		{
			anInt1868++;
			Class58 class58 = new Class58();
			class58.anInt1893 = 0;
			class58.aByteArray1894 = new byte[12];
			int i = 0;
			if(!arg0)
				method1045(true);
			for(int j = 0; anInt1893 > j; j++)
			{
				if(~aByteArray1894[j] <= -66 && ~aByteArray1894[j] >= -91)
				{
					class58.aByteArray1894[i++] = (byte)(97 + (aByteArray1894[j] - 65));
					class58.anInt1893 = i;
				} else
				if((~aByteArray1894[j] > -98 || aByteArray1894[j] > 122) && (~aByteArray1894[j] > -49 || aByteArray1894[j] > 57))
				{
					if(i > 0)
						class58.aByteArray1894[i++] = 95;
				} else
				{
					class58.aByteArray1894[i++] = aByteArray1894[j];
					class58.anInt1893 = i;
				}
				if(~i == -13)
					break;
			}

			return class58;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.G(" + arg0 + ')');
		}
	}

	public int method1054(boolean arg0)
	{
		try
		{
			anInt1879++;
			int i = 0;
			if(!arg0)
				aClass58_1910 = null;
			for(int j = 0; anInt1893 > j; j++)
				i = -i + ((i << 0x83b22645) + (0xff & aByteArray1894[j]));

			return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.C(" + arg0 + ')');
		}
	}

	public int method1055(int arg0, byte arg1[], int arg2, byte arg3, int arg4)
	{
		try
		{
			if(arg3 < 24)
				aClass58_1917 = null;
			Class53.method955(aByteArray1894, arg2, arg1, arg4, arg0 - arg2);
			anInt1873++;
			return arg0 - arg2;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.F(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public int method1056(FontMetrics arg0, boolean arg1)
	{
		try
		{
			anInt1863++;
			String s;
			try
			{
				if(!arg1)
					return -8;
				s = new String(aByteArray1894, 0, anInt1893, "ISO-8859-1");
			}
			catch(UnsupportedEncodingException _ex)
			{
				s = new String(aByteArray1894, 0, anInt1893);
			}
			return arg0.stringWidth(s);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.FA(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public Class58 method1057(int arg0)
	{
		try
		{
			anInt1898++;
			long l = method1042(-35);
			synchronized(Class58.class)
			{
				if(Class33_Sub21.aClass82_2586 == null)
				{
					Class33_Sub21.aClass82_2586 = new Class82(4096);
				} else
				{
					for(Class33_Sub3 class33_sub3 = (Class33_Sub3)Class33_Sub21.aClass82_2586.method1220(109, l); class33_sub3 != null; class33_sub3 = (Class33_Sub3)Class33_Sub21.aClass82_2586.method1219(false))
						if(method1038(class33_sub3.aClass58_2045, -106))
						{
							Class58 class58 = class33_sub3.aClass58_2045;
							return class58;
						}

				}
				if(arg0 != 4096)
					aClass33_Sub6_Sub7_Sub3Array1904 = null;
				Class33_Sub3 class33_sub3_1 = new Class33_Sub3();
				class33_sub3_1.aClass58_2045 = this;
				aBoolean1896 = false;
				Class33_Sub21.aClass82_2586.method1218(class33_sub3_1, (byte)-110, l);
			}
			return this;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.E(" + arg0 + ')');
		}
	}

	public static int method1058(int arg0, byte arg1)
	{
		try
		{
			anInt1897++;
			int i = 0;
			if(arg0 < 0 || ~arg0 <= 0xfffeffff)
			{
				arg0 >>>= 16;
				i += 16;
			}
			if(arg0 >= 256)
			{
				i += 8;
				arg0 >>>= 8;
			}
			if(arg0 >= 16)
			{
				i += 4;
				arg0 >>>= 4;
			}
			if(arg0 >= 4)
			{
				i += 2;
				arg0 >>>= 2;
			}
			if(~arg0 <= -2)
			{
				arg0 >>>= 1;
				i++;
			}
			if(arg1 != -98)
				method1050(null, -117);
			return i + arg0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.V(" + arg0 + ',' + arg1 + ')');
		}
	}

	public boolean method1059(int arg0, Class58 arg1)
	{
		try
		{
			anInt1886++;
			if(arg1 == null)
				return false;
			if(arg0 != -1)
				return false;
			if(~anInt1893 != ~arg1.anInt1893)
				return false;
			for(int i = 0; ~i > ~anInt1893; i++)
			{
				byte byte0 = aByteArray1894[i];
				if(byte0 >= 65 && byte0 <= 90 || ~byte0 <= 63 && byte0 <= -34 && byte0 != -41)
					byte0 += 32;
				byte byte1 = arg1.aByteArray1894[i];
				if(byte1 >= 65 && ~byte1 >= -91 || byte1 >= -64 && byte1 <= -34 && ~byte1 != 40)
					byte1 += 32;
				if(~byte1 != ~byte0)
					return false;
			}

			return true;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.L(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public byte[] method1060(int arg0)
	{
		try
		{
			if(arg0 < 117)
			{
				return null;
			} else
			{
				anInt1871++;
				byte abyte0[] = new byte[anInt1893];
				Class53.method955(aByteArray1894, 0, abyte0, 0, anInt1893);
				return abyte0;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.LA(" + arg0 + ')');
		}
	}

	public Class58 method1061(int arg0)
	{
		try
		{
			byte byte0 = 2;
			Class58 class58 = new Class58();
			class58.anInt1893 = anInt1893;
			class58.aByteArray1894 = new byte[anInt1893];
			for(int i = 0; anInt1893 > i; i++)
			{
				byte byte1 = aByteArray1894[i];
				if(~byte1 <= -98 && byte1 <= 122 || byte1 >= -32 && ~byte1 >= 1 && byte1 != -9)
				{
					if(byte0 == 2)
						byte1 -= 32;
					byte0 = 0;
				} else
				if((byte1 < 65 || byte1 > 90) && (~byte1 > 63 || ~byte1 < 33 || byte1 == -41))
				{
					if(~byte1 == -47 || byte1 == 33 || byte1 == 63)
						byte0 = 2;
					else
					if(~byte1 != -33)
						byte0 = 1;
					else
					if(byte0 != 2)
						byte0 = 1;
				} else
				{
					if(byte0 == 0)
						byte1 += 32;
					byte0 = 0;
				}
				class58.aByteArray1894[i] = byte1;
			}

			if(arg0 > -48)
			{
				return null;
			} else
			{
				anInt1874++;
				return class58;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.QA(" + arg0 + ')');
		}
	}

	public long method1062(byte arg0)
	{
		try
		{
			if(arg0 != 11)
				aClass33_Sub6_Sub7_Sub3Array1904 = null;
			anInt1877++;
			long l = 0L;
			for(int i = 0; ~anInt1893 < ~i && ~i > -13; i++)
			{
				l *= 37L;
				byte byte0 = aByteArray1894[i];
				if(byte0 >= 65 && ~byte0 >= -91)
					l += byte0 + -64;
				else
				if(~byte0 <= -98 && byte0 <= 122)
					l += 1 + byte0 + -97;
				else
				if(byte0 >= 48 && ~byte0 >= -58)
					l += -48 + (27 + byte0);
			}

			for(; l % 37L == 0L && l != 0L; l /= 37L);
			return l;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.OA(" + arg0 + ')');
		}
	}

	public Class58 method1063(int arg0, byte arg1, int arg2)
	{
		try
		{
			anInt1865++;
			Class58 class58 = new Class58();
			if(arg1 < 118)
				aClass58_1917 = null;
			class58.aByteArray1894 = new byte[-arg0 + arg2];
			class58.anInt1893 = -arg0 + arg2;
			Class53.method955(aByteArray1894, arg0, class58.aByteArray1894, 0, class58.anInt1893);
			return class58;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.MA(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method1064(int arg0, int arg1, int arg2, Graphics arg3)
	{
		try
		{
			if(arg0 > -56)
				aClass58_1909 = null;
			anInt1862++;
			String s;
			try
			{
				s = new String(aByteArray1894, 0, anInt1893, "ISO-8859-1");
			}
			catch(UnsupportedEncodingException _ex)
			{
				s = new String(aByteArray1894, 0, anInt1893);
			}
			arg3.drawString(s, arg1, arg2);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.A(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public Class58 method1065(int arg0)
	{
		try
		{
			anInt1884++;
			Class58 class58 = new Class58();
			boolean flag = true;
			class58.anInt1893 = anInt1893;
			class58.aByteArray1894 = new byte[anInt1893];
			if(arg0 >= -88)
				return null;
			for(int i = 0; ~anInt1893 < ~i; i++)
			{
				byte byte0 = aByteArray1894[i];
				if(~byte0 == -96)
				{
					flag = true;
					class58.aByteArray1894[i] = 32;
				} else
				if(~byte0 > -98 || byte0 > 122 || !flag)
				{
					flag = false;
					class58.aByteArray1894[i] = byte0;
				} else
				{
					flag = false;
					class58.aByteArray1894[i] = (byte)(-32 + byte0);
				}
			}

			return class58;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qf.HA(" + arg0 + ')');
		}
	}

	public Class58()
	{
		aBoolean1896 = true;
	}

	public static int anInt1856;
	public static int anInt1857;
	public static int anInt1858;
	public static int anInt1859;
	public static int anInt1860;
	public static int anInt1861;
	public static int anInt1862;
	public static int anInt1863;
	public static int anInt1864;
	public static int anInt1865;
	public static int anInt1866;
	public static int anInt1867;
	public static int anInt1868;
	public static int anInt1869;
	public static int anInt1870;
	public static int anInt1871;
	public int anInt1872;
	public static int anInt1873;
	public static int anInt1874;
	public static int anInt1875;
	public static int anInt1876;
	public static int anInt1877;
	public static int anInt1878;
	public static int anInt1879;
	public static int anInt1880;
	public static int anInt1881;
	public static int anInt1882;
	public static int anInt1883;
	public static int anInt1884;
	public static int anInt1885;
	public static int anInt1886;
	public static int anInt1887;
	public static int anInt1888;
	public static int anInt1889;
	public static int anInt1890;
	public static int anInt1891;
	public static int anInt1892;
	public int anInt1893;
	public byte aByteArray1894[];
	public static int anInt1895;
	public boolean aBoolean1896;
	public static int anInt1897;
	public static int anInt1898;
	public static int anInt1899;
	public static Class16 aClass16_1900 = new Class16(100);
	public static int anInt1901;
	public static int anInt1902;
	public static Class58 aClass58_1903;
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3Array1904[];
	public static Class58 aClass58_1905;
	public static Class58 aClass58_1906;
	public static int anInt1907;
	public static Class58 aClass58_1908;
	public static Class58 aClass58_1909 = Class33_Sub6_Sub11.method535(111, "RuneScape wird geladen )2 bitte warten)3)3)3");
	public static Class58 aClass58_1910;
	public static Class30_Sub1 aClass30_Sub1_1911;
	public static Class58 aClass58_1912 = Class33_Sub6_Sub11.method535(107, "scrollbar");
	public static int anInt1913;
	public static Class58 aClass58_1914;
	public static Class58 aClass58_1915;
	public static Class58 aClass58_1916 = Class33_Sub6_Sub11.method535(114, "backleft1");
	public static Class58 aClass58_1917 = Class33_Sub6_Sub11.method535(123, "Die Verbindung konnte");
	public static Class58 aClass58_1918;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4Array1919[];
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_1920;
	public static Class58 aClass58_1921;
	public static int anInt1922 = 0;

	static 
	{
		aClass58_1906 = Class33_Sub6_Sub11.method535(113, "Enter name:");
		aClass58_1910 = Class33_Sub6_Sub11.method535(112, " is already on your ignore list");
		aClass58_1905 = Class33_Sub6_Sub11.method535(122, " seconds)3");
		aClass58_1921 = aClass58_1910;
		aClass58_1918 = aClass58_1905;
		aClass58_1915 = Class33_Sub6_Sub11.method535(124, "M");
		aClass58_1908 = aClass58_1915;
		aClass58_1914 = aClass58_1906;
		aClass58_1903 = aClass58_1915;
	}
}
