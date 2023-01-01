package com.xworkz.mobile.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobile.dto.MobileDto;
import com.xworkz.mobile.repository.MobileRepo;
import com.xworkz.mobile.repository.MobileRepoImpl;

public class MobileServiceImpl implements MobileService {

	MobileRepo repo = new MobileRepoImpl();
	List<MobileDto> database = new ArrayList<MobileDto>();

	@Override
	public boolean save(MobileDto dto) {
		if (dto != null && dto.getName().length() >= 2 && dto.getNetworkTechnology().length() >= 2
				&& dto.getDisplayType().length() > 5 && dto.getResolution() >= 1080 && dto.getRam() >= 4
				&& dto.getRom() >= 64 && dto.getBattryInMah() >= 4500 && dto.getFrontCamera() >= 8
				&& dto.getBackCamera() >= 32 && dto.getProcessorName().length() > 5 && dto.getPrice() > 10000) {
			System.out.println("Mobile properties are validated and sending to Repository");
			repo.save(dto);
			return true;
		}
		return false;
	}

	@Override
	public List<MobileDto> read() {
		System.out.println("Read is intiated, calling to database");
		return repo.read();
	}

	@Override
	public boolean updateNameByIndex(int index, String name) {
		if (name != null && name.length() >= 2) {
			if (index >= 0)
				repo.updateNameByIndex(index, name);
			return true;
		}
		return false;
	}

	@Override
	public MobileDto findByName(String name) {
		if (name != null && name.length() >= 2) {

			System.out.println("Finding name is validated calling Repository");
			List<MobileDto> dto = repo.findByName(name);
			for(List<MobileDto> dto : dtos) {
				if 
			}
			return repo.findByName(name);

		}
		return null;

	}

	@Override
	public boolean deleteByIndex(int index) {
		if (index >= 0) {
			repo.deleteByIndex(index);
			return true;
		}
		return false;
	}

}
