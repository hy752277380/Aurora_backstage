package cn.hy.aurora.domain;

public class AurSysUser {
    private Integer userId;

    private String userNickname;

    private String userEmail;

    private String userGithub;

    private String userAuthCode;

    private String userProfilePhoto;

    private String userRegistrationTime;

    private Boolean userDeleted;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserGithub() {
        return userGithub;
    }

    public void setUserGithub(String userGithub) {
        this.userGithub = userGithub == null ? null : userGithub.trim();
    }

    public String getUserAuthCode() {
        return userAuthCode;
    }

    public void setUserAuthCode(String userAuthCode) {
        this.userAuthCode = userAuthCode == null ? null : userAuthCode.trim();
    }

    public String getUserProfilePhoto() {
        return userProfilePhoto;
    }

    public void setUserProfilePhoto(String userProfilePhoto) {
        this.userProfilePhoto = userProfilePhoto == null ? null : userProfilePhoto.trim();
    }

    public String getUserRegistrationTime() {
        return userRegistrationTime;
    }

    public void setUserRegistrationTime(String userRegistrationTime) {
        this.userRegistrationTime = userRegistrationTime == null ? null : userRegistrationTime.trim();
    }

    public Boolean getUserDeleted() {
        return userDeleted;
    }

    public void setUserDeleted(Boolean userDeleted) {
        this.userDeleted = userDeleted;
    }
}