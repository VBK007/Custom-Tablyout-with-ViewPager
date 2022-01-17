package nr.king.a90skisshows;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Objects;

import nr.king.a90skisshows.viewPager.CustomViewPgaerAdapter;


public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    ArrayList<MainRecylerData> mainRecylerDataArrayList;
    String mTag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.main_viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        mainRecylerDataArrayList = new ArrayList<>();
        mainRecylerDataArrayList = initRecyler();
        Log.d(mTag, "size of data: " + mainRecylerDataArrayList.size());

        for (int i = 0; i < mainRecylerDataArrayList.size(); i++) {
            MainRecylerData lData = mainRecylerDataArrayList.get(i);
            tabLayout.addTab(tabLayout.newTab().setText(lData.getTabTitle()), i);
        }
        for (int i=0;i<tabLayout.getTabCount();i++)
        {
            View tab = ((ViewGroup) tabLayout.getChildAt(0)).getChildAt(i);
            ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) tab.getLayoutParams();
            params.setMargins(20, 0, 30, 20);
            tab.requestLayout();
        }
        tabLayout.getTabAt(0).view.setBackgroundResource(R.drawable.selected_current_tab);

        viewPager.setCurrentItem(0);
        viewPager.setAdapter(new CustomViewPgaerAdapter(this, mainRecylerDataArrayList));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                tabLayout.getTabAt(tab.getPosition()).view.setBackgroundResource(R.drawable.selected_current_tab);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tabLayout.getTabAt(tab.getPosition()).view.setBackgroundResource(R.drawable.tab_selected_red);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private ArrayList<MainRecylerData> initRecyler() {
        ArrayList<InnerRecylerData> innerRecylerData = new ArrayList<>();
        ArrayList<MainArrayData> mainPokemonArrayData = new ArrayList<>();//pokemon pickachu
        ArrayList<MainArrayData> powerRangerArrayData = new ArrayList<>();//powerranger pickachu
        ArrayList<MainArrayData> ben10DataArraylist = new ArrayList<>();//Ben10 data
        ArrayList<InnerRecylerData> innerRecylerDataZalasar = new ArrayList<>();
        ArrayList<InnerRecylerData> innerRecyclerCharmendor = new ArrayList<>();
        ArrayList<InnerRecylerData> innerRecylerDataChikorita = new ArrayList<>();
        ArrayList<InnerRecylerData> innerSPDDATA = new ArrayList<>();
        ArrayList<InnerRecylerData> innerNinja = new ArrayList<>();
        ArrayList<InnerRecylerData> innerMysytecicATA = new ArrayList<>();
        ArrayList<InnerRecylerData> innerNinjaforceATA = new ArrayList<>();
        ArrayList<InnerRecylerData> innerBen10Data = new ArrayList<>();
        ArrayList<InnerRecylerData> innergwenData = new ArrayList<>();
        ArrayList<InnerRecylerData> innerKevinData = new ArrayList<>();
        ArrayList<InnerRecylerData> benjamFatherdata = new ArrayList<>();


        mainRecylerDataArrayList = new ArrayList<>();
        innerRecylerData.add(new InnerRecylerData("Power:electricity ", "https://c.tenor.com/-VYWaSmWx2QAAAAC/thunderbolt-pikachu.gif"));
        innerRecylerData.add(new InnerRecylerData("soft and super stretchy", "https://media0.giphy.com/media/U2nN0ridM4lXy/200.gif"));
        innerRecylerData.add(new InnerRecylerData("Pikachu", "https://cdn.vox-cdn.com/uploads/chorus_asset/file/655226/tumblr_lodl4fWXtS1qluebuo1_500.0.gif"));
        innerRecylerData.add(new InnerRecylerData("Ash's first Pokemon to activate their Ability", "https://giffiles.alphacoders.com/130/130937.gif"));
        innerRecylerData.add(new InnerRecylerData("weak against Ground moves", "https://p.favim.com/orig/2018/08/02/pikachu-gif-electric-pokemon-species-Favim.com-6125314.gif"));
        innerRecylerData.add(new InnerRecylerData("Thunder Shock in Pokemon Go", "https://i.gifer.com/8Xmw.gif"));
        mainPokemonArrayData.add(0, new MainArrayData("Pikachu", "https://i.gifer.com/XyVO.gif", "", innerRecylerData));
        innerRecylerDataZalasar.add(new InnerRecylerData("Species:Seed Pokémon", "https://c.tenor.com/38wTyIwrukEAAAAC/bulbasaur.gif"));
        innerRecylerDataZalasar.add(new InnerRecylerData("Height:0.7 m (2′04″)", "https://c.tenor.com/vb1I0DwVg_AAAAAC/pokemon-bulbasaur.gif"));
        innerRecylerDataZalasar.add(new InnerRecylerData("Weight:6.9 kg (15.2 lbs)", "https://c.tenor.com/_B4QaT_C3WsAAAAC/bulbasaur-pokemon.gif"));
        innerRecylerDataZalasar.add(new InnerRecylerData("Abilities:1. Overgrow\n" +
                "Chlorophyll (hidden ability)", "https://i.pinimg.com/originals/7b/2c/1a/7b2c1a8e264ba6a40ab3098264c79901.gif"));
        innerRecylerDataZalasar.add(new InnerRecylerData("Gender:87.5% male, 12.5% female", "https://media3.giphy.com/media/11bZCpoCBpf3ck/giphy.gif"));
        mainPokemonArrayData.add(1, new MainArrayData("Bulbasaur", "https://c.tenor.com/38wTyIwrukEAAAAC/bulbasaur.gif", "", innerRecylerDataZalasar));
        innerRecyclerCharmendor.add(new InnerRecylerData("Type:FIRE", "https://i.gifer.com/FEMn.gif"));
        innerRecyclerCharmendor.add(new InnerRecylerData("Species:Lizard Pokémon", "https://i.gifer.com/8XzK.gif"));
        innerRecyclerCharmendor.add(new InnerRecylerData("Height:0.6 m (2′00″)", "https://thumbs.gfycat.com/EvilTightHammerheadbird-size_restricted.gif"));
        innerRecyclerCharmendor.add(new InnerRecylerData("Weight:8.5 kg (18.7 lbs)", ""));
        innerRecyclerCharmendor.add(new InnerRecylerData("Abilities:1. Blaze\n" +
                "Solar Power (hidden ability)", "https://media2.giphy.com/media/WJ7Tr9wi8xVe0/giphy.gif"));
        mainPokemonArrayData.add(2, new MainArrayData("Charmander", "https://i.gifer.com/FEMn.gif", "", innerRecyclerCharmendor));
        innerRecylerDataChikorita.add(new InnerRecylerData("Type:GRASS", "https://i.gifer.com/Kgyg.gif"));
        innerRecylerDataChikorita.add(new InnerRecylerData("Species:Leaf Pokémon", "https://c.tenor.com/fdGVLu_qb3oAAAAC/chikorita-pokeomon.gif"));
        innerRecylerDataChikorita.add(new InnerRecylerData("Height:0.9 m (2′11″)", "https://i.gifer.com/F7GF.gif"));
        innerRecylerDataChikorita.add(new InnerRecylerData("Abilities:1. Overgrow\n" +
                "Leaf Guard (hidden ability)", "https://i.makeagif.com/media/2-05-2017/eIs3ie.gif"));
        mainPokemonArrayData.add(3, new MainArrayData("Chikorita", "https://i.gifer.com/Kgyg.gif", "", innerRecylerDataChikorita));
        mainRecylerDataArrayList.add(0, new MainRecylerData("Pokemon", mainPokemonArrayData));


        innerSPDDATA.add(new InnerRecylerData("RED RANGER", "https://i.makeagif.com/media/6-03-2016/cenQ3y.gif"));
        innerSPDDATA.add(new InnerRecylerData("GREEN RANGER", "https://i.makeagif.com/media/5-27-2016/pxdvC4.gif"));
        innerSPDDATA.add(new InnerRecylerData("YELLOW RANGER", "https://i.makeagif.com/media/9-08-2017/LJUJUq.gif"));
        innerSPDDATA.add(new InnerRecylerData("BLUE RANGER", "https://thumbs.gfycat.com/SkinnyAllIrukandjijellyfish-max-1mb.gif"));
        innerSPDDATA.add(new InnerRecylerData("PINK RANGER", "https://thumbs.gfycat.com/AdoredDefenselessDartfrog-size_restricted.gif"));
        innerSPDDATA.add(new InnerRecylerData("OMEGA RANGER", "https://thumbs.gfycat.com/VapidUnknownBoutu-max-1mb.gif"));
        powerRangerArrayData.add(0, new MainArrayData("SPD", "https://c.tenor.com/6z7NLu3nAawAAAAC/power-rangers-spd.gif", "", innerSPDDATA));
        innerMysytecicATA.add(new InnerRecylerData("RED RANGER","https://c.tenor.com/Qix5-SpGykIAAAAM/power-rangers-mystic-force-mystic-force.gif"));
        innerMysytecicATA.add(new InnerRecylerData("GREEN RANGER","https://thumbs.gfycat.com/HospitableBelatedFlyingfish-size_restricted.gif"));
        innerMysytecicATA.add(new InnerRecylerData("BLUE RANGER","https://thumbs.gfycat.com/WhiteHonoredAmericankestrel-size_restricted.gif"));
        innerMysytecicATA.add(new InnerRecylerData("YELLOW RANGER","https://i.makeagif.com/media/12-09-2015/W4rQBw.gif"));
        innerMysytecicATA.add(new InnerRecylerData("PINK RANGER","https://64.media.tumblr.com/97dd2ec17e4d186ac27f2070ac07f3ff/tumblr_nwl6nrQf981qdpodto3_r1_250.gifv"));
        innerMysytecicATA.add(new InnerRecylerData("KNIGHT WOLF RANGER","https://thumbs.gfycat.com/DimUnhappyArgentinehornedfrog-size_restricted.gif"));
        powerRangerArrayData.add(1,new MainArrayData("Mystechic Force","https://c.tenor.com/9qKdPyJ-fbIAAAAC/power-rangers-power-rangers-mystic-force.gif","",innerMysytecicATA));

        innerNinjaforceATA.add(new InnerRecylerData("RED RANGER","https://c.tenor.com/39ywrHOYUPUAAAAC/power-rangers-red-ranger.gif"));
        innerNinjaforceATA.add(new InnerRecylerData("BLACK RANGER","https://c.tenor.com/f5A9heYoBTUAAAAC/power-rangers-dancing.gif"));
        innerNinjaforceATA.add(new InnerRecylerData("BLUE RANGER","https://c.tenor.com/DXvFuMUwMcgAAAAC/power-rangers-mighty-morphin-power-rangers.gif"));
        innerNinjaforceATA.add(new InnerRecylerData("YELLOW RANGER","https://thumbs.gfycat.com/PrestigiousFinishedAsp-max-1mb.gif"));
        innerNinjaforceATA.add(new InnerRecylerData("WHITE RANGER","https://c.tenor.com/6x9e7gcAjIwAAAAC/power-rangers-dino-thunder.gif"));
        powerRangerArrayData.add(1,new MainArrayData("DYNO THUNDER","https://c.tenor.com/fBLZzyUqCYEAAAAC/power-rangers-power-rangers-dino-thunder.gif","",innerNinjaforceATA));

        innerNinja.add(new InnerRecylerData("RED RANGER","https://i.makeagif.com/media/10-24-2020/1N3rRA.gif"));
        innerNinja.add(new InnerRecylerData("GREEN RANGER","https://thumbs.gfycat.com/HopefulEqualEastrussiancoursinghounds-max-1mb.gif"));
        innerNinja.add(new InnerRecylerData("BLUE RANGER","https://64.media.tumblr.com/d2fef77314372c04aecfd5d67f3de8dd/tumblr_n3aldnaPmY1rjoe31o5_400.gifv"));
        innerNinja.add(new InnerRecylerData("YELLOW RANGER","https://i.pinimg.com/originals/76/fd/14/76fd149686d9a05ad3ea58efb756a497.gif"));
        innerNinja.add(new InnerRecylerData("THUNDER RANGER","https://i.makeagif.com/media/10-29-2019/wzU-py.gif"));
        powerRangerArrayData.add(1,new MainArrayData("NINJA STORM","https://c.tenor.com/gmG5lxPnPpMAAAAC/power-rangers-power-rangers-ninja-storm.gif","",innerNinja));
        mainRecylerDataArrayList.add(1, new MainRecylerData("PowerRangers", powerRangerArrayData));

        innerBen10Data.add(new InnerRecylerData("Cannonbolt","https://c.tenor.com/mfj1p0-H1rgAAAAC/cannonbolt-fight.gif"));
        innerBen10Data.add(new InnerRecylerData("Big Chill","https://i.pinimg.com/originals/02/28/75/02287576a33907927091c1c168806272.gif"));
        innerBen10Data.add(new InnerRecylerData("SWAMP_FIRE","https://static.wikia.nocookie.net/powerlisting/images/3/31/Swampfire.png.gif/revision/latest?cb=20181002233653"));
        innerBen10Data.add(new InnerRecylerData("JETRAY","https://64.media.tumblr.com/16c1fd86d91981cfd9159ba0f8c72004/tumblr_p91ob4Ni1G1rvj581o6_400.gifv"));
        innerBen10Data.add(new InnerRecylerData("ECHO ECHO","https://64.media.tumblr.com/03b098287297c3be3c510a681f98ca34/tumblr_o6zpiqQl0x1rrmfsto1_250.gifv"));
        innerBen10Data.add(new InnerRecylerData("HUMUNGOUSAUR","https://j.gifs.com/JZVVmv.gif"));
        innerBen10Data.add(new InnerRecylerData("STINK_FLY","https://thumbs.gfycat.com/UnevenVioletAustraliancurlew-size_restricted.gif"));
        innerBen10Data.add(new InnerRecylerData("WAY_BIG","https://i.makeagif.com/media/5-04-2021/vRczee.gif"));
        innerBen10Data.add(new InnerRecylerData("BIG BRUTE","https://img.wattpad.com/0af0c3b9fc1e2017b0abeebb2200f5df8ff7d783/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f4770695061696a576c6c474357513d3d2d3838393837323438362e313631313339616564616432633534363134373738373238323234312e676966"));
        ben10DataArraylist.add(0,new MainArrayData("Benjamin Tennyson","https://thumbs.gfycat.com/AccurateAnnualFluke-max-1mb.gif","",innerBen10Data));

        innergwenData.add(new InnerRecylerData("Mana Manipulation and Energy Control","https://static.wikia.nocookie.net/thehangingtensaga/images/6/67/Gwen_Tennyson_Magical_Mana_Abilities.gif/revision/latest/scale-to-width-down/180?cb=20190324051349"));
        innergwenData.add(new InnerRecylerData("Magic and Spells","https://static.wikia.nocookie.net/thehangingtensaga/images/9/91/Gwen_Tenyson_Blue_Magic_And_Spells.gif/revision/latest/scale-to-width-down/180?cb=20190325180258"));
        innergwenData.add(new InnerRecylerData("Knowledge and Intelligence","https://img.wattpad.com/c2db8956fef99a920c9b6d06c37a576c6c58b14c/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f614b5153634a66726944577744673d3d2d3931313231353639312e313631656236393038393566373039623532393233323238383634312e676966"));
        innergwenData.add(new InnerRecylerData("Athletics and Martial Arts","https://static.wikia.nocookie.net/thehangingtensaga/images/3/30/Gwen_Tennyson_Kick-Ass_Taekwondo.gif/revision/latest/scale-to-width-down/180?cb=20190807174226"));
        ben10DataArraylist.add(1,new MainArrayData("Gwen Tennyson","https://static.wikia.nocookie.net/thehangingtensaga/images/d/de/Gwen_AF_Mana.gif/revision/latest/scale-to-width-down/300?cb=20190119015341","",innergwenData));

        innerKevinData.add(new InnerRecylerData("Occupation:" +
                "Criminal (formerly)\n" +
                "Null Void prisoner (formerly)\n" +
                "Plumber","https://img.wattpad.com/4f582ed1e766a05e4990308e3c22bfbaabe60a05/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f38596c6b424b504f3879486977673d3d2d3733323330373338362e313539653965373730323339393333613937313538303434343439302e676966"));
        innerKevinData.add(new InnerRecylerData("Powers / Skills:" +
                "Superhuman strength\n" +
                "Power absorption\n" +
                "Alien technologies","https://64.media.tumblr.com/2e4c471411f73b52a1ba0c7fc87c34b8/d1a66d74f6b5ce9c-43/s540x810/c8bb7334a039a95687410ceabf7a49656caf0406.gifv"));
        innerKevinData.add(new InnerRecylerData("Hobby:" +
                "Fighting.\n" +
                "Working on his car.\n" +
                "Hanging out with his friends.",""));
        innerKevinData.add(new InnerRecylerData("Goal:" +
                "Absorb the power of the Omnitrix and defeat and kill Ben Tennyson (failed)",
                "https://i.imgur.com/UPXNDKN.gif"));
        innerKevinData.add(new InnerRecylerData("Crimes:" +
                "Destruction\n" +
                "Abuse of power","https://64.media.tumblr.com/bdd5035158eb2a932e5a09c7a583d0ef/tumblr_obu5igrMBc1rsv0iso1_500.gif"));
        ben10DataArraylist.add(2,new MainArrayData("Kevin Ethan Levin","https://pa1.narvii.com/6440/de04d477dfdefd4d0da7198e3f7ff9cfebef7930_hq.gif","",innerKevinData));
        mainRecylerDataArrayList.add(2,new MainRecylerData("BEN_10",ben10DataArraylist));





        return mainRecylerDataArrayList;
    }
}


