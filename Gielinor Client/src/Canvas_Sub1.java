// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Canvas_Sub1.java

import java.awt.*;

public class Canvas_Sub1 extends Canvas
{

	public void update(Graphics arg0)
	{
		try
		{
			aComponent71.update(arg0);
			anInt73++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jf.update(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static boolean method42(int arg0, int arg1, int arg2, Class30 arg3)
	{
		try
		{
			anInt63++;
			byte abyte0[] = arg3.method238(false, arg1, arg2);
			if(arg0 != 12127)
				method42(-48, -38, 28, null);
			if(abyte0 == null)
			{
				return false;
			} else
			{
				Class33_Sub5.method288(abyte0, (byte)-75);
				return true;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jf.B(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method43(int arg0)
	{
		anInt72++;
		if(~Class69.anInt1464 == -2)
		{
			if(Class82.anInt1794 >= 539 && ~Class82.anInt1794 >= -574 && Class48.anInt1055 >= 169 && ~Class48.anInt1055 > -206 && ~Class14.anIntArray274[0] != 0)
			{
				Class30.anInt620 = 0;
				Class26.aBoolean552 = true;
				Class74.aBoolean1579 = true;
			}
			if(Class82.anInt1794 >= 569 && Class82.anInt1794 <= 599 && Class48.anInt1055 >= 168 && Class48.anInt1055 < 205 && Class14.anIntArray274[1] != -1)
			{
				Class74.aBoolean1579 = true;
				Class26.aBoolean552 = true;
				Class30.anInt620 = 1;
			}
			if(~Class82.anInt1794 <= -598 && Class82.anInt1794 <= 627 && ~Class48.anInt1055 <= -169 && Class48.anInt1055 < 205 && ~Class14.anIntArray274[2] != 0)
			{
				Class26.aBoolean552 = true;
				Class30.anInt620 = 2;
				Class74.aBoolean1579 = true;
			}
			if(~Class82.anInt1794 <= -626 && Class82.anInt1794 <= 669 && ~Class48.anInt1055 <= -169 && ~Class48.anInt1055 > -204 && Class14.anIntArray274[3] != -1)
			{
				Class30.anInt620 = 3;
				Class74.aBoolean1579 = true;
				Class26.aBoolean552 = true;
			}
			if(Class82.anInt1794 >= 666 && Class82.anInt1794 <= 696 && ~Class48.anInt1055 <= -169 && Class48.anInt1055 < 205 && Class14.anIntArray274[4] != -1)
			{
				Class26.aBoolean552 = true;
				Class74.aBoolean1579 = true;
				Class30.anInt620 = 4;
			}
			if(~Class82.anInt1794 <= -695 && Class82.anInt1794 <= 724 && ~Class48.anInt1055 <= -169 && ~Class48.anInt1055 > -206 && ~Class14.anIntArray274[5] != 0)
			{
				Class74.aBoolean1579 = true;
				Class26.aBoolean552 = true;
				Class30.anInt620 = 5;
			}
			if(~Class82.anInt1794 <= -723 && ~Class82.anInt1794 >= -757 && Class48.anInt1055 >= 169 && ~Class48.anInt1055 > -206 && ~Class14.anIntArray274[6] != 0)
			{
				Class74.aBoolean1579 = true;
				Class26.aBoolean552 = true;
				Class30.anInt620 = 6;
			}
			if(~Class82.anInt1794 <= -541 && ~Class82.anInt1794 >= -575 && Class48.anInt1055 >= 466 && Class48.anInt1055 < 502 && ~Class14.anIntArray274[7] != 0)
			{
				Class30.anInt620 = 7;
				Class26.aBoolean552 = true;
				Class74.aBoolean1579 = true;
			}
			if(Class82.anInt1794 >= 572 && Class82.anInt1794 <= 602 && Class48.anInt1055 >= 466 && Class48.anInt1055 < 503 && ~Class14.anIntArray274[8] != 0)
			{
				Class30.anInt620 = 8;
				Class26.aBoolean552 = true;
				Class74.aBoolean1579 = true;
			}
			if(~Class82.anInt1794 <= -600 && Class82.anInt1794 <= 629 && ~Class48.anInt1055 <= -467 && ~Class48.anInt1055 > -504 && ~Class14.anIntArray274[9] != 0)
			{
				Class74.aBoolean1579 = true;
				Class26.aBoolean552 = true;
				Class30.anInt620 = 9;
			}
			if(Class82.anInt1794 >= 627 && Class82.anInt1794 <= 671 && Class48.anInt1055 >= 467 && Class48.anInt1055 < 502 && Class14.anIntArray274[10] != -1)
			{
				Class74.aBoolean1579 = true;
				Class26.aBoolean552 = true;
				Class30.anInt620 = 10;
			}
			if(~Class82.anInt1794 <= -670 && Class82.anInt1794 <= 699 && ~Class48.anInt1055 <= -467 && Class48.anInt1055 < 503 && ~Class14.anIntArray274[11] != 0)
			{
				Class74.aBoolean1579 = true;
				Class30.anInt620 = 11;
				Class26.aBoolean552 = true;
			}
			if(Class82.anInt1794 >= 696 && ~Class82.anInt1794 >= -727 && Class48.anInt1055 >= 466 && Class48.anInt1055 < 503 && ~Class14.anIntArray274[12] != 0)
			{
				Class26.aBoolean552 = true;
				Class74.aBoolean1579 = true;
				Class30.anInt620 = 12;
			}
			if(Class82.anInt1794 >= 724 && Class82.anInt1794 <= 758 && Class48.anInt1055 >= 466 && Class48.anInt1055 < 502 && Class14.anIntArray274[13] != -1)
			{
				Class74.aBoolean1579 = true;
				Class30.anInt620 = 13;
				Class26.aBoolean552 = true;
			}
		}
		if(arg0 <= 115)
			method43(-5);
	}

	public static void method44(boolean arg0)
	{
		try
		{
			aClass58_69 = null;
			anIntArray62 = null;
			if(!arg0)
				aLong68 = 103L;
			aByteArrayArrayArray57 = null;
			aClass58_50 = null;
			aClass58_60 = null;
			aClass58_51 = null;
			aClass58_70 = null;
			aClass15_66 = null;
			aClass58_55 = null;
			aClass30_Sub1_54 = null;
			aClass15_64 = null;
			aClass30_48 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jf.D(" + arg0 + ')');
		}
	}

	public void paint(Graphics arg0)
	{
		try
		{
			anInt67++;
			aComponent71.paint(arg0);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jf.paint(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public Canvas_Sub1(Component arg0)
	{
		try
		{
			aComponent71 = arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "jf.<init>(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method45(Class33_Sub6_Sub4_Sub5_Sub1 arg0, int arg1, int arg2, boolean arg3)
	{
		if(arg2 != ((Class33_Sub6_Sub4_Sub5) (arg0)).anInt3567 || arg2 == -1)
		{
			if(~arg2 == 0 || ~((Class33_Sub6_Sub4_Sub5) (arg0)).anInt3567 == 0 || ~Class33_Sub21.method830(arg2, -81).anInt3039 <= ~Class33_Sub21.method830(((Class33_Sub6_Sub4_Sub5) (arg0)).anInt3567, -122).anInt3039)
			{
				arg0.anInt3565 = 0;
				arg0.anInt3502 = 0;
				arg0.anInt3544 = arg1;
				arg0.anInt3505 = ((Class33_Sub6_Sub4_Sub5) (arg0)).anInt3513;
				arg0.anInt3567 = arg2;
				arg0.anInt3560 = 0;
			}
		} else
		{
			int i = Class33_Sub21.method830(arg2, -110).anInt3016;
			if(~i == -2)
			{
				arg0.anInt3544 = arg1;
				arg0.anInt3502 = 0;
				arg0.anInt3560 = 0;
				arg0.anInt3565 = 0;
			}
			if(~i == -3)
				arg0.anInt3560 = 0;
		}
		anInt53++;
		if(!arg3)
			method43(-124);
	}

	public static Class30 aClass30_48;
	public static int anInt49 = -1;
	public static Class58 aClass58_50;
	public static Class58 aClass58_51 = Class33_Sub6_Sub11.method535(125, "backtop1");
	public static int anInt52 = 2;
	public static int anInt53;
	public static Class30_Sub1 aClass30_Sub1_54;
	public static Class58 aClass58_55 = Class33_Sub6_Sub11.method535(107, "sch-Utteln:");
	public static int anInt56 = 0;
	public static byte aByteArrayArrayArray57[][][];
	public static int anInt58 = 0;
	public static int anInt59 = 0;
	public static Class58 aClass58_60;
	public static int anInt61 = 0;
	public static int anIntArray62[] = new int[5];
	public static int anInt63;
	public static Class15 aClass15_64;
	public static int anInt65 = -1;
	public static Class15 aClass15_66;
	public static int anInt67;
	public static volatile long aLong68 = 0L;
	public static Class58 aClass58_69 = Class33_Sub6_Sub11.method535(103, "Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");
	public static Class58 aClass58_70 = Class33_Sub6_Sub11.method535(107, "<col=c0ff00>");
	public Component aComponent71;
	public static int anInt72;
	public static int anInt73;
	public static boolean aBoolean74;

	static 
	{
		aClass58_60 = Class33_Sub6_Sub11.method535(108, "Public chat");
		aClass58_50 = aClass58_60;
	}
}
