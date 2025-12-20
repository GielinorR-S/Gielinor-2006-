// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class28.java


public class Class28
{

	public static void method211()
	{
		anIntArray572 = null;
		anIntArray576 = null;
		anIntArray571 = null;
		anIntArray575 = null;
	}

	public Class28(byte arg0[], Class33_Sub16 arg1)
	{
		anInt569 = -1;
		aBoolean574 = false;
		aClass33_Sub16_577 = null;
		aClass33_Sub16_577 = arg1;
		Class33_Sub11 class33_sub11 = new Class33_Sub11(arg0);
		Class33_Sub11 class33_sub11_1 = new Class33_Sub11(arg0);
		class33_sub11.anInt2239 = 2;
		int i = class33_sub11.method639((byte)123);
		int j = -1;
		int k = 0;
		class33_sub11_1.anInt2239 = class33_sub11.anInt2239 + i;
		for(int l = 0; l < i; l++)
		{
			int i1 = class33_sub11.method639((byte)123);
			if(i1 > 0)
			{
				if(aClass33_Sub16_577.anIntArray2483[l] != 0)
				{
					for(int k1 = l - 1; k1 > j; k1--)
					{
						if(aClass33_Sub16_577.anIntArray2483[k1] != 0)
							continue;
						anIntArray572[k] = k1;
						anIntArray576[k] = 0;
						anIntArray571[k] = 0;
						anIntArray575[k] = 0;
						k++;
						break;
					}

				}
				anIntArray572[k] = l;
				char c = '\0';
				if(aClass33_Sub16_577.anIntArray2483[l] == 3)
					c = '\200';
				if((i1 & 1) != 0)
					anIntArray576[k] = class33_sub11_1.method647(126);
				else
					anIntArray576[k] = c;
				if((i1 & 2) != 0)
					anIntArray571[k] = class33_sub11_1.method647(91);
				else
					anIntArray571[k] = c;
				if((i1 & 4) != 0)
					anIntArray575[k] = class33_sub11_1.method647(99);
				else
					anIntArray575[k] = c;
				j = l;
				k++;
				if(aClass33_Sub16_577.anIntArray2483[l] == 5)
					aBoolean574 = true;
			}
		}

		if(class33_sub11_1.anInt2239 != arg0.length)
			throw new RuntimeException();
		anInt569 = k;
		anIntArray573 = new int[k];
		anIntArray568 = new int[k];
		anIntArray578 = new int[k];
		anIntArray570 = new int[k];
		for(int j1 = 0; j1 < k; j1++)
		{
			anIntArray573[j1] = anIntArray572[j1];
			anIntArray568[j1] = anIntArray576[j1];
			anIntArray578[j1] = anIntArray571[j1];
			anIntArray570[j1] = anIntArray575[j1];
		}

	}

	public int anIntArray568[];
	public int anInt569;
	public int anIntArray570[];
	public static int anIntArray571[] = new int[500];
	public static int anIntArray572[] = new int[500];
	public int anIntArray573[];
	public boolean aBoolean574;
	public static int anIntArray575[] = new int[500];
	public static int anIntArray576[] = new int[500];
	public Class33_Sub16 aClass33_Sub16_577;
	public int anIntArray578[];

}
