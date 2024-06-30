package testngsessions;

import org.testng.annotations.Test;

public class CRUDTest {
	
	public int addUser()
	{
		return 123;
	}

	public String getUser(int userid)
	{
		return "user info" +userid;
	}
	
	public String updateUser(int uid)
	{
		return "update user info"+uid;
	}
	
	public String deleteUser(int uid)
	{
		return "delete user info" +uid;
	}	
	
	//AAA
	@Test
	public void addUserTest()
	{
		addUser();
	}
	
	@Test
	public void getUserTest()
	
	{
		int uid=addUser();
		
		String userInfo =getUser(uid);
		System.out.println(userInfo);

	}

	@Test
	public void updateUserTest()
	{
		int uid =addUser();
		updateUser(uid);
		System.out.println(updateUser(uid));
		getUser(uid);
		System.out.println(getUser(uid));
	
	}
	
	@Test
	 public void deletedUserTest()
	 {
		int uid =addUser();
		deleteUser(uid);
		String deleteduser=getUser(uid);
		System.out.println(deleteduser);
	 }


}
