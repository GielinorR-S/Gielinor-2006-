// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub13_Sub2.java


public class Class33_Sub13_Sub2 extends Class33_Sub13
{

	public int method695()
	{
		return 0;
	}

	public void method736(Class33 arg0, Class33_Sub1 arg1)
	{
		for(; arg0 != aClass4_3233.aClass33_134 && ((Class33_Sub1)arg0).anInt2015 <= arg1.anInt2015; arg0 = arg0.aClass33_735);
		aClass4_3233.method65(arg1, arg0, -124);
		anInt3235 = ((Class33_Sub1)aClass4_3233.aClass33_134.aClass33_735).anInt2015;
	}

	public synchronized void method689(int arg0[], int arg1, int arg2)
	{
		do
		{
			if(anInt3235 < 0)
			{
				method741(arg0, arg1, arg2);
				return;
			}
			if(anInt3234 + arg2 < anInt3235)
			{
				anInt3234 += arg2;
				method741(arg0, arg1, arg2);
				return;
			}
			int i = anInt3235 - anInt3234;
			method741(arg0, arg1, i);
			arg1 += i;
			arg2 -= i;
			anInt3234 += i;
			method740();
			Class33_Sub1 class33_sub1 = (Class33_Sub1)aClass4_3233.method68(18823);
			synchronized(class33_sub1)
			{
				int j = class33_sub1.method272(this);
				if(j < 0)
				{
					class33_sub1.anInt2015 = 0;
					method739(class33_sub1);
				} else
				{
					class33_sub1.anInt2015 = j;
					method736(((Class33) (class33_sub1)).aClass33_735, class33_sub1);
				}
			}
		} while(arg2 != 0);
	}

	public void method737(int arg0)
	{
		for(Class33_Sub13 class33_sub13 = (Class33_Sub13)aClass4_3232.method68(18823); class33_sub13 != null; class33_sub13 = (Class33_Sub13)aClass4_3232.method66((byte)-128))
			class33_sub13.method694(arg0);

	}

	public Class33_Sub13 method692()
	{
		return (Class33_Sub13)aClass4_3232.method66((byte)-126);
	}

	public synchronized void method738(Class33_Sub13 arg0)
	{
		arg0.method266(-105);
	}

	public void method739(Class33_Sub1 arg0)
	{
		arg0.method266(-17);
		arg0.method273();
		Class33 class33 = aClass4_3233.aClass33_134.aClass33_735;
		if(class33 == aClass4_3233.aClass33_134)
		{
			anInt3235 = -1;
			return;
		} else
		{
			anInt3235 = ((Class33_Sub1)class33).anInt2015;
			return;
		}
	}

	public Class33_Sub13 method691()
	{
		return (Class33_Sub13)aClass4_3232.method68(18823);
	}

	public void method740()
	{
		if(anInt3234 > 0)
		{
			for(Class33_Sub1 class33_sub1 = (Class33_Sub1)aClass4_3233.method68(18823); class33_sub1 != null; class33_sub1 = (Class33_Sub1)aClass4_3233.method66((byte)-126))
				class33_sub1.anInt2015 -= anInt3234;

			anInt3235 -= anInt3234;
			anInt3234 = 0;
		}
	}

	public void method741(int arg0[], int arg1, int arg2)
	{
		for(Class33_Sub13 class33_sub13 = (Class33_Sub13)aClass4_3232.method68(18823); class33_sub13 != null; class33_sub13 = (Class33_Sub13)aClass4_3232.method66((byte)-128))
			class33_sub13.method693(arg0, arg1, arg2);

	}

	public synchronized void method742(Class33_Sub13 arg0)
	{
		aClass4_3232.method61(arg0, 0);
	}

	public synchronized void method694(int arg0)
	{
		do
		{
			if(anInt3235 < 0)
			{
				method737(arg0);
				return;
			}
			if(anInt3234 + arg0 < anInt3235)
			{
				anInt3234 += arg0;
				method737(arg0);
				return;
			}
			int i = anInt3235 - anInt3234;
			method737(i);
			arg0 -= i;
			anInt3234 += i;
			method740();
			Class33_Sub1 class33_sub1 = (Class33_Sub1)aClass4_3233.method68(18823);
			synchronized(class33_sub1)
			{
				int j = class33_sub1.method272(this);
				if(j < 0)
				{
					class33_sub1.anInt2015 = 0;
					method739(class33_sub1);
				} else
				{
					class33_sub1.anInt2015 = j;
					method736(((Class33) (class33_sub1)).aClass33_735, class33_sub1);
				}
			}
		} while(arg0 != 0);
	}

	public Class33_Sub13_Sub2()
	{
		aClass4_3232 = new Class4();
		aClass4_3233 = new Class4();
		anInt3234 = 0;
		anInt3235 = -1;
	}

	public Class4 aClass4_3232;
	public Class4 aClass4_3233;
	public int anInt3234;
	public int anInt3235;
}
