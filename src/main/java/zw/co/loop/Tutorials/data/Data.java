package zw.co.loop.Tutorials.data;

import zw.co.loop.Tutorials.model.Auth;
import zw.co.loop.Tutorials.model.Feed;
import zw.co.loop.Tutorials.model.User;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Data {
    // this class acts as a filler

    private static ArrayList<User> users = new  ArrayList<User>();
    private static ArrayList<Feed> feed = new  ArrayList<Feed>();
    private static ArrayList<Auth> auth = new  ArrayList<Auth>();

    public Data(){
       bundleData();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User getUserById(String id) {
        for (User user : users) {
            if (id.equals(user.getUserId())) {
                return user;
            }
        }
        return null;
    }
    public User login(String id, String password) {
        for (User user : users) {
            if (id.equals(user.getUserId()) && password.equals(user.getUserPassword())) {
                return new User(user.getUserId(),user.getUserName(),null,user.getUserToken());
            }
        }
        return null;
    }

    public ArrayList<User> getUserByName(String name) {
        ArrayList<User> usersPlaceholder = new  ArrayList<User>();
        for (User user : users) {
            if (name.equals(user.getUserName())) {
                usersPlaceholder.add(user);
            }
        }
        return usersPlaceholder;
    }
    public ArrayList<Feed> getFeed() {
           return feed;
    }
    public ArrayList<Auth> getAuthResponse(Boolean isSuccess) {
        if(isSuccess){
           return auth;
        }else{
           return null;
        }
    }

    private void bundleData(){
        users.add(new User("tendai1","Tendai", "tendai1", "xz87yHS7"));
        users.add(new User("lee2","Leslie", "lee2","xR35rIT7"));
        users.add(new User("tinashe3","Tinashe", "tinashe3", "df87sDT6"));
        users.add(new User("prob4","Probity", "prob4","er87yFB0"));
        users.add(new User("ten5","Tendai", "ten5", "nk45tGR9"));

        feed.add(new Feed("1","The Rock Upon the Ocean", "Just a short story from me", "29 Nov 19"));
        feed.add(new Feed("2","The Rock Upon the Ocean 2", "Just a short story from me", "29 Nov 20"));

        auth.add(new Auth("1","Tendai", "xz87yHS7"));
    }
}
