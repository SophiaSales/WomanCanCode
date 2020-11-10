import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class TesteData {
	
    public static void main(String[] args) {
        try {
        	
            @SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
            System.out.println("Digite uma data: ");
            String dataRecebida = s.nextLine();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date dt = df.parse(dataRecebida);
            System.out.println(df.format(dt));
          } catch (Exception ex) {
             ex.printStackTrace();
            }
        }
}