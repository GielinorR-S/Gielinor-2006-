// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class37.java

import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;

public class Class37
{

	public void method855(long arg0, int arg1)
	{
		try
		{
			anInt818++;
			if(arg0 < 0L)
			{
				return;
			} else
			{
				int i = -14 / ((48 - arg1) / 63);
				aLong811 = arg0;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "lc.A(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static int method856(int arg0, int arg1, int arg2, int arg3)
	{
		try
		{
			anInt819++;
			int i = arg3 / arg0;
			int k = arg2 / arg0;
			int j = -1 + arg0 & arg3;
			int i1 = Class27.method209(k, i, (byte)122);
			int l = arg0 + -1 & arg2;
			if(arg1 >= -96)
				aClass58_836 = null;
			int j1 = Class27.method209(k, 1 + i, (byte)111);
			int k1 = Class27.method209(1 + k, i, (byte)113);
			int l1 = Class27.method209(k + 1, 1 + i, (byte)127);
			int i2 = Class40.method888(i1, j1, arg0, 0x10000, j);
			int j2 = Class40.method888(k1, l1, arg0, 0x10000, j);
			return Class40.method888(i2, j2, arg0, 0x10000, l);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "lc.D(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public void method857(byte arg0[], int arg1, int arg2, int arg3)
		throws IOException
	{
		anInt821++;
		try
		{
			if(arg2 != -1177)
				return;
			if(aLong805 < (long)arg3 + aLong811)
				aLong805 = (long)arg3 + aLong811;
			if(~aLong826 != 0L && (~aLong811 > ~aLong826 || ~aLong811 < ~((long)anInt817 + aLong826)))
				method865(126);
			if(~aLong826 != 0L && ~(aLong811 - -(long)arg3) < ~((long)aByteArray803.length + aLong826))
			{
				int i = (int)((long)aByteArray803.length + (-aLong811 - -aLong826));
				arg3 -= i;
				Class53.method955(arg0, arg1, aByteArray803, (int)(aLong811 + -aLong826), i);
				aLong811 += i;
				anInt817 = aByteArray803.length;
				method865(11);
				arg1 += i;
			}
			if(arg3 > aByteArray803.length)
			{
				if(~aLong811 != ~aLong822)
				{
					aClass18_815.method158(-1, aLong811);
					aLong822 = aLong811;
				}
				aClass18_815.method161(arg1, -16321, arg0, arg3);
				long l = -1L;
				if(aLong811 >= aLong813 && ~(aLong813 - -(long)anInt816) < ~aLong811)
					l = aLong811;
				else
				if(~aLong811 >= ~aLong813 && ~((long)arg3 + aLong811) < ~aLong813)
					l = aLong813;
				long l1 = -1L;
				aLong822 += arg3;
				if(~((long)arg3 + aLong811) < ~aLong813 && (long)arg3 + aLong811 <= (long)anInt816 + aLong813)
					l1 = (long)arg3 + aLong811;
				else
				if((long)anInt816 + aLong813 > aLong811 && ~((long)arg3 + aLong811) <= ~(aLong813 + (long)anInt816))
					l1 = aLong813 - -(long)anInt816;
				if(~aLong807 > ~aLong822)
					aLong807 = aLong822;
				if(~l < 0L && l < l1)
				{
					int j = (int)(l1 + -l);
					Class53.method955(arg0, (int)(l + ((long)arg1 - aLong811)), aByteArray814, (int)(-aLong813 + l), j);
				}
				aLong811 += arg3;
				return;
			}
			if(arg3 > 0)
			{
				if(~aLong826 == 0L)
					aLong826 = aLong811;
				Class53.method955(arg0, arg1, aByteArray803, (int)(aLong811 + -aLong826), arg3);
				aLong811 += arg3;
				if(-aLong826 + aLong811 > (long)anInt817)
					anInt817 = (int)(-aLong826 + aLong811);
				return;
			}
		}
		catch(IOException ioexception)
		{
			aLong822 = -1L;
			throw ioexception;
		}
	}

	public static void method858(byte arg0, Class20 arg1)
	{
		Class33_Sub6_Sub4_Sub6.aClass20_3623 = arg1;
		anInt823++;
		if(arg0 != -38)
			aClass30_835 = null;
	}

	public static Class58 method859(int arg0, int arg1)
	{
		try
		{
			if(arg0 != 15591)
			{
				return null;
			} else
			{
				anInt831++;
				return Class23.method184(false, (byte)-123, 10, arg1);
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "lc.J(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method860(boolean arg0)
	{
		try
		{
			aClass30_835 = null;
			aClass46_809 = null;
			aClass58_836 = null;
			if(!arg0)
			{
				return;
			} else
			{
				aClass33_Sub6_Sub7_Sub3_832 = null;
				aClass33_Sub6_Sub7_Sub4_812 = null;
				aClass30_833 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "lc.F(" + arg0 + ')');
		}
	}

	public void method861(byte arg0)
		throws IOException
	{
		try
		{
			anInt806++;
			anInt816 = 0;
			if(~aLong811 != ~aLong822)
			{
				aClass18_815.method158(-1, aLong811);
				aLong822 = aLong811;
			}
			aLong813 = aLong811;
			if(arg0 < 35)
				aClass33_Sub6_Sub7_Sub3_832 = null;
			while(~anInt816 > ~aByteArray814.length) 
			{
				int i = aClass18_815.method157((byte)-16, anInt816, aByteArray814, aByteArray814.length - anInt816);
				if(~i == 0)
					break;
				anInt816 += i;
				aLong822 += i;
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "lc.N(" + arg0 + ')');
		}
	}

	public static int method862(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt827++;
			if(~arg1 == 1)
				return 0xbc614e;
			if(arg1 == -1)
			{
				if(~arg2 > -1)
					arg2 = 0;
				else
				if(~arg2 < -128)
					arg2 = 127;
				arg2 = 127 - arg2;
				return arg2;
			}
			arg2 = ((0x7f & arg1) * arg2) / 128;
			if(arg2 >= 2)
			{
				if(arg2 > 126)
					arg2 = 126;
			} else
			{
				arg2 = 2;
			}
			if(arg0 != 7371)
				return -101;
			else
				return arg2 + (0xff80 & arg1);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "lc.H(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method863(byte arg0[], int arg1, int arg2, byte arg3)
		throws IOException
	{
		anInt810++;
		try
		{
			if(arg3 != 42)
				method862(-103, -47, 70);
			if(~(arg1 + arg2) < ~arg0.length)
				throw new ArrayIndexOutOfBoundsException(arg2 + arg1 + -arg0.length);
			if(aLong826 != -1L && aLong826 <= aLong811 && ~(aLong826 + (long)anInt817) <= ~(aLong811 - -(long)arg2))
			{
				Class53.method955(aByteArray803, (int)(-aLong826 + aLong811), arg0, arg1, arg2);
				aLong811 += arg2;
				return;
			}
			long l = aLong811;
			int i = arg1;
			int j = arg2;
			if(~aLong813 >= ~aLong811 && (long)anInt816 + aLong813 > aLong811)
			{
				int k = (int)(((long)anInt816 + -aLong811) - -aLong813);
				if(k > arg2)
					k = arg2;
				Class53.method955(aByteArray814, (int)(-aLong813 + aLong811), arg0, arg1, k);
				aLong811 += k;
				arg1 += k;
				arg2 -= k;
			}
			if(arg2 > aByteArray814.length)
			{
				aClass18_815.method158(-1, aLong811);
				aLong822 = aLong811;
				int i1;
				for(; ~arg2 < -1; arg2 -= i1)
				{
					i1 = aClass18_815.method157((byte)-16, arg1, arg0, arg2);
					if(i1 == -1)
						break;
					arg1 += i1;
					aLong822 += i1;
					aLong811 += i1;
				}

			} else
			if(arg2 > 0)
			{
				int j1 = arg2;
				method861((byte)59);
				if(j1 > anInt816)
					j1 = anInt816;
				Class53.method955(aByteArray814, 0, arg0, arg1, j1);
				arg2 -= j1;
				aLong811 += j1;
				arg1 += j1;
			}
			if(aLong826 != -1L)
			{
				if(~aLong811 > ~aLong826 && ~arg2 < -1)
				{
					int k1 = arg1 + (int)(aLong826 + -aLong811);
					if(~(arg1 - -arg2) > ~k1)
						k1 = arg2 + arg1;
					while(~k1 < ~arg1) 
					{
						arg2--;
						arg0[arg1++] = 0;
						aLong811++;
					}
				}
				long l2 = -1L;
				if(aLong826 - -(long)anInt817 > l && ~(l + (long)j) <= ~((long)anInt817 + aLong826))
					l2 = aLong826 + (long)anInt817;
				else
				if(l + (long)j > aLong826 && aLong826 + (long)anInt817 >= l + (long)j)
					l2 = l + (long)j;
				long l1 = -1L;
				if(~aLong826 > ~l || l - -(long)j <= aLong826)
				{
					if(aLong826 <= l && ~((long)anInt817 + aLong826) < ~l)
						l1 = l;
				} else
				{
					l1 = aLong826;
				}
				if(~l1 < 0L && l2 > l1)
				{
					int i2 = (int)(-l1 + l2);
					Class53.method955(aByteArray803, (int)(-aLong826 + l1), arg0, i + (int)(l1 - l), i2);
					if(~aLong811 > ~l2)
					{
						arg2 = (int)((long)arg2 - (-aLong811 + l2));
						aLong811 = l2;
					}
				}
			}
		}
		catch(IOException ioexception)
		{
			aLong822 = -1L;
			throw ioexception;
		}
		if(arg2 > 0)
			throw new EOFException();
		else
			return;
	}

	public static void method864(boolean arg0)
	{
		try
		{
			if(!arg0)
				aClass33_Sub6_Sub7_Sub4_812 = null;
			if(Class33_Sub6_Sub4_Sub2.aClass24_3388 != null)
				synchronized(Class33_Sub6_Sub4_Sub2.aClass24_3388)
				{
					Class33_Sub6_Sub4_Sub2.aClass24_3388 = null;
				}
			anInt828++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "lc.O(" + arg0 + ')');
		}
	}

	public void method865(int arg0)
		throws IOException
	{
		try
		{
			if(aLong826 != -1L)
			{
				if(~aLong826 != ~aLong822)
				{
					aClass18_815.method158(-1, aLong826);
					aLong822 = aLong826;
				}
				long l = -1L;
				aClass18_815.method161(0, -16321, aByteArray803, anInt817);
				long l1 = -1L;
				if(~aLong813 >= ~aLong826 && aLong826 < (long)anInt816 + aLong813)
					l = aLong826;
				else
				if(~aLong826 >= ~aLong813 && (long)anInt817 + aLong826 > aLong813)
					l = aLong813;
				aLong822 += anInt817;
				if(~((long)anInt817 + aLong826) >= ~aLong813 || (long)anInt816 + aLong813 < aLong826 - -(long)anInt817)
				{
					if(aLong826 < (long)anInt816 + aLong813 && (long)anInt817 + aLong826 >= (long)anInt816 + aLong813)
						l1 = aLong813 + (long)anInt816;
				} else
				{
					l1 = (long)anInt817 + aLong826;
				}
				if(~aLong822 < ~aLong807)
					aLong807 = aLong822;
				if(~l < 0L && ~l1 < ~l)
				{
					int j = (int)(-l + l1);
					Class53.method955(aByteArray803, (int)(l + -aLong826), aByteArray814, (int)(l + -aLong813), j);
				}
				aLong826 = -1L;
				anInt817 = 0;
			}
			int i = -47 % ((68 - arg0) / 42);
			anInt820++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "lc.G(" + arg0 + ')');
		}
	}

	public void method866(int arg0)
		throws IOException
	{
		try
		{
			method865(119);
			anInt825++;
			if(arg0 != -9837)
				aLong813 = -81L;
			aClass18_815.method160(121);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "lc.C(" + arg0 + ')');
		}
	}

	public long method867(int arg0)
	{
		try
		{
			anInt829++;
			if(arg0 != -21138)
				return -40L;
			else
				return aLong805;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "lc.I(" + arg0 + ')');
		}
	}

	public static boolean method868(int arg0, int arg1, int arg2,
			byte[] arg3) {
		try {
			anInt830++;
			boolean bool = true;
			if (arg0 != -23)
				aClass46_809 = null;
			Class33_Sub11 class33_sub11 = new Class33_Sub11(arg3);
			int i = -1;
			for (;;) {
				int i_19_ = class33_sub11.method651(38);
				if (i_19_ == 0)
					break;
				i += i_19_;
				int i_20_ = 0;
				boolean bool_21_ = false;
				for (;;) {
					if (bool_21_) {
						int i_22_ = class33_sub11.method651(arg0 ^ ~0x58);
						if ((i_22_ ^ 0xffffffff) == -1)
							break;
						class33_sub11.method639((byte) 123);
					} else {
						int i_23_ = class33_sub11.method651(120);
						if (i_23_ == 0)
							break;
						i_20_ += -1 + i_23_;
						int i_24_ = i_20_ & 0x3f;
						int i_25_ = (i_20_ & 0xfff) >> 1793474630;
				int i_26_ = (class33_sub11.method639((byte) 123)
						>> -1890156830);
				int i_27_ = i_25_ - -arg1;
				int i_28_ = i_24_ - -arg2;
				if ((i_27_ ^ 0xffffffff) < -1 && i_28_ > 0
						&& i_27_ < 103 && (i_28_ ^ 0xffffffff) > -104) {
					Class33_Sub6_Sub17 class33_sub6_sub17
					= Class33_Sub5.method285((byte) -86, i);
					if ((i_26_ ^ 0xffffffff) != -23
							|| !Class33_Sub3.aBoolean2058
							|| class33_sub6_sub17.anInt3143 != 0
							|| class33_sub6_sub17.anInt3159 == 1
							|| class33_sub6_sub17.aBoolean3155) {
						bool_21_ = true;
						if (!class33_sub6_sub17.method597(-67)) {
							Class33_Sub6_Sub14.anInt3040++;
							bool = false;
						}
					}
				}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class33.method263(runtimeexception,
					("lc.M(" + arg0 + ',' + arg1 + ',' + arg2
							+ ',' + (arg3 != null ? "{...}" : "null")
							+ ')'));
		}
	}
	public static void method869(int arg0, int arg1, byte arg2, Class33_Sub6_Sub7_Sub2 arg3, int arg4)
	{
		try
		{
			Class36.aClass15_786.method135(8);
			if(arg2 != -73)
				return;
			Class33_Sub11.aClass33_Sub6_Sub7_Sub4_2247.method502(0, 0);
			arg3.method459(Canvas_Sub1.aClass58_50, 55, 28, 0xffffff, 0);
			if(arg1 == 0)
				arg3.method459(Class33_Sub6_Sub2.aClass58_2698, 55, 41, 65280, 0);
			anInt804++;
			if(arg1 == 1)
				arg3.method459(Class33_Sub5.aClass58_2111, 55, 41, 0xffff00, 0);
			if(arg1 == 2)
				arg3.method459(Class47.aClass58_1027, 55, 41, 0xff0000, 0);
			if(arg1 == 3)
				arg3.method459(Class70.aClass58_1511, 55, 41, 65535, 0);
			arg3.method459(Class33_Sub6_Sub4_Sub1.aClass58_3347, 184, 28, 0xffffff, 0);
			if(arg4 == 0)
				arg3.method459(Class33_Sub6_Sub2.aClass58_2698, 184, 41, 65280, 0);
			if(arg4 == 1)
				arg3.method459(Class33_Sub5.aClass58_2111, 184, 41, 0xffff00, 0);
			if(arg4 == 2)
				arg3.method459(Class47.aClass58_1027, 184, 41, 0xff0000, 0);
			arg3.method459(Class51.aClass58_1094, 324, 28, 0xffffff, 0);
			if(arg0 == 0)
				arg3.method459(Class33_Sub6_Sub2.aClass58_2698, 324, 41, 65280, 0);
			if(~arg0 == -2)
				arg3.method459(Class33_Sub5.aClass58_2111, 324, 41, 0xffff00, 0);
			if(arg0 == 2)
				arg3.method459(Class47.aClass58_1027, 324, 41, 0xff0000, 0);
			arg3.method453(Class49.aClass58_1071, 417, 17, 85, 25, 0xffffff, 0, 1, 1, 0);
			try
			{
				java.awt.Graphics g = Class33_Sub6_Sub4_Sub1.aCanvas3367.getGraphics();
				Class36.aClass15_786.method131(0, 453, (byte)78, g);
				return;
			}
			catch(Exception _ex)
			{
				Class33_Sub6_Sub4_Sub1.aCanvas3367.repaint();
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "lc.L(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ',' + arg4 + ')');
		}
	}

	public Class37(Class18 arg0, int arg1, int arg2)
		throws IOException
	{
		anInt817 = 0;
		aLong813 = -1L;
		aLong826 = -1L;
		try
		{
			aClass18_815 = arg0;
			aLong805 = aLong807 = arg0.method159(-8624);
			aLong811 = 0L;
			aByteArray803 = new byte[arg2];
			aByteArray814 = new byte[arg1];
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "lc.<init>(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public byte aByteArray803[];
	public static int anInt804;
	public long aLong805;
	public static int anInt806;
	public long aLong807;
	public static int anInt808 = -1;
	public static Class46 aClass46_809 = new Class46();
	public static int anInt810;
	public long aLong811;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_812;
	public long aLong813;
	public byte aByteArray814[];
	public Class18 aClass18_815;
	public int anInt816;
	public int anInt817;
	public static int anInt818;
	public static int anInt819;
	public static int anInt820;
	public static int anInt821;
	public long aLong822;
	public static int anInt823;
	public static int anInt824;
	public static int anInt825;
	public long aLong826;
	public static int anInt827;
	public static int anInt828;
	public static int anInt829;
	public static int anInt830;
	public static int anInt831;
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3_832;
	public static Class30 aClass30_833;
	public static int anInt834 = 0;
	public static Class30 aClass30_835;
	public static Class58 aClass58_836 = Class33_Sub6_Sub11.method535(111, " <col=ffffff>");

}
