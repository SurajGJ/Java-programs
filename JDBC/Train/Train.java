package com.class_1_dec_20.task;

//import java.util.ArrayList;
//import java.util.List;
import com.class_1_dec_20.task.service.TrainServ;
import com.class_1_dec_20.task.service.TrainServImpl;

public class Train {

	public static void main(String[] ags) {
		
		TrainDto train1 = new TrainDto();
		
		train1.setSlNo(1);
		train1.setTrainNo(20163);
		train1.setName("Shimogga");
		train1.setNumberOfStops(6);
		train1.setDistance(274);
		train1.setStartLoc("Benglore");
		train1.setEndLoc("Shimogga");
		train1.setTotalPassangersCapacity(500);
		train1.setOfflineTicketAvilable(true);
		train1.setSleeperCoachAvilable(true);
		train1.setAcCoachAvilable(true);
		train1.setNumberOfCoaches(14);
		train1.setTravellHours("4.25 Hours");
		train1.setTrainTopSpeed("110 kmph");
		train1.setTicketPrice(150);
		
		TrainDto train2 = new TrainDto();
		train2.setSlNo(2);
		train2.setTrainNo(20453);
		train2.setName("Arsikere");
		train2.setNumberOfStops(4);
		train2.setDistance(160);
		train2.setStartLoc("Benglore");
		train2.setEndLoc("Arsikere");
		train2.setTotalPassangersCapacity(500);
		train2.setOfflineTicketAvilable(true);
		train2.setSleeperCoachAvilable(true);
		train2.setAcCoachAvilable(true);
		train2.setNumberOfCoaches(14);
		train2.setTravellHours("3.55 Hours");
		train2.setTrainTopSpeed("110 kmph");
		train2.setTicketPrice(120);
		
		TrainDto train3 = new TrainDto();
		train3.setSlNo(3);
		train3.setTrainNo(86451);
		train3.setName("Bhadravathi");
		train3.setNumberOfStops(6);
		train3.setDistance(210);
		train3.setStartLoc("Benglore");
		train3.setEndLoc("Bhadravathi");
		train3.setTotalPassangersCapacity(500);
		train3.setOfflineTicketAvilable(true);
		train3.setSleeperCoachAvilable(true);
		train3.setAcCoachAvilable(true);
		train3.setNumberOfCoaches(14);
		train3.setTravellHours("4.15 Hours");
		train3.setTrainTopSpeed("100 kmph");
		train3.setTicketPrice(145);
		
		TrainDto train4 = new TrainDto();
		train4.setSlNo(4);
		train4.setTrainNo(20453);
		train4.setName("Mandya");
		train4.setNumberOfStops(5);
		train4.setDistance(110);
		train4.setStartLoc("Benglore");
		train4.setEndLoc("Mandya");
		train4.setTotalPassangersCapacity(700);
		train4.setOfflineTicketAvilable(true);
		train4.setSleeperCoachAvilable(false);
		train4.setAcCoachAvilable(true);
		train4.setNumberOfCoaches(14);
		train4.setTravellHours("2.55 Hours");
		train4.setTrainTopSpeed("80 kmph");
		train4.setTicketPrice(88);
		
		TrainDto train5 = new TrainDto();
		train5.setSlNo(5);
		train5.setTrainNo(74424);
		train5.setName("Benglore");
		train5.setNumberOfStops(5);
		train5.setDistance(110);
		train5.setStartLoc("Mandya");
		train5.setEndLoc("Benglore");
		train5.setTotalPassangersCapacity(700);
		train5.setOfflineTicketAvilable(true);
		train5.setSleeperCoachAvilable(false);
		train5.setAcCoachAvilable(true);
		train5.setNumberOfCoaches(14);
		train5.setTravellHours("2.55 Hours");
		train5.setTrainTopSpeed("80 kmph");
		train5.setTicketPrice(88);
		
		TrainDto train6 = new TrainDto();
		train6.setSlNo(6);
		train6.setTrainNo(45622);
		train6.setName("Davanagere");
		train6.setNumberOfStops(5);
		train6.setDistance(110);
		train6.setStartLoc("Benglore");
		train6.setEndLoc("Davanagere");
		train6.setTotalPassangersCapacity(600);
		train6.setOfflineTicketAvilable(true);
		train6.setSleeperCoachAvilable(true);
		train6.setAcCoachAvilable(true);
		train6.setNumberOfCoaches(14);
		train6.setTravellHours("3.30 Hours");
		train6.setTrainTopSpeed("105 kmph");
		train6.setTicketPrice(115);
		
		TrainDto train7 = new TrainDto(7, 96453, "Delhi", 28, 1008, "Benglore", 
				"Delhi", 600, true, true, true, 16, "16:25 Hours", "130 kmph", 450);
		
		TrainDto train8 = new TrainDto(8, 13215, "Jammu", 36, 1508, "Benglore", 
				"Jammu", 600, true, true, true, 16, "28:25 Hours", "130 kmph", 920);
		
		TrainDto train9 = new TrainDto(9, 36248, "Pune", 18, 650, "Benglore", 
				"Pune", 600, true, true, true, 14, "12:35 Hours", "120 kmph", 330);
		
		TrainDto train10 = new TrainDto(10, 78561, "Mumbai", 9, 95, "Benglore", 
				"Mumbai", 600, true, false, false, 4, "2:40 Hours", "100 kmph", 100);
		
		
		TrainServ serv = new TrainServImpl();
		
		serv.save(train1);
		serv.save(train2);
		serv.save(train3);
		serv.save(train4);
		serv.save(train5);
		serv.save(train6);
		serv.save(train7);
		serv.save(train8);
		serv.save(train9);
		serv.save(train10);
		
//		List<TrainDto> list = new ArrayList<TrainDto>();
//		
//		list.add(train1);
//		list.add(train2);
//		list.add(train3);
//		list.add(train4);
//		list.add(train5);
//		list.add(train6);
//		list.add(train7);
//		list.add(train8);
//		list.add(train9);
//		list.add(train10);
		

		for(TrainDto train : serv.read() ) {
			System.out.println(train);
		}
		
		System.out.println(serv.findByName("Pune"));
		
//		boolean delete = serv.delete("Delhi");
//		if(delete) {
//			System.out.println("Deleted Sucessfully");
//		}
		
	
	}
}
