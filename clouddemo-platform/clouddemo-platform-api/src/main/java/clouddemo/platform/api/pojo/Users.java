package clouddemo.platform.api.pojo;

import java.util.Date;

public class Users {
    private Integer id;

    private String uid;

    private String password;

    private String name;

    private String telephone;

    private String email;

    private String lockflag;

    private Integer creatuserid;

    private Date createtime;

    private Integer modifyuserid;

    private Date modifytime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLockflag() {
        return lockflag;
    }

    public void setLockflag(String lockflag) {
        this.lockflag = lockflag == null ? null : lockflag.trim();
    }

    public Integer getCreatuserid() {
        return creatuserid;
    }

    public void setCreatuserid(Integer creatuserid) {
        this.creatuserid = creatuserid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getModifyuserid() {
        return modifyuserid;
    }

    public void setModifyuserid(Integer modifyuserid) {
        this.modifyuserid = modifyuserid;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}