import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		String companion = "lovelace";
		String mode = "normal";
		if (args.length > 0){
			for (int i = 0, l = args.length; i < l; i++){
				switch (args[i]){
					case "--pootato":
						companion = "potato";
						break;
					case "--prof":
						mode = "professor";
						break;
				}
			}
			System.out.println("Companion: "+companion+" Modo: "+mode);
		} else System.out.println("Modo raiz.");
	}

	public static void checkFlags(String[] args){}

}
