package week1.Lesson06.jaxBX;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Main {
    public static void main(String[] args) {
        JAXBContext jaxbContext = JAXBContext.newInstance(StudentType.)

                Marshaller marshaller = jaxbContext.createMarshaller();

        StudentType studentType

                marshaller.marshal(studentType, System.out);
        unmarshaller.get;
    }
}
