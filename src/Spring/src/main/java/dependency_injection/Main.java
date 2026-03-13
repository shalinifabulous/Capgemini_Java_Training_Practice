package dependency_injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class Main {

    public static void main(String[] args) {

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("dependency_injection.xml"));
        Library l1 = (Library) beanFactory.getBean("L1");
        System.out.println(l1);

        BeanFactory beanFactory1 = new XmlBeanFactory(new ClassPathResource("dependency_injection.xml"));
        Book b = (Book) beanFactory.getBean("B1");
        System.out.println(b);

        BeanFactory beanFactory3 = new XmlBeanFactory(new ClassPathResource("List_Dependency.xml"));
        Library1 l2 = (Library1) beanFactory3.getBean("Lib1");
        System.out.println(l2);
    }
}