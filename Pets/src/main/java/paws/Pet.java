package paws;

public class Pet {
	
	private int ID;
	private String Name;
	private int Age;
	private String Breed;
	private byte Gender;
	private int Weight;
	private int Height;
	private String Additional_Info;
	private String Registration_Papers;
	private String Photos;
	
	
	public Pet(int id,String name,int age,String breed,byte gender,int weight,int height,String additional_Info,String registration_Papers,String photos)
	{
		ID=id;
		Name=name;
		Age=age;
		Breed=breed;
		Gender=gender;
		Weight=weight;
		Height=height;
		Additional_Info=additional_Info;
		Registration_Papers=registration_Papers;
		Photos=photos;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getBreed() {
		return Breed;
	}


	public void setBreed(String breed) {
		Breed = breed;
	}


	public byte getGender() {
		return Gender;
	}


	public void setGender(byte gender) {
		Gender = gender;
	}


	public int getWeight() {
		return Weight;
	}


	public void setWeight(int weight) {
		Weight = weight;
	}


	public int getHeight() {
		return Height;
	}


	public void setHeight(int height) {
		Height = height;
	}


	public String getAdditional_Info() {
		return Additional_Info;
	}


	public void setAdditional_Info(String additional_Info) {
		Additional_Info = additional_Info;
	}


	public String getRegistration_Papers() {
		return Registration_Papers;
	}


	public void setRegistration_Papers(String registration_Papers) {
		Registration_Papers = registration_Papers;
	}


	public String getPhotos() {
		return Photos;
	}


	public void setPhotos(String photos) {
		Photos = photos;
	}
	
	
	
}
