package zw.co.loop.Tutorials.model;

public class Product {
    private String id, product, image, datePosted;

    public Product(String id, String product, String image, String datePosted) {
        this.id = id;
        this.product = product;
        this.image = image;
        this.datePosted = datePosted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String title) {
        this.product = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }
}