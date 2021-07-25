package Base;

import com.thoughtworks.gauge.Step;
import static Constants.Constants.*;


public class StepImplementation extends BasePage{

    @Step("Uygulamanin acildigi kontrol edilir.")
    public void checkAnaSayfa () {
        check(CHECKANASAYFA, "Mağazadan Alışveriş");
    }

    @Step("Alisverise basla butonuna tiklanir")
    public void cliclAlisveris () throws InterruptedException {
        clickById(BASLA_BUTTON);
        waitForSecond(1);
    }

    @Step("Alisveris sayfasinin acildigi dogrulanir.")
    public void checkAlisveris () {
        checkXpath(CHECKALISVERIS, "Mağaza");
    }

    @Step("Katagoriler Sayfasi Acilir")
    public void clickKatagoriler () {
        clickById(KATAGORİ_BUTTON);
    }

    @Step("Katagoriler Sayfasinin acildigi dogrulanir")
    public void checkKatagoriler() {
        check(CHECKKATAGORI, "Kategoriler");
    }

    @Step("Menuden 'Kadın' Secenegine tiklanir")
    public void clickKadin () {
        clickByXpath(KADIN_BUTTON);
    }

    @Step("'pantolon' kategorisi acilir")
    public void clickPantolon () throws InterruptedException {
        clickByXpath(PANTOLON_BUTTON);
        waitForSecond(2);
    }

    @Step("Sayfanin en asagisina gelene kadar swipe edilir.")
    public void swipe() throws InterruptedException {
        swipe(537, 1793, 551 , 375);
        waitForSecond(1);
    }

    @Step("Ekrandaki son urun icin favoriye ekleme butonuna tiklanir")
    public void sonUrun() throws InterruptedException {
        clickByXpath(SON_URUN);
        waitForSecond(1);
    }

    @Step("Giris yapma sayfasinin acildigi kontrol edilir.")
    public void checkGirisYap() {
        check(CHECKGIRISYAP, "Giriş Yap");
    }

    @Step("geri butonuna tiklanir ve katogiriler sayfasinin tekrar acildigi kontrol edilir")
    public void clickGeri() throws InterruptedException {
        clickById(GERI_BUTTON);
        waitForSecond(2);
        check(CHECKKATAGORI, "Kategoriler");
    }

    @Step("Hesabim butonuna tiklanir")
    public void clickHesabim() {
        clickById(HESABIM);
    }

    @Step("Sepetim butonuna tiklanir")
    public void clickSepetim() {
        clickById(SEPETIM);
    }
}
