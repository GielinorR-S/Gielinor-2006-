// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class18.java

import java.io.*;

public class Class18
{

	public int method157(byte arg0, int arg1, byte arg2[], int arg3)
		throws IOException
	{
		try
		{
			int i = aRandomAccessFile354.read(arg2, arg1, arg3);
			if(arg0 != -16)
				return 44;
			if(~i < -1)
				aLong356 += i;
			return i;
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public void method158(int arg0, long arg1)
		throws IOException
	{
		try
		{
			if(arg0 != -1)
				aLong353 = 92L;
			aRandomAccessFile354.seek(arg1);
			aLong356 = arg1;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public long method159(int arg0)
		throws IOException
	{
		try
		{
			if(arg0 != -8624)
				method162(false);
			return aRandomAccessFile354.length();
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public void finalize()
		throws Throwable
	{
		if(aRandomAccessFile354 != null)
		{
			System.out.println("Warning! fileondisk " + aFile355 + " not closed correctly using close(). Auto-closing instead. ");
			method160(117);
		}
	}

	public void method160(int arg0)
		throws IOException
	{
		try
		{
			aRandomAccessFile354.close();
			int i = -107 / ((arg0 - 76) / 39);
			aRandomAccessFile354 = null;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public Class18(File arg0, String arg1, long arg2)
		throws IOException
	{
		try
		{
			if(~arg2 == 0L)
				arg2 = 0x7fffffffffffffffL;
			if(arg0.length() >= arg2)
				arg0.delete();
			aRandomAccessFile354 = new RandomAccessFile(arg0, arg1);
			aLong356 = 0L;
			aLong353 = arg2;
			aFile355 = arg0;
			int i = aRandomAccessFile354.read();
			if(i != -1 && !arg1.equals("r"))
			{
				aRandomAccessFile354.seek(0L);
				aRandomAccessFile354.write(i);
			}
			aRandomAccessFile354.seek(0L);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public void method161(int arg0, int arg1, byte arg2[], int arg3)
		throws IOException
	{
		try
		{
			if(arg1 != -16321)
				aLong356 = 84L;
			if(~((long)arg3 - -aLong356) < ~aLong353)
			{
				aRandomAccessFile354.seek(aLong353 - -1L);
				aRandomAccessFile354.write(1);
				throw new EOFException();
			} else
			{
				aRandomAccessFile354.write(arg2, arg0, arg3);
				aLong356 += arg3;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public File method162(boolean arg0)
	{
		try
		{
			if(arg0)
				method162(false);
			return aFile355;
		}
		catch(RuntimeException runtimeexception)
		{
			throw runtimeexception;
		}
	}

	public long aLong353;
	public RandomAccessFile aRandomAccessFile354;
	public File aFile355;
	public long aLong356;
}
