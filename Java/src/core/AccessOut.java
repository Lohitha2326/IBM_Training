package core;

import AccessSpecifier.AccessExample;
public class AccessOut extends AccessExample { 
	public static void main(String[] args)
	{
	AccessOut obj1=new AccessOut();//outside the package 
	//System.out.println(obj1.vPrivate);
	//System.out.println(obj1.vDefault);
	System.out.println(obj1.vProtected);
	System.out.println(obj1.vPublic);
	}
}
