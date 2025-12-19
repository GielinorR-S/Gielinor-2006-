// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class54.java


public class Class54
{

	public int method957(boolean arg0, int arg1)
	{
		try
		{
			anInt1155++;
			if(anIntArrayArray1144 != null)
				arg1 = (int)(((long)anInt1141 * (long)arg1) / (long)anInt1145);
			if(!arg0)
				return -22;
			else
				return arg1;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "pf.C(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method958(int arg0, byte arg1)
	{
		try
		{
			anInt1149++;
			if(arg1 <= 12)
				method960(true);
			if(anIntArrayArray1144 != null)
				arg0 = (int)(((long)arg0 * (long)anInt1141) / (long)anInt1145) + 6;
			return arg0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "pf.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public byte[] method959(byte arg0[], byte arg1)
	{
		try
		{
			if(anIntArrayArray1144 != null)
			{
				int i = (int)(((long)anInt1141 * (long)arg0.length) / (long)anInt1145) - -14;
				int ai[] = new int[i];
				int k = 0;
				int j = 0;
				for(int l = 0; ~arg0.length < ~l; l++)
				{
					byte byte0 = arg0[l];
					int ai1[] = anIntArrayArray1144[k];
					for(int k1 = 0; ~k1 > -15; k1++)
						ai[k1 + j] += ai1[k1] * byte0;

					k += anInt1141;
					int l1 = k / anInt1145;
					k -= l1 * anInt1145;
					j += l1;
				}

				arg0 = new byte[i];
				for(int i1 = 0; i > i1; i1++)
				{
					int j1 = ai[i1] + 32768 >> 0x656eb8d0;
					if(~j1 > 127)
						arg0[i1] = -128;
					else
					if(~j1 >= -128)
						arg0[i1] = (byte)j1;
					else
						arg0[i1] = 127;
				}

			}
			if(arg1 != -39)
				anInt1152 = 64;
			anInt1143++;
			return arg0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "pf.E(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ')');
		}
	}

	public static void method960(boolean arg0)
	{
		anIntArray1159 = null;
		aClass33_Sub6_Sub7_Sub3Array1157 = null;
		aClass16_1146 = null;
		aClass16_1147 = null;
		aClass58_1158 = null;
		aClass58_1153 = null;
		aClass58_1151 = null;
		aClass58_1156 = null;
		if(arg0)
			aClass58_1153 = null;
	}

	public static void method961(int arg0)
	{
		try
		{
			Class82.anInt1789++;
			anInt1140++;
			Class41.method889(0x55f8f96e, true);
			Class33_Sub19.method815(true, 64);
			Class41.method889(0x55f8f96e, false);
			Class33_Sub19.method815(false, 64);
			Class3.method53(-13313);
			Class33_Sub20.method826(7962);
			if(!Class36.aBoolean796)
			{
				int k = 0x7ff & Class65.anInt1394 + Class33_Sub6.anInt2134;
				int i = Class33_Sub6_Sub10.anInt2872;
				if(Class70.anInt1513 / 256 > i)
					i = Class70.anInt1513 / 256;
				if(Class33.aBooleanArray745[4] && 128 + Class77.anIntArray1645[4] > i)
					i = 128 + Class77.anIntArray1645[4];
				Class33_Sub6_Sub8.method505(Class33_Sub6_Sub3.anInt2709, Class38.method871(((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548, Class77_Sub2.anInt2645, ((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510, -125) - 50, Class33.anInt733, true, 600 - -(3 * i), i, k);
			}
			int j;
			if(Class36.aBoolean796)
				j = Class33_Sub6_Sub11.method536(20055);
			else
				j = Class74.method1160(arg0 + 34768);
			int i1 = Class71.anInt1516;
			int l = Class33_Sub6_Sub4_Sub5.anInt3509;
			int j1 = Class58.anInt1907;
			int k1 = Class33_Sub11.anInt2270;
			int l1 = Class14.anInt275;
			for(int i2 = 0; i2 < 5; i2++)
				if(Class33.aBooleanArray745[i2])
				{
					int j2 = (int)((double)(-Class32.anIntArray712[i2]) + (double)(1 + Class32.anIntArray712[i2] * 2) * Math.random() + Math.sin(((double)Class33_Sub6_Sub11.anIntArray2907[i2] / 100D) * (double)Canvas_Sub1.anIntArray62[i2]) * (double)Class77.anIntArray1645[i2]);
					if(~i2 == -3)
						Class58.anInt1907 += j2;
					if(~i2 == -2)
						Class71.anInt1516 += j2;
					if(~i2 == -5)
					{
						Class33_Sub11.anInt2270 += j2;
						if(Class33_Sub11.anInt2270 < 128)
							Class33_Sub11.anInt2270 = 128;
						if(Class33_Sub11.anInt2270 > 383)
							Class33_Sub11.anInt2270 = 383;
					}
					if(i2 == 3)
						Class14.anInt275 = j2 + Class14.anInt275 & 0x7ff;
					if(i2 == 0)
						Class33_Sub6_Sub4_Sub5.anInt3509 += j2;
				}

			Class31.method252(114);
			Class33_Sub6_Sub4_Sub3.anInt3445 = 0;
			if(arg0 != -32768)
				return;
			Class33_Sub6_Sub4_Sub3.aBoolean3427 = true;
			Class33_Sub6_Sub4_Sub3.anInt3449 = -4 + Applet_Sub1.anInt41;
			Class33_Sub6_Sub4_Sub3.anInt3444 = -4 + Class13.anInt254;
			Class59.method1067(arg0 ^ 0xffff8001);
			Class33_Sub6_Sub7.method417();
			Class59.method1067(1);
			Class33_Sub2.aClass56_2035.method973(Class33_Sub6_Sub4_Sub5.anInt3509, Class71.anInt1516, Class58.anInt1907, Class33_Sub11.anInt2270, Class14.anInt275, j);
			Class59.method1067(1);
			Class33_Sub2.aClass56_2035.method990();
			Class26.method208((byte)-78);
			Class3.method52(20);
			((Class34)Class33_Sub6_Sub7_Sub1.anInterface1_3680).method836(arg0 ^ 0xffff8000, Class40.anInt895);
			Class14.method126(6019);
			if(Class33_Sub18.aBoolean2508 && ~Class33_Sub6_Sub13.method555(false, true, (byte)-112) == -1)
				Class33_Sub18.aBoolean2508 = false;
			if(Class33_Sub18.aBoolean2508)
			{
				Class31.method252(107);
				Class33_Sub6_Sub7.method417();
				Class33_Sub11_Sub1.method677(Class36.aClass58_779, false, null, 3);
			}
			Class59.method1067(1);
			Class81.method1213((byte)-123);
			Class33_Sub11.anInt2270 = k1;
			Class14.anInt275 = l1;
			Class33_Sub6_Sub4_Sub5.anInt3509 = l;
			Class71.anInt1516 = i1;
			Class58.anInt1907 = j1;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "pf.A(" + arg0 + ')');
		}
	}

	public static void method962(byte arg0, Class30 arg1)
	{
		try
		{
			if(arg0 > -75)
				anInt1152 = -31;
			anInt1142++;
			Class15.aClass30_288 = arg1;
			Class33_Sub6_Sub4_Sub5_Sub2.anInt3793 = Class15.aClass30_288.method218(16, false);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "pf.F(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public Class54(int arg0, int arg1)
	{
		try
		{
			if(arg0 == arg1)
				return;
			int i = Class15.method134(arg1, 11890, arg0);
			arg0 /= i;
			arg1 /= i;
			anIntArrayArray1144 = new int[arg0][14];
			anInt1145 = arg0;
			anInt1141 = arg1;
			for(int j = 0; ~j > ~arg0; j++)
			{
				double d = 6D + (double)j / (double)arg0;
				int ai[] = anIntArrayArray1144[j];
				int k = (int)Math.floor((d - 7D) + 1.0D);
				if(~k > -1)
					k = 0;
				double d1 = (double)arg1 / (double)arg0;
				int l = (int)Math.ceil(7D + d);
				if(l > 14)
					l = 14;
				for(; ~k > ~l; k++)
				{
					double d2 = ((double)k - d) * 3.1415926535897931D;
					double d3 = d1;
					if(d2 < -0.0001D || d2 > 0.0001D)
						d3 *= Math.sin(d2) / d2;
					d3 *= 0.46000000000000002D * Math.cos(0.22439947525641379D * ((double)k - d)) + 0.54000000000000004D;
					ai[k] = (int)Math.floor(d3 * 65536D + 0.5D);
				}

			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "pf.<init>(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static int anInt1140;
	public int anInt1141;
	public static int anInt1142;
	public static int anInt1143;
	public int anIntArrayArray1144[][];
	public int anInt1145;
	public static Class16 aClass16_1146 = new Class16(64);
	public static Class16 aClass16_1147 = new Class16(128);
	public static boolean aBoolean1148 = false;
	public static int anInt1149;
	public static int anInt1150;
	public static Class58 aClass58_1151;
	public static volatile int anInt1152 = 0;
	public static Class58 aClass58_1153;
	public static int anInt1154 = 0;
	public static int anInt1155;
	public static Class58 aClass58_1156 = Class33_Sub6_Sub11.method535(112, "hitmarks");
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3Array1157[] = new Class33_Sub6_Sub7_Sub3[1000];
	public static Class58 aClass58_1158 = Class33_Sub6_Sub11.method535(122, "scape main");
	public static int anIntArray1159[] = new int[256];

	static 
	{
		aClass58_1153 = Class33_Sub6_Sub11.method535(108, "Too many connections from your address)3");
		aClass58_1151 = aClass58_1153;
	}
}
