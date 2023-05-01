package insat.architecture.RiskManagementService.model;

public class Application {

  String id;
  String firstName;
  String lastName;
  String address;
  String postalCode;
  String cinPath;
  String proofPath;
  String reportPath;

  public Application() {
  }

  public Application(String id, String firstName, String lastName, String address, String postalCode, String cinPath, String proofPath, String reportPath) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.postalCode = postalCode;
    this.cinPath = cinPath;
    this.proofPath = proofPath;
    this.reportPath = reportPath;
  }

  public String getId() {

    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCinPath() {
    return cinPath;
  }

  public void setCinPath(String cinPath) {
    this.cinPath = cinPath;
  }

  public String getProofPath() {
    return proofPath;
  }

  public void setProofPath(String proofPath) {
    this.proofPath = proofPath;
  }

  public String getReportPath() {
    return reportPath;
  }

  public void setReportPath(String reportPath) {
    this.reportPath = reportPath;
  }
}
