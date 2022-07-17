package paws;

public class User {
	
	private String UserName;
	private String FullName;
	private int Age;
	private String Email;
	private int Phone;
	private String Password;
	private byte Gender;
	private boolean Pet_Owner;
	private int Pets_Owned;
	private String Photos;
	private String Follow;
	private String Followers;
	
	
	public User(String userName,String fullName,int age,String email,int phone,String password,byte gender,boolean pet_Owner,int pets_Owned,String photos,String follow,String followers)
	{
		UserName=userName;
		FullName=fullName;
		Age=age;
		Email=email;
		Phone=phone;
		Password=password;
		Gender=gender;
		Pet_Owner=pet_Owner;
		Pets_Owned=pets_Owned;
		Photos=photos;
		Follow=follow;
		Followers=followers;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getFullName() {
		return FullName;
	}


	public void setFullName(String fullName) {
		FullName = fullName;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public int getPhone() {
		return Phone;
	}


	public void setPhone(int phone) {
		Phone = phone;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public byte getGender() {
		return Gender;
	}


	public void setGender(byte gender) {
		Gender = gender;
	}


	public boolean isPet_Owner() {
		return Pet_Owner;
	}


	public void setPet_Owner(boolean pet_Owner) {
		Pet_Owner = pet_Owner;
	}


	public int getPets_Owned() {
		return Pets_Owned;
	}


	public void setPets_Owned(int pets_Owned) {
		Pets_Owned = pets_Owned;
	}


	public String getPhotos() {
		return Photos;
	}


	public void setPhotos(String photos) {
		Photos = photos;
	}


	public String getFollow() {
		return Follow;
	}


	public void setFollow(String follow) {
		Follow = follow;
	}


	public String getFollowers() {
		return Followers;
	}


	public void setFollowers(String followers) {
		Followers = followers;
	}
	
	
	
}
