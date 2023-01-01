package com.class_1_dec_20.task.service;

//import java.util.ArrayList;
import java.util.List;
import com.class_1_dec_20.task.TrainDto;
import com.class_1_dec_20.task.repository.TrainRepo;
import com.class_1_dec_20.task.repository.TrainRepoImpl;

public class TrainServImpl implements TrainServ {
	//List<TrainDto> list = new ArrayList<TrainDto>();
	TrainRepo repo = new TrainRepoImpl();
	
	public boolean save(TrainDto dto) {
		if(dto != null) {
			if(dto.getName().length() >= 4) {
				System.out.println("Train name Long");
				repo.save(dto);
				return true;
			} else {
				System.out.println("Train name is Short");
				return false;
			}
		} else {
			System.out.println("Train name is Invalid");
			return false;
		}	
	}

	@Override
	public List<TrainDto> read() {
		System.out.println("Calling read method");
		return repo.read();
	}

	@Override
	public TrainDto findByName(String name) {
		if(name != null) {
			if(name.length() >= 3) {
				System.out.println("Train name is valid");
				return repo.findByName(name);
			}
		}
		return null;
	}

	@Override
	public boolean deleteByUsingIndex(String name, int index) {
		if(name != null && name.length() >= 3 && index >= 0 && index <= 10) {
			System.out.println("validate done and passed to repository to delete");
			return repo.deleteByUsingIndex(name, index);
		}
		return false;
	}

}
