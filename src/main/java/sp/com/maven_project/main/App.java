package sp.com.maven_project.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    
    
    
    {
        System.out.println( "--------------------project start -----------" );
        
        ApplicationContext  context =new ClassPathXmlApplicationContext("/com/sp/resouce/ApplicationContext.xml");
        Student std=(Student) context.getBean("stdObj");
        std.Display();
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println( "---------------------project end -----------" );
    }
}
