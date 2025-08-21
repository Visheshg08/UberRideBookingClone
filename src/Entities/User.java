package Entities;

public class User {
    private UserInfo userInfo;
    private Location location;

    public User(){}
    public User(UserInfo userInfo, Location location) {
        this.userInfo = userInfo;
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public String getUserName(){
        return userInfo.name;
    }

}
