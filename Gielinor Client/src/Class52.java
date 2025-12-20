// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class52.java


public class Class52
{

	public static void method944(byte arg0[])
	{
		method951(arg0, 0);
		anInt1120 = 1 << method947(4);
		anInt1130 = 1 << method947(4);
		aFloatArray1123 = new float[anInt1130];
		aFloatArray1137 = new float[anInt1130];
		for(int i = 0; i < 2; i++)
		{
			int j = i == 0 ? anInt1120 : anInt1130;
			int l = j >> 1;
			int j1 = j >> 2;
			int l1 = j >> 3;
			float af[] = new float[l];
			for(int k2 = 0; k2 < j1; k2++)
			{
				af[2 * k2] = (float)Math.cos(((double)(4 * k2) * 3.1415926535897931D) / (double)j);
				af[2 * k2 + 1] = -(float)Math.sin(((double)(4 * k2) * 3.1415926535897931D) / (double)j);
			}

			float af1[] = new float[l];
			for(int j3 = 0; j3 < j1; j3++)
			{
				af1[2 * j3] = (float)Math.cos(((double)(2 * j3 + 1) * 3.1415926535897931D) / (double)(2 * j));
				af1[2 * j3 + 1] = (float)Math.sin(((double)(2 * j3 + 1) * 3.1415926535897931D) / (double)(2 * j));
			}

			float af2[] = new float[j1];
			for(int i4 = 0; i4 < l1; i4++)
			{
				af2[2 * i4] = (float)Math.cos(((double)(4 * i4 + 2) * 3.1415926535897931D) / (double)j);
				af2[2 * i4 + 1] = -(float)Math.sin(((double)(4 * i4 + 2) * 3.1415926535897931D) / (double)j);
			}

			int ai[] = new int[l1];
			int l4 = Class58.method1058(l1 - 1, (byte)-98);
			for(int j5 = 0; j5 < l1; j5++)
				ai[j5] = Class31.method253(-58, l4, j5);

			if(i != 0)
			{
				aFloatArray1129 = af;
				aFloatArray1124 = af1;
				aFloatArray1128 = af2;
				anIntArray1109 = ai;
			} else
			{
				aFloatArray1131 = af;
				aFloatArray1112 = af1;
				aFloatArray1116 = af2;
				anIntArray1110 = ai;
			}
		}

		int k = method947(8) + 1;
		aClass7Array1113 = new Class7[k];
		for(int i1 = 0; i1 < k; i1++)
			aClass7Array1113[i1] = new Class7();

		int k1 = method947(6) + 1;
		for(int i2 = 0; i2 < k1; i2++)
			method947(16);

		int j2 = method947(6) + 1;
		aClass25Array1134 = new Class25[j2];
		for(int l2 = 0; l2 < j2; l2++)
			aClass25Array1134[l2] = new Class25();

		int i3 = method947(6) + 1;
		aClass76Array1119 = new Class76[i3];
		for(int k3 = 0; k3 < i3; k3++)
			aClass76Array1119[k3] = new Class76();

		int l3 = method947(6) + 1;
		aClass8Array1114 = new Class8[l3];
		for(int j4 = 0; j4 < l3; j4++)
			aClass8Array1114[j4] = new Class8();

		int k4 = method947(6) + 1;
		aBooleanArray1138 = new boolean[k4];
		anIntArray1135 = new int[k4];
		for(int i5 = 0; i5 < k4; i5++)
		{
			aBooleanArray1138[i5] = method945() != 0;
			method947(16);
			method947(16);
			anIntArray1135[i5] = method947(8);
		}

	}

	public static int method945()
	{
		int i = aByteArray1136[anInt1127] >> anInt1139 & 1;
		anInt1139++;
		anInt1127 += anInt1139 >> 3;
		anInt1139 &= 7;
		return i;
	}

	public static void method946()
	{
		aByteArray1136 = null;
		aClass7Array1113 = null;
		aClass25Array1134 = null;
		aClass76Array1119 = null;
		aClass8Array1114 = null;
		aBooleanArray1138 = null;
		anIntArray1135 = null;
		aFloatArray1137 = null;
		aFloatArray1123 = null;
		aFloatArray1131 = null;
		aFloatArray1112 = null;
		aFloatArray1116 = null;
		aFloatArray1129 = null;
		aFloatArray1124 = null;
		aFloatArray1128 = null;
		anIntArray1110 = null;
		anIntArray1109 = null;
	}

	public static int method947(int arg0)
	{
		int i = 0;
		int j = 0;
		int k;
		for(; arg0 >= 8 - anInt1139; arg0 -= k)
		{
			k = 8 - anInt1139;
			int i1 = (1 << k) - 1;
			i += (aByteArray1136[anInt1127] >> anInt1139 & i1) << j;
			anInt1139 = 0;
			anInt1127++;
			j += k;
		}

		if(arg0 > 0)
		{
			int l = (1 << arg0) - 1;
			i += (aByteArray1136[anInt1127] >> anInt1139 & l) << j;
			anInt1139 += arg0;
		}
		return i;
	}

	public void method948(byte arg0[])
	{
		Class33_Sub11 class33_sub11 = new Class33_Sub11(arg0);
		anInt1121 = class33_sub11.method623((byte)109);
		anInt1122 = class33_sub11.method623((byte)94);
		anInt1126 = class33_sub11.method623((byte)93);
		anInt1132 = class33_sub11.method623((byte)-117);
		if(anInt1132 < 0)
		{
			anInt1132 = ~anInt1132;
			aBoolean1125 = true;
		}
		int i = class33_sub11.method623((byte)79);
		aByteArrayArray1118 = new byte[i][];
		for(int j = 0; j < i; j++)
		{
			int k = 0;
			int l;
			do
			{
				l = class33_sub11.method639((byte)123);
				k += l;
			} while(l >= 255);
			byte abyte0[] = new byte[k];
			class33_sub11.method644(0, abyte0, 15162, k);
			aByteArrayArray1118[j] = abyte0;
		}

	}

	public static Class52 method949(Class30 arg0, int arg1, int arg2)
	{
		if(!method950(arg0))
		{
			arg0.method225(arg1, -111, arg2);
			return null;
		}
		byte abyte0[] = arg0.method238(false, arg2, arg1);
		if(abyte0 == null)
			return null;
		else
			return new Class52(abyte0);
	}

	public static boolean method950(Class30 arg0)
	{
		if(!aBoolean1117)
		{
			byte abyte0[] = arg0.method238(false, 0, 0);
			if(abyte0 == null)
				return false;
			method944(abyte0);
			aBoolean1117 = true;
		}
		return true;
	}

	public static void method951(byte arg0[], int arg1)
	{
		aByteArray1136 = arg0;
		anInt1127 = arg1;
		anInt1139 = 0;
	}

	public Class33_Sub8_Sub1 method952()
	{
		anInt1115 = 0;
		byte abyte0[] = new byte[anInt1122];
		int i = 0;
		for(int j = 0; j < aByteArrayArray1118.length; j++)
		{
			float af[] = method954(j);
			if(af != null)
			{
				int k = af.length;
				if(k > anInt1122 - i)
					k = anInt1122 - i;
				for(int l = 0; l < k; l++)
				{
					int i1 = (int)(128F + af[l] * 128F);
					if((i1 & 0xffffff00) != 0)
						i1 = ~i1 >> 31;
					abyte0[i++] = (byte)(i1 - 128);
				}

			}
		}

		return new Class33_Sub8_Sub1(anInt1121, abyte0, anInt1126, anInt1132, aBoolean1125);
	}

	public Class52(byte arg0[])
	{
		method948(arg0);
	}

	public static float method953(int arg0)
	{
		int i = arg0 & 0x1fffff;
		int j = arg0 & 0x80000000;
		int k = (arg0 & 0x7fe00000) >> 21;
		if(j != 0)
			i = -i;
		return (float)((double)i * Math.pow(2D, k - 788));
	}

	public float[] method954(int arg0)
	{
		method951(aByteArrayArray1118[arg0], 0);
		method945();
		int i = method947(Class58.method1058(anIntArray1135.length - 1, (byte)-98));
		boolean flag = aBooleanArray1138[i];
		int j = flag ? anInt1130 : anInt1120;
		boolean flag1 = false;
		boolean flag2 = false;
		if(flag)
		{
			flag1 = method945() != 0;
			flag2 = method945() != 0;
		}
		int k = j >> 1;
		int l;
		int i1;
		int j1;
		if(flag && !flag1)
		{
			l = (j >> 2) - (anInt1120 >> 2);
			i1 = (j >> 2) + (anInt1120 >> 2);
			j1 = anInt1120 >> 1;
		} else
		{
			l = 0;
			i1 = k;
			j1 = j >> 1;
		}
		int k1;
		int l1;
		int i2;
		if(flag && !flag2)
		{
			k1 = j - (j >> 2) - (anInt1120 >> 2);
			l1 = (j - (j >> 2)) + (anInt1120 >> 2);
			i2 = anInt1120 >> 1;
		} else
		{
			k1 = k;
			l1 = j;
			i2 = j >> 1;
		}
		Class8 class8 = aClass8Array1114[anIntArray1135[i]];
		int j2 = class8.anInt162;
		int k2 = class8.anIntArray161[j2];
		boolean flag3 = !aClass25Array1134[k2].method196();
		boolean flag4 = flag3;
		for(int l2 = 0; l2 < class8.anInt160; l2++)
		{
			Class76 class76 = aClass76Array1119[class8.anIntArray163[l2]];
			float af1[] = aFloatArray1123;
			class76.method1167(af1, j >> 1, flag4);
		}

		if(!flag3)
		{
			int i3 = class8.anInt162;
			int l3 = class8.anIntArray161[i3];
			aClass25Array1134[l3].method200(aFloatArray1123, j >> 1);
		}
		if(flag3)
		{
			for(int j3 = j >> 1; j3 < j; j3++)
				aFloatArray1123[j3] = 0.0F;

		} else
		{
			int k3 = j >> 1;
			int i4 = j >> 2;
			int k4 = j >> 3;
			float af3[] = aFloatArray1123;
			for(int l5 = 0; l5 < k3; l5++)
				af3[l5] *= 0.5F;

			for(int i6 = k3; i6 < j; i6++)
				af3[i6] = -af3[j - i6 - 1];

			float af4[] = flag ? aFloatArray1129 : aFloatArray1131;
			float af5[] = flag ? aFloatArray1124 : aFloatArray1112;
			float af6[] = flag ? aFloatArray1128 : aFloatArray1116;
			int ai[] = flag ? anIntArray1109 : anIntArray1110;
			for(int j6 = 0; j6 < i4; j6++)
			{
				float f = af3[4 * j6] - af3[j - 4 * j6 - 1];
				float f1 = af3[4 * j6 + 2] - af3[j - 4 * j6 - 3];
				float f3 = af4[2 * j6];
				float f5 = af4[2 * j6 + 1];
				af3[j - 4 * j6 - 1] = f * f3 - f1 * f5;
				af3[j - 4 * j6 - 3] = f * f5 + f1 * f3;
			}

			for(int k6 = 0; k6 < k4; k6++)
			{
				float f2 = af3[k3 + 3 + 4 * k6];
				float f4 = af3[k3 + 1 + 4 * k6];
				float f6 = af3[4 * k6 + 3];
				float f7 = af3[4 * k6 + 1];
				af3[k3 + 3 + 4 * k6] = f2 + f6;
				af3[k3 + 1 + 4 * k6] = f4 + f7;
				float f8 = af4[k3 - 4 - 4 * k6];
				float f9 = af4[k3 - 3 - 4 * k6];
				af3[4 * k6 + 3] = (f2 - f6) * f8 - (f4 - f7) * f9;
				af3[4 * k6 + 1] = (f4 - f7) * f8 + (f2 - f6) * f9;
			}

			int l6 = Class58.method1058(j - 1, (byte)-98);
			for(int i7 = 0; i7 < l6 - 3; i7++)
			{
				int j7 = j >> i7 + 2;
				int l7 = 8 << i7;
				for(int k8 = 0; k8 < 2 << i7; k8++)
				{
					int j9 = j - j7 * 2 * k8;
					int i10 = j - j7 * (2 * k8 + 1);
					for(int k10 = 0; k10 < j >> i7 + 4; k10++)
					{
						int i11 = 4 * k10;
						float f14 = af3[j9 - 1 - i11];
						float f16 = af3[j9 - 3 - i11];
						float f18 = af3[i10 - 1 - i11];
						float f20 = af3[i10 - 3 - i11];
						af3[j9 - 1 - i11] = f14 + f18;
						af3[j9 - 3 - i11] = f16 + f20;
						float f23 = af4[k10 * l7];
						float f25 = af4[k10 * l7 + 1];
						af3[i10 - 1 - i11] = (f14 - f18) * f23 - (f16 - f20) * f25;
						af3[i10 - 3 - i11] = (f16 - f20) * f23 + (f14 - f18) * f25;
					}

				}

			}

			for(int k7 = 1; k7 < k4 - 1; k7++)
			{
				int i8 = ai[k7];
				if(k7 < i8)
				{
					int l8 = 8 * k7;
					int k9 = 8 * i8;
					float f10 = af3[l8 + 1];
					af3[l8 + 1] = af3[k9 + 1];
					af3[k9 + 1] = f10;
					f10 = af3[l8 + 3];
					af3[l8 + 3] = af3[k9 + 3];
					af3[k9 + 3] = f10;
					f10 = af3[l8 + 5];
					af3[l8 + 5] = af3[k9 + 5];
					af3[k9 + 5] = f10;
					f10 = af3[l8 + 7];
					af3[l8 + 7] = af3[k9 + 7];
					af3[k9 + 7] = f10;
				}
			}

			for(int j8 = 0; j8 < k3; j8++)
				af3[j8] = af3[2 * j8 + 1];

			for(int i9 = 0; i9 < k4; i9++)
			{
				af3[j - 1 - 2 * i9] = af3[4 * i9];
				af3[j - 2 - 2 * i9] = af3[4 * i9 + 1];
				af3[j - i4 - 1 - 2 * i9] = af3[4 * i9 + 2];
				af3[j - i4 - 2 - 2 * i9] = af3[4 * i9 + 3];
			}

			for(int l9 = 0; l9 < k4; l9++)
			{
				float f11 = af6[2 * l9];
				float f12 = af6[2 * l9 + 1];
				float f13 = af3[k3 + 2 * l9];
				float f15 = af3[k3 + 2 * l9 + 1];
				float f17 = af3[j - 2 - 2 * l9];
				float f19 = af3[j - 1 - 2 * l9];
				float f21 = f12 * (f13 - f17) + f11 * (f15 + f19);
				af3[k3 + 2 * l9] = (f13 + f17 + f21) * 0.5F;
				af3[j - 2 - 2 * l9] = ((f13 + f17) - f21) * 0.5F;
				f21 = f12 * (f15 + f19) - f11 * (f13 - f17);
				af3[k3 + 2 * l9 + 1] = ((f15 - f19) + f21) * 0.5F;
				af3[j - 1 - 2 * l9] = (-f15 + f19 + f21) * 0.5F;
			}

			for(int j10 = 0; j10 < i4; j10++)
			{
				af3[j10] = af3[2 * j10 + k3] * af5[2 * j10] + af3[2 * j10 + 1 + k3] * af5[2 * j10 + 1];
				af3[k3 - 1 - j10] = af3[2 * j10 + k3] * af5[2 * j10 + 1] - af3[2 * j10 + 1 + k3] * af5[2 * j10];
			}

			for(int l10 = 0; l10 < i4; l10++)
				af3[(j - i4) + l10] = -af3[l10];

			for(int j11 = 0; j11 < i4; j11++)
				af3[j11] = af3[i4 + j11];

			for(int k11 = 0; k11 < i4; k11++)
				af3[i4 + k11] = -af3[i4 - k11 - 1];

			for(int l11 = 0; l11 < i4; l11++)
				af3[k3 + l11] = af3[j - l11 - 1];

			for(int i12 = l; i12 < i1; i12++)
			{
				float f22 = (float)Math.sin((((double)(i12 - l) + 0.5D) / (double)j1) * 0.5D * 3.1415926535897931D);
				aFloatArray1123[i12] *= (float)Math.sin(1.5707963267948966D * (double)f22 * (double)f22);
			}

			for(int j12 = k1; j12 < l1; j12++)
			{
				float f24 = (float)Math.sin((((double)(j12 - k1) + 0.5D) / (double)i2) * 0.5D * 3.1415926535897931D + 1.5707963267948966D);
				aFloatArray1123[j12] *= (float)Math.sin(1.5707963267948966D * (double)f24 * (double)f24);
			}

		}
		float af[] = null;
		if(anInt1115 > 0)
		{
			int j4 = anInt1115 + j >> 2;
			af = new float[j4];
			if(!aBoolean1133)
			{
				for(int l4 = 0; l4 < anInt1111; l4++)
				{
					int j5 = (anInt1115 >> 1) + l4;
					af[l4] += aFloatArray1137[j5];
				}

			}
			if(!flag3)
			{
				for(int i5 = l; i5 < j >> 1; i5++)
				{
					int k5 = (af.length - (j >> 1)) + i5;
					af[k5] += aFloatArray1123[i5];
				}

			}
		}
		float af2[] = aFloatArray1137;
		aFloatArray1137 = aFloatArray1123;
		aFloatArray1123 = af2;
		anInt1115 = j;
		anInt1111 = l1 - (j >> 1);
		aBoolean1133 = flag3;
		return af;
	}

	public static int anIntArray1109[];
	public static int anIntArray1110[];
	public static int anInt1111;
	public static float aFloatArray1112[];
	public static Class7 aClass7Array1113[];
	public static Class8 aClass8Array1114[];
	public static int anInt1115;
	public static float aFloatArray1116[];
	public static boolean aBoolean1117 = false;
	public byte aByteArrayArray1118[][];
	public static Class76 aClass76Array1119[];
	public static int anInt1120;
	public int anInt1121;
	public int anInt1122;
	public static float aFloatArray1123[];
	public static float aFloatArray1124[];
	public boolean aBoolean1125;
	public int anInt1126;
	public static int anInt1127;
	public static float aFloatArray1128[];
	public static float aFloatArray1129[];
	public static int anInt1130;
	public static float aFloatArray1131[];
	public int anInt1132;
	public static boolean aBoolean1133;
	public static Class25 aClass25Array1134[];
	public static int anIntArray1135[];
	public static byte aByteArray1136[];
	public static float aFloatArray1137[];
	public static boolean aBooleanArray1138[];
	public static int anInt1139;

}
