package bean;

public class UserRegistrationBean {

    private String fname;
    private String lname;
    private String pass;
    private String email;
    private String mobile;
    private String dob;
    private String col;
    private String gen;
    private String pic;

    public UserRegistrationBean() {
    }

    public UserRegistrationBean(String fname, String lname, String pass, String email, String mobile, String dob, String col, String gen, String pic) {
        this.fname = fname;
        this.lname = lname;
        this.pass = pass;
        this.email = email;
        this.mobile = mobile;
        this.dob = dob;
        this.col = col;
        this.gen = gen;
        this.pic = pic;
    }

    public String getFname() {
        return fname.substring(0,1).toUpperCase()+fname.substring(1);
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname.substring(0,1).toUpperCase()+lname.substring(1);
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
     public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
     public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
     public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
    
    
    @Override
    public String toString() {
        return "UserRegistrationBean{" + "fname=" + fname + ", lname=" + lname + ", pass=" + pass +", email=" + email + ", mobile=" + mobile + ", dob=" + dob +", col=" + col + ", gen=" + gen + ", pic=" + pic +'}';
    }

}
