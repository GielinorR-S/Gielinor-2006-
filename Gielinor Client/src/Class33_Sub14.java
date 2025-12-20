// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub14.java


public class Class33_Sub14 extends Class33
{

	public void method783() {
		if (aClass82_2334 == null) {
			aClass82_2334 = new Class82(16);
			int[] is = new int[16];
			int[] is_0_ = new int[16];
			is[9] = is_0_[9] = 128;
			Class10 class10 = new Class10(aByteArray2335);
			int i = class10.method95();
			for (int i_1_ = 0; i_1_ < i; i_1_++) {
				class10.method98(i_1_);
				class10.method91(i_1_);
				class10.method94(i_1_);
			}
			while_19_:
				for (;;) {
					int i_2_ = class10.method90();
					int i_3_ = class10.anIntArray179[i_2_];
					while (class10.anIntArray179[i_2_] == i_3_) {
						class10.method98(i_2_);
						int i_4_ = class10.method89(i_2_);
						if (i_4_ == 1) {
							class10.method87();
							class10.method94(i_2_);
							if (!class10.method92())
								break;
							break while_19_;
						}
						int i_5_ = i_4_ & 0xf0;
						if (i_5_ == 176) {
							int i_6_ = i_4_ & 0xf;
							int i_7_ = i_4_ >> 8 & 0x7f;
			int i_8_ = i_4_ >> 16 & 0x7f;
			if (i_7_ == 0)
				is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
			if (i_7_ == 32)
				is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
						}
						if (i_5_ == 192) {
							int i_9_ = i_4_ & 0xf;
							int i_10_ = i_4_ >> 8 & 0x7f;
				is_0_[i_9_] = is[i_9_] + i_10_;
						}
						if (i_5_ == 144) {
							int i_11_ = i_4_ & 0xf;
							int i_12_ = i_4_ >> 8 & 0x7f;
				int i_13_ = i_4_ >> 16 & 0x7f;
				if (i_13_ > 0) {
					int i_14_ = is_0_[i_11_];
					Class33_Sub18 class33_sub18
					= ((Class33_Sub18)
							aClass82_2334.method1220(82, (long) i_14_));
					if (class33_sub18 == null) {
						class33_sub18
						= new Class33_Sub18(new byte[128]);
						aClass82_2334.method1218(class33_sub18,
								(byte) -89,
								(long) i_14_);
					}
					class33_sub18.aByteArray2519[i_12_] = (byte) 1;
				}
						}
						class10.method91(i_2_);
						class10.method94(i_2_);
					}
				}
		}
	}

	public void method784()
	{
		aClass82_2334 = null;
	}

	public static Class33_Sub14 method785(Class30 arg0, int arg1, int arg2)
	{
		byte abyte0[] = arg0.method238(false, arg2, arg1);
		if(abyte0 == null)
			return null;
		else
			return new Class33_Sub14(new Class33_Sub11(abyte0));
	}

	public Class33_Sub14(Class33_Sub11 arg0)
	{
		arg0.anInt2239 = arg0.aByteArray2296.length - 3;
		int i = arg0.method639((byte)123);
		int j = arg0.method666(33);
		int k = 14 + i * 10;
		arg0.anInt2239 = 0;
		int l = 0;
		int i1 = 0;
		int j1 = 0;
		int k1 = 0;
		int l1 = 0;
		int i2 = 0;
		int j2 = 0;
		int k2 = 0;
		for(int l2 = 0; l2 < i; l2++)
		{
			int i3 = -1;
			do
			{
				int k3 = arg0.method639((byte)123);
				if(k3 != i3)
					k++;
				i3 = k3 & 0xf;
				if(k3 == 7)
					break;
				if(k3 == 23)
					l++;
				else
				if(i3 == 0)
					j1++;
				else
				if(i3 == 1)
					k1++;
				else
				if(i3 == 2)
					i1++;
				else
				if(i3 == 3)
					l1++;
				else
				if(i3 == 4)
					i2++;
				else
				if(i3 == 5)
					j2++;
				else
				if(i3 == 6)
					k2++;
				else
					throw new RuntimeException();
			} while(true);
		}

		k += 5 * l;
		k += 2 * (j1 + k1 + i1 + l1 + j2);
		k += i2 + k2;
		int j3 = arg0.anInt2239;
		int l3 = i + l + i1 + j1 + k1 + l1 + i2 + j2 + k2;
		for(int i4 = 0; i4 < l3; i4++)
			arg0.method635((byte)-24);

		k += arg0.anInt2239 - j3;
		int j4 = arg0.anInt2239;
		int k4 = 0;
		int l4 = 0;
		int i5 = 0;
		int j5 = 0;
		int k5 = 0;
		int l5 = 0;
		int i6 = 0;
		int j6 = 0;
		int k6 = 0;
		int l6 = 0;
		int i7 = 0;
		int j7 = 0;
		int k7 = 0;
		for(int l7 = 0; l7 < i1; l7++)
		{
			k7 = k7 + arg0.method639((byte)123) & 0x7f;
			if(k7 == 0 || k7 == 32)
				k2++;
			else
			if(k7 == 1)
				k4++;
			else
			if(k7 == 33)
				l4++;
			else
			if(k7 == 7)
				i5++;
			else
			if(k7 == 39)
				j5++;
			else
			if(k7 == 10)
				k5++;
			else
			if(k7 == 42)
				l5++;
			else
			if(k7 == 99)
				i6++;
			else
			if(k7 == 98)
				j6++;
			else
			if(k7 == 101)
				k6++;
			else
			if(k7 == 100)
				l6++;
			else
			if(k7 == 64 || k7 == 65 || k7 == 120 || k7 == 121 || k7 == 123)
				i7++;
			else
				j7++;
		}

		int i8 = 0;
		int j8 = arg0.anInt2239;
		arg0.anInt2239 += i7;
		int k8 = arg0.anInt2239;
		arg0.anInt2239 += j2;
		int l8 = arg0.anInt2239;
		arg0.anInt2239 += i2;
		int i9 = arg0.anInt2239;
		arg0.anInt2239 += l1;
		int j9 = arg0.anInt2239;
		arg0.anInt2239 += k4;
		int k9 = arg0.anInt2239;
		arg0.anInt2239 += i5;
		int l9 = arg0.anInt2239;
		arg0.anInt2239 += k5;
		int i10 = arg0.anInt2239;
		arg0.anInt2239 += j1 + k1 + j2;
		int j10 = arg0.anInt2239;
		arg0.anInt2239 += j1;
		int k10 = arg0.anInt2239;
		arg0.anInt2239 += j7;
		int l10 = arg0.anInt2239;
		arg0.anInt2239 += k1;
		int i11 = arg0.anInt2239;
		arg0.anInt2239 += l4;
		int j11 = arg0.anInt2239;
		arg0.anInt2239 += j5;
		int k11 = arg0.anInt2239;
		arg0.anInt2239 += l5;
		int l11 = arg0.anInt2239;
		arg0.anInt2239 += k2;
		int i12 = arg0.anInt2239;
		arg0.anInt2239 += l1;
		int j12 = arg0.anInt2239;
		arg0.anInt2239 += i6;
		int k12 = arg0.anInt2239;
		arg0.anInt2239 += j6;
		int l12 = arg0.anInt2239;
		arg0.anInt2239 += k6;
		int i13 = arg0.anInt2239;
		arg0.anInt2239 += l6;
		int j13 = arg0.anInt2239;
		arg0.anInt2239 += l * 3;
		aByteArray2335 = new byte[k];
		Class33_Sub11 class33_sub11 = new Class33_Sub11(aByteArray2335);
		class33_sub11.method669(0x4d546864, -30515);
		class33_sub11.method669(6, -30515);
		class33_sub11.method625(i <= 1 ? 0 : 1, true);
		class33_sub11.method625(i, true);
		class33_sub11.method625(j, true);
		arg0.anInt2239 = j3;
		int k13 = 0;
		int l13 = 0;
		int i14 = 0;
		int j14 = 0;
		int k14 = 0;
		int l14 = 0;
		int i15 = 0;
		int ai[] = new int[128];
		k7 = 0;
		for(int j15 = 0; j15 < i; j15++)
		{
			class33_sub11.method669(0x4d54726b, -30515);
			class33_sub11.anInt2239 += 4;
			int k15 = class33_sub11.anInt2239;
			int l15 = -1;
			do
			{
				int i16 = arg0.method635((byte)-24);
				class33_sub11.method645(i16, (byte)-74);
				int j16 = arg0.aByteArray2296[i8++] & 0xff;
				boolean flag = j16 != l15;
				l15 = j16 & 0xf;
				if(j16 == 7)
				{
					if(flag)
						class33_sub11.method640(255, -11124);
					class33_sub11.method640(47, -11124);
					class33_sub11.method640(0, -11124);
					break;
				}
				if(j16 == 23)
				{
					if(flag)
						class33_sub11.method640(255, -11124);
					class33_sub11.method640(81, -11124);
					class33_sub11.method640(3, -11124);
					class33_sub11.method640(arg0.aByteArray2296[j13++], -11124);
					class33_sub11.method640(arg0.aByteArray2296[j13++], -11124);
					class33_sub11.method640(arg0.aByteArray2296[j13++], -11124);
				} else
				{
					k13 ^= j16 >> 4;
					if(l15 == 0)
					{
						if(flag)
							class33_sub11.method640(144 + k13, -11124);
						l13 += arg0.aByteArray2296[i10++];
						i14 += arg0.aByteArray2296[j10++];
						class33_sub11.method640(l13 & 0x7f, -11124);
						class33_sub11.method640(i14 & 0x7f, -11124);
					} else
					if(l15 == 1)
					{
						if(flag)
							class33_sub11.method640(128 + k13, -11124);
						l13 += arg0.aByteArray2296[i10++];
						j14 += arg0.aByteArray2296[l10++];
						class33_sub11.method640(l13 & 0x7f, -11124);
						class33_sub11.method640(j14 & 0x7f, -11124);
					} else
					if(l15 == 2)
					{
						if(flag)
							class33_sub11.method640(176 + k13, -11124);
						k7 = k7 + arg0.aByteArray2296[j4++] & 0x7f;
						class33_sub11.method640(k7, -11124);
						int k16;
						if(k7 == 0 || k7 == 32)
							k16 = arg0.aByteArray2296[l11++];
						else
						if(k7 == 1)
							k16 = arg0.aByteArray2296[j9++];
						else
						if(k7 == 33)
							k16 = arg0.aByteArray2296[i11++];
						else
						if(k7 == 7)
							k16 = arg0.aByteArray2296[k9++];
						else
						if(k7 == 39)
							k16 = arg0.aByteArray2296[j11++];
						else
						if(k7 == 10)
							k16 = arg0.aByteArray2296[l9++];
						else
						if(k7 == 42)
							k16 = arg0.aByteArray2296[k11++];
						else
						if(k7 == 99)
							k16 = arg0.aByteArray2296[j12++];
						else
						if(k7 == 98)
							k16 = arg0.aByteArray2296[k12++];
						else
						if(k7 == 101)
							k16 = arg0.aByteArray2296[l12++];
						else
						if(k7 == 100)
							k16 = arg0.aByteArray2296[i13++];
						else
						if(k7 == 64 || k7 == 65 || k7 == 120 || k7 == 121 || k7 == 123)
							k16 = arg0.aByteArray2296[j8++];
						else
							k16 = arg0.aByteArray2296[k10++];
						k16 += ai[k7];
						ai[k7] = k16;
						class33_sub11.method640(k16 & 0x7f, -11124);
					} else
					if(l15 == 3)
					{
						if(flag)
							class33_sub11.method640(224 + k13, -11124);
						k14 += arg0.aByteArray2296[i12++];
						k14 += arg0.aByteArray2296[i9++] << 7;
						class33_sub11.method640(k14 & 0x7f, -11124);
						class33_sub11.method640(k14 >> 7 & 0x7f, -11124);
					} else
					if(l15 == 4)
					{
						if(flag)
							class33_sub11.method640(208 + k13, -11124);
						l14 += arg0.aByteArray2296[l8++];
						class33_sub11.method640(l14 & 0x7f, -11124);
					} else
					if(l15 == 5)
					{
						if(flag)
							class33_sub11.method640(160 + k13, -11124);
						l13 += arg0.aByteArray2296[i10++];
						i15 += arg0.aByteArray2296[k8++];
						class33_sub11.method640(l13 & 0x7f, -11124);
						class33_sub11.method640(i15 & 0x7f, -11124);
					} else
					if(l15 == 6)
					{
						if(flag)
							class33_sub11.method640(192 + k13, -11124);
						class33_sub11.method640(arg0.aByteArray2296[l11++], -11124);
					} else
					{
						throw new RuntimeException();
					}
				}
			} while(true);
			class33_sub11.method629(class33_sub11.anInt2239 - k15, (byte)-122);
		}

	}

	public Class82 aClass82_2334;
	public byte aByteArray2335[];
}
