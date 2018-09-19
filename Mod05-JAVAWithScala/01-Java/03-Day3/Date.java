class Date
{
	private int dd,mm,yy;
	public Date()
	{
	}
	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public Date(Date d)
	{
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;
	}
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	public void showDate(char ch)
	{
		System.out.println(dd+""+ch+mm+""+ch+yy);
	}
	public boolean equals(Date d)
	{
		if(this.dd==d.dd && this.mm==d.mm && this.yy==d.yy)
			return true;
		else
			return false;
	}
}
