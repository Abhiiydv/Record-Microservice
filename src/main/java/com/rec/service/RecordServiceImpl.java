package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService{
	
	List<Record> list = List.of( 
			new Record(1L,"Tata@gmail.com","Tata Motors",1311L),
			new Record(2L,"Mahindra@gmail.com","Mahindra Motors",1311L),
			new Record(3L,"ctc@gmail.com","ctc",1312L),
			new Record(4L,"Tcs@gmail.com","Tcs",1312L),
			new Record(5L,"Accenture@gmail.com","Accenture ",1313L),
			new Record(6L,"Infosys@gmail.com","Infosys",1314L),
			new Record(7L,"TMC@gmail.com","TMC",1315L),
			new Record(8L,"Suzuki@gmail.com","Suzuki",1316L),
			new Record(9L,"Yahoo@gmail.com","Yahoo",1317L),
			new Record(10L,"Xyz@gmail.com","Xyz",1318L)
			
			);

	@Override
	public List<Record> getRecordEmployee(Long eId) {
		// TODO Auto-generated method stub
		return list.stream().filter(record -> record.geteId().equals(eId)).collect(Collectors.toList());
	}

}
