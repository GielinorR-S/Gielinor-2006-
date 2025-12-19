// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class55.java


public class Class55
{

	public static void method963(int arg0)
	{
		try
		{
			anInt1168++;
			int i = 75 / ((arg0 - 3) / 43);
			Class33_Sub6_Sub13.anInt2992 = 0;
			Class74.anInt1587 = 0;
			Class33_Sub16.method800((byte)112);
			Class33.method267((byte)84);
			Class33_Sub6_Sub4_Sub2.method323((byte)-23);
			Class16.method146((byte)-84);
			for(int j = 0; Class74.anInt1587 > j; j++)
			{
				int k = Class33_Sub6_Sub13.anIntArray2988[j];
				if(~Class33_Sub6_Sub6.anInt2785 != ~((Class33_Sub6_Sub4_Sub5) (Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[k])).anInt3558)
					Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[k] = null;
			}

			if(((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239 != Class34.anInt1826)
				throw new RuntimeException("gpp1 pos:" + ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239 + " psize:" + Class34.anInt1826);
			for(int l = 0; Class31.anInt697 > l; l++)
				if(Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[Class33_Sub3.anIntArray2050[l]] == null)
					throw new RuntimeException("gpp2 pos:" + l + " size:" + Class31.anInt697);

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "qa.B(" + arg0 + ')');
		}
	}

	public static void method964(boolean arg0)
	{
		aClass58_1173 = null;
		aClass58_1160 = null;
		aClass58_1164 = null;
		aClass58_1163 = null;
		if(!arg0)
			method964(false);
	}

	public Class55()
	{
	}

	public static Class58 aClass58_1160;
	public static int anInt1161;
	public static int anInt1162;
	public static Class58 aClass58_1163 = Class33_Sub6_Sub11.method535(119, "Ignorieren");
	public static Class58 aClass58_1164;
	public int anInt1165;
	public int anInt1166;
	public int anInt1167;
	public static int anInt1168;
	public Class33_Sub6_Sub4 aClass33_Sub6_Sub4_1169;
	public int anInt1170;
	public static int anInt1171 = 0;
	public static int anInt1172 = 0;
	public static Class58 aClass58_1173 = Class33_Sub6_Sub11.method535(103, " <col=ffff00>");
	public Class33_Sub6_Sub4 aClass33_Sub6_Sub4_1174;
	public int anInt1175;
	public Class33_Sub6_Sub4 aClass33_Sub6_Sub4_1176;

	static 
	{
		aClass58_1160 = Class33_Sub6_Sub11.method535(108, "Moderator option: Mute player for 48 hours: <lt>ON<gt>");
		aClass58_1164 = aClass58_1160;
	}
}
