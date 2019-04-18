public class gay {

    gay (double L, float D, String N, int A){
        this.Lenght = L;
        this.Diametr = D;
        this.Nation = N;
        this.Age = A;
    }


    public double Lenght;
    public float Diametr;
    public String Nation;
    public int Age;

    public double getLenght() {
        return Lenght;
    }

    public void setLenght(double L){

        this.Lenght = L;
    }

    public static void question()
    {
        System.out.println("Go ebaca?");
    }

}
