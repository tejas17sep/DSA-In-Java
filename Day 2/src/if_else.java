public class if_else {
    public static void main(String[] args) {
        int salary = 14550;
        if (salary>20000){
            salary=salary+1000;
            System.out.println(salary);
        }
         else if(salary>10000) {
            salary=salary+5000;
            System.out.println(salary);
        }
        else {
            salary = salary+500;
            System.out.println(salary);
        }
    }
}
