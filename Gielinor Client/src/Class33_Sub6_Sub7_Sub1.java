// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub7_Sub1.java


public class Class33_Sub6_Sub7_Sub1 extends Class33_Sub6_Sub7
{

	public static void method430()
	{
		anInt3665 = anInt3675 / 2;
		anInt3669 = anInt3677 / 2;
		anInt3667 = -anInt3665;
		anInt3666 = anInt3675 - anInt3665;
		anInt3683 = -anInt3669;
		anInt3674 = anInt3677 - anInt3669;
	}

	public static void method431(double arg0)
	{
		method445(arg0, 0, 512);
	}

	public static void method432()
	{
		anIntArray3679 = null;
		anIntArray3682 = null;
		anInterface1_3680 = null;
		anIntArray3671 = null;
		anIntArray3670 = null;
		anIntArray3681 = null;
		anIntArray3678 = null;
	}

	public static void method433()
	{
		method440(Class33_Sub6_Sub7.anInt2798, Class33_Sub6_Sub7.anInt2794, Class33_Sub6_Sub7.anInt2799, Class33_Sub6_Sub7.anInt2793);
	}

	public static void method434(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14)
	{
		if(arg5 >= arg6)
			return;
		int i;
		int j;
		if(aBoolean3664)
		{
			i = (arg8 - arg7) / (arg6 - arg5);
			if(arg6 > anInt3675)
				arg6 = anInt3675;
			if(arg5 < 0)
			{
				arg7 -= arg5 * i;
				arg5 = 0;
			}
			if(arg5 >= arg6)
				return;
			j = arg6 - arg5 >> 3;
			i <<= 12;
			arg7 <<= 9;
		} else
		{
			if(arg6 - arg5 > 7)
			{
				j = arg6 - arg5 >> 3;
				i = (arg8 - arg7) * anIntArray3671[j] >> 6;
			} else
			{
				j = 0;
				i = 0;
			}
			arg7 <<= 9;
		}
		arg4 += arg5;
		if(aBoolean3672)
		{
			int l = 0;
			int j1 = 0;
			int j3 = arg5 - anInt3665;
			arg9 += (arg12 >> 3) * j3;
			arg10 += (arg13 >> 3) * j3;
			arg11 += (arg14 >> 3) * j3;
			int l1 = arg11 >> 12;
			if(l1 != 0)
			{
				arg2 = arg9 / l1;
				arg3 = arg10 / l1;
				if(arg2 < 0)
					arg2 = 0;
				else
				if(arg2 > 4032)
					arg2 = 4032;
			}
			arg9 += arg12;
			arg10 += arg13;
			arg11 += arg14;
			l1 = arg11 >> 12;
			if(l1 != 0)
			{
				l = arg9 / l1;
				j1 = arg10 / l1;
				if(l < 7)
					l = 7;
				else
				if(l > 4032)
					l = 4032;
			}
			int l3 = l - arg2 >> 3;
			int j4 = j1 - arg3 >> 3;
			arg2 += (arg7 & 0x600000) >> 3;
			int l4 = arg7 >> 23;
			if(aBoolean3668)
			{
				while(j-- > 0) 
				{
					arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4;
					arg2 += l3;
					arg3 += j4;
					arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4;
					arg2 += l3;
					arg3 += j4;
					arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4;
					arg2 += l3;
					arg3 += j4;
					arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4;
					arg2 += l3;
					arg3 += j4;
					arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4;
					arg2 += l3;
					arg3 += j4;
					arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4;
					arg2 += l3;
					arg3 += j4;
					arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4;
					arg2 += l3;
					arg3 += j4;
					arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4;
					arg2 = l;
					arg3 = j1;
					arg9 += arg12;
					arg10 += arg13;
					arg11 += arg14;
					int i2 = arg11 >> 12;
					if(i2 != 0)
					{
						l = arg9 / i2;
						j1 = arg10 / i2;
						if(l < 7)
							l = 7;
						else
						if(l > 4032)
							l = 4032;
					}
					l3 = l - arg2 >> 3;
					j4 = j1 - arg3 >> 3;
					arg7 += i;
					arg2 += (arg7 & 0x600000) >> 3;
					l4 = arg7 >> 23;
				}
				for(j = arg6 - arg5 & 7; j-- > 0;)
				{
					arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4;
					arg2 += l3;
					arg3 += j4;
				}

				return;
			}
			while(j-- > 0) 
			{
				int j5;
				if((j5 = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4) != 0)
					arg0[arg4] = j5;
				arg4++;
				arg2 += l3;
				arg3 += j4;
				if((j5 = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4) != 0)
					arg0[arg4] = j5;
				arg4++;
				arg2 += l3;
				arg3 += j4;
				if((j5 = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4) != 0)
					arg0[arg4] = j5;
				arg4++;
				arg2 += l3;
				arg3 += j4;
				if((j5 = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4) != 0)
					arg0[arg4] = j5;
				arg4++;
				arg2 += l3;
				arg3 += j4;
				if((j5 = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4) != 0)
					arg0[arg4] = j5;
				arg4++;
				arg2 += l3;
				arg3 += j4;
				if((j5 = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4) != 0)
					arg0[arg4] = j5;
				arg4++;
				arg2 += l3;
				arg3 += j4;
				if((j5 = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4) != 0)
					arg0[arg4] = j5;
				arg4++;
				arg2 += l3;
				arg3 += j4;
				if((j5 = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4) != 0)
					arg0[arg4] = j5;
				arg4++;
				arg2 = l;
				arg3 = j1;
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				int j2 = arg11 >> 12;
				if(j2 != 0)
				{
					l = arg9 / j2;
					j1 = arg10 / j2;
					if(l < 7)
						l = 7;
					else
					if(l > 4032)
						l = 4032;
				}
				l3 = l - arg2 >> 3;
				j4 = j1 - arg3 >> 3;
				arg7 += i;
				arg2 += (arg7 & 0x600000) >> 3;
				l4 = arg7 >> 23;
			}
			for(j = arg6 - arg5 & 7; j-- > 0;)
			{
				int k5;
				if((k5 = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> l4) != 0)
					arg0[arg4] = k5;
				arg4++;
				arg2 += l3;
				arg3 += j4;
			}

			return;
		}
		int i1 = 0;
		int k1 = 0;
		int k3 = arg5 - anInt3665;
		arg9 += (arg12 >> 3) * k3;
		arg10 += (arg13 >> 3) * k3;
		arg11 += (arg14 >> 3) * k3;
		int k2 = arg11 >> 14;
		if(k2 != 0)
		{
			arg2 = arg9 / k2;
			arg3 = arg10 / k2;
			if(arg2 < 0)
				arg2 = 0;
			else
			if(arg2 > 16256)
				arg2 = 16256;
		}
		arg9 += arg12;
		arg10 += arg13;
		arg11 += arg14;
		k2 = arg11 >> 14;
		if(k2 != 0)
		{
			i1 = arg9 / k2;
			k1 = arg10 / k2;
			if(i1 < 7)
				i1 = 7;
			else
			if(i1 > 16256)
				i1 = 16256;
		}
		int i4 = i1 - arg2 >> 3;
		int k4 = k1 - arg3 >> 3;
		arg2 += arg7 & 0x600000;
		int i5 = arg7 >> 23;
		if(aBoolean3668)
		{
			while(j-- > 0) 
			{
				arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5;
				arg2 += i4;
				arg3 += k4;
				arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5;
				arg2 += i4;
				arg3 += k4;
				arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5;
				arg2 += i4;
				arg3 += k4;
				arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5;
				arg2 += i4;
				arg3 += k4;
				arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5;
				arg2 += i4;
				arg3 += k4;
				arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5;
				arg2 += i4;
				arg3 += k4;
				arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5;
				arg2 += i4;
				arg3 += k4;
				arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5;
				arg2 = i1;
				arg3 = k1;
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				int l2 = arg11 >> 14;
				if(l2 != 0)
				{
					i1 = arg9 / l2;
					k1 = arg10 / l2;
					if(i1 < 7)
						i1 = 7;
					else
					if(i1 > 16256)
						i1 = 16256;
				}
				i4 = i1 - arg2 >> 3;
				k4 = k1 - arg3 >> 3;
				arg7 += i;
				arg2 += arg7 & 0x600000;
				i5 = arg7 >> 23;
			}
			for(j = arg6 - arg5 & 7; j-- > 0;)
			{
				arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5;
				arg2 += i4;
				arg3 += k4;
			}

			return;
		}
		while(j-- > 0) 
		{
			int l5;
			if((l5 = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5) != 0)
				arg0[arg4] = l5;
			arg4++;
			arg2 += i4;
			arg3 += k4;
			if((l5 = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5) != 0)
				arg0[arg4] = l5;
			arg4++;
			arg2 += i4;
			arg3 += k4;
			if((l5 = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5) != 0)
				arg0[arg4] = l5;
			arg4++;
			arg2 += i4;
			arg3 += k4;
			if((l5 = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5) != 0)
				arg0[arg4] = l5;
			arg4++;
			arg2 += i4;
			arg3 += k4;
			if((l5 = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5) != 0)
				arg0[arg4] = l5;
			arg4++;
			arg2 += i4;
			arg3 += k4;
			if((l5 = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5) != 0)
				arg0[arg4] = l5;
			arg4++;
			arg2 += i4;
			arg3 += k4;
			if((l5 = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5) != 0)
				arg0[arg4] = l5;
			arg4++;
			arg2 += i4;
			arg3 += k4;
			if((l5 = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5) != 0)
				arg0[arg4] = l5;
			arg4++;
			arg2 = i1;
			arg3 = k1;
			arg9 += arg12;
			arg10 += arg13;
			arg11 += arg14;
			int i3 = arg11 >> 14;
			if(i3 != 0)
			{
				i1 = arg9 / i3;
				k1 = arg10 / i3;
				if(i1 < 7)
					i1 = 7;
				else
				if(i1 > 16256)
					i1 = 16256;
			}
			i4 = i1 - arg2 >> 3;
			k4 = k1 - arg3 >> 3;
			arg7 += i;
			arg2 += arg7 & 0x600000;
			i5 = arg7 >> 23;
		}
		for(int k = arg6 - arg5 & 7; k-- > 0;)
		{
			int i6;
			if((i6 = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i5) != 0)
				arg0[arg4] = i6;
			arg4++;
			arg2 += i4;
			arg3 += k4;
		}

	}

	public static void method435(int arg0, int arg1)
	{
		int i = anIntArray3679[0];
		int j = i / Class33_Sub6_Sub7.anInt2797;
		int k = i - j * Class33_Sub6_Sub7.anInt2797;
		anInt3665 = arg0 - k;
		anInt3669 = arg1 - j;
		anInt3667 = -anInt3665;
		anInt3666 = anInt3675 - anInt3665;
		anInt3683 = -anInt3669;
		anInt3674 = anInt3677 - anInt3669;
	}

	public static void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		int i = 0;
		if(arg1 != arg0)
			i = (arg4 - arg3 << 16) / (arg1 - arg0);
		int j = 0;
		if(arg2 != arg1)
			j = (arg5 - arg4 << 16) / (arg2 - arg1);
		int k = 0;
		if(arg2 != arg0)
			k = (arg3 - arg5 << 16) / (arg0 - arg2);
		if(arg0 <= arg1 && arg0 <= arg2)
		{
			if(arg0 >= anInt3677)
				return;
			if(arg1 > anInt3677)
				arg1 = anInt3677;
			if(arg2 > anInt3677)
				arg2 = anInt3677;
			if(arg1 < arg2)
			{
				arg5 = arg3 <<= 16;
				if(arg0 < 0)
				{
					arg5 -= k * arg0;
					arg3 -= i * arg0;
					arg0 = 0;
				}
				arg4 <<= 16;
				if(arg1 < 0)
				{
					arg4 -= j * arg1;
					arg1 = 0;
				}
				if(arg0 != arg1 && k < i || arg0 == arg1 && k > j)
				{
					arg2 -= arg1;
					arg1 -= arg0;
					for(arg0 = anIntArray3679[arg0]; --arg1 >= 0; arg0 += Class33_Sub6_Sub7.anInt2797)
					{
						method444(Class33_Sub6_Sub7.anIntArray2796, arg0, arg6, 0, arg5 >> 16, arg3 >> 16);
						arg5 += k;
						arg3 += i;
					}

					while(--arg2 >= 0) 
					{
						method444(Class33_Sub6_Sub7.anIntArray2796, arg0, arg6, 0, arg5 >> 16, arg4 >> 16);
						arg5 += k;
						arg4 += j;
						arg0 += Class33_Sub6_Sub7.anInt2797;
					}
					return;
				}
				arg2 -= arg1;
				arg1 -= arg0;
				for(arg0 = anIntArray3679[arg0]; --arg1 >= 0; arg0 += Class33_Sub6_Sub7.anInt2797)
				{
					method444(Class33_Sub6_Sub7.anIntArray2796, arg0, arg6, 0, arg3 >> 16, arg5 >> 16);
					arg5 += k;
					arg3 += i;
				}

				while(--arg2 >= 0) 
				{
					method444(Class33_Sub6_Sub7.anIntArray2796, arg0, arg6, 0, arg4 >> 16, arg5 >> 16);
					arg5 += k;
					arg4 += j;
					arg0 += Class33_Sub6_Sub7.anInt2797;
				}
				return;
			}
			arg4 = arg3 <<= 16;
			if(arg0 < 0)
			{
				arg4 -= k * arg0;
				arg3 -= i * arg0;
				arg0 = 0;
			}
			arg5 <<= 16;
			if(arg2 < 0)
			{
				arg5 -= j * arg2;
				arg2 = 0;
			}
			if(arg0 != arg2 && k < i || arg0 == arg2 && j > i)
			{
				arg1 -= arg2;
				arg2 -= arg0;
				for(arg0 = anIntArray3679[arg0]; --arg2 >= 0; arg0 += Class33_Sub6_Sub7.anInt2797)
				{
					method444(Class33_Sub6_Sub7.anIntArray2796, arg0, arg6, 0, arg4 >> 16, arg3 >> 16);
					arg4 += k;
					arg3 += i;
				}

				while(--arg1 >= 0) 
				{
					method444(Class33_Sub6_Sub7.anIntArray2796, arg0, arg6, 0, arg5 >> 16, arg3 >> 16);
					arg5 += j;
					arg3 += i;
					arg0 += Class33_Sub6_Sub7.anInt2797;
				}
				return;
			}
			arg1 -= arg2;
			arg2 -= arg0;
			for(arg0 = anIntArray3679[arg0]; --arg2 >= 0; arg0 += Class33_Sub6_Sub7.anInt2797)
			{
				method444(Class33_Sub6_Sub7.anIntArray2796, arg0, arg6, 0, arg3 >> 16, arg4 >> 16);
				arg4 += k;
				arg3 += i;
			}

			while(--arg1 >= 0) 
			{
				method444(Class33_Sub6_Sub7.anIntArray2796, arg0, arg6, 0, arg3 >> 16, arg5 >> 16);
				arg5 += j;
				arg3 += i;
				arg0 += Class33_Sub6_Sub7.anInt2797;
			}
			return;
		}
		if(arg1 <= arg2)
		{
			if(arg1 >= anInt3677)
				return;
			if(arg2 > anInt3677)
				arg2 = anInt3677;
			if(arg0 > anInt3677)
				arg0 = anInt3677;
			if(arg2 < arg0)
			{
				arg3 = arg4 <<= 16;
				if(arg1 < 0)
				{
					arg3 -= i * arg1;
					arg4 -= j * arg1;
					arg1 = 0;
				}
				arg5 <<= 16;
				if(arg2 < 0)
				{
					arg5 -= k * arg2;
					arg2 = 0;
				}
				if(arg1 != arg2 && i < j || arg1 == arg2 && i > k)
				{
					arg0 -= arg2;
					arg2 -= arg1;
					for(arg1 = anIntArray3679[arg1]; --arg2 >= 0; arg1 += Class33_Sub6_Sub7.anInt2797)
					{
						method444(Class33_Sub6_Sub7.anIntArray2796, arg1, arg6, 0, arg3 >> 16, arg4 >> 16);
						arg3 += i;
						arg4 += j;
					}

					while(--arg0 >= 0) 
					{
						method444(Class33_Sub6_Sub7.anIntArray2796, arg1, arg6, 0, arg3 >> 16, arg5 >> 16);
						arg3 += i;
						arg5 += k;
						arg1 += Class33_Sub6_Sub7.anInt2797;
					}
					return;
				}
				arg0 -= arg2;
				arg2 -= arg1;
				for(arg1 = anIntArray3679[arg1]; --arg2 >= 0; arg1 += Class33_Sub6_Sub7.anInt2797)
				{
					method444(Class33_Sub6_Sub7.anIntArray2796, arg1, arg6, 0, arg4 >> 16, arg3 >> 16);
					arg3 += i;
					arg4 += j;
				}

				while(--arg0 >= 0) 
				{
					method444(Class33_Sub6_Sub7.anIntArray2796, arg1, arg6, 0, arg5 >> 16, arg3 >> 16);
					arg3 += i;
					arg5 += k;
					arg1 += Class33_Sub6_Sub7.anInt2797;
				}
				return;
			}
			arg5 = arg4 <<= 16;
			if(arg1 < 0)
			{
				arg5 -= i * arg1;
				arg4 -= j * arg1;
				arg1 = 0;
			}
			arg3 <<= 16;
			if(arg0 < 0)
			{
				arg3 -= k * arg0;
				arg0 = 0;
			}
			if(i < j)
			{
				arg2 -= arg0;
				arg0 -= arg1;
				for(arg1 = anIntArray3679[arg1]; --arg0 >= 0; arg1 += Class33_Sub6_Sub7.anInt2797)
				{
					method444(Class33_Sub6_Sub7.anIntArray2796, arg1, arg6, 0, arg5 >> 16, arg4 >> 16);
					arg5 += i;
					arg4 += j;
				}

				while(--arg2 >= 0) 
				{
					method444(Class33_Sub6_Sub7.anIntArray2796, arg1, arg6, 0, arg3 >> 16, arg4 >> 16);
					arg3 += k;
					arg4 += j;
					arg1 += Class33_Sub6_Sub7.anInt2797;
				}
				return;
			}
			arg2 -= arg0;
			arg0 -= arg1;
			for(arg1 = anIntArray3679[arg1]; --arg0 >= 0; arg1 += Class33_Sub6_Sub7.anInt2797)
			{
				method444(Class33_Sub6_Sub7.anIntArray2796, arg1, arg6, 0, arg4 >> 16, arg5 >> 16);
				arg5 += i;
				arg4 += j;
			}

			while(--arg2 >= 0) 
			{
				method444(Class33_Sub6_Sub7.anIntArray2796, arg1, arg6, 0, arg4 >> 16, arg3 >> 16);
				arg3 += k;
				arg4 += j;
				arg1 += Class33_Sub6_Sub7.anInt2797;
			}
			return;
		}
		if(arg2 >= anInt3677)
			return;
		if(arg0 > anInt3677)
			arg0 = anInt3677;
		if(arg1 > anInt3677)
			arg1 = anInt3677;
		if(arg0 < arg1)
		{
			arg4 = arg5 <<= 16;
			if(arg2 < 0)
			{
				arg4 -= j * arg2;
				arg5 -= k * arg2;
				arg2 = 0;
			}
			arg3 <<= 16;
			if(arg0 < 0)
			{
				arg3 -= i * arg0;
				arg0 = 0;
			}
			if(j < k)
			{
				arg1 -= arg0;
				arg0 -= arg2;
				for(arg2 = anIntArray3679[arg2]; --arg0 >= 0; arg2 += Class33_Sub6_Sub7.anInt2797)
				{
					method444(Class33_Sub6_Sub7.anIntArray2796, arg2, arg6, 0, arg4 >> 16, arg5 >> 16);
					arg4 += j;
					arg5 += k;
				}

				while(--arg1 >= 0) 
				{
					method444(Class33_Sub6_Sub7.anIntArray2796, arg2, arg6, 0, arg4 >> 16, arg3 >> 16);
					arg4 += j;
					arg3 += i;
					arg2 += Class33_Sub6_Sub7.anInt2797;
				}
				return;
			}
			arg1 -= arg0;
			arg0 -= arg2;
			for(arg2 = anIntArray3679[arg2]; --arg0 >= 0; arg2 += Class33_Sub6_Sub7.anInt2797)
			{
				method444(Class33_Sub6_Sub7.anIntArray2796, arg2, arg6, 0, arg5 >> 16, arg4 >> 16);
				arg4 += j;
				arg5 += k;
			}

			while(--arg1 >= 0) 
			{
				method444(Class33_Sub6_Sub7.anIntArray2796, arg2, arg6, 0, arg3 >> 16, arg4 >> 16);
				arg4 += j;
				arg3 += i;
				arg2 += Class33_Sub6_Sub7.anInt2797;
			}
			return;
		}
		arg3 = arg5 <<= 16;
		if(arg2 < 0)
		{
			arg3 -= j * arg2;
			arg5 -= k * arg2;
			arg2 = 0;
		}
		arg4 <<= 16;
		if(arg1 < 0)
		{
			arg4 -= i * arg1;
			arg1 = 0;
		}
		if(j < k)
		{
			arg0 -= arg1;
			arg1 -= arg2;
			for(arg2 = anIntArray3679[arg2]; --arg1 >= 0; arg2 += Class33_Sub6_Sub7.anInt2797)
			{
				method444(Class33_Sub6_Sub7.anIntArray2796, arg2, arg6, 0, arg3 >> 16, arg5 >> 16);
				arg3 += j;
				arg5 += k;
			}

			while(--arg0 >= 0) 
			{
				method444(Class33_Sub6_Sub7.anIntArray2796, arg2, arg6, 0, arg4 >> 16, arg5 >> 16);
				arg4 += i;
				arg5 += k;
				arg2 += Class33_Sub6_Sub7.anInt2797;
			}
			return;
		}
		arg0 -= arg1;
		arg1 -= arg2;
		for(arg2 = anIntArray3679[arg2]; --arg1 >= 0; arg2 += Class33_Sub6_Sub7.anInt2797)
		{
			method444(Class33_Sub6_Sub7.anIntArray2796, arg2, arg6, 0, arg5 >> 16, arg3 >> 16);
			arg3 += j;
			arg5 += k;
		}

		while(--arg0 >= 0) 
		{
			method444(Class33_Sub6_Sub7.anIntArray2796, arg2, arg6, 0, arg5 >> 16, arg4 >> 16);
			arg4 += i;
			arg5 += k;
			arg2 += Class33_Sub6_Sub7.anInt2797;
		}
	}

	public static void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, 
			int arg15, int arg16, int arg17, int arg18)
	{
		int ai[] = anInterface1_3680.method3(false, arg18);
		if(ai == null)
		{
			int i = anInterface1_3680.method1(arg18, (byte)-88);
			method439(arg0, arg1, arg2, arg3, arg4, arg5, method438(i, arg6), method438(i, arg7), method438(i, arg8));
			return;
		}
		aBoolean3672 = anInterface1_3680.method4(arg18, -68);
		aBoolean3668 = anInterface1_3680.method2(arg18, (byte)93);
		arg10 = arg9 - arg10;
		arg13 = arg12 - arg13;
		arg16 = arg15 - arg16;
		arg11 -= arg9;
		arg14 -= arg12;
		arg17 -= arg15;
		int j = arg11 * arg12 - arg14 * arg9 << 14;
		int k = arg14 * arg15 - arg17 * arg12 << 8;
		int l = arg17 * arg9 - arg11 * arg15 << 5;
		int i1 = arg10 * arg12 - arg13 * arg9 << 14;
		int j1 = arg13 * arg15 - arg16 * arg12 << 8;
		int k1 = arg16 * arg9 - arg10 * arg15 << 5;
		int l1 = arg13 * arg11 - arg10 * arg14 << 14;
		int i2 = arg16 * arg14 - arg13 * arg17 << 8;
		int j2 = arg10 * arg17 - arg16 * arg11 << 5;
		int k2 = 0;
		int l2 = 0;
		if(arg1 != arg0)
		{
			k2 = (arg4 - arg3 << 16) / (arg1 - arg0);
			l2 = (arg7 - arg6 << 16) / (arg1 - arg0);
		}
		int i3 = 0;
		int j3 = 0;
		if(arg2 != arg1)
		{
			i3 = (arg5 - arg4 << 16) / (arg2 - arg1);
			j3 = (arg8 - arg7 << 16) / (arg2 - arg1);
		}
		int k3 = 0;
		int l3 = 0;
		if(arg2 != arg0)
		{
			k3 = (arg3 - arg5 << 16) / (arg0 - arg2);
			l3 = (arg6 - arg8 << 16) / (arg0 - arg2);
		}
		if(arg0 <= arg1 && arg0 <= arg2)
		{
			if(arg0 >= anInt3677)
				return;
			if(arg1 > anInt3677)
				arg1 = anInt3677;
			if(arg2 > anInt3677)
				arg2 = anInt3677;
			if(arg1 < arg2)
			{
				arg5 = arg3 <<= 16;
				arg8 = arg6 <<= 16;
				if(arg0 < 0)
				{
					arg5 -= k3 * arg0;
					arg3 -= k2 * arg0;
					arg8 -= l3 * arg0;
					arg6 -= l2 * arg0;
					arg0 = 0;
				}
				arg4 <<= 16;
				arg7 <<= 16;
				if(arg1 < 0)
				{
					arg4 -= i3 * arg1;
					arg7 -= j3 * arg1;
					arg1 = 0;
				}
				int i4 = arg0 - anInt3669;
				j += l * i4;
				i1 += k1 * i4;
				l1 += j2 * i4;
				if(arg0 != arg1 && k3 < k2 || arg0 == arg1 && k3 > i3)
				{
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 = anIntArray3679[arg0];
					while(--arg1 >= 0) 
					{
						method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, j, i1, l1, k, j1, i2);
						arg5 += k3;
						arg3 += k2;
						arg8 += l3;
						arg6 += l2;
						arg0 += Class33_Sub6_Sub7.anInt2797;
						j += l;
						i1 += k1;
						l1 += j2;
					}
					while(--arg2 >= 0) 
					{
						method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, j, i1, l1, k, j1, i2);
						arg5 += k3;
						arg4 += i3;
						arg8 += l3;
						arg7 += j3;
						arg0 += Class33_Sub6_Sub7.anInt2797;
						j += l;
						i1 += k1;
						l1 += j2;
					}
					return;
				}
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray3679[arg0];
				while(--arg1 >= 0) 
				{
					method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, j, i1, l1, k, j1, i2);
					arg5 += k3;
					arg3 += k2;
					arg8 += l3;
					arg6 += l2;
					arg0 += Class33_Sub6_Sub7.anInt2797;
					j += l;
					i1 += k1;
					l1 += j2;
				}
				while(--arg2 >= 0) 
				{
					method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, j, i1, l1, k, j1, i2);
					arg5 += k3;
					arg4 += i3;
					arg8 += l3;
					arg7 += j3;
					arg0 += Class33_Sub6_Sub7.anInt2797;
					j += l;
					i1 += k1;
					l1 += j2;
				}
				return;
			}
			arg4 = arg3 <<= 16;
			arg7 = arg6 <<= 16;
			if(arg0 < 0)
			{
				arg4 -= k3 * arg0;
				arg3 -= k2 * arg0;
				arg7 -= l3 * arg0;
				arg6 -= l2 * arg0;
				arg0 = 0;
			}
			arg5 <<= 16;
			arg8 <<= 16;
			if(arg2 < 0)
			{
				arg5 -= i3 * arg2;
				arg8 -= j3 * arg2;
				arg2 = 0;
			}
			int j4 = arg0 - anInt3669;
			j += l * j4;
			i1 += k1 * j4;
			l1 += j2 * j4;
			if(arg0 != arg2 && k3 < k2 || arg0 == arg2 && i3 > k2)
			{
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray3679[arg0];
				while(--arg2 >= 0) 
				{
					method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, j, i1, l1, k, j1, i2);
					arg4 += k3;
					arg3 += k2;
					arg7 += l3;
					arg6 += l2;
					arg0 += Class33_Sub6_Sub7.anInt2797;
					j += l;
					i1 += k1;
					l1 += j2;
				}
				while(--arg1 >= 0) 
				{
					method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, j, i1, l1, k, j1, i2);
					arg5 += i3;
					arg3 += k2;
					arg8 += j3;
					arg6 += l2;
					arg0 += Class33_Sub6_Sub7.anInt2797;
					j += l;
					i1 += k1;
					l1 += j2;
				}
				return;
			}
			arg1 -= arg2;
			arg2 -= arg0;
			arg0 = anIntArray3679[arg0];
			while(--arg2 >= 0) 
			{
				method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, j, i1, l1, k, j1, i2);
				arg4 += k3;
				arg3 += k2;
				arg7 += l3;
				arg6 += l2;
				arg0 += Class33_Sub6_Sub7.anInt2797;
				j += l;
				i1 += k1;
				l1 += j2;
			}
			while(--arg1 >= 0) 
			{
				method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, j, i1, l1, k, j1, i2);
				arg5 += i3;
				arg3 += k2;
				arg8 += j3;
				arg6 += l2;
				arg0 += Class33_Sub6_Sub7.anInt2797;
				j += l;
				i1 += k1;
				l1 += j2;
			}
			return;
		}
		if(arg1 <= arg2)
		{
			if(arg1 >= anInt3677)
				return;
			if(arg2 > anInt3677)
				arg2 = anInt3677;
			if(arg0 > anInt3677)
				arg0 = anInt3677;
			if(arg2 < arg0)
			{
				arg3 = arg4 <<= 16;
				arg6 = arg7 <<= 16;
				if(arg1 < 0)
				{
					arg3 -= k2 * arg1;
					arg4 -= i3 * arg1;
					arg6 -= l2 * arg1;
					arg7 -= j3 * arg1;
					arg1 = 0;
				}
				arg5 <<= 16;
				arg8 <<= 16;
				if(arg2 < 0)
				{
					arg5 -= k3 * arg2;
					arg8 -= l3 * arg2;
					arg2 = 0;
				}
				int k4 = arg1 - anInt3669;
				j += l * k4;
				i1 += k1 * k4;
				l1 += j2 * k4;
				if(arg1 != arg2 && k2 < i3 || arg1 == arg2 && k2 > k3)
				{
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 = anIntArray3679[arg1];
					while(--arg2 >= 0) 
					{
						method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, j, i1, l1, k, j1, i2);
						arg3 += k2;
						arg4 += i3;
						arg6 += l2;
						arg7 += j3;
						arg1 += Class33_Sub6_Sub7.anInt2797;
						j += l;
						i1 += k1;
						l1 += j2;
					}
					while(--arg0 >= 0) 
					{
						method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, j, i1, l1, k, j1, i2);
						arg3 += k2;
						arg5 += k3;
						arg6 += l2;
						arg8 += l3;
						arg1 += Class33_Sub6_Sub7.anInt2797;
						j += l;
						i1 += k1;
						l1 += j2;
					}
					return;
				}
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray3679[arg1];
				while(--arg2 >= 0) 
				{
					method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, j, i1, l1, k, j1, i2);
					arg3 += k2;
					arg4 += i3;
					arg6 += l2;
					arg7 += j3;
					arg1 += Class33_Sub6_Sub7.anInt2797;
					j += l;
					i1 += k1;
					l1 += j2;
				}
				while(--arg0 >= 0) 
				{
					method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, j, i1, l1, k, j1, i2);
					arg3 += k2;
					arg5 += k3;
					arg6 += l2;
					arg8 += l3;
					arg1 += Class33_Sub6_Sub7.anInt2797;
					j += l;
					i1 += k1;
					l1 += j2;
				}
				return;
			}
			arg5 = arg4 <<= 16;
			arg8 = arg7 <<= 16;
			if(arg1 < 0)
			{
				arg5 -= k2 * arg1;
				arg4 -= i3 * arg1;
				arg8 -= l2 * arg1;
				arg7 -= j3 * arg1;
				arg1 = 0;
			}
			arg3 <<= 16;
			arg6 <<= 16;
			if(arg0 < 0)
			{
				arg3 -= k3 * arg0;
				arg6 -= l3 * arg0;
				arg0 = 0;
			}
			int l4 = arg1 - anInt3669;
			j += l * l4;
			i1 += k1 * l4;
			l1 += j2 * l4;
			if(k2 < i3)
			{
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray3679[arg1];
				while(--arg0 >= 0) 
				{
					method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, j, i1, l1, k, j1, i2);
					arg5 += k2;
					arg4 += i3;
					arg8 += l2;
					arg7 += j3;
					arg1 += Class33_Sub6_Sub7.anInt2797;
					j += l;
					i1 += k1;
					l1 += j2;
				}
				while(--arg2 >= 0) 
				{
					method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, j, i1, l1, k, j1, i2);
					arg3 += k3;
					arg4 += i3;
					arg6 += l3;
					arg7 += j3;
					arg1 += Class33_Sub6_Sub7.anInt2797;
					j += l;
					i1 += k1;
					l1 += j2;
				}
				return;
			}
			arg2 -= arg0;
			arg0 -= arg1;
			arg1 = anIntArray3679[arg1];
			while(--arg0 >= 0) 
			{
				method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, j, i1, l1, k, j1, i2);
				arg5 += k2;
				arg4 += i3;
				arg8 += l2;
				arg7 += j3;
				arg1 += Class33_Sub6_Sub7.anInt2797;
				j += l;
				i1 += k1;
				l1 += j2;
			}
			while(--arg2 >= 0) 
			{
				method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, j, i1, l1, k, j1, i2);
				arg3 += k3;
				arg4 += i3;
				arg6 += l3;
				arg7 += j3;
				arg1 += Class33_Sub6_Sub7.anInt2797;
				j += l;
				i1 += k1;
				l1 += j2;
			}
			return;
		}
		if(arg2 >= anInt3677)
			return;
		if(arg0 > anInt3677)
			arg0 = anInt3677;
		if(arg1 > anInt3677)
			arg1 = anInt3677;
		if(arg0 < arg1)
		{
			arg4 = arg5 <<= 16;
			arg7 = arg8 <<= 16;
			if(arg2 < 0)
			{
				arg4 -= i3 * arg2;
				arg5 -= k3 * arg2;
				arg7 -= j3 * arg2;
				arg8 -= l3 * arg2;
				arg2 = 0;
			}
			arg3 <<= 16;
			arg6 <<= 16;
			if(arg0 < 0)
			{
				arg3 -= k2 * arg0;
				arg6 -= l2 * arg0;
				arg0 = 0;
			}
			int i5 = arg2 - anInt3669;
			j += l * i5;
			i1 += k1 * i5;
			l1 += j2 * i5;
			if(i3 < k3)
			{
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 = anIntArray3679[arg2];
				while(--arg0 >= 0) 
				{
					method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, j, i1, l1, k, j1, i2);
					arg4 += i3;
					arg5 += k3;
					arg7 += j3;
					arg8 += l3;
					arg2 += Class33_Sub6_Sub7.anInt2797;
					j += l;
					i1 += k1;
					l1 += j2;
				}
				while(--arg1 >= 0) 
				{
					method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, j, i1, l1, k, j1, i2);
					arg4 += i3;
					arg3 += k2;
					arg7 += j3;
					arg6 += l2;
					arg2 += Class33_Sub6_Sub7.anInt2797;
					j += l;
					i1 += k1;
					l1 += j2;
				}
				return;
			}
			arg1 -= arg0;
			arg0 -= arg2;
			arg2 = anIntArray3679[arg2];
			while(--arg0 >= 0) 
			{
				method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, j, i1, l1, k, j1, i2);
				arg4 += i3;
				arg5 += k3;
				arg7 += j3;
				arg8 += l3;
				arg2 += Class33_Sub6_Sub7.anInt2797;
				j += l;
				i1 += k1;
				l1 += j2;
			}
			while(--arg1 >= 0) 
			{
				method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, j, i1, l1, k, j1, i2);
				arg4 += i3;
				arg3 += k2;
				arg7 += j3;
				arg6 += l2;
				arg2 += Class33_Sub6_Sub7.anInt2797;
				j += l;
				i1 += k1;
				l1 += j2;
			}
			return;
		}
		arg3 = arg5 <<= 16;
		arg6 = arg8 <<= 16;
		if(arg2 < 0)
		{
			arg3 -= i3 * arg2;
			arg5 -= k3 * arg2;
			arg6 -= j3 * arg2;
			arg8 -= l3 * arg2;
			arg2 = 0;
		}
		arg4 <<= 16;
		arg7 <<= 16;
		if(arg1 < 0)
		{
			arg4 -= k2 * arg1;
			arg7 -= l2 * arg1;
			arg1 = 0;
		}
		int j5 = arg2 - anInt3669;
		j += l * j5;
		i1 += k1 * j5;
		l1 += j2 * j5;
		if(i3 < k3)
		{
			arg0 -= arg1;
			arg1 -= arg2;
			arg2 = anIntArray3679[arg2];
			while(--arg1 >= 0) 
			{
				method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, j, i1, l1, k, j1, i2);
				arg3 += i3;
				arg5 += k3;
				arg6 += j3;
				arg8 += l3;
				arg2 += Class33_Sub6_Sub7.anInt2797;
				j += l;
				i1 += k1;
				l1 += j2;
			}
			while(--arg0 >= 0) 
			{
				method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, j, i1, l1, k, j1, i2);
				arg4 += k2;
				arg5 += k3;
				arg7 += l2;
				arg8 += l3;
				arg2 += Class33_Sub6_Sub7.anInt2797;
				j += l;
				i1 += k1;
				l1 += j2;
			}
			return;
		}
		arg0 -= arg1;
		arg1 -= arg2;
		arg2 = anIntArray3679[arg2];
		while(--arg1 >= 0) 
		{
			method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, j, i1, l1, k, j1, i2);
			arg3 += i3;
			arg5 += k3;
			arg6 += j3;
			arg8 += l3;
			arg2 += Class33_Sub6_Sub7.anInt2797;
			j += l;
			i1 += k1;
			l1 += j2;
		}
		while(--arg0 >= 0) 
		{
			method434(Class33_Sub6_Sub7.anIntArray2796, ai, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, j, i1, l1, k, j1, i2);
			arg4 += k2;
			arg5 += k3;
			arg7 += l2;
			arg8 += l3;
			arg2 += Class33_Sub6_Sub7.anInt2797;
			j += l;
			i1 += k1;
			l1 += j2;
		}
	}

	public static int method438(int arg0, int arg1)
	{
		arg1 = (127 - arg1) * (arg0 & 0x7f) >> 7;
		if(arg1 < 2)
			arg1 = 2;
		else
		if(arg1 > 126)
			arg1 = 126;
		return (arg0 & 0xff80) + arg1;
	}

	public static void method439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8)
	{
		int i = 0;
		int j = 0;
		if(arg1 != arg0)
		{
			i = (arg4 - arg3 << 16) / (arg1 - arg0);
			j = (arg7 - arg6 << 15) / (arg1 - arg0);
		}
		int k = 0;
		int l = 0;
		if(arg2 != arg1)
		{
			k = (arg5 - arg4 << 16) / (arg2 - arg1);
			l = (arg8 - arg7 << 15) / (arg2 - arg1);
		}
		int i1 = 0;
		int j1 = 0;
		if(arg2 != arg0)
		{
			i1 = (arg3 - arg5 << 16) / (arg0 - arg2);
			j1 = (arg6 - arg8 << 15) / (arg0 - arg2);
		}
		if(arg0 <= arg1 && arg0 <= arg2)
		{
			if(arg0 >= anInt3677)
				return;
			if(arg1 > anInt3677)
				arg1 = anInt3677;
			if(arg2 > anInt3677)
				arg2 = anInt3677;
			if(arg1 < arg2)
			{
				arg5 = arg3 <<= 16;
				arg8 = arg6 <<= 15;
				if(arg0 < 0)
				{
					arg5 -= i1 * arg0;
					arg3 -= i * arg0;
					arg8 -= j1 * arg0;
					arg6 -= j * arg0;
					arg0 = 0;
				}
				arg4 <<= 16;
				arg7 <<= 15;
				if(arg1 < 0)
				{
					arg4 -= k * arg1;
					arg7 -= l * arg1;
					arg1 = 0;
				}
				if(arg0 != arg1 && i1 < i || arg0 == arg1 && i1 > k)
				{
					arg2 -= arg1;
					arg1 -= arg0;
					for(arg0 = anIntArray3679[arg0]; --arg1 >= 0; arg0 += Class33_Sub6_Sub7.anInt2797)
					{
						method443(Class33_Sub6_Sub7.anIntArray2796, arg0, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
						arg5 += i1;
						arg3 += i;
						arg8 += j1;
						arg6 += j;
					}

					while(--arg2 >= 0) 
					{
						method443(Class33_Sub6_Sub7.anIntArray2796, arg0, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg5 += i1;
						arg4 += k;
						arg8 += j1;
						arg7 += l;
						arg0 += Class33_Sub6_Sub7.anInt2797;
					}
					return;
				}
				arg2 -= arg1;
				arg1 -= arg0;
				for(arg0 = anIntArray3679[arg0]; --arg1 >= 0; arg0 += Class33_Sub6_Sub7.anInt2797)
				{
					method443(Class33_Sub6_Sub7.anIntArray2796, arg0, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
					arg5 += i1;
					arg3 += i;
					arg8 += j1;
					arg6 += j;
				}

				while(--arg2 >= 0) 
				{
					method443(Class33_Sub6_Sub7.anIntArray2796, arg0, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
					arg5 += i1;
					arg4 += k;
					arg8 += j1;
					arg7 += l;
					arg0 += Class33_Sub6_Sub7.anInt2797;
				}
				return;
			}
			arg4 = arg3 <<= 16;
			arg7 = arg6 <<= 15;
			if(arg0 < 0)
			{
				arg4 -= i1 * arg0;
				arg3 -= i * arg0;
				arg7 -= j1 * arg0;
				arg6 -= j * arg0;
				arg0 = 0;
			}
			arg5 <<= 16;
			arg8 <<= 15;
			if(arg2 < 0)
			{
				arg5 -= k * arg2;
				arg8 -= l * arg2;
				arg2 = 0;
			}
			if(arg0 != arg2 && i1 < i || arg0 == arg2 && k > i)
			{
				arg1 -= arg2;
				arg2 -= arg0;
				for(arg0 = anIntArray3679[arg0]; --arg2 >= 0; arg0 += Class33_Sub6_Sub7.anInt2797)
				{
					method443(Class33_Sub6_Sub7.anIntArray2796, arg0, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
					arg4 += i1;
					arg3 += i;
					arg7 += j1;
					arg6 += j;
				}

				while(--arg1 >= 0) 
				{
					method443(Class33_Sub6_Sub7.anIntArray2796, arg0, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
					arg5 += k;
					arg3 += i;
					arg8 += l;
					arg6 += j;
					arg0 += Class33_Sub6_Sub7.anInt2797;
				}
				return;
			}
			arg1 -= arg2;
			arg2 -= arg0;
			for(arg0 = anIntArray3679[arg0]; --arg2 >= 0; arg0 += Class33_Sub6_Sub7.anInt2797)
			{
				method443(Class33_Sub6_Sub7.anIntArray2796, arg0, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
				arg4 += i1;
				arg3 += i;
				arg7 += j1;
				arg6 += j;
			}

			while(--arg1 >= 0) 
			{
				method443(Class33_Sub6_Sub7.anIntArray2796, arg0, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
				arg5 += k;
				arg3 += i;
				arg8 += l;
				arg6 += j;
				arg0 += Class33_Sub6_Sub7.anInt2797;
			}
			return;
		}
		if(arg1 <= arg2)
		{
			if(arg1 >= anInt3677)
				return;
			if(arg2 > anInt3677)
				arg2 = anInt3677;
			if(arg0 > anInt3677)
				arg0 = anInt3677;
			if(arg2 < arg0)
			{
				arg3 = arg4 <<= 16;
				arg6 = arg7 <<= 15;
				if(arg1 < 0)
				{
					arg3 -= i * arg1;
					arg4 -= k * arg1;
					arg6 -= j * arg1;
					arg7 -= l * arg1;
					arg1 = 0;
				}
				arg5 <<= 16;
				arg8 <<= 15;
				if(arg2 < 0)
				{
					arg5 -= i1 * arg2;
					arg8 -= j1 * arg2;
					arg2 = 0;
				}
				if(arg1 != arg2 && i < k || arg1 == arg2 && i > i1)
				{
					arg0 -= arg2;
					arg2 -= arg1;
					for(arg1 = anIntArray3679[arg1]; --arg2 >= 0; arg1 += Class33_Sub6_Sub7.anInt2797)
					{
						method443(Class33_Sub6_Sub7.anIntArray2796, arg1, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
						arg3 += i;
						arg4 += k;
						arg6 += j;
						arg7 += l;
					}

					while(--arg0 >= 0) 
					{
						method443(Class33_Sub6_Sub7.anIntArray2796, arg1, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
						arg3 += i;
						arg5 += i1;
						arg6 += j;
						arg8 += j1;
						arg1 += Class33_Sub6_Sub7.anInt2797;
					}
					return;
				}
				arg0 -= arg2;
				arg2 -= arg1;
				for(arg1 = anIntArray3679[arg1]; --arg2 >= 0; arg1 += Class33_Sub6_Sub7.anInt2797)
				{
					method443(Class33_Sub6_Sub7.anIntArray2796, arg1, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
					arg3 += i;
					arg4 += k;
					arg6 += j;
					arg7 += l;
				}

				while(--arg0 >= 0) 
				{
					method443(Class33_Sub6_Sub7.anIntArray2796, arg1, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
					arg3 += i;
					arg5 += i1;
					arg6 += j;
					arg8 += j1;
					arg1 += Class33_Sub6_Sub7.anInt2797;
				}
				return;
			}
			arg5 = arg4 <<= 16;
			arg8 = arg7 <<= 15;
			if(arg1 < 0)
			{
				arg5 -= i * arg1;
				arg4 -= k * arg1;
				arg8 -= j * arg1;
				arg7 -= l * arg1;
				arg1 = 0;
			}
			arg3 <<= 16;
			arg6 <<= 15;
			if(arg0 < 0)
			{
				arg3 -= i1 * arg0;
				arg6 -= j1 * arg0;
				arg0 = 0;
			}
			if(i < k)
			{
				arg2 -= arg0;
				arg0 -= arg1;
				for(arg1 = anIntArray3679[arg1]; --arg0 >= 0; arg1 += Class33_Sub6_Sub7.anInt2797)
				{
					method443(Class33_Sub6_Sub7.anIntArray2796, arg1, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
					arg5 += i;
					arg4 += k;
					arg8 += j;
					arg7 += l;
				}

				while(--arg2 >= 0) 
				{
					method443(Class33_Sub6_Sub7.anIntArray2796, arg1, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
					arg3 += i1;
					arg4 += k;
					arg6 += j1;
					arg7 += l;
					arg1 += Class33_Sub6_Sub7.anInt2797;
				}
				return;
			}
			arg2 -= arg0;
			arg0 -= arg1;
			for(arg1 = anIntArray3679[arg1]; --arg0 >= 0; arg1 += Class33_Sub6_Sub7.anInt2797)
			{
				method443(Class33_Sub6_Sub7.anIntArray2796, arg1, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
				arg5 += i;
				arg4 += k;
				arg8 += j;
				arg7 += l;
			}

			while(--arg2 >= 0) 
			{
				method443(Class33_Sub6_Sub7.anIntArray2796, arg1, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
				arg3 += i1;
				arg4 += k;
				arg6 += j1;
				arg7 += l;
				arg1 += Class33_Sub6_Sub7.anInt2797;
			}
			return;
		}
		if(arg2 >= anInt3677)
			return;
		if(arg0 > anInt3677)
			arg0 = anInt3677;
		if(arg1 > anInt3677)
			arg1 = anInt3677;
		if(arg0 < arg1)
		{
			arg4 = arg5 <<= 16;
			arg7 = arg8 <<= 15;
			if(arg2 < 0)
			{
				arg4 -= k * arg2;
				arg5 -= i1 * arg2;
				arg7 -= l * arg2;
				arg8 -= j1 * arg2;
				arg2 = 0;
			}
			arg3 <<= 16;
			arg6 <<= 15;
			if(arg0 < 0)
			{
				arg3 -= i * arg0;
				arg6 -= j * arg0;
				arg0 = 0;
			}
			if(k < i1)
			{
				arg1 -= arg0;
				arg0 -= arg2;
				for(arg2 = anIntArray3679[arg2]; --arg0 >= 0; arg2 += Class33_Sub6_Sub7.anInt2797)
				{
					method443(Class33_Sub6_Sub7.anIntArray2796, arg2, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
					arg4 += k;
					arg5 += i1;
					arg7 += l;
					arg8 += j1;
				}

				while(--arg1 >= 0) 
				{
					method443(Class33_Sub6_Sub7.anIntArray2796, arg2, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
					arg4 += k;
					arg3 += i;
					arg7 += l;
					arg6 += j;
					arg2 += Class33_Sub6_Sub7.anInt2797;
				}
				return;
			}
			arg1 -= arg0;
			arg0 -= arg2;
			for(arg2 = anIntArray3679[arg2]; --arg0 >= 0; arg2 += Class33_Sub6_Sub7.anInt2797)
			{
				method443(Class33_Sub6_Sub7.anIntArray2796, arg2, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
				arg4 += k;
				arg5 += i1;
				arg7 += l;
				arg8 += j1;
			}

			while(--arg1 >= 0) 
			{
				method443(Class33_Sub6_Sub7.anIntArray2796, arg2, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
				arg4 += k;
				arg3 += i;
				arg7 += l;
				arg6 += j;
				arg2 += Class33_Sub6_Sub7.anInt2797;
			}
			return;
		}
		arg3 = arg5 <<= 16;
		arg6 = arg8 <<= 15;
		if(arg2 < 0)
		{
			arg3 -= k * arg2;
			arg5 -= i1 * arg2;
			arg6 -= l * arg2;
			arg8 -= j1 * arg2;
			arg2 = 0;
		}
		arg4 <<= 16;
		arg7 <<= 15;
		if(arg1 < 0)
		{
			arg4 -= i * arg1;
			arg7 -= j * arg1;
			arg1 = 0;
		}
		if(k < i1)
		{
			arg0 -= arg1;
			arg1 -= arg2;
			for(arg2 = anIntArray3679[arg2]; --arg1 >= 0; arg2 += Class33_Sub6_Sub7.anInt2797)
			{
				method443(Class33_Sub6_Sub7.anIntArray2796, arg2, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
				arg3 += k;
				arg5 += i1;
				arg6 += l;
				arg8 += j1;
			}

			while(--arg0 >= 0) 
			{
				method443(Class33_Sub6_Sub7.anIntArray2796, arg2, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
				arg4 += i;
				arg5 += i1;
				arg7 += j;
				arg8 += j1;
				arg2 += Class33_Sub6_Sub7.anInt2797;
			}
			return;
		}
		arg0 -= arg1;
		arg1 -= arg2;
		for(arg2 = anIntArray3679[arg2]; --arg1 >= 0; arg2 += Class33_Sub6_Sub7.anInt2797)
		{
			method443(Class33_Sub6_Sub7.anIntArray2796, arg2, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
			arg3 += k;
			arg5 += i1;
			arg6 += l;
			arg8 += j1;
		}

		while(--arg0 >= 0) 
		{
			method443(Class33_Sub6_Sub7.anIntArray2796, arg2, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
			arg4 += i;
			arg5 += i1;
			arg7 += j;
			arg8 += j1;
			arg2 += Class33_Sub6_Sub7.anInt2797;
		}
	}

	public static void method440(int arg0, int arg1, int arg2, int arg3)
	{
		anInt3675 = arg2 - arg0;
		anInt3677 = arg3 - arg1;
		method430();
		if(anIntArray3679.length < anInt3677)
			anIntArray3679 = new int[Class38.method872(anInt3677, false)];
		int i = arg1 * Class33_Sub6_Sub7.anInt2797 + arg0;
		for(int j = 0; j < anInt3677; j++)
		{
			anIntArray3679[j] = i;
			i += Class33_Sub6_Sub7.anInt2797;
		}

	}

	public static void method441(int arg0, int arg1, int arg2)
	{
		aBoolean3664 = arg0 < 0 || arg0 > anInt3675 || arg1 < 0 || arg1 > anInt3675 || arg2 < 0 || arg2 > anInt3675;
	}

	public static void method442(Interface1 arg0)
	{
		anInterface1_3680 = arg0;
	}

	public static void method443(int arg0[], int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7)
	{
		if(aBoolean3676)
		{
			int i;
			if(aBoolean3664)
			{
				if(arg5 - arg4 > 3)
					i = (arg7 - arg6) / (arg5 - arg4);
				else
					i = 0;
				if(arg5 > anInt3675)
					arg5 = anInt3675;
				if(arg4 < 0)
				{
					arg6 -= arg4 * i;
					arg4 = 0;
				}
				if(arg4 >= arg5)
					return;
				arg1 += arg4;
				arg3 = arg5 - arg4 >> 2;
				i <<= 2;
			} else
			{
				if(arg4 >= arg5)
					return;
				arg1 += arg4;
				arg3 = arg5 - arg4 >> 2;
				if(arg3 > 0)
					i = (arg7 - arg6) * anIntArray3671[arg3] >> 15;
				else
					i = 0;
			}
			if(anInt3673 == 0)
			{
				while(--arg3 >= 0) 
				{
					arg2 = anIntArray3682[arg6 >> 8];
					arg6 += i;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
				}
				arg3 = arg5 - arg4 & 3;
				if(arg3 > 0)
				{
					arg2 = anIntArray3682[arg6 >> 8];
					do
						arg0[arg1++] = arg2;
					while(--arg3 > 0);
					return;
				}
			} else
			{
				int k = anInt3673;
				int i1 = 256 - anInt3673;
				while(--arg3 >= 0) 
				{
					arg2 = anIntArray3682[arg6 >> 8];
					arg6 += i;
					arg2 = ((arg2 & 0xff00ff) * i1 >> 8 & 0xff00ff) + ((arg2 & 0xff00) * i1 >> 8 & 0xff00);
					arg0[arg1++] = arg2 + ((arg0[arg1] & 0xff00ff) * k >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00) * k >> 8 & 0xff00);
					arg0[arg1++] = arg2 + ((arg0[arg1] & 0xff00ff) * k >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00) * k >> 8 & 0xff00);
					arg0[arg1++] = arg2 + ((arg0[arg1] & 0xff00ff) * k >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00) * k >> 8 & 0xff00);
					arg0[arg1++] = arg2 + ((arg0[arg1] & 0xff00ff) * k >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00) * k >> 8 & 0xff00);
				}
				arg3 = arg5 - arg4 & 3;
				if(arg3 > 0)
				{
					arg2 = anIntArray3682[arg6 >> 8];
					arg2 = ((arg2 & 0xff00ff) * i1 >> 8 & 0xff00ff) + ((arg2 & 0xff00) * i1 >> 8 & 0xff00);
					do
						arg0[arg1++] = arg2 + ((arg0[arg1] & 0xff00ff) * k >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00) * k >> 8 & 0xff00);
					while(--arg3 > 0);
				}
			}
			return;
		}
		if(arg4 >= arg5)
			return;
		int j = (arg7 - arg6) / (arg5 - arg4);
		if(aBoolean3664)
		{
			if(arg5 > anInt3675)
				arg5 = anInt3675;
			if(arg4 < 0)
			{
				arg6 -= arg4 * j;
				arg4 = 0;
			}
			if(arg4 >= arg5)
				return;
		}
		arg1 += arg4;
		arg3 = arg5 - arg4;
		if(anInt3673 == 0)
		{
			do
			{
				arg0[arg1++] = anIntArray3682[arg6 >> 8];
				arg6 += j;
			} while(--arg3 > 0);
			return;
		}
		int l = anInt3673;
		int j1 = 256 - anInt3673;
		do
		{
			arg2 = anIntArray3682[arg6 >> 8];
			arg6 += j;
			arg2 = ((arg2 & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((arg2 & 0xff00) * j1 >> 8 & 0xff00);
			arg0[arg1++] = arg2 + ((arg0[arg1] & 0xff00ff) * l >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00) * l >> 8 & 0xff00);
		} while(--arg3 > 0);
	}

	public static void method444(int arg0[], int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		if(aBoolean3664)
		{
			if(arg5 > anInt3675)
				arg5 = anInt3675;
			if(arg4 < 0)
				arg4 = 0;
		}
		if(arg4 >= arg5)
			return;
		arg1 += arg4;
		arg3 = arg5 - arg4 >> 2;
		if(anInt3673 == 0)
		{
			while(--arg3 >= 0) 
			{
				arg0[arg1++] = arg2;
				arg0[arg1++] = arg2;
				arg0[arg1++] = arg2;
				arg0[arg1++] = arg2;
			}
			for(arg3 = arg5 - arg4 & 3; --arg3 >= 0;)
				arg0[arg1++] = arg2;

			return;
		}
		int i = anInt3673;
		int j = 256 - anInt3673;
		arg2 = ((arg2 & 0xff00ff) * j >> 8 & 0xff00ff) + ((arg2 & 0xff00) * j >> 8 & 0xff00);
		while(--arg3 >= 0) 
		{
			arg0[arg1++] = arg2 + ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00) * i >> 8 & 0xff00);
			arg0[arg1++] = arg2 + ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00) * i >> 8 & 0xff00);
			arg0[arg1++] = arg2 + ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00) * i >> 8 & 0xff00);
			arg0[arg1++] = arg2 + ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00) * i >> 8 & 0xff00);
		}
		for(arg3 = arg5 - arg4 & 3; --arg3 >= 0;)
			arg0[arg1++] = arg2 + ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00) * i >> 8 & 0xff00);

	}

	public static void method445(double arg0, int arg1, int arg2)
	{
		arg0 += Math.random() * 0.029999999999999999D - 0.014999999999999999D;
		int i = arg1 * 128;
		for(int j = arg1; j < arg2; j++)
		{
			double d = (double)(j >> 3) / 64D + 0.0078125D;
			double d1 = (double)(j & 7) / 8D + 0.0625D;
			for(int k = 0; k < 128; k++)
			{
				double d2 = (double)k / 128D;
				double d3 = d2;
				double d4 = d2;
				double d5 = d2;
				if(d1 != 0.0D)
				{
					double d6;
					if(d2 < 0.5D)
						d6 = d2 * (1.0D + d1);
					else
						d6 = (d2 + d1) - d2 * d1;
					double d7 = 2D * d2 - d6;
					double d8 = d + 0.33333333333333331D;
					if(d8 > 1.0D)
						d8--;
					double d9 = d;
					double d10 = d - 0.33333333333333331D;
					if(d10 < 0.0D)
						d10++;
					if(6D * d8 < 1.0D)
						d3 = d7 + (d6 - d7) * 6D * d8;
					else
					if(2D * d8 < 1.0D)
						d3 = d6;
					else
					if(3D * d8 < 2D)
						d3 = d7 + (d6 - d7) * (0.66666666666666663D - d8) * 6D;
					else
						d3 = d7;
					if(6D * d9 < 1.0D)
						d4 = d7 + (d6 - d7) * 6D * d9;
					else
					if(2D * d9 < 1.0D)
						d4 = d6;
					else
					if(3D * d9 < 2D)
						d4 = d7 + (d6 - d7) * (0.66666666666666663D - d9) * 6D;
					else
						d4 = d7;
					if(6D * d10 < 1.0D)
						d5 = d7 + (d6 - d7) * 6D * d10;
					else
					if(2D * d10 < 1.0D)
						d5 = d6;
					else
					if(3D * d10 < 2D)
						d5 = d7 + (d6 - d7) * (0.66666666666666663D - d10) * 6D;
					else
						d5 = d7;
				}
				int l = (int)(d3 * 256D);
				int i1 = (int)(d4 * 256D);
				int j1 = (int)(d5 * 256D);
				int k1 = (l << 16) + (i1 << 8) + j1;
				k1 = method446(k1, arg0);
				if(k1 == 0)
					k1 = 1;
				anIntArray3682[i++] = k1;
			}

		}

	}

	public static int method446(int arg0, double arg1)
	{
		double d = (double)(arg0 >> 16) / 256D;
		double d1 = (double)(arg0 >> 8 & 0xff) / 256D;
		double d2 = (double)(arg0 & 0xff) / 256D;
		d = Math.pow(d, arg1);
		d1 = Math.pow(d1, arg1);
		d2 = Math.pow(d2, arg1);
		int i = (int)(d * 256D);
		int j = (int)(d1 * 256D);
		int k = (int)(d2 * 256D);
		return (i << 16) + (j << 8) + k;
	}

	public static boolean aBoolean3664 = false;
	public static int anInt3665;
	public static int anInt3666;
	public static int anInt3667;
	public static boolean aBoolean3668 = false;
	public static int anInt3669;
	public static int anIntArray3670[];
	public static int anIntArray3671[];
	public static boolean aBoolean3672 = false;
	public static int anInt3673 = 0;
	public static int anInt3674;
	public static int anInt3675;
	public static boolean aBoolean3676 = true;
	public static int anInt3677;
	public static int anIntArray3678[];
	public static int anIntArray3679[] = new int[1024];
	public static Interface1 anInterface1_3680;
	public static int anIntArray3681[];
	public static int anIntArray3682[] = new int[0x10000];
	public static int anInt3683;

	static 
	{
		anIntArray3671 = new int[512];
		anIntArray3670 = new int[2048];
		anIntArray3678 = new int[2048];
		anIntArray3681 = new int[2048];
		for(int i = 1; i < 512; i++)
			anIntArray3671[i] = 32768 / i;

		for(int j = 1; j < 2048; j++)
			anIntArray3670[j] = 0x10000 / j;

		for(int k = 0; k < 2048; k++)
		{
			anIntArray3681[k] = (int)(65536D * Math.sin((double)k * 0.0030679614999999999D));
			anIntArray3678[k] = (int)(65536D * Math.cos((double)k * 0.0030679614999999999D));
		}

	}
}
