package nr.king.a90skisshows;

import java.util.ArrayList;

public class MainArrayData {
    private String cartooMainname;
    private String cartoonImageViewUrl;
    private String carttonBgImageUrl;
    private ArrayList<InnerRecylerData> arrayList;

    public MainArrayData(String cartooMainname, String cartoonImageViewUrl, String carttonBgImageUrl, ArrayList<InnerRecylerData> arrayList) {
        this.cartooMainname = cartooMainname;
        this.cartoonImageViewUrl = cartoonImageViewUrl;
        this.carttonBgImageUrl = carttonBgImageUrl;
        this.arrayList = arrayList;
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

    public String getCarttonBgImageUrl() {
        return carttonBgImageUrl;
    }

    public void setCarttonBgImageUrl(String carttonBgImageUrl) {
        this.carttonBgImageUrl = carttonBgImageUrl;
    }

    public ArrayList<InnerRecylerData> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<InnerRecylerData> arrayList) {
        this.arrayList = arrayList;
    }
}
