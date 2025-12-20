// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class43.java

import java.io.*;
import java.net.Socket;

public class Class43
	implements Runnable
{

	public void method894(int arg0, int arg1, byte arg2, byte arg3[])
		throws IOException
	{
		try
		{
			anInt943++;
			if(arg2 <= 115)
				method900(false);
			if(aBoolean939)
				return;
			while(arg0 > 0) 
			{
				int i = anInputStream929.read(arg3, arg1, arg0);
				if(~i >= -1)
					throw new EOFException();
				arg0 -= i;
				arg1 += i;
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.D(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public static void method895(Class30 arg0, Class30 arg1, boolean arg2)
	{
		try
		{
			Canvas_Sub1.aClass30_48 = arg0;
			Class33_Sub11.aClass30_2259 = arg1;
			anInt944++;
			if(!arg2)
			{
				method900(true);
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.A(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ')');
		}
	}

	public int method896(int arg0)
		throws IOException
	{
		try
		{
			anInt948++;
			if(arg0 != 0)
				return -3;
			if(aBoolean939)
				return 0;
			else
				return anInputStream929.available();
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.G(" + arg0 + ')');
		}
	}

	public void run()
	{
		try
		{
			anInt932++;
			try
			{
				do
				{
					int i;
					int j;
					synchronized(this)
					{
						if(~anInt924 == ~anInt945)
						{
							if(aBoolean939)
								break;
							try
							{
								wait();
							}
							catch(InterruptedException _ex) { }
						}
						if(~anInt945 > ~anInt924)
							i = -anInt924 + 5000;
						else
							i = -anInt924 + anInt945;
						j = anInt924;
					}
					if(i > 0)
					{
						try
						{
							anOutputStream937.write(aByteArray942, j, i);
						}
						catch(IOException _ex)
						{
							aBoolean940 = true;
						}
						anInt924 = (i + anInt924) % 5000;
						try
						{
							if(anInt945 == anInt924)
								anOutputStream937.flush();
						}
						catch(IOException _ex)
						{
							aBoolean940 = true;
						}
					}
				} while(true);
				try
				{
					if(anInputStream929 != null)
						anInputStream929.close();
					if(anOutputStream937 != null)
						anOutputStream937.close();
					if(aSocket933 != null)
						aSocket933.close();
				}
				catch(IOException _ex) { }
				aByteArray942 = null;
				return;
			}
			catch(Exception exception)
			{
				Class50.method938((byte)-74, exception, null);
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.run(" + ')');
		}
	}

	public int method897(int arg0)
		throws IOException
	{
		try
		{
			anInt926++;
			if(aBoolean939)
				return 0;
			if(arg0 != 27426)
				anInt945 = -94;
			return anInputStream929.read();
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.H(" + arg0 + ')');
		}
	}

	public static void method898(boolean arg0)
	{
		try
		{
			Class33_Sub6_Sub13.anInt2992 = 0;
			anInt949++;
			Class74.anInt1587 = 0;
			if(arg0)
				return;
			Class12.method116(0);
			Class35.method840(0);
			Class40.method887(2);
			for(int i = 0; Class74.anInt1587 > i; i++)
			{
				int j = Class33_Sub6_Sub13.anIntArray2988[i];
				if(~Class33_Sub6_Sub6.anInt2785 != ~((Class33_Sub6_Sub4_Sub5) (Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[j])).anInt3558)
				{
					Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[j].aClass33_Sub6_Sub16_3776 = null;
					Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[j] = null;
				}
			}

			if(Class34.anInt1826 != ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239)
				throw new RuntimeException("gnp1 pos:" + ((Class33_Sub11) (Class33_Sub6_Sub14.aClass33_Sub11_Sub1_3035)).anInt2239 + " psize:" + Class34.anInt1826);
			for(int k = 0; k < Class33_Sub6_Sub1.anInt2659; k++)
				if(Class33_Sub6_Sub11.aClass33_Sub6_Sub4_Sub5_Sub2Array2887[Class80.anIntArray1730[k]] == null)
					throw new RuntimeException("gnp2 pos:" + k + " size:" + Class33_Sub6_Sub1.anInt2659);

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.J(" + arg0 + ')');
		}
	}

	public static void method899(boolean arg0, Class30 arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		Class62.anInt1311 = arg4;
		Class22.aBoolean419 = arg0;
		Class33_Sub12.anInt2321 = arg5;
		Class62.anInt1312 = 1;
		Class55.anInt1161 = arg3;
		anInt947++;
		Class33_Sub15.anInt2357 = arg6;
		Class38.aClass30_852 = arg1;
		if(arg2 != 1368)
			method904(-84, 3, null, null);
	}

	public static void method900(boolean arg0)
	{
		Class79.anInt1699++;
		Class46.aClass33_Sub11_Sub1_989.method683(141, -1198);
		anInt928++;
		if(~Class77_Sub2.anInt2644 != 0)
		{
			Class77_Sub2.method1176(-81, Class77_Sub2.anInt2644);
			Class77_Sub2.anInt2644 = -1;
			Class74.aBoolean1579 = true;
			Class33_Sub18.anInt2514 = -1;
			Class26.aBoolean552 = true;
		}
		if(Class45.anInt965 != -1)
		{
			Class77_Sub2.method1176(-114, Class45.anInt965);
			Class45.anInt965 = -1;
			Class33_Sub18.anInt2514 = -1;
			Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
		}
		if(Class70.anInt1496 != -1)
		{
			Class77_Sub2.method1176(-104, Class70.anInt1496);
			Class70.anInt1496 = -1;
			Class29.method215(30, (byte)-47);
		}
		if(Class33.anInt734 != -1)
		{
			Class77_Sub2.method1176(-74, Class33.anInt734);
			Class33.anInt734 = -1;
		}
		if(Class33_Sub6_Sub14.anInt3013 != -1)
		{
			Class77_Sub2.method1176(-88, Class33_Sub6_Sub14.anInt3013);
			Class33_Sub18.anInt2514 = -1;
			Class33_Sub6_Sub14.anInt3013 = -1;
		}
		if(!arg0)
			aClass33_Sub6_Sub7_Sub4_931 = null;
	}

	public void method901(byte arg0, byte arg1[], int arg2, int arg3)
		throws IOException
	{
		try
		{
			anInt935++;
			if(aBoolean939)
				return;
			if(arg0 != 42)
				anOutputStream937 = null;
			if(aBoolean940)
			{
				aBoolean940 = false;
				throw new IOException();
			}
			if(aByteArray942 == null)
				aByteArray942 = new byte[5000];
			synchronized(this)
			{
				for(int i = 0; ~arg2 < ~i; i++)
				{
					aByteArray942[anInt945] = arg1[i + arg3];
					anInt945 = (1 + anInt945) % 5000;
					if(~anInt945 == ~((anInt924 - -4900) % 5000))
						throw new IOException();
				}

				if(aClass6_936 == null)
					aClass6_936 = aClass72_941.method1142(this, -23553, 3);
				notifyAll();
			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.C(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public static void method902(int arg0)
	{
		try
		{
			aClass58_938 = null;
			aClass58_925 = null;
			int i = 85 / ((62 - arg0) / 33);
			aClass58_950 = null;
			aClass33_Sub6_Sub7_Sub4_931 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.L(" + arg0 + ')');
		}
	}

	public void method903(int arg0)
	{
		try
		{
			anInt927++;
			if(aBoolean939)
				return;
			synchronized(this)
			{
				aBoolean939 = true;
				notifyAll();
			}
			if(arg0 != 1)
				aClass58_925 = null;
			if(aClass6_936 != null)
			{
				while(~aClass6_936.anInt151 == -1) 
					Class33_Sub6_Sub17.method593(arg0 ^ 1, 1L);
				if(~aClass6_936.anInt151 == -2)
					try
					{
						((Thread)aClass6_936.anObject149).join();
					}
					catch(InterruptedException _ex) { }
			}
			aClass6_936 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.B(" + arg0 + ')');
		}
	}

	public void finalize()
	{
		try
		{
			method903(1);
			anInt946++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.finalize(" + ')');
		}
	}

	public static void method904(int arg0, int arg1, Class58 arg2, Class58 arg3)
	{
		try
		{
			if(~Class45.anInt965 == 0)
				Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
			if(arg0 == 0 && Class81.anInt1744 != -1)
			{
				Class69.anInt1464 = 0;
				Class79.aClass58_1700 = arg2;
			}
			for(int i = 99; i > 0; i--)
			{
				Class33.anIntArray738[i] = Class33.anIntArray738[i + -1];
				Class33_Sub11_Sub1.aClass58Array3211[i] = Class33_Sub11_Sub1.aClass58Array3211[i - 1];
				Class33_Sub6_Sub17.aClass58Array3172[i] = Class33_Sub6_Sub17.aClass58Array3172[-1 + i];
			}

			Class33_Sub11_Sub1.aClass58Array3211[0] = arg3;
			anInt930++;
			Class33.anIntArray738[arg1] = arg0;
			Class33_Sub6_Sub17.aClass58Array3172[0] = arg2;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.E(" + arg0 + ',' + arg1 + ',' + (arg2 == null ? "null" : "{...}") + ',' + (arg3 == null ? "null" : "{...}") + ')');
		}
	}

	public static boolean method905(int arg0, int arg1)
	{
		try
		{
			if(arg0 != 5757)
				aClass58_925 = null;
			anInt934++;
			return ~arg1 <= -49 && ~arg1 >= -58;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.K(" + arg0 + ',' + arg1 + ')');
		}
	}

	public Class43(Socket arg0, Class72 arg1)
		throws IOException
	{
		aBoolean939 = false;
		anInt924 = 0;
		anInt945 = 0;
		aBoolean940 = false;
		try
		{
			aClass72_941 = arg1;
			aSocket933 = arg0;
			aSocket933.setSoTimeout(30000);
			aSocket933.setTcpNoDelay(true);
			anInputStream929 = aSocket933.getInputStream();
			anOutputStream937 = aSocket933.getOutputStream();
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "nc.<init>(" + (arg0 == null ? "null" : "{...}") + ',' + (arg1 == null ? "null" : "{...}") + ')');
		}
	}

	public int anInt924;
	public static Class58 aClass58_925 = Class33_Sub6_Sub11.method535(110, "");
	public static int anInt926;
	public static int anInt927;
	public static int anInt928;
	public InputStream anInputStream929;
	public static int anInt930;
	public static Class33_Sub6_Sub7_Sub4 aClass33_Sub6_Sub7_Sub4_931;
	public static int anInt932;
	public Socket aSocket933;
	public static int anInt934;
	public static int anInt935;
	public Class6 aClass6_936;
	public OutputStream anOutputStream937;
	public static Class58 aClass58_938;
	public boolean aBoolean939;
	public boolean aBoolean940;
	public Class72 aClass72_941;
	public byte aByteArray942[];
	public static int anInt943;
	public static int anInt944;
	public int anInt945;
	public static int anInt946;
	public static int anInt947;
	public static int anInt948;
	public static int anInt949;
	public static Class58 aClass58_950;

	static 
	{
		aClass58_950 = Class33_Sub6_Sub11.method535(122, " has logged in)3");
		aClass58_938 = aClass58_950;
	}
}
