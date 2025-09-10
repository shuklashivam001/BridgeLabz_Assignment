public class VolumeOfEarth {
    public static void main(String[] args) {
        int roe = 6378;
        double rm = roe * 1.8;
        double vckm = 4/3*3.14*roe*roe*roe;
        double vcm = 4/3*3.14*rm*rm*rm;
        System.out.println("The volume of earth in cubic kilometers is "+vckm+" and cubic miles is "+vcm);
    }
}