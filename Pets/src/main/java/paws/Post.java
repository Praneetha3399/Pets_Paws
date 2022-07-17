package paws;

public class Post {
	
	private int ID;
	private String Type;
	private String Likes;
	private String Comments;
	private String Share;
	private String Posted_User;
	private int Report_Abuse;
	
	
	public Post(int id,String type,String likes,String comments,String share,String posted_User,int report_Abuse)
	{
		ID=id;
		Type=type;
		Likes=likes;
		Comments=comments;
		Share=share;
		Posted_User=posted_User;
		Report_Abuse=report_Abuse;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public String getLikes() {
		return Likes;
	}


	public void setLikes(String likes) {
		Likes = likes;
	}


	public String getComments() {
		return Comments;
	}


	public void setComments(String comments) {
		Comments = comments;
	}


	public String getShare() {
		return Share;
	}


	public void setShare(String share) {
		Share = share;
	}


	public String getPosted_User() {
		return Posted_User;
	}


	public void setPosted_User(String posted_User) {
		Posted_User = posted_User;
	}


	public int getReport_Abuse() {
		return Report_Abuse;
	}


	public void setReport_Abuse(int report_Abuse) {
		Report_Abuse = report_Abuse;
	}
	
	
	
}

