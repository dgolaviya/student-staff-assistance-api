package com.assistance.studentstaff.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "users")
@JsonInclude(value = Include.NON_NULL)
public class UserModel implements Serializable {

  private static final long serialVersionUID = 4009310373991153554L;

  @Id
  @Column(name = "USER_ID", nullable = false)
  private String userId;

	@Column(name = "MOBILE_NO")
	private @NotNull(message = "Mobile Number may not be empty.") Long mobileNo;

  @Column(name = "EMAIL_ID")
	@NotBlank(message = "Email Id may not be empty.")
  private String emailId;

  @Column(name = "PASSWORD")
	@NotBlank(message = "Password may not be empty.")
  private String password;

	@Column(name = "USERNAME")
	private String userName;

  @Column(name = "ROLE_ID")
  private String roleId;

  @Column(name = "FNAME")
  private String firstName;

  @Column(name = "DEPT_ID")
  private String deptId;

  @Column(name = "PROG_ID")
  private String progId;

  @Column(name = "LNAME")
  private String lastName;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
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

  public @NotNull(message = "Mobile Number may not be empty.") Long getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(@NotNull(message = "Mobile Number may not be empty.") Long mobileNo) {
    this.mobileNo = mobileNo;
  }

  public String getDeptId() {
    return deptId;
  }

  public void setDeptId(String deptId) {
    this.deptId = deptId;
  }

  public String getProgId() {
    return progId;
  }

  public void setProgId(String progId) {
    this.progId = progId;
  }

}
