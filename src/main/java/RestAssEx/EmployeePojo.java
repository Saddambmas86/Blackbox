package RestAssEx;

public class EmployeePojo {

  private String name;
  private String job;
  private String skills[];
  private Details details;

  EmployeePojo(String name, String job, String[] skills,String companyName, String emailId){
    this.name=name;
    this.job=job;
    this.skills=skills;
    this.details=new Details(companyName,emailId);
  }

  public String getName() {
    return name;
  }

  public String getJob() {
    return job;
  }

  public String[] getSkills() {
    return skills;
  }

  public Details getDetails() {
    return details;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public void setSkills(String[] skills) {
    this.skills = skills;
  }

  public void setDetails(Details details) {
    this.details = details;
  }
}
