// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub7_Sub4.java


public class Class33_Sub6_Sub7_Sub4 extends Class33_Sub6_Sub7
{

	public void method498(int arg0, int arg1, int arg2)
	{
		for(int i = 0; i < anIntArray3730.length; i++)
		{
			int j = anIntArray3730[i] >> 16 & 0xff;
			j += arg0;
			if(j < 0)
				j = 0;
			else
			if(j > 255)
				j = 255;
			int k = anIntArray3730[i] >> 8 & 0xff;
			k += arg1;
			if(k < 0)
				k = 0;
			else
			if(k > 255)
				k = 255;
			int l = anIntArray3730[i] & 0xff;
			l += arg2;
			if(l < 0)
				l = 0;
			else
			if(l > 255)
				l = 255;
			anIntArray3730[i] = (j << 16) + (k << 8) + l;
		}

	}

	public void method499()
	{
		if(anInt3734 == anInt3729 && anInt3731 == anInt3735)
			return;
		byte abyte0[] = new byte[anInt3729 * anInt3735];
		int i = 0;
		for(int j = 0; j < anInt3731; j++)
		{
			for(int k = 0; k < anInt3734; k++)
				abyte0[k + anInt3733 + (j + anInt3736) * anInt3729] = aByteArray3732[i++];

		}

		aByteArray3732 = abyte0;
		anInt3734 = anInt3729;
		anInt3731 = anInt3735;
		anInt3733 = 0;
		anInt3736 = 0;
	}

	public void method500()
	{
		byte abyte0[] = new byte[anInt3734 * anInt3731];
		int i = 0;
		for(int j = 0; j < anInt3731; j++)
		{
			for(int k = anInt3734 - 1; k >= 0; k--)
				abyte0[i++] = aByteArray3732[k + j * anInt3734];

		}

		aByteArray3732 = abyte0;
		anInt3733 = anInt3729 - anInt3734 - anInt3733;
	}

	public static void method501(int arg0[], byte arg1[], int arg2[], int arg3, int arg4, int arg5, int arg6, int arg7, 
			int arg8)
	{
		int i = -(arg5 >> 2);
		arg5 = -(arg5 & 3);
		for(int j = -arg6; j < 0; j++)
		{
			for(int k = i; k < 0; k++)
			{
				byte byte0 = arg1[arg3++];
				if(byte0 != 0)
					arg0[arg4++] = arg2[byte0 & 0xff];
				else
					arg4++;
				byte0 = arg1[arg3++];
				if(byte0 != 0)
					arg0[arg4++] = arg2[byte0 & 0xff];
				else
					arg4++;
				byte0 = arg1[arg3++];
				if(byte0 != 0)
					arg0[arg4++] = arg2[byte0 & 0xff];
				else
					arg4++;
				byte0 = arg1[arg3++];
				if(byte0 != 0)
					arg0[arg4++] = arg2[byte0 & 0xff];
				else
					arg4++;
			}

			for(int l = arg5; l < 0; l++)
			{
				byte byte1 = arg1[arg3++];
				if(byte1 != 0)
					arg0[arg4++] = arg2[byte1 & 0xff];
				else
					arg4++;
			}

			arg4 += arg7;
			arg3 += arg8;
		}

	}

	public void method502(int arg0, int arg1)
	{
		arg0 += anInt3733;
		arg1 += anInt3736;
		int i = arg0 + arg1 * Class33_Sub6_Sub7.anInt2797;
		int j = 0;
		int k = anInt3731;
		int l = anInt3734;
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
			method501(Class33_Sub6_Sub7.anIntArray2796, aByteArray3732, anIntArray3730, j, i, l, k, i1, j1);
			return;
		}
	}

	public Class33_Sub6_Sub7_Sub4 method503()
	{
		Class33_Sub6_Sub7_Sub4 class33_sub6_sub7_sub4 = new Class33_Sub6_Sub7_Sub4(anInt3734, anInt3731, anIntArray3730.length);
		class33_sub6_sub7_sub4.anInt3729 = anInt3729;
		class33_sub6_sub7_sub4.anInt3735 = anInt3735;
		class33_sub6_sub7_sub4.anInt3733 = anInt3733;
		class33_sub6_sub7_sub4.anInt3736 = anInt3736;
		int i = aByteArray3732.length;
		for(int j = 0; j < i; j++)
			class33_sub6_sub7_sub4.aByteArray3732[j] = aByteArray3732[j];

		i = anIntArray3730.length;
		for(int k = 0; k < i; k++)
			class33_sub6_sub7_sub4.anIntArray3730[k] = anIntArray3730[k];

		return class33_sub6_sub7_sub4;
	}

	public void method504()
	{
		byte abyte0[] = new byte[anInt3734 * anInt3731];
		int i = 0;
		for(int j = anInt3731 - 1; j >= 0; j--)
		{
			for(int k = 0; k < anInt3734; k++)
				abyte0[i++] = aByteArray3732[k + j * anInt3734];

		}

		aByteArray3732 = abyte0;
		anInt3736 = anInt3735 - anInt3731 - anInt3736;
	}

	public Class33_Sub6_Sub7_Sub4()
	{
	}

	public Class33_Sub6_Sub7_Sub4(int arg0, int arg1, int arg2)
	{
		anInt3729 = anInt3734 = arg0;
		anInt3735 = anInt3731 = arg1;
		anInt3733 = anInt3736 = 0;
		aByteArray3732 = new byte[arg0 * arg1];
		anIntArray3730 = new int[arg2];
	}

	public int anInt3729;
	public int anIntArray3730[];
	public int anInt3731;
	public byte aByteArray3732[];
	public int anInt3733;
	public int anInt3734;
	public int anInt3735;
	public int anInt3736;
}
