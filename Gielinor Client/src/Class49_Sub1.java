// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class49_Sub1.java

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class49_Sub1 extends Class49
	implements MouseWheelListener
{

	public synchronized void mouseWheelMoved(MouseWheelEvent arg0)
	{
		anInt2618 += arg0.getWheelRotation();
	}

	public void method935(byte arg0, Component arg1)
	{
		arg1.addMouseWheelListener(this);
		if(arg0 != -69)
			method936((Component)null, -96);
	}

	public void method936(Component arg0, int arg1)
	{
		arg0.removeMouseWheelListener(this);
		if(arg1 != 255)
			mouseWheelMoved((MouseWheelEvent)null);
	}

	public synchronized int method937(byte arg0) {
		int i;
		try {
			int i_0_ = anInt2618;
			anInt2618 = 0;
			if (arg0 != -118)
				anInt2618 = -71;
			i = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	public Class49_Sub1()
	{
		anInt2618 = 0;
	}

	public int anInt2618;
}
