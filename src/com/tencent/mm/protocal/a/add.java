package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class add extends vn
{
  public String hOJ;
  public ws hQi;
  public int hQk;
  public int hQs;
  public int hUu;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hQi == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hOJ != null)
      parama.I(2, this.hOJ);
    parama.by(3, this.hQk);
    parama.by(4, this.hUu);
    parama.by(5, this.hQs);
    if (this.hQi != null)
    {
      parama.bv(6, this.hQi.hD());
      this.hQi.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hOJ != null)
      i += b.a.a.b.b.a.J(2, this.hOJ);
    int j = i + b.a.a.a.br(3, this.hQk) + b.a.a.a.br(4, this.hUu) + b.a.a.a.br(5, this.hQs);
    if (this.hQi != null)
      j += b.a.a.a.bs(6, this.hQi.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.add
 * JD-Core Version:    0.6.2
 */