// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub4_Sub7.java


public class Class33_Sub6_Sub4_Sub7 extends Class33_Sub6_Sub4
{

	public void method382()
	{
		for(int i = 0; i < anInt3661; i++)
			anIntArray3641[i] = -anIntArray3641[i];

		for(int j = 0; j < anInt3643; j++)
		{
			int k = anIntArray3639[j];
			anIntArray3639[j] = anIntArray3631[j];
			anIntArray3631[j] = k;
		}

		method390();
	}

	public void method383()
	{
		if(aBoolean3638)
			return;
		super.anInt2737 = 0;
		anInt3658 = 0;
		anInt3649 = 0xf423f;
		anInt3637 = 0xfff0bdc1;
		anInt3657 = 0xfffe7961;
		anInt3628 = 0x1869f;
		for(int i = 0; i < anInt3661; i++)
		{
			int j = anIntArray3640[i];
			int k = anIntArray3630[i];
			int l = anIntArray3641[i];
			if(j < anInt3649)
				anInt3649 = j;
			if(j > anInt3637)
				anInt3637 = j;
			if(l < anInt3628)
				anInt3628 = l;
			if(l > anInt3657)
				anInt3657 = l;
			if(-k > super.anInt2737)
				super.anInt2737 = -k;
			if(k > anInt3658)
				anInt3658 = k;
		}

		aBoolean3638 = true;
	}

	public void method384(int arg0, int arg1, int arg2)
	{
		for(int i = 0; i < anInt3661; i++)
		{
			anIntArray3640[i] = (anIntArray3640[i] * arg0) / 128;
			anIntArray3630[i] = (anIntArray3630[i] * arg1) / 128;
			anIntArray3641[i] = (anIntArray3641[i] * arg2) / 128;
		}

		method390();
	}

	public Class33_Sub6_Sub4_Sub3 method385(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		method397();
		int i = (int)Math.sqrt(arg2 * arg2 + arg3 * arg3 + arg4 * arg4);
		int j = arg1 * i >> 8;
		Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = new Class33_Sub6_Sub4_Sub3();
		class33_sub6_sub4_sub3.anIntArray3412 = new int[anInt3643];
		class33_sub6_sub4_sub3.anIntArray3408 = new int[anInt3643];
		class33_sub6_sub4_sub3.anIntArray3405 = new int[anInt3643];
		for(int k = 0; k < anInt3643; k++)
		{
			byte byte0;
			if(aByteArray3652 == null)
				byte0 = 0;
			else
				byte0 = aByteArray3652[k];
			if(aByteArray3650 == null || aByteArray3650[k] == -1)
			{
				if(byte0 == 0)
				{
					int l1 = aShortArray3647[k] & 0xffff;
					Class40 class40;
					if(aClass40Array3645 != null && aClass40Array3645[anIntArray3639[k]] != null)
						class40 = aClass40Array3645[anIntArray3639[k]];
					else
						class40 = aClass40Array3656[anIntArray3639[k]];
					int l = arg0 + (arg2 * class40.anInt898 + arg3 * class40.anInt887 + arg4 * class40.anInt891) / (j * class40.anInt886);
					class33_sub6_sub4_sub3.anIntArray3412[k] = method396(l1, l);
					if(aClass40Array3645 != null && aClass40Array3645[anIntArray3634[k]] != null)
						class40 = aClass40Array3645[anIntArray3634[k]];
					else
						class40 = aClass40Array3656[anIntArray3634[k]];
					l = arg0 + (arg2 * class40.anInt898 + arg3 * class40.anInt887 + arg4 * class40.anInt891) / (j * class40.anInt886);
					class33_sub6_sub4_sub3.anIntArray3408[k] = method396(l1, l);
					if(aClass40Array3645 != null && aClass40Array3645[anIntArray3631[k]] != null)
						class40 = aClass40Array3645[anIntArray3631[k]];
					else
						class40 = aClass40Array3656[anIntArray3631[k]];
					l = arg0 + (arg2 * class40.anInt898 + arg3 * class40.anInt887 + arg4 * class40.anInt891) / (j * class40.anInt886);
					class33_sub6_sub4_sub3.anIntArray3405[k] = method396(l1, l);
				} else
				if(byte0 == 1)
				{
					Class19 class19 = aClass19Array3635[k];
					int i1 = arg0 + (arg2 * class19.anInt357 + arg3 * class19.anInt368 + arg4 * class19.anInt362) / (j + j / 2);
					class33_sub6_sub4_sub3.anIntArray3412[k] = method396(aShortArray3647[k] & 0xffff, i1);
					class33_sub6_sub4_sub3.anIntArray3405[k] = -1;
				} else
				{
					class33_sub6_sub4_sub3.anIntArray3405[k] = -2;
				}
			} else
			if(byte0 == 0)
			{
				Class40 class40_1;
				if(aClass40Array3645 != null && aClass40Array3645[anIntArray3639[k]] != null)
					class40_1 = aClass40Array3645[anIntArray3639[k]];
				else
					class40_1 = aClass40Array3656[anIntArray3639[k]];
				int j1 = arg0 + (arg2 * class40_1.anInt898 + arg3 * class40_1.anInt887 + arg4 * class40_1.anInt891) / (j * class40_1.anInt886);
				class33_sub6_sub4_sub3.anIntArray3412[k] = method391(j1);
				if(aClass40Array3645 != null && aClass40Array3645[anIntArray3634[k]] != null)
					class40_1 = aClass40Array3645[anIntArray3634[k]];
				else
					class40_1 = aClass40Array3656[anIntArray3634[k]];
				j1 = arg0 + (arg2 * class40_1.anInt898 + arg3 * class40_1.anInt887 + arg4 * class40_1.anInt891) / (j * class40_1.anInt886);
				class33_sub6_sub4_sub3.anIntArray3408[k] = method391(j1);
				if(aClass40Array3645 != null && aClass40Array3645[anIntArray3631[k]] != null)
					class40_1 = aClass40Array3645[anIntArray3631[k]];
				else
					class40_1 = aClass40Array3656[anIntArray3631[k]];
				j1 = arg0 + (arg2 * class40_1.anInt898 + arg3 * class40_1.anInt887 + arg4 * class40_1.anInt891) / (j * class40_1.anInt886);
				class33_sub6_sub4_sub3.anIntArray3405[k] = method391(j1);
			} else
			if(byte0 == 1)
			{
				Class19 class19_1 = aClass19Array3635[k];
				int k1 = arg0 + (arg2 * class19_1.anInt357 + arg3 * class19_1.anInt368 + arg4 * class19_1.anInt362) / (j + j / 2);
				class33_sub6_sub4_sub3.anIntArray3412[k] = method391(k1);
				class33_sub6_sub4_sub3.anIntArray3405[k] = -1;
			} else
			{
				class33_sub6_sub4_sub3.anIntArray3405[k] = -2;
			}
		}

		method394();
		class33_sub6_sub4_sub3.anInt3414 = anInt3661;
		class33_sub6_sub4_sub3.anIntArray3420 = anIntArray3640;
		class33_sub6_sub4_sub3.anIntArray3409 = anIntArray3630;
		class33_sub6_sub4_sub3.anIntArray3401 = anIntArray3641;
		class33_sub6_sub4_sub3.anInt3415 = anInt3643;
		class33_sub6_sub4_sub3.anIntArray3399 = anIntArray3639;
		class33_sub6_sub4_sub3.anIntArray3395 = anIntArray3634;
		class33_sub6_sub4_sub3.anIntArray3402 = anIntArray3631;
		class33_sub6_sub4_sub3.aByteArray3419 = aByteArray3629;
		class33_sub6_sub4_sub3.aByteArray3400 = aByteArray3644;
		class33_sub6_sub4_sub3.aByteArray3403 = aByteArray3650;
		if(class33_sub6_sub4_sub3.aByteArray3403 != null)
			class33_sub6_sub4_sub3.aShortArray3411 = aShortArray3647;
		else
			class33_sub6_sub4_sub3.aShortArray3411 = null;
		class33_sub6_sub4_sub3.aByte3406 = aByte3662;
		class33_sub6_sub4_sub3.anInt3407 = anInt3654;
		class33_sub6_sub4_sub3.anIntArray3410 = anIntArray3660;
		class33_sub6_sub4_sub3.anIntArray3418 = anIntArray3655;
		class33_sub6_sub4_sub3.anIntArray3396 = anIntArray3659;
		class33_sub6_sub4_sub3.anIntArrayArray3397 = anIntArrayArray3646;
		class33_sub6_sub4_sub3.anIntArrayArray3413 = anIntArrayArray3633;
		return class33_sub6_sub4_sub3;
	}

	public static void method386(Class33_Sub6_Sub4_Sub7 arg0, Class33_Sub6_Sub4_Sub7 arg1, int arg2, int arg3, int arg4, boolean arg5)
	{
		arg0.method383();
		arg0.method397();
		arg1.method383();
		arg1.method397();
		anInt3653++;
		int i = 0;
		int ai[] = arg1.anIntArray3640;
		int j = arg1.anInt3661;
		for(int k = 0; k < arg0.anInt3661; k++)
		{
			Class40 class40 = arg0.aClass40Array3656[k];
			if(class40.anInt886 != 0)
			{
				int i1 = arg0.anIntArray3630[k] - arg3;
				if(i1 <= arg1.anInt3658)
				{
					int k1 = arg0.anIntArray3640[k] - arg2;
					if(k1 >= arg1.anInt3649 && k1 <= arg1.anInt3637)
					{
						int l1 = arg0.anIntArray3641[k] - arg4;
						if(l1 >= arg1.anInt3628 && l1 <= arg1.anInt3657)
						{
							for(int i2 = 0; i2 < j; i2++)
							{
								Class40 class40_1 = arg1.aClass40Array3656[i2];
								if(k1 == ai[i2] && l1 == arg1.anIntArray3641[i2] && i1 == arg1.anIntArray3630[i2] && class40_1.anInt886 != 0)
								{
									if(arg0.aClass40Array3645 == null)
										arg0.aClass40Array3645 = new Class40[arg0.anInt3661];
									if(arg1.aClass40Array3645 == null)
										arg1.aClass40Array3645 = new Class40[j];
									Class40 class40_2 = arg0.aClass40Array3645[k];
									if(class40_2 == null)
										class40_2 = arg0.aClass40Array3645[k] = new Class40(class40);
									Class40 class40_3 = arg1.aClass40Array3645[i2];
									if(class40_3 == null)
										class40_3 = arg1.aClass40Array3645[i2] = new Class40(class40_1);
									class40_2.anInt898 += class40_1.anInt898;
									class40_2.anInt887 += class40_1.anInt887;
									class40_2.anInt891 += class40_1.anInt891;
									class40_2.anInt886 += class40_1.anInt886;
									class40_3.anInt898 += class40.anInt898;
									class40_3.anInt887 += class40.anInt887;
									class40_3.anInt891 += class40.anInt891;
									class40_3.anInt886 += class40.anInt886;
									i++;
									anIntArray3627[k] = anInt3653;
									anIntArray3651[i2] = anInt3653;
								}
							}

						}
					}
				}
			}
		}

		if(i < 3 || !arg5)
			return;
		for(int l = 0; l < arg0.anInt3643; l++)
			if(anIntArray3627[arg0.anIntArray3639[l]] == anInt3653 && anIntArray3627[arg0.anIntArray3634[l]] == anInt3653 && anIntArray3627[arg0.anIntArray3631[l]] == anInt3653)
			{
				if(arg0.aByteArray3652 == null)
					arg0.aByteArray3652 = new byte[arg0.anInt3643];
				arg0.aByteArray3652[l] = 2;
			}

		for(int j1 = 0; j1 < arg1.anInt3643; j1++)
			if(anIntArray3651[arg1.anIntArray3639[j1]] == anInt3653 && anIntArray3651[arg1.anIntArray3634[j1]] == anInt3653 && anIntArray3651[arg1.anIntArray3631[j1]] == anInt3653)
			{
				if(arg1.aByteArray3652 == null)
					arg1.aByteArray3652 = new byte[arg1.anInt3643];
				arg1.aByteArray3652[j1] = 2;
			}

	}

	public void method387()
	{
		for(int i = 0; i < anInt3661; i++)
		{
			int j = anIntArray3641[i];
			anIntArray3641[i] = anIntArray3640[i];
			anIntArray3640[i] = -j;
		}

		method390();
	}

	public void method388()
	{
		for(int i = 0; i < anInt3661; i++)
		{
			int j = anIntArray3640[i];
			anIntArray3640[i] = anIntArray3641[i];
			anIntArray3641[i] = -j;
		}

		method390();
	}

	public void method389(short arg0, short arg1)
	{
		for(int i = 0; i < anInt3643; i++)
			if(aShortArray3647[i] == arg0)
				aShortArray3647[i] = arg1;

	}

	public void method390()
	{
		aClass40Array3656 = null;
		aClass40Array3645 = null;
		aClass19Array3635 = null;
		aBoolean3638 = false;
	}

	public static int method391(int arg0)
	{
		if(arg0 < 0)
			arg0 = 0;
		else
		if(arg0 > 127)
			arg0 = 127;
		arg0 = anIntArray3636[arg0];
		return arg0;
	}

	public Class33_Sub6_Sub4_Sub7 method392()
	{
		Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = new Class33_Sub6_Sub4_Sub7();
		if(aByteArray3652 != null)
		{
			class33_sub6_sub4_sub7.aByteArray3652 = new byte[anInt3643];
			for(int i = 0; i < anInt3643; i++)
				class33_sub6_sub4_sub7.aByteArray3652[i] = aByteArray3652[i];

		}
		class33_sub6_sub4_sub7.anInt3661 = anInt3661;
		class33_sub6_sub4_sub7.anInt3643 = anInt3643;
		class33_sub6_sub4_sub7.anInt3654 = anInt3654;
		class33_sub6_sub4_sub7.anIntArray3640 = anIntArray3640;
		class33_sub6_sub4_sub7.anIntArray3630 = anIntArray3630;
		class33_sub6_sub4_sub7.anIntArray3641 = anIntArray3641;
		class33_sub6_sub4_sub7.anIntArray3639 = anIntArray3639;
		class33_sub6_sub4_sub7.anIntArray3634 = anIntArray3634;
		class33_sub6_sub4_sub7.anIntArray3631 = anIntArray3631;
		class33_sub6_sub4_sub7.aByteArray3629 = aByteArray3629;
		class33_sub6_sub4_sub7.aByteArray3644 = aByteArray3644;
		class33_sub6_sub4_sub7.aByteArray3650 = aByteArray3650;
		class33_sub6_sub4_sub7.aShortArray3647 = aShortArray3647;
		class33_sub6_sub4_sub7.aByte3662 = aByte3662;
		class33_sub6_sub4_sub7.anIntArray3660 = anIntArray3660;
		class33_sub6_sub4_sub7.anIntArray3655 = anIntArray3655;
		class33_sub6_sub4_sub7.anIntArray3659 = anIntArray3659;
		class33_sub6_sub4_sub7.anIntArray3648 = anIntArray3648;
		class33_sub6_sub4_sub7.anIntArray3663 = anIntArray3663;
		class33_sub6_sub4_sub7.anIntArrayArray3646 = anIntArrayArray3646;
		class33_sub6_sub4_sub7.anIntArrayArray3633 = anIntArrayArray3633;
		class33_sub6_sub4_sub7.aClass40Array3656 = aClass40Array3656;
		class33_sub6_sub4_sub7.aClass19Array3635 = aClass19Array3635;
		class33_sub6_sub4_sub7.aShort3642 = aShort3642;
		class33_sub6_sub4_sub7.aShort3632 = aShort3632;
		return class33_sub6_sub4_sub7;
	}

	public void method393(int arg0, int arg1, int arg2)
	{
		for(int i = 0; i < anInt3661; i++)
		{
			anIntArray3640[i] += arg0;
			anIntArray3630[i] += arg1;
			anIntArray3641[i] += arg2;
		}

		method390();
	}

	public void method394()
	{
		if(anIntArray3648 != null)
		{
			int ai[] = new int[256];
			int i = 0;
			for(int k = 0; k < anInt3661; k++)
			{
				int i1 = anIntArray3648[k];
				ai[i1]++;
				if(i1 > i)
					i = i1;
			}

			anIntArrayArray3646 = new int[i + 1][];
			for(int j1 = 0; j1 <= i; j1++)
			{
				anIntArrayArray3646[j1] = new int[ai[j1]];
				ai[j1] = 0;
			}

			for(int i2 = 0; i2 < anInt3661; i2++)
			{
				int k2 = anIntArray3648[i2];
				anIntArrayArray3646[k2][ai[k2]++] = i2;
			}

			anIntArray3648 = null;
		}
		if(anIntArray3663 != null)
		{
			int ai1[] = new int[256];
			int j = 0;
			for(int l = 0; l < anInt3643; l++)
			{
				int k1 = anIntArray3663[l];
				ai1[k1]++;
				if(k1 > j)
					j = k1;
			}

			anIntArrayArray3633 = new int[j + 1][];
			for(int l1 = 0; l1 <= j; l1++)
			{
				anIntArrayArray3633[l1] = new int[ai1[l1]];
				ai1[l1] = 0;
			}

			for(int j2 = 0; j2 < anInt3643; j2++)
			{
				int l2 = anIntArray3663[j2];
				anIntArrayArray3633[l2][ai1[l2]++] = j2;
			}

			anIntArray3663 = null;
		}
	}

	public int method395(Class33_Sub6_Sub4_Sub7 arg0, int arg1)
	{
		int i = -1;
		int j = arg0.anIntArray3640[arg1];
		int k = arg0.anIntArray3630[arg1];
		int l = arg0.anIntArray3641[arg1];
		for(int i1 = 0; i1 < anInt3661; i1++)
		{
			if(j != anIntArray3640[i1] || k != anIntArray3630[i1] || l != anIntArray3641[i1])
				continue;
			i = i1;
			break;
		}

		if(i == -1)
		{
			anIntArray3640[anInt3661] = j;
			anIntArray3630[anInt3661] = k;
			anIntArray3641[anInt3661] = l;
			if(arg0.anIntArray3648 != null)
				anIntArray3648[anInt3661] = arg0.anIntArray3648[arg1];
			i = anInt3661++;
		}
		return i;
	}

	public static int method396(int arg0, int arg1)
	{
		arg1 = arg1 * (arg0 & 0x7f) >> 7;
		if(arg1 < 2)
			arg1 = 2;
		else
		if(arg1 > 126)
			arg1 = 126;
		return (arg0 & 0xff80) + arg1;
	}

	public void method397()
	{
		if(aClass40Array3656 != null)
			return;
		aClass40Array3656 = new Class40[anInt3661];
		for(int i = 0; i < anInt3661; i++)
			aClass40Array3656[i] = new Class40();

		for(int j = 0; j < anInt3643; j++)
		{
			int k = anIntArray3639[j];
			int l = anIntArray3634[j];
			int i1 = anIntArray3631[j];
			int j1 = anIntArray3640[l] - anIntArray3640[k];
			int k1 = anIntArray3630[l] - anIntArray3630[k];
			int l1 = anIntArray3641[l] - anIntArray3641[k];
			int i2 = anIntArray3640[i1] - anIntArray3640[k];
			int j2 = anIntArray3630[i1] - anIntArray3630[k];
			int k2 = anIntArray3641[i1] - anIntArray3641[k];
			int l2 = k1 * k2 - j2 * l1;
			int i3 = l1 * i2 - k2 * j1;
			int j3;
			for(j3 = j1 * j2 - i2 * k1; l2 > 8192 || i3 > 8192 || j3 > 8192 || l2 < -8192 || i3 < -8192 || j3 < -8192; j3 >>= 1)
			{
				l2 >>= 1;
				i3 >>= 1;
			}

			int k3 = (int)Math.sqrt(l2 * l2 + i3 * i3 + j3 * j3);
			if(k3 <= 0)
				k3 = 1;
			l2 = (l2 * 256) / k3;
			i3 = (i3 * 256) / k3;
			j3 = (j3 * 256) / k3;
			byte byte0;
			if(aByteArray3652 == null)
				byte0 = 0;
			else
				byte0 = aByteArray3652[j];
			if(byte0 == 0)
			{
				Class40 class40 = aClass40Array3656[k];
				class40.anInt898 += l2;
				class40.anInt887 += i3;
				class40.anInt891 += j3;
				class40.anInt886++;
				class40 = aClass40Array3656[l];
				class40.anInt898 += l2;
				class40.anInt887 += i3;
				class40.anInt891 += j3;
				class40.anInt886++;
				class40 = aClass40Array3656[i1];
				class40.anInt898 += l2;
				class40.anInt887 += i3;
				class40.anInt891 += j3;
				class40.anInt886++;
			} else
			if(byte0 == 1)
			{
				if(aClass19Array3635 == null)
					aClass19Array3635 = new Class19[anInt3643];
				Class19 class19 = aClass19Array3635[j] = new Class19();
				class19.anInt357 = l2;
				class19.anInt368 = i3;
				class19.anInt362 = j3;
			}
		}

	}

	public static Class33_Sub6_Sub4_Sub7 method398(Class30 arg0, int arg1, int arg2)
	{
		byte abyte0[] = arg0.method238(false, arg2, arg1);
		if(abyte0 == null)
			return null;
		else
			return new Class33_Sub6_Sub4_Sub7(abyte0);
	}

	public Class33_Sub6_Sub4_Sub7 method399(int arg0, int arg1, int arg2, int arg3, boolean arg4)
	{
		if(arg0 == arg1 && arg0 == arg2 && arg0 == arg3)
			return this;
		Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7;
		if(arg4)
		{
			class33_sub6_sub4_sub7 = new Class33_Sub6_Sub4_Sub7();
			class33_sub6_sub4_sub7.anInt3661 = anInt3661;
			class33_sub6_sub4_sub7.anInt3643 = anInt3643;
			class33_sub6_sub4_sub7.anInt3654 = anInt3654;
			class33_sub6_sub4_sub7.anIntArray3640 = anIntArray3640;
			class33_sub6_sub4_sub7.anIntArray3641 = anIntArray3641;
			class33_sub6_sub4_sub7.anIntArray3639 = anIntArray3639;
			class33_sub6_sub4_sub7.anIntArray3634 = anIntArray3634;
			class33_sub6_sub4_sub7.anIntArray3631 = anIntArray3631;
			class33_sub6_sub4_sub7.aByteArray3652 = aByteArray3652;
			class33_sub6_sub4_sub7.aByteArray3629 = aByteArray3629;
			class33_sub6_sub4_sub7.aByteArray3644 = aByteArray3644;
			class33_sub6_sub4_sub7.aByteArray3650 = aByteArray3650;
			class33_sub6_sub4_sub7.aShortArray3647 = aShortArray3647;
			class33_sub6_sub4_sub7.aByte3662 = aByte3662;
			class33_sub6_sub4_sub7.anIntArray3660 = anIntArray3660;
			class33_sub6_sub4_sub7.anIntArray3655 = anIntArray3655;
			class33_sub6_sub4_sub7.anIntArray3659 = anIntArray3659;
			class33_sub6_sub4_sub7.anIntArray3648 = anIntArray3648;
			class33_sub6_sub4_sub7.anIntArray3663 = anIntArray3663;
			class33_sub6_sub4_sub7.anIntArrayArray3646 = anIntArrayArray3646;
			class33_sub6_sub4_sub7.anIntArrayArray3633 = anIntArrayArray3633;
			class33_sub6_sub4_sub7.aShort3642 = aShort3642;
			class33_sub6_sub4_sub7.aShort3632 = aShort3632;
			class33_sub6_sub4_sub7.anIntArray3630 = new int[class33_sub6_sub4_sub7.anInt3661];
		} else
		{
			class33_sub6_sub4_sub7 = this;
		}
		int i = (arg0 + arg1 + arg2 + arg3) / 4;
		for(int j = 0; j < class33_sub6_sub4_sub7.anInt3661; j++)
		{
			int k = anIntArray3640[j];
			int l = anIntArray3630[j];
			int i1 = anIntArray3641[j];
			int j1 = arg0 + ((arg1 - arg0) * (k + 64)) / 128;
			int k1 = arg3 + ((arg2 - arg3) * (k + 64)) / 128;
			int l1 = j1 + ((k1 - j1) * (i1 + 64)) / 128;
			class33_sub6_sub4_sub7.anIntArray3630[j] = (l + l1) - i;
		}

		class33_sub6_sub4_sub7.method390();
		return class33_sub6_sub4_sub7;
	}

	public static void method400()
	{
		anIntArray3627 = null;
		anIntArray3651 = null;
		anIntArray3636 = null;
	}

	public void method401()
	{
		for(int i = 0; i < anInt3661; i++)
		{
			anIntArray3640[i] = -anIntArray3640[i];
			anIntArray3641[i] = -anIntArray3641[i];
		}

		method390();
	}

	public Class33_Sub6_Sub4_Sub7()
	{
		anInt3654 = 0;
		anInt3643 = 0;
		aBoolean3638 = false;
		anInt3661 = 0;
		aByte3662 = 0;
	}

	public Class33_Sub6_Sub4_Sub7(byte arg0[])
	{
		anInt3654 = 0;
		anInt3643 = 0;
		aBoolean3638 = false;
		anInt3661 = 0;
		aByte3662 = 0;
		boolean flag = false;
		boolean flag1 = false;
		Class33_Sub11 class33_sub11 = new Class33_Sub11(arg0);
		Class33_Sub11 class33_sub11_1 = new Class33_Sub11(arg0);
		Class33_Sub11 class33_sub11_2 = new Class33_Sub11(arg0);
		Class33_Sub11 class33_sub11_3 = new Class33_Sub11(arg0);
		Class33_Sub11 class33_sub11_4 = new Class33_Sub11(arg0);
		class33_sub11.anInt2239 = arg0.length - 18;
		int i = class33_sub11.method666(86);
		int j = class33_sub11.method666(56);
		int k = class33_sub11.method639((byte)123);
		int l = class33_sub11.method639((byte)123);
		int i1 = class33_sub11.method639((byte)123);
		int j1 = class33_sub11.method639((byte)123);
		int k1 = class33_sub11.method639((byte)123);
		int l1 = class33_sub11.method639((byte)123);
		int i2 = class33_sub11.method666(48);
		int j2 = class33_sub11.method666(120);
		int k2 = class33_sub11.method666(53);
		int l2 = class33_sub11.method666(124);
		int i3 = 0;
		int j3 = i3;
		i3 += i;
		int k3 = i3;
		i3 += j;
		int l3 = i3;
		if(i1 == 255)
			i3 += j;
		int i4 = i3;
		if(k1 == 1)
			i3 += j;
		int j4 = i3;
		if(l == 1)
			i3 += j;
		int k4 = i3;
		if(l1 == 1)
			i3 += i;
		int l4 = i3;
		if(j1 == 1)
			i3 += j;
		int i5 = i3;
		i3 += l2;
		int j5 = i3;
		i3 += j * 2;
		int k5 = i3;
		i3 += k * 6;
		int l5 = i3;
		i3 += i2;
		int i6 = i3;
		i3 += j2;
		int j6 = i3;
		i3 += k2;
		anInt3661 = i;
		anInt3643 = j;
		anInt3654 = k;
		anIntArray3640 = new int[i];
		anIntArray3630 = new int[i];
		anIntArray3641 = new int[i];
		anIntArray3639 = new int[j];
		anIntArray3634 = new int[j];
		anIntArray3631 = new int[j];
		if(k > 0)
		{
			anIntArray3660 = new int[k];
			anIntArray3655 = new int[k];
			anIntArray3659 = new int[k];
		}
		if(l1 == 1)
			anIntArray3648 = new int[i];
		if(l == 1)
		{
			aByteArray3652 = new byte[j];
			aByteArray3650 = new byte[j];
		}
		if(i1 == 255)
			aByteArray3629 = new byte[j];
		else
			aByte3662 = (byte)i1;
		if(j1 == 1)
			aByteArray3644 = new byte[j];
		if(k1 == 1)
			anIntArray3663 = new int[j];
		aShortArray3647 = new short[j];
		class33_sub11.anInt2239 = j3;
		class33_sub11_1.anInt2239 = l5;
		class33_sub11_2.anInt2239 = i6;
		class33_sub11_3.anInt2239 = j6;
		class33_sub11_4.anInt2239 = k4;
		int k6 = 0;
		int l6 = 0;
		int i7 = 0;
		for(int j7 = 0; j7 < i; j7++)
		{
			int k7 = class33_sub11.method639((byte)123);
			int i8 = 0;
			if((k7 & 1) != 0)
				i8 = class33_sub11_1.method647(106);
			int l8 = 0;
			if((k7 & 2) != 0)
				l8 = class33_sub11_2.method647(96);
			int j9 = 0;
			if((k7 & 4) != 0)
				j9 = class33_sub11_3.method647(61);
			anIntArray3640[j7] = k6 + i8;
			anIntArray3630[j7] = l6 + l8;
			anIntArray3641[j7] = i7 + j9;
			k6 = anIntArray3640[j7];
			l6 = anIntArray3630[j7];
			i7 = anIntArray3641[j7];
			if(l1 == 1)
				anIntArray3648[j7] = class33_sub11_4.method639((byte)123);
		}

		class33_sub11.anInt2239 = j5;
		class33_sub11_1.anInt2239 = j4;
		class33_sub11_2.anInt2239 = l3;
		class33_sub11_3.anInt2239 = l4;
		class33_sub11_4.anInt2239 = i4;
		for(int l7 = 0; l7 < j; l7++)
		{
			aShortArray3647[l7] = (short)class33_sub11.method666(112);
			if(l == 1)
			{
				int j8 = class33_sub11_1.method639((byte)123);
				if((j8 & 1) == 1)
				{
					aByteArray3652[l7] = 1;
					flag1 = true;
				} else
				{
					aByteArray3652[l7] = 0;
				}
				if((j8 & 2) == 2)
				{
					aByteArray3650[l7] = (byte)(j8 >> 2);
					flag = true;
				} else
				{
					aByteArray3650[l7] = -1;
				}
			}
			if(i1 == 255)
				aByteArray3629[l7] = class33_sub11_2.method661((byte)-117);
			if(j1 == 1)
				aByteArray3644[l7] = class33_sub11_3.method661((byte)-100);
			if(k1 == 1)
				anIntArray3663[l7] = class33_sub11_4.method639((byte)123);
		}

		class33_sub11.anInt2239 = i5;
		class33_sub11_1.anInt2239 = k3;
		int k8 = 0;
		int i9 = 0;
		int k9 = 0;
		int l9 = 0;
		for(int i10 = 0; i10 < j; i10++)
		{
			int j10 = class33_sub11_1.method639((byte)123);
			if(j10 == 1)
			{
				k8 = class33_sub11.method647(108) + l9;
				l9 = k8;
				i9 = class33_sub11.method647(63) + l9;
				l9 = i9;
				k9 = class33_sub11.method647(74) + l9;
				l9 = k9;
				anIntArray3639[i10] = k8;
				anIntArray3634[i10] = i9;
				anIntArray3631[i10] = k9;
			}
			if(j10 == 2)
			{
				i9 = k9;
				k9 = class33_sub11.method647(104) + l9;
				l9 = k9;
				anIntArray3639[i10] = k8;
				anIntArray3634[i10] = i9;
				anIntArray3631[i10] = k9;
			}
			if(j10 == 3)
			{
				k8 = k9;
				k9 = class33_sub11.method647(55) + l9;
				l9 = k9;
				anIntArray3639[i10] = k8;
				anIntArray3634[i10] = i9;
				anIntArray3631[i10] = k9;
			}
			if(j10 == 4)
			{
				int l10 = k8;
				k8 = i9;
				i9 = l10;
				k9 = class33_sub11.method647(76) + l9;
				l9 = k9;
				anIntArray3639[i10] = k8;
				anIntArray3634[i10] = i9;
				anIntArray3631[i10] = k9;
			}
		}

		class33_sub11.anInt2239 = k5;
		for(int k10 = 0; k10 < k; k10++)
		{
			anIntArray3660[k10] = class33_sub11.method666(121);
			anIntArray3655[k10] = class33_sub11.method666(70);
			anIntArray3659[k10] = class33_sub11.method666(55);
		}

		if(!flag)
			aByteArray3650 = null;
		if(!flag1)
			aByteArray3652 = null;
	}

	public Class33_Sub6_Sub4_Sub7(Class33_Sub6_Sub4_Sub7 arg0[], int arg1)
	{
		anInt3654 = 0;
		anInt3643 = 0;
		aBoolean3638 = false;
		anInt3661 = 0;
		aByte3662 = 0;
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
		anInt3661 = 0;
		anInt3643 = 0;
		anInt3654 = 0;
		aByte3662 = -1;
		for(int i = 0; i < arg1; i++)
		{
			Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7 = arg0[i];
			if(class33_sub6_sub4_sub7 != null)
			{
				anInt3661 += class33_sub6_sub4_sub7.anInt3661;
				anInt3643 += class33_sub6_sub4_sub7.anInt3643;
				anInt3654 += class33_sub6_sub4_sub7.anInt3654;
				if(class33_sub6_sub4_sub7.aByteArray3629 != null)
				{
					flag1 = true;
				} else
				{
					if(aByte3662 == -1)
						aByte3662 = class33_sub6_sub4_sub7.aByte3662;
					if(aByte3662 != class33_sub6_sub4_sub7.aByte3662)
						flag1 = true;
				}
				flag |= class33_sub6_sub4_sub7.aByteArray3652 != null;
				flag2 |= class33_sub6_sub4_sub7.aByteArray3644 != null;
				flag3 |= class33_sub6_sub4_sub7.anIntArray3663 != null;
				flag4 |= class33_sub6_sub4_sub7.aByteArray3650 != null;
			}
		}

		anIntArray3640 = new int[anInt3661];
		anIntArray3630 = new int[anInt3661];
		anIntArray3641 = new int[anInt3661];
		anIntArray3648 = new int[anInt3661];
		anIntArray3639 = new int[anInt3643];
		anIntArray3634 = new int[anInt3643];
		anIntArray3631 = new int[anInt3643];
		if(anInt3654 > 0)
		{
			anIntArray3660 = new int[anInt3654];
			anIntArray3655 = new int[anInt3654];
			anIntArray3659 = new int[anInt3654];
		}
		if(flag)
			aByteArray3652 = new byte[anInt3643];
		if(flag1)
			aByteArray3629 = new byte[anInt3643];
		if(flag2)
			aByteArray3644 = new byte[anInt3643];
		if(flag4)
			aByteArray3650 = new byte[anInt3643];
		if(flag3)
			anIntArray3663 = new int[anInt3643];
		aShortArray3647 = new short[anInt3643];
		anInt3661 = 0;
		anInt3643 = 0;
		anInt3654 = 0;
		int j = 0;
		for(int k = 0; k < arg1; k++)
		{
			Class33_Sub6_Sub4_Sub7 class33_sub6_sub4_sub7_1 = arg0[k];
			if(class33_sub6_sub4_sub7_1 != null)
			{
				for(int l = 0; l < class33_sub6_sub4_sub7_1.anInt3643; l++)
				{
					if(flag && class33_sub6_sub4_sub7_1.aByteArray3652 != null)
						aByteArray3652[anInt3643] = class33_sub6_sub4_sub7_1.aByteArray3652[l];
					if(flag1)
						if(class33_sub6_sub4_sub7_1.aByteArray3629 != null)
							aByteArray3629[anInt3643] = class33_sub6_sub4_sub7_1.aByteArray3629[l];
						else
							aByteArray3629[anInt3643] = class33_sub6_sub4_sub7_1.aByte3662;
					if(flag2 && class33_sub6_sub4_sub7_1.aByteArray3644 != null)
						aByteArray3644[anInt3643] = class33_sub6_sub4_sub7_1.aByteArray3644[l];
					if(flag4)
						if(class33_sub6_sub4_sub7_1.aByteArray3650 != null && class33_sub6_sub4_sub7_1.aByteArray3650[l] != -1)
							aByteArray3650[anInt3643] = (byte)(class33_sub6_sub4_sub7_1.aByteArray3650[l] + j);
						else
							aByteArray3650[anInt3643] = -1;
					if(flag3 && class33_sub6_sub4_sub7_1.anIntArray3663 != null)
						anIntArray3663[anInt3643] = class33_sub6_sub4_sub7_1.anIntArray3663[l];
					aShortArray3647[anInt3643] = class33_sub6_sub4_sub7_1.aShortArray3647[l];
					anIntArray3639[anInt3643] = method395(class33_sub6_sub4_sub7_1, class33_sub6_sub4_sub7_1.anIntArray3639[l]);
					anIntArray3634[anInt3643] = method395(class33_sub6_sub4_sub7_1, class33_sub6_sub4_sub7_1.anIntArray3634[l]);
					anIntArray3631[anInt3643] = method395(class33_sub6_sub4_sub7_1, class33_sub6_sub4_sub7_1.anIntArray3631[l]);
					anInt3643++;
				}

				for(int i1 = 0; i1 < class33_sub6_sub4_sub7_1.anInt3654; i1++)
				{
					anIntArray3660[anInt3654] = method395(class33_sub6_sub4_sub7_1, class33_sub6_sub4_sub7_1.anIntArray3660[i1]);
					anIntArray3655[anInt3654] = method395(class33_sub6_sub4_sub7_1, class33_sub6_sub4_sub7_1.anIntArray3655[i1]);
					anIntArray3659[anInt3654] = method395(class33_sub6_sub4_sub7_1, class33_sub6_sub4_sub7_1.anIntArray3659[i1]);
					anInt3654++;
				}

				j += class33_sub6_sub4_sub7_1.anInt3654;
			}
		}

	}

	public Class33_Sub6_Sub4_Sub7(Class33_Sub6_Sub4_Sub7 arg0, boolean arg1, boolean arg2, boolean arg3)
	{
		anInt3654 = 0;
		anInt3643 = 0;
		aBoolean3638 = false;
		anInt3661 = 0;
		aByte3662 = 0;
		anInt3661 = arg0.anInt3661;
		anInt3643 = arg0.anInt3643;
		anInt3654 = arg0.anInt3654;
		if(arg1)
		{
			anIntArray3640 = arg0.anIntArray3640;
			anIntArray3630 = arg0.anIntArray3630;
			anIntArray3641 = arg0.anIntArray3641;
		} else
		{
			anIntArray3640 = new int[anInt3661];
			anIntArray3630 = new int[anInt3661];
			anIntArray3641 = new int[anInt3661];
			for(int i = 0; i < anInt3661; i++)
			{
				anIntArray3640[i] = arg0.anIntArray3640[i];
				anIntArray3630[i] = arg0.anIntArray3630[i];
				anIntArray3641[i] = arg0.anIntArray3641[i];
			}

		}
		if(arg2)
		{
			aShortArray3647 = arg0.aShortArray3647;
		} else
		{
			aShortArray3647 = new short[anInt3643];
			for(int j = 0; j < anInt3643; j++)
				aShortArray3647[j] = arg0.aShortArray3647[j];

		}
		if(arg3)
		{
			aByteArray3644 = arg0.aByteArray3644;
		} else
		{
			aByteArray3644 = new byte[anInt3643];
			if(arg0.aByteArray3644 == null)
			{
				for(int k = 0; k < anInt3643; k++)
					aByteArray3644[k] = 0;

			} else
			{
				for(int l = 0; l < anInt3643; l++)
					aByteArray3644[l] = arg0.aByteArray3644[l];

			}
		}
		anIntArray3639 = arg0.anIntArray3639;
		anIntArray3634 = arg0.anIntArray3634;
		anIntArray3631 = arg0.anIntArray3631;
		aByteArray3652 = arg0.aByteArray3652;
		aByteArray3629 = arg0.aByteArray3629;
		aByteArray3650 = arg0.aByteArray3650;
		aByte3662 = arg0.aByte3662;
		anIntArray3660 = arg0.anIntArray3660;
		anIntArray3655 = arg0.anIntArray3655;
		anIntArray3659 = arg0.anIntArray3659;
		anIntArray3648 = arg0.anIntArray3648;
		anIntArray3663 = arg0.anIntArray3663;
		anIntArrayArray3646 = arg0.anIntArrayArray3646;
		anIntArrayArray3633 = arg0.anIntArrayArray3633;
		aClass40Array3656 = arg0.aClass40Array3656;
		aClass19Array3635 = arg0.aClass19Array3635;
		aClass40Array3645 = arg0.aClass40Array3645;
		aShort3642 = arg0.aShort3642;
		aShort3632 = arg0.aShort3632;
	}

	public static int anIntArray3627[] = new int[10000];
	public int anInt3628;
	public byte aByteArray3629[];
	public int anIntArray3630[];
	public int anIntArray3631[];
	public short aShort3632;
	public int anIntArrayArray3633[][];
	public int anIntArray3634[];
	public Class19 aClass19Array3635[];
	public static int anIntArray3636[];
	public int anInt3637;
	public boolean aBoolean3638;
	public int anIntArray3639[];
	public int anIntArray3640[];
	public int anIntArray3641[];
	public short aShort3642;
	public int anInt3643;
	public byte aByteArray3644[];
	public Class40 aClass40Array3645[];
	public int anIntArrayArray3646[][];
	public short aShortArray3647[];
	public int anIntArray3648[];
	public int anInt3649;
	public byte aByteArray3650[];
	public static int anIntArray3651[] = new int[10000];
	public byte aByteArray3652[];
	public static int anInt3653 = 0;
	public int anInt3654;
	public int anIntArray3655[];
	public Class40 aClass40Array3656[];
	public int anInt3657;
	public int anInt3658;
	public int anIntArray3659[];
	public int anIntArray3660[];
	public int anInt3661;
	public byte aByte3662;
	public int anIntArray3663[];

	static 
	{
		anIntArray3636 = new int[128];
		int i = 0;
		int j = 248;
		while(i < 9) 
			anIntArray3636[i++] = 255;
		while(i < 16) 
		{
			anIntArray3636[i++] = j;
			j -= 8;
		}
		while(i < 32) 
		{
			anIntArray3636[i++] = j;
			j -= 4;
		}
		while(i < 64) 
		{
			anIntArray3636[i++] = j;
			j -= 2;
		}
		while(i < 128) 
			anIntArray3636[i++] = j--;
	}
}
