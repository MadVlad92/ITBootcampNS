package zaposleni;

public final class IzvrsniManager extends Manager {
    private String omiljenaBoja; //wtf
    public IzvrsniManager(String omiljenaBoja) {
        super("Damjan", 20000, 1992, 3, 4);
        this.omiljenaBoja = omiljenaBoja;
    }

    public String getOmiljenaBoja() {
        return omiljenaBoja;
    }

    public void setOmiljenaBoja(String omiljenaBoja) {
        this.omiljenaBoja = omiljenaBoja;
    }
}
