// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub4_Sub3.java


public class Class33_Sub6_Sub4_Sub3 extends Class33_Sub6_Sub4
{

	public void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7)
	{
		anIntArray3446[0] = -1;
		if(anInt3422 != 2 && anInt3422 != 1)
			method348();
		int i = Class33_Sub6_Sub7_Sub1.anInt3665;
		int j = Class33_Sub6_Sub7_Sub1.anInt3669;
		int k = anIntArray3454[arg0];
		int l = anIntArray3434[arg0];
		int i1 = anIntArray3454[arg1];
		int j1 = anIntArray3434[arg1];
		int k1 = anIntArray3454[arg2];
		int l1 = anIntArray3434[arg2];
		int i2 = anIntArray3454[arg3];
		int j2 = anIntArray3434[arg3];
		int k2 = arg5 * i2 + arg6 * j2 >> 16;
		for(int l2 = 0; l2 < anInt3414; l2++)
		{
			int i3 = anIntArray3420[l2];
			int j3 = anIntArray3409[l2];
			int k3 = anIntArray3401[l2];
			if(arg2 != 0)
			{
				int l3 = j3 * k1 + i3 * l1 >> 16;
				j3 = j3 * l1 - i3 * k1 >> 16;
				i3 = l3;
			}
			if(arg0 != 0)
			{
				int i4 = j3 * l - k3 * k >> 16;
				k3 = j3 * k + k3 * l >> 16;
				j3 = i4;
			}
			if(arg1 != 0)
			{
				int j4 = k3 * i1 + i3 * j1 >> 16;
				k3 = k3 * j1 - i3 * i1 >> 16;
				i3 = j4;
			}
			i3 += arg4;
			j3 += arg5;
			k3 += arg6;
			int k4 = j3 * j2 - k3 * i2 >> 16;
			k3 = j3 * i2 + k3 * j2 >> 16;
			j3 = k4;
			anIntArray3435[l2] = k3 - k2;
			anIntArray3442[l2] = i + (i3 << 9) / arg7;
			anIntArray3431[l2] = j + (j3 << 9) / arg7;
			if(anInt3407 > 0)
			{
				anIntArray3453[l2] = i3;
				anIntArray3450[l2] = j3;
				anIntArray3428[l2] = k3;
			}
		}

		try
		{
			method332(false, false, 0);
			return;
		}
		catch(Exception _ex)
		{
			return;
		}
	}

	public void method327(int arg0)
	{
		if(aBooleanArray3456[arg0])
		{
			method341(arg0);
			return;
		}
		int i = anIntArray3399[arg0];
		int j = anIntArray3395[arg0];
		int k = anIntArray3402[arg0];
		Class33_Sub6_Sub7_Sub1.aBoolean3664 = aBooleanArray3430[arg0];
		if(aByteArray3400 == null)
			Class33_Sub6_Sub7_Sub1.anInt3673 = 0;
		else
			Class33_Sub6_Sub7_Sub1.anInt3673 = aByteArray3400[arg0] & 0xff;
		if(aByteArray3403 == null || aByteArray3403[arg0] == -1)
			if(anIntArray3405[arg0] == -1)
			{
				Class33_Sub6_Sub7_Sub1.method436(anIntArray3431[i], anIntArray3431[j], anIntArray3431[k], anIntArray3442[i], anIntArray3442[j], anIntArray3442[k], anIntArray3433[anIntArray3412[arg0]]);
				return;
			} else
			{
				Class33_Sub6_Sub7_Sub1.method439(anIntArray3431[i], anIntArray3431[j], anIntArray3431[k], anIntArray3442[i], anIntArray3442[j], anIntArray3442[k], anIntArray3412[arg0], anIntArray3408[arg0], anIntArray3405[arg0]);
				return;
			}
		int l = aByteArray3403[arg0] & 0xff;
		int i1 = anIntArray3410[l];
		int j1 = anIntArray3418[l];
		int k1 = anIntArray3396[l];
		if(anIntArray3405[arg0] == -1)
		{
			Class33_Sub6_Sub7_Sub1.method437(anIntArray3431[i], anIntArray3431[j], anIntArray3431[k], anIntArray3442[i], anIntArray3442[j], anIntArray3442[k], anIntArray3412[arg0], anIntArray3412[arg0], anIntArray3412[arg0], anIntArray3453[i1], anIntArray3453[j1], anIntArray3453[k1], anIntArray3450[i1], anIntArray3450[j1], anIntArray3450[k1], anIntArray3428[i1], anIntArray3428[j1], anIntArray3428[k1], aShortArray3411[arg0]);
			return;
		} else
		{
			Class33_Sub6_Sub7_Sub1.method437(anIntArray3431[i], anIntArray3431[j], anIntArray3431[k], anIntArray3442[i], anIntArray3442[j], anIntArray3442[k], anIntArray3412[arg0], anIntArray3408[arg0], anIntArray3405[arg0], anIntArray3453[i1], anIntArray3453[j1], anIntArray3453[k1], anIntArray3450[i1], anIntArray3450[j1], anIntArray3450[k1], anIntArray3428[i1], anIntArray3428[j1], anIntArray3428[k1], aShortArray3411[arg0]);
			return;
		}
	}

	public Class33_Sub6_Sub4_Sub3 method328(int arg0, int arg1, int arg2, int arg3, boolean arg4)
	{
		if(arg0 == arg1 && arg0 == arg2 && arg0 == arg3)
			return this;
		Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3;
		if(arg4)
		{
			class33_sub6_sub4_sub3 = new Class33_Sub6_Sub4_Sub3();
			class33_sub6_sub4_sub3.anInt3414 = anInt3414;
			class33_sub6_sub4_sub3.anInt3415 = anInt3415;
			class33_sub6_sub4_sub3.anInt3407 = anInt3407;
			class33_sub6_sub4_sub3.anIntArray3420 = anIntArray3420;
			class33_sub6_sub4_sub3.anIntArray3401 = anIntArray3401;
			class33_sub6_sub4_sub3.anIntArray3399 = anIntArray3399;
			class33_sub6_sub4_sub3.anIntArray3395 = anIntArray3395;
			class33_sub6_sub4_sub3.anIntArray3402 = anIntArray3402;
			class33_sub6_sub4_sub3.anIntArray3412 = anIntArray3412;
			class33_sub6_sub4_sub3.anIntArray3408 = anIntArray3408;
			class33_sub6_sub4_sub3.anIntArray3405 = anIntArray3405;
			class33_sub6_sub4_sub3.aByteArray3419 = aByteArray3419;
			class33_sub6_sub4_sub3.aByteArray3400 = aByteArray3400;
			class33_sub6_sub4_sub3.aByteArray3403 = aByteArray3403;
			class33_sub6_sub4_sub3.aShortArray3411 = aShortArray3411;
			class33_sub6_sub4_sub3.aByte3406 = aByte3406;
			class33_sub6_sub4_sub3.anIntArray3410 = anIntArray3410;
			class33_sub6_sub4_sub3.anIntArray3418 = anIntArray3418;
			class33_sub6_sub4_sub3.anIntArray3396 = anIntArray3396;
			class33_sub6_sub4_sub3.anIntArrayArray3397 = anIntArrayArray3397;
			class33_sub6_sub4_sub3.anIntArrayArray3413 = anIntArrayArray3413;
			class33_sub6_sub4_sub3.aBoolean3404 = aBoolean3404;
			class33_sub6_sub4_sub3.anIntArray3409 = new int[class33_sub6_sub4_sub3.anInt3414];
		} else
		{
			class33_sub6_sub4_sub3 = this;
		}
		int i = (arg0 + arg1 + arg2 + arg3) / 4;
		for(int j = 0; j < class33_sub6_sub4_sub3.anInt3414; j++)
		{
			int k = anIntArray3420[j];
			int l = anIntArray3409[j];
			int i1 = anIntArray3401[j];
			int j1 = arg0 + ((arg1 - arg0) * (k + 64)) / 128;
			int k1 = arg3 + ((arg2 - arg3) * (k + 64)) / 128;
			int l1 = j1 + ((k1 - j1) * (i1 + 64)) / 128;
			class33_sub6_sub4_sub3.anIntArray3409[j] = (l + l1) - i;
		}

		class33_sub6_sub4_sub3.anInt3422 = 0;
		return class33_sub6_sub4_sub3;
	}

	public static void method329()
	{
		aClass33_Sub6_Sub4_Sub3_3417 = null;
		aByteArray3425 = null;
		aClass33_Sub6_Sub4_Sub3_3424 = null;
		aByteArray3426 = null;
		aBooleanArray3430 = null;
		aBooleanArray3456 = null;
		anIntArray3442 = null;
		anIntArray3431 = null;
		anIntArray3435 = null;
		anIntArray3453 = null;
		anIntArray3450 = null;
		anIntArray3428 = null;
		anIntArray3446 = null;
		anIntArrayArray3437 = null;
		anIntArray3451 = null;
		anIntArrayArray3452 = null;
		anIntArray3436 = null;
		anIntArray3441 = null;
		anIntArray3440 = null;
		anIntArray3443 = null;
		anIntArray3432 = null;
		anIntArray3447 = null;
		anIntArray3439 = null;
		anIntArray3454 = null;
		anIntArray3434 = null;
		anIntArray3433 = null;
		anIntArray3438 = null;
	}

	public void method330(int arg0, int arg1[], int arg2, int arg3, int arg4)
	{
		int i = arg1.length;
		if(arg0 == 0)
		{
			int j = 0;
			anInt3455 = 0;
			anInt3448 = 0;
			anInt3429 = 0;
			for(int k1 = 0; k1 < i; k1++)
			{
				int l2 = arg1[k1];
				if(l2 < anIntArrayArray3397.length)
				{
					int ai4[] = anIntArrayArray3397[l2];
					for(int i4 = 0; i4 < ai4.length; i4++)
					{
						int j5 = ai4[i4];
						anInt3455 += anIntArray3420[j5];
						anInt3448 += anIntArray3409[j5];
						anInt3429 += anIntArray3401[j5];
						j++;
					}

				}
			}

			if(j > 0)
			{
				anInt3455 = anInt3455 / j + arg2;
				anInt3448 = anInt3448 / j + arg3;
				anInt3429 = anInt3429 / j + arg4;
				return;
			} else
			{
				anInt3455 = arg2;
				anInt3448 = arg3;
				anInt3429 = arg4;
				return;
			}
		}
		if(arg0 == 1)
		{
			for(int k = 0; k < i; k++)
			{
				int l1 = arg1[k];
				if(l1 < anIntArrayArray3397.length)
				{
					int ai[] = anIntArrayArray3397[l1];
					for(int i3 = 0; i3 < ai.length; i3++)
					{
						int j4 = ai[i3];
						anIntArray3420[j4] += arg2;
						anIntArray3409[j4] += arg3;
						anIntArray3401[j4] += arg4;
					}

				}
			}

			return;
		}
		if(arg0 == 2)
		{
			for(int l = 0; l < i; l++)
			{
				int i2 = arg1[l];
				if(i2 < anIntArrayArray3397.length)
				{
					int ai1[] = anIntArrayArray3397[i2];
					for(int j3 = 0; j3 < ai1.length; j3++)
					{
						int k4 = ai1[j3];
						anIntArray3420[k4] -= anInt3455;
						anIntArray3409[k4] -= anInt3448;
						anIntArray3401[k4] -= anInt3429;
						int k5 = (arg2 & 0xff) * 8;
						int i6 = (arg3 & 0xff) * 8;
						int j6 = (arg4 & 0xff) * 8;
						if(j6 != 0)
						{
							int k6 = anIntArray3454[j6];
							int j7 = anIntArray3434[j6];
							int i8 = anIntArray3409[k4] * k6 + anIntArray3420[k4] * j7 >> 16;
							anIntArray3409[k4] = anIntArray3409[k4] * j7 - anIntArray3420[k4] * k6 >> 16;
							anIntArray3420[k4] = i8;
						}
						if(k5 != 0)
						{
							int l6 = anIntArray3454[k5];
							int k7 = anIntArray3434[k5];
							int j8 = anIntArray3409[k4] * k7 - anIntArray3401[k4] * l6 >> 16;
							anIntArray3401[k4] = anIntArray3409[k4] * l6 + anIntArray3401[k4] * k7 >> 16;
							anIntArray3409[k4] = j8;
						}
						if(i6 != 0)
						{
							int i7 = anIntArray3454[i6];
							int l7 = anIntArray3434[i6];
							int k8 = anIntArray3401[k4] * i7 + anIntArray3420[k4] * l7 >> 16;
							anIntArray3401[k4] = anIntArray3401[k4] * l7 - anIntArray3420[k4] * i7 >> 16;
							anIntArray3420[k4] = k8;
						}
						anIntArray3420[k4] += anInt3455;
						anIntArray3409[k4] += anInt3448;
						anIntArray3401[k4] += anInt3429;
					}

				}
			}

			return;
		}
		if(arg0 == 3)
		{
			for(int i1 = 0; i1 < i; i1++)
			{
				int j2 = arg1[i1];
				if(j2 < anIntArrayArray3397.length)
				{
					int ai2[] = anIntArrayArray3397[j2];
					for(int k3 = 0; k3 < ai2.length; k3++)
					{
						int l4 = ai2[k3];
						anIntArray3420[l4] -= anInt3455;
						anIntArray3409[l4] -= anInt3448;
						anIntArray3401[l4] -= anInt3429;
						anIntArray3420[l4] = (anIntArray3420[l4] * arg2) / 128;
						anIntArray3409[l4] = (anIntArray3409[l4] * arg3) / 128;
						anIntArray3401[l4] = (anIntArray3401[l4] * arg4) / 128;
						anIntArray3420[l4] += anInt3455;
						anIntArray3409[l4] += anInt3448;
						anIntArray3401[l4] += anInt3429;
					}

				}
			}

			return;
		}
		if(arg0 == 5 && anIntArrayArray3413 != null && aByteArray3400 != null)
		{
			for(int j1 = 0; j1 < i; j1++)
			{
				int k2 = arg1[j1];
				if(k2 < anIntArrayArray3413.length)
				{
					int ai3[] = anIntArrayArray3413[k2];
					for(int l3 = 0; l3 < ai3.length; l3++)
					{
						int i5 = ai3[l3];
						int l5 = (aByteArray3400[i5] & 0xff) + arg2 * 8;
						if(l5 < 0)
							l5 = 0;
						else
						if(l5 > 255)
							l5 = 255;
						aByteArray3400[i5] = (byte)l5;
					}

				}
			}

		}
	}

	public void method331(Class33_Sub6_Sub6 arg0, int arg1, Class33_Sub6_Sub6 arg2, int arg3, int arg4[])
	{
		if(arg1 == -1)
			return;
		if(arg4 == null || arg3 == -1)
		{
			method342(arg0, arg1);
			return;
		}
		Class28 class28 = arg0.aClass28Array2792[arg1];
		Class28 class28_1 = arg2.aClass28Array2792[arg3];
		Class33_Sub16 class33_sub16 = class28.aClass33_Sub16_577;
		anInt3455 = 0;
		anInt3448 = 0;
		anInt3429 = 0;
		int i = 0;
		int j = arg4[i++];
		for(int k = 0; k < class28.anInt569; k++)
		{
			int l;
			for(l = class28.anIntArray573[k]; l > j; j = arg4[i++]);
			if(l != j || class33_sub16.anIntArray2483[l] == 0)
				method330(class33_sub16.anIntArray2483[l], class33_sub16.anIntArrayArray2473[l], class28.anIntArray568[k], class28.anIntArray578[k], class28.anIntArray570[k]);
		}

		anInt3455 = 0;
		anInt3448 = 0;
		anInt3429 = 0;
		i = 0;
		j = arg4[i++];
		for(int i1 = 0; i1 < class28_1.anInt569; i1++)
		{
			int j1;
			for(j1 = class28_1.anIntArray573[i1]; j1 > j; j = arg4[i++]);
			if(j1 == j || class33_sub16.anIntArray2483[j1] == 0)
				method330(class33_sub16.anIntArray2483[j1], class33_sub16.anIntArrayArray2473[j1], class28_1.anIntArray568[i1], class28_1.anIntArray578[i1], class28_1.anIntArray570[i1]);
		}

		anInt3422 = 0;
	}

	public void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7, int arg8)
	{
		anIntArray3446[0] = -1;
		if(anInt3422 != 1)
			method334();
		int i = arg7 * arg4 - arg5 * arg3 >> 16;
		int j = arg6 * arg1 + i * arg2 >> 16;
		int k = anInt3421 * arg2 >> 16;
		int l = j + k;
		if(l <= 50 || j >= 3500)
			return;
		int i1 = arg7 * arg3 + arg5 * arg4 >> 16;
		int j1 = i1 - anInt3421 << 9;
		if(j1 / l >= Class33_Sub6_Sub7_Sub1.anInt3666)
			return;
		int k1 = i1 + anInt3421 << 9;
		if(k1 / l <= Class33_Sub6_Sub7_Sub1.anInt3667)
			return;
		int l1 = arg6 * arg2 - i * arg1 >> 16;
		int i2 = anInt3421 * arg1 >> 16;
		int j2 = l1 + i2 << 9;
		if(j2 / l <= Class33_Sub6_Sub7_Sub1.anInt3683)
			return;
		int k2 = i2 + (super.anInt2737 * arg2 >> 16);
		int l2 = l1 - k2 << 9;
		if(l2 / l >= Class33_Sub6_Sub7_Sub1.anInt3674)
			return;
		int i3 = k + (super.anInt2737 * arg1 >> 16);
		boolean flag = false;
		boolean flag1 = false;
		if(j - i3 <= 50)
			flag1 = true;
		boolean flag2 = flag1 || anInt3407 > 0;
		boolean flag3 = false;
		if(arg8 > 0 && aBoolean3427)
		{
			int j3 = j - k;
			if(j3 <= 50)
				j3 = 50;
			if(i1 > 0)
			{
				j1 /= l;
				k1 /= j3;
			} else
			{
				k1 /= l;
				j1 /= j3;
			}
			if(l1 > 0)
			{
				l2 /= l;
				j2 /= j3;
			} else
			{
				j2 /= l;
				l2 /= j3;
			}
			int l3 = anInt3449 - Class33_Sub6_Sub7_Sub1.anInt3665;
			int j4 = anInt3444 - Class33_Sub6_Sub7_Sub1.anInt3669;
			if(l3 > j1 && l3 < k1 && j4 > l2 && j4 < j2)
				if(aBoolean3404)
					anIntArray3439[anInt3445++] = arg8;
				else
					flag3 = true;
		}
		int k3 = Class33_Sub6_Sub7_Sub1.anInt3665;
		int i4 = Class33_Sub6_Sub7_Sub1.anInt3669;
		int k4 = 0;
		int l4 = 0;
		if(arg0 != 0)
		{
			k4 = anIntArray3454[arg0];
			l4 = anIntArray3434[arg0];
		}
		for(int i5 = 0; i5 < anInt3414; i5++)
		{
			int j5 = anIntArray3420[i5];
			int k5 = anIntArray3409[i5];
			int l5 = anIntArray3401[i5];
			if(arg0 != 0)
			{
				int i6 = l5 * k4 + j5 * l4 >> 16;
				l5 = l5 * l4 - j5 * k4 >> 16;
				j5 = i6;
			}
			j5 += arg5;
			k5 += arg6;
			l5 += arg7;
			int j6 = l5 * arg3 + j5 * arg4 >> 16;
			l5 = l5 * arg4 - j5 * arg3 >> 16;
			j5 = j6;
			j6 = k5 * arg2 - l5 * arg1 >> 16;
			l5 = k5 * arg1 + l5 * arg2 >> 16;
			k5 = j6;
			anIntArray3435[i5] = l5 - j;
			if(l5 >= 50)
			{
				anIntArray3442[i5] = k3 + (j5 << 9) / l5;
				anIntArray3431[i5] = i4 + (k5 << 9) / l5;
			} else
			{
				anIntArray3442[i5] = -5000;
				flag = true;
			}
			if(flag2)
			{
				anIntArray3453[i5] = j5;
				anIntArray3450[i5] = k5;
				anIntArray3428[i5] = l5;
			}
		}

		try
		{
			method332(flag, flag3, arg8);
			return;
		}
		catch(Exception _ex)
		{
			return;
		}
	}

	public void method332(boolean arg0, boolean arg1, int arg2)
	{
		if(anInt3416 >= 1600)
			return;
		for(int i = 0; i < anInt3416; i++)
			anIntArray3446[i] = 0;

		for(int j = 0; j < anInt3415; j++)
			if(anIntArray3405[j] != -2)
			{
				int k = anIntArray3399[j];
				int j1 = anIntArray3395[j];
				int i2 = anIntArray3402[j];
				int l2 = anIntArray3442[k];
				int k3 = anIntArray3442[j1];
				int j4 = anIntArray3442[i2];
				if(arg0 && (l2 == -5000 || k3 == -5000 || j4 == -5000))
				{
					int i5 = anIntArray3453[k];
					int l5 = anIntArray3453[j1];
					int k6 = anIntArray3453[i2];
					int l6 = anIntArray3450[k];
					int i7 = anIntArray3450[j1];
					int k7 = anIntArray3450[i2];
					int i8 = anIntArray3428[k];
					int j8 = anIntArray3428[j1];
					int l8 = anIntArray3428[i2];
					i5 -= l5;
					k6 -= l5;
					l6 -= i7;
					k7 -= i7;
					i8 -= j8;
					l8 -= j8;
					int i9 = l6 * l8 - i8 * k7;
					int j9 = i8 * k6 - i5 * l8;
					int k9 = i5 * k7 - l6 * k6;
					if(l5 * i9 + i7 * j9 + j8 * k9 > 0)
					{
						aBooleanArray3456[j] = true;
						int l9 = (anIntArray3435[k] + anIntArray3435[j1] + anIntArray3435[i2]) / 3 + anInt3398;
						anIntArrayArray3437[l9][anIntArray3446[l9]++] = j;
					}
				} else
				{
					if(arg1 && method346(anInt3449, anInt3444, anIntArray3431[k], anIntArray3431[j1], anIntArray3431[i2], l2, k3, j4))
					{
						anIntArray3439[anInt3445++] = arg2;
						arg1 = false;
					}
					if((l2 - k3) * (anIntArray3431[i2] - anIntArray3431[j1]) - (anIntArray3431[k] - anIntArray3431[j1]) * (j4 - k3) > 0)
					{
						aBooleanArray3456[j] = false;
						if(l2 < 0 || k3 < 0 || j4 < 0 || l2 > Class33_Sub6_Sub7_Sub1.anInt3675 || k3 > Class33_Sub6_Sub7_Sub1.anInt3675 || j4 > Class33_Sub6_Sub7_Sub1.anInt3675)
							aBooleanArray3430[j] = true;
						else
							aBooleanArray3430[j] = false;
						int j5 = (anIntArray3435[k] + anIntArray3435[j1] + anIntArray3435[i2]) / 3 + anInt3398;
						anIntArrayArray3437[j5][anIntArray3446[j5]++] = j;
					}
				}
			}

		if(aByteArray3419 == null)
		{
			for(int l = anInt3416 - 1; l >= 0; l--)
			{
				int k1 = anIntArray3446[l];
				if(k1 > 0)
				{
					int ai[] = anIntArrayArray3437[l];
					for(int i3 = 0; i3 < k1; i3++)
						method327(ai[i3]);

				}
			}

			return;
		}
		for(int i1 = 0; i1 < 12; i1++)
		{
			anIntArray3451[i1] = 0;
			anIntArray3440[i1] = 0;
		}

		for(int l1 = anInt3416 - 1; l1 >= 0; l1--)
		{
			int j2 = anIntArray3446[l1];
			if(j2 > 0)
			{
				int ai1[] = anIntArrayArray3437[l1];
				for(int l3 = 0; l3 < j2; l3++)
				{
					int k4 = ai1[l3];
					byte byte0 = aByteArray3419[k4];
					int i6 = anIntArray3451[byte0]++;
					anIntArrayArray3452[byte0][i6] = k4;
					if(byte0 < 10)
						anIntArray3440[byte0] += l1;
					else
					if(byte0 == 10)
						anIntArray3436[i6] = l1;
					else
						anIntArray3441[i6] = l1;
				}

			}
		}

		int k2 = 0;
		if(anIntArray3451[1] > 0 || anIntArray3451[2] > 0)
			k2 = (anIntArray3440[1] + anIntArray3440[2]) / (anIntArray3451[1] + anIntArray3451[2]);
		int j3 = 0;
		if(anIntArray3451[3] > 0 || anIntArray3451[4] > 0)
			j3 = (anIntArray3440[3] + anIntArray3440[4]) / (anIntArray3451[3] + anIntArray3451[4]);
		int i4 = 0;
		if(anIntArray3451[6] > 0 || anIntArray3451[8] > 0)
			i4 = (anIntArray3440[6] + anIntArray3440[8]) / (anIntArray3451[6] + anIntArray3451[8]);
		int k5 = 0;
		int j6 = anIntArray3451[10];
		int ai2[] = anIntArrayArray3452[10];
		int ai3[] = anIntArray3436;
		if(k5 == j6)
		{
			k5 = 0;
			j6 = anIntArray3451[11];
			ai2 = anIntArrayArray3452[11];
			ai3 = anIntArray3441;
		}
		int l4;
		if(k5 < j6)
			l4 = ai3[k5];
		else
			l4 = -1000;
		for(int j7 = 0; j7 < 10; j7++)
		{
			while(j7 == 0 && l4 > k2) 
			{
				method327(ai2[k5++]);
				if(k5 == j6 && ai2 != anIntArrayArray3452[11])
				{
					k5 = 0;
					j6 = anIntArray3451[11];
					ai2 = anIntArrayArray3452[11];
					ai3 = anIntArray3441;
				}
				if(k5 < j6)
					l4 = ai3[k5];
				else
					l4 = -1000;
			}
			while(j7 == 3 && l4 > j3) 
			{
				method327(ai2[k5++]);
				if(k5 == j6 && ai2 != anIntArrayArray3452[11])
				{
					k5 = 0;
					j6 = anIntArray3451[11];
					ai2 = anIntArrayArray3452[11];
					ai3 = anIntArray3441;
				}
				if(k5 < j6)
					l4 = ai3[k5];
				else
					l4 = -1000;
			}
			while(j7 == 5 && l4 > i4) 
			{
				method327(ai2[k5++]);
				if(k5 == j6 && ai2 != anIntArrayArray3452[11])
				{
					k5 = 0;
					j6 = anIntArray3451[11];
					ai2 = anIntArrayArray3452[11];
					ai3 = anIntArray3441;
				}
				if(k5 < j6)
					l4 = ai3[k5];
				else
					l4 = -1000;
			}
			int l7 = anIntArray3451[j7];
			int ai4[] = anIntArrayArray3452[j7];
			for(int k8 = 0; k8 < l7; k8++)
				method327(ai4[k8]);

		}

		while(l4 != -1000) 
		{
			method327(ai2[k5++]);
			if(k5 == j6 && ai2 != anIntArrayArray3452[11])
			{
				k5 = 0;
				ai2 = anIntArrayArray3452[11];
				j6 = anIntArray3451[11];
				ai3 = anIntArray3441;
			}
			if(k5 < j6)
				l4 = ai3[k5];
			else
				l4 = -1000;
		}
	}

	public Class33_Sub6_Sub4_Sub3 method333(boolean arg0)
	{
		if(!arg0 && aByteArray3425.length < anInt3415)
			aByteArray3425 = new byte[anInt3415 + 100];
		return method344(arg0, aClass33_Sub6_Sub4_Sub3_3417, aByteArray3425);
	}

	public void method334()
	{
		if(anInt3422 == 1)
			return;
		anInt3422 = 1;
		super.anInt2737 = 0;
		anInt3423 = 0;
		anInt3421 = 0;
		for(int i = 0; i < anInt3414; i++)
		{
			int j = anIntArray3420[i];
			int k = anIntArray3409[i];
			int l = anIntArray3401[i];
			if(-k > super.anInt2737)
				super.anInt2737 = -k;
			if(k > anInt3423)
				anInt3423 = k;
			int i1 = j * j + l * l;
			if(i1 > anInt3421)
				anInt3421 = i1;
		}

		anInt3421 = (int)(Math.sqrt(anInt3421) + 0.98999999999999999D);
		anInt3398 = (int)(Math.sqrt(anInt3421 * anInt3421 + super.anInt2737 * super.anInt2737) + 0.98999999999999999D);
		anInt3416 = anInt3398 + (int)(Math.sqrt(anInt3421 * anInt3421 + anInt3423 * anInt3423) + 0.98999999999999999D);
	}

	public Class33_Sub6_Sub4_Sub3 method335(boolean arg0)
	{
		if(!arg0 && aByteArray3426.length < anInt3415)
			aByteArray3426 = new byte[anInt3415 + 100];
		return method344(arg0, aClass33_Sub6_Sub4_Sub3_3424, aByteArray3426);
	}

	public int method336()
	{
		method334();
		return anInt3421;
	}

	public void method337(int arg0, int arg1, int arg2)
	{
		for(int i = 0; i < anInt3414; i++)
		{
			anIntArray3420[i] += arg0;
			anIntArray3409[i] += arg1;
			anIntArray3401[i] += arg2;
		}

		anInt3422 = 0;
	}

	public void method338(int arg0, int arg1, int arg2)
	{
		for(int i = 0; i < anInt3414; i++)
		{
			anIntArray3420[i] = (anIntArray3420[i] * arg0) / 128;
			anIntArray3409[i] = (anIntArray3409[i] * arg1) / 128;
			anIntArray3401[i] = (anIntArray3401[i] * arg2) / 128;
		}

		anInt3422 = 0;
	}

	public void method339()
	{
		for(int i = 0; i < anInt3414; i++)
		{
			int j = anIntArray3420[i];
			anIntArray3420[i] = anIntArray3401[i];
			anIntArray3401[i] = -j;
		}

		anInt3422 = 0;
	}

	public void method340()
	{
		for(int i = 0; i < anInt3414; i++)
		{
			int j = anIntArray3401[i];
			anIntArray3401[i] = anIntArray3420[i];
			anIntArray3420[i] = -j;
		}

		anInt3422 = 0;
	}

	public void method341(int arg0)
	{
		int i = Class33_Sub6_Sub7_Sub1.anInt3665;
		int j = Class33_Sub6_Sub7_Sub1.anInt3669;
		int k = 0;
		int l = anIntArray3399[arg0];
		int i1 = anIntArray3395[arg0];
		int j1 = anIntArray3402[arg0];
		int k1 = anIntArray3428[l];
		int l1 = anIntArray3428[i1];
		int i2 = anIntArray3428[j1];
		if(aByteArray3400 == null)
			Class33_Sub6_Sub7_Sub1.anInt3673 = 0;
		else
			Class33_Sub6_Sub7_Sub1.anInt3673 = aByteArray3400[arg0] & 0xff;
		if(k1 >= 50)
		{
			anIntArray3443[k] = anIntArray3442[l];
			anIntArray3432[k] = anIntArray3431[l];
			anIntArray3447[k++] = anIntArray3412[arg0];
		} else
		{
			int j2 = anIntArray3453[l];
			int j3 = anIntArray3450[l];
			int j4 = anIntArray3412[arg0];
			if(i2 >= 50)
			{
				int j5 = (50 - k1) * anIntArray3438[i2 - k1];
				anIntArray3443[k] = i + (j2 + ((anIntArray3453[j1] - j2) * j5 >> 16) << 9) / 50;
				anIntArray3432[k] = j + (j3 + ((anIntArray3450[j1] - j3) * j5 >> 16) << 9) / 50;
				anIntArray3447[k++] = j4 + ((anIntArray3405[arg0] - j4) * j5 >> 16);
			}
			if(l1 >= 50)
			{
				int k5 = (50 - k1) * anIntArray3438[l1 - k1];
				anIntArray3443[k] = i + (j2 + ((anIntArray3453[i1] - j2) * k5 >> 16) << 9) / 50;
				anIntArray3432[k] = j + (j3 + ((anIntArray3450[i1] - j3) * k5 >> 16) << 9) / 50;
				anIntArray3447[k++] = j4 + ((anIntArray3408[arg0] - j4) * k5 >> 16);
			}
		}
		if(l1 >= 50)
		{
			anIntArray3443[k] = anIntArray3442[i1];
			anIntArray3432[k] = anIntArray3431[i1];
			anIntArray3447[k++] = anIntArray3408[arg0];
		} else
		{
			int k2 = anIntArray3453[i1];
			int k3 = anIntArray3450[i1];
			int k4 = anIntArray3408[arg0];
			if(k1 >= 50)
			{
				int l5 = (50 - l1) * anIntArray3438[k1 - l1];
				anIntArray3443[k] = i + (k2 + ((anIntArray3453[l] - k2) * l5 >> 16) << 9) / 50;
				anIntArray3432[k] = j + (k3 + ((anIntArray3450[l] - k3) * l5 >> 16) << 9) / 50;
				anIntArray3447[k++] = k4 + ((anIntArray3412[arg0] - k4) * l5 >> 16);
			}
			if(i2 >= 50)
			{
				int i6 = (50 - l1) * anIntArray3438[i2 - l1];
				anIntArray3443[k] = i + (k2 + ((anIntArray3453[j1] - k2) * i6 >> 16) << 9) / 50;
				anIntArray3432[k] = j + (k3 + ((anIntArray3450[j1] - k3) * i6 >> 16) << 9) / 50;
				anIntArray3447[k++] = k4 + ((anIntArray3405[arg0] - k4) * i6 >> 16);
			}
		}
		if(i2 >= 50)
		{
			anIntArray3443[k] = anIntArray3442[j1];
			anIntArray3432[k] = anIntArray3431[j1];
			anIntArray3447[k++] = anIntArray3405[arg0];
		} else
		{
			int l2 = anIntArray3453[j1];
			int l3 = anIntArray3450[j1];
			int l4 = anIntArray3405[arg0];
			if(l1 >= 50)
			{
				int j6 = (50 - i2) * anIntArray3438[l1 - i2];
				anIntArray3443[k] = i + (l2 + ((anIntArray3453[i1] - l2) * j6 >> 16) << 9) / 50;
				anIntArray3432[k] = j + (l3 + ((anIntArray3450[i1] - l3) * j6 >> 16) << 9) / 50;
				anIntArray3447[k++] = l4 + ((anIntArray3408[arg0] - l4) * j6 >> 16);
			}
			if(k1 >= 50)
			{
				int k6 = (50 - i2) * anIntArray3438[k1 - i2];
				anIntArray3443[k] = i + (l2 + ((anIntArray3453[l] - l2) * k6 >> 16) << 9) / 50;
				anIntArray3432[k] = j + (l3 + ((anIntArray3450[l] - l3) * k6 >> 16) << 9) / 50;
				anIntArray3447[k++] = l4 + ((anIntArray3412[arg0] - l4) * k6 >> 16);
			}
		}
		int i3 = anIntArray3443[0];
		int i4 = anIntArray3443[1];
		int i5 = anIntArray3443[2];
		int l6 = anIntArray3432[0];
		int i7 = anIntArray3432[1];
		int j7 = anIntArray3432[2];
		Class33_Sub6_Sub7_Sub1.aBoolean3664 = false;
		if(k == 3)
		{
			if(i3 < 0 || i4 < 0 || i5 < 0 || i3 > Class33_Sub6_Sub7_Sub1.anInt3675 || i4 > Class33_Sub6_Sub7_Sub1.anInt3675 || i5 > Class33_Sub6_Sub7_Sub1.anInt3675)
				Class33_Sub6_Sub7_Sub1.aBoolean3664 = true;
			if(aByteArray3403 == null || aByteArray3403[arg0] == -1)
			{
				if(anIntArray3405[arg0] == -1)
					Class33_Sub6_Sub7_Sub1.method436(l6, i7, j7, i3, i4, i5, anIntArray3433[anIntArray3412[arg0]]);
				else
					Class33_Sub6_Sub7_Sub1.method439(l6, i7, j7, i3, i4, i5, anIntArray3447[0], anIntArray3447[1], anIntArray3447[2]);
			} else
			{
				int k7 = aByteArray3403[arg0] & 0xff;
				int j8 = anIntArray3410[k7];
				int l8 = anIntArray3418[k7];
				int j9 = anIntArray3396[k7];
				if(anIntArray3405[arg0] == -1)
					Class33_Sub6_Sub7_Sub1.method437(l6, i7, j7, i3, i4, i5, anIntArray3412[arg0], anIntArray3412[arg0], anIntArray3412[arg0], anIntArray3453[j8], anIntArray3453[l8], anIntArray3453[j9], anIntArray3450[j8], anIntArray3450[l8], anIntArray3450[j9], anIntArray3428[j8], anIntArray3428[l8], anIntArray3428[j9], aShortArray3411[arg0]);
				else
					Class33_Sub6_Sub7_Sub1.method437(l6, i7, j7, i3, i4, i5, anIntArray3447[0], anIntArray3447[1], anIntArray3447[2], anIntArray3453[j8], anIntArray3453[l8], anIntArray3453[j9], anIntArray3450[j8], anIntArray3450[l8], anIntArray3450[j9], anIntArray3428[j8], anIntArray3428[l8], anIntArray3428[j9], aShortArray3411[arg0]);
			}
		}
		if(k == 4)
		{
			if(i3 < 0 || i4 < 0 || i5 < 0 || i3 > Class33_Sub6_Sub7_Sub1.anInt3675 || i4 > Class33_Sub6_Sub7_Sub1.anInt3675 || i5 > Class33_Sub6_Sub7_Sub1.anInt3675 || anIntArray3443[3] < 0 || anIntArray3443[3] > Class33_Sub6_Sub7_Sub1.anInt3675)
				Class33_Sub6_Sub7_Sub1.aBoolean3664 = true;
			if(aByteArray3403 == null || aByteArray3403[arg0] == -1)
				if(anIntArray3405[arg0] == -1)
				{
					int l7 = anIntArray3433[anIntArray3412[arg0]];
					Class33_Sub6_Sub7_Sub1.method436(l6, i7, j7, i3, i4, i5, l7);
					Class33_Sub6_Sub7_Sub1.method436(l6, j7, anIntArray3432[3], i3, i5, anIntArray3443[3], l7);
					return;
				} else
				{
					Class33_Sub6_Sub7_Sub1.method439(l6, i7, j7, i3, i4, i5, anIntArray3447[0], anIntArray3447[1], anIntArray3447[2]);
					Class33_Sub6_Sub7_Sub1.method439(l6, j7, anIntArray3432[3], i3, i5, anIntArray3443[3], anIntArray3447[0], anIntArray3447[2], anIntArray3447[3]);
					return;
				}
			int i8 = aByteArray3403[arg0] & 0xff;
			int k8 = anIntArray3410[i8];
			int i9 = anIntArray3418[i8];
			int k9 = anIntArray3396[i8];
			short word0 = aShortArray3411[arg0];
			if(anIntArray3405[arg0] == -1)
			{
				Class33_Sub6_Sub7_Sub1.method437(l6, i7, j7, i3, i4, i5, anIntArray3412[arg0], anIntArray3412[arg0], anIntArray3412[arg0], anIntArray3453[k8], anIntArray3453[i9], anIntArray3453[k9], anIntArray3450[k8], anIntArray3450[i9], anIntArray3450[k9], anIntArray3428[k8], anIntArray3428[i9], anIntArray3428[k9], word0);
				Class33_Sub6_Sub7_Sub1.method437(l6, j7, anIntArray3432[3], i3, i5, anIntArray3443[3], anIntArray3412[arg0], anIntArray3412[arg0], anIntArray3412[arg0], anIntArray3453[k8], anIntArray3453[i9], anIntArray3453[k9], anIntArray3450[k8], anIntArray3450[i9], anIntArray3450[k9], anIntArray3428[k8], anIntArray3428[i9], anIntArray3428[k9], word0);
				return;
			}
			Class33_Sub6_Sub7_Sub1.method437(l6, i7, j7, i3, i4, i5, anIntArray3447[0], anIntArray3447[1], anIntArray3447[2], anIntArray3453[k8], anIntArray3453[i9], anIntArray3453[k9], anIntArray3450[k8], anIntArray3450[i9], anIntArray3450[k9], anIntArray3428[k8], anIntArray3428[i9], anIntArray3428[k9], word0);
			Class33_Sub6_Sub7_Sub1.method437(l6, j7, anIntArray3432[3], i3, i5, anIntArray3443[3], anIntArray3447[0], anIntArray3447[2], anIntArray3447[3], anIntArray3453[k8], anIntArray3453[i9], anIntArray3453[k9], anIntArray3450[k8], anIntArray3450[i9], anIntArray3450[k9], anIntArray3428[k8], anIntArray3428[i9], anIntArray3428[k9], word0);
		}
	}

	public void method342(Class33_Sub6_Sub6 arg0, int arg1)
	{
		if(anIntArrayArray3397 == null)
			return;
		if(arg1 == -1)
			return;
		Class28 class28 = arg0.aClass28Array2792[arg1];
		Class33_Sub16 class33_sub16 = class28.aClass33_Sub16_577;
		anInt3455 = 0;
		anInt3448 = 0;
		anInt3429 = 0;
		for(int i = 0; i < class28.anInt569; i++)
		{
			int j = class28.anIntArray573[i];
			method330(class33_sub16.anIntArray2483[j], class33_sub16.anIntArrayArray2473[j], class28.anIntArray568[i], class28.anIntArray578[i], class28.anIntArray570[i]);
		}

		anInt3422 = 0;
	}

	public void method343()
	{
		for(int i = 0; i < anInt3414; i++)
		{
			anIntArray3420[i] = -anIntArray3420[i];
			anIntArray3401[i] = -anIntArray3401[i];
		}

		anInt3422 = 0;
	}

	public Class33_Sub6_Sub4_Sub3 method344(boolean arg0, Class33_Sub6_Sub4_Sub3 arg1, byte arg2[])
	{
		arg1.anInt3414 = anInt3414;
		arg1.anInt3415 = anInt3415;
		arg1.anInt3407 = anInt3407;
		if(arg1.anIntArray3420 == null || arg1.anIntArray3420.length < anInt3414)
		{
			arg1.anIntArray3420 = new int[anInt3414 + 100];
			arg1.anIntArray3409 = new int[anInt3414 + 100];
			arg1.anIntArray3401 = new int[anInt3414 + 100];
		}
		for(int i = 0; i < anInt3414; i++)
		{
			arg1.anIntArray3420[i] = anIntArray3420[i];
			arg1.anIntArray3409[i] = anIntArray3409[i];
			arg1.anIntArray3401[i] = anIntArray3401[i];
		}

		if(arg0)
		{
			arg1.aByteArray3400 = aByteArray3400;
		} else
		{
			arg1.aByteArray3400 = arg2;
			if(aByteArray3400 == null)
			{
				for(int j = 0; j < anInt3415; j++)
					arg1.aByteArray3400[j] = 0;

			} else
			{
				for(int k = 0; k < anInt3415; k++)
					arg1.aByteArray3400[k] = aByteArray3400[k];

			}
		}
		arg1.anIntArray3399 = anIntArray3399;
		arg1.anIntArray3395 = anIntArray3395;
		arg1.anIntArray3402 = anIntArray3402;
		arg1.anIntArray3412 = anIntArray3412;
		arg1.anIntArray3408 = anIntArray3408;
		arg1.anIntArray3405 = anIntArray3405;
		arg1.aByteArray3419 = aByteArray3419;
		arg1.aByteArray3403 = aByteArray3403;
		arg1.aShortArray3411 = aShortArray3411;
		arg1.aByte3406 = aByte3406;
		arg1.anIntArray3410 = anIntArray3410;
		arg1.anIntArray3418 = anIntArray3418;
		arg1.anIntArray3396 = anIntArray3396;
		arg1.anIntArrayArray3397 = anIntArrayArray3397;
		arg1.anIntArrayArray3413 = anIntArrayArray3413;
		arg1.aBoolean3404 = aBoolean3404;
		arg1.anInt3422 = 0;
		return arg1;
	}

	public void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		anIntArray3446[0] = -1;
		if(anInt3422 != 2 && anInt3422 != 1)
			method348();
		int i = Class33_Sub6_Sub7_Sub1.anInt3665;
		int j = Class33_Sub6_Sub7_Sub1.anInt3669;
		int k = anIntArray3454[arg0];
		int l = anIntArray3434[arg0];
		int i1 = anIntArray3454[arg1];
		int j1 = anIntArray3434[arg1];
		int k1 = anIntArray3454[arg2];
		int l1 = anIntArray3434[arg2];
		int i2 = anIntArray3454[arg3];
		int j2 = anIntArray3434[arg3];
		int k2 = arg5 * i2 + arg6 * j2 >> 16;
		for(int l2 = 0; l2 < anInt3414; l2++)
		{
			int i3 = anIntArray3420[l2];
			int j3 = anIntArray3409[l2];
			int k3 = anIntArray3401[l2];
			if(arg2 != 0)
			{
				int l3 = j3 * k1 + i3 * l1 >> 16;
				j3 = j3 * l1 - i3 * k1 >> 16;
				i3 = l3;
			}
			if(arg0 != 0)
			{
				int i4 = j3 * l - k3 * k >> 16;
				k3 = j3 * k + k3 * l >> 16;
				j3 = i4;
			}
			if(arg1 != 0)
			{
				int j4 = k3 * i1 + i3 * j1 >> 16;
				k3 = k3 * j1 - i3 * i1 >> 16;
				i3 = j4;
			}
			i3 += arg4;
			j3 += arg5;
			k3 += arg6;
			int k4 = j3 * j2 - k3 * i2 >> 16;
			k3 = j3 * i2 + k3 * j2 >> 16;
			j3 = k4;
			anIntArray3435[l2] = k3 - k2;
			anIntArray3442[l2] = i + (i3 << 9) / k3;
			anIntArray3431[l2] = j + (j3 << 9) / k3;
			if(anInt3407 > 0)
			{
				anIntArray3453[l2] = i3;
				anIntArray3450[l2] = j3;
				anIntArray3428[l2] = k3;
			}
		}

		try
		{
			method332(false, false, 0);
			return;
		}
		catch(Exception _ex)
		{
			return;
		}
	}

	public boolean method346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7)
	{
		if(arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
			return false;
		if(arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
			return false;
		if(arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
			return false;
		return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
	}

	public void method347(int arg0)
	{
		int i = anIntArray3454[arg0];
		int j = anIntArray3434[arg0];
		for(int k = 0; k < anInt3414; k++)
		{
			int l = anIntArray3409[k] * j - anIntArray3401[k] * i >> 16;
			anIntArray3401[k] = anIntArray3409[k] * i + anIntArray3401[k] * j >> 16;
			anIntArray3409[k] = l;
		}

		anInt3422 = 0;
	}

	public void method348()
	{
		if(anInt3422 == 2)
			return;
		anInt3422 = 2;
		anInt3421 = 0;
		for(int i = 0; i < anInt3414; i++)
		{
			int j = anIntArray3420[i];
			int k = anIntArray3409[i];
			int l = anIntArray3401[i];
			int i1 = j * j + l * l + k * k;
			if(i1 > anInt3421)
				anInt3421 = i1;
		}

		anInt3421 = (int)(Math.sqrt(anInt3421) + 0.98999999999999999D);
		anInt3398 = anInt3421;
		anInt3416 = anInt3421 + anInt3421;
	}

	public Class33_Sub6_Sub4_Sub3()
	{
		aBoolean3404 = false;
		anInt3407 = 0;
		aByte3406 = 0;
		anInt3415 = 0;
		anInt3414 = 0;
	}

	public Class33_Sub6_Sub4_Sub3(Class33_Sub6_Sub4_Sub3 arg0[], int arg1)
	{
		aBoolean3404 = false;
		anInt3407 = 0;
		aByte3406 = 0;
		anInt3415 = 0;
		anInt3414 = 0;
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;
		anInt3414 = 0;
		anInt3415 = 0;
		anInt3407 = 0;
		aByte3406 = -1;
		for(int i = 0; i < arg1; i++)
		{
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3 = arg0[i];
			if(class33_sub6_sub4_sub3 != null)
			{
				anInt3414 += class33_sub6_sub4_sub3.anInt3414;
				anInt3415 += class33_sub6_sub4_sub3.anInt3415;
				anInt3407 += class33_sub6_sub4_sub3.anInt3407;
				if(class33_sub6_sub4_sub3.aByteArray3419 != null)
				{
					flag = true;
				} else
				{
					if(aByte3406 == -1)
						aByte3406 = class33_sub6_sub4_sub3.aByte3406;
					if(aByte3406 != class33_sub6_sub4_sub3.aByte3406)
						flag = true;
				}
				flag1 |= class33_sub6_sub4_sub3.aByteArray3400 != null;
				flag2 |= class33_sub6_sub4_sub3.aByteArray3403 != null;
			}
		}

		anIntArray3420 = new int[anInt3414];
		anIntArray3409 = new int[anInt3414];
		anIntArray3401 = new int[anInt3414];
		anIntArray3399 = new int[anInt3415];
		anIntArray3395 = new int[anInt3415];
		anIntArray3402 = new int[anInt3415];
		anIntArray3412 = new int[anInt3415];
		anIntArray3408 = new int[anInt3415];
		anIntArray3405 = new int[anInt3415];
		if(anInt3407 > 0)
		{
			anIntArray3410 = new int[anInt3407];
			anIntArray3418 = new int[anInt3407];
			anIntArray3396 = new int[anInt3407];
		}
		if(flag)
			aByteArray3419 = new byte[anInt3415];
		if(flag1)
			aByteArray3400 = new byte[anInt3415];
		if(flag2)
		{
			aByteArray3403 = new byte[anInt3415];
			aShortArray3411 = new short[anInt3415];
		}
		anInt3414 = 0;
		anInt3415 = 0;
		anInt3407 = 0;
		int j = 0;
		for(int k = 0; k < arg1; k++)
		{
			Class33_Sub6_Sub4_Sub3 class33_sub6_sub4_sub3_1 = arg0[k];
			if(class33_sub6_sub4_sub3_1 != null)
			{
				int l = anInt3414;
				for(int i1 = 0; i1 < class33_sub6_sub4_sub3_1.anInt3414; i1++)
				{
					anIntArray3420[anInt3414] = class33_sub6_sub4_sub3_1.anIntArray3420[i1];
					anIntArray3409[anInt3414] = class33_sub6_sub4_sub3_1.anIntArray3409[i1];
					anIntArray3401[anInt3414] = class33_sub6_sub4_sub3_1.anIntArray3401[i1];
					anInt3414++;
				}

				for(int j1 = 0; j1 < class33_sub6_sub4_sub3_1.anInt3415; j1++)
				{
					anIntArray3399[anInt3415] = class33_sub6_sub4_sub3_1.anIntArray3399[j1] + l;
					anIntArray3395[anInt3415] = class33_sub6_sub4_sub3_1.anIntArray3395[j1] + l;
					anIntArray3402[anInt3415] = class33_sub6_sub4_sub3_1.anIntArray3402[j1] + l;
					anIntArray3412[anInt3415] = class33_sub6_sub4_sub3_1.anIntArray3412[j1];
					anIntArray3408[anInt3415] = class33_sub6_sub4_sub3_1.anIntArray3408[j1];
					anIntArray3405[anInt3415] = class33_sub6_sub4_sub3_1.anIntArray3405[j1];
					if(flag)
						if(class33_sub6_sub4_sub3_1.aByteArray3419 == null)
							aByteArray3419[anInt3415] = class33_sub6_sub4_sub3_1.aByte3406;
						else
							aByteArray3419[anInt3415] = class33_sub6_sub4_sub3_1.aByteArray3419[j1];
					if(flag1)
						if(class33_sub6_sub4_sub3_1.aByteArray3400 == null)
							aByteArray3400[anInt3415] = 0;
						else
							aByteArray3400[anInt3415] = class33_sub6_sub4_sub3_1.aByteArray3400[j1];
					if(flag2)
						if(class33_sub6_sub4_sub3_1.aByteArray3403 != null && class33_sub6_sub4_sub3_1.aByteArray3403[j1] != -1)
						{
							aByteArray3403[anInt3415] = (byte)(class33_sub6_sub4_sub3_1.aByteArray3403[j1] + j);
							aShortArray3411[anInt3415] = class33_sub6_sub4_sub3_1.aShortArray3411[j1];
						} else
						{
							aByteArray3403[anInt3415] = -1;
						}
					anInt3415++;
				}

				for(int k1 = 0; k1 < class33_sub6_sub4_sub3_1.anInt3407; k1++)
				{
					anIntArray3410[anInt3407] = class33_sub6_sub4_sub3_1.anIntArray3410[k1] + l;
					anIntArray3418[anInt3407] = class33_sub6_sub4_sub3_1.anIntArray3418[k1] + l;
					anIntArray3396[anInt3407] = class33_sub6_sub4_sub3_1.anIntArray3396[k1] + l;
					anInt3407++;
				}

				j += class33_sub6_sub4_sub3_1.anInt3407;
			}
		}

	}

	public int anIntArray3395[];
	public int anIntArray3396[];
	public int anIntArrayArray3397[][];
	public int anInt3398;
	public int anIntArray3399[];
	public byte aByteArray3400[];
	public int anIntArray3401[];
	public int anIntArray3402[];
	public byte aByteArray3403[];
	public boolean aBoolean3404;
	public int anIntArray3405[];
	public byte aByte3406;
	public int anInt3407;
	public int anIntArray3408[];
	public int anIntArray3409[];
	public int anIntArray3410[];
	public short aShortArray3411[];
	public int anIntArray3412[];
	public int anIntArrayArray3413[][];
	public int anInt3414;
	public int anInt3415;
	public int anInt3416;
	public static Class33_Sub6_Sub4_Sub3 aClass33_Sub6_Sub4_Sub3_3417 = new Class33_Sub6_Sub4_Sub3();
	public int anIntArray3418[];
	public byte aByteArray3419[];
	public int anIntArray3420[];
	public int anInt3421;
	public int anInt3422;
	public int anInt3423;
	public static Class33_Sub6_Sub4_Sub3 aClass33_Sub6_Sub4_Sub3_3424 = new Class33_Sub6_Sub4_Sub3();
	public static byte aByteArray3425[] = new byte[1];
	public static byte aByteArray3426[] = new byte[1];
	public static boolean aBoolean3427 = false;
	public static int anIntArray3428[] = new int[4096];
	public static int anInt3429;
	public static boolean aBooleanArray3430[] = new boolean[4096];
	public static int anIntArray3431[] = new int[4096];
	public static int anIntArray3432[] = new int[10];
	public static int anIntArray3433[];
	public static int anIntArray3434[];
	public static int anIntArray3435[] = new int[4096];
	public static int anIntArray3436[] = new int[2000];
	public static int anIntArrayArray3437[][] = new int[1600][512];
	public static int anIntArray3438[];
	public static int anIntArray3439[] = new int[1000];
	public static int anIntArray3440[] = new int[12];
	public static int anIntArray3441[] = new int[2000];
	public static int anIntArray3442[] = new int[4096];
	public static int anIntArray3443[] = new int[10];
	public static int anInt3444 = 0;
	public static int anInt3445 = 0;
	public static int anIntArray3446[] = new int[1600];
	public static int anIntArray3447[] = new int[10];
	public static int anInt3448;
	public static int anInt3449 = 0;
	public static int anIntArray3450[] = new int[4096];
	public static int anIntArray3451[] = new int[12];
	public static int anIntArrayArray3452[][] = new int[12][2000];
	public static int anIntArray3453[] = new int[4096];
	public static int anIntArray3454[];
	public static int anInt3455;
	public static boolean aBooleanArray3456[] = new boolean[4096];

	static 
	{
		anIntArray3434 = Class33_Sub6_Sub7_Sub1.anIntArray3678;
		anIntArray3433 = Class33_Sub6_Sub7_Sub1.anIntArray3682;
		anIntArray3438 = Class33_Sub6_Sub7_Sub1.anIntArray3670;
		anIntArray3454 = Class33_Sub6_Sub7_Sub1.anIntArray3681;
	}
}
