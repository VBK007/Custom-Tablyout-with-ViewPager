package nr.king.a90skisshows;

import java.util.ArrayList;


public class  InnerRecylerData{
    private String cartooMainname;
    private String cartoonImageViewUrl;

    public InnerRecylerData(String cartooMainname, String cartoonImageViewUrl) {
        this.cartooMainname = cartooMainname;
        this.cartoonImageViewUrl = cartoonImageViewUrl;
    }

    public String getCartooMainname() {
        return cartooMainname;
    }

    public void setCartooMainname(String cartooMainname) {
        this.cartooMainname = cartooMainname;
    }

    public String getCartoonImageViewUrl() {
        return cartoonImageViewUrl;
    }

    public void setCartoonImageViewUrl(String cartoonImageViewUrl) {
        this.cartoonImageViewUrl = cartoonImageViewUrl;
    }
}