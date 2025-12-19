// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub17.java


public class Class33_Sub17 extends Class33
{

	public void method806(int arg0)
	{
		if(anIntArray2497 == null)
			return;
		if(anInt2498 == 1 || anInt2498 == 3)
		{
			if(anIntArray2501 == null || anIntArray2501.length < anIntArray2497.length)
				anIntArray2501 = new int[anIntArray2497.length];
			char c;
			if(anIntArray2497.length == 16384)
				c = '@';
			else
				c = '\200';
			int i = anIntArray2497.length / 4;
			int k = c * arg0 * anInt2500;
			int i1 = i - 1;
			if(anInt2498 == 1)
				k = -k;
			for(int k1 = 0; k1 < i; k1++)
			{
				int i2 = k1 + k & i1;
				anIntArray2501[k1] = anIntArray2497[i2];
				anIntArray2501[k1 + i] = anIntArray2497[i2 + i];
				anIntArray2501[k1 + i + i] = anIntArray2497[i2 + i + i];
				anIntArray2501[k1 + i + i + i] = anIntArray2497[i2 + i + i + i];
			}

			int ai[] = anIntArray2497;
			anIntArray2497 = anIntArray2501;
			anIntArray2501 = ai;
		}
		if(anInt2498 == 2 || anInt2498 == 4)
		{
			if(anIntArray2501 == null || anIntArray2501.length < anIntArray2497.length)
				anIntArray2501 = new int[anIntArray2497.length];
			char c1;
			if(anIntArray2497.length == 16384)
				c1 = '@';
			else
				c1 = '\200';
			int j = anIntArray2497.length / 4;
			int l = arg0 * anInt2500;
			int j1 = c1 - 1;
			if(anInt2498 == 2)
				l = -l;
			for(int l1 = 0; l1 < j; l1 += c1)
			{
				for(int j2 = 0; j2 < c1; j2++)
				{
					int k2 = l1 + j2;
					int l2 = l1 + (j2 + l & j1);
					anIntArray2501[k2] = anIntArray2497[l2];
					anIntArray2501[k2 + j] = anIntArray2497[l2 + j];
					anIntArray2501[k2 + j + j] = anIntArray2497[l2 + j + j];
					anIntArray2501[k2 + j + j + j] = anIntArray2497[l2 + j + j + j];
				}

			}

			int ai1[] = anIntArray2497;
			anIntArray2497 = anIntArray2501;
			anIntArray2501 = ai1;
		}
	}

	public boolean method807(double arg0, int arg1, Class30 arg2)
	{
		for(int i = 0; i < anIntArray2502.length; i++)
			if(arg2.method231((byte)-90, anIntArray2502[i]) == null)
				return false;

		int j = arg1 * arg1;
		anIntArray2497 = new int[j * 4];
		for(int k = 0; k < anIntArray2502.length; k++)
		{
			Class33_Sub6_Sub7_Sub4 class33_sub6_sub7_sub4 = Class66.method1094(arg2, (byte)-47, anIntArray2502[k]);
			class33_sub6_sub7_sub4.method499();
			byte abyte0[] = class33_sub6_sub7_sub4.aByteArray3732;
			int ai[] = class33_sub6_sub7_sub4.anIntArray3730;
			int j1 = anIntArray2504[k];
			if((j1 & 0xff000000) == 0x3000000)
			{
				int k1 = j1 & 0xff00ff;
				int i2 = j1 >> 8 & 0xff;
				for(int k2 = 0; k2 < ai.length; k2++)
				{
					int k3 = ai[k2];
					if((k3 & 0xffff) == k3 >> 8)
					{
						k3 &= 0xff;
						ai[k2] = k1 * k3 >> 8 & 0xff00ff | i2 * k3 & 0xff00;
					}
				}

			}
			for(int l1 = 0; l1 < ai.length; l1++)
				ai[l1] = Class33_Sub6_Sub7_Sub1.method446(ai[l1], arg0);

			int j2;
			if(k == 0)
				j2 = 0;
			else
				j2 = anIntArray2505[k - 1];
			if(j2 == 0)
				if(class33_sub6_sub7_sub4.anInt3734 == arg1)
				{
					for(int l2 = 0; l2 < j; l2++)
						anIntArray2497[l2] = ai[abyte0[l2] & 0xff];

				} else
				if(class33_sub6_sub7_sub4.anInt3734 == 64 && arg1 == 128)
				{
					int i3 = 0;
					for(int l3 = 0; l3 < arg1; l3++)
					{
						for(int j4 = 0; j4 < arg1; j4++)
							anIntArray2497[i3++] = ai[abyte0[(j4 >> 1) + ((l3 >> 1) << 6)] & 0xff];

					}

				} else
				if(class33_sub6_sub7_sub4.anInt3734 == 128 && arg1 == 64)
				{
					int j3 = 0;
					for(int i4 = 0; i4 < arg1; i4++)
					{
						for(int k4 = 0; k4 < arg1; k4++)
							anIntArray2497[j3++] = ai[abyte0[(k4 << 1) + (i4 << 1 << 7)] & 0xff];

					}

				} else
				{
					throw new RuntimeException();
				}
		}

		for(int l = 0; l < j; l++)
		{
			anIntArray2497[l] &= 0xf8f8ff;
			int i1 = anIntArray2497[l];
			anIntArray2497[l + j] = i1 - (i1 >>> 3) & 0xf8f8ff;
			anIntArray2497[l + j + j] = i1 - (i1 >>> 2) & 0xf8f8ff;
			anIntArray2497[l + j + j + j] = i1 - (i1 >>> 2) - (i1 >>> 3) & 0xf8f8ff;
		}

		return true;
	}

	public static void method808()
	{
		anIntArray2501 = null;
	}

	public void method809()
	{
		anIntArray2497 = null;
	}

	public Class33_Sub17(Class33_Sub11 arg0)
	{
		aBoolean2506 = false;
		anInt2496 = arg0.method666(70);
		aBoolean2503 = arg0.method639((byte)123) == 1;
		int i = arg0.method639((byte)123);
		if(i < 1 || i > 4)
			throw new RuntimeException();
		anIntArray2502 = new int[i];
		for(int j = 0; j < i; j++)
			anIntArray2502[j] = arg0.method666(99);

		if(i > 1)
		{
			anIntArray2505 = new int[i - 1];
			for(int k = 0; k < i - 1; k++)
				anIntArray2505[k] = arg0.method639((byte)123);

		}
		if(i > 1)
		{
			anIntArray2499 = new int[i - 1];
			for(int l = 0; l < i - 1; l++)
				anIntArray2499[l] = arg0.method639((byte)123);

		}
		anIntArray2504 = new int[i];
		for(int i1 = 0; i1 < i; i1++)
			anIntArray2504[i1] = arg0.method623((byte)116);

		anInt2498 = arg0.method639((byte)123);
		anInt2500 = arg0.method639((byte)123);
		anIntArray2497 = null;
	}

	public int anInt2496;
	public int anIntArray2497[];
	public int anInt2498;
	public int anIntArray2499[];
	public int anInt2500;
	public static int anIntArray2501[];
	public int anIntArray2502[];
	public boolean aBoolean2503;
	public int anIntArray2504[];
	public int anIntArray2505[];
	public boolean aBoolean2506;
}
