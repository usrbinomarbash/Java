package com.glovo.model;
import com.glovo.model.Permissions;
import com.glovo.manageable.Manageable;
import java.util.List;


public class Admin extends User implements Manageable{
    private List<Permissions> permissionsList;
    private int adminId;
    public Admin(String name, String phoneNumber, String email, String password, int adminId, List<Permissions>perms){
        super(name,phoneNumber,email,password);
        this.adminId=adminId;
        this.permissionsList=perms;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public List<Permissions> getPermissionsList() {
        return permissionsList;
    }

    public void setPermissionsList(List<Permissions> permissionsList) {
        this.permissionsList = permissionsList;
    }



    public void monitorOrder(){
        System.out.println("Admin " + getName() + " monitoring orders");
    }

    public void handleDispute(){
        System.out.println("Admin " + getName() + " handling dispute");
    }

    @Override
    public void manageOrder(){
        monitorOrder();
    }

    @Override
    public void manageProfile(){
        System.out.println("Admin " + getName() + " updating profile");
    }

    @Override
    public String toString(){
        return(super.toString() + ", adminId=" + adminId  + ", permissions=" + permissionsList);
    }
}