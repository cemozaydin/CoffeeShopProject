import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import java.util.*;

public class Main {

	public static void main(String[] args) {		
		String isim, soyisim, kimlikNo;
		int dogumYili;
		
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("\nİsim : ");
		isim = scn.nextLine();
		System.out.print("\nSoyisim : ");
		soyisim = scn.nextLine();
		System.out.print("\nKimlik No : ");
		kimlikNo = scn.nextLine();
		System.out.print("\nDoğum Yılı : ");
		dogumYili = Integer.parseInt(scn.nextLine());		
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName(isim);
		customer1.setLastName(soyisim);
		customer1.setNationalityId(kimlikNo);
		customer1.setBirthOfYear(dogumYili);
		
		baseCustomerManager.save(customer1);
		
		
		
	}

}
