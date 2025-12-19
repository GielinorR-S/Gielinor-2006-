// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class50.java

import java.applet.Applet;
import java.io.*;
import java.net.URL;

public abstract class Class50
{

	public static void method938(byte arg0, Throwable arg1, String arg2)
	{
		anInt1085++;
		try
		{
			String s = "";
			if(arg1 != null)
				s = Class33_Sub16.method805(true, arg1);
			if(arg2 != null)
			{
				if(arg1 != null)
					s = s + " | ";
				s = s + arg2;
			}
			System.out.println("Error: " + s);
			s = s.replace(':', '.');
			s = s.replace('@', '_');
			s = s.replace('&', '_');
			s = s.replace('#', '_');
			if(Class33_Sub6_Sub4_Sub6.aClass72_3611.anApplet1536 == null)
				return;
			Class6 class6;
			for(class6 = Class33_Sub6_Sub4_Sub6.aClass72_3611.method1145(116, new URL(Class33_Sub6_Sub4_Sub6.aClass72_3611.anApplet1536.getCodeBase(), "clienterror.ws?c=" + Class12.anInt225 + "&u=" + Class39.aLong862 + "&v1=" + Class72.aString1532 + "&v2=" + Class72.aString1542 + "&e=" + s)); ~class6.anInt151 == -1;)
				Class33_Sub6_Sub17.method593(0, 1L);

			if(arg0 >= -46)
				method941((byte)-53);
			if(class6.anInt151 == 1)
			{
				DataInputStream datainputstream = (DataInputStream)class6.anObject149;
				datainputstream.read();
				datainputstream.close();
				return;
			}
		}
		catch(Exception _ex) { }
	}

	public abstract void method939(int i, byte abyte0[]);

	public Class50()
	{
	}

	public abstract byte[] method940(byte byte0);

	public static void method941(byte arg0)
	{
		try
		{
			aClass58_1088 = null;
			aClass58_1083 = null;
			if(arg0 != 77)
				method941((byte)58);
			aClass58_1091 = null;
			aClass33_Sub6_Sub7_Sub4Array1090 = null;
			aClass16_1086 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "pa.C(" + arg0 + ')');
		}
	}

	public static Class58 aClass58_1083 = Class33_Sub6_Sub11.method535(113, "Spiel)2Engine wird gestartet)3)3)3");
	public static int anInt1084;
	public static int anInt1085;
	public static Class16 aClass16_1086 = new Class16(50);
	public static int anInt1087;
	public static Class58 aClass58_1088 = Class33_Sub6_Sub11.method535(105, " loggt sich aus)3");
	public static int anInt1089 = 0;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4Array1090[];
	public static Class58 aClass58_1091 = Class33_Sub6_Sub11.method535(107, "Lade Benutzeroberfl-=che )2 ");

}
