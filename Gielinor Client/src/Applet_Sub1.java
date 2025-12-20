// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Applet_Sub1.java

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet
	implements Runnable, FocusListener, WindowListener
{

	public void windowDeactivated(WindowEvent arg0)
	{
		try
		{
			anInt44++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.windowDeactivated(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public void windowDeiconified(WindowEvent arg0)
	{
		try
		{
			anInt7++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.windowDeiconified(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public String getParameter(String arg0)
	{
		try
		{
			anInt9++;
			if(Class33_Sub6_Sub4_Sub6.aFrame3606 != null)
				return null;
			if(Class22.aClass72_416 != null && this != Class22.aClass72_416.anApplet1536)
				return Class22.aClass72_416.anApplet1536.getParameter(arg0);
			else
				return super.getParameter(arg0);
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.getParameter(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public abstract void method11(int i);

	public synchronized void method12(int arg0)
	{
		try
		{
			anInt35++;
			if(Class23.aBoolean465)
				return;
			Class23.aBoolean465 = true;
			if(arg0 <= 68)
				aClass58_17 = null;
			try
			{
				Class33_Sub6_Sub4_Sub1.aCanvas3367.removeFocusListener(this);
			}
			catch(Exception _ex) { }
			try
			{
				method18((byte)-27);
			}
			catch(Exception _ex) { }
			if(Class33_Sub6_Sub4_Sub6.aFrame3606 != null)
				try
				{
					System.exit(0);
				}
				catch(Throwable _ex) { }
			if(Class22.aClass72_416 != null)
				try
				{
					Class22.aClass72_416.method1140(0);
				}
				catch(Exception _ex) { }
			method29(9);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.AA(" + arg0 + ')');
		}
	}

	public void focusGained(FocusEvent arg0)
	{
		try
		{
			anInt21++;
			Class33_Sub6_Sub4_Sub5.aBoolean3552 = true;
			Class33_Sub6_Sub5.aBoolean2752 = true;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.focusGained(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public URL getCodeBase()
	{
		try
		{
			anInt8++;
			if(Class33_Sub6_Sub4_Sub6.aFrame3606 != null)
				return null;
			if(Class22.aClass72_416 != null && Class22.aClass72_416.anApplet1536 != this)
				return Class22.aClass72_416.anApplet1536.getCodeBase();
			else
				return super.getCodeBase();
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public void update(Graphics arg0)
	{
		try
		{
			anInt19++;
			paint(arg0);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.update(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public boolean method13(byte arg0)
	{
		try
		{
			anInt14++;
			if(arg0 != -91)
				method16(40, null, null, 104);
			String s = getDocumentBase().getHost().toLowerCase();
			if(s.equals("jagex.com") || s.endsWith(".jagex.com"))
				return true;
			if(s.equals("runescape.com") || s.endsWith(".runescape.com"))
				return true;
			if(s.endsWith("127.0.0.1"))
				return true;
			for(; s.length() > 0 && s.charAt(-1 + s.length()) >= '0' && s.charAt(s.length() - 1) <= '9'; s = s.substring(0, -1 + s.length()));
			if(s.endsWith("192.168.1."))
			{
				return true;
			} else
			{
				method15(-99, "invalidhost");
				return false;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.S(" + arg0 + ')');
		}
	}

	public static void method14(int arg0, int arg1, int arg2)
	{
		try
		{
			anInt4++;
			Class33_Sub6_Sub5 class33_sub6_sub5 = Class30_Sub1.method249(arg2, (byte)-98);
			int k = class33_sub6_sub5.anInt2751;
			int i = class33_sub6_sub5.anInt2756;
			int l = 70 % ((arg0 - 5) / 60);
			int j = class33_sub6_sub5.anInt2775;
			int i1 = Class33_Sub6_Sub4_Sub5.anIntArray3555[k + -j];
			if(arg1 < 0 || i1 < arg1)
				arg1 = 0;
			i1 <<= j;
			Class33_Sub5.anIntArray2120[i] = Class33_Sub6_Sub14.method576(Class12.method110(Class33_Sub5.anIntArray2120[i], ~i1), Class12.method110(i1, arg1 << j));
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.U(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void windowClosed(WindowEvent arg0)
	{
		try
		{
			anInt27++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.windowClosed(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public void method15(int arg0, String arg1)
	{
		try
		{
			if(arg0 >= -69)
				method23((byte)115);
			anInt1++;
			if(aBoolean6)
				return;
			aBoolean6 = true;
			System.out.println("error_game_" + arg1);
			try
			{
				getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
				return;
			}
			catch(Exception _ex)
			{
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.Q(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public void destroy()
	{
		try
		{
			anInt13++;
			if(Class30.anApplet_Sub1_629 != this || Class23.aBoolean465)
			{
				return;
			} else
			{
				Class33_Sub4.aLong2082 = Class60.method1073(false);
				Class33_Sub6_Sub17.method593(0, 5000L);
				Class33_Sub6_Sub4_Sub6.aClass72_3611 = null;
				method12(87);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.destroy(" + ')');
		}
	}

	public void windowIconified(WindowEvent arg0)
	{
		try
		{
			anInt39++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.windowIconified(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public AppletContext getAppletContext()
	{
		try
		{
			anInt22++;
			if(Class33_Sub6_Sub4_Sub6.aFrame3606 != null)
				return null;
			if(Class22.aClass72_416 != null && Class22.aClass72_416.anApplet1536 != this)
				return Class22.aClass72_416.anApplet1536.getAppletContext();
			else
				return super.getAppletContext();
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.getAppletContext(" + ')');
		}
	}

	public URL getDocumentBase()
	{
		try
		{
			anInt31++;
			if(Class33_Sub6_Sub4_Sub6.aFrame3606 != null)
				return null;
			if(Class22.aClass72_416 != null && Class22.aClass72_416.anApplet1536 != this)
				return Class22.aClass72_416.anApplet1536.getDocumentBase();
			else
				return super.getDocumentBase();
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.getDocumentBase(" + ')');
		}
	}

	public static void method16(int arg0, byte arg1[], Class12 arg2, int arg3)
	{
		try
		{
			Class33_Sub20 class33_sub20 = new Class33_Sub20();
			class33_sub20.anInt2572 = arg0;
			class33_sub20.aByteArray2570 = arg1;
			class33_sub20.aClass12_2557 = arg2;
			class33_sub20.aLong747 = arg3;
			synchronized(Class33_Sub6_Sub4.aClass4_2739)
			{
				Class33_Sub6_Sub4.aClass4_2739.method63(class33_sub20, (byte)39);
			}
			anInt24++;
			Class33_Sub6_Sub12.method549(-103);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.T(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + (arg2 == null ? "null" : "{...}") + ',' + arg3 + ')');
		}
	}

	public abstract void init();

	public synchronized void method17(int arg0)
	{
		try
		{
			anInt16++;
			Object obj;
			if(Class33_Sub6_Sub4_Sub6.aFrame3606 != null)
				obj = Class33_Sub6_Sub4_Sub6.aFrame3606;
			else
				obj = Class22.aClass72_416.anApplet1536;
			if(Class33_Sub6_Sub4_Sub1.aCanvas3367 != null)
			{
				Class33_Sub6_Sub4_Sub1.aCanvas3367.removeFocusListener(this);
				((Container) (obj)).remove(Class33_Sub6_Sub4_Sub1.aCanvas3367);
			}
			Class33_Sub6_Sub4_Sub1.aCanvas3367 = new Canvas_Sub1(this);
			((Container) (obj)).add(Class33_Sub6_Sub4_Sub1.aCanvas3367);
			if(arg0 != 0)
				return;
			Class33_Sub6_Sub4_Sub1.aCanvas3367.setSize(Class33_Sub13_Sub4.anInt3258, Class15.anInt307);
			Class33_Sub6_Sub4_Sub1.aCanvas3367.setVisible(true);
			if(Class33_Sub6_Sub4_Sub6.aFrame3606 != null)
			{
				Insets insets = Class33_Sub6_Sub4_Sub6.aFrame3606.getInsets();
				Class33_Sub6_Sub4_Sub1.aCanvas3367.setLocation(insets.left, insets.top);
			} else
			{
				Class33_Sub6_Sub4_Sub1.aCanvas3367.setLocation(0, 0);
			}
			Class33_Sub6_Sub4_Sub1.aCanvas3367.addFocusListener(this);
			Class33_Sub6_Sub4_Sub1.aCanvas3367.requestFocus();
			Class33_Sub6_Sub5.aBoolean2752 = true;
			Class9.aBoolean167 = false;
			Canvas_Sub1.aLong68 = Class60.method1073(false);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.W(" + arg0 + ')');
		}
	}

	public static void providesignlink(Class72 arg0)
	{
		try
		{
			anInt18++;
			Class33_Sub6_Sub4_Sub6.aClass72_3611 = Class22.aClass72_416 = arg0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.providesignlink(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public abstract void method18(byte byte0);

	public static void method19(int arg0, long arg1)
	{
		try
		{
			anInt12++;
			if(arg1 == 0L)
				return;
			for(int i = 0; ~i > ~Class65.anInt1388; i++)
			{
				if(~Class33_Sub6_Sub16.aLongArray3103[i] != ~arg1)
					continue;
				Class74.aBoolean1579 = true;
				Class65.anInt1388--;
				for(int j = i; j < Class65.anInt1388; j++)
					Class33_Sub6_Sub16.aLongArray3103[j] = Class33_Sub6_Sub16.aLongArray3103[1 + j];

				Class46.aClass33_Sub11_Sub1_989.method683(80, -1198);
				Class33_Sub12.anInt2317++;
				Class46.aClass33_Sub11_Sub1_989.method675(arg1, (byte)126);
				break;
			}

			if(arg0 != 1)
			{
				method19(-6, -19L);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.BA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public synchronized void paint(Graphics arg0)
	{
		try
		{
			anInt40++;
			if(Class30.anApplet_Sub1_629 != this || Class23.aBoolean465)
				return;
			Class33_Sub6_Sub5.aBoolean2752 = true;
			if(Class72.aString1542 != null && Class72.aString1542.startsWith("1.5") && Class60.method1073(false) + -Canvas_Sub1.aLong68 > 1000L)
			{
				Rectangle rectangle = arg0.getClipBounds();
				if(rectangle == null || Class33_Sub13_Sub4.anInt3258 <= rectangle.width && ~rectangle.height <= ~Class15.anInt307)
					Class9.aBoolean167 = true;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.paint(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method20(int arg0)
	{
		try
		{
			anInt38++;
			Class33_Sub6_Sub4_Sub2.aClass77_3386.method1168(arg0 + -12387);
			if(arg0 != 12289)
				return;
			for(int i = 0; ~i > -33; i++)
				Class41.aLongArray907[i] = 0L;

			for(int j = 0; j < 32; j++)
				Class33_Sub6_Sub4_Sub4.aLongArray3466[j] = 0L;

			Class33_Sub11.anInt2277 = 0;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.V(" + arg0 + ')');
		}
	}

	public void windowActivated(WindowEvent arg0)
	{
		try
		{
			anInt32++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.windowActivated(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method21(long arg0, boolean arg1)
	{
		try
		{
			anInt30++;
			if(arg0 == 0L)
				return;
			if(!arg1)
				method25(-77);
			for(int i = 0; Class33_Sub6_Sub12.anInt2979 > i; i++)
				if(Class47.aLongArray1032[i] == arg0)
				{
					Class33_Sub6_Sub12.anInt2979--;
					Class74.aBoolean1579 = true;
					for(int j = i; ~Class33_Sub6_Sub12.anInt2979 < ~j; j++)
					{
						Class32.aClass58Array711[j] = Class32.aClass58Array711[1 + j];
						Class30_Sub1.anIntArray2013[j] = Class30_Sub1.anIntArray2013[j - -1];
						Class47.aLongArray1032[j] = Class47.aLongArray1032[j - -1];
						Class16.anIntArray315[j] = Class16.anIntArray315[j + 1];
					}

					Class57.anInt1255++;
					Class33_Sub6_Sub15.anInt3059 += 32;
					Class46.aClass33_Sub11_Sub1_989.method683(93, -1198);
					Class46.aClass33_Sub11_Sub1_989.method675(arg0, (byte)124);
					return;
				}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.HA(" + arg0 + ',' + arg1 + ')');
		}
	}

	public void windowOpened(WindowEvent arg0)
	{
		try
		{
			anInt2++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.windowOpened(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public void run()
	{
		try
		{
			anInt15++;
			try
			{
				if(Class72.aString1532 != null)
				{
					String s = Class72.aString1532.toLowerCase();
					if(s.indexOf("sun") != -1 || ~s.indexOf("apple") != 0)
					{
						String s1 = Class72.aString1542;
						if(s1.equals("1.1") || s1.startsWith("1.1.") || s1.equals("1.2") || s1.startsWith("1.2."))
						{
							method15(-92, "wrongjava");
							return;
						}
						Class21.anInt400 = 5;
					} else
					if(s.indexOf("ibm") != -1 && (Class72.aString1542 == null || Class72.aString1542.equals("1.4.2")))
					{
						method15(-76, "wrongjava");
						return;
					}
				}
				if(Class22.aClass72_416.anApplet1536 != null)
				{
					Method method = Class72.aMethod1538;
					if(method != null)
						try
						{
							method.invoke(Class22.aClass72_416.anApplet1536, new Object[] {
								Boolean.TRUE
							});
						}
						catch(Throwable _ex) { }
				}
				method17(0);
				Class33_Sub7.aClass15_2146 = Class33_Sub6_Sub8.method512((byte)-126, Class33_Sub6_Sub4_Sub1.aCanvas3367, Class33_Sub13_Sub4.anInt3258, Class15.anInt307);
				method28((byte)39);
				Class33_Sub6_Sub4_Sub2.aClass77_3386 = Class48.method928((byte)-62);
				Class33_Sub6_Sub4_Sub2.aClass77_3386.method1168(-115);
				for(; Class33_Sub4.aLong2082 == 0L || ~Class33_Sub4.aLong2082 < ~Class60.method1073(false); Class13.method120(Class33_Sub6_Sub4_Sub1.aCanvas3367, 50, Class22.aClass72_416))
				{
					Class33_Sub11.anInt2277 = Class33_Sub6_Sub4_Sub2.aClass77_3386.method1172(0x69abdc08, Class33_Sub20.anInt2563, Class21.anInt400);
					for(int i = 0; i < Class33_Sub11.anInt2277; i++)
						method22((byte)-111);

					method30(-24717);
				}

			}
			catch(Exception exception)
			{
				Class50.method938((byte)-99, exception, null);
				method15(-79, "crash");
			}
			method12(82);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.run(" + ')');
		}
	}

	public void method22(byte arg0)
	{
		try
		{
			if(arg0 > -14)
				aClass58_17 = null;
			long l = Class60.method1073(false);
			anInt46++;
			long l1 = Class33_Sub6_Sub4_Sub4.aLongArray3466[Class66.anInt1412];
			boolean _tmp = ~l1 != -1L && ~l < ~l1;
			Class33_Sub6_Sub4_Sub4.aLongArray3466[Class66.anInt1412] = l;
			Class66.anInt1412 = 0x1f & 1 + Class66.anInt1412;
			synchronized(this)
			{
				Class13.aBoolean271 = Class33_Sub6_Sub4_Sub5.aBoolean3552;
			}
			method32(10);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.O(" + arg0 + ')');
		}
	}

	public static void method23(byte arg0)
	{
		try
		{
			if(arg0 >= -53)
				method33(-43, -109, null, null, -78, null);
			aClass16_11.method147((byte)-54);
			anInt3++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.FA(" + arg0 + ')');
		}
	}

	public void method24(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		try
		{
			anInt20++;
			try
			{
				Class15.anInt307 = arg0;
				Class33_Sub13_Sub4.anInt3258 = arg2;
				Class30.anApplet_Sub1_629 = this;
				Class12.anInt225 = arg5;
				Class33_Sub6_Sub4_Sub6.aFrame3606 = new GameWindow();
				//Class33_Sub6_Sub4_Sub6.aFrame3606 = new Frame();
				//Class33_Sub6_Sub4_Sub6.aFrame3606.setTitle("Jagex");
				Class33_Sub6_Sub4_Sub6.aFrame3606.setResizable(false);
				Class33_Sub6_Sub4_Sub6.aFrame3606.addWindowListener(this);
				Class33_Sub6_Sub4_Sub6.aFrame3606.setVisible(true);
				//Class33_Sub6_Sub4_Sub6.aFrame3606.toFront();
				Insets insets = Class33_Sub6_Sub4_Sub6.aFrame3606.getInsets();
				Class33_Sub6_Sub4_Sub6.aFrame3606.setSize((arg2 + insets.left) - -insets.right, insets.bottom + insets.top + arg0);
				Class33_Sub6_Sub4_Sub6.aClass72_3611 = Class22.aClass72_416 = new Class72(true, null, arg6, arg1, arg4);
				if(arg3 != 13044)
					method31(-106);
				Class22.aClass72_416.method1142(this, -23553, 1);
				return;
			}
			catch(Exception exception)
			{
				Class50.method938((byte)-54, exception, null);
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.P(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public static void method25(int arg0)
	{
		try
		{
			aClass58_23 = null;
			if(arg0 > -105)
				aClass58_43 = null;
			aClass58_45 = null;
			aClass58_43 = null;
			aClass58_37 = null;
			aClass58_17 = null;
			aClass16_11 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.DA(" + arg0 + ')');
		}
	}

	public Applet_Sub1()
	{
		aBoolean6 = false;
	}

	public void method26(int arg0, int arg1, int arg2, int arg3, int arg4)
	{
		try
		{
			anInt42++;
			try
			{
				if(Class30.anApplet_Sub1_629 != null)
				{
					Class33_Sub11.anInt2262++;
					if(~Class33_Sub11.anInt2262 <= -4)
					{
						method15(-77, "alreadyloaded");
						return;
					} else
					{
						getAppletContext().showDocument(getDocumentBase(), "_self");
						return;
					}
				}
				Class33_Sub13_Sub4.anInt3258 = arg4;
				Class12.anInt225 = arg1;
				Class30.anApplet_Sub1_629 = this;
				Class15.anInt307 = arg3;
				if(Class22.aClass72_416 == null)
					Class33_Sub6_Sub4_Sub6.aClass72_3611 = Class22.aClass72_416 = new Class72(false, this, arg2, null, 0);
				Class22.aClass72_416.method1142(this, -23553, 1);
			}
			catch(Exception exception)
			{
				Class50.method938((byte)-102, exception, null);
				method15(arg0 ^ 0xffff8f27, "crash");
			}
			if(arg0 != 28818)
			{
				aClass58_45 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.GA(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
		}
	}

	public static int method27(int arg0, int arg1, Class33_Sub15 arg2)
	{
		try
		{
			anInt28++;
			if(arg2.anIntArrayArray2411 == null || ~arg2.anIntArrayArray2411.length >= ~arg1)
				return -2;
			try
			{
				int ai[] = arg2.anIntArrayArray2411[arg1];
				int i = arg0;
				int j = 0;
				byte byte0 = 0;
				do
				{
					int l = 0;
					int k = ai[j++];
					byte byte1 = 0;
					if(k == 0)
						return i;
					if(k == 15)
						byte1 = 1;
					if(k == 16)
						byte1 = 2;
					if(k == 1)
						l = Class39.anIntArray864[ai[j++]];
					if(k == 2)
						l = Class33_Sub6_Sub5.anIntArray2755[ai[j++]];
					if(k == 17)
						byte1 = 3;
					if(k == 3)
						l = Class3.anIntArray109[ai[j++]];
					if(~k == -5)
					{
						int i1 = ai[j++] << 0x78c1bb10;
						i1 += ai[j++];
						Class33_Sub15 class33_sub15 = Class49.method933(i1, -76);
						int k2 = ai[j++];
						if(k2 != -1 && (!Class14.method127(k2, (byte)90).aBoolean2935 || Class77.aBoolean1647))
						{
							for(int i3 = 0; class33_sub15.anIntArray2471.length > i3; i3++)
								if(class33_sub15.anIntArray2471[i3] == k2 + 1)
									l += class33_sub15.anIntArray2398[i3];

						}
					}
					if(~k == -6)
						l = Class33_Sub5.anIntArray2120[ai[j++]];
					if(k == 6)
						l = Class33_Sub6_Sub4_Sub2.anIntArray3381[Class33_Sub6_Sub5.anIntArray2755[ai[j++]] + -1];
					if(k == 7)
						l = (Class33_Sub5.anIntArray2120[ai[j++]] * 100) / 46875;
					if(k == 8)
						l = Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305.anInt3738;
					if(k == 9)
					{
						for(int j1 = 0; ~j1 > -26; j1++)
							if(Class63.aBooleanArray1337[j1])
								l += Class33_Sub6_Sub5.anIntArray2755[j1];

					}
					if(~k == -11)
					{
						int k1 = ai[j++] << 0x64e55850;
						k1 += ai[j++];
						Class33_Sub15 class33_sub15_1 = Class49.method933(k1, -105);
						int l2 = ai[j++];
						if(~l2 != 0 && (!Class14.method127(l2, (byte)90).aBoolean2935 || Class77.aBoolean1647))
						{
							for(int j3 = 0; ~class33_sub15_1.anIntArray2471.length < ~j3; j3++)
							{
								if(1 + l2 != class33_sub15_1.anIntArray2471[j3])
									continue;
								l = 0x3b9ac9ff;
								break;
							}

						}
					}
					if(~k == -12)
						l = Class33_Sub4.anInt2079;
					if(k == 12)
						l = Class82.anInt1774;
					if(~k == -14)
					{
						int l1 = Class33_Sub5.anIntArray2120[ai[j++]];
						int j2 = ai[j++];
						l = (1 << j2 & l1) == 0 ? 0 : 1;
					}
					if(~k == -15)
					{
						int i2 = ai[j++];
						l = Class22.method179((byte)84, i2);
					}
					if(~k == -19)
						l = (((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3548 >> 0x6f24de87) - -Class69.anInt1475;
					if(k == 19)
						l = (((Class33_Sub6_Sub4_Sub5) (Class33_Sub13_Sub4.aClass33_Sub6_Sub4_Sub5_Sub1_3305)).anInt3510 >> 0xb5d36ca7) + Class33_Sub2.anInt2036;
					if(k == 20)
						l = ai[j++];
					if(byte1 != 0)
					{
						byte0 = byte1;
					} else
					{
						if(~byte0 == -1)
							i += l;
						if(byte0 == 1)
							i -= l;
						if(~byte0 == -3 && l != 0)
							i /= l;
						if(byte0 == 3)
							i *= l;
						byte0 = 0;
					}
				} while(true);
			}
			catch(Exception _ex)
			{
				return -1;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.CA(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ')');
		}
	}

	public abstract void method28(byte byte0);

	public void windowClosing(WindowEvent arg0)
	{
		try
		{
			destroy();
			anInt34++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.windowClosing(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public void stop()
	{
		try
		{
			anInt33++;
			if(Class30.anApplet_Sub1_629 != this || Class23.aBoolean465)
			{
				return;
			} else
			{
				Class33_Sub4.aLong2082 = 4000L + Class60.method1073(false);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.stop(" + ')');
		}
	}

	public abstract void method29(int i);

	public void start()
	{
		try
		{
			anInt29++;
			if(Class30.anApplet_Sub1_629 != this || Class23.aBoolean465)
			{
				return;
			} else
			{
				Class33_Sub4.aLong2082 = 0L;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.start(" + ')');
		}
	}

	public void method30(int arg0)
	{
		try
		{
			anInt10++;
			long l = Class60.method1073(false);
			long l1 = Class41.aLongArray907[Class33_Sub6_Sub4_Sub5_Sub2.anInt3795];
			Class41.aLongArray907[Class33_Sub6_Sub4_Sub5_Sub2.anInt3795] = l;
			if(~l1 != -1L && ~l < ~l1)
			{
				int i = (int)(-l1 + l);
				Class11.anInt202 = ((i >> 0x2fec1521) + 32000) / i;
			}
			Class33_Sub6_Sub4_Sub5_Sub2.anInt3795 = Class33_Sub6_Sub4_Sub5_Sub2.anInt3795 + 1 & 0x1f;
			if(Class75.anInt1596++ > 50)
			{
				Class33_Sub6_Sub5.aBoolean2752 = true;
				Class75.anInt1596 -= 50;
				Class33_Sub6_Sub4_Sub1.aCanvas3367.setSize(Class33_Sub13_Sub4.anInt3258, Class15.anInt307);
				Class33_Sub6_Sub4_Sub1.aCanvas3367.setVisible(true);
				if(Class33_Sub6_Sub4_Sub6.aFrame3606 != null) {
					if(!donePosition) {
						donePosition = true;
						Class33_Sub6_Sub4_Sub6.aFrame3606.pack();
						Class33_Sub6_Sub4_Sub6.aFrame3606.setVisible(true);
						Class33_Sub6_Sub4_Sub6.aFrame3606.toFront();
					}
				}
				/*if(Class33_Sub6_Sub4_Sub6.aFrame3606 == null)
				{
					Class33_Sub6_Sub4_Sub1.aCanvas3367.setLocation(0, 0);
				} else
				{
					Insets insets = Class33_Sub6_Sub4_Sub6.aFrame3606.getInsets();
					Class33_Sub6_Sub4_Sub1.aCanvas3367.setLocation(insets.left, insets.top);
				}*/
			}
			method11(-19);
			if(arg0 != -24717)
			{
				aClass58_23 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.EA(" + arg0 + ')');
		}
	}
	
	private boolean donePosition = false;

	public static int method31(int arg0)
	{
		try
		{
			anInt5++;
			int i = 93 / ((38 - arg0) / 55);
			return Class11.anInt189++;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.R(" + arg0 + ')');
		}
	}

	public void focusLost(FocusEvent arg0)
	{
		try
		{
			Class33_Sub6_Sub4_Sub5.aBoolean3552 = false;
			anInt26++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.focusLost(" + (arg0 == null ? "null" : "{...}") + ')');
		}
	}

	public abstract void method32(int i);

	public static void method33(int arg0, int arg1, byte arg2[], Class56 arg3, int arg4, Class70 arg5[])
	{
		try
		{
			if(arg1 != -21078)
				aClass16_11 = null;
			anInt25++;
			int i = -1;
			Class33_Sub11 class33_sub11 = new Class33_Sub11(arg2);
			do
			{
				int j = class33_sub11.method651(-122);
				if(j == 0)
					break;
				i += j;
				int k = 0;
				do
				{
					int l = class33_sub11.method651(79);
					if(l == 0)
						break;
					k += -1 + l;
					int i1 = 0x3f & k;
					int k1 = k >> 0x6910b5cc;
					int l1 = class33_sub11.method639((byte)123);
					int j1 = k >> 0x1096c866 & 0x3f;
					int i2 = l1 >> 0x609bfde2;
					int k2 = arg0 + j1;
					int l2 = arg4 + i1;
					int j2 = l1 & 3;
					if(~k2 < -1 && l2 > 0 && k2 < 103 && ~l2 > -104)
					{
						int i3 = k1;
						if((Class35.aByteArrayArrayArray761[1][k2][l2] & 2) == 2)
							i3--;
						Class70 class70 = null;
						if(~i3 <= -1)
							class70 = arg5[i3];
						Class33_Sub20.method823(j2, l2, arg3, k2, i, class70, i2, (byte)87, k1);
					}
				} while(true);
			} while(true);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "v.N(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + (arg3 == null ? "null" : "{...}") + ',' + arg4 + ',' + (arg5 == null ? "null" : "{...}") + ')');
		}
	}

	public static int anInt1;
	public static int anInt2;
	public static int anInt3;
	public static int anInt4;
	public static int anInt5;
	public boolean aBoolean6;
	public static int anInt7;
	public static int anInt8;
	public static int anInt9;
	public static int anInt10;
	public static Class16 aClass16_11 = new Class16(260);
	public static int anInt12;
	public static int anInt13;
	public static int anInt14;
	public static int anInt15;
	public static int anInt16;
	public static Class58 aClass58_17 = Class33_Sub6_Sub11.method535(107, "sl_arrows");
	public static int anInt18;
	public static int anInt19;
	public static int anInt20;
	public static int anInt21;
	public static int anInt22;
	public static Class58 aClass58_23 = Class33_Sub6_Sub11.method535(111, "null");
	public static int anInt24;
	public static int anInt25;
	public static int anInt26;
	public static int anInt27;
	public static int anInt28;
	public static int anInt29;
	public static int anInt30;
	public static int anInt31;
	public static int anInt32;
	public static int anInt33;
	public static int anInt34;
	public static int anInt35;
	public static int anInt36;
	public static Class58 aClass58_37 = Class33_Sub6_Sub11.method535(125, "null");
	public static int anInt38;
	public static int anInt39;
	public static int anInt40;
	public static int anInt41 = 0;
	public static int anInt42;
	public static Class58 aClass58_43 = Class33_Sub6_Sub11.method535(124, "Benutzen Sie die (WPasswort -=ndern(W Option");
	public static int anInt44;
	public static Class58 aClass58_45 = Class33_Sub6_Sub11.method535(113, "::errortest");
	public static int anInt46;
	public static int anInt47;

}
