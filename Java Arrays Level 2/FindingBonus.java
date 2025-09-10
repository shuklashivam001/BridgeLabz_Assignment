import java.util.Scanner;

public class FindingBonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfExp = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        int idx = 0;
        System.out.println("Enter salary of 10 employees : ");
        while(idx<10){
            double s = scan.nextDouble();
            if(s>=0){
                salary[idx++] = s;
            }
            else{
                System.out.println("Enter valid salary : ");
            }
        }
        int idxy = 0;
        System.out.println("Enter Years of experience of employees : ");
        while(idxy<10){
            double s = scan.nextDouble();
            if(s>=0){
                yearsOfExp[idxy++] = s;
            }
            else{
                System.out.println("Enter valid Years Of Experience : ");
            }
        }
        for(int i=0; i<10; i++){
            if(yearsOfExp[i]<5){
                bonus[i] = salary[i]*2/100;
                newSalary[i] = salary[i] + bonus[i];
            }
            else{
                bonus[i] = salary[i]*5/100;
                newSalary[i] = salary[i] + bonus[i];
            }
        }
        for(int i=0; i<10; i++){
            totalBonus+=bonus[i];
            totalOldSalary+=salary[i];
            totalNewSalary+=newSalary[i];
        }
        System.out.println("Total Bonus : "+totalBonus+"\nTotal old salary : "+totalOldSalary+"\nTotal new salary : "+totalNewSalary);
    }
}
