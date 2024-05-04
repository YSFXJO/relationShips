public class Main {
    public static void main(String[] args){
        Department d = new Department(234,"IT");
        Department d1 = new Department(567,"IT");
        Employee employee = new Employee(1,500,"Yousef","Ammar","Yousef","O+","123456","Yemen",2005,d);
        Employee employee2 = new Employee(12345, 1400,"Moh","Noah","Yousef","AB","445013911","Yemen",1996,d1);

        System.out.println("\n"+employee2);
        // System.out.println("\n"+employee2.toString());
        
    }
}
