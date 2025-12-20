// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class79_Sub2.java

import java.awt.Component;

public class Class79_Sub2 extends Class79
{

	public int method1187()
	{
		return anInterface3_2652.method7(70, anInt2651);
	}

	public void method1186(Component arg0)
		throws Exception
	{
		anInterface3_2652.method5(false, Class39.aBoolean857, arg0, Class39.anInt863);
	}

	public void method1188()
	{
		anInterface3_2652.method6(true, anInt2651);
	}

	public void method1192(int arg0)
		throws Exception
	{
		if(arg0 > 32768)
		{
			throw new IllegalArgumentException();
		} else
		{
			anInterface3_2652.method8(arg0, anInt2651, -32717);
			return;
		}
	}

	public void method1196()
	{
		anInterface3_2652.method9(anInt2651, super.anIntArray1687);
	}

	public void method1194()
	{
		anInterface3_2652.method10((byte)-28, anInt2651);
	}

	public static void method1203()
	{
		anInterface3_2652 = null;
	}

	public Class79_Sub2(Class72 arg0, int arg1)
	{
		anInterface3_2652 = arg0.method1149(-106);
		anInt2651 = arg1;
	}

	public int anInt2651;
	public static Interface3 anInterface3_2652;
}
