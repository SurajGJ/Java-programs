package com.xworkz.watch.service;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repository.WatchRepo;
import com.xworkz.watch.repository.WatchRepoImpl;

public class WatchServiceImpl implements WatchService {

	WatchRepo repo = new WatchRepoImpl();

	@Override
	public boolean saveAll(WatchDto dto) {
		if (dto != null) {
			System.out.println("Dto is valid");
			if (dto.getId() > 0) {
				System.out.println("Id is validated");
				if (dto.getBrandName().length() >= 3) {
					System.out.println("Brand Name is Validated");
					if (dto.getColor().length() > 3) {
						System.out.println("Color is validated");
						if (dto.getType().length() > 3) {
							System.out.println("Type is validated");
							if (dto.getPrice() > 1000) {
								System.out.println("All Fiels are verified and sending to repository");
								repo.saveAll(dto);
							} else {
								System.out.println("Invalid Price");
							}
						} else {
							System.out.println("invalid type");
						}
					} else {
						System.out.println("Invalid color");
					}
				} else {
					System.out.println("Invalid Brand name");
				}
			} else {
				System.out.println("Invalid Id");
			}
		} else {
			System.out.println("Invalid Dto");
		}
		return false;
	}

	@Override
	public List<WatchDto> readAll() {
		return repo.readAll();
	}

	@Override
	public List<WatchDto> findByNameAndColor(String name, String color) {
		if (name.length() > 2 && color.length() > 2) {
			return repo.findByNameAndColor(name, color);
		}
		return null;
	}

	@Override
	public WatchDto findByIdAndType(int id, String type) {
		if (id > 0 && id < 11) {
			if (type.length() > 2) {
				return repo.findByIdAndType(id, type);
			}
		}
		return null;
	}

	@Override
	public boolean updateNameById(String name, int id) {

		if (name.length() > 2 && id > 0) {
			repo.updateNameById(name, id);
			return true;
		}

		return false;
	}

	@Override
	public boolean deleteByColorAndType(String color, String type) {
		if (color.length() > 2 && type.length() > 2) {
			repo.deleteByColorAndType(color, type);
		}
		return false;
	}

}
