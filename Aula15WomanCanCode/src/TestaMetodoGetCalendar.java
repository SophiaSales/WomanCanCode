import java.util.Calendar;
public class TestaMetodoGetCalendar {
	public static void main(String[]args) {
		Calendar c =  Calendar.getInstance();
		
		System.out.println("Data/Hora atual: "+c.getTime());
		System.out.println("Ano:"+c.get(Calendar.YEAR));
		System.out.println("Dia do Mes: "+c.get(Calendar.DAY_OF_MONTH));
	}
}
