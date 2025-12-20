// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class72.java

import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.*;
import java.lang.reflect.Method;
import java.net.*;
import java.util.Random;

public class Class72
	implements Runnable
{

	public void method1140(int arg0)
	{
		synchronized(this)
		{
			aBoolean1528 = true;
			notifyAll();
		}
		try
		{
			aThread1530.join();
			if(arg0 != 0)
				method1143(-96, null, null);
		}
		catch(InterruptedException _ex) { }
		if(aClass18_1545 != null)
			try
			{
				aClass18_1545.method160(-113);
			}
			catch(IOException _ex) { }
		if(aClass18_1534 != null)
			try
			{
				aClass18_1534.method160(22);
			}
			catch(IOException _ex) { }
		if(aClass18Array1540 != null)
		{
			for(int i = 0; ~aClass18Array1540.length < ~i; i++)
				if(aClass18Array1540[i] != null)
					try
					{
						aClass18Array1540[i].method160(arg0 ^ 0x78);
					}
					catch(IOException _ex) { }

		}
	}

	public Class6 method1141(int arg0, int arg1, int arg2, Object arg3, int arg4)
	{
		try
		{
			Class6 class6 = new Class6();
			class6.anObject152 = arg3;
			if(arg0 != 0)
				method1147(null, null, -15, null);
			class6.anInt148 = arg4;
			class6.anInt153 = arg1;
			synchronized(this)
			{
				if(aClass6_1531 == null)
				{
					aClass6_1531 = aClass6_1533 = class6;
				} else
				{
					aClass6_1531.aClass6_150 = class6;
					aClass6_1531 = class6;
				}
				notify();
			}
			return class6;
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public Class6 method1142(Runnable arg0, int arg1, int arg2)
	{
		try
		{
			if(arg1 != -23553)
				method1148(-38, true);
			return method1141(0, 2, 0, arg0, arg2);
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public Class6 method1143(int arg0, String arg1, Class arg2)
	{
		try
		{
			if(arg0 != 0)
				method1141(-88, -106, 29, null, 85);
			return method1141(0, 9, 0, ((Object) (new Object[] {
				arg2, arg1
			})), 0);
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public void method1144(int arg0, int arg1, String arg2, int arg3)
	{
		if(arg1 < 95)
			method1149(-19);
		if(arg0 < 32 || ~arg0 < -35)
			arg0 = 32;
		String as[] = {
			"./cache/", "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString1541, "/tmp/", ""
		};
		boolean flag = false;
		String as1[] = {
			".jagex_cache_" + arg0, ".file_store_" + arg0
		};
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; ~j > ~as1.length; j++)
			{
				for(int k = 0; ~k > ~as.length; k++)
				{
					try
					{
						String s = as[k];
						if(s.length() > 0 && !(new File(s)).exists())
							continue;
						File file = new File(s + as1[j]);
						if(~i == -2 && !file.exists())
						{
							boolean flag1 = file.mkdir();
							if(!flag1)
								continue;
						}
						if(!flag)
							try
							{
								File file1 = new File(file, "uid.dat");
								if(i == 1 && (!file1.exists() || ~file1.length() > -5L))
								{
									int i1 = -1;
									Random random = new Random();
									for(; i1 == -1; i1 = random.nextInt());
									DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(file1));
									dataoutputstream.writeInt(i1);
									dataoutputstream.close();
								}
								if(file1.exists())
								{
									flag = true;
									DataInputStream datainputstream = new DataInputStream(new FileInputStream(file1));
									anInt1539 = datainputstream.readInt() + 1;
									datainputstream.close();
								}
							}
							catch(Exception _ex) { }
						if(aFile1535 == null)
							try
							{
								file = new File(file, arg2);
								if(i == 1 && !file.exists())
								{
									boolean flag2 = file.mkdir();
									if(!flag2)
										continue;
								}
								File file2 = new File(file, "main_file_cache.dat2");
								if(i == 0 && !file2.exists())
									continue;
								aClass18_1545 = new Class18(file2, "rw", 0x3200000L);
								aClass18Array1540 = new Class18[arg3];
								for(int j1 = 0; arg3 > j1; j1++)
									aClass18Array1540[j1] = new Class18(new File(file, "main_file_cache.idx" + j1), "rw", 0x100000L);

								aClass18_1534 = new Class18(new File(file, "main_file_cache.idx255"), "rw", 0x100000L);
								aFile1527 = aFile1535 = file;
							}
							catch(Exception _ex)
							{
								try
								{
									aClass18_1545.method160(-118);
									for(int l = 0; ~arg3 < ~l; l++)
										aClass18Array1540[l].method160(2);

									aClass18_1534.method160(-62);
								}
								catch(Exception _ex2) { }
								aClass18Array1540 = null;
								aFile1527 = aFile1535 = null;
								aClass18_1545 = aClass18_1534 = null;
							}
					}
					catch(Exception _ex) { }
					if(flag && aFile1535 != null)
						return;
				}

			}

		}

		if(aFile1535 == null)
			throw new RuntimeException();
		else
			return;
	}

	public Class6 method1145(int arg0, URL arg1)
	{
		try
		{
			if(arg0 < 112)
				anInt1537 = 48;
			return method1141(0, 4, 0, arg1, 0);
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public Class6 method1146(String arg0, int arg1, byte arg2)
	{
		try
		{
			if(arg2 != -69)
				method1147(null, null, -52, null);
			return method1141(0, 1, 0, arg0, arg1);
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public Class6 method1147(Class arg0[], String arg1, int arg2, Class arg3)
	{
		try
		{
			if(arg2 != 21417)
				method1147(null, null, 31, null);
			return method1141(0, 8, 0, ((Object) (new Object[] {
				arg3, arg1, arg0
			})), 0);
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public void run()
	{
		do
			try
			{
				Class6 class6;
				synchronized(this)
				{
					do
					{
						if(aBoolean1528)
							return;
						if(aClass6_1533 != null)
						{
							class6 = aClass6_1533;
							aClass6_1533 = aClass6_1533.aClass6_150;
							if(aClass6_1533 == null)
								aClass6_1531 = null;
							break;
						}
						try
						{
							wait();
						}
						catch(InterruptedException _ex) { }
					} while(true);
				}
				try
				{
					int i = class6.anInt153;
					if(i == 1)
						class6.anObject149 = new Socket(InetAddress.getByName((String)class6.anObject152), class6.anInt148);
					else
					if(~i == -3)
					{
						Thread thread = new Thread((Runnable)class6.anObject152);
						thread.setDaemon(true);
						thread.start();
						thread.setPriority(class6.anInt148);
						class6.anObject149 = thread;
					} else
					if(~i != -5)
					{
						if(i != 8)
						{
							if(~i != -10)
								throw new Exception();
							Object aobj[] = (Object[])class6.anObject152;
							class6.anObject149 = ((Class)aobj[0]).getDeclaredField((String)aobj[1]);
						} else
						{
							Object aobj1[] = (Object[])class6.anObject152;
							class6.anObject149 = ((Class)aobj1[0]).getDeclaredMethod((String)aobj1[1], (Class[])aobj1[2]);
						}
					} else
					{
						class6.anObject149 = new DataInputStream(((URL)class6.anObject152).openStream());
					}
					class6.anInt151 = 1;
				}
				catch(ThreadDeath threaddeath)
				{
					throw threaddeath;
				}
				catch(Throwable _ex)
				{
					class6.anInt151 = 2;
				}
			}
			catch(RuntimeException runtimeexception)
			{
				throw runtimeexception;
			}
		while(true);
	}

	public Class6 method1148(int arg0, boolean arg1)
	{
		try
		{
			if(!arg1)
				method1147(null, null, -4, null);
			return method1141(0, 3, 0, null, arg0);
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public Interface3 method1149(int arg0)
	{
		try
		{
			if(arg0 > -81)
				run();
			return anInterface3_1543;
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public Class72(boolean arg0, Applet arg1, int arg2, String arg3, int arg4)
	{
		aClass6_1531 = null;
		aFile1527 = null;
		anInt1539 = 0;
		aClass18_1534 = null;
		aClass6_1533 = null;
		anApplet1536 = null;
		aBoolean1528 = false;
		aClass18_1545 = null;
		aFile1535 = null;
		try
		{
			aString1542 = "1.1";
			anApplet1536 = arg1;
			aString1532 = "Unknown";
			try
			{
				aString1532 = System.getProperty("java.vendor");
				aString1542 = System.getProperty("java.version");
			}
			catch(Exception _ex) { }
			try
			{
				aString1541 = System.getProperty("user.home");
				if(aString1541 != null)
					aString1541 = aString1541 + "/";
			}
			catch(Exception _ex) { }
			if(aString1541 == null)
				aString1541 = "~/";
			try
			{
				anEventQueue1544 = Toolkit.getDefaultToolkit().getSystemEventQueue();
			}
			catch(Throwable _ex) { }
			try
			{
				if(arg1 != null)
					aMethod1529 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", new Class[] {
						Boolean.TYPE
					});
				else
					aMethod1529 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[] {
						Boolean.TYPE
					});
			}
			catch(Exception _ex) { }
			try
			{
				if(arg1 != null)
					aMethod1538 = arg1.getClass().getMethod("setFocusCycleRoot", new Class[] {
						Boolean.TYPE
					});
				else
					aMethod1538 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[] {
						Boolean.TYPE
					});
			}
			catch(Exception _ex) { }
			if(arg0)
				method1144(arg2, 127, arg3, arg4);
			aBoolean1528 = false;
			aThread1530 = new Thread(this);
			aThread1530.setPriority(10);
			aThread1530.setDaemon(true);
			aThread1530.start();
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public File aFile1527;
	public boolean aBoolean1528;
	public static Method aMethod1529;
	public Thread aThread1530;
	public Class6 aClass6_1531;
	public static String aString1532;
	public Class6 aClass6_1533;
	public Class18 aClass18_1534;
	public File aFile1535;
	public Applet anApplet1536;
	public static int anInt1537 = 3;
	public static Method aMethod1538;
	public int anInt1539;
	public Class18 aClass18Array1540[];
	public static String aString1541;
	public static String aString1542;
	public Interface3 anInterface3_1543;
	public EventQueue anEventQueue1544;
	public Class18 aClass18_1545;

}
