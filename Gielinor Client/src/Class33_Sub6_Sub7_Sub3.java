// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub7_Sub3.java

import java.awt.*;
import java.awt.image.PixelGrabber;

public class Class33_Sub6_Sub7_Sub3 extends Class33_Sub6_Sub7
{

	public void method471()
	{
		if(anInt3723 == anInt3728 && anInt3727 == anInt3726)
			return;
		int ai[] = new int[anInt3728 * anInt3726];
		for(int i = 0; i < anInt3727; i++)
		{
			for(int j = 0; j < anInt3723; j++)
				ai[(i + anInt3724) * anInt3728 + (j + anInt3725)] = anIntArray3722[i * anInt3723 + j];

		}

		anIntArray3722 = ai;
		anInt3723 = anInt3728;
		anInt3727 = anInt3726;
		anInt3725 = 0;
		anInt3724 = 0;
	}

	public void method472()
	{
		int ai[] = new int[anInt3723 * anInt3727];
		int i = 0;
		for(int j = 0; j < anInt3727; j++)
		{
			for(int k = anInt3723 - 1; k >= 0; k--)
				ai[i++] = anIntArray3722[k + j * anInt3723];

		}

		anIntArray3722 = ai;
		anInt3725 = anInt3728 - anInt3723 - anInt3725;
	}

	public void method473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7)
	{
		try
		{
			int i = -arg2 / 2;
			int j = -arg3 / 2;
			int k = (int)(Math.sin(arg6) * 65536D);
			int l = (int)(Math.cos(arg6) * 65536D);
			k = k * arg7 >> 8;
			l = l * arg7 >> 8;
			int i1 = (arg4 << 16) + (j * k + i * l);
			int j1 = (arg5 << 16) + (j * l - i * k);
			int k1 = arg0 + arg1 * Class33_Sub6_Sub7.anInt2797;
			for(arg1 = 0; arg1 < arg3; arg1++)
			{
				int l1 = k1;
				int i2 = i1;
				int j2 = j1;
				for(arg0 = -arg2; arg0 < 0; arg0++)
				{
					int k2 = anIntArray3722[(i2 >> 16) + (j2 >> 16) * anInt3723];
					if(k2 != 0)
						Class33_Sub6_Sub7.anIntArray2796[l1++] = k2;
					else
						l1++;
					i2 += l;
					j2 -= k;
				}

				i1 += k;
				j1 += l;
				k1 += Class33_Sub6_Sub7.anInt2797;
			}

			return;
		}
		catch(Exception _ex)
		{
			return;
		}
	}

	public void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7, int arg8[], int arg9[])
	{
		try
		{
			int i = -arg2 / 2;
			int j = -arg3 / 2;
			int k = (int)(Math.sin((double)arg6 / 326.11000000000001D) * 65536D);
			int l = (int)(Math.cos((double)arg6 / 326.11000000000001D) * 65536D);
			k = k * arg7 >> 8;
			l = l * arg7 >> 8;
			int i1 = (arg4 << 16) + (j * k + i * l);
			int j1 = (arg5 << 16) + (j * l - i * k);
			int k1 = arg0 + arg1 * Class33_Sub6_Sub7.anInt2797;
			for(arg1 = 0; arg1 < arg3; arg1++)
			{
				int l1 = arg8[arg1];
				int i2 = k1 + l1;
				int j2 = i1 + l * l1;
				int k2 = j1 - k * l1;
				for(arg0 = -arg9[arg1]; arg0 < 0; arg0++)
				{
					Class33_Sub6_Sub7.anIntArray2796[i2++] = anIntArray3722[(j2 >> 16) + (k2 >> 16) * anInt3723];
					j2 += l;
					k2 -= k;
				}

				i1 += k;
				j1 += l;
				k1 += Class33_Sub6_Sub7.anInt2797;
			}

			return;
		}
		catch(Exception _ex)
		{
			return;
		}
	}

	public void method475(int arg0, int arg1, int arg2)
	{
		for(int i = 0; i < anIntArray3722.length; i++)
		{
			int j = anIntArray3722[i];
			if(j != 0)
			{
				int k = j >> 16 & 0xff;
				k += arg0;
				if(k < 1)
					k = 1;
				else
				if(k > 255)
					k = 255;
				int l = j >> 8 & 0xff;
				l += arg1;
				if(l < 1)
					l = 1;
				else
				if(l > 255)
					l = 255;
				int i1 = j & 0xff;
				i1 += arg2;
				if(i1 < 1)
					i1 = 1;
				else
				if(i1 > 255)
					i1 = 255;
				anIntArray3722[i] = (k << 16) + (l << 8) + i1;
			}
		}

	}

	public void method476()
	{
		int ai[] = new int[anInt3723 * anInt3727];
		int i = 0;
		for(int j = anInt3727 - 1; j >= 0; j--)
		{
			for(int k = 0; k < anInt3723; k++)
				ai[i++] = anIntArray3722[k + j * anInt3723];

		}

		anIntArray3722 = ai;
		anInt3724 = anInt3726 - anInt3727 - anInt3724;
	}

	public static void method477(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8)
	{
		int i = -(arg5 >> 2);
		arg5 = -(arg5 & 3);
		for(int j = -arg6; j < 0; j++)
		{
			for(int k = i; k < 0; k++)
			{
				arg2 = arg1[arg3++];
				if(arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if(arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if(arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if(arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}

			for(int l = arg5; l < 0; l++)
			{
				arg2 = arg1[arg3++];
				if(arg2 != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}

			arg4 += arg7;
			arg3 += arg8;
		}

	}

	public void method478(int arg0, int arg1)
	{
		arg0 += anInt3725;
		arg1 += anInt3724;
		int i = arg0 + arg1 * Class33_Sub6_Sub7.anInt2797;
		int j = 0;
		int k = anInt3727;
		int l = anInt3723;
		int i1 = Class33_Sub6_Sub7.anInt2797 - l;
		int j1 = 0;
		if(arg1 < Class33_Sub6_Sub7.anInt2794)
		{
			int k1 = Class33_Sub6_Sub7.anInt2794 - arg1;
			k -= k1;
			arg1 = Class33_Sub6_Sub7.anInt2794;
			j += k1 * l;
			i += k1 * Class33_Sub6_Sub7.anInt2797;
		}
		if(arg1 + k > Class33_Sub6_Sub7.anInt2793)
			k -= (arg1 + k) - Class33_Sub6_Sub7.anInt2793;
		if(arg0 < Class33_Sub6_Sub7.anInt2798)
		{
			int l1 = Class33_Sub6_Sub7.anInt2798 - arg0;
			l -= l1;
			arg0 = Class33_Sub6_Sub7.anInt2798;
			j += l1;
			i += l1;
			j1 += l1;
			i1 += l1;
		}
		if(arg0 + l > Class33_Sub6_Sub7.anInt2799)
		{
			int i2 = (arg0 + l) - Class33_Sub6_Sub7.anInt2799;
			l -= i2;
			j1 += i2;
			i1 += i2;
		}
		if(l <= 0 || k <= 0)
		{
			return;
		} else
		{
			method477(Class33_Sub6_Sub7.anIntArray2796, anIntArray3722, 0, j, i, l, k, i1, j1);
			return;
		}
	}

	public void method479(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		if(arg2 <= 0 || arg3 <= 0)
			return;
		int i = anInt3723;
		int j = anInt3727;
		int k = 0;
		int l = 0;
		int i1 = anInt3728;
		int j1 = anInt3726;
		int k1 = (i1 << 16) / arg2;
		int l1 = (j1 << 16) / arg3;
		if(anInt3725 > 0)
		{
			int i2 = (((anInt3725 << 16) + k1) - 1) / k1;
			arg0 += i2;
			k += i2 * k1 - (anInt3725 << 16);
		}
		if(anInt3724 > 0)
		{
			int j2 = (((anInt3724 << 16) + l1) - 1) / l1;
			arg1 += j2;
			l += j2 * l1 - (anInt3724 << 16);
		}
		if(i < i1)
			arg2 = ((((i << 16) - k) + k1) - 1) / k1;
		if(j < j1)
			arg3 = ((((j << 16) - l) + l1) - 1) / l1;
		int k2 = arg0 + arg1 * Class33_Sub6_Sub7.anInt2797;
		int l2 = Class33_Sub6_Sub7.anInt2797 - arg2;
		if(arg1 + arg3 > Class33_Sub6_Sub7.anInt2793)
			arg3 -= (arg1 + arg3) - Class33_Sub6_Sub7.anInt2793;
		if(arg1 < Class33_Sub6_Sub7.anInt2794)
		{
			int i3 = Class33_Sub6_Sub7.anInt2794 - arg1;
			arg3 -= i3;
			k2 += i3 * Class33_Sub6_Sub7.anInt2797;
			l += l1 * i3;
		}
		if(arg0 + arg2 > Class33_Sub6_Sub7.anInt2799)
		{
			int j3 = (arg0 + arg2) - Class33_Sub6_Sub7.anInt2799;
			arg2 -= j3;
			l2 += j3;
		}
		if(arg0 < Class33_Sub6_Sub7.anInt2798)
		{
			int k3 = Class33_Sub6_Sub7.anInt2798 - arg0;
			arg2 -= k3;
			k2 += k3;
			k += k1 * k3;
			l2 += k3;
		}
		method483(Class33_Sub6_Sub7.anIntArray2796, anIntArray3722, 0, k, l, k2, l2, arg2, arg3, k1, l1, i, arg4);
	}

	public void method480(int arg0)
	{
		for(int i = anInt3727 - 1; i > 0; i--)
		{
			int j = i * anInt3723;
			for(int k = anInt3723 - 1; k > 0; k--)
				if(anIntArray3722[k + j] == 0 && anIntArray3722[(k + j) - 1 - anInt3723] != 0)
					anIntArray3722[k + j] = arg0;

		}

	}

	public void method481(Class33_Sub6_Sub7_Sub4 arg0, int arg1, int arg2)
	{
		arg1 += anInt3725;
		arg2 += anInt3724;
		int i = arg1 + arg2 * Class33_Sub6_Sub7.anInt2797;
		int j = 0;
		int k = anInt3727;
		int l = anInt3723;
		int i1 = Class33_Sub6_Sub7.anInt2797 - l;
		int j1 = 0;
		if(arg2 < Class33_Sub6_Sub7.anInt2794)
		{
			int k1 = Class33_Sub6_Sub7.anInt2794 - arg2;
			k -= k1;
			arg2 = Class33_Sub6_Sub7.anInt2794;
			j += k1 * l;
			i += k1 * Class33_Sub6_Sub7.anInt2797;
		}
		if(arg2 + k > Class33_Sub6_Sub7.anInt2793)
			k -= (arg2 + k) - Class33_Sub6_Sub7.anInt2793;
		if(arg1 < Class33_Sub6_Sub7.anInt2798)
		{
			int l1 = Class33_Sub6_Sub7.anInt2798 - arg1;
			l -= l1;
			arg1 = Class33_Sub6_Sub7.anInt2798;
			j += l1;
			i += l1;
			j1 += l1;
			i1 += l1;
		}
		if(arg1 + l > Class33_Sub6_Sub7.anInt2799)
		{
			int i2 = (arg1 + l) - Class33_Sub6_Sub7.anInt2799;
			l -= i2;
			j1 += i2;
			i1 += i2;
		}
		if(l <= 0 || k <= 0)
		{
			return;
		} else
		{
			method492(Class33_Sub6_Sub7.anIntArray2796, anIntArray3722, 0, j, i, l, k, i1, j1, arg0.aByteArray3732);
			return;
		}
	}

	public static void method482(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7)
	{
		for(int i = -arg5; i < 0; i++)
		{
			int j;
			for(j = (arg3 + arg4) - 3; arg3 < j;)
			{
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
			}

			for(j += 3; arg3 < j;)
				arg0[arg3++] = arg1[arg2++];

			arg3 += arg6;
			arg2 += arg7;
		}

	}

	public static void method483(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, int arg11, int arg12)
	{
		int i = 256 - arg12;
		int j = arg3;
		for(int k = -arg8; k < 0; k++)
		{
			int l = (arg4 >> 16) * arg11;
			for(int i1 = -arg7; i1 < 0; i1++)
			{
				arg2 = arg1[(arg3 >> 16) + l];
				if(arg2 != 0)
				{
					int j1 = arg0[arg5];
					arg0[arg5++] = ((arg2 & 0xff00ff) * arg12 + (j1 & 0xff00ff) * i & 0xff00ff00) + ((arg2 & 0xff00) * arg12 + (j1 & 0xff00) * i & 0xff0000) >> 8;
				} else
				{
					arg5++;
				}
				arg3 += arg9;
			}

			arg4 += arg10;
			arg3 = j;
			arg5 += arg6;
		}

	}

	public Class33_Sub6_Sub7_Sub3 method484()
	{
		Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3 = new Class33_Sub6_Sub7_Sub3(anInt3723, anInt3727);
		class33_sub6_sub7_sub3.anInt3728 = anInt3728;
		class33_sub6_sub7_sub3.anInt3726 = anInt3726;
		class33_sub6_sub7_sub3.anInt3725 = anInt3728 - anInt3723 - anInt3725;
		class33_sub6_sub7_sub3.anInt3724 = anInt3724;
		for(int i = 0; i < anInt3727; i++)
		{
			for(int j = 0; j < anInt3723; j++)
				class33_sub6_sub7_sub3.anIntArray3722[i * anInt3723 + j] = anIntArray3722[(i * anInt3723 + anInt3723) - 1 - j];

		}

		return class33_sub6_sub7_sub3;
	}

	public static void method485(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9)
	{
		int i = 256 - arg9;
		for(int j = -arg6; j < 0; j++)
		{
			for(int k = -arg5; k < 0; k++)
			{
				arg2 = arg1[arg3++];
				if(arg2 != 0)
				{
					int l = arg0[arg4];
					arg0[arg4++] = ((arg2 & 0xff00ff) * arg9 + (l & 0xff00ff) * i & 0xff00ff00) + ((arg2 & 0xff00) * arg9 + (l & 0xff00) * i & 0xff0000) >> 8;
				} else
				{
					arg4++;
				}
			}

			arg4 += arg7;
			arg3 += arg8;
		}

	}

	public void method486(int arg0, int arg1, int arg2, int arg3)
	{
		if(arg2 == 256)
		{
			method478(arg0, arg1);
			return;
		}
		arg0 += anInt3725;
		arg1 += anInt3724;
		int i = arg0 + arg1 * Class33_Sub6_Sub7.anInt2797;
		int j = 0;
		int k = anInt3727;
		int l = anInt3723;
		int i1 = Class33_Sub6_Sub7.anInt2797 - l;
		int j1 = 0;
		if(arg1 < Class33_Sub6_Sub7.anInt2794)
		{
			int k1 = Class33_Sub6_Sub7.anInt2794 - arg1;
			k -= k1;
			arg1 = Class33_Sub6_Sub7.anInt2794;
			j += k1 * l;
			i += k1 * Class33_Sub6_Sub7.anInt2797;
		}
		if(arg1 + k > Class33_Sub6_Sub7.anInt2793)
			k -= (arg1 + k) - Class33_Sub6_Sub7.anInt2793;
		if(arg0 < Class33_Sub6_Sub7.anInt2798)
		{
			int l1 = Class33_Sub6_Sub7.anInt2798 - arg0;
			l -= l1;
			arg0 = Class33_Sub6_Sub7.anInt2798;
			j += l1;
			i += l1;
			j1 += l1;
			i1 += l1;
		}
		if(arg0 + l > Class33_Sub6_Sub7.anInt2799)
		{
			int i2 = (arg0 + l) - Class33_Sub6_Sub7.anInt2799;
			l -= i2;
			j1 += i2;
			i1 += i2;
		}
		if(l <= 0 || k <= 0)
		{
			return;
		} else
		{
			method495(Class33_Sub6_Sub7.anIntArray2796, anIntArray3722, 0, j, i, l, k, i1, j1, arg2, arg3);
			return;
		}
	}

	public static void method487(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10, int arg11)
	{
		int i = arg3;
		for(int j = -arg8; j < 0; j++)
		{
			int k = (arg4 >> 16) * arg11;
			for(int l = -arg7; l < 0; l++)
			{
				arg2 = arg1[(arg3 >> 16) + k];
				if(arg2 != 0)
					arg0[arg5++] = arg2;
				else
					arg5++;
				arg3 += arg9;
			}

			arg4 += arg10;
			arg3 = i;
			arg5 += arg6;
		}

	}

	public void method488(int arg0, int arg1, int arg2, int arg3)
	{
		method491(anInt3728 << 3, anInt3726 << 3, arg0 << 4, arg1 << 4, arg2, arg3);
	}

	public void method489(int arg0)
	{
		if(anInt3723 == anInt3728 && anInt3727 == anInt3726)
			return;
		int i = arg0;
		if(i > anInt3725)
			i = anInt3725;
		int j = arg0;
		if(j + anInt3725 + anInt3723 > anInt3728)
			j = anInt3728 - anInt3725 - anInt3723;
		int k = arg0;
		if(k > anInt3724)
			k = anInt3724;
		int l = arg0;
		if(l + anInt3724 + anInt3727 > anInt3726)
			l = anInt3726 - anInt3724 - anInt3727;
		int i1 = anInt3723 + i + j;
		int j1 = anInt3727 + k + l;
		int ai[] = new int[i1 * j1];
		for(int k1 = 0; k1 < anInt3727; k1++)
		{
			for(int l1 = 0; l1 < anInt3723; l1++)
				ai[(k1 + k) * i1 + (l1 + i)] = anIntArray3722[k1 * anInt3723 + l1];

		}

		anIntArray3722 = ai;
		anInt3723 = i1;
		anInt3727 = j1;
		anInt3725 -= i;
		anInt3724 -= k;
	}

	public void method490()
	{
		Class33_Sub6_Sub7.method428(anIntArray3722, anInt3723, anInt3727);
	}

	public void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		if(arg5 == 0)
			return;
		arg0 -= anInt3725 << 4;
		arg1 -= anInt3724 << 4;
		double d = (double)(arg4 & 0xffff) * 9.5873799242852573E-005D;
		int i = (int)Math.floor(Math.sin(d) * (double)arg5 + 0.5D);
		int j = (int)Math.floor(Math.cos(d) * (double)arg5 + 0.5D);
		int k = -arg0 * j + -arg1 * i;
		int l = arg0 * i + -arg1 * j;
		int i1 = ((anInt3723 << 4) - arg0) * j + -arg1 * i;
		int j1 = -((anInt3723 << 4) - arg0) * i + -arg1 * j;
		int k1 = -arg0 * j + ((anInt3727 << 4) - arg1) * i;
		int l1 = arg0 * i + ((anInt3727 << 4) - arg1) * j;
		int i2 = ((anInt3723 << 4) - arg0) * j + ((anInt3727 << 4) - arg1) * i;
		int j2 = -((anInt3723 << 4) - arg0) * i + ((anInt3727 << 4) - arg1) * j;
		int k2;
		int l2;
		if(k < i1)
		{
			k2 = k;
			l2 = i1;
		} else
		{
			k2 = i1;
			l2 = k;
		}
		if(k1 < k2)
			k2 = k1;
		if(i2 < k2)
			k2 = i2;
		if(k1 > l2)
			l2 = k1;
		if(i2 > l2)
			l2 = i2;
		int i3;
		int j3;
		if(l < j1)
		{
			i3 = l;
			j3 = j1;
		} else
		{
			i3 = j1;
			j3 = l;
		}
		if(l1 < i3)
			i3 = l1;
		if(j2 < i3)
			i3 = j2;
		if(l1 > j3)
			j3 = l1;
		if(j2 > j3)
			j3 = j2;
		k2 >>= 12;
		l2 = l2 + 4095 >> 12;
		i3 >>= 12;
		j3 = j3 + 4095 >> 12;
		k2 += arg2;
		l2 += arg2;
		i3 += arg3;
		j3 += arg3;
		k2 >>= 4;
		l2 = l2 + 15 >> 4;
		i3 >>= 4;
		j3 = j3 + 15 >> 4;
		if(k2 < Class33_Sub6_Sub7.anInt2798)
			k2 = Class33_Sub6_Sub7.anInt2798;
		if(l2 > Class33_Sub6_Sub7.anInt2799)
			l2 = Class33_Sub6_Sub7.anInt2799;
		if(i3 < Class33_Sub6_Sub7.anInt2794)
			i3 = Class33_Sub6_Sub7.anInt2794;
		if(j3 > Class33_Sub6_Sub7.anInt2793)
			j3 = Class33_Sub6_Sub7.anInt2793;
		l2 = k2 - l2;
		if(l2 >= 0)
			return;
		j3 = i3 - j3;
		if(j3 >= 0)
			return;
		int k3 = i3 * Class33_Sub6_Sub7.anInt2797 + k2;
		double d1 = 16777216D / (double)arg5;
		int l3 = (int)Math.floor(Math.sin(d) * d1 + 0.5D);
		int i4 = (int)Math.floor(Math.cos(d) * d1 + 0.5D);
		int j4 = ((k2 << 4) + 8) - arg2;
		int k4 = ((i3 << 4) + 8) - arg3;
		int l4 = (arg0 << 8) - (k4 * l3 >> 4);
		int i5 = (arg1 << 8) + (k4 * i4 >> 4);
		if(i4 == 0)
		{
			if(l3 == 0)
			{
				for(int j8 = j3; j8 < 0;)
				{
					int k10 = k3;
					int l12 = l4;
					int i15 = i5;
					int j17 = l2;
					if(l12 >= 0 && i15 >= 0 && l12 - (anInt3723 << 12) < 0 && i15 - (anInt3727 << 12) < 0)
						for(; j17 < 0; j17++)
						{
							int k19 = anIntArray3722[(i15 >> 12) * anInt3723 + (l12 >> 12)];
							if(k19 != 0)
								Class33_Sub6_Sub7.anIntArray2796[k10++] = k19;
							else
								k10++;
						}

					j8++;
					k3 += Class33_Sub6_Sub7.anInt2797;
				}

				return;
			}
			if(l3 < 0)
			{
				for(int k8 = j3; k8 < 0;)
				{
					int l10 = k3;
					int i13 = l4;
					int j15 = i5 + (j4 * l3 >> 4);
					int k17 = l2;
					if(i13 >= 0 && i13 - (anInt3723 << 12) < 0)
					{
						int j5;
						if((j5 = j15 - (anInt3727 << 12)) >= 0)
						{
							j5 = (l3 - j5) / l3;
							k17 += j5;
							j15 += l3 * j5;
							l10 += j5;
						}
						if((j5 = (j15 - l3) / l3) > k17)
							k17 = j5;
						for(; k17 < 0; k17++)
						{
							int l19 = anIntArray3722[(j15 >> 12) * anInt3723 + (i13 >> 12)];
							if(l19 != 0)
								Class33_Sub6_Sub7.anIntArray2796[l10++] = l19;
							else
								l10++;
							j15 += l3;
						}

					}
					k8++;
					l4 -= l3;
					k3 += Class33_Sub6_Sub7.anInt2797;
				}

				return;
			}
			for(int l8 = j3; l8 < 0;)
			{
				int i11 = k3;
				int j13 = l4;
				int k15 = i5 + (j4 * l3 >> 4);
				int l17 = l2;
				if(j13 >= 0 && j13 - (anInt3723 << 12) < 0)
				{
					if(k15 < 0)
					{
						int k5 = (l3 - 1 - k15) / l3;
						l17 += k5;
						k15 += l3 * k5;
						i11 += k5;
					}
					int l5;
					if((l5 = ((1 + k15) - (anInt3727 << 12) - l3) / l3) > l17)
						l17 = l5;
					for(; l17 < 0; l17++)
					{
						int i20 = anIntArray3722[(k15 >> 12) * anInt3723 + (j13 >> 12)];
						if(i20 != 0)
							Class33_Sub6_Sub7.anIntArray2796[i11++] = i20;
						else
							i11++;
						k15 += l3;
					}

				}
				l8++;
				l4 -= l3;
				k3 += Class33_Sub6_Sub7.anInt2797;
			}

			return;
		}
		if(i4 < 0)
		{
			if(l3 == 0)
			{
				for(int i9 = j3; i9 < 0;)
				{
					int j11 = k3;
					int k13 = l4 + (j4 * i4 >> 4);
					int l15 = i5;
					int i18 = l2;
					if(l15 >= 0 && l15 - (anInt3727 << 12) < 0)
					{
						int i6;
						if((i6 = k13 - (anInt3723 << 12)) >= 0)
						{
							i6 = (i4 - i6) / i4;
							i18 += i6;
							k13 += i4 * i6;
							j11 += i6;
						}
						if((i6 = (k13 - i4) / i4) > i18)
							i18 = i6;
						for(; i18 < 0; i18++)
						{
							int j20 = anIntArray3722[(l15 >> 12) * anInt3723 + (k13 >> 12)];
							if(j20 != 0)
								Class33_Sub6_Sub7.anIntArray2796[j11++] = j20;
							else
								j11++;
							k13 += i4;
						}

					}
					i9++;
					i5 += i4;
					k3 += Class33_Sub6_Sub7.anInt2797;
				}

				return;
			}
			if(l3 < 0)
			{
				for(int j9 = j3; j9 < 0;)
				{
					int k11 = k3;
					int l13 = l4 + (j4 * i4 >> 4);
					int i16 = i5 + (j4 * l3 >> 4);
					int j18 = l2;
					int j6;
					if((j6 = l13 - (anInt3723 << 12)) >= 0)
					{
						j6 = (i4 - j6) / i4;
						j18 += j6;
						l13 += i4 * j6;
						i16 += l3 * j6;
						k11 += j6;
					}
					if((j6 = (l13 - i4) / i4) > j18)
						j18 = j6;
					if((j6 = i16 - (anInt3727 << 12)) >= 0)
					{
						j6 = (l3 - j6) / l3;
						j18 += j6;
						l13 += i4 * j6;
						i16 += l3 * j6;
						k11 += j6;
					}
					if((j6 = (i16 - l3) / l3) > j18)
						j18 = j6;
					for(; j18 < 0; j18++)
					{
						int k20 = anIntArray3722[(i16 >> 12) * anInt3723 + (l13 >> 12)];
						if(k20 != 0)
							Class33_Sub6_Sub7.anIntArray2796[k11++] = k20;
						else
							k11++;
						l13 += i4;
						i16 += l3;
					}

					j9++;
					l4 -= l3;
					i5 += i4;
					k3 += Class33_Sub6_Sub7.anInt2797;
				}

				return;
			}
			for(int k9 = j3; k9 < 0;)
			{
				int l11 = k3;
				int i14 = l4 + (j4 * i4 >> 4);
				int j16 = i5 + (j4 * l3 >> 4);
				int k18 = l2;
				int k6;
				if((k6 = i14 - (anInt3723 << 12)) >= 0)
				{
					k6 = (i4 - k6) / i4;
					k18 += k6;
					i14 += i4 * k6;
					j16 += l3 * k6;
					l11 += k6;
				}
				if((k6 = (i14 - i4) / i4) > k18)
					k18 = k6;
				if(j16 < 0)
				{
					k6 = (l3 - 1 - j16) / l3;
					k18 += k6;
					i14 += i4 * k6;
					j16 += l3 * k6;
					l11 += k6;
				}
				if((k6 = ((1 + j16) - (anInt3727 << 12) - l3) / l3) > k18)
					k18 = k6;
				for(; k18 < 0; k18++)
				{
					int l20 = anIntArray3722[(j16 >> 12) * anInt3723 + (i14 >> 12)];
					if(l20 != 0)
						Class33_Sub6_Sub7.anIntArray2796[l11++] = l20;
					else
						l11++;
					i14 += i4;
					j16 += l3;
				}

				k9++;
				l4 -= l3;
				i5 += i4;
				k3 += Class33_Sub6_Sub7.anInt2797;
			}

			return;
		}
		if(l3 == 0)
		{
			for(int l9 = j3; l9 < 0;)
			{
				int i12 = k3;
				int j14 = l4 + (j4 * i4 >> 4);
				int k16 = i5;
				int l18 = l2;
				if(k16 >= 0 && k16 - (anInt3727 << 12) < 0)
				{
					if(j14 < 0)
					{
						int l6 = (i4 - 1 - j14) / i4;
						l18 += l6;
						j14 += i4 * l6;
						i12 += l6;
					}
					int i7;
					if((i7 = ((1 + j14) - (anInt3723 << 12) - i4) / i4) > l18)
						l18 = i7;
					for(; l18 < 0; l18++)
					{
						int i21 = anIntArray3722[(k16 >> 12) * anInt3723 + (j14 >> 12)];
						if(i21 != 0)
							Class33_Sub6_Sub7.anIntArray2796[i12++] = i21;
						else
							i12++;
						j14 += i4;
					}

				}
				l9++;
				i5 += i4;
				k3 += Class33_Sub6_Sub7.anInt2797;
			}

			return;
		}
		if(l3 < 0)
		{
			for(int i10 = j3; i10 < 0;)
			{
				int j12 = k3;
				int k14 = l4 + (j4 * i4 >> 4);
				int l16 = i5 + (j4 * l3 >> 4);
				int i19 = l2;
				if(k14 < 0)
				{
					int j7 = (i4 - 1 - k14) / i4;
					i19 += j7;
					k14 += i4 * j7;
					l16 += l3 * j7;
					j12 += j7;
				}
				int k7;
				if((k7 = ((1 + k14) - (anInt3723 << 12) - i4) / i4) > i19)
					i19 = k7;
				if((k7 = l16 - (anInt3727 << 12)) >= 0)
				{
					k7 = (l3 - k7) / l3;
					i19 += k7;
					k14 += i4 * k7;
					l16 += l3 * k7;
					j12 += k7;
				}
				if((k7 = (l16 - l3) / l3) > i19)
					i19 = k7;
				for(; i19 < 0; i19++)
				{
					int j21 = anIntArray3722[(l16 >> 12) * anInt3723 + (k14 >> 12)];
					if(j21 != 0)
						Class33_Sub6_Sub7.anIntArray2796[j12++] = j21;
					else
						j12++;
					k14 += i4;
					l16 += l3;
				}

				i10++;
				l4 -= l3;
				i5 += i4;
				k3 += Class33_Sub6_Sub7.anInt2797;
			}

			return;
		}
		for(int j10 = j3; j10 < 0;)
		{
			int k12 = k3;
			int l14 = l4 + (j4 * i4 >> 4);
			int i17 = i5 + (j4 * l3 >> 4);
			int j19 = l2;
			if(l14 < 0)
			{
				int l7 = (i4 - 1 - l14) / i4;
				j19 += l7;
				l14 += i4 * l7;
				i17 += l3 * l7;
				k12 += l7;
			}
			int i8;
			if((i8 = ((1 + l14) - (anInt3723 << 12) - i4) / i4) > j19)
				j19 = i8;
			if(i17 < 0)
			{
				i8 = (l3 - 1 - i17) / l3;
				j19 += i8;
				l14 += i4 * i8;
				i17 += l3 * i8;
				k12 += i8;
			}
			if((i8 = ((1 + i17) - (anInt3727 << 12) - l3) / l3) > j19)
				j19 = i8;
			for(; j19 < 0; j19++)
			{
				int k21 = anIntArray3722[(i17 >> 12) * anInt3723 + (l14 >> 12)];
				if(k21 != 0)
					Class33_Sub6_Sub7.anIntArray2796[k12++] = k21;
				else
					k12++;
				l14 += i4;
				i17 += l3;
			}

			j10++;
			l4 -= l3;
			i5 += i4;
			k3 += Class33_Sub6_Sub7.anInt2797;
		}

	}

	public static void method492(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, byte arg9[])
	{
		int i = -(arg5 >> 2);
		arg5 = -(arg5 & 3);
		for(int j = -arg6; j < 0; j++)
		{
			for(int k = i; k < 0; k++)
			{
				arg2 = arg1[arg3++];
				if(arg2 != 0 && arg9[arg4] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if(arg2 != 0 && arg9[arg4] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if(arg2 != 0 && arg9[arg4] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				arg2 = arg1[arg3++];
				if(arg2 != 0 && arg9[arg4] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}

			for(int l = arg5; l < 0; l++)
			{
				arg2 = arg1[arg3++];
				if(arg2 != 0 && arg9[arg4] == 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}

			arg4 += arg7;
			arg3 += arg8;
		}

	}

	public void method493(int arg0)
	{
		int ai[] = new int[anInt3723 * anInt3727];
		int i = 0;
		for(int j = 0; j < anInt3727; j++)
		{
			for(int k = 0; k < anInt3723; k++)
			{
				int l = anIntArray3722[i];
				if(l == 0)
					if(k > 0 && anIntArray3722[i - 1] != 0)
						l = arg0;
					else
					if(j > 0 && anIntArray3722[i - anInt3723] != 0)
						l = arg0;
					else
					if(k < anInt3723 - 1 && anIntArray3722[i + 1] != 0)
						l = arg0;
					else
					if(j < anInt3727 - 1 && anIntArray3722[i + anInt3723] != 0)
						l = arg0;
				ai[i++] = l;
			}

		}

		anIntArray3722 = ai;
	}

	public void method494(int arg0, int arg1)
	{
		arg0 += anInt3725;
		arg1 += anInt3724;
		int i = arg0 + arg1 * Class33_Sub6_Sub7.anInt2797;
		int j = 0;
		int k = anInt3727;
		int l = anInt3723;
		int i1 = Class33_Sub6_Sub7.anInt2797 - l;
		int j1 = 0;
		if(arg1 < Class33_Sub6_Sub7.anInt2794)
		{
			int k1 = Class33_Sub6_Sub7.anInt2794 - arg1;
			k -= k1;
			arg1 = Class33_Sub6_Sub7.anInt2794;
			j += k1 * l;
			i += k1 * Class33_Sub6_Sub7.anInt2797;
		}
		if(arg1 + k > Class33_Sub6_Sub7.anInt2793)
			k -= (arg1 + k) - Class33_Sub6_Sub7.anInt2793;
		if(arg0 < Class33_Sub6_Sub7.anInt2798)
		{
			int l1 = Class33_Sub6_Sub7.anInt2798 - arg0;
			l -= l1;
			arg0 = Class33_Sub6_Sub7.anInt2798;
			j += l1;
			i += l1;
			j1 += l1;
			i1 += l1;
		}
		if(arg0 + l > Class33_Sub6_Sub7.anInt2799)
		{
			int i2 = (arg0 + l) - Class33_Sub6_Sub7.anInt2799;
			l -= i2;
			j1 += i2;
			i1 += i2;
		}
		if(l <= 0 || k <= 0)
		{
			return;
		} else
		{
			method482(Class33_Sub6_Sub7.anIntArray2796, anIntArray3722, j, i, l, k, i1, j1);
			return;
		}
	}

	public static void method495(int arg0[], int arg1[], int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8, int arg9, int arg10)
	{
		int i = 256 - arg9;
		int j = (arg10 & 0xff00ff) * i & 0xff00ff00;
		int l = (arg10 & 0xff00) * i & 0xff0000;
		arg10 = (j | l) >>> 8;
		for(int j1 = -arg6; j1 < 0; j1++)
		{
			for(int k1 = -arg5; k1 < 0; k1++)
			{
				arg2 = arg1[arg3++];
				if(arg2 != 0)
				{
					int k = (arg2 & 0xff00ff) * arg9 & 0xff00ff00;
					int i1 = (arg2 & 0xff00) * arg9 & 0xff0000;
					arg0[arg4++] = ((k | i1) >>> 8) + arg10;
				} else
				{
					arg4++;
				}
			}

			arg4 += arg7;
			arg3 += arg8;
		}

	}

	public void method496(int arg0, int arg1, int arg2, int arg3)
	{
		if(arg2 <= 0 || arg3 <= 0)
			return;
		int i = anInt3723;
		int j = anInt3727;
		int k = 0;
		int l = 0;
		int i1 = anInt3728;
		int j1 = anInt3726;
		int k1 = (i1 << 16) / arg2;
		int l1 = (j1 << 16) / arg3;
		if(anInt3725 > 0)
		{
			int i2 = (((anInt3725 << 16) + k1) - 1) / k1;
			arg0 += i2;
			k += i2 * k1 - (anInt3725 << 16);
		}
		if(anInt3724 > 0)
		{
			int j2 = (((anInt3724 << 16) + l1) - 1) / l1;
			arg1 += j2;
			l += j2 * l1 - (anInt3724 << 16);
		}
		if(i < i1)
			arg2 = ((((i << 16) - k) + k1) - 1) / k1;
		if(j < j1)
			arg3 = ((((j << 16) - l) + l1) - 1) / l1;
		int k2 = arg0 + arg1 * Class33_Sub6_Sub7.anInt2797;
		int l2 = Class33_Sub6_Sub7.anInt2797 - arg2;
		if(arg1 + arg3 > Class33_Sub6_Sub7.anInt2793)
			arg3 -= (arg1 + arg3) - Class33_Sub6_Sub7.anInt2793;
		if(arg1 < Class33_Sub6_Sub7.anInt2794)
		{
			int i3 = Class33_Sub6_Sub7.anInt2794 - arg1;
			arg3 -= i3;
			k2 += i3 * Class33_Sub6_Sub7.anInt2797;
			l += l1 * i3;
		}
		if(arg0 + arg2 > Class33_Sub6_Sub7.anInt2799)
		{
			int j3 = (arg0 + arg2) - Class33_Sub6_Sub7.anInt2799;
			arg2 -= j3;
			l2 += j3;
		}
		if(arg0 < Class33_Sub6_Sub7.anInt2798)
		{
			int k3 = Class33_Sub6_Sub7.anInt2798 - arg0;
			arg2 -= k3;
			k2 += k3;
			k += k1 * k3;
			l2 += k3;
		}
		method487(Class33_Sub6_Sub7.anIntArray2796, anIntArray3722, 0, k, l, k2, l2, arg2, arg3, k1, l1, i);
	}

	public void method497(int arg0, int arg1, int arg2)
	{
		arg0 += anInt3725;
		arg1 += anInt3724;
		int i = arg0 + arg1 * Class33_Sub6_Sub7.anInt2797;
		int j = 0;
		int k = anInt3727;
		int l = anInt3723;
		int i1 = Class33_Sub6_Sub7.anInt2797 - l;
		int j1 = 0;
		if(arg1 < Class33_Sub6_Sub7.anInt2794)
		{
			int k1 = Class33_Sub6_Sub7.anInt2794 - arg1;
			k -= k1;
			arg1 = Class33_Sub6_Sub7.anInt2794;
			j += k1 * l;
			i += k1 * Class33_Sub6_Sub7.anInt2797;
		}
		if(arg1 + k > Class33_Sub6_Sub7.anInt2793)
			k -= (arg1 + k) - Class33_Sub6_Sub7.anInt2793;
		if(arg0 < Class33_Sub6_Sub7.anInt2798)
		{
			int l1 = Class33_Sub6_Sub7.anInt2798 - arg0;
			l -= l1;
			arg0 = Class33_Sub6_Sub7.anInt2798;
			j += l1;
			i += l1;
			j1 += l1;
			i1 += l1;
		}
		if(arg0 + l > Class33_Sub6_Sub7.anInt2799)
		{
			int i2 = (arg0 + l) - Class33_Sub6_Sub7.anInt2799;
			l -= i2;
			j1 += i2;
			i1 += i2;
		}
		if(l <= 0 || k <= 0)
		{
			return;
		} else
		{
			method485(Class33_Sub6_Sub7.anIntArray2796, anIntArray3722, 0, j, i, l, k, i1, j1, arg2);
			return;
		}
	}

	public Class33_Sub6_Sub7_Sub3()
	{
	}

	public Class33_Sub6_Sub7_Sub3(int arg0, int arg1)
	{
		anIntArray3722 = new int[arg0 * arg1];
		anInt3723 = anInt3728 = arg0;
		anInt3727 = anInt3726 = arg1;
		anInt3725 = anInt3724 = 0;
	}

	public Class33_Sub6_Sub7_Sub3(byte arg0[], Component arg1)
	{
		try
		{
			Image image = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker mediatracker = new MediaTracker(arg1);
			mediatracker.addImage(image, 0);
			mediatracker.waitForAll();
			anInt3723 = image.getWidth(arg1);
			anInt3727 = image.getHeight(arg1);
			anInt3728 = anInt3723;
			anInt3726 = anInt3727;
			anInt3725 = 0;
			anInt3724 = 0;
			anIntArray3722 = new int[anInt3723 * anInt3727];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt3723, anInt3727, anIntArray3722, 0, anInt3723);
			pixelgrabber.grabPixels();
			return;
		}
		catch(InterruptedException _ex)
		{
			return;
		}
	}

	public int anIntArray3722[];
	public int anInt3723;
	public int anInt3724;
	public int anInt3725;
	public int anInt3726;
	public int anInt3727;
	public int anInt3728;
}
