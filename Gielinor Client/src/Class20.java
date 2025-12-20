// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class20.java


public class Class20
{

	public int method169(int arg0, int arg1, byte arg2[], int arg3, byte arg4, byte arg5[])
	{
		try
		{
			anInt385++;
			arg1 += arg0;
			int j = arg3 << 0xfa94f7e3;
			int i = 0;
			if(arg4 > -73)
				anIntArray382 = null;
			for(; ~arg0 > ~arg1; arg0++)
			{
				int k = 0xff & arg5[arg0];
				byte byte0 = aByteArray383[k];
				int l = anIntArray379[k];
				if(~byte0 == -1)
					throw new RuntimeException("No codeword for data value " + k);
				int j1 = j & 7;
				i &= -j1 >> 0x49be3ff;
				int i1 = j >> 0xf7824a43;
				int k1 = ((byte0 + j1) - 1 >> 0xd0f59c83) + i1;
				j1 += 24;
				arg2[i1] = (byte)(i = Class33_Sub6_Sub14.method576(i, l >>> j1));
				if(k1 > i1)
				{
					j1 -= 8;
					i1++;
					arg2[i1] = (byte)(i = l >>> j1);
					if(~k1 < ~i1)
					{
						j1 -= 8;
						i1++;
						arg2[i1] = (byte)(i = l >>> j1);
						if(i1 < k1)
						{
							i1++;
							j1 -= 8;
							arg2[i1] = (byte)(i = l >>> j1);
							if(~k1 < ~i1)
							{
								j1 -= 8;
								i1++;
								arg2[i1] = (byte)(i = l << -j1);
							}
						}
					}
				}
				j += byte0;
			}

			return (7 + j >> 0xda8097a3) + -arg3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "fd.C(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method170(int arg0)
	{
		try
		{
			aClass33_Sub15Array386 = null;
			if(arg0 != 0)
				anIntArray382 = null;
			aClass58_384 = null;
			aClass58_380 = null;
			anIntArray382 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "fd.B(" + arg0 + ')');
		}
	}

	public int method171(byte arg0[], int arg1, int arg2, int arg3, int arg4, byte arg5[])
	{
		try
		{
			anInt389++;
			if(~arg2 == -1)
				return 0;
			if(arg4 != 255)
				return 70;
			arg2 += arg3;
			int i = 0;
			int j = arg1;
			do
			{
				byte byte0 = arg0[j];
				if(byte0 < 0)
					i = anIntArray388[i];
				else
					i++;
				int k;
				if(~(k = anIntArray388[i]) > -1)
				{
					arg5[arg3++] = (byte)(~k);
					if(arg2 <= arg3)
						break;
					i = 0;
				}
				if((0x40 & byte0) != 0)
					i = anIntArray388[i];
				else
					i++;
				if((k = anIntArray388[i]) < 0)
				{
					arg5[arg3++] = (byte)(~k);
					if(arg2 <= arg3)
						break;
					i = 0;
				}
				if((0x20 & byte0) == 0)
					i++;
				else
					i = anIntArray388[i];
				if(~(k = anIntArray388[i]) > -1)
				{
					arg5[arg3++] = (byte)(~k);
					if(arg2 <= arg3)
						break;
					i = 0;
				}
				if(~(0x10 & byte0) == -1)
					i++;
				else
					i = anIntArray388[i];
				if((k = anIntArray388[i]) < 0)
				{
					arg5[arg3++] = (byte)(~k);
					if(arg2 <= arg3)
						break;
					i = 0;
				}
				if((8 & byte0) != 0)
					i = anIntArray388[i];
				else
					i++;
				if((k = anIntArray388[i]) < 0)
				{
					arg5[arg3++] = (byte)(~k);
					if(arg2 <= arg3)
						break;
					i = 0;
				}
				if((byte0 & 4) != 0)
					i = anIntArray388[i];
				else
					i++;
				if((k = anIntArray388[i]) < 0)
				{
					arg5[arg3++] = (byte)(~k);
					if(arg2 <= arg3)
						break;
					i = 0;
				}
				if(~(2 & byte0) != -1)
					i = anIntArray388[i];
				else
					i++;
				if(~(k = anIntArray388[i]) > -1)
				{
					arg5[arg3++] = (byte)(~k);
					if(arg2 <= arg3)
						break;
					i = 0;
				}
				if(~(byte0 & 1) != -1)
					i = anIntArray388[i];
				else
					i++;
				if(~(k = anIntArray388[i]) > -1)
				{
					arg5[arg3++] = (byte)(~k);
					if(arg3 >= arg2)
						break;
					i = 0;
				}
				j++;
			} while(true);
			return -arg1 + (1 + j);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "fd.A(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? "null" : "{...}") + ')');
		}
	}

	public Class20(byte arg0[])
	{
		try
		{
			int i = arg0.length;
			aByteArray383 = arg0;
			anIntArray388 = new int[8];
			anIntArray379 = new int[i];
			int ai[] = new int[33];
			int j = 0;
			for(int k = 0; k < i; k++)
			{
				byte byte0 = arg0[k];
				if(byte0 != 0)
				{
					int l = 1 << 32 - byte0;
					int i1 = ai[byte0];
					anIntArray379[k] = i1;
					int j1;
					if((l & i1) == 0)
					{
						j1 = l | i1;
						for(int k1 = -1 + byte0; k1 >= 1; k1--)
						{
							int i2 = ai[k1];
							if(~i2 != ~i1)
								break;
							int k2 = 1 << 32 - k1;
							if((i2 & k2) == 0)
							{
								ai[k1] = Class33_Sub6_Sub14.method576(k2, i2);
								continue;
							}
							ai[k1] = ai[k1 - 1];
							break;
						}

					} else
					{
						j1 = ai[byte0 - 1];
					}
					ai[byte0] = j1;
					for(int l1 = byte0 + 1; ~l1 >= -33; l1++)
						if(i1 == ai[l1])
							ai[l1] = j1;

					int j2 = 0;
					for(int l2 = 0; byte0 > l2; l2++)
					{
						int i3 = 0x80000000 >>> l2;
						if(~(i3 & i1) != -1)
						{
							if(anIntArray388[j2] == 0)
								anIntArray388[j2] = j;
							j2 = anIntArray388[j2];
						} else
						{
							j2++;
						}
						i3 >>>= 1;
						if(anIntArray388.length <= j2)
						{
							int ai1[] = new int[anIntArray388.length * 2];
							for(int j3 = 0; anIntArray388.length > j3; j3++)
								ai1[j3] = anIntArray388[j3];

							anIntArray388 = ai1;
						}
					}

					if(~j2 <= ~j)
						j = j2 + 1;
					anIntArray388[j2] = ~k;
				}
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "fd.<init>(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt378 = 0;
	public int anIntArray379[];
	public static Class58 aClass58_380 = Class33_Sub6_Sub11.method535(100, "redstone3");
	public static boolean aBoolean381 = false;
	public static int anIntArray382[] = new int[32];
	public byte aByteArray383[];
	public static Class58 aClass58_384 = Class33_Sub6_Sub11.method535(110, "<col=80ff00>");
	public static int anInt385;
	public static Class33_Sub15 aClass33_Sub15Array386[];
	public static int anInt387 = 0;
	public int anIntArray388[];
	public static int anInt389;

}
