// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Class53.java


public class Class53
{

	public static void method955(byte arg0[], int arg1, byte arg2[], int arg3, int arg4)
	{
		if(arg0 == arg2)
		{
			if(arg1 == arg3)
				return;
			if(arg3 > arg1 && arg3 < arg1 + arg4)
			{
				arg4--;
				arg1 += arg4;
				arg3 += arg4;
				arg4 = arg1 - arg4;
				for(arg4 += 7; arg1 >= arg4;)
				{
					arg2[arg3--] = arg0[arg1--];
					arg2[arg3--] = arg0[arg1--];
					arg2[arg3--] = arg0[arg1--];
					arg2[arg3--] = arg0[arg1--];
					arg2[arg3--] = arg0[arg1--];
					arg2[arg3--] = arg0[arg1--];
					arg2[arg3--] = arg0[arg1--];
					arg2[arg3--] = arg0[arg1--];
				}

				for(arg4 -= 7; arg1 >= arg4;)
					arg2[arg3--] = arg0[arg1--];

				return;
			}
		}
		arg4 += arg1;
		for(arg4 -= 7; arg1 < arg4;)
		{
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}

		for(arg4 += 7; arg1 < arg4;)
			arg2[arg3++] = arg0[arg1++];

	}

	public static void method956(int arg0[], int arg1, int arg2)
	{
		for(arg2 = (arg1 + arg2) - 7; arg1 < arg2;)
		{
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
		}

		for(arg2 += 7; arg1 < arg2;)
			arg0[arg1++] = 0;

	}
}
