package com.xworkz.tree;

import com.xworkz.tree.dto.TreeDto;
import com.xworkz.tree.repository.TreeRepo;
import com.xworkz.tree.repository.TreeRepoImpl;

public class TreeRunner {

	public static void main(String[] args) {
		
		
		TreeRepo repo = new TreeRepoImpl();
		TreeDto dto = new TreeDto(6, "Apple Tree", 9, 7, "Green", "Fruit tree");
		TreeDto dto1 = new TreeDto(7, "Peeple Tree", 11, 20, "Green", "Non-Fruit tree");
		repo.save(dto);
		repo.save(dto1);
		
		repo.read();
	}

}
