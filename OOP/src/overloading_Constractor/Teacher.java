
package overloading_Constractor;

public class Teacher {
    String name,gender;
    int phone;
    
    Teacher(){
        System.out.println("No Value");
    }
    
    Teacher(String n, String g){
        name = n;
        gender = g;
    }
    
    Teacher(String n, String g, int i){
        name = n;
        gender = g;
        phone = i;
    }
    
    void displayinformation(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        
        System.out.println("\n");
    }
    
    
}
