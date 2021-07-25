package Constants;

import org.openqa.selenium.By;

public class Constants {

    public static String CHECKANASAYFA = "com.ozdilek.ozdilekteyim:id/textView";
    public static final By BASLA_BUTTON = By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");
    public static String CHECKALISVERIS = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.TextView";
    public static final By KATAGORİ_BUTTON = By.id("com.ozdilek.ozdilekteyim:id/nav_categories");
    public static String CHECKKATAGORI ="com.ozdilek.ozdilekteyim:id/largeLabel";
    public static final By KADIN_BUTTON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]");
    public static final By PANTOLON_BUTTON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]");
    public static final By SON_URUN = By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/recyclerView']/android.widget.FrameLayout[last()]/android.view.ViewGroup/android.widget.ImageView[last()]");
    public static String CHECKGIRISYAP = "com.ozdilek.ozdilekteyim:id/btnLogin";
    public static final By GERI_BUTTON = By.id("com.ozdilek.ozdilekteyim:id/ivBack");
    public static final By HESABIM =By.id("com.ozdilek.ozdilekteyim:id/nav_account");
    public static final By SEPETIM =By.id("com.ozdilek.ozdilekteyim:id/nav_cart");
}
