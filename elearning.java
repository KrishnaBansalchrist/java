

class elearning{
    public static void main(String args[]){

            Registration reg = new Registration();
            reg.display();
            reg.addmember(123);
            reg.addmember(2147221, "krishna.bansal@mca.christuniversity.in");
            Student s1 = new Student(2147221,"Krishna");  
            Student s2 = new Student(2147225,"Rachit"); 
            
            s1.display();  
            s2.display(); 

            System.out.println("------------------------------------------------------------------");

            

            vedio_course vc1 = new vedio_course();
            vc1.display();
            System.out.println("-------------------------------------------------------------------");

            StringBuffer str=new StringBuffer("JohnDoe");
            
            str.append("Buff");
            
            int q=str.length();
            System.out.println("Length"+q);
            assessment as1 = new assessment();
            as1.display(5 , 90);
            System.out.println("--------------------------------------------------------------------");

            project_creation procr = new project_creation();
            procr.display();
            System.out.println("---------------------------------------------------------------------");

            discussion_platform displ = new discussion_platform();
            displ.display();
            System.out.println("----------------------------------------------------------------------");


            certificate cer = new certificate();
            cer.display();
            System.out.println("----------------------------------------------------------------------");


            organisation org = new organisation();
            org.display();
            System.out.println("----------------------------------------------------------------------");
        
            e_books eb = new e_books();
            eb.display();
            System.out.println("----------------------------------------------------------------------");

            instructor ins = new instructor();
            ins.display();
            System.out.println("----------------------------------------------------------------------");

            course mcacourse = new mcacourse();
            mcacourse.purchaseamt();
            mcacourse.coursematerial();

            System.out.println("----------------------------------------------------------------------");

            synchronous syn = new synchronous();
            syn.chat();


    }


}

class Registration{
    String username= "user";
    String password = "******";
    int ph_no= 978205483;
    String email ="user@gmail.com";
    String type = "student";
    String gender ="Male";
    String city = "Jaipur";
    String address = "Bangalore";

    public void display()
    {
        System.out.println("Username : " +username);
        System.out.println("Password: " +password);
        System.out.println("ph_no: " +ph_no);
        System.out.println("email: " +email);
        System.out.println("type: " +type);
        System.out.println("gender: " +gender);
        System.out.println("city: " +city);
        System.out.println("address: " +address);

    }
    public void addmember(int stu_id,String email){
        System.out.println("function 1 -> STUDENT ID " +stu_id);
        System.out.println("email: " +email);
        

    }

    public void addmember(int inst_id){
        System.out.println("function 2 -> INST ID: " +inst_id);

    }
   
}  
    
class Student{  
    int rollno;//instance variable  
    String name;  
    static String college ="christ university";//static variable  
    //constructor  
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display the values  
    void display (){System.out.println(rollno+" "+name+" "+college);}  
}  

abstract class course{
    public abstract void coursematerial();

    public void purchaseamt(){
        System.out.println("amt you want to pay for the course material");
    }
}
  
class mcacourse extends course{
    public void coursematerial(){
        System.out.println("mca coursematerial has price of 2000Rs");
    }
}

class vedio_course{
    String topic = "recursion";
    int fee = 100;
    String teacher = "Abdul";
    float duration = 2;
    String course = "java";
    String platform = "udemy";
    String notes = "javacheatsheet";
    int quality = 720;


    public void display()
    {
        System.out.println("Topic : " +topic);
        System.out.println("fee: " +fee);
        System.out.println("teacher: " +teacher);
        System.out.println("duration: " +duration);
        System.out.println("course: " +course);
        System.out.println("platform: " +platform);
        System.out.println("notes: " +notes);
        System.out.println("quality: " +quality);

    }

}

class assessment{
    String hackathon = "christuniversity";
    int marks = 90;
    int scolarship = 33;
    int rank = 5;
    String teacher = "Jp sir";
    String offer = "awarded a star";
    String quiz = "final sem quiz";

    public void display()
    {
        System.out.println("Hackathon : " +hackathon);
        System.out.println("Marks: " +marks);
        System.out.println("Teacher: " +teacher);
        System.out.println("Scolarship: " +scolarship);
        System.out.println("Rank: " +rank);
        System.out.println("Offer: " +offer);
        System.out.println("Quiz: " +quiz);
    }

    public void display(int marks , int rank){
        if (this.rank>=4 || this.marks>=70){
            System.out.println("you can do much better");
        }
        else{
            System.out.println("u have failed the sem try it next time");
        }
        System.out.println(this.marks);
        System.out.println(this.rank);

    }

}

class discussion_platform{
    String topic = "Python";
    String admin= "guider";
    String users = "Akshay";
    String ans = "platform for discussion";
    String comments = "good answer";
    String questions = "explain the topic";
    String ideas = "short tricks";

    public void display()
    {
        System.out.println("Topic : " +topic);
        System.out.println("Admin: " +admin);
        System.out.println("Users: " +users);
        System.out.println("Answers: " +ans);
        System.out.println("Comments: " +comments);
        System.out.println("Questions: " +questions);
        System.out.println("Ideas: " +ideas);

    }

}

class project_creation{
    String topic ="Android";
    String tools = "androidstudio";
    String technologies = "java";
    String description = "app to travel";
    String status = "hold";
    String project_head = "Krishna";
    String problem = "ppl are not able to cover all the places";


    public void display()
    {
        System.out.println("Topic : " +topic);
        System.out.println("Tools: " +tools);
        System.out.println("Technoligies: " +technologies);
        System.out.println("Description: " +description);
        System.out.println("Status: " +status);
        System.out.println("Project_head: " +project_head);
        System.out.println("Problem: " +problem);

    }
}


class organisation{
    String name = "christuniversity";
    String email = "christ@gmail.com";
    String address = "christ university hosour rd bangalore india";
    int phone_no = 978205483;
    String website = "christuniversity.in";
    
    public void display()
    {
        System.out.println("Name : " +name);
        System.out.println("Email: " +email);
        System.out.println("Address: " +address);
        System.out.println("Phone_No: " +phone_no);
        System.out.println("Website: " +website);

    }

    class Student{  
        int rollno;//instance variable  
        String name;  
        static String college ="christ university Central Campus";//static variable
        static String unniversity="Christ University";  
        //constructor  
        Student(int r, String n){  
        rollno = r;  
        name = n;  
        }  
        //method to display the values  
        void display (){System.out.println(rollno+" "+name+" "+college);}  
     }

}

class certificate{
    int percent = 33;
    int stdate = 12-04-2014;
    int enddate = 12 -05-2014;
    String stu_name = "Shipra";
    String signedby = "Javed";
    String organisation_name ="Christ University";


    public void display()
    {
        System.out.println("Percent : " +percent);
        System.out.println("Start_Date: " +stdate);
        System.out.println("End_Date: " +enddate);
        System.out.println("St_name: " +stu_name);
        System.out.println("Project_head: " +signedby);
        System.out.println("Project_head: " +organisation_name);

    }
}

class e_books{
    String author = "Steve Jobs";
    String subject = "mgt";
    int pages = 214;
    int practical_questions = 45;
    int theory_questions = 67;
    String publications = "RRR";
    int issnno = 1234;

    public void display()
    {
        System.out.println("Author : " +author);
        System.out.println("Subject: " +subject);
        System.out.println("Pages: " +pages);
        System.out.println("Practical_Questions: " +practical_questions);
        System.out.println("Theory_Questions: " +theory_questions);
        System.out.println("Publications: " +publications);
        System.out.println("Issnno: " +issnno);

    }
}

class instructor{
    String name = "Aditya";
    String qualification = "phd";
    int projects = 4;
    String research ="data analytics";
    String designation = "professor";
    int age = 23;
    int ph_no = 978205483;
    int date_of_joining = 21-03-2022;

    public void display()
    {
        System.out.println("Name : " +name);
        System.out.println("Qualifications: " +qualification);
        System.out.println("Projects: " +projects);
        System.out.println("Research: " +research);
        System.out.println("Designation: " +designation);
        System.out.println("Age: " +age);
        System.out.println("Ph_No: " +ph_no);
        System.out.println("Date_of_Joining: " +date_of_joining);

    }
}

class Asynchronous{
    public String type;
    
    //const. method
    public Asynchronous(){

    }

    public Asynchronous(String type,int marks){
        this.type=type;
    }

    //mem meth
    public void sub(){
        System.out.println(type+"?Asynchronous!");
    }
}

//sub class
class synchronous extends Asynchronous{
    public void chat(){
        super.type= "chatbot";
    }
}

class plantask extends Asynchronous{
    public plantask(){
        this("assessment",67);
    }

    
   

}

