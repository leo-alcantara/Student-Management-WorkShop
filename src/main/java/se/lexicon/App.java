package se.lexicon;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.MyBeanCreator;
import se.lexicon.data_access.StudentDao;
import se.lexicon.data_access.StudentDaoListImpl;
import se.lexicon.models.Student;
import se.lexicon.service.StudentManagement;
import se.lexicon.service.StudentManagementConsoleImpl;
import se.lexicon.util.ScannerInputService;
import se.lexicon.util.UserInputService;

public class App {

    public static void main( String[] args ) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyBeanCreator.class);

        StudentDao studentDao = context.getBean(StudentDaoListImpl.class);

        studentDao.save(new Student(1, "Leo"));
        studentDao.save(new Student(2, "Sophie"));

        studentDao.findAll().forEach(System.out::println);

        StudentManagement studentManagement = context.getBean(StudentManagementConsoleImpl.class);



        UserInputService userInputService = context.getBean(ScannerInputService.class);

        




    }
}
