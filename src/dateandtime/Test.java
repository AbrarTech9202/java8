package dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {

	public static void main(String[] args) {

		LocalDate toDaysDate = LocalDate.now();
		LocalTime justTime = LocalTime.now();
		LocalDateTime nowCurrentDateTime = LocalDateTime.now();
		System.out.println(justTime + "\n" + toDaysDate + "\n" + nowCurrentDateTime);
	}

}
