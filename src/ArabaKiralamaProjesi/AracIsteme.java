package ArabaKiralamaProjesi;

public class AracIsteme {
    //pojo class

    //Kiralama bilgileri
    private String alinacakSehir;
    private String alinacakGün;
    private double alisSaati;
    private String teslimGünü;
    private double teslimSaati;

    //Araba özellikleri
    private String marka;
    private String model;
    private String yakitTürü;
    private String vites;
    private double günlükKiralamaÜcreti;

    public AracIsteme(){
    }

    public AracIsteme(String alinacakSehir, String alinacakGün, double alisSaati, String teslimGünü, double teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGün = alinacakGün;
        this.alisSaati = alisSaati;
        this.teslimGünü = teslimGünü;
        this.teslimSaati = teslimSaati;
    }
    public AracIsteme(String marka, String model, String yakitTürü, String vites, double günlükKiralamaÜcreti) {
        this.marka = marka;
        this.model = model;
        this.yakitTürü = yakitTürü;
        this.vites = vites;
        this.günlükKiralamaÜcreti = günlükKiralamaÜcreti;

    }

    @Override
    public String toString() {
        return "AracIsteme{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTürü='" + yakitTürü + '\'' +
                ", vites='" + vites + '\'' +
                ", günlükKiralamaÜcreti=" + günlükKiralamaÜcreti +
                '}';
    }

    public String getAlinacakSehir() {

        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public String getAlinacakGün() {
        return alinacakGün;
    }

    public void setAlinacakGün(String alinacakGün) {
        this.alinacakGün = alinacakGün;
    }

    public double getAlisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(double alisSaati) {
        this.alisSaati = alisSaati;
    }

    public String getTeslimGünü() {
        return teslimGünü;
    }

    public void setTeslimGünü(String teslimGünü) {
        this.teslimGünü = teslimGünü;
    }

    public double getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(double teslimSaati) {
        this.teslimSaati = teslimSaati;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTürü() {
        return yakitTürü;
    }

    public void setYakitTürü(String yakitTürü) {
        this.yakitTürü = yakitTürü;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public double getGünlükKiralamaÜcreti() {
        return günlükKiralamaÜcreti;
    }

    public void setGünlükKiralamaÜcreti(double günlükKiralamaÜcreti) {
        this.günlükKiralamaÜcreti = günlükKiralamaÜcreti;
    }

}
