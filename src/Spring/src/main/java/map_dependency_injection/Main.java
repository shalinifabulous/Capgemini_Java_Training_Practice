package map_dependency_injection;

import dependency_injection.Library;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("map_kit.xml"));
        Kit k1 = (Kit) beanFactory.getBean("kit_id");
        System.out.println(k1);
    }
}
