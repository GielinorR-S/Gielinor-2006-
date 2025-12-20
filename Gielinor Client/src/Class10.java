// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class10.java


public class Class10
{

	public void method87()
	{
		aClass33_Sub11_177.anInt2239 = -1;
	}

	public int method88(int arg0)
	{
		int i = aClass33_Sub11_177.aByteArray2296[aClass33_Sub11_177.anInt2239];
		if(i < 0)
		{
			i &= 0xff;
			anIntArray184[arg0] = i;
			aClass33_Sub11_177.anInt2239++;
		} else
		{
			i = anIntArray184[arg0];
		}
		if(i == 240 || i == 247)
		{
			int j = aClass33_Sub11_177.method635((byte)-24);
			if(i == 247 && j > 0)
			{
				int k = aClass33_Sub11_177.aByteArray2296[aClass33_Sub11_177.anInt2239] & 0xff;
				if(k >= 241 && k <= 243 || k == 246 || k == 248 || k >= 250 && k <= 252 || k == 254)
				{
					aClass33_Sub11_177.anInt2239++;
					anIntArray184[arg0] = k;
					return method101(arg0, k);
				}
			}
			aClass33_Sub11_177.anInt2239 += j;
			return 0;
		} else
		{
			return method101(arg0, i);
		}
	}

	public int method89(int arg0)
	{
		int i = method88(arg0);
		return i;
	}

	public int method90()
	{
		int i = anIntArray182.length;
		int j = -1;
		int k = 0x7fffffff;
		for(int l = 0; l < i; l++)
			if(anIntArray182[l] >= 0 && anIntArray179[l] < k)
			{
				j = l;
				k = anIntArray179[l];
			}

		return j;
	}

	public void method91(int arg0)
	{
		int i = aClass33_Sub11_177.method635((byte)-24);
		anIntArray179[arg0] += i;
	}

	public boolean method92()
	{
		int i = anIntArray182.length;
		for(int j = 0; j < i; j++)
			if(anIntArray182[j] >= 0)
				return false;

		return true;
	}

	public void method93()
	{
		aClass33_Sub11_177.aByteArray2296 = null;
		anIntArray181 = null;
		anIntArray182 = null;
		anIntArray179 = null;
		anIntArray184 = null;
	}

	public void method94(int arg0)
	{
		anIntArray182[arg0] = aClass33_Sub11_177.anInt2239;
	}

	public int method95()
	{
		return anIntArray182.length;
	}

	public void method96(byte arg0[])
	{
		aClass33_Sub11_177.aByteArray2296 = arg0;
		aClass33_Sub11_177.anInt2239 = 10;
		int i = aClass33_Sub11_177.method666(90);
		anInt183 = aClass33_Sub11_177.method666(121);
		anInt180 = 0x7a120;
		anIntArray181 = new int[i];
		for(int j = 0; j < i;)
		{
			int k = aClass33_Sub11_177.method623((byte)-115);
			int i1 = aClass33_Sub11_177.method623((byte)43);
			if(k == 0x4d54726b)
			{
				anIntArray181[j] = aClass33_Sub11_177.anInt2239;
				j++;
			}
			aClass33_Sub11_177.anInt2239 += i1;
		}

		aLong185 = 0L;
		anIntArray182 = new int[i];
		for(int l = 0; l < i; l++)
			anIntArray182[l] = anIntArray181[l];

		anIntArray179 = new int[i];
		anIntArray184 = new int[i];
	}

	public long method97(int arg0)
	{
		return aLong185 + (long)arg0 * (long)anInt180;
	}

	public void method98(int arg0)
	{
		aClass33_Sub11_177.anInt2239 = anIntArray182[arg0];
	}

	public boolean method99()
	{
		return aClass33_Sub11_177.aByteArray2296 != null;
	}

	public void method100(long arg0)
	{
		aLong185 = arg0;
		int i = anIntArray182.length;
		for(int j = 0; j < i; j++)
		{
			anIntArray179[j] = 0;
			anIntArray184[j] = 0;
			aClass33_Sub11_177.anInt2239 = anIntArray181[j];
			method91(j);
			anIntArray182[j] = aClass33_Sub11_177.anInt2239;
		}

	}

	public int method101(int arg0, int arg1)
	{
		if(arg1 == 255)
		{
			int i = aClass33_Sub11_177.method639((byte)123);
			int j = aClass33_Sub11_177.method635((byte)-24);
			if(i == 47)
			{
				aClass33_Sub11_177.anInt2239 += j;
				return 1;
			}
			if(i == 81)
			{
				int l = aClass33_Sub11_177.method626((byte)-114);
				j -= 3;
				int i1 = anIntArray179[arg0];
				aLong185 += (long)i1 * (long)(anInt180 - l);
				anInt180 = l;
				aClass33_Sub11_177.anInt2239 += j;
				return 2;
			} else
			{
				aClass33_Sub11_177.anInt2239 += j;
				return 3;
			}
		}
		byte byte0 = aByteArray178[arg1 - 128];
		int k = arg1;
		if(byte0 >= 1)
			k |= aClass33_Sub11_177.method639((byte)123) << 8;
		if(byte0 >= 2)
			k |= aClass33_Sub11_177.method639((byte)123) << 16;
		return k;
	}

	public static void method102()
	{
		aByteArray178 = null;
	}

	public Class10()
	{
		aClass33_Sub11_177 = new Class33_Sub11(null);
	}

	public Class10(byte arg0[])
	{
		aClass33_Sub11_177 = new Class33_Sub11(null);
		method96(arg0);
	}

	public Class33_Sub11 aClass33_Sub11_177;
	public static byte aByteArray178[] = {
		2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
		1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 
		2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
		2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0
	};
	public int anIntArray179[];
	public int anInt180;
	public int anIntArray181[];
	public int anIntArray182[];
	public int anInt183;
	public int anIntArray184[];
	public long aLong185;

}
