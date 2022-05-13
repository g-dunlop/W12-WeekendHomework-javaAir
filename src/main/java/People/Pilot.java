package People;

public class Pilot extends Person {

    private String licenseNumber;
    private RankType rankType;

    public Pilot(String name, RankType rankType, String licenseNumber ){
        super(name);
        this.rankType = rankType;
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public RankType getRankType() {
        return rankType;
    }

    public void setRankType(RankType rankType) {
        this.rankType = rankType;
    }
}
