// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class25.java


public class Class25
{

	public static int method193(int arg0[], int arg1)
	{
		int i = arg0[arg1];
		int j = -1;
		int k = 0x7fffffff;
		for(int l = 0; l < arg1; l++)
		{
			int i1 = arg0[l];
			if(i1 > i && i1 < k)
			{
				j = l;
				k = i1;
			}
		}

		return j;
	}

	public void method194(int arg0, int arg1, int arg2, int arg3, float arg4[], int arg5)
	{
		int i = arg3 - arg1;
		int j = arg2 - arg0;
		int k = i >= 0 ? i : -i;
		int l = i / j;
		int i1 = arg1;
		int j1 = 0;
		int k1 = i >= 0 ? l + 1 : l - 1;
		k -= (l >= 0 ? l : -l) * j;
		arg4[arg0] *= aFloatArray525[i1];
		if(arg2 > arg5)
			arg2 = arg5;
		for(int l1 = arg0 + 1; l1 < arg2; l1++)
		{
			j1 += k;
			if(j1 >= j)
			{
				j1 -= j;
				i1 += k1;
			} else
			{
				i1 += l;
			}
			arg4[l1] *= aFloatArray525[i1];
		}

	}

	public void method195(int arg0, int arg1)
	{
		if(arg0 >= arg1)
			return;
		int i = arg0;
		int j = anIntArray519[i];
		int k = anIntArray528[i];
		boolean flag = aBooleanArray521[i];
		for(int l = arg0 + 1; l <= arg1; l++)
		{
			int i1 = anIntArray519[l];
			if(i1 < j)
			{
				anIntArray519[i] = i1;
				anIntArray528[i] = anIntArray528[l];
				aBooleanArray521[i] = aBooleanArray521[l];
				i++;
				anIntArray519[l] = anIntArray519[i];
				anIntArray528[l] = anIntArray528[i];
				aBooleanArray521[l] = aBooleanArray521[i];
			}
		}

		anIntArray519[i] = j;
		anIntArray528[i] = k;
		aBooleanArray521[i] = flag;
		method195(arg0, i - 1);
		method195(i + 1, arg1);
	}

	public boolean method196()
	{
		boolean flag = Class52.method945() != 0;
		if(!flag)
			return false;
		int i = anIntArray523.length;
		for(int j = 0; j < i; j++)
			anIntArray519[j] = anIntArray523[j];

		int k = anIntArray520[anInt522 - 1];
		int l = Class58.method1058(k - 1, (byte)-98);
		anIntArray528[0] = Class52.method947(l);
		anIntArray528[1] = Class52.method947(l);
		int i1 = 2;
		for(int j1 = 0; j1 < anIntArray530.length; j1++)
		{
			int k1 = anIntArray530[j1];
			int l1 = anIntArray529[k1];
			int i2 = anIntArray524[k1];
			int j2 = (1 << i2) - 1;
			int k2 = 0;
			if(i2 > 0)
				k2 = Class52.aClass7Array1113[anIntArray526[k1]].method81();
			for(int l2 = 0; l2 < l1; l2++)
			{
				int i3 = anIntArrayArray527[k1][k2 & j2];
				k2 >>>= i2;
				anIntArray528[i1++] = i3 < 0 ? 0 : Class52.aClass7Array1113[i3].method81();
			}

		}

		return true;
	}

	public static void method197()
	{
		anIntArray520 = null;
		aFloatArray525 = null;
		anIntArray519 = null;
		anIntArray528 = null;
		aBooleanArray521 = null;
	}

	public static int method198(int arg0[], int arg1)
	{
		int i = arg0[arg1];
		int j = -1;
		int k = 0x80000000;
		for(int l = 0; l < arg1; l++)
		{
			int i1 = arg0[l];
			if(i1 < i && i1 > k)
			{
				j = l;
				k = i1;
			}
		}

		return j;
	}

	public int method199(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		int i = arg3 - arg1;
		int j = arg2 - arg0;
		int k = i >= 0 ? i : -i;
		int l = k * (arg4 - arg0);
		int i1 = l / j;
		if(i < 0)
			return arg1 - i1;
		else
			return arg1 + i1;
	}

	public void method200(float arg0[], int arg1)
	{
		int i = anIntArray523.length;
		int j = anIntArray520[anInt522 - 1];
		aBooleanArray521[0] = aBooleanArray521[1] = true;
		for(int k = 2; k < i; k++)
		{
			int l = method198(anIntArray519, k);
			int j1 = method193(anIntArray519, k);
			int l1 = method199(anIntArray519[l], anIntArray528[l], anIntArray519[j1], anIntArray528[j1], anIntArray519[k]);
			int j2 = anIntArray528[k];
			int l2 = j - l1;
			int k3 = l1;
			int l3 = (l2 >= k3 ? k3 : l2) << 1;
			if(j2 != 0)
			{
				aBooleanArray521[l] = aBooleanArray521[j1] = true;
				aBooleanArray521[k] = true;
				if(j2 >= l3)
					anIntArray528[k] = l2 <= k3 ? ((l1 - j2) + l2) - 1 : (j2 - k3) + l1;
				else
					anIntArray528[k] = (j2 & 1) == 0 ? l1 + j2 / 2 : l1 - (j2 + 1) / 2;
			} else
			{
				aBooleanArray521[k] = false;
				anIntArray528[k] = l1;
			}
		}

		method195(0, i - 1);
		int i1 = 0;
		int k1 = anIntArray528[0] * anInt522;
		for(int i2 = 1; i2 < i; i2++)
			if(aBooleanArray521[i2])
			{
				int k2 = anIntArray519[i2];
				int i3 = anIntArray528[i2] * anInt522;
				method194(i1, k1, k2, i3, arg0, arg1);
				if(k2 >= arg1)
					return;
				i1 = k2;
				k1 = i3;
			}

		float f = aFloatArray525[k1];
		for(int j3 = i1; j3 < arg1; j3++)
			arg0[j3] *= f;

	}

	public Class25()
	{
		int i = Class52.method947(16);
		if(i != 1)
			throw new RuntimeException();
		int j = Class52.method947(5);
		int k = 0;
		anIntArray530 = new int[j];
		for(int l = 0; l < j; l++)
		{
			int i1 = Class52.method947(4);
			anIntArray530[l] = i1;
			if(i1 >= k)
				k = i1 + 1;
		}

		anIntArray529 = new int[k];
		anIntArray524 = new int[k];
		anIntArray526 = new int[k];
		anIntArrayArray527 = new int[k][];
		for(int j1 = 0; j1 < k; j1++)
		{
			anIntArray529[j1] = Class52.method947(3) + 1;
			int k1 = anIntArray524[j1] = Class52.method947(2);
			if(k1 != 0)
				anIntArray526[j1] = Class52.method947(8);
			k1 = 1 << k1;
			int ai[] = new int[k1];
			anIntArrayArray527[j1] = ai;
			for(int j2 = 0; j2 < k1; j2++)
				ai[j2] = Class52.method947(8) - 1;

		}

		anInt522 = Class52.method947(2) + 1;
		int l1 = Class52.method947(4);
		int i2 = 2;
		for(int k2 = 0; k2 < j; k2++)
			i2 += anIntArray529[anIntArray530[k2]];

		anIntArray523 = new int[i2];
		anIntArray523[0] = 0;
		anIntArray523[1] = 1 << l1;
		i2 = 2;
		for(int l2 = 0; l2 < j; l2++)
		{
			int i3 = anIntArray530[l2];
			for(int j3 = 0; j3 < anIntArray529[i3]; j3++)
				anIntArray523[i2++] = Class52.method947(l1);

		}

		if(anIntArray519 == null || anIntArray519.length < i2)
		{
			anIntArray519 = new int[i2];
			anIntArray528 = new int[i2];
			aBooleanArray521 = new boolean[i2];
		}
	}

	public static int anIntArray519[];
	public static int anIntArray520[] = {
		256, 128, 86, 64
	};
	public static boolean aBooleanArray521[];
	public int anInt522;
	public int anIntArray523[];
	public int anIntArray524[];
	public static float aFloatArray525[] = {
		1.064986E-007F, 1.134195E-007F, 1.207901E-007F, 1.286398E-007F, 1.369995E-007F, 1.459025E-007F, 1.553841E-007F, 1.654818E-007F, 1.762357E-007F, 1.876886E-007F, 
		1.998856E-007F, 2.128753E-007F, 2.267091E-007F, 2.41442E-007F, 2.571322E-007F, 2.738421E-007F, 2.916379E-007F, 3.105902E-007F, 3.307741E-007F, 3.522697E-007F, 
		3.751621E-007F, 3.995423E-007F, 4.255068E-007F, 4.531586E-007F, 4.826074E-007F, 5.1397E-007F, 5.473706E-007F, 5.829419E-007F, 6.208247E-007F, 6.611694E-007F, 
		7.041359E-007F, 7.498946E-007F, 7.98627E-007F, 8.505263E-007F, 9.057983E-007F, 9.646621E-007F, 1.027351E-006F, 1.094114E-006F, 1.165216E-006F, 1.240938E-006F, 
		1.321582E-006F, 1.407465E-006F, 1.49893E-006F, 1.596339E-006F, 1.700079E-006F, 1.810559E-006F, 1.928219E-006F, 2.053526E-006F, 2.186976E-006F, 2.329098E-006F, 
		2.480456E-006F, 2.64165E-006F, 2.813319E-006F, 2.996144E-006F, 3.190851E-006F, 3.39821E-006F, 3.619045E-006F, 3.854231E-006F, 4.104701E-006F, 4.371447E-006F, 
		4.655528E-006F, 4.958071E-006F, 5.280274E-006F, 5.623416E-006F, 5.988857E-006F, 6.378047E-006F, 6.792528E-006F, 7.233945E-006F, 7.704048E-006F, 8.2047E-006F, 
		8.737888E-006F, 9.305725E-006F, 9.910464E-006F, 1.05545E-005F, 1.124039E-005F, 1.197086E-005F, 1.274879E-005F, 1.357728E-005F, 1.445961E-005F, 1.539927E-005F, 
		1.64E-005F, 1.746577E-005F, 1.860079E-005F, 1.980958E-005F, 2.109691E-005F, 2.246791E-005F, 2.3928E-005F, 2.548298E-005F, 2.713901E-005F, 2.890265E-005F, 
		3.078091E-005F, 3.278123E-005F, 3.491153E-005F, 3.718028E-005F, 3.959647E-005F, 4.216967E-005F, 4.491009E-005F, 4.78286E-005F, 5.093677E-005F, 5.424693E-005F, 
		5.77722E-005F, 6.152657E-005F, 6.552491E-005F, 6.978308E-005F, 7.431798E-005F, 7.914758E-005F, 8.429104E-005F, 8.976875E-005F, 9.560242E-005F, 0.0001018152F, 
		0.0001084317F, 0.0001154782F, 0.0001229827F, 0.0001309748F, 0.0001394862F, 0.0001485509F, 0.0001582045F, 0.0001684856F, 0.0001794347F, 0.0001910954F, 
		0.0002035138F, 0.0002167393F, 0.0002308242F, 0.0002458245F, 0.0002617995F, 0.0002788127F, 0.0002969316F, 0.0003162279F, 0.0003367781F, 0.0003586639F, 
		0.0003819719F, 0.0004067946F, 0.0004332304F, 0.0004613841F, 0.0004913675F, 0.0005232993F, 0.0005573062F, 0.0005935231F, 0.0006320936F, 0.0006731706F, 
		0.000716917F, 0.0007635063F, 0.0008131232F, 0.0008659646F, 0.0009222399F, 0.0009821722F, 0.001045999F, 0.001113974F, 0.001186367F, 0.001263463F, 
		0.00134557F, 0.001433013F, 0.001526138F, 0.001625315F, 0.001730937F, 0.001843423F, 0.00196322F, 0.002090801F, 0.002226673F, 0.002371374F, 
		0.00252548F, 0.002689599F, 0.002864385F, 0.003050529F, 0.003248769F, 0.003459892F, 0.003684736F, 0.003924191F, 0.004179207F, 0.004450795F, 
		0.004740033F, 0.005048067F, 0.005376119F, 0.005725489F, 0.006097564F, 0.006493818F, 0.006915823F, 0.007365251F, 0.007843887F, 0.008353627F, 
		0.008896492F, 0.009474637F, 0.01009035F, 0.01074608F, 0.01144442F, 0.01218814F, 0.0129802F, 0.01382373F, 0.01472207F, 0.01567879F, 
		0.01669769F, 0.0177828F, 0.01893842F, 0.02016915F, 0.02147985F, 0.02287574F, 0.02436233F, 0.02594553F, 0.02763162F, 0.02942728F, 
		0.03133963F, 0.03337625F, 0.03554523F, 0.03785516F, 0.0403152F, 0.04293511F, 0.04572527F, 0.04869676F, 0.05186135F, 0.05523159F, 
		0.05882085F, 0.06264336F, 0.06671428F, 0.07104975F, 0.07566696F, 0.08058423F, 0.08582105F, 0.09139818F, 0.09733775F, 0.1036633F, 
		0.1103999F, 0.1175743F, 0.125215F, 0.1333521F, 0.1420181F, 0.1512473F, 0.1610762F, 0.1715438F, 0.1826917F, 0.194564F, 
		0.2072079F, 0.2206734F, 0.235014F, 0.2502865F, 0.2665516F, 0.2838736F, 0.3023213F, 0.3219679F, 0.3428911F, 0.3651741F, 
		0.3889052F, 0.4141785F, 0.4410941F, 0.4697589F, 0.5002865F, 0.5327979F, 0.5674221F, 0.6042964F, 0.643567F, 0.6853896F, 
		0.72993F, 0.777365F, 0.8278826F, 0.8816831F, 0.9389798F, 1.0F
	};
	public int anIntArray526[];
	public int anIntArrayArray527[][];
	public static int anIntArray528[];
	public int anIntArray529[];
	public int anIntArray530[];

}
