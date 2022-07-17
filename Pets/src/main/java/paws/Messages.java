package paws;

public class Messages {
	
	private int ID;
	private String Body;
	private String Sent_By;
	private String Sent_To;
	private int Report_Abuse;
	
	public Messages(int id,String body,String sent_By,String sent_To,int report_Abuse)
	{
		ID=id;
		Body=body;
		Sent_By=sent_By;
		Sent_To=sent_To;
		Report_Abuse=report_Abuse;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getBody() {
		return Body;
	}

	public void setBody(String body) {
		Body = body;
	}

	public String getSent_By() {
		return Sent_By;
	}

	public void setSent_By(String sent_By) {
		Sent_By = sent_By;
	}

	public String getSent_To() {
		return Sent_To;
	}

	public void setSent_To(String sent_To) {
		Sent_To = sent_To;
	}

	public int getReport_Abuse() {
		return Report_Abuse;
	}

	public void setReport_Abuse(int report_Abuse) {
		Report_Abuse = report_Abuse;
	}
	
	
	
}
