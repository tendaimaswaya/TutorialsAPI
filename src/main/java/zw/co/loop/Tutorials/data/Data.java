package zw.co.loop.Tutorials.data;

import zw.co.loop.Tutorials.model.Auth;
import zw.co.loop.Tutorials.model.Feed;
import zw.co.loop.Tutorials.model.Product;
import zw.co.loop.Tutorials.model.User;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Data {
    // this class acts as a filler

    private static ArrayList<User> users = new  ArrayList<User>();
    private static ArrayList<Feed> feed = new  ArrayList<Feed>();
    private static ArrayList<Product> products = new  ArrayList<Product>();
    private static ArrayList<Auth> auth = new  ArrayList<Auth>();

    public Data(){
       bundleData();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Product> getProducts() {
        return products;
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
        return new User();
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
        users.clear();
        users.add(new User("tendai1","Tendai Test", "tendai1", "xz87yHS7"));
        users.add(new User("lee2","Leslie Test", "lee2","xR35rIT7"));
        users.add(new User("tinashe3","Tinashe Test", "tinashe3", "df87sDT6"));
        users.add(new User("prob4","Probity Test", "prob4","er87yFB0"));
        users.add(new User("ten5","Tendai Test2", "ten5", "nk45tGR9"));

        feed.clear();
        feed.add(new Feed("1","The Rock Upon the Ocean", "Just a short story from me", "29 Nov 19"));
        feed.add(new Feed("2","The Rock Upon the Ocean 2", "Just a short story from me", "29 Nov 20"));

        auth.clear();
        auth.add(new Auth("1","Tendai", "xz87yHS7"));

        products.clear();
        products.add(new Product("1","Huawei P30", "https://i.gadgets360cdn.com/products/large/1553612597_635_huawei_p30_pro.jpg", "10-12-2019"));
        products.add(new Product("2","iPhone XS", "https://csmobiles.com/19721-large_default/apple-iphone-xs-64gb-gray.jpg","10-12-2019"));
        products.add(new Product("3","Google Pixel 4", "https://icdn2.digitaltrends.com/image/digitaltrends/pixel-4-xl-rear-sticking-out.jpg", "10-12-2019"));
        products.add(new Product("4","Samsung S10", "https://csmobiles.com/27310-large_default/samsung-galaxy-s10-g973f-128gb-dual-sim-red.jpg","10-12-2019"));
        products.add(new Product("5","Xiaomi MI 9", "https://fdn2.gsmarena.com/vv/bigpic/xiaomi-mi-9-.jpg", "10-12-2019"));
    }
}
