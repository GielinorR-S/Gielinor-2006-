// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class33_Sub6_Sub6.java


public class Class33_Sub6_Sub6 extends Class33_Sub6
{

	public static void method411(byte arg0)
	{
		try
		{
			anIntArray2788 = null;
			if(arg0 < 121)
				anInt2786 = -103;
			aLongArray2791 = null;
			aClass58_2789 = null;
			aClass4ArrayArrayArray2787 = null;
			aClass58_2781 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "g.B(" + arg0 + ')');
		}
	}

	public boolean method412(int arg0, int arg1)
	{
		try
		{
			if(arg0 != 4)
			{
				return true;
			} else
			{
				anInt2782++;
				return aClass28Array2792[arg1].aBoolean574;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "g.A(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class33_Sub6_Sub6(Class30 arg0, Class30 arg1, int arg2, boolean arg3)
	{
		try
		{
			Class4 class4 = new Class4();
			int i = arg0.method218(arg2, false);
			aClass28Array2792 = new Class28[i];
			int ai[] = arg0.method237(arg2, true);
			for(int j = 0; ai.length > j; j++)
			{
				byte abyte0[] = arg0.method238(false, ai[j], arg2);
				Class33_Sub16 class33_sub16 = null;
				int k = 0xff00 & abyte0[0] << 0x712e39c8 | abyte0[1] & 0xff;
				for(Class33_Sub16 class33_sub16_1 = (Class33_Sub16)class4.method68(18823); class33_sub16_1 != null; class33_sub16_1 = (Class33_Sub16)class4.method66((byte)-126))
				{
					if(class33_sub16_1.anInt2476 != k)
						continue;
					class33_sub16 = class33_sub16_1;
					break;
				}

				if(class33_sub16 == null)
				{
					byte abyte1[];
					if(!arg3)
						abyte1 = arg1.method220(k, 0, -25850);
					else
						abyte1 = arg1.method220(0, k, -25850);
					class33_sub16 = new Class33_Sub16(k, abyte1);
					class4.method63(class33_sub16, (byte)70);
				}
				aClass28Array2792[ai[j]] = new Class28(abyte0, class33_sub16);
			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "g.<init>(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static Class58 aClass58_2781;
	public static int anInt2782;
	public static int anInt2783 = 0;
	public static int anInt2784 = 0;
	public static int anInt2785 = 0;
	public static int anInt2786 = -1;
	public static Class4 aClass4ArrayArrayArray2787[][][] = new Class4[4][104][104];
	public static int anIntArray2788[] = new int[128];
	public static Class58 aClass58_2789;
	public static int anInt2790 = 255;
	public static long aLongArray2791[] = new long[100];
	public Class28 aClass28Array2792[];

	static 
	{
		aClass58_2781 = Class33_Sub6_Sub11.method535(122, "This computers address has been blocked");
		aClass58_2789 = aClass58_2781;
	}
}
