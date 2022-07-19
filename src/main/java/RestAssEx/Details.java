package RestAssEx;

public class Details {

   private String companyName;
   private String emailId;

   Details(String companyName, String emailId){
      this.companyName=companyName;
      this.emailId=emailId;
   }

   public String getCompanyName() {
      return companyName;
   }

   public String getEmailId() {
      return emailId;
   }

   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   public void setEmailId(String emailId) {
      this.emailId = emailId;
   }
}
