// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub11.java

import java.math.BigInteger;
import java.util.Calendar;

public class Class33_Sub11 extends Class33
{

	public int method620(int arg0)
	{
		try
		{
			if(arg0 < 78)
				anInt2277 = -43;
			anInt2231++;
			return -aByteArray2296[anInt2239++] & 0xff;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.OA(" + arg0 + ')');
		}
	}

	public static void method621(byte arg0)
	{
		try
		{
			if(Class39.anInt858 > 0)
			{
				for(int i = 0; i < 256; i++)
					if(Class39.anInt858 <= 768)
					{
						if(Class39.anInt858 <= 256)
							Class38.anIntArray837[i] = Class49.method930(Class33_Sub6_Sub16.anIntArray3093[i], -Class39.anInt858 + 256, Class59.anIntArray1269[i], 1899);
						else
							Class38.anIntArray837[i] = Class33_Sub6_Sub16.anIntArray3093[i];
					} else
					{
						Class38.anIntArray837[i] = Class49.method930(Class59.anIntArray1269[i], -Class39.anInt858 + 1024, Class33_Sub6_Sub16.anIntArray3093[i], arg0 + 1877);
					}

			} else
			if(~Class33_Sub6_Sub4_Sub2.anInt3369 >= -1)
			{
				for(int j = 0; ~j > -257; j++)
					Class38.anIntArray837[j] = Class59.anIntArray1269[j];

			} else
			{
				for(int k = 0; ~k > -257; k++)
					if(Class33_Sub6_Sub4_Sub2.anInt3369 <= 768)
					{
						if(Class33_Sub6_Sub4_Sub2.anInt3369 > 256)
							Class38.anIntArray837[k] = Class82.anIntArray1786[k];
						else
							Class38.anIntArray837[k] = Class49.method930(Class82.anIntArray1786[k], -Class33_Sub6_Sub4_Sub2.anInt3369 + 256, Class59.anIntArray1269[k], 1899);
					} else
					{
						Class38.anIntArray837[k] = Class49.method930(Class59.anIntArray1269[k], 1024 - Class33_Sub6_Sub4_Sub2.anInt3369, Class82.anIntArray1786[k], 1899);
					}

			}
			anInt2291++;
			char c = '\u0100';
			Class33_Sub6_Sub7.method422(0, 9, 128, c - -7);
			Class33_Sub16.aClass33_Sub6_Sub7_Sub3_2487.method494(0, 0);
			Class33_Sub6_Sub7.method427();
			int l = 0;
			int i1 = 6885;
			for(int j1 = 1; ~j1 > ~(-1 + c); j1++)
			{
				int k1 = (Class54.anIntArray1159[j1] * (-j1 + c)) / c;
				int i2 = 22 + k1;
				if(i2 < 0)
					i2 = 0;
				l += i2;
				for(int k2 = i2; k2 < 128; k2++)
				{
					int i3 = Class70.anIntArray1488[l++];
					if(~i3 != -1)
					{
						int k4 = Canvas_Sub1.aClass15_64.anIntArray289[i1];
						int i4 = -i3 + 256;
						int k3 = i3;
						i3 = Class38.anIntArray837[i3];
						Canvas_Sub1.aClass15_64.anIntArray289[i1++] = Class12.method110(Class12.method110(k4, 65280) * i4 + k3 * Class12.method110(65280, i3), 0xff0000) + Class12.method110(i4 * Class12.method110(k4, 0xff00ff) + k3 * Class12.method110(0xff00ff, i3), 0xff00ff00) >> 0xf7aa4da8;
					} else
					{
						i1++;
					}
				}

				i1 += 765 + i2 + -128;
			}

			i1 = 7546;
			l = 0;
			Class33_Sub6_Sub7.method422(637, 9, 765, 7 + c);
			Class36.aClass33_Sub6_Sub7_Sub3_787.method494(382, 0);
			if(arg0 != 22)
				anInt2277 = 97;
			Class33_Sub6_Sub7.method427();
			for(int l1 = 1; -1 + c > l1; l1++)
			{
				int j2 = ((c - l1) * Class54.anIntArray1159[l1]) / c;
				int l2 = -j2 + 103;
				i1 += j2;
				for(int j3 = 0; ~l2 < ~j3; j3++)
				{
					int l3 = Class70.anIntArray1488[l++];
					if(~l3 != -1)
					{
						int j4 = l3;
						int i5 = Canvas_Sub1.aClass15_64.anIntArray289[i1];
						int l4 = 256 + -l3;
						l3 = Class38.anIntArray837[l3];
						Canvas_Sub1.aClass15_64.anIntArray289[i1++] = Class12.method110(0xff0000, Class12.method110(i5, 65280) * l4 + Class12.method110(65280, l3) * j4) + Class12.method110(j4 * Class12.method110(0xff00ff, l3) - -(Class12.method110(i5, 0xff00ff) * l4), 0xff00ff00) >> 0x548a04c8;
					} else
					{
						i1++;
					}
				}

				i1 += -j2 + (765 + -l2);
				l += -l2 + 128;
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.T(" + arg0 + ')');
		}
	}

	public void method622(int arg0, int arg1)
	{
		try
		{
			anInt2279++;
			if(arg0 <= 67)
			{
				return;
			} else
			{
				aByteArray2296[anInt2239++] = (byte)(-arg1);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.QA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method623(byte arg0)
	{
		try
		{
			int i = -35 / ((-35 - arg0) / 61);
			anInt2273++;
			anInt2239 += 4;
			return ((0xff & aByteArray2296[anInt2239 + -1]) + (((0xff & aByteArray2296[anInt2239 + -3]) << 0xb1005f0) + ((0xff & aByteArray2296[anInt2239 - 4]) << 0x8f32fcb8))) - -(aByteArray2296[-2 + anInt2239] << 0x8a5de388 & 0xff00);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.H(" + arg0 + ')');
		}
	}

	public byte method624(byte arg0)
	{
		try
		{
			anInt2266++;
			if(arg0 != -24)
				anInt2262 = -65;
			return (byte)(-aByteArray2296[anInt2239++]);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.AA(" + arg0 + ')');
		}
	}

	public void method625(int arg0, boolean arg1)
	{
		try
		{
			aByteArray2296[anInt2239++] = (byte)(arg0 >> 0x1bb12a8);
			aByteArray2296[anInt2239++] = (byte)arg0;
			if(!arg1)
			{
				return;
			} else
			{
				anInt2297++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.GB(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method626(byte arg0)
	{
		try
		{
			anInt2286++;
			anInt2239 += 3;
			if(arg0 != -114)
				method620(-112);
			return (((aByteArray2296[-2 + anInt2239] & 0xff) << 0x8793b4a8) + (aByteArray2296[-3 + anInt2239] << 0x53f88df0 & 0xff0000)) - -(0xff & aByteArray2296[anInt2239 - 1]);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.M(" + arg0 + ')');
		}
	}

	public void method627(int arg0, int arg1)
	{
		try
		{
			if(arg0 != 4773)
			{
				return;
			} else
			{
				aByteArray2296[anInt2239++] = (byte)(arg1 - -128);
				aByteArray2296[anInt2239++] = (byte)(arg1 >> 0xff5961e8);
				anInt2248++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.FA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method628(byte arg0)
	{
		try
		{
			if(arg0 != -73)
				method653(68);
			anInt2267++;
			return 0xff & aByteArray2296[anInt2239++] + -128;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.NA(" + arg0 + ')');
		}
	}

	public void method629(int arg0, byte arg1)
	{
		try
		{
			int i = -51 / ((-47 - arg1) / 52);
			anInt2283++;
			aByteArray2296[anInt2239 + (-arg0 - 4)] = (byte)(arg0 >> 0x94dd0958);
			aByteArray2296[-arg0 + anInt2239 + -3] = (byte)(arg0 >> 0x20b71d0);
			aByteArray2296[-arg0 + (anInt2239 + -2)] = (byte)(arg0 >> 0xd949468);
			aByteArray2296[-1 + (anInt2239 + -arg0)] = (byte)arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.U(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method630(int arg0, long arg1)
	{
		try
		{
			method664(true, (int)(arg1 >> 0x12ec5860));
			anInt2292++;
			if(arg0 < 40)
				aClass30_2259 = null;
			method664(true, (int)arg1);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.A(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static int method631(byte arg0, int arg1, int arg2)
	{
		try
		{
			int i = 57 * arg1 + arg2;
			i ^= i << 0x22c4516d;
			anInt2256++;
			int k = 15 % ((44 - arg0) / 47);
			int j = 0x7fffffff & i * (15731 * (i * i) - 0xfff3f51b) + 0x5208dd0d;
			return (0x7fbef3e & j) >> 0xce16ae93;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.B(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method632(byte arg0, Class58 arg1)
	{
		try
		{
			anInt2239 += arg1.method1055(arg1.method1035(arg0 + 100), aByteArray2296, 0, (byte)41, anInt2239);
			if(arg0 != -73)
				aClass58_2260 = null;
			anInt2285++;
			aByteArray2296[anInt2239++] = 0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.JA(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method633(byte arg0)
	{
		try
		{
			aClass30_2259 = null;
			aClass33_Sub6_Sub7_Sub4_2247 = null;
			aClass30_2257 = null;
			anIntArray2261 = null;
			aCalendar2243 = null;
			aClass33_Sub11_2264 = null;
			aClass15_2241 = null;
			int i = -10 / ((arg0 - 82) / 41);
			aClass58_2260 = null;
			aClass58_2301 = null;
			aClass58_2272 = null;
			aClass58_2290 = null;
			aClass58_2251 = null;
			aClass30_Sub1Array2237 = null;
			aClass58_2299 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.R(" + arg0 + ')');
		}
	}

	public static void method634(int arg0)
	{
		try
		{
			anInt2280++;
			Class33_Sub5.anIntArray2118 = null;
			Class78.aByteArrayArrayArray1676 = null;
			Class33_Sub9.aByteArrayArrayArray2180 = null;
			Class17.anIntArrayArrayArray351 = null;
			Class23.anIntArrayArray472 = null;
			Class21.anIntArray394 = null;
			RuntimeException_Sub1.aByteArrayArrayArray1812 = null;
			if(arg0 != 0x7a5b372b)
				method621((byte)-88);
			Canvas_Sub1.aByteArrayArrayArray57 = null;
			Class33_Sub3.anIntArray2059 = null;
			anIntArray2261 = null;
			Class12.aByteArrayArrayArray239 = null;
			Class16.anIntArray328 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.KB(" + arg0 + ')');
		}
	}

	public int method635(byte arg0)
	{
		try
		{
			if(arg0 != -24)
				aClass58_2301 = null;
			anInt2293++;
			byte byte0 = aByteArray2296[anInt2239++];
			int i = 0;
			for(; byte0 < 0; byte0 = aByteArray2296[anInt2239++])
				i = (i | 0x7f & byte0) << 0xb0640d47;

			return i | byte0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.J(" + arg0 + ')');
		}
	}

	public int method636(boolean arg0)
	{
		try
		{
			if(arg0)
				aClass58_2260 = null;
			anInt2263++;
			anInt2239 += 4;
			return (0xff & aByteArray2296[-2 + anInt2239]) + (0xff0000 & aByteArray2296[-4 + anInt2239] << 0x35848130) + (((0xff & aByteArray2296[-3 + anInt2239]) << 0x98b44d38) + (0xff00 & aByteArray2296[-1 + anInt2239] << 0xf91d76e8));
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.Q(" + arg0 + ')');
		}
	}

	public void method637(int arg0, int arg1)
	{
		try
		{
			anInt2242++;
			if(arg1 != 990)
				method652(-5, -127);
			aByteArray2296[anInt2239++] = (byte)(arg0 >> 0x3a084e50);
			aByteArray2296[anInt2239++] = (byte)(arg0 >> 0x9130d928);
			aByteArray2296[anInt2239++] = (byte)arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.P(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method638(int arg0, int arg1)
	{
		try
		{
			aByteArray2296[(arg0 + anInt2239) - arg1] = (byte)arg1;
			anInt2287++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.CA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method639(byte arg0)
	{
		try
		{
			anInt2235++;
			if(arg0 != 123)
				return 53;
			else
				return aByteArray2296[anInt2239++] & 0xff;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.I(" + arg0 + ')');
		}
	}

	public void method640(int arg0, int arg1)
	{
		try
		{
			anInt2240++;
			if(arg1 != -11124)
				aClass58_2301 = null;
			aByteArray2296[anInt2239++] = (byte)arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.DA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method641(int arg0)
	{
		try
		{
			anInt2233++;
			anInt2239 += 4;
			int i = 27 % ((54 - arg0) / 60);
			return (0xff & aByteArray2296[anInt2239 + -4]) + (((aByteArray2296[-3 + anInt2239] & 0xff) << 0x82a22a88) + ((aByteArray2296[-1 + anInt2239] << 0xa8278af8 & 0xff000000) - -(0xff0000 & aByteArray2296[-2 + anInt2239] << 0x7be9e570)));
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.HA(" + arg0 + ')');
		}
	}

	public static Class33_Sub6_Sub8 method642(int arg0, int arg1)
	{
		try
		{
			anInt2255++;
			Class33_Sub6_Sub8 class33_sub6_sub8 = (Class33_Sub6_Sub8)Class15_Sub2.aClass16_1954.method144(0, arg1);
			if(class33_sub6_sub8 != null)
				return class33_sub6_sub8;
			byte abyte0[] = Class32.aClass30_714.method238(false, arg1, arg0);
			class33_sub6_sub8 = new Class33_Sub6_Sub8();
			if(abyte0 != null)
				class33_sub6_sub8.method509(new Class33_Sub11(abyte0), 32);
			Class15_Sub2.aClass16_1954.method145(arg1, (byte)-113, class33_sub6_sub8);
			return class33_sub6_sub8;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.G(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method643(byte arg0)
	{
		try
		{
			if(arg0 > -94)
			{
				return -99;
			} else
			{
				anInt2271++;
				anInt2239 += 2;
				return ((0xff & aByteArray2296[-1 + anInt2239]) << 0xef9cda88) + (0xff & aByteArray2296[anInt2239 - 2]);
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.SB(" + arg0 + ')');
		}
	}

	public void method644(int arg0, byte arg1[], int arg2, int arg3)
	{
		anInt2252++;
		for(int i = arg0; ~i > ~(arg0 + arg3); i++)
			arg1[i] = aByteArray2296[anInt2239++];

		if(arg2 != 15162)
			method652(-3, 103);
	}

	public void method645(int arg0, byte arg1)
	{
		try
		{
			if(arg1 != -74)
				method672(23);
			if((arg0 & 0xffffff80) != 0)
			{
				if(~(arg0 & 0xffffc000) != -1)
				{
					if((arg0 & 0xffe00000) != 0)
					{
						if((arg0 & 0xf0000000) != 0)
							method640(0x80 | arg0 >>> 0x92313fdc, -11124);
						method640((arg0 | 0x1016ccd5) >>> 0x5cea3035, arg1 + -11050);
					}
					method640(0x80 | arg0 >>> 0x634eb78e, -11124);
				}
				method640(0x80 | arg0 >>> 0x5c878787, -11124);
			}
			anInt2245++;
			method640(arg0 & 0x7f, -11124);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.O(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class58 method646(int arg0)
	{
		try
		{
			int i = anInt2239;
			while(~aByteArray2296[anInt2239++] != -1) ;
			if(arg0 >= -106)
				method670(-2, 30);
			anInt2254++;
			return Class33_Sub6.method290(i, 64, aByteArray2296, -1 + -i + anInt2239);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.W(" + arg0 + ')');
		}
	}

	public int method647(int arg0)
	{
		try
		{
			if(arg0 < 47)
				method639((byte)-14);
			anInt2284++;
			int i = 0xff & aByteArray2296[anInt2239];
			if(i >= 128)
				return -49152 + method666(116);
			else
				return -64 + method639((byte)123);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.N(" + arg0 + ')');
		}
	}

	public Class58 method648(int arg0)
	{
		try
		{
			anInt2244++;
			if(aByteArray2296[anInt2239] == 0)
			{
				anInt2239++;
				return null;
			} else
			{
				int i = -41 / ((16 - arg0) / 60);
				return method646(-122);
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.LA(" + arg0 + ')');
		}
	}

	public void method649(byte arg0, int arg1, int arg2, byte arg3[])
	{
		for(int i = arg1; arg2 + arg1 > i; i++)
			arg3[i] = (byte)(-128 + aByteArray2296[anInt2239++]);

		anInt2253++;
		if(arg0 != -126)
			method661((byte)-14);
	}

	public void method650(int arg0[], int arg1, byte arg2, int arg3)
	{
		try
		{
			anInt2289++;
			int i = anInt2239;
			anInt2239 = arg3;
			int j = (-arg3 + arg1) / 8;
			if(arg2 >= -77)
				aClass58_2301 = null;
			for(int k = 0; ~j < ~k; k++)
			{
				int l = method623((byte)41);
				int i1 = method623((byte)59);
				int j1 = 0xc6ef3720;
				int l1 = 32;
				int k1 = 0x9e3779b9;
				while(~l1-- < -1) 
				{
					i1 -= arg0[(0x1f3f & j1) >>> 0x7a5b372b] + j1 ^ l + (l >>> 0x1ab94d45 ^ l << 0x3620f104);
					j1 -= k1;
					l -= arg0[j1 & 3] + j1 ^ i1 + (i1 >>> 0x122c8ba5 ^ i1 << 0x13595f04);
				}
				anInt2239 -= 8;
				method669(l, -30515);
				method669(i1, -30515);
			}

			anInt2239 = i;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.F(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public int method651(int arg0)
	{
		try
		{
			anInt2238++;
			int i = 0 % ((arg0 - -41) / 33);
			int j = aByteArray2296[anInt2239] & 0xff;
			if(j < 128)
				return method639((byte)123);
			else
				return -32768 + method666(71);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.UB(" + arg0 + ')');
		}
	}

	public void method652(int arg0, int arg1)
	{
		try
		{
			if(arg1 != -4)
			{
				return;
			} else
			{
				anInt2249++;
				aByteArray2296[anInt2239++] = (byte)(128 + -arg0);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.V(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method653(int arg0)
	{
		try
		{
			anInt2239 += 4;
			anInt2274++;
			if(arg0 != 255)
				method657(10);
			return ((aByteArray2296[-4 + anInt2239] & 0xff) << 0x112d6ec8) + ((0xff000000 & aByteArray2296[anInt2239 - 2] << 0xb56fdad8) - -(0xff0000 & aByteArray2296[-1 + anInt2239] << 0x1b0ba2b0)) + (0xff & aByteArray2296[anInt2239 - 3]);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.TB(" + arg0 + ')');
		}
	}

	public void method654(int arg0, int arg1)
	{
		try
		{
			aByteArray2296[anInt2239++] = (byte)arg1;
			anInt2232++;
			aByteArray2296[anInt2239++] = (byte)(arg1 >> 0x1cd25bc8);
			aByteArray2296[anInt2239++] = (byte)(arg1 >> 0xfb5ef9b0);
			if(arg0 != 0x1bb12a8)
			{
				return;
			} else
			{
				aByteArray2296[anInt2239++] = (byte)(arg1 >> 0x1f5068d8);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.PB(" + arg0 + ',' + arg1 + ')');
		}
	}

	public long method655(int arg0)
	{
		try
		{
			if(arg0 != -13628)
				method636(true);
			anInt2234++;
			long l = (long)method623((byte)-98) & 0xffffffffL;
			long l1 = 0xffffffffL & (long)method623((byte)-110);
			return l1 + (l << 0x7a8f0520);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.PA(" + arg0 + ')');
		}
	}

	public int method656(boolean arg0)
	{
		try
		{
			if(arg0)
			{
				return 62;
			} else
			{
				anInt2265++;
				anInt2239 += 2;
				return (aByteArray2296[anInt2239 - 1] << 0xbb981c8 & 0xff00) - -(0xff & aByteArray2296[-2 + anInt2239] - 128);
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.KA(" + arg0 + ')');
		}
	}

	public byte method657(int arg0)
	{
		try
		{
			anInt2258++;
			if(arg0 != 0)
				return -5;
			else
				return (byte)(128 + -aByteArray2296[anInt2239++]);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.OB(" + arg0 + ')');
		}
	}

	public int method658(byte arg0)
	{
		try
		{
			if(arg0 >= -127)
				method668(null, false, -34, 116);
			anInt2282++;
			anInt2239 += 2;
			return ((0xff & aByteArray2296[anInt2239 - 2]) << 0xac9b4308) + (0xff & aByteArray2296[-1 + anInt2239] + -128);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.D(" + arg0 + ')');
		}
	}

	public void method659(int arg0, int arg1)
	{
		try
		{
			if(arg0 <= 78)
				method641(-82);
			anInt2269++;
			if(arg1 >= 0 && arg1 < 128)
			{
				method640(arg1, -11124);
				return;
			}
			if(arg1 >= 0 && ~arg1 > -32769)
			{
				method625(32768 + arg1, true);
				return;
			} else
			{
				throw new IllegalArgumentException();
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.IA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method660(int arg0, BigInteger arg1, BigInteger arg2)
	{
		try
		{
			anInt2246++;
			int i = anInt2239;
			byte abyte0[] = new byte[i];
			anInt2239 = arg0;
			method644(0, abyte0, 15162, i);
			BigInteger biginteger = new BigInteger(abyte0);
			BigInteger biginteger1 = biginteger;//.modPow(arg2, arg1);
			byte abyte1[] = biginteger1.toByteArray();
			anInt2239 = 0;
			method640(abyte1.length, -11124);
			method668(abyte1, false, 0, abyte1.length);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.E(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public byte method661(byte arg0)
	{
		try
		{
			if(arg0 > -99)
				method662(-69, 25);
			anInt2278++;
			return aByteArray2296[anInt2239++];
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.K(" + arg0 + ')');
		}
	}

	public int method662(int arg0, int arg1)
	{
		try
		{
			anInt2275++;
			int j = -24 / ((-54 - arg1) / 55);
			int i = Class33_Sub18.method811(arg0, anInt2239, 0xc09a5ae8, aByteArray2296);
			method669(i, -30515);
			return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.NB(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method663(int arg0, int arg1)
	{
		try
		{
			anInt2288++;
			aByteArray2296[anInt2239++] = (byte)(arg0 >> 0x8afcc070);
			if(arg1 != 768)
				method666(28);
			aByteArray2296[anInt2239++] = (byte)(arg0 >> 0x1a135498);
			aByteArray2296[anInt2239++] = (byte)arg0;
			aByteArray2296[anInt2239++] = (byte)(arg0 >> 0xce893808);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.LB(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method664(boolean arg0, int arg1)
	{
		try
		{
			aByteArray2296[anInt2239++] = (byte)(arg1 >> 0x479b6ae8);
			if(!arg0)
				method668(null, false, -3, 75);
			aByteArray2296[anInt2239++] = (byte)arg1;
			anInt2298++;
			aByteArray2296[anInt2239++] = (byte)(arg1 >> 0xb899e338);
			aByteArray2296[anInt2239++] = (byte)(arg1 >> 0x48cdafb0);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.IB(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int method665(int arg0)
	{
		try
		{
			if(arg0 < 28)
				method643((byte)-35);
			anInt2303++;
			return 0xff & -aByteArray2296[anInt2239++] + 128;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.BA(" + arg0 + ')');
		}
	}

	public int method666(int arg0)
	{
		try
		{
			if(arg0 < 29)
				aClass15_2241 = null;
			anInt2239 += 2;
			anInt2302++;
			return (aByteArray2296[anInt2239 + -1] & 0xff) + ((0xff & aByteArray2296[-2 + anInt2239]) << 0xe3c5f448);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.MA(" + arg0 + ')');
		}
	}

	public int method667(byte arg0)
	{
		try
		{
			anInt2300++;
			anInt2239 += 2;
			int i = ((aByteArray2296[anInt2239 + -1] & 0xff) << 0x462396c8) - -(aByteArray2296[-2 + anInt2239] + -128 & 0xff);
			if(~i < -32768)
				i -= 0x10000;
			if(arg0 != 77)
				aCalendar2243 = null;
			return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.JB(" + arg0 + ')');
		}
	}

	public void method668(byte arg0[], boolean arg1, int arg2, int arg3)
	{
		try
		{
			anInt2276++;
			if(arg1)
				aClass15_2241 = null;
			for(int i = arg2; i < arg2 - -arg3; i++)
				aByteArray2296[anInt2239++] = arg0[i];

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.FB(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public void method669(int arg0, int arg1)
	{
		try
		{
			aByteArray2296[anInt2239++] = (byte)(arg0 >> 0x501bd538);
			aByteArray2296[anInt2239++] = (byte)(arg0 >> 0x2bfd7e70);
			if(arg1 != -30515)
				method626((byte)-73);
			anInt2250++;
			aByteArray2296[anInt2239++] = (byte)(arg0 >> 0x54903268);
			aByteArray2296[anInt2239++] = (byte)arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.RB(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void method670(int arg0, int arg1)
	{
		try
		{
			aByteArray2296[anInt2239++] = (byte)(arg0 >> 0x78be4a88);
			aByteArray2296[anInt2239++] = (byte)(arg0 + -arg1);
			anInt2304++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.EA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method671(int arg0, Class33_Sub6_Sub4_Sub5_Sub1 arg1, byte arg2, int arg3)
	{
		anInt2294++;
		if(~(0x80 & arg3) != -1)
		{
			arg1.anInt3572 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
			arg1.anInt3535 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
		}
		if((arg3 & 0x200) != 0)
		{
			int i = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
			int k1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
			arg1.method361(k1, Class33_Sub6_Sub6.anInt2785, (byte)102, i);
			arg1.anInt3540 = 300 + Class33_Sub6_Sub6.anInt2785;
			arg1.anInt3534 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(107);
			arg1.anInt3495 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(arg2 ^ 0x48);
		}
		if((arg3 & 1) != 0)
		{
			arg1.aClass58_3507 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method646(-122);
			if(((Class33_Sub6_Sub4_Sub5) (arg1)).aClass58_3507.method1031(false, 0) == 126)
			{
				arg1.aClass58_3507 = ((Class33_Sub6_Sub4_Sub5) (arg1)).aClass58_3507.method1028(1, (byte)120);
				Class43.method904(2, arg2 + -47, ((Class33_Sub6_Sub4_Sub5) (arg1)).aClass58_3507, arg1.aClass58_3755);
			} else
			if(Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305 == arg1)
				Class43.method904(2, 0, ((Class33_Sub6_Sub4_Sub5) (arg1)).aClass58_3507, arg1.aClass58_3755);
			arg1.anInt3562 = 0;
			arg1.anInt3551 = 150;
			arg1.anInt3515 = 0;
		}
		if((arg3 & 4) != 0)
		{
			int j = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method658((byte)-128);
			int l1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(93);
			int k2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			int l2 = ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239;
			if(arg1.aClass58_3755 != null && arg1.aClass46_3754 != null)
			{
				long l3 = arg1.aClass58_3755.method1062((byte)11);
				boolean flag = false;
				if(l1 <= 1)
				{
					for(int i3 = 0; Class65.anInt1388 > i3; i3++)
					{
						if(Class33_Sub6_Sub16.aLongArray3103[i3] != l3)
							continue;
						flag = true;
						break;
					}

				}
				if(!flag && Class79.anInt1714 == 0)
				{
					Class27.aClass33_Sub11_562.anInt2239 = 0;
					Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method649((byte)-126, 0, k2, Class27.aClass33_Sub11_562.aByteArray2296);
					Class27.aClass33_Sub11_562.anInt2239 = 0;
					Class58 class58 = Class33_Sub6_Sub7_Sub2.method451(client.method35(Class27.aClass33_Sub11_562, 1).method1061(-119));
					arg1.aClass58_3507 = class58.method1026((byte)-124);
					arg1.anInt3562 = j >> 0xa2009448;
					arg1.anInt3515 = j & 0xff;
					arg1.anInt3551 = 150;
					if(l1 != 2 && ~l1 != -4)
					{
						if(l1 == 1)
							Class43.method904(1, 0, class58, Class35.method846((byte)-83, new Class58[] {
								Class24.aClass58_513, arg1.aClass58_3755
							}));
						else
							Class43.method904(2, 0, class58, arg1.aClass58_3755);
					} else
					{
						Class43.method904(1, 0, class58, Class35.method846((byte)-83, new Class58[] {
							Class33_Sub20.aClass58_2564, arg1.aClass58_3755
						}));
					}
				}
			}
			Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.anInt2239 = l2 - -k2;
		}
		if((0x20 & arg3) != 0)
		{
			int k = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(84);
			int i2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(108);
			arg1.method361(i2, Class33_Sub6_Sub6.anInt2785, (byte)102, k);
			arg1.anInt3540 = 300 + Class33_Sub6_Sub6.anInt2785;
			arg1.anInt3534 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(arg2 ^ 0x45);
			arg1.anInt3495 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
		}
		if((arg3 & 0x10) != 0)
		{
			arg1.anInt3546 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false);
			if(~((Class33_Sub6_Sub4_Sub5) (arg1)).anInt3546 == 0xffff0000)
				arg1.anInt3546 = -1;
		}
		if(arg2 != 47)
			method621((byte)-13);
		if((arg3 & 0x40) != 0)
		{
			int l = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method666(50);
			if(l == 65535)
				l = -1;
			int j2 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(arg2 ^ 0x63);
			Canvas_Sub1.method45(arg1, j2, l, true);
		}
		if(~(0x100 & arg3) != -1)
		{
			arg1.anInt3564 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method643((byte)-97);
			int i1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method636(false);
			arg1.anInt3531 = i1 >> 0xd2ba1670;
			arg1.anInt3524 = Class33_Sub6_Sub6.anInt2785 - -(i1 & 0xffff);
			arg1.anInt3511 = 0;
			if(((Class33_Sub6_Sub4_Sub5) (arg1)).anInt3564 == 65535)
				arg1.anInt3564 = -1;
			arg1.anInt3527 = 0;
			if(~((Class33_Sub6_Sub4_Sub5) (arg1)).anInt3524 < ~Class33_Sub6_Sub6.anInt2785)
				arg1.anInt3511 = -1;
		}
		if(~(arg3 & 8) != -1)
		{
			int j1 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method639((byte)123);
			byte abyte0[] = new byte[j1];
			Class33_Sub11 class33_sub11 = new Class33_Sub11(abyte0);
			Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method649((byte)-126, 0, j1, abyte0);
			Class33_Sub6_Sub4_Sub1.aClass33_Sub11Array3346[arg0] = class33_sub11;
			arg1.method368(class33_sub11, -71);
		}
		if((0x400 & arg3) != 0)
		{
			arg1.anInt3553 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(95);
			arg1.anInt3550 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method628((byte)-73);
			arg1.anInt3536 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method620(114);
			arg1.anInt3556 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(121);
			arg1.anInt3563 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false) - -Class33_Sub6_Sub6.anInt2785;
			arg1.anInt3526 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method656(false) - -Class33_Sub6_Sub6.anInt2785;
			arg1.anInt3571 = Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035.method665(59);
			arg1.anInt3505 = 0;
			arg1.anInt3513 = 1;
		}
	}

	public int method672(int arg0)
	{
		try
		{
			anInt2239 += 2;
			anInt2268++;
			if(arg0 <= 64)
				method675(81L, (byte)-32);
			int i = ((0xff & aByteArray2296[-2 + anInt2239]) << 0x9cf49bc8) - -(aByteArray2296[anInt2239 + -1] & 0xff);
			if(~i < -32768)
				i -= 0x10000;
			return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.HB(" + arg0 + ')');
		}
	}

	public void method673(int arg0, int arg1)
	{
		try
		{
			aByteArray2296[anInt2239++] = (byte)arg1;
			anInt2236++;
			if(arg0 >= -95)
				aClass33_Sub11_2264 = null;
			aByteArray2296[anInt2239++] = (byte)(arg1 >> 0x4b051708);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.C(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method674(boolean arg0)
	{
		try
		{
			Class33_Sub9.aByteArrayArrayArray2180 = new byte[4][104][104];
			Class33_Sub3.anIntArray2059 = new int[104];
			Class78.aByteArrayArrayArray1676 = new byte[4][104][104];
			Class17.anIntArrayArrayArray351 = new int[4][105][105];
			Class23.anIntArrayArray472 = new int[105][105];
			RuntimeException_Sub1.aByteArrayArrayArray1812 = new byte[4][104][104];
			Class12.aByteArrayArrayArray239 = new byte[4][105][105];
			Canvas_Sub1.aByteArrayArrayArray57 = new byte[4][104][104];
			anInt2295++;
			Class33_Sub6_Sub4_Sub5_Sub1.anInt3761 = 99;
			Class16.anIntArray328 = new int[104];
			if(!arg0)
			{
				return;
			} else
			{
				Class33_Sub5.anIntArray2118 = new int[104];
				Class21.anIntArray394 = new int[104];
				anIntArray2261 = new int[104];
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.S(" + arg0 + ')');
		}
	}

	public void method675(long arg0, byte arg1)
	{
		try
		{
			aByteArray2296[anInt2239++] = (byte)(int)(arg0 >> 0x50e8cbf8);
			aByteArray2296[anInt2239++] = (byte)(int)(arg0 >> 0x3af0ec30);
			anInt2281++;
			aByteArray2296[anInt2239++] = (byte)(int)(arg0 >> 0x4fb309a8);
			aByteArray2296[anInt2239++] = (byte)(int)(arg0 >> 0x3e571f60);
			aByteArray2296[anInt2239++] = (byte)(int)(arg0 >> 0x29115c18);
			aByteArray2296[anInt2239++] = (byte)(int)(arg0 >> 0x4896b1d0);
			if(arg1 <= 103)
				aByteArray2296 = null;
			aByteArray2296[anInt2239++] = (byte)(int)(arg0 >> 0xa0f21448);
			aByteArray2296[anInt2239++] = (byte)(int)arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.QB(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub11(int arg0)
	{
		try
		{
			aByteArray2296 = Class73.method1152(arg0, -68);
			anInt2239 = 0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.<init>(" + arg0 + ')');
		}
	}

	public Class33_Sub11(byte arg0[])
	{
		try
		{
			aByteArray2296 = arg0;
			anInt2239 = 0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "la.<init>(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt2231;
	public static int anInt2232;
	public static int anInt2233;
	public static int anInt2234;
	public static int anInt2235;
	public static int anInt2236;
	public static Class30_Sub1 aClass30_Sub1Array2237[] = new Class30_Sub1[256];
	public static int anInt2238;
	public int anInt2239;
	public static int anInt2240;
	public static Class15 aClass15_2241;
	public static int anInt2242;
	public static Calendar aCalendar2243 = Calendar.getInstance();
	public static int anInt2244;
	public static int anInt2245;
	public static int anInt2246;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_2247;
	public static int anInt2248;
	public static int anInt2249;
	public static int anInt2250;
	public static Class58 aClass58_2251;
	public static int anInt2252;
	public static int anInt2253;
	public static int anInt2254;
	public static int anInt2255;
	public static int anInt2256;
	public static Class30 aClass30_2257;
	public static int anInt2258;
	public static Class30 aClass30_2259;
	public static Class58 aClass58_2260;
	public static int anIntArray2261[];
	public static int anInt2262 = 0;
	public static int anInt2263;
	public static Class33_Sub11 aClass33_Sub11_2264;
	public static int anInt2265;
	public static int anInt2266;
	public static int anInt2267;
	public static int anInt2268;
	public static int anInt2269;
	public static int anInt2270;
	public static int anInt2271;
	public static Class58 aClass58_2272 = Class33_Sub6_Sub11.method535(106, "(Udns");
	public static int anInt2273;
	public static int anInt2274;
	public static int anInt2275;
	public static int anInt2276;
	public static int anInt2277;
	public static int anInt2278;
	public static int anInt2279;
	public static int anInt2280;
	public static int anInt2281;
	public static int anInt2282;
	public static int anInt2283;
	public static int anInt2284;
	public static int anInt2285;
	public static int anInt2286;
	public static int anInt2287;
	public static int anInt2288;
	public static int anInt2289;
	public static Class58 aClass58_2290 = Class33_Sub6_Sub11.method535(122, "Bitte warten Sie)3)3)3");
	public static int anInt2291;
	public static int anInt2292;
	public static int anInt2293;
	public static int anInt2294;
	public static int anInt2295;
	public byte aByteArray2296[];
	public static int anInt2297;
	public static int anInt2298;
	public static Class58 aClass58_2299 = Class33_Sub6_Sub11.method535(117, "mapedge");
	public static int anInt2300;
	public static Class58 aClass58_2301 = Class33_Sub6_Sub11.method535(113, "Lade)3)3)3");
	public static int anInt2302;
	public static int anInt2303;
	public static int anInt2304;

	static 
	{
		aClass58_2251 = Class33_Sub6_Sub11.method535(127, "Click to switch");
		aClass58_2260 = aClass58_2251;
	}
}
