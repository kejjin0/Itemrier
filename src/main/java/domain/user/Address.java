package domain.user;

public class Address {
    private int zipCode;
    private String streetAdd;
    private String streetDetail;
    
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public String getStreetAdd() {
        return streetAdd;
    }
    public void setStreetAdd(String streetAdd) {
        this.streetAdd = streetAdd;
    }
    public String getStreetDetail() {
        return streetDetail;
    }
    public void setStreetDetail(String streetDetail) {
        this.streetDetail = streetDetail;
    }
}
