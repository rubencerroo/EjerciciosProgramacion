package principal;

public class Principal {
	public static void main(String [] args) {
		String a = "No vueles como las aves de corral cuando puedes subir como las águilas.";
		System.out.println("1. " + a.charAt(0)+""+a.charAt(1));
		System.out.println("2. " + a.charAt(4));
		System.out.println("3. " +"Entre los caracteres: "+ a.indexOf("p")+"-"+ a.indexOf("e")+1);
		a.replace ("aves de corral", "gallinas");
		System.out.println("4. " + a.replace ("aves de corral", "gallinas"));
	}
}
