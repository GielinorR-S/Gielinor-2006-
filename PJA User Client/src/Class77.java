// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class77.java


public abstract class Class77
{

	public Class77()
	{
	}

	public abstract void method1168(int i);

	public static void method1169(byte arg0)
	{
		try
		{
			aClass58_1648 = null;
			aClass58Array1651 = null;
			anIntArray1645 = null;
			if(arg0 < 81)
			{
				return;
			} else
			{
				aClass58_1643 = null;
				aClass33_Sub11_1653 = null;
				aClass58_1654 = null;
				aClass58_1641 = null;
				aClass58_1644 = null;
				aClass58_1649 = null;
				aClass58_1642 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "vc.L(" + arg0 + ')');
		}
	}

	public abstract void method1170(byte byte0);

	public static void method1171(int arg0)
	{
		try
		{
			for(int i = -1; ~Class31.anInt697 < ~i; i++)
			{
				int j;
				if(i != -1)
					j = Class33_Sub3.anIntArray2050[i];
				else
					j = 2047;
				Class33_Sub6_Sub4_Sub5_Sub1 class33_sub6_sub4_sub5_sub1 = Class79.aClass33_Sub6_Sub4_Sub5_Sub1Array1715[j];
				if(class33_sub6_sub4_sub5_sub1 != null)
					Class33_Sub20.method828(1, (byte)-90, class33_sub6_sub4_sub5_sub1);
			}

			if(arg0 != 2047)
				aBoolean1647 = true;
			anInt1655++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "vc.J(" + arg0 + ')');
		}
	}

	public abstract int method1172(int i, int j, int k);

	public static void method1173(Class33_Sub6_Sub14 arg0, boolean arg1, int arg2, int arg3, int arg4)
	{
		try
		{
			anInt1650++;
			if(~Class34.anInt1839 <= -51 || Class14.anInt272 == 0)
				return;
			if(arg0.anIntArray3021 == null || ~arg0.anIntArray3021.length >= ~arg2)
				return;
			int i = arg0.anIntArray3021[arg2];
			if(~i == -1)
				return;
			int j = i >> 0x8a5a1888;
			Class21.anIntArray399[Class34.anInt1839] = j;
			int l = 0xf & i;
			int k = i >> 0x35a92244 & 7;
			Class80.anIntArray1725[Class34.anInt1839] = k;
			int j1 = (-64 + arg4) / 128;
			if(arg1)
				anIntArray1645 = null;
			Class45.anIntArray966[Class34.anInt1839] = 0;
			int i1 = (-64 + arg3) / 128;
			Class33_Sub18.aClass61Array2515[Class34.anInt1839] = null;
			Class33_Sub20.anIntArray2566[Class34.anInt1839] = l + ((j1 << 0x69abdc08) + (i1 << 0x8ba61330));
			Class34.anInt1839++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "vc.K(" + (arg0 == null ? "null" : "{...}") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public static Class58 aClass58_1641;
	public static Class58 aClass58_1642 = Class33_Sub6_Sub11.method535(114, "Null");
	public static Class58 aClass58_1643 = Class33_Sub6_Sub11.method535(103, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <lt>AUS<gt>");
	public static Class58 aClass58_1644;
	public static int anIntArray1645[] = new int[5];
	public static int anInt1646 = 0;
	public static boolean aBoolean1647 = false;
	public static Class58 aClass58_1648;
	public static Class58 aClass58_1649 = null;
	public static int anInt1650;
	public static Class58 aClass58Array1651[] = new Class58[1000];
	public static int anInt1652 = 0;
	public static Class33_Sub11 aClass33_Sub11_1653;
	public static Class58 aClass58_1654;
	public static int anInt1655;

	static 
	{
		aClass58_1641 = Class33_Sub6_Sub11.method535(107, "Unexpected server response");
		aClass58_1648 = aClass58_1641;
		aClass58_1654 = Class33_Sub6_Sub11.method535(109, "Username: ");
		aClass58_1644 = aClass58_1654;
	}
}
