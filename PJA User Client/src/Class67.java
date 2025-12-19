// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class67.java


public class Class67
{

	public void method1101(Class33_Sub11 arg0, Class2 arg1)
	{
		int i = arg0.method639((byte)123);
		anIntArray1433[0] = i >> 4;
		anIntArray1433[1] = i & 0xf;
		if(i != 0)
		{
			anIntArray1439[0] = arg0.method666(40);
			anIntArray1439[1] = arg0.method666(101);
			int j = arg0.method639((byte)123);
			for(int k = 0; k < 2; k++)
			{
				for(int l = 0; l < anIntArray1433[k]; l++)
				{
					anIntArrayArrayArray1436[k][0][l] = arg0.method666(86);
					anIntArrayArrayArray1437[k][0][l] = arg0.method666(118);
				}

			}

			for(int i1 = 0; i1 < 2; i1++)
			{
				for(int j1 = 0; j1 < anIntArray1433[i1]; j1++)
					if((j & 1 << i1 * 4 << j1) != 0)
					{
						anIntArrayArrayArray1436[i1][1][j1] = arg0.method666(101);
						anIntArrayArrayArray1437[i1][1][j1] = arg0.method666(102);
					} else
					{
						anIntArrayArrayArray1436[i1][1][j1] = anIntArrayArrayArray1436[i1][0][j1];
						anIntArrayArrayArray1437[i1][1][j1] = anIntArrayArrayArray1437[i1][0][j1];
					}

			}

			if(j != 0 || anIntArray1439[1] != anIntArray1439[0])
				arg1.method50(arg0);
			return;
		} else
		{
			anIntArray1439[0] = anIntArray1439[1] = 0;
			return;
		}
	}

	public int method1102(int arg0, float arg1)
	{
		if(arg0 == 0)
		{
			float f = (float)anIntArray1439[0] + (float)(anIntArray1439[1] - anIntArray1439[0]) * arg1;
			f *= 0.003051758F;
			aFloat1435 = (float)Math.pow(0.10000000000000001D, f / 20F);
			anInt1432 = (int)(aFloat1435 * 65536F);
		}
		if(anIntArray1433[arg0] == 0)
			return 0;
		float f1 = method1103(arg0, 0, arg1);
		aFloatArrayArray1438[arg0][0] = -2F * f1 * (float)Math.cos(method1106(arg0, 0, arg1));
		aFloatArrayArray1438[arg0][1] = f1 * f1;
		for(int i = 1; i < anIntArray1433[arg0]; i++)
		{
			float f2 = method1103(arg0, i, arg1);
			float f3 = -2F * f2 * (float)Math.cos(method1106(arg0, i, arg1));
			float f4 = f2 * f2;
			aFloatArrayArray1438[arg0][i * 2 + 1] = aFloatArrayArray1438[arg0][i * 2 - 1] * f4;
			aFloatArrayArray1438[arg0][i * 2] = aFloatArrayArray1438[arg0][i * 2 - 1] * f3 + aFloatArrayArray1438[arg0][i * 2 - 2] * f4;
			for(int l = i * 2 - 1; l >= 2; l--)
				aFloatArrayArray1438[arg0][l] += aFloatArrayArray1438[arg0][l - 1] * f3 + aFloatArrayArray1438[arg0][l - 2] * f4;

			aFloatArrayArray1438[arg0][1] += aFloatArrayArray1438[arg0][0] * f3 + f4;
			aFloatArrayArray1438[arg0][0] += f3;
		}

		if(arg0 == 0)
		{
			for(int j = 0; j < anIntArray1433[0] * 2; j++)
				aFloatArrayArray1438[0][j] *= aFloat1435;

		}
		for(int k = 0; k < anIntArray1433[arg0] * 2; k++)
			anIntArrayArray1434[arg0][k] = (int)(aFloatArrayArray1438[arg0][k] * 65536F);

		return anIntArray1433[arg0] * 2;
	}

	public float method1103(int arg0, int arg1, float arg2)
	{
		float f = (float)anIntArrayArrayArray1437[arg0][0][arg1] + arg2 * (float)(anIntArrayArrayArray1437[arg0][1][arg1] - anIntArrayArrayArray1437[arg0][0][arg1]);
		f *= 0.001525879F;
		return 1.0F - (float)Math.pow(10D, -f / 20F);
	}

	public static void method1104()
	{
		aFloatArrayArray1438 = null;
		anIntArrayArray1434 = null;
	}

	public static float method1105(float arg0)
	{
		float f = 32.7032F * (float)Math.pow(2D, arg0);
		return (f * 3.141593F) / 11025F;
	}

	public float method1106(int arg0, int arg1, float arg2)
	{
		float f = (float)anIntArrayArrayArray1436[arg0][0][arg1] + arg2 * (float)(anIntArrayArrayArray1436[arg0][1][arg1] - anIntArrayArrayArray1436[arg0][0][arg1]);
		f *= 0.0001220703F;
		return method1105(f);
	}

	public Class67()
	{
		anIntArray1433 = new int[2];
		anIntArrayArrayArray1436 = new int[2][2][4];
		anIntArray1439 = new int[2];
		anIntArrayArrayArray1437 = new int[2][2][4];
	}

	public static int anInt1432;
	public int anIntArray1433[];
	public static int anIntArrayArray1434[][] = new int[2][8];
	public static float aFloat1435;
	public int anIntArrayArrayArray1436[][][];
	public int anIntArrayArrayArray1437[][][];
	public static float aFloatArrayArray1438[][] = new float[2][8];
	public int anIntArray1439[];

}
