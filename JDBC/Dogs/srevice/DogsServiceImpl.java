package com.xworkz.dogs.srevice;

import java.util.Iterator;
import java.util.List;

import com.xworkz.dogs.dto.DogsDto;
import com.xworkz.dogs.repository.DogsRepo;
import com.xworkz.dogs.repository.DogsRepoImpl;

public class DogsServiceImpl implements DogsService{

	DogsRepo repo = new DogsRepoImpl();
	
	@Override
	public boolean save(DogsDto dto) {
		if(dto != null && dto.getBreadName().length() > 3) {
			repo.save(dto);
			return true;
		}
		return false;
	}

	@Override
	public List<DogsDto> read() {
		return repo.read();
	}

	@Override
	public DogsDto findByName(String name) {
		if(name != null && name.length() > 3) {
			List<DogsDto> list = repo.read();
			for(DogsDto dto : list) {
				if(dto.getBreadName().equalsIgnoreCase(name)) {
					return dto;
				}
			}
			System.out.println("Not Found");
		}
		return null;
	}

	@Override
	public boolean updateWeightByHeight(double height, double weight) {
		if(weight > 5 && height > 10) {
			List<DogsDto> list = repo.read();
			for(int i = 0; i<list.size(); i++) {
				DogsDto dto = list.get(i);
				if(dto.getHeight() == height) {
					dto.setWeight(weight);
					list.set(i, dto);
					System.out.println("Update Weight by Height is done");
					return true;
				}
			}
			System.out.println("Not Found");
		}
		return false;
	}

	@Override
	public boolean updateBySizeByName(String size, String name) {
		if(name != null && name.length() > 3) {
			if(size != null && size.length() > 4) {
				List<DogsDto> list = repo.read();
				for(int i = 0; i < list.size(); i++) {
					DogsDto dto = list.get(i);
					if(dto.getBreadName().equalsIgnoreCase(name)) {
						dto.setSize(size);
						list.set(i, dto);
						System.out.println("Updated Size by Name");
						return true;
					}
				}
				System.out.println("Not Found");
			}
		}
		return false;
	}

	@Override
	public boolean deleteByOriginatedIn(String originated) {
		if(originated != null && originated.length() > 3) {
			Iterator<DogsDto> list = repo.read().iterator();
			while(list.hasNext()) {
				DogsDto dto = list.next();
				if(dto.getOriginatedIn().equalsIgnoreCase(originated)) {
					list.remove();
					System.out.println("Delete by Originated is Completed Sucessfully");
				}
			}
			System.out.println("Not Found");
		}
		return false;
	}

	@Override
	public boolean deleteBySize(String size) {
		if(size != null && size.length() > 4) {
			Iterator<DogsDto> list = repo.read().iterator();
			while(list.hasNext()) {
				DogsDto dto = list.next();
				if(dto.getSize().equalsIgnoreCase(size)) {
					list.remove();
					System.out.println("Delete by size is Completed Sucessfully");
				}
			}
			System.out.println("Not Found");
		}
		return false;
	}

	
	
}
