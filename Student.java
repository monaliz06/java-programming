public class Student{

public void StudentDetails(int roll, String name, String address, int mark)
{
System.out.println (roll+""+address+""+ mark);
}

public int getTotalmark(int x,int y,int z){
int total=x+y+z ;
return total ;
}

public static void main (String[] args){
Student st=new Student();
int output=st.getTotalmark(60,70,75);
st.StudentDetails(101,"tom","CN", output);
}

}

