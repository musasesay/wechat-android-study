package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ur extends com.tencent.mm.ao.a
{
  public LinkedList hQc = new LinkedList();
  public int huF;

  public static boolean a(b.a.a.a.a parama, ur paramur, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramur.huF = parama.bel();
      return true;
    case 2:
    }
    LinkedList localLinkedList = parama.rN(paramInt);
    int i = localLinkedList.size();
    for (int j = 0; j < i; j++)
    {
      byte[] arrayOfByte = (byte[])localLinkedList.get(j);
      uq localuq = new uq();
      b.a.a.a.a locala = new b.a.a.a.a(arrayOfByte, hre);
      for (boolean bool = true; bool; bool = uq.a(locala, localuq, locala.bet()));
      paramur.hQc.add(localuq);
    }
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.huF);
    parama.d(2, 8, this.hQc);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.huF) + b.a.a.a.c(2, 8, this.hQc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ur
 * JD-Core Version:    0.6.2
 */