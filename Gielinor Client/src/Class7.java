// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class7.java


public class Class7
{

	public void method80()
	{
		int ai[] = new int[anInt154];
		int ai1[] = new int[33];
		for(int i = 0; i < anInt154; i++)
		{
			int j = anIntArray157[i];
			if(j != 0)
			{
				int l = 1 << 32 - j;
				int j1 = ai1[j];
				ai[i] = j1;
				int l1;
				if((j1 & l) != 0)
				{
					l1 = ai1[j - 1];
				} else
				{
					l1 = j1 | l;
					for(int j2 = j - 1; j2 >= 1; j2--)
					{
						int i3 = ai1[j2];
						if(i3 != j1)
							break;
						int l3 = 1 << 32 - j2;
						if((i3 & l3) != 0)
						{
							ai1[j2] = ai1[j2 - 1];
							break;
						}
						ai1[j2] = i3 | l3;
					}

				}
				ai1[j] = l1;
				for(int k2 = j + 1; k2 <= 32; k2++)
				{
					int j3 = ai1[k2];
					if(j3 == j1)
						ai1[k2] = l1;
				}

			}
		}

		anIntArray159 = new int[8];
		int k = 0;
		for(int i1 = 0; i1 < anInt154; i1++)
		{
			int k1 = anIntArray157[i1];
			if(k1 != 0)
			{
				int i2 = ai[i1];
				int l2 = 0;
				for(int k3 = 0; k3 < k1; k3++)
				{
					int i4 = 0x80000000 >>> k3;
					if((i2 & i4) != 0)
					{
						if(anIntArray159[l2] == 0)
							anIntArray159[l2] = k;
						l2 = anIntArray159[l2];
					} else
					{
						l2++;
					}
					if(l2 >= anIntArray159.length)
					{
						int ai2[] = new int[anIntArray159.length * 2];
						for(int j4 = 0; j4 < anIntArray159.length; j4++)
							ai2[j4] = anIntArray159[j4];

						anIntArray159 = ai2;
					}
					i4 >>>= 1;
				}

				anIntArray159[l2] = ~i1;
				if(l2 >= k)
					k = l2 + 1;
			}
		}

	}

	public int method81()
	{
		int i;
		for(i = 0; anIntArray159[i] >= 0; i = Class52.method945() == 0 ? i + 1 : anIntArray159[i]);
		return ~anIntArray159[i];
	}

	public static int method82(int arg0, int arg1)
	{
		int i;
		for(i = (int)Math.pow(arg0, 1.0D / (double)arg1) + 1; Class16.method151(arg1, i, 52) > arg0; i--);
		return i;
	}

	public float[] method83()
	{
		return aFloatArrayArray155[method81()];
	}

	public Class7()
	{
		Class52.method947(24);
		anInt156 = Class52.method947(16);
		anInt154 = Class52.method947(24);
		anIntArray157 = new int[anInt154];
		boolean flag = Class52.method945() != 0;
		if(flag)
		{
			int i = 0;
			for(int k = Class52.method947(5) + 1; i < anInt154; k++)
			{
				int i1 = Class52.method947(Class58.method1058(anInt154 - i, (byte)-98));
				for(int j1 = 0; j1 < i1; j1++)
					anIntArray157[i++] = k;

			}

		} else
		{
			boolean flag1 = Class52.method945() != 0;
			for(int l = 0; l < anInt154; l++)
				if(flag1 && Class52.method945() == 0)
					anIntArray157[l] = 0;
				else
					anIntArray157[l] = Class52.method947(5) + 1;

		}
		method80();
		int j = Class52.method947(4);
		if(j > 0)
		{
			float f = Class52.method953(Class52.method947(32));
			float f1 = Class52.method953(Class52.method947(32));
			int k1 = Class52.method947(4) + 1;
			boolean flag2 = Class52.method945() != 0;
			int l1;
			if(j == 1)
				l1 = method82(anInt154, anInt156);
			else
				l1 = anInt154 * anInt156;
			anIntArray158 = new int[l1];
			for(int i2 = 0; i2 < l1; i2++)
				anIntArray158[i2] = Class52.method947(k1);

			aFloatArrayArray155 = new float[anInt154][anInt156];
			if(j == 1)
			{
				for(int j2 = 0; j2 < anInt154; j2++)
				{
					float f2 = 0.0F;
					int l2 = 1;
					for(int j3 = 0; j3 < anInt156; j3++)
					{
						int l3 = (j2 / l2) % l1;
						float f5 = (float)anIntArray158[l3] * f1 + f + f2;
						aFloatArrayArray155[j2][j3] = f5;
						if(flag2)
							f2 = f5;
						l2 *= l1;
					}

				}

				return;
			}
			for(int k2 = 0; k2 < anInt154; k2++)
			{
				float f3 = 0.0F;
				int i3 = k2 * anInt156;
				for(int k3 = 0; k3 < anInt156; k3++)
				{
					float f4 = (float)anIntArray158[i3] * f1 + f + f3;
					aFloatArrayArray155[k2][k3] = f4;
					if(flag2)
						f3 = f4;
					i3++;
				}

			}

		}
	}

	public int anInt154;
	public float aFloatArrayArray155[][];
	public int anInt156;
	public int anIntArray157[];
	public int anIntArray158[];
	public int anIntArray159[];
}
