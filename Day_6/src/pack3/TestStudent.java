package pack3;
import pack1.*;
import pack2.*;
public class TestStudent {

	public static void main(String[] args) {
		Student s=new Student();
		Batch b=new Batch();
		s.accept();
		s.display();
		b.accept();;
		b.display();
	}

}
