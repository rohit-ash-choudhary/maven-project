package sp.com.maven_project.main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "--------------------project start -----------" );
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println( "---------------------project end -----------" );
    }
}
