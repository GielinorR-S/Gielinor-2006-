// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class64.java

import java.util.Random;

public class Class64
{

	public int method1085(int arg0, int arg1, int arg2)
	{
		if(arg2 == 1)
			if((arg0 & 0x7fff) < 16384)
				return arg1;
			else
				return -arg1;
		if(arg2 == 2)
			return anIntArray1368[arg0 & 0x7fff] * arg1 >> 14;
		if(arg2 == 3)
			return ((arg0 & 0x7fff) * arg1 >> 14) - arg1;
		if(arg2 == 4)
			return anIntArray1376[arg0 / 2607 & 0x7fff] * arg1;
		else
			return 0;
	}

	public int[] method1086(int arg0, int arg1)
	{
		Class53.method956(anIntArray1361, 0, arg0);
		if(arg1 < 10)
			return anIntArray1361;
		double d = (double)arg0 / ((double)arg1 + 0.0D);
		aClass2_1369.method49();
		aClass2_1372.method49();
		int i = 0;
		int j = 0;
		int k = 0;
		if(aClass2_1365 != null)
		{
			aClass2_1365.method49();
			aClass2_1370.method49();
			i = (int)(((double)(aClass2_1365.anInt102 - aClass2_1365.anInt97) * 32.768000000000001D) / d);
			j = (int)(((double)aClass2_1365.anInt97 * 32.768000000000001D) / d);
		}
		int l = 0;
		int i1 = 0;
		int j1 = 0;
		if(aClass2_1360 != null)
		{
			aClass2_1360.method49();
			aClass2_1359.method49();
			l = (int)(((double)(aClass2_1360.anInt102 - aClass2_1360.anInt97) * 32.768000000000001D) / d);
			i1 = (int)(((double)aClass2_1360.anInt97 * 32.768000000000001D) / d);
		}
		for(int k1 = 0; k1 < 5; k1++)
			if(anIntArray1362[k1] != 0)
			{
				anIntArray1382[k1] = 0;
				anIntArray1380[k1] = (int)((double)anIntArray1364[k1] * d);
				anIntArray1378[k1] = (anIntArray1362[k1] << 14) / 100;
				anIntArray1381[k1] = (int)(((double)(aClass2_1369.anInt102 - aClass2_1369.anInt97) * 32.768000000000001D * Math.pow(1.0057929410678534D, anIntArray1374[k1])) / d);
				anIntArray1379[k1] = (int)(((double)aClass2_1369.anInt97 * 32.768000000000001D) / d);
			}

		for(int l1 = 0; l1 < arg0; l1++)
		{
			int i2 = aClass2_1369.method47(arg0);
			int k3 = aClass2_1372.method47(arg0);
			if(aClass2_1365 != null)
			{
				int k4 = aClass2_1365.method47(arg0);
				int k5 = aClass2_1370.method47(arg0);
				i2 += method1085(k, k5, aClass2_1365.anInt100) >> 1;
				k += (k4 * i >> 16) + j;
			}
			if(aClass2_1360 != null)
			{
				int l4 = aClass2_1360.method47(arg0);
				int l5 = aClass2_1359.method47(arg0);
				k3 = k3 * ((method1085(j1, l5, aClass2_1360.anInt100) >> 1) + 32768) >> 15;
				j1 += (l4 * l >> 16) + i1;
			}
			for(int i5 = 0; i5 < 5; i5++)
				if(anIntArray1362[i5] != 0)
				{
					int i6 = l1 + anIntArray1380[i5];
					if(i6 < arg0)
					{
						anIntArray1361[i6] += method1085(anIntArray1382[i5], k3 * anIntArray1378[i5] >> 15, aClass2_1369.anInt100);
						anIntArray1382[i5] += (i2 * anIntArray1381[i5] >> 16) + anIntArray1379[i5];
					}
				}

		}

		if(aClass2_1377 != null)
		{
			aClass2_1377.method49();
			aClass2_1373.method49();
			int j2 = 0;
			boolean flag = false;
			boolean flag1 = true;
			for(int j6 = 0; j6 < arg0; j6++)
			{
				int l6 = aClass2_1377.method47(arg0);
				int j7 = aClass2_1373.method47(arg0);
				int l3;
				if(flag1)
					l3 = aClass2_1377.anInt97 + ((aClass2_1377.anInt102 - aClass2_1377.anInt97) * l6 >> 8);
				else
					l3 = aClass2_1377.anInt97 + ((aClass2_1377.anInt102 - aClass2_1377.anInt97) * j7 >> 8);
				if((j2 += 256) >= l3)
				{
					j2 = 0;
					flag1 = !flag1;
				}
				if(flag1)
					anIntArray1361[j6] = 0;
			}

		}
		if(anInt1367 > 0 && anInt1375 > 0)
		{
			int k2 = (int)((double)anInt1367 * d);
			for(int i4 = k2; i4 < arg0; i4++)
				anIntArray1361[i4] += (anIntArray1361[i4 - k2] * anInt1375) / 100;

		}
		if(aClass67_1366.anIntArray1433[0] > 0 || aClass67_1366.anIntArray1433[1] > 0)
		{
			aClass2_1358.method49();
			int l2 = aClass2_1358.method47(arg0 + 1);
			int j4 = aClass67_1366.method1102(0, (float)l2 / 65536F);
			int j5 = aClass67_1366.method1102(1, (float)l2 / 65536F);
			if(arg0 >= j4 + j5)
			{
				int k6 = 0;
				int i7 = j5;
				if(i7 > arg0 - j4)
					i7 = arg0 - j4;
				for(; k6 < i7; k6++)
				{
					int k7 = (int)((long)anIntArray1361[k6 + j4] * (long)Class67.anInt1432 >> 16);
					for(int j8 = 0; j8 < j4; j8++)
						k7 += (int)((long)anIntArray1361[(k6 + j4) - 1 - j8] * (long)Class67.anIntArrayArray1434[0][j8] >> 16);

					for(int i9 = 0; i9 < k6; i9++)
						k7 -= (int)((long)anIntArray1361[k6 - 1 - i9] * (long)Class67.anIntArrayArray1434[1][i9] >> 16);

					anIntArray1361[k6] = k7;
					l2 = aClass2_1358.method47(arg0 + 1);
				}

				i7 = 128;
				do
				{
					if(i7 > arg0 - j4)
						i7 = arg0 - j4;
					for(; k6 < i7; k6++)
					{
						int l7 = (int)((long)anIntArray1361[k6 + j4] * (long)Class67.anInt1432 >> 16);
						for(int k8 = 0; k8 < j4; k8++)
							l7 += (int)((long)anIntArray1361[(k6 + j4) - 1 - k8] * (long)Class67.anIntArrayArray1434[0][k8] >> 16);

						for(int j9 = 0; j9 < j5; j9++)
							l7 -= (int)((long)anIntArray1361[k6 - 1 - j9] * (long)Class67.anIntArrayArray1434[1][j9] >> 16);

						anIntArray1361[k6] = l7;
						l2 = aClass2_1358.method47(arg0 + 1);
					}

					if(k6 >= arg0 - j4)
						break;
					j4 = aClass67_1366.method1102(0, (float)l2 / 65536F);
					j5 = aClass67_1366.method1102(1, (float)l2 / 65536F);
					i7 += 128;
				} while(true);
				for(; k6 < arg0; k6++)
				{
					int i8 = 0;
					for(int l8 = (k6 + j4) - arg0; l8 < j4; l8++)
						i8 += (int)((long)anIntArray1361[(k6 + j4) - 1 - l8] * (long)Class67.anIntArrayArray1434[0][l8] >> 16);

					for(int k9 = 0; k9 < j5; k9++)
						i8 -= (int)((long)anIntArray1361[k6 - 1 - k9] * (long)Class67.anIntArrayArray1434[1][k9] >> 16);

					anIntArray1361[k6] = i8;
					int i3 = aClass2_1358.method47(arg0 + 1);
				}

			}
		}
		for(int j3 = 0; j3 < arg0; j3++)
		{
			if(anIntArray1361[j3] < -32768)
				anIntArray1361[j3] = -32768;
			if(anIntArray1361[j3] > 32767)
				anIntArray1361[j3] = 32767;
		}

		return anIntArray1361;
	}

	public void method1087(Class33_Sub11 arg0)
	{
		aClass2_1369 = new Class2();
		aClass2_1369.method48(arg0);
		aClass2_1372 = new Class2();
		aClass2_1372.method48(arg0);
		int i = arg0.method639((byte)123);
		if(i != 0)
		{
			arg0.anInt2239--;
			aClass2_1365 = new Class2();
			aClass2_1365.method48(arg0);
			aClass2_1370 = new Class2();
			aClass2_1370.method48(arg0);
		}
		i = arg0.method639((byte)123);
		if(i != 0)
		{
			arg0.anInt2239--;
			aClass2_1360 = new Class2();
			aClass2_1360.method48(arg0);
			aClass2_1359 = new Class2();
			aClass2_1359.method48(arg0);
		}
		i = arg0.method639((byte)123);
		if(i != 0)
		{
			arg0.anInt2239--;
			aClass2_1377 = new Class2();
			aClass2_1377.method48(arg0);
			aClass2_1373 = new Class2();
			aClass2_1373.method48(arg0);
		}
		for(int j = 0; j < 10; j++)
		{
			int k = arg0.method651(-7);
			if(k == 0)
				break;
			anIntArray1362[j] = k;
			anIntArray1374[j] = arg0.method647(95);
			anIntArray1364[j] = arg0.method651(-100);
		}

		anInt1367 = arg0.method651(-77);
		anInt1375 = arg0.method651(-4);
		anInt1371 = arg0.method666(61);
		anInt1363 = arg0.method666(41);
		aClass67_1366 = new Class67();
		aClass2_1358 = new Class2();
		aClass67_1366.method1101(arg0, aClass2_1358);
	}

	public static void method1088()
	{
		anIntArray1361 = null;
		anIntArray1376 = null;
		anIntArray1368 = null;
		anIntArray1382 = null;
		anIntArray1380 = null;
		anIntArray1378 = null;
		anIntArray1381 = null;
		anIntArray1379 = null;
	}

	public Class64()
	{
		anIntArray1364 = new int[5];
		anInt1367 = 0;
		anIntArray1362 = new int[5];
		anInt1371 = 500;
		anInt1363 = 0;
		anInt1375 = 100;
		anIntArray1374 = new int[5];
	}

	public Class2 aClass2_1358;
	public Class2 aClass2_1359;
	public Class2 aClass2_1360;
	public static int anIntArray1361[] = new int[0x35d54];
	public int anIntArray1362[];
	public int anInt1363;
	public int anIntArray1364[];
	public Class2 aClass2_1365;
	public Class67 aClass67_1366;
	public int anInt1367;
	public static int anIntArray1368[];
	public Class2 aClass2_1369;
	public Class2 aClass2_1370;
	public int anInt1371;
	public Class2 aClass2_1372;
	public Class2 aClass2_1373;
	public int anIntArray1374[];
	public int anInt1375;
	public static int anIntArray1376[];
	public Class2 aClass2_1377;
	public static int anIntArray1378[] = new int[5];
	public static int anIntArray1379[] = new int[5];
	public static int anIntArray1380[] = new int[5];
	public static int anIntArray1381[] = new int[5];
	public static int anIntArray1382[] = new int[5];

	static 
	{
		anIntArray1376 = new int[32768];
		Random random = new Random(0L);
		for(int i = 0; i < 32768; i++)
			anIntArray1376[i] = (random.nextInt() & 2) - 1;

		anIntArray1368 = new int[32768];
		for(int j = 0; j < 32768; j++)
			anIntArray1368[j] = (int)(Math.sin((double)j / 5215.1903000000002D) * 16384D);

	}
}
