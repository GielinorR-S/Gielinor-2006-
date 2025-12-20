// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub7.java


public class Class33_Sub6_Sub7 extends Class33_Sub6
{

	public static void method413(int arg0[])
	{
		arg0[0] = anInt2798;
		arg0[1] = anInt2794;
		arg0[2] = anInt2799;
		arg0[3] = anInt2793;
	}

	public static void method414(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		if(arg0 < anInt2798 || arg0 >= anInt2799)
			return;
		if(arg1 < anInt2794)
		{
			arg2 -= anInt2794 - arg1;
			arg1 = anInt2794;
		}
		if(arg1 + arg2 > anInt2793)
			arg2 = anInt2793 - arg1;
		int i = 256 - arg4;
		int j = (arg3 >> 16 & 0xff) * arg4;
		int k = (arg3 >> 8 & 0xff) * arg4;
		int l = (arg3 & 0xff) * arg4;
		int l1 = arg0 + arg1 * anInt2797;
		for(int i2 = 0; i2 < arg2; i2++)
		{
			int i1 = (anIntArray2796[l1] >> 16 & 0xff) * i;
			int j1 = (anIntArray2796[l1] >> 8 & 0xff) * i;
			int k1 = (anIntArray2796[l1] & 0xff) * i;
			int j2 = ((j + i1 >> 8) << 16) + ((k + j1 >> 8) << 8) + (l + k1 >> 8);
			anIntArray2796[l1] = j2;
			l1 += anInt2797;
		}

	}

	public static void method415(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		method416(arg0, arg1, arg2, arg4);
		method416(arg0, (arg1 + arg3) - 1, arg2, arg4);
		method421(arg0, arg1, arg3, arg4);
		method421((arg0 + arg2) - 1, arg1, arg3, arg4);
	}

	public static void method416(int arg0, int arg1, int arg2, int arg3)
	{
		if(arg1 < anInt2794 || arg1 >= anInt2793)
			return;
		if(arg0 < anInt2798)
		{
			arg2 -= anInt2798 - arg0;
			arg0 = anInt2798;
		}
		if(arg0 + arg2 > anInt2799)
			arg2 = anInt2799 - arg0;
		int i = arg0 + arg1 * anInt2797;
		for(int j = 0; j < arg2; j++)
			anIntArray2796[i + j] = arg3;

	}

	public static void method417()
	{
		int i = 0;
		int j;
		for(j = anInt2797 * anInt2795 - 7; i < j;)
		{
			anIntArray2796[i++] = 0;
			anIntArray2796[i++] = 0;
			anIntArray2796[i++] = 0;
			anIntArray2796[i++] = 0;
			anIntArray2796[i++] = 0;
			anIntArray2796[i++] = 0;
			anIntArray2796[i++] = 0;
			anIntArray2796[i++] = 0;
		}

		for(j += 7; i < j;)
			anIntArray2796[i++] = 0;

	}

	public static void method418(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		arg2 -= arg0;
		arg3 -= arg1;
		if(arg3 == 0)
			if(arg2 >= 0)
			{
				method416(arg0, arg1, arg2 + 1, arg4);
				return;
			} else
			{
				method416(arg0 + arg2, arg1, -arg2 + 1, arg4);
				return;
			}
		if(arg2 == 0)
			if(arg3 >= 0)
			{
				method421(arg0, arg1, arg3 + 1, arg4);
				return;
			} else
			{
				method421(arg0, arg1 + arg3, -arg3 + 1, arg4);
				return;
			}
		if(arg2 + arg3 < 0)
		{
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		if(arg2 > arg3)
		{
			arg1 <<= 16;
			arg1 += 32768;
			arg3 <<= 16;
			int i = (int)Math.floor((double)arg3 / (double)arg2 + 0.5D);
			arg2 += arg0;
			if(arg0 < anInt2798)
			{
				arg1 += i * (anInt2798 - arg0);
				arg0 = anInt2798;
			}
			if(arg2 >= anInt2799)
				arg2 = anInt2799 - 1;
			for(; arg0 <= arg2; arg0++)
			{
				int k = arg1 >> 16;
				if(k >= anInt2794 && k < anInt2793)
					anIntArray2796[arg0 + k * anInt2797] = arg4;
				arg1 += i;
			}

			return;
		}
		arg0 <<= 16;
		arg0 += 32768;
		arg2 <<= 16;
		int j = (int)Math.floor((double)arg2 / (double)arg3 + 0.5D);
		arg3 += arg1;
		if(arg1 < anInt2794)
		{
			arg0 += j * (anInt2794 - arg1);
			arg1 = anInt2794;
		}
		if(arg3 >= anInt2793)
			arg3 = anInt2793 - 1;
		for(; arg1 <= arg3; arg1++)
		{
			int l = arg0 >> 16;
			if(l >= anInt2798 && l < anInt2799)
				anIntArray2796[l + arg1 * anInt2797] = arg4;
			arg0 += j;
		}

	}

	public static void method419(int arg0[])
	{
		anInt2798 = arg0[0];
		anInt2794 = arg0[1];
		anInt2799 = arg0[2];
		anInt2793 = arg0[3];
	}

	public static void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		method423(arg0, arg1, arg2, arg4, arg5);
		method423(arg0, (arg1 + arg3) - 1, arg2, arg4, arg5);
		if(arg3 >= 3)
		{
			method414(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method414((arg0 + arg2) - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	public static void method421(int arg0, int arg1, int arg2, int arg3)
	{
		if(arg0 < anInt2798 || arg0 >= anInt2799)
			return;
		if(arg1 < anInt2794)
		{
			arg2 -= anInt2794 - arg1;
			arg1 = anInt2794;
		}
		if(arg1 + arg2 > anInt2793)
			arg2 = anInt2793 - arg1;
		int i = arg0 + arg1 * anInt2797;
		for(int j = 0; j < arg2; j++)
			anIntArray2796[i + j * anInt2797] = arg3;

	}

	public Class33_Sub6_Sub7()
	{
	}

	public static void method422(int arg0, int arg1, int arg2, int arg3)
	{
		if(arg0 < 0)
			arg0 = 0;
		if(arg1 < 0)
			arg1 = 0;
		if(arg2 > anInt2797)
			arg2 = anInt2797;
		if(arg3 > anInt2795)
			arg3 = anInt2795;
		anInt2798 = arg0;
		anInt2794 = arg1;
		anInt2799 = arg2;
		anInt2793 = arg3;
	}

	public static void method423(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		if(arg1 < anInt2794 || arg1 >= anInt2793)
			return;
		if(arg0 < anInt2798)
		{
			arg2 -= anInt2798 - arg0;
			arg0 = anInt2798;
		}
		if(arg0 + arg2 > anInt2799)
			arg2 = anInt2799 - arg0;
		int i = 256 - arg4;
		int j = (arg3 >> 16 & 0xff) * arg4;
		int k = (arg3 >> 8 & 0xff) * arg4;
		int l = (arg3 & 0xff) * arg4;
		int l1 = arg0 + arg1 * anInt2797;
		for(int i2 = 0; i2 < arg2; i2++)
		{
			int i1 = (anIntArray2796[l1] >> 16 & 0xff) * i;
			int j1 = (anIntArray2796[l1] >> 8 & 0xff) * i;
			int k1 = (anIntArray2796[l1] & 0xff) * i;
			int j2 = ((j + i1 >> 8) << 16) + ((k + j1 >> 8) << 8) + (l + k1 >> 8);
			anIntArray2796[l1++] = j2;
		}

	}

	public static void method424(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		if(arg0 < anInt2798)
		{
			arg2 -= anInt2798 - arg0;
			arg0 = anInt2798;
		}
		if(arg1 < anInt2794)
		{
			arg3 -= anInt2794 - arg1;
			arg1 = anInt2794;
		}
		if(arg0 + arg2 > anInt2799)
			arg2 = anInt2799 - arg0;
		if(arg1 + arg3 > anInt2793)
			arg3 = anInt2793 - arg1;
		int i = anInt2797 - arg2;
		int j = arg0 + arg1 * anInt2797;
		for(int k = -arg3; k < 0; k++)
		{
			for(int l = -arg2; l < 0; l++)
				anIntArray2796[j++] = arg4;

			j += i;
		}

	}

	public static void method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		if(arg0 < anInt2798)
		{
			arg2 -= anInt2798 - arg0;
			arg0 = anInt2798;
		}
		if(arg1 < anInt2794)
		{
			arg3 -= anInt2794 - arg1;
			arg1 = anInt2794;
		}
		if(arg0 + arg2 > anInt2799)
			arg2 = anInt2799 - arg0;
		if(arg1 + arg3 > anInt2793)
			arg3 = anInt2793 - arg1;
		arg4 = ((arg4 & 0xff00ff) * arg5 >> 8 & 0xff00ff) + ((arg4 & 0xff00) * arg5 >> 8 & 0xff00);
		int i = 256 - arg5;
		int j = anInt2797 - arg2;
		int k = arg0 + arg1 * anInt2797;
		for(int l = 0; l < arg3; l++)
		{
			for(int i1 = -arg2; i1 < 0; i1++)
			{
				int j1 = anIntArray2796[k];
				j1 = ((j1 & 0xff00ff) * i >> 8 & 0xff00ff) + ((j1 & 0xff00) * i >> 8 & 0xff00);
				anIntArray2796[k++] = arg4 + j1;
			}

			k += j;
		}

	}

	public static void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		int i = 0;
		int j = 0x10000 / arg3;
		if(arg0 < anInt2798)
		{
			arg2 -= anInt2798 - arg0;
			arg0 = anInt2798;
		}
		if(arg1 < anInt2794)
		{
			i += (anInt2794 - arg1) * j;
			arg3 -= anInt2794 - arg1;
			arg1 = anInt2794;
		}
		if(arg0 + arg2 > anInt2799)
			arg2 = anInt2799 - arg0;
		if(arg1 + arg3 > anInt2793)
			arg3 = anInt2793 - arg1;
		int k = anInt2797 - arg2;
		int l = arg0 + arg1 * anInt2797;
		for(int i1 = -arg3; i1 < 0; i1++)
		{
			int j1 = 0x10000 - i >> 8;
			int k1 = i >> 8;
			int l1 = ((arg4 & 0xff00ff) * j1 + (arg5 & 0xff00ff) * k1 & 0xff00ff00) + ((arg4 & 0xff00) * j1 + (arg5 & 0xff00) * k1 & 0xff0000) >>> 8;
			for(int i2 = -arg2; i2 < 0; i2++)
				anIntArray2796[l++] = l1;

			l += k;
			i += j;
		}

	}

	public static void method427()
	{
		anInt2798 = 0;
		anInt2794 = 0;
		anInt2799 = anInt2797;
		anInt2793 = anInt2795;
	}

	public static void method428(int arg0[], int arg1, int arg2)
	{
		anIntArray2796 = arg0;
		anInt2797 = arg1;
		anInt2795 = arg2;
		method422(0, 0, arg1, arg2);
	}

	public static void method429()
	{
		anIntArray2796 = null;
	}

	public static int anInt2793 = 0;
	public static int anInt2794 = 0;
	public static int anInt2795;
	public static int anIntArray2796[];
	public static int anInt2797;
	public static int anInt2798 = 0;
	public static int anInt2799 = 0;

}
