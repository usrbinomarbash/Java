/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author mourhir
 */
public class User {

    private String uname;
    private String pass;

    private String FN;
    private String LN;

    public User( String FN, String LN,String uname, String pass) {
        this.uname = uname;
        this.pass = pass;
        this.FN = FN;
        this.LN = LN;
    }

    public User(String uname) {
        this.uname = uname;
    }

    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the FN
     */
    public String getFN() {
        return FN;
    }

    /**
     * @param FN the FN to set
     */
    public void setFN(String FN) {
        this.FN = FN;
    }

    /**
     * @return the LN
     */
    public String getLN() {
        return LN;
    }

    /**
     * @param LN the LN to set
     */
    public void setLN(String LN) {
        this.LN = LN;
    }

    public boolean authenticate(String pass) {
        return this.pass.equals(pass);
    }

    @Override
    public boolean equals(Object obj) {//inherited from java.lang.Object
        return (obj != null
                && obj instanceof User
                && ((User) obj).getUname().equals(this.uname));

    }

}
