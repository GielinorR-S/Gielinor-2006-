// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class61.java


public class Class61
{

	public byte[] method1074()
	{
		int i = 0;
		for(int j = 0; j < 10; j++)
			if(aClass64Array1295[j] != null && aClass64Array1295[j].anInt1371 + aClass64Array1295[j].anInt1363 > i)
				i = aClass64Array1295[j].anInt1371 + aClass64Array1295[j].anInt1363;

		if(i == 0)
			return new byte[0];
		int k = (22050 * i) / 1000;
		byte abyte0[] = new byte[k];
		for(int l = 0; l < 10; l++)
			if(aClass64Array1295[l] != null)
			{
				int i1 = (aClass64Array1295[l].anInt1371 * 22050) / 1000;
				int j1 = (aClass64Array1295[l].anInt1363 * 22050) / 1000;
				int ai[] = aClass64Array1295[l].method1086(i1, aClass64Array1295[l].anInt1371);
				for(int k1 = 0; k1 < i1; k1++)
				{
					int l1 = abyte0[k1 + j1] + (ai[k1] >> 8);
					if((l1 + 128 & 0xffffff00) != 0)
						l1 = l1 >> 31 ^ 0x7f;
					abyte0[k1 + j1] = (byte)l1;
				}

			}

		return abyte0;
	}

	public Class33_Sub8_Sub1 method1075()
	{
		byte abyte0[] = method1074();
		return new Class33_Sub8_Sub1(22050, abyte0, (22050 * anInt1294) / 1000, (22050 * anInt1296) / 1000);
	}

	public int method1076()
	{
		int i = 0x98967f;
		for(int j = 0; j < 10; j++)
			if(aClass64Array1295[j] != null && aClass64Array1295[j].anInt1363 / 20 < i)
				i = aClass64Array1295[j].anInt1363 / 20;

		if(anInt1294 < anInt1296 && anInt1294 / 20 < i)
			i = anInt1294 / 20;
		if(i == 0x98967f || i == 0)
			return 0;
		for(int k = 0; k < 10; k++)
			if(aClass64Array1295[k] != null)
				aClass64Array1295[k].anInt1363 -= i * 20;

		if(anInt1294 < anInt1296)
		{
			anInt1294 -= i * 20;
			anInt1296 -= i * 20;
		}
		return i;
	}

	public static Class61 method1077(Class30 arg0, int arg1, int arg2)
	{
		byte abyte0[] = arg0.method238(false, arg2, arg1);
		if(abyte0 == null)
			return null;
		else
			return new Class61(new Class33_Sub11(abyte0));
	}

	public Class61(Class33_Sub11 arg0)
	{
		aClass64Array1295 = new Class64[10];
		for(int i = 0; i < 10; i++)
		{
			int j = arg0.method639((byte)123);
			if(j != 0)
			{
				arg0.anInt2239--;
				aClass64Array1295[i] = new Class64();
				aClass64Array1295[i].method1087(arg0);
			}
		}

		anInt1294 = arg0.method666(31);
		anInt1296 = arg0.method666(109);
	}

	public Class61()
	{
		aClass64Array1295 = new Class64[10];
	}

	public int anInt1294;
	public Class64 aClass64Array1295[];
	public int anInt1296;
}
