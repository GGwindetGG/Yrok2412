public class Glass {
    String tswet, diametr, no4noe_vidne, naliie_3_goveka;

    @Override
    public String toString() {
        return "Glass{" +
                "tswet='" + tswet + '\'' +
                ", diametr='" + diametr + '\'' +
                ", no4noe_vidne='" + no4noe_vidne + '\'' +
                ", naliie_3_goveka='" + naliie_3_goveka + '\'' +
                '}';
    }

    public Glass(String tswet, String diametr, String no4noe_vidne, String naliie_3_goveka) {
        this.tswet = tswet;
        this.diametr = diametr;
        this.no4noe_vidne = no4noe_vidne;
        this.naliie_3_goveka = naliie_3_goveka;
    }

    public String getTswet() {
        return tswet;
    }

    public String getDiametr() {
        return diametr;
    }

    public String getNo4noe_vidne() {
        return no4noe_vidne;
    }

    public String getNaliie_3_goveka() {
        return naliie_3_goveka;
    }
}
