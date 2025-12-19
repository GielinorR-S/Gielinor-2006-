// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class76.java


public class Class76
{

	public void method1167(float arg0[], int arg1, boolean arg2)
	{
		for(int i = 0; i < arg1; i++)
			arg0[i] = 0.0F;

		if(arg2)
			return;
		int j = Class52.aClass7Array1113[anInt1639].anInt156;
		int k = anInt1636 - anInt1638;
		int l = k / anInt1635;
		int ai[] = new int[l];
		for(int i1 = 0; i1 < 8; i1++)
		{
			for(int j1 = 0; j1 < l;)
			{
				if(i1 == 0)
				{
					int k1 = Class52.aClass7Array1113[anInt1639].method81();
					for(int i2 = j - 1; i2 >= 0; i2--)
					{
						if(j1 + i2 < l)
							ai[j1 + i2] = k1 % anInt1640;
						k1 /= anInt1640;
					}

				}
				for(int l1 = 0; l1 < j; l1++)
				{
					int j2 = ai[j1];
					int k2 = anIntArray1634[j2 * 8 + i1];
					if(k2 >= 0)
					{
						int l2 = anInt1638 + j1 * anInt1635;
						Class7 class7 = Class52.aClass7Array1113[k2];
						if(anInt1637 == 0)
						{
							int i3 = anInt1635 / class7.anInt156;
							for(int k3 = 0; k3 < i3; k3++)
							{
								float af1[] = class7.method83();
								for(int i4 = 0; i4 < class7.anInt156; i4++)
									arg0[l2 + k3 + i4 * i3] += af1[i4];

							}

						} else
						{
							for(int j3 = 0; j3 < anInt1635;)
							{
								float af[] = class7.method83();
								for(int l3 = 0; l3 < class7.anInt156; l3++)
								{
									arg0[l2 + j3] += af[l3];
									j3++;
								}

							}

						}
					}
					if(++j1 >= l)
						break;
				}

			}

		}

	}

	public Class76()
	{
		anInt1637 = Class52.method947(16);
		anInt1638 = Class52.method947(24);
		anInt1636 = Class52.method947(24);
		anInt1635 = Class52.method947(24) + 1;
		anInt1640 = Class52.method947(6) + 1;
		anInt1639 = Class52.method947(8);
		int ai[] = new int[anInt1640];
		for(int i = 0; i < anInt1640; i++)
		{
			int j = 0;
			int l = Class52.method947(3);
			boolean flag = Class52.method945() != 0;
			if(flag)
				j = Class52.method947(5);
			ai[i] = j << 3 | l;
		}

		anIntArray1634 = new int[anInt1640 * 8];
		for(int k = 0; k < anInt1640 * 8; k++)
			anIntArray1634[k] = (ai[k >> 3] & 1 << (k & 7)) == 0 ? -1 : Class52.method947(8);

	}

	public int anIntArray1634[];
	public int anInt1635;
	public int anInt1636;
	public int anInt1637;
	public int anInt1638;
	public int anInt1639;
	public int anInt1640;
}
