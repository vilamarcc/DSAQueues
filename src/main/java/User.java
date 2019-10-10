public class User {
    private String name;
    private String DNI;
    private double followers;

    public String getName(){
        return this.name;
    }
    public String getDNI() {
        return this.DNI;
    }
    // public double getFollowers(){return this.followers;}

    public void setName (String name) {this.name=name;}
    public void setDNI (String DNI) {this.DNI=DNI;}
    // public void setFollowers (double foll) {this.followers=foll;}

}