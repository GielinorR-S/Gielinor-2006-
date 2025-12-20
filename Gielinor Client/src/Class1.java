// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class1.java


public class Class1
{

	public static void method46()
	{
		anIntArray77 = null;
		anIntArray94 = null;
		anIntArray86 = null;
		anIntArray85 = null;
		anIntArray83 = null;
		anIntArrayArray96 = null;
		anIntArrayArray91 = null;
	}

	public Class1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, 
			int arg14, int arg15, int arg16, int arg17, int arg18)
	{
		aBoolean93 = true;
		if(arg5 != arg6 || arg5 != arg7 || arg5 != arg8)
			aBoolean93 = false;
		anInt89 = arg0;
		anInt75 = arg1;
		anInt90 = arg17;
		anInt81 = arg18;
		char c = '\200';
		int i = c / 2;
		int j = c / 4;
		int k = (c * 3) / 4;
		int ai[] = anIntArrayArray96[arg0];
		int l = ai.length;
		anIntArray92 = new int[l];
		anIntArray87 = new int[l];
		anIntArray82 = new int[l];
		int ai1[] = new int[l];
		int ai2[] = new int[l];
		int i1 = arg3 * c;
		int j1 = arg4 * c;
		for(int k1 = 0; k1 < l; k1++)
		{
			int l1 = ai[k1];
			if((l1 & 1) == 0 && l1 <= 8)
				l1 = (l1 - arg1 - arg1 - 1 & 7) + 1;
			if(l1 > 8 && l1 <= 12)
				l1 = (l1 - 9 - arg1 & 3) + 9;
			if(l1 > 12 && l1 <= 16)
				l1 = (l1 - 13 - arg1 & 3) + 13;
			int i2;
			int k2;
			int i3;
			int k3;
			int j4;
			if(l1 == 1)
			{
				i2 = i1;
				k2 = j1;
				i3 = arg5;
				k3 = arg9;
				j4 = arg13;
			} else
			if(l1 == 2)
			{
				i2 = i1 + i;
				k2 = j1;
				i3 = arg5 + arg6 >> 1;
				k3 = arg9 + arg10 >> 1;
				j4 = arg13 + arg14 >> 1;
			} else
			if(l1 == 3)
			{
				i2 = i1 + c;
				k2 = j1;
				i3 = arg6;
				k3 = arg10;
				j4 = arg14;
			} else
			if(l1 == 4)
			{
				i2 = i1 + c;
				k2 = j1 + i;
				i3 = arg6 + arg7 >> 1;
				k3 = arg10 + arg11 >> 1;
				j4 = arg14 + arg15 >> 1;
			} else
			if(l1 == 5)
			{
				i2 = i1 + c;
				k2 = j1 + c;
				i3 = arg7;
				k3 = arg11;
				j4 = arg15;
			} else
			if(l1 == 6)
			{
				i2 = i1 + i;
				k2 = j1 + c;
				i3 = arg7 + arg8 >> 1;
				k3 = arg11 + arg12 >> 1;
				j4 = arg15 + arg16 >> 1;
			} else
			if(l1 == 7)
			{
				i2 = i1;
				k2 = j1 + c;
				i3 = arg8;
				k3 = arg12;
				j4 = arg16;
			} else
			if(l1 == 8)
			{
				i2 = i1;
				k2 = j1 + i;
				i3 = arg8 + arg5 >> 1;
				k3 = arg12 + arg9 >> 1;
				j4 = arg16 + arg13 >> 1;
			} else
			if(l1 == 9)
			{
				i2 = i1 + i;
				k2 = j1 + j;
				i3 = arg5 + arg6 >> 1;
				k3 = arg9 + arg10 >> 1;
				j4 = arg13 + arg14 >> 1;
			} else
			if(l1 == 10)
			{
				i2 = i1 + k;
				k2 = j1 + i;
				i3 = arg6 + arg7 >> 1;
				k3 = arg10 + arg11 >> 1;
				j4 = arg14 + arg15 >> 1;
			} else
			if(l1 == 11)
			{
				i2 = i1 + i;
				k2 = j1 + k;
				i3 = arg7 + arg8 >> 1;
				k3 = arg11 + arg12 >> 1;
				j4 = arg15 + arg16 >> 1;
			} else
			if(l1 == 12)
			{
				i2 = i1 + j;
				k2 = j1 + i;
				i3 = arg8 + arg5 >> 1;
				k3 = arg12 + arg9 >> 1;
				j4 = arg16 + arg13 >> 1;
			} else
			if(l1 == 13)
			{
				i2 = i1 + j;
				k2 = j1 + j;
				i3 = arg5;
				k3 = arg9;
				j4 = arg13;
			} else
			if(l1 == 14)
			{
				i2 = i1 + k;
				k2 = j1 + j;
				i3 = arg6;
				k3 = arg10;
				j4 = arg14;
			} else
			if(l1 == 15)
			{
				i2 = i1 + k;
				k2 = j1 + k;
				i3 = arg7;
				k3 = arg11;
				j4 = arg15;
			} else
			{
				i2 = i1 + j;
				k2 = j1 + k;
				i3 = arg8;
				k3 = arg12;
				j4 = arg16;
			}
			anIntArray92[k1] = i2;
			anIntArray87[k1] = i3;
			anIntArray82[k1] = k2;
			ai1[k1] = k3;
			ai2[k1] = j4;
		}

		int ai3[] = anIntArrayArray91[arg0];
		int j2 = ai3.length / 4;
		anIntArray78 = new int[j2];
		anIntArray95 = new int[j2];
		anIntArray76 = new int[j2];
		anIntArray80 = new int[j2];
		anIntArray88 = new int[j2];
		anIntArray79 = new int[j2];
		if(arg2 != -1)
			anIntArray84 = new int[j2];
		int l2 = 0;
		for(int j3 = 0; j3 < j2; j3++)
		{
			int l3 = ai3[l2];
			int k4 = ai3[l2 + 1];
			int i5 = ai3[l2 + 2];
			int j5 = ai3[l2 + 3];
			l2 += 4;
			if(k4 < 4)
				k4 = k4 - arg1 & 3;
			if(i5 < 4)
				i5 = i5 - arg1 & 3;
			if(j5 < 4)
				j5 = j5 - arg1 & 3;
			anIntArray78[j3] = k4;
			anIntArray95[j3] = i5;
			anIntArray76[j3] = j5;
			if(l3 == 0)
			{
				anIntArray80[j3] = ai1[k4];
				anIntArray88[j3] = ai1[i5];
				anIntArray79[j3] = ai1[j5];
				if(anIntArray84 != null)
					anIntArray84[j3] = -1;
			} else
			{
				anIntArray80[j3] = ai2[k4];
				anIntArray88[j3] = ai2[i5];
				anIntArray79[j3] = ai2[j5];
				if(anIntArray84 != null)
					anIntArray84[j3] = arg2;
			}
		}

		int i4 = arg5;
		int l4 = arg6;
		if(arg6 < i4)
			i4 = arg6;
		if(arg6 > l4)
			l4 = arg6;
		if(arg7 < i4)
			i4 = arg7;
		if(arg7 > l4)
			l4 = arg7;
		if(arg8 < i4)
			i4 = arg8;
		if(arg8 > l4)
			l4 = arg8;
		i4 /= 14;
		l4 /= 14;
	}

	public int anInt75;
	public int anIntArray76[];
	public static int anIntArray77[] = new int[6];
	public int anIntArray78[];
	public int anIntArray79[];
	public int anIntArray80[];
	public int anInt81;
	public int anIntArray82[];
	public static int anIntArray83[] = new int[6];
	public int anIntArray84[];
	public static int anIntArray85[] = new int[6];
	public static int anIntArray86[] = new int[6];
	public int anIntArray87[];
	public int anIntArray88[];
	public int anInt89;
	public int anInt90;
	public static int anIntArrayArray91[][] = {
		{
			0, 1, 2, 3, 0, 0, 1, 3
		}, {
			1, 1, 2, 3, 1, 0, 1, 3
		}, {
			0, 1, 2, 3, 1, 0, 1, 3
		}, {
			0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 
			4, 3
		}, {
			0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 
			2, 4
		}, {
			0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 
			2, 4
		}, {
			0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 
			4, 3
		}, {
			0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 
			4, 5, 1, 0, 5, 3
		}, {
			0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 
			3, 5, 1, 0, 4, 5
		}, {
			0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 
			2, 3, 1, 4, 3, 5
		}, {
			0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 
			2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 
			1, 4, 2, 3
		}, {
			1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 
			2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 
			0, 4, 2, 3
		}, {
			1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 
			4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 
			0, 1, 2, 5
		}
	};
	public int anIntArray92[];
	public boolean aBoolean93;
	public static int anIntArray94[] = new int[6];
	public int anIntArray95[];
	public static int anIntArrayArray96[][] = {
		{
			1, 3, 5, 7
		}, {
			1, 3, 5, 7
		}, {
			1, 3, 5, 7
		}, {
			1, 3, 5, 7, 6
		}, {
			1, 3, 5, 7, 6
		}, {
			1, 3, 5, 7, 6
		}, {
			1, 3, 5, 7, 6
		}, {
			1, 3, 5, 7, 2, 6
		}, {
			1, 3, 5, 7, 2, 8
		}, {
			1, 3, 5, 7, 2, 8
		}, {
			1, 3, 5, 7, 11, 12
		}, {
			1, 3, 5, 7, 11, 12
		}, {
			1, 3, 5, 7, 13, 14
		}
	};

}
