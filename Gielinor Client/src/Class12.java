// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class12.java

import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Method;

public class Class12
{

	public byte[] method109(byte arg0, int arg1)
	{
		try
		{
			anInt214++;
			synchronized(aClass37_222)
			{
				byte abyte8[];
				try
				{
					if((long)(arg1 * 6 + 6) > aClass37_228.method867(-21138))
					{
						byte abyte0[] = null;
						return abyte0;
					}
					aClass37_228.method855(6 * arg1, -115);
					if(arg0 > -98)
					{
						byte abyte1[] = null;
						return abyte1;
					}
					aClass37_228.method863(Class9.aByteArray176, 0, 6, (byte)42);
					int j = ((0xff & Class9.aByteArray176[3]) << 0x5687e950) - -((0xff & Class9.aByteArray176[4]) << 0xc7333488) - -(0xff & Class9.aByteArray176[5]);
					int i = (0xff & Class9.aByteArray176[2]) + ((Class9.aByteArray176[0] << 0x81cd1930 & 0xff0000) - -((Class9.aByteArray176[1] & 0xff) << 0xef9f2968));
					if(~i > -1 || i > anInt231)
					{
						byte abyte2[] = null;
						return abyte2;
					}
					if(j <= 0 || ~(aClass37_222.method867(-21138) / 520L) > ~(long)j)
					{
						byte abyte3[] = null;
						return abyte3;
					}
					int k = 0;
					int l = 0;
					byte abyte9[] = new byte[i];
					while(k < i) 
					{
						if(j == 0)
						{
							byte abyte4[] = null;
							return abyte4;
						}
						aClass37_222.method855(j * 520, 121);
						int i1 = i - k;
						if(~i1 < -513)
							i1 = 512;
						aClass37_222.method863(Class9.aByteArray176, 0, 8 + i1, (byte)42);
						int k1 = (Class9.aByteArray176[3] & 0xff) + ((0xff & Class9.aByteArray176[2]) << 0x125c7b68);
						int i2 = Class9.aByteArray176[7] & 0xff;
						int j1 = (Class9.aByteArray176[1] & 0xff) + ((Class9.aByteArray176[0] & 0xff) << 0x467773c8);
						int l1 = (0xff & Class9.aByteArray176[6]) + (((Class9.aByteArray176[4] & 0xff) << 0xeaa39990) + (0xff00 & Class9.aByteArray176[5] << 0xa9e8f108));
						if(~j1 != ~arg1 || ~l != ~k1 || ~i2 != ~anInt213)
						{
							byte abyte5[] = null;
							return abyte5;
						}
						if(~l1 > -1 || aClass37_222.method867(-21138) / 520L < (long)l1)
						{
							byte abyte6[] = null;
							return abyte6;
						}
						l++;
						for(int j2 = 0; j2 < i1; j2++)
							abyte9[k++] = Class9.aByteArray176[8 + j2];

						j = l1;
					}
					byte abyte7[] = abyte9;
					return abyte7;
				}
				catch(IOException _ex)
				{
					abyte8 = null;
				}
				return abyte8;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ca.F(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static int method110(int arg0, int arg1)
	{
		try
		{
			return arg0 & arg1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ca.G(" + arg0 + ',' + arg1 + ')');
		}
	}

	public String toString()
	{
		try
		{
			anInt224++;
			return "Cache:" + anInt213;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ca.toString(" + ')');
		}
	}

	public boolean method111(boolean arg0, byte arg1[], int arg2, int arg3, int arg4)
	{
		try
		{
			anInt212++;
			synchronized(aClass37_222)
			{
				boolean flag5;
				try
				{
					int i;
					if(arg0)
					{
						if((long)(6 + arg3 * 6) > aClass37_228.method867(arg4 + -21138))
						{
							boolean flag = false;
							return flag;
						}
						aClass37_228.method855(6 * arg3, 119);
						aClass37_228.method863(Class9.aByteArray176, 0, 6, (byte)42);
						i = ((Class9.aByteArray176[4] & 0xff) << 0x77485008) + (0xff0000 & Class9.aByteArray176[3] << 0xe0645d90) + (0xff & Class9.aByteArray176[5]);
						if(i <= 0 || aClass37_222.method867(arg4 ^ 0xffffad6e) / 520L < (long)i)
						{
							boolean flag1 = false;
							return flag1;
						}
					} else
					{
						i = (int)((519L + aClass37_222.method867(-21138)) / 520L);
						if(~i == -1)
							i = 1;
					}
					Class9.aByteArray176[5] = (byte)i;
					Class9.aByteArray176[0] = (byte)(arg2 >> 0xe00b6cd0);
					Class9.aByteArray176[1] = (byte)(arg2 >> 0x6b495aa8);
					int j = arg4;
					Class9.aByteArray176[2] = (byte)arg2;
					Class9.aByteArray176[3] = (byte)(i >> 0x1261eb70);
					int k = 0;
					Class9.aByteArray176[4] = (byte)(i >> 0x93dcb5c8);
					aClass37_228.method855(arg3 * 6, arg4 ^ 0xffffffc3);
					aClass37_228.method857(Class9.aByteArray176, 0, -1177, 6);
					int j1;
					for(; arg2 > j; j += j1)
					{
						int l = 0;
						if(arg0)
						{
							aClass37_222.method855(i * 520, 115);
							try
							{
								aClass37_222.method863(Class9.aByteArray176, 0, 8, (byte)42);
							}
							catch(EOFException _ex)
							{
								break;
							}
							l = (Class9.aByteArray176[6] & 0xff) + (((Class9.aByteArray176[4] & 0xff) << 0x8ef91290) + (0xff00 & Class9.aByteArray176[5] << 0x8bf4c188));
							int i1 = (Class9.aByteArray176[1] & 0xff) + (0xff00 & Class9.aByteArray176[0] << 0xaec66fa8);
							int l1 = Class9.aByteArray176[7] & 0xff;
							int k1 = ((Class9.aByteArray176[2] & 0xff) << 0xcfee0de8) + (Class9.aByteArray176[3] & 0xff);
							if(~i1 != ~arg3 || k != k1 || l1 != anInt213)
							{
								boolean flag2 = false;
								return flag2;
							}
							if(~l > -1 || (long)l > aClass37_222.method867(arg4 ^ 0xffffad6e) / 520L)
							{
								boolean flag3 = false;
								return flag3;
							}
						}
						if(l == 0)
						{
							arg0 = false;
							l = (int)((aClass37_222.method867(arg4 ^ 0xffffad6e) - -519L) / 520L);
							if(~l == -1)
								l++;
							if(i == l)
								l++;
						}
						Class9.aByteArray176[0] = (byte)(arg3 >> 0x5ea578e8);
						Class9.aByteArray176[3] = (byte)k;
						if(~(-j + arg2) >= -513)
							l = 0;
						Class9.aByteArray176[2] = (byte)(k >> 0x42052828);
						Class9.aByteArray176[6] = (byte)l;
						Class9.aByteArray176[5] = (byte)(l >> 0xf6dd36c8);
						Class9.aByteArray176[4] = (byte)(l >> 0x4c017c70);
						Class9.aByteArray176[7] = (byte)anInt213;
						j1 = arg2 - j;
						if(j1 > 512)
							j1 = 512;
						k++;
						Class9.aByteArray176[1] = (byte)arg3;
						aClass37_222.method855(i * 520, 117);
						i = l;
						aClass37_222.method857(Class9.aByteArray176, 0, -1177, 8);
						aClass37_222.method857(arg1, j, -1177, j1);
					}

					boolean flag4 = true;
					return flag4;
				}
				catch(IOException _ex)
				{
					flag5 = false;
				}
				return flag5;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ca.D(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public static void method112(int arg0)
	{
		try
		{
			aClass58_208 = null;
			aClass58_206 = null;
			anIntArray237 = null;
			aClass58_215 = null;
			aClass58_236 = null;
			aClass33_Sub6_Sub7_Sub4Array232 = null;
			aClass58_219 = null;
			aClass58_217 = null;
			aClass58_244 = null;
			aClass58_235 = null;
			aClass58_223 = null;
			aByteArrayArrayArray239 = null;
			if(arg0 > -57)
				method112(-118);
			aClass58_216 = null;
			aClass58_211 = null;
			aClass58_243 = null;
			aClass58_234 = null;
			aClass58_207 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ca.H(" + arg0 + ')');
		}
	}

	public static void method113(byte arg0, Component arg1)
	{
		anInt240++;
		Method method = Class72.aMethod1529;
		if(method != null)
			try
			{
				method.invoke(arg1, new Object[] {
					Boolean.FALSE
				});
			}
			catch(Throwable _ex) { }
		arg1.addKeyListener(Class33_Sub19.aClass81_2535);
		arg1.addFocusListener(Class33_Sub19.aClass81_2535);
		if(arg0 != -84)
			anInt227 = -61;
	}

	public static void method114(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7)
	{
		anInt230++;
		int i = -54 % ((-27 - arg0) / 45);
		if(~arg1 <= -2 && ~arg7 <= -2 && arg1 <= 102 && arg7 <= 102)
		{
			if(Class33_Sub3.aBoolean2058 && ~Class77_Sub2.anInt2645 != ~arg3)
				return;
			int j = 0;
			if(arg2 == 0)
				j = Class33_Sub2.aClass56_2035.method978(arg3, arg1, arg7);
			if(arg2 == 1)
				j = Class33_Sub2.aClass56_2035.method988(arg3, arg1, arg7);
			byte byte0 = -1;
			if(~arg2 == -3)
				j = Class33_Sub2.aClass56_2035.method1007(arg3, arg1, arg7);
			if(~arg2 == -4)
				j = Class33_Sub2.aClass56_2035.method971(arg3, arg1, arg7);
			boolean flag = false;
			boolean flag1 = false;
			if(j != 0)
			{
				int k = (0x1ffffae4 & j) >> 0x2165ccce;
				int j1 = Class33_Sub2.aClass56_2035.method980(arg3, arg1, arg7, j);
				int l = 0x1f & j1;
				int i1 = j1 >> 0xa10c90e6 & 3;
				if(arg2 == 0)
				{
					Class33_Sub2.aClass56_2035.method965(arg3, arg1, arg7);
					Class33_Sub6_Sub17 class33_sub6_sub17 = Class33_Sub5.method285((byte)-62, k);
					if(~class33_sub6_sub17.anInt3159 != -1)
						Class51.aClass70Array1098[arg3].method1122(class33_sub6_sub17.aBoolean3184, -5932, arg7, arg1, l, i1);
				}
				if(arg2 == 1)
					Class33_Sub2.aClass56_2035.method984(arg3, arg1, arg7);
				if(~arg2 == -3)
				{
					Class33_Sub2.aClass56_2035.method1008(arg3, arg1, arg7);
					Class33_Sub6_Sub17 class33_sub6_sub17_1 = Class33_Sub5.method285((byte)-112, k);
					if(class33_sub6_sub17_1.anInt3181 + arg1 > 103 || class33_sub6_sub17_1.anInt3181 + arg7 > 103 || arg1 + class33_sub6_sub17_1.anInt3165 > 103 || ~(arg7 - -class33_sub6_sub17_1.anInt3165) < -104)
						return;
					if(~class33_sub6_sub17_1.anInt3159 != -1)
						Class51.aClass70Array1098[arg3].method1133(class33_sub6_sub17_1.aBoolean3184, class33_sub6_sub17_1.anInt3165, 25027, class33_sub6_sub17_1.anInt3181, i1, arg7, arg1);
				}
				if(~arg2 == -4)
				{
					Class33_Sub2.aClass56_2035.method983(arg3, arg1, arg7);
					Class33_Sub6_Sub17 class33_sub6_sub17_2 = Class33_Sub5.method285((byte)-62, k);
					if(class33_sub6_sub17_2.anInt3159 == 1)
						Class51.aClass70Array1098[arg3].method1124(-99, arg7, arg1);
				}
			}
			if(arg6 >= 0)
			{
				int k1 = arg3;
				if(k1 < 3 && (Class35.aByteArrayArrayArray761[1][arg1][arg7] & 2) == 2)
					k1++;
				Class33_Sub15.method792(Class51.aClass70Array1098[arg3], arg3, 30383, arg1, arg5, Class33_Sub2.aClass56_2035, k1, arg7, arg4, arg6);
			}
		}
	}

	public boolean method115(byte arg0[], byte arg1, int arg2, int arg3)
	{
		try
		{
			anInt241++;
			synchronized(aClass37_222)
			{
				if(arg2 < 0 || anInt231 < arg2)
					throw new IllegalArgumentException();
				if(arg1 < 78)
					method117(null, null, true, 34, null, 28);
				boolean flag1 = method111(true, arg0, arg2, arg3, 0);
				if(!flag1)
					flag1 = method111(false, arg0, arg2, arg3, 0);
				boolean flag = flag1;
				return flag;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ca.I(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static void method116(int arg0)
	{
		try
		{
			Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method682(-1);
			anInt205++;
			int i = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-100, 8);
			if(~Class33_Sub6_Sub1.anInt2659 < ~i)
			{
				for(int j = i; ~j > ~Class33_Sub6_Sub1.anInt2659; j++)
					Class33_Sub6_Sub13.anIntArray2988[Class74.anInt1587++] = Class80.anIntArray1730[j];

			}
			if(~i < ~Class33_Sub6_Sub1.anInt2659)
				throw new RuntimeException("gnpov1");
			Class33_Sub6_Sub1.anInt2659 = arg0;
			for(int k = 0; ~i < ~k; k++)
			{
				int l = Class80.anIntArray1730[k];
				Class33_Sub6_Sub4_Sub5_Sub2 class33_sub6_sub4_sub5_sub2 = Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[l];
				int i1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-59, 1);
				if(i1 == 0)
				{
					Class80.anIntArray1730[Class33_Sub6_Sub1.anInt2659++] = l;
					class33_sub6_sub4_sub5_sub2.anInt3558 = Class33_Sub6_Sub6.anInt2785;
				} else
				{
					int j1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-48, 2);
					if(~j1 == -1)
					{
						Class80.anIntArray1730[Class33_Sub6_Sub1.anInt2659++] = l;
						class33_sub6_sub4_sub5_sub2.anInt3558 = Class33_Sub6_Sub6.anInt2785;
						Class27.anIntArray559[Class33_Sub6_Sub13.anInt2992++] = l;
					} else
					if(j1 == 1)
					{
						Class80.anIntArray1730[Class33_Sub6_Sub1.anInt2659++] = l;
						class33_sub6_sub4_sub5_sub2.anInt3558 = Class33_Sub6_Sub6.anInt2785;
						int k1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-77, 3);
						class33_sub6_sub4_sub5_sub2.method359((byte)103, false, k1);
						int i2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-104, 1);
						if(~i2 == -2)
							Class27.anIntArray559[Class33_Sub6_Sub13.anInt2992++] = l;
					} else
					if(j1 == 2)
					{
						Class80.anIntArray1730[Class33_Sub6_Sub1.anInt2659++] = l;
						class33_sub6_sub4_sub5_sub2.anInt3558 = Class33_Sub6_Sub6.anInt2785;
						int l1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-95, 3);
						class33_sub6_sub4_sub5_sub2.method359((byte)-106, true, l1);
						int j2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-112, 3);
						class33_sub6_sub4_sub5_sub2.method359((byte)-96, true, j2);
						int k2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method685(-39, 1);
						if(k2 == 1)
							Class27.anIntArray559[Class33_Sub6_Sub13.anInt2992++] = l;
					} else
					if(~j1 == -4)
						Class33_Sub6_Sub13.anIntArray2988[Class74.anInt1587++] = l;
				}
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ca.C(" + arg0 + ')');
		}
	}

	public static void method117(Class58 arg0, Class58 arg1, boolean arg2, int arg3, Class30 arg4, int arg5)
	{
		try
		{
			int i = arg4.method227((byte)61, arg0);
			anInt220++;
			if(arg3 != 10500)
				method112(-29);
			int j = arg4.method229(true, i, arg1);
			Class33_Sub13_Sub4.method757(arg4, -106, j, arg2, arg5, i);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ca.E(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? "null" : "{...}") + ',' + arg5 + ')');
		}
	}

	public Class12(int arg0, Class37 arg1, Class37 arg2, int arg3)
	{
		aClass37_222 = null;
		anInt231 = 65000;
		aClass37_228 = null;
		try
		{
			anInt213 = arg0;
			aClass37_228 = arg2;
			aClass37_222 = arg1;
			anInt231 = arg3;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "ca.<init>(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ')');
		}
	}

	public static int anInt203;
	public static int anInt204 = -8 + (int)(Math.random() * 17D);
	public static int anInt205;
	public static Class58 aClass58_206;
	public static Class58 aClass58_207;
	public static Class58 aClass58_208 = Class33_Sub6_Sub11.method535(127, "Schrifts-=tze geladen)3");
	public static int anInt209;
	public static int anInt210;
	public static Class58 aClass58_211;
	public static int anInt212;
	public int anInt213;
	public static int anInt214;
	public static Class58 aClass58_215;
	public static Class58 aClass58_216 = Class33_Sub6_Sub11.method535(113, "Ihr Spielkonto wurde deaktiviert)3");
	public static Class58 aClass58_217;
	public static int anInt218 = 0;
	public static Class58 aClass58_219 = Class33_Sub6_Sub11.method535(122, "invback");
	public static int anInt220;
	public static int anInt221 = 0;
	public Class37 aClass37_222;
	public static Class58 aClass58_223;
	public static int anInt224;
	public static int anInt225;
	public static int anInt226 = 0;
	public static int anInt227 = -1;
	public Class37 aClass37_228;
	public static int anInt229;
	public static int anInt230;
	public int anInt231;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4Array232[];
	public static int anInt233 = 0;
	public static Class58 aClass58_234;
	public static Class58 aClass58_235;
	public static Class58 aClass58_236 = Class33_Sub6_Sub11.method535(109, "sideicons");
	public static int anIntArray237[] = {
		0xffff00, 0xff0000, 65280, 65535, 0xff00ff, 0xffffff
	};
	public static int anInt238 = -16 + (int)(Math.random() * 33D);
	public static byte aByteArrayArrayArray239[][][];
	public static int anInt240;
	public static int anInt241;
	public static int anInt242 = 0;
	public static Class58 aClass58_243 = Class33_Sub6_Sub11.method535(122, "und loggen sich dann erneut ein)3");
	public static Class58 aClass58_244 = Class33_Sub6_Sub11.method535(103, "nicht hergestellt werden)3");

	static 
	{
		aClass58_206 = Class33_Sub6_Sub11.method535(112, "The server is being updated)3");
		aClass58_217 = Class33_Sub6_Sub11.method535(119, "Take");
		aClass58_215 = Class33_Sub6_Sub11.method535(116, "Invalid username or password)3");
		aClass58_234 = aClass58_217;
		aClass58_223 = aClass58_215;
		aClass58_235 = Class33_Sub6_Sub11.method535(122, "Players");
		aClass58_211 = aClass58_235;
		aClass58_207 = aClass58_206;
	}
}
