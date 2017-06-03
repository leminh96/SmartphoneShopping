package com.leminh.dao;

import com.leminh.entity.Smartphone;
import com.leminh.model.SmartphoneInfo;
import java.util.List;

public interface SmartphoneDAO {
	public Smartphone findSmartphone(int id);	 
    public List<SmartphoneInfo> listSmartphoneInfos();
    public void saveSmartphone(SmartphoneInfo SmartphoneInfo);
    public SmartphoneInfo findSmartphoneInfo(int id);
    public void deleteSmartphone(int id);
}