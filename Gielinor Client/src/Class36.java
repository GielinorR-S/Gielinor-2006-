// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class36.java

import java.io.*;
import java.net.URL;

public class Class36
{

	public static Class33_Sub6_Sub7_Sub3[] method851(int arg0)
	{
		try
		{
			anInt798++;
			Class33_Sub6_Sub7_Sub3 aclass33_sub6_sub7_sub3[] = new Class33_Sub6_Sub7_Sub3[Class77_Sub2.anInt2641];
			for(int i = arg0; ~Class77_Sub2.anInt2641 < ~i; i++)
			{
				Class33_Sub6_Sub7_Sub3 class33_sub6_sub7_sub3 = aclass33_sub6_sub7_sub3[i] = new Class33_Sub6_Sub7_Sub3();
				class33_sub6_sub7_sub3.anInt3728 = Class68.anInt1444;
				class33_sub6_sub7_sub3.anInt3726 = Class46.anInt1000;
				class33_sub6_sub7_sub3.anInt3725 = Class33_Sub19.anIntArray2553[i];
				class33_sub6_sub7_sub3.anInt3724 = Class21.anIntArray391[i];
				class33_sub6_sub7_sub3.anInt3723 = Class33_Sub6_Sub4_Sub5_Sub1.anIntArray3753[i];
				class33_sub6_sub7_sub3.anInt3727 = Class33_Sub6_Sub5.anIntArray2769[i];
				byte abyte0[] = Class33_Sub6_Sub4_Sub1.aByteArrayArray3361[i];
				int j = class33_sub6_sub7_sub3.anInt3723 * class33_sub6_sub7_sub3.anInt3727;
				class33_sub6_sub7_sub3.anIntArray3722 = new int[j];
				for(int k = 0; k < j; k++)
					class33_sub6_sub7_sub3.anIntArray3722[k] = Class75.anIntArray1614[Class12.method110(abyte0[k], 255)];

			}

			Class35.method841(-21572);
			return aclass33_sub6_sub7_sub3;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "l.B(" + arg0 + ')');
		}
	}

	public byte[] method852(int arg0)
		throws IOException
	{
		try
		{
			if(arg0 > -34)
				method853(-6, -89);
			anInt793++;
			if(~Class60.method1073(false) < ~aLong783)
				throw new IOException("fdt");
			if(anInt790 == 0)
			{
				if(~aClass6_785.anInt151 == -3)
					throw new IOException("fds");
				if(aClass6_785.anInt151 == 1)
				{
					anInt790 = 1;
					aDataInputStream780 = (DataInputStream)aClass6_785.anObject149;
				}
			}
			if(~anInt790 == -2)
			{
				int i = aDataInputStream780.available();
				if(~i < -1)
				{
					if(i - -anInt782 > 4)
						i = -anInt782 + 4;
					anInt782 += aDataInputStream780.read(aByteArray784, anInt782, i);
					if(~anInt782 == -5)
					{
						int k = (new Class33_Sub11(aByteArray784)).method623((byte)39);
						anInt790 = 2;
						aByteArray777 = new byte[k];
					}
				}
			}
			if(anInt790 == 2)
			{
				int j = aDataInputStream780.available();
				if(~j < -1)
				{
					if(~aByteArray777.length > ~(j + anInt781))
						j = aByteArray777.length + -anInt781;
					anInt781 += aDataInputStream780.read(aByteArray777, anInt781, j);
					if(aByteArray777.length == anInt781)
						return aByteArray777;
				}
			}
			return null;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "l.A(" + arg0 + ')');
		}
	}

	public static Class58 method853(int arg0, int arg1)
	{
		try
		{
			anInt775++;
			if(arg0 != 255)
				method853(-58, -11);
			return Class35.method846((byte)-83, new Class58[] {
				Class37.method859(15591, arg1 >> 0xc5f9bab8 & 0xff), Class15.aClass58_303, Class37.method859(15591, arg1 >> 0x9dbbdb10 & 0xff), Class15.aClass58_303, Class37.method859(15591, (arg1 & 0xff57) >> 0x77fc9708), Class15.aClass58_303, Class37.method859(15591, 0xff & arg1)
			});
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "l.D(" + arg0 + ',' + arg1 + ')');
		}
	}

	public static void method854(boolean arg0)
	{
		try
		{
			aClass58_799 = null;
			aClass58_800 = null;
			aClass58_788 = null;
			if(arg0)
				method854(true);
			aClass33_Sub6_Sub7_Sub3_787 = null;
			aClass58_795 = null;
			aClass15_786 = null;
			aClass58_779 = null;
			aClass58_801 = null;
			aClass58_791 = null;
			aClass33_Sub6_Sub7_Sub4_797 = null;
			aClass58_778 = null;
			aClass58_792 = null;
			aClass58_789 = null;
			aClass58_776 = null;
			aClass58_794 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "l.C(" + arg0 + ')');
		}
	}

	public Class36(Class72 arg0, URL arg1)
	{
		aByteArray784 = new byte[4];
		try
		{
			aClass6_785 = arg0.method1145(119, arg1);
			anInt790 = 0;
			aLong783 = 30000L + Class60.method1073(false);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "l.<init>(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt775;
	public static Class58 aClass58_776;
	public byte aByteArray777[];
	public static Class58 aClass58_778;
	public static Class58 aClass58_779;
	public DataInputStream aDataInputStream780;
	public int anInt781;
	public int anInt782;
	public long aLong783;
	public byte aByteArray784[];
	public Class6 aClass6_785;
	public static Class15 aClass15_786;
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3_787;
	public static Class58 aClass58_788;
	public static Class58 aClass58_789 = Class33_Sub6_Sub11.method535(127, "redstone1");
	public int anInt790;
	public static Class58 aClass58_791 = Class33_Sub6_Sub11.method535(103, "runes");
	public static Class58 aClass58_792;
	public static int anInt793;
	public static Class58 aClass58_794;
	public static Class58 aClass58_795;
	public static boolean aBoolean796 = false;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_797;
	public static int anInt798;
	public static Class58 aClass58_799;
	public static Class58 aClass58_800 = Class33_Sub6_Sub11.method535(118, "Diese Betatest)2Welt ist nur f-Ur eingeladene");
	public static Class58 aClass58_801;
	public static boolean aBoolean802 = false;

	static 
	{
		aClass58_778 = Class33_Sub6_Sub11.method535(106, "Loading )2 please wait)3");
		aClass58_788 = Class33_Sub6_Sub11.method535(122, "Welcome to RuneScape");
		aClass58_792 = aClass58_788;
		aClass58_779 = aClass58_778;
		aClass58_801 = Class33_Sub6_Sub11.method535(110, "yellow:");
		aClass58_794 = aClass58_801;
		aClass58_795 = aClass58_801;
		aClass58_776 = Class33_Sub6_Sub11.method535(119, "Connection timed out)3");
		aClass58_799 = aClass58_776;
	}
}
