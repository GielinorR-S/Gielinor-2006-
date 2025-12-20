// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class70.java


public class Class70
{

	public void method1117(int arg0, int arg1, int arg2)
	{
		try
		{
			arg2 -= anInt1483;
			arg1 -= anInt1503;
			anInt1504++;
			anIntArrayArray1499[arg1][arg2] = Class33_Sub6_Sub14.method576(anIntArrayArray1499[arg1][arg2], arg0);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.H(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public static Class33_Sub15 method1118(int arg0, Class33_Sub15 arg1, int arg2, byte arg3, Class33_Sub15 arg4)
	{
		try
		{
			Class33_Sub15 class33_sub15 = Class33_Sub6_Sub13.method558(arg4.anInt2405, arg4.anInt2462, arg1, arg2, 0, arg0, arg4.anInt2353, 122, arg4.anInt2435, arg4.anInt2413, Class33_Sub13_Sub4.aClass33_Sub15ArrayArray3336[arg4.anInt2435 >> 0xd2ae8070], 0);
			anInt1489++;
			if(arg3 != -2)
				method1132((byte)80);
			if(class33_sub15 != null)
				return class33_sub15;
			if(arg4.aClass33_Sub15Array2394 != null)
				class33_sub15 = Class33_Sub6_Sub13.method558(arg4.anInt2405, arg4.anInt2462, arg1, arg2, 0, arg0, arg4.anInt2353, 112, arg4.anInt2435, arg4.anInt2413, arg4.aClass33_Sub15Array2394, 0);
			return class33_sub15;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.D(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? "null" : "{...}") + ')');
		}
	}

	public void method1119(int arg0, int arg1, int arg2, int arg3)
	{
		try
		{
			if(arg0 != -20099)
			{
				return;
			} else
			{
				anIntArrayArray1499[arg3][arg1] = Class12.method110(anIntArrayArray1499[arg3][arg1], ~arg2);
				anInt1494++;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.L(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public void method1120(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6)
	{
		try
		{
			arg4 -= anInt1503;
			anInt1482++;
			arg3 -= anInt1483;
			int i = 256;
			if(~arg6 == -2 || ~arg6 == -4)
			{
				int j = arg0;
				arg0 = arg5;
				arg5 = j;
			}
			if(arg2)
				i += 0x20000;
			int k = 34 % ((arg1 - 56) / 42);
			for(int l = arg4; ~l > ~(arg0 + arg4); l++)
				if(~l <= -1 && ~anInt1481 < ~l)
				{
					for(int i1 = arg3; arg5 + arg3 > i1; i1++)
						if(i1 >= 0 && ~anInt1508 < ~i1)
							method1126(i, 1, i1, l);

				}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.A(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public void method1121(int arg0, int arg1, int arg2)
	{
		try
		{
			arg2 -= anInt1483;
			arg0 -= anInt1503;
			anIntArrayArray1499[arg0][arg2] = Class33_Sub6_Sub14.method576(anIntArrayArray1499[arg0][arg2], arg1);
			anInt1505++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.G(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public void method1122(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		arg2 -= anInt1483;
		anInt1487++;
		arg3 -= anInt1503;
		if(arg4 == 0)
		{
			if(arg5 == 0)
			{
				method1119(arg1 ^ 0x59a9, arg2, 128, arg3);
				method1119(arg1 ^ 0x59a9, arg2, 8, -1 + arg3);
			}
			if(arg5 == 1)
			{
				method1119(-20099, arg2, 2, arg3);
				method1119(-20099, arg2 + 1, 32, arg3);
			}
			if(arg5 == 2)
			{
				method1119(-20099, arg2, 8, arg3);
				method1119(-20099, arg2, 128, arg3 + 1);
			}
			if(~arg5 == -4)
			{
				method1119(arg1 ^ 0x59a9, arg2, 32, arg3);
				method1119(-20099, arg2 - 1, 2, arg3);
			}
		}
		if(arg4 == 1 || ~arg4 == -4)
		{
			if(arg5 == 0)
			{
				method1119(-20099, arg2, 1, arg3);
				method1119(-20099, 1 + arg2, 16, -1 + arg3);
			}
			if(arg5 == 1)
			{
				method1119(arg1 + -14167, arg2, 4, arg3);
				method1119(arg1 + -14167, 1 + arg2, 64, 1 + arg3);
			}
			if(~arg5 == -3)
			{
				method1119(-20099, arg2, 16, arg3);
				method1119(-20099, -1 + arg2, 1, 1 + arg3);
			}
			if(~arg5 == -4)
			{
				method1119(arg1 + -14167, arg2, 64, arg3);
				method1119(-20099, arg2 - 1, 4, arg3 - 1);
			}
		}
		if(arg1 != -5932)
			method1131(null, -13, 108);
		if(arg4 == 2)
		{
			if(arg5 == 0)
			{
				method1119(-20099, arg2, 130, arg3);
				method1119(-20099, arg2, 8, arg3 + -1);
				method1119(-20099, arg2 + 1, 32, arg3);
			}
			if(~arg5 == -2)
			{
				method1119(-20099, arg2, 10, arg3);
				method1119(-20099, 1 + arg2, 32, arg3);
				method1119(arg1 + -14167, arg2, 128, arg3 + 1);
			}
			if(~arg5 == -3)
			{
				method1119(-20099, arg2, 40, arg3);
				method1119(-20099, arg2, 128, 1 + arg3);
				method1119(arg1 + -14167, arg2 + -1, 2, arg3);
			}
			if(arg5 == 3)
			{
				method1119(arg1 ^ 0x59a9, arg2, 160, arg3);
				method1119(arg1 ^ 0x59a9, -1 + arg2, 2, arg3);
				method1119(-20099, arg2, 8, arg3 - 1);
			}
		}
		if(arg0)
		{
			if(arg4 == 0)
			{
				if(~arg5 == -1)
				{
					method1119(arg1 ^ 0x59a9, arg2, 0x10000, arg3);
					method1119(-20099, arg2, 4096, arg3 + -1);
				}
				if(arg5 == 1)
				{
					method1119(-20099, arg2, 1024, arg3);
					method1119(-20099, arg2 + 1, 16384, arg3);
				}
				if(~arg5 == -3)
				{
					method1119(arg1 + -14167, arg2, 4096, arg3);
					method1119(-20099, arg2, 0x10000, 1 + arg3);
				}
				if(~arg5 == -4)
				{
					method1119(-20099, arg2, 16384, arg3);
					method1119(arg1 ^ 0x59a9, -1 + arg2, 1024, arg3);
				}
			}
			if(~arg4 == -2 || arg4 == 3)
			{
				if(~arg5 == -1)
				{
					method1119(-20099, arg2, 512, arg3);
					method1119(-20099, arg2 + 1, 8192, -1 + arg3);
				}
				if(~arg5 == -2)
				{
					method1119(-20099, arg2, 2048, arg3);
					method1119(-20099, arg2 + 1, 32768, arg3 + 1);
				}
				if(arg5 == 2)
				{
					method1119(arg1 ^ 0x59a9, arg2, 8192, arg3);
					method1119(arg1 ^ 0x59a9, arg2 + -1, 512, arg3 - -1);
				}
				if(arg5 == 3)
				{
					method1119(arg1 ^ 0x59a9, arg2, 32768, arg3);
					method1119(-20099, arg2 + -1, 2048, -1 + arg3);
				}
			}
			if(arg4 == 2)
			{
				if(~arg5 == -1)
				{
					method1119(-20099, arg2, 0x10400, arg3);
					method1119(-20099, arg2, 4096, arg3 + -1);
					method1119(-20099, arg2 + 1, 16384, arg3);
				}
				if(arg5 == 1)
				{
					method1119(-20099, arg2, 5120, arg3);
					method1119(-20099, arg2 + 1, 16384, arg3);
					method1119(-20099, arg2, 0x10000, arg3 - -1);
				}
				if(~arg5 == -3)
				{
					method1119(arg1 + -14167, arg2, 20480, arg3);
					method1119(-20099, arg2, 0x10000, 1 + arg3);
					method1119(arg1 ^ 0x59a9, -1 + arg2, 1024, arg3);
				}
				if(~arg5 == -4)
				{
					method1119(arg1 + -14167, arg2, 0x14000, arg3);
					method1119(-20099, -1 + arg2, 1024, arg3);
					method1119(-20099, arg2, 4096, arg3 - 1);
				}
			}
		}
	}

	public boolean method1123(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6)
	{
		try
		{
			anInt1497++;
			if(~arg4 == ~arg5 && arg0 == arg3)
				return true;
			int i = -1 / ((74 - arg2) / 32);
			arg4 -= anInt1503;
			arg5 -= anInt1503;
			arg0 -= anInt1483;
			arg3 -= anInt1483;
			if(~arg6 == -7 || ~arg6 == -8)
			{
				if(arg6 == 7)
					arg1 = 3 & 2 + arg1;
				if(~arg1 == -1)
				{
					if(arg4 == 1 + arg5 && ~arg3 == ~arg0 && (0x80 & anIntArrayArray1499[arg4][arg3]) == 0)
						return true;
					if(~arg5 == ~arg4 && ~(arg0 - 1) == ~arg3 && (2 & anIntArrayArray1499[arg4][arg3]) == 0)
						return true;
				} else
				if(~arg1 == -2)
				{
					if(arg5 + -1 == arg4 && ~arg0 == ~arg3 && ~(8 & anIntArrayArray1499[arg4][arg3]) == -1)
						return true;
					if(~arg4 == ~arg5 && arg3 == -1 + arg0 && (anIntArrayArray1499[arg4][arg3] & 2) == 0)
						return true;
				} else
				if(~arg1 != -3)
				{
					if(~arg1 == -4)
					{
						if(arg4 == arg5 + 1 && arg3 == arg0 && (0x80 & anIntArrayArray1499[arg4][arg3]) == 0)
							return true;
						if(~arg5 == ~arg4 && ~(arg0 - -1) == ~arg3 && (anIntArrayArray1499[arg4][arg3] & 0x20) == 0)
							return true;
					}
				} else
				{
					if(~arg4 == ~(-1 + arg5) && arg3 == arg0 && ~(anIntArrayArray1499[arg4][arg3] & 8) == -1)
						return true;
					if(~arg4 == ~arg5 && arg3 == arg0 - -1 && ~(0x20 & anIntArrayArray1499[arg4][arg3]) == -1)
						return true;
				}
			}
			if(arg6 == 8)
			{
				if(~arg5 == ~arg4 && arg3 == arg0 - -1 && ~(0x20 & anIntArrayArray1499[arg4][arg3]) == -1)
					return true;
				if(~arg4 == ~arg5 && arg0 - 1 == arg3 && (anIntArrayArray1499[arg4][arg3] & 2) == 0)
					return true;
				if(arg4 == -1 + arg5 && arg3 == arg0 && ~(8 & anIntArrayArray1499[arg4][arg3]) == -1)
					return true;
				if(~arg4 == ~(1 + arg5) && arg0 == arg3 && ~(0x80 & anIntArrayArray1499[arg4][arg3]) == -1)
					return true;
			}
			return false;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.N(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public void method1124(int arg0, int arg1, int arg2)
	{
		try
		{
			arg2 -= anInt1503;
			anInt1485++;
			if(arg0 >= -12)
				anInt1483 = 94;
			arg1 -= anInt1483;
			anIntArrayArray1499[arg2][arg1] = Class12.method110(anIntArrayArray1499[arg2][arg1], 0xfffbffff);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.C(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
		}
	}

	public boolean method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, 
			int arg7)
	{
		try
		{
			anInt1493++;
			int j = arg7 + arg4 + -1;
			int i = -1 + (arg6 + arg1);
			if(arg6 <= arg2 && arg2 <= i && arg5 >= arg7 && ~arg5 >= ~j)
				return true;
			if(~(-1 + arg6) == ~arg2 && ~arg5 <= ~arg7 && ~arg5 >= ~j && ~(8 & anIntArrayArray1499[-anInt1503 + arg2][arg5 - anInt1483]) == -1 && (8 & arg0) == 0)
				return true;
			if(arg2 == 1 + i && ~arg5 <= ~arg7 && j >= arg5 && ~(anIntArrayArray1499[-anInt1503 + arg2][arg5 + -anInt1483] & 0x80) == -1 && ~(2 & arg0) == -1)
				return true;
			if(arg5 == arg3 + arg7 && ~arg2 <= ~arg6 && ~i <= ~arg2 && ~(2 & anIntArrayArray1499[arg2 + -anInt1503][arg5 - anInt1483]) == -1 && (4 & arg0) == 0)
				return true;
			return ~(j + 1) == ~arg5 && arg2 >= arg6 && ~arg2 >= ~i && ~(0x20 & anIntArrayArray1499[arg2 - anInt1503][arg5 + -anInt1483]) == -1 && (1 & arg0) == 0;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.P(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
		}
	}

	public void method1126(int arg0, int arg1, int arg2, int arg3)
	{
		try
		{
			if(arg1 != 1)
				aClass37Array1502 = null;
			anIntArrayArray1499[arg3][arg2] = Class33_Sub6_Sub14.method576(anIntArrayArray1499[arg3][arg2], arg0);
			anInt1490++;
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.I(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
		}
	}

	public void method1127(int arg0)
	{
		try
		{
			anInt1484++;
			if(arg0 != 18580)
				anInt1513 = 40;
			for(int i = 0; ~i > ~anInt1481; i++)
			{
				for(int j = 0; ~anInt1508 < ~j; j++)
					if(i == 0 || j == 0 || ~(-1 + anInt1481) == ~i || ~j == ~(-1 + anInt1508))
						anIntArrayArray1499[i][j] = 0xffffff;
					else
						anIntArrayArray1499[i][j] = 0x1000000;

			}

			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.K(" + arg0 + ')');
		}
	}

	public boolean method1128(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		try
		{
			if(!arg1)
				method1133(false, 76, 39, 110, 9, 78, 30);
			anInt1501++;
			if(arg2 == arg0 && arg3 == arg4)
				return true;
			arg2 -= anInt1503;
			arg0 -= anInt1503;
			arg4 -= anInt1483;
			arg3 -= anInt1483;
			if(arg5 == 0)
				if(~arg6 == -1)
				{
					if(~arg2 == ~(arg0 + -1) && arg4 == arg3)
						return true;
					if(~arg0 == ~arg2 && 1 + arg3 == arg4 && (anIntArrayArray1499[arg2][arg4] & 0x12c0120) == 0)
						return true;
					if(~arg2 == ~arg0 && arg4 == arg3 - 1 && ~(anIntArrayArray1499[arg2][arg4] & 0x12c0102) == -1)
						return true;
				} else
				if(arg6 != 1)
				{
					if(~arg6 == -3)
					{
						if(arg0 - -1 == arg2 && arg3 == arg4)
							return true;
						if(~arg0 == ~arg2 && ~(1 + arg3) == ~arg4 && (anIntArrayArray1499[arg2][arg4] & 0x12c0120) == 0)
							return true;
						if(arg2 == arg0 && ~(-1 + arg3) == ~arg4 && (0x12c0102 & anIntArrayArray1499[arg2][arg4]) == 0)
							return true;
					} else
					if(arg6 == 3)
					{
						if(arg2 == arg0 && ~(-1 + arg3) == ~arg4)
							return true;
						if(arg2 == arg0 - 1 && ~arg4 == ~arg3 && ~(anIntArrayArray1499[arg2][arg4] & 0x12c0108) == -1)
							return true;
						if(arg2 == 1 + arg0 && arg4 == arg3 && ~(0x12c0180 & anIntArrayArray1499[arg2][arg4]) == -1)
							return true;
					}
				} else
				{
					if(~arg0 == ~arg2 && 1 + arg3 == arg4)
						return true;
					if(~arg2 == ~(arg0 + -1) && arg4 == arg3 && ~(anIntArrayArray1499[arg2][arg4] & 0x12c0108) == -1)
						return true;
					if(arg2 == 1 + arg0 && ~arg4 == ~arg3 && ~(0x12c0180 & anIntArrayArray1499[arg2][arg4]) == -1)
						return true;
				}
			if(arg5 == 2)
				if(~arg6 == -1)
				{
					if(-1 + arg0 == arg2 && ~arg4 == ~arg3)
						return true;
					if(~arg0 == ~arg2 && arg4 == 1 + arg3)
						return true;
					if(~arg2 == ~(arg0 + 1) && ~arg4 == ~arg3 && ~(anIntArrayArray1499[arg2][arg4] & 0x12c0180) == -1)
						return true;
					if(arg0 == arg2 && arg4 == -1 + arg3 && (anIntArrayArray1499[arg2][arg4] & 0x12c0102) == 0)
						return true;
				} else
				if(arg6 != 1)
				{
					if(~arg6 != -3)
					{
						if(arg6 == 3)
						{
							if(arg0 - 1 == arg2 && ~arg4 == ~arg3)
								return true;
							if(arg2 == arg0 && 1 + arg3 == arg4 && (anIntArrayArray1499[arg2][arg4] & 0x12c0120) == 0)
								return true;
							if(~arg2 == ~(1 + arg0) && arg4 == arg3 && ~(anIntArrayArray1499[arg2][arg4] & 0x12c0180) == -1)
								return true;
							if(arg2 == arg0 && ~(arg3 - 1) == ~arg4)
								return true;
						}
					} else
					{
						if(-1 + arg0 == arg2 && arg4 == arg3 && (anIntArrayArray1499[arg2][arg4] & 0x12c0108) == 0)
							return true;
						if(~arg2 == ~arg0 && 1 + arg3 == arg4 && (anIntArrayArray1499[arg2][arg4] & 0x12c0120) == 0)
							return true;
						if(arg0 - -1 == arg2 && arg3 == arg4)
							return true;
						if(~arg0 == ~arg2 && arg3 - 1 == arg4)
							return true;
					}
				} else
				{
					if(~arg2 == ~(arg0 + -1) && ~arg4 == ~arg3 && ~(0x12c0108 & anIntArrayArray1499[arg2][arg4]) == -1)
						return true;
					if(~arg2 == ~arg0 && arg4 == arg3 - -1)
						return true;
					if(arg0 - -1 == arg2 && ~arg4 == ~arg3)
						return true;
					if(arg0 == arg2 && arg4 == -1 + arg3 && (anIntArrayArray1499[arg2][arg4] & 0x12c0102) == 0)
						return true;
				}
			if(~arg5 == -10)
			{
				if(arg2 == arg0 && ~(arg3 + 1) == ~arg4 && (0x20 & anIntArrayArray1499[arg2][arg4]) == 0)
					return true;
				if(~arg0 == ~arg2 && ~(arg3 - 1) == ~arg4 && ~(2 & anIntArrayArray1499[arg2][arg4]) == -1)
					return true;
				if(~(-1 + arg0) == ~arg2 && arg4 == arg3 && ~(anIntArrayArray1499[arg2][arg4] & 8) == -1)
					return true;
				if(1 + arg0 == arg2 && ~arg4 == ~arg3 && (0x80 & anIntArrayArray1499[arg2][arg4]) == 0)
					return true;
			}
			return false;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.M(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
		}
	}

	public void method1129(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
	{
		arg2 -= anInt1503;
		arg4 -= anInt1483;
		if(~arg5 == -1)
		{
			if(arg3 == 0)
			{
				method1126(128, arg1 ^ 3, arg4, arg2);
				method1126(8, 1, arg4, arg2 - 1);
			}
			if(~arg3 == -2)
			{
				method1126(2, arg1 + -1, arg4, arg2);
				method1126(32, 1, 1 + arg4, arg2);
			}
			if(~arg3 == -3)
			{
				method1126(8, 1, arg4, arg2);
				method1126(128, 1, arg4, arg2 - -1);
			}
			if(arg3 == 3)
			{
				method1126(32, 1, arg4, arg2);
				method1126(2, arg1 + -1, arg4 + -1, arg2);
			}
		}
		if(~arg5 == -2 || arg5 == 3)
		{
			if(~arg3 == -1)
			{
				method1126(1, 1, arg4, arg2);
				method1126(16, arg1 ^ 3, arg4 - -1, arg2 - 1);
			}
			if(~arg3 == -2)
			{
				method1126(4, 1, arg4, arg2);
				method1126(64, 1, arg4 + 1, arg2 - -1);
			}
			if(arg3 == 2)
			{
				method1126(16, 1, arg4, arg2);
				method1126(1, 1, arg4 + -1, arg2 + 1);
			}
			if(~arg3 == -4)
			{
				method1126(64, arg1 + -1, arg4, arg2);
				method1126(4, 1, arg4 + -1, -1 + arg2);
			}
		}
		if(~arg5 == -3)
		{
			if(arg3 == 0)
			{
				method1126(130, 1, arg4, arg2);
				method1126(8, 1, arg4, arg2 + -1);
				method1126(32, 1, arg4 - -1, arg2);
			}
			if(~arg3 == -2)
			{
				method1126(10, arg1 ^ 3, arg4, arg2);
				method1126(32, 1, 1 + arg4, arg2);
				method1126(128, 1, arg4, 1 + arg2);
			}
			if(arg3 == 2)
			{
				method1126(40, 1, arg4, arg2);
				method1126(128, 1, arg4, 1 + arg2);
				method1126(2, 1, arg4 + -1, arg2);
			}
			if(~arg3 == -4)
			{
				method1126(160, 1, arg4, arg2);
				method1126(2, 1, arg4 - 1, arg2);
				method1126(8, 1, arg4, arg2 + -1);
			}
		}
		if(arg0)
		{
			if(~arg5 == -1)
			{
				if(~arg3 == -1)
				{
					method1126(0x10000, 1, arg4, arg2);
					method1126(4096, 1, arg4, arg2 - 1);
				}
				if(~arg3 == -2)
				{
					method1126(1024, 1, arg4, arg2);
					method1126(16384, 1, arg4 - -1, arg2);
				}
				if(arg3 == 2)
				{
					method1126(4096, arg1 + -1, arg4, arg2);
					method1126(0x10000, 1, arg4, arg2 + 1);
				}
				if(arg3 == 3)
				{
					method1126(16384, arg1 + -1, arg4, arg2);
					method1126(1024, arg1 + -1, arg4 - 1, arg2);
				}
			}
			if(arg5 == 1 || ~arg5 == -4)
			{
				if(arg3 == 0)
				{
					method1126(512, arg1 ^ 3, arg4, arg2);
					method1126(8192, 1, 1 + arg4, arg2 - 1);
				}
				if(~arg3 == -2)
				{
					method1126(2048, 1, arg4, arg2);
					method1126(32768, arg1 + -1, 1 + arg4, 1 + arg2);
				}
				if(~arg3 == -3)
				{
					method1126(8192, arg1 + -1, arg4, arg2);
					method1126(512, 1, -1 + arg4, arg2 - -1);
				}
				if(~arg3 == -4)
				{
					method1126(32768, arg1 ^ 3, arg4, arg2);
					method1126(2048, arg1 + -1, -1 + arg4, arg2 - 1);
				}
			}
			if(~arg5 == -3)
			{
				if(arg3 == 0)
				{
					method1126(0x10400, 1, arg4, arg2);
					method1126(4096, 1, arg4, -1 + arg2);
					method1126(16384, 1, 1 + arg4, arg2);
				}
				if(arg3 == 1)
				{
					method1126(5120, arg1 ^ 3, arg4, arg2);
					method1126(16384, 1, 1 + arg4, arg2);
					method1126(0x10000, 1, arg4, 1 + arg2);
				}
				if(~arg3 == -3)
				{
					method1126(20480, arg1 + -1, arg4, arg2);
					method1126(0x10000, 1, arg4, 1 + arg2);
					method1126(1024, 1, arg4 - 1, arg2);
				}
				if(arg3 == 3)
				{
					method1126(0x14000, arg1 + -1, arg4, arg2);
					method1126(1024, 1, arg4 - 1, arg2);
					method1126(4096, 1, arg4, -1 + arg2);
				}
			}
		}
		anInt1486++;
		if(arg1 != 2)
			method1129(true, 27, -22, 85, 72, -30);
	}

	public static void method1130(byte arg0)
	{
		try
		{
			aClass33_Sub6_Sub7_Sub3Array1495 = null;
			aClass37Array1502 = null;
			aClass58_1514 = null;
			aClass58_1511 = null;
			aClass16_1491 = null;
			anIntArray1488 = null;
			if(arg0 <= 58)
			{
				return;
			} else
			{
				aClass58_1509 = null;
				aClass58_1512 = null;
				return;
			}
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.Q(" + arg0 + ')');
		}
	}

	public static void method1131(Class33_Sub6_Sub4_Sub5 arg0, int arg1, int arg2)
	{
		anInt1500++;
		Class33_Sub6_Sub4_Sub5.method360(arg0.anInt3548, arg1, arg0.anInt3510, (byte)-79);
		if(arg2 != 21395)
			anInt1510 = -53;
	}

	public static void method1132(byte arg0)
	{
		try
		{
			anInt1507++;
			if(~RuntimeException_Sub1.anInt1819 != -1)
				return;
			Class14.anInt276 = 1;
			Class39.aClass58Array868[0] = Class82.aClass58_1787;
			Class33_Sub6_Sub4_Sub1.anIntArray3357[0] = 1001;
			if(anInt1496 != -1)
			{
				Class41.anInt901 = -1;
				Class33_Sub6_Sub16.anInt3077 = -1;
				Class16.method152(0, anInt1496, 0, 0, Class13.anInt254, 765, Applet_Sub1.anInt41, -29013, 503);
				Class33_Sub6_Sub4_Sub6.anInt3620 = Class41.anInt901;
				Class33_Sub19.anInt2552 = Class33_Sub6_Sub16.anInt3077;
				return;
			}
			boolean flag = false;
			if(arg0 != 18)
				aClass58_1514 = null;
			Class33_Sub6_Sub13.method556(arg0 + -50);
			Class41.anInt901 = -1;
			Class33_Sub6_Sub16.anInt3077 = -1;
			if(Applet_Sub1.anInt41 > 4 && Class13.anInt254 > 4 && ~Applet_Sub1.anInt41 > -517 && ~Class13.anInt254 > -339)
				if(~Class33_Sub6_Sub14.anInt3013 == 0)
					Class33_Sub6_Sub12.method545((byte)-126);
				else
					Class16.method152(4, Class33_Sub6_Sub14.anInt3013, 0, 4, Class13.anInt254, 516, Applet_Sub1.anInt41, -29013, 338);
			Class33_Sub19.anInt2552 = Class33_Sub6_Sub16.anInt3077;
			Class33_Sub6_Sub4_Sub6.anInt3620 = Class41.anInt901;
			Class41.anInt901 = -1;
			Class33_Sub6_Sub16.anInt3077 = -1;
			if(~Applet_Sub1.anInt41 < -554 && Class13.anInt254 > 205 && Applet_Sub1.anInt41 < 743 && Class13.anInt254 < 466)
				if(Class77_Sub2.anInt2644 != -1)
					Class16.method152(553, Class77_Sub2.anInt2644, 1, 205, Class13.anInt254, 743, Applet_Sub1.anInt41, -29013, 466);
				else
				if(Class14.anIntArray274[Class30.anInt620] != -1)
					Class16.method152(553, Class14.anIntArray274[Class30.anInt620], 1, 205, Class13.anInt254, 743, Applet_Sub1.anInt41, arg0 ^ 0xffff8eb9, 466);
			if(~Class33_Sub13_Sub3.anInt3244 != ~Class41.anInt901)
			{
				Class74.aBoolean1579 = true;
				Class33_Sub13_Sub3.anInt3244 = Class41.anInt901;
			}
			if(Class33_Sub6_Sub16.anInt3077 != Class33_Sub6_Sub4_Sub6.anInt3626)
			{
				Class33_Sub6_Sub4_Sub6.anInt3626 = Class33_Sub6_Sub16.anInt3077;
				Class74.aBoolean1579 = true;
			}
			Class33_Sub6_Sub16.anInt3077 = -1;
			Class41.anInt901 = -1;
			if(~Applet_Sub1.anInt41 < -18 && Class13.anInt254 > 357 && Applet_Sub1.anInt41 < 496 && Class13.anInt254 < 453)
				if(~Class45.anInt965 == 0)
				{
					if(~Class81.anInt1744 != 0)
						Class16.method152(17, Class81.anInt1744, 3, 357, Class13.anInt254, 496, Applet_Sub1.anInt41, -29013, 453);
					else
					if(~Class13.anInt254 > -435 && Applet_Sub1.anInt41 < 426)
						Class45.method914(-357 + Class13.anInt254, (byte)75, Applet_Sub1.anInt41 + -17);
				} else
				{
					Class16.method152(17, Class45.anInt965, 2, 357, Class13.anInt254, 496, Applet_Sub1.anInt41, -29013, 453);
				}
			if((Class45.anInt965 != -1 || Class81.anInt1744 != -1) && Class33_Sub6_Sub11.anInt2939 != Class41.anInt901)
			{
				Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
				Class33_Sub6_Sub11.anInt2939 = Class41.anInt901;
			}
			if((Class45.anInt965 != -1 || Class81.anInt1744 != -1) && Class33_Sub6_Sub16.anInt3077 != Class51.anInt1092)
			{
				Class33_Sub6_Sub4_Sub5.aBoolean3543 = true;
				Class51.anInt1092 = Class33_Sub6_Sub16.anInt3077;
			}
			while(!flag) 
			{
				flag = true;
				for(int i = 0; ~i > ~(Class14.anInt276 + -1); i++)
					if(~Class33_Sub6_Sub4_Sub1.anIntArray3357[i] > -1001 && ~Class33_Sub6_Sub4_Sub1.anIntArray3357[i - -1] < -1001)
					{
						flag = false;
						Class58 class58 = Class39.aClass58Array868[i];
						Class39.aClass58Array868[i] = Class39.aClass58Array868[i - -1];
						Class39.aClass58Array868[i - -1] = class58;
						int j = Class33_Sub6_Sub4_Sub1.anIntArray3357[i];
						Class33_Sub6_Sub4_Sub1.anIntArray3357[i] = Class33_Sub6_Sub4_Sub1.anIntArray3357[i - -1];
						Class33_Sub6_Sub4_Sub1.anIntArray3357[i - -1] = j;
						j = Class51.anIntArray1100[i];
						Class51.anIntArray1100[i] = Class51.anIntArray1100[i - -1];
						Class51.anIntArray1100[1 + i] = j;
						j = Class71.anIntArray1524[i];
						Class71.anIntArray1524[i] = Class71.anIntArray1524[1 + i];
						Class71.anIntArray1524[1 + i] = j;
						j = Class33_Sub6_Sub9.anIntArray2820[i];
						Class33_Sub6_Sub9.anIntArray2820[i] = Class33_Sub6_Sub9.anIntArray2820[i + 1];
						Class33_Sub6_Sub9.anIntArray2820[i + 1] = j;
					}

			}
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.F(" + arg0 + ')');
		}
	}

	public void method1133(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6)
	{
		arg5 -= anInt1483;
		anInt1506++;
		if(~arg4 == -2 || ~arg4 == -4)
		{
			int j = arg3;
			arg3 = arg1;
			arg1 = j;
		}
		arg6 -= anInt1503;
		int i = 256;
		if(arg0)
			i += 0x20000;
		for(int k = arg6; ~(arg6 + arg3) < ~k; k++)
			if(~k <= -1 && anInt1481 > k)
			{
				for(int l = arg5; ~l > ~(arg5 - -arg1); l++)
					if(~l <= -1 && l < anInt1508)
						method1119(-20099, l, i, k);

			}

		if(arg2 != 25027)
			method1131(null, 33, 30);
	}

	public Class70(int arg0, int arg1)
	{
		try
		{
			anInt1503 = 0;
			anInt1483 = 0;
			anInt1508 = arg1;
			anInt1481 = arg0;
			anIntArrayArray1499 = new int[anInt1481][anInt1508];
			method1127(18580);
			return;
		}
		catch(RuntimeException runtimeexception)
		{
			throw Class33.method263(runtimeexception, "td.<init>(" + arg0 + ',' + arg1 + ')');
		}
	}

	public int anInt1481;
	public static int anInt1482;
	public int anInt1483;
	public static int anInt1484;
	public static int anInt1485;
	public static int anInt1486;
	public static int anInt1487;
	public static int anIntArray1488[];
	public static int anInt1489;
	public static int anInt1490;
	public static Class16 aClass16_1491 = new Class16(64);
	public static int anInt1492;
	public static int anInt1493;
	public static int anInt1494;
	public static Class33_Sub6_Sub7_Sub3 aClass33_Sub6_Sub7_Sub3Array1495[];
	public static int anInt1496 = -1;
	public static int anInt1497;
	public static int anInt1498;
	public int anIntArrayArray1499[][];
	public static int anInt1500;
	public static int anInt1501;
	public static Class37 aClass37Array1502[] = new Class37[16];
	public int anInt1503;
	public static int anInt1504;
	public static int anInt1505;
	public static int anInt1506;
	public static int anInt1507;
	public int anInt1508;
	public static Class58 aClass58_1509;
	public static int anInt1510;
	public static Class58 aClass58_1511;
	public static Class58 aClass58_1512;
	public static int anInt1513 = 0;
	public static Class58 aClass58_1514;

	static 
	{
		aClass58_1509 = Class33_Sub6_Sub11.method535(121, "Accept trade");
		aClass58_1512 = Class33_Sub6_Sub11.method535(116, "Hide");
		aClass58_1511 = aClass58_1512;
		aClass58_1514 = aClass58_1509;
	}
}
