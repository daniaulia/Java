package alexLee;
import java.util.Scanner;

public class LogIn {
	
	public static String firstName;
	public static String lastName;
	public static String age;
	public static String nim;
	public static String address;
	public static Float GPA;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		name();
		umur();
		nomorPokok();
		alamat();
		ipk();
		konfirmasi();
	}
	
	public static void name() {
		System.out.println("Input your first name =");
		firstName = scan.nextLine();
		
		System.out.println("Input your last name =");
		lastName = scan.nextLine();
	}
	
	public static void umur() {
		System.out.println("Input your ages =");
		age = scan.nextLine();
	}
	
	public static void nomorPokok() {
		System.out.println("Input your NIM =");
		nim = scan.nextLine();
	}
	
	public static void alamat() {
		System.out.println("Input your address =");
		address = scan.nextLine();
	}
	
	public static void ipk() {
		System.out.println("Input your GPA =");
		GPA = scan.nextFloat();
	}
	
	public static void konfirmasi() {
		System.out.println("-----------------------");
		System.out.println("Konfirmasi data diri anda:"
				+ "\n"
				+ "\nNama 	= " + firstName + " " + lastName
				+ "\nUmur 	= " + age + " tahun"
				+ "\nNim 	= " + nim
				+ "\nAlamat	= " + address
				+ "\nIPK	= " + GPA
				+ "\n"
				+ "\nApakah data diatas sudah tepat?"
				+ "\t(Y/N)");
	}
}