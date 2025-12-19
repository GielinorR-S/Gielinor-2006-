// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub10.java

import java.awt.Font;
import java.util.zip.CRC32;

public class Class33_Sub10 extends Class33
{

	public static void method612(int arg0, int arg1, int arg2, int arg3)
	{
		anInt2200++;
		Class33_Sub15 class33_sub15 = Class39.method879(arg3, (byte)112, arg2);
		if(class33_sub15 == null)
			return;
		if(class33_sub15.anObjectArray2418 != null)
			Class13.method118(class33_sub15.anObjectArray2418, class33_sub15, 0, 0, null, 18859, arg1);
		boolean flag = true;
		if(~class33_sub15.anInt2446 < -1)
			flag = Class14.method129((byte)126, class33_sub15);
		if(!flag)
			return;
		if(!Class44.method908(-1 + arg1, Class33_Sub6_Sub5.method403(class33_sub15, arg0 + -5439), (byte)-112))
			return;
		if(~arg1 == -2)
		{
			Class3.anInt115++;
			Class46.aClass33_Sub11_Sub1_989.method683(225, -1198);
			Class46.aClass33_Sub11_Sub1_989.method669(arg3, -30515);
			Class46.aClass33_Sub11_Sub1_989.method625(arg2, true);
		}
		if(arg1 == 2)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(163, -1198);
			Class46.aClass33_Sub11_Sub1_989.method669(arg3, arg0 + -30507);
			Class33_Sub6_Sub17.anInt3138++;
			Class46.aClass33_Sub11_Sub1_989.method625(arg2, true);
		}
		if(~arg1 == -4)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(79, arg0 ^ 0x4aa);
			Class33_Sub6_Sub4_Sub5_Sub2.anInt3782++;
			Class46.aClass33_Sub11_Sub1_989.method669(arg3, -30515);
			Class46.aClass33_Sub11_Sub1_989.method625(arg2, true);
		}
		if(~arg1 == -5)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(147, -1198);
			Class38.anInt839++;
			Class46.aClass33_Sub11_Sub1_989.method669(arg3, -30515);
			Class46.aClass33_Sub11_Sub1_989.method625(arg2, true);
		}
		if(~arg1 == -6)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(74, -1198);
			Class46.aClass33_Sub11_Sub1_989.method669(arg3, -30515);
			Class23.anInt427++;
			Class46.aClass33_Sub11_Sub1_989.method625(arg2, true);
		}
		if(arg1 == 6)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(122, -1198);
			Class33_Sub6_Sub17.anInt3129++;
			Class46.aClass33_Sub11_Sub1_989.method669(arg3, -30515);
			Class46.aClass33_Sub11_Sub1_989.method625(arg2, true);
		}
		if(~arg1 == arg0)
		{
			Class46.aClass33_Sub11_Sub1_989.method683(42, -1198);
			Class46.aClass33_Sub11_Sub1_989.method669(arg3, arg0 ^ 0x7735);
			Class46.aClass33_Sub11_Sub1_989.method625(arg2, true);
			Class33_Sub6_Sub3.anInt2703++;
		}
		if(arg1 == 8)
		{
			Class35.anInt763++;
			Class46.aClass33_Sub11_Sub1_989.method683(255, -1198);
			Class46.aClass33_Sub11_Sub1_989.method669(arg3, -30515);
			Class46.aClass33_Sub11_Sub1_989.method625(arg2, true);
		}
		if(arg1 == 9)
		{
			Class60.anInt1287++;
			Class46.aClass33_Sub11_Sub1_989.method683(159, -1198);
			Class46.aClass33_Sub11_Sub1_989.method669(arg3, arg0 + -30507);
			Class46.aClass33_Sub11_Sub1_989.method625(arg2, true);
		}
		if(arg1 == 10)
		{
			Class33_Sub12.anInt2326++;
			Class46.aClass33_Sub11_Sub1_989.method683(121, -1198);
			Class46.aClass33_Sub11_Sub1_989.method669(arg3, -30515);
			Class46.aClass33_Sub11_Sub1_989.method625(arg2, true);
		}
	}

	public static int method613(int arg0, int arg1, boolean arg2, int arg3)
	{
		try
		{
			anInt2207++;
			arg3 &= 3;
			if(!arg2)
				method619((byte)79, -110, 48);
			if(~arg3 == -1)
				return arg1;
			if(arg3 == 1)
				return 7 + -arg0;
			if(~arg3 == -3)
				return -arg1 + 7;
			else
				return arg0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "k.H(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static void method614(int arg0)
	{
		try
		{
			anInt2224++;
			if(!Class33_Sub15.aBoolean2470)
				return;
			Class33_Sub15 class33_sub15 = Class39.method879(Class26.anInt533, (byte)124, Class33_Sub20.anInt2576);
			if(class33_sub15 != null && class33_sub15.anObjectArray2346 != null)
				Class13.method118(class33_sub15.anObjectArray2346, class33_sub15, 0, 0, null, 18859, 0);
			int i = -70 / ((arg0 - -11) / 57);
			Class33_Sub15.aBoolean2470 = false;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "k.D(" + arg0 + ')');
		}
	}

	public boolean method615(byte arg0[], Class26 arg1, byte arg2, int arg3[])
	{
		try
		{
			anInt2204++;
			int i = 0;
			if(arg2 < 15)
				return true;
			Class33_Sub8_Sub1 class33_sub8_sub1 = null;
			boolean flag = true;
			for(int j = 0; j < 128; j++)
				if(arg0 == null || ~arg0[j] != -1)
				{
					int k = anIntArray2203[j];
					if(k != 0)
					{
						if(k != i)
						{
							i = k;
							if((--k & 1) != 0)
								class33_sub8_sub1 = arg1.method203(arg3, (byte)51, k >> 0x46412e22);
							else
								class33_sub8_sub1 = arg1.method205(k >> 0x8227e622, 0, arg3);
							if(class33_sub8_sub1 == null)
								flag = false;
						}
						if(class33_sub8_sub1 != null)
						{
							aClass33_Sub8_Sub1Array2205[j] = class33_sub8_sub1;
							anIntArray2203[j] = 0;
						}
					}
				}

			return flag;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "k.F(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method616(byte arg0)
	{
		try
		{
			anInt2219++;
			if(Class14.anInt276 < 2 && Class33_Sub6_Sub4_Sub6.anInt3590 == 0 && !Class33_Sub15.aBoolean2470)
				return;
			if(arg0 > -96)
				method619((byte)-98, 53, 69);
			Class58 class58;
			if(~Class33_Sub6_Sub4_Sub6.anInt3590 != -2 || ~Class14.anInt276 <= -3)
			{
				if(!Class33_Sub15.aBoolean2470 || Class14.anInt276 >= 2)
					class58 = Class39.aClass58Array868[-1 + Class14.anInt276];
				else
					class58 = Class35.method846((byte)-83, new Class58[] {
						Class33_Sub6_Sub4_Sub6.aClass58_3610, Class48.aClass58_1057, Class33_Sub18.aClass58_2518, Class15_Sub2.aClass58_1981
					});
			} else
			{
				class58 = Class35.method846((byte)-83, new Class58[] {
					Class9.aClass58_171, Class48.aClass58_1057, Class77.aClass58_1649, Class15_Sub2.aClass58_1981
				});
			}
			if(~Class14.anInt276 < -3)
				class58 = Class35.method846((byte)-83, new Class58[] {
					class58, Class26.aClass58_553, Class37.method859(15591, -2 + Class14.anInt276), Class23.aClass58_490
				});
			Class75.aClass33_Sub6_Sub7_Sub2_1632.method455(class58, 4, 15, 0xffffff, 0, Class33_Sub6_Sub6.anInt2785 / 1000);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "k.G(" + arg0 + ')');
		}
	}

	public static void method617(int arg0)
	{
		try
		{
			anIntArray2201 = null;
			aClass58_2229 = null;
			aClass58_2214 = null;
			aClass58_2223 = null;
			aFont2222 = null;
			aClass58_2213 = null;
			aClass58_2226 = null;
			aClass58_2228 = null;
			aClass58_2220 = null;
			aCRC32_2202 = null;
			aClass58_2225 = null;
			aClass58_2230 = null;
			int i = 27 % ((-1 - arg0) / 55);
			aClass58_2227 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "k.E(" + arg0 + ')');
		}
	}

	public void method618(byte arg0)
	{
		try
		{
			if(arg0 != 33)
			{
				return;
			} else
			{
				anInt2209++;
				anIntArray2203 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "k.B(" + arg0 + ')');
		}
	}

	public Class33_Sub10()
	{
	}

	public Class33_Sub10(byte arg0[])
	{
		try
		{
			aClass33_Sub8_Sub1Array2205 = new Class33_Sub8_Sub1[128];
			aByteArray2218 = new byte[128];
			anIntArray2203 = new int[128];
			aShortArray2212 = new short[128];
			aByteArray2206 = new byte[128];
			aClass68Array2216 = new Class68[128];
			int i = 0;
			aByteArray2221 = new byte[128];
			Class33_Sub11 class33_sub11;
			for(class33_sub11 = new Class33_Sub11(arg0); class33_sub11.aByteArray2296[class33_sub11.anInt2239 - -i] != 0; i++);
			byte abyte0[] = new byte[i];
			for(int j = 0; i > j; j++)
				abyte0[j] = class33_sub11.method661((byte)-120);

			class33_sub11.anInt2239++;
			i++;
			int k = class33_sub11.anInt2239;
			class33_sub11.anInt2239 += i;
			int l;
			for(l = 0; ~class33_sub11.aByteArray2296[class33_sub11.anInt2239 + l] != -1; l++);
			byte abyte1[] = new byte[l];
			for(int i1 = 0; ~i1 > ~l; i1++)
				abyte1[i1] = class33_sub11.method661((byte)-109);

			class33_sub11.anInt2239++;
			int j1 = class33_sub11.anInt2239;
			l++;
			class33_sub11.anInt2239 += l;
			int k1;
			for(k1 = 0; ~class33_sub11.aByteArray2296[class33_sub11.anInt2239 + k1] != -1; k1++);
			byte abyte2[] = new byte[k1];
			for(int l1 = 0; ~k1 < ~l1; l1++)
				abyte2[l1] = class33_sub11.method661((byte)-120);

			k1++;
			class33_sub11.anInt2239++;
			byte abyte3[] = new byte[k1];
			int i2;
			if(~k1 < -2)
			{
				abyte3[1] = 1;
				int j2 = 1;
				i2 = 2;
				for(int k2 = 2; ~k2 > ~k1; k2++)
				{
					int i3 = class33_sub11.method639((byte)123);
					if(i3 == 0)
					{
						j2 = i2++;
					} else
					{
						if(~j2 <= ~i3)
							i3--;
						j2 = i3;
					}
					abyte3[k2] = (byte)j2;
				}

			} else
			{
				i2 = k1;
			}
			Class68 aclass68[] = new Class68[i2];
			for(int l2 = 0; ~aclass68.length < ~l2; l2++)
			{
				Class68 class68 = aclass68[l2] = new Class68();
				int k3 = class33_sub11.method639((byte)123);
				if(k3 > 0)
					class68.aByteArray1461 = new byte[2 * k3];
				k3 = class33_sub11.method639((byte)123);
				if(k3 > 0)
				{
					class68.aByteArray1443 = new byte[2 + k3 * 2];
					class68.aByteArray1443[1] = 64;
				}
			}

			int j3 = class33_sub11.method639((byte)123);
			byte abyte4[] = j3 > 0 ? new byte[j3 * 2] : null;
			j3 = class33_sub11.method639((byte)123);
			byte abyte5[] = ~j3 < -1 ? new byte[j3 * 2] : null;
			int l3;
			for(l3 = 0; ~class33_sub11.aByteArray2296[class33_sub11.anInt2239 + l3] != -1; l3++);
			byte abyte6[] = new byte[l3];
			for(int i4 = 0; ~i4 > ~l3; i4++)
				abyte6[i4] = class33_sub11.method661((byte)-106);

			l3++;
			class33_sub11.anInt2239++;
			int j4 = 0;
			for(int k5 = 0; ~k5 > -129; k5++)
			{
				j4 += class33_sub11.method639((byte)123);
				aShortArray2212[k5] = (short)j4;
			}

			j4 = 0;
			for(int l5 = 0; ~l5 > -129; l5++)
			{
				j4 += class33_sub11.method639((byte)123);
				aShortArray2212[l5] += j4 << 0x3e4004c8;
			}

			int k6 = 0;
			int j6 = 0;
			int i6 = 0;
			for(int l6 = 0; ~l6 > -129; l6++)
			{
				if(i6 == 0)
				{
					if(abyte6.length > j6)
						i6 = abyte6[j6++];
					else
						i6 = -1;
					k6 = class33_sub11.method635((byte)-24);
				}
				aShortArray2212[l6] += Class12.method110(32768, k6 - 1 << 0xef19c48e);
				anIntArray2203[l6] = k6;
				i6--;
			}

			i6 = 0;
			j6 = 0;
			int i7 = 0;
			for(int j7 = 0; j7 < 128; j7++)
				if(~anIntArray2203[j7] != -1)
				{
					if(i6 == 0)
					{
						i7 = class33_sub11.aByteArray2296[k++] + -1;
						if(j6 >= abyte0.length)
							i6 = -1;
						else
							i6 = abyte0[j6++];
					}
					i6--;
					aByteArray2206[j7] = (byte)i7;
				}

			i6 = 0;
			j6 = 0;
			int k7 = 0;
			for(int l7 = 0; ~l7 > -129; l7++)
				if(~anIntArray2203[l7] != -1)
				{
					if(~i6 == -1)
					{
						k7 = class33_sub11.aByteArray2296[j1++] + 16 << 0x22c96e82;
						if(~abyte1.length < ~j6)
							i6 = abyte1[j6++];
						else
							i6 = -1;
					}
					i6--;
					aByteArray2221[l7] = (byte)k7;
				}

			i6 = 0;
			Class68 class68_1 = null;
			j6 = 0;
			for(int i8 = 0; i8 < 128; i8++)
				if(anIntArray2203[i8] != 0)
				{
					if(~i6 == -1)
					{
						class68_1 = aclass68[abyte3[j6]];
						if(j6 >= abyte2.length)
							i6 = -1;
						else
							i6 = abyte2[j6++];
					}
					i6--;
					aClass68Array2216[i8] = class68_1;
				}

			j6 = 0;
			int j8 = 0;
			i6 = 0;
			for(int k8 = 0; ~k8 > -129; k8++)
			{
				if(i6 == 0)
				{
					if(j6 < abyte6.length)
						i6 = abyte6[j6++];
					else
						i6 = -1;
					if(anIntArray2203[k8] > 0)
						j8 = 1 + class33_sub11.method639((byte)123);
				}
				aByteArray2218[k8] = (byte)j8;
				i6--;
			}

			anInt2211 = 1 + class33_sub11.method639((byte)123);
			for(int l8 = 0; i2 > l8; l8++)
			{
				Class68 class68_2 = aclass68[l8];
				if(class68_2.aByteArray1461 != null)
				{
					for(int l9 = 1; l9 < class68_2.aByteArray1461.length; l9 += 2)
						class68_2.aByteArray1461[l9] = class33_sub11.method661((byte)-125);

				}
				if(class68_2.aByteArray1443 != null)
				{
					for(int i10 = 3; -2 + class68_2.aByteArray1443.length > i10; i10 += 2)
						class68_2.aByteArray1443[i10] = class33_sub11.method661((byte)-122);

				}
			}

			if(abyte4 != null)
			{
				for(int i9 = 1; abyte4.length > i9; i9 += 2)
					abyte4[i9] = class33_sub11.method661((byte)-107);

			}
			if(abyte5 != null)
			{
				for(int j9 = 1; abyte5.length > j9; j9 += 2)
					abyte5[j9] = class33_sub11.method661((byte)-115);

			}
			for(int k9 = 0; k9 < i2; k9++)
			{
				Class68 class68_3 = aclass68[k9];
				if(class68_3.aByteArray1443 != null)
				{
					int k4 = 0;
					for(int k10 = 2; class68_3.aByteArray1443.length > k10; k10 += 2)
					{
						k4 = 1 + (k4 - -class33_sub11.method639((byte)123));
						class68_3.aByteArray1443[k10] = (byte)k4;
					}

				}
			}

			for(int j10 = 0; j10 < i2; j10++)
			{
				Class68 class68_4 = aclass68[j10];
				if(class68_4.aByteArray1461 != null)
				{
					int l4 = 0;
					for(int k11 = 2; k11 < class68_4.aByteArray1461.length; k11 += 2)
					{
						l4 = class33_sub11.method639((byte)123) + (1 + l4);
						class68_4.aByteArray1461[k11] = (byte)l4;
					}

				}
			}

			if(abyte4 != null)
			{
				int i5 = class33_sub11.method639((byte)123);
				abyte4[0] = (byte)i5;
				for(int l10 = 2; l10 < abyte4.length; l10 += 2)
				{
					i5 = (1 + i5) - -class33_sub11.method639((byte)123);
					abyte4[l10] = (byte)i5;
				}

				byte byte0 = abyte4[0];
				byte byte2 = abyte4[1];
				for(int k12 = 0; byte0 > k12; k12++)
					aByteArray2218[k12] = (byte)(32 + aByteArray2218[k12] * byte2 >> 0x7cf9fe06);

				for(int j13 = 2; ~abyte4.length < ~j13;)
				{
					byte byte5 = abyte4[1 + j13];
					byte byte3 = abyte4[j13];
					j13 += 2;
					int j15 = (-byte0 + byte3) / 2 + (byte3 - byte0) * byte2;
					for(int l15 = byte0; byte3 > l15; l15++)
					{
						int j16 = Class33_Sub6_Sub11.method537(j15, byte3 - byte0, 4346);
						j15 += -byte2 + byte5;
						aByteArray2218[l15] = (byte)(j16 * aByteArray2218[l15] + 32 >> 0x9aad1946);
					}

					byte2 = byte5;
					byte0 = byte3;
				}

				abyte4 = null;
				for(int j14 = byte0; ~j14 > -129; j14++)
					aByteArray2218[j14] = (byte)(aByteArray2218[j14] * byte2 + 32 >> 0xb86e5086);

			}
			if(abyte5 != null)
			{
				int j5 = class33_sub11.method639((byte)123);
				abyte5[0] = (byte)j5;
				for(int i11 = 2; abyte5.length > i11; i11 += 2)
				{
					j5 += 1 + class33_sub11.method639((byte)123);
					abyte5[i11] = (byte)j5;
				}

				byte byte1 = abyte5[0];
				int i12 = abyte5[1] << 0x1279fac1;
				for(int l12 = 0; l12 < byte1; l12++)
				{
					int k13 = i12 + (aByteArray2221[l12] & 0xff);
					if(k13 < 0)
						k13 = 0;
					if(~k13 < -129)
						k13 = 128;
					aByteArray2221[l12] = (byte)k13;
				}

				for(int l13 = 2; ~abyte5.length < ~l13;)
				{
					byte byte4 = abyte5[l13];
					int l14 = abyte5[l13 + 1] << 0x6b682e81;
					l13 += 2;
					int k15 = (byte4 + -byte1) * i12 - -((byte4 - byte1) / 2);
					for(int i16 = byte1; ~byte4 < ~i16; i16++)
					{
						int k16 = Class33_Sub6_Sub11.method537(k15, byte4 - byte1, 4346);
						int l16 = (aByteArray2221[i16] & 0xff) - -k16;
						k15 += -i12 + l14;
						if(~l16 > -1)
							l16 = 0;
						if(l16 > 128)
							l16 = 128;
						aByteArray2221[i16] = (byte)l16;
					}

					byte1 = byte4;
					i12 = l14;
				}

				for(int k14 = byte1; ~k14 > -129; k14++)
				{
					int i15 = (aByteArray2221[k14] & 0xff) + i12;
					if(i15 < 0)
						i15 = 0;
					if(~i15 < -129)
						i15 = 128;
					aByteArray2221[k14] = (byte)i15;
				}

				abyte5 = null;
			}
			for(int j11 = 0; j11 < i2; j11++)
				aclass68[j11].anInt1446 = class33_sub11.method639((byte)123);

			for(int l11 = 0; ~l11 > ~i2; l11++)
			{
				Class68 class68_5 = aclass68[l11];
				if(class68_5.aByteArray1461 != null)
					class68_5.anInt1440 = class33_sub11.method639((byte)123);
				if(class68_5.aByteArray1443 != null)
					class68_5.anInt1462 = class33_sub11.method639((byte)123);
				if(~class68_5.anInt1446 < -1)
					class68_5.anInt1447 = class33_sub11.method639((byte)123);
			}

			for(int j12 = 0; ~j12 > ~i2; j12++)
				aclass68[j12].anInt1459 = class33_sub11.method639((byte)123);

			for(int i13 = 0; i13 < i2; i13++)
			{
				Class68 class68_6 = aclass68[i13];
				if(class68_6.anInt1459 > 0)
					class68_6.anInt1445 = class33_sub11.method639((byte)123);
			}

			for(int i14 = 0; i14 < i2; i14++)
			{
				Class68 class68_7 = aclass68[i14];
				if(~class68_7.anInt1445 < -1)
					class68_7.anInt1457 = class33_sub11.method639((byte)123);
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "k.<init>(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static Class58 method619(byte arg0, int arg1, int arg2)
	{
		try
		{
			int i = arg1 - arg2;
			anInt2210++;
			if(~i > 8)
				return Class38.aClass58_845;
			if(arg0 != 66)
				aClass58_2214 = null;
			if(i < -6)
				return Class46.aClass58_1001;
			if(i < -3)
				return Class30_Sub1.aClass58_2012;
			if(~i > -1)
				return Class33_Sub13_Sub3.aClass58_3249;
			if(~i < -10)
				return Class33_Sub18.aClass58_2524;
			if(~i < -7)
				return Class23.aClass58_469;
			if(~i < -4)
				return Class20.aClass58_384;
			if(~i < -1)
				return Canvas_Sub1.aClass58_70;
			else
				return Class33_Sub15.aClass58_2468;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "k.A(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static int anInt2200;
	public static int anIntArray2201[] = {
		16, 32, 64, 128
	};
	public static CRC32 aCRC32_2202 = new CRC32();
	public int anIntArray2203[];
	public static int anInt2204;
	public Class33_Sub8_Sub1 aClass33_Sub8_Sub1Array2205[];
	public byte aByteArray2206[];
	public static int anInt2207;
	public static boolean aBoolean2208 = false;
	public static int anInt2209;
	public static int anInt2210;
	public int anInt2211;
	public short aShortArray2212[];
	public static Class58 aClass58_2213;
	public static Class58 aClass58_2214;
	public static int anInt2215;
	public Class68 aClass68Array2216[];
	public static int anInt2217;
	public byte aByteArray2218[];
	public static int anInt2219;
	public static Class58 aClass58_2220;
	public byte aByteArray2221[];
	public static Font aFont2222;
	public static Class58 aClass58_2223;
	public static int anInt2224;
	public static Class58 aClass58_2225 = Class33_Sub6_Sub11.method535(120, "Lade Eingabe)2Steuerungsprogramm)3)3)3");
	public static Class58 aClass58_2226;
	public static Class58 aClass58_2227;
	public static Class58 aClass58_2228;
	public static Class58 aClass58_2229 = Class33_Sub6_Sub11.method535(113, "Zu viele Verbindungen von Ihrer Adresse)3");
	public static Class58 aClass58_2230;

	static 
	{
		aClass58_2213 = Class33_Sub6_Sub11.method535(102, "You need a members account to login to this world)3");
		aClass58_2220 = aClass58_2213;
		aClass58_2223 = Class33_Sub6_Sub11.method535(103, "From");
		aClass58_2214 = aClass58_2223;
		aClass58_2227 = Class33_Sub6_Sub11.method535(116, "and choose the (Wcreate account(W");
		aClass58_2226 = aClass58_2227;
		aClass58_2230 = Class33_Sub6_Sub11.method535(101, "button near the top of that page)3");
		aClass58_2228 = aClass58_2230;
	}
}
