public class Users {//Clase de prueba

    private String name;
    private String DNI;
    private int followers;

    public String getName(){
        return this.name;
    }
    public String getDNI() {
        return this.DNI;
    }
    public double getFollowers(){return this.followers;}

    public Users (String n, String dni, int f ) {
        this.name = n;
        this.DNI = dni;
        this.followers = f;
    }
}
