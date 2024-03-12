class ByteDataType
{
	public static void main(String [] args)
	{
		byte c = 127;
		c = c+1; // CTE possible loosy conv
		c+=1;
		System.out.println(c);
	}
}