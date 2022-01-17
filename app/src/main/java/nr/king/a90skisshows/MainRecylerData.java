package nr.king.a90skisshows;

import java.util.ArrayList;

public class MainRecylerData {
    private String tabTitle;
    private ArrayList<MainArrayData> arrayDataArrayList;


    public MainRecylerData(String tabTitle, ArrayList<MainArrayData> arrayDataArrayList) {
        this.tabTitle = tabTitle;
        this.arrayDataArrayList = arrayDataArrayList;
    }

    public String getTabTitle() {
        return tabTitle;
    }

    public void setTabTitle(String tabTitle) {
        this.tabTitle = tabTitle;
    }

    public ArrayList<MainArrayData> getArrayDataArrayList() {
        return arrayDataArrayList;
    }

    public void setArrayDataArrayList(ArrayList<MainArrayData> arrayDataArrayList) {
        this.arrayDataArrayList = arrayDataArrayList;
    }
}
